import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static574 {

	@OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
	public static int anInt9809;

	@OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
	public static int anInt9810;

	@OriginalMember(owner = "client!uj", name = "e", descriptor = "Lclient!oq;")
	public static final Class248 aClass248_11 = new Class248();

	@OriginalMember(owner = "client!uj", name = "i", descriptor = "Lclient!ea;")
	public static final Class73 aClass73_171 = new Class73(54, 4);

	@OriginalMember(owner = "client!uj", name = "j", descriptor = "[I")
	public static int[] anIntArray522 = new int[2];

	@OriginalMember(owner = "client!uj", name = "k", descriptor = "Lclient!kba;")
	public static final Class163 aClass163_57 = new Class163();

	@OriginalMember(owner = "client!uj", name = "l", descriptor = "[Lclient!ega;")
	public static final Class81[] aClass81Array1 = new Class81[16];

	@OriginalMember(owner = "client!uj", name = "m", descriptor = "Lclient!gm;")
	public static final Class122 aClass122_14 = new Class122("", 11);

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;II)I")
	public static int method8009(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		@Pc(8) int local8 = arg0.length();
		@Pc(11) int local11 = arg1.length();
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(17) char local17 = 0;
		@Pc(19) char local19 = 0;
		while (local8 > local13 - local17 || local11 > local15 - local19) {
			if (local8 <= local13 - local17) {
				return -1;
			}
			if (local15 - local19 >= local11) {
				return 1;
			}
			@Pc(60) char local60;
			if (local17 == '\u0000') {
				local60 = arg0.charAt(local13++);
			} else {
				local60 = local17;
			}
			@Pc(73) char local73;
			if (local19 == '\u0000') {
				local73 = arg1.charAt(local15++);
			} else {
				local73 = local19;
			}
			local17 = Static465.method6955(local60);
			local19 = Static465.method6955(local73);
			local60 = Static601.method8313(local60, arg2);
			local73 = Static601.method8313(local73, arg2);
			if (local60 != local73 && Character.toUpperCase(local60) != Character.toUpperCase(local73)) {
				local60 = Character.toLowerCase(local60);
				local73 = Character.toLowerCase(local73);
				if (local73 != local60) {
					return Static592.method8155(arg2, local60) - Static592.method8155(arg2, local73);
				}
			}
		}
		@Pc(140) int local140 = Math.min(local8, local11);
		for (@Pc(142) int local142 = 0; local142 < local140; local142++) {
			if (arg2 == 2) {
				local15 = local11 - local142 - 1;
				local13 = local8 - local142 - 1;
			} else {
				local15 = local142;
				local13 = local142;
			}
			@Pc(171) char local171 = arg0.charAt(local13);
			@Pc(175) char local175 = arg1.charAt(local15);
			if (local171 != local175 && Character.toUpperCase(local171) != Character.toUpperCase(local175)) {
				local171 = Character.toLowerCase(local171);
				local175 = Character.toLowerCase(local175);
				if (local175 != local171) {
					return Static592.method8155(arg2, local171) - Static592.method8155(arg2, local175);
				}
			}
		}
		@Pc(233) int local233 = local8 - local11;
		if (local233 != 0) {
			return local233;
		}
		for (@Pc(239) int local239 = 0; local239 < local140; local239++) {
			@Pc(245) char local245 = arg0.charAt(local239);
			@Pc(249) char local249 = arg1.charAt(local239);
			if (local249 != local245) {
				return Static592.method8155(arg2, local245) - Static592.method8155(arg2, local249);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIIII[I)V")
	public static void method8010(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int[] arg5) {
		if (arg3 > 0 && !Static152.method3040(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg4 <= 0 || Static152.method3040(arg4)) {
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg3 >= arg4 ? arg4 : arg3;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(63) int local63 = arg4 >> 1;
			@Pc(65) int[] local65 = arg5;
			@Pc(70) int[] local70 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local40, arg0, arg3, arg4, 0, 32993, arg1, local65, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(89) int local89 = 0;
				@Pc(91) int local91 = 0;
				@Pc(95) int local95 = arg3;
				@Pc(97) int[] local97 = local70;
				for (@Pc(99) int local99 = 0; local99 < local63; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local59; local103++) {
						@Pc(110) int local110 = local65[local91++];
						@Pc(115) int local115 = local65[local91++];
						@Pc(120) int local120 = local65[local95++];
						@Pc(125) int local125 = local65[local95++];
						@Pc(131) int local131 = local110 >> 8 & 0xFF;
						@Pc(137) int local137 = local110 >> 24 & 0xFF;
						@Pc(141) int local141 = local110 & 0xFF;
						@Pc(147) int local147 = local110 >> 16 & 0xFF;
						@Pc(155) int local155 = local131 + (local115 >> 8 & 0xFF);
						@Pc(161) int local161 = local141 + (local115 & 0xFF);
						@Pc(169) int local169 = local147 + (local115 >> 16 & 0xFF);
						@Pc(177) int local177 = local137 + (local115 >> 24 & 0xFF);
						@Pc(183) int local183 = local161 + (local120 & 0xFF);
						@Pc(191) int local191 = local169 + (local120 >> 16 & 0xFF);
						@Pc(199) int local199 = local155 + (local120 >> 8 & 0xFF);
						@Pc(207) int local207 = local177 + (local120 >> 24 & 0xFF);
						@Pc(215) int local215 = local191 + (local125 >> 16 & 0xFF);
						@Pc(221) int local221 = local183 + (local125 & 0xFF);
						@Pc(229) int local229 = local207 + (local125 >> 24 & 0xFF);
						@Pc(237) int local237 = local199 + (local125 >> 8 & 0xFF);
						local70[local89++] = (local237 & 0x3FC) << 6 | (local215 & 0x3FC) << 14 | (local229 & 0x3FC) << 22 | local221 >> 2 & 0xFF;
					}
					local91 += arg3;
					local95 += arg3;
				}
				local70 = local65;
				arg4 = local63;
				local65 = local97;
				arg3 = local59;
				local59 >>= 0x1;
				local40++;
				local63 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
