import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!gda", name = "t", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_61 = new Class126(80, -1);

	@OriginalMember(owner = "client!gda", name = "x", descriptor = "Lclient!em;")
	public static final Class105 aClass105_6 = new Class105();

	@OriginalMember(owner = "client!gda", name = "y", descriptor = "Z")
	public static boolean aBoolean282 = false;

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIILclient!ha;IBI)Lclient!ka;")
	public static Class28 method3049(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class16 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) long local6 = (long) arg2;
		@Pc(12) Class28 local12 = (Class28) Static554.aClass279_45.method6631(local6);
		if (local12 == null) {
			@Pc(22) Class73 local22 = Static573.method7744(arg2, Static21.aClass143_5);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt2049 < 13) {
				local22.method1895();
			}
			local12 = arg3.method8137(local22, 2055, Static224.anInt4082, 64, 768);
			Static554.aClass279_45.method6635(local12, local6);
		}
		local12 = local12.method6900((byte) 2, 2055, true);
		if (arg0 != 0) {
			local12.a(arg0);
		}
		if (arg4 != 0) {
			local12.FA(arg4);
		}
		if (arg5 != 0) {
			local12.VA(arg5);
		}
		if (arg1 != 0) {
			local12.H(0, arg1, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(III)Z")
	public static boolean method3051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && arg1 < Static338.aByteArrayArrayArray13[1].length && arg0 < Static338.aByteArrayArrayArray13[1][arg1].length) {
			return (Static338.aByteArrayArrayArray13[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)[B")
	public static byte[] method3052(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub6_Sub21 local12 = (Class3_Sub6_Sub21) Static356.aClass30_3.method1092((long) arg0);
		if (local12 == null) {
			@Pc(17) byte[] local17 = new byte[512];
			@Pc(23) Random local23 = new Random((long) arg0);
			for (@Pc(25) int local25 = 0; local25 < 255; local25++) {
				local17[local25] = (byte) local25;
			}
			for (@Pc(38) int local38 = 0; local38 < 255; local38++) {
				@Pc(45) int local45 = 255 - local38;
				@Pc(50) int local50 = Static610.method8052(local45, local23);
				@Pc(54) byte local54 = local17[local50];
				local17[local50] = local17[local45];
				local17[local45] = local17[511 - local38] = local54;
			}
			local12 = new Class3_Sub6_Sub21(local17);
			Static356.aClass30_3.method1094(local12, (long) arg0);
		}
		return local12.aByteArray106;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IIIIIII)V")
	public static void method3053(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Class70[] local12 = Static110.aClass70Array1;
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(20) Class70 local20 = local12[local14];
			if (local20 != null && local20.anInt2023 == 2) {
				Static38.method1147(local20.anInt2014 * 2, arg3 >> 1, local20.anInt2017, local20.anInt2022, arg2 >> 1, local20.anInt2018);
				if (Static109.anIntArray149[0] > -1 && Static621.anInt9665 % 20 < 10) {
					@Pc(65) Class102 local65 = Static491.aClass102Array23[local20.anInt2024];
					@Pc(73) int local73 = arg1 + Static109.anIntArray149[0] - 12;
					@Pc(81) int local81 = Static109.anIntArray149[1] + arg0 - 28;
					local65.method6961(local73, local81);
					Static120.method2177(local73, local73 + local65.method6951(), local81, local81 + local65.method6958());
				}
			}
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(BI)V")
	public static void method3054(@OriginalArg(1) int arg0) {
		if (Static368.method5461(arg0)) {
			Static601.method8005(-1, Static562.aClass208ArrayArray3[arg0]);
		}
	}
}
