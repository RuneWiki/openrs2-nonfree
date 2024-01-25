import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static414 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
	public static final int[] anIntArray673 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Z")
	public static boolean aBoolean454 = false;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "Lclient!mn;")
	public static final Class167 aClass167_32 = new Class167(16);

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "[Z")
	public static final boolean[] aBooleanArray21 = new boolean[100];

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
	public static int anInt6929 = 0;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IILclient!nn;)V")
	public static void method5440(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub8 arg1) {
		if (Static48.aClass227_1 == null) {
			return;
		}
		try {
			Static48.aClass227_1.method4997(0L);
			Static48.aClass227_1.method4992(arg1.aByteArray44, 24, arg0);
		} catch (@Pc(25) Exception local25) {
		}
	}
}
