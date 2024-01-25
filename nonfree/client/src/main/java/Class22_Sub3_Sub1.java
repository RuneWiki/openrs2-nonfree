import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class22_Sub3_Sub1 extends Class22_Sub3 {

	@OriginalMember(owner = "client!ck", name = "B", descriptor = "I")
	public int anInt1139;

	@OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
	public int anInt1141;

	@OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
	public int anInt1143;

	@OriginalMember(owner = "client!ck", name = "H", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "I")
	public int anInt1140 = -1;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "I")
	public int anInt1137 = -1;

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!pe;B)Lclient!ca;")
	@Override
	public Class36_Sub1 method5345(@OriginalArg(0) Class89 arg0) {
		@Pc(6) Class70 local6 = arg0.method5427();
		local6.method3707(super.anInt1135, super.anInt1130, super.anInt1129);
		@Pc(18) Class36_Sub1 local18 = Static184.method3381(3);
		@Pc(38) Class31 local38;
		if (this.anInt1140 != -1) {
			local38 = Static17.method4472(this.anInt1140).method3588(null, null, 1024, this.anInt1139, 0, arg0, 0, -1);
			if (local38 != null) {
				local38.method1928(local6, local18.aClass36_Sub6Array1[2], 0);
			}
		}
		if (this.anInt1137 != -1) {
			local38 = Static17.method4472(this.anInt1137).method3588(null, null, 1024, this.anInt1144, 0, arg0, 0, -1);
			if (local38 != null) {
				local38.method1928(local6, local18.aClass36_Sub6Array1[1], 0);
			}
		}
		local38 = Static17.method4472(this.anInt1143).method3588(null, null, 1024, this.anInt1141, 0, arg0, 0, -1);
		if (local38 != null) {
			local38.method1928(local6, local18.aClass36_Sub6Array1[0], 0);
		}
		return local18;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!pe;)V")
	@Override
	public void method5341(@OriginalArg(1) Class89 arg0) {
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILclient!pe;I)Z")
	@Override
	public boolean method5342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89 arg2) {
		@Pc(6) Class70 local6 = arg2.method5427();
		local6.method3707(super.anInt1135, super.anInt1130, super.anInt1129);
		@Pc(30) Class31 local30 = Static17.method4472(this.anInt1143).method3588(null, null, 65536, this.anInt1141, 0, arg2, 0, -1);
		if (local30 != null && local30.method1932(arg1, arg0, local6, true)) {
			return true;
		}
		if (this.anInt1137 != -1) {
			local30 = Static17.method4472(this.anInt1137).method3588(null, null, 65536, this.anInt1144, 0, arg2, 0, -1);
			if (local30 != null && local30.method1932(arg1, arg0, local6, true)) {
				return true;
			}
		}
		if (this.anInt1140 != -1) {
			local30 = Static17.method4472(this.anInt1140).method3588(null, null, 65536, this.anInt1139, 0, arg2, 0, -1);
			if (local30 != null && local30.method1932(arg1, arg0, local6, true)) {
				return true;
			}
		}
		return false;
	}
}
