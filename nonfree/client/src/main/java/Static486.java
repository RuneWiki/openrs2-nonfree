import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static486 {

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "[Lclient!bl;")
	public static Class40[] aClass40Array1;

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_158 = new Class156(137, 2);

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "[I")
	public static final int[] anIntArray457 = new int[2048];

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_159 = new Class156(120, 17);

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)Lclient!pba;")
	public static Class4_Sub1_Sub2 method6844(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class128 local7 = Static283.aClass128ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub1_Sub2_1;
	}
}
