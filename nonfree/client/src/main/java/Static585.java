import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	public static int anInt9271 = 0;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!jia;")
	public static final Class193 aClass193_63 = new Class193();

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	public static void method7868(@OriginalArg(0) boolean arg0) {
		if (arg0 && Static574.aClass3_Sub6_Sub13_3 != null) {
			Static306.anInt5580 = Static574.aClass3_Sub6_Sub13_3.anInt5161;
		} else {
			Static306.anInt5580 = -1;
		}
		Static574.aClass3_Sub6_Sub13_3 = null;
		Static647.aClass208_13 = null;
		Static553.aClass193_57 = null;
		Static678.anInt10338 = 0;
		Static574.method7077();
		Static574.aClass193_53.method4458();
		Static140.aClass281_1 = null;
		Static296.anInt8194 = -1;
		Static574.aClass121_3 = null;
		Static268.aClass102_13 = null;
		Static280.aClass281_5 = null;
		Static374.aClass281_6 = null;
		Static146.aClass281_2 = null;
		Static575.aClass281_9 = null;
		Static644.aClass281_10 = null;
		Static577.anInt9150 = -1;
		Static219.aClass281_8 = null;
		Static195.aClass281_3 = null;
		if (Static574.aClass321_3 != null) {
			Static574.aClass321_3.method7486();
			Static574.aClass321_3.method7482(128, 64);
		}
		if (Static574.aClass116_4 != null) {
			Static574.aClass116_4.method2723(64, 64);
		}
		if (Static574.aClass374_4 != null) {
			Static574.aClass374_4.method8353(64);
		}
		Static442.aClass388_1.method8668(64);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method7869(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static121.anInt2381 >= 200 && !Static127.aBoolean203 || Static121.anInt2381 >= 200) {
			Static304.method4693(Static569.aClass335_11.method7694(Static319.anInt5939));
			local30 = Static569.aClass335_12.method7694(Static319.anInt5939);
			if (local30 != null) {
				Static304.method4693(local30);
			}
			return;
		}
		local30 = Static102.method2010(arg0);
		if (local30 == null) {
			return;
		}
		for (@Pc(46) int local46 = 0; local46 < Static121.anInt2381; local46++) {
			@Pc(54) String local54 = Static102.method2010(Static260.aStringArray36[local46]);
			if (local54 != null && local54.equals(local30)) {
				Static304.method4693(arg0 + Static569.aClass335_39.method7694(Static319.anInt5939));
				return;
			}
			if (Static217.aStringArray32[local46] != null) {
				@Pc(85) String local85 = Static102.method2010(Static217.aStringArray32[local46]);
				if (local85 != null && local85.equals(local30)) {
					Static304.method4693(arg0 + Static569.aClass335_39.method7694(Static319.anInt5939));
					return;
				}
			}
		}
		for (@Pc(120) int local120 = 0; local120 < Static173.anInt3293; local120++) {
			@Pc(128) String local128 = Static102.method2010(Static564.aStringArray72[local120]);
			if (local128 != null && local128.equals(local30)) {
				Static304.method4693(Static569.aClass335_44.method7694(Static319.anInt5939) + arg0 + Static569.aClass335_45.method7694(Static319.anInt5939));
				return;
			}
			if (Static196.aStringArray26[local120] != null) {
				@Pc(164) String local164 = Static102.method2010(Static196.aStringArray26[local120]);
				if (local164 != null && local164.equals(local30)) {
					Static304.method4693(Static569.aClass335_44.method7694(Static319.anInt5939) + arg0 + Static569.aClass335_45.method7694(Static319.anInt5939));
					return;
				}
			}
		}
		if (Static102.method2010(Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aString34).equals(local30)) {
			Static304.method4693(Static569.aClass335_42.method7694(Static319.anInt5939));
		} else {
			@Pc(222) Class3_Sub44 local222 = Static275.method5689(Static383.aClass376_95, Static540.aClass282_4);
			local222.aClass3_Sub17_Sub2_3.method4849(Static153.method2617(arg0));
			local222.aClass3_Sub17_Sub2_3.method4878(arg0);
			Static616.method8089(local222);
		}
	}
}
