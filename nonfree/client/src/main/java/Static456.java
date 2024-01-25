import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static456 {

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_187 = new Class180(53, 3);

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V")
	public static void method8140() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) int local13 = 0; local13 < Static158.anInt927; local13++) {
			for (@Pc(17) int local17 = 0; local17 < Static515.anInt8292; local17++) {
				if (Static57.method1242(local7, true, local17, Static15.aClass164ArrayArrayArray5, local13)) {
					local7++;
				}
				if (local7 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(ILclient!jp;)Lclient!fl;")
	public static Class106_Sub1_Sub1 method8148(@OriginalArg(1) Class3_Sub25 arg0) {
		@Pc(7) Class106_Sub1 local7 = Static416.method5925(arg0);
		@Pc(16) int local16 = arg0.method8589();
		return new Class106_Sub1_Sub1(local7.aClass356_8, local7.aClass56_11, local7.anInt5838, local7.anInt5836, local7.anInt5840, local7.anInt5834, local7.anInt5837, local7.anInt5841, local7.anInt5839, local7.anInt3387, local7.anInt3385, local7.anInt3390, local7.anInt3388, local7.anInt3391, local7.anInt3389, local16);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "()V")
	public static void method8149() {
		Static645.aClass321_3 = Static645.aClass321_2;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!or;Z)V")
	public static void method8151(@OriginalArg(0) Class260 arg0) {
		if (Static187.anInt3786 == arg0.anInt6995) {
			Static200.aBooleanArray21[arg0.anInt7001] = true;
		}
	}
}
