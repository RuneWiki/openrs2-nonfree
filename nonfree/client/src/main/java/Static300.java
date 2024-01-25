import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static300 {

	@OriginalMember(owner = "client!kca", name = "f", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6;

	@OriginalMember(owner = "client!kca", name = "d", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array7;

	@OriginalMember(owner = "client!kca", name = "e", descriptor = "[[I")
	public static int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!kca", name = "c", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_57 = new Class387(8, 8);

	@OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
	public static int anInt5167 = 0;

	@OriginalMember(owner = "client!kca", name = "a", descriptor = "(III)Z")
	public static boolean method4404(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}
}
