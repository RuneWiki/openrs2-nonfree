import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static563 {

	@OriginalMember(owner = "client!vq", name = "H", descriptor = "Lclient!sea;")
	public static Class308 aClass308_188;

	@OriginalMember(owner = "client!vq", name = "I", descriptor = "I")
	public static int anInt9345;

	@OriginalMember(owner = "client!vq", name = "K", descriptor = "F")
	public static float aFloat236;

	@OriginalMember(owner = "client!vq", name = "C", descriptor = "I")
	public static int anInt9342 = 0;

	@OriginalMember(owner = "client!vq", name = "E", descriptor = "Lclient!en;")
	public static final Class84 aClass84_9 = new Class84("", 17);

	@OriginalMember(owner = "client!vq", name = "F", descriptor = "[Z")
	public static final boolean[] aBooleanArray39 = new boolean[8];

	@OriginalMember(owner = "client!vq", name = "J", descriptor = "Z")
	public static boolean aBoolean697 = false;

	@OriginalMember(owner = "client!vq", name = "a", descriptor = "(IZI)Z")
	public static boolean method7617(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static433.method3811(arg1, arg0) || Static391.method5620(arg0, arg1);
	}
}
