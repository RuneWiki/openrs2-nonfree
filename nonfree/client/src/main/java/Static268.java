import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!is", name = "u", descriptor = "I")
	public static int anInt4963;

	@OriginalMember(owner = "client!is", name = "s", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!is", name = "z", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_94 = new Class359(73, -2);

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!fda;)V")
	public static void method4153(@OriginalArg(1) Class28_Sub1_Sub4_Sub2 arg0) {
		if (arg0 instanceof Class28_Sub1_Sub4_Sub2_Sub1) {
			@Pc(32) Class28_Sub1_Sub4_Sub2_Sub1 local32 = (Class28_Sub1_Sub4_Sub2_Sub1) arg0;
			if (local32.aClass134_1 != null) {
				Static265.method4125(local32, local32.aByte145 != Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145);
			}
		} else if (arg0 instanceof Class28_Sub1_Sub4_Sub2_Sub2) {
			@Pc(16) Class28_Sub1_Sub4_Sub2_Sub2 local16 = (Class28_Sub1_Sub4_Sub2_Sub2) arg0;
			Static677.method9031(local16, Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145 != local16.aByte145);
		}
	}
}
