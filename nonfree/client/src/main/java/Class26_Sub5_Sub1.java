import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class26_Sub5_Sub1 extends Class26_Sub5 {

	@OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
	public int anInt2705;

	@OriginalMember(owner = "client!hq", name = "u", descriptor = "I")
	public int anInt2707;

	@OriginalMember(owner = "client!hq", name = "w", descriptor = "I")
	public int anInt2709;

	@OriginalMember(owner = "client!hq", name = "x", descriptor = "I")
	public int anInt2710;

	@OriginalMember(owner = "client!hq", name = "C", descriptor = "I")
	public int anInt2714 = -1;

	@OriginalMember(owner = "client!hq", name = "v", descriptor = "I")
	public int anInt2708 = -1;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!qa;III)Z")
	@Override
	public boolean method5517(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(6) Class18 local6 = arg0.method4709();
		local6.R(super.anInt2702, super.anInt2698, super.anInt2703);
		@Pc(36) Class37 local36 = Static196.aClass139_1.method3228(this.anInt2710).method6028(this.anInt2707, 0, -1, null, null, 131072, arg0, 0);
		if (local36 != null && local36.method4228(arg1, arg2, local6, true)) {
			return true;
		}
		if (this.anInt2714 != -1) {
			local36 = Static196.aClass139_1.method3228(this.anInt2714).method6028(this.anInt2705, 0, -1, null, null, 131072, arg0, 0);
			if (local36 != null && local36.method4228(arg1, arg2, local6, true)) {
				return true;
			}
		}
		if (this.anInt2708 != -1) {
			local36 = Static196.aClass139_1.method3228(this.anInt2708).method6028(this.anInt2709, 0, -1, null, null, 131072, arg0, 0);
			if (local36 != null && local36.method4228(arg1, arg2, local6, true)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hq", name = "c", descriptor = "(ILclient!qa;)V")
	@Override
	public void method5519(@OriginalArg(1) Class109 arg0) {
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lclient!qa;I)Lclient!ip;")
	@Override
	public Class39_Sub4 method5520(@OriginalArg(0) Class109 arg0) {
		@Pc(6) Class18 local6 = arg0.method4709();
		local6.R(super.anInt2702, super.anInt2698, super.anInt2703);
		@Pc(18) Class39_Sub4 local18 = Static72.method1208(3);
		@Pc(39) Class37 local39;
		if (this.anInt2708 != -1) {
			local39 = Static196.aClass139_1.method3228(this.anInt2708).method6028(this.anInt2709, 0, -1, null, null, 2048, arg0, 0);
			if (local39 != null) {
				local39.method4230(local6, local18.aClass39_Sub7Array1[2], 0);
			}
		}
		if (this.anInt2714 != -1) {
			local39 = Static196.aClass139_1.method3228(this.anInt2714).method6028(this.anInt2705, 0, -1, null, null, 2048, arg0, 0);
			if (local39 != null) {
				local39.method4230(local6, local18.aClass39_Sub7Array1[1], 0);
			}
		}
		local39 = Static196.aClass139_1.method3228(this.anInt2710).method6028(this.anInt2707, 0, -1, null, null, 2048, arg0, 0);
		if (local39 != null) {
			local39.method4230(local6, local18.aClass39_Sub7Array1[0], 0);
		}
		return local18;
	}
}
