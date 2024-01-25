import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
	public static int anInt3681 = 0;

	@OriginalMember(owner = "client!fg", name = "j", descriptor = "Lclient!aca;")
	public static final Class6 aClass6_7 = new Class6();

	@OriginalMember(owner = "client!fg", name = "l", descriptor = "Lclient!sga;")
	public static final Class307 aClass307_22 = new Class307(512);

	@OriginalMember(owner = "client!fg", name = "m", descriptor = "I")
	public static final int anInt3688 = 328;

	@OriginalMember(owner = "client!fg", name = "n", descriptor = "I")
	public static int anInt3689 = 0;

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIII)V")
	public static void method3260(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(4) int local4 = arg2 + 1;
		Static580.method8027(Static104.anIntArrayArray24[arg2], arg4, arg1, arg3);
		@Pc(25) int local25 = arg0 - 1;
		Static580.method8027(Static104.anIntArrayArray24[arg0], arg4, arg1, arg3);
		for (@Pc(33) int local33 = local4; local33 <= local25; local33++) {
			@Pc(39) int[] local39 = Static104.anIntArrayArray24[local33];
			local39[arg1] = local39[arg4] = arg3;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lclient!kha;IIIZII)V")
	public static void method3262(@OriginalArg(0) Class181 arg0, @OriginalArg(2) int arg1, @OriginalArg(6) int arg2) {
		Static618.aBoolean861 = false;
		Static458.anInt8332 = arg2;
		Static218.aClass3_Sub7_Sub5_1 = null;
		Static110.aClass181_22 = arg0;
		Static370.anInt7046 = 2;
		Static565.anInt9608 = 1;
		Static627.anInt10354 = arg1;
		Static369.anInt7034 = 0;
	}
}
