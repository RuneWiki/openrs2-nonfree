import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static537 {

	@OriginalMember(owner = "client!wn", name = "g", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray44 = new String[100];

	@OriginalMember(owner = "client!wn", name = "h", descriptor = "Lclient!rg;")
	public static final Class252 aClass252_138 = new Class252(3, 8);

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "J")
	public static long aLong248 = 0L;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "[J")
	public static final long[] aLongArray17 = new long[100];

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILclient!di;Lclient!qa;IIILclient!dj;Lclient!wt;)V")
	public static void method8135(@OriginalArg(1) Class65 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class66 arg5, @OriginalArg(7) Class1_Sub51 arg6) {
		@Pc(15) int local15 = arg6.anInt9567 - arg2 / 2 - 5;
		@Pc(19) int local19 = arg4 + 2;
		if (arg0.anInt1912 != 0) {
			arg1.method7162(arg0.anInt1912, arg2 + 10, local15, local19, arg5.method1827() * arg3 + arg4 + 1 - local19);
		}
		if (arg0.anInt1896 != 0) {
			arg1.method7190(local19, arg2 + 10, arg0.anInt1896, arg5.method1827() * arg3 + arg4 + 1 - local19, local15);
		}
		@Pc(72) int local72 = arg0.anInt1909;
		if (arg6.aBoolean709 && arg0.anInt1917 != -1) {
			local72 = arg0.anInt1917;
		}
		for (@Pc(90) int local90 = 0; local90 < arg3; local90++) {
			@Pc(96) String local96 = Static513.aStringArray37[local90];
			if (local90 < arg3 - 1) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg5.method1831(arg1, local96, arg6.anInt9567, arg4, local72);
			arg4 += arg5.method1827();
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(ZI)I")
	public static int method8137(@OriginalArg(1) int arg0) {
		return arg0 == 16711935 ? -1 : Static264.method8226(arg0);
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!lw;BZZ)V")
	public static void method8142(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) int local8 = arg0.anInt5502;
		@Pc(20) int local20 = (int) arg0.aLong251;
		arg0.method8239();
		if (arg2) {
			Static62.method1530(local8);
		}
		Static226.method4064(local8);
		@Pc(35) Class91 local35 = Static384.method6156(local20);
		if (local35 != null) {
			Static243.method4316(local35);
		}
		Static503.method5020();
		if (!arg1 && Static328.anInt6167 != -1) {
			Static120.method7553(Static328.anInt6167, 1);
		}
		@Pc(57) Class239 local57 = new Class239(Static362.aClass230_45);
		for (@Pc(62) Class1_Sub35 local62 = (Class1_Sub35) local57.method6256(); local62 != null; local62 = (Class1_Sub35) local57.method6258()) {
			if (!local62.method8241()) {
				local62 = (Class1_Sub35) local57.method6256();
				if (local62 == null) {
					return;
				}
			}
			if (local62.anInt5499 == 3) {
				@Pc(86) int local86 = (int) local62.aLong251;
				if (local8 == local86 >>> 16) {
					method8142(local62, arg1, true);
				}
			}
		}
	}
}
