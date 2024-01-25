import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wq", name = "o", descriptor = "F")
	public static float aFloat220;

	@OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
	public static int anInt7534 = 0;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIZZI)Lclient!as;")
	public static Class4_Sub4 method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(7) Class4_Sub4 local7 = new Class4_Sub4();
		local7.anInt574 = arg0;
		local7.anInt573 = arg1;
		Static391.aClass196_37.method4474((long) arg3, local7);
		Static299.method4152(arg1);
		@Pc(26) Class126 local26 = Static53.method1056(arg3);
		if (local26 != null) {
			Static430.method5524(local26);
		}
		if (Static454.aClass126_17 != null) {
			Static430.method5524(Static454.aClass126_17);
			Static454.aClass126_17 = null;
		}
		Static112.method1770();
		if (local26 != null) {
			Static114.method1812(local26, !arg2);
		}
		if (!arg2) {
			Static172.method2505(arg1);
		}
		if (!arg2 && Static404.anInt6892 != -1) {
			Static99.method4522(Static404.anInt6892, 1);
		}
		return local7;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ZZII)Ljava/lang/String;")
	public static String method5804(@OriginalArg(3) int arg0) {
		if (arg0 < 0) {
			return Integer.toString(arg0, 10);
		}
		@Pc(36) int local36 = 2;
		for (@Pc(40) int local40 = arg0 / 10; local40 != 0; local40 /= 10) {
			local36++;
		}
		@Pc(52) char[] local52 = new char[local36];
		local52[0] = '+';
		for (@Pc(60) int local60 = local36 - 1; local60 > 0; local60--) {
			@Pc(64) int local64 = arg0;
			arg0 /= 10;
			@Pc(75) int local75 = local64 - arg0 * 10;
			if (local75 >= 10) {
				local52[local60] = (char) (local75 + 87);
			} else {
				local52[local60] = (char) (local75 + 48);
			}
		}
		return new String(local52);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5807(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Static179.method2607(arg0, "\n", "%0a"));
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(IBLclient!vr;Lclient!qa;I)V")
	public static void method5812(@OriginalArg(2) Class258 arg0, @OriginalArg(3) Class30 arg1) {
		Static113.aClass258_17.method5527();
		if (Static433.aBoolean484) {
			return;
		}
		for (@Pc(28) Class4_Sub32 local28 = (Class4_Sub32) arg0.method5538(); local28 != null; local28 = (Class4_Sub32) arg0.method5528()) {
			@Pc(36) Class25 local36 = Static137.aClass198_4.method4491(local28.anInt5601);
			if (Static111.method5046(local36)) {
				@Pc(48) boolean local48 = Static66.method1255(local36, local28, arg1);
				if (local48) {
					Static128.method1912(local36, local28, arg1);
				}
			}
		}
	}
}
