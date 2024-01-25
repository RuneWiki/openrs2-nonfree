import java.awt.Rectangle;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static602 {

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "Lclient!fha;")
	public static final Class101 aClass101_17 = new Class101(9, 7);

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	public static int anInt10200 = 0;

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "[I")
	public static final int[] anIntArray543 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!vh", name = "h", descriptor = "[Lclient!jea;")
	public static final Class6_Sub5_Sub18[] aClass6_Sub5_Sub18Array5 = new Class6_Sub5_Sub18[14];

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!bi;)Z")
	public static boolean method8315(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub8_Sub1 arg1) {
		@Pc(8) int local8 = arg1.method1512(2);
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(105) int local105;
		@Pc(109) int local109;
		@Pc(115) int local115;
		if (local8 == 0) {
			if (arg1.method1512(1) != 0) {
				method8315(arg0, arg1);
			}
			local31 = arg1.method1512(6);
			local36 = arg1.method1512(6);
			@Pc(48) boolean local48 = arg1.method1512(1) == 1;
			if (local48) {
				Static125.anIntArray119[Static76.anInt2534++] = arg0;
			}
			if (Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[arg0] != null) {
				throw new RuntimeException("hr:lr");
			}
			@Pc(71) Class379 local71 = Static530.aClass379Array1[arg0];
			@Pc(79) Class9_Sub4_Sub2_Sub1_Sub2 local79 = Static643.aClass9_Sub4_Sub2_Sub1_Sub2Array1[arg0] = new Class9_Sub4_Sub2_Sub1_Sub2();
			local79.anInt4299 = arg0;
			if (Static387.aClass6_Sub8Array1[arg0] != null) {
				local79.method3641(Static387.aClass6_Sub8Array1[arg0]);
			}
			local79.method3633(local71.anInt10721, true);
			local79.anInt4293 = local71.anInt10724;
			local105 = local71.anInt10723;
			local109 = local105 >> 28;
			local115 = local105 >> 14 & 0xFF;
			@Pc(119) int local119 = local105 & 0xFF;
			@Pc(128) int local128 = local31 + (local115 << 6) - Static477.anInt8412;
			local79.aBoolean357 = local71.aBoolean845;
			@Pc(141) int local141 = local36 + (local119 << 6) - Static227.anInt5049;
			local79.aByteArray31[0] = Static340.aByteArray57[arg0];
			local79.aByte135 = local79.aByte134 = (byte) local109;
			if (Static3.method52(local141, local128)) {
				local79.aByte134++;
			}
			local79.method3639(local141, local128);
			local79.aBoolean356 = false;
			Static530.aClass379Array1[arg0] = null;
			return true;
		} else if (local8 == 1) {
			local31 = arg1.method1512(2);
			local36 = Static530.aClass379Array1[arg0].anInt10723;
			Static530.aClass379Array1[arg0].anInt10723 = ((local31 + (local36 >> 28) & 0x3) << 28) + (local36 & 0xFFFFFFF);
			return false;
		} else {
			@Pc(229) int local229;
			@Pc(234) int local234;
			@Pc(242) int local242;
			if (local8 != 2) {
				local31 = arg1.method1512(18);
				local36 = local31 >> 16;
				local229 = local31 >> 8 & 0xFF;
				local234 = local31 & 0xFF;
				local242 = Static530.aClass379Array1[arg0].anInt10723;
				local105 = local36 + (local242 >> 28) & 0x3;
				local109 = local229 + (local242 >> 14) & 0xFF;
				local115 = local242 + local234 & 0xFF;
				Static530.aClass379Array1[arg0].anInt10723 = (local109 << 14) + (local105 << 28) + local115;
				return false;
			}
			local31 = arg1.method1512(5);
			local36 = local31 >> 3;
			local229 = local31 & 0x7;
			local234 = Static530.aClass379Array1[arg0].anInt10723;
			local242 = local36 + (local234 >> 28) & 0x3;
			local105 = local234 >> 14 & 0xFF;
			local109 = local234 & 0xFF;
			if (local229 == 0) {
				local109--;
				local105--;
			}
			if (local229 == 1) {
				local109--;
			}
			if (local229 == 2) {
				local105++;
				local109--;
			}
			if (local229 == 3) {
				local105--;
			}
			if (local229 == 4) {
				local105++;
			}
			if (local229 == 5) {
				local105--;
				local109++;
			}
			if (local229 == 6) {
				local109++;
			}
			if (local229 == 7) {
				local109++;
				local105++;
			}
			Static530.aClass379Array1[arg0].anInt10723 = (local105 << 14) + (local242 << 28) + local109;
			return false;
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V")
	public static void method8316(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(35) String local35 = "tele " + arg2 + "," + (arg1 >> 6) + "," + (arg0 >> 6) + "," + (arg1 & 0x3F) + "," + (arg0 & 0x3F);
		System.out.println(local35);
		Static131.method2668(local35, false, true);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z")
	public static boolean method8317() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static21.aHashtable2.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static21.aHashtable2.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static21.aHashtable2.keys();
				while (local12.hasMoreElements()) {
					@Pc(74) String local74 = (String) local12.nextElement();
					try {
						@Pc(79) File local79 = (File) Static236.aHashtable6.get(local74);
						@Pc(84) Class local84 = (Class) Static21.aHashtable2.get(local74);
						@Pc(90) Vector local90 = (Vector) local37.get(local84.getClassLoader());
						for (@Pc(92) int local92 = 0; local92 < local90.size(); local92++) {
							try {
								@Pc(98) Object local98 = local90.elementAt(local92);
								@Pc(103) Field local103 = local98.getClass().getDeclaredField("name");
								local47.invoke(local103, Boolean.TRUE);
								try {
									@Pc(118) String local118 = (String) local103.get(local98);
									if (local118 != null && local118.equalsIgnoreCase(local79.getCanonicalPath())) {
										@Pc(130) Field local130 = local98.getClass().getDeclaredField("handle");
										@Pc(137) Method local137 = local98.getClass().getDeclaredMethod("finalize");
										local47.invoke(local130, Boolean.TRUE);
										local47.invoke(local137, Boolean.TRUE);
										try {
											local137.invoke(local98);
											local130.set(local98, Integer.valueOf(0));
											local9.remove(local74);
										} catch (@Pc(176) Throwable local176) {
										}
										local47.invoke(local137, Boolean.FALSE);
										local47.invoke(local130, Boolean.FALSE);
									}
								} catch (@Pc(198) Throwable local198) {
								}
								local47.invoke(local103, Boolean.FALSE);
							} catch (@Pc(210) Throwable local210) {
							}
						}
					} catch (@Pc(222) Throwable local222) {
					}
				}
			} catch (@Pc(228) Throwable local228) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(240) Throwable local240) {
		}
		Static21.aHashtable2 = local9;
		return Static21.aHashtable2.isEmpty();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIII)V")
	public static void method8319(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(15) int local15 = 0; local15 < Static588.anInt9948; local15++) {
			@Pc(21) Rectangle local21 = Class6_Sub38.aRectangleArray1[local15];
			if (arg1 < local21.width + local21.x && arg1 + arg2 > local21.x && arg3 < local21.y + local21.height && arg3 + arg0 > local21.y) {
				Static337.aBooleanArray15[local15] = true;
			}
		}
		Static215.method3836(arg3 + arg0, arg3, arg1, arg2 + arg1);
	}
}
