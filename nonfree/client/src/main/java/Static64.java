import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public static int anInt601;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "Lclient!cc;")
	public static Class11_Sub1 aClass11_Sub1_3;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Lclient!da;")
	public static Class2_Sub1_Sub3_Sub2 aClass2_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!me", name = "I", descriptor = "Z")
	private static boolean aBoolean44;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt607 = 0;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!lc;")
	public static Class31 aClass31_189 = Static56.method1206("green:");

	@OriginalMember(owner = "client!me", name = "u", descriptor = "Lclient!lc;")
	public static Class31 aClass31_190 = Static56.method1206("You are not a member)3*6n*6nChoose to subscribe and*6nyou(Wll get loads of extra*6nbenefits and features)3");

	@OriginalMember(owner = "client!me", name = "y", descriptor = "[I")
	public static int[] anIntArray84 = new int[500];

	@OriginalMember(owner = "client!me", name = "E", descriptor = "I")
	public static int anInt624 = 0;

	@OriginalMember(owner = "client!me", name = "G", descriptor = "[I")
	public static int[] anIntArray85 = new int[500];

	@OriginalMember(owner = "client!me", name = "d", descriptor = "(I)V")
	public static void method411() {
		aClass31_189 = null;
		aClass31_190 = null;
		aClass2_Sub1_Sub3_Sub2_2 = null;
		aClass11_Sub1_3 = null;
		anIntArray84 = null;
		anIntArray85 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!kc;BI)Lclient!hc;")
	public static Class2_Sub1_Sub3_Sub3 method412(@OriginalArg(0) int arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) int arg2) {
		return Static85.method1563(arg2, arg1, arg0) ? Static7.method184() : null;
	}

	@OriginalMember(owner = "client!me", name = "e", descriptor = "(I)I")
	public static int method414() {
		return 19;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(Lclient!c;I)V")
	public static void method415(@OriginalArg(0) Class2_Sub3 arg0) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = -1;
		if (arg0.anInt368 == 0) {
			local5 = Static99.aClass64_1.method1757(arg0.anInt356, arg0.anInt355, arg0.anInt363);
		}
		if (arg0.anInt368 == 1) {
			local5 = Static99.aClass64_1.method1755(arg0.anInt356, arg0.anInt355, arg0.anInt363);
		}
		if (arg0.anInt368 == 2) {
			local5 = Static99.aClass64_1.method1795(arg0.anInt356, arg0.anInt355, arg0.anInt363);
		}
		if (arg0.anInt368 == 3) {
			local5 = Static99.aClass64_1.method1768(arg0.anInt356, arg0.anInt355, arg0.anInt363);
		}
		@Pc(77) int local77 = 0;
		@Pc(79) int local79 = 0;
		if (local5 != 0) {
			@Pc(94) int local94 = Static99.aClass64_1.method1802(arg0.anInt356, arg0.anInt355, arg0.anInt363, local5);
			local79 = local94 >> 6 & 0x3;
			local7 = local5 >> 14 & 0x7FFF;
			local77 = local94 & 0x1F;
		}
		arg0.anInt367 = local79;
		arg0.anInt361 = local77;
		arg0.anInt364 = local7;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLjava/awt/Graphics;)V")
	public static void method417(@OriginalArg(1) Graphics arg0) {
		Static30.aClass9_12.method863(arg0, 4, 550);
	}
}
