import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static146 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_209 = new Class217(64, 5);

	@OriginalMember(owner = "client!je", name = "c", descriptor = "I")
	public static int anInt6824 = -1;

	@OriginalMember(owner = "client!je", name = "d", descriptor = "I")
	public static int anInt6825 = 0;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public static void method5910() {
		for (@Pc(10) Class1_Sub22 local10 = (Class1_Sub22) Static317.aClass42_43.method1543(); local10 != null; local10 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			if (Static210.method3867(local10.anInt2822)) {
				Static342.method5728(local10);
			}
		}
		if (Static224.anInt4512 == 1) {
			Static217.aBoolean322 = false;
			Static128.method5289(Static361.anInt6937, Static35.anInt920, Static208.anInt4100, Static182.anInt3706);
			return;
		}
		Static128.method5289(Static361.anInt6937, Static35.anInt920, Static208.anInt4100, Static182.anInt3706);
		@Pc(58) int local58 = Static64.aClass80_17.method2543(Static110.aClass106_84.method2927(Static254.anInt5172));
		for (@Pc(63) Class1_Sub22 local63 = (Class1_Sub22) Static317.aClass42_43.method1543(); local63 != null; local63 = (Class1_Sub22) Static317.aClass42_43.method1551()) {
			@Pc(69) int local69 = Static198.method3717(local63);
			if (local69 > local58) {
				local58 = local69;
			}
		}
		Static208.anInt4100 = Static224.anInt4512 * 16 + (Static171.aBoolean246 ? 26 : 22);
		Static182.anInt3706 = local58 + 8;
	}
}
