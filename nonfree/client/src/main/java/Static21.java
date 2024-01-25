import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!au", name = "p", descriptor = "I")
	public static int anInt707;

	@OriginalMember(owner = "client!au", name = "l", descriptor = "Lclient!op;")
	public static final Class182 aClass182_2 = new Class182("WTQA", 2);

	@OriginalMember(owner = "client!au", name = "s", descriptor = "Lclient!pi;")
	public static final Class189 aClass189_14 = new Class189("Loading - please wait.", "Ladevorgang - bitte warte.", "Chargement en cours. Veuillez patienter.", "Carregando. Aguarde.");

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
	public static void method464() {
		Static152.method2474(Static374.aClass20_Sub1_1.anInt2352);
		@Pc(15) int local15 = (Static223.anInt7618 >> 3) + (Static276.anInt5105 >> 10);
		Static6.anInt93 = Static379.aClass7_Sub2_Sub3_Sub2_2.aByte77 = 0;
		@Pc(28) int local28 = (Static57.anInt5085 >> 3) + (Static265.anInt5008 >> 10);
		Static379.aClass7_Sub2_Sub3_Sub2_2.method3517(8, 8);
		Static378.aByteArrayArray21 = new byte[18][];
		Static242.aByteArrayArray9 = new byte[18][];
		Static299.aByteArrayArray15 = new byte[18][];
		Static295.anIntArrayArray34 = new int[18][4];
		Static319.anIntArray115 = new int[18];
		Static81.anIntArray204 = new int[18];
		Static371.anIntArray402 = new int[18];
		Static184.anIntArray230 = new int[18];
		Static29.aByteArrayArray18 = new byte[18][];
		Static231.aByteArrayArray8 = new byte[18][];
		Static322.anIntArray372 = new int[18];
		Static414.anIntArray465 = new int[18];
		@Pc(74) int local74 = 0;
		@Pc(92) int local92;
		for (@Pc(83) int local83 = (local15 - (Static40.anInt1089 >> 4)) / 8; local83 <= (local15 + (Static40.anInt1089 >> 4)) / 8; local83++) {
			for (local92 = (local28 - (Static44.anInt7276 >> 4)) / 8; local92 <= ((Static44.anInt7276 >> 4) + local28) / 8; local92++) {
				@Pc(100) int local100 = (local83 << 8) + local92;
				Static81.anIntArray204[local74] = local100;
				Static319.anIntArray115[local74] = Static64.aClass32_28.method807("m" + local83 + "_" + local92);
				Static371.anIntArray402[local74] = Static64.aClass32_28.method807("l" + local83 + "_" + local92);
				Static322.anIntArray372[local74] = Static64.aClass32_28.method807("n" + local83 + "_" + local92);
				Static414.anIntArray465[local74] = Static64.aClass32_28.method807("um" + local83 + "_" + local92);
				Static184.anIntArray230[local74] = Static64.aClass32_28.method807("ul" + local83 + "_" + local92);
				if (Static322.anIntArray372[local74] == -1) {
					Static319.anIntArray115[local74] = -1;
					Static371.anIntArray402[local74] = -1;
					Static414.anIntArray465[local74] = -1;
					Static184.anIntArray230[local74] = -1;
				}
				local74++;
			}
		}
		for (local92 = local74; local92 < Static322.anIntArray372.length; local92++) {
			Static322.anIntArray372[local92] = -1;
			Static319.anIntArray115[local92] = -1;
			Static371.anIntArray402[local92] = -1;
			Static414.anIntArray465[local92] = -1;
			Static184.anIntArray230[local92] = -1;
		}
		Static226.method3380(true, local15, false, local28);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(Lclient!m;ILjava/awt/Canvas;I)Lclient!qa;")
	public static Class172 method466(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class172_Sub1(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(III)I")
	public static int method467(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg0 - 1 & arg1 >> 31;
		return local11 + (arg1 + (arg1 >>> 31)) % arg0;
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(CI)Z")
	public static boolean method468(@OriginalArg(0) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(B)Z")
	public static boolean method469() {
		@Pc(13) Class3_Sub14 local13 = (Class3_Sub14) Static184.aClass243_21.aClass3_231.aClass3_262;
		if (local13 == null || Static184.aClass243_21.aClass3_231 == local13) {
			return false;
		} else {
			if (local13.anInt2182 >= 2000) {
				local13.anInt2182 -= 2000;
			}
			return local13.anInt2182 == 1002;
		}
	}
}
