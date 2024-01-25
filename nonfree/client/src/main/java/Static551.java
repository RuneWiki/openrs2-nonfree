import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!vo", name = "c", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_66 = new Class245(32);

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "[I")
	public static final int[] anIntArray815 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!vo", name = "e", descriptor = "Lclient!oh;")
	public static final Class238 aClass238_5 = new Class238();

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(III)V")
	public static void method7861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class224 local7 = Static256.aClass224ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null && local7.aClass11_Sub5_2 != null) {
			local7.aClass11_Sub5_2 = null;
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZIZLclient!va;)V")
	public static void method7862(@OriginalArg(0) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub48 arg2) {
		@Pc(8) int local8 = arg2.anInt9207;
		@Pc(12) int local12 = (int) arg2.aLong252;
		arg2.method8151();
		if (arg0) {
			Static465.method7168(local8);
		}
		Static553.method7873(local8);
		@Pc(29) Class93 local29 = Static223.method4011(local12);
		if (local29 != null) {
			Static468.method7221(local29);
		}
		Static5.method207();
		if (!arg1 && Static6.anInt302 != -1) {
			Static417.method6511(Static6.anInt302, 1);
		}
		@Pc(50) Class335 local50 = new Class335(Static459.aClass305_24);
		for (@Pc(55) Class6_Sub48 local55 = (Class6_Sub48) local50.method7834(); local55 != null; local55 = (Class6_Sub48) local50.method7835()) {
			if (!local55.method8152()) {
				local55 = (Class6_Sub48) local50.method7834();
				if (local55 == null) {
					return;
				}
			}
			if (local55.anInt9210 == 3) {
				@Pc(86) int local86 = (int) local55.aLong252;
				if (local8 == local86 >>> 16) {
					method7862(true, arg1, local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!oh;)I")
	public static int method7864(@OriginalArg(1) Class238 arg0) {
		if (Static410.aClass238_3 == arg0) {
			return 7681;
		} else if (arg0 == Static477.aClass238_4) {
			return 8448;
		} else if (Static71.aClass238_1 == arg0) {
			return 34165;
		} else if (arg0 == Static167.aClass238_2) {
			return 260;
		} else if (aClass238_5 == arg0) {
			return 34023;
		} else {
			throw new IllegalArgumentException();
		}
	}
}
