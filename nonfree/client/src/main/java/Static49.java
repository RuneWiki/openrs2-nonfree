import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!de", name = "U", descriptor = "[I")
	public static int[] anIntArray120;

	@OriginalMember(owner = "client!de", name = "y", descriptor = "[I")
	public static int[] anIntArray117 = new int[500];

	@OriginalMember(owner = "client!de", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString40 = " has logged out.";

	@OriginalMember(owner = "client!de", name = "J", descriptor = "Lclient!tm;")
	public static Class163 aClass163_15 = new Class163(32);

	@OriginalMember(owner = "client!de", name = "P", descriptor = "I")
	public static int anInt1112 = 0;

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!hn;)V")
	public static void method974(@OriginalArg(1) Class69 arg0) {
		Static120.aClass69_5 = arg0;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)V")
	public static void method975(@OriginalArg(0) int arg0) {
		Static230.anInt4619 = -1;
		Static165.anInt3317 = -1;
		Static208.anInt4072 = arg0;
		Static72.method1221();
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/lang/String;ZIZLjava/lang/String;ZBJIII)V")
	public static void method982(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4, @OriginalArg(5) boolean arg5, @OriginalArg(7) long arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class4_Sub24 local30 = new Class4_Sub24(128);
		local30.method3116(10);
		local30.method3105((arg5 ? 4 : 0) | (arg1 ? 2 : 0) | (arg3 ? 1 : 0));
		local30.method3079(arg6);
		local30.method3066(local8[0]);
		local30.method3095(arg4);
		local30.method3066(local8[1]);
		local30.method3105(Static212.anInt4120);
		local30.method3116(arg8);
		local30.method3116(arg7);
		local30.method3066(local8[2]);
		local30.method3105(arg2);
		local30.method3105(arg9);
		local30.method3066(local8[3]);
		local30.method3076(Static8.aBigInteger1, Static154.aBigInteger2);
		@Pc(124) Class4_Sub24 local124 = new Class4_Sub24(350);
		local124.method3095(arg0);
		@Pc(137) int local137 = 8 - Static247.method3791(arg0) % 8;
		for (@Pc(139) int local139 = 0; local139 < local137; local139++) {
			local124.method3116((int) (Math.random() * 255.0D));
		}
		local124.method3122(local8);
		Static175.aClass4_Sub24_Sub1_1.anInt3822 = 0;
		Static175.aClass4_Sub24_Sub1_1.method3116(22);
		Static175.aClass4_Sub24_Sub1_1.method3105(local30.anInt3822 + local124.anInt3822 + 2);
		Static175.aClass4_Sub24_Sub1_1.method3105(546);
		Static175.aClass4_Sub24_Sub1_1.method3091(local30.anInt3822, local30.aByteArray47);
		Static175.aClass4_Sub24_Sub1_1.method3091(local124.anInt3822, local124.aByteArray47);
		Static228.anInt4576 = 1;
		Static195.anInt3936 = 0;
		Static238.anInt3859 = 0;
		Static170.anInt3406 = -3;
	}
}
