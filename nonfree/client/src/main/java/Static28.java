import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "I")
	public static int anInt700;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "I")
	public static int anInt703;

	@OriginalMember(owner = "client!aw", name = "g", descriptor = "I")
	public static int anInt704;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "I")
	public static int anInt705;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_12 = new Class100(78, -1);

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "Z")
	public static boolean aBoolean59 = false;

	@OriginalMember(owner = "client!aw", name = "h", descriptor = "Lclient!bu;")
	public static final Class44 aClass44_13 = new Class44(125, 8);

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I[Lclient!mea;I)V")
	public static void method622(@OriginalArg(1) Class230[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(10) int local10 = 0; local10 < arg0.length; local10++) {
			@Pc(16) Class230 local16 = arg0[local10];
			if (local16 != null && arg1 == local16.anInt6668 && !Static78.method1473(local16)) {
				if (local16.anInt6660 == 0) {
					method622(arg0, local16.anInt6663);
					if (local16.aClass230Array2 != null) {
						method622(local16.aClass230Array2, local16.anInt6663);
					}
					@Pc(50) Class14_Sub32 local50 = (Class14_Sub32) Static547.aClass187_69.method4078((long) local16.anInt6663);
					if (local50 != null) {
						Static568.method8170(local50.anInt6351);
					}
				}
				if (local16.anInt6660 == 6 && local16.anInt6637 != -1) {
					@Pc(71) Class275 local71 = Static501.aClass191_2.method4322(local16.anInt6637);
					if (local71 != null) {
						local16.anInt6723 += Static475.anInt8259;
						@Pc(82) int local82 = local16.anInt6728;
						while (local16.anInt6723 > local71.anIntArray599[local16.anInt6728]) {
							local16.anInt6723 -= local71.anIntArray599[local16.anInt6728];
							local16.anInt6728++;
							if (local71.anIntArray598.length <= local16.anInt6728) {
								local16.anInt6728 -= local71.anInt7916;
								if (local16.anInt6728 < 0 || local16.anInt6728 >= local71.anIntArray598.length) {
									local16.anInt6728 = 0;
								}
							}
							local16.anInt6666 = local16.anInt6728 + 1;
							if (local16.anInt6666 >= local71.anIntArray598.length) {
								local16.anInt6666 -= local71.anInt7916;
								if (local16.anInt6666 < 0 || local16.anInt6666 >= local71.anIntArray598.length) {
									local16.anInt6666 = -1;
								}
							}
							Static634.method8860(local16);
						}
						if (local82 != local16.anInt6728) {
							Static493.method7314(local71, local16.anInt6728);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)V")
	public static void method623() {
		@Pc(16) Class14_Sub19 local16 = Static286.method4081(Static205.aClass394_1, Static638.aClass100_137);
		local16.aClass14_Sub29_Sub1_1.method5859(Static37.anInt981);
		Static576.method8234(local16);
	}
}
