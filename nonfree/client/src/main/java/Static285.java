import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!kq", name = "e", descriptor = "I")
	public static int anInt4886;

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_57 = new Class303(68, -1);

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!kq", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray111 = new int[128][128];

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Ljava/lang/String;")
	public static String aString33 = null;

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!pi;Lclient!np;BI)V")
	public static void method4233(@OriginalArg(0) Class258 arg0, @OriginalArg(1) Class3_Sub11 arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class3_Sub21 local14 = new Class3_Sub21();
		local14.anInt3426 = arg1.method5175();
		local14.anInt3425 = arg1.method5186();
		local14.aClass39Array2 = new Class39[local14.anInt3426];
		local14.aByteArrayArrayArray10 = new byte[local14.anInt3426][][];
		local14.aClass39Array1 = new Class39[local14.anInt3426];
		local14.anIntArray176 = new int[local14.anInt3426];
		local14.anIntArray175 = new int[local14.anInt3426];
		local14.anIntArray174 = new int[local14.anInt3426];
		for (@Pc(56) int local56 = 0; local56 < local14.anInt3426; local56++) {
			try {
				@Pc(62) int local62 = arg1.method5175();
				@Pc(77) String local77;
				@Pc(81) String local81;
				@Pc(83) int local83;
				if (local62 == 0 || local62 == 1 || local62 == 2) {
					local77 = arg1.method5181();
					local81 = arg1.method5181();
					local83 = 0;
					if (local62 == 1) {
						local83 = arg1.method5186();
					}
					local14.anIntArray176[local56] = local62;
					local14.anIntArray175[local56] = local83;
					local14.aClass39Array2[local56] = arg0.method5890(Static418.method5946(local77), local81);
				} else if (local62 == 3 || local62 == 4) {
					local77 = arg1.method5181();
					local81 = arg1.method5181();
					local83 = arg1.method5175();
					@Pc(140) String[] local140 = new String[local83];
					for (@Pc(142) int local142 = 0; local142 < local83; local142++) {
						local140[local142] = arg1.method5181();
					}
					@Pc(161) byte[][] local161 = new byte[local83][];
					@Pc(172) int local172;
					if (local62 == 3) {
						for (@Pc(166) int local166 = 0; local166 < local83; local166++) {
							local172 = arg1.method5186();
							local161[local166] = new byte[local172];
							arg1.method5183(local172, local161[local166]);
						}
					}
					local14.anIntArray176[local56] = local62;
					@Pc(197) Class[] local197 = new Class[local83];
					for (local172 = 0; local172 < local83; local172++) {
						local197[local172] = Static418.method5946(local140[local172]);
					}
					local14.aClass39Array1[local56] = arg0.method5883(Static418.method5946(local77), local81, local197);
					local14.aByteArrayArrayArray10[local56] = local161;
				}
			} catch (@Pc(232) ClassNotFoundException local232) {
				local14.anIntArray174[local56] = -1;
			} catch (@Pc(239) SecurityException local239) {
				local14.anIntArray174[local56] = -2;
			} catch (@Pc(246) NullPointerException local246) {
				local14.anIntArray174[local56] = -3;
			} catch (@Pc(253) Exception local253) {
				local14.anIntArray174[local56] = -4;
			} catch (@Pc(260) Throwable local260) {
				local14.anIntArray174[local56] = -5;
			}
		}
		Static307.aClass112_33.method3079(local14);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!tf;ZLclient!tf;Lclient!rda;Lclient!tf;)Z")
	public static boolean method4236(@OriginalArg(0) Class322 arg0, @OriginalArg(2) Class322 arg1, @OriginalArg(3) Class3_Sub4_Sub3 arg2, @OriginalArg(4) Class322 arg3) {
		Static323.aClass3_Sub4_Sub3_2 = arg2;
		Static535.aClass322_147 = arg1;
		Static274.aClass322_94 = arg3;
		Static91.aClass322_31 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(III)Z")
	public static boolean method4237(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x400) != 0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)Z")
	public static boolean method4239(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static322.method4682(arg0, arg1) & Static142.method2761(arg0, arg1);
	}
}
