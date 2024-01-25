import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!fh;")
	public static final Class113 aClass113_12 = new Class113(9, 6);

	@OriginalMember(owner = "client!im", name = "p", descriptor = "Z")
	public static final boolean aBoolean391 = false;

	@OriginalMember(owner = "client!im", name = "r", descriptor = "[I")
	public static final int[] anIntArray339 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IBI)V")
	public static void method4128(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(17) int local17;
		if (arg1 != Static153.anInt3070) {
			Static260.anIntArray327 = new int[arg1];
			for (local17 = 0; local17 < arg1; local17++) {
				Static260.anIntArray327[local17] = (local17 << 12) / arg1;
			}
			Static431.anInt7305 = arg1 - 1;
			Static299.anInt5407 = arg1 * 32;
			Static153.anInt3070 = arg1;
		}
		if (arg0 == Static377.anInt6692) {
			return;
		}
		if (Static153.anInt3070 == arg0) {
			Static211.anIntArray576 = Static260.anIntArray327;
		} else {
			Static211.anIntArray576 = new int[arg0];
			for (local17 = 0; local17 < arg0; local17++) {
				Static211.anIntArray576[local17] = (local17 << 12) / arg0;
			}
		}
		Static28.anInt6368 = arg0 - 1;
		Static377.anInt6692 = arg0;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Ljava/lang/String;JZB)V")
	public static void method4129(@OriginalArg(0) String arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2) {
		if (arg2) {
			Static426.method6110();
			if (Static371.aString57.equals("")) {
				Static257.anInt4784 = 39;
				return;
			}
		}
		@Pc(19) Class2_Sub15 local19 = new Class2_Sub15(576);
		local19.method4333(10);
		local19.method4350((int) (Math.random() * 65535.0D));
		local19.method4318(arg1);
		local19.method4350(arg2 ? Static357.anInt6389 : Static200.anInt3958);
		local19.method4313(arg0);
		local19.method4318(arg2 ? Static121.aLong76 : Static15.aLong12);
		if (arg2) {
			local19.method4318(Static3.method14(Static371.aString57));
			try {
				local19.method4318(Long.parseLong(Static127.aString20));
			} catch (@Pc(69) Exception local69) {
				Static257.anInt4784 = 39;
				return;
			}
		} else {
			local19.method4288((int) (Math.random() * 9.9999999E7D));
			local19.method4288((int) (Math.random() * 9.9999999E7D));
			local19.method4288((int) (Math.random() * 9.9999999E7D));
			local19.method4288((int) (Math.random() * 9.9999999E7D));
		}
		local19.method4288((int) (Math.random() * 9.9999999E7D));
		local19.method4301(Static357.aBigInteger6, Static534.aBigInteger9);
		@Pc(119) Class2_Sub42 local119 = Static180.method3103();
		local119.aClass2_Sub15_Sub2_2.method4333(arg2 ? Static193.aClass180_12.anInt4831 : Static193.aClass180_9.anInt4831);
		@Pc(132) int local132 = 1;
		if (Static46.aString8 != null) {
			local132 = Static46.aString8.length() + 1 + 1;
		}
		local119.aClass2_Sub15_Sub2_2.method4350(local132 + local19.anInt5241 + 28);
		local119.aClass2_Sub15_Sub2_2.method4350(621);
		local119.aClass2_Sub15_Sub2_2.method4333(Static52.anInt1264);
		local119.aClass2_Sub15_Sub2_2.method4333(Static328.aClass284_2.anInt7923);
		Static568.method7712(local119.aClass2_Sub15_Sub2_2);
		@Pc(178) String local178 = arg2 ? Static336.aString54 : Static46.aString8;
		local119.aClass2_Sub15_Sub2_2.method4333(local178 == null ? 0 : 1);
		if (local178 != null) {
			local119.aClass2_Sub15_Sub2_2.method4313(local178);
		}
		local119.aClass2_Sub15_Sub2_2.method4299(local19.anInt5241, local19.aByteArray62);
		Static531.method7296(local119);
		Static109.anInt2235 = 1;
		Static508.anInt8480 = 0;
		Static317.anInt5928 = 0;
		Static257.anInt4784 = -3;
	}
}
