import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!rk", name = "D", descriptor = "Lclient!lm;")
	public static Class134 aClass134_123;

	@OriginalMember(owner = "client!rk", name = "y", descriptor = "Z")
	public static volatile boolean aBoolean454 = true;

	@OriginalMember(owner = "client!rk", name = "z", descriptor = "[I")
	public static final int[] anIntArray532 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rk", name = "B", descriptor = "Ljava/lang/String;")
	public static final String aString209 = "shake:";

	@OriginalMember(owner = "client!rk", name = "E", descriptor = "[S")
	public static short[] aShortArray87 = new short[256];

	@OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
	public static void method4762() {
		for (@Pc(3) int local3 = -1; local3 < Static167.anInt3454; local3++) {
			@Pc(12) int local12;
			if (local3 == -1) {
				local12 = 2047;
			} else {
				local12 = Static212.anIntArray415[local3];
			}
			@Pc(20) Class10_Sub1_Sub2_Sub2 local20 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local12];
			if (local20 != null) {
				Static283.method4991(local20.method3402(), local20);
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "(BI)Lclient!pr;")
	public static Class162 method4763(@OriginalArg(1) int arg0) {
		@Pc(5) Class37 local5 = Static352.aClass37_111;
		@Pc(14) Class162 local14;
		synchronized (Static352.aClass37_111) {
			local14 = (Class162) Static352.aClass37_111.method915((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static346.aClass134_149.method3009(Static61.method1153(arg0), Static303.method5262(arg0));
		local14 = new Class162();
		local14.anInt4896 = arg0;
		if (local34 != null) {
			local14.method4319(new Class1_Sub21(local34));
		}
		@Pc(57) Class37 local57 = Static352.aClass37_111;
		synchronized (Static352.aClass37_111) {
			Static352.aClass37_111.method922((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
	public static void method4765() {
		if (Static124.aBoolean197) {
			return;
		}
		if (Static317.aBoolean521) {
			Static143.aFloat21 = (int) Static143.aFloat21 - 65 & 0xFFFFFF80;
		} else {
			Static93.aFloat9 += (-24.0F - Static93.aFloat9) / 2.0F;
		}
		Static209.aBoolean344 = true;
		Static124.aBoolean197 = true;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)V")
	public static void method4767(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub2_Sub15 local13 = Static17.method307(12, arg1);
		local13.method4783();
		local13.anInt5461 = arg0;
	}
}
