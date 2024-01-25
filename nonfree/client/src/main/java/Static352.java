import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static352 {

	@OriginalMember(owner = "client!m", name = "f", descriptor = "Lclient!rh;")
	public static final Class307 aClass307_8 = new Class307(6, 0, 4, 2);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
	public static void method5231() {
		Static214.aClass265_21.method6570(50);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	public static void method5232() {
		@Pc(9) Class102[] local9 = Class5_Sub6_Sub23.aClass102Array1;
		synchronized (Class5_Sub6_Sub23.aClass102Array1) {
			for (@Pc(13) int local13 = 0; local13 < Class5_Sub6_Sub23.aClass102Array1.length; local13++) {
				Class5_Sub6_Sub23.aClass102Array1[local13] = new Class102();
				Static618.anIntArray567[local13] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(17) int local17 = Static439.method6578(arg5, Static128.anInt2200, Static380.anInt6585);
		@Pc(23) int local23 = Static439.method6578(arg1, Static128.anInt2200, Static380.anInt6585);
		@Pc(29) int local29 = Static439.method6578(arg0, Static361.anInt6317, Static651.anInt10267);
		@Pc(35) int local35 = Static439.method6578(arg4, Static361.anInt6317, Static651.anInt10267);
		@Pc(43) int local43 = Static439.method6578(arg2 + arg5, Static128.anInt2200, Static380.anInt6585);
		@Pc(52) int local52 = Static439.method6578(arg1 - arg2, Static128.anInt2200, Static380.anInt6585);
		for (@Pc(54) int local54 = local17; local54 < local43; local54++) {
			Static343.method5202(local29, Static286.anIntArrayArray42[local54], arg6, local35);
		}
		for (@Pc(74) int local74 = local23; local74 > local52; local74--) {
			Static343.method5202(local29, Static286.anIntArrayArray42[local74], arg6, local35);
		}
		@Pc(96) int local96 = Static439.method6578(arg2 + arg0, Static361.anInt6317, Static651.anInt10267);
		@Pc(107) int local107 = Static439.method6578(arg4 - arg2, Static361.anInt6317, Static651.anInt10267);
		for (@Pc(109) int local109 = local43; local109 <= local52; local109++) {
			@Pc(115) int[] local115 = Static286.anIntArrayArray42[local109];
			Static343.method5202(local29, local115, arg6, local96);
			Static343.method5202(local96, local115, arg3, local107);
			Static343.method5202(local107, local115, arg6, local35);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!da;)V")
	public static void method5235(@OriginalArg(0) Class72 arg0) {
		Static140.aClass72_6 = arg0;
	}
}
