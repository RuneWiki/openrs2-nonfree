import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
	public static int anInt8366;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "[I")
	public static final int[] anIntArray488 = new int[1000];

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!au;")
	public static Class22 aClass22_55 = new Class22();

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_30 = new Class221(8);

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
	public static int anInt8367 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!ufa;Z)V")
	public static void method6481(@OriginalArg(0) Class21_Sub1_Sub1_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static306.anInt6122 == arg0.anInt4212 || arg0.anInt4209 == -1 || arg0.anInt4214 != 0) {
			local5 = true;
		} else {
			@Pc(34) Class111 local34 = Static17.aClass254_1.method5936(arg0.anInt4209);
			if (local34.aBoolean232 || arg0.anInt4252 + 1 > local34.anIntArray150[arg0.anInt4272]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(62) int local62 = arg0.anInt4212 - arg0.anInt4242;
			@Pc(68) int local68 = Static306.anInt6122 - arg0.anInt4242;
			@Pc(79) int local79 = arg0.anInt4239 * 512 + arg0.method3339() * 256;
			@Pc(90) int local90 = arg0.anInt4274 * 512 + arg0.method3339() * 256;
			@Pc(101) int local101 = arg0.anInt4227 * 512 + arg0.method3339() * 256;
			@Pc(112) int local112 = arg0.anInt4259 * 512 + arg0.method3339() * 256;
			arg0.anInt10550 = (local90 * (local62 - local68) + local112 * local68) / local62;
			arg0.anInt10551 = (local101 * local68 + local79 * (local62 - local68)) / local62;
		}
		arg0.anInt4279 = 0;
		if (arg0.anInt4215 == 0) {
			arg0.method3340(false, 8192);
		}
		if (arg0.anInt4215 == 1) {
			arg0.method3340(false, 12288);
		}
		if (arg0.anInt4215 == 2) {
			arg0.method3340(false, 0);
		}
		if (arg0.anInt4215 == 3) {
			arg0.method3340(false, 4096);
		}
	}
}
