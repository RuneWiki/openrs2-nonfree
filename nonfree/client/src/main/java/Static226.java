import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
	public static int anInt4534;

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
	public static int anInt4529 = 0;

	@OriginalMember(owner = "client!jg", name = "d", descriptor = "Lclient!h;")
	public static final Class114 aClass114_93 = new Class114("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!jg", name = "f", descriptor = "[I")
	public static final int[] anIntArray333 = new int[200];

	@OriginalMember(owner = "client!jg", name = "h", descriptor = "Lclient!h;")
	public static final Class114 aClass114_94 = new Class114("flash2:", "blinken2:", "clignotant2:", "flash2:");

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BLclient!vp;)Lclient!vp;")
	public static Class309 method3961(@OriginalArg(1) Class309 arg0) {
		@Pc(11) Class309 local11 = Static62.method1756(arg0);
		if (local11 == null) {
			local11 = arg0.aClass309_13;
		}
		return local11;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILclient!kda;B)Lclient!lg;")
	public static Class177 method3962(@OriginalArg(0) int arg0, @OriginalArg(1) Class160 arg1) {
		@Pc(17) byte[] local17 = arg1.method4216(arg0);
		return local17 == null ? null : new Class177(local17);
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(B)V")
	public static void method3964() {
		Static392.anInt6841 = 0;
		Static395.anInt6903 = 0;
		Static289.anInt5647 = 0;
		Static79.anInt2108 = 0;
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII)I")
	public static int method3965(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg0 >>> 31;
		return (local12 + arg0) / arg1 - local12;
	}
}
