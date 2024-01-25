import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static473 {

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "J")
	public static long aLong249;

	@OriginalMember(owner = "client!sc", name = "w", descriptor = "I")
	public static int anInt8998 = -1;

	@OriginalMember(owner = "client!sc", name = "g", descriptor = "(I)[Lclient!lfa;")
	public static Class195[] method6905() {
		return new Class195[] { Static58.aClass195_1, Static58.aClass195_2, Static58.aClass195_3, Static58.aClass195_4, Static58.aClass195_5, Static58.aClass195_6, Static58.aClass195_7, Static58.aClass195_8, Static58.aClass195_9, Static58.aClass195_10, Static58.aClass195_11, Static58.aClass195_12, Static58.aClass195_13, Static58.aClass195_14 };
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Ljava/lang/String;BLjava/io/File;)V")
	public static void method6909(@OriginalArg(0) String arg0, @OriginalArg(2) File arg1) {
		Static36.aHashtable3.put(arg0, arg1);
	}
}
