import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static150 {

	@OriginalMember(owner = "client!ga", name = "g", descriptor = "F")
	public static float aFloat66;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	public static int anInt3260 = 500;

	@OriginalMember(owner = "client!ga", name = "f", descriptor = "[I")
	public static final int[] anIntArray197 = new int[250];

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)V")
	public static void method2875(@OriginalArg(1) byte arg0) {
		if (Static273.aByteArrayArrayArray19 == null) {
			Static273.aByteArrayArrayArray19 = new byte[4][Static473.anInt8075][Static165.anInt6749];
		}
		for (@Pc(14) int local14 = 0; local14 < 4; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static473.anInt8075; local18++) {
				for (@Pc(22) int local22 = 0; local22 < Static165.anInt6749; local22++) {
					Static273.aByteArrayArrayArray19[local14][local18][local22] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(CZ)Z")
	public static boolean method2876(@OriginalArg(0) char arg0) {
		if (arg0 > '\u0000' && arg0 < '\u0080' || !(arg0 < ' ' || arg0 > 'ÿ')) {
			return true;
		}
		if (arg0 != '\u0000') {
			@Pc(35) char[] local35 = Static422.aCharArray8;
			for (@Pc(37) int local37 = 0; local37 < local35.length; local37++) {
				@Pc(43) char local43 = local35[local37];
				if (local43 == arg0) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(I[Lclient!xa;)V")
	public static void method2878(@OriginalArg(1) Class58[] arg0) {
		Static585.anInt9510 = arg0.length;
		Static194.aClass58Array9 = new Class58[Static585.anInt9510 + 10];
		Static218.anIntArray272 = new int[Static585.anInt9510 + 10];
		Static601.method2934(arg0, 0, Static194.aClass58Array9, 0, Static585.anInt9510);
		for (@Pc(26) int local26 = 0; local26 < Static585.anInt9510; local26++) {
			Static218.anIntArray272[local26] = Static194.aClass58Array9[local26].a();
		}
		for (@Pc(41) int local41 = Static585.anInt9510; local41 < Static194.aClass58Array9.length; local41++) {
			Static218.anIntArray272[local41] = 12;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!jaa;)V")
	public static void method2879(@OriginalArg(1) Class14_Sub3 arg0) {
		@Pc(16) byte[] local16;
		if (Static138.anObject5 == null) {
			@Pc(9) Class17_Sub2_Sub2 local9 = new Class17_Sub2_Sub2();
			local16 = local9.method6659();
			Static138.anObject5 = Static531.method7230(local16);
		}
		if (Static494.anObject12 == null) {
			@Pc(27) Class17_Sub1_Sub2 local27 = new Class17_Sub1_Sub2();
			local16 = local27.method4016();
			Static494.anObject12 = Static531.method7230(local16);
		}
		@Pc(42) Class238 local42 = arg0.aClass238_1;
		if (local42.method5547() && Static498.anObject13 == null) {
			local16 = Static197.method3550(new Class84_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
			Static498.anObject13 = Static531.method7230(local16);
		}
	}
}
