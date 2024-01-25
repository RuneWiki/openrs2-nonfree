import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!uu", name = "db", descriptor = "I")
	public static int anInt8464 = 0;

	@OriginalMember(owner = "client!uu", name = "eb", descriptor = "Lclient!h;")
	public static final Class114 aClass114_160 = new Class114("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!uu", name = "gb", descriptor = "[I")
	public static final int[] anIntArray694 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IB)V")
	public static void method7147() {
		Static491.anInt8374 = 1;
		Static178.anInt3810 = 2;
		Static118.anInt2858 = 0;
		Static141.aBoolean205 = false;
		Static249.aClass160_53 = null;
		Static141.anInt3296 = -1;
		Static52.anInt1509 = -1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBI)Z")
	public static boolean method7149(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static441.method6404(arg1, arg0) | (arg1 & 0x40000) != 0 || Static153.method3113(arg0, arg1);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBIII)V")
	public static void method7150(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(6) Class1_Sub9 local6 = (Class1_Sub9) Static497.aClass38_70.method1419(); local6 != null; local6 = (Class1_Sub9) Static497.aClass38_70.method1415()) {
			Static54.method3637(local6, arg3, arg0, arg2, arg1);
		}
		for (@Pc(36) Class1_Sub9 local36 = (Class1_Sub9) Static94.aClass38_20.method1419(); local36 != null; local36 = (Class1_Sub9) Static94.aClass38_20.method1415()) {
			@Pc(40) byte local40 = 1;
			@Pc(45) Class255 local45 = local36.aClass47_Sub2_Sub3_Sub1_1.method4356();
			if (local36.aClass47_Sub2_Sub3_Sub1_1.aBoolean343) {
				local40 = 0;
			} else if (local45.anInt7262 == local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039 || local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039 == local45.anInt7278 || local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039 == local45.anInt7259 || local45.anInt7300 == local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039) {
				local40 = 2;
			} else if (local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039 == local45.anInt7288 || local45.anInt7270 == local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039 || local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039 == local45.anInt7287 || local45.anInt7268 == local36.aClass47_Sub2_Sub3_Sub1_1.anInt5039) {
				local40 = 3;
			}
			if (local40 != local36.anInt2360) {
				@Pc(144) int local144 = Static396.method5973(local36.aClass47_Sub2_Sub3_Sub1_1);
				if (local36.anInt2359 != local144) {
					if (local36.aClass1_Sub12_Sub1_2 != null) {
						Static445.aClass1_Sub12_Sub3_2.method6363(local36.aClass1_Sub12_Sub1_2);
						local36.aClass1_Sub12_Sub1_2 = null;
					}
					local36.anInt2359 = local144;
				}
				local36.anInt2360 = local40;
			}
			local36.anInt2348 = local36.aClass47_Sub2_Sub3_Sub1_1.anInt8189;
			local36.anInt2363 = local36.aClass47_Sub2_Sub3_Sub1_1.anInt8189 + (local36.aClass47_Sub2_Sub3_Sub1_1.method4350() << 6);
			local36.anInt2353 = local36.aClass47_Sub2_Sub3_Sub1_1.anInt8191;
			local36.anInt2364 = local36.aClass47_Sub2_Sub3_Sub1_1.anInt8191 + (local36.aClass47_Sub2_Sub3_Sub1_1.method4350() << 6);
			Static54.method3637(local36, arg3, arg0, arg2, arg1);
		}
		for (@Pc(224) Class1_Sub9 local224 = (Class1_Sub9) Static527.aClass174_39.method4421(); local224 != null; local224 = (Class1_Sub9) Static527.aClass174_39.method4429()) {
			@Pc(228) byte local228 = 1;
			@Pc(233) Class255 local233 = local224.aClass47_Sub2_Sub3_Sub2_2.method4356();
			if (local224.aClass47_Sub2_Sub3_Sub2_2.aBoolean343) {
				local228 = 0;
			} else if (local233.anInt7262 == local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 || local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 == local233.anInt7278 || local233.anInt7259 == local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 || local233.anInt7300 == local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039) {
				local228 = 2;
			} else if (local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 == local233.anInt7288 || local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 == local233.anInt7270 || local233.anInt7287 == local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 || local224.aClass47_Sub2_Sub3_Sub2_2.anInt5039 == local233.anInt7268) {
				local228 = 3;
			}
			if (local228 != local224.anInt2360) {
				@Pc(320) int local320 = Static179.method3452(local224.aClass47_Sub2_Sub3_Sub2_2);
				if (local320 != local224.anInt2359) {
					if (local224.aClass1_Sub12_Sub1_2 != null) {
						Static445.aClass1_Sub12_Sub3_2.method6363(local224.aClass1_Sub12_Sub1_2);
						local224.aClass1_Sub12_Sub1_2 = null;
					}
					local224.anInt2359 = local320;
				}
				local224.anInt2360 = local228;
			}
			local224.anInt2348 = local224.aClass47_Sub2_Sub3_Sub2_2.anInt8189;
			local224.anInt2363 = local224.aClass47_Sub2_Sub3_Sub2_2.anInt8189 + (local224.aClass47_Sub2_Sub3_Sub2_2.method4350() << 6);
			local224.anInt2353 = local224.aClass47_Sub2_Sub3_Sub2_2.anInt8191;
			local224.anInt2364 = local224.aClass47_Sub2_Sub3_Sub2_2.anInt8191 + (local224.aClass47_Sub2_Sub3_Sub2_2.method4350() << 6);
			Static54.method3637(local224, arg3, arg0, arg2, arg1);
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IZ)Z")
	public static boolean method7151(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZILjava/util/Random;)I")
	public static int method7152(@OriginalArg(1) int arg0, @OriginalArg(2) Random arg1) {
		if (arg0 <= 0) {
			throw new IllegalArgumentException();
		} else if (Static183.method3500(arg0)) {
			return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg0 >> 32);
		} else {
			@Pc(41) int local41 = Integer.MIN_VALUE - (int) (4294967296L % (long) arg0);
			@Pc(44) int local44;
			do {
				local44 = arg1.nextInt();
			} while (local41 <= local44);
			return Static528.method7530(arg0, local44);
		}
	}
}
