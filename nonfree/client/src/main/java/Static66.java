import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "I")
	public static int anInt1232;

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray4 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13] };

	@OriginalMember(owner = "client!ea", name = "r", descriptor = "I")
	public static int anInt1218 = 1;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_27 = new Class70(50);

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "Lclient!jl;")
	public static final Class109 aClass109_2 = new Class109();

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)V")
	public static void method1120(@OriginalArg(0) int arg0) {
		@Pc(13) Class6_Sub2_Sub8 local13 = Static239.method5786(4, arg0);
		local13.method2645();
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!br;IIIII)V")
	public static void method1123(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt4728 = 0;
		@Pc(7) int local7;
		label56: for (@Pc(4) int local4 = arg2; local4 <= arg4; local4++) {
			label54: for (local7 = arg3; local7 <= arg5; local7++) {
				@Pc(16) int local16 = Static174.anIntArrayArrayArray4[arg1][local4][local7];
				@Pc(18) int local18 = 0;
				while (true) {
					label49: while (true) {
						if (local18 > 24) {
							continue label54;
						}
						@Pc(25) int local25 = local16 >>> local18 & 0xFF;
						if (local25 <= 0) {
							continue label54;
						}
						@Pc(33) Class6_Sub17_Sub1 local33 = Static240.aClass6_Sub17_Sub1Array4[local25 - 1];
						for (@Pc(35) int local35 = 0; local35 < arg0.anInt4728; local35++) {
							if (arg0.aClass6_Sub17_Sub1Array5[local35] == local33) {
								local18 += 8;
								continue label49;
							}
						}
						arg0.aClass6_Sub17_Sub1Array5[arg0.anInt4728++] = local33;
						if (arg0.anInt4728 == 4) {
							break label56;
						}
						local18 += 8;
					}
				}
			}
		}
		for (local7 = arg0.anInt4728; local7 < 4; local7++) {
			arg0.aClass6_Sub17_Sub1Array5[local7] = null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)V")
	public static void method1124(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class6_Sub2_Sub8 local16 = Static239.method5786(5, arg0);
		local16.method2648();
		local16.anInt2511 = arg1;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)V")
	public static void method1125(@OriginalArg(1) int arg0) {
		if (!Static346.aBoolean418) {
			arg0 = -1;
		}
		if (Static298.anInt5639 == arg0) {
			return;
		}
		if (arg0 != -1) {
			@Pc(26) Class156 local26 = Static216.method3847(arg0);
			@Pc(30) Class88 local30 = local26.method4085();
			if (local30 == null) {
				arg0 = -1;
			} else {
				Static308.aClass206_5.method5522(local30.method2261(), new Point(local26.anInt4283, local26.anInt4281), local30.method2257(), local30.method2259(), Static354.aCanvas5);
				Static298.anInt5639 = arg0;
			}
		}
		if (arg0 == -1 && Static298.anInt5639 != -1) {
			Static308.aClass206_5.method5522(-1, new Point(), null, -1, Static354.aCanvas5);
			Static298.anInt5639 = -1;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public static void method1126() {
		if (Static90.aFrame1 != null) {
			return;
		}
		@Pc(8) int local8 = Static271.anInt5038;
		@Pc(10) int local10 = Static57.anInt1098;
		@Pc(18) int local18 = Static92.anInt1689 - Static209.anInt3815 - local8;
		@Pc(25) int local25 = Static99.anInt6127 - Static94.anInt1731 - local10;
		if (local8 <= 0 && local18 <= 0 && local10 <= 0 && local25 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41;
			if (Static95.aFrame2 == null) {
				local41 = Static308.aClass206_5.anApplet1;
			} else {
				local41 = Static95.aFrame2;
			}
			@Pc(48) int local48 = 0;
			@Pc(50) int local50 = 0;
			if (Static95.aFrame2 == local41) {
				@Pc(56) Insets local56 = Static95.aFrame2.getInsets();
				local48 = local56.left;
				local50 = local56.top;
			}
			@Pc(65) Graphics local65 = local41.getGraphics();
			local65.setColor(Color.black);
			if (local8 > 0) {
				local65.fillRect(local48, local50, local8, Static99.anInt6127);
			}
			if (local10 > 0) {
				local65.fillRect(local48, local50, Static92.anInt1689, local10);
			}
			if (local18 > 0) {
				local65.fillRect(local48 + Static92.anInt1689 - local18, local50, local18, Static99.anInt6127);
			}
			if (local25 > 0) {
				local65.fillRect(local48, local50 + Static99.anInt6127 - local25, Static92.anInt1689, local25);
				return;
			}
		} catch (@Pc(117) Exception local117) {
			return;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!br;IIII)V")
	public static void method1127(@OriginalArg(0) Class25 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static121.method5165(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static310.anInt5828) {
			Static121.method5165(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static121.method5165(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static163.anInt3084) {
			Static121.method5165(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static163.anInt3084) {
			Static121.method5165(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static310.anInt5828 && arg4 <= Static163.anInt3084) {
			Static121.method5165(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static121.method5165(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static310.anInt5828 && arg4 > 0) {
			Static121.method5165(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!dp;)V")
	public static void method1128(@OriginalArg(1) Class53 arg0) {
		Static137.anInt2494 = arg0.method1037("titlebg");
		Static15.anInt278 = arg0.method1037("logo");
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ZI)V")
	public static void method1129(@OriginalArg(0) boolean arg0) {
		Static43.aBoolean72 = arg0;
		Static259.aBoolean337 = !Static16.method287();
	}
}
