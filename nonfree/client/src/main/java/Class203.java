import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public abstract class Class203 implements Interface25 {

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!qt;")
	private Class294 aClass294_11 = Static516.aClass294_10;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "Lclient!jc;")
	protected final Class65_Sub2_Sub2 aClass65_Sub2_Sub2_10;

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!tn;")
	protected final Class339 aClass339_14;

	@OriginalMember(owner = "client!v", name = "c", descriptor = "I")
	private final int anInt9071;

	@OriginalMember(owner = "client!v", name = "t", descriptor = "Lclient!ds;")
	protected final Class89 aClass89_20;

	@OriginalMember(owner = "client!v", name = "n", descriptor = "Z")
	private final boolean aBoolean775;

	@OriginalMember(owner = "client!v", name = "s", descriptor = "I")
	protected final int anInt9085;

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	private int anInt9072;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lclient!jc;ILclient!tn;Lclient!ds;IZ)V")
	protected Class203(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class339 arg2, @OriginalArg(3) Class89 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass65_Sub2_Sub2_10 = arg0;
		this.aClass339_14 = arg2;
		this.anInt9071 = arg4;
		this.aClass89_20 = arg3;
		this.aBoolean775 = arg5;
		this.anInt9085 = arg1;
		OpenGL.glGenTextures(1, Static67.anIntArray49, 0);
		this.anInt9072 = Static67.anIntArray49[0];
		this.method7712();
		this.method7708();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII[I)V")
	protected final void method7705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg2 > 0 && !Static111.method4954(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static111.method4954(arg0)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass339_14 == Static435.aClass339_15) {
			@Pc(48) int local48 = 0;
			@Pc(59) int local59 = arg0 <= arg2 ? arg0 : arg2;
			@Pc(63) int local63 = arg2 >> 1;
			@Pc(67) int local67 = arg0 >> 1;
			@Pc(69) int[] local69 = arg3;
			@Pc(74) int[] local74 = new int[local63 * local67];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local48, this.method7709(), arg2, arg0, 0, 32993, this.aClass65_Sub2_Sub2_10.anInt5364, local69, 0);
				if (local59 <= 1) {
					return;
				}
				@Pc(97) int local97 = 0;
				@Pc(99) int local99 = 0;
				@Pc(103) int local103 = arg2;
				@Pc(105) int[] local105 = local74;
				for (@Pc(107) int local107 = 0; local107 < local67; local107++) {
					for (@Pc(111) int local111 = 0; local111 < local63; local111++) {
						@Pc(118) int local118 = local69[local99++];
						@Pc(123) int local123 = local69[local103++];
						@Pc(128) int local128 = local69[local99++];
						@Pc(132) int local132 = local118 & 0xFF;
						@Pc(137) int local137 = local69[local103++];
						@Pc(143) int local143 = local118 >> 16 & 0xFF;
						@Pc(149) int local149 = local118 >> 24 & 0xFF;
						@Pc(155) int local155 = local118 >> 8 & 0xFF;
						@Pc(163) int local163 = local149 + (local128 >> 24 & 0xFF);
						@Pc(171) int local171 = local155 + (local128 >> 8 & 0xFF);
						@Pc(177) int local177 = local132 + (local128 & 0xFF);
						@Pc(185) int local185 = local143 + (local128 >> 16 & 0xFF);
						@Pc(193) int local193 = local185 + (local123 >> 16 & 0xFF);
						@Pc(201) int local201 = local171 + (local123 >> 8 & 0xFF);
						@Pc(207) int local207 = local177 + (local123 & 0xFF);
						@Pc(215) int local215 = local163 + (local123 >> 24 & 0xFF);
						@Pc(223) int local223 = local215 + (local137 >> 24 & 0xFF);
						@Pc(231) int local231 = local201 + (local137 >> 8 & 0xFF);
						@Pc(239) int local239 = local193 + (local137 >> 16 & 0xFF);
						@Pc(245) int local245 = local207 + (local137 & 0xFF);
						local74[local97++] = (local223 & 0x3FC) << 22 | (local239 & 0x3FC) << 14 | (local231 & 0x3FC) << 6 | local245 >> 2 & 0xFF;
					}
					local99 += arg2;
					local103 += arg2;
				}
				local74 = local69;
				local69 = local105;
				arg2 = local63;
				arg0 = local67;
				local59 >>= 0x1;
				local63 >>= 0x1;
				local67 >>= 0x1;
				local48++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!qt;)V")
	@Override
	public final void method7704(@OriginalArg(1) Class294 arg0) {
		if (arg0 != this.aClass294_11) {
			this.aClass294_11 = arg0;
			this.method7712();
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
	private void method7706() {
		if (this.anInt9072 > 0) {
			this.aClass65_Sub2_Sub2_10.method4489(this.anInt9072, this.method7707());
			this.anInt9072 = 0;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)I")
	private int method7707() {
		@Pc(24) int local24 = this.anInt9071 * this.aClass339_14.anInt9396 * this.aClass89_20.anInt2489;
		return this.aBoolean775 ? local24 * 4 / 3 : local24;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II)V")
	private void method7708() {
		this.aClass65_Sub2_Sub2_10.anInt5229 += this.method7707();
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)I")
	protected final int method7709() {
		if (this.aClass89_20 == Static120.aClass89_7) {
			if (this.aClass339_14 == Static626.aClass339_16) {
				return 6407;
			}
			if (this.aClass339_14 == Static435.aClass339_15) {
				return 6408;
			}
			if (this.aClass339_14 == Static67.aClass339_4) {
				return 6406;
			}
			if (this.aClass339_14 == Static115.aClass339_5) {
				return 6409;
			}
			if (this.aClass339_14 == Static676.aClass339_17) {
				return 6410;
			}
			if (Static241.aClass339_6 == this.aClass339_14) {
				return 6145;
			}
		} else if (Static120.aClass89_10 == this.aClass89_20) {
			if (this.aClass339_14 == Static626.aClass339_16) {
				return 34843;
			}
			if (this.aClass339_14 == Static435.aClass339_15) {
				return 34842;
			}
			if (Static67.aClass339_4 == this.aClass339_14) {
				return 34844;
			}
			if (this.aClass339_14 == Static115.aClass339_5) {
				return 34846;
			}
			if (this.aClass339_14 == Static676.aClass339_17) {
				return 34847;
			}
			if (Static241.aClass339_6 == this.aClass339_14) {
				return 6145;
			}
		} else if (this.aClass89_20 == Static120.aClass89_11) {
			if (this.aClass339_14 == Static626.aClass339_16) {
				return 34837;
			}
			if (Static435.aClass339_15 == this.aClass339_14) {
				return 34836;
			}
			if (this.aClass339_14 == Static67.aClass339_4) {
				return 34838;
			}
			if (Static115.aClass339_5 == this.aClass339_14) {
				return 34840;
			}
			if (this.aClass339_14 == Static676.aClass339_17) {
				return 34841;
			}
			if (this.aClass339_14 == Static241.aClass339_6) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(II[FII)V")
	protected final void method7710(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static111.method4954(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static111.method4954(arg0)) {
			@Pc(37) int local37 = this.aClass339_14.anInt9396;
			@Pc(39) int local39 = 0;
			@Pc(46) int local46 = arg3 >= arg0 ? arg0 : arg3;
			@Pc(50) int local50 = arg3 >> 1;
			@Pc(54) int local54 = arg0 >> 1;
			@Pc(60) float[] local60 = arg1;
			@Pc(67) float[] local67 = new float[local54 * local50 * local37];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local39, this.method7709(), arg3, arg0, 0, Static111.method4956(this.aClass339_14), 5126, local60, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(93) int local93 = arg3 * local37;
				for (@Pc(95) int local95 = 0; local95 < local37; local95++) {
					@Pc(99) int local99 = local95;
					@Pc(101) int local101 = local95;
					@Pc(106) int local106 = local95 + local93;
					for (@Pc(108) int local108 = 0; local108 < local54; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local50; local112++) {
							@Pc(118) float local118 = local60[local101];
							local101 += local37;
							@Pc(128) float local128 = local118 + local60[local101];
							@Pc(134) float local134 = local128 + local60[local106];
							local101 += local37;
							local106 += local37;
							@Pc(148) float local148 = local134 + local60[local106];
							local67[local99] = local148 * 0.25F;
							local106 += local37;
							local99 += local37;
						}
						local101 += local93;
						local106 += local93;
					}
				}
				@Pc(188) float[] local188 = local67;
				local67 = local60;
				arg3 = local50;
				local60 = local188;
				arg0 = local54;
				local54 >>= 0x1;
				local50 >>= 0x1;
				local39++;
				local46 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
	@Override
	public final void method7703() {
		@Pc(8) int local8 = this.aClass65_Sub2_Sub2_10.method4396();
		@Pc(14) int local14 = this.aClass65_Sub2_Sub2_10.anIntArray293[local8];
		if (this.anInt9085 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt9085);
			this.aClass65_Sub2_Sub2_10.anIntArray293[local8] = this.anInt9085;
		}
		OpenGL.glBindTexture(this.anInt9085, this.anInt9072);
	}

	@OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7706();
		super.finalize();
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "([BIBII)V")
	protected final void method7711(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static111.method4954(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static111.method4954(arg1)) {
			@Pc(34) int local34 = this.aClass339_14.anInt9396;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg1 > arg2 ? arg2 : arg1;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(57) byte[] local57 = arg0;
			@Pc(64) byte[] local64 = new byte[local34 * local55 * local51];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local36, this.method7709(), arg2, arg1, 0, Static111.method4956(this.aClass339_14), 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(94) int local94 = local34 * arg2;
				for (@Pc(96) int local96 = 0; local96 < local34; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local94 + local96;
					for (@Pc(108) int local108 = 0; local108 < local55; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local51; local112++) {
							@Pc(118) byte local118 = local57[local102];
							local102 += local34;
							@Pc(128) int local128 = local118 + local57[local102];
							local102 += local34;
							@Pc(138) int local138 = local128 + local57[local106];
							local106 += local34;
							@Pc(148) int local148 = local138 + local57[local106];
							local64[local100] = (byte) (local148 >> 2);
							local106 += local34;
							local100 += local34;
						}
						local102 += local94;
						local106 += local94;
					}
				}
				@Pc(193) byte[] local193 = local64;
				local64 = local57;
				arg1 = local55;
				arg2 = local51;
				local57 = local193;
				local36++;
				local51 >>= 0x1;
				local55 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)V")
	private void method7712() {
		this.aClass65_Sub2_Sub2_10.method4426(this);
		if (this.aClass294_11 == Static516.aClass294_10) {
			OpenGL.glTexParameteri(this.anInt9085, 10241, this.aBoolean775 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9085, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9085, 10241, this.aBoolean775 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9085, 10240, 9728);
		}
	}
}
