import jaggl.OpenGL;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "Lclient!vfa;")
	public static Class347 aClass347_8;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_231 = new Class363(98, 8);

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "[I")
	public static final int[] anIntArray577 = new int[8];

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Z")
	public static boolean aBoolean641 = false;

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIII[II)V")
	public static void method6724(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(7) int arg5) {
		if (arg2 > 0 && !Static19.method380(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static19.method380(arg3)) {
			@Pc(49) int local49 = 0;
			@Pc(60) int local60 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(68) int local68 = arg3 >> 1;
			@Pc(70) int[] local70 = arg4;
			@Pc(75) int[] local75 = new int[local68 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local49, arg1, arg2, arg3, 0, 32993, arg5, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(99) int local99 = arg2;
				@Pc(101) int[] local101 = local75;
				for (@Pc(103) int local103 = 0; local103 < local68; local103++) {
					for (@Pc(107) int local107 = 0; local107 < local64; local107++) {
						@Pc(114) int local114 = local70[local95++];
						@Pc(119) int local119 = local70[local99++];
						@Pc(124) int local124 = local70[local95++];
						@Pc(130) int local130 = local114 >> 8 & 0xFF;
						@Pc(136) int local136 = local114 >> 24 & 0xFF;
						@Pc(141) int local141 = local70[local99++];
						@Pc(147) int local147 = local114 >> 16 & 0xFF;
						@Pc(151) int local151 = local114 & 0xFF;
						@Pc(159) int local159 = local136 + (local124 >> 24 & 0xFF);
						@Pc(167) int local167 = local147 + (local124 >> 16 & 0xFF);
						@Pc(175) int local175 = local130 + (local124 >> 8 & 0xFF);
						@Pc(181) int local181 = local151 + (local124 & 0xFF);
						@Pc(189) int local189 = local167 + (local119 >> 16 & 0xFF);
						@Pc(197) int local197 = local159 + (local119 >> 24 & 0xFF);
						@Pc(205) int local205 = local175 + (local119 >> 8 & 0xFF);
						@Pc(211) int local211 = local181 + (local119 & 0xFF);
						@Pc(219) int local219 = local197 + (local141 >> 24 & 0xFF);
						@Pc(227) int local227 = local189 + (local141 >> 16 & 0xFF);
						@Pc(233) int local233 = local211 + (local141 & 0xFF);
						@Pc(241) int local241 = local205 + (local141 >> 8 & 0xFF);
						local75[local93++] = local233 >> 2 & 0xFF | (local241 & 0x3FC) << 6 | (local219 & 0x3FC) << 22 | (local227 & 0x3FC) << 14;
					}
					local99 += arg2;
					local95 += arg2;
				}
				local75 = local70;
				arg3 = local68;
				local70 = local101;
				arg2 = local64;
				local64 >>= 0x1;
				local68 >>= 0x1;
				local49++;
				local60 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILjava/io/File;[B)V")
	public static void method6725(@OriginalArg(0) int arg0, @OriginalArg(2) File arg1, @OriginalArg(3) byte[] arg2) throws IOException {
		@Pc(14) DataInputStream local14 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg1)));
		try {
			local14.readFully(arg2, 0, arg0);
		} catch (@Pc(26) EOFException local26) {
		}
		local14.close();
	}
}
