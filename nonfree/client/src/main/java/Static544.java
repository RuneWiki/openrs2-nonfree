import java.awt.Color;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
	public static int anInt8937 = 0;

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "Z")
	public static boolean aBoolean761 = false;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)V")
	public static void method7592() {
		Static111.aClass390_79.anInt10731 = 1;
		Static141.method2486();
		Static253.aBoolean373 = true;
		Static391.aBoolean602 = true;
		Static567.method7777();
		for (@Pc(8350) int local8350 = 0; local8350 < Static564.aClass371Array6.length; local8350++) {
			Static564.aClass371Array6[local8350] = null;
		}
		Static55.aBoolean60 = false;
		Static354.method5342();
		Static569.anInt9215 = (int) (Math.random() * 30.0D) - 20;
		Static430.anInt57 = (int) (Math.random() * 80.0D) - 40;
		Static157.aFloat83 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static390.anInt6937 = (int) (Math.random() * 100.0D) - 50;
		Static213.anInt9568 = (int) (Math.random() * 120.0D) - 60;
		Static110.anInt2345 = (int) (Math.random() * 110.0D) - 55;
		Static513.method7301();
		for (@Pc(8413) int local8413 = 0; local8413 < 2048; local8413++) {
			Static351.aClass28_Sub1_Sub4_Sub2_Sub2Array2[local8413] = null;
		}
		Static37.anInt617 = 0;
		Static36.anInt607 = 0;
		Static56.aClass300_8.method7189();
		Static641.aClass114_67.method2808();
		Static456.aClass114_53.method2808();
		Static394.aClass156_4.method3782();
		Static548.aClass300_41.method7189();
		Static173.aClass114_20 = new Class114();
		Static256.aClass114_27 = new Class114();
		Static161.aClass237_3.method5684();
		Static353.method5336();
		Static228.anInt4189 = 0;
		Static392.anInt6960 = 0;
		Static267.anInt4950 = 0;
		Static274.anInt5033 = 0;
		Static184.anInt3595 = 0;
		Static556.anInt9087 = 0;
		Static260.anInt4823 = 0;
		Static672.anInt10801 = 0;
		Static201.anInt3831 = 0;
		Static680.anInt10895 = 0;
		for (@Pc(8478) int local8478 = 0; local8478 < Static326.anIntArray342.length; local8478++) {
			if (!Static180.aBooleanArray15[local8478]) {
				Static326.anIntArray342[local8478] = -1;
			}
		}
		if (Static84.anInt2018 != -1) {
			Static23.method296(Static84.anInt2018);
		}
		for (@Pc(8504) Class5_Sub39 local8504 = (Class5_Sub39) Static452.aClass300_33.method7182(); local8504 != null; local8504 = (Class5_Sub39) Static452.aClass300_33.method7192()) {
			if (!local8504.method9048()) {
				local8504 = (Class5_Sub39) Static452.aClass300_33.method7182();
				if (local8504 == null) {
					break;
				}
			}
			Static68.method931(local8504, true, false);
		}
		Static84.anInt2018 = -1;
		Static452.aClass300_33 = new Class300(8);
		Static62.method837();
		Static244.aClass345_7 = null;
		for (@Pc(8542) int local8542 = 0; local8542 < 8; local8542++) {
			Static459.aStringArray46[local8542] = null;
			Static147.aBooleanArray12[local8542] = false;
			Static361.anIntArray374[local8542] = -1;
		}
		Static598.method8189();
		Static288.aBoolean485 = true;
		for (@Pc(8565) int local8565 = 0; local8565 < 100; local8565++) {
			Static57.aBooleanArray2[local8565] = true;
		}
		for (@Pc(8576) int local8576 = 0; local8576 < 6; local8576++) {
			Static277.aClass2Array1[local8576] = new Class2();
		}
		for (@Pc(8589) int local8589 = 0; local8589 < 25; local8589++) {
			Static211.anIntArray200[local8589] = 0;
			Static293.anIntArray312[local8589] = 0;
			Static277.anIntArray294[local8589] = 0;
		}
		Static459.method6575();
		Static260.aBoolean411 = true;
		Static607.aShortArray91 = Static470.aShortArray87 = Static653.aShortArray157 = Static672.aShortArray158 = new short[256];
		Static634.aString107 = Static64.aClass52_26.method907(anInt8937);
		Static172.aClass5_Sub50_14.method7531(Static172.aClass5_Sub50_14.aClass12_Sub13_1.method3075(), Static172.aClass5_Sub50_14.aClass12_Sub13_2);
		Static172.aClass5_Sub50_14.method7531(Static172.aClass5_Sub50_14.aClass12_Sub8_1.method2213(), Static172.aClass5_Sub50_14.aClass12_Sub8_2);
		Static446.anInt7663 = 0;
		Static377.method5635();
		Static640.method8649();
		Static340.aLong164 = 0L;
		Static111.aClass390_79.anInt10731 = 2;
		Static207.aClass5_Sub29_2 = null;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method7593() {
		@Pc(5) String local5 = "www";
		if (Static217.aClass187_7 == Static584.aClass187_14) {
			local5 = "www-wtrc";
		} else if (Static104.aClass187_1 == Static217.aClass187_7) {
			local5 = "www-wtqa";
		} else if (Static221.aClass187_15 == Static217.aClass187_7) {
			local5 = "www-wtwip";
		}
		@Pc(32) String local32 = "";
		if (Static89.aString11 != null) {
			local32 = "/p=" + Static89.aString11;
		}
		return "http://" + local5 + "." + Static218.aClass98_2.aString13 + ".com/l=" + anInt8937 + "/a=" + Static254.anInt4619 + local32 + "/";
	}
}
