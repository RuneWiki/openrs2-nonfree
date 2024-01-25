import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static471 {

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "I")
	public static int anInt8084;

	@OriginalMember(owner = "client!qt", name = "f", descriptor = "I")
	public static int anInt8086;

	@OriginalMember(owner = "client!qt", name = "d", descriptor = "[I")
	public static final int[] anIntArray551 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(III)Z")
	public static boolean method6779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static602.method8257(arg0, arg1) & Static384.method5787(arg1, arg0);
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(II)Lclient!fe;")
	public static Class106 method6780(@OriginalArg(0) int arg0) {
		@Pc(15) Class106 local15 = (Class106) Static81.aClass233_8.method5669((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static406.aClass97_152.method2545(arg0, 0);
		local15 = new Class106();
		if (local25 != null) {
			local15.method2819(new Class2_Sub34(local25));
		}
		local15.method2816();
		Static81.aClass233_8.method5662(local15, (long) arg0);
		return local15;
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(I)Lclient!cq;")
	public static Class2_Sub13 method6781() {
		@Pc(5) Class44 local5 = null;
		@Pc(11) Class2_Sub13 local11 = new Class2_Sub13(Static499.aClass63_15, 0);
		try {
			@Pc(17) Class26 local17 = Static375.aClass359_4.method8260("");
			while (local17.anInt762 == 0) {
				Static57.method1062(1L);
			}
			if (local17.anInt762 == 1) {
				local5 = (Class44) local17.anObject3;
				@Pc(40) byte[] local40 = new byte[(int) local5.method957()];
				@Pc(54) int local54;
				for (@Pc(42) int local42 = 0; local42 < local40.length; local42 += local54) {
					local54 = local5.method954(local40.length - local42, local42, local40);
					if (local54 == -1) {
						throw new IOException("EOF");
					}
				}
				local11 = new Class2_Sub13(new Class2_Sub34(local40), Static499.aClass63_15, 0);
			}
		} catch (@Pc(83) Exception local83) {
		}
		try {
			if (local5 != null) {
				local5.method960();
			}
		} catch (@Pc(95) Exception local95) {
		}
		return local11;
	}

	@OriginalMember(owner = "client!qt", name = "b", descriptor = "(III)Z")
	public static boolean method6782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 0 && arg0 >= 0 && Static244.aByteArrayArrayArray9[1].length > arg1 && arg0 < Static244.aByteArrayArrayArray9[1][arg1].length) {
			return (Static244.aByteArrayArrayArray9[1][arg1][arg0] & 0x2) != 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!qt", name = "a", descriptor = "(IB)I")
	public static int method6784(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
