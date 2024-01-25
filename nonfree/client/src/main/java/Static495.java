import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static495 {

	@OriginalMember(owner = "client!qv", name = "x", descriptor = "[Lclient!s;")
	public static Class109[] aClass109Array4;

	@OriginalMember(owner = "client!qv", name = "o", descriptor = "Lclient!rn;")
	public static final Class305 aClass305_75 = new Class305(77, -1);

	@OriginalMember(owner = "client!qv", name = "r", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_191 = new Class359(117, -1);

	@OriginalMember(owner = "client!qv", name = "v", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_192 = new Class359(52, 3);

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "(I)V")
	public static void method7089() {
		Static282.aClass23_1.method6160();
		for (@Pc(8) int local8 = 0; local8 < 32; local8++) {
			Static118.aLongArray5[local8] = 0L;
		}
		for (@Pc(19) int local19 = 0; local19 < 32; local19++) {
			Static141.aLongArray6[local19] = 0L;
		}
		Static385.anInt6876 = 0;
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IB)V")
	public static void method7091() {
		Static327.aClass340_37.method7996(5);
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!fi;I)V")
	public static void method7092(@OriginalArg(0) Class5_Sub21 arg0) {
		Static67.aClass114_9.method2807(arg0);
		arg0.anInt3372 = arg0.aClass5_Sub41_Sub2_1.anInt9230;
		arg0.aClass5_Sub41_Sub2_1.anInt9230 = 0;
		Static29.anInt397 += arg0.anInt3372;
	}

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "(I)V")
	public static void method7093() {
		try {
			@Pc(15) Method local15 = Runtime.class.getMethod("availableProcessors");
			if (local15 != null) {
				try {
					@Pc(19) Runtime local19 = Runtime.getRuntime();
					@Pc(25) Integer local25 = (Integer) local15.invoke(local19, (Object[]) null);
					Static378.anInt6757 = local25;
				} catch (@Pc(30) Throwable local30) {
				}
			}
		} catch (@Pc(32) Exception local32) {
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!lq;III)V")
	public static void method7100(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class226 local12;
		if (arg2 < Static216.anInt4042) {
			local12 = Static635.aClass226ArrayArrayArray3[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass28_Sub1_Sub2_1 != null && local12.aClass28_Sub1_Sub2_1.method8973()) {
				arg0.method8969(true, Static671.anInt10769, local12.aClass28_Sub1_Sub2_1, Static10.aClass65_1, 0, 0);
			}
		}
		if (arg3 < Static216.anInt4042) {
			local12 = Static635.aClass226ArrayArrayArray3[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass28_Sub1_Sub2_1 != null && local12.aClass28_Sub1_Sub2_1.method8973()) {
				arg0.method8969(true, 0, local12.aClass28_Sub1_Sub2_1, Static10.aClass65_1, 0, Static671.anInt10769);
			}
		}
		if (arg2 < Static216.anInt4042 && arg3 < Static233.anInt4238) {
			local12 = Static635.aClass226ArrayArrayArray3[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass28_Sub1_Sub2_1 != null && local12.aClass28_Sub1_Sub2_1.method8973()) {
				arg0.method8969(true, Static671.anInt10769, local12.aClass28_Sub1_Sub2_1, Static10.aClass65_1, 0, Static671.anInt10769);
			}
		}
		if (arg2 < Static216.anInt4042 && arg3 > 0) {
			local12 = Static635.aClass226ArrayArrayArray3[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass28_Sub1_Sub2_1 != null && local12.aClass28_Sub1_Sub2_1.method8973()) {
				arg0.method8969(true, Static671.anInt10769, local12.aClass28_Sub1_Sub2_1, Static10.aClass65_1, 0, -Static671.anInt10769);
			}
		}
	}
}
