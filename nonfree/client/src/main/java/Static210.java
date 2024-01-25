import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
	public static int anInt4173;

	@OriginalMember(owner = "client!nl", name = "y", descriptor = "Lclient!we;")
	public static Class174 aClass174_2;

	@OriginalMember(owner = "client!nl", name = "u", descriptor = "Lclient!ng;")
	public static final Class140 aClass140_111 = new Class140(50);

	@OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
	public static int anInt4174 = 0;

	@OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
	public static int anInt4175 = 3;

	@OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
	public static int anInt4177 = 0;

	@OriginalMember(owner = "client!nl", name = "E", descriptor = "[I")
	public static int[] anIntArray500 = new int[2];

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(III)Z")
	public static boolean method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = Static335.anIntArrayArrayArray13[arg0][arg1][arg2];
		if (local7 == -Static271.anInt4840) {
			return false;
		} else if (local7 == Static271.anInt4840) {
			return true;
		} else {
			@Pc(22) int local22 = arg1 << 7;
			@Pc(26) int local26 = arg2 << 7;
			if (Static117.method2113(local22 + 1, Static7.aClass41Array1[arg0].method5434(arg1, arg2), local26 + 1) && Static117.method2113(local22 + 128 - 1, Static7.aClass41Array1[arg0].method5434(arg1 + 1, arg2), local26 + 1) && Static117.method2113(local22 + 128 - 1, Static7.aClass41Array1[arg0].method5434(arg1 + 1, arg2 + 1), local26 + 128 - 1) && Static117.method2113(local22 + 1, Static7.aClass41Array1[arg0].method5434(arg1, arg2 + 1), local26 + 128 - 1)) {
				Static335.anIntArrayArrayArray13[arg0][arg1][arg2] = Static271.anInt4840;
				return true;
			} else {
				Static335.anIntArrayArrayArray13[arg0][arg1][arg2] = -Static271.anInt4840;
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)Lclient!bl;")
	public static Class1_Sub1_Sub3 method3849(@OriginalArg(1) int arg0) {
		@Pc(5) Class140 local5 = Static234.aClass140_121;
		@Pc(22) Class1_Sub1_Sub3 local22;
		synchronized (Static234.aClass140_121) {
			local22 = (Class1_Sub1_Sub3) Static234.aClass140_121.method3816((long) arg0);
			if (local22 == null) {
				local22 = new Class1_Sub1_Sub3(arg0);
				Static234.aClass140_121.method3817((long) arg0, local22);
			}
		}
		synchronized (local22) {
			return local22.method820() ? local22 : null;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)Z")
	public static boolean method3850(@OriginalArg(1) int arg0) {
		if (arg0 == 51 || arg0 == 6 || arg0 == 60 || arg0 == 48 || arg0 == 1006) {
			return true;
		} else {
			return arg0 == 23 || arg0 == 29 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "(CI)Z")
	public static boolean method3851(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Static88.method1695(arg0)) {
			return true;
		} else {
			@Pc(18) char[] local18 = Static258.aCharArray3;
			for (@Pc(20) int local20 = 0; local20 < local18.length; local20++) {
				@Pc(26) char local26 = local18[local20];
				if (local26 == arg0) {
					return true;
				}
			}
			@Pc(42) char[] local42 = Static304.aCharArray6;
			for (@Pc(44) int local44 = 0; local44 < local42.length; local44++) {
				@Pc(50) char local50 = local42[local44];
				if (arg0 == local50) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(II)V")
	public static void method3852(@OriginalArg(1) int arg0) {
		Static351.anInt6507 = arg0;
		@Pc(11) Class140 local11 = Static135.aClass140_73;
		synchronized (Static135.aClass140_73) {
			Static135.aClass140_73.method3819();
		}
	}
}
