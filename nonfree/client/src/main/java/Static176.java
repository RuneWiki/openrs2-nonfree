import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!il", name = "A", descriptor = "I")
	public static int anInt3856;

	@OriginalMember(owner = "client!il", name = "s", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_84 = new Class263(45, 2);

	@OriginalMember(owner = "client!il", name = "y", descriptor = "Lclient!lo;")
	public static final Class158 aClass158_97 = new Class158("K", "T", "K", "K");

	@OriginalMember(owner = "client!il", name = "z", descriptor = "[S")
	public static final short[] aShortArray65 = new short[] { -4160, -4163, -8256, -8259, 22461 };

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!nv;ILjava/awt/Component;I)Lclient!fl;")
	public static Class31 method2982(@OriginalArg(0) int arg0, @OriginalArg(1) Class183 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Component arg3) {
		if (Static84.anInt2035 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(30) Class31 local30 = (Class31) Class.forName("Class31_Sub2").getDeclaredConstructor().newInstance();
			local30.anIntArray287 = new int[(Static344.aBoolean402 ? 2 : 1) * 256];
			local30.anInt2733 = arg2;
			local30.method2007(arg3);
			local30.anInt2735 = (arg2 & 0xFFFFFC00) + 1024;
			if (local30.anInt2735 > 16384) {
				local30.anInt2735 = 16384;
			}
			local30.method2002(local30.anInt2735);
			if (Static446.anInt7813 > 0 && Static125.aClass249_1 == null) {
				Static125.aClass249_1 = new Class249();
				Static125.aClass249_1.aClass183_5 = arg1;
				arg1.method4141(Static125.aClass249_1, Static446.anInt7813);
			}
			if (Static125.aClass249_1 != null) {
				if (Static125.aClass249_1.aClass31Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static125.aClass249_1.aClass31Array1[arg0] = local30;
			}
			return local30;
		} catch (@Pc(105) Throwable local105) {
			try {
				@Pc(111) Class31_Sub1 local111 = new Class31_Sub1(arg1, arg0);
				local111.anInt2733 = arg2;
				local111.anIntArray287 = new int[(Static344.aBoolean402 ? 2 : 1) * 256];
				local111.method2007(arg3);
				local111.anInt2735 = 16384;
				local111.method2002(local111.anInt2735);
				if (Static446.anInt7813 > 0 && Static125.aClass249_1 == null) {
					Static125.aClass249_1 = new Class249();
					Static125.aClass249_1.aClass183_5 = arg1;
					arg1.method4141(Static125.aClass249_1, Static446.anInt7813);
				}
				if (Static125.aClass249_1 != null) {
					if (Static125.aClass249_1.aClass31Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static125.aClass249_1.aClass31Array1[arg0] = local111;
				}
				return local111;
			} catch (@Pc(175) Throwable local175) {
				return new Class31();
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(III)I")
	public static int method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(17) int local17 = arg1 * 57 + arg0;
		@Pc(23) int local23 = local17 ^ local17 << 13;
		@Pc(37) int local37 = (local23 * 15731 * local23 + 789221) * local23 + 1376312589 & Integer.MAX_VALUE;
		return local37 >> 19 & 0xFF;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
	public static void method2984(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static270.anInt5249 = arg0;
	}
}
