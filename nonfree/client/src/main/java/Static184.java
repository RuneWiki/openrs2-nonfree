import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static184 {

	@OriginalMember(owner = "client!ir", name = "N", descriptor = "I")
	public static int anInt3243;

	@OriginalMember(owner = "client!ir", name = "Q", descriptor = "I")
	public static int anInt3246;

	@OriginalMember(owner = "client!ir", name = "R", descriptor = "I")
	public static int anInt3247;

	@OriginalMember(owner = "client!ir", name = "S", descriptor = "I")
	public static int anInt3248;

	@OriginalMember(owner = "client!ir", name = "U", descriptor = "I")
	public static int anInt3250 = 0;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(II)Ljava/lang/String;")
	public static String method2674(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(II)I")
	public static int method2675(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}
}
