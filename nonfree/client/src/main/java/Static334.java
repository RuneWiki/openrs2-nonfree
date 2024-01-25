import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static334 {

	@OriginalMember(owner = "client!lc", name = "d", descriptor = "[[[Lclient!naa;")
	public static Class243[][][] aClass243ArrayArrayArray2;

	@OriginalMember(owner = "client!lc", name = "f", descriptor = "Lclient!d;")
	public static Interface11 anInterface11_7;

	@OriginalMember(owner = "client!lc", name = "h", descriptor = "Lclient!tb;")
	public static Class49 aClass49_25;

	@OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
	public static int anInt5734;

	@OriginalMember(owner = "client!lc", name = "j", descriptor = "Lclient!mv;")
	public static final Class241 aClass241_74 = new Class241(18, -1);

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V")
	public static void method5175() {
		if (Static468.aByteArray78 != null) {
			Static349.method5347();
		} else if (Static561.anInt9080 == -1) {
			Static252.method8467(Static527.aString100, Static366.aString75);
		} else {
			Static130.method2537();
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(III)V")
	public static void method5176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(23) boolean local23 = aClass243ArrayArrayArray2[0][arg1][arg2] != null && aClass243ArrayArrayArray2[0][arg1][arg2].aClass243_1 != null;
		for (@Pc(25) int local25 = arg0; local25 >= 0; local25--) {
			if (aClass243ArrayArrayArray2[local25][arg1][arg2] == null) {
				@Pc(47) Class243 local47 = aClass243ArrayArrayArray2[local25][arg1][arg2] = new Class243(local25);
				if (local23) {
					local47.aByte97++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)I")
	public static int method5177(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lclient!em;I)I")
	public static int method5179(@OriginalArg(0) Class60_Sub1_Sub1_Sub3_Sub1 arg0) {
		@Pc(8) int local8 = arg0.anInt2856;
		@Pc(12) Class396 local12 = arg0.method4417(27750);
		@Pc(17) int local17 = arg0.aClass104_7.method9032();
		if (local17 == -1 || arg0.aBoolean369) {
			local8 = arg0.anInt2838;
		} else if (local17 == local12.anInt10407 || local12.anInt10410 == local17 || local17 == local12.anInt10421 || local17 == local12.anInt10430) {
			local8 = arg0.anInt2859;
		} else if (local12.anInt10423 == local17 || local17 == local12.anInt10422 || local12.anInt10388 == local17 || local12.anInt10399 == local17) {
			local8 = arg0.anInt2841;
		}
		return local8;
	}
}
