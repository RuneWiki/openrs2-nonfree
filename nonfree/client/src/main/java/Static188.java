import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "I")
	public static int anInt9406 = 0;

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "[Lclient!ct;")
	public static final Class65[] aClass65Array2 = new Class65[6];

	@OriginalMember(owner = "client!gp", name = "h", descriptor = "S")
	public static short aShort106 = 256;

	@OriginalMember(owner = "client!gp", name = "i", descriptor = "[J")
	public static final long[] aLongArray14 = new long[100];

	@OriginalMember(owner = "client!gp", name = "j", descriptor = "I")
	public static int anInt9410 = 0;

	@OriginalMember(owner = "client!gp", name = "k", descriptor = "Lclient!raa;")
	public static Class295 aClass295_17 = null;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IIZ)Z")
	public static boolean method8113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0xC580) != 0;
	}

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(IB)V")
	public static void method8114(@OriginalArg(0) int arg0) {
		@Pc(8) Class5_Sub5_Sub21 local8 = Static101.method1629(5, arg0);
		local8.method8961();
	}
}
