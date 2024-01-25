import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mg", name = "k", descriptor = "Lclient!od;")
	public static Class147 aClass147_3;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString124 = "Loading defaults - ";

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZC)B")
	public static byte method3006(@OriginalArg(1) char arg0) {
		@Pc(28) byte local28;
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			local28 = (byte) arg0;
		} else if (arg0 == '€') {
			local28 = -128;
		} else if (arg0 == '‚') {
			local28 = -126;
		} else if (arg0 == 'ƒ') {
			local28 = -125;
		} else if (arg0 == '„') {
			local28 = -124;
		} else if (arg0 == '…') {
			local28 = -123;
		} else if (arg0 == '†') {
			local28 = -122;
		} else if (arg0 == '‡') {
			local28 = -121;
		} else if (arg0 == 'ˆ') {
			local28 = -120;
		} else if (arg0 == '‰') {
			local28 = -119;
		} else if (arg0 == 'Š') {
			local28 = -118;
		} else if (arg0 == '‹') {
			local28 = -117;
		} else if (arg0 == 'Œ') {
			local28 = -116;
		} else if (arg0 == 'Ž') {
			local28 = -114;
		} else if (arg0 == '‘') {
			local28 = -111;
		} else if (arg0 == '’') {
			local28 = -110;
		} else if (arg0 == '“') {
			local28 = -109;
		} else if (arg0 == '”') {
			local28 = -108;
		} else if (arg0 == '•') {
			local28 = -107;
		} else if (arg0 == '–') {
			local28 = -106;
		} else if (arg0 == '—') {
			local28 = -105;
		} else if (arg0 == '˜') {
			local28 = -104;
		} else if (arg0 == '™') {
			local28 = -103;
		} else if (arg0 == 'š') {
			local28 = -102;
		} else if (arg0 == '›') {
			local28 = -101;
		} else if (arg0 == 'œ') {
			local28 = -100;
		} else if (arg0 == 'ž') {
			local28 = -98;
		} else if (arg0 == 'Ÿ') {
			local28 = -97;
		} else {
			local28 = 63;
		}
		return local28;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
	public static void method3007(@OriginalArg(1) int arg0) {
		@Pc(15) Class1_Sub1_Sub2 local15 = Static42.method1000(1, arg0);
		local15.method167();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIII)Lclient!vf;")
	public static Class1_Sub1_Sub20 method3010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) int local16 = arg0 << 8 | arg2;
		@Pc(25) Class1_Sub1_Sub20 local25 = (Class1_Sub1_Sub20) Static91.aClass156_6.method4258((long) local16 << 16);
		if (local25 != null) {
			return local25;
		}
		@Pc(37) byte[] local37 = Static274.aClass165_82.method4492(Static274.aClass165_82.method4475(local16));
		if (local37 == null) {
			local16 = arg2 | arg1 + 65536 << 8;
			local25 = (Class1_Sub1_Sub20) Static91.aClass156_6.method4258((long) local16 << 16);
			if (local25 != null) {
				return local25;
			}
			local37 = Static274.aClass165_82.method4492(Static274.aClass165_82.method4475(local16));
			if (local37 == null) {
				local16 = arg2 | 0xFFFF00;
				local25 = (Class1_Sub1_Sub20) Static91.aClass156_6.method4258((long) local16 << 16);
				if (local25 != null) {
					return local25;
				}
				local37 = Static274.aClass165_82.method4492(Static274.aClass165_82.method4475(local16));
				if (local37 == null) {
					return null;
				} else if (local37.length <= 1) {
					return null;
				} else {
					local25 = Static23.method589(local37);
					local25.anInt6271 = arg2;
					Static91.aClass156_6.method4256(local25, (long) local16 << 16);
					return local25;
				}
			} else if (local37.length <= 1) {
				return null;
			} else {
				local25 = Static23.method589(local37);
				local25.anInt6271 = arg2;
				Static91.aClass156_6.method4256(local25, (long) local16 << 16);
				return local25;
			}
		} else if (local37.length <= 1) {
			return null;
		} else {
			local25 = Static23.method589(local37);
			local25.anInt6271 = arg2;
			Static91.aClass156_6.method4256(local25, (long) local16 << 16);
			return local25;
		}
	}
}
