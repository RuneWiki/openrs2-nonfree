import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static117 {

	@OriginalMember(owner = "client!dka", name = "z", descriptor = "I")
	public static int anInt2409;

	@OriginalMember(owner = "client!dka", name = "D", descriptor = "I")
	public static int anInt2407 = 0;

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Lclient!hf;I)V")
	public static void method2218(@OriginalArg(0) Class155 arg0) {
		Static374.aClass155_1 = arg0;
	}

	@OriginalMember(owner = "client!dka", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;I)V")
	public static void method2219(@OriginalArg(0) File arg0, @OriginalArg(1) String arg1) {
		Static687.aHashtable7.put(arg1, arg0);
	}
}
