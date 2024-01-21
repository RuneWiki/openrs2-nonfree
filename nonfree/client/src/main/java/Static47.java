import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "Lclient!kb;")
	public static Class46 aClass46_418 = Static65.method1172("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!fg", name = "B", descriptor = "Lclient!kb;")
	public static Class46 aClass46_419 = Static65.method1172("");

	@OriginalMember(owner = "client!fg", name = "G", descriptor = "Lclient!kb;")
	public static Class46 aClass46_420 = Static65.method1172("Einloggen");

	@OriginalMember(owner = "client!fg", name = "I", descriptor = "Lclient!kb;")
	public static Class46 aClass46_421 = Static65.method1172("Mitglieder)2Welt");

	@OriginalMember(owner = "client!fg", name = "P", descriptor = "Lclient!kb;")
	private static Class46 aClass46_422 = Static65.method1172("This world is running a closed Beta)3");

	@OriginalMember(owner = "client!fg", name = "U", descriptor = "Lclient!kb;")
	public static Class46 aClass46_423 = aClass46_422;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Ljava/awt/Component;IILclient!qd;I)Lclient!eh;")
	public static Class12 method932(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) int arg3) {
		if (Static149.anInt3584 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(35) Class12 local35 = (Class12) Class.forName("Class12_Sub1").getDeclaredConstructor().newInstance();
			local35.anIntArray418 = new int[(Static3.aBoolean5 ? 2 : 1) * 256];
			local35.anInt3695 = arg3;
			local35.method2656(arg0);
			local35.anInt3699 = (arg3 & 0xFFFFFC00) + 1024;
			if (local35.anInt3699 > 16384) {
				local35.anInt3699 = 16384;
			}
			local35.method2658(local35.anInt3699);
			if (Static8.anInt275 > 0 && Static89.aClass34_1 == null) {
				Static89.aClass34_1 = new Class34();
				Static89.aClass34_1.aClass68_3 = arg2;
				arg2.method2193(Static89.aClass34_1, Static8.anInt275);
			}
			if (Static89.aClass34_1 != null) {
				if (Static89.aClass34_1.aClass12Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static89.aClass34_1.aClass12Array1[arg1] = local35;
			}
			return local35;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class12_Sub2 local114 = new Class12_Sub2(arg2, arg1);
				local114.anIntArray418 = new int[(Static3.aBoolean5 ? 2 : 1) * 256];
				local114.anInt3695 = arg3;
				local114.method2656(arg0);
				local114.anInt3699 = 16384;
				local114.method2658(local114.anInt3699);
				if (Static8.anInt275 > 0 && Static89.aClass34_1 == null) {
					Static89.aClass34_1 = new Class34();
					Static89.aClass34_1.aClass68_3 = arg2;
					arg2.method2193(Static89.aClass34_1, Static8.anInt275);
				}
				if (Static89.aClass34_1 != null) {
					if (Static89.aClass34_1.aClass12Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static89.aClass34_1.aClass12Array1[arg1] = local114;
				}
				return local114;
			} catch (@Pc(178) Throwable local178) {
				return new Class12();
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIZILclient!ob;)V")
	public static void method934(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class3_Sub2_Sub3_Sub3 arg4) {
		@Pc(16) int local16 = arg1 * arg1 + arg2 * arg2;
		if (local16 <= 4225 || local16 >= 90000) {
			Static162.method2590(arg4, arg2, arg3, arg0, arg1);
			return;
		}
		@Pc(38) int local38 = Static81.anInt2039 + Static29.anInt697 & 0x7FF;
		@Pc(42) int local42 = Class3_Sub2_Sub3_Sub4.anIntArray347[local38];
		@Pc(46) int local46 = Class3_Sub2_Sub3_Sub4.anIntArray346[local38];
		@Pc(54) int local54 = local46 * 256 / (Static172.anInt3773 + 256);
		@Pc(62) int local62 = local42 * 256 / (Static172.anInt3773 + 256);
		@Pc(72) int local72 = local54 * arg1 - arg2 * local62 >> 16;
		@Pc(82) int local82 = local54 * arg2 + arg1 * local62 >> 16;
		@Pc(88) double local88 = Math.atan2((double) local82, (double) local72);
		@Pc(94) int local94 = (int) (Math.sin(local88) * 63.0D);
		@Pc(100) int local100 = (int) (Math.cos(local88) * 57.0D);
		Static24.aClass3_Sub2_Sub3_Sub3_5.method1875(arg0 + local94 + 94 - 6, arg3 + -20 + 83 + -local100, local88);
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
	public static void method937() {
		for (@Pc(10) Class3_Sub2_Sub1_Sub3 local10 = (Class3_Sub2_Sub1_Sub3) Static181.aClass59_16.method1731(); local10 != null; local10 = (Class3_Sub2_Sub1_Sub3) Static181.aClass59_16.method1734()) {
			if (local10.anInt1983 != Static99.anInt2422 || local10.aBoolean83) {
				local10.method2900();
			} else if (local10.anInt1980 <= Static20.anInt512) {
				local10.method1325(Static22.anInt526);
				if (local10.aBoolean83) {
					local10.method2900();
				} else {
					Static154.aClass62_1.method2005(local10.anInt1983, local10.anInt1989, local10.anInt1986, local10.anInt1987, 60, local10, 0, -1, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	public static void method938() {
		aClass46_419 = null;
		aClass46_421 = null;
		aClass46_422 = null;
		aClass46_418 = null;
		aClass46_423 = null;
		aClass46_420 = null;
	}
}
