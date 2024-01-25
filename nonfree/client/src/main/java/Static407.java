import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Lclient!qt;")
	public static final Class212 aClass212_90 = new Class212(5, 7);

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
	public static void method5680(@OriginalArg(1) byte arg0) {
		if (Static180.aByteArrayArrayArray3 == null) {
			Static180.aByteArrayArrayArray3 = new byte[4][Static193.anInt3853][Static301.anInt5585];
		}
		for (@Pc(20) int local20 = 0; local20 < 4; local20++) {
			for (@Pc(24) int local24 = 0; local24 < Static193.anInt3853; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static301.anInt5585; local28++) {
					Static180.aByteArrayArrayArray3[local20][local24][local28] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)[Lclient!ea;")
	public static Class56[] method5681() {
		return new Class56[] { Static91.aClass56_1, Static288.aClass56_3, Static251.aClass56_2 };
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZ)V")
	public static void method5682() {
		@Pc(5) Class83 local5 = Static408.aClass83_58;
		synchronized (Static408.aClass83_58) {
			Static408.aClass83_58.method2345(5);
		}
	}
}
