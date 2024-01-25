import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!rc", name = "D", descriptor = "[I")
	public static int[] anIntArray690;

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_172 = new Class180(68, 12);

	@OriginalMember(owner = "client!rc", name = "B", descriptor = "[[I")
	public static final int[][] anIntArrayArray48 = new int[6][];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(II[Ljava/awt/Rectangle;)V")
	public static void method7218(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static76.anInt1404 == 1) {
			Static316.aClass13_10.method8473(arg1, arg0, Static125.anInt2572, Static485.anInt8031);
		} else {
			Static316.aClass13_10.method8473(arg1, arg0, 0, 0);
		}
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZB)V")
	public static void method7219(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static87.anInt1710;
		@Pc(12) int local12 = Static442.anInt7035;
		if (arg0 && Static443.aBoolean515) {
			local10 <<= 0x1;
			local12 = -local10;
		}
		Static674.aClass13_22.f(local12, local10);
	}
}
