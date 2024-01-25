import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
	public static int anInt7767 = 0;

	@OriginalMember(owner = "client!rh", name = "H", descriptor = "Lclient!uc;")
	public static final Class324 aClass324_43 = new Class324("", 10);

	@OriginalMember(owner = "client!rh", name = "M", descriptor = "I")
	public static int anInt7775 = 100;

	@OriginalMember(owner = "client!rh", name = "N", descriptor = "Lclient!nba;")
	public static final Class231 aClass231_6 = new Class231();

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(III)V")
	public static void method6221(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class39 local7 = Static292.aClass39ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 != null) {
			Static395.method5455(local7.aClass8_Sub3_Sub1_1);
			if (local7.aClass8_Sub3_Sub1_1 != null) {
				local7.aClass8_Sub3_Sub1_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIILclient!et;)V")
	public static void method6222(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class95 arg3) {
		for (@Pc(19) Class1_Sub38 local19 = (Class1_Sub38) Static356.aClass353_43.method7677(); local19 != null; local19 = (Class1_Sub38) Static356.aClass353_43.method7687()) {
			if (local19.anInt6108 == arg1 && arg0 << 9 == local19.anInt6099 && local19.anInt6104 == arg2 << 9 && local19.aClass95_1.lb == arg3.lb) {
				if (local19.aClass1_Sub7_Sub4_4 != null) {
					Static309.aClass1_Sub7_Sub1_2.method477(local19.aClass1_Sub7_Sub4_4);
					local19.aClass1_Sub7_Sub4_4 = null;
				}
				if (local19.aClass1_Sub7_Sub4_3 != null) {
					Static309.aClass1_Sub7_Sub1_2.method477(local19.aClass1_Sub7_Sub4_3);
					local19.aClass1_Sub7_Sub4_3 = null;
				}
				local19.method7859();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIII)I")
	public static int method6231(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
