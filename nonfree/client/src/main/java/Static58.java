import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cda", name = "f", descriptor = "I")
	public static int anInt1114 = 0;

	@OriginalMember(owner = "client!cda", name = "j", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_41 = new Class202("Loaded JAGGL", "JAGGL geladen", "JAGGL chargé", "JAGGL carregado");

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(ZI)I")
	public static int method1074(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(Lclient!lba;Z)Z")
	public static boolean method1076(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static532.aClass75Array3 == Static427.aClass75Array2;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method6430();
		if (arg0.aShort127 < 0 || arg0.aShort128 < 0 || arg0.aShort125 >= Static515.anInt3809 || arg0.aShort126 >= Static315.anInt5693) {
			return false;
		}
		@Pc(38) int local38;
		for (@Pc(34) int local34 = arg0.aShort127; local34 <= arg0.aShort125; local34++) {
			for (local38 = arg0.aShort128; local38 <= arg0.aShort126; local38++) {
				@Pc(45) Class262 local45 = Static519.method7540(arg0.aByte90, local34, local38);
				if (local45 != null) {
					@Pc(49) int local49 = 0;
					if (local34 > arg0.aShort127) {
						local49++;
					}
					if (local34 < arg0.aShort125) {
						local49 += 4;
					}
					if (local38 > arg0.aShort128) {
						local49 += 8;
					}
					if (local38 < arg0.aShort126) {
						local49 += 2;
					}
					@Pc(74) Class187 local74 = Static108.method2070(arg0, local49);
					@Pc(77) Class187 local77 = local45.aClass187_3;
					if (local77 == null) {
						local45.aClass187_3 = local74;
					} else {
						while (local77.aClass187_1 != null) {
							local77 = local77.aClass187_1;
						}
						local77.aClass187_1 = local74;
					}
					local45.aByte99 = (byte) (local45.aByte99 | local49);
					if (local6 && (Static63.anIntArrayArray6[local34][local38] & 0xFF000000) != 0) {
						local8 = Static63.anIntArrayArray6[local34][local38];
						local10 = Static127.aShortArrayArray2[local34][local38];
						local12 = Static206.aByteArrayArray15[local34][local38];
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local38 = arg0.aShort127; local38 <= arg0.aShort125; local38++) {
				for (@Pc(150) int local150 = arg0.aShort128; local150 <= arg0.aShort126; local150++) {
					if ((Static63.anIntArrayArray6[local38][local150] & 0xFF000000) == 0) {
						Static63.anIntArrayArray6[local38][local150] = local8;
						Static127.aShortArrayArray2[local38][local150] = local10;
						Static206.aByteArrayArray15[local38][local150] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static126.aClass1_Sub1Array5[Static112.anInt2255++] = arg0;
		}
		return true;
	}

	@OriginalMember(owner = "client!cda", name = "a", descriptor = "(B)V")
	public static void method1077() {
		if (Static36.aFrame1 != null) {
			return;
		}
		@Pc(13) int local13 = Static343.anInt6345;
		@Pc(15) int local15 = Static276.anInt5006;
		@Pc(23) int local23 = Static400.anInt7591 - local13 - Static461.anInt8348;
		@Pc(30) int local30 = Static116.anInt2331 - Static223.anInt3996 - local15;
		if (local13 <= 0 && local23 <= 0 && local15 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(49) Container local49;
			if (Static132.aFrame2 == null) {
				local49 = Static531.aClass283_6.anApplet1;
			} else {
				local49 = Static132.aFrame2;
			}
			@Pc(55) int local55 = 0;
			@Pc(57) int local57 = 0;
			if (Static132.aFrame2 == local49) {
				@Pc(63) Insets local63 = Static132.aFrame2.getInsets();
				local55 = local63.left;
				local57 = local63.top;
			}
			@Pc(72) Graphics local72 = local49.getGraphics();
			local72.setColor(Color.black);
			if (local13 > 0) {
				local72.fillRect(local55, local57, local13, Static116.anInt2331);
			}
			if (local15 > 0) {
				local72.fillRect(local55, local57, Static400.anInt7591, local15);
			}
			if (local23 > 0) {
				local72.fillRect(local55 + Static400.anInt7591 - local23, local57, local23, Static116.anInt2331);
			}
			if (local30 > 0) {
				local72.fillRect(local55, local57 + Static116.anInt2331 - local30, Static400.anInt7591, local30);
				return;
			}
		} catch (@Pc(129) Exception local129) {
			return;
		}
	}

	@OriginalMember(owner = "client!cda", name = "b", descriptor = "(I)Z")
	public static boolean method1080() {
		@Pc(9) Hashtable local9 = new Hashtable();
		@Pc(12) Enumeration local12 = Static19.aHashtable1.keys();
		while (local12.hasMoreElements()) {
			@Pc(17) Object local17 = local12.nextElement();
			local9.put(local17, Static19.aHashtable1.get(local17));
		}
		try {
			@Pc(30) Class local30 = Class.forName("java.lang.reflect.AccessibleObject");
			@Pc(33) Class local33 = Class.forName("java.lang.ClassLoader");
			@Pc(37) Field local37 = local33.getDeclaredField("nativeLibraries");
			@Pc(47) Method local47 = local30.getDeclaredMethod("setAccessible", Boolean.TYPE);
			local47.invoke(local37, Boolean.TRUE);
			try {
				local12 = Static19.aHashtable1.keys();
				while (local12.hasMoreElements()) {
					@Pc(71) String local71 = (String) local12.nextElement();
					try {
						@Pc(76) File local76 = (File) Static517.aHashtable7.get(local71);
						@Pc(81) Class local81 = (Class) Static19.aHashtable1.get(local71);
						@Pc(87) Vector local87 = (Vector) local37.get(local81.getClassLoader());
						for (@Pc(89) int local89 = 0; local89 < local87.size(); local89++) {
							try {
								@Pc(95) Object local95 = local87.elementAt(local89);
								@Pc(100) Field local100 = local95.getClass().getDeclaredField("name");
								local47.invoke(local100, Boolean.TRUE);
								try {
									@Pc(115) String local115 = (String) local100.get(local95);
									if (local115 != null && local115.equalsIgnoreCase(local76.getCanonicalPath())) {
										@Pc(127) Field local127 = local95.getClass().getDeclaredField("handle");
										@Pc(134) Method local134 = local95.getClass().getDeclaredMethod("finalize");
										local47.invoke(local127, Boolean.TRUE);
										local47.invoke(local134, Boolean.TRUE);
										try {
											local134.invoke(local95);
											local127.set(local95, Integer.valueOf(0));
											local9.remove(local71);
										} catch (@Pc(173) Throwable local173) {
										}
										local47.invoke(local134, Boolean.FALSE);
										local47.invoke(local127, Boolean.FALSE);
									}
								} catch (@Pc(195) Throwable local195) {
								}
								local47.invoke(local100, Boolean.FALSE);
							} catch (@Pc(207) Throwable local207) {
							}
						}
					} catch (@Pc(219) Throwable local219) {
					}
				}
			} catch (@Pc(225) Throwable local225) {
			}
			local47.invoke(local37, Boolean.FALSE);
		} catch (@Pc(237) Throwable local237) {
		}
		Static19.aHashtable1 = local9;
		return Static19.aHashtable1.isEmpty();
	}
}
