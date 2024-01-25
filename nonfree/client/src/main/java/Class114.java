import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public abstract class Class114 implements Interface1 {

	@OriginalMember(owner = "client!m", name = "u", descriptor = "Lclient!ej;")
	private Class82 aClass82_11 = Static55.aClass82_1;

	@OriginalMember(owner = "client!m", name = "q", descriptor = "Z")
	private final boolean aBoolean615;

	@OriginalMember(owner = "client!m", name = "j", descriptor = "Lclient!pd;")
	protected final Class250 aClass250_14;

	@OriginalMember(owner = "client!m", name = "e", descriptor = "Lclient!ok;")
	protected final Class242 aClass242_19;

	@OriginalMember(owner = "client!m", name = "o", descriptor = "I")
	private final int anInt9170;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	protected final int anInt9168;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Lclient!no;")
	protected final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_10;

	@OriginalMember(owner = "client!m", name = "c", descriptor = "I")
	private int anInt9161;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(Lclient!no;ILclient!pd;Lclient!ok;IZ)V")
	protected Class114(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class250 arg2, @OriginalArg(3) Class242 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aBoolean615 = arg5;
		this.aClass250_14 = arg2;
		this.aClass242_19 = arg3;
		this.anInt9170 = arg4;
		this.anInt9168 = arg1;
		this.aClass100_Sub1_Sub2_10 = arg0;
		OpenGL.glGenTextures(1, Static42.anIntArray55, 0);
		this.anInt9161 = Static42.anIntArray55[0];
		this.method7831();
		this.method7832();
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(B)I")
	protected final int method7828() {
		if (Static409.aClass242_13 == this.aClass242_19) {
			if (this.aClass250_14 == Static600.aClass250_16) {
				return 6407;
			}
			if (Static203.aClass250_7 == this.aClass250_14) {
				return 6408;
			}
			if (this.aClass250_14 == Static598.aClass250_15) {
				return 6406;
			}
			if (Static23.aClass250_8 == this.aClass250_14) {
				return 6409;
			}
			if (Static458.aClass250_12 == this.aClass250_14) {
				return 6410;
			}
			if (Static360.aClass250_11 == this.aClass250_14) {
				return 6145;
			}
		} else if (this.aClass242_19 == Static409.aClass242_16) {
			if (Static600.aClass250_16 == this.aClass250_14) {
				return 34843;
			}
			if (Static203.aClass250_7 == this.aClass250_14) {
				return 34842;
			}
			if (this.aClass250_14 == Static598.aClass250_15) {
				return 34844;
			}
			if (this.aClass250_14 == Static23.aClass250_8) {
				return 34846;
			}
			if (Static458.aClass250_12 == this.aClass250_14) {
				return 34847;
			}
			if (Static360.aClass250_11 == this.aClass250_14) {
				return 6145;
			}
		} else if (Static409.aClass242_17 == this.aClass242_19) {
			if (this.aClass250_14 == Static600.aClass250_16) {
				return 34837;
			}
			if (this.aClass250_14 == Static203.aClass250_7) {
				return 34836;
			}
			if (Static598.aClass250_15 == this.aClass250_14) {
				return 34838;
			}
			if (Static23.aClass250_8 == this.aClass250_14) {
				return 34840;
			}
			if (Static458.aClass250_12 == this.aClass250_14) {
				return 34841;
			}
			if (Static360.aClass250_11 == this.aClass250_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[FII)V")
	protected final void method7829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float[] arg2, @OriginalArg(3) int arg3) {
		if (arg0 > 0 && !Static316.method5292(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static316.method5292(arg3)) {
			@Pc(39) int local39 = this.aClass250_14.anInt7790;
			@Pc(41) int local41 = 0;
			@Pc(48) int local48 = arg3 > arg0 ? arg0 : arg3;
			@Pc(52) int local52 = arg0 >> 1;
			@Pc(56) int local56 = arg3 >> 1;
			@Pc(58) float[] local58 = arg2;
			@Pc(65) float[] local65 = new float[local52 * local56 * local39];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local41, this.method7828(), arg0, arg3, 0, Static124.method2047(this.aClass250_14), 5126, local58, 0);
				if (local48 <= 1) {
					return;
				}
				@Pc(90) int local90 = local39 * arg0;
				for (@Pc(92) int local92 = 0; local92 < local39; local92++) {
					@Pc(96) int local96 = local92;
					@Pc(98) int local98 = local92;
					@Pc(102) int local102 = local92 + local90;
					for (@Pc(104) int local104 = 0; local104 < local56; local104++) {
						for (@Pc(108) int local108 = 0; local108 < local52; local108++) {
							@Pc(114) float local114 = local58[local98];
							local98 += local39;
							@Pc(124) float local124 = local114 + local58[local98];
							@Pc(130) float local130 = local124 + local58[local102];
							local98 += local39;
							local102 += local39;
							@Pc(144) float local144 = local130 + local58[local102];
							local65[local96] = local144 * 0.25F;
							local102 += local39;
							local96 += local39;
						}
						local102 += local90;
						local98 += local90;
					}
				}
				@Pc(184) float[] local184 = local65;
				local65 = local58;
				arg3 = local56;
				local58 = local184;
				arg0 = local52;
				local52 >>= 0x1;
				local41++;
				local48 >>= 0x1;
				local56 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[BII)V")
	protected final void method7830(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static316.method5292(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static316.method5292(arg2)) {
			@Pc(31) int local31 = this.aClass250_14.anInt7790;
			@Pc(42) int local42 = 0;
			@Pc(53) int local53 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(57) int local57 = arg0 >> 1;
			@Pc(61) int local61 = arg2 >> 1;
			@Pc(63) byte[] local63 = arg1;
			@Pc(70) byte[] local70 = new byte[local61 * local57 * local31];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local42, this.method7828(), arg0, arg2, 0, Static124.method2047(this.aClass250_14), 5121, local63, 0);
				if (local53 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg0 * local31;
				@Pc(97) byte[] local97 = local70;
				for (@Pc(99) int local99 = 0; local99 < local31; local99++) {
					@Pc(103) int local103 = local99;
					@Pc(105) int local105 = local99;
					@Pc(109) int local109 = local95 + local99;
					for (@Pc(111) int local111 = 0; local111 < local61; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local57; local115++) {
							@Pc(121) byte local121 = local63[local105];
							local105 += local31;
							@Pc(131) int local131 = local121 + local63[local105];
							local105 += local31;
							@Pc(141) int local141 = local131 + local63[local109];
							local109 += local31;
							@Pc(151) int local151 = local141 + local63[local109];
							local70[local103] = (byte) (local151 >> 2);
							local109 += local31;
							local103 += local31;
						}
						local109 += local95;
						local105 += local95;
					}
				}
				local70 = local63;
				arg2 = local61;
				local63 = local97;
				arg0 = local57;
				local61 >>= 0x1;
				local53 >>= 0x1;
				local57 >>= 0x1;
				local42++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
	private void method7831() {
		this.aClass100_Sub1_Sub2_10.method6033(this);
		if (this.aClass82_11 == Static55.aClass82_1) {
			OpenGL.glTexParameteri(this.anInt9168, 10241, this.aBoolean615 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9168, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9168, 10241, this.aBoolean615 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9168, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)V")
	private void method7832() {
		this.aClass100_Sub1_Sub2_10.anInt7119 += this.method7834();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V")
	@Override
	public final void method7826() {
		@Pc(12) int local12 = this.aClass100_Sub1_Sub2_10.method6158();
		@Pc(18) int local18 = this.aClass100_Sub1_Sub2_10.anIntArray431[local12];
		if (this.anInt9168 != local18) {
			if (local18 != 0) {
				OpenGL.glBindTexture(local18, 0);
				OpenGL.glDisable(local18);
			}
			OpenGL.glEnable(this.anInt9168);
			this.aClass100_Sub1_Sub2_10.anIntArray431[local12] = this.anInt9168;
		}
		OpenGL.glBindTexture(this.anInt9168, this.anInt9161);
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)I")
	private int method7834() {
		@Pc(20) int local20 = this.anInt9170 * this.aClass242_19.anInt7529 * this.aClass250_14.anInt7790;
		return this.aBoolean615 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([IIIIB)V")
	protected final void method7835(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 > 0 && !Static316.method5292(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static316.method5292(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static203.aClass250_7 == this.aClass250_14) {
			@Pc(49) int local49 = 0;
			@Pc(60) int local60 = arg2 <= arg1 ? arg2 : arg1;
			@Pc(64) int local64 = arg1 >> 1;
			@Pc(68) int local68 = arg2 >> 1;
			@Pc(70) int[] local70 = arg0;
			@Pc(75) int[] local75 = new int[local68 * local64];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local49, this.method7828(), arg1, arg2, 0, 32993, this.aClass100_Sub1_Sub2_10.anInt7250, local70, 0);
				if (local60 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(102) int local102 = arg1;
				@Pc(104) int[] local104 = local75;
				for (@Pc(106) int local106 = 0; local106 < local68; local106++) {
					for (@Pc(110) int local110 = 0; local110 < local64; local110++) {
						@Pc(117) int local117 = local70[local98++];
						@Pc(122) int local122 = local70[local102++];
						@Pc(127) int local127 = local70[local98++];
						@Pc(133) int local133 = local117 >> 8 & 0xFF;
						@Pc(138) int local138 = local70[local102++];
						@Pc(142) int local142 = local117 & 0xFF;
						@Pc(148) int local148 = local117 >> 16 & 0xFF;
						@Pc(154) int local154 = local117 >> 24 & 0xFF;
						@Pc(162) int local162 = local154 + (local127 >> 24 & 0xFF);
						@Pc(168) int local168 = local142 + (local127 & 0xFF);
						@Pc(176) int local176 = local148 + (local127 >> 16 & 0xFF);
						@Pc(184) int local184 = local133 + (local127 >> 8 & 0xFF);
						@Pc(192) int local192 = local176 + (local122 >> 16 & 0xFF);
						@Pc(198) int local198 = local168 + (local122 & 0xFF);
						@Pc(206) int local206 = local162 + (local122 >> 24 & 0xFF);
						@Pc(214) int local214 = local184 + (local122 >> 8 & 0xFF);
						@Pc(222) int local222 = local206 + (local138 >> 24 & 0xFF);
						@Pc(230) int local230 = local214 + (local138 >> 8 & 0xFF);
						@Pc(238) int local238 = local192 + (local138 >> 16 & 0xFF);
						@Pc(244) int local244 = local198 + (local138 & 0xFF);
						local75[local96++] = (local230 & 0x3FC) << 6 | (local238 & 0x3FC) << 14 | (local222 & 0x3FC) << 22 | local244 >> 2 & 0xFF;
					}
					local98 += arg1;
					local102 += arg1;
				}
				local75 = local70;
				arg1 = local64;
				local70 = local104;
				arg2 = local68;
				local64 >>= 0x1;
				local49++;
				local60 >>= 0x1;
				local68 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Z)V")
	private void method7836() {
		if (this.anInt9161 > 0) {
			this.aClass100_Sub1_Sub2_10.method6169(this.method7834(), this.anInt9161);
			this.anInt9161 = 0;
		}
	}

	@OriginalMember(owner = "client!m", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7836();
		super.finalize();
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(BLclient!ej;)V")
	@Override
	public final void method7827(@OriginalArg(1) Class82 arg0) {
		if (arg0 != this.aClass82_11) {
			this.aClass82_11 = arg0;
			this.method7831();
		}
	}
}
