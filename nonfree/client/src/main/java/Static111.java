import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dja", name = "b", descriptor = "[Lclient!haa;")
	public static Class4_Sub3[] aClass4_Sub3Array2;

	@OriginalMember(owner = "client!dja", name = "d", descriptor = "Z")
	public static boolean aBoolean132;

	@OriginalMember(owner = "client!dja", name = "f", descriptor = "Lclient!bd;")
	public static final Class32 aClass32_7 = new Class32();

	@OriginalMember(owner = "client!dja", name = "e", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_12 = new Class317(260);

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(I)V")
	public static void method1777(@OriginalArg(0) int arg0) {
		if (arg0 == 0) {
			if (Static419.anInt10673 == 2) {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[0]);
				Static156.aClass143Array1[1].method3050(Static100.aClass399Array1[1]);
			} else if (Static419.anInt10673 == 3) {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[0]);
				Static156.aClass143Array1[1].method3050(Static100.aClass399Array1[1]);
				Static156.aClass143Array1[2].method3050(Static100.aClass399Array1[2]);
			} else {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[0]);
				Static156.aClass143Array1[1].method3050(Static100.aClass399Array1[1]);
				Static156.aClass143Array1[2].method3050(Static100.aClass399Array1[2]);
				Static156.aClass143Array1[3].method3050(Static100.aClass399Array1[3]);
			}
		} else if (arg0 == 1) {
			if (Static419.anInt10673 == 2) {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[2]);
			} else if (Static419.anInt10673 == 3) {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[3]);
				Static156.aClass143Array1[1].method3050(Static100.aClass399Array1[4]);
			} else {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[4]);
				Static156.aClass143Array1[1].method3050(Static100.aClass399Array1[5]);
				Static156.aClass143Array1[2].method3050(Static100.aClass399Array1[6]);
			}
		} else if (arg0 == 2) {
			if (Static419.anInt10673 == 2) {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[3]);
				return;
			}
			if (Static419.anInt10673 == 3) {
				Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[5]);
				return;
			}
			Static156.aClass143Array1[0].method3050(Static100.aClass399Array1[7]);
		}
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(IIILclient!tha;Lclient!tha;)V")
	public static void method1778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class4_Sub3_Sub1 arg3, @OriginalArg(4) Class4_Sub3_Sub1 arg4) {
		@Pc(4) Class89 local4 = Static289.method4810(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		local4.aClass4_Sub3_Sub1_1 = arg3;
		local4.aClass4_Sub3_Sub1_2 = arg4;
		@Pc(22) int local22 = Static258.aClass159Array1 == Static346.aClass159Array2 ? 1 : 0;
		if (!arg3.method9489()) {
			arg3.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local22];
			Static170.aClass4_Sub3Array3[local22] = arg3;
		} else if (arg3.method9476()) {
			arg3.aClass4_Sub3_25 = aClass4_Sub3Array2[local22];
			aClass4_Sub3Array2[local22] = arg3;
		} else {
			arg3.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local22];
			Static664.aClass4_Sub3Array5[local22] = arg3;
			Static282.aBoolean384 = true;
		}
		if (arg4 == null) {
			return;
		}
		if (arg4.method9489()) {
			if (arg4.method9476()) {
				arg4.aClass4_Sub3_25 = aClass4_Sub3Array2[local22];
				aClass4_Sub3Array2[local22] = arg4;
				return;
			}
			arg4.aClass4_Sub3_25 = Static664.aClass4_Sub3Array5[local22];
			Static664.aClass4_Sub3Array5[local22] = arg4;
			Static282.aBoolean384 = true;
			return;
		}
		arg4.aClass4_Sub3_25 = Static170.aClass4_Sub3Array3[local22];
		Static170.aClass4_Sub3Array3[local22] = arg4;
	}

	@OriginalMember(owner = "client!dja", name = "a", descriptor = "(II)Z")
	public static boolean method1779(@OriginalArg(0) int arg0) {
		return arg0 == 11 || arg0 == 12 || arg0 == 13;
	}
}
