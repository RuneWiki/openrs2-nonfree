import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static378 {

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "Z")
	public static boolean aBoolean567 = false;

	@OriginalMember(owner = "client!nl", name = "c", descriptor = "Lclient!fc;")
	public static final Class94 aClass94_34 = new Class94(260);

	@OriginalMember(owner = "client!nl", name = "d", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_128 = new Class73(7, 8);

	@OriginalMember(owner = "client!nl", name = "e", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_129 = new Class73(79, 0);

	@OriginalMember(owner = "client!nl", name = "a", descriptor = "([Ljava/awt/Rectangle;II)V")
	public static void method5990(@OriginalArg(0) Rectangle[] arg0, @OriginalArg(1) int arg1) throws Exception_Sub1 {
		if (Static552.anInt9486 == 1) {
			Static293.aClass5_6.method6168(arg0, arg1, Static483.anInt8552, Static477.anInt8411);
		} else {
			Static293.aClass5_6.method6168(arg0, arg1, 0, 0);
		}
	}
}
