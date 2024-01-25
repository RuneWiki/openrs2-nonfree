import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static566 {

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "J")
	public static long aLong253 = 0L;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "[Lclient!jq;")
	public static final Class174[] aClass174Array2 = new Class174[14];

	@OriginalMember(owner = "client!vs", name = "h", descriptor = "Z")
	public static boolean aBoolean835 = false;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIII[B[BIIZ)V")
	public static void method8139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(10) int local10 = -(arg7 >> 2);
		@Pc(15) int local15 = -(arg7 & 0x3);
		for (@Pc(23) int local23 = -arg3; local23 < 0; local23++) {
			@Pc(31) int local31;
			for (@Pc(27) int local27 = local10; local27 < 0; local27++) {
				local31 = arg6++;
				arg4[local31] = (byte) (arg4[local31] - arg5[arg0++]);
				@Pc(44) int local44 = arg6++;
				arg4[local44] = (byte) (arg4[local44] - arg5[arg0++]);
				@Pc(57) int local57 = arg6++;
				arg4[local57] = (byte) (arg4[local57] - arg5[arg0++]);
				@Pc(70) int local70 = arg6++;
				arg4[local70] = (byte) (arg4[local70] - arg5[arg0++]);
			}
			for (@Pc(86) int local86 = local15; local86 < 0; local86++) {
				local31 = arg6++;
				arg4[local31] = (byte) (arg4[local31] - arg5[arg0++]);
			}
			arg6 += arg1;
			arg0 += arg2;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Lclient!tc;BLclient!tc;)V")
	public static void method8140(@OriginalArg(0) Class305 arg0, @OriginalArg(2) Class305 arg1) {
		@Pc(12) Class3_Sub9 local12 = Static587.method8316(Static187.aClass40_2, Static488.aClass230_21);
		local12.aClass3_Sub7_Sub1_1.method6495(arg1.anInt9167);
		local12.aClass3_Sub7_Sub1_1.method6528(arg0.anInt9159);
		local12.aClass3_Sub7_Sub1_1.method6556(arg0.anInt9216);
		local12.aClass3_Sub7_Sub1_1.method6537(arg1.anInt9159);
		local12.aClass3_Sub7_Sub1_1.method6531(arg0.anInt9167);
		local12.aClass3_Sub7_Sub1_1.method6537(arg1.anInt9216);
		Static230.method3933(local12);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)Z")
	public static boolean method8142(@OriginalArg(1) int arg0) {
		if (arg0 == 45 || arg0 == 25 || arg0 == 10 || arg0 == 8 || arg0 == 13) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(III)Z")
	public static boolean method8143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static458.method7062(arg1, arg0) || Static237.method4127(arg1, arg0);
	}
}
