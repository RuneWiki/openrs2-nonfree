import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static395 {

	@OriginalMember(owner = "client!os", name = "a", descriptor = "I")
	public static int anInt6980;

	@OriginalMember(owner = "client!os", name = "b", descriptor = "I")
	public static int anInt6981;

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(I)Ljava/lang/String;")
	public static String method5582() {
		return Static289.aBoolean370 || Static330.aClass3_Sub13_2 == null ? "" : Static330.aClass3_Sub13_2.aString45;
	}

	@OriginalMember(owner = "client!os", name = "a", descriptor = "(III)Z")
	public static boolean method5583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
