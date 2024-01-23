import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!ci", name = "ab", descriptor = "Ljava/lang/String;")
	public static String aString31;

	@OriginalMember(owner = "client!ci", name = "bb", descriptor = "I")
	public static int anInt918;

	@OriginalMember(owner = "client!ci", name = "S", descriptor = "[J")
	public static long[] aLongArray6 = new long[500];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lclient!kb;BLclient!kb;)V")
	public static void method719(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class83 arg1) {
		Static266.aClass83_189 = arg0;
		Static295.aClass83_101 = arg1;
		Static40.anInt1933 = Static295.aClass83_101.method2317(3);
	}

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "(I)[Lclient!n;")
	public static Class1_Sub2_Sub14_Sub1[] method720() {
		@Pc(14) Class1_Sub2_Sub14_Sub1[] local14 = new Class1_Sub2_Sub14_Sub1[Static153.anInt3542];
		for (@Pc(16) int local16 = 0; local16 < Static153.anInt3542; local16++) {
			@Pc(27) int local27 = Static166.anIntArray343[local16] * Static81.anIntArray204[local16];
			@Pc(31) byte[] local31 = Static200.aByteArrayArray83[local16];
			@Pc(34) int[] local34 = new int[local27];
			for (@Pc(36) int local36 = 0; local36 < local27; local36++) {
				local34[local36] = Static167.anIntArray346[local31[local36] & 0xFF];
			}
			local14[local16] = new Class1_Sub2_Sub14_Sub1(Static298.anInt6232, Static158.anInt3659, Static298.anIntArray623[local16], Static121.anIntArray257[local16], Static166.anIntArray343[local16], Static81.anIntArray204[local16], local34);
		}
		Static265.method4490();
		return local14;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZILjava/lang/String;I)Z")
	public static boolean method722(@OriginalArg(2) String arg0) {
		@Pc(30) boolean local30 = false;
		@Pc(32) boolean local32 = false;
		@Pc(41) int local41 = arg0.length();
		@Pc(43) int local43 = 0;
		for (@Pc(45) int local45 = 0; local45 < local41; local45++) {
			@Pc(52) char local52 = arg0.charAt(local45);
			if (local45 == 0) {
				if (local52 == '-') {
					local30 = true;
					continue;
				}
				if (local52 == '+') {
					continue;
				}
			}
			@Pc(88) int local88;
			if (local52 >= '0' && local52 <= '9') {
				local88 = local52 - '0';
			} else if (local52 >= 'A' && local52 <= 'Z') {
				local88 = local52 - '7';
			} else if (local52 >= 'a' && local52 <= 'z') {
				local88 = local52 - 'W';
			} else {
				return false;
			}
			if (local88 >= 10) {
				return false;
			}
			if (local30) {
				local88 = -local88;
			}
			@Pc(120) int local120 = local43 * 10 + local88;
			if (local120 / 10 != local43) {
				return false;
			}
			local32 = true;
			local43 = local120;
		}
		return local32;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIBI)V")
	public static void method723(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(5) int local5 = arg4 + arg1;
		@Pc(14) int local14 = arg6 - arg4;
		@Pc(18) int local18 = arg4 + arg5;
		@Pc(23) int local23 = arg3 - arg4;
		@Pc(29) int local29;
		for (local29 = arg1; local29 < local5; local29++) {
			Static89.method1538(Static57.anIntArrayArray9[local29], arg3, arg5, arg0);
		}
		for (local29 = arg6; local29 > local14; local29--) {
			Static89.method1538(Static57.anIntArrayArray9[local29], arg3, arg5, arg0);
		}
		for (local29 = local5; local29 <= local14; local29++) {
			@Pc(72) int[] local72 = Static57.anIntArrayArray9[local29];
			Static89.method1538(local72, local18, arg5, arg0);
			Static89.method1538(local72, local23, local18, arg2);
			Static89.method1538(local72, arg3, local23, arg0);
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method724(@OriginalArg(0) Component arg0) {
		arg0.removeMouseListener(Static191.aClass158_1);
		arg0.removeMouseMotionListener(Static191.aClass158_1);
		arg0.removeFocusListener(Static191.aClass158_1);
		Static235.anInt5162 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(III)I")
	public static int method725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(33) int local33 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local33;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(III)I")
	public static int method726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local17;
	}
}
