import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static258 {

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!ka", name = "h", descriptor = "Lclient!gda;")
	public static Class114 aClass114_10;

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Lclient!fca;")
	public static final Class97 aClass97_24 = new Class97(1);

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "[I")
	public static final int[] anIntArray241 = new int[3];

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I")
	public static int method4158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static429.anIntArrayArray47 == null ? 0 : Static429.anIntArrayArray47[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z")
	public static boolean method4159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x20) != 0;
	}
}
