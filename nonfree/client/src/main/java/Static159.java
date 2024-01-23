import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	public static int anInt3527;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "I")
	public static int anInt3532;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "I")
	public static int anInt3526 = 0;

	@OriginalMember(owner = "client!li", name = "g", descriptor = "[I")
	public static int[] anIntArray321 = new int[14];

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Z")
	public static boolean aBoolean228 = false;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	public static int anInt3534 = 0;

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(II)V")
	public static void method2555() {
		Static105.aClass89_13.method2273(5);
		Static62.aClass89_11.method2273(5);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V")
	public static void method2556(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		Static173.aClass89_25 = new Class89(arg1);
		Static271.aClass89_43 = new Class89(arg0);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I[Ljava/lang/String;II)Ljava/lang/String;")
	public static String method2558(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(23) String local23 = arg0[arg2];
			return local23 == null ? "null" : local23.toString();
		} else {
			@Pc(35) int local35 = arg1 + arg2;
			@Pc(37) int local37 = 0;
			for (@Pc(39) int local39 = arg2; local39 < local35; local39++) {
				@Pc(50) String local50 = arg0[local39];
				if (local50 == null) {
					local37 += 4;
				} else {
					local37 += local50.length();
				}
			}
			@Pc(68) StringBuffer local68 = new StringBuffer(local37);
			for (@Pc(70) int local70 = arg2; local70 < local35; local70++) {
				@Pc(77) String local77 = arg0[local70];
				if (local77 == null) {
					local68.append("null");
				} else {
					local68.append(local77);
				}
			}
			return local68.toString();
		}
	}
}
