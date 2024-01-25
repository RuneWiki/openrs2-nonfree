import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!oq", name = "h", descriptor = "I")
	public static int anInt7500;

	@OriginalMember(owner = "client!oq", name = "e", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_186 = new Class251(60, 2);

	@OriginalMember(owner = "client!oq", name = "d", descriptor = "[I")
	public static final int[] anIntArray398 = new int[1];

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(BI)Lclient!maa;")
	public static Class229 method6639(@OriginalArg(1) int arg0) {
		@Pc(16) Class229[] local16 = Static60.method1031();
		for (@Pc(18) int local18 = 0; local18 < local16.length; local18++) {
			@Pc(24) Class229 local24 = local16[local18];
			if (local24.anInt6240 == arg0) {
				return local24;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(III)Lclient!ef;")
	public static Class4_Sub3_Sub2 method6640(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass4_Sub3_Sub2_1 == null ? null : local7.aClass4_Sub3_Sub2_1;
	}
}
