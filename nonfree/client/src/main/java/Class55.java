import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public abstract class Class55 implements Interface9 {

	@OriginalMember(owner = "client!ir", name = "r", descriptor = "Lclient!wh;")
	private Class400 aClass400_33 = Static610.aClass400_36;

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "Lclient!pm;")
	protected final Class295 aClass295_13;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "I")
	private final int anInt8831;

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "Lclient!mba;")
	protected final Class145_Sub1_Sub1 aClass145_Sub1_Sub1_10;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	protected final int anInt8840;

	@OriginalMember(owner = "client!ir", name = "n", descriptor = "Z")
	private final boolean aBoolean749;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "Lclient!hk;")
	protected final Class158 aClass158_18;

	@OriginalMember(owner = "client!ir", name = "o", descriptor = "I")
	private int anInt8836;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lclient!mba;ILclient!pm;Lclient!hk;IZ)V")
	protected Class55(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class295 arg2, @OriginalArg(3) Class158 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass295_13 = arg2;
		this.anInt8831 = arg4;
		this.aClass145_Sub1_Sub1_10 = arg0;
		this.anInt8840 = arg1;
		this.aBoolean749 = arg5;
		this.aClass158_18 = arg3;
		OpenGL.glGenTextures(1, Static104.anIntArray133, 0);
		this.anInt8836 = Static104.anIntArray133[0];
		this.method7813();
		this.method7814();
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(B)V")
	private void method7813() {
		this.aClass145_Sub1_Sub1_10.method9754(this);
		if (Static610.aClass400_36 == this.aClass400_33) {
			OpenGL.glTexParameteri(this.anInt8840, 10241, this.aBoolean749 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8840, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8840, 10241, this.aBoolean749 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8840, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II)V")
	private void method7814() {
		this.aClass145_Sub1_Sub1_10.anInt11238 += this.method7815();
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)I")
	private int method7815() {
		@Pc(28) int local28 = this.aClass295_13.anInt7929 * this.aClass158_18.anInt3816 * this.anInt8831;
		return this.aBoolean749 ? local28 * 4 / 3 : local28;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(II[FII)V")
	protected final void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static457.method6641(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static457.method6641(arg3)) {
			@Pc(40) int local40 = this.aClass295_13.anInt7929;
			@Pc(42) int local42 = 0;
			@Pc(54) int local54 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(58) int local58 = arg0 >> 1;
			@Pc(62) int local62 = arg3 >> 1;
			@Pc(73) float[] local73 = arg2;
			@Pc(80) float[] local80 = new float[local40 * local62 * local58];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local42, this.method7823(), arg0, arg3, 0, Static685.method9235(this.aClass295_13), 5126, local73, 0);
				if (local54 <= 1) {
					return;
				}
				@Pc(109) int local109 = arg0 * local40;
				@Pc(111) float[] local111 = local80;
				for (@Pc(113) int local113 = 0; local113 < local40; local113++) {
					@Pc(119) int local119 = local113;
					@Pc(121) int local121 = local113;
					@Pc(125) int local125 = local109 + local113;
					for (@Pc(127) int local127 = 0; local127 < local62; local127++) {
						for (@Pc(131) int local131 = 0; local131 < local58; local131++) {
							@Pc(137) float local137 = local73[local121];
							local121 += local40;
							@Pc(147) float local147 = local137 + local73[local121];
							local121 += local40;
							@Pc(157) float local157 = local147 + local73[local125];
							local125 += local40;
							@Pc(167) float local167 = local157 + local73[local125];
							local125 += local40;
							local80[local119] = local167 * 0.25F;
							local119 += local40;
						}
						local121 += local109;
						local125 += local109;
					}
				}
				local80 = local73;
				arg0 = local58;
				arg3 = local62;
				local73 = local111;
				local62 >>= 0x1;
				local42++;
				local58 >>= 0x1;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBI[BI)V")
	protected final void method7818(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static457.method6641(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static457.method6641(arg1)) {
			@Pc(48) int local48 = this.aClass295_13.anInt7929;
			@Pc(50) int local50 = 0;
			@Pc(58) int local58 = arg0 >= arg1 ? arg1 : arg0;
			@Pc(62) int local62 = arg0 >> 1;
			@Pc(66) int local66 = arg1 >> 1;
			@Pc(68) byte[] local68 = arg2;
			@Pc(75) byte[] local75 = new byte[local62 * local66 * local48];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local50, this.method7823(), arg0, arg1, 0, Static685.method9235(this.aClass295_13), 5121, local68, 0);
				if (local58 <= 1) {
					return;
				}
				@Pc(100) int local100 = local48 * arg0;
				@Pc(102) byte[] local102 = local75;
				for (@Pc(104) int local104 = 0; local104 < local48; local104++) {
					@Pc(110) int local110 = local104;
					@Pc(112) int local112 = local104;
					@Pc(116) int local116 = local100 + local104;
					for (@Pc(118) int local118 = 0; local118 < local66; local118++) {
						for (@Pc(122) int local122 = 0; local122 < local62; local122++) {
							@Pc(130) byte local130 = local68[local112];
							local112 += local48;
							@Pc(140) int local140 = local130 + local68[local112];
							local112 += local48;
							@Pc(150) int local150 = local140 + local68[local116];
							local116 += local48;
							@Pc(160) int local160 = local150 + local68[local116];
							local116 += local48;
							local75[local110] = (byte) (local160 >> 2);
							local110 += local48;
						}
						local112 += local100;
						local116 += local100;
					}
				}
				local75 = local68;
				arg0 = local62;
				local68 = local102;
				arg1 = local66;
				local58 >>= 0x1;
				local62 >>= 0x1;
				local66 >>= 0x1;
				local50++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	@Override
	public final void method8449() {
		@Pc(8) int local8 = this.aClass145_Sub1_Sub1_10.method9812();
		@Pc(14) int local14 = this.aClass145_Sub1_Sub1_10.anIntArray422[local8];
		if (local14 != this.anInt8840) {
			if (local14 != 0) {
				OpenGL.glBindTexture(local14, 0);
				OpenGL.glDisable(local14);
			}
			OpenGL.glEnable(this.anInt8840);
			this.aClass145_Sub1_Sub1_10.anIntArray422[local8] = this.anInt8840;
		}
		OpenGL.glBindTexture(this.anInt8840, this.anInt8836);
	}

	@OriginalMember(owner = "client!ir", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7822();
		super.finalize();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IBII[I)V")
	protected final void method7821(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 > 0 && !Static457.method6641(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static457.method6641(arg1)) {
			throw new IllegalArgumentException("");
		} else if (this.aClass295_13 == Static165.aClass295_6) {
			@Pc(51) int local51 = 0;
			@Pc(59) int local59 = arg1 <= arg0 ? arg1 : arg0;
			@Pc(63) int local63 = arg0 >> 1;
			@Pc(67) int local67 = arg1 >> 1;
			@Pc(78) int[] local78 = arg3;
			@Pc(83) int[] local83 = new int[local63 * local67];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local51, this.method7823(), arg0, arg1, 0, 32993, this.aClass145_Sub1_Sub1_10.anInt6414, local78, 0);
				if (local59 <= 1) {
					return;
				}
				@Pc(105) int local105 = 0;
				@Pc(107) int local107 = 0;
				@Pc(111) int local111 = arg0;
				for (@Pc(113) int local113 = 0; local113 < local67; local113++) {
					for (@Pc(119) int local119 = 0; local119 < local63; local119++) {
						@Pc(128) int local128 = local78[local107++];
						@Pc(133) int local133 = local78[local107++];
						@Pc(138) int local138 = local78[local111++];
						@Pc(143) int local143 = local78[local111++];
						@Pc(149) int local149 = local128 >> 16 & 0xFF;
						@Pc(153) int local153 = local128 & 0xFF;
						@Pc(159) int local159 = local128 >> 8 & 0xFF;
						@Pc(165) int local165 = local128 >> 24 & 0xFF;
						@Pc(173) int local173 = local149 + (local133 >> 16 & 0xFF);
						@Pc(181) int local181 = local159 + (local133 >> 8 & 0xFF);
						@Pc(187) int local187 = local153 + (local133 & 0xFF);
						@Pc(195) int local195 = local165 + (local133 >> 24 & 0xFF);
						@Pc(203) int local203 = local181 + (local138 >> 8 & 0xFF);
						@Pc(209) int local209 = local187 + (local138 & 0xFF);
						@Pc(217) int local217 = local173 + (local138 >> 16 & 0xFF);
						@Pc(225) int local225 = local195 + (local138 >> 24 & 0xFF);
						@Pc(233) int local233 = local203 + (local143 >> 8 & 0xFF);
						@Pc(239) int local239 = local209 + (local143 & 0xFF);
						@Pc(247) int local247 = local217 + (local143 >> 16 & 0xFF);
						@Pc(255) int local255 = local225 + (local143 >> 24 & 0xFF);
						local83[local105++] = (local233 & 0x3FC) << 6 | (local255 & 0x3FC) << 22 | (local247 & 0x3FC) << 14 | local239 >> 2 & 0xFF;
					}
					local107 += arg0;
					local111 += arg0;
				}
				@Pc(306) int[] local306 = local83;
				local83 = local78;
				arg1 = local67;
				local78 = local306;
				arg0 = local63;
				local63 >>= 0x1;
				local67 >>= 0x1;
				local51++;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!wh;Z)V")
	@Override
	public final void method8448(@OriginalArg(0) Class400 arg0) {
		if (this.aClass400_33 != arg0) {
			this.aClass400_33 = arg0;
			this.method7813();
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(B)V")
	private void method7822() {
		if (this.anInt8836 > 0) {
			this.aClass145_Sub1_Sub1_10.method5738(this.method7815(), this.anInt8836);
			this.anInt8836 = 0;
		}
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
	protected final int method7823() {
		if (this.aClass158_18 == Static243.aClass158_10) {
			if (this.aClass295_13 == Static261.aClass295_16) {
				return 6407;
			}
			if (this.aClass295_13 == Static165.aClass295_6) {
				return 6408;
			}
			if (Static408.aClass295_11 == this.aClass295_13) {
				return 6406;
			}
			if (Static341.aClass295_9 == this.aClass295_13) {
				return 6409;
			}
			if (Static307.aClass295_8 == this.aClass295_13) {
				return 6410;
			}
			if (this.aClass295_13 == Static161.aClass295_5) {
				return 6145;
			}
		} else if (Static243.aClass158_13 == this.aClass158_18) {
			if (this.aClass295_13 == Static261.aClass295_16) {
				return 34843;
			}
			if (this.aClass295_13 == Static165.aClass295_6) {
				return 34842;
			}
			if (Static408.aClass295_11 == this.aClass295_13) {
				return 34844;
			}
			if (Static341.aClass295_9 == this.aClass295_13) {
				return 34846;
			}
			if (this.aClass295_13 == Static307.aClass295_8) {
				return 34847;
			}
			if (this.aClass295_13 == Static161.aClass295_5) {
				return 6145;
			}
		} else if (Static243.aClass158_14 == this.aClass158_18) {
			if (this.aClass295_13 == Static261.aClass295_16) {
				return 34837;
			}
			if (this.aClass295_13 == Static165.aClass295_6) {
				return 34836;
			}
			if (this.aClass295_13 == Static408.aClass295_11) {
				return 34838;
			}
			if (this.aClass295_13 == Static341.aClass295_9) {
				return 34840;
			}
			if (Static307.aClass295_8 == this.aClass295_13) {
				return 34841;
			}
			if (this.aClass295_13 == Static161.aClass295_5) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}
}
