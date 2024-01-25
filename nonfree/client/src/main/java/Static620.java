import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!wca", name = "s", descriptor = "Lclient!ft;")
	public static Class2_Sub23 aClass2_Sub23_1;

	@OriginalMember(owner = "client!wca", name = "g", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_1 = new Class365(0, 3, Static545.aClass324_16);

	@OriginalMember(owner = "client!wca", name = "i", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_2 = new Class365(1, 3, Static545.aClass324_16);

	@OriginalMember(owner = "client!wca", name = "j", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_3 = new Class365(2, 4, Static545.aClass324_12);

	@OriginalMember(owner = "client!wca", name = "k", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_4 = new Class365(3, 1, Static545.aClass324_16);

	@OriginalMember(owner = "client!wca", name = "l", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_5 = new Class365(4, 2, Static545.aClass324_16);

	@OriginalMember(owner = "client!wca", name = "m", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_6 = new Class365(5, 3, Static545.aClass324_16);

	@OriginalMember(owner = "client!wca", name = "n", descriptor = "Lclient!wca;")
	public static final Class365 aClass365_7 = new Class365(6, 4, Static545.aClass324_16);

	@OriginalMember(owner = "client!wca", name = "o", descriptor = "I")
	public static final int anInt10086 = Static420.method6395(16);

	@OriginalMember(owner = "client!wca", name = "p", descriptor = "J")
	public static long aLong279 = 0L;

	@OriginalMember(owner = "client!wca", name = "q", descriptor = "I")
	public static int anInt10087 = 0;

	@OriginalMember(owner = "client!wca", name = "t", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_177 = new Class274(2, 2);

	@OriginalMember(owner = "client!wca", name = "u", descriptor = "Z")
	public static boolean aBoolean745 = true;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(BI)Lclient!wca;")
	public static Class365 method8433(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return aClass365_1;
		} else if (arg0 == 1) {
			return aClass365_2;
		} else if (arg0 == 2) {
			return aClass365_3;
		} else if (arg0 == 3) {
			return aClass365_4;
		} else if (arg0 == 4) {
			return aClass365_5;
		} else if (arg0 == 5) {
			return aClass365_6;
		} else if (arg0 == 6) {
			return aClass365_7;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!bba;B)Lclient!cu;")
	public static Class61 method8435(@OriginalArg(0) Class11_Sub1_Sub1 arg0) {
		@Pc(12) Class61 local12;
		if (Static555.aClass61_3 == null) {
			local12 = new Class61();
		} else {
			local12 = Static555.aClass61_3;
			Static555.aClass61_3 = Static555.aClass61_3.aClass61_1;
			Static277.anInt5315--;
			local12.aClass61_1 = null;
		}
		local12.aClass11_Sub1_Sub1_1 = arg0;
		return local12;
	}
}
