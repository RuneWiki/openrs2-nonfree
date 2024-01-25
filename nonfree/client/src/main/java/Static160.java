import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!it", name = "K", descriptor = "Lclient!b;")
	public static Class20 aClass20_79;

	@OriginalMember(owner = "client!it", name = "c", descriptor = "[I")
	public static final int[] anIntArray604 = new int[5];

	@OriginalMember(owner = "client!it", name = "I", descriptor = "[Z")
	public static final boolean[] aBooleanArray129 = new boolean[100];

	@OriginalMember(owner = "client!it", name = "J", descriptor = "[Lclient!ee;")
	public static final Class67[] aClass67Array3 = new Class67[4];

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIII)V")
	public static void method4987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static13.aByteArrayArrayArray17 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IIILjava/awt/Component;Lclient!mj;)Lclient!it;")
	public static Class119 method4992(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) Class156 arg3) {
		if (Static374.anInt6244 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(40) Class119 local40 = (Class119) Class.forName("Class119_Sub1").getDeclaredConstructor().newInstance();
			local40.anIntArray603 = new int[(Static340.aBoolean439 ? 2 : 1) * 256];
			local40.anInt5532 = arg1;
			local40.method4993(arg2);
			local40.anInt5529 = (arg1 & 0xFFFFFC00) + 1024;
			if (local40.anInt5529 > 16384) {
				local40.anInt5529 = 16384;
			}
			local40.method4978(local40.anInt5529);
			if (Static2.anInt60 > 0 && Static254.aClass237_2 == null) {
				Static254.aClass237_2 = new Class237();
				Static254.aClass237_2.aClass156_5 = arg3;
				arg3.method3658(Static254.aClass237_2, Static2.anInt60);
			}
			if (Static254.aClass237_2 != null) {
				if (Static254.aClass237_2.aClass119Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static254.aClass237_2.aClass119Array1[arg0] = local40;
			}
			return local40;
		} catch (@Pc(112) Throwable local112) {
			try {
				@Pc(118) Class119_Sub2 local118 = new Class119_Sub2(arg3, arg0);
				local118.anInt5532 = arg1;
				local118.anIntArray603 = new int[(Static340.aBoolean439 ? 2 : 1) * 256];
				local118.method4993(arg2);
				local118.anInt5529 = 16384;
				local118.method4978(local118.anInt5529);
				if (Static2.anInt60 > 0 && Static254.aClass237_2 == null) {
					Static254.aClass237_2 = new Class237();
					Static254.aClass237_2.aClass156_5 = arg3;
					arg3.method3658(Static254.aClass237_2, Static2.anInt60);
				}
				if (Static254.aClass237_2 != null) {
					if (Static254.aClass237_2.aClass119Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static254.aClass237_2.aClass119Array1[arg0] = local118;
				}
				return local118;
			} catch (@Pc(177) Throwable local177) {
				return new Class119();
			}
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Lclient!b;Lclient!oi;ILclient!b;)V")
	public static void method4994(@OriginalArg(0) Class20 arg0, @OriginalArg(1) Interface7 arg1, @OriginalArg(3) Class20 arg2) {
		Static61.anInterface7_1 = arg1;
		Static299.aClass20_74 = arg0;
		Static373.aClass20_97 = arg2;
		if (Static373.aClass20_97 != null) {
			Static337.anInt5692 = Static373.aClass20_97.method231(1);
		}
		if (Static299.aClass20_74 != null) {
			Static235.anInt4200 = Static299.aClass20_74.method231(1);
		}
	}
}
