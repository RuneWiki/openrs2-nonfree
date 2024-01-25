import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class1_Sub1_Sub6 extends Class1_Sub1 {

	@OriginalMember(owner = "client!ega", name = "C", descriptor = "I")
	private int anInt2208 = 0;

	@OriginalMember(owner = "client!ega", name = "D", descriptor = "I")
	private int anInt2209 = 1;

	@OriginalMember(owner = "client!ega", name = "K", descriptor = "I")
	private int anInt2214 = 0;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(I)V")
	@Override
	public void method7699() {
		Static499.method3357();
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(ILclient!mo;I)V")
	@Override
	public void method7708(@OriginalArg(1) Class1_Sub35 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt2208 = arg0.method5750();
		} else if (arg1 == 1) {
			this.anInt2214 = arg0.method5750();
		} else if (arg1 == 3) {
			this.anInt2209 = arg0.method5750();
		}
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method7706(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass223_41.method4438(arg0);
		if (super.aClass223_41.aBoolean442) {
			@Pc(27) int local27 = Static445.anIntArray590[arg0];
			@Pc(33) int local33 = local27 - 2048 >> 1;
			for (@Pc(35) int local35 = 0; local35 < Static279.anInt4906; local35++) {
				@Pc(41) int local41 = Static557.anIntArray708[local35];
				@Pc(47) int local47 = local41 - 2048 >> 1;
				@Pc(61) int local61;
				if (this.anInt2208 == 0) {
					local61 = this.anInt2209 * (local41 - local27);
				} else {
					@Pc(74) int local74 = local47 * local47 + local33 * local33 >> 12;
					local61 = (int) (Math.sqrt((double) ((float) local74 / 4096.0F)) * 4096.0D);
					local61 = (int) ((double) (local61 * this.anInt2209) * 3.141592653589793D);
				}
				local61 -= local61 & 0xFFFFF000;
				if (this.anInt2214 == 0) {
					local61 = Static508.anIntArray651[local61 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt2214 == 2) {
					local61 -= 2048;
					if (local61 < 0) {
						local61 = -local61;
					}
					local61 = 2048 - local61 << 1;
				}
				local11[local35] = local61;
			}
		}
		return local11;
	}
}
