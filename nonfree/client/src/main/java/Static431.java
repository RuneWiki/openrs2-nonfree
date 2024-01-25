import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static431 {

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "Z")
	public static boolean aBoolean537;

	@OriginalMember(owner = "client!ro", name = "h", descriptor = "I")
	public static int anInt7571;

	@OriginalMember(owner = "client!ro", name = "d", descriptor = "Lclient!uaa;")
	public static final Class288 aClass288_56 = new Class288(10);

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(B)J")
	public static long method6137() {
		return Static291.aClass1_1.method6839();
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(Lclient!bi;I)V")
	public static void method6138(@OriginalArg(0) Class30_Sub1 arg0) {
		arg0.aClass15_1 = null;
		@Pc(17) int local17 = arg0.aClass30_Sub6Array1.length;
		for (@Pc(19) int local19 = 0; local19 < local17; local19++) {
			arg0.aClass30_Sub6Array1[local19].aBoolean481 = false;
		}
		@Pc(37) Class77[] local37 = Class267.aClass77Array1;
		synchronized (Class267.aClass77Array1) {
			if (local17 < Class267.aClass77Array1.length && Static314.anIntArray289[local17] < 200) {
				Class267.aClass77Array1[local17].method2165(arg0);
				@Pc(62) int local62 = Static314.anIntArray289[local17]++;
			}
		}
	}

	@OriginalMember(owner = "client!ro", name = "a", descriptor = "(BII)Z")
	public static boolean method6139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}
}
