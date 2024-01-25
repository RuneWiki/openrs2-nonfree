import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ps", name = "R", descriptor = "I")
	public static int anInt5803;

	@OriginalMember(owner = "client!ps", name = "K", descriptor = "[F")
	public static final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!ps", name = "N", descriptor = "Lclient!h;")
	public static final Class2_Sub13 aClass2_Sub13_1 = new Class2_Sub13(0, 0);

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IILclient!pb;Ljava/awt/Component;I)Lclient!in;")
	public static Class62 method4602(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class194 arg2, @OriginalArg(3) Component arg3) {
		if (Static150.anInt7358 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class62 local33 = (Class62) Class.forName("Class62_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray254 = new int[(Static240.aBoolean266 ? 2 : 1) * 256];
			local33.anInt2961 = arg1;
			local33.method2419(arg3);
			local33.anInt2958 = (arg1 & 0xFFFFFC00) + 1024;
			if (local33.anInt2958 > 16384) {
				local33.anInt2958 = 16384;
			}
			local33.method2413(local33.anInt2958);
			if (Static426.anInt7251 > 0 && Static196.aClass232_1 == null) {
				Static196.aClass232_1 = new Class232();
				Static196.aClass232_1.aClass194_5 = arg2;
				arg2.method4393(Static196.aClass232_1, Static426.anInt7251);
			}
			if (Static196.aClass232_1 != null) {
				if (Static196.aClass232_1.aClass62Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static196.aClass232_1.aClass62Array1[arg0] = local33;
			}
			return local33;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class62_Sub2 local117 = new Class62_Sub2(arg2, arg0);
				local117.anInt2961 = arg1;
				local117.anIntArray254 = new int[(Static240.aBoolean266 ? 2 : 1) * 256];
				local117.method2419(arg3);
				local117.anInt2958 = 16384;
				local117.method2413(local117.anInt2958);
				if (Static426.anInt7251 > 0 && Static196.aClass232_1 == null) {
					Static196.aClass232_1 = new Class232();
					Static196.aClass232_1.aClass194_5 = arg2;
					arg2.method4393(Static196.aClass232_1, Static426.anInt7251);
				}
				if (Static196.aClass232_1 != null) {
					if (Static196.aClass232_1.aClass62Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static196.aClass232_1.aClass62Array1[arg0] = local117;
				}
				return local117;
			} catch (@Pc(176) Throwable local176) {
				return new Class62();
			}
		}
	}

	@OriginalMember(owner = "client!ps", name = "f", descriptor = "(III)V")
	public static void method4603(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(arg1, 5);
		local8.method2574();
		local8.anInt3131 = arg0;
	}
}
