import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!cea", name = "C", descriptor = "I")
	public static int anInt1673;

	@OriginalMember(owner = "client!cea", name = "P", descriptor = "Lclient!dv;")
	public static Class76 aClass76_1;

	@OriginalMember(owner = "client!cea", name = "M", descriptor = "Lclient!vg;")
	public static final Class342 aClass342_27 = new Class342(64);

	@OriginalMember(owner = "client!cea", name = "c", descriptor = "(Z)V")
	public static void method1509() {
		if (Static37.aBoolean93) {
			return;
		}
		Static595.aBoolean725 = true;
		if (Static348.aClass3_Sub51_Sub1_5.aBoolean681) {
			Static209.aFloat229 = (int) Static209.aFloat229 + 191 & 0xFFFFFF80;
		} else {
			Static1.aFloat1 += (24.0F - Static1.aFloat1) / 2.0F;
		}
		Static37.aBoolean93 = true;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(IIILclient!lr;ILclient!r;)V")
	public static void method1510(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class194 arg3, @OriginalArg(5) Class31 arg4) {
		@Pc(9) Class40 local9 = Static493.aClass296_4.method6523(arg3.anInt5810);
		if (local9.anInt1275 == -1) {
			return;
		}
		if (arg3.aBoolean404) {
			@Pc(28) int local28 = arg0 + arg3.anInt5819;
			arg0 = local28 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(46) Class73 local46 = local9.method1181(arg0, arg3.aBoolean407, arg4);
		if (local46 == null) {
			return;
		}
		@Pc(52) int local52 = arg3.anInt5845;
		@Pc(55) int local55 = arg3.anInt5830;
		if ((arg0 & 0x1) == 1) {
			local55 = arg3.anInt5845;
			local52 = arg3.anInt5830;
		}
		@Pc(71) int local71 = local46.A();
		@Pc(74) int local74 = local46.ca();
		if (local9.aBoolean106) {
			local71 = local52 * 4;
			local74 = local55 * 4;
		}
		if (local9.anInt1277 == 0) {
			local46.method7955(arg1, arg2 - (local55 - 1) * 4, local71, local74);
		} else {
			local46.method7949(arg1, arg2 + 4 - local55 * 4, local71, local74, 0, local9.anInt1277 | 0xFF000000, 1);
		}
	}
}
