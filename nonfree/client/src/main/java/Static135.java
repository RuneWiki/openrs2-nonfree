import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!eo", name = "v", descriptor = "I")
	public static int anInt2516;

	@OriginalMember(owner = "client!eo", name = "r", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_49 = new Class216(15, 15);

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(III)Z")
	public static boolean method2423(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "b", descriptor = "(III)Z")
	public static boolean method2425(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!eo", name = "c", descriptor = "(III)V")
	public static void method2426(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static583.method7687(arg0)) {
			Static557.method7401(arg1, Static392.aClass199ArrayArray2[arg0]);
		}
	}

	@OriginalMember(owner = "client!eo", name = "a", descriptor = "(ILjava/io/File;I)[B")
	public static byte[] method2427(@OriginalArg(0) int arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(6) byte[] local6 = new byte[arg0];
			Static569.method7527(local6, arg1, arg0);
			return local6;
		} catch (@Pc(21) IOException local21) {
			return null;
		}
	}
}
