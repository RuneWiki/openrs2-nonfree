import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
	public static boolean aBoolean179;

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "I")
	public static int anInt2096;

	@OriginalMember(owner = "client!gd", name = "j", descriptor = "I")
	public static int anInt2099;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_59 = new Class140(5);

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray18 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!gd", name = "g", descriptor = "[I")
	public static final int[] anIntArray254 = new int[] { 0, 0, 0, 64, 128, 128, 128, 64, 64, 96, 32, 32, 64 };

	@OriginalMember(owner = "client!gd", name = "h", descriptor = "Z")
	public static boolean aBoolean180 = false;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!jk;IIIII)V")
	public static void method1911(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt2459 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass1_Sub31_Sub1Array2[local4] != null) {
				arg0.anInt2459++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt2459; local22++) {
			@Pc(31) int local31 = Static116.anIntArrayArrayArray7[arg1][arg2][arg3];
			@Pc(40) Class1_Sub31_Sub1 local40;
			while (local31 != 0) {
				local40 = Static327.aClass1_Sub31_Sub1Array3[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub31_Sub1Array2[local22]) {
					continue label51;
				}
			}
			local31 = Static116.anIntArrayArrayArray7[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static327.aClass1_Sub31_Sub1Array3[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass1_Sub31_Sub1Array2[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt2459 - 1; local85++) {
				arg0.aClass1_Sub31_Sub1Array2[local85] = arg0.aClass1_Sub31_Sub1Array2[local85 + 1];
			}
			arg0.anInt2459--;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZJII)Ljava/lang/String;")
	public static String method1912(@OriginalArg(1) boolean arg0, @OriginalArg(2) long arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg3 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg3 == 2) {
			local9 = ' ';
		}
		@Pc(25) boolean local25 = false;
		if (arg1 < 0L) {
			local25 = true;
			arg1 = -arg1;
		}
		@Pc(51) StringBuffer local51 = new StringBuffer(26);
		@Pc(58) int local58;
		@Pc(63) int local63;
		if (arg2 > 0) {
			for (local58 = 0; local58 < arg2; local58++) {
				local63 = (int) arg1;
				arg1 /= 10L;
				local51.append((char) (local63 + 48 - (int) arg1 * 10));
			}
			local51.append(local7);
		}
		local58 = 0;
		while (true) {
			local63 = (int) arg1;
			arg1 /= 10L;
			local51.append((char) (local63 + 48 - (int) arg1 * 10));
			if (arg1 == 0L) {
				if (local25) {
					local51.append('-');
				}
				return local51.reverse().toString();
			}
			if (arg0) {
				local58++;
				if (local58 % 3 == 0) {
					local51.append(local9);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public static String method1913(@OriginalArg(0) int arg0) {
		@Pc(8) String local8 = Integer.toString(arg0);
		for (@Pc(18) int local18 = local8.length() - 3; local18 > 0; local18 -= 3) {
			local8 = local8.substring(0, local18) + "," + local8.substring(local18);
		}
		if (local8.length() > 9) {
			return " <col=00ff80>" + local8.substring(0, local8.length() - 8) + Static76.aString60 + " (" + local8 + ")</col>";
		} else if (local8.length() > 6) {
			return " <col=ffffff>" + local8.substring(0, local8.length() - 4) + Static105.aString82 + " (" + local8 + ")</col>";
		} else {
			return " <col=ffff00>" + local8 + "</col>";
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIIIIILjava/lang/String;)V")
	public static void method1915(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		@Pc(7) Class15_Sub6 local7 = new Class15_Sub6();
		local7.anInt4362 = arg2 + Static215.anInt4246;
		local7.aString179 = arg5;
		local7.anInt4360 = arg3;
		local7.anInt4364 = arg4;
		local7.anInt4361 = arg0;
		local7.anInt4365 = arg1;
		Static350.aClass175_8.method4672(local7);
	}
}
