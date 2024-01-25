import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray3 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!eh;Z)V")
	public static void method3095(@OriginalArg(0) Class4_Sub9 arg0) {
		@Pc(9) int local9 = arg0.method5978();
		Static217.aClass361Array1 = new Class361[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static217.aClass361Array1[local14] = new Class361();
			Static217.aClass361Array1[local14].anInt9771 = arg0.method5978();
			Static217.aClass361Array1[local14].aString99 = arg0.method5968();
		}
		Static333.anInt5925 = arg0.method5978();
		Static359.anInt6234 = arg0.method5978();
		Static472.anInt7955 = arg0.method5978();
		Static286.aClass7_Sub1Array5 = new Class7_Sub1[Static359.anInt6234 + 1 - Static333.anInt5925];
		for (@Pc(66) int local66 = 0; local66 < Static472.anInt7955; local66++) {
			@Pc(72) int local72 = arg0.method5978();
			@Pc(80) Class7_Sub1 local80 = Static286.aClass7_Sub1Array5[local72] = new Class7_Sub1();
			local80.anInt90 = arg0.method6015();
			local80.anInt84 = arg0.method6026();
			local80.anInt94 = local72 + Static333.anInt5925;
			local80.aString1 = arg0.method5968();
			local80.aString2 = arg0.method5968();
		}
		Static170.anInt9209 = arg0.method6026();
		Static524.aBoolean616 = true;
	}

	@OriginalMember(owner = "client!fw", name = "c", descriptor = "(I)V")
	public static void method3096() {
		Static107.method6136();
		Static202.aClass64_165 = null;
		Static342.aClass64_294 = null;
		Static72.anInt1537 = 0;
		Static29.aClass64_37 = null;
		Static491.aClass64_424 = null;
		Static218.anInt4452 = 0;
		Static487.aClass4_Sub9_Sub1_2.anInt7219 = 0;
		Static474.anInt4412 = 0;
		Static477.method6635();
		Static387.method7907();
		for (@Pc(32) int local32 = 0; local32 < 2048; local32++) {
			Static246.aClass10_Sub1_Sub2_Sub2Array1[local32] = null;
		}
		Static129.aClass10_Sub1_Sub2_Sub2_1 = null;
		for (@Pc(48) int local48 = 0; local48 < Static566.anInt9466; local48++) {
			@Pc(55) Class10_Sub1_Sub2_Sub1 local55 = Static161.aClass4_Sub50Array1[local48].aClass10_Sub1_Sub2_Sub1_1;
			if (local55 != null) {
				local55.anInt8465 = -1;
			}
		}
		Static479.method6663();
		Static555.anInt9335 = 1;
		Static140.anInt3147 = -1;
		Static380.anInt6749 = -1;
		Static33.method600(10);
		for (@Pc(81) int local81 = 0; local81 < 100; local81++) {
			Static271.aBooleanArray21[local81] = true;
		}
		Static453.method6407();
		Static325.aClass4_Sub39_1 = null;
		Static173.aLong90 = 0L;
	}
}
