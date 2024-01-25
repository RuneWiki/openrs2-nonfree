import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!le", name = "E", descriptor = "Lclient!g;")
	public static Class11_Sub14 aClass11_Sub14_1;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "Lclient!nq;")
	public static Class144 aClass144_44;

	@OriginalMember(owner = "client!le", name = "K", descriptor = "[[I")
	public static final int[][] anIntArrayArray36 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)J")
	public static long method2846() {
		return Static76.aClass18_3.method4639();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!oo;)V")
	public static void method2847(@OriginalArg(1) Class67_Sub3_Sub3 arg0) {
		@Pc(11) boolean local11 = false;
		if (arg0.anInt5014 == Static293.anInt5807 || arg0.anInt5013 == -1 || arg0.anInt5001 != 0) {
			local11 = true;
		} else {
			@Pc(31) Class111 local31 = Static306.method5143(arg0.anInt5013);
			if (local31.aBoolean188 || arg0.anInt5005 + 1 > local31.anIntArray190[arg0.anInt5060]) {
				local11 = true;
			}
		}
		if (local11) {
			@Pc(58) int local58 = arg0.anInt5014 - arg0.anInt5037;
			@Pc(64) int local64 = Static293.anInt5807 - arg0.anInt5037;
			@Pc(76) int local76 = arg0.anInt5051 * 128 + arg0.method4368() * 64;
			@Pc(87) int local87 = arg0.anInt5012 * 128 + arg0.method4368() * 64;
			@Pc(99) int local99 = arg0.anInt5046 * 128 + arg0.method4368() * 64;
			@Pc(111) int local111 = arg0.anInt5002 * 128 + arg0.method4368() * 64;
			arg0.anInt6308 = ((local58 - local64) * local76 + local64 * local99) / local58;
			arg0.anInt6310 = (local87 * (local58 - local64) + local64 * local111) / local58;
		}
		arg0.anInt5071 = 0;
		if (arg0.anInt4999 == 0) {
			arg0.method4371(8192);
		}
		if (arg0.anInt4999 == 1) {
			arg0.method4371(12288);
		}
		if (arg0.anInt4999 == 2) {
			arg0.method4371(0);
		}
		if (arg0.anInt4999 == 3) {
			arg0.method4371(4096);
		}
	}
}
