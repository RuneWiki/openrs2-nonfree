import java.awt.Canvas;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bj", name = "c", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas1;

	@OriginalMember(owner = "client!bj", name = "g", descriptor = "Lclient!sc;")
	public static Class2_Sub21_Sub3 aClass2_Sub21_Sub3_1;

	@OriginalMember(owner = "client!bj", name = "j", descriptor = "I")
	public static int anInt420;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "Lclient!he;")
	public static Class44 aClass44_7 = new Class44();

	@OriginalMember(owner = "client!bj", name = "e", descriptor = "Lclient!qe;")
	public static Class78 aClass78_83 = Static199.method3560("Fallen lassen");

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "Z")
	public static boolean aBoolean13 = false;

	@OriginalMember(owner = "client!bj", name = "h", descriptor = "I")
	public static int anInt419 = 0;

	@OriginalMember(owner = "client!bj", name = "i", descriptor = "S")
	public static short aShort1 = 1;

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)I")
	public static int method303(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = 1;
		while (arg1 > 1) {
			if ((arg1 & 0x1) != 0) {
				local10 *= arg0;
			}
			arg0 *= arg0;
			arg1 >>= 0x1;
		}
		if (arg1 == 1) {
			return arg0 * local10;
		} else {
			return local10;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILclient!gj;Z)V")
	public static void method306(@OriginalArg(1) Class41 arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			Static180.anInt4194 = 3;
			Static12.method225(false);
			Static185.aBoolean187 = false;
			Static40.aBoolean27 = false;
			Static112.anInt2452 = 0;
			Static112.aBoolean105 = false;
			Static175.aBoolean175 = false;
			Static99.anInt2151 = 0;
			Static64.aBoolean42 = false;
			Static116.aBoolean113 = false;
			Static110.anInt2433 = 127;
			Static166.anInt1137 = 0;
			Static102.aBoolean86 = false;
			Static139.anInt2666 = 0;
			Static11.anInt311 = 127;
			Static41.aBoolean31 = false;
			Static89.anInt1999 = 255;
			Static214.aBoolean200 = false;
			Static101.aBoolean84 = false;
			Static14.aBoolean151 = false;
			Static122.method1343(arg0);
			return;
		}
		Static180.anInt4194 = 3;
		Static12.method225(true);
		Static14.aBoolean151 = true;
		Static110.anInt2433 = 127;
		Static166.anInt1137 = 0;
		Static185.aBoolean187 = true;
		@Pc(73) Class62 local73 = null;
		Static102.aBoolean86 = true;
		Static116.aBoolean113 = true;
		Static41.aBoolean31 = true;
		Static112.aBoolean105 = true;
		Static112.anInt2452 = 0;
		Static64.aBoolean42 = true;
		Static11.anInt311 = 127;
		Static40.aBoolean27 = true;
		Static99.anInt2151 = 0;
		Static175.aBoolean175 = true;
		Static101.aBoolean84 = true;
		Static214.aBoolean200 = true;
		Static89.anInt1999 = 255;
		Static139.anInt2666 = 2;
		try {
			@Pc(106) Class33 local106 = arg0.method1262("runescape");
			while (local106.anInt947 == 0) {
				Static156.method2805(1L);
			}
			if (local106.anInt947 == 1) {
				local73 = (Class62) local106.anObject2;
				@Pc(130) byte[] local130 = new byte[(int) local73.method2307()];
				@Pc(145) int local145;
				for (@Pc(132) int local132 = 0; local132 < local130.length; local132 += local145) {
					local145 = local73.method2306(local130, local130.length - local132, local132);
					if (local145 == -1) {
						throw new IOException("EOF");
					}
				}
				Static82.method1357(new Class2_Sub23(local130));
			}
		} catch (@Pc(172) Exception local172) {
		}
		try {
			if (local73 != null) {
				local73.method2305();
			}
		} catch (@Pc(179) Exception local179) {
		}
	}
}
