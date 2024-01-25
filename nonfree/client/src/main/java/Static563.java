import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static563 {

	@OriginalMember(owner = "client!vl", name = "w", descriptor = "Lclient!oe;")
	public static final Class244 aClass244_60 = new Class244();

	@OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
	public static int anInt9901 = 2;

	@OriginalMember(owner = "client!vl", name = "G", descriptor = "I")
	public static int anInt9902 = 2;

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)I")
	public static int method8072(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 >>> 1;
		@Pc(13) int local13 = local7 | local7 >>> 1;
		@Pc(24) int local24 = local13 | local13 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return ~local42 & arg0;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)V")
	public static void method8077() {
		if (Static191.aBoolean294) {
			return;
		}
		Static65.aBoolean51 = true;
		if (Static214.aClass4_Sub19_Sub1_1.aBoolean255) {
			Static201.aFloat128 = (int) Static201.aFloat128 + 191 & 0xFFFFFF80;
		} else {
			Static429.aFloat208 += (24.0F - Static429.aFloat208) / 2.0F;
		}
		Static191.aBoolean294 = true;
	}
}
