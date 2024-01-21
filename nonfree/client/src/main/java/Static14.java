import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
	public static int anInt301;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "Lclient!qb;")
	public static final Class84 aClass84_4 = new Class84(260);

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean13 = true;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lclient!ta;")
	public static Class5_Sub2_Sub22 method253(@OriginalArg(0) int arg0) {
		@Pc(6) Class5_Sub2_Sub22 local6 = (Class5_Sub2_Sub22) Static123.aClass8_26.method227((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(29) byte[] local29 = Static189.aClass23_70.method738(Static178.method2698(arg0), Static120.method1909(arg0));
		local6 = new Class5_Sub2_Sub22();
		if (local29 != null) {
			local6.method2757(new Class5_Sub6(local29));
		}
		local6.method2756();
		Static123.aClass8_26.method232((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)I")
	public static int method255() {
		@Pc(14) int local14 = Static128.method1999(Static111.anInt2327, Static4.anInt109, Static104.anInt2182);
		return local14 - Static146.anInt3026 >= 800 || (Static168.aByteArrayArrayArray13[Static111.anInt2327][Static4.anInt109 >> 7][Static104.anInt2182 >> 7] & 0x4) == 0 ? 3 : Static111.anInt2327;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V")
	public static void method256() {
		Static106.aClass8_22.method233();
	}

	@OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)V")
	public static void method257() {
		Static196.aClass84_20.method2335();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BII)V")
	public static void method258(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static43.aClass5_Sub6_Sub1_2.method3087(76);
		Static43.aClass5_Sub6_Sub1_2.method3046(arg1);
		Static43.aClass5_Sub6_Sub1_2.method3044(arg0);
	}
}
