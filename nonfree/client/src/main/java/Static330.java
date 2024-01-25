import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!nl", name = "G", descriptor = "Z")
	public static boolean aBoolean466;

	@OriginalMember(owner = "client!nl", name = "I", descriptor = "F")
	public static float aFloat128;

	@OriginalMember(owner = "client!nl", name = "K", descriptor = "[I")
	public static final int[] anIntArray435 = new int[5];

	@OriginalMember(owner = "client!nl", name = "N", descriptor = "Lclient!dm;")
	public static final Class73 aClass73_51 = new Class73();

	@OriginalMember(owner = "client!nl", name = "P", descriptor = "Lclient!nba;")
	public static Class12_Sub37 aClass12_Sub37_1 = null;

	@OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
	public static int anInt6291 = -1;

	@OriginalMember(owner = "client!nl", name = "b", descriptor = "(IZ)I")
	public static int method5269(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
