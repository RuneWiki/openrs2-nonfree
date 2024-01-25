import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!vm", name = "p", descriptor = "Lclient!cg;")
	public static Class36 aClass36_2;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	public static int anInt6971;

	@OriginalMember(owner = "client!vm", name = "G", descriptor = "Lclient!jv;")
	public static Class131 aClass131_1;

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_156 = new Class211(38, 6);

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "[I")
	public static final int[] anIntArray578 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_45 = new Class72(8);

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_215 = new Class102(60, 11);

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "[I")
	public static final int[] anIntArray579 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLclient!ws;)I")
	public static int method5391(@OriginalArg(1) Class2_Sub46 arg0) {
		@Pc(7) String local7 = Static359.method4734(arg0);
		@Pc(9) int[] local9 = null;
		if (Static388.method3886(arg0.anInt7283)) {
			local9 = Static384.aClass164_2.method3458((int) arg0.aLong226).anIntArray500;
		} else if (arg0.anInt7282 != -1) {
			local9 = Static384.aClass164_2.method3458(arg0.anInt7282).anIntArray500;
		} else if (Static346.method4610(arg0.anInt7283)) {
			@Pc(32) Class2_Sub28 local32 = (Class2_Sub28) Static49.aClass72_11.method1659((long) arg0.aLong226);
			if (local32 != null) {
				@Pc(37) Class3_Sub4_Sub1_Sub1 local37 = local32.aClass3_Sub4_Sub1_Sub1_1;
				@Pc(40) Class245 local40 = local37.aClass245_1;
				if (local40.anIntArray560 != null) {
					local40 = local40.method5205(Static138.aClass268_1);
				}
				if (local40 != null) {
					local9 = local40.anIntArray561;
				}
			}
		} else if (Static181.method2510(arg0.anInt7283)) {
			@Pc(74) Class192 local74;
			if (arg0.anInt7283 == 1009) {
				local74 = Static50.aClass190_1.method4218((int) arg0.aLong226);
			} else {
				local74 = Static50.aClass190_1.method4218((int) (arg0.aLong226 >>> 32 & 0x7FFFFFFFL));
			}
			if (local74.anIntArray434 != null) {
				local74 = local74.method4228(Static138.aClass268_1);
			}
			if (local74 != null) {
				local9 = local74.anIntArray436;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static186.method5106(local9);
		}
		@Pc(135) int local135 = Static241.aClass141_5.method2909(local7, Static271.aClass13Array14);
		if (arg0.aBoolean531) {
			local135 += Static143.aClass13_11.YA() + 4;
		}
		return local135;
	}
}
