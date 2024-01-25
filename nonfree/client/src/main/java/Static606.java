import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static606 {

	@OriginalMember(owner = "client!ui", name = "h", descriptor = "[I")
	public static final int[] anIntArray656 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "Lclient!gp;")
	public static final Class137 aClass137_5 = new Class137();

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
	public static int anInt9314 = 765;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_141 = new Class216(64, 11);

	@OriginalMember(owner = "client!ui", name = "z", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray33 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

	@OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
	public static int anInt9316 = 0;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
	public static void method7949() {
		if (Static124.anInt2310 == 1 || Static124.anInt2310 == 3 || Static124.anInt2310 != Static408.anInt5896 && (Static124.anInt2310 == 0 || Static408.anInt5896 == 0)) {
			Static15.anInt1571 = 0;
			Static105.anInt2131 = 0;
			Static597.aClass66_41.method1988();
		}
		Static408.anInt5896 = Static124.anInt2310;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method7951(@OriginalArg(0) int arg0) {
		Static141.anInt2583 = arg0;
		Static306.anInt4811 = 2;
		if (Static420.aString78 == null) {
			Static97.method1973(35);
		} else {
			@Pc(20) Class4_Sub11 local20 = new Class4_Sub11(Static85.method1765(Static483.method6617(Static420.aString78)));
			@Pc(24) long local24 = local20.method8830();
			Static238.aLong116 = local20.method8830();
			Static395.method2777(Static414.method5217(local24), false, true, "");
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBLjava/lang/String;)Z")
	public static boolean method7952(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (Static239.aClass207_2.aBoolean399) {
			Static653.aClass382_5 = new Class382();
			Static653.aClass382_5.anInt10282 = arg0;
			Static653.aClass382_5.aString122 = arg1;
			if (Static215.aClass60_4 != Static181.aClass60_3) {
				Static653.aClass382_5.anInt10280 = Static653.aClass382_5.anInt10282 + 40000;
				Static653.aClass382_5.anInt10279 = Static653.aClass382_5.anInt10282 + 50000;
			}
			for (@Pc(35) int local35 = 0; local35 < Static382.aClass22_Sub1Array1.length; local35++) {
				if (arg0 == Static382.aClass22_Sub1Array1[local35].anInt1421) {
					Static255.anInt4152 = Static382.aClass22_Sub1Array1[local35].anInt1414;
				}
			}
			return true;
		}
		@Pc(61) String local61 = "";
		if (Static181.aClass60_3 != Static215.aClass60_4) {
			local61 = ":" + (arg0 + 7000);
		}
		@Pc(81) String local81 = "";
		if (Static264.aString40 != null) {
			local81 = "/p=" + Static264.aString40;
		}
		@Pc(129) String local129 = "http://" + arg1 + local61 + "/l=" + Static164.anInt2984 + "/a=" + Static461.anInt7416 + local81 + "/j" + (Static278.aBoolean340 ? "1" : "0") + ",o" + (Static196.aBoolean248 ? "1" : "0") + ",a2";
		try {
			Static205.aClient1.getAppletContext().showDocument(new URL(local129), "_self");
			return true;
		} catch (@Pc(139) Exception local139) {
			return false;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public static void method7955() {
		Static449.aClass33_11.xa(((float) Static124.aClass4_Sub20_4.aClass8_Sub9_1.method3807() * 0.1F + 0.7F) * 1.1523438F);
		Static449.aClass33_11.ZA(Static574.anInt8897, 0.69921875F, 1.2F, -200.0F, -240.0F, -200.0F);
		Static449.aClass33_11.L(Static538.anInt8334, -1, 0);
		Static449.aClass33_11.method8069(Static198.aClass68_2);
	}
}
