import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class1_Sub4_Sub23 extends Class1_Sub4 {

	@OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
	private int anInt3677;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[I")
	@Override
	public int[] method3216(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass39_38.method1880(arg0);
		if (super.aClass39_38.aBoolean110) {
			@Pc(26) int[] local26 = this.method3215(Static125.anInt3628 & arg0 - 1, 0);
			@Pc(32) int[] local32 = this.method3215(arg0, 0);
			@Pc(42) int[] local42 = this.method3215(arg0 + 1 & Static125.anInt3628, 0);
			for (@Pc(44) int local44 = 0; local44 < Static73.anInt1888; local44++) {
				@Pc(58) int local58 = this.anInt3677 * (local42[local44] - local26[local44]);
				@Pc(78) int local78 = (local32[local44 + 1 & Static35.anInt672] - local32[Static35.anInt672 & local44 - 1]) * this.anInt3677;
				@Pc(82) int local82 = local78 >> 12;
				@Pc(88) int local88 = local82 * local82 >> 12;
				@Pc(92) int local92 = local58 >> 12;
				@Pc(98) int local98 = local92 * local92 >> 12;
				@Pc(111) int local111 = (int) (Math.sqrt((double) ((local98 + local88 + 4096) / 4096)) * 4096.0D);
				@Pc(119) int local119 = local111 == 0 ? 0 : 16777216 / local111;
				local12[local44] = 4096 - local119;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3677 = arg0.method546();
		}
	}
}
