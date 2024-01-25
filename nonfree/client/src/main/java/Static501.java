import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static501 {

	@OriginalMember(owner = "client!vb", name = "n", descriptor = "Lclient!bj;")
	public static Class25 aClass25_7;

	@OriginalMember(owner = "client!vb", name = "y", descriptor = "Lclient!dda;")
	public static Class53 aClass53_141;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "Lclient!qu;")
	public static final Class243 aClass243_88 = new Class243(37, 5);

	@OriginalMember(owner = "client!vb", name = "q", descriptor = "[I")
	public static final int[] anIntArray671 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(I)V")
	public static void method7360() {
		for (@Pc(7) int local7 = 0; local7 < Static355.aClass142ArrayArray1.length; local7++) {
			for (@Pc(11) int local11 = 0; local11 < Static355.aClass142ArrayArray1[local7].length; local11++) {
				Static355.aClass142ArrayArray1[local7][local11] = Static438.aClass142_1;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILclient!lk;)V")
	public static void method7364(@OriginalArg(1) Class1_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(15) Class2_Sub46 local15 = (Class2_Sub46) Static286.aClass249_25.method6527(); local15 != null; local15 = (Class2_Sub46) Static286.aClass249_25.method6525()) {
			if (local15.aClass1_Sub1_Sub2_Sub2_2 == arg0) {
				if (local15.aClass2_Sub12_Sub3_4 != null) {
					Static288.aClass2_Sub12_Sub2_5.method2088(local15.aClass2_Sub12_Sub3_4);
					local15.aClass2_Sub12_Sub3_4 = null;
				}
				local15.method7802();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "([BB)[B")
	public static byte[] method7369(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(14) byte[] local14 = new byte[local6];
		Static553.method3373(arg0, 0, local14, 0, local6);
		return local14;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!uf;ILjava/awt/Component;II)Lclient!lr;")
	public static Class104 method7373(@OriginalArg(0) Class283 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2, @OriginalArg(3) int arg3) {
		if (Static302.anInt5530 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(33) Class104 local33 = (Class104) Class.forName("Class104_Sub1").getDeclaredConstructor().newInstance();
			local33.anIntArray768 = new int[(Static313.aBoolean513 ? 2 : 1) * 256];
			local33.anInt9410 = arg3;
			local33.method7814(arg2);
			local33.anInt9407 = (arg3 & 0xFFFFFC00) + 1024;
			if (local33.anInt9407 > 16384) {
				local33.anInt9407 = 16384;
			}
			local33.method7819(local33.anInt9407);
			if (Static224.anInt4042 > 0 && Static216.aClass194_1 == null) {
				Static216.aClass194_1 = new Class194();
				Static216.aClass194_1.aClass283_2 = arg0;
				arg0.method7164(Static224.anInt4042, Static216.aClass194_1);
			}
			if (Static216.aClass194_1 != null) {
				if (Static216.aClass194_1.aClass104Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static216.aClass194_1.aClass104Array1[arg1] = local33;
			}
			return local33;
		} catch (@Pc(103) Throwable local103) {
			try {
				@Pc(109) Class104_Sub2 local109 = new Class104_Sub2(arg0, arg1);
				local109.anIntArray768 = new int[(Static313.aBoolean513 ? 2 : 1) * 256];
				local109.anInt9410 = arg3;
				local109.method7814(arg2);
				local109.anInt9407 = 16384;
				local109.method7819(local109.anInt9407);
				if (Static224.anInt4042 > 0 && Static216.aClass194_1 == null) {
					Static216.aClass194_1 = new Class194();
					Static216.aClass194_1.aClass283_2 = arg0;
					arg0.method7164(Static224.anInt4042, Static216.aClass194_1);
				}
				if (Static216.aClass194_1 != null) {
					if (Static216.aClass194_1.aClass104Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static216.aClass194_1.aClass104Array1[arg1] = local109;
				}
				return local109;
			} catch (@Pc(168) Throwable local168) {
				return new Class104();
			}
		}
	}
}
