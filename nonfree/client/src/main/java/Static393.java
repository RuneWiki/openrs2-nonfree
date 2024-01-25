import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static393 {

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public static int anInt6110;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "[Lclient!uea;")
	public static Class371[] aClass371Array1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!m", name = "g", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable4 = new Hashtable();

	@OriginalMember(owner = "client!m", name = "p", descriptor = "I")
	public static int anInt6120 = 0;

	@OriginalMember(owner = "client!m", name = "n", descriptor = "I")
	public static final int anInt6121 = 0;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method5323() {
		if (Static332.aBoolean354) {
			return;
		}
		Static344.method4899(Static422.aClass364ArrayArrayArray1);
		if (Static660.aClass364ArrayArrayArray3 != null) {
			Static344.method4899(Static660.aClass364ArrayArrayArray3);
		}
		Static332.aBoolean354 = true;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!aq;I[I[III)Lclient!hp;")
	public static Class1_Sub2 method5326(@OriginalArg(0) Class22_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4) {
		@Pc(10) byte[] local10 = new byte[arg1 * arg4];
		for (@Pc(12) int local12 = 0; local12 < arg1; local12++) {
			@Pc(25) int local25 = arg4 * local12 + arg3[local12];
			for (@Pc(27) int local27 = 0; local27 < arg2[local12]; local27++) {
				local10[local25++] = -1;
			}
		}
		if (-10 <= -125) {
			aClass371Array1 = null;
		}
		return new Class1_Sub2(arg0, arg4, arg1, local10);
	}
}
