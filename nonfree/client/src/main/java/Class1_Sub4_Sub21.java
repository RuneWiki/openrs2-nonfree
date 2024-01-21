import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class1_Sub4_Sub21 extends Class1_Sub4 {

	@OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
	private int anInt3364;

	@OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
	private int anInt3365;

	@OriginalMember(owner = "client!pb", name = "jb", descriptor = "[I")
	private int[] anIntArray294;

	@OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
	private int anInt3369;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)I")
	@Override
	public int method3212() {
		return this.anInt3369;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt3369 = arg0.method546();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(7) int[][] local7 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89 && this.method2347()) {
			@Pc(25) int[] local25 = local7[1];
			@Pc(29) int[] local29 = local7[0];
			@Pc(33) int[] local33 = local7[2];
			@Pc(49) int local49 = this.anInt3364 * (this.anInt3365 == Static98.anInt3017 ? arg0 : arg0 * this.anInt3365 / Static98.anInt3017);
			@Pc(55) int local55;
			@Pc(63) int local63;
			if (Static73.anInt1888 == this.anInt3364) {
				for (local55 = 0; local55 < Static73.anInt1888; local55++) {
					local63 = this.anIntArray294[local49++];
					local33[local55] = (local63 & 0xFF) << 4;
					local25[local55] = local63 >> 4 & 0xFF0;
					local29[local55] = local63 >> 12 & 0xFF0;
				}
			} else {
				for (local55 = 0; local55 < Static73.anInt1888; local55++) {
					local63 = this.anInt3364 * local55 / Static73.anInt1888;
					@Pc(115) int local115 = this.anIntArray294[local63 + local49];
					local33[local55] = (local115 & 0xFF) << 4;
					local25[local55] = local115 >> 4 & 0xFF0;
					local29[local55] = local115 >> 12 & 0xFF0;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(Z)Z")
	private boolean method2347() {
		if (this.anIntArray294 != null) {
			return true;
		} else if (this.anInt3369 >= 0) {
			@Pc(23) Class1_Sub1_Sub8_Sub3 local23 = Static51.method1100(this.anInt3369, Static133.aClass16_26);
			local23.method1648();
			this.anInt3365 = local23.anInt2317;
			this.anIntArray294 = local23.anIntArray203;
			this.anInt3364 = local23.anInt2314;
			return true;
		} else {
			return false;
		}
	}
}
