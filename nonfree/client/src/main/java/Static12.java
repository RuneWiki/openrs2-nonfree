import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	public static int anInt385;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_103 = Static158.method3034("Login server offline)3");

	@OriginalMember(owner = "client!ba", name = "j", descriptor = "Lclient!ob;")
	public static Class60 aClass60_104 = aClass60_103;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!pe;I)Z")
	public static boolean method311(@OriginalArg(1) Class13 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) byte[] local11 = arg0.method509(arg1);
		if (local11 == null) {
			return false;
		} else {
			Static11.method310(local11);
			return true;
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!re;IZ)V")
	public static void method312(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(6) int local6 = arg0.anInt3986;
		@Pc(10) int local10 = (int) arg0.aLong151;
		arg0.method3556();
		if (arg1) {
			Static37.method831(local6);
		}
		Static32.method793(local6);
		@Pc(25) Class72 local25 = Static173.method3201(local10);
		if (local25 != null) {
			Static39.method900(local25);
		}
		Static103.aBoolean115 = false;
		Static169.anInt4148 = 0;
		Static129.method2731(Static176.anInt4301, Static103.anInt2979, Static180.anInt3303, Static73.anInt2175);
		if (Static18.anInt4401 != -1) {
			Static190.method3488(1, Static18.anInt4401);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method313(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static186.aClass85_1);
		arg0.addMouseMotionListener(Static186.aClass85_1);
		arg0.addFocusListener(Static186.aClass85_1);
	}
}
