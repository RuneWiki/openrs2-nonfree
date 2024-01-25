import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static34 {

	@OriginalMember(owner = "client!bca", name = "h", descriptor = "[Lclient!ti;")
	public static Class4_Sub4_Sub1_Sub1[] aClass4_Sub4_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!bca", name = "i", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_12 = new Class160(32, -1);

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_20 = new Class251(41, -1);

	@OriginalMember(owner = "client!bca", name = "e", descriptor = "[I")
	public static final int[] anIntArray30 = new int[] { 16, 32, 64, 128 };

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Lclient!tha;")
	public static Class4_Sub3_Sub1 method575(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass4_Sub3_Sub1_1;
	}
}
