import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "Ljava/awt/Image;")
	public static Image anImage2;

	@OriginalMember(owner = "client!ol", name = "p", descriptor = "I")
	public static int anInt4776;

	@OriginalMember(owner = "client!ol", name = "x", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array12;

	@OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
	public static int anInt4770 = 0;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "F")
	public static float aFloat44 = 0.0F;

	@OriginalMember(owner = "client!ol", name = "q", descriptor = "I")
	public static int anInt4777 = 0;

	@OriginalMember(owner = "client!ol", name = "u", descriptor = "Ljava/lang/String;")
	public static String aString174 = "Loading sprites - ";

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIII)Z")
	public static boolean method3917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(16) Interface5 local16 = (Interface5) Static122.method2458(arg2, arg1, arg0);
		if (local16 != null) {
			local5 = Static94.method1675(local16) & true;
		}
		local16 = (Interface5) Static166.method3153(arg2, arg1, arg0, io.class);
		if (local16 != null) {
			local5 &= Static94.method1675(local16);
		}
		local16 = (Interface5) Static5.method210(arg2, arg1, arg0);
		if (local16 != null) {
			local5 &= Static94.method1675(local16);
		}
		return local5;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(BLjava/lang/String;)J")
	public static long method3922(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) long local10 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local10 = (local10 << 5) + (long) arg0.charAt(local17) - local10;
		}
		return local10;
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)V")
	public static void method3925(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			Static18.aClass57ArrayArrayArray1 = Static237.aClass57ArrayArrayArray2;
			Static307.aClass26Array3 = Static5.aClass26Array1;
		} else {
			Static18.aClass57ArrayArrayArray1 = Static342.aClass57ArrayArrayArray3;
			Static307.aClass26Array3 = Static310.aClass26Array4;
		}
		Static112.anInt2455 = Static18.aClass57ArrayArrayArray1.length;
	}
}
