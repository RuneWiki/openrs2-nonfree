import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ir", name = "e", descriptor = "I")
	public static int anInt3220;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "I")
	public static int anInt3221;

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "F")
	public static float aFloat63;

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "I")
	public static int anInt3219 = 0;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_159 = new Class159("Continue", "Weiter", "Continuer", "Continuar");

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "Z")
	public static boolean aBoolean255 = false;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "Lclient!ub;")
	public static Class198 aClass198_108 = new Class198(64);

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "I")
	public static int anInt3222 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public static void method2945() {
		Static264.aClass92_3.method2618();
		Static258.aClass127_1.method3585();
		if (Static338.aClass1_1 != null) {
			Static338.aClass1_1.method14(Static300.aCanvas5);
		}
		Static76.aClient1.method868();
		Static300.aCanvas5.setBackground(Color.black);
		Static284.anInt5597 = -1;
		Static264.aClass92_3 = Static195.method3697(Static300.aCanvas5);
		Static258.aClass127_1 = Static214.method1927(Static300.aCanvas5);
		if (Static338.aClass1_1 != null) {
			Static338.aClass1_1.method11(Static300.aCanvas5);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!pl;IIIII)V")
	public static void method2946(@OriginalArg(0) Class158 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5989 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub33_Sub1Array3[local4] != null) {
				arg0.anInt5989++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5989; local22++) {
			@Pc(31) int local31 = Static134.anIntArrayArrayArray17[arg1][arg2][arg3];
			@Pc(40) Class4_Sub33_Sub1 local40;
			while (local31 != 0) {
				local40 = Static25.aClass4_Sub33_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass4_Sub33_Sub1Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static134.anIntArrayArrayArray17[arg1][arg4][arg5];
			while (local31 != 0) {
				local40 = Static25.aClass4_Sub33_Sub1Array1[(local31 & 0xFF) - 1];
				local31 >>>= 0x8;
				if (local40 == arg0.aClass4_Sub33_Sub1Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(85) int local85 = local22; local85 < arg0.anInt5989 - 1; local85++) {
				arg0.aClass4_Sub33_Sub1Array3[local85] = arg0.aClass4_Sub33_Sub1Array3[local85 + 1];
			}
			arg0.anInt5989--;
		}
	}
}
