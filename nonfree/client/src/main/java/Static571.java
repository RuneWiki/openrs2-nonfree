import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static571 {

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "Lclient!jb;")
	public static Class169 aClass169_1;

	@OriginalMember(owner = "client!uga", name = "m", descriptor = "I")
	public static int anInt9399;

	@OriginalMember(owner = "client!uga", name = "c", descriptor = "I")
	public static int anInt9391 = 0;

	@OriginalMember(owner = "client!uga", name = "g", descriptor = "I")
	public static int anInt9395 = 0;

	@OriginalMember(owner = "client!uga", name = "k", descriptor = "[F")
	public static final float[] aFloatArray73 = new float[2];

	@OriginalMember(owner = "client!uga", name = "n", descriptor = "Z")
	public static volatile boolean aBoolean684 = false;

	@OriginalMember(owner = "client!uga", name = "a", descriptor = "(IBI)Z")
	public static boolean method7845(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}
}
