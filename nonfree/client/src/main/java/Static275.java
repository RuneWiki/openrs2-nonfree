import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
	public static int anInt5246;

	@OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
	public static int anInt5240 = 0;

	@OriginalMember(owner = "client!rd", name = "x", descriptor = "S")
	public static short aShort72 = 32767;

	@OriginalMember(owner = "client!rd", name = "B", descriptor = "I")
	public static int anInt5244 = 100;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "[I")
	public static final int[] anIntArray475 = new int[50];

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
	public static void method4675() {
		for (@Pc(3) int local3 = 0; local3 < Static222.anInt4457; local3++) {
			@Pc(9) int local9 = Static116.anIntArray227[local3];
			@Pc(13) Class10_Sub3_Sub3_Sub2 local13 = Static29.aClass10_Sub3_Sub3_Sub2Array3[local9];
			@Pc(17) int local17 = Static30.aClass14_Sub4_Sub2_1.method2548();
			if ((local17 & 0x2) != 0) {
				local17 += Static30.aClass14_Sub4_Sub2_1.method2548() << 8;
			}
			Static112.method2400(local13, local9, local17);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBII)Z")
	public static boolean method4676(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(17) Interface7 local17 = (Interface7) Static242.method4277(arg1, arg0, arg2);
		@Pc(19) boolean local19 = true;
		if (local17 != null) {
			local19 = Static213.method3833(local17) & true;
		}
		local17 = (Interface7) Static263.method4514(arg1, arg0, arg2, up.class);
		if (local17 != null) {
			local19 &= Static213.method3833(local17);
		}
		local17 = (Interface7) Static274.method4660(arg1, arg0, arg2);
		if (local17 != null) {
			local19 &= Static213.method3833(local17);
		}
		return local19;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIII)V")
	public static void method4677(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static13.anInt2444 = arg1;
		Static341.anInt6533 = arg0;
		Static17.anInt351 = arg3;
		Static18.anInt378 = arg2;
		Static162.anInt3405 = arg4;
		if (Static18.anInt378 >= 100) {
			@Pc(24) int local24 = Static341.anInt6533 * 128 + 64;
			@Pc(30) int local30 = Static162.anInt3405 * 128 + 64;
			@Pc(39) int local39 = Static279.method4730(Static219.anInt4400, local24, local30) - Static13.anInt2444;
			@Pc(44) int local44 = local24 - Static124.anInt2717;
			@Pc(49) int local49 = local39 - Static103.anInt2301;
			@Pc(53) int local53 = local30 - Static141.anInt2986;
			@Pc(65) int local65 = (int) Math.sqrt((double) (local44 * local44 + local53 * local53));
			Static112.anInt2486 = (int) (Math.atan2((double) local49, (double) local65) * 2607.5945876176133D) & 0x3FFF;
			Static249.anInt4824 = (int) (-2607.5945876176133D * Math.atan2((double) local44, (double) local53)) & 0x3FFF;
			if (Static112.anInt2486 < 1024) {
				Static112.anInt2486 = 1024;
			}
			if (Static112.anInt2486 > 3072) {
				Static112.anInt2486 = 3072;
			}
		}
		Static205.anInt4115 = 2;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZIZI)V")
	public static void method4678(@OriginalArg(2) boolean arg0) {
		Static111.aBoolean172 = arg0;
		Static281.anInt5354 = 2;
		Static223.anInt5818 = 22050;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(Z)Z")
	public static boolean method4679(@OriginalArg(0) boolean arg0) {
		for (@Pc(1) int local1 = Static154.anInt3269; local1 < Static125.anInt2719; local1++) {
			@Pc(6) Class213[][] local6 = Static98.aClass213ArrayArrayArray2[local1];
			for (@Pc(9) int local9 = -Static312.anInt6032; local9 <= 0; local9++) {
				@Pc(14) int local14 = Static93.anInt2184 + local9;
				@Pc(18) int local18 = Static93.anInt2184 - local9;
				if (local14 >= Static239.anInt6274 || local18 < Static86.anInt2090) {
					for (@Pc(27) int local27 = -Static312.anInt6032; local27 <= 0; local27++) {
						@Pc(32) int local32 = Static18.anInt373 + local27;
						@Pc(36) int local36 = Static18.anInt373 - local27;
						@Pc(48) Class213 local48;
						if (local14 >= Static239.anInt6274) {
							if (local32 >= Static38.anInt906) {
								local48 = local6[local14][local32];
								if (local48 != null && local48.aBoolean440) {
									Static323.aBoolean51 = arg0;
									Static295.aClass57_1.method2405(local48);
									Static295.aClass57_1.method2407();
								}
							}
							if (local36 < Static54.anInt1340) {
								local48 = local6[local14][local36];
								if (local48 != null && local48.aBoolean440) {
									Static323.aBoolean51 = arg0;
									Static295.aClass57_1.method2405(local48);
									Static295.aClass57_1.method2407();
								}
							}
						}
						if (local18 < Static86.anInt2090) {
							if (local32 >= Static38.anInt906) {
								local48 = local6[local18][local32];
								if (local48 != null && local48.aBoolean440) {
									Static323.aBoolean51 = arg0;
									Static295.aClass57_1.method2405(local48);
									Static295.aClass57_1.method2407();
								}
							}
							if (local36 < Static54.anInt1340) {
								local48 = local6[local18][local36];
								if (local48 != null && local48.aBoolean440) {
									Static323.aBoolean51 = arg0;
									Static295.aClass57_1.method2405(local48);
									Static295.aClass57_1.method2407();
								}
							}
						}
						if (Static83.anInt6472 == 0) {
							if (Static347.aBoolean442) {
								Static295.aClass57_1.method2403(24);
							}
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
	public static String method4680(@OriginalArg(0) Throwable arg0) throws IOException {
		@Pc(24) String local24;
		if (arg0 instanceof RuntimeException_Sub1) {
			@Pc(11) RuntimeException_Sub1 local11 = (RuntimeException_Sub1) arg0;
			arg0 = local11.aThrowable1;
			local24 = local11.aString166 + " | ";
		} else {
			local24 = "";
		}
		@Pc(32) StringWriter local32 = new StringWriter();
		@Pc(37) PrintWriter local37 = new PrintWriter(local32);
		arg0.printStackTrace(local37);
		local37.close();
		@Pc(45) String local45 = local32.toString();
		@Pc(58) BufferedReader local58 = new BufferedReader(new StringReader(local45));
		@Pc(61) String local61 = local58.readLine();
		while (true) {
			@Pc(64) String local64 = local58.readLine();
			if (local64 == null) {
				return local24 + "| " + local61;
			}
			@Pc(70) int local70 = local64.indexOf(40);
			@Pc(77) int local77 = local64.indexOf(41, local70 + 1);
			@Pc(85) String local85;
			if (local70 == -1) {
				local85 = local64;
			} else {
				local85 = local64.substring(0, local70);
			}
			local85 = local85.trim();
			local85 = local85.substring(local85.lastIndexOf(32) + 1);
			local85 = local85.substring(local85.lastIndexOf(9) + 1);
			local24 = local24 + local85;
			if (local70 != -1 && local77 != -1) {
				@Pc(130) int local130 = local64.indexOf(".java:", local70);
				if (local130 >= 0) {
					local24 = local24 + local64.substring(local130 + 5, local77);
				}
			}
			local24 = local24 + ' ';
		}
	}
}
