import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "Lclient!la;")
	public static final Class136 aClass136_194 = new Class136(80, 1);

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "Z")
	public static boolean aBoolean492 = false;

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIZ)Z")
	public static boolean method5866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}
}
