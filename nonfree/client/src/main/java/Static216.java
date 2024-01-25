import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "Lclient!eda;")
	public static final Class90 aClass90_75 = new Class90(50, -1);

	@OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
	public static final int anInt4541 = 1406;

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(III)Lclient!lba;")
	public static Class192 method3513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class182 local7 = Static571.aClass182ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass192_2;
	}

	@OriginalMember(owner = "client!ig", name = "a", descriptor = "(II[Lclient!is;)V")
	public static void method3515(@OriginalArg(0) int arg0, @OriginalArg(2) Class155[] arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class155 local9 = arg1[local3];
			if (local9 != null && local9.anInt4769 == arg0 && !Static70.method1547(local9)) {
				if (local9.anInt4796 == 0) {
					method3515(local9.anInt4793, arg1);
					if (local9.aClass155Array2 != null) {
						method3515(local9.anInt4793, local9.aClass155Array2);
					}
					@Pc(43) Class4_Sub45 local43 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local9.anInt4793);
					if (local43 != null) {
						Static503.method7241(local43.anInt9096);
					}
				}
				if (local9.anInt4796 == 6 && local9.anInt4805 != -1) {
					@Pc(65) Class111 local65 = Static17.aClass254_1.method5936(local9.anInt4805);
					if (local65 != null) {
						local9.anInt4773 += Static92.anInt8628;
						@Pc(76) int local76 = local9.anInt4775;
						while (local65.anIntArray150[local9.anInt4775] < local9.anInt4773) {
							local9.anInt4773 -= local65.anIntArray150[local9.anInt4775];
							local9.anInt4775++;
							if (local9.anInt4775 >= local65.anIntArray153.length) {
								local9.anInt4775 -= local65.anInt3155;
								if (local9.anInt4775 < 0 || local65.anIntArray153.length <= local9.anInt4775) {
									local9.anInt4775 = 0;
								}
							}
							local9.anInt4747 = local9.anInt4775 + 1;
							if (local9.anInt4747 >= local65.anIntArray153.length) {
								local9.anInt4747 -= local65.anInt3155;
								if (local9.anInt4747 < 0 || local65.anIntArray153.length <= local9.anInt4747) {
									local9.anInt4747 = -1;
								}
							}
							Static368.method5060(local9);
						}
						if (local9.anInt4775 != local76) {
							Static435.method6470(local9.anInt4775, local65);
						}
					}
				}
			}
		}
	}
}
