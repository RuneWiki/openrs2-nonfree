import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static401 {

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(CI)C")
	public static char method5785(@OriginalArg(0) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ae;Lclient!vt;I)V")
	public static void method5787(@OriginalArg(0) Class8 arg0, @OriginalArg(1) Class380 arg1) {
		Static645.aClass8_145 = arg0;
		Static628.aString138 = "";
		Static135.aClass380_3 = arg1;
		if (Class344.aString133.startsWith("win")) {
			Static628.aString138 = Static628.aString138 + "windows/";
		} else if (Class344.aString133.startsWith("linux")) {
			Static628.aString138 = Static628.aString138 + "linux/";
		} else if (Class344.aString133.startsWith("mac")) {
			Static628.aString138 = Static628.aString138 + "macos/";
		}
		if (Static135.aClass380_3.aBoolean728) {
			Static628.aString138 = Static628.aString138 + "msjava/";
		} else if (Class344.aString134.startsWith("amd64") || Class344.aString134.startsWith("x86_64")) {
			Static628.aString138 = Static628.aString138 + "x86_64/";
		} else if (Class344.aString134.startsWith("i386") || Class344.aString134.startsWith("i486") || Class344.aString134.startsWith("i586") || Class344.aString134.startsWith("x86")) {
			Static628.aString138 = Static628.aString138 + "x86/";
		} else if (Class344.aString134.startsWith("ppc")) {
			Static628.aString138 = Static628.aString138 + "ppc/";
		} else {
			Static628.aString138 = Static628.aString138 + "universal/";
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(III)Lclient!wc;")
	public static Class2_Sub1_Sub2 method5788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class351 local7 = Static441.aClass351ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub1_Sub2_2;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Lclient!ul;IZI)Lclient!raa;")
	public static Class6_Sub4_Sub16 method5789(@OriginalArg(0) Class357 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg2 << 10 | arg0.anInt9853;
		@Pc(19) Class6_Sub4_Sub16 local19 = (Class6_Sub4_Sub16) Static459.aClass189_5.method4279((long) local10 << 16);
		if (local19 != null) {
			return local19;
		}
		@Pc(31) byte[] local31 = Static146.aClass8_75.method267(Static146.aClass8_75.method254(local10));
		if (local31 == null) {
			local10 = arg0.anInt9853 | arg1 + 65536 << 10;
			local19 = (Class6_Sub4_Sub16) Static459.aClass189_5.method4279((long) local10 << 16);
			if (local19 != null) {
				return local19;
			}
			local31 = Static146.aClass8_75.method267(Static146.aClass8_75.method254(local10));
			if (local31 == null) {
				local10 = arg0.anInt9853 | 0x3FFFC00;
				local19 = (Class6_Sub4_Sub16) Static459.aClass189_5.method4279((long) local10 << 16);
				if (local19 != null) {
					return local19;
				}
				local31 = Static146.aClass8_75.method267(Static146.aClass8_75.method254(local10));
				if (local31 == null) {
					return null;
				} else if (local31.length <= 1) {
					return null;
				} else {
					try {
						local19 = Static340.method4995(local31);
					} catch (@Pc(194) Exception local194) {
						throw new RuntimeException(local194.getMessage() + " S: " + local10);
					}
					local19.aClass357_24 = arg0;
					Static459.aClass189_5.method4278(local19, (long) local10 << 16);
					return local19;
				}
			} else if (local31.length <= 1) {
				return null;
			} else {
				try {
					local19 = Static340.method4995(local31);
				} catch (@Pc(126) Exception local126) {
					throw new RuntimeException(local126.getMessage() + " S: " + local10);
				}
				local19.aClass357_24 = arg0;
				Static459.aClass189_5.method4278(local19, (long) local10 << 16);
				return local19;
			}
		} else if (local31.length <= 1) {
			return null;
		} else {
			try {
				local19 = Static340.method4995(local31);
			} catch (@Pc(47) Exception local47) {
				throw new RuntimeException(local47.getMessage() + " S: " + local10);
			}
			local19.aClass357_24 = arg0;
			Static459.aClass189_5.method4278(local19, (long) local10 << 16);
			return local19;
		}
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5791(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6) {
		Static527.aClass379Array3[Static33.anInt812++] = new Class379(4, arg4, arg5, arg1, arg1, arg5, arg6, arg0, arg0, arg6, arg3, arg3, arg2, arg2);
	}
}
