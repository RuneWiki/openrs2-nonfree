import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static390 {

	@OriginalMember(owner = "client!ov", name = "T", descriptor = "[Lclient!jba;")
	public static Class69_Sub1[] aClass69_Sub1Array2;

	@OriginalMember(owner = "client!ov", name = "Q", descriptor = "Lclient!rba;")
	public static final Class278 aClass278_11 = new Class278("", 17);

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(ILclient!fd;)Lclient!u;")
	public static Class260_Sub3 method6231(@OriginalArg(1) Class3_Sub7 arg0) {
		@Pc(7) Class260 local7 = Static152.method2969(arg0);
		@Pc(11) int local11 = arg0.method6497();
		@Pc(15) int local15 = arg0.method6497();
		@Pc(19) int local19 = arg0.method6535();
		return new Class260_Sub3(local7.aClass100_11, local7.aClass237_11, local7.anInt9472, local7.anInt9473, local7.anInt9475, local7.anInt9476, local7.anInt9468, local7.anInt9478, local7.anInt9477, local11, local15, local19);
	}

	@OriginalMember(owner = "client!ov", name = "c", descriptor = "(I)I")
	public static int method6232() {
		return Static95.anInt2313;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(III)Z")
	public static boolean method6233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
