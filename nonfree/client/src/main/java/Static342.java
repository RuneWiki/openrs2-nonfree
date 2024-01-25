import java.awt.Canvas;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static342 {

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Lclient!us;")
	public static final Class234 aClass234_116 = new Class234(88, 8);

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "S")
	public static short aShort86 = 205;

	@OriginalMember(owner = "client!tt", name = "z", descriptor = "[I")
	public static final int[] anIntArray627 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!tt", name = "A", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_86 = new Class57("Starting 3d Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ILclient!tr;IBLclient!sm;IILclient!dt;)V")
	public static void method5171(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class38 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class62 arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static88.anInt1815 == 4) {
			local14 = (int) Static352.aFloat68 & 0x3FFF;
		} else {
			local14 = Static129.anInt2435 + (int) Static352.aFloat68 & 0x3FFF;
		}
		@Pc(47) int local47 = Math.max(arg6.anInt1546 / 2, arg6.anInt1551 / 2) + 10;
		@Pc(56) int local56 = arg4 * arg4 + arg0 * arg0;
		if (local47 * local47 < local56) {
			return;
		}
		@Pc(66) int local66 = Class226.anIntArray614[local14];
		@Pc(70) int local70 = Class226.anIntArray613[local14];
		if (Static88.anInt1815 != 4) {
			local66 = local66 * 256 / (Static187.anInt3396 + 256);
			local70 = local70 * 256 / (Static187.anInt3396 + 256);
		}
		@Pc(101) int local101 = arg4 * local70 + local66 * arg0 >> 15;
		@Pc(112) int local112 = local70 * arg0 - arg4 * local66 >> 15;
		arg1.method5084(local101 + arg6.anInt1546 / 2 + arg2 - arg1.method5101() / 2, -local112 + arg6.anInt1551 / 2 + (arg5 - arg1.method5097() / 2), arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V")
	public static void method5173() {
		Static158.method2441(Static313.aClass62_18);
		Static352.anInt5915++;
		if (Static51.aBoolean57 && Static206.aBoolean264) {
			@Pc(33) int local33 = Static200.aClass10_1.method5242();
			@Pc(37) int local37 = Static200.aClass10_1.method5240();
			local37 -= Static48.anInt1064;
			local33 -= Static320.anInt5451;
			if (local33 < Static294.anInt5084) {
				local33 = Static294.anInt5084;
			}
			if (local33 + Static313.aClass62_18.anInt1546 > Static294.anInt5084 + Static363.aClass62_19.anInt1546) {
				local33 = Static363.aClass62_19.anInt1546 + Static294.anInt5084 - Static313.aClass62_18.anInt1546;
			}
			if (Static234.anInt4190 > local37) {
				local37 = Static234.anInt4190;
			}
			if (Static363.aClass62_19.anInt1551 + Static234.anInt4190 < Static313.aClass62_18.anInt1551 + local37) {
				local37 = Static363.aClass62_19.anInt1551 + Static234.anInt4190 - Static313.aClass62_18.anInt1551;
			}
			@Pc(102) int local102 = Static363.aClass62_19.anInt1574 + local33 - Static294.anInt5084;
			@Pc(111) int local111 = local37 + Static363.aClass62_19.anInt1504 - Static234.anInt4190;
			@Pc(174) Class3_Sub23 local174;
			if (Static200.aClass10_1.method5238()) {
				if (Static313.aClass62_18.anInt1499 < Static352.anInt5915) {
					@Pc(128) int local128 = local33 - Static311.anInt5380;
					@Pc(133) int local133 = local37 - Static316.anInt5437;
					if (Static313.aClass62_18.anInt1552 < local128 || local128 < -Static313.aClass62_18.anInt1552 || local133 > Static313.aClass62_18.anInt1552 || -Static313.aClass62_18.anInt1552 > local133) {
						Static314.aBoolean421 = true;
					}
				}
				if (Static313.aClass62_18.anObjectArray15 != null && Static314.aBoolean421) {
					local174 = new Class3_Sub23();
					local174.anInt3034 = local102;
					local174.anObjectArray31 = Static313.aClass62_18.anObjectArray15;
					local174.aClass62_11 = Static313.aClass62_18;
					local174.anInt3037 = local111;
					Static124.method2006(local174);
					return;
				}
			} else {
				if (Static314.aBoolean421) {
					Static203.method3169();
					if (Static313.aClass62_18.anObjectArray2 != null) {
						local174 = new Class3_Sub23();
						local174.aClass62_11 = Static313.aClass62_18;
						local174.anInt3037 = local111;
						local174.anObjectArray31 = Static313.aClass62_18.anObjectArray2;
						local174.anInt3034 = local102;
						local174.aClass62_10 = Static337.aClass62_16;
						Static124.method2006(local174);
					}
					if (Static337.aClass62_16 != null && Static48.method923(Static313.aClass62_18) != null) {
						Static316.method4836(Static337.aClass62_16, Static313.aClass62_18);
					}
				} else if ((Static346.anInt5849 == 1 || Static167.method2524()) && Static105.anInt2076 > 2) {
					Static130.method2061(Static311.anInt5380 + Static320.anInt5451, Static48.anInt1064 - -Static316.anInt5437);
				} else if (Static30.method470()) {
					Static130.method2061(Static311.anInt5380 + Static320.anInt5451, Static48.anInt1064 + Static316.anInt5437);
				}
				Static313.aClass62_18 = null;
			}
		} else if (Static352.anInt5915 > 1) {
			Static313.aClass62_18 = null;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!mj;Ljava/awt/Canvas;IILclient!wp;I)Lclient!np;")
	public static Class155 method5174(@OriginalArg(0) Class156 arg0, @OriginalArg(1) Canvas arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Interface10 arg3, @OriginalArg(5) int arg4) {
		try {
			@Pc(11) Class local11 = Class.forName("Class155_Sub1");
			@Pc(57) Constructor local57 = local11.getConstructor(Canvas.class, wp.class, Integer.TYPE, Integer.TYPE, mj.class);
			return (Class155) local57.newInstance(arg1, arg3, Integer.valueOf(arg2), new Integer(arg4), arg0);
		} catch (@Pc(90) Exception local90) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
	public static void method5175(@OriginalArg(0) String arg0, @OriginalArg(2) boolean arg1) {
		@Pc(4) String local4 = arg0.toLowerCase();
		@Pc(11) short[] local11 = new short[16];
		@Pc(13) int local13 = 0;
		@Pc(19) int local19 = arg1 ? 32768 : 0;
		@Pc(27) int local27 = (arg1 ? Static235.anInt4200 : Static337.anInt5692) + local19;
		for (@Pc(29) int local29 = local19; local29 < local27; local29++) {
			@Pc(37) Class3_Sub7_Sub5 local37 = Static222.method3706(local29);
			if (local37.aBoolean147 && local37.method1635().toLowerCase().indexOf(local4) != -1) {
				if (local13 >= 50) {
					Static127.aShortArray44 = null;
					Static189.anInt3424 = -1;
					return;
				}
				if (local11.length <= local13) {
					@Pc(70) short[] local70 = new short[local11.length * 2];
					for (@Pc(72) int local72 = 0; local72 < local13; local72++) {
						local70[local72] = local11[local72];
					}
					local11 = local70;
				}
				local11[local13++] = (short) local29;
			}
		}
		Static127.aShortArray44 = local11;
		Static290.anInt5036 = 0;
		Static189.anInt3424 = local13;
		@Pc(113) String[] local113 = new String[Static189.anInt3424];
		for (@Pc(115) int local115 = 0; local115 < Static189.anInt3424; local115++) {
			local113[local115] = Static222.method3706(local11[local115]).method1635();
		}
		Static275.method4305(local113, Static127.aShortArray44);
	}
}
