import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "[I")
	public static final int[] anIntArray412 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!ln;Z)V")
	public static void method5079(@OriginalArg(0) Class7_Sub2_Sub3_Sub2 arg0) {
		@Pc(11) Class3_Sub12 local11 = (Class3_Sub12) Static272.aClass11_36.method324((long) arg0.anInt4391);
		if (local11 == null) {
			Static387.method5032(arg0.aByte77, 0, null, arg0.anIntArray288[0], arg0, null, arg0.anIntArray287[0]);
		} else {
			local11.method1644();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Lclient!kl;")
	public static Class3_Sub4_Sub12 method5080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(20) Class3_Sub4_Sub12 local20 = (Class3_Sub4_Sub12) Static46.aClass11_4.method324((long) arg0 | (long) arg1 << 32);
		if (local20 == null) {
			local20 = new Class3_Sub4_Sub12(arg1, arg0);
			Static46.aClass11_4.method319(local20, local20.aLong234);
		}
		return local20;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZB)V")
	public static void method5081(@OriginalArg(0) boolean arg0) {
		for (@Pc(6) Class3_Sub12 local6 = (Class3_Sub12) Static17.aClass243_1.method5208(); local6 != null; local6 = (Class3_Sub12) Static17.aClass243_1.method5203()) {
			if (local6.aClass3_Sub5_Sub2_1 != null) {
				Static331.aClass3_Sub5_Sub1_42.method886(local6.aClass3_Sub5_Sub2_1);
				local6.aClass3_Sub5_Sub2_1 = null;
			}
			if (local6.aClass3_Sub5_Sub2_2 != null) {
				Static331.aClass3_Sub5_Sub1_42.method886(local6.aClass3_Sub5_Sub2_2);
				local6.aClass3_Sub5_Sub2_2 = null;
			}
			local6.method5977();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(50) Class3_Sub12 local50 = (Class3_Sub12) Static54.aClass243_11.method5208(); local50 != null; local50 = (Class3_Sub12) Static54.aClass243_11.method5203()) {
			if (local50.aClass3_Sub5_Sub2_1 != null) {
				Static331.aClass3_Sub5_Sub1_42.method886(local50.aClass3_Sub5_Sub2_1);
				local50.aClass3_Sub5_Sub2_1 = null;
			}
			local50.method5977();
		}
		for (@Pc(78) Class3_Sub12 local78 = (Class3_Sub12) Static272.aClass11_36.method313(); local78 != null; local78 = (Class3_Sub12) Static272.aClass11_36.method316()) {
			if (local78.aClass3_Sub5_Sub2_1 != null) {
				Static331.aClass3_Sub5_Sub1_42.method886(local78.aClass3_Sub5_Sub2_1);
				local78.aClass3_Sub5_Sub2_1 = null;
			}
			local78.method5977();
		}
	}
}
