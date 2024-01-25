import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static299 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	public static int anInt5954;

	@OriginalMember(owner = "client!mg", name = "i", descriptor = "Lclient!ed;")
	public static Class69 aClass69_2;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/awt/Component;IIZLclient!tq;)Lclient!mca;")
	public static Class43 method4965(@OriginalArg(0) Component arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class285 arg3) {
		if (Static361.anInt6755 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(38) Class43 local38 = (Class43) Class.forName("Class43_Sub2").getDeclaredConstructor().newInstance();
			local38.anIntArray727 = new int[(Static8.aBoolean56 ? 2 : 1) * 256];
			local38.anInt8490 = arg1;
			local38.method7021(arg0);
			local38.anInt8491 = (-1024 & arg1) + 1024;
			if (local38.anInt8491 > 16384) {
				local38.anInt8491 = 16384;
			}
			local38.method7024(local38.anInt8491);
			if (Static466.anInt8389 > 0 && Static463.aClass288_1 == null) {
				Static463.aClass288_1 = new Class288();
				Static463.aClass288_1.aClass285_15 = arg3;
				arg3.method7050(Static466.anInt8389, Static463.aClass288_1);
			}
			if (Static463.aClass288_1 != null) {
				if (Static463.aClass288_1.aClass43Array1[arg2] != null) {
					throw new IllegalArgumentException();
				}
				Static463.aClass288_1.aClass43Array1[arg2] = local38;
			}
			return local38;
		} catch (@Pc(115) Throwable local115) {
			try {
				@Pc(121) Class43_Sub1 local121 = new Class43_Sub1(arg3, arg2);
				local121.anInt8490 = arg1;
				local121.anIntArray727 = new int[(Static8.aBoolean56 ? 2 : 1) * 256];
				local121.method7021(arg0);
				local121.anInt8491 = 16384;
				local121.method7024(local121.anInt8491);
				if (Static466.anInt8389 > 0 && Static463.aClass288_1 == null) {
					Static463.aClass288_1 = new Class288();
					Static463.aClass288_1.aClass285_15 = arg3;
					arg3.method7050(Static466.anInt8389, Static463.aClass288_1);
				}
				if (Static463.aClass288_1 != null) {
					if (Static463.aClass288_1.aClass43Array1[arg2] != null) {
						throw new IllegalArgumentException();
					}
					Static463.aClass288_1.aClass43Array1[arg2] = local121;
				}
				return local121;
			} catch (@Pc(183) Throwable local183) {
				return new Class43();
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!tt;B)V")
	public static void method4967(@OriginalArg(0) Class6_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(16) Class3_Sub16 local16 = (Class3_Sub16) Static239.aClass71_41.method2089(); local16 != null; local16 = (Class3_Sub16) Static239.aClass71_41.method2086()) {
			if (arg0 == local16.aClass6_Sub1_Sub2_Sub2_2) {
				if (local16.aClass3_Sub9_Sub2_2 != null) {
					Static530.aClass3_Sub9_Sub3_2.method5653(local16.aClass3_Sub9_Sub2_2);
					local16.aClass3_Sub9_Sub2_2 = null;
				}
				local16.method7820();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Ljava/lang/String;Z)J")
	public static long method4968(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) long local15 = 0L;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			local15 = (local15 << 5) + (long) arg0.charAt(local17) - local15;
		}
		return local15;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BZ)V")
	public static void method4969(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			if (Static422.anInt8667 != -1) {
				Static102.method4938(Static422.anInt8667);
			}
			for (@Pc(21) Class3_Sub29 local21 = (Class3_Sub29) Static156.aClass267_14.method6643(); local21 != null; local21 = (Class3_Sub29) Static156.aClass267_14.method6650()) {
				if (!local21.method7821()) {
					local21 = (Class3_Sub29) Static156.aClass267_14.method6643();
					if (local21 == null) {
						break;
					}
				}
				Static361.method5656(false, true, local21);
			}
			Static422.anInt8667 = -1;
			Static156.aClass267_14 = new Class267(8);
			Static104.method2058();
			Static422.anInt8667 = Static524.anInt9120;
			Static47.method7753(false);
			Static403.method6133();
			Static60.method1219(Static422.anInt8667);
		}
		Static501.aBoolean654 = true;
	}
}
