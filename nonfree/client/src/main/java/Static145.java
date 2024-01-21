import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt3534;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1252 = Static146.method2172(":trade:");

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt3531 = 0;

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1253 = Static146.method2172("blinken2:");

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1254 = Static146.method2172(" weitere Optionen");

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1255 = Static146.method2172("<col=ffffff>");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
	public static int anInt3533 = 0;

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1256 = Static146.method2172("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method2441() {
		@Pc(12) Class9 local12 = Static125.aClass9_1;
		synchronized (Static125.aClass9_1) {
			Static94.anInt2401 = Static160.anInt4576;
			@Pc(27) int local27;
			if (Static62.anInt1662 >= 0) {
				while (Static62.anInt1662 != Static30.anInt874) {
					local27 = Static48.anIntArray212[Static30.anInt874];
					Static30.anInt874 = Static30.anInt874 + 1 & 0x7F;
					if (local27 >= 0) {
						Static146.aBooleanArray12[local27] = true;
					} else {
						Static146.aBooleanArray12[~local27] = false;
					}
				}
			} else {
				for (local27 = 0; local27 < 112; local27++) {
					Static146.aBooleanArray12[local27] = false;
				}
				Static62.anInt1662 = Static30.anInt874;
			}
			Static160.anInt4576 = Static109.anInt893;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIII)I")
	public static int method2442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg0;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZZZ)I")
	public static int method2443() {
		return Static44.anInt1188 + Static15.anInt481;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method2444() {
		aClass77_1253 = null;
		aClass77_1256 = null;
		aClass77_1254 = null;
		aFrame1 = null;
		aClass77_1252 = null;
		aClass77_1255 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(B[Lclient!qf;I)V")
	public static void method2445(@OriginalArg(1) Class66[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(15) int local15 = 0; local15 < arg0.length; local15++) {
			@Pc(21) Class66 local21 = arg0[local15];
			if (local21 != null) {
				if (local21.anInt3230 == 0) {
					if (local21.aClass66Array2 != null) {
						method2445(local21.aClass66Array2, arg1);
					}
					@Pc(42) Class2_Sub10 local42 = (Class2_Sub10) Static177.aClass74_12.method2433((long) local21.anInt3229);
					if (local42 != null) {
						Static175.method2950(local42.anInt1896, arg1);
					}
				}
				@Pc(58) Class2_Sub21 local58;
				if (arg1 == 0 && local21.anObjectArray12 != null) {
					local58 = new Class2_Sub21();
					local58.anObjectArray29 = local21.anObjectArray12;
					local58.aClass66_14 = local21;
					Static150.method2565(local58);
				}
				if (arg1 == 1 && local21.anObjectArray22 != null) {
					if (local21.anInt3212 >= 0) {
						@Pc(82) Class66 local82 = Static55.method1034(local21.anInt3229);
						if (local82 == null || local82.aClass66Array2 == null || local82.aClass66Array2.length <= local21.anInt3212 || local82.aClass66Array2[local21.anInt3212] != local21) {
							continue;
						}
					}
					local58 = new Class2_Sub21();
					local58.aClass66_14 = local21;
					local58.anObjectArray29 = local21.anObjectArray22;
					Static150.method2565(local58);
				}
			}
		}
	}
}
