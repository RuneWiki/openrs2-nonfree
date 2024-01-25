import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ks", name = "g", descriptor = "Lclient!ia;")
	public static Class40 aClass40_5;

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_131 = new Class214(93, 0);

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "Lclient!cv;")
	public static final Class44 aClass44_3 = new Class44("LIVE", 0);

	@OriginalMember(owner = "client!ks", name = "f", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_132 = new Class214(13, 0);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class131 method2877(@OriginalArg(1) int arg0) {
		@Pc(10) Class131 local10 = (Class131) Static37.aClass167_15.method3386((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static51.aClass113_19.method2274(0, arg0);
		local10 = new Class131();
		if (local20 != null) {
			local10.method2763(new Class1_Sub11(local20));
		}
		local10.method2765();
		Static37.aClass167_15.method3392(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	public static void method2878() {
		Static244.method3192((long) Static368.anInt6250, Static213.aClass128_22);
		if (Static169.anInt2522 != -1) {
			Static56.method860(Static169.anInt2522);
		}
		for (@Pc(18) int local18 = 0; local18 < Static193.anInt7328; local18++) {
			if (Static145.aBooleanArray15[local18]) {
				Static308.aBooleanArray24[local18] = true;
			}
			Static219.aBooleanArray11[local18] = Static145.aBooleanArray15[local18];
			Static145.aBooleanArray15[local18] = false;
		}
		Static350.anInt5712 = Static368.anInt6250;
		if (Static213.aClass128_22.method3569()) {
			Static346.aBoolean457 = true;
		}
		if (Static169.anInt2522 != -1) {
			Static193.anInt7328 = 0;
			Static436.method5463();
		}
		Static213.aClass128_22.va();
		Static425.method5304(Static453.anInt7417);
		Static239.anInt3853 = 0;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IZ)I")
	public static int method2879(@OriginalArg(0) int arg0) {
		if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
			return 6407;
		} else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
			return 6408;
		} else if (arg0 == 6406 || arg0 == 34844) {
			return 6406;
		} else if (arg0 == 6409 || arg0 == 34846) {
			return 6409;
		} else if (arg0 == 6410 || arg0 == 34847) {
			return 6410;
		} else if (arg0 == 6402) {
			return 6402;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
