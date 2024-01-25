import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static405 {

	@OriginalMember(owner = "client!nu", name = "g", descriptor = "Lclient!wq;")
	public static final Class391 aClass391_35 = new Class391(4);

	@OriginalMember(owner = "client!nu", name = "m", descriptor = "[I")
	public static int[] anIntArray401 = new int[1];

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(Z)V")
	public static void method5932() {
		Static449.aClass208_104.anInt5851 = 1;
		Static232.method3378();
		Static127.anInt1995 = 0;
		Static395.anInt6754 = 0;
		Static209.anInt3435 = 0;
		Static404.anInt6930 = 0;
		Static231.anInt3831 = 0;
		Static128.anInt7009 = 0;
		Static232.aBoolean302 = true;
		Static429.aBoolean567 = true;
		Static109.method1568();
		for (@Pc(8386) int local8386 = 0; local8386 < Static598.aClass28Array1.length; local8386++) {
			Static598.aClass28Array1[local8386] = null;
		}
		Static199.aBoolean706 = false;
		Static78.method8194();
		Static6.anInt81 = (int) (Math.random() * 80.0D) - 40;
		Static274.anInt4832 = (int) (Math.random() * 100.0D) - 50;
		Static438.anInt7509 = (int) (Math.random() * 30.0D) - 20;
		Static609.anInt10107 = (int) (Math.random() * 120.0D) - 60;
		Static429.aFloat132 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static275.anInt4791 = (int) (Math.random() * 110.0D) - 55;
		Static147.method2070();
		for (@Pc(8455) int local8455 = 0; local8455 < 2048; local8455++) {
			Static165.aClass8_Sub1_Sub3_Sub2_Sub1Array1[local8455] = null;
		}
		Static230.anInt3776 = 0;
		Static247.anInt4256 = 0;
		Static623.aClass291_43.method6986(-97);
		Static366.aClass102_43.method1932();
		Static480.aClass102_51.method1932();
		Static270.aClass98_5.method1778();
		Static466.aClass291_33.method6986(-109);
		Static298.aClass102_38 = new Class102();
		Static605.aClass102_70 = new Class102();
		Static413.aClass118_1.method2144();
		Static192.method3805();
		Static487.anInt8166 = 0;
		Static635.anInt10332 = 0;
		Static70.anInt1127 = 0;
		Static569.anInt9543 = 0;
		Static650.anInt2304 = 0;
		Static521.anInt8819 = 0;
		Static576.anInt9663 = 0;
		Static612.anInt10117 = 0;
		Static393.anInt7347 = 0;
		Static218.anInt3558 = 0;
		for (@Pc(8525) int local8525 = 0; local8525 < Static21.anIntArray24.length; local8525++) {
			if (!Static433.aBooleanArray17[local8525]) {
				Static21.anIntArray24[local8525] = -1;
			}
		}
		if (Static390.anInt6669 != -1) {
			Static607.method8681(Static390.anInt6669);
		}
		for (@Pc(8564) Class5_Sub49 local8564 = (Class5_Sub49) Static549.aClass291_37.method6987(); local8564 != null; local8564 = (Class5_Sub49) Static549.aClass291_37.method6989()) {
			if (!local8564.method9326()) {
				local8564 = (Class5_Sub49) Static549.aClass291_37.method6987();
				if (local8564 == null) {
					break;
				}
			}
			Static372.method7048(local8564, true, false);
		}
		Static390.anInt6669 = -1;
		Static549.aClass291_37 = new Class291(8);
		Static466.method6819();
		Static24.aClass73_3 = null;
		for (@Pc(8610) int local8610 = 0; local8610 < 8; local8610++) {
			Static560.aStringArray67[local8610] = null;
			Static478.aBooleanArray19[local8610] = false;
			Static351.anIntArray340[local8610] = -1;
		}
		Static585.method8418();
		Static343.aBoolean452 = true;
		for (@Pc(8638) int local8638 = 0; local8638 < 100; local8638++) {
			Static386.aBooleanArray13[local8638] = true;
		}
		for (@Pc(8656) int local8656 = 0; local8656 < 6; local8656++) {
			Static257.aClass343Array4[local8656] = new Class343();
		}
		for (@Pc(8676) int local8676 = 0; local8676 < 25; local8676++) {
			Static370.anIntArray580[local8676] = 0;
			Static62.anIntArray51[local8676] = 0;
			Static108.anIntArray94[local8676] = 0;
		}
		Static277.method4082();
		Static258.aBoolean347 = true;
		Static309.aShortArray79 = Static482.aShortArray101 = Static447.aShortArray100 = Static256.aShortArray48 = new short[256];
		Static416.aString133 = Static582.aClass335_27.method8349(Static323.anInt5795);
		Static637.aClass5_Sub20_31.method3194(Static637.aClass5_Sub20_31.aClass24_Sub17_1.method6235(), Static637.aClass5_Sub20_31.aClass24_Sub17_2);
		Static637.aClass5_Sub20_31.method3194(Static637.aClass5_Sub20_31.aClass24_Sub25_1.method7146(), Static637.aClass5_Sub20_31.aClass24_Sub25_2);
		Static237.anInt1804 = 0;
		Static631.method8841();
		Static289.method9265();
		Static662.aLong309 = 0L;
		Static449.aClass208_104.anInt5851 = 2;
		Static347.aClass5_Sub7_3 = null;
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V")
	public static void method5934(@OriginalArg(1) String arg0, @OriginalArg(2) Throwable arg1) {
		try {
			@Pc(15) String local15 = "";
			if (arg1 != null) {
				local15 = Static379.method5556(arg1);
			}
			if (arg0 != null) {
				if (arg1 != null) {
					local15 = local15 + " | ";
				}
				local15 = local15 + arg0;
			}
			Static147.method2072(local15);
			local15 = Static223.method3181(local15, ":", "%3a");
			local15 = Static223.method3181(local15, "@", "%40");
			local15 = Static223.method3181(local15, "&", "%26");
			local15 = Static223.method3181(local15, "#", "%23");
			if (Static39.anApplet1 != null) {
				@Pc(134) Class366 local134 = Static34.aClass230_1.method5352(new URL(Static39.anApplet1.getCodeBase(), "clienterror.ws?c=" + Static342.anInt6074 + "&u=" + (Static183.aString47 == null ? String.valueOf(Static571.aLong281) : Static183.aString47) + "&v1=" + Static359.aString87 + "&v2=" + Static359.aString83 + "&e=" + local15));
				while (local134.anInt10206 == 0) {
					Static351.method5279(1L);
				}
				if (local134.anInt10206 == 1) {
					@Pc(161) DataInputStream local161 = (DataInputStream) local134.anObject18;
					local161.read();
					local161.close();
				}
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "(II)V")
	public static void method5937(@OriginalArg(1) int arg0) {
		Static652.anInt10539 = -1;
		Static436.anInt7489 = -1;
		Static622.anInt10186 = arg0;
		Static122.method1709();
	}

	@OriginalMember(owner = "client!nu", name = "b", descriptor = "(B)V")
	public static void method5940() {
		Static177.anIntArray164 = null;
		Static268.anIntArray263 = null;
		Static620.anIntArray564 = null;
		Static370.anIntArray579 = null;
		Static10.aBoolean18 = false;
		Static22.anIntArray26 = null;
	}
}
