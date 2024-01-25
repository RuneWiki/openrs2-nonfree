import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!sga", name = "b", descriptor = "I")
	public static int anInt10357;

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "Lclient!hk;")
	public static Class5_Sub14_Sub4 aClass5_Sub14_Sub4_35;

	@OriginalMember(owner = "client!sga", name = "k", descriptor = "Lclient!wb;")
	public static Class240 aClass240_34;

	@OriginalMember(owner = "client!sga", name = "l", descriptor = "Lclient!cb;")
	public static Class50 aClass50_186;

	@OriginalMember(owner = "client!sga", name = "d", descriptor = "I")
	public static int anInt10359 = -1;

	@OriginalMember(owner = "client!sga", name = "h", descriptor = "I")
	public static int anInt10361 = 0;

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IBI)I")
	public static int method8642(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(30) double local30 = Math.random() * (local10 - local22) + local22;
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIB)Z")
	public static boolean method8643(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sga", name = "f", descriptor = "(I)V")
	public static void method8646() {
		@Pc(8) Class5_Sub25 local8 = (Class5_Sub25) Static598.aClass124_96.method2572();
		@Pc(19) boolean local19 = Static610.aClass394_12 != null || Static429.anInt7587 > 0;
		@Pc(23) int local23 = local8.method3315();
		@Pc(27) int local27 = local8.method3313();
		if (local19) {
			Static240.anInt3903 = 1;
		}
		if (local19) {
			Static105.aClass5_Sub2_Sub13_1 = Static529.aClass5_Sub2_Sub13_5;
		} else {
			Static265.method3769(local23, local27, Static529.aClass5_Sub2_Sub13_5);
		}
	}
}
