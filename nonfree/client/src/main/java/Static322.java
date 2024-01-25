import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static322 {

	@OriginalMember(owner = "client!lba", name = "k", descriptor = "Lclient!uaa;")
	public static Class345 aClass345_3;

	@OriginalMember(owner = "client!lba", name = "b", descriptor = "I")
	public static int anInt6116 = 0;

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(I)V")
	public static void method5082() {
		@Pc(7) int local7 = Static209.anInt3954;
		@Pc(9) int[] local9 = Static457.anIntArray607;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class12_Sub2_Sub2_Sub1_Sub2 local24 = Static486.aClass12_Sub2_Sub2_Sub1_Sub2Array1[local9[local16]];
			if (local24 != null && local24.anInt2910 > 0) {
				local24.anInt2910--;
				if (local24.anInt2910 == 0) {
					local24.aString33 = null;
				}
			}
		}
		for (@Pc(54) int local54 = 0; local54 < Static471.anInt8216; local54++) {
			@Pc(61) long local61 = (long) Static530.anIntArray671[local54];
			@Pc(67) Class14_Sub44 local67 = (Class14_Sub44) Static579.aClass187_73.method4078(local61);
			if (local67 != null) {
				@Pc(72) Class12_Sub2_Sub2_Sub1_Sub1 local72 = local67.aClass12_Sub2_Sub2_Sub1_Sub1_2;
				if (local72.anInt2910 > 0) {
					local72.anInt2910--;
					if (local72.anInt2910 == 0) {
						local72.aString33 = null;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(BII)Z")
	public static boolean method5083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x84080) != 0;
	}

	@OriginalMember(owner = "client!lba", name = "a", descriptor = "(III)V")
	public static void method5088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class58 local7 = Static486.aClass58ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static432.method6337(local7.aClass12_Sub2_Sub1_1);
		Static432.method6337(local7.aClass12_Sub2_Sub1_2);
		if (local7.aClass12_Sub2_Sub1_1 != null) {
			local7.aClass12_Sub2_Sub1_1 = null;
		}
		if (local7.aClass12_Sub2_Sub1_2 != null) {
			local7.aClass12_Sub2_Sub1_2 = null;
		}
	}
}
