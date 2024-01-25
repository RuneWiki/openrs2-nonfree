import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static375 {

	@OriginalMember(owner = "client!oea", name = "k", descriptor = "I")
	public static int anInt6277;

	@OriginalMember(owner = "client!oea", name = "h", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!oea", name = "j", descriptor = "Lclient!ml;")
	public static Class1_Sub34 aClass1_Sub34_2 = null;

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(JILclient!r;)V")
	public static void method5037(@OriginalArg(0) long arg0, @OriginalArg(2) Class134 arg1) {
		Static126.anInt2509 = 0;
		Static501.anInt8570 = 0;
		Static334.anInt5669 = Static269.anInt4744;
		Static269.anInt4744 = 0;
		@Pc(16) long local16 = Static413.method5668();
		for (@Pc(21) Class8_Sub7 local21 = (Class8_Sub7) Static293.aClass209_2.method4194(); local21 != null; local21 = (Class8_Sub7) Static293.aClass209_2.method4191()) {
			if (local21.method4400(arg1, arg0)) {
				Static501.anInt8570++;
			}
		}
		if (Static361.aBoolean468 && arg0 % 100L == 0L) {
			System.out.println("Particle system count: " + Static293.aClass209_2.method4193() + ", running: " + Static501.anInt8570);
			System.out.println("Emitters: " + Static126.anInt2509 + " Particles: " + Static269.anInt4744 + ". Time taken: " + (Static413.method5668() - local16) + "ms");
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)V")
	public static void method5038(@OriginalArg(0) int arg0) {
		Static404.anInt7074 = 2;
		Static184.anInt3253 = arg0;
		if (Static194.aString33 == null) {
			Static138.method2101(35);
		} else {
			@Pc(25) Class1_Sub35 local25 = new Class1_Sub35(Static263.method3789(Static191.method2937(Static194.aString33)));
			@Pc(29) long local29 = local25.method5778();
			Static435.aLong284 = local25.method5778();
			Static199.method3213(true, Static91.method1613(local29), "");
		}
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(BII)Z")
	public static boolean method5039(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(FFFI)I")
	public static int method5042(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2) {
		@Pc(18) float local18 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(27) float local27 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(36) float local36 = arg0 < 0.0F ? -arg0 : arg0;
		if (local18 < local27 && local36 < local27) {
			return arg2 > 0.0F ? 0 : 1;
		} else if (local36 > local18 && local27 < local36) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg1 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
