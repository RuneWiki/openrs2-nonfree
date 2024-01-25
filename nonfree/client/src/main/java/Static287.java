import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!om", name = "W", descriptor = "Lclient!mg;")
	public static Class160 aClass160_59;

	@OriginalMember(owner = "client!om", name = "K", descriptor = "Lclient!kl;")
	public static final Class142 aClass142_93 = new Class142(6, 0, 4, 2);

	@OriginalMember(owner = "client!om", name = "V", descriptor = "F")
	public static float aFloat74 = 1024.0F;

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method4138(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(III)V")
	public static void method4140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub5_Sub13 local8 = Static208.method3306(arg1, 6);
		local8.method4547();
		local8.anInt5641 = arg0;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(ZIIIIIIF)[I")
	public static int[] method4141(@OriginalArg(7) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub2_Sub38 local10 = new Class2_Sub2_Sub38();
		local10.anInt7385 = 8;
		local10.anInt7383 = (int) (arg0 * 4096.0F);
		local10.anInt7386 = 4;
		local10.aBoolean485 = true;
		local10.anInt7379 = 8;
		local10.anInt7380 = 35;
		local10.method5845();
		Static22.method463(1, 2048);
		local10.method5815(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method4142(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(20) String local20 = Static259.method3902(arg0);
		if (local20 == null) {
			return;
		}
		for (@Pc(25) int local25 = 0; local25 < Static393.anInt6567; local25++) {
			@Pc(31) String local31 = Static367.aStringArray45[local25];
			if (local31.startsWith("*")) {
				local31 = local31.substring(1);
			}
			local31 = Static259.method3902(local31);
			if (local31 != null && local31.equals(local20)) {
				Static393.anInt6567--;
				for (@Pc(55) int local55 = local25; local55 < Static393.anInt6567; local55++) {
					Static367.aStringArray45[local55] = Static367.aStringArray45[local55 + 1];
					Static227.aStringArray32[local55] = Static227.aStringArray32[local55 + 1];
					Static160.aStringArray31[local55] = Static160.aStringArray31[local55 + 1];
					Static67.aStringArray8[local55] = Static67.aStringArray8[local55 + 1];
					Static102.aBooleanArray11[local55] = Static102.aBooleanArray11[local55 + 1];
				}
				Static118.anInt2673 = Static37.anInt715;
				Static159.method2586(Static262.aClass54_97);
				Static424.aClass2_Sub23_Sub2_1.method5449(method4138(arg0));
				Static424.aClass2_Sub23_Sub2_1.method5496(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!om", name = "h", descriptor = "(I)V")
	public static void method4144() {
		if (!Static165.aBoolean256) {
			return;
		}
		while (true) {
			while (Static397.aClass219_Sub1Array3.length > Static11.anInt286) {
				@Pc(21) Class219_Sub1 local21 = Static397.aClass219_Sub1Array3[Static11.anInt286];
				if (local21 != null && local21.anInt6543 == -1) {
					if (Static353.aClass2_Sub36_2 == null) {
						Static353.aClass2_Sub36_2 = Static451.aClass268_1.method5855(local21.aString59);
					}
					@Pc(44) int local44 = Static353.aClass2_Sub36_2.anInt5667;
					if (local44 == -1) {
						return;
					}
					Static11.anInt286++;
					local21.anInt6543 = local44;
					Static353.aClass2_Sub36_2 = null;
				} else {
					Static11.anInt286++;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(IZJIB)Ljava/lang/String;")
	public static String method4145(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) long arg2, @OriginalArg(3) int arg3) {
		@Pc(7) char local7 = ',';
		@Pc(9) char local9 = '.';
		if (arg0 == 0) {
			local9 = ',';
			local7 = '.';
		}
		if (arg0 == 2) {
			local9 = ' ';
		}
		@Pc(22) boolean local22 = false;
		if (arg2 < 0L) {
			local22 = true;
			arg2 = -arg2;
		}
		@Pc(38) StringBuffer local38 = new StringBuffer(26);
		@Pc(42) int local42;
		@Pc(47) int local47;
		if (arg3 > 0) {
			for (local42 = 0; local42 < arg3; local42++) {
				local47 = (int) arg2;
				arg2 /= 10L;
				local38.append((char) (local47 + 48 - (int) arg2 * 10));
			}
			local38.append(local7);
		}
		local42 = 0;
		while (true) {
			local47 = (int) arg2;
			arg2 /= 10L;
			local38.append((char) (local47 + 48 - (int) arg2 * 10));
			if (arg2 == 0L) {
				if (local22) {
					local38.append('-');
				}
				return local38.reverse().toString();
			}
			if (arg1) {
				local42++;
				if (local42 % 3 == 0) {
					local38.append(local9);
				}
			}
		}
	}
}
