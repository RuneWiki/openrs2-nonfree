import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!pfa", name = "p", descriptor = "I")
	public static int anInt7690;

	@OriginalMember(owner = "client!pfa", name = "x", descriptor = "Lclient!fs;")
	public static Class134 aClass134_30;

	@OriginalMember(owner = "client!pfa", name = "s", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger5 = new BigInteger("10001", 16);

	@OriginalMember(owner = "client!pfa", name = "u", descriptor = "I")
	public static int anInt7686 = -1;

	@OriginalMember(owner = "client!pfa", name = "o", descriptor = "Lclient!el;")
	public static final Class109 aClass109_165 = new Class109(127, 1);

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray57 = new String[200];

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILclient!cn;)Lclient!cn;")
	public static Class73 method6636(@OriginalArg(1) Class73 arg0) {
		if (arg0.anInt1410 != -1) {
			return Static259.method3831(arg0.anInt1410);
		}
		@Pc(29) int local29 = arg0.anInt1388 >>> 16;
		@Pc(34) Class132 local34 = new Class132(Static549.aClass291_37);
		for (@Pc(39) Class5_Sub49 local39 = (Class5_Sub49) local34.method2588(); local39 != null; local39 = (Class5_Sub49) local34.method2586()) {
			if (local39.anInt9322 == local29) {
				return Static259.method3831((int) local39.aLong314);
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Z[BI)I")
	public static int method6637(@OriginalArg(0) String arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = arg0.length();
		for (@Pc(23) int local23 = 0; local23 < local10; local23 += 4) {
			@Pc(33) int local33 = Static651.method9036(arg0.charAt(local23));
			@Pc(48) int local48 = local10 <= local23 + 1 ? -1 : Static651.method9036(arg0.charAt(local23 + 1));
			@Pc(64) int local64 = local10 <= local23 + 2 ? -1 : Static651.method9036(arg0.charAt(local23 + 2));
			@Pc(84) int local84 = local10 > local23 + 3 ? Static651.method9036(arg0.charAt(local23 + 3)) : -1;
			arg1[arg2++] = (byte) (local33 << 2 | local48 >>> 4);
			if (local64 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local48 & 0xF) << 4 | local64 >>> 2);
			if (local84 == -1) {
				break;
			}
			arg1[arg2++] = (byte) ((local64 & 0x3) << 6 | local84);
		}
		return arg2;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BLclient!eu;)I")
	public static int method6638(@OriginalArg(1) Class114 arg0) {
		if (arg0 == Static396.aClass114_13) {
			return 6407;
		} else if (arg0 == Static412.aClass114_17) {
			return 6408;
		} else if (arg0 == Static78.aClass114_19) {
			return 6406;
		} else if (Static402.aClass114_14 == arg0) {
			return 6409;
		} else if (Static560.aClass114_18 == arg0) {
			return 6410;
		} else if (Static104.aClass114_6 == arg0) {
			return 6145;
		} else {
			throw new IllegalStateException();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IILclient!ha;Z)Lclient!daa;")
	public static Class81 method6639(@OriginalArg(1) int arg0, @OriginalArg(2) Class57 arg1, @OriginalArg(3) boolean arg2) {
		if (arg0 == -1) {
			return null;
		}
		if (Static351.anIntArray339 != null) {
			for (@Pc(15) int local15 = 0; local15 < Static351.anIntArray339.length; local15++) {
				if (arg0 == Static351.anIntArray339[local15]) {
					return Static344.aClass81Array1[local15];
				}
			}
		}
		@Pc(49) Class81 local49 = (Class81) Static280.aClass391_25.method9275((long) arg0);
		if (local49 != null) {
			if (arg2 && local49.aClass224_2 == null) {
				@Pc(72) Class224 local72 = Static439.method6500(arg0, Static367.aClass208_140);
				if (local72 == null) {
					return null;
				}
				local49.aClass224_2 = local72;
			}
			return local49;
		}
		@Pc(86) Class173[] local86 = Static684.method3657(Static341.aClass208_75, arg0);
		if (local86 == null) {
			return null;
		}
		@Pc(98) Class224 local98 = Static439.method6500(arg0, Static367.aClass208_140);
		if (local98 == null) {
			return null;
		}
		if (arg2) {
			local49 = new Class81(arg1.method7708(local98, local86), local98);
		} else {
			local49 = new Class81(arg1.method7708(local98, local86));
		}
		Static280.aClass391_25.method9273((long) arg0, local49, 1);
		return local49;
	}
}
