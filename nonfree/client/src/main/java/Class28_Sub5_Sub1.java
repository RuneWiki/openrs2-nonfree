import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qd")
public final class Class28_Sub5_Sub1 extends Class28_Sub5 {

	@OriginalMember(owner = "client!qd", name = "x", descriptor = "I")
	public int anInt4872;

	@OriginalMember(owner = "client!qd", name = "E", descriptor = "I")
	public int anInt4877;

	@OriginalMember(owner = "client!qd", name = "F", descriptor = "I")
	public int anInt4878;

	@OriginalMember(owner = "client!qd", name = "G", descriptor = "I")
	public int anInt4879;

	@OriginalMember(owner = "client!qd", name = "v", descriptor = "I")
	public int anInt4871 = -1;

	@OriginalMember(owner = "client!qd", name = "D", descriptor = "I")
	public int anInt4876 = -1;

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIILclient!np;)Z")
	@Override
	public boolean method5408(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class155 arg2) {
		@Pc(6) Class118 local6 = arg2.method4908();
		local6.method2659(super.anInt4869, super.anInt4867, super.anInt4860);
		@Pc(36) Class75 local36 = Static176.aClass78_3.method1641(this.anInt4879).method1015(null, 0, this.anInt4878, -1, arg2, 65536, null, 0);
		if (local36 != null && local36.method5460(arg0, arg1, local6, true)) {
			return true;
		}
		if (this.anInt4871 != -1) {
			local36 = Static176.aClass78_3.method1641(this.anInt4871).method1015(null, 0, this.anInt4872, -1, arg2, 65536, null, 0);
			if (local36 != null && local36.method5460(arg0, arg1, local6, true)) {
				return true;
			}
		}
		if (this.anInt4876 != -1) {
			local36 = Static176.aClass78_3.method1641(this.anInt4876).method1015(null, 0, this.anInt4877, -1, arg2, 65536, null, 0);
			if (local36 != null && local36.method5460(arg0, arg1, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!qd", name = "a", descriptor = "(Lclient!np;B)V")
	@Override
	public void method5406(@OriginalArg(0) Class155 arg0) {
	}

	@OriginalMember(owner = "client!qd", name = "b", descriptor = "(ILclient!np;)Lclient!ql;")
	@Override
	public Class12_Sub7 method5407(@OriginalArg(1) Class155 arg0) {
		@Pc(6) Class118 local6 = arg0.method4908();
		local6.method2659(super.anInt4869, super.anInt4867, super.anInt4860);
		@Pc(18) Class12_Sub7 local18 = Static146.method2294(3);
		@Pc(39) Class75 local39;
		if (this.anInt4876 != -1) {
			local39 = Static176.aClass78_3.method1641(this.anInt4876).method1015(null, 0, this.anInt4877, -1, arg0, 1024, null, 0);
			if (local39 != null) {
				local39.method5469(local6, local18.aClass12_Sub5Array1[2], 0);
			}
		}
		if (this.anInt4871 != -1) {
			local39 = Static176.aClass78_3.method1641(this.anInt4871).method1015(null, 0, this.anInt4872, -1, arg0, 1024, null, 0);
			if (local39 != null) {
				local39.method5469(local6, local18.aClass12_Sub5Array1[1], 0);
			}
		}
		local39 = Static176.aClass78_3.method1641(this.anInt4879).method1015(null, 0, this.anInt4878, -1, arg0, 1024, null, 0);
		if (local39 != null) {
			local39.method5469(local6, local18.aClass12_Sub5Array1[0], 0);
		}
		return local18;
	}
}
