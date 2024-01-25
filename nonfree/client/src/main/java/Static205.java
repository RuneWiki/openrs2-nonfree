import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!haa", name = "l", descriptor = "F")
	public static float aFloat78;

	@OriginalMember(owner = "client!haa", name = "n", descriptor = "Lclient!ws;")
	public static Class394 aClass394_1;

	@OriginalMember(owner = "client!haa", name = "d", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_31 = new Class187(4);

	@OriginalMember(owner = "client!haa", name = "m", descriptor = "Lclient!ok;")
	public static final Class262 aClass262_17 = new Class262();

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method3201(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		@Pc(7) int local7 = Static209.anInt3954;
		@Pc(9) int[] local9 = Static457.anIntArray607;
		@Pc(11) boolean local11 = false;
		for (@Pc(18) int local18 = 0; local18 < local7; local18++) {
			@Pc(26) Class12_Sub2_Sub2_Sub1_Sub2 local26 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local9[local18]];
			if (local26 != null && local26 != Static657.aClass12_Sub2_Sub2_Sub1_Sub2_2 && local26.aString35 != null && local26.aString35.equalsIgnoreCase(arg1)) {
				local11 = true;
				@Pc(55) Class14_Sub19 local55;
				if (arg0 == 1) {
					local55 = Static286.method4081(aClass394_1, Static4.aClass100_1);
					local55.aClass14_Sub29_Sub1_1.method5899(0);
					local55.aClass14_Sub29_Sub1_1.method5894(local9[local18]);
					Static576.method8234(local55);
				} else if (arg0 == 4) {
					local55 = Static286.method4081(aClass394_1, Static112.aClass100_31);
					local55.aClass14_Sub29_Sub1_1.method5871(local9[local18]);
					local55.aClass14_Sub29_Sub1_1.method5883(0);
					Static576.method8234(local55);
				} else if (arg0 == 5) {
					local55 = Static286.method4081(aClass394_1, Static129.aClass100_96);
					local55.aClass14_Sub29_Sub1_1.method5892(local9[local18]);
					local55.aClass14_Sub29_Sub1_1.method5896(0);
					Static576.method8234(local55);
				} else if (arg0 == 6) {
					local55 = Static286.method4081(aClass394_1, Static513.aClass100_108);
					local55.aClass14_Sub29_Sub1_1.method5894(local9[local18]);
					local55.aClass14_Sub29_Sub1_1.method5896(0);
					Static576.method8234(local55);
				} else if (arg0 == 7) {
					local55 = Static286.method4081(aClass394_1, Static458.aClass100_120);
					local55.aClass14_Sub29_Sub1_1.method5896(0);
					local55.aClass14_Sub29_Sub1_1.method5892(local9[local18]);
					Static576.method8234(local55);
				} else if (arg0 == 9) {
					local55 = Static286.method4081(aClass394_1, Static88.aClass100_139);
					local55.aClass14_Sub29_Sub1_1.method5883(0);
					local55.aClass14_Sub29_Sub1_1.method5871(local9[local18]);
					Static576.method8234(local55);
				}
				break;
			}
		}
		if (!local11) {
			Static271.method3957(Static514.aClass303_23.method7473(Static232.anInt4258) + arg1);
		}
	}
}
