import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "Lclient!gt;")
	public static Class142 aClass142_1;

	@OriginalMember(owner = "client!ij", name = "p", descriptor = "Lclient!nha;")
	public static final Class251 aClass251_111 = new Class251(40, 0);

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
	public static int anInt4789 = -1;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!gg;B)I")
	public static int method4274(@OriginalArg(0) Class4_Sub3_Sub3_Sub3_Sub2 arg0) {
		@Pc(13) int local13 = arg0.anInt3337;
		@Pc(17) Class141 local17 = arg0.method2865();
		@Pc(22) int local22 = arg0.aClass181_7.method8959();
		if (local22 == -1 || arg0.aBoolean236) {
			local13 = arg0.anInt3310;
		} else if (local22 == local17.anInt3543 || local22 == local17.anInt3560 || local22 == local17.anInt3530 || local17.anInt3559 == local22) {
			local13 = arg0.anInt3325;
		} else if (local17.anInt3562 == local22 || local22 == local17.anInt3563 || local22 == local17.anInt3536 || local17.anInt3528 == local22) {
			local13 = arg0.anInt3336;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!gg;I)V")
	public static void method4275(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub3_Sub3_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(15) int[] local15 = new int[4];
		Static691.method81(local15, 0, local15.length, arg2);
		Static167.method2423(local15, arg1, arg0, false);
	}
}
