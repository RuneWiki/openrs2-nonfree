import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static556 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "F")
	public static float aFloat182;

	@OriginalMember(owner = "client!tr", name = "e", descriptor = "Lclient!ni;")
	public static Class223 aClass223_129;

	@OriginalMember(owner = "client!tr", name = "d", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_165 = new Class73(50, 7);

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lclient!ji;B)Ljava/lang/String;")
	public static String method7795(@OriginalArg(0) Class6_Sub8 arg0) {
		return Static410.method6447(arg0);
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIILclient!hc;)V")
	public static void method7796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub4_Sub3 arg3) {
		@Pc(4) Class186 local4 = Static180.method3388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub4_Sub3_1 = arg3;
		@Pc(16) int local16 = Static148.aClass245Array1 == Static152.aClass245Array3 ? 1 : 0;
		if (arg3.method8413()) {
			if (arg3.method8422()) {
				arg3.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local16];
				Static611.aClass9_Sub4Array5[local16] = arg3;
				return;
			}
			arg3.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local16];
			Static645.aClass9_Sub4Array6[local16] = arg3;
			Static610.aBoolean810 = true;
			return;
		}
		arg3.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local16];
		Static249.aClass9_Sub4Array4[local16] = arg3;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(III)Z")
	public static boolean method7797(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(IIIZ)V")
	public static void method7798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static495.aByteArrayArrayArray17 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(ILclient!gv;)V")
	public static void method7799(@OriginalArg(1) Class9_Sub4_Sub2_Sub1_Sub2 arg0) {
		@Pc(15) Class6_Sub45 local15 = (Class6_Sub45) Static209.aClass380_14.method8747((long) arg0.anInt4299);
		if (local15 == null) {
			Static621.method8510(arg0, (Class356) null, arg0.anIntArray197[0], 0, arg0.anIntArray198[0], arg0.aByte135, (Class9_Sub4_Sub2_Sub1_Sub1) null);
		} else {
			local15.method6945();
		}
	}
}
