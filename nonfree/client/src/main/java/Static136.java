import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!fg", name = "g", descriptor = "Lclient!n;")
	public static Class225 aClass225_14;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "I")
	public static int anInt2913;

	@OriginalMember(owner = "client!fg", name = "i", descriptor = "I")
	public static int anInt2909 = 0;

	@OriginalMember(owner = "client!fg", name = "k", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!gv;")
	public static final Class128 aClass128_3 = new Class128();

	@OriginalMember(owner = "client!fg", name = "o", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_67 = new Class362(61, -1);

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BZ)V")
	public static void method2695(@OriginalArg(1) boolean arg0) {
		if (arg0 && Static455.aClass4_Sub5_Sub8_2 != null) {
			Static443.anInt8270 = Static455.aClass4_Sub5_Sub8_2.anInt3856;
		} else {
			Static443.anInt8270 = -1;
		}
		aClass225_14 = null;
		Static264.aClass244_39 = null;
		Static455.aClass4_Sub5_Sub8_2 = null;
		Static312.anInt6205 = 0;
		Static455.method3082();
		Static455.aClass244_24.method5962();
		Static2.aClass183_1 = null;
		Static230.aClass183_3 = null;
		Static428.aClass183_6 = null;
		Static451.aClass183_7 = null;
		Static455.aClass59_3 = null;
		Static159.aClass78_6 = null;
		Static224.aClass183_2 = null;
		Static471.aClass183_8 = null;
		Static347.aClass183_4 = null;
		Class1_Sub4_Sub4_Sub2.lb = -1;
		Static189.anInt3714 = -1;
		Static347.aClass183_5 = null;
		if (Static455.aClass142_2 != null) {
			Static455.aClass142_2.method3368();
			Static455.aClass142_2.method3365(128, 64);
		}
		if (Static455.aClass237_2 != null) {
			Static455.aClass237_2.method5790(64, 64);
		}
		if (Static455.aClass139_5 != null) {
			Static455.aClass139_5.method3312(64);
		}
		Static381.aClass2_4.method65(64);
	}

	@OriginalMember(owner = "client!fg", name = "c", descriptor = "(I)V")
	public static void method2696() {
		@Pc(1) Class223 local1 = Static267.aClass223_36;
		synchronized (Static267.aClass223_36) {
			Static267.aClass223_36.method5398();
		}
		local1 = Static571.aClass223_66;
		synchronized (Static571.aClass223_66) {
			Static571.aClass223_66.method5398();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(ILclient!r;)V")
	public static void method2698(@OriginalArg(1) Class44 arg0) {
		@Pc(7) int local7 = Static19.anInt285;
		@Pc(9) int local9 = Static543.anInt9642;
		@Pc(11) int local11 = Static179.anInt3618;
		@Pc(13) int local13 = Static17.anInt279;
		arg0.method5006(local7, local11, local9, -10660793, local13);
		arg0.method5006(local7 + 1, local11 + -2, local9 + 1, -16777216, 16);
		arg0.method5030(local13 - 19, -16777216, local9 + 18, local11 - 2, local7 + 1);
		Static552.aClass58_14.method8156(-1, -10660793, Static590.aClass364_28.method8334(Static154.anInt3181), local9 + 14, local7 - -3);
		@Pc(76) int local76 = Static172.aClass135_1.method6370();
		@Pc(80) int local80 = Static172.aClass135_1.method6378();
		@Pc(82) int local82 = 0;
		for (@Pc(87) Class4_Sub39 local87 = (Class4_Sub39) Static40.aClass244_4.method5963(); local87 != null; local87 = (Class4_Sub39) Static40.aClass244_4.method5965()) {
			@Pc(102) int local102 = (Static339.anInt6583 - local82 - 1) * 16 + local9 + 31;
			@Pc(104) short local104 = -1;
			if (local7 < local76 && local76 < local7 + local11 && local80 > local102 - 13 && local102 + 3 > local80 && local87.aBoolean605) {
				local104 = -256;
			}
			@Pc(137) int[] local137 = null;
			if (Static504.method7403(local87.anInt8541)) {
				local137 = Static521.aClass273_2.method6712((int) local87.aLong219).anIntArray364;
			} else if (local87.anInt8545 != -1) {
				local137 = Static521.aClass273_2.method6712(local87.anInt8545).anIntArray364;
			} else if (Static114.method7979(local87.anInt8541)) {
				@Pc(168) Class4_Sub4 local168 = (Class4_Sub4) Static585.aClass350_41.method8207((long) local87.aLong219);
				if (local168 != null) {
					@Pc(173) Class1_Sub4_Sub2_Sub1_Sub1 local173 = local168.aClass1_Sub4_Sub2_Sub1_Sub1_1;
					@Pc(176) Class283 local176 = local173.aClass283_1;
					if (local176.anIntArray453 != null) {
						local176 = local176.method6834(Static45.aClass148_1);
					}
					if (local176 != null) {
						local137 = local176.anIntArray451;
					}
				}
			} else if (Static52.method683(local87.anInt8541)) {
				@Pc(214) Class101 local214;
				if (local87.anInt8541 == 1011) {
					local214 = Static204.aClass139_8.method3309((int) local87.aLong219);
				} else {
					local214 = Static204.aClass139_8.method3309((int) (local87.aLong219 >>> 32 & 0x7FFFFFFFL));
				}
				if (local214.anIntArray140 != null) {
					local214 = local214.method2710(Static45.aClass148_1);
				}
				if (local214 != null) {
					local137 = local214.anIntArray135;
				}
			}
			@Pc(248) String local248 = Static464.method7047(local87);
			if (local137 != null) {
				local248 = local248 + Static67.method1095(local137);
			}
			Static552.aClass58_14.method8174(Static12.anIntArray10, local7 + 3, local248, local104, local102, Static500.aClass78Array18);
			local82++;
			if (local87.aBoolean606) {
				Static32.aClass78_1.method8185(Static314.aClass114_11.method2950(local248) + local7 + 5, local102 + -12);
			}
		}
		Static506.method2842(Static543.anInt9642, Static17.anInt279, Static19.anInt285, Static179.anInt3618);
	}
}
