import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static591 {

	@OriginalMember(owner = "client!u", name = "b", descriptor = "Lclient!he;")
	public static Class148 aClass148_2;

	@OriginalMember(owner = "client!u", name = "a", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_194 = new Class156(80, 4);

	@OriginalMember(owner = "client!u", name = "e", descriptor = "[Lclient!bu;")
	public static final Class5_Sub9[] aClass5_Sub9Array1 = new Class5_Sub9[1024];

	@OriginalMember(owner = "client!u", name = "f", descriptor = "[I")
	public static int[] anIntArray534 = new int[32];

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(IILclient!hu;ZLclient!hu;ZZ)I")
	public static int method8145(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class51_Sub1 arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class51_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(10) int local10 = Static645.method8908(arg2, arg0, arg5, arg4);
		if (local10 != 0) {
			return arg5 ? -local10 : local10;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(42) int local42 = Static645.method8908(arg2, arg1, arg3, arg4);
			return arg3 ? -local42 : local42;
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[IIIIIIZ)V")
	public static void method8146(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 > 0 && !Static197.method3300(arg5)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static197.method3300(arg0)) {
			@Pc(46) int local46 = 0;
			@Pc(58) int local58 = arg0 > arg5 ? arg5 : arg0;
			@Pc(62) int local62 = arg5 >> 1;
			@Pc(73) int local73 = arg0 >> 1;
			@Pc(75) int[] local75 = arg1;
			@Pc(80) int[] local80 = new int[local73 * local62];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local46, arg4, arg5, arg0, 0, 32993, arg3, local75, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(100) int local100 = 0;
				@Pc(102) int local102 = 0;
				@Pc(106) int local106 = arg5;
				for (@Pc(108) int local108 = 0; local108 < local73; local108++) {
					for (@Pc(114) int local114 = 0; local114 < local62; local114++) {
						@Pc(123) int local123 = local75[local102++];
						@Pc(128) int local128 = local75[local102++];
						@Pc(133) int local133 = local75[local106++];
						@Pc(137) int local137 = local123 & 0xFF;
						@Pc(143) int local143 = local123 >> 24 & 0xFF;
						@Pc(149) int local149 = local123 >> 8 & 0xFF;
						@Pc(154) int local154 = local75[local106++];
						@Pc(160) int local160 = local123 >> 16 & 0xFF;
						@Pc(168) int local168 = local160 + (local128 >> 16 & 0xFF);
						@Pc(176) int local176 = local149 + (local128 >> 8 & 0xFF);
						@Pc(184) int local184 = local143 + (local128 >> 24 & 0xFF);
						@Pc(190) int local190 = local137 + (local128 & 0xFF);
						@Pc(198) int local198 = local184 + (local133 >> 24 & 0xFF);
						@Pc(206) int local206 = local168 + (local133 >> 16 & 0xFF);
						@Pc(214) int local214 = local176 + (local133 >> 8 & 0xFF);
						@Pc(220) int local220 = local190 + (local133 & 0xFF);
						@Pc(228) int local228 = local198 + (local154 >> 24 & 0xFF);
						@Pc(234) int local234 = local220 + (local154 & 0xFF);
						@Pc(242) int local242 = local214 + (local154 >> 8 & 0xFF);
						@Pc(250) int local250 = local206 + (local154 >> 16 & 0xFF);
						local80[local100++] = local234 >> 2 & 0xFF | (local250 & 0x3FC) << 14 | (local228 & 0x3FC) << 22 | (local242 & 0x3FC) << 6;
					}
					local106 += arg5;
					local102 += arg5;
				}
				@Pc(305) int[] local305 = local80;
				local80 = local75;
				local75 = local305;
				arg0 = local73;
				arg5 = local62;
				local73 >>= 0x1;
				local58 >>= 0x1;
				local46++;
				local62 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V")
	public static void method8147() {
		for (@Pc(12) Class5_Sub20 local12 = (Class5_Sub20) Static435.aClass20_38.method378(); local12 != null; local12 = (Class5_Sub20) Static435.aClass20_38.method366()) {
			if (local12.aBoolean221) {
				local12.method2784();
			}
		}
		@Pc(38) Class5_Sub20 local38 = (Class5_Sub20) Static84.aClass20_5.method378();
		if (5705 != 5705) {
			anIntArray534 = null;
		}
		while (local38 != null) {
			if (local38.aBoolean221) {
				local38.method2784();
			}
			local38 = (Class5_Sub20) Static84.aClass20_5.method366();
		}
	}
}
