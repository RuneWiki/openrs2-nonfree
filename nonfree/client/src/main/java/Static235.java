import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static235 {

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
	public static int anInt4760;

	@OriginalMember(owner = "client!jm", name = "c", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_93 = new Class73(8, 10);

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ZIIIB)V")
	public static void method4083(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		Static333.aLong169 = 0L;
		@Pc(12) int local12 = Static74.method1450();
		if (arg1 == 3 || local12 == 3) {
			arg0 = true;
		}
		if (!Static240.aClass14_7.method6886()) {
			arg0 = true;
		}
		Static168.method3170(arg1, local12, arg3, arg0, arg2);
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(ILjava/lang/String;I)Z")
	public static boolean method4085(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (Static352.aClass272_2.aBoolean511) {
			Static316.aClass105_5 = new Class105();
			Static316.aClass105_5.anInt3307 = arg0;
			Static316.aClass105_5.aString26 = arg1;
			if (Static580.aClass194_7 != Static542.aClass194_5) {
				Static316.aClass105_5.anInt3312 = Static316.aClass105_5.anInt3307 + 50000;
				Static316.aClass105_5.anInt3308 = Static316.aClass105_5.anInt3307 + 40000;
			}
			if (Static332.aClass299_Sub1Array2.length > arg0 && Static332.aClass299_Sub1Array2[arg0] != null) {
				Static243.anInt4888 = Static332.aClass299_Sub1Array2[arg0].anInt8025;
			}
			return true;
		}
		@Pc(48) String local48 = "";
		if (Static542.aClass194_5 != Static580.aClass194_7) {
			local48 = ":" + (arg0 + 7000);
		}
		@Pc(71) String local71 = "";
		if (Static110.aString17 != null) {
			local71 = "/p=" + Static110.aString17;
		}
		@Pc(119) String local119 = "http://" + arg1 + local48 + "/l=" + Static25.anInt769 + "/a=" + Static488.anInt5164 + local71 + "/j" + (Static301.aBoolean391 ? "1" : "0") + ",o" + (Static252.aBoolean206 ? "1" : "0") + ",a2";
		try {
			Static111.aClient1.getAppletContext().showDocument(new URL(local119), "_self");
			return true;
		} catch (@Pc(129) Exception local129) {
			return false;
		}
	}

	@OriginalMember(owner = "client!jm", name = "a", descriptor = "(Lclient!ts;I)I")
	public static int method4086(@OriginalArg(0) Class6_Sub45 arg0) {
		@Pc(15) String local15 = Static55.method1204(arg0);
		@Pc(17) int[] local17 = null;
		if (Static189.method3425(arg0.anInt8730)) {
			local17 = Static444.aClass322_2.method7141((int) arg0.aLong235).anIntArray485;
		} else if (arg0.anInt8734 != -1) {
			local17 = Static444.aClass322_2.method7141(arg0.anInt8734).anIntArray485;
		} else if (Static280.method4614(arg0.anInt8730)) {
			@Pc(101) Class6_Sub34 local101 = (Class6_Sub34) Static593.aClass128_43.method3263((long) arg0.aLong235);
			if (local101 != null) {
				@Pc(106) Class4_Sub1_Sub1_Sub1 local106 = local101.aClass4_Sub1_Sub1_Sub1_2;
				@Pc(109) Class273 local109 = local106.aClass273_1;
				if (local109.anIntArray537 != null) {
					local109 = local109.method6159(Static498.aClass101_1);
				}
				if (local109 != null) {
					local17 = local109.anIntArray535;
				}
			}
		} else if (Static357.method5419(arg0.anInt8730)) {
			@Pc(66) Class252 local66;
			if (arg0.anInt8730 == 1011) {
				local66 = Static412.aClass307_4.method6636((int) arg0.aLong235);
			} else {
				local66 = Static412.aClass307_4.method6636((int) (arg0.aLong235 >>> 32 & 0x7FFFFFFFL));
			}
			if (local66.anIntArray506 != null) {
				local66 = local66.method5799(Static498.aClass101_1);
			}
			if (local66 != null) {
				local17 = local66.anIntArray508;
			}
		}
		if (local17 != null) {
			local15 = local15 + Static493.method6728(local17);
		}
		@Pc(141) int local141 = Static555.aClass327_13.method7198(local15, Static194.aClass58Array9);
		if (arg0.aBoolean633) {
			local141 += Static313.aClass58_29.QA() + 4;
		}
		return local141;
	}
}
