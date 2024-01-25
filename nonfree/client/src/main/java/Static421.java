import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static421 {

	@OriginalMember(owner = "client!nv", name = "c", descriptor = "[I")
	public static int[] anIntArray369 = null;

	@OriginalMember(owner = "client!nv", name = "f", descriptor = "Lclient!rl;")
	public static final Class317 aClass317_43 = new Class317(8);

	@OriginalMember(owner = "client!nv", name = "b", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_188 = new Class160(11, 12);

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIZ)V")
	public static void method6290(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(10) Class14_Sub14 local10 = Static495.method7455(arg0, arg1);
		if (local10 != null) {
			for (@Pc(16) int local16 = 0; local16 < local10.anIntArray106.length; local16++) {
				local10.anIntArray106[local16] = -1;
				local10.anIntArray107[local16] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIII)V")
	public static void method6292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class89 local7 = Static63.aClass89ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(14) Class4_Sub3_Sub5 local14 = local7.aClass4_Sub3_Sub5_1;
		@Pc(17) Class4_Sub3_Sub5 local17 = local7.aClass4_Sub3_Sub5_2;
		if (local14 != null) {
			local14.aShort113 = (short) (local14.aShort113 * arg3 / (0x10 << Static110.anInt1858 - 7));
			local14.aShort114 = (short) (local14.aShort114 * arg3 / (0x10 << Static110.anInt1858 - 7));
		}
		if (local17 != null) {
			local17.aShort113 = (short) (local17.aShort113 * arg3 / (0x10 << Static110.anInt1858 - 7));
			local17.aShort114 = (short) (local17.aShort114 * arg3 / (0x10 << Static110.anInt1858 - 7));
		}
	}
}
