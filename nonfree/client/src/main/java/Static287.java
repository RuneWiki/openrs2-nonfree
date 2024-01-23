import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static287 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public static int anInt5147;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!hi;")
	public static Class66 aClass66_47;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt5142 = -1;

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "I")
	public static int anInt5144 = 0;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public static int anInt5145 = 0;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
	public static int anInt5146 = 0;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "Lclient!tg;")
	public static Class170 aClass170_11 = new Class170();

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IZ)V")
	public static void method4398(@OriginalArg(1) boolean arg0) {
		Static91.anIntArray164 = new int[104];
		Static174.anIntArray284 = new int[5];
		Static24.anIntArray24 = new int[104];
		Static180.anIntArray293 = new int[104];
		Static251.anInt4555 = 99;
		Static100.anIntArray175 = new int[104];
		Static129.anIntArray223 = new int[104];
		@Pc(35) byte local35;
		if (arg0) {
			local35 = 1;
		} else {
			local35 = 4;
		}
		Static91.aByteArrayArrayArray2 = new byte[local35][104][104];
		Static250.aByteArrayArrayArray19 = new byte[local35][104][104];
		Static244.aByteArrayArrayArray18 = new byte[local35][104][104];
		Static132.aByteArrayArrayArray12 = new byte[local35][104][104];
		Static174.aByteArrayArrayArray11 = new byte[local35][105][105];
		Static190.anIntArrayArrayArray10 = new int[local35][105][105];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method4401(@OriginalArg(1) Component arg0) {
		@Pc(10) Method local10 = Static246.aMethod1;
		if (local10 != null) {
			try {
				local10.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(26) Throwable local26) {
			}
		}
		arg0.addKeyListener(Static16.aClass111_115);
		arg0.addFocusListener(Static16.aClass111_115);
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public static void method4402() {
		if (Static109.aFloat132 < Static109.aFloat131) {
			Static109.aFloat132 = (float) ((double) Static109.aFloat132 + (double) Static109.aFloat132 / 30.0D);
			if (Static109.aFloat131 < Static109.aFloat132) {
				Static109.aFloat132 = Static109.aFloat131;
			}
			Static257.method4079();
		} else if (Static109.aFloat131 < Static109.aFloat132) {
			Static109.aFloat132 = (float) ((double) Static109.aFloat132 - (double) Static109.aFloat132 / 30.0D);
			if (Static109.aFloat131 > Static109.aFloat132) {
				Static109.aFloat132 = Static109.aFloat131;
			}
			Static257.method4079();
		}
		if (Static61.anInt1168 != -1 && Static132.anInt3684 != -1) {
			@Pc(63) int local63 = Static61.anInt1168 - Static125.anInt2557;
			if (local63 < 2 || local63 > 2) {
				local63 >>= 0x4;
			}
			@Pc(81) int local81 = Static132.anInt3684 - Static293.anInt5263;
			Static125.anInt2557 += local63;
			if (local81 < 2 || local81 > 2) {
				local81 >>= 0x4;
			}
			Static293.anInt5263 += local81;
			if (local63 == 0 && local81 == 0) {
				Static61.anInt1168 = -1;
				Static132.anInt3684 = -1;
			}
			Static257.method4079();
		}
		if (Static124.anInt5509 <= 0) {
			Static45.anInt929 = -1;
			Static27.anInt483 = -1;
		} else {
			Static200.anInt3847--;
			if (Static200.anInt3847 == 0) {
				Static200.anInt3847 = 100;
				Static124.anInt5509--;
			}
		}
		if (!Static266.aBoolean337 || Static71.aClass59_17 == null) {
			return;
		}
		for (@Pc(153) Class1_Sub27 local153 = (Class1_Sub27) Static71.aClass59_17.method1704(); local153 != null; local153 = (Class1_Sub27) Static71.aClass59_17.method1701()) {
			@Pc(162) Class175 local162 = Static210.method3349(local153.aClass1_Sub2_Sub12_1.anInt3591);
			if (Static303.anInt5384 == 0 && local153.method4089(Static247.anInt4467, Static222.anInt4105)) {
				if (!local153.aClass1_Sub2_Sub12_1.aBoolean245) {
					local153.aClass1_Sub2_Sub12_1.aBoolean245 = true;
					Static200.method3228(15, local153.aClass1_Sub2_Sub12_1.anInt3591, local162.anInt5011);
				}
				if (local153.aClass1_Sub2_Sub12_1.aBoolean245) {
					Static200.method3228(17, local153.aClass1_Sub2_Sub12_1.anInt3591, local162.anInt5011);
				}
			} else if (local153.aClass1_Sub2_Sub12_1.aBoolean245) {
				local153.aClass1_Sub2_Sub12_1.aBoolean245 = false;
				Static200.method3228(16, local153.aClass1_Sub2_Sub12_1.anInt3591, local162.anInt5011);
			}
		}
	}
}
