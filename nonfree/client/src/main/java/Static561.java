import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static561 {

	@OriginalMember(owner = "client!ro", name = "j", descriptor = "Lclient!m;")
	public static final Class235 aClass235_49 = new Class235(61);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(ZII)Z")
	public static boolean method8784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x60000) != 0 | Static480.method7028(arg0, arg1) || Static161.method2562(arg1, arg0) || Static143.method2370(arg1, arg0);
	}
}
