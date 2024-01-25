import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_12 = new Class83(4);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(II)Lclient!ip;")
	public static Class39_Sub4 method1208(@OriginalArg(1) int arg0) {
		@Pc(7) Class188[] local7 = Class127.aClass188Array1;
		synchronized (Class127.aClass188Array1) {
			@Pc(32) Class39_Sub4 local32;
			if (arg0 >= Class127.aClass188Array1.length || Class127.aClass188Array1[arg0].method4537()) {
				local32 = new Class39_Sub4();
				local32.aClass39_Sub7Array1 = new Class39_Sub7[arg0];
				for (@Pc(56) int local56 = 0; local56 < arg0; local56++) {
					local32.aClass39_Sub7Array1[local56] = new Class39_Sub7();
				}
			} else {
				local32 = (Class39_Sub4) Class127.aClass188Array1[arg0].method4531();
				local32.method5616();
				@Pc(41) int local41 = Static393.anIntArray565[arg0]--;
			}
			return local32;
		}
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)Z")
	public static boolean method1210(@OriginalArg(1) int arg0) {
		return arg0 == 20 || arg0 == 5 || arg0 == 1010 || arg0 == 57 || arg0 == 23;
	}
}
