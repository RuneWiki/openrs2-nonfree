import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static559 {

	@OriginalMember(owner = "client!ua", name = "Ob", descriptor = "[I")
	public static int[] anIntArray650;

	@OriginalMember(owner = "client!ua", name = "Qb", descriptor = "I")
	public static int anInt10083;

	@OriginalMember(owner = "client!ua", name = "Zb", descriptor = "[S")
	public static final short[] aShortArray141 = new short[] { 11, 17, 45, 23, 48, 8, 57, 58 };

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(IZ)I")
	public static int method8395(@OriginalArg(1) boolean arg0) {
		if (Static2.anIntArray229 == null) {
			return 0;
		} else if (arg0 || Static478.aClass95Array1 == null) {
			@Pc(20) int local20 = 0;
			for (@Pc(29) int local29 = 0; local29 < Static2.anIntArray229.length; local29++) {
				@Pc(35) int local35 = Static2.anIntArray229[local29];
				if (Static238.aClass157_118.method4575(local35)) {
					local20++;
				}
				if (Static502.aClass157_259.method4575(local35)) {
					local20++;
				}
			}
			return local20;
		} else {
			return Static2.anIntArray229.length * 2;
		}
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(III)V")
	public static void method8401(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub6_Sub6 local8 = Static139.method3119(arg0, 12);
		local8.method3088();
		local8.anInt3368 = arg1;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIZIFZ)[[I")
	public static int[][] method8403(@OriginalArg(7) float arg0) {
		@Pc(9) int[][] local9 = new int[256][64];
		@Pc(13) Class2_Sub3_Sub17 local13 = new Class2_Sub3_Sub17();
		local13.anInt5772 = (int) (arg0 * 4096.0F);
		local13.anInt5773 = 3;
		local13.anInt5780 = 4;
		local13.anInt5782 = 4;
		local13.aBoolean440 = false;
		local13.method9152();
		Static30.method730(256, 64);
		for (@Pc(45) int local45 = 0; local45 < 256; local45++) {
			local13.method4992(local45, local9[local45]);
		}
		return local9;
	}
}
