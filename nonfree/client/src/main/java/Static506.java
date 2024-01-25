import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static506 {

	@OriginalMember(owner = "client!qw", name = "k", descriptor = "Lclient!eba;")
	public static Class81 aClass81_6;

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString85 = null;

	@OriginalMember(owner = "client!qw", name = "f", descriptor = "Lclient!mt;")
	public static final Class228 aClass228_12 = new Class228(0, 2, 2, 1);

	@OriginalMember(owner = "client!qw", name = "l", descriptor = "Lclient!tja;")
	public static final Class336 aClass336_16 = new Class336(14, 7);

	@OriginalMember(owner = "client!qw", name = "m", descriptor = "Ljava/lang/String;")
	public static String aString86 = "";

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(IIIII)V")
	public static void method6784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(6) Class3_Sub8 local6 = (Class3_Sub8) Static134.aClass338_72.method8177(); local6 != null; local6 = (Class3_Sub8) Static134.aClass338_72.method8168()) {
			Static478.method6969(arg3, arg0, local6, arg1, arg2);
		}
		for (@Pc(31) Class3_Sub8 local31 = (Class3_Sub8) Static120.aClass338_66.method8177(); local31 != null; local31 = (Class3_Sub8) Static120.aClass338_66.method8168()) {
			@Pc(35) byte local35 = 1;
			@Pc(40) Class359 local40 = local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.method9315();
			if (local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == -1 || local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.aBoolean820) {
				local35 = 0;
			} else if (local40.anInt10008 == local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 || local40.anInt9990 == local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 || local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == local40.anInt9984 || local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == local40.anInt9986) {
				local35 = 2;
			} else if (local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == local40.anInt9966 || local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == local40.anInt9974 || local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == local40.anInt9976 || local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10749 == local40.anInt9997) {
				local35 = 3;
			}
			if (local31.anInt951 != local35) {
				@Pc(137) int local137 = Static576.method8133(local31.aClass28_Sub1_Sub1_Sub1_Sub2_2);
				@Pc(141) Class300 local141 = local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.aClass300_1;
				if (local141.anIntArray696 != null) {
					local141 = local141.method7258(Static131.aClass66_1);
				}
				if (local141 == null || local137 == -1) {
					local31.aBoolean68 = false;
					local31.anInt951 = local35;
					local31.anInt945 = -1;
				} else if (local31.anInt945 == local137 && local141.aBoolean633 == local31.aBoolean68) {
					local31.anInt951 = local35;
					local31.anInt946 = local141.anInt8303;
				} else {
					@Pc(177) boolean local177 = false;
					if (local31.aClass3_Sub1_Sub1_1 == null) {
						local177 = true;
					} else {
						local31.anInt946 -= 512;
						if (local31.anInt946 <= 0) {
							Static313.aClass3_Sub1_Sub2_1.method931(local31.aClass3_Sub1_Sub1_1);
							local31.aClass3_Sub1_Sub1_1 = null;
							local177 = true;
						}
					}
					if (local177) {
						local31.aClass3_Sub35_Sub1_1 = null;
						local31.aBoolean68 = local141.aBoolean633;
						local31.aClass3_Sub41_1 = null;
						local31.anInt945 = local137;
						local31.anInt946 = local141.anInt8303;
						local31.anInt951 = local35;
					}
				}
			}
			local31.anInt964 = local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10729;
			local31.anInt950 = local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10729 + (local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.method9314() << 8);
			local31.anInt955 = local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10731;
			local31.anInt947 = local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.anInt10731 + (local31.aClass28_Sub1_Sub1_Sub1_Sub2_2.method9314() << 8);
			Static478.method6969(arg3, arg0, local31, arg1, arg2);
		}
		for (@Pc(297) Class3_Sub8 local297 = (Class3_Sub8) Static533.aClass83_35.method2375(); local297 != null; local297 = (Class3_Sub8) Static533.aClass83_35.method2370()) {
			@Pc(309) byte local309 = 1;
			@Pc(314) Class359 local314 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.method9315();
			if (local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 == -1 || local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.aBoolean820) {
				local309 = 0;
			} else if (local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 == local314.anInt10008 || local314.anInt9990 == local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 || local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 == local314.anInt9984 || local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 == local314.anInt9986) {
				local309 = 2;
			} else if (local314.anInt9966 == local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 || local314.anInt9974 == local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 || local314.anInt9976 == local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 || local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10749 == local314.anInt9997) {
				local309 = 3;
			}
			if (local309 != local297.anInt951) {
				@Pc(395) int local395 = Static296.method4575(local297.aClass28_Sub1_Sub1_Sub1_Sub1_1);
				if (local297.anInt945 == local395 && local297.aBoolean68 == local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.aBoolean794) {
					local297.anInt946 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10531;
					local297.anInt951 = local309;
				} else {
					@Pc(421) boolean local421 = false;
					if (local297.aClass3_Sub1_Sub1_1 == null) {
						local421 = true;
					} else {
						local297.anInt946 -= 512;
						if (local297.anInt946 <= 0) {
							Static313.aClass3_Sub1_Sub2_1.method931(local297.aClass3_Sub1_Sub1_1);
							local421 = true;
							local297.aClass3_Sub1_Sub1_1 = null;
						}
					}
					if (local421) {
						local297.aClass3_Sub35_Sub1_1 = null;
						local297.anInt945 = local395;
						local297.anInt946 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10531;
						local297.aClass3_Sub41_1 = null;
						local297.anInt951 = local309;
						local297.aBoolean68 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.aBoolean794;
					}
				}
			}
			local297.anInt964 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10729;
			local297.anInt950 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10729 + (local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.method9314() << 8);
			local297.anInt955 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10731;
			local297.anInt947 = local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.anInt10731 + (local297.aClass28_Sub1_Sub1_Sub1_Sub1_1.method9314() << 8);
			Static478.method6969(arg3, arg0, local297, arg1, arg2);
		}
	}
}
