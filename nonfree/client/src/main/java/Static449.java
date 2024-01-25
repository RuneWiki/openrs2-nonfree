import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static449 {

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "Lclient!ria;")
	public static Class303 aClass303_16;

	@OriginalMember(owner = "client!pt", name = "c", descriptor = "F")
	public static float aFloat129;

	@OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
	public static int anInt7346;

	@OriginalMember(owner = "client!pt", name = "k", descriptor = "[I")
	public static int[] anIntArray500;

	@OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
	public static int anInt7349 = 0;

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
	public static void method6406() {
		if (Static229.anInt4228 > 1) {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub19_1, 4);
		} else {
			Static305.aClass2_Sub49_15.method8848(Static305.aClass2_Sub49_15.aClass33_Sub19_1, 2);
		}
	}

	@OriginalMember(owner = "client!pt", name = "a", descriptor = "(IILclient!nd;)Lclient!iea;")
	public static Class31 method6408(@OriginalArg(1) int arg0, @OriginalArg(2) Class238 arg1) {
		@Pc(15) Class31 local15 = (Class31) Static442.aClass69_45.method1919((long) arg0);
		if (local15 == null) {
			if (Static236.aBoolean320) {
				local15 = Static141.aClass13_27.method8141(Static654.method3450(arg1, arg0), true);
			} else {
				local15 = Static183.method3128(arg1.method5580(arg0));
			}
			Static442.aClass69_45.method1917((long) arg0, local15);
		}
		return local15;
	}

	@OriginalMember(owner = "client!pt", name = "b", descriptor = "(I)V")
	public static void method6409() {
		for (@Pc(4) Class2_Sub7_Sub21 local4 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2772(); local4 != null; local4 = (Class2_Sub7_Sub21) Static177.aClass114_19.method2762()) {
			if (Static281.method4503(local4.anInt10014)) {
				Static320.method4910(local4);
			}
		}
	}
}
