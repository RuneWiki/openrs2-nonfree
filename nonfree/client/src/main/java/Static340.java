import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!vr", name = "h", descriptor = "I")
	public static int anInt5687 = -1;

	@OriginalMember(owner = "client!vr", name = "k", descriptor = "I")
	public static int anInt5690 = 1;

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)V")
	public static void method4780() {
		for (@Pc(15) Class11_Sub4_Sub21 local15 = (Class11_Sub4_Sub21) Static270.aClass16_42.method193(); local15 != null; local15 = (Class11_Sub4_Sub21) Static270.aClass16_42.method188()) {
			@Pc(20) Class67_Sub3_Sub4 local20 = local15.aClass67_Sub3_Sub4_1;
			if (local20.aByte73 != Static322.anInt6250 || local20.aBoolean398) {
				local15.method5701();
				local20.method5131();
			} else if (Static293.anInt5807 >= local20.anInt5964) {
				local20.method5133(Static244.anInt4932);
				if (local20.aBoolean398) {
					local15.method5701();
				} else {
					Static349.method5649(local20, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
	public static void method4781() {
		@Pc(5) Class26 local5 = Static222.aClass26_43;
		synchronized (Static222.aClass26_43) {
			Static222.aClass26_43.method333();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	public static void method4782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0];
		@Pc(13) int local13 = Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0];
		if (Static68.anInt1264 == 1) {
			if (!Static81.method1214(local8, local13, -2, 1, arg0, 0, arg1, 0, 1, false)) {
				Static81.method1214(local8, local13, -3, 1, arg0, 0, arg1, 0, 1, false);
			}
		} else if (!Static81.method1214(local8, local13, -3, 1, arg0, 0, arg1, 0, 1, false)) {
			Static81.method1214(local8, local13, -2, 1, arg0, 0, arg1, 0, 1, false);
		}
	}
}
