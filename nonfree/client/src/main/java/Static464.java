import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!rv", name = "A", descriptor = "F")
	public static float aFloat227;

	@OriginalMember(owner = "client!rv", name = "C", descriptor = "[I")
	public static int[] anIntArray523;

	@OriginalMember(owner = "client!rv", name = "B", descriptor = "Lclient!gca;")
	public static final Class111 aClass111_64 = new Class111();

	@OriginalMember(owner = "client!rv", name = "E", descriptor = "I")
	public static int anInt8696 = 0;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(III)Lclient!cba;")
	public static Class11_Sub1_Sub2 method7009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class360 local7 = Static568.aClass360ArrayArrayArray22[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class11_Sub1_Sub2 local14 = local7.aClass11_Sub1_Sub2_1;
			local7.aClass11_Sub1_Sub2_1 = null;
			Static328.method4862(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(III)I")
	public static int method7010(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(17) int local17 = 255 - local7;
		@Pc(35) int local35 = (local7 * (arg1 & 0xFF00) & 0xFF0000 | (arg1 & 0xFF00FF) * local7 & 0xFF00FF00) >>> 8;
		return local35 + ((local17 * (arg0 & 0xFF00) & 0xFF0000 | local17 * (arg0 & 0xFF00FF) & 0xFF00FF00) >>> 8);
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZJLjava/lang/String;I)V")
	public static void method7011(@OriginalArg(0) boolean arg0, @OriginalArg(1) long arg1, @OriginalArg(2) String arg2) {
		if (arg0) {
			Static34.method640();
			if (Static271.aString56.equals("")) {
				Static432.anInt7738 = 39;
				return;
			}
		}
		@Pc(19) Class1_Sub3 local19 = new Class1_Sub3(576);
		local19.method7917(10);
		local19.method7937((int) (Math.random() * 65535.0D));
		local19.method7934(arg1);
		local19.method7937(arg0 ? Static180.anInt9478 : Static547.anInt9149);
		local19.method7920(arg2);
		local19.method7934(arg0 ? Static412.aLong176 : Static495.aLong230);
		if (arg0) {
			local19.method7934(Static309.method4632(Static271.aString56));
			try {
				local19.method7934(Long.parseLong(Static436.aString87));
			} catch (@Pc(107) Exception local107) {
				Static432.anInt7738 = 39;
				return;
			}
		} else {
			local19.method7936((int) (Math.random() * 9.9999999E7D));
			local19.method7936((int) (Math.random() * 9.9999999E7D));
			local19.method7936((int) (Math.random() * 9.9999999E7D));
			local19.method7936((int) (Math.random() * 9.9999999E7D));
		}
		local19.method7936((int) (Math.random() * 9.9999999E7D));
		local19.method7924(Static498.aBigInteger4, Static404.aBigInteger7);
		@Pc(125) Class1_Sub9 local125 = Static266.method3886();
		local125.aClass1_Sub3_Sub1_1.method7917(arg0 ? Static122.aClass325_12.anInt8863 : Static122.aClass325_9.anInt8863);
		@Pc(138) int local138 = 1;
		if (Static388.aString82 != null) {
			local138 = Static388.aString82.length() + 1 + 1;
		}
		local125.aClass1_Sub3_Sub1_1.method7937(local19.anInt9802 + local138 + 28);
		local125.aClass1_Sub3_Sub1_1.method7937(626);
		local125.aClass1_Sub3_Sub1_1.method7917(Static161.anInt3095);
		local125.aClass1_Sub3_Sub1_1.method7917(Static101.aClass42_1.anInt1150);
		Static341.method5098(local125.aClass1_Sub3_Sub1_1);
		@Pc(183) String local183 = arg0 ? Static12.aString3 : Static388.aString82;
		local125.aClass1_Sub3_Sub1_1.method7917(local183 == null ? 0 : 1);
		if (local183 != null) {
			local125.aClass1_Sub3_Sub1_1.method7920(local183);
		}
		local125.aClass1_Sub3_Sub1_1.method7973(local19.anInt9802, local19.aByteArray104);
		Static42.method746(local125);
		Static198.anInt3805 = 0;
		Static468.anInt8074 = 1;
		Static429.anInt7684 = 0;
		Static432.anInt7738 = -3;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZLjava/lang/Object;Lclient!laa;)V")
	public static void method7013(@OriginalArg(1) Object arg0, @OriginalArg(2) Class198 arg1) {
		if (arg1.anEventQueue1 == null) {
			return;
		}
		for (@Pc(19) int local19 = 0; local19 < 50 && arg1.anEventQueue1.peekEvent() != null; local19++) {
			Static408.method5841(1L);
		}
		try {
			if (arg0 != null) {
				arg1.anEventQueue1.postEvent(new ActionEvent(arg0, 1001, "dummy"));
			}
		} catch (@Pc(47) Exception local47) {
		}
	}
}
