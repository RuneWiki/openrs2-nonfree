import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wk", name = "l", descriptor = "[S")
	public static short[] aShortArray116;

	@OriginalMember(owner = "client!wk", name = "o", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!wk", name = "r", descriptor = "[I")
	public static int[] anIntArray744;

	@OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
	public static int anInt7524;

	@OriginalMember(owner = "client!wk", name = "v", descriptor = "Z")
	public static boolean aBoolean497;

	@OriginalMember(owner = "client!wk", name = "a", descriptor = "(II[IILclient!da;[I)Lclient!pd;")
	public static Class49_Sub2 method6003(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class50_Sub1 arg3, @OriginalArg(5) int[] arg4) {
		@Pc(10) byte[] local10 = new byte[arg2 * arg0];
		for (@Pc(12) int local12 = 0; local12 < arg2; local12++) {
			@Pc(27) int local27 = arg1[local12] + local12 * arg0;
			for (@Pc(29) int local29 = 0; local29 < arg4[local12]; local29++) {
				local10[local27++] = -1;
			}
		}
		return new Class49_Sub2(arg3, arg0, arg2, local10);
	}
}
