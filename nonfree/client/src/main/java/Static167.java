import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fp", name = "c", descriptor = "Z")
	public static boolean aBoolean250;

	@OriginalMember(owner = "client!fp", name = "g", descriptor = "[I")
	public static int[] anIntArray274;

	@OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
	public static int anInt3248 = -1;

	@OriginalMember(owner = "client!fp", name = "k", descriptor = "[I")
	public static final int[] anIntArray275 = new int[4];

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(IZII)I")
	public static int method2682(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class14_Sub50 local8 = Static250.method3683(arg1, arg0);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && arg2 < local8.anIntArray698.length) {
			return local8.anIntArray698[arg2];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/awt/Component;Z)Lclient!en;")
	public static Class65 method2683(@OriginalArg(0) Component arg0) {
		return new Class65_Sub1(arg0);
	}
}
