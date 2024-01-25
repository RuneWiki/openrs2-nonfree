import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fh", name = "g", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_88 = new Class272(102, 7);

	@OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
	public static int anInt3061 = 0;

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(BZI)Lclient!vq;")
	public static Class3_Sub48 method2729(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub48) Static319.aClass310_24.method6601(local17);
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
	public static void method2733(@OriginalArg(0) int arg0) {
		if (!Static278.aClass3_Sub13_Sub1_1.aBoolean405) {
			arg0 = -1;
		}
		if (arg0 == Static47.anInt1017) {
			return;
		}
		if (arg0 != -1) {
			@Pc(25) Class142 local25 = Static172.aClass219_1.method5180(arg0);
			@Pc(29) Class355 local29 = local25.method3767();
			if (local29 == null) {
				arg0 = -1;
			} else {
				Static409.aClass221_6.method5197(local29.method7591(), new Point(local25.anInt4251, local25.anInt4257), local29.method7599(), local29.method7595(), Static347.aCanvas9);
				Static47.anInt1017 = arg0;
			}
		}
		if (arg0 == -1 && Static47.anInt1017 != -1) {
			Static409.aClass221_6.method5197(null, new Point(), -1, -1, Static347.aCanvas9);
			Static47.anInt1017 = -1;
		}
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIZI)Lclient!lc;")
	public static Class3_Sub28 method2740(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class3_Sub28 local7 = new Class3_Sub28();
		local7.anInt5330 = arg0;
		local7.anInt5333 = arg3;
		Static227.aClass310_15.method6603(local7, (long) arg1);
		Static91.method2048(arg3);
		@Pc(33) Class203 local33 = Static414.method5954(arg1);
		if (local33 != null) {
			Static138.method2656(local33);
		}
		if (Static48.aClass203_24 != null) {
			Static138.method2656(Static48.aClass203_24);
			Static48.aClass203_24 = null;
		}
		Static67.method1532();
		if (local33 != null) {
			Static480.method6572(!arg2, local33);
		}
		if (!arg2) {
			Static149.method2776(arg3);
		}
		if (!arg2 && Static307.anInt5578 != -1) {
			Static107.method5739(Static307.anInt5578, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!fh", name = "a", descriptor = "(ILclient!qh;)Lclient!gb;")
	public static Class111_Sub1 method2743(@OriginalArg(1) Class3_Sub11 arg0) {
		return new Class111_Sub1(arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3107(), arg0.method3126(), arg0.method3126(), arg0.method3118());
	}
}
