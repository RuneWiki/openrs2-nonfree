import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Lclient!de;")
	public static Class1_Sub4_Sub2 aClass1_Sub4_Sub2_2;

	@OriginalMember(owner = "client!vo", name = "o", descriptor = "Z")
	public static boolean aBoolean421 = false;

	@OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
	public static int anInt5733 = 1;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIZZLjava/lang/String;IIILjava/lang/String;JZ)V")
	public static void method4526(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) long arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(128);
		local28.method2631(10);
		local28.method2637((arg1 ? 2 : 0) | (arg2 ? 1 : 0) | (arg9 ? 4 : 0));
		local28.method2603(arg8);
		local28.method2630(local8[0]);
		local28.method2619(arg3);
		local28.method2630(local8[1]);
		local28.method2637(Static119.anInt5881);
		local28.method2631(arg0);
		local28.method2631(arg4);
		local28.method2630(local8[2]);
		local28.method2637(arg5);
		local28.method2637(arg6);
		local28.method2630(local8[3]);
		local28.method2600(Static164.aBigInteger1, Static195.aBigInteger2);
		@Pc(114) Class1_Sub14 local114 = new Class1_Sub14(350);
		local114.method2619(arg7);
		@Pc(127) int local127 = 8 - Static255.method3873(arg7) % 8;
		for (@Pc(129) int local129 = 0; local129 < local127; local129++) {
			local114.method2631((int) (Math.random() * 255.0D));
		}
		local114.method2613(local8);
		Static137.aClass1_Sub14_Sub1_6.anInt3290 = 0;
		Static137.aClass1_Sub14_Sub1_6.method2631(22);
		Static137.aClass1_Sub14_Sub1_6.method2637(local114.anInt3290 + local28.anInt3290 + 2);
		Static137.aClass1_Sub14_Sub1_6.method2637(552);
		Static137.aClass1_Sub14_Sub1_6.method2625(local28.anInt3290, local28.aByteArray34);
		Static137.aClass1_Sub14_Sub1_6.method2625(local114.anInt3290, local114.aByteArray34);
		Static282.anInt5385 = -3;
		Static34.anInt622 = 0;
		Static31.anInt560 = 1;
		Static117.anInt2310 = 0;
	}

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "(I)V")
	public static void method4528() {
		Static162.method2753(false);
		System.gc();
		Static176.method4598(25);
	}
}
