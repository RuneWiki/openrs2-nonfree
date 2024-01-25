import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static643 {

	@OriginalMember(owner = "client!ww", name = "f", descriptor = "I")
	public static int anInt10695 = 0;

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(BILjava/lang/String;)Lclient!db;")
	public static Class63 method8629(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class63 local13;
		try {
			local13 = (Class63) Class.forName("Class63_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			local13 = new Class63_Sub2();
		}
		local13.anInt10282 = arg0;
		local13.aString111 = arg1;
		return local13;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(II)I")
	public static int method8630(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0x55555555);
		@Pc(24) int local24 = (local10 >>> 2 & 0x33333333) + (local10 & 0x33333333);
		@Pc(33) int local33 = local24 + (local24 >>> 4) & 0xF0F0F0F;
		@Pc(39) int local39 = local33 + (local33 >>> 8);
		@Pc(45) int local45 = local39 + (local39 >>> 16);
		return local45 & 0xFF;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method8631(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!tm;Lclient!tm;)V")
	public static void method8635(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		if (arg0.aClass15_67 != null) {
			arg0.method8314();
		}
		arg0.aClass15_67 = arg1.aClass15_67;
		arg0.aClass15_68 = arg1;
		arg0.aClass15_67.aClass15_68 = arg0;
		arg0.aClass15_68.aClass15_67 = arg0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILclient!nv;)V")
	public static void method8637(@OriginalArg(1) Class16_Sub3 arg0) {
		@Pc(12) byte[] local12;
		if (Static429.anObject15 == null) {
			@Pc(5) Class103_Sub2_Sub1 local5 = new Class103_Sub2_Sub1();
			local12 = local5.method5061();
			Static429.anObject15 = Static550.method8311(local12);
		}
		if (Static540.anObject20 == null) {
			@Pc(27) Class103_Sub1_Sub2 local27 = new Class103_Sub1_Sub2();
			local12 = local27.method3432();
			Static540.anObject20 = Static550.method8311(local12);
		}
		@Pc(42) Class221 local42 = arg0.aClass221_1;
		if (local42.method5676() && Static479.anObject16 == null) {
			local12 = Static500.method7266(0.6F, 4.0F, 0.5F, 16.0F, new Class58_Sub1(419684), 4.0F);
			Static479.anObject16 = Static550.method8311(local12);
		}
	}
}
