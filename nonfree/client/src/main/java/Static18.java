import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static18 {

	@OriginalMember(owner = "client!client", name = "L", descriptor = "I")
	public static int anInt620;

	@OriginalMember(owner = "client!client", name = "O", descriptor = "I")
	public static int anInt623;

	@OriginalMember(owner = "client!client", name = "Y", descriptor = "Lclient!sa;")
	public static Class4_Sub14 aClass4_Sub14_4;

	@OriginalMember(owner = "client!client", name = "V", descriptor = "I")
	public static int anInt630 = 0;

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!od;")
	public static Class60 aClass60_187 = Static41.method597("AUS");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Z")
	public static boolean method349(@OriginalArg(0) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
	public static void method350() {
		while (true) {
			@Pc(9) Class45 local9 = Static37.aClass45_7;
			@Pc(16) Class4_Sub12 local16;
			synchronized (Static37.aClass45_7) {
				local16 = (Class4_Sub12) Static24.aClass45_4.method995();
			}
			if (local16 == null) {
				return;
			}
			local16.aClass10_Sub1_10.method1795(local16.aByteArray15, (int) local16.aLong100, false, local16.aClass56_31);
		}
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method352() {
		Static67.aClass12_12.method284();
	}

	@OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
	public static void method353() {
		aClass4_Sub14_4 = null;
		aClass60_187 = null;
	}
}
