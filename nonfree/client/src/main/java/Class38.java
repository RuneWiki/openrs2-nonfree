import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hda")
public abstract class Class38 implements Interface7 {

	@OriginalMember(owner = "client!hda", name = "t", descriptor = "Lclient!ria;")
	private Class298 aClass298_11 = Static292.aClass298_5;

	@OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
	private final int anInt9961;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "Lclient!bga;")
	protected final Class20_Sub2_Sub2 aClass20_Sub2_Sub2_12;

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "Lclient!wq;")
	protected final Class375 aClass375_46;

	@OriginalMember(owner = "client!hda", name = "g", descriptor = "Lclient!baa;")
	protected final Class26 aClass26_20;

	@OriginalMember(owner = "client!hda", name = "r", descriptor = "Z")
	private final boolean aBoolean691;

	@OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
	protected final int anInt9963;

	@OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
	private int anInt9966;

	@OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lclient!bga;ILclient!wq;Lclient!baa;IZ)V")
	protected Class38(@OriginalArg(0) Class20_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class375 arg2, @OriginalArg(3) Class26 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9961 = arg4;
		this.aClass20_Sub2_Sub2_12 = arg0;
		this.aClass375_46 = arg2;
		this.aClass26_20 = arg3;
		this.aBoolean691 = arg5;
		this.anInt9963 = arg1;
		OpenGL.glGenTextures(1, Static393.anIntArray482, 0);
		this.anInt9966 = Static393.anIntArray482[0];
		this.method8289();
		this.method8296();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
	@Override
	public final void method8286() {
		@Pc(8) int local8 = this.aClass20_Sub2_Sub2_12.method1511();
		@Pc(20) int local20 = this.aClass20_Sub2_Sub2_12.anIntArray61[local8];
		if (local20 != this.anInt9963) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt9963);
			this.aClass20_Sub2_Sub2_12.anIntArray61[local8] = this.anInt9963;
		}
		OpenGL.glBindTexture(this.anInt9963, this.anInt9966);
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)I")
	protected final int method8288() {
		if (Static29.aClass26_4 == this.aClass26_20) {
			if (this.aClass375_46 == Static55.aClass375_38) {
				return 6407;
			}
			if (this.aClass375_46 == Static354.aClass375_31) {
				return 6408;
			}
			if (this.aClass375_46 == Static155.aClass375_18) {
				return 6406;
			}
			if (Static520.aClass375_44 == this.aClass375_46) {
				return 6409;
			}
			if (this.aClass375_46 == Static463.aClass375_39) {
				return 6410;
			}
			if (this.aClass375_46 == Static77.aClass375_49) {
				return 6145;
			}
		} else if (Static29.aClass26_7 == this.aClass26_20) {
			if (this.aClass375_46 == Static55.aClass375_38) {
				return 34843;
			}
			if (Static354.aClass375_31 == this.aClass375_46) {
				return 34842;
			}
			if (this.aClass375_46 == Static155.aClass375_18) {
				return 34844;
			}
			if (this.aClass375_46 == Static520.aClass375_44) {
				return 34846;
			}
			if (Static463.aClass375_39 == this.aClass375_46) {
				return 34847;
			}
			if (this.aClass375_46 == Static77.aClass375_49) {
				return 6145;
			}
		} else if (this.aClass26_20 == Static29.aClass26_8) {
			if (Static55.aClass375_38 == this.aClass375_46) {
				return 34837;
			}
			if (this.aClass375_46 == Static354.aClass375_31) {
				return 34836;
			}
			if (this.aClass375_46 == Static155.aClass375_18) {
				return 34838;
			}
			if (Static520.aClass375_44 == this.aClass375_46) {
				return 34840;
			}
			if (Static463.aClass375_39 == this.aClass375_46) {
				return 34841;
			}
			if (Static77.aClass375_49 == this.aClass375_46) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(Z)V")
	private void method8289() {
		this.aClass20_Sub2_Sub2_12.method1484(this);
		if (this.aClass298_11 == Static292.aClass298_5) {
			OpenGL.glTexParameteri(this.anInt9963, 10241, this.aBoolean691 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9963, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9963, 10241, this.aBoolean691 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9963, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II[BII)V")
	protected final void method8290(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static468.method7401(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static468.method7401(arg2)) {
			@Pc(36) int local36 = this.aClass375_46.anInt11029;
			@Pc(38) int local38 = 0;
			@Pc(45) int local45 = arg0 < arg2 ? arg0 : arg2;
			@Pc(49) int local49 = arg0 >> 1;
			@Pc(60) int local60 = arg2 >> 1;
			@Pc(62) byte[] local62 = arg1;
			@Pc(69) byte[] local69 = new byte[local60 * local49 * local36];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local38, this.method8288(), arg0, arg2, 0, Static209.method4123(this.aClass375_46), 5121, local62, 0);
				if (local45 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg0 * local36;
				for (@Pc(96) int local96 = 0; local96 < local36; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(107) int local107 = local96 + local94;
					for (@Pc(109) int local109 = 0; local109 < local60; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local49; local113++) {
							@Pc(119) byte local119 = local62[local102];
							local102 += local36;
							@Pc(129) int local129 = local119 + local62[local102];
							@Pc(135) int local135 = local129 + local62[local107];
							local102 += local36;
							local107 += local36;
							@Pc(149) int local149 = local135 + local62[local107];
							local69[local100] = (byte) (local149 >> 2);
							local107 += local36;
							local100 += local36;
						}
						local102 += local94;
						local107 += local94;
					}
				}
				@Pc(190) byte[] local190 = local69;
				local69 = local62;
				arg0 = local49;
				arg2 = local60;
				local62 = local190;
				local49 >>= 0x1;
				local60 >>= 0x1;
				local38++;
				local45 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)I")
	private int method8291() {
		@Pc(14) int local14 = this.anInt9961 * this.aClass26_20.anInt622 * this.aClass375_46.anInt11029;
		return this.aBoolean691 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II[III)V")
	protected final void method8293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static468.method7401(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static468.method7401(arg1)) {
			throw new IllegalArgumentException("");
		} else if (Static354.aClass375_31 == this.aClass375_46) {
			@Pc(46) int local46 = 0;
			@Pc(57) int local57 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(65) int local65 = arg1 >> 1;
			@Pc(67) int[] local67 = arg2;
			@Pc(72) int[] local72 = new int[local65 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local46, this.method8288(), arg0, arg1, 0, 32993, this.aClass20_Sub2_Sub2_12.anInt1667, local67, 0);
				if (local57 <= 1) {
					return;
				}
				@Pc(99) int local99 = 0;
				@Pc(101) int local101 = 0;
				@Pc(105) int local105 = arg0;
				for (@Pc(107) int local107 = 0; local107 < local65; local107++) {
					for (@Pc(111) int local111 = 0; local111 < local61; local111++) {
						@Pc(118) int local118 = local67[local101++];
						@Pc(123) int local123 = local67[local101++];
						@Pc(128) int local128 = local67[local105++];
						@Pc(134) int local134 = local118 >> 16 & 0xFF;
						@Pc(140) int local140 = local118 >> 24 & 0xFF;
						@Pc(144) int local144 = local118 & 0xFF;
						@Pc(150) int local150 = local118 >> 8 & 0xFF;
						@Pc(155) int local155 = local67[local105++];
						@Pc(161) int local161 = local144 + (local123 & 0xFF);
						@Pc(169) int local169 = local134 + (local123 >> 16 & 0xFF);
						@Pc(177) int local177 = local140 + (local123 >> 24 & 0xFF);
						@Pc(185) int local185 = local150 + (local123 >> 8 & 0xFF);
						@Pc(193) int local193 = local177 + (local128 >> 24 & 0xFF);
						@Pc(199) int local199 = local161 + (local128 & 0xFF);
						@Pc(207) int local207 = local185 + (local128 >> 8 & 0xFF);
						@Pc(215) int local215 = local169 + (local128 >> 16 & 0xFF);
						@Pc(223) int local223 = local193 + (local155 >> 24 & 0xFF);
						@Pc(231) int local231 = local215 + (local155 >> 16 & 0xFF);
						@Pc(239) int local239 = local207 + (local155 >> 8 & 0xFF);
						@Pc(245) int local245 = local199 + (local155 & 0xFF);
						local72[local99++] = (local239 & 0x3FC) << 6 | (local223 & 0x3FC) << 22 | (local231 & 0x3FC) << 14 | local245 >> 2 & 0xFF;
					}
					local101 += arg0;
					local105 += arg0;
				}
				@Pc(294) int[] local294 = local72;
				local72 = local67;
				arg1 = local65;
				local67 = local294;
				arg0 = local61;
				local61 >>= 0x1;
				local46++;
				local57 >>= 0x1;
				local65 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)V")
	private void method8294() {
		if (this.anInt9966 > 0) {
			this.aClass20_Sub2_Sub2_12.method1587(this.method8291(), this.anInt9966);
			this.anInt9966 = 0;
		}
	}

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "(IB)V")
	private void method8296() {
		this.aClass20_Sub2_Sub2_12.anInt1523 += this.method8291();
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ria;I)V")
	@Override
	public final void method8287(@OriginalArg(0) Class298 arg0) {
		if (arg0 != this.aClass298_11) {
			this.aClass298_11 = arg0;
			this.method8289();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[FI)V")
	protected final void method8298(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static468.method7401(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static468.method7401(arg3)) {
			@Pc(36) int local36 = this.aClass375_46.anInt11029;
			@Pc(38) int local38 = 0;
			@Pc(56) int local56 = arg1 < arg3 ? arg1 : arg3;
			@Pc(60) int local60 = arg1 >> 1;
			@Pc(64) int local64 = arg3 >> 1;
			@Pc(66) float[] local66 = arg2;
			@Pc(73) float[] local73 = new float[local60 * local64 * local36];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local38, this.method8288(), arg1, arg3, 0, Static209.method4123(this.aClass375_46), 5126, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(97) int local97 = arg1 * local36;
				for (@Pc(99) int local99 = 0; local99 < local36; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local99 + local97;
					for (@Pc(111) int local111 = 0; local111 < local64; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local60; local115++) {
							@Pc(121) float local121 = local66[local105];
							local105 += local36;
							@Pc(131) float local131 = local121 + local66[local105];
							@Pc(137) float local137 = local131 + local66[local109];
							local105 += local36;
							local109 += local36;
							@Pc(151) float local151 = local137 + local66[local109];
							local109 += local36;
							local73[local103] = local151 * 0.25F;
							local103 += local36;
						}
						local109 += local97;
						local105 += local97;
					}
				}
				@Pc(187) float[] local187 = local73;
				local73 = local66;
				arg1 = local60;
				arg3 = local64;
				local66 = local187;
				local60 >>= 0x1;
				local64 >>= 0x1;
				local56 >>= 0x1;
				local38++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!hda", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8294();
		super.finalize();
	}
}
