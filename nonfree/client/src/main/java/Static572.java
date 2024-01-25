import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "[I")
	public static final int[] anIntArray594 = new int[14];

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_99 = new Class303(43, -1);

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!sb;")
	public static final Class303 aClass303_100 = new Class303(37, 7);

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "[I")
	public static final int[] anIntArray595 = new int[4];

	@OriginalMember(owner = "client!wb", name = "k", descriptor = "[I")
	public static final int[] anIntArray596 = new int[32];

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	public static int anInt9292 = 0;

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
	public static String[] method7699(@OriginalArg(0) char arg0, @OriginalArg(2) String arg1) {
		@Pc(10) int local10 = Static21.method353(arg0, arg1);
		@Pc(15) String[] local15 = new String[local10 + 1];
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		for (@Pc(21) int local21 = 0; local21 < local10; local21++) {
			@Pc(25) int local25;
			for (local25 = local19; arg0 != arg1.charAt(local25); local25++) {
			}
			local15[local17++] = arg1.substring(local19, local25);
			local19 = local25 + 1;
		}
		local15[local10] = arg1.substring(local19);
		return local15;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!wp;ZB)V")
	public static void method7700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class361 arg2, @OriginalArg(3) boolean arg3) {
		@Pc(8) int local8 = arg2.anInt9668;
		@Pc(11) int local11 = arg2.anInt9650;
		if (arg2.aByte128 == 0) {
			arg2.anInt9668 = arg2.anInt9662;
		} else if (arg2.aByte128 == 1) {
			arg2.anInt9668 = arg0 - arg2.anInt9662;
		} else if (arg2.aByte128 == 2) {
			arg2.anInt9668 = arg2.anInt9662 * arg0 >> 14;
		}
		if (arg2.aByte130 == 0) {
			arg2.anInt9650 = arg2.anInt9605;
		} else if (arg2.aByte130 == 1) {
			arg2.anInt9650 = arg1 - arg2.anInt9605;
		} else if (arg2.aByte130 == 2) {
			arg2.anInt9650 = arg1 * arg2.anInt9605 >> 14;
		}
		if (arg2.aByte128 == 4) {
			arg2.anInt9668 = arg2.anInt9650 * arg2.anInt9611 / arg2.anInt9584;
		}
		if (arg2.aByte130 == 4) {
			arg2.anInt9650 = arg2.anInt9668 * arg2.anInt9584 / arg2.anInt9611;
		}
		if (Static425.aBoolean541 && (Static71.method1520(arg2).anInt6063 != 0 || arg2.anInt9665 == 0)) {
			if (arg2.anInt9650 < 5 && arg2.anInt9668 < 5) {
				arg2.anInt9668 = 5;
				arg2.anInt9650 = 5;
			} else {
				if (arg2.anInt9650 <= 0) {
					arg2.anInt9650 = 5;
				}
				if (arg2.anInt9668 <= 0) {
					arg2.anInt9668 = 5;
				}
			}
		}
		if (Static36.anInt656 == arg2.anInt9591) {
			Static159.aClass361_3 = arg2;
		}
		if (arg3 && arg2.anObjectArray6 != null && (local8 != arg2.anInt9668 || arg2.anInt9650 != local11)) {
			@Pc(184) Class3_Sub32 local184 = new Class3_Sub32();
			local184.anObjectArray1 = arg2.anObjectArray6;
			local184.aClass361_6 = arg2;
			Static12.aClass112_54.method3079(local184);
		}
	}
}
