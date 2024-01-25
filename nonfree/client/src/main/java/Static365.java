import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static365 {

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "[[B")
	public static final byte[][] aByteArrayArray11 = new byte[50][];

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
	public static int anInt6148 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!i;)V")
	public static void method5148(@OriginalArg(0) int arg0, @OriginalArg(1) Class151 arg1) {
		Static114.aClass151Array1[arg0] = arg1;
	}
}
