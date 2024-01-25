import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
	public static int anInt3814;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	public static int anInt3816 = 1;

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!rd;B)V")
	public static void method3017(@OriginalArg(0) Class8_Sub3_Sub1_Sub1 arg0) {
		@Pc(16) Class4_Sub22 local16 = (Class4_Sub22) Static381.aClass67_4.method1429((long) arg0.anInt7391);
		if (local16 == null) {
			return;
		}
		if (local16.aClass4_Sub14_Sub4_2 != null) {
			Static406.aClass4_Sub14_Sub2_2.method2420(local16.aClass4_Sub14_Sub4_2);
			local16.aClass4_Sub14_Sub4_2 = null;
		}
		local16.method6059();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(III)Z")
	public static boolean method3018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	public static void method3020() {
		if (Static193.aClass178_9 != Static236.aClass178_15) {
			try {
				Static467.method6000("tbrefresh", Static425.aClient1);
			} catch (@Pc(14) Throwable local14) {
			}
		}
	}
}
