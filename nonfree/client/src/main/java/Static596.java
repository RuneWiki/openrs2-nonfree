import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!vda", name = "p", descriptor = "Lclient!qk;")
	public static final Class288 aClass288_333 = new Class288(79, 10);

	@OriginalMember(owner = "client!vda", name = "A", descriptor = "Lclient!cca;")
	public static final Class47 aClass47_4 = new Class47(128);

	@OriginalMember(owner = "client!vda", name = "B", descriptor = "Z")
	public static boolean aBoolean706 = false;

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ZI)V")
	public static void method8083(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static504.anInt8146 = arg0;
		Static382.aClass13_Sub9Array1 = new Class13_Sub9[Static215.anIntArray237[Static504.anInt8146] + 1];
		Static116.anInt2105 = 0;
		Static7.anInt93 = 0;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Ljava/lang/String;BZI)I")
	public static int method8084(@OriginalArg(0) String arg0, @OriginalArg(3) int arg1) {
		@Pc(31) boolean local31 = false;
		@Pc(33) boolean local33 = false;
		@Pc(35) int local35 = 0;
		@Pc(38) int local38 = arg0.length();
		for (@Pc(40) int local40 = 0; local40 < local38; local40++) {
			@Pc(46) char local46 = arg0.charAt(local40);
			if (local40 == 0) {
				if (local46 == '-') {
					local31 = true;
					continue;
				}
				if (local46 == '+') {
					continue;
				}
			}
			@Pc(98) int local98;
			if (local46 >= '0' && local46 <= '9') {
				local98 = local46 - '0';
			} else if (local46 >= 'A' && local46 <= 'Z') {
				local98 = local46 - '7';
			} else if (local46 >= 'a' && local46 <= 'z') {
				local98 = local46 - 'W';
			} else {
				throw new NumberFormatException();
			}
			if (arg1 <= local98) {
				throw new NumberFormatException();
			}
			if (local31) {
				local98 = -local98;
			}
			@Pc(122) int local122 = local35 * arg1 + local98;
			if (local35 != local122 / arg1) {
				throw new NumberFormatException();
			}
			local35 = local122;
			local33 = true;
		}
		if (!local33) {
			throw new NumberFormatException();
		}
		return local35;
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(ILclient!paa;)V")
	public static void method8085(@OriginalArg(1) Class261 arg0) {
		if (!Static8.aBoolean11) {
			return;
		}
		if (arg0.anObjectArray31 != null) {
			@Pc(18) Class261 local18 = Static98.method1508(Static301.anInt4926, Static620.anInt9955);
			if (local18 != null) {
				@Pc(24) Class2_Sub46 local24 = new Class2_Sub46();
				local24.aClass261_10 = arg0;
				local24.aClass261_11 = local18;
				local24.anObjectArray32 = arg0.anObjectArray31;
				Static300.method4138(local24);
			}
		}
		@Pc(41) Class2_Sub40 local41 = Static464.method6285(Static251.aClass131_1, Static362.aClass179_74);
		local41.aClass2_Sub22_Sub2_2.method8552(arg0.anInt6614);
		local41.aClass2_Sub22_Sub2_2.method8507(Static620.anInt9955);
		local41.aClass2_Sub22_Sub2_2.method8495(arg0.anInt6629);
		local41.aClass2_Sub22_Sub2_2.method8500(arg0.anInt6585);
		local41.aClass2_Sub22_Sub2_2.method8505(Static301.anInt4926);
		local41.aClass2_Sub22_Sub2_2.method8528(Static558.anInt9109);
		Static528.method7295(local41);
	}
}
