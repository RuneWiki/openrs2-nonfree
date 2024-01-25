import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!hn;")
	public static final Class107 aClass107_117 = new Class107(81, -2);

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "[I")
	public static final int[] anIntArray303 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(BCI)I")
	public static int method2974(@OriginalArg(1) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)Lclient!jh;")
	public static Class4_Sub4 method2977() {
		@Pc(13) Class4_Sub4 local13 = (Class4_Sub4) Static29.aClass141_6.method3362();
		if (local13 == null) {
			return new Class4_Sub4();
		} else {
			Static200.anInt3843--;
			return local13;
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!uq;I)V")
	public static void method2981(@OriginalArg(0) Class251 arg0) {
		if (!Static355.aBoolean412) {
			return;
		}
		if (arg0.anObjectArray15 != null) {
			@Pc(24) Class251 local24 = Static201.method3261(Static135.anInt2708, Static314.anInt5418);
			if (local24 != null) {
				@Pc(30) Class1_Sub24 local30 = new Class1_Sub24();
				local30.aClass251_4 = local24;
				local30.anObjectArray3 = arg0.anObjectArray15;
				local30.aClass251_5 = arg0;
				Static13.method366(local30);
			}
		}
		Static193.method2984(Static189.aClass179_46);
		Static92.aClass1_Sub5_Sub1_1.method5417(arg0.anInt6689);
		Static92.aClass1_Sub5_Sub1_1.method5359(arg0.anInt6679);
		Static92.aClass1_Sub5_Sub1_1.method5405(Static314.anInt5418);
		Static92.aClass1_Sub5_Sub1_1.method5359(Static92.anInt1948);
		Static92.aClass1_Sub5_Sub1_1.method5390(Static135.anInt2708);
		Static92.aClass1_Sub5_Sub1_1.method5390(arg0.anInt6704);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZIII)V")
	public static void method2982(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(39) String local39 = "tele " + arg0 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
		System.out.println(local39);
		Static369.method5060(true, local39);
	}
}
