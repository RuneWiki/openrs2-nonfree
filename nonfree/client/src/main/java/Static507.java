import java.awt.Font;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "I")
	public static int anInt9125;

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "[[I")
	public static int[][] anIntArrayArray84;

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
	public static int anInt9124 = 0;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	public static int anInt9126 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(III)Z")
	public static boolean method7524(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x180) != 0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IB)V")
	public static void method7526(@OriginalArg(0) int arg0) {
		@Pc(13) Class12_Sub4_Sub1 local13 = Static389.method6156(3, arg0);
		local13.method823();
	}
}
