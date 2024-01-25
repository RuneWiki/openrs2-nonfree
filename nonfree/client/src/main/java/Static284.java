import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "Lclient!pfa;")
	public static Class251 aClass251_68;

	@OriginalMember(owner = "client!lga", name = "d", descriptor = "Lclient!ip;")
	public static Class26 aClass26_4;

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(Lclient!wv;B)I")
	public static int method4644(@OriginalArg(0) Class4_Sub1_Sub1 arg0) {
		if (arg0.anInt7114 == 0) {
			return 0;
		}
		@Pc(69) int local69;
		@Pc(62) int local62;
		if (arg0.anInt7123 != -1) {
			@Pc(22) Class4_Sub1_Sub1 local22 = null;
			if (arg0.anInt7123 < 32768) {
				@Pc(36) Class6_Sub34 local36 = (Class6_Sub34) Static593.aClass128_43.method3263((long) arg0.anInt7123);
				if (local36 != null) {
					local22 = local36.aClass4_Sub1_Sub1_Sub1_2;
				}
			} else if (arg0.anInt7123 >= 32768) {
				local22 = Static588.aClass4_Sub1_Sub1_Sub2Array3[arg0.anInt7123 - 32768];
			}
			if (local22 != null) {
				local62 = arg0.anInt9542 - local22.anInt9542;
				local69 = arg0.anInt9540 - local22.anInt9540;
				if (local62 != 0 || local69 != 0) {
					arg0.method5909((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class4_Sub1_Sub1_Sub2) {
			@Pc(95) Class4_Sub1_Sub1_Sub2 local95 = (Class4_Sub1_Sub1_Sub2) arg0;
			if (local95.anInt7172 != -1 && (local95.anInt7132 == 0 || local95.anInt7134 > 0)) {
				local95.method5909(local95.anInt7172);
				local95.anInt7172 = -1;
			}
		} else if (arg0 instanceof Class4_Sub1_Sub1_Sub1) {
			@Pc(127) Class4_Sub1_Sub1_Sub1 local127 = (Class4_Sub1_Sub1_Sub1) arg0;
			if (local127.anInt231 != -1 && (local127.anInt7132 == 0 || local127.anInt7134 > 0)) {
				local62 = local127.anInt9542 - (local127.anInt231 - Static39.anInt4952 - Static39.anInt4952) * 256;
				local69 = local127.anInt9540 - (local127.anInt227 - Static138.anInt3088 - Static138.anInt3088) * 256;
				if (local62 != 0 || local69 != 0) {
					local127.method5909((int) (Math.atan2((double) local62, (double) local69) * 2607.5945876176133D) & 0x3FFF);
				}
				local127.anInt231 = -1;
			}
		}
		return arg0.method5908();
	}

	@OriginalMember(owner = "client!lga", name = "a", descriptor = "(IIII)V")
	public static void method4645(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(35) String local35 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local35);
		Static57.method1221(true, local35, false);
	}
}
