import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(II[BBIII)Z")
	public static boolean method2893(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		@Pc(17) int local17 = arg0 % 8;
		@Pc(21) int local21;
		if (local17 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local17;
		}
		@Pc(38) int local38 = -((arg3 + 7) / 8);
		@Pc(48) int local48 = -((arg0 + 8 - 1) / 8);
		for (@Pc(50) int local50 = local38; local50 < 0; local50++) {
			for (@Pc(54) int local54 = local48; local54 < 0; local54++) {
				if (arg2[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local21;
			if (arg2[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg1;
		}
		return false;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!wm;I)V")
	public static void method2894(@OriginalArg(0) Class390 arg0) {
		Static215.anInt8107 = arg0.method8910("hitmarks");
		Static225.anInt4139 = arg0.method8910("hitbar_default");
		Static168.anInt3362 = arg0.method8910("timerbar_default");
		Static93.anInt2118 = arg0.method8910("headicons_pk");
		Static267.anInt4951 = arg0.method8910("headicons_prayer");
		Static500.anInt8325 = arg0.method8910("hint_headicons");
		Static175.anInt3413 = arg0.method8910("hint_mapmarkers");
		Static534.anInt8838 = arg0.method8910("mapflag");
		Static408.anInt7226 = arg0.method8910("cross");
		Static651.anInt10497 = arg0.method8910("mapdots");
		Static64.anInt989 = arg0.method8910("scrollbar");
		Static482.anInt8085 = arg0.method8910("name_icons");
		Static528.anInt8748 = arg0.method8910("floorshadows");
		Static365.anInt6631 = arg0.method8910("compass");
		Static298.anInt5761 = arg0.method8910("otherlevel");
		Static145.anInt2975 = arg0.method8910("hint_mapedge");
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!tia;I)V")
	public static void method2895(@OriginalArg(0) Class5_Sub41_Sub2 arg0) {
		arg0.method7803(Static605.aClass390_117.method8915());
		arg0.method7803(Static100.aClass390_20.method8915());
		arg0.method7803(Static111.aClass390_79.method8915());
		arg0.method7803(Static622.aClass390_120.method8915());
		arg0.method7803(Static162.aClass390_35.method8915());
		arg0.method7803(Static260.aClass390_61.method8915());
		arg0.method7803(Static396.aClass390_82.method8915());
		arg0.method7803(Static676.aClass390_129.method8915());
		arg0.method7803(Static257.aClass390_60.method8915());
		arg0.method7803(Static274.aClass390_67.method8915());
		arg0.method7803(Static83.aClass390_15.method8915());
		arg0.method7803(Static233.aClass390_54.method8915());
		arg0.method7803(Static98.aClass390_19.method8915());
		arg0.method7803(Static536.aClass390_104.method8915());
		arg0.method7803(Static180.aClass390_42.method8915());
		arg0.method7803(Static548.aClass390_107.method8915());
		arg0.method7803(Static161.aClass390_71.method8915());
		arg0.method7803(Static242.aClass390_56.method8915());
		arg0.method7803(Static145.aClass390_31.method8915());
		arg0.method7803(Static7.aClass390_1.method8915());
		arg0.method7803(Static556.aClass390_110.method8915());
		arg0.method7803(Static143.aClass390_30.method8915());
		arg0.method7803(Static432.aClass390_85.method8915());
		arg0.method7803(Static543.aClass390_106.method8915());
		arg0.method7803(Static86.aClass390_16.method8915());
		arg0.method7803(Static474.aClass390_90.method8915());
		arg0.method7803(Static230.aClass390_52.method8915());
		arg0.method7803(Static570.aClass390_113.method8915());
		arg0.method7803(Static137.aClass390_29.method8915());
		arg0.method7803(Static509.aClass390_99.method8915());
		arg0.method7803(Static205.aClass390_11.method8915());
		arg0.method7803(Static305.aClass390_77.method8915());
		arg0.method7803(Static403.method6564());
		arg0.method7803(Static106.method2036());
		arg0.method7803(Static570.aClass390_114.method8915());
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILclient!oq;I)Ljava/awt/Frame;")
	public static Frame method2896(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class268 arg2, @OriginalArg(5) int arg3) {
		if (!arg2.method6322()) {
			return null;
		}
		@Pc(18) Class310[] local18 = Static187.method5800(arg2);
		if (local18 == null) {
			return null;
		}
		@Pc(24) boolean local24 = false;
		for (@Pc(26) int local26 = 0; local26 < local18.length; local26++) {
			if (local18[local26].anInt8744 == arg3 && arg1 == local18[local26].anInt8743 && (!local24 || arg0 < local18[local26].anInt8742)) {
				arg0 = local18[local26].anInt8742;
				local24 = true;
			}
		}
		if (!local24) {
			return null;
		}
		@Pc(91) Class331 local91 = arg2.method6323(arg3, arg0, arg1);
		while (local91.anInt9108 == 0) {
			Static579.method8004(10L);
		}
		@Pc(102) Frame local102 = (Frame) local91.anObject20;
		if (local102 == null) {
			return null;
		} else if (local91.anInt9108 == 2) {
			Static312.method4926(arg2, local102);
			return null;
		} else {
			return local102;
		}
	}
}
