import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "F")
	public static float aFloat91;

	@OriginalMember(owner = "client!ur", name = "hb", descriptor = "Lclient!uf;")
	public static Class237 aClass237_119;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "[I")
	public static final int[] anIntArray593 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!vt;")
	public static final Class1_Sub43 aClass1_Sub43_2 = new Class1_Sub43(0, -1);

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!ur", name = "x", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_59 = new Class83(64);

	@OriginalMember(owner = "client!ur", name = "kb", descriptor = "I")
	public static int anInt7188 = 0;

	@OriginalMember(owner = "client!ur", name = "mb", descriptor = "I")
	public static int anInt7189 = 0;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method5564(@OriginalArg(1) String arg0) {
		@Pc(13) int local13 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local13; local17++) {
			local15 = Static57.method1009(arg0.charAt(local17)) + (local15 << 5) - local15;
		}
		return local15;
	}
}
