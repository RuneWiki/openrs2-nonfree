import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!eea", name = "B", descriptor = "I")
	public static int anInt2155;

	@OriginalMember(owner = "client!eea", name = "w", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_28 = new Class306("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(III)B")
	public static byte method1826(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!eea", name = "a", descriptor = "(IIIII)V")
	public static void method1832(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(10) Class1_Sub10 local10 = (Class1_Sub10) Static237.aClass37_49.method977(); local10 != null; local10 = (Class1_Sub10) Static237.aClass37_49.method971()) {
			Static344.method5215(arg0, local10, arg1, arg2, arg3);
		}
		for (@Pc(31) Class1_Sub10 local31 = (Class1_Sub10) Static487.aClass37_88.method977(); local31 != null; local31 = (Class1_Sub10) Static487.aClass37_88.method971()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class230 local45 = local31.aClass49_Sub2_Sub2_Sub2_1.method3799();
			if (local31.aClass49_Sub2_Sub2_Sub2_1.aBoolean306) {
				local40 = 0;
			} else if (local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282 == local45.anInt6382 || local45.anInt6408 == local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282 || local45.anInt6378 == local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282 || local45.anInt6390 == local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282) {
				local40 = 2;
			} else if (local45.anInt6377 == local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282 || local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282 == local45.anInt6398 || local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282 == local45.anInt6400 || local45.anInt6407 == local31.aClass49_Sub2_Sub2_Sub2_1.anInt4282) {
				local40 = 3;
			}
			if (local31.anInt1209 != local40) {
				@Pc(138) int local138 = Static74.method1286(local31.aClass49_Sub2_Sub2_Sub2_1);
				if (local138 != local31.anInt1214) {
					if (local31.aClass1_Sub16_Sub2_2 != null) {
						Static411.aClass1_Sub16_Sub1_2.method2231(local31.aClass1_Sub16_Sub2_2);
						local31.aClass1_Sub16_Sub2_2 = null;
					}
					local31.anInt1214 = local138;
				}
				local31.anInt1209 = local40;
			}
			local31.anInt1203 = local31.aClass49_Sub2_Sub2_Sub2_1.anInt7137;
			local31.anInt1215 = local31.aClass49_Sub2_Sub2_Sub2_1.anInt7137 + (local31.aClass49_Sub2_Sub2_Sub2_1.method3788() << 8);
			local31.anInt1210 = local31.aClass49_Sub2_Sub2_Sub2_1.anInt7141;
			local31.anInt1208 = local31.aClass49_Sub2_Sub2_Sub2_1.anInt7141 + (local31.aClass49_Sub2_Sub2_Sub2_1.method3788() << 8);
			Static344.method5215(arg0, local31, arg1, arg2, arg3);
		}
		for (@Pc(213) Class1_Sub10 local213 = (Class1_Sub10) Static403.aClass17_31.method735(); local213 != null; local213 = (Class1_Sub10) Static403.aClass17_31.method740()) {
			@Pc(217) byte local217 = 1;
			@Pc(222) Class230 local222 = local213.aClass49_Sub2_Sub2_Sub1_2.method3799();
			if (local213.aClass49_Sub2_Sub2_Sub1_2.aBoolean306) {
				local217 = 0;
			} else if (local222.anInt6382 == local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 || local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 == local222.anInt6408 || local222.anInt6378 == local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 || local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 == local222.anInt6390) {
				local217 = 2;
			} else if (local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 == local222.anInt6377 || local222.anInt6398 == local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 || local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 == local222.anInt6400 || local213.aClass49_Sub2_Sub2_Sub1_2.anInt4282 == local222.anInt6407) {
				local217 = 3;
			}
			if (local217 != local213.anInt1209) {
				@Pc(313) int local313 = Static290.method6962(local213.aClass49_Sub2_Sub2_Sub1_2);
				if (local213.anInt1214 != local313) {
					if (local213.aClass1_Sub16_Sub2_2 != null) {
						Static411.aClass1_Sub16_Sub1_2.method2231(local213.aClass1_Sub16_Sub2_2);
						local213.aClass1_Sub16_Sub2_2 = null;
					}
					local213.anInt1214 = local313;
				}
				local213.anInt1209 = local217;
			}
			local213.anInt1203 = local213.aClass49_Sub2_Sub2_Sub1_2.anInt7137;
			local213.anInt1215 = local213.aClass49_Sub2_Sub2_Sub1_2.anInt7137 + (local213.aClass49_Sub2_Sub2_Sub1_2.method3788() << 8);
			local213.anInt1210 = local213.aClass49_Sub2_Sub2_Sub1_2.anInt7141;
			local213.anInt1208 = local213.aClass49_Sub2_Sub2_Sub1_2.anInt7141 + (local213.aClass49_Sub2_Sub2_Sub1_2.method3788() << 8);
			Static344.method5215(arg0, local213, arg1, arg2, arg3);
		}
	}
}
