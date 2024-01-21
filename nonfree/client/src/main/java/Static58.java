import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ie", name = "F", descriptor = "[Lclient!t;")
	public static Class8_Sub1_Sub3_Sub3[] aClass8_Sub1_Sub3_Sub3Array22;

	@OriginalMember(owner = "client!ie", name = "G", descriptor = "I")
	public static int anInt1530;

	@OriginalMember(owner = "client!ie", name = "j", descriptor = "Lclient!lf;")
	public static Class48 aClass48_29 = new Class48(64);

	@OriginalMember(owner = "client!ie", name = "w", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!ie", name = "x", descriptor = "Lclient!af;")
	public static Class7 aClass7_10 = new Class7(4096);

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "Lclient!m;")
	public static Class49 aClass49_7 = new Class49();

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "[I")
	public static int[] anIntArray191 = new int[50];

	@OriginalMember(owner = "client!ie", name = "D", descriptor = "Lclient!ic;")
	public static Class34 aClass34_723 = Static56.method816(":chalreq:");

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIII)I")
	public static int method902(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 179) {
			arg0 /= 2;
		}
		if (arg1 > 192) {
			arg0 /= 2;
		}
		if (arg1 > 217) {
			arg0 /= 2;
		}
		if (arg1 > 243) {
			arg0 /= 2;
		}
		return (arg2 / 4 << 10) - (-(arg0 / 32 << 7) - (arg1 / 2));
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IILjava/awt/Component;ILclient!je;)Lclient!db;")
	public static Class13 method903(@OriginalArg(1) int arg0, @OriginalArg(2) Component arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class40 arg3) {
		if (Static23.anInt713 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(34) Class13 local34 = (Class13) Class.forName("Class13_Sub2").getDeclaredConstructor().newInstance();
			local34.anIntArray343 = new int[(Static23.aBoolean34 ? 2 : 1) * 256];
			local34.anInt2561 = arg2;
			local34.method1610(arg1);
			local34.anInt2563 = (-1024 & arg2) + 1024;
			if (local34.anInt2563 > 16384) {
				local34.anInt2563 = 16384;
			}
			local34.method1608(local34.anInt2563);
			if (Static134.anInt3165 > 0 && Static30.aClass53_1 == null) {
				Static30.aClass53_1 = new Class53();
				Static30.aClass53_1.aClass40_2 = arg3;
				arg3.method951(Static30.aClass53_1, Static134.anInt3165);
			}
			if (Static30.aClass53_1 != null) {
				if (Static30.aClass53_1.aClass13Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static30.aClass53_1.aClass13Array1[arg0] = local34;
			}
			return local34;
		} catch (@Pc(106) Throwable local106) {
			try {
				@Pc(112) Class13_Sub1 local112 = new Class13_Sub1(arg3, arg0);
				local112.anInt2561 = arg2;
				local112.anIntArray343 = new int[(Static23.aBoolean34 ? 2 : 1) * 256];
				local112.method1610(arg1);
				local112.anInt2563 = 16384;
				local112.method1608(local112.anInt2563);
				if (Static134.anInt3165 > 0 && Static30.aClass53_1 == null) {
					Static30.aClass53_1 = new Class53();
					Static30.aClass53_1.aClass40_2 = arg3;
					arg3.method951(Static30.aClass53_1, Static134.anInt3165);
				}
				if (Static30.aClass53_1 != null) {
					if (Static30.aClass53_1.aClass13Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static30.aClass53_1.aClass13Array1[arg0] = local112;
				}
				return local112;
			} catch (@Pc(176) Throwable local176) {
				return new Class13();
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
	public static void method905() {
		aClass49_7 = null;
		aClass48_29 = null;
		anIntArray191 = null;
		aClass34_723 = null;
		aClass7_10 = null;
		aClass8_Sub1_Sub3_Sub3Array22 = null;
	}
}
