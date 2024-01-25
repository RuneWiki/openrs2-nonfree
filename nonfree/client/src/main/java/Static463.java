import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static463 {

	@OriginalMember(owner = "client!pia", name = "n", descriptor = "I")
	public static int anInt7388;

	@OriginalMember(owner = "client!pia", name = "k", descriptor = "[I")
	public static final int[] anIntArray401 = new int[13];

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!af;B)V")
	public static void method6192(@OriginalArg(0) Class3_Sub4_Sub1 arg0) {
		arg0.method7909(Static653.aClass362_153.method8337());
		arg0.method7909(Static139.aClass362_84.method8337());
		arg0.method7909(Static532.aClass362_114.method8337());
		arg0.method7909(Static33.aClass362_118.method8337());
		arg0.method7909(Static201.aClass362_43.method8337());
		arg0.method7909(Static405.aClass362_87.method8337());
		arg0.method7909(Static214.aClass362_141.method8337());
		arg0.method7909(Static420.aClass362_91.method8337());
		arg0.method7909(Static142.aClass362_32.method8337());
		arg0.method7909(Static615.aClass362_147.method8337());
		arg0.method7909(Static69.aClass362_140.method8337());
		arg0.method7909(Static459.aClass362_101.method8337());
		arg0.method7909(Static413.aClass362_88.method8337());
		arg0.method7909(Static583.aClass362_138.method8337());
		arg0.method7909(Static585.aClass362_139.method8337());
		arg0.method7909(Static442.aClass362_97.method8337());
		arg0.method7909(Static666.aClass362_154.method8337());
		arg0.method7909(Static195.aClass362_41.method8337());
		arg0.method7909(Static354.aClass362_73.method8337());
		arg0.method7909(Static117.aClass362_22.method8337());
		arg0.method7909(Static216.aClass362_46.method8337());
		arg0.method7909(Static617.aClass362_78.method8337());
		arg0.method7909(Static302.aClass362_60.method8337());
		arg0.method7909(Static305.aClass362_61.method8337());
		arg0.method7909(Static419.aClass362_90.method8337());
		arg0.method7909(Static226.aClass362_48.method8337());
		arg0.method7909(Static368.aClass362_75.method8337());
		arg0.method7909(Static344.aClass362_72.method8337());
		arg0.method7909(Static610.aClass362_143.method8337());
		arg0.method7909(Static532.aClass362_115.method8337());
		arg0.method7909(Static523.aClass362_112.method8337());
		arg0.method7909(Static545.aClass362_122.method8337());
		arg0.method7909(Static448.method6083());
		arg0.method7909(Static70.method1235());
		arg0.method7909(Static261.aClass362_54.method8337());
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(ZLclient!ofa;I)V")
	public static void method6195(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class265 arg1) {
		@Pc(12) int local12 = arg1.anInt7000 == 0 ? arg1.anInt7024 : arg1.anInt7000;
		@Pc(24) int local24 = arg1.anInt7020 == 0 ? arg1.anInt6997 : arg1.anInt7020;
		Static190.method2931(Static270.aClass265ArrayArray2[arg1.anInt7032 >> 16], arg0, local12, arg1.anInt7032, local24);
		if (arg1.aClass265Array4 != null) {
			Static190.method2931(arg1.aClass265Array4, arg0, local12, arg1.anInt7032, local24);
		}
		@Pc(57) Class3_Sub25 local57 = (Class3_Sub25) Static513.aClass333_33.method7489((long) arg1.anInt7032);
		if (local57 != null) {
			Static124.method1848(local12, local57.anInt3959, local24, arg0);
		}
	}
}
