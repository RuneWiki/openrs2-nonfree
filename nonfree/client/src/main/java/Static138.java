import java.awt.Component;
import java.lang.reflect.Constructor;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eq", name = "k", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_17 = new Class163();

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IZIIII)V")
	public static void method2755(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg2 < 1) {
			arg2 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(21) int local21 = arg3 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(46) int local46 = local21 * (Static626.aShort130 - Static467.aShort99) / 100 + Static467.aShort99;
		if (Static295.aShort53 > local46) {
			local46 = Static295.aShort53;
		} else if (local46 > Static206.aShort43) {
			local46 = Static206.aShort43;
		}
		@Pc(68) int local68 = local46 * arg3 * 512 / (arg2 * 334);
		@Pc(102) int local102;
		@Pc(108) int local108;
		@Pc(77) short local77;
		if (local68 < Static83.aShort100) {
			local77 = Static83.aShort100;
			local46 = local77 * 334 * arg2 / (arg3 * 512);
			if (Static206.aShort43 < local46) {
				local46 = Static206.aShort43;
				local102 = local46 * arg3 * 512 / (local77 * 334);
				local108 = (arg2 - local102) / 2;
				if (arg1) {
					Static467.aClass5_13.la();
					Static467.aClass5_13.method6123(local108, arg3, arg0, -16777216, arg4);
					Static467.aClass5_13.method6123(local108, arg3, arg0, -16777216, arg4 + arg2 - local108);
				}
				arg4 += local108;
				arg2 -= local108 * 2;
			}
		} else if (Static461.aShort98 < local68) {
			local77 = Static461.aShort98;
			local46 = local77 * 334 * arg2 / (arg3 * 512);
			if (Static295.aShort53 > local46) {
				local46 = Static295.aShort53;
				local102 = arg2 * local77 * 334 / (local46 * 512);
				local108 = (arg3 - local102) / 2;
				if (arg1) {
					Static467.aClass5_13.la();
					Static467.aClass5_13.method6123(arg2, local108, arg0, -16777216, arg4);
					Static467.aClass5_13.method6123(arg2, local108, arg0 + arg3 - local108, -16777216, arg4);
				}
				arg0 += local108;
				arg3 -= local108 * 2;
			}
		}
		Static384.anInt7232 = (short) arg2;
		Static606.anInt10282 = arg4;
		Static266.anInt5712 = arg0;
		Static209.anInt4534 = local46 * arg3 / 334;
		Static436.anInt7948 = (short) arg3;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([[FB[[S)[[S")
	public static short[][] method2757(@OriginalArg(0) float[][] arg0, @OriginalArg(2) short[][] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg0.length; local12++) {
			for (@Pc(16) int local16 = 0; local16 < arg1[local12].length; local16++) {
				arg1[local12][local16] = (short) (int) (arg0[local12][local16] * 16383.0F);
			}
		}
		return arg1;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Component;ZI)Lclient!sga;")
	public static Class96 method2759(@OriginalArg(0) Component arg0) {
		try {
			@Pc(32) Constructor local32 = Class.forName("Class96_Sub1").getDeclaredConstructor(Component.class, Boolean.TYPE);
			return (Class96) local32.newInstance(arg0, Boolean.valueOf(true));
		} catch (@Pc(50) Throwable local50) {
			return new Class96_Sub2(arg0, true);
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!pha;Lclient!pha;B)V")
	public static void method2760(@OriginalArg(0) Class9 arg0, @OriginalArg(1) Class9 arg1) {
		if (arg0.aClass9_67 != null) {
			arg0.method8408();
		}
		arg0.aClass9_67 = arg1.aClass9_67;
		arg0.aClass9_68 = arg1;
		arg0.aClass9_67.aClass9_68 = arg0;
		arg0.aClass9_68.aClass9_67 = arg0;
	}
}
