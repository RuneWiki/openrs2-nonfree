import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static303 {

	@OriginalMember(owner = "client!or", name = "q", descriptor = "I")
	public static int anInt4486;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "Z")
	public static boolean aBoolean325 = false;

	@OriginalMember(owner = "client!or", name = "e", descriptor = "(B)V")
	public static void method3585() {
		@Pc(8) Class2_Sub1_Sub6 local8 = Static267.method3705(0, 15);
		local8.method2578();
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(ZLjava/lang/String;IJ)V")
	public static void method3587(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(3) long arg2) {
		if (arg0) {
			Static16.method4090();
			if (Static13.aString2.equals("")) {
				Static298.anInt5371 = 39;
				return;
			}
		}
		@Pc(19) Class2_Sub17 local19 = new Class2_Sub17(128);
		local19.method6172(10);
		local19.method6130((int) (Math.random() * 65535.0D));
		local19.method6132(arg2);
		local19.method6130(Static451.anInt7181);
		local19.method6170((int) (Math.random() * 9.9999999E7D));
		local19.method6151(arg1);
		local19.method6170((int) (Math.random() * 9.9999999E7D));
		if (arg0) {
			local19.method6132(Static71.method1107(Static13.aString2));
			try {
				local19.method6132(Long.parseLong(Static281.aString39));
			} catch (@Pc(77) Exception local77) {
				Static298.anInt5371 = 39;
				return;
			}
		} else {
			local19.method6170((int) (Math.random() * 9.9999999E7D));
			local19.method6170((int) (Math.random() * 9.9999999E7D));
			local19.method6170((int) (Math.random() * 9.9999999E7D));
			local19.method6170((int) (Math.random() * 9.9999999E7D));
		}
		local19.method6170((int) (Math.random() * 9.9999999E7D));
		local19.method6142(Static130.aBigInteger3, Static135.aBigInteger2);
		Static389.aClass2_Sub17_Sub1_2.anInt7523 = 0;
		Static389.aClass2_Sub17_Sub1_2.method6172(arg0 ? Static173.aClass78_12.anInt1850 : Static173.aClass78_9.anInt1850);
		Static389.aClass2_Sub17_Sub1_2.method6130(local19.anInt7523 + 28);
		Static389.aClass2_Sub17_Sub1_2.method6130(600);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static80.anInt6195);
		Static389.aClass2_Sub17_Sub1_2.method6172(Static10.aClass200_1.anInt5771);
		Static353.method4959(Static389.aClass2_Sub17_Sub1_2);
		Static389.aClass2_Sub17_Sub1_2.method6167(local19.aByteArray94, local19.anInt7523);
		Static298.anInt5371 = -3;
		Static54.anInt992 = 1;
		Static461.anInt7750 = 0;
		Static115.anInt1938 = 0;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "([I[Ljava/lang/Object;I)V")
	public static void method3588(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Static396.method5471(arg0.length - 1, arg1, 0, arg0);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!pb;I)[Lclient!kq;")
	public static Class151[] method3589(@OriginalArg(0) Class194 arg0) {
		if (!arg0.method4398()) {
			return new Class151[0];
		}
		@Pc(16) Class136 local16 = arg0.method4412();
		while (local16.anInt3418 == 0) {
			Static167.method6157(10L);
		}
		if (local16.anInt3418 == 2) {
			return new Class151[0];
		}
		@Pc(38) int[] local38 = (int[]) local16.anObject10;
		@Pc(44) Class151[] local44 = new Class151[local38.length >> 2];
		for (@Pc(51) int local51 = 0; local51 < local44.length; local51++) {
			@Pc(57) Class151 local57 = new Class151();
			local44[local51] = local57;
			local57.anInt3724 = local38[local51 << 2];
			local57.anInt3725 = local38[(local51 << 2) + 1];
			local57.anInt3727 = local38[(local51 << 2) + 2];
			local57.anInt3726 = local38[(local51 << 2) + 3];
		}
		return local44;
	}
}
