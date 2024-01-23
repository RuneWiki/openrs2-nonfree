import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
	public static int anInt308;

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "Lclient!th;")
	public static Class168 aClass168_13;

	@OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
	public static int anInt310;

	@OriginalMember(owner = "client!ao", name = "e", descriptor = "Z")
	public static boolean aBoolean17 = true;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(BI)V")
	public static void method305(@OriginalArg(1) int arg0) {
		if (arg0 == Static56.anInt1255) {
			@Pc(13) Interface4 local13 = Static246.anInterface4Array1[arg0];
			local13.method3792(Static117.anInt4600);
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIB)V")
	public static void method306(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static296.anIntArray530[arg1] = arg0;
		@Pc(14) Class1_Sub15 local14 = (Class1_Sub15) Static37.aClass186_4.method4570((long) arg1);
		if (local14 == null) {
			local14 = new Class1_Sub15(Static258.method3967() + 500L);
			Static37.aClass186_4.method4575((long) arg1, local14);
		} else {
			local14.aLong99 = Static258.method3967() + 500L;
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(III)I")
	public static int method307(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class1_Sub7 local13 = (Class1_Sub7) Static111.aClass186_7.method4570((long) arg0);
		if (local13 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local13.anIntArray165.length) {
			return local13.anIntArray165[arg1];
		} else {
			return 0;
		}
	}
}
