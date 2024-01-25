import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class3_Sub1_Sub10 extends Class3_Sub1 {

	@OriginalMember(owner = "client!fba", name = "H", descriptor = "I")
	private int anInt2660 = 1;

	@OriginalMember(owner = "client!fba", name = "N", descriptor = "I")
	private int anInt2663 = 0;

	@OriginalMember(owner = "client!fba", name = "O", descriptor = "I")
	private int anInt2664 = 0;

	@OriginalMember(owner = "client!fba", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub10() {
		super(0, true);
	}

	@OriginalMember(owner = "client!fba", name = "f", descriptor = "(I)V")
	@Override
	public void method7786() {
		Static353.method5563();
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7784(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass219_41.method5560(arg0);
		if (super.aClass219_41.aBoolean423) {
			@Pc(19) int local19 = Static402.anIntArray741[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static307.anInt4846; local27++) {
				@Pc(33) int local33 = Static241.anIntArray759[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(50) int local50;
				if (this.anInt2664 == 0) {
					local50 = (local33 - local19) * this.anInt2660;
				} else {
					@Pc(62) int local62 = local25 * local25 + local39 * local39 >> 12;
					local50 = (int) (Math.sqrt((double) ((float) local62 / 4096.0F)) * 4096.0D);
					local50 = (int) ((double) (local50 * this.anInt2660) * 3.141592653589793D);
				}
				local50 -= local50 & 0xFFFFF000;
				if (this.anInt2663 == 0) {
					local50 = Static226.anIntArray436[local50 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2663 == 2) {
					local50 -= 2048;
					if (local50 < 0) {
						local50 = -local50;
					}
					local50 = 2048 - local50 << 1;
				}
				local11[local27] = local50;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILclient!rt;)V")
	@Override
	public void method7783(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		if (arg0 == 0) {
			this.anInt2664 = arg1.method7548();
		} else if (arg0 == 1) {
			this.anInt2663 = arg1.method7548();
		} else if (arg0 == 3) {
			this.anInt2660 = arg1.method7548();
		}
	}
}
