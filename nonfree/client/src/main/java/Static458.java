import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static458 {

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "Lclient!rd;")
	public static Class281 aClass281_23;

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
	public static int anInt7508;

	@OriginalMember(owner = "client!rk", name = "m", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_230 = new Class272(7, 4);

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "Z")
	public static boolean aBoolean594 = false;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public static void method6367(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(30) String local30;
		if (Static590.anInt9377 >= 200 && !Static35.aBoolean75 || Static590.anInt9377 >= 200) {
			Static118.method2471(Static48.aClass33_12.method797(Static131.anInt2839));
			local30 = Static48.aClass33_13.method797(Static131.anInt2839);
			if (local30 != null) {
				Static118.method2471(local30);
			}
			return;
		}
		local30 = Static575.method7623(arg0);
		if (local30 == null) {
			return;
		}
		@Pc(90) String local90;
		for (@Pc(51) int local51 = 0; local51 < Static590.anInt9377; local51++) {
			@Pc(59) String local59 = Static575.method7623(Static595.aStringArray49[local51]);
			if (local59 != null && local59.equals(local30)) {
				Static118.method2471(arg0 + Static48.aClass33_40.method797(Static131.anInt2839));
				return;
			}
			if (Static588.aStringArray13[local51] != null) {
				local90 = Static575.method7623(Static588.aStringArray13[local51]);
				if (local90 != null && local90.equals(local30)) {
					Static118.method2471(arg0 + Static48.aClass33_40.method797(Static131.anInt2839));
					return;
				}
			}
		}
		for (@Pc(121) int local121 = 0; local121 < Static82.anInt2184; local121++) {
			local90 = Static575.method7623(Static145.aStringArray14[local121]);
			if (local90 != null && local90.equals(local30)) {
				Static118.method2471(Static48.aClass33_45.method797(Static131.anInt2839) + arg0 + Static48.aClass33_46.method797(Static131.anInt2839));
				return;
			}
			if (Static553.aStringArray47[local121] != null) {
				@Pc(165) String local165 = Static575.method7623(Static553.aStringArray47[local121]);
				if (local165 != null && local165.equals(local30)) {
					Static118.method2471(Static48.aClass33_45.method797(Static131.anInt2839) + arg0 + Static48.aClass33_46.method797(Static131.anInt2839));
					return;
				}
			}
		}
		if (Static575.method7623(Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aString94).equals(local30)) {
			Static118.method2471(Static48.aClass33_43.method797(Static131.anInt2839));
		} else {
			@Pc(219) Class3_Sub34 local219 = Static374.method5522(Static505.aClass298_55, Static220.aClass287_2);
			local219.aClass3_Sub11_Sub1_2.method3079(Static170.method2970(arg0));
			local219.aClass3_Sub11_Sub1_2.method3136(arg0);
			Static131.method2572(local219);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)I")
	public static int method6368(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
	public static boolean method6369(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(I[BILjava/lang/String;)I")
	public static int method6373(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(8) int local8 = arg2.length();
		@Pc(10) int local10 = arg1;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(18) char local18 = arg2.charAt(local12);
			if (local18 <= '\u007f') {
				arg0[local10++] = (byte) local18;
			} else if (local18 <= '\u07ff') {
				arg0[local10++] = (byte) (local18 >> 6 | 0xC0);
				arg0[local10++] = (byte) (local18 & 0x3F | 0x80);
			} else {
				arg0[local10++] = (byte) (local18 >> 12 | 0xE0);
				arg0[local10++] = (byte) (local18 >> 6 & 0x3F | 0x80);
				arg0[local10++] = (byte) (local18 & 0x3F | 0x80);
			}
		}
		return local10 - arg1;
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!uf;")
	public static Class3_Sub19 method6374(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(14) Class local14 = Class.forName("Class3_Sub19_Sub1");
			@Pc(18) Class3_Sub19 local18 = (Class3_Sub19) local14.getDeclaredConstructor().newInstance();
			local18.method6861(arg0);
			return local18;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class3_Sub19_Sub2 local29 = new Class3_Sub19_Sub2();
			local29.method6861(arg0);
			return local29;
		}
	}
}
