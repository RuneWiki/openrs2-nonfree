import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	public static int anInt4061;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_72 = new Class70(20);

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
	public static final int[] anIntArray471 = new int[32];

	@OriginalMember(owner = "client!ob", name = "k", descriptor = "Ljava/lang/String;")
	public static String aString176 = null;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BII)I")
	public static int method3913(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(29) int local29 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local29;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public static void method3914() {
		@Pc(1) Class70 local1 = Static293.aClass70_95;
		synchronized (Static293.aClass70_95) {
			Static293.aClass70_95.method1399();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIII)V")
	public static void method3915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static240.method3872(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(38) int local38 = -1;
		@Pc(40) int local40 = -1;
		@Pc(61) int local61;
		@Pc(69) int local69;
		@Pc(77) int local77;
		@Pc(85) int local85;
		if (arg4 >= Static327.anInt3039 && Static230.anInt4308 >= arg4) {
			@Pc(50) int[] local50 = Static11.anIntArrayArray11[arg4];
			local61 = Static6.method125(arg5 - arg1, Static265.anInt4933, Static311.anInt5837);
			local69 = Static6.method125(arg1 + arg5, Static265.anInt4933, Static311.anInt5837);
			local77 = Static6.method125(arg5 - local15, Static265.anInt4933, Static311.anInt5837);
			local85 = Static6.method125(local15 + arg5, Static265.anInt4933, Static311.anInt5837);
			Static14.method247(local77, arg3, local50, local61);
			Static14.method247(local85, arg0, local50, local77);
			Static14.method247(local69, arg3, local50, local85);
		}
		while (local24 > local10) {
			local40 += 2;
			local38 += 2;
			local27 += local38;
			local32 += local40;
			if (local32 >= 0 && local29 >= 1) {
				local29--;
				local32 -= local29 << 1;
				Static197.anIntArray568[local29] = local10;
			}
			local10++;
			@Pc(253) int local253;
			@Pc(262) int local262;
			@Pc(269) int[] local269;
			@Pc(151) int local151;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local151 = arg4 - local24;
				local61 = local24 + arg4;
				if (Static327.anInt3039 <= local61 && local151 <= Static230.anInt4308) {
					if (local15 <= local24) {
						local69 = Static6.method125(arg5 + local10, Static265.anInt4933, Static311.anInt5837);
						local77 = Static6.method125(arg5 - local10, Static265.anInt4933, Static311.anInt5837);
						if (Static230.anInt4308 >= local61) {
							Static14.method247(local69, arg3, Static11.anIntArrayArray11[local61], local77);
						}
						if (Static327.anInt3039 <= local151) {
							Static14.method247(local69, arg3, Static11.anIntArrayArray11[local151], local77);
						}
					} else {
						local69 = Static197.anIntArray568[local24];
						local77 = Static6.method125(arg5 + local10, Static265.anInt4933, Static311.anInt5837);
						local85 = Static6.method125(arg5 - local10, Static265.anInt4933, Static311.anInt5837);
						local253 = Static6.method125(local69 + arg5, Static265.anInt4933, Static311.anInt5837);
						local262 = Static6.method125(arg5 - local69, Static265.anInt4933, Static311.anInt5837);
						if (Static230.anInt4308 >= local61) {
							local269 = Static11.anIntArrayArray11[local61];
							Static14.method247(local262, arg3, local269, local85);
							Static14.method247(local253, arg0, local269, local262);
							Static14.method247(local77, arg3, local269, local253);
						}
						if (Static327.anInt3039 <= local151) {
							local269 = Static11.anIntArrayArray11[local151];
							Static14.method247(local262, arg3, local269, local85);
							Static14.method247(local253, arg0, local269, local262);
							Static14.method247(local77, arg3, local269, local253);
						}
					}
				}
			}
			local151 = arg4 - local10;
			local61 = local10 + arg4;
			if (local61 >= Static327.anInt3039 && Static230.anInt4308 >= local151) {
				local69 = arg5 + local24;
				local77 = arg5 - local24;
				if (local69 >= Static311.anInt5837 && local77 <= Static265.anInt4933) {
					local69 = Static6.method125(local69, Static265.anInt4933, Static311.anInt5837);
					local77 = Static6.method125(local77, Static265.anInt4933, Static311.anInt5837);
					if (local15 > local10) {
						local85 = local29 >= local10 ? local29 : Static197.anIntArray568[local10];
						local253 = Static6.method125(arg5 + local85, Static265.anInt4933, Static311.anInt5837);
						local262 = Static6.method125(arg5 - local85, Static265.anInt4933, Static311.anInt5837);
						if (Static230.anInt4308 >= local61) {
							local269 = Static11.anIntArrayArray11[local61];
							Static14.method247(local262, arg3, local269, local77);
							Static14.method247(local253, arg0, local269, local262);
							Static14.method247(local69, arg3, local269, local253);
						}
						if (local151 >= Static327.anInt3039) {
							local269 = Static11.anIntArrayArray11[local151];
							Static14.method247(local262, arg3, local269, local77);
							Static14.method247(local253, arg0, local269, local262);
							Static14.method247(local69, arg3, local269, local253);
						}
					} else {
						if (local61 <= Static230.anInt4308) {
							Static14.method247(local69, arg3, Static11.anIntArrayArray11[local61], local77);
						}
						if (Static327.anInt3039 <= local151) {
							Static14.method247(local69, arg3, Static11.anIntArrayArray11[local151], local77);
						}
					}
				}
			}
		}
	}
}
