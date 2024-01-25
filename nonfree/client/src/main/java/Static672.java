import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static672 {

	@OriginalMember(owner = "client!wo", name = "x", descriptor = "Z")
	public static boolean aBoolean752;

	@OriginalMember(owner = "client!wo", name = "G", descriptor = "Lclient!cga;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public static void method8950() {
		if (Static207.anInt9082 < 0) {
			return;
		}
		@Pc(4) long local4 = Static15.method380();
		Static207.anInt9082 = (int) ((long) Static207.anInt9082 + Static452.aLong201 - local4);
		if (Static207.anInt9082 > 0) {
			@Pc(23) int local23 = (Static207.anInt9082 << 8) / Static660.anInt10727;
			@Pc(28) int local28 = 255 - local23;
			@Pc(33) float local33 = (float) local23 / 255.0F;
			@Pc(38) float local38 = 1.0F - local33;
			Static295.anInt5040 = (local23 * (Static498.anInt10929 & 0xFF00) + local28 * (Static352.aClass382_2.anInt10682 & 0xFF00) & 0xFF0000) + (local23 * (Static498.anInt10929 & 0xFF00FF) + (local28 * (Static352.aClass382_2.anInt10682 & 0xFF00FF)) & 0xFF00FF00) >>> 8;
			Static148.anInt2713 = (local23 * (Static424.anInt6911 & 0xFF00FF) + (Static352.aClass382_2.anInt10672 & 0xFF00FF) * local28 & 0xFF00FF00) + (local28 * (Static352.aClass382_2.anInt10672 & 0xFF00) + local23 * (Static424.anInt6911 & 0xFF00) & 0xFF0000) >>> 8;
			Static1.aFloat206 = (Static352.aClass382_2.aFloat209 - Static41.aFloat6) * local38 + Static41.aFloat6;
			Static595.aFloat185 = (Static352.aClass382_2.aFloat208 - Static187.aFloat60) * local38 + Static187.aFloat60;
			Static261.aFloat76 = Static46.aFloat9 + local38 * (Static352.aClass382_2.aFloat212 - Static46.aFloat9);
			Static655.aFloat213 = (Static352.aClass382_2.aFloat210 - Static286.aFloat77) * local38 + Static286.aFloat77;
			Static403.anInt10573 = Static435.anInt7105 * local23 + Static352.aClass382_2.anInt10679 * local28 >> 8;
			Static43.aFloat7 = local38 * (Static352.aClass382_2.aFloat211 - Static347.aFloat105) + Static347.aFloat105;
			Static563.aFloat178 = local38 * (Static352.aClass382_2.aFloat207 - Static401.aFloat125) + Static401.aFloat125;
			if (Static352.aClass382_2.aClass57_4 != Static80.aClass57_2) {
				Static127.aClass57_3 = Static491.aClass95_11.method8055(Static80.aClass57_2, Static352.aClass382_2.aClass57_4, local38, Static127.aClass57_3);
			}
		} else {
			Static1.aFloat206 = Static352.aClass382_2.aFloat209;
			Static295.anInt5040 = Static352.aClass382_2.anInt10682;
			Static403.anInt10573 = Static352.aClass382_2.anInt10679;
			Static43.aFloat7 = Static352.aClass382_2.aFloat211;
			Static127.aClass57_3 = Static352.aClass382_2.aClass57_4;
			Static595.aFloat185 = Static352.aClass382_2.aFloat208;
			Static207.anInt9082 = -1;
			Static148.anInt2713 = Static352.aClass382_2.anInt10672;
			Static261.aFloat76 = Static352.aClass382_2.aFloat212;
			Static563.aFloat178 = Static352.aClass382_2.aFloat207;
			Static655.aFloat213 = Static352.aClass382_2.aFloat210;
		}
		Static452.aLong201 = local4;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)Lclient!rfa;")
	public static Class307 method8958(@OriginalArg(1) int arg0) {
		@Pc(10) Class307 local10 = (Class307) Static386.aClass295_42.method6470((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(27) byte[] local27 = Static91.aClass362_21.method8368(0, arg0);
		local10 = new Class307();
		if (local27 != null) {
			local10.method6731(new Class3_Sub4(local27));
		}
		local10.method6734();
		Static386.aClass295_42.method6469((long) arg0, local10);
		return local10;
	}
}
