import jagex3.jagmisc.jagmisc;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!ln", name = "k", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray21;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!ci;")
	public static Class38 aClass38_47;

	@OriginalMember(owner = "client!ln", name = "r", descriptor = "Lclient!ci;")
	public static Class38 aClass38_48;

	@OriginalMember(owner = "client!ln", name = "e", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_59 = new Class21("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_60 = new Class21("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "[Lclient!ir;")
	public static final Class112[] aClass112Array1 = new Class112[2048];

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray8 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
	public static int anInt4540 = 0;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "Lclient!qv;")
	public static final Class214 aClass214_144 = new Class214(49, -2);

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Ljava/awt/Canvas;ILclient!ul;Lclient!l;I)Lclient!qa;")
	public static Class30 method3887(@OriginalArg(0) Canvas arg0, @OriginalArg(2) Class255 arg1, @OriginalArg(3) Interface4 arg2, @OriginalArg(4) int arg3) {
		return new c(arg3, arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)I")
	public static int method3889() {
		return Static190.anInt3813;
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	public static void method3891() {
		if (Static427.anInt7334 == 6) {
			Static427.anInt7334 = 7;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(BLclient!ul;)[Lclient!vi;")
	public static Class261[] method3893(@OriginalArg(1) Class255 arg0) {
		if (!arg0.method5826()) {
			return new Class261[0];
		}
		@Pc(16) Class87 local16 = arg0.method5844();
		while (local16.anInt2679 == 0) {
			Static77.method1653(10L);
		}
		if (local16.anInt2679 == 2) {
			return new Class261[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject3;
		@Pc(44) Class261[] local44 = new Class261[local38.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local44.length; local51++) {
			@Pc(57) Class261 local57 = new Class261();
			local44[local51] = local57;
			local57.anInt7470 = local38[local51 << 2];
			local57.anInt7469 = local38[(local51 << 2) + 1];
			local57.anInt7468 = local38[(local51 << 2) + 2];
			local57.anInt7471 = local38[(local51 << 2) + 3];
		}
		return local44;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V")
	public static void method3894(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			Static30.aClass30_3 = Static323.method2082(arg1, Static357.anInterface4_8, Static390.aClass255_5, Static409.aCanvas7, Static157.aClass185_Sub1_1.anInt5572 * 2);
		} else {
			if (arg0) {
				Static30.aClass30_3 = Static323.method2082(0, Static357.anInterface4_8, Static390.aClass255_5, Static409.aCanvas7, 0);
				Static30.aClass30_3.l(0);
				@Pc(38) Class84 local38 = Static413.method5731(Static300.aClass38_60, Static107.anInt2318);
				@Pc(47) Class18 local47 = Static30.aClass30_3.method2054(local38, Static472.method2843(Static143.aClass38_30, Static107.anInt2318));
				Static122.method2305(true, local47, Static299.aClass21_87.method362(Static168.anInt3290));
				Static30.aClass30_3.method2042();
				Static449.method6143();
				Static30.aClass30_3.method2086();
			}
			try {
				Static30.aClass30_3 = Static323.method2082(arg1, Static357.anInterface4_8, Static390.aClass255_5, Static409.aCanvas7, Static157.aClass185_Sub1_1.anInt5572 * 2);
				if (Static30.aClass30_3.method2046()) {
					@Pc(78) boolean local78 = true;
					try {
						local78 = jagmisc.getTotalPhysicalMemory() > 268435456L;
					} catch (@Pc(88) Throwable local88) {
					}
					@Pc(94) Class4_Sub18 local94;
					if (local78) {
						local94 = Static30.aClass30_3.method2051(146800640);
					} else {
						local94 = Static30.aClass30_3.method2051(104857600);
					}
					Static30.aClass30_3.method2060(local94);
				}
			} catch (@Pc(105) Throwable local105) {
				Static30.aClass30_3 = Static323.method2082(0, Static357.anInterface4_8, Static390.aClass255_5, Static409.aCanvas7, 0);
				arg1 = 0;
			}
		}
		Static192.anInt3828 = arg1;
		Static191.method3428();
		if (!Static30.aClass30_3.method2070()) {
			Static271.anInt5145 = 1;
		}
		Static30.aClass30_3.method2099(Static271.anInt5145);
		Static30.aClass30_3.method2049(0);
		Static30.aClass30_3.K(8);
		Static117.aClass72_5 = Static30.aClass30_3.method2103();
		Static113.aClass72_2 = Static30.aClass30_3.method2103();
		Static418.method2686();
		Static30.aClass30_3.method2068(!Static157.aClass185_Sub1_1.aBoolean406);
		if (Static30.aClass30_3.method2033()) {
			Static80.method1689(Static157.aClass185_Sub1_1.aBoolean401);
		}
		Static124.method2328(Static193.anInt3853 >> 3, Static30.aClass30_3, Static301.anInt5585 >> 3);
		Static94.method1834();
		Static316.aBoolean426 = false;
	}
}
