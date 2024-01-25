import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static40 {

	@OriginalMember(owner = "client!cg", name = "R", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray10;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
	public static int anInt716 = 0;

	@OriginalMember(owner = "client!cg", name = "Q", descriptor = "[I")
	public static final int[] anIntArray75 = new int[6];

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ea;JB)V")
	public static void method632(@OriginalArg(0) Class55 arg0, @OriginalArg(1) long arg1) {
		Static315.anInt6170 = 0;
		Static130.anInt5553 = Static236.anInt4221;
		Static236.anInt4221 = 0;
		@Pc(18) long local18 = Static340.method5863();
		for (@Pc(23) Class32_Sub7 local23 = (Class32_Sub7) Static233.aClass39_5.method806(); local23 != null; local23 = (Class32_Sub7) Static233.aClass39_5.method808()) {
			if (local23.method4965(arg0, arg1)) {
				Static315.anInt6170++;
			}
		}
		if (Static255.aBoolean421 && arg1 % 100L == 0L) {
			System.out.println("Particle system count: " + Static233.aClass39_5.method807() + ", running: " + Static315.anInt6170 + ". Particles: " + Static236.anInt4221 + ". Time taken: " + (Static340.method5863() - local18) + "ms");
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!ea;Lclient!ac;III)V")
	public static void method634(@OriginalArg(0) Class55 arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class174 local12;
		if (arg3 < Static350.anInt6715) {
			local12 = Static178.aClass174ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass4_Sub4_1 != null && local12.aClass4_Sub4_1.method5895()) {
				arg1.method5897(128, arg0, local12.aClass4_Sub4_1, true, 0, 0);
			}
		}
		if (arg4 < Static350.anInt6715) {
			local12 = Static178.aClass174ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass4_Sub4_1 != null && local12.aClass4_Sub4_1.method5895()) {
				arg1.method5897(0, arg0, local12.aClass4_Sub4_1, true, 128, 0);
			}
		}
		if (arg3 < Static350.anInt6715 && arg4 < Static236.anInt4222) {
			local12 = Static178.aClass174ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass4_Sub4_1 != null && local12.aClass4_Sub4_1.method5895()) {
				arg1.method5897(128, arg0, local12.aClass4_Sub4_1, true, 128, 0);
			}
		}
		if (arg3 < Static350.anInt6715 && arg4 > 0) {
			local12 = Static178.aClass174ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass4_Sub4_1 != null && local12.aClass4_Sub4_1.method5895()) {
				arg1.method5897(128, arg0, local12.aClass4_Sub4_1, true, -128, 0);
			}
		}
	}
}
