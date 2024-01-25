import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static428 {

	@OriginalMember(owner = "client!qj", name = "T", descriptor = "Lclient!kb;")
	public static Class183 aClass183_6;

	@OriginalMember(owner = "client!qj", name = "ob", descriptor = "I")
	public static int anInt8060;

	@OriginalMember(owner = "client!qj", name = "Q", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray56 = new String[100];

	@OriginalMember(owner = "client!qj", name = "S", descriptor = "I")
	public static int anInt8046 = 104;

	@OriginalMember(owner = "client!qj", name = "mb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[100];

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(ZIIII)Lclient!qo;")
	public static Class4_Sub37 method6706(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class4_Sub37 local7 = new Class4_Sub37();
		local7.anInt8141 = arg3;
		local7.anInt8142 = arg1;
		Static189.aClass350_14.method8199((long) arg2, local7);
		Static178.method3228(arg3);
		@Pc(36) Class225 local36 = Static490.method7272(arg2);
		if (local36 != null) {
			Static92.method2100(local36);
		}
		if (Static69.aClass225_8 != null) {
			Static92.method2100(Static69.aClass225_8);
			Static69.aClass225_8 = null;
		}
		Static446.method6890();
		if (local36 != null) {
			Static38.method489(!arg0, local36);
		}
		if (!arg0) {
			Static388.method6115(arg3);
		}
		if (!arg0 && Static332.anInt6370 != -1) {
			Static228.method3612(1, Static332.anInt6370);
		}
		return local7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)V")
	public static void method6708() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static225.aBooleanArray10[local3] = false;
		}
		Static233.anInt4216 = 0;
		Static166.anInt3419 = 1;
		Static159.anInt3286 = 0;
		Static214.anInt3969 = -1;
		Static326.anInt6302 = -1;
		Static51.anInt759 = -1;
		Static549.anInt9733 = -1;
	}

	@OriginalMember(owner = "client!qj", name = "k", descriptor = "(I)V")
	public static void method6709() {
		Static339.anInt6583 = 0;
		Static40.aClass244_4.method5962();
		Static49.aBoolean36 = false;
	}
}
