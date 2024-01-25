import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!qg", name = "C", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!qg", name = "w", descriptor = "Ljava/util/zip/CRC32;")
	public static final CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!qg", name = "D", descriptor = "Z")
	public static boolean aBoolean507 = false;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!wo;ILclient!tn;Lclient!wo;)V")
	public static void method4589(@OriginalArg(0) Class216 arg0, @OriginalArg(2) Interface6 arg1, @OriginalArg(3) Class216 arg2) {
		Static84.anInterface6_1 = arg1;
		Static146.aClass216_52 = arg0;
		Static227.aClass216_77 = arg2;
		if (Static227.aClass216_77 != null) {
			Static148.anInt3247 = Static227.aClass216_77.method5675(1);
		}
		if (Static146.aClass216_52 != null) {
			Static175.anInt3789 = Static146.aClass216_52.method5675(1);
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IILjava/lang/String;IIZI)V")
	public static void method4591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Class8_Sub1 local7 = new Class8_Sub1();
		local7.anInt277 = arg4;
		local7.anInt276 = arg3;
		local7.anInt271 = Static5.anInt208 + arg0;
		local7.anInt278 = arg5;
		local7.anInt272 = arg1;
		local7.aString1 = arg2;
		Static64.aClass217_2.method5678(local7);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lclient!bg;ILclient!nh;I)V")
	public static void method4592(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class143 arg2) {
		@Pc(13) Class1_Sub18 local13 = new Class1_Sub18();
		local13.anInt2594 = arg0.method4532();
		local13.anInt2593 = arg0.method4545();
		local13.anIntArray243 = new int[local13.anInt2594];
		local13.anIntArray242 = new int[local13.anInt2594];
		local13.aClass162Array1 = new Class162[local13.anInt2594];
		local13.aClass162Array2 = new Class162[local13.anInt2594];
		local13.anIntArray244 = new int[local13.anInt2594];
		local13.aByteArrayArrayArray4 = new byte[local13.anInt2594][][];
		for (@Pc(55) int local55 = 0; local55 < local13.anInt2594; local55++) {
			try {
				@Pc(61) int local61 = arg0.method4532();
				@Pc(78) String local78;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local78 = arg0.method4534();
					local82 = arg0.method4534();
					local84 = 0;
					if (local61 == 1) {
						local84 = arg0.method4545();
					}
					local13.anIntArray242[local55] = local61;
					local13.anIntArray243[local55] = local84;
					local13.aClass162Array2[local55] = arg2.method3910(Static90.method1961(local78), local82);
				} else if (local61 == 3 || local61 == 4) {
					local78 = arg0.method4534();
					local82 = arg0.method4534();
					local84 = arg0.method4532();
					@Pc(141) String[] local141 = new String[local84];
					for (@Pc(143) int local143 = 0; local143 < local84; local143++) {
						local141[local143] = arg0.method4534();
					}
					@Pc(162) byte[][] local162 = new byte[local84][];
					@Pc(175) int local175;
					if (local61 == 3) {
						for (@Pc(169) int local169 = 0; local169 < local84; local169++) {
							local175 = arg0.method4545();
							local162[local169] = new byte[local175];
							arg0.method4519(local175, local162[local169]);
						}
					}
					local13.anIntArray242[local55] = local61;
					@Pc(204) Class[] local204 = new Class[local84];
					for (local175 = 0; local175 < local84; local175++) {
						local204[local175] = Static90.method1961(local141[local175]);
					}
					local13.aClass162Array1[local55] = arg2.method3898(Static90.method1961(local78), local204, local82);
					local13.aByteArrayArrayArray4[local55] = local162;
				}
			} catch (@Pc(239) ClassNotFoundException local239) {
				local13.anIntArray244[local55] = -1;
			} catch (@Pc(246) SecurityException local246) {
				local13.anIntArray244[local55] = -2;
			} catch (@Pc(253) NullPointerException local253) {
				local13.anIntArray244[local55] = -3;
			} catch (@Pc(260) Exception local260) {
				local13.anIntArray244[local55] = -4;
			} catch (@Pc(267) Throwable local267) {
				local13.anIntArray244[local55] = -5;
			}
		}
		Static50.aClass16_4.method416(local13);
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(ZZIIZ)Lclient!wo;")
	public static Class216 method4594(@OriginalArg(1) boolean arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean arg2) {
		@Pc(5) Class166 local5 = null;
		if (Static167.aClass190_1 != null) {
			local5 = new Class166(arg1, Static167.aClass190_1, Static231.aClass190Array1[arg1], 1000000);
		}
		Static114.aClass51_Sub1Array4[arg1] = Static125.aClass163_1.method4343(arg1, local5, Static216.aClass166_2);
		if (arg2) {
			Static114.aClass51_Sub1Array4[arg1].method4868();
		}
		return new Class216(Static114.aClass51_Sub1Array4[arg1], arg0, 1);
	}
}
