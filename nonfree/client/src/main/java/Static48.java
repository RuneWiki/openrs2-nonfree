import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!br", name = "M", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(III)I")
	public static int method1201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19 = arg1 - 1 & arg0 >> 31;
		return local19 + (arg0 + (arg0 >>> 31)) % arg1;
	}

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Ljava/io/File;ILjava/lang/String;)V")
	public static void method1202(@OriginalArg(0) File arg0, @OriginalArg(2) String arg1) {
		Static94.aHashtable3.put(arg1, arg0);
	}
}
