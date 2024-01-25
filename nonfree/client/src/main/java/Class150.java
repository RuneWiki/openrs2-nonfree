import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public abstract class Class150 implements Interface10 {

	@OriginalMember(owner = "client!ml", name = "k", descriptor = "Lclient!tha;")
	private Class324 aClass324_11 = Static468.aClass324_7;

	@OriginalMember(owner = "client!ml", name = "t", descriptor = "Z")
	private final boolean aBoolean758;

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "Lclient!hj;")
	protected final Class82_Sub3_Sub1 aClass82_Sub3_Sub1_11;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!jt;")
	protected final Class182 aClass182_20;

	@OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
	private final int anInt10001;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "Lclient!iv;")
	protected final Class168 aClass168_15;

	@OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
	protected final int anInt10006;

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
	private int anInt9994;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!hj;ILclient!iv;Lclient!jt;IZ)V")
	protected Class150(@OriginalArg(0) Class82_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class168 arg2, @OriginalArg(3) Class182 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean758 = arg5;
		this.aClass82_Sub3_Sub1_11 = arg0;
		this.aClass182_20 = arg3;
		this.anInt10001 = arg4;
		this.aClass168_15 = arg2;
		this.anInt10006 = arg1;
		OpenGL.glGenTextures(1, Static96.anIntArray129, 0);
		this.anInt9994 = Static96.anIntArray129[0];
		this.method8495();
		this.method8490();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([BIIII)V")
	protected final void method8489(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 > 0 && !Static112.method1840(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static112.method1840(arg3)) {
			@Pc(33) int local33 = this.aClass168_15.anInt4957;
			@Pc(35) int local35 = 0;
			@Pc(46) int local46 = arg2 >= arg3 ? arg3 : arg2;
			@Pc(50) int local50 = arg2 >> 1;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(56) byte[] local56 = arg0;
			@Pc(63) byte[] local63 = new byte[local33 * local54 * local50];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local35, this.method8493(), arg2, arg3, 0, Static383.method8680(this.aClass168_15), 5121, local56, 0);
				if (local46 <= 1) {
					return;
				}
				@Pc(88) int local88 = arg2 * local33;
				for (@Pc(90) int local90 = 0; local90 < local33; local90++) {
					@Pc(94) int local94 = local90;
					@Pc(96) int local96 = local90;
					@Pc(101) int local101 = local90 + local88;
					for (@Pc(103) int local103 = 0; local103 < local54; local103++) {
						for (@Pc(107) int local107 = 0; local107 < local50; local107++) {
							@Pc(113) byte local113 = local56[local96];
							local96 += local33;
							@Pc(123) int local123 = local113 + local56[local96];
							local96 += local33;
							@Pc(133) int local133 = local123 + local56[local101];
							local101 += local33;
							@Pc(143) int local143 = local133 + local56[local101];
							local101 += local33;
							local63[local94] = (byte) (local143 >> 2);
							local94 += local33;
						}
						local96 += local88;
						local101 += local88;
					}
				}
				@Pc(184) byte[] local184 = local63;
				local63 = local56;
				arg3 = local54;
				arg2 = local50;
				local56 = local184;
				local50 >>= 0x1;
				local54 >>= 0x1;
				local35++;
				local46 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)V")
	private void method8490() {
		this.aClass82_Sub3_Sub1_11.anInt5818 += this.method8496();
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	@Override
	public final void method8488() {
		@Pc(13) int local13 = this.aClass82_Sub3_Sub1_11.method4999();
		@Pc(19) int local19 = this.aClass82_Sub3_Sub1_11.anIntArray236[local13];
		if (local19 != this.anInt10006) {
			if (local19 != 0) {
				OpenGL.glBindTexture(local19, 0);
				OpenGL.glDisable(local19);
			}
			OpenGL.glEnable(this.anInt10006);
			this.aClass82_Sub3_Sub1_11.anIntArray236[local13] = this.anInt10006;
		}
		OpenGL.glBindTexture(this.anInt10006, this.anInt9994);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	private void method8492() {
		if (this.anInt9994 > 0) {
			this.aClass82_Sub3_Sub1_11.method3752(this.anInt9994, this.method8496());
			this.anInt9994 = 0;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!tha;B)V")
	@Override
	public final void method8487(@OriginalArg(0) Class324 arg0) {
		if (arg0 != this.aClass324_11) {
			this.aClass324_11 = arg0;
			this.method8495();
		}
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)I")
	protected final int method8493() {
		if (Static280.aClass182_8 == this.aClass182_20) {
			if (Static361.aClass168_7 == this.aClass168_15) {
				return 6407;
			}
			if (Static95.aClass168_2 == this.aClass168_15) {
				return 6408;
			}
			if (Static491.aClass168_11 == this.aClass168_15) {
				return 6406;
			}
			if (Static480.aClass168_10 == this.aClass168_15) {
				return 6409;
			}
			if (Static168.aClass168_3 == this.aClass168_15) {
				return 6410;
			}
			if (Static66.aClass168_1 == this.aClass168_15) {
				return 6145;
			}
		} else if (Static280.aClass182_11 == this.aClass182_20) {
			if (Static361.aClass168_7 == this.aClass168_15) {
				return 34843;
			}
			if (this.aClass168_15 == Static95.aClass168_2) {
				return 34842;
			}
			if (this.aClass168_15 == Static491.aClass168_11) {
				return 34844;
			}
			if (this.aClass168_15 == Static480.aClass168_10) {
				return 34846;
			}
			if (Static168.aClass168_3 == this.aClass168_15) {
				return 34847;
			}
			if (Static66.aClass168_1 == this.aClass168_15) {
				return 6145;
			}
		} else if (Static280.aClass182_12 == this.aClass182_20) {
			if (this.aClass168_15 == Static361.aClass168_7) {
				return 34837;
			}
			if (this.aClass168_15 == Static95.aClass168_2) {
				return 34836;
			}
			if (this.aClass168_15 == Static491.aClass168_11) {
				return 34838;
			}
			if (Static480.aClass168_10 == this.aClass168_15) {
				return 34840;
			}
			if (Static168.aClass168_3 == this.aClass168_15) {
				return 34841;
			}
			if (Static66.aClass168_1 == this.aClass168_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(ZIII[I)V")
	protected final void method8494(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 > 0 && !Static112.method1840(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static112.method1840(arg0)) {
			throw new IllegalArgumentException("");
		} else if (Static95.aClass168_2 == this.aClass168_15) {
			@Pc(41) int local41 = 0;
			@Pc(52) int local52 = arg0 > arg1 ? arg1 : arg0;
			@Pc(56) int local56 = arg1 >> 1;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(62) int[] local62 = arg3;
			@Pc(67) int[] local67 = new int[local60 * local56];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local41, this.method8493(), arg1, arg0, 0, 32993, this.aClass82_Sub3_Sub1_11.anInt4414, local62, 0);
				if (local52 <= 1) {
					return;
				}
				@Pc(90) int local90 = 0;
				@Pc(92) int local92 = 0;
				@Pc(96) int local96 = arg1;
				for (@Pc(98) int local98 = 0; local98 < local60; local98++) {
					for (@Pc(102) int local102 = 0; local102 < local56; local102++) {
						@Pc(109) int local109 = local62[local92++];
						@Pc(114) int local114 = local62[local96++];
						@Pc(119) int local119 = local62[local92++];
						@Pc(125) int local125 = local109 >> 16 & 0xFF;
						@Pc(130) int local130 = local62[local96++];
						@Pc(134) int local134 = local109 & 0xFF;
						@Pc(140) int local140 = local109 >> 24 & 0xFF;
						@Pc(146) int local146 = local109 >> 8 & 0xFF;
						@Pc(152) int local152 = local134 + (local119 & 0xFF);
						@Pc(160) int local160 = local146 + (local119 >> 8 & 0xFF);
						@Pc(168) int local168 = local125 + (local119 >> 16 & 0xFF);
						@Pc(176) int local176 = local140 + (local119 >> 24 & 0xFF);
						@Pc(184) int local184 = local176 + (local114 >> 24 & 0xFF);
						@Pc(190) int local190 = local152 + (local114 & 0xFF);
						@Pc(198) int local198 = local168 + (local114 >> 16 & 0xFF);
						@Pc(206) int local206 = local160 + (local114 >> 8 & 0xFF);
						@Pc(214) int local214 = local184 + (local130 >> 24 & 0xFF);
						@Pc(222) int local222 = local206 + (local130 >> 8 & 0xFF);
						@Pc(228) int local228 = local190 + (local130 & 0xFF);
						@Pc(236) int local236 = local198 + (local130 >> 16 & 0xFF);
						local67[local90++] = (local236 & 0x3FC) << 14 | (local214 & 0x3FC) << 22 | (local222 & 0x3FC) << 6 | local228 >> 2 & 0xFF;
					}
					local92 += arg1;
					local96 += arg1;
				}
				@Pc(289) int[] local289 = local67;
				local67 = local62;
				arg0 = local60;
				local62 = local289;
				arg1 = local56;
				local41++;
				local52 >>= 0x1;
				local60 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8492();
		super.finalize();
	}

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
	private void method8495() {
		this.aClass82_Sub3_Sub1_11.method4972(this);
		if (this.aClass324_11 == Static468.aClass324_7) {
			OpenGL.glTexParameteri(this.anInt10006, 10241, this.aBoolean758 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10006, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10006, 10241, this.aBoolean758 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10006, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)I")
	private int method8496() {
		@Pc(19) int local19 = this.anInt10001 * this.aClass182_20.anInt5379 * this.aClass168_15.anInt4957;
		return this.aBoolean758 ? local19 * 4 / 3 : local19;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "([FIIII)V")
	protected final void method8497(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 > 0 && !Static112.method1840(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static112.method1840(arg1)) {
			@Pc(38) int local38 = this.aClass168_15.anInt4957;
			@Pc(40) int local40 = 0;
			@Pc(47) int local47 = arg1 <= arg3 ? arg1 : arg3;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(57) float[] local57 = arg0;
			@Pc(64) float[] local64 = new float[local38 * local51 * local55];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local40, this.method8493(), arg3, arg1, 0, Static383.method8680(this.aClass168_15), 5126, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg3 * local38;
				for (@Pc(94) int local94 = 0; local94 < local38; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local94 + local92;
					for (@Pc(106) int local106 = 0; local106 < local55; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local51; local110++) {
							@Pc(116) float local116 = local57[local100];
							local100 += local38;
							@Pc(126) float local126 = local116 + local57[local100];
							@Pc(132) float local132 = local126 + local57[local104];
							local100 += local38;
							local104 += local38;
							@Pc(146) float local146 = local132 + local57[local104];
							local104 += local38;
							local64[local98] = local146 * 0.25F;
							local98 += local38;
						}
						local100 += local92;
						local104 += local92;
					}
				}
				@Pc(186) float[] local186 = local64;
				local64 = local57;
				arg3 = local51;
				arg1 = local55;
				local57 = local186;
				local51 >>= 0x1;
				local40++;
				local47 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
