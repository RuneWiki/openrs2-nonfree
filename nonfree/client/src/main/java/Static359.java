import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!lr", name = "m", descriptor = "Lclient!uda;")
	public static Class14_Sub2_Sub20 aClass14_Sub2_Sub20_2;

	@OriginalMember(owner = "client!lr", name = "o", descriptor = "[[Lclient!qga;")
	public static Class299[][] aClass299ArrayArray2;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIIII)V")
	public static void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) Class14_Sub2_Sub9 local9 = Static499.method7527((long) arg1, 10);
		local9.method4004();
		local9.anInt4599 = arg3;
		local9.anInt4592 = arg0;
		local9.anInt4595 = arg2;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/lang/String;B)[B")
	public static byte[] method5455(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		@Pc(15) byte[] local15 = new byte[local6];
		for (@Pc(17) int local17 = 0; local17 < local6; local17++) {
			@Pc(22) char local22 = arg0.charAt(local17);
			if (local22 > '\u0000' && local22 < '\u0080' || !(local22 < ' ' || local22 > 'ÿ')) {
				local15[local17] = (byte) local22;
			} else if (local22 == '€') {
				local15[local17] = -128;
			} else if (local22 == '‚') {
				local15[local17] = -126;
			} else if (local22 == 'ƒ') {
				local15[local17] = -125;
			} else if (local22 == '„') {
				local15[local17] = -124;
			} else if (local22 == '…') {
				local15[local17] = -123;
			} else if (local22 == '†') {
				local15[local17] = -122;
			} else if (local22 == '‡') {
				local15[local17] = -121;
			} else if (local22 == 'ˆ') {
				local15[local17] = -120;
			} else if (local22 == '‰') {
				local15[local17] = -119;
			} else if (local22 == 'Š') {
				local15[local17] = -118;
			} else if (local22 == '‹') {
				local15[local17] = -117;
			} else if (local22 == 'Œ') {
				local15[local17] = -116;
			} else if (local22 == 'Ž') {
				local15[local17] = -114;
			} else if (local22 == '‘') {
				local15[local17] = -111;
			} else if (local22 == '’') {
				local15[local17] = -110;
			} else if (local22 == '“') {
				local15[local17] = -109;
			} else if (local22 == '”') {
				local15[local17] = -108;
			} else if (local22 == '•') {
				local15[local17] = -107;
			} else if (local22 == '–') {
				local15[local17] = -106;
			} else if (local22 == '—') {
				local15[local17] = -105;
			} else if (local22 == '˜') {
				local15[local17] = -104;
			} else if (local22 == '™') {
				local15[local17] = -103;
			} else if (local22 == 'š') {
				local15[local17] = -102;
			} else if (local22 == '›') {
				local15[local17] = -101;
			} else if (local22 == 'œ') {
				local15[local17] = -100;
			} else if (local22 == 'ž') {
				local15[local17] = -98;
			} else if (local22 == 'Ÿ') {
				local15[local17] = -97;
			} else {
				local15[local17] = 63;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	public static void method5456() throws Exception_Sub1 {
		if (Static18.anInt243 == 1) {
			Static22.aClass144_1.method6918(Static673.anInt10975, Static35.anInt549);
		} else {
			Static22.aClass144_1.method6918(0, 0);
		}
	}
}
