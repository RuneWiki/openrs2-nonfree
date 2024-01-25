import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static272 {

	@OriginalMember(owner = "client!re", name = "D", descriptor = "I")
	public static int anInt5415 = 0;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Lclient!pm;")
	public static final Class159 aClass159_287 = new Class159("yellow:", "gelb:", "jaune:", "amarelo:");

	@OriginalMember(owner = "client!re", name = "H", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "I")
	public static int anInt5418 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIIIIII)Lclient!ro;")
	public static Class81 method4651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(33) long local33 = (long) arg0 * 32147369L ^ (long) arg4 * 986053L ^ (long) arg3 * 97549L ^ (long) arg5 * 67481L ^ (long) arg2 * 475427L ^ (long) arg1 * 76724863L;
		@Pc(39) Class81 local39 = (Class81) Static189.aClass198_142.method5210(local33);
		if (local39 == null) {
			local39 = Static243.aClass47_10.method2735(arg5, arg3, arg2, arg4, arg0, arg1);
			Static189.aClass198_142.method5201(local39, local33);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(II)Z")
	public static boolean method4652(@OriginalArg(1) int arg0) {
		Static286.anInt6705 = arg0 + 1 & 0xFFFF;
		Static156.aBoolean385 = true;
		return true;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)Lclient!so;")
	public static Class4_Sub4_Sub18 method4653() {
		@Pc(15) Class4_Sub4_Sub18 local15 = (Class4_Sub4_Sub18) Static347.aClass180_10.method4838();
		if (local15 != null) {
			local15.method5687();
			local15.method5678();
			return local15;
		}
		do {
			local15 = (Class4_Sub4_Sub18) Static301.aClass180_8.method4838();
			if (local15 == null) {
				return null;
			}
			if (local15.method4907() > Static208.method3879()) {
				return null;
			}
			local15.method5687();
			local15.method5678();
		} while ((local15.aLong222 & Long.MIN_VALUE) == 0L);
		return local15;
	}
}
