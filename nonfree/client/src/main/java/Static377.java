import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method5241(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static12.anInt180 >= 100 && !Static279.aBoolean332 || Static12.anInt180 >= 200) {
			Static370.method5160(Static378.aClass174_181.method4208(Static300.anInt5192));
			return;
		}
		@Pc(37) String local37 = Static30.method547(arg0);
		if (local37 == null) {
			return;
		}
		@Pc(80) String local80;
		for (@Pc(42) int local42 = 0; local42 < Static12.anInt180; local42++) {
			@Pc(50) String local50 = Static30.method547(Static296.aStringArray32[local42]);
			if (local50 != null && local50.equals(local37)) {
				Static370.method5160(arg0 + Static290.aClass174_140.method4208(Static300.anInt5192));
				return;
			}
			if (Static347.aStringArray35[local42] != null) {
				local80 = Static30.method547(Static347.aStringArray35[local42]);
				if (local80 != null && local80.equals(local37)) {
					Static370.method5160(arg0 + Static290.aClass174_140.method4208(Static300.anInt5192));
					return;
				}
			}
		}
		for (@Pc(106) int local106 = 0; local106 < Static79.anInt1430; local106++) {
			local80 = Static30.method547(Static47.aStringArray7[local106]);
			if (local80 != null && local80.equals(local37)) {
				Static370.method5160(Static36.aClass174_23.method4208(Static300.anInt5192) + arg0 + Static148.aClass174_85.method4208(Static300.anInt5192));
				return;
			}
			if (Static334.aStringArray34[local106] != null) {
				@Pc(149) String local149 = Static30.method547(Static334.aStringArray34[local106]);
				if (local149 != null && local149.equals(local37)) {
					Static370.method5160(Static36.aClass174_23.method4208(Static300.anInt5192) + arg0 + Static148.aClass174_85.method4208(Static300.anInt5192));
					return;
				}
			}
		}
		if (Static30.method547(Static203.aClass1_Sub2_Sub6_Sub2_1.aString69).equals(local37)) {
			Static370.method5160(Static261.aClass174_126.method4208(Static300.anInt5192));
		} else {
			Static307.method4633(Static194.aClass163_93);
			Static243.aClass3_Sub25_Sub1_7.method4081(Static47.method891(arg0));
			Static243.aClass3_Sub25_Sub1_7.method4080(arg0);
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BI)V")
	public static void method5243(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static243.anInt7147 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIZ)Z")
	public static boolean method5246(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(11) Interface5 local11 = (Interface5) Static392.method5427(arg1, arg0, arg2);
		if (local11 != null) {
			local5 = Static126.method1993(local11) & true;
		}
		local11 = (Interface5) Static313.method4388(arg1, arg0, arg2, jt.class);
		if (local11 != null) {
			local5 &= Static126.method1993(local11);
		}
		local11 = (Interface5) Static112.method1824(arg1, arg0, arg2);
		if (local11 != null) {
			local5 &= Static126.method1993(local11);
		}
		return local5;
	}
}
