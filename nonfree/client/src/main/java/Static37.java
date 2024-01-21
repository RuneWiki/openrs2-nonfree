import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!ed", name = "t", descriptor = "Lclient!m;")
	public static Class1_Sub1_Sub8_Sub2_Sub1 aClass1_Sub1_Sub8_Sub2_Sub1_12;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "Lclient!pg;")
	public static Class59 aClass59_15 = new Class59();

	@OriginalMember(owner = "client!ed", name = "m", descriptor = "Lclient!ea;")
	private static Class18 aClass18_283 = Static8.method128("glow2:");

	@OriginalMember(owner = "client!ed", name = "o", descriptor = "Lclient!ea;")
	public static Class18 aClass18_284 = aClass18_283;

	@OriginalMember(owner = "client!ed", name = "p", descriptor = "Lclient!ea;")
	public static Class18 aClass18_285 = aClass18_283;

	@OriginalMember(owner = "client!ed", name = "q", descriptor = "Lclient!rc;")
	public static Class66 aClass66_7 = new Class66(50);

	@OriginalMember(owner = "client!ed", name = "r", descriptor = "Lclient!ea;")
	public static Class18 aClass18_286 = Static8.method128("::qa_op_test");

	@OriginalMember(owner = "client!ed", name = "u", descriptor = "Lclient!da;")
	public static Class14 aClass14_3 = new Class14(32);

	@OriginalMember(owner = "client!ed", name = "v", descriptor = "Lclient!ea;")
	public static Class18 aClass18_287 = Static8.method128("");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method762() {
		try {
			if (Static41.anInt1326 == 1) {
				@Pc(10) int local10 = Static47.aClass1_Sub5_Sub3_12.method1226();
				if (local10 > 0 && Static47.aClass1_Sub5_Sub3_12.method1231()) {
					local10 -= Static32.anInt1093;
					if (local10 < 0) {
						local10 = 0;
					}
					Static47.aClass1_Sub5_Sub3_12.method1239(local10);
					return;
				}
				Static47.aClass1_Sub5_Sub3_12.method1218();
				Static47.aClass1_Sub5_Sub3_12.method1212();
				Static45.aClass73_1 = null;
				Static92.aClass1_Sub20_1 = null;
				if (Static171.aClass16_37 == null) {
					Static41.anInt1326 = 0;
				} else {
					Static41.anInt1326 = 2;
				}
			}
		} catch (@Pc(65) Exception local65) {
			local65.printStackTrace();
			Static47.aClass1_Sub5_Sub3_12.method1218();
			Static45.aClass73_1 = null;
			Static92.aClass1_Sub20_1 = null;
			Static171.aClass16_37 = null;
			Static41.anInt1326 = 0;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIIILclient!ob;BI)V")
	public static void method764(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class16_Sub1 arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5) {
		@Pc(10) long local10 = (long) ((arg5 << 16) + arg1);
		@Pc(16) Class1_Sub1_Sub13 local16 = (Class1_Sub1_Sub13) Static16.aClass14_1.method569(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub13) aClass14_3.method569(local10);
		if (local16 != null) {
			return;
		}
		local16 = (Class1_Sub1_Sub13) Static173.aClass14_15.method569(local10);
		if (local16 == null) {
			if (!arg0) {
				local16 = (Class1_Sub1_Sub13) Static114.aClass14_6.method569(local10);
				if (local16 != null) {
					return;
				}
			}
			local16 = new Class1_Sub1_Sub13();
			local16.anInt3516 = arg2;
			local16.aClass16_Sub1_39 = arg3;
			local16.aByte5 = arg4;
			if (arg0) {
				Static16.aClass14_1.method570(local16, local10);
				Static88.anInt2735++;
			} else {
				Static10.aClass77_1.method2931(local16);
				Static173.aClass14_15.method570(local16, local10);
				Static143.anInt3960++;
			}
		} else if (arg0) {
			local16.method3147();
			Static16.aClass14_1.method570(local16, local10);
			Static88.anInt2735++;
			Static143.anInt3960--;
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)Lclient!ua;")
	public static Class1_Sub1_Sub17 method765(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub17 local10 = (Class1_Sub1_Sub17) Static107.aClass66_13.method2599((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(22) byte[] local22 = Static104.aClass16_13.method2254(arg0, 5);
		local10 = new Class1_Sub1_Sub17();
		if (local22 != null) {
			local10.method2950(new Class1_Sub6(local22));
		}
		Static107.aClass66_13.method2597((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
	public static void method767() {
		aClass1_Sub1_Sub8_Sub2_Sub1_12 = null;
		aClass18_283 = null;
		Class19.anIntArray74 = null;
		aClass14_3 = null;
		aClass18_284 = null;
		aClass18_286 = null;
		aClass18_287 = null;
		aClass66_7 = null;
		aClass18_285 = null;
		aClass59_15 = null;
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Ljava/awt/Component;Lclient!od;III)Lclient!gh;")
	public static Class25 method768(@OriginalArg(0) Component arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static74.anInt2248 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class25 local36 = (Class25) Class.forName("Class25_Sub2").getDeclaredConstructor().newInstance();
			local36.anInt2228 = arg2;
			local36.anIntArray197 = new int[(Static71.aBoolean84 ? 2 : 1) * 256];
			local36.method1555(arg0);
			local36.anInt2227 = (-1024 & arg2) + 1024;
			if (local36.anInt2227 > 16384) {
				local36.anInt2227 = 16384;
			}
			local36.method1564(local36.anInt2227);
			if (Static27.anInt913 > 0 && Static5.aClass48_1 == null) {
				Static5.aClass48_1 = new Class48();
				Static5.aClass48_1.aClass53_3 = arg1;
				arg1.method2271(Static5.aClass48_1, Static27.anInt913);
			}
			if (Static5.aClass48_1 != null) {
				if (Static5.aClass48_1.aClass25Array1[arg3] != null) {
					throw new IllegalArgumentException();
				}
				Static5.aClass48_1.aClass25Array1[arg3] = local36;
			}
			return local36;
		} catch (@Pc(111) Throwable local111) {
			try {
				@Pc(117) Class25_Sub1 local117 = new Class25_Sub1(arg1, arg3);
				local117.anIntArray197 = new int[(Static71.aBoolean84 ? 2 : 1) * 256];
				local117.anInt2228 = arg2;
				local117.method1555(arg0);
				local117.anInt2227 = 16384;
				local117.method1564(local117.anInt2227);
				if (Static27.anInt913 > 0 && Static5.aClass48_1 == null) {
					Static5.aClass48_1 = new Class48();
					Static5.aClass48_1.aClass53_3 = arg1;
					arg1.method2271(Static5.aClass48_1, Static27.anInt913);
				}
				if (Static5.aClass48_1 != null) {
					if (Static5.aClass48_1.aClass25Array1[arg3] != null) {
						throw new IllegalArgumentException();
					}
					Static5.aClass48_1.aClass25Array1[arg3] = local117;
				}
				return local117;
			} catch (@Pc(176) Throwable local176) {
				return new Class25();
			}
		}
	}
}
