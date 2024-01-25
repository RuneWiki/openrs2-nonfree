import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static359 {

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	public static int anInt6155;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	public static int anInt6157;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public static boolean method5205(@OriginalArg(1) String arg0) {
		return Static136.aHashtable1.containsKey(arg0);
	}
}
