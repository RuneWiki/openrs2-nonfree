import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "[Lclient!um;")
	public static Class339[] aClass339Array1;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "[I")
	public static final int[] anIntArray226 = new int[8];

	@OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
	public static int anInt3820 = 0;

	@OriginalMember(owner = "client!hh", name = "j", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray30 = new String[100];

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!uu;II)Lclient!fd;")
	public static Class103 method3272(@OriginalArg(0) Class343 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class103 local14 = (Class103) Static59.aClass136_14.method3134((long) arg1);
		if (local14 == null) {
			if (Static296.aBoolean428) {
				local14 = Static266.aClass82_8.method6106(Static656.method6339(arg0, arg1), true);
			} else {
				local14 = Static257.method4311(arg0.method8143(arg1));
			}
			Static59.aClass136_14.method3135(local14, (long) arg1);
		}
		return local14;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(B)V")
	public static void method3273() {
		if (Static48.aClass298_12.aBoolean612) {
			Static248.anInt4899 = 96;
			return;
		}
		try {
			@Pc(26) Method local26 = Runtime.class.getMethod("maxMemory");
			if (local26 != null) {
				try {
					@Pc(30) Runtime local30 = Runtime.getRuntime();
					@Pc(36) Long local36 = (Long) local26.invoke(local30, (Object[]) null);
					Static248.anInt4899 = (int) (local36 / 1048576L) + 1;
				} catch (@Pc(46) Throwable local46) {
				}
			}
		} catch (@Pc(48) Exception local48) {
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIIIII)V")
	public static void method3274(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static578.method8088(arg2);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg2 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg2;
		@Pc(27) int local27 = -arg2;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(55) int local55;
		@Pc(63) int local63;
		@Pc(72) int local72;
		@Pc(80) int local80;
		if (Static298.anInt5919 <= arg3 && Static596.anInt9703 >= arg3) {
			@Pc(46) int[] local46 = Static71.anIntArrayArray5[arg3];
			local55 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 - arg2);
			local63 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg2 + arg5);
			local72 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 - local15);
			local80 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local15 + arg5);
			Static82.method1400(arg0, local55, local72, local46);
			Static82.method1400(arg1, local72, local80, local46);
			Static82.method1400(arg0, local80, local63, local46);
		}
		while (local10 < local24) {
			local34 += 2;
			local36 += 2;
			local32 += local36;
			local27 += local34;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				Static100.anIntArray181[local29] = local10;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(241) int local241;
			@Pc(250) int local250;
			@Pc(261) int[] local261;
			@Pc(144) int local144;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local144 = arg3 - local24;
				local55 = arg3 + local24;
				if (local55 >= Static298.anInt5919 && Static596.anInt9703 >= local144) {
					if (local24 >= local15) {
						local63 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 + local10);
						local72 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 - local10);
						if (local55 <= Static596.anInt9703) {
							Static82.method1400(arg0, local72, local63, Static71.anIntArrayArray5[local55]);
						}
						if (Static298.anInt5919 <= local144) {
							Static82.method1400(arg0, local72, local63, Static71.anIntArrayArray5[local144]);
						}
					} else {
						local63 = Static100.anIntArray181[local24];
						local72 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local10 + arg5);
						local80 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 - local10);
						local241 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 + local63);
						local250 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 - local63);
						if (local55 <= Static596.anInt9703) {
							local261 = Static71.anIntArrayArray5[local55];
							Static82.method1400(arg0, local80, local250, local261);
							Static82.method1400(arg1, local250, local241, local261);
							Static82.method1400(arg0, local241, local72, local261);
						}
						if (local144 >= Static298.anInt5919) {
							local261 = Static71.anIntArrayArray5[local144];
							Static82.method1400(arg0, local80, local250, local261);
							Static82.method1400(arg1, local250, local241, local261);
							Static82.method1400(arg0, local241, local72, local261);
						}
					}
				}
			}
			local144 = arg3 - local10;
			local55 = arg3 + local10;
			if (local55 >= Static298.anInt5919 && local144 <= Static596.anInt9703) {
				local63 = local24 + arg5;
				local72 = arg5 - local24;
				if (Static474.anInt8118 <= local63 && local72 <= Static576.anInt9425) {
					local63 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local63);
					local72 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, local72);
					if (local10 >= local15) {
						if (local55 <= Static596.anInt9703) {
							Static82.method1400(arg0, local72, local63, Static71.anIntArrayArray5[local55]);
						}
						if (Static298.anInt5919 <= local144) {
							Static82.method1400(arg0, local72, local63, Static71.anIntArrayArray5[local144]);
						}
					} else {
						local80 = local10 > local29 ? Static100.anIntArray181[local10] : local29;
						local241 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 + local80);
						local250 = Static632.method8535(Static576.anInt9425, Static474.anInt8118, arg5 - local80);
						if (local55 <= Static596.anInt9703) {
							local261 = Static71.anIntArrayArray5[local55];
							Static82.method1400(arg0, local72, local250, local261);
							Static82.method1400(arg1, local250, local241, local261);
							Static82.method1400(arg0, local241, local63, local261);
						}
						if (Static298.anInt5919 <= local144) {
							local261 = Static71.anIntArrayArray5[local144];
							Static82.method1400(arg0, local72, local250, local261);
							Static82.method1400(arg1, local250, local241, local261);
							Static82.method1400(arg0, local241, local63, local261);
						}
					}
				}
			}
		}
	}
}
