import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!hg", name = "H", descriptor = "Lclient!sd;")
	public static Class60 aClass60_17;

	@OriginalMember(owner = "client!hg", name = "t", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1114 = Static118.method2249(":trade:");

	@OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
	public static int anInt1818 = 0;

	@OriginalMember(owner = "client!hg", name = "w", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1115 = Static118.method2249("Bitte wenden Sie sich an den Kundendienst)3");

	@OriginalMember(owner = "client!hg", name = "A", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1116 = Static118.method2249("null");

	@OriginalMember(owner = "client!hg", name = "J", descriptor = "I")
	public static int anInt1828 = -1;

	@OriginalMember(owner = "client!hg", name = "L", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1117 = Static118.method2249("::gc");

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(Z)V")
	public static void method1263() {
		@Pc(3) Class53 local3 = Static120.aClass53_1;
		synchronized (Static120.aClass53_1) {
			Static91.anInt2182++;
			Static127.anInt3145 = Static101.anInt2537;
			@Pc(27) int local27;
			if (Static180.anInt3907 >= 0) {
				while (Static180.anInt3907 != Static174.anInt3885) {
					local27 = Static72.anIntArray196[Static174.anInt3885];
					Static174.anInt3885 = Static174.anInt3885 + 1 & 0x7F;
					if (local27 < 0) {
						Static204.aBooleanArray19[~local27] = false;
					} else {
						Static204.aBooleanArray19[local27] = true;
					}
				}
			} else {
				for (local27 = 0; local27 < 112; local27++) {
					Static204.aBooleanArray19[local27] = false;
				}
				Static180.anInt3907 = Static174.anInt3885;
			}
			Static101.anInt2537 = Static119.anInt2957;
		}
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIILclient!ig;I)V")
	public static void method1265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub2_Sub13 arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub5 local7 = new Class1_Sub5();
		local7.anInt640 = arg0;
		local7.anInt651 = arg3.anInt1985;
		local7.anInt638 = arg3.anInt2017 * 128;
		local7.anInt648 = arg2 * 128;
		local7.anIntArray67 = arg3.anIntArray225;
		local7.anInt653 = arg3.anInt1986;
		local7.anInt643 = arg1 * 128;
		local7.anInt655 = arg3.anInt1991;
		@Pc(49) int local49 = arg3.anInt1988;
		@Pc(52) int local52 = arg3.anInt2001;
		if (arg4 == 1 || arg4 == 3) {
			local52 = arg3.anInt1988;
			local49 = arg3.anInt2001;
		}
		local7.anInt644 = (arg2 + local52) * 128;
		local7.anInt657 = (arg1 + local49) * 128;
		if (arg3.anIntArray227 != null) {
			local7.aClass1_Sub2_Sub13_1 = arg3;
			local7.method395();
		}
		Static131.aClass91_13.method3151(local7);
		if (local7.anIntArray67 != null) {
			local7.anInt656 = (int) ((double) (local7.anInt655 - local7.anInt651) * Math.random()) + local7.anInt651;
		}
	}
}
