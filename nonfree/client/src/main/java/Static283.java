import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!sd", name = "j", descriptor = "Lclient!ai;")
	public static Class9 aClass9_3;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public static int anInt5592 = 0;

	@OriginalMember(owner = "client!sd", name = "t", descriptor = "F")
	public static float aFloat53 = 0.0F;

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 == arg6) {
			Static224.method5307(arg1, arg4, arg5, arg2, arg0, arg3);
		} else if (arg3 - arg2 >= Static280.anInt212 && arg2 + arg3 <= Static346.anInt6607 && Static240.anInt4829 <= arg0 - arg6 && Static166.anInt3315 >= arg0 + arg6) {
			Static17.method225(arg4, arg3, arg6, arg1, arg2, arg0, arg5);
		} else {
			Static148.method2260(arg6, arg2, arg0, arg1, arg3, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Z")
	public static boolean method4712() {
		return Static74.anInt1413 == 0 ? Static193.aBoolean249 : true;
	}

	@OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V")
	public static void method4715() {
		Static261.aClass26_46.method328();
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI)Lclient!qs;")
	public static Class170 method4717(@OriginalArg(1) int arg0) {
		@Pc(7) Class26 local7 = Static342.aClass26_60;
		@Pc(16) Class170 local16;
		synchronized (Static342.aClass26_60) {
			local16 = (Class170) Static342.aClass26_60.method332((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(41) byte[] local41 = Static254.aClass144_87.method3896(Static219.method3923(arg0), Static307.method4211(arg0));
		local16 = new Class170();
		local16.anInt5322 = arg0;
		local16.aStringArray43 = new String[] { null, null, Static154.aClass117_53.method2684(Static5.anInt32), null, null };
		local16.aStringArray42 = new String[] { null, null, null, null, Static207.aClass117_74.method2684(Static5.anInt32) };
		if (local41 != null) {
			local16.method4538(new Class11_Sub25(local41));
		}
		local16.method4530();
		if (local16.anInt5337 != -1) {
			local16.method4533(method4717(local16.anInt5335), method4717(local16.anInt5337));
		}
		if (local16.anInt5304 != -1) {
			local16.method4540(method4717(local16.anInt5304), method4717(local16.anInt5318));
		}
		if (!Static157.aBoolean194 && local16.aBoolean347) {
			local16.aString53 = Static181.aClass117_62.method2684(Static5.anInt32);
			local16.aStringArray42 = Static316.aStringArray50;
			local16.anInt5321 = 0;
			local16.aBoolean348 = false;
			local16.anIntArray403 = null;
			local16.aStringArray43 = Static199.aStringArray31;
			if (local16.aClass58_31 != null) {
				@Pc(177) boolean local177 = false;
				for (@Pc(182) Class11 local182 = local16.aClass58_31.method1008(); local182 != null; local182 = local16.aClass58_31.method1004()) {
					@Pc(190) Class11_Sub4_Sub6 local190 = Static286.method4771((int) local182.aLong215);
					if (local190.aBoolean87) {
						local182.method5701();
					} else {
						local177 = true;
					}
				}
				if (!local177) {
					local16.aClass58_31 = null;
				}
			}
		}
		@Pc(214) Class26 local214 = Static342.aClass26_60;
		synchronized (Static342.aClass26_60) {
			Static342.aClass26_60.method330((long) arg0, local16);
			return local16;
		}
	}
}
