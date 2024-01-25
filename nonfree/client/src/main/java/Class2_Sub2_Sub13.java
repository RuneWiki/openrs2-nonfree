import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class2_Sub2_Sub13 extends Class2_Sub2 {

	@OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
	private int anInt4130 = 0;

	@OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
	private int anInt4128 = 0;

	@OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
	private int anInt4134 = 1;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub13() {
		super(0, true);
	}

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
	@Override
	public void method7948() {
		Static315.method7021();
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILclient!es;I)V")
	@Override
	public void method7949(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4130 = arg0.method4325();
		} else if (arg1 == 1) {
			this.anInt4128 = arg0.method4325();
		} else if (arg1 == 3) {
			this.anInt4134 = arg0.method4325();
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7941(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass238_41.method5571(arg0);
		if (super.aClass238_41.aBoolean518) {
			@Pc(19) int local19 = Static211.anIntArray576[arg0];
			@Pc(25) int local25 = local19 - 2048 >> 1;
			for (@Pc(27) int local27 = 0; local27 < Static153.anInt3070; local27++) {
				@Pc(33) int local33 = Static260.anIntArray327[local27];
				@Pc(39) int local39 = local33 - 2048 >> 1;
				@Pc(50) int local50;
				if (this.anInt4130 == 0) {
					local50 = (local33 - local19) * this.anInt4134;
				} else {
					@Pc(62) int local62 = local25 * local25 + local39 * local39 >> 12;
					local50 = (int) (Math.sqrt((double) ((float) local62 / 4096.0F)) * 4096.0D);
					local50 = (int) ((double) (this.anInt4134 * local50) * 3.141592653589793D);
				}
				local50 -= local50 & 0xFFFFF000;
				if (this.anInt4128 == 0) {
					local50 = Static561.anIntArray667[local50 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt4128 == 2) {
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
}
