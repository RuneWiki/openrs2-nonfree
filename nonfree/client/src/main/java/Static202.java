import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!na", name = "m", descriptor = "F")
	public static float aFloat31;

	@OriginalMember(owner = "client!na", name = "n", descriptor = "Lclient!nq;")
	public static Class144 aClass144_59;

	@OriginalMember(owner = "client!na", name = "o", descriptor = "Lclient!nq;")
	public static Class144 aClass144_60;

	@OriginalMember(owner = "client!na", name = "r", descriptor = "Lclient!ja;")
	public static Interface2 anInterface2_5;

	@OriginalMember(owner = "client!na", name = "j", descriptor = "I")
	public static int anInt4130 = 0;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!nq;Lclient!nq;)V")
	public static void method3624(@OriginalArg(1) Class144 arg0, @OriginalArg(2) Class144 arg1) {
		Static212.aClass144_67 = arg1;
		Static222.aClass144_73 = arg0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3625(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(15) Class11_Sub4_Sub12 local15 = Static35.method512(3, arg0);
		local15.method3858();
		local15.aString41 = arg1;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
	public static void method3626() {
		try {
			if (Static329.anInt6323 == 1) {
				@Pc(15) int local15 = Static309.aClass11_Sub10_Sub4_3.method4085();
				if (local15 > 0 && Static309.aClass11_Sub10_Sub4_3.method4063()) {
					local15 -= Static240.anInt4833;
					if (local15 < 0) {
						local15 = 0;
					}
					Static309.aClass11_Sub10_Sub4_3.method4096(local15);
				} else {
					Static309.aClass11_Sub10_Sub4_3.method4092();
					Static309.aClass11_Sub10_Sub4_3.method4094();
					Static241.aClass11_Sub3_2 = null;
					if (Static177.aClass144_46 == null) {
						Static329.anInt6323 = 0;
					} else {
						Static329.anInt6323 = 2;
					}
					Static279.aClass139_1 = null;
				}
			}
		} catch (@Pc(57) Exception local57) {
			local57.printStackTrace();
			Static309.aClass11_Sub10_Sub4_3.method4092();
			Static329.anInt6323 = 0;
			Static241.aClass11_Sub3_2 = null;
			Static177.aClass144_46 = null;
			Static279.aClass139_1 = null;
		}
	}
}
