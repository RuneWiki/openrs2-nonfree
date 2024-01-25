import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static544 {

	@OriginalMember(owner = "client!tia", name = "m", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!tia", name = "s", descriptor = "J")
	public static long aLong244;

	@OriginalMember(owner = "client!tia", name = "e", descriptor = "Lclient!sj;")
	public static final Class316 aClass316_5 = new Class316("game3", 2);

	@OriginalMember(owner = "client!tia", name = "a", descriptor = "(Z)Ljava/lang/String;")
	public static String method8156() {
		@Pc(12) String local12 = "www";
		if (Static299.aClass107_4 == Static193.aClass107_2) {
			local12 = "www-wtrc";
		} else if (Static193.aClass107_2 == Static223.aClass107_3) {
			local12 = "www-wtqa";
		} else if (Static193.aClass107_2 == Static354.aClass107_6) {
			local12 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static26.aString7 != null) {
			local33 = "/p=" + Static26.aString7;
		}
		return "http://" + local12 + "." + Static423.aClass316_4.aString98 + ".com/l=" + Static476.anInt8915 + "/a=" + Static482.anInt8988 + local33 + "/";
	}

	@OriginalMember(owner = "client!tia", name = "b", descriptor = "(Z)Z")
	public static boolean method8157() {
		try {
			if (Static614.anInt10750 == 2) {
				if (Static605.aClass2_Sub14_11 == null) {
					Static605.aClass2_Sub14_11 = Static649.method2686(Static42.aClass157_33, Static177.anInt4267, Static77.anInt10672);
					if (Static605.aClass2_Sub14_11 == null) {
						return false;
					}
				}
				if (Static393.aClass138_1 == null) {
					Static393.aClass138_1 = new Class138(Static242.aClass157_120, Static10.aClass157_5);
				}
				@Pc(31) Class2_Sub8_Sub3 local31 = Static341.aClass2_Sub8_Sub3_4;
				if (Static603.aClass2_Sub8_Sub3_5 != null) {
					local31 = Static603.aClass2_Sub8_Sub3_5;
				}
				if (local31.method5808(Static605.aClass2_Sub14_11, Static393.aClass138_1, Static302.aClass157_149)) {
					Static341.aClass2_Sub8_Sub3_4 = local31;
					Static341.aClass2_Sub8_Sub3_4.method5806();
					@Pc(61) int local61;
					if (Static92.anInt2680 <= 0) {
						Static614.anInt10750 = 0;
						Static341.aClass2_Sub8_Sub3_4.method5803(Static267.anInt5676);
						for (local61 = 0; local61 < Static537.anIntArray638.length; local61++) {
							Static341.aClass2_Sub8_Sub3_4.method5785(Static537.anIntArray638[local61], local61);
							Static537.anIntArray638[local61] = 255;
						}
					} else {
						Static614.anInt10750 = 3;
						Static341.aClass2_Sub8_Sub3_4.method5803(Static92.anInt2680 > Static267.anInt5676 ? Static267.anInt5676 : Static92.anInt2680);
						for (local61 = 0; local61 < Static537.anIntArray638.length; local61++) {
							Static341.aClass2_Sub8_Sub3_4.method5785(Static537.anIntArray638[local61], local61);
							Static537.anIntArray638[local61] = 255;
						}
					}
					if (Static603.aClass2_Sub8_Sub3_5 == null) {
						if (Static26.aLong14 <= 0L) {
							Static341.aClass2_Sub8_Sub3_4.method5811(Static605.aClass2_Sub14_11, Static122.aBoolean721);
						} else {
							Static341.aClass2_Sub8_Sub3_4.method5812(Static605.aClass2_Sub14_11, Static26.aLong14, Static122.aBoolean721);
						}
					}
					if (Static455.aClass33_22 != null) {
						Static455.aClass33_22.method7218(Static341.aClass2_Sub8_Sub3_4);
					}
					Static42.aClass157_33 = null;
					Static605.aClass2_Sub14_11 = null;
					Static26.aLong14 = 0L;
					Static393.aClass138_1 = null;
					Static603.aClass2_Sub8_Sub3_5 = null;
					return true;
				}
			}
		} catch (@Pc(167) Exception local167) {
			local167.printStackTrace();
			Static341.aClass2_Sub8_Sub3_4.method5819();
			Static603.aClass2_Sub8_Sub3_5 = null;
			Static393.aClass138_1 = null;
			Static605.aClass2_Sub14_11 = null;
			Static42.aClass157_33 = null;
			Static614.anInt10750 = 0;
		}
		return false;
	}
}
