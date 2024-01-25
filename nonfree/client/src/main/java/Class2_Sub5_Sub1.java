import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vba")
public final class Class2_Sub5_Sub1 extends Class2_Sub5 {

	@OriginalMember(owner = "client!vba", name = "t", descriptor = "I")
	public int anInt9855;

	@OriginalMember(owner = "client!vba", name = "u", descriptor = "I")
	public int anInt9856;

	@OriginalMember(owner = "client!vba", name = "y", descriptor = "I")
	public int anInt9860;

	@OriginalMember(owner = "client!vba", name = "B", descriptor = "I")
	public int anInt9863;

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
	public int anInt9862 = -1;

	@OriginalMember(owner = "client!vba", name = "D", descriptor = "I")
	public int anInt9864 = -1;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(Lclient!oa;I)Lclient!cd;")
	@Override
	public Class44 method8385(@OriginalArg(0) Class15 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(Lclient!oa;B)Lclient!pl;")
	@Override
	public Class55_Sub6 method8382(@OriginalArg(0) Class15 arg0) {
		@Pc(14) Class255 local14 = arg0.method5343();
		local14.GA(super.anInt9845, super.anInt9847 - 10, super.anInt9848);
		@Pc(28) Class55_Sub6 local28 = Static232.method3979(3);
		@Pc(50) Class21 local50;
		if (this.anInt9862 != -1) {
			local50 = Static517.aClass23_2.method901(this.anInt9862).method775(0, this.anInt9856, null, 2048, 0, -1, arg0, null);
			if (local50 != null) {
				local50.method7145(local14, local28.aClass55_Sub3Array1[2], 0);
			}
		}
		if (this.anInt9864 != -1) {
			local50 = Static517.aClass23_2.method901(this.anInt9864).method775(0, this.anInt9863, null, 2048, 0, -1, arg0, null);
			if (local50 != null) {
				local50.method7145(local14, local28.aClass55_Sub3Array1[1], 0);
			}
		}
		local50 = Static517.aClass23_2.method901(this.anInt9860).method775(0, this.anInt9855, null, 2048, 0, -1, arg0, null);
		if (local50 != null) {
			local50.method7145(local14, local28.aClass55_Sub3Array1[0], 0);
		}
		return local28;
	}

	@OriginalMember(owner = "client!vba", name = "c", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method8384(@OriginalArg(0) Class15 arg0) {
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method8389(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(6) Class255 local6 = arg2.method5343();
		local6.GA(super.anInt9845, super.anInt9847, super.anInt9848);
		@Pc(38) Class21 local38 = Static517.aClass23_2.method901(this.anInt9860).method775(0, this.anInt9855, null, 131072, 0, -1, arg2, null);
		if (local38 != null && local38.method7148(arg1, arg0, local6, true)) {
			return true;
		}
		if (this.anInt9864 != -1) {
			local38 = Static517.aClass23_2.method901(this.anInt9864).method775(0, this.anInt9863, null, 131072, 0, -1, arg2, null);
			if (local38 != null && local38.method7148(arg1, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt9862 != -1) {
			local38 = Static517.aClass23_2.method901(this.anInt9862).method775(0, this.anInt9856, null, 131072, 0, -1, arg2, null);
			if (local38 != null && local38.method7148(arg1, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
