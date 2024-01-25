import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "[[[Lclient!cj;")
	public static Class56[][][] aClass56ArrayArrayArray1;

	@OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
	public static int anInt7459;

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
	public static int anInt7454 = 0;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	public static int anInt7458 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIZ[BILclient!nv;I)Lclient!tea;")
	public static Class20_Sub4_Sub1 method6154(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(6) Class16_Sub3 arg3) {
		if (arg3.aBoolean534 || Static439.method6796(arg0) && Static439.method6796(arg1)) {
			return new Class20_Sub4_Sub1(arg3, 3553, 6406, arg0, arg1, false, arg2, 6406);
		} else if (arg3.aBoolean521) {
			return new Class20_Sub4_Sub1(arg3, 34037, 6406, arg0, arg1, false, arg2, 6406);
		} else {
			return new Class20_Sub4_Sub1(arg3, 6406, arg0, arg1, Static629.method8469(arg0), Static629.method8469(arg1), arg2, 6406);
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(II)V")
	public static void method6155() {
		Static227.anInt5183 = 0;
		Static7.anInt6404 = -1;
		Static532.anInt9177 = -1;
		Static642.aBoolean763 = false;
		Static570.anInt9813 = 1;
		Static542.anInt9401 = 2;
		Static10.aClass8_Sub16_Sub1_1 = null;
		Static68.aClass237_22 = null;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()V")
	public static void method6157() {
		for (@Pc(1) int local1 = 0; local1 < Static1.anInt10286; local1++) {
			@Pc(6) Class15_Sub1_Sub2 local6 = Static322.aClass15_Sub1_Sub2Array1[local1];
			Static307.method5077(local6, true);
			Static322.aClass15_Sub1_Sub2Array1[local1] = null;
		}
		Static1.anInt10286 = 0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I")
	public static int method6158() {
		if (Static197.aFrame1 == null) {
			return Static455.aBoolean599 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)V")
	public static void method6160() {
		try {
			@Pc(16) Method local16 = Runtime.class.getMethod("availableProcessors");
			if (local16 != null) {
				try {
					@Pc(20) Runtime local20 = Runtime.getRuntime();
					@Pc(26) Integer local26 = (Integer) local16.invoke(local20, (Object[]) null);
					Static266.anInt5677 = local26;
				} catch (@Pc(31) Throwable local31) {
				}
			}
		} catch (@Pc(33) Exception local33) {
		}
	}
}
