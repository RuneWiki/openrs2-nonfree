import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class4_Sub3_Sub18 extends Class4_Sub3 {

	@OriginalMember(owner = "client!he", name = "W", descriptor = "I")
	private int anInt1840;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt1840 = arg1.method1252();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method3161(@OriginalArg(0) int arg0) {
		@Pc(15) int[] local15 = super.aClass64_41.method2211(arg0);
		if (super.aClass64_41.aBoolean127) {
			@Pc(33) int[] local33 = this.method3149(Static5.anInt216 & arg0 - 1, 0);
			@Pc(39) int[] local39 = this.method3149(arg0, 0);
			@Pc(49) int[] local49 = this.method3149(Static5.anInt216 & arg0 + 1, 0);
			for (@Pc(51) int local51 = 0; local51 < Static134.anInt3188; local51++) {
				@Pc(65) int local65 = (local49[local51] - local33[local51]) * this.anInt1840;
				@Pc(84) int local84 = this.anInt1840 * (local39[Static2.anInt80 & local51 + 1] - local39[local51 - 1 & Static2.anInt80]);
				@Pc(88) int local88 = local65 >> 12;
				@Pc(92) int local92 = local84 >> 12;
				@Pc(98) int local98 = local88 * local88 >> 12;
				@Pc(104) int local104 = local92 * local92 >> 12;
				@Pc(117) int local117 = (int) (Math.sqrt((double) ((local104 + local98 + 4096) / 4096)) * 4096.0D);
				@Pc(128) int local128 = local117 == 0 ? 0 : 16777216 / local117;
				local15[local51] = 4096 - local128;
			}
		}
		return local15;
	}
}
