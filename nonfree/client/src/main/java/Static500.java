import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static500 {

	@OriginalMember(owner = "client!ro", name = "u", descriptor = "I")
	public static int anInt8429 = 0;

	@OriginalMember(owner = "client!ro", name = "x", descriptor = "Lclient!baa;")
	public static final Class25 aClass25_36 = new Class25(16);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Z")
	public static boolean method7264(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x10000) != 0;
	}

	@OriginalMember(owner = "client!ro", name = "f", descriptor = "(I)V")
	public static void method7268() {
		@Pc(12) Class3_Sub26 local12;
		for (local12 = (Class3_Sub26) Static588.aClass216_70.method5457(); local12 != null; local12 = (Class3_Sub26) Static588.aClass216_70.method5458()) {
			if (local12.aBoolean387) {
				local12.method8682();
			} else {
				local12.aBoolean386 = true;
				if (local12.anInt5296 >= 0 && local12.anInt5286 >= 0 && local12.anInt5296 < Static399.anInt7121 && local12.anInt5286 < Static24.anInt345) {
					Static487.method7156(local12);
				}
			}
		}
		for (local12 = (Class3_Sub26) Static48.aClass216_69.method5457(); local12 != null; local12 = (Class3_Sub26) Static48.aClass216_69.method5458()) {
			if (local12.aBoolean387) {
				local12.method8682();
			} else {
				local12.aBoolean386 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZI)I")
	public static int method7269(@OriginalArg(1) int arg0) {
		@Pc(13) int local13 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(27) int local27 = (arg0 * local19 >> 12) + 40960;
		return local13 * local27 >> 12;
	}
}
