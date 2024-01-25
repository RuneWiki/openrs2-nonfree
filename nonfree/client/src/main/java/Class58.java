import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class58 implements Interface8 {

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "Lclient!ie;")
	private Class136 aClass136_12 = Static114.aClass136_8;

	@OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
	protected final int anInt8923;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!g;")
	protected final Class110 aClass110_23;

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
	private final int anInt8912;

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "Lclient!tm;")
	protected final Class4_Sub2_Sub2 aClass4_Sub2_Sub2_10;

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "Z")
	private final boolean aBoolean672;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!vp;")
	protected final Class308 aClass308_11;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	private int anInt8917;

	static {
		new Class45(null, "bevor du die Option 'Regelverstoß melden' benutzt.", null, null);
	}

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!tm;ILclient!g;Lclient!vp;IZ)V")
	protected Class58(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class110 arg2, @OriginalArg(3) Class308 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt8923 = arg1;
		this.aClass110_23 = arg2;
		this.anInt8912 = arg4;
		this.aClass4_Sub2_Sub2_10 = arg0;
		this.aBoolean672 = arg5;
		this.aClass308_11 = arg3;
		OpenGL.glGenTextures(1, Static35.anIntArray72, 0);
		this.anInt8917 = Static35.anIntArray72[0];
		this.method7767();
		this.method7759();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	private void method7759() {
		this.aClass4_Sub2_Sub2_10.anInt8285 += this.method7761();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[FI)V")
	protected final void method7760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static329.method5606(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static329.method5606(arg1)) {
			@Pc(45) int local45 = this.aClass110_23.anInt2917;
			@Pc(47) int local47 = 0;
			@Pc(54) int local54 = arg1 > arg0 ? arg0 : arg1;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg1 >> 1;
			@Pc(64) float[] local64 = arg2;
			@Pc(71) float[] local71 = new float[local45 * local58 * local62];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local47, this.method7766(), arg0, arg1, 0, Static295.method5137(this.aClass110_23), 5126, local64, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(97) int local97 = arg0 * local45;
				@Pc(99) float[] local99 = local71;
				for (@Pc(101) int local101 = 0; local101 < local45; local101++) {
					@Pc(105) int local105 = local101;
					@Pc(107) int local107 = local101;
					@Pc(111) int local111 = local101 + local97;
					for (@Pc(113) int local113 = 0; local113 < local62; local113++) {
						for (@Pc(117) int local117 = 0; local117 < local58; local117++) {
							@Pc(123) float local123 = local64[local107];
							local107 += local45;
							@Pc(133) float local133 = local123 + local64[local107];
							@Pc(139) float local139 = local133 + local64[local111];
							local107 += local45;
							local111 += local45;
							@Pc(153) float local153 = local139 + local64[local111];
							local111 += local45;
							local71[local105] = local153 * 0.25F;
							local105 += local45;
						}
						local111 += local97;
						local107 += local97;
					}
				}
				local71 = local64;
				local64 = local99;
				arg0 = local58;
				arg1 = local62;
				local47++;
				local62 >>= 0x1;
				local58 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)I")
	private int method7761() {
		@Pc(14) int local14 = this.aClass308_11.anInt9154 * this.aClass110_23.anInt2917 * this.anInt8912;
		return this.aBoolean672 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIB[II)V")
	protected final void method7762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static329.method5606(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static329.method5606(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static171.aClass110_13 == this.aClass110_23) {
			@Pc(48) int local48 = 0;
			@Pc(55) int local55 = arg1 >= arg3 ? arg3 : arg1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(65) int[] local65 = arg2;
			@Pc(70) int[] local70 = new int[local63 * local59];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local48, this.method7766(), arg1, arg3, 0, 32993, this.aClass4_Sub2_Sub2_10.anInt8409, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg1;
				@Pc(99) int[] local99 = local70;
				for (@Pc(101) int local101 = 0; local101 < local63; local101++) {
					for (@Pc(105) int local105 = 0; local105 < local59; local105++) {
						@Pc(112) int local112 = local65[local93++];
						@Pc(117) int local117 = local65[local93++];
						@Pc(122) int local122 = local65[local97++];
						@Pc(128) int local128 = local112 >> 8 & 0xFF;
						@Pc(133) int local133 = local65[local97++];
						@Pc(139) int local139 = local112 >> 24 & 0xFF;
						@Pc(145) int local145 = local112 >> 16 & 0xFF;
						@Pc(149) int local149 = local112 & 0xFF;
						@Pc(157) int local157 = local145 + (local117 >> 16 & 0xFF);
						@Pc(163) int local163 = local149 + (local117 & 0xFF);
						@Pc(171) int local171 = local128 + (local117 >> 8 & 0xFF);
						@Pc(179) int local179 = local139 + (local117 >> 24 & 0xFF);
						@Pc(185) int local185 = local163 + (local122 & 0xFF);
						@Pc(193) int local193 = local157 + (local122 >> 16 & 0xFF);
						@Pc(201) int local201 = local179 + (local122 >> 24 & 0xFF);
						@Pc(209) int local209 = local171 + (local122 >> 8 & 0xFF);
						@Pc(217) int local217 = local209 + (local133 >> 8 & 0xFF);
						@Pc(225) int local225 = local201 + (local133 >> 24 & 0xFF);
						@Pc(233) int local233 = local193 + (local133 >> 16 & 0xFF);
						@Pc(239) int local239 = local185 + (local133 & 0xFF);
						local70[local91++] = (local233 & 0x3FC) << 14 | local225 << 22 & 0xFF000000 | (local217 & 0x3FC) << 6 | local239 >> 2 & 0xFF;
					}
					local97 += arg1;
					local93 += arg1;
				}
				local70 = local65;
				local65 = local99;
				arg3 = local63;
				arg1 = local59;
				local63 >>= 0x1;
				local55 >>= 0x1;
				local59 >>= 0x1;
				local48++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(B)V")
	private void method7764() {
		if (this.anInt8917 > 0) {
			this.aClass4_Sub2_Sub2_10.method7361(this.anInt8917, this.method7761());
			this.anInt8917 = 0;
		}
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7764();
		super.finalize();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[BI)V")
	protected final void method7765(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static329.method5606(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static329.method5606(arg3)) {
			@Pc(33) int local33 = this.aClass110_23.anInt2917;
			@Pc(35) int local35 = 0;
			@Pc(42) int local42 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(46) int local46 = arg0 >> 1;
			@Pc(50) int local50 = arg3 >> 1;
			@Pc(52) byte[] local52 = arg2;
			@Pc(65) byte[] local65 = new byte[local33 * local50 * local46];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local35, this.method7766(), arg0, arg3, 0, Static295.method5137(this.aClass110_23), 5121, local52, 0);
				if (local42 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg0 * local33;
				for (@Pc(93) int local93 = 0; local93 < local33; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(104) int local104 = local93 + local91;
					for (@Pc(106) int local106 = 0; local106 < local50; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local46; local110++) {
							@Pc(116) byte local116 = local52[local99];
							local99 += local33;
							@Pc(126) int local126 = local116 + local52[local99];
							local99 += local33;
							@Pc(136) int local136 = local126 + local52[local104];
							local104 += local33;
							@Pc(146) int local146 = local136 + local52[local104];
							local65[local97] = (byte) (local146 >> 2);
							local104 += local33;
							local97 += local33;
						}
						local104 += local91;
						local99 += local91;
					}
				}
				@Pc(195) byte[] local195 = local65;
				local65 = local52;
				arg0 = local46;
				local52 = local195;
				arg3 = local50;
				local46 >>= 0x1;
				local42 >>= 0x1;
				local35++;
				local50 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(B)I")
	protected final int method7766() {
		if (this.aClass308_11 == Static517.aClass308_15) {
			if (Static56.aClass110_3 == this.aClass110_23) {
				return 6407;
			}
			if (Static171.aClass110_13 == this.aClass110_23) {
				return 6408;
			}
			if (this.aClass110_23 == Static504.aClass110_22) {
				return 6406;
			}
			if (Static281.aClass110_17 == this.aClass110_23) {
				return 6409;
			}
			if (Static533.aClass110_25 == this.aClass110_23) {
				return 6410;
			}
			if (Static264.aClass110_26 == this.aClass110_23) {
				return 6145;
			}
		} else if (this.aClass308_11 == Static517.aClass308_18) {
			if (Static56.aClass110_3 == this.aClass110_23) {
				return 34843;
			}
			if (this.aClass110_23 == Static171.aClass110_13) {
				return 34842;
			}
			if (Static504.aClass110_22 == this.aClass110_23) {
				return 34844;
			}
			if (this.aClass110_23 == Static281.aClass110_17) {
				return 34846;
			}
			if (Static533.aClass110_25 == this.aClass110_23) {
				return 34847;
			}
			if (Static264.aClass110_26 == this.aClass110_23) {
				return 6145;
			}
		} else if (this.aClass308_11 == Static517.aClass308_19) {
			if (Static56.aClass110_3 == this.aClass110_23) {
				return 34837;
			}
			if (Static171.aClass110_13 == this.aClass110_23) {
				return 34836;
			}
			if (this.aClass110_23 == Static504.aClass110_22) {
				return 34838;
			}
			if (this.aClass110_23 == Static281.aClass110_17) {
				return 34840;
			}
			if (Static533.aClass110_25 == this.aClass110_23) {
				return 34841;
			}
			if (Static264.aClass110_26 == this.aClass110_23) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!ie;)V")
	@Override
	public final void method7757(@OriginalArg(1) Class136 arg0) {
		if (this.aClass136_12 != arg0) {
			this.aClass136_12 = arg0;
			this.method7767();
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
	@Override
	public final void method7756() {
		@Pc(14) int local14 = this.aClass4_Sub2_Sub2_10.method7287();
		@Pc(20) int local20 = this.aClass4_Sub2_Sub2_10.anIntArray742[local14];
		if (this.anInt8923 != local20) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt8923);
			this.aClass4_Sub2_Sub2_10.anIntArray742[local14] = this.anInt8923;
		}
		OpenGL.glBindTexture(this.anInt8923, this.anInt8917);
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	private void method7767() {
		this.aClass4_Sub2_Sub2_10.method7316(this);
		if (this.aClass136_12 == Static114.aClass136_8) {
			OpenGL.glTexParameteri(this.anInt8923, 10241, this.aBoolean672 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8923, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8923, 10241, this.aBoolean672 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8923, 10240, 9728);
		}
	}
}
