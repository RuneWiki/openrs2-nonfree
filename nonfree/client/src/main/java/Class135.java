import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public abstract class Class135 implements Interface14 {

	@OriginalMember(owner = "client!il", name = "m", descriptor = "Lclient!pw;")
	private Class234 aClass234_11 = Static66.aClass234_3;

	@OriginalMember(owner = "client!il", name = "i", descriptor = "Lclient!ui;")
	protected final Class289 aClass289_20;

	@OriginalMember(owner = "client!il", name = "l", descriptor = "Lclient!ag;")
	protected final Class9_Sub1_Sub1 aClass9_Sub1_Sub1_10;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Z")
	private final boolean aBoolean655;

	@OriginalMember(owner = "client!il", name = "t", descriptor = "I")
	private final int anInt9451;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Lclient!aq;")
	protected final Class16 aClass16_22;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "I")
	protected final int anInt9452;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "I")
	private int anInt9447;

	static {
		new Class114("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
	}

	@OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lclient!ag;ILclient!aq;Lclient!ui;IZ)V")
	protected Class135(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) Class289 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass289_20 = arg3;
		this.aClass9_Sub1_Sub1_10 = arg0;
		this.aBoolean655 = arg5;
		this.anInt9451 = arg4;
		this.aClass16_22 = arg2;
		this.anInt9452 = arg1;
		OpenGL.glGenTextures(1, Static41.anIntArray129, 0);
		this.anInt9447 = Static41.anIntArray129[0];
		this.method7966();
		this.method7959();
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
	@Override
	public final void method7954() {
		@Pc(8) int local8 = this.aClass9_Sub1_Sub1_10.method7691();
		@Pc(14) int local14 = this.aClass9_Sub1_Sub1_10.anIntArray25[local8];
		if (this.anInt9452 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt9452);
			this.aClass9_Sub1_Sub1_10.anIntArray25[local8] = this.anInt9452;
		}
		OpenGL.glBindTexture(this.anInt9452, this.anInt9447);
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB[FII)V")
	protected final void method7957(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static183.method3500(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static183.method3500(arg0)) {
			@Pc(34) int local34 = this.aClass16_22.anInt871;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg2 >= arg0 ? arg0 : arg2;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(57) float[] local57 = arg1;
			@Pc(70) float[] local70 = new float[local34 * local55 * local51];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local36, this.method7963(), arg2, arg0, 0, Static456.method6571(this.aClass16_22), 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg2 * local34;
				@Pc(97) float[] local97 = local70;
				for (@Pc(99) int local99 = 0; local99 < local34; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local95 + local99;
					for (@Pc(111) int local111 = 0; local111 < local55; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local51; local115++) {
							@Pc(121) float local121 = local57[local105];
							local105 += local34;
							@Pc(131) float local131 = local121 + local57[local105];
							local105 += local34;
							@Pc(141) float local141 = local131 + local57[local109];
							local109 += local34;
							@Pc(151) float local151 = local141 + local57[local109];
							local70[local103] = local151 * 0.25F;
							local109 += local34;
							local103 += local34;
						}
						local105 += local95;
						local109 += local95;
					}
				}
				local70 = local57;
				arg2 = local51;
				local57 = local97;
				arg0 = local55;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local36++;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!il", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7958();
		super.finalize();
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	private void method7958() {
		if (this.anInt9447 > 0) {
			this.aClass9_Sub1_Sub1_10.method679(this.method7962(), this.anInt9447);
			this.anInt9447 = 0;
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IB)V")
	private void method7959() {
		this.aClass9_Sub1_Sub1_10.anInt9179 += this.method7962();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I[BIBI)V")
	protected final void method7960(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static183.method3500(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static183.method3500(arg3)) {
			@Pc(40) int local40 = this.aClass16_22.anInt871;
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg0 < arg3 ? arg0 : arg3;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(61) int local61 = arg3 >> 1;
			@Pc(63) byte[] local63 = arg1;
			@Pc(70) byte[] local70 = new byte[local61 * local57 * local40];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local42, this.method7963(), arg0, arg3, 0, Static456.method6571(this.aClass16_22), 5121, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(95) int local95 = local40 * arg0;
				@Pc(97) byte[] local97 = local70;
				for (@Pc(99) int local99 = 0; local99 < local40; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local95 + local99;
					for (@Pc(111) int local111 = 0; local111 < local61; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local57; local115++) {
							@Pc(121) byte local121 = local63[local105];
							local105 += local40;
							@Pc(131) int local131 = local121 + local63[local105];
							@Pc(137) int local137 = local131 + local63[local109];
							local105 += local40;
							local109 += local40;
							@Pc(151) int local151 = local137 + local63[local109];
							local70[local103] = (byte) (local151 >> 2);
							local109 += local40;
							local103 += local40;
						}
						local105 += local95;
						local109 += local95;
					}
				}
				local70 = local63;
				arg0 = local57;
				local63 = local97;
				arg3 = local61;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local42++;
				local61 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)I")
	private int method7962() {
		@Pc(20) int local20 = this.aClass289_20.anInt8371 * this.aClass16_22.anInt871 * this.anInt9451;
		return this.aBoolean655 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(B)I")
	protected final int method7963() {
		if (Static489.aClass289_13 == this.aClass289_20) {
			if (this.aClass16_22 == Static470.aClass16_16) {
				return 6407;
			}
			if (this.aClass16_22 == Static72.aClass16_3) {
				return 6408;
			}
			if (Static97.aClass16_17 == this.aClass16_22) {
				return 6406;
			}
			if (Static155.aClass16_10 == this.aClass16_22) {
				return 6409;
			}
			if (Static300.aClass16_14 == this.aClass16_22) {
				return 6410;
			}
			if (Static524.aClass16_20 == this.aClass16_22) {
				return 6145;
			}
		} else if (this.aClass289_20 == Static489.aClass289_16) {
			if (this.aClass16_22 == Static470.aClass16_16) {
				return 34843;
			}
			if (this.aClass16_22 == Static72.aClass16_3) {
				return 34842;
			}
			if (this.aClass16_22 == Static97.aClass16_17) {
				return 34844;
			}
			if (Static155.aClass16_10 == this.aClass16_22) {
				return 34846;
			}
			if (this.aClass16_22 == Static300.aClass16_14) {
				return 34847;
			}
			if (Static524.aClass16_20 == this.aClass16_22) {
				return 6145;
			}
		} else if (Static489.aClass289_17 == this.aClass289_20) {
			if (this.aClass16_22 == Static470.aClass16_16) {
				return 34837;
			}
			if (this.aClass16_22 == Static72.aClass16_3) {
				return 34836;
			}
			if (this.aClass16_22 == Static97.aClass16_17) {
				return 34838;
			}
			if (this.aClass16_22 == Static155.aClass16_10) {
				return 34840;
			}
			if (Static300.aClass16_14 == this.aClass16_22) {
				return 34841;
			}
			if (this.aClass16_22 == Static524.aClass16_20) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!pw;I)V")
	@Override
	public final void method7955(@OriginalArg(0) Class234 arg0) {
		if (arg0 != this.aClass234_11) {
			this.aClass234_11 = arg0;
			this.method7966();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(I[IIII)V")
	protected final void method7965(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static183.method3500(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static183.method3500(arg3)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass16_22 == Static72.aClass16_3) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 < arg3 ? arg0 : arg3;
			@Pc(59) int local59 = arg0 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) int[] local65 = arg1;
			@Pc(76) int[] local76 = new int[local63 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local44, this.method7963(), arg0, arg3, 0, 32993, this.aClass9_Sub1_Sub1_10.anInt661, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg0;
				for (@Pc(105) int local105 = 0; local105 < local63; local105++) {
					for (@Pc(109) int local109 = 0; local109 < local59; local109++) {
						@Pc(116) int local116 = local65[local99++];
						@Pc(121) int local121 = local65[local103++];
						@Pc(126) int local126 = local65[local99++];
						@Pc(132) int local132 = local116 >> 8 & 0xFF;
						@Pc(136) int local136 = local116 & 0xFF;
						@Pc(141) int local141 = local65[local103++];
						@Pc(147) int local147 = local116 >> 24 & 0xFF;
						@Pc(153) int local153 = local116 >> 16 & 0xFF;
						@Pc(161) int local161 = local153 + (local126 >> 16 & 0xFF);
						@Pc(169) int local169 = local147 + (local126 >> 24 & 0xFF);
						@Pc(175) int local175 = local136 + (local126 & 0xFF);
						@Pc(183) int local183 = local132 + (local126 >> 8 & 0xFF);
						@Pc(189) int local189 = local175 + (local121 & 0xFF);
						@Pc(197) int local197 = local161 + (local121 >> 16 & 0xFF);
						@Pc(205) int local205 = local183 + (local121 >> 8 & 0xFF);
						@Pc(213) int local213 = local169 + (local121 >> 24 & 0xFF);
						@Pc(221) int local221 = local213 + (local141 >> 24 & 0xFF);
						@Pc(229) int local229 = local197 + (local141 >> 16 & 0xFF);
						@Pc(235) int local235 = local189 + (local141 & 0xFF);
						@Pc(243) int local243 = local205 + (local141 >> 8 & 0xFF);
						local76[local97++] = (local243 & 0x3FC) << 6 | (local229 & 0x3FC) << 14 | (local221 & 0x3FC) << 22 | local235 >> 2 & 0xFF;
					}
					local103 += arg0;
					local99 += arg0;
				}
				@Pc(292) int[] local292 = local76;
				local76 = local65;
				local65 = local292;
				arg3 = local63;
				arg0 = local59;
				local59 >>= 0x1;
				local63 >>= 0x1;
				local55 >>= 0x1;
				local44++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	private void method7966() {
		this.aClass9_Sub1_Sub1_10.method7712(this);
		if (Static66.aClass234_3 == this.aClass234_11) {
			OpenGL.glTexParameteri(this.anInt9452, 10241, this.aBoolean655 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9452, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9452, 10241, this.aBoolean655 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9452, 10240, 9728);
		}
	}
}
