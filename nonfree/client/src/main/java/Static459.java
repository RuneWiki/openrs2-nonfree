import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!sda", name = "c", descriptor = "Lclient!tq;")
	public static Class305 aClass305_24 = new Class305(8);

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "Z")
	public static boolean aBoolean363 = false;

	@OriginalMember(owner = "client!sda", name = "e", descriptor = "Lclient!vj;")
	public static final Class333 aClass333_7 = new Class333(2);

	@OriginalMember(owner = "client!sda", name = "f", descriptor = "[I")
	public static final int[] anIntArray291 = new int[8];

	@OriginalMember(owner = "client!sda", name = "g", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(II)I")
	public static int method3942(@OriginalArg(0) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lclient!ke;")
	public static RuntimeException_Sub1 method3945(@OriginalArg(0) Throwable arg0, @OriginalArg(1) String arg1) {
		@Pc(9) RuntimeException_Sub1 local9;
		if (arg0 instanceof RuntimeException_Sub1) {
			local9 = (RuntimeException_Sub1) arg0;
			local9.aString61 = local9.aString61 + ' ' + arg1;
		} else {
			local9 = new RuntimeException_Sub1(arg0, arg1);
		}
		return local9;
	}
}
