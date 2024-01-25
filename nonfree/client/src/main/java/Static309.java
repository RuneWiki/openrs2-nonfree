import java.io.IOException;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "Lclient!wo;")
	public static Class216 aClass216_92;

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "Lclient!wo;")
	public static Class216 aClass216_93;

	@OriginalMember(owner = "client!tm", name = "A", descriptor = "[Lclient!qk;")
	public static Class1_Sub30_Sub1[] aClass1_Sub30_Sub1Array2;

	@OriginalMember(owner = "client!tm", name = "C", descriptor = "I")
	public static int anInt6065;

	@OriginalMember(owner = "client!tm", name = "m", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger2 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "[I")
	public static final int[] anIntArray497 = new int[] { 0, 64, 128, 128, 128, 64, 0, 0, 32, 64, 32, 96, 64 };

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_171 = new Class34("glow2:", "leuchten2:", "brillant2:", "brilho2:");

	@OriginalMember(owner = "client!tm", name = "x", descriptor = "I")
	public static int anInt6063 = 0;

	@OriginalMember(owner = "client!tm", name = "z", descriptor = "Ljava/lang/String;")
	public static String aString60 = null;

	@OriginalMember(owner = "client!tm", name = "B", descriptor = "I")
	public static int anInt6064 = 2;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZLclient!wo;ILclient!wo;I)V")
	public static void method5162(@OriginalArg(1) Class216 arg0, @OriginalArg(3) Class216 arg1, @OriginalArg(4) int arg2) {
		Static327.aClass216_94 = arg0;
		Static137.aBoolean289 = true;
		Static259.aClass216_46 = arg1;
		Static238.anInt4924 = arg2;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Z")
	public static boolean method5163() {
		try {
			return Static258.method4648();
		} catch (@Pc(17) IOException local17) {
			Static198.method886();
			return true;
		} catch (@Pc(22) Exception local22) {
			@Pc(63) String local63 = "T2 - " + Static74.anInt1958 + "," + Static53.anInt1593 + "," + Static5.anInt197 + " - " + Static85.anInt5393 + "," + (Static234.anInt4783 + Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0]) + "," + (Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] + Static32.anInt2224) + " - ";
			for (@Pc(65) int local65 = 0; Static85.anInt5393 > local65 && local65 < 50; local65++) {
				local63 = local63 + Static311.aClass1_Sub8_Sub1_8.aByteArray81[local65] + ",";
			}
			Static109.method2355(local63, local22);
			Static24.method667();
			return true;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ICLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method5164(@OriginalArg(1) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static356.method5682(arg1, arg0);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(28) int local28 = 0; local28 < local10; local28++) {
			@Pc(32) int local32;
			for (local32 = local19; arg0 != arg1.charAt(local32); local32++) {
			}
			local15[local17++] = arg1.substring(local19, local32);
			local19 = local32 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Ljava/lang/String;Z)[B")
	public static byte[] method5167(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) byte[] local11 = new byte[local8];
		for (@Pc(18) int local18 = 0; local18 < local8; local18++) {
			@Pc(24) char local24 = arg0.charAt(local18);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				local11[local18] = (byte) local24;
			} else if (local24 == '€') {
				local11[local18] = -128;
			} else if (local24 == '‚') {
				local11[local18] = -126;
			} else if (local24 == 'ƒ') {
				local11[local18] = -125;
			} else if (local24 == '„') {
				local11[local18] = -124;
			} else if (local24 == '…') {
				local11[local18] = -123;
			} else if (local24 == '†') {
				local11[local18] = -122;
			} else if (local24 == '‡') {
				local11[local18] = -121;
			} else if (local24 == 'ˆ') {
				local11[local18] = -120;
			} else if (local24 == '‰') {
				local11[local18] = -119;
			} else if (local24 == 'Š') {
				local11[local18] = -118;
			} else if (local24 == '‹') {
				local11[local18] = -117;
			} else if (local24 == 'Œ') {
				local11[local18] = -116;
			} else if (local24 == 'Ž') {
				local11[local18] = -114;
			} else if (local24 == '‘') {
				local11[local18] = -111;
			} else if (local24 == '’') {
				local11[local18] = -110;
			} else if (local24 == '“') {
				local11[local18] = -109;
			} else if (local24 == '”') {
				local11[local18] = -108;
			} else if (local24 == '•') {
				local11[local18] = -107;
			} else if (local24 == '–') {
				local11[local18] = -106;
			} else if (local24 == '—') {
				local11[local18] = -105;
			} else if (local24 == '˜') {
				local11[local18] = -104;
			} else if (local24 == '™') {
				local11[local18] = -103;
			} else if (local24 == 'š') {
				local11[local18] = -102;
			} else if (local24 == '›') {
				local11[local18] = -101;
			} else if (local24 == 'œ') {
				local11[local18] = -100;
			} else if (local24 == 'ž') {
				local11[local18] = -98;
			} else if (local24 == 'Ÿ') {
				local11[local18] = -97;
			} else {
				local11[local18] = 63;
			}
		}
		return local11;
	}
}
