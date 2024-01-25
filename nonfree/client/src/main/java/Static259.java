import jaggl.OpenGL;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static259 {

	@OriginalMember(owner = "client!mv", name = "Wc", descriptor = "Lclient!oi;")
	public static final Class175 aClass175_162 = new Class175("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");

	@OriginalMember(owner = "client!mv", name = "xd", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

	@OriginalMember(owner = "client!mv", name = "Cd", descriptor = "I")
	public static final int anInt4913 = 1403;

	@OriginalMember(owner = "client!mv", name = "Dd", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_175 = new Class184(17, 2);

	@OriginalMember(owner = "client!mv", name = "Fd", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_176 = new Class184(98, 8);

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(JI)V")
	public static void method3923(@OriginalArg(0) long arg0) {
		Static302.aClass3_Sub2_Sub2_2.anInt7620 = 0;
		Static302.aClass3_Sub2_Sub2_2.method6001(Static410.aClass49_7.anInt1611);
		Static302.aClass3_Sub2_Sub2_2.method5990(arg0);
		Static407.anInt7061 = -3;
		Static284.anInt5211 = 1;
		Static418.anInt7207 = 0;
		Static4.anInt817 = 0;
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(II[IIIIII)V")
	public static void method3924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg4 > 0 && !Static39.method920(arg4)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static39.method920(arg1)) {
			@Pc(48) int local48 = 0;
			@Pc(59) int local59 = arg4 >= arg1 ? arg1 : arg4;
			@Pc(63) int local63 = arg4 >> 1;
			@Pc(67) int local67 = arg1 >> 1;
			@Pc(69) int[] local69 = arg2;
			@Pc(74) int[] local74 = new int[local67 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local48, arg5, arg4, arg1, 0, 32993, arg0, local69, 0);
				if (local59 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg4;
				@Pc(99) int[] local99 = local74;
				for (@Pc(101) int local101 = 0; local101 < local67; local101++) {
					for (@Pc(104) int local104 = 0; local104 < local63; local104++) {
						@Pc(110) int local110 = local69[local93++];
						@Pc(115) int local115 = local69[local97++];
						@Pc(120) int local120 = local69[local93++];
						@Pc(126) int local126 = local110 >> 16 & 0xFF;
						@Pc(130) int local130 = local110 & 0xFF;
						@Pc(135) int local135 = local69[local97++];
						@Pc(141) int local141 = local110 >> 8 & 0xFF;
						@Pc(147) int local147 = local110 >> 24 & 0xFF;
						@Pc(155) int local155 = local141 + (local120 >> 8 & 0xFF);
						@Pc(163) int local163 = local147 + (local120 >> 24 & 0xFF);
						@Pc(171) int local171 = local126 + (local120 >> 16 & 0xFF);
						@Pc(177) int local177 = local130 + (local120 & 0xFF);
						@Pc(183) int local183 = local177 + (local115 & 0xFF);
						@Pc(191) int local191 = local155 + (local115 >> 8 & 0xFF);
						@Pc(199) int local199 = local171 + (local115 >> 16 & 0xFF);
						@Pc(207) int local207 = local163 + (local115 >> 24 & 0xFF);
						@Pc(215) int local215 = local191 + (local135 >> 8 & 0xFF);
						@Pc(221) int local221 = local183 + (local135 & 0xFF);
						@Pc(229) int local229 = local207 + (local135 >> 24 & 0xFF);
						@Pc(237) int local237 = local199 + (local135 >> 16 & 0xFF);
						local74[local91++] = (local215 & 0x3FC) << 6 | (local237 & 0x3FC) << 14 | (local229 & 0x3FC) << 22 | local221 >> 2 & 0xFF;
					}
					local97 += arg4;
					local93 += arg4;
				}
				local74 = local69;
				arg1 = local67;
				local69 = local99;
				arg4 = local63;
				local59 >>= 0x1;
				local63 >>= 0x1;
				local48++;
				local67 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mv", name = "a", descriptor = "(Lclient!j;III[Z)Z")
	public static boolean method3926(@OriginalArg(0) Class3_Sub3_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static120.aClass64Array1 != Static401.aClass64Array3) {
			@Pc(11) int local11 = Static205.aClass64Array2[arg1].va(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class64 local18 = Static205.aClass64Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.va(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method5438(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.SA(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
