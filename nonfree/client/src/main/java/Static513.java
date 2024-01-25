import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "Lclient!vh;")
	public static final Class344 aClass344_91 = new Class344(71, 6);

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "Z")
	public static boolean aBoolean648 = false;

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Z)V")
	public static void method7330() {
		for (@Pc(3) int local3 = 0; local3 < Static266.aByteArrayArrayArray10.length; local3++) {
			for (@Pc(12) int local12 = 0; local12 < Static266.aByteArrayArrayArray10[0].length; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static266.aByteArrayArrayArray10[0][0].length; local16++) {
					Static266.aByteArrayArrayArray10[local3][local12][local16] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!jga;Lclient!jga;)V")
	public static void method7332(@OriginalArg(1) Class4_Sub6 arg0, @OriginalArg(2) Class4_Sub6 arg1) {
		if (arg1.aClass4_Sub6_61 != null) {
			arg1.method7880();
		}
		arg1.aClass4_Sub6_61 = arg0;
		arg1.aClass4_Sub6_62 = arg0.aClass4_Sub6_62;
		arg1.aClass4_Sub6_61.aClass4_Sub6_62 = arg1;
		arg1.aClass4_Sub6_62.aClass4_Sub6_61 = arg1;
	}
}
