import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static409 {

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
	public static int anInt6824 = 0;

	@OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
	public static int anInt6832 = 0;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLclient!fi;)V")
	public static void method5398(@OriginalArg(1) Class76 arg0) {
		if (!Static423.aBoolean478) {
			return;
		}
		if (arg0.anObjectArray3 != null) {
			@Pc(18) Class76 local18 = Static371.method4859(Static143.anInt2595, Static127.anInt2221);
			if (local18 != null) {
				@Pc(24) Class5_Sub33 local24 = new Class5_Sub33();
				local24.aClass76_11 = local18;
				local24.aClass76_12 = arg0;
				local24.anObjectArray35 = arg0.anObjectArray3;
				Static181.method2470(local24);
			}
		}
		Static288.method3576(Static97.aClass194_23);
		Static281.aClass5_Sub15_Sub2_13.method5550(arg0.anInt2100);
		Static281.aClass5_Sub15_Sub2_13.method5588(Static374.anInt6237);
		Static281.aClass5_Sub15_Sub2_13.method5566(arg0.anInt2057);
		Static281.aClass5_Sub15_Sub2_13.method5564(Static127.anInt2221);
		Static281.aClass5_Sub15_Sub2_13.method5597(Static143.anInt2595);
		Static281.aClass5_Sub15_Sub2_13.method5588(arg0.anInt2115);
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lclient!fh;I)Lclient!ub;")
	public static Class5_Sub1 method5399(@OriginalArg(0) Class5_Sub15 arg0) {
		arg0.method5539();
		@Pc(13) int local13 = arg0.method5539();
		@Pc(17) Class5_Sub1 local17 = Static261.method3343(local13);
		local17.anInt7254 = arg0.method5539();
		@Pc(26) int local26 = arg0.method5539();
		for (@Pc(28) int local28 = 0; local28 < local26; local28++) {
			@Pc(34) int local34 = arg0.method5539();
			local17.method5771(local34, arg0);
		}
		local17.method5762();
		return local17;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!fh;)Lclient!qb;")
	public static Class61_Sub4 method5402(@OriginalArg(1) Class5_Sub15 arg0) {
		return new Class61_Sub4(arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5586(), arg0.method5541(), arg0.method5539());
	}
}
