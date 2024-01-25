import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static260 {

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "J")
	public static final long aLong126 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "Lclient!wu;")
	public static final Class320 aClass320_8 = new Class320("WTI", 5);

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZII)I")
	public static int method4051(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class2_Sub16 local12 = Static218.method3456(arg1, arg2);
		if (local12 == null) {
			return 0;
		} else if (arg0 == -1) {
			return 0;
		} else {
			@Pc(24) int local24 = 0;
			for (@Pc(26) int local26 = 0; local26 < local12.anIntArray129.length; local26++) {
				if (local12.anIntArray128[local26] == arg0) {
					local24 += local12.anIntArray129[local26];
				}
			}
			return local24;
		}
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(IILclient!wca;I)V")
	public static void method4053(@OriginalArg(1) int arg0, @OriginalArg(2) Class310 arg1, @OriginalArg(3) int arg2) {
		if (arg1 == null) {
			return;
		}
		if (arg1.anObjectArray26 != null) {
			@Pc(13) Class2_Sub28 local13 = new Class2_Sub28();
			local13.aClass310_8 = arg1;
			local13.anObjectArray2 = arg1.anObjectArray26;
			Static258.method4037(local13);
		}
		Static116.anInt2332 = arg1.anInt9226;
		Static55.anInt970 = arg1.anInt9170;
		Static472.anInt8248 = arg1.anInt9157;
		Static74.anInt1557 = arg0;
		Static21.aBoolean31 = true;
		Static357.anInt6796 = arg1.anInt9224;
		Static94.anInt1853 = arg1.anInt9202;
		Static176.anInt3294 = arg2;
		Static273.method4342(arg1);
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "([Ljava/lang/String;B[S)V")
	public static void method4054(@OriginalArg(0) String[] arg0, @OriginalArg(2) short[] arg1) {
		Static203.method3264(arg0.length - 1, 0, arg0, arg1);
	}
}
