import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static585 {

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZLclient!qja;B)V")
	public static void method8416(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class5_Sub44 arg1) {
		if (arg1.aBoolean609) {
			if (arg1.anInt8148 < 0 || Static170.method2486(arg1.anInt8148, arg1.anInt8150)) {
				if (arg0) {
					Static366.method5412(arg1.anInt8143, arg1.anInt8141, arg1.anInt8144, (Class309) null, arg1.anInt8152);
				} else {
					Static220.method3148(arg1.anInt8143, -1, arg1.anInt8141, arg1.anInt8144, arg1.anInt8150, arg1.anInt8152, arg1.anInt8140, arg1.anInt8148);
				}
				arg1.method9327(1);
			}
		} else if (arg1.aBoolean608 && arg1.anInt8141 >= 1 && arg1.anInt8152 >= 1 && Static544.anInt9261 - 2 >= arg1.anInt8141 && arg1.anInt8152 <= Static282.anInt4887 - 2) {
			if (arg1.anInt8146 >= 0 && !Static170.method2486(arg1.anInt8146, arg1.anInt8142)) {
				return;
			}
			if (arg0) {
				Static366.method5412(arg1.anInt8143, arg1.anInt8141, arg1.anInt8144, arg1.aClass309_2, arg1.anInt8152);
			} else {
				Static220.method3148(arg1.anInt8143, -1, arg1.anInt8141, arg1.anInt8144, arg1.anInt8142, arg1.anInt8152, arg1.anInt8139, arg1.anInt8146);
			}
			arg1.aBoolean608 = false;
			if (!arg0 && arg1.anInt8148 == arg1.anInt8146 && arg1.anInt8148 == -1) {
				arg1.method9327(1);
				return;
			}
			if (!arg0 && arg1.anInt8146 == arg1.anInt8148 && arg1.anInt8139 == arg1.anInt8140 && arg1.anInt8142 == arg1.anInt8150) {
				arg1.method9327(1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "([BB)Ljava/lang/String;")
	public static String method8417(@OriginalArg(0) byte[] arg0) {
		return Static455.method6706(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public static void method8418() {
		Static236.aClass291_18.method6986(-107);
	}

	@OriginalMember(owner = "client!tu", name = "b", descriptor = "(I)Z")
	public static boolean method8419() {
		try {
			if (Static496.anInt8290 == 2) {
				if (Static185.aClass5_Sub21_1 == null) {
					Static185.aClass5_Sub21_1 = Static683.method3367(Static659.aClass208_145, Static508.anInt8709, Static144.anInt2320);
					if (Static185.aClass5_Sub21_1 == null) {
						return false;
					}
				}
				if (Static606.aClass126_3 == null) {
					Static606.aClass126_3 = new Class126(Static104.aClass208_17, Static59.aClass208_11);
				}
				@Pc(34) Class5_Sub16_Sub4 local34 = Static28.aClass5_Sub16_Sub4_6;
				if (Static622.aClass5_Sub16_Sub4_8 != null) {
					local34 = Static622.aClass5_Sub16_Sub4_8;
				}
				if (local34.method6391(Static606.aClass126_3, Static185.aClass5_Sub21_1, Static328.aClass208_72)) {
					Static28.aClass5_Sub16_Sub4_6 = local34;
					Static28.aClass5_Sub16_Sub4_6.method6378();
					@Pc(78) int local78;
					if (Static243.anInt4193 > 0) {
						Static496.anInt8290 = 3;
						Static28.aClass5_Sub16_Sub4_6.method6384(Static243.anInt4193 <= Static609.anInt10105 ? Static243.anInt4193 : Static609.anInt10105);
						for (local78 = 0; local78 < Static625.anIntArray567.length; local78++) {
							Static28.aClass5_Sub16_Sub4_6.method6400(local78, Static625.anIntArray567[local78]);
							Static625.anIntArray567[local78] = 255;
						}
					} else {
						Static496.anInt8290 = 0;
						Static28.aClass5_Sub16_Sub4_6.method6384(Static609.anInt10105);
						for (local78 = 0; local78 < Static625.anIntArray567.length; local78++) {
							Static28.aClass5_Sub16_Sub4_6.method6400(local78, Static625.anIntArray567[local78]);
							Static625.anIntArray567[local78] = 255;
						}
					}
					if (Static622.aClass5_Sub16_Sub4_8 == null) {
						if (Static320.aLong176 > 0L) {
							Static28.aClass5_Sub16_Sub4_6.method6401(Static185.aClass5_Sub21_1, Static320.aLong176, Static389.aBoolean509);
						} else {
							Static28.aClass5_Sub16_Sub4_6.method6413(Static389.aBoolean509, Static185.aClass5_Sub21_1);
						}
					}
					if (Static363.aClass175_2 != null) {
						Static363.aClass175_2.method4704(Static28.aClass5_Sub16_Sub4_6);
					}
					Static622.aClass5_Sub16_Sub4_8 = null;
					Static320.aLong176 = 0L;
					Static606.aClass126_3 = null;
					Static185.aClass5_Sub21_1 = null;
					Static659.aClass208_145 = null;
					return true;
				}
			}
		} catch (@Pc(198) Exception local198) {
			local198.printStackTrace();
			Static28.aClass5_Sub16_Sub4_6.method6389();
			Static185.aClass5_Sub21_1 = null;
			Static622.aClass5_Sub16_Sub4_8 = null;
			Static659.aClass208_145 = null;
			Static496.anInt8290 = 0;
			Static606.aClass126_3 = null;
		}
		return false;
	}
}
