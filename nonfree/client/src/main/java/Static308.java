import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static308 {

	@OriginalMember(owner = "client!l", name = "Pd", descriptor = "I")
	public static int anInt5834;

	@OriginalMember(owner = "client!l", name = "Yc", descriptor = "Lclient!ru;")
	public static final Class301 aClass301_1 = new Class301(true);

	@OriginalMember(owner = "client!l", name = "ed", descriptor = "Z")
	public static boolean aBoolean411 = true;

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(IIII)V")
	public static void method5077(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		Static620.aFloat209 = local3;
		Static401.aFloat165 = local15;
		if (Static305.anInt5422 == 2) {
			Static72.anInt1723 = 0;
			Static185.anInt5215 = local15;
			Static393.anInt7268 = local3;
		}
		Static492.method6922();
		Static395.aBoolean521 = true;
	}

	@OriginalMember(owner = "client!l", name = "a", descriptor = "(IILclient!sl;)V")
	public static void method5078(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (Static43.aClass173_1 == null) {
			return;
		}
		try {
			Static43.aClass173_1.method4421(0L);
			Static43.aClass173_1.method4418(arg0, 24, arg1.aByteArray54);
		} catch (@Pc(25) Exception local25) {
		}
	}

	@OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V")
	public static void method5083() {
		Static496.aClass102_16.method2680();
	}
}
