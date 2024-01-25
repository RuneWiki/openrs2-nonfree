import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!fs", name = "A", descriptor = "I")
	public static int anInt3034;

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILjava/lang/Class;)V")
	public static void method2837(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class73 local7 = Static267.aClass73ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		for (@Pc(13) Class144 local13 = local7.aClass144_1; local13 != null; local13 = local13.aClass144_2) {
			@Pc(17) Class3_Sub1_Sub2 local17 = local13.aClass3_Sub1_Sub2_1;
			if (arg3.isAssignableFrom(local17.getClass()) && local17.aShort124 == arg1 && local17.aShort125 == arg2) {
				Static63.method1388(local17, false);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Lclient!qh;B)V")
	public static void method2839(@OriginalArg(0) Class4_Sub5_Sub17 arg0) {
		if (arg0 == null) {
			return;
		}
		Static87.aClass163_14.method3646(arg0);
		Static574.anInt8895++;
		@Pc(42) Class4_Sub5_Sub12 local42;
		if (arg0.aBoolean600 || "".equals(arg0.aString97)) {
			local42 = new Class4_Sub5_Sub12(arg0.aString97);
			Static579.anInt8938++;
		} else {
			@Pc(36) long local36 = arg0.aLong225;
			for (local42 = (Class4_Sub5_Sub12) Static205.aClass66_16.method1994(local36); local42 != null && !local42.aString45.equals(arg0.aString97); local42 = (Class4_Sub5_Sub12) Static205.aClass66_16.method1991()) {
			}
			if (local42 == null) {
				local42 = (Class4_Sub5_Sub12) Static487.aClass352_11.method7653(local36);
				if (local42 != null && !local42.aString45.equals(arg0.aString97)) {
					local42 = null;
				}
				if (local42 == null) {
					local42 = new Class4_Sub5_Sub12(arg0.aString97);
				}
				Static205.aClass66_16.method1985(local42, local36);
				Static579.anInt8938++;
			}
		}
		if (local42.method4195(arg0)) {
			Static506.method6898(local42);
		}
	}
}
