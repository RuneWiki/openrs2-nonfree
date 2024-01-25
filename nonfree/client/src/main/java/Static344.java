import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!nca", name = "k", descriptor = "[Lclient!f;")
	public static Class10[] aClass10Array16;

	@OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
	public static int anInt6075;

	@OriginalMember(owner = "client!nca", name = "p", descriptor = "Z")
	public static boolean aBoolean436 = false;

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!ir;IIIII)V")
	public static void method5093(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static101.anInt2104) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static446.anInt7725) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static218.anInt4229 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class293 local62 = Static118.aClass293ArrayArrayArray14[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static20.aClass17Array1[local17].method6642(local23, local32) + Static20.aClass17Array1[local17].method6642(local23 + 1, local32) + Static20.aClass17Array1[local17].method6642(local23, local32 + 1) + Static20.aClass17Array1[local17].method6642(local23 + 1, local32 + 1)) / 4 - (Static20.aClass17Array1[arg1].method6642(arg2, arg3) + Static20.aClass17Array1[arg1].method6642(arg2 + 1, arg3) + Static20.aClass17Array1[arg1].method6642(arg2, arg3 + 1) + Static20.aClass17Array1[arg1].method6642(arg2 + 1, arg3 + 1)) / 4;
									@Pc(151) Class20_Sub2_Sub2 local151 = local62.aClass20_Sub2_Sub2_2;
									@Pc(154) Class20_Sub2_Sub2 local154 = local62.aClass20_Sub2_Sub2_1;
									if (local151 != null && local151.method7254()) {
										arg0.method7257((local32 - arg3) * Static47.anInt1239 + (1 - arg5) * Static159.anInt2896, local151, local1, local148, Static63.aClass12_5, (local23 - arg2) * Static47.anInt1239 + (1 - arg4) * Static159.anInt2896);
									}
									if (local154 != null && local154.method7254()) {
										arg0.method7257((local32 - arg3) * Static47.anInt1239 + (1 - arg5) * Static159.anInt2896, local154, local1, local148, Static63.aClass12_5, (local23 - arg2) * Static47.anInt1239 + (1 - arg4) * Static159.anInt2896);
									}
									for (@Pc(227) Class285 local227 = local62.aClass285_6; local227 != null; local227 = local227.aClass285_5) {
										@Pc(231) Class20_Sub2_Sub4 local231 = local227.aClass20_Sub2_Sub4_1;
										if (local231 != null && local231.method7254() && (local23 == local231.aShort100 || local23 == local3) && (local32 == local231.aShort97 || local32 == local11)) {
											@Pc(260) int local260 = local231.aShort98 + 1 - local231.aShort100;
											@Pc(268) int local268 = local231.aShort99 + 1 - local231.aShort97;
											arg0.method7257((local231.aShort97 - arg3) * Static47.anInt1239 + (local268 - arg5) * Static159.anInt2896, local231, local1, local148, Static63.aClass12_5, (local231.aShort100 - arg2) * Static47.anInt1239 + (local260 - arg4) * Static159.anInt2896);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIB)Z")
	public static boolean method5094(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(BB)C")
	public static char method5095(@OriginalArg(0) byte arg0) {
		@Pc(7) int local7 = arg0 & 0xFF;
		if (local7 == 0) {
			throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(local7, 16) + " provided");
		}
		if (local7 >= 128 && local7 < 160) {
			@Pc(43) char local43 = Static355.aCharArray6[local7 - 128];
			if (local43 == '\u0000') {
				local43 = '?';
			}
			local7 = local43;
		}
		return (char) local7;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)V")
	public static void method5098(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(9, arg1);
		local8.method491();
		local8.anInt545 = arg0;
		local8.anInt548 = arg2;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5101(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local11 < local14 && Static19.method539(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static19.method539(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(44) int local44 = local14 - local11;
		if (local44 < 1 || local44 > 12) {
			return null;
		}
		@Pc(59) StringBuffer local59 = new StringBuffer(local44);
		for (@Pc(61) int local61 = local11; local61 < local14; local61++) {
			@Pc(67) char local67 = arg0.charAt(local61);
			if (Static74.method1610(local67)) {
				@Pc(77) char local77 = Static122.method2100(local67);
				if (local77 != '\u0000') {
					local59.append(local77);
				}
			}
		}
		if (local59.length() == 0) {
			return null;
		} else {
			return local59.toString();
		}
	}
}
