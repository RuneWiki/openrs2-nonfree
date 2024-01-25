import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!eka", name = "L", descriptor = "Z")
	public static boolean aBoolean196;

	@OriginalMember(owner = "client!eka", name = "J", descriptor = "Lclient!cp;")
	public static final Class60 aClass60_4 = new Class60();

	@OriginalMember(owner = "client!eka", name = "K", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(IIZ)I")
	public static int method2434(@OriginalArg(1) int arg0) {
		@Pc(14) Class2_Sub42 local14 = Static47.method979(false, arg0);
		if (local14 == null) {
			return Static503.aClass77_2.method1973(arg0).anInt4086;
		}
		@Pc(32) int local32 = 0;
		for (@Pc(34) int local34 = 0; local34 < local14.anIntArray350.length; local34++) {
			if (local14.anIntArray350[local34] == -1) {
				local32++;
			}
		}
		return local32 + Static503.aClass77_2.method1973(arg0).anInt4086 - local14.anIntArray350.length;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(ZLclient!ha;I)Lclient!rt;")
	public static Class324 method2435(@OriginalArg(1) Class101 arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class91 local9 = Static660.method9148(true, arg0, arg1);
		return local9 == null ? null : local9.aClass324_5;
	}

	@OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lclient!fm;Z)V")
	public static void method2437(@OriginalArg(0) Class15_Sub3_Sub3_Sub1 arg0) {
		@Pc(10) boolean local10 = false;
		if (Static62.anInt1184 == arg0.anInt3982 || arg0.anInt3985 == -1 || arg0.anInt4030 != 0) {
			local10 = true;
		} else {
			@Pc(35) Class178 local35 = Static354.aClass40_2.method1123(arg0.anInt3985);
			if (local35.aBoolean386 || arg0.anInt4036 + 1 > local35.anIntArray257[arg0.anInt4021]) {
				local10 = true;
			}
		}
		if (local10) {
			@Pc(63) int local63 = arg0.anInt3982 - arg0.anInt4008;
			@Pc(69) int local69 = Static62.anInt1184 - arg0.anInt4008;
			@Pc(80) int local80 = arg0.anInt3994 * 512 + arg0.method3690() * 256;
			@Pc(91) int local91 = arg0.anInt3989 * 512 + arg0.method3690() * 256;
			@Pc(102) int local102 = arg0.anInt4014 * 512 + arg0.method3690() * 256;
			@Pc(114) int local114 = arg0.lb * 512 + arg0.method3690() * 256;
			arg0.anInt11022 = (local69 * local102 + (local63 - local69) * local80) / local63;
			arg0.anInt11024 = (local114 * local69 + local91 * (local63 - local69)) / local63;
		}
		arg0.anInt4040 = 0;
		if (arg0.anInt3970 == 0) {
			arg0.method3686(8192, false);
		}
		if (arg0.anInt3970 == 1) {
			arg0.method3686(12288, false);
		}
		if (arg0.anInt3970 == 2) {
			arg0.method3686(0, false);
		}
		if (arg0.anInt3970 == 3) {
			arg0.method3686(4096, false);
		}
	}
}
