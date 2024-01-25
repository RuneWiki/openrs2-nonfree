import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!ni", name = "m", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray14;

	@OriginalMember(owner = "client!ni", name = "i", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray27 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!ni", name = "k", descriptor = "[I")
	public static final int[] anIntArray415 = new int[1000];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)[Lclient!lg;")
	public static Class201[] method5188() {
		return new Class201[] { Static284.aClass201_25, Static229.aClass201_46, Static166.aClass201_16, Static329.aClass201_32, Static331.aClass201_33, Static230.aClass201_34, Static72.aClass201_15, Static523.aClass201_48, Static310.aClass201_43, Static55.aClass201_10, Static50.aClass201_7, Static325.aClass201_47, Static289.aClass201_26, Static239.aClass201_21 };
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILjava/awt/Component;Lclient!gba;II)Lclient!hq;")
	public static Class141 method5189(@OriginalArg(0) int arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) int arg3) {
		if (Static426.anInt7216 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(32) Class141 local32 = (Class141) Class.forName("Class141_Sub1").getDeclaredConstructor().newInstance();
			local32.anIntArray450 = new int[(Static582.aBoolean692 ? 2 : 1) * 256];
			local32.anInt6753 = arg3;
			local32.method5534(arg1);
			local32.anInt6758 = (arg3 & -1024) + 1024;
			if (local32.anInt6758 > 16384) {
				local32.anInt6758 = 16384;
			}
			local32.method5533(local32.anInt6758);
			if (Static335.anInt5959 > 0 && Static161.aClass333_1 == null) {
				Static161.aClass333_1 = new Class333();
				Static161.aClass333_1.aClass114_11 = arg2;
				arg2.method2498(Static161.aClass333_1, Static335.anInt5959);
			}
			if (Static161.aClass333_1 != null) {
				if (Static161.aClass333_1.aClass141Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static161.aClass333_1.aClass141Array1[arg0] = local32;
			}
			return local32;
		} catch (@Pc(107) Throwable local107) {
			try {
				@Pc(113) Class141_Sub2 local113 = new Class141_Sub2(arg2, arg0);
				local113.anInt6753 = arg3;
				local113.anIntArray450 = new int[(Static582.aBoolean692 ? 2 : 1) * 256];
				local113.method5534(arg1);
				local113.anInt6758 = 16384;
				local113.method5533(local113.anInt6758);
				if (Static335.anInt5959 > 0 && Static161.aClass333_1 == null) {
					Static161.aClass333_1 = new Class333();
					Static161.aClass333_1.aClass114_11 = arg2;
					arg2.method2498(Static161.aClass333_1, Static335.anInt5959);
				}
				if (Static161.aClass333_1 != null) {
					if (Static161.aClass333_1.aClass141Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static161.aClass333_1.aClass141Array1[arg0] = local113;
				}
				return local113;
			} catch (@Pc(172) Throwable local172) {
				return new Class141();
			}
		}
	}
}
