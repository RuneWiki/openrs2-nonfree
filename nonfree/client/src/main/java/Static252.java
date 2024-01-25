import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!tq;")
	public static Class191 aClass191_161;

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString44;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "Z")
	public static boolean aBoolean454 = true;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V")
	public static void method4564(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub11_Sub19 local13 = Static306.method5411(6, arg0);
		local13.method5539();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method4566() {
		@Pc(3) Class67[] local3 = Class114.aClass67Array1;
		synchronized (Class114.aClass67Array1) {
			for (@Pc(12) int local12 = 0; local12 < Class114.aClass67Array1.length; local12++) {
				Class114.aClass67Array1[local12] = new Class67();
				Static81.anIntArray194[local12] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIIII)Lclient!bm;")
	public static Class22 method4567(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg2 * 76724863L ^ (long) arg3 * 97549L ^ (long) arg4 * 67481L ^ (long) arg5 * 475427L ^ (long) arg1 * 986053L ^ (long) arg0 * 32147369L;
		@Pc(46) Class22 local46 = (Class22) Static198.aClass119_114.method3311(local33);
		if (local46 == null) {
			local46 = Static214.aClass4_9.method4236(arg4, arg3, arg5, arg1, arg0, arg2);
			Static198.aClass119_114.method3308(local46, local33);
			return local46;
		} else {
			return local46;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	public static void method4569() {
		if (Static296.aBoolean536 && Static92.aClass97_2.method5672(81) && Static117.anInt2590 > 2) {
			Static78.method1807((Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249.aClass2_249);
		} else {
			Static78.method1807((Class2_Sub13) Static91.aClass216_22.aClass2_251.aClass2_249);
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZJ)V")
	public static void method4575(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(12) InterruptedException local12) {
		}
	}
}
