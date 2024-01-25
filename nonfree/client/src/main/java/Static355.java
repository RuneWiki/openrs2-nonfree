import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static355 {

	@OriginalMember(owner = "client!wo", name = "J", descriptor = "I")
	public static int anInt6751;

	@OriginalMember(owner = "client!wo", name = "L", descriptor = "I")
	public static int anInt6753 = 64;

	@OriginalMember(owner = "client!wo", name = "N", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '[', ']', '#' };

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)V")
	public static void method5699(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static212.aClass106ArrayArrayArray2 = Static118.aClass106ArrayArrayArray1;
			Static108.aClass77Array2 = Static79.aClass77Array5;
		} else {
			Static212.aClass106ArrayArrayArray2 = Static293.aClass106ArrayArrayArray3;
			Static108.aClass77Array2 = Static129.aClass77Array3;
		}
		Static279.anInt5583 = Static212.aClass106ArrayArrayArray2.length;
	}
}
