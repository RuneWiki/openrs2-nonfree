import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!f")
public final class Class2_Sub3_Sub12 extends Class2_Sub3 {

	@OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
	private int anInt1088;

	@OriginalMember(owner = "client!f", name = "db", descriptor = "I")
	private int anInt1094;

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
	private int anInt1095;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3016(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass51_41.method1730(arg0);
		if (super.aClass51_41.aBoolean89) {
			@Pc(20) int local20 = Static50.anIntArray106[arg0];
			@Pc(26) int local26 = local20 - 2048 >> 1;
			for (@Pc(28) int local28 = 0; local28 < Static53.anInt1184; local28++) {
				@Pc(34) int local34 = Static43.anIntArray102[local28];
				@Pc(40) int local40 = local34 - 2048 >> 1;
				@Pc(65) int local65;
				if (this.anInt1094 == 0) {
					local65 = this.anInt1095 * (local34 - local20);
				} else {
					@Pc(56) int local56 = local26 * local26 + local40 * local40 >> 12;
					local65 = (int) (Math.sqrt((double) (local56 / 4096)) * 4096.0D);
					local65 = (int) ((double) (this.anInt1095 * local65) * 3.141592653589793D);
				}
				local65 -= local65 & 0xFFFFF000;
				if (this.anInt1088 == 0) {
					local65 = Static111.anIntArray222[local65 >> 4 & 0xFF] + 4096 >> 1;
				} else if (this.anInt1088 == 2) {
					local65 -= 2048;
					if (local65 < 0) {
						local65 = -local65;
					}
					local65 = 2048 - local65 << 1;
				}
				local12[local28] = local65;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	@Override
	public void method3019() {
		Static157.method2659();
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(BILclient!ja;)V")
	@Override
	public void method3013(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		if (arg0 == 0) {
			this.anInt1094 = arg1.method2962();
		} else if (arg0 == 1) {
			this.anInt1088 = arg1.method2962();
		} else if (arg0 == 3) {
			this.anInt1095 = arg1.method2962();
		}
	}
}
