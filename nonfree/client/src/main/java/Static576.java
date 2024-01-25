import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static576 {

	@OriginalMember(owner = "client!we", name = "e", descriptor = "Lclient!ll;")
	public static Class198 aClass198_13;

	@OriginalMember(owner = "client!we", name = "h", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray24 = new int[2][][];

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ILclient!od;)Ljava/lang/String;")
	public static String method8116(@OriginalArg(1) Class4_Sub36 arg0) {
		return arg0.aString145 == null || arg0.aString145.length() <= 0 ? arg0.aString146 : arg0.aString146 + Static223.aClass152_36.method3624(Static142.anInt3088) + arg0.aString145;
	}
}
