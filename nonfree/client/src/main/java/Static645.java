import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static645 {

	@OriginalMember(owner = "client!ug", name = "U", descriptor = "Lclient!ui;")
	public static final Class369 aClass369_9 = new Class369();

	@OriginalMember(owner = "client!ug", name = "W", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_118 = new Class286(41, 11);

	@OriginalMember(owner = "client!ug", name = "S", descriptor = "Z")
	public static boolean aBoolean754 = false;

	@OriginalMember(owner = "client!ug", name = "V", descriptor = "Lclient!pi;")
	public static final Class286 aClass286_119 = new Class286(64, -1);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IB)Z")
	public static boolean method8716(@OriginalArg(0) int arg0) {
		return arg0 == 3 || arg0 == 4 || arg0 == 5 || arg0 == 6;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIB)Z")
	public static boolean method8717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}
}
