import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static592 {

	@OriginalMember(owner = "client!vba", name = "A", descriptor = "I")
	public static int anInt9872;

	@OriginalMember(owner = "client!vba", name = "i", descriptor = "Lclient!dh;")
	public static final Class62 aClass62_13 = new Class62("runescape", 0);

	@OriginalMember(owner = "client!vba", name = "l", descriptor = "J")
	public static long aLong256 = 0L;

	@OriginalMember(owner = "client!vba", name = "d", descriptor = "(I)I")
	public static int method8102() {
		@Pc(7) boolean local7 = false;
		@Pc(14) boolean local14 = false;
		@Pc(16) boolean local16 = false;
		if (Static379.aClass228_6.aBoolean614 && !Static379.aClass228_6.aBoolean613) {
			local7 = true;
			if (Static2.aClass3_Sub23_1.anInt4394 < 512 && Static2.aClass3_Sub23_1.anInt4394 != 0) {
				local7 = false;
			}
			if (Static372.aString79.startsWith("win")) {
				local14 = true;
				local16 = true;
			} else {
				local14 = true;
			}
		}
		if (Static448.aBoolean691) {
			local7 = false;
		}
		if (Static255.aBoolean489) {
			local14 = false;
		}
		if (Static144.aBoolean302) {
			local16 = false;
		}
		if (!local7 && !local14 && !local16) {
			return Static466.method6965();
		}
		@Pc(71) int local71 = -1;
		@Pc(73) int local73 = -1;
		if (local7) {
			try {
				local71 = Static617.method8379(2, 1000);
			} catch (@Pc(82) Exception local82) {
			}
		}
		@Pc(85) int local85 = -1;
		if (local16) {
			try {
				local85 = Static617.method8379(3, 1000);
				if (Static552.aClass3_Sub48_30.aClass23_Sub18_2.method5152() == 3) {
					@Pc(101) Class248 local101 = Static47.aClass33_3.method6230();
					@Pc(106) long local106 = local101.aLong183 & 0xFFFFFFFFFFFFL;
					@Pc(109) int local109 = local101.anInt7652;
					if (local109 == 4318) {
						local14 &= local106 >= 64425238954L;
					} else if (local109 == 4098) {
						local14 &= local106 >= 60129613779L;
					}
				}
			} catch (@Pc(145) Exception local145) {
			}
		}
		if (local14) {
			try {
				local73 = Static617.method8379(1, 1000);
			} catch (@Pc(155) Exception local155) {
			}
		}
		if (local71 == -1 && local73 == -1 && local85 == -1) {
			return Static466.method6965();
		}
		local85 = (int) ((float) local85 * 1.1F);
		local73 = (int) ((float) local73 * 1.1F);
		if (local85 < local71 && local73 < local71) {
			return Static487.method7148(local71);
		} else if (local73 >= local85) {
			return Static383.method6079(1, local73);
		} else {
			return Static383.method6079(3, local85);
		}
	}

	@OriginalMember(owner = "client!vba", name = "a", descriptor = "(ZLclient!kha;)V")
	public static void method8109(@OriginalArg(1) Class181 arg0) {
		Static580.anInt9711 = arg0.method5033("hitmarks");
		Static350.anInt6875 = arg0.method5033("hitbar_default");
		Static88.anInt2307 = arg0.method5033("timerbar_default");
		Static462.anInt8392 = arg0.method5033("headicons_pk");
		Static256.anInt5671 = arg0.method5033("headicons_prayer");
		Static74.anInt1923 = arg0.method5033("hint_headicons");
		Static368.anInt7028 = arg0.method5033("hint_mapmarkers");
		Static565.anInt9609 = arg0.method5033("mapflag");
		Static32.anInt603 = arg0.method5033("cross");
		Static559.anInt9554 = arg0.method5033("mapdots");
		Static112.anInt2937 = arg0.method5033("scrollbar");
		Static251.anInt5579 = arg0.method5033("name_icons");
		Static193.anInt4490 = arg0.method5033("floorshadows");
		Static53.anInt1126 = arg0.method5033("compass");
		Static22.anInt236 = arg0.method5033("otherlevel");
		Static498.anInt8829 = arg0.method5033("hint_mapedge");
	}
}
