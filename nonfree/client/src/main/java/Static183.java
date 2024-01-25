import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!jb", name = "I", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray14 = new String[100];

	@OriginalMember(owner = "client!jb", name = "L", descriptor = "[I")
	public static final int[] anIntArray241 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!jb", name = "qb", descriptor = "Lclient!ff;")
	public static final Class81 aClass81_80 = new Class81(29, -1);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B[SI)[S")
	public static short[] method2897(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1) {
		@Pc(11) short[] local11 = new short[arg1];
		Static459.method3347(arg0, 0, local11, 0, arg1);
		return local11;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public static void method2900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static448.method6059(Static25.aClass44_9);
		Static98.aClass2_Sub20_Sub1_1.method3687(arg1);
		Static98.aClass2_Sub20_Sub1_1.method3705(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(ILjava/lang/String;IIZIZILjava/lang/String;JZ)V")
	public static void method2905(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6, @OriginalArg(8) String arg7, @OriginalArg(9) long arg8, @OriginalArg(10) boolean arg9) {
		@Pc(8) int[] local8 = new int[4];
		for (@Pc(10) int local10 = 0; local10 < 3; local10++) {
			local8[local10] = (int) (Math.random() * 9.9999999E7D);
		}
		@Pc(30) Class2_Sub20 local30 = new Class2_Sub20(128);
		local30.method3699(10);
		local30.method3745((arg5 ? 4 : 0) | (arg4 ? 2 : 0) | (arg9 ? 1 : 0));
		local30.method3692(arg8);
		local30.method3713(local8[0]);
		local30.method3715(arg1);
		local30.method3713(local8[1]);
		local30.method3745(Static160.anInt3171);
		local30.method3699(arg6);
		local30.method3699(arg2);
		local30.method3713(local8[2]);
		local30.method3745(arg3);
		local30.method3745(arg0);
		local30.method3713(local8[3]);
		local30.method3749(Static133.aBigInteger1, Static334.aBigInteger2);
		@Pc(124) Class2_Sub20 local124 = new Class2_Sub20(350);
		local124.method3715(arg7);
		@Pc(139) int local139 = 8 - Static209.method3225(arg7) % 8;
		for (@Pc(141) int local141 = 0; local141 < local139; local141++) {
			local124.method3699((int) (Math.random() * 255.0D));
		}
		local124.method3725(local8);
		Static98.aClass2_Sub20_Sub1_1.anInt4608 = 0;
		Static98.aClass2_Sub20_Sub1_1.method3699(Static119.aClass254_8.anInt7355);
		Static98.aClass2_Sub20_Sub1_1.method3745(local30.anInt4608 + local124.anInt4608 + 2);
		Static98.aClass2_Sub20_Sub1_1.method3745(585);
		Static98.aClass2_Sub20_Sub1_1.method3710(local30.anInt4608, local30.aByteArray136);
		Static98.aClass2_Sub20_Sub1_1.method3710(local124.anInt4608, local124.aByteArray136);
		Static154.anInt2943 = 0;
		Static60.anInt1700 = -3;
		Static375.anInt6694 = 1;
		Static124.anInt2433 = 0;
	}
}
