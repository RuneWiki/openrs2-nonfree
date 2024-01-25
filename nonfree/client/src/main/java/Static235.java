import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!hs", name = "w", descriptor = "Lclient!gj;")
	public static Class143 aClass143_57;

	@OriginalMember(owner = "client!hs", name = "y", descriptor = "Lclient!en;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "Lclient!vl;")
	public static final Class376 aClass376_63 = new Class376(26, 7);

	@OriginalMember(owner = "client!hs", name = "p", descriptor = "I")
	public static int anInt4463 = 0;

	@OriginalMember(owner = "client!hs", name = "a", descriptor = "(IIIIZII)V")
	public static void method3804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(6) int arg3) {
		for (@Pc(11) Class23_Sub9 local11 = (Class23_Sub9) Static408.aClass105_9.method2444(); local11 != null; local11 = (Class23_Sub9) Static408.aClass105_9.method2448()) {
			if (local11.anInt8997 <= Static621.anInt9665) {
				local11.method8588();
			} else {
				Static38.method1147(local11.anInt8992 * 2, arg2 >> 1, (local11.anInt8993 << 9) + 256, local11.anInt8994, arg3 >> 1, (local11.anInt8998 << 9) + 256);
				Static243.aClass69_5.method7467(arg0 + Static109.anIntArray149[0], 0, local11.aString110, local11.anInt9000 | 0xFF000000, Static109.anIntArray149[1] + arg1);
			}
		}
	}
}
