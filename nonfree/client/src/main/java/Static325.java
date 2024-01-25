import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!qf", name = "V", descriptor = "I")
	public static int anInt5363;

	@OriginalMember(owner = "client!qf", name = "Q", descriptor = "Lclient!ng;")
	public static final Class167 aClass167_75 = new Class167(50);

	@OriginalMember(owner = "client!qf", name = "U", descriptor = "Lclient!go;")
	public static final Class97 aClass97_12 = new Class97(10, 2, 2, 0);

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IBIIIIIIII)V")
	public static void method4178(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg6 == arg0 && arg4 == arg5 && arg3 == arg7 && arg8 == arg1) {
			Static311.method4037(arg5, arg7, arg2, arg0, arg1);
			return;
		}
		@Pc(39) int local39 = arg0;
		@Pc(41) int local41 = arg5;
		@Pc(45) int local45 = arg0 * 3;
		@Pc(49) int local49 = arg5 * 3;
		@Pc(53) int local53 = arg6 * 3;
		@Pc(57) int local57 = arg4 * 3;
		@Pc(61) int local61 = arg3 * 3;
		@Pc(65) int local65 = arg8 * 3;
		@Pc(75) int local75 = local53 + arg7 - arg0 - local61;
		@Pc(85) int local85 = local57 + arg1 - arg5 - local65;
		@Pc(94) int local94 = local45 + local61 - local53 - local53;
		@Pc(103) int local103 = local65 + local49 - local57 - local57;
		@Pc(108) int local108 = local53 - local45;
		@Pc(113) int local113 = local57 - local49;
		for (@Pc(115) int local115 = 128; local115 <= 4096; local115 += 128) {
			@Pc(123) int local123 = local115 * local115 >> 12;
			@Pc(129) int local129 = local123 * local115 >> 12;
			@Pc(133) int local133 = local75 * local129;
			@Pc(137) int local137 = local85 * local129;
			@Pc(141) int local141 = local94 * local123;
			@Pc(145) int local145 = local123 * local103;
			@Pc(149) int local149 = local108 * local115;
			@Pc(153) int local153 = local115 * local113;
			@Pc(163) int local163 = arg0 + (local149 + local141 + local133 >> 12);
			@Pc(174) int local174 = (local137 + local145 + local153 >> 12) + arg5;
			Static311.method4037(local41, local163, arg2, local39, local174);
			local41 = local174;
			local39 = local163;
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vg;ZZ)V")
	public static void method4180(@OriginalArg(0) Class250 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(12) int local12 = arg0.anInt7037 == 0 ? arg0.anInt7041 : arg0.anInt7037;
		@Pc(35) int local35 = arg0.anInt6998 == 0 ? arg0.anInt6997 : arg0.anInt6998;
		Static22.method396(local35, arg0.anInt6994, local12, Static369.aClass250ArrayArray5[arg0.anInt6994 >> 16], arg1);
		if (arg0.aClass250Array2 != null) {
			Static22.method396(local35, arg0.anInt6994, local12, arg0.aClass250Array2, arg1);
		}
		@Pc(68) Class1_Sub26 local68 = (Class1_Sub26) Static304.aClass257_21.method5503((long) arg0.anInt6994);
		if (local68 != null) {
			Static201.method2762(arg1, local12, local68.anInt3847, local35);
		}
	}
}
