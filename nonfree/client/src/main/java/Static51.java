import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "[Lclient!xa;")
	public static Class119[] aClass119Array4;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_16 = new Class67("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZII)Z")
	public static boolean method1078(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x70000) != 0 | Static449.method6811(arg1, arg0) || Static490.method7167(arg0, arg1);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	public static void method1079() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static277.anInt5700 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBZIILclient!kea;)V")
	public static void method1081(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1, @OriginalArg(6) Class161 arg2) {
		Static346.aBoolean415 = false;
		Static319.anInt6143 = arg1;
		Static339.anInt5660 = 0;
		Static282.anInt5792 = arg0;
		Static32.anInt815 = 2;
		Static492.aClass161_108 = arg2;
		Static429.anInt7900 = 1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!eca;[I[I[I)V")
	public static void method1082(@OriginalArg(1) Class6_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(7) int local7 = 0; local7 < arg2.length; local7++) {
			@Pc(13) int local13 = arg2[local7];
			@Pc(17) int local17 = arg1[local7];
			@Pc(21) int local21 = arg3[local7];
			for (@Pc(23) int local23 = 0; local17 != 0 && arg0.aClass152Array3.length > local23; local23++) {
				if ((local17 & 0x1) != 0) {
					if (local13 == -1) {
						arg0.aClass152Array3[local23] = null;
					} else {
						@Pc(41) Class122 local41 = Static46.aClass247_1.method6029(local13);
						@Pc(44) int local44 = local41.anInt4145;
						@Pc(49) Class152 local49 = arg0.aClass152Array3[local23];
						if (local49 != null) {
							if (local49.anInt4899 == local13) {
								if (local44 == 0) {
									local49 = arg0.aClass152Array3[local23] = null;
								} else if (local44 == 1) {
									local49.anInt4897 = 1;
									local49.anInt4898 = 0;
									local49.anInt4901 = 0;
									local49.anInt4902 = local21;
									local49.anInt4900 = 0;
									Static448.method6790(Static111.aClass6_Sub1_Sub2_Sub1_3 == arg0, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local41, 0);
								} else if (local44 == 2) {
									local49.anInt4898 = 0;
								}
							} else if (local41.anInt4146 >= Static46.aClass247_1.method6029(local49.anInt4899).anInt4146) {
								local49 = arg0.aClass152Array3[local23] = null;
							}
						}
						if (local49 == null) {
							local49 = arg0.aClass152Array3[local23] = new Class152();
							local49.anInt4901 = 0;
							local49.anInt4899 = local13;
							local49.anInt4898 = 0;
							local49.anInt4900 = 0;
							local49.anInt4897 = 1;
							local49.anInt4902 = local21;
							Static448.method6790(arg0 == Static111.aClass6_Sub1_Sub2_Sub1_3, arg0.anInt8811, arg0.anInt8813, arg0.aByte100, local41, 0);
						}
					}
				}
				local17 >>>= 0x1;
			}
		}
	}
}
