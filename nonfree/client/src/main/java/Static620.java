import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static620 {

	@OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
	public static int anInt9962;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
	public static int anInt9955 = -1;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "I")
	public static int anInt9960 = 0;

	@OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
	public static int anInt9963 = 0;

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public static int anInt9966 = 0;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
	public static void method8303() {
		for (@Pc(9) Class2_Sub21 local9 = (Class2_Sub21) Static242.aClass118_21.method2596(); local9 != null; local9 = (Class2_Sub21) Static242.aClass118_21.method2597()) {
			Static183.method2678(local9.anInt4043);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ig;)V")
	public static void method8304(@OriginalArg(0) Class13_Sub1 arg0) {
		Static207.aClass95_6.H(arg0.anInt10090, arg0.anInt10097 + (arg0.method8397() >> 1), arg0.anInt10089, Static604.anIntArray693);
		arg0.anInt10087 = Static604.anIntArray693[0];
		arg0.anInt10088 = Static604.anIntArray693[1];
		arg0.anInt10091 = Static604.anIntArray693[2];
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public static void method8305() {
		if (Static123.aClass35_1 != null) {
			Static123.aClass35_1.method2740();
		}
		if (Static313.aClass35_3 != null) {
			Static313.aClass35_3.method2740();
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILjava/awt/Canvas;ILclient!d;)Lclient!ha;")
	public static Class95 method8306(@OriginalArg(1) Canvas arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface6 arg2) {
		return new Class95_Sub1(arg0, arg2, arg1);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/lang/String;I)[B")
	public static byte[] method8307(@OriginalArg(0) String arg0) {
		@Pc(6) int local6 = arg0.length();
		if (local6 == 0) {
			return new byte[0];
		}
		@Pc(20) int local20 = local6 + 3 & 0xFFFFFFFC;
		@Pc(26) int local26 = local20 / 4 * 3;
		if (local6 <= local20 - 2 || Static119.method1755(arg0.charAt(local20 - 2)) == -1) {
			local26 -= 2;
		} else if (local6 <= local20 - 1 || Static119.method1755(arg0.charAt(local20 - 1)) == -1) {
			local26--;
		}
		@Pc(69) byte[] local69 = new byte[local26];
		Static431.method5965(local69, arg0, 0);
		return local69;
	}
}
