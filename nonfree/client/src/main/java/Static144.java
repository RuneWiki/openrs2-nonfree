import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hi", name = "g", descriptor = "Lclient!lt;")
	public static Class158 aClass158_30;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public static int anInt2631;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "Lclient!oe;")
	public static final Class186 aClass186_41 = new Class186(70, 8);

	@OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
	public static final int[] anIntArray255 = new int[8];

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(B[Lclient!tq;I)V")
	public static void method2410(@OriginalArg(1) Class239[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg0.length; local7++) {
			@Pc(13) Class239 local13 = arg0[local7];
			if (local13 != null && arg1 == local13.anInt6479 && !Static54.method1028(local13)) {
				if (local13.anInt6447 == 0) {
					method2410(arg0, local13.anInt6423);
					if (local13.aClass239Array1 != null) {
						method2410(local13.aClass239Array1, local13.anInt6423);
					}
					@Pc(47) Class6_Sub16 local47 = (Class6_Sub16) Static20.aClass137_3.method3175((long) local13.anInt6423);
					if (local47 != null) {
						Static59.method1102(local47.anInt2715);
					}
				}
				if (local13.anInt6447 == 6 && local13.anInt6493 != -1) {
					@Pc(69) Class83 local69 = Static244.aClass174_2.method4011(local13.anInt6493);
					if (local69 != null) {
						local13.anInt6498 += Static338.anInt5679;
						while (local69.anIntArray212[local13.anInt6460] < local13.anInt6498) {
							local13.anInt6498 -= local69.anIntArray212[local13.anInt6460];
							local13.anInt6460++;
							if (local13.anInt6460 >= local69.anIntArray211.length) {
								local13.anInt6460 -= local69.anInt1987;
								if (local13.anInt6460 < 0 || local69.anIntArray211.length <= local13.anInt6460) {
									local13.anInt6460 = 0;
								}
							}
							local13.anInt6469 = local13.anInt6460 + 1;
							if (local13.anInt6469 >= local69.anIntArray211.length) {
								local13.anInt6469 -= local69.anInt1987;
								if (local13.anInt6469 < 0 || local13.anInt6469 >= local69.anIntArray211.length) {
									local13.anInt6469 = -1;
								}
							}
							Static354.method4992(local13);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)I")
	public static int method2411() {
		@Pc(7) Class28 local7 = Static44.aClass28_14;
		@Pc(9) boolean local9 = false;
		if (Static155.anInt2774 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static333.method3577(0, 0, null, null, local18);
			local9 = true;
		}
		@Pc(35) long local35 = Static154.method2527();
		for (@Pc(42) int local42 = 0; local42 < 10000; local42++) {
			local7.method3510();
		}
		@Pc(67) int local67 = (int) (Static154.method2527() - local35);
		local7.method3531(0, -16777216, 0, 100, 100);
		if (local9) {
			local7.method3562();
		}
		return local67;
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(BII)V")
	public static void method2413(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub1_Sub12 local8 = Static449.method5975(0, 15);
		local8.method3043();
		local8.anInt3397 = arg1;
		local8.anInt3403 = arg0;
	}
}
