import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	public static int anInt6724;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "Lclient!eu;")
	public static Class70 aClass70_32;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array192;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_147 = new Class119(28, 8);

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static int anInt6727 = 0;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I")
	public static int method5269() {
		if (Static438.aFrame2 == null) {
			return Static9.aBoolean15 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
	public static void method5271(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(3) String arg2) {
		Static5.anInt76 = arg0;
		Static276.aString46 = arg1;
		Static2.aString1 = arg2;
		if (Static2.aString1.equals("") || Static276.aString46.equals("")) {
			Static97.anInt2201 = 3;
		} else if (Static101.anInt6819 == -1) {
			Static97.anInt2201 = -3;
			Static303.anInt5422 = 0;
			Static191.anInt3830 = 1;
			Static109.anInt2416 = 0;
			@Pc(39) Class3_Sub7 local39 = new Class3_Sub7(128);
			local39.method2628(10);
			local39.method2636((int) (Math.random() * 9.9999999E7D));
			local39.method2603(Static14.method321(Static2.aString1));
			local39.method2636((int) (Math.random() * 9.9999999E7D));
			local39.method2608(Static276.aString46);
			local39.method2636((int) (Math.random() * 9.9999999E7D));
			local39.method2581(Static3.aBigInteger1, Static134.aBigInteger2);
			Static302.aClass3_Sub7_Sub1_2.anInt3235 = 0;
			Static302.aClass3_Sub7_Sub1_2.method2628(Static184.aClass187_10.anInt5402);
			Static302.aClass3_Sub7_Sub1_2.method2628(local39.anInt3235 + 2);
			Static302.aClass3_Sub7_Sub1_2.method2613(590);
			Static302.aClass3_Sub7_Sub1_2.method2595(local39.anInt3235, local39.aByteArray46);
		} else {
			Static319.method1505();
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!m;Lclient!li;Ljava/awt/Canvas;I)Lclient!qa;")
	public static Class172 method5272(@OriginalArg(1) Interface5 arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Canvas arg2, @OriginalArg(4) int arg3) {
		return new h(arg3, arg2, arg0, arg1);
	}
}
