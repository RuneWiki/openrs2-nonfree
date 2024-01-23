import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static238 {

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
	public static int anInt4978 = 0;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "Z")
	public static boolean aBoolean312 = false;

	@OriginalMember(owner = "client!rf", name = "h", descriptor = "Lclient!wf;")
	public static Class191 aClass191_11 = null;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public static void method3755() {
		if (Static96.anInt2212 == 10 && Static294.aBoolean367) {
			Static112.method1823(28);
		}
		if (Static96.anInt2212 == 30) {
			Static112.method1823(25);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
	public static String method3756(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(14) int local14 = arg0.length();
		if (local14 < 1) {
			return null;
		}
		if (local14 > 20) {
			local14 = 20;
		}
		@Pc(33) StringBuffer local33 = new StringBuffer(local14);
		for (@Pc(35) int local35 = 0; local35 < local14; local35++) {
			@Pc(42) char local42 = arg0.charAt(local35);
			if (Static297.method4545(local42)) {
				if (local42 == '[' || local42 == ']' || local42 == '#') {
					local33.append(local42);
				} else if (local42 != '-') {
					if (local42 == 'à' || local42 == 'á' || local42 == 'â' || local42 == 'ä' || local42 == 'ã' || local42 == 'À' || local42 == 'Á' || local42 == 'Â' || local42 == 'Ä' || local42 == 'Ã') {
						local33.append('a');
					} else if (local42 == 'è' || local42 == 'é' || local42 == 'ê' || local42 == 'ë' || local42 == 'È' || local42 == 'É' || local42 == 'Ê' || local42 == 'Ë') {
						local33.append('e');
					} else if (local42 == 'í' || local42 == 'î' || local42 == 'ï' || local42 == 'Í' || local42 == 'Î' || local42 == 'Ï') {
						local33.append('i');
					} else if (local42 == 'ò' || local42 == 'ó' || local42 == 'ô' || local42 == 'ö' || local42 == 'õ' || local42 == 'Ò' || local42 == 'Ó' || local42 == 'Ô' || local42 == 'Ö' || local42 == 'Õ') {
						local33.append('o');
					} else if (local42 == 'ù' || local42 == 'ú' || local42 == 'û' || local42 == 'ü' || local42 == 'Ù' || local42 == 'Ú' || local42 == 'Û' || local42 == 'Ü') {
						local33.append('u');
					} else if (local42 == 'ç' || local42 == 'Ç') {
						local33.append('c');
					} else if (local42 == 'ÿ' || local42 == 'Ÿ') {
						local33.append('y');
					} else if (local42 == 'ñ' || local42 == 'Ñ') {
						local33.append('n');
					} else if (local42 == 'ß') {
						local33.append("b");
					} else if (local42 == ' ' || local42 == ' ') {
						local33.append('_');
					} else {
						local33.append(Character.toLowerCase(local42));
					}
				}
			}
		}
		if (local33.length() == 0) {
			return null;
		} else {
			return local33.toString();
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method3760() {
		for (@Pc(10) Class1_Sub3_Sub19 local10 = (Class1_Sub3_Sub19) Static315.aClass26_61.method666(); local10 != null; local10 = (Class1_Sub3_Sub19) Static315.aClass26_61.method672()) {
			@Pc(19) Class2_Sub2 local19 = local10.aClass2_Sub2_1;
			if (Static185.anInt4085 != local19.anInt583 || Static133.anInt3061 > local19.anInt584) {
				local10.method4767();
			} else if (local19.anInt576 <= Static133.anInt3061) {
				if (local19.anInt569 > 0) {
					@Pc(49) Class2_Sub4_Sub1 local49 = Static105.aClass2_Sub4_Sub1Array1[local19.anInt569 - 1];
					if (local49 != null && local49.anInt2846 >= 0 && local49.anInt2846 < 13312 && local49.anInt2794 >= 0 && local49.anInt2794 < 13312) {
						local19.method454(local49.anInt2846, Static133.anInt3061, Static93.method1576(local49.anInt2794, local49.anInt2846, local19.anInt583) - local19.anInt582, local49.anInt2794);
					}
				}
				if (local19.anInt569 < 0) {
					@Pc(101) int local101 = -local19.anInt569 - 1;
					@Pc(108) Class2_Sub4_Sub2 local108;
					if (Static62.anInt1348 == local101) {
						local108 = Static56.aClass2_Sub4_Sub2_1;
					} else {
						local108 = Static155.aClass2_Sub4_Sub2Array1[local101];
					}
					if (local108 != null && local108.anInt2846 >= 0 && local108.anInt2846 < 13312 && local108.anInt2794 >= 0 && local108.anInt2794 < 13312) {
						local19.method454(local108.anInt2846, Static133.anInt3061, Static93.method1576(local108.anInt2794, local108.anInt2846, local19.anInt583) - local19.anInt582, local108.anInt2794);
					}
				}
				local19.method456(Static286.anInt5740);
				Static114.method1842(Static185.anInt4085, (int) local19.aDouble7, (int) local19.aDouble6, (int) local19.aDouble2, 60, local19, local19.anInt585, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public static void method3761() {
		Static292.aClass89_49.method2265();
		Static54.aClass89_10.method2265();
		Static207.aClass89_30.method2265();
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)Z")
	public static boolean method3762() {
		try {
			return Static262.method4009();
		} catch (@Pc(14) IOException local14) {
			Static9.method298();
			return true;
		} catch (@Pc(19) Exception local19) {
			@Pc(60) String local60 = "T2 - " + Static281.anInt2783 + "," + Static124.anInt2710 + "," + Static148.anInt3326 + " - " + Static188.anInt4164 + "," + (Static56.aClass2_Sub4_Sub2_1.anIntArray283[0] + Static159.anInt3527) + "," + (Static217.anInt4673 + Static56.aClass2_Sub4_Sub2_1.anIntArray286[0]) + " - ";
			for (@Pc(62) int local62 = 0; local62 < Static188.anInt4164 && local62 < 50; local62++) {
				local60 = local60 + Static140.aClass1_Sub14_Sub1_2.aByteArray55[local62] + ",";
			}
			Static66.method3525(local19, local60);
			Static170.method2760();
			return true;
		}
	}
}
