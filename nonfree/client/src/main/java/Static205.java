import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!hc", name = "H", descriptor = "Lclient!hv;")
	public static Class137 aClass137_4;

	@OriginalMember(owner = "client!hc", name = "B", descriptor = "Lclient!lga;")
	public static final Class185 aClass185_89 = new Class185(61, -1);

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIBI)V")
	public static void method6795(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 * Static87.aClass6_Sub33_6.aClass14_Sub22_4.method7288() >> 8;
		if (arg0 == -1 && !Static342.aBoolean544) {
			Static114.method2514();
		} else if (arg0 != -1 && (Static281.anInt5925 != arg0 || !Static15.method551()) && local8 != 0 && !Static342.aBoolean544) {
			Static630.method8579(local8, arg0, Static5.aClass223_2, arg2);
			Static414.method6491();
		}
		if (Static281.anInt5925 != arg0) {
			Static606.aClass6_Sub4_Sub2_3 = null;
		}
		Static281.anInt5925 = arg0;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIILclient!wo;Lclient!wo;)V")
	public static void method6796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class9_Sub4_Sub1 arg3, @OriginalArg(4) Class9_Sub4_Sub1 arg4) {
		@Pc(4) Class186 local4 = Static180.method3388(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass9_Sub4_Sub1_2 = arg3;
		local4.aClass9_Sub4_Sub1_1 = arg4;
		@Pc(19) int local19 = Static148.aClass245Array1 == Static152.aClass245Array3 ? 1 : 0;
		if (!arg3.method8413()) {
			arg3.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local19];
			Static249.aClass9_Sub4Array4[local19] = arg3;
		} else if (arg3.method8422()) {
			arg3.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local19];
			Static611.aClass9_Sub4Array5[local19] = arg3;
		} else {
			arg3.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local19];
			Static645.aClass9_Sub4Array6[local19] = arg3;
			Static610.aBoolean810 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method8413()) {
			if (arg4.method8422()) {
				arg4.aClass9_Sub4_23 = Static611.aClass9_Sub4Array5[local19];
				Static611.aClass9_Sub4Array5[local19] = arg4;
				return;
			}
			arg4.aClass9_Sub4_23 = Static645.aClass9_Sub4Array6[local19];
			Static645.aClass9_Sub4Array6[local19] = arg4;
			Static610.aBoolean810 = true;
			return;
		}
		arg4.aClass9_Sub4_23 = Static249.aClass9_Sub4Array4[local19];
		Static249.aClass9_Sub4Array4[local19] = arg4;
	}
}
