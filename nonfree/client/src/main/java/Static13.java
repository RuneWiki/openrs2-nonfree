import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
	public static int anInt357;

	@OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
	public static int anInt358;

	@OriginalMember(owner = "client!bb", name = "M", descriptor = "Lclient!ci;")
	public static Class26 aClass26_3 = new Class26();

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(BI)V")
	public static void method342(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class1 local14 = Static204.aClass186_19.method4567(); local14 != null; local14 = Static204.aClass186_19.method4579()) {
			if ((long) arg0 == (local14.aLong247 >> 48 & 0xFFFFL)) {
				local14.method4767();
			}
		}
	}

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
	public static void method343() {
		Static255.aClass89_39.method2266();
	}
}
