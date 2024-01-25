import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fia")
public abstract class Class111 implements Interface10 {

	@OriginalMember(owner = "client!fia", name = "v", descriptor = "Lclient!ui;")
	private Class339 aClass339_8 = Static108.aClass339_3;

	@OriginalMember(owner = "client!fia", name = "q", descriptor = "Lclient!kca;")
	protected final Class182 aClass182_10;

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "Z")
	private final boolean aBoolean330;

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "Lclient!mba;")
	protected final Class5_Sub1_Sub2 aClass5_Sub1_Sub2_6;

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
	private final int anInt5048;

	@OriginalMember(owner = "client!fia", name = "u", descriptor = "Lclient!wq;")
	protected final Class376 aClass376_8;

	@OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
	protected final int anInt5057;

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
	private int anInt5045;

	@OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lclient!mba;ILclient!kca;Lclient!wq;IZ)V")
	protected Class111(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class182 arg2, @OriginalArg(3) Class376 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass182_10 = arg2;
		this.aBoolean330 = arg5;
		this.aClass5_Sub1_Sub2_6 = arg0;
		this.anInt5048 = arg4;
		this.aClass376_8 = arg3;
		this.anInt5057 = arg1;
		OpenGL.glGenTextures(1, Static356.anIntArray407, 0);
		this.anInt5045 = Static356.anIntArray407[0];
		this.method4563();
		this.method4557();
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)V")
	private void method4557() {
		this.aClass5_Sub1_Sub2_6.anInt6509 += this.method4558();
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZLclient!ui;)V")
	@Override
	public final void method7472(@OriginalArg(1) Class339 arg0) {
		if (this.aClass339_8 != arg0) {
			this.aClass339_8 = arg0;
			this.method4563();
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V")
	@Override
	public final void method7474() {
		@Pc(8) int local8 = this.aClass5_Sub1_Sub2_6.method5567();
		@Pc(14) int local14 = this.aClass5_Sub1_Sub2_6.anIntArray393[local8];
		if (this.anInt5057 != local14) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt5057);
			this.aClass5_Sub1_Sub2_6.anIntArray393[local8] = this.anInt5057;
		}
		OpenGL.glBindTexture(this.anInt5057, this.anInt5045);
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)I")
	private int method4558() {
		@Pc(14) int local14 = this.aClass182_10.anInt5127 * this.aClass376_8.anInt10167 * this.anInt5048;
		return this.aBoolean330 ? local14 * 4 / 3 : local14;
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(II[BII)V")
	protected final void method4560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static323.method5278(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static323.method5278(arg3)) {
			@Pc(34) int local34 = this.aClass182_10.anInt5127;
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg3 > arg1 ? arg1 : arg3;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(61) int local61 = arg3 >> 1;
			@Pc(63) byte[] local63 = arg2;
			@Pc(70) byte[] local70 = new byte[local34 * local61 * local57];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local42, this.method4561(), arg1, arg3, 0, Static419.method6584(this.aClass182_10), 5121, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(96) int local96 = arg1 * local34;
				for (@Pc(98) int local98 = 0; local98 < local34; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(108) int local108 = local98 + local96;
					for (@Pc(110) int local110 = 0; local110 < local61; local110++) {
						for (@Pc(114) int local114 = 0; local114 < local57; local114++) {
							@Pc(120) byte local120 = local63[local104];
							local104 += local34;
							@Pc(130) int local130 = local120 + local63[local104];
							@Pc(136) int local136 = local130 + local63[local108];
							local104 += local34;
							local108 += local34;
							@Pc(150) int local150 = local136 + local63[local108];
							local70[local102] = (byte) (local150 >> 2);
							local108 += local34;
							local102 += local34;
						}
						local108 += local96;
						local104 += local96;
					}
				}
				@Pc(191) byte[] local191 = local70;
				local70 = local63;
				local63 = local191;
				arg3 = local61;
				arg1 = local57;
				local61 >>= 0x1;
				local53 >>= 0x1;
				local42++;
				local57 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)I")
	protected final int method4561() {
		if (Static637.aClass376_16 == this.aClass376_8) {
			if (this.aClass182_10 == Static160.aClass182_5) {
				return 6407;
			}
			if (Static502.aClass182_14 == this.aClass182_10) {
				return 6408;
			}
			if (this.aClass182_10 == Static355.aClass182_12) {
				return 6406;
			}
			if (Static220.aClass182_7 == this.aClass182_10) {
				return 6409;
			}
			if (this.aClass182_10 == Static118.aClass182_3) {
				return 6410;
			}
			if (this.aClass182_10 == Static369.aClass182_13) {
				return 6145;
			}
		} else if (this.aClass376_8 == Static637.aClass376_19) {
			if (Static160.aClass182_5 == this.aClass182_10) {
				return 34843;
			}
			if (Static502.aClass182_14 == this.aClass182_10) {
				return 34842;
			}
			if (Static355.aClass182_12 == this.aClass182_10) {
				return 34844;
			}
			if (this.aClass182_10 == Static220.aClass182_7) {
				return 34846;
			}
			if (this.aClass182_10 == Static118.aClass182_3) {
				return 34847;
			}
			if (this.aClass182_10 == Static369.aClass182_13) {
				return 6145;
			}
		} else if (this.aClass376_8 == Static637.aClass376_20) {
			if (Static160.aClass182_5 == this.aClass182_10) {
				return 34837;
			}
			if (this.aClass182_10 == Static502.aClass182_14) {
				return 34836;
			}
			if (this.aClass182_10 == Static355.aClass182_12) {
				return 34838;
			}
			if (this.aClass182_10 == Static220.aClass182_7) {
				return 34840;
			}
			if (Static118.aClass182_3 == this.aClass182_10) {
				return 34841;
			}
			if (this.aClass182_10 == Static369.aClass182_13) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fia", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method4564();
		super.finalize();
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIII[I)V")
	protected final void method4562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 > 0 && !Static323.method5278(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static323.method5278(arg2)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass182_10 == Static502.aClass182_14) {
			@Pc(49) int local49 = 0;
			@Pc(56) int local56 = arg0 >= arg2 ? arg2 : arg0;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(64) int local64 = arg2 >> 1;
			@Pc(66) int[] local66 = arg3;
			@Pc(71) int[] local71 = new int[local60 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local49, this.method4561(), arg0, arg2, 0, 32993, this.aClass5_Sub1_Sub2_6.anInt6638, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(91) int local91 = 0;
				@Pc(93) int local93 = 0;
				@Pc(97) int local97 = arg0;
				for (@Pc(99) int local99 = 0; local99 < local64; local99++) {
					for (@Pc(103) int local103 = 0; local103 < local60; local103++) {
						@Pc(110) int local110 = local66[local93++];
						@Pc(115) int local115 = local66[local97++];
						@Pc(120) int local120 = local66[local93++];
						@Pc(126) int local126 = local110 >> 16 & 0xFF;
						@Pc(132) int local132 = local110 >> 24 & 0xFF;
						@Pc(137) int local137 = local66[local97++];
						@Pc(141) int local141 = local110 & 0xFF;
						@Pc(147) int local147 = local110 >> 8 & 0xFF;
						@Pc(155) int local155 = local147 + (local120 >> 8 & 0xFF);
						@Pc(163) int local163 = local132 + (local120 >> 24 & 0xFF);
						@Pc(171) int local171 = local126 + (local120 >> 16 & 0xFF);
						@Pc(177) int local177 = local141 + (local120 & 0xFF);
						@Pc(183) int local183 = local177 + (local115 & 0xFF);
						@Pc(191) int local191 = local163 + (local115 >> 24 & 0xFF);
						@Pc(199) int local199 = local171 + (local115 >> 16 & 0xFF);
						@Pc(207) int local207 = local155 + (local115 >> 8 & 0xFF);
						@Pc(215) int local215 = local199 + (local137 >> 16 & 0xFF);
						@Pc(223) int local223 = local191 + (local137 >> 24 & 0xFF);
						@Pc(229) int local229 = local183 + (local137 & 0xFF);
						@Pc(237) int local237 = local207 + (local137 >> 8 & 0xFF);
						local71[local91++] = (local237 & 0x3FC) << 6 | local223 << 22 & 0xFF000000 | (local215 & 0x3FC) << 14 | local229 >> 2 & 0xFF;
					}
					local93 += arg0;
					local97 += arg0;
				}
				@Pc(290) int[] local290 = local71;
				local71 = local66;
				arg2 = local64;
				arg0 = local60;
				local66 = local290;
				local49++;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)V")
	private void method4563() {
		this.aClass5_Sub1_Sub2_6.method5609(this);
		if (this.aClass339_8 == Static108.aClass339_3) {
			OpenGL.glTexParameteri(this.anInt5057, 10241, this.aBoolean330 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt5057, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt5057, 10241, this.aBoolean330 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt5057, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V")
	private void method4564() {
		if (this.anInt5045 > 0) {
			this.aClass5_Sub1_Sub2_6.method5701(this.method4558(), this.anInt5045);
			this.anInt5045 = 0;
		}
	}

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIII[F)V")
	protected final void method4565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg2 > 0 && !Static323.method5278(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static323.method5278(arg0)) {
			@Pc(31) int local31 = this.aClass182_10.anInt5127;
			@Pc(33) int local33 = 0;
			@Pc(40) int local40 = arg2 < arg0 ? arg2 : arg0;
			@Pc(44) int local44 = arg2 >> 1;
			@Pc(48) int local48 = arg0 >> 1;
			@Pc(50) float[] local50 = arg3;
			@Pc(57) float[] local57 = new float[local48 * local44 * local31];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local33, this.method4561(), arg2, arg0, 0, Static419.method6584(this.aClass182_10), 5126, local50, 0);
				if (local40 <= 1) {
					return;
				}
				@Pc(80) int local80 = local31 * arg2;
				for (@Pc(82) int local82 = 0; local82 < local31; local82++) {
					@Pc(86) int local86 = local82;
					@Pc(88) int local88 = local82;
					@Pc(92) int local92 = local82 + local80;
					for (@Pc(94) int local94 = 0; local94 < local48; local94++) {
						for (@Pc(98) int local98 = 0; local98 < local44; local98++) {
							@Pc(104) float local104 = local50[local88];
							local88 += local31;
							@Pc(114) float local114 = local104 + local50[local88];
							local88 += local31;
							@Pc(124) float local124 = local114 + local50[local92];
							local92 += local31;
							@Pc(134) float local134 = local124 + local50[local92];
							local92 += local31;
							local57[local86] = local134 * 0.25F;
							local86 += local31;
						}
						local92 += local80;
						local88 += local80;
					}
				}
				@Pc(178) float[] local178 = local57;
				local57 = local50;
				local50 = local178;
				arg0 = local48;
				arg2 = local44;
				local40 >>= 0x1;
				local33++;
				local48 >>= 0x1;
				local44 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
