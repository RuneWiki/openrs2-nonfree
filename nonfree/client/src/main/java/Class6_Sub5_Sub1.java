import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sj")
public final class Class6_Sub5_Sub1 extends Class6_Sub5 {

	@OriginalMember(owner = "client!sj", name = "w", descriptor = "I")
	public int anInt8137;

	@OriginalMember(owner = "client!sj", name = "C", descriptor = "I")
	public int anInt8143;

	@OriginalMember(owner = "client!sj", name = "D", descriptor = "I")
	public int anInt8144;

	@OriginalMember(owner = "client!sj", name = "H", descriptor = "I")
	public int anInt8148;

	@OriginalMember(owner = "client!sj", name = "B", descriptor = "I")
	public int anInt8142 = -1;

	@OriginalMember(owner = "client!sj", name = "E", descriptor = "I")
	public int anInt8145 = -1;

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(Lclient!oa;I)Lclient!ew;")
	@Override
	public Class81 method7751(@OriginalArg(0) Class5 arg0) {
		return null;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!oa;B)Lclient!aca;")
	@Override
	public Class4_Sub1 method7745(@OriginalArg(0) Class5 arg0) {
		@Pc(6) Class205 local6 = arg0.method7448();
		local6.GA(super.anInt8135, super.anInt8128 - 10, super.anInt8132);
		@Pc(20) Class4_Sub1 local20 = Static264.method4641(3);
		@Pc(42) Class2 local42;
		if (this.anInt8145 != -1) {
			local42 = Static99.aClass96_7.method2508(this.anInt8145).method829(null, null, arg0, this.anInt8143, 2048, -1, 0, 0);
			if (local42 != null) {
				local42.method5774(local6, local20.aClass4_Sub7Array1[2], 0);
			}
		}
		if (this.anInt8142 != -1) {
			local42 = Static99.aClass96_7.method2508(this.anInt8142).method829(null, null, arg0, this.anInt8148, 2048, -1, 0, 0);
			if (local42 != null) {
				local42.method5774(local6, local20.aClass4_Sub7Array1[1], 0);
			}
		}
		local42 = Static99.aClass96_7.method2508(this.anInt8144).method829(null, null, arg0, this.anInt8137, 2048, -1, 0, 0);
		if (local42 != null) {
			local42.method5774(local6, local20.aClass4_Sub7Array1[0], 0);
		}
		return local20;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lclient!oa;I)V")
	@Override
	public void method7746(@OriginalArg(0) Class5 arg0) {
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IILclient!oa;I)Z")
	@Override
	public boolean method7744(@OriginalArg(1) int arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class205 local11 = arg1.method7448();
		local11.GA(super.anInt8135, super.anInt8128, super.anInt8132);
		@Pc(38) Class2 local38 = Static99.aClass96_7.method2508(this.anInt8144).method829(null, null, arg1, this.anInt8137, 131072, -1, 0, 0);
		if (local38 != null && local38.method5786(arg0, arg2, local11, true)) {
			return true;
		}
		if (this.anInt8142 != -1) {
			local38 = Static99.aClass96_7.method2508(this.anInt8142).method829(null, null, arg1, this.anInt8148, 131072, -1, 0, 0);
			if (local38 != null && local38.method5786(arg0, arg2, local11, true)) {
				return true;
			}
		}
		if (this.anInt8145 != -1) {
			local38 = Static99.aClass96_7.method2508(this.anInt8145).method829(null, null, arg1, this.anInt8143, 131072, -1, 0, 0);
			if (local38 != null && local38.method5786(arg0, arg2, local11, true)) {
				return true;
			}
		}
		return false;
	}
}
