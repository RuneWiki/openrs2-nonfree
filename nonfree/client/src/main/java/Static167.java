import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ip", name = "O", descriptor = "Lclient!mg;")
	public static Class160 aClass160_28;

	@OriginalMember(owner = "client!ip", name = "P", descriptor = "Lclient!ne;")
	public static Class2_Sub27 aClass2_Sub27_1;

	@OriginalMember(owner = "client!ip", name = "K", descriptor = "Lclient!di;")
	public static final Class54 aClass54_50 = new Class54(13, 3);

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZC)Z")
	public static boolean method2724(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!ip", name = "c", descriptor = "(III)V")
	public static void method2725(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class22 local14 = Static227.aClass22ArrayArray1[arg0][arg1];
		if (local14 != null) {
			Static40.anInt754 = local14.anInt563;
			Static264.anInt4902 = local14.anInt559;
			Static437.anInt7192 = local14.anInt561;
		}
		Static72.method1344();
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I[IIIIIIB)V")
	public static void method2727(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg5 > 0 && !Static54.method895(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static54.method895(arg2)) {
			@Pc(37) int local37 = 0;
			@Pc(48) int local48 = arg5 < arg2 ? arg5 : arg2;
			@Pc(52) int local52 = arg5 >> 1;
			@Pc(56) int local56 = arg2 >> 1;
			@Pc(58) int[] local58 = arg1;
			@Pc(63) int[] local63 = new int[local52 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local37, arg4, arg5, arg2, 0, 32993, arg0, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(83) int local83 = 0;
				@Pc(85) int local85 = 0;
				@Pc(89) int local89 = arg5;
				for (@Pc(91) int local91 = 0; local91 < local56; local91++) {
					for (@Pc(95) int local95 = 0; local95 < local52; local95++) {
						@Pc(102) int local102 = local58[local85++];
						@Pc(107) int local107 = local58[local89++];
						@Pc(112) int local112 = local58[local85++];
						@Pc(118) int local118 = local102 >> 24 & 0xFF;
						@Pc(124) int local124 = local102 >> 16 & 0xFF;
						@Pc(129) int local129 = local58[local89++];
						@Pc(133) int local133 = local102 & 0xFF;
						@Pc(139) int local139 = local102 >> 8 & 0xFF;
						@Pc(145) int local145 = local133 + (local112 & 0xFF);
						@Pc(153) int local153 = local124 + (local112 >> 16 & 0xFF);
						@Pc(161) int local161 = local139 + (local112 >> 8 & 0xFF);
						@Pc(169) int local169 = local118 + (local112 >> 24 & 0xFF);
						@Pc(177) int local177 = local161 + (local107 >> 8 & 0xFF);
						@Pc(183) int local183 = local145 + (local107 & 0xFF);
						@Pc(191) int local191 = local153 + (local107 >> 16 & 0xFF);
						@Pc(199) int local199 = local169 + (local107 >> 24 & 0xFF);
						@Pc(207) int local207 = local199 + (local129 >> 24 & 0xFF);
						@Pc(215) int local215 = local191 + (local129 >> 16 & 0xFF);
						@Pc(221) int local221 = local183 + (local129 & 0xFF);
						@Pc(229) int local229 = local177 + (local129 >> 8 & 0xFF);
						local63[local83++] = local221 >> 2 & 0xFF | (local229 & 0x3FC) << 6 | (local215 & 0x3FC) << 14 | (local207 & 0x3FC) << 22;
					}
					local89 += arg5;
					local85 += arg5;
				}
				@Pc(278) int[] local278 = local63;
				local63 = local58;
				arg5 = local52;
				local58 = local278;
				arg2 = local56;
				local52 >>= 0x1;
				local48 >>= 0x1;
				local56 >>= 0x1;
				local37++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIIB)Lclient!mh;")
	public static Class155 method2728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg4 * 76724863L ^ (long) arg5 * 986053L ^ (long) arg2 * 475427L ^ (long) arg0 * 67481L ^ (long) arg3 * 97549L ^ (long) arg1 * 32147369L;
		@Pc(39) Class155 local39 = (Class155) Static147.aClass171_53.method3941(local33);
		if (local39 == null) {
			local39 = Static195.aClass49_5.method4461(arg0, arg3, arg2, arg5, arg1, arg4);
			Static147.aClass171_53.method3940(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}
}
