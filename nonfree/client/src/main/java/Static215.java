import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!hba", name = "O", descriptor = "I")
	public static int anInt4112;

	@OriginalMember(owner = "client!hba", name = "F", descriptor = "Lclient!hv;")
	public static final Class146 aClass146_16 = new Class146(3, 2);

	@OriginalMember(owner = "client!hba", name = "K", descriptor = "I")
	public static int anInt4111 = 0;

	@OriginalMember(owner = "client!hba", name = "L", descriptor = "Lclient!eo;")
	public static final Class94 aClass94_5 = new Class94();

	@OriginalMember(owner = "client!hba", name = "M", descriptor = "S")
	public static short aShort43 = 320;

	@OriginalMember(owner = "client!hba", name = "N", descriptor = "[I")
	public static final int[] anIntArray359 = new int[14];

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(II)V")
	public static void method3739(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub11_Sub4 local9 = Static583.method8201(12, (long) arg0);
		local9.method2194();
	}

	@OriginalMember(owner = "client!hba", name = "f", descriptor = "(I)V")
	public static void method3742() {
		@Pc(12) Class3_Sub34 local12 = Static172.method3123(Static163.aClass375_1, Static291.aClass218_71);
		local12.aClass3_Sub25_Sub1_2.method8614(Static673.method9353());
		local12.aClass3_Sub25_Sub1_2.method8649(Static312.anInt5191);
		local12.aClass3_Sub25_Sub1_2.method8649(Static222.anInt4196);
		local12.aClass3_Sub25_Sub1_2.method8614(Static24.aClass3_Sub22_4.aClass6_Sub17_1.method5285());
		Static441.method6275(local12);
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "([I[ILclient!ai;III)Lclient!mh;")
	public static Class1_Sub3 method3743(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class13_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(35) int local35;
		if (!arg2.method7425(Static337.aClass327_12, Static246.aClass152_10)) {
			@Pc(69) int[] local69 = new int[arg4 * arg3];
			for (local23 = 0; local23 < arg3; local23++) {
				local33 = arg1[local23] + local23 * arg4;
				for (local35 = 0; local35 < arg0[local23]; local35++) {
					local69[local33++] = -16777216;
				}
			}
			return new Class1_Sub3(arg2, arg4, arg3, local69);
		}
		@Pc(21) byte[] local21 = new byte[arg3 * arg4];
		for (local23 = 0; local23 < arg3; local23++) {
			local33 = arg1[local23] + arg4 * local23;
			for (local35 = 0; local35 < arg0[local23]; local35++) {
				local21[local33++] = -1;
			}
		}
		return new Class1_Sub3(arg2, arg4, arg3, local21);
	}
}
