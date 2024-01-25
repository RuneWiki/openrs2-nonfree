import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static136 {

	@OriginalMember(owner = "client!gq", name = "k", descriptor = "Lclient!ph;")
	public static final Class193 aClass193_3 = new Class193("LIVE", 0);

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	public static int anInt2887 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)Z")
	public static boolean method2409(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(II)I")
	public static int method2410(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static137.anIntArrayArray15 == null ? 0 : Static137.anIntArrayArray15[arg0][arg1] & 0xFFFFFF;
	}
}
