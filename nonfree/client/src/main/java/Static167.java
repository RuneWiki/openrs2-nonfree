import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
	public static int anInt3304 = 0;

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "[S")
	public static final short[] aShortArray49 = new short[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!ib", name = "g", descriptor = "I")
	public static int anInt3308 = 0;

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIILclient!ph;)Lclient!ao;")
	public static Class10_Sub1_Sub2 method2773(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class187 arg2) {
		@Pc(14) Class10_Sub8 local14 = new Class10_Sub8(arg2.method4300(arg1, arg0));
		@Pc(47) Class10_Sub1_Sub2 local47 = new Class10_Sub1_Sub2(arg0, local14.method2478(), local14.method2478(), local14.method2459(), local14.method2459(), local14.method2502() == 1, local14.method2502(), local14.method2502());
		@Pc(60) int local60 = local14.method2502();
		for (@Pc(62) int local62 = 0; local62 < local60; local62++) {
			local47.aClass163_3.method3613(new Class10_Sub41(local14.method2502(), local14.method2485(), local14.method2485(), local14.method2485(), local14.method2485(), local14.method2485(), local14.method2485(), local14.method2485(), local14.method2485()));
		}
		local47.method199();
		return local47;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lclient!cd;IIZ)Lclient!md;")
	public static Class10_Sub1_Sub11 method2776(@OriginalArg(0) Class36 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = arg1 << 8 | arg0.anInt890;
		@Pc(24) Class10_Sub1_Sub11 local24 = (Class10_Sub1_Sub11) Static99.aClass52_1.method1350((long) local10 << 16);
		if (local24 != null) {
			return local24;
		}
		@Pc(36) byte[] local36 = Static157.aClass187_63.method4303(Static157.aClass187_63.method4277(local10));
		if (local36 == null) {
			local10 = arg2 + 65536 << 8 | arg0.anInt890;
			local24 = (Class10_Sub1_Sub11) Static99.aClass52_1.method1350((long) local10 << 16);
			if (local24 != null) {
				return local24;
			}
			local36 = Static157.aClass187_63.method4303(Static157.aClass187_63.method4277(local10));
			if (local36 == null) {
				local10 = arg0.anInt890 | 0xFFFF00;
				local24 = (Class10_Sub1_Sub11) Static99.aClass52_1.method1350((long) local10 << 16);
				if (local24 != null) {
					return local24;
				}
				local36 = Static157.aClass187_63.method4303(Static157.aClass187_63.method4277(local10));
				if (local36 == null) {
					return null;
				} else if (local36.length <= 1) {
					return null;
				} else {
					local24 = Static363.method4870(local36);
					local24.aClass36_11 = arg0;
					Static99.aClass52_1.method1347((long) local10 << 16, local24);
					return local24;
				}
			} else if (local36.length <= 1) {
				return null;
			} else {
				local24 = Static363.method4870(local36);
				local24.aClass36_11 = arg0;
				Static99.aClass52_1.method1347((long) local10 << 16, local24);
				return local24;
			}
		} else if (local36.length <= 1) {
			return null;
		} else {
			local24 = Static363.method4870(local36);
			local24.aClass36_11 = arg0;
			Static99.aClass52_1.method1347((long) local10 << 16, local24);
			return local24;
		}
	}
}
