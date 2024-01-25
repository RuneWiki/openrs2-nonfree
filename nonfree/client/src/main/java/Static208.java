import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "Lclient!fa;")
	public static Interface11 anInterface11_6;

	@OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
	public static int anInt3874 = 0;

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(III)V")
	public static void method3462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class53 local7 = Static60.aClass53ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static591.method8355(local7.aClass1_Sub4_Sub1_2);
		Static591.method8355(local7.aClass1_Sub4_Sub1_1);
		if (local7.aClass1_Sub4_Sub1_2 != null) {
			local7.aClass1_Sub4_Sub1_2 = null;
		}
		if (local7.aClass1_Sub4_Sub1_1 != null) {
			local7.aClass1_Sub4_Sub1_1 = null;
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILclient!dc;)V")
	public static void method3464(@OriginalArg(1) Class4_Sub11_Sub1 arg0) {
		for (@Pc(3) int local3 = 0; local3 < Static70.anInt1211; local3++) {
			@Pc(9) int local9 = Static493.anIntArray483[local3];
			@Pc(13) Class1_Sub4_Sub2_Sub1_Sub2 local13 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local9];
			@Pc(19) int local19 = arg0.method4905();
			if ((local19 & 0x80) != 0) {
				local19 += arg0.method4905() << 8;
			}
			if ((local19 & 0x4000) != 0) {
				local19 += arg0.method4905() << 16;
			}
			Static234.method3772(local9, local13, arg0, local19);
		}
	}

	@OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
	public static void method3465() {
		if (Static406.aClass354_5.aBoolean710) {
			Static577.anInt10067 = 96;
			return;
		}
		try {
			@Pc(19) Method local19 = Runtime.class.getMethod("maxMemory");
			if (local19 != null) {
				try {
					@Pc(23) Runtime local23 = Runtime.getRuntime();
					@Pc(29) Long local29 = (Long) local19.invoke(local23, (Object[]) null);
					Static577.anInt10067 = (int) (local29 / 1048576L) + 1;
				} catch (@Pc(39) Throwable local39) {
				}
			}
		} catch (@Pc(41) Exception local41) {
		}
	}
}
