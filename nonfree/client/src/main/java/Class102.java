import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qda")
public abstract class Class102 implements Interface12 {

	@OriginalMember(owner = "client!qda", name = "j", descriptor = "Lclient!em;")
	private Class86 aClass86_13 = Static354.aClass86_9;

	@OriginalMember(owner = "client!qda", name = "m", descriptor = "Lclient!kl;")
	protected final Class174 aClass174_17;

	@OriginalMember(owner = "client!qda", name = "n", descriptor = "I")
	protected final int anInt9162;

	@OriginalMember(owner = "client!qda", name = "l", descriptor = "I")
	private final int anInt9161;

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "Lclient!lh;")
	protected final Class62_Sub1_Sub2 aClass62_Sub1_Sub2_10;

	@OriginalMember(owner = "client!qda", name = "p", descriptor = "Z")
	private final boolean aBoolean671;

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "Lclient!vt;")
	protected final Class306 aClass306_20;

	@OriginalMember(owner = "client!qda", name = "h", descriptor = "I")
	private int anInt9158;

	static {
		new Class40("Swap this note at any bank for the equivalent item.", "Dieses Zertifikat kann in einer Bank entsprechend eingetauscht werden.", "Échangez ce reçu contre l'objet correspondant dans la banque de votre choix.", "Vá a qualquer banco para trocar esta nota pelo objeto equivalente.");
	}

	@OriginalMember(owner = "client!qda", name = "<init>", descriptor = "(Lclient!lh;ILclient!kl;Lclient!vt;IZ)V")
	protected Class102(@OriginalArg(0) Class62_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class174 arg2, @OriginalArg(3) Class306 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass174_17 = arg2;
		this.anInt9162 = arg1;
		this.anInt9161 = arg4;
		this.aClass62_Sub1_Sub2_10 = arg0;
		this.aBoolean671 = arg5;
		this.aClass306_20 = arg3;
		OpenGL.glGenTextures(1, Static273.anIntArray367, 0);
		this.anInt9158 = Static273.anIntArray367[0];
		this.method7443();
		this.method7441();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(Lclient!em;I)V")
	@Override
	public final void method7438(@OriginalArg(0) Class86 arg0) {
		if (arg0 != this.aClass86_13) {
			this.aClass86_13 = arg0;
			this.method7443();
		}
	}

	@OriginalMember(owner = "client!qda", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7440();
		super.finalize();
	}

	@OriginalMember(owner = "client!qda", name = "e", descriptor = "(I)V")
	private void method7440() {
		if (this.anInt9158 > 0) {
			this.aClass62_Sub1_Sub2_10.method4793(this.anInt9158, this.method7446());
			this.anInt9158 = 0;
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(II)V")
	private void method7441() {
		this.aClass62_Sub1_Sub2_10.anInt5658 += this.method7446();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[B)V")
	protected final void method7442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3) {
		if (arg1 > 0 && !Static281.method4574(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static281.method4574(arg0)) {
			@Pc(34) int local34 = this.aClass174_17.anInt5166;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg0 <= arg1 ? arg0 : arg1;
			@Pc(57) int local57 = arg1 >> 1;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(63) byte[] local63 = arg3;
			@Pc(70) byte[] local70 = new byte[local61 * local57 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg2, local36, this.method7444(), arg1, arg0, 0, Static546.method7437(this.aClass174_17), 5121, local63, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg1 * local34;
				for (@Pc(97) int local97 = 0; local97 < local34; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local97 + local95;
					for (@Pc(109) int local109 = 0; local109 < local61; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local57; local113++) {
							@Pc(119) byte local119 = local63[local103];
							local103 += local34;
							@Pc(129) int local129 = local119 + local63[local103];
							@Pc(135) int local135 = local129 + local63[local107];
							local103 += local34;
							local107 += local34;
							@Pc(149) int local149 = local135 + local63[local107];
							local107 += local34;
							local70[local101] = (byte) (local149 >> 2);
							local101 += local34;
						}
						local107 += local95;
						local103 += local95;
					}
				}
				@Pc(194) byte[] local194 = local70;
				local70 = local63;
				arg0 = local61;
				local63 = local194;
				arg1 = local57;
				local43 >>= 0x1;
				local61 >>= 0x1;
				local57 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qda", name = "f", descriptor = "(I)V")
	private void method7443() {
		this.aClass62_Sub1_Sub2_10.method4676(this);
		if (this.aClass86_13 == Static354.aClass86_9) {
			OpenGL.glTexParameteri(this.anInt9162, 10241, this.aBoolean671 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9162, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9162, 10241, this.aBoolean671 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9162, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(B)I")
	protected final int method7444() {
		if (Static523.aClass306_15 == this.aClass306_20) {
			if (Static296.aClass174_9 == this.aClass174_17) {
				return 6407;
			}
			if (this.aClass174_17 == Static189.aClass174_6) {
				return 6408;
			}
			if (this.aClass174_17 == Static301.aClass174_10) {
				return 6406;
			}
			if (Static517.aClass174_16 == this.aClass174_17) {
				return 6409;
			}
			if (this.aClass174_17 == Static167.aClass174_5) {
				return 6410;
			}
			if (Static475.aClass174_15 == this.aClass174_17) {
				return 6145;
			}
		} else if (this.aClass306_20 == Static523.aClass306_18) {
			if (Static296.aClass174_9 == this.aClass174_17) {
				return 34843;
			}
			if (Static189.aClass174_6 == this.aClass174_17) {
				return 34842;
			}
			if (Static301.aClass174_10 == this.aClass174_17) {
				return 34844;
			}
			if (Static517.aClass174_16 == this.aClass174_17) {
				return 34846;
			}
			if (this.aClass174_17 == Static167.aClass174_5) {
				return 34847;
			}
			if (Static475.aClass174_15 == this.aClass174_17) {
				return 6145;
			}
		} else if (this.aClass306_20 == Static523.aClass306_19) {
			if (Static296.aClass174_9 == this.aClass174_17) {
				return 34837;
			}
			if (Static189.aClass174_6 == this.aClass174_17) {
				return 34836;
			}
			if (this.aClass174_17 == Static301.aClass174_10) {
				return 34838;
			}
			if (this.aClass174_17 == Static517.aClass174_16) {
				return 34840;
			}
			if (this.aClass174_17 == Static167.aClass174_5) {
				return 34841;
			}
			if (Static475.aClass174_15 == this.aClass174_17) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[I)V")
	protected final void method7445(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 > 0 && !Static281.method4574(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 > 0 && !Static281.method4574(arg0)) {
			throw new IllegalArgumentException("");
		} else if (Static189.aClass174_6 == this.aClass174_17) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg1 >= arg0 ? arg0 : arg1;
			@Pc(59) int local59 = arg1 >> 1;
			@Pc(63) int local63 = arg0 >> 1;
			@Pc(65) int[] local65 = arg3;
			@Pc(70) int[] local70 = new int[local59 * local63];
			while (true) {
				OpenGL.glTexImage2Di(arg2, local44, this.method7444(), arg1, arg0, 0, 32993, this.aClass62_Sub1_Sub2_10.anInt5782, local65, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(93) int local93 = 0;
				@Pc(95) int local95 = 0;
				@Pc(99) int local99 = arg1;
				for (@Pc(101) int local101 = 0; local101 < local63; local101++) {
					for (@Pc(105) int local105 = 0; local105 < local59; local105++) {
						@Pc(112) int local112 = local65[local95++];
						@Pc(117) int local117 = local65[local99++];
						@Pc(122) int local122 = local65[local95++];
						@Pc(127) int local127 = local65[local99++];
						@Pc(133) int local133 = local112 >> 16 & 0xFF;
						@Pc(139) int local139 = local112 >> 8 & 0xFF;
						@Pc(145) int local145 = local112 >> 24 & 0xFF;
						@Pc(149) int local149 = local112 & 0xFF;
						@Pc(157) int local157 = local145 + (local122 >> 24 & 0xFF);
						@Pc(163) int local163 = local149 + (local122 & 0xFF);
						@Pc(171) int local171 = local139 + (local122 >> 8 & 0xFF);
						@Pc(179) int local179 = local133 + (local122 >> 16 & 0xFF);
						@Pc(187) int local187 = local179 + (local117 >> 16 & 0xFF);
						@Pc(193) int local193 = local163 + (local117 & 0xFF);
						@Pc(201) int local201 = local157 + (local117 >> 24 & 0xFF);
						@Pc(209) int local209 = local171 + (local117 >> 8 & 0xFF);
						@Pc(217) int local217 = local209 + (local127 >> 8 & 0xFF);
						@Pc(225) int local225 = local187 + (local127 >> 16 & 0xFF);
						@Pc(233) int local233 = local201 + (local127 >> 24 & 0xFF);
						@Pc(239) int local239 = local193 + (local127 & 0xFF);
						local70[local93++] = (local233 & 0x3FC) << 22 | (local225 & 0x3FC) << 14 | (local217 & 0x3FC) << 6 | local239 >> 2 & 0xFF;
					}
					local99 += arg1;
					local95 += arg1;
				}
				@Pc(288) int[] local288 = local70;
				local70 = local65;
				local65 = local288;
				arg0 = local63;
				arg1 = local59;
				local63 >>= 0x1;
				local55 >>= 0x1;
				local44++;
				local59 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qda", name = "b", descriptor = "(B)I")
	private int method7446() {
		@Pc(20) int local20 = this.aClass174_17.anInt5166 * this.aClass306_20.anInt8854 * this.anInt9161;
		return this.aBoolean671 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!qda", name = "a", descriptor = "(IIII[F)V")
	protected final void method7448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg1 > 0 && !Static281.method4574(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static281.method4574(arg2)) {
			@Pc(34) int local34 = this.aClass174_17.anInt5166;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg2 > arg1 ? arg1 : arg2;
			@Pc(47) int local47 = arg1 >> 1;
			@Pc(51) int local51 = arg2 >> 1;
			@Pc(53) float[] local53 = arg3;
			@Pc(60) float[] local60 = new float[local51 * local47 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg0, local36, this.method7444(), arg1, arg2, 0, Static546.method7437(this.aClass174_17), 5126, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(92) int local92 = local34 * arg1;
				for (@Pc(94) int local94 = 0; local94 < local34; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local94 + local92;
					for (@Pc(106) int local106 = 0; local106 < local51; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local47; local110++) {
							@Pc(116) float local116 = local53[local100];
							local100 += local34;
							@Pc(126) float local126 = local116 + local53[local100];
							@Pc(132) float local132 = local126 + local53[local104];
							local100 += local34;
							local104 += local34;
							@Pc(146) float local146 = local132 + local53[local104];
							local60[local98] = local146 * 0.25F;
							local104 += local34;
							local98 += local34;
						}
						local104 += local92;
						local100 += local92;
					}
				}
				@Pc(190) float[] local190 = local60;
				local60 = local53;
				arg1 = local47;
				arg2 = local51;
				local53 = local190;
				local51 >>= 0x1;
				local47 >>= 0x1;
				local43 >>= 0x1;
				local36++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qda", name = "d", descriptor = "(I)V")
	@Override
	public final void method7439() {
		@Pc(8) int local8 = this.aClass62_Sub1_Sub2_10.method4781();
		@Pc(24) int local24 = this.aClass62_Sub1_Sub2_10.anIntArray394[local8];
		if (this.anInt9162 != local24) {
			if (local24 != 0) {
				OpenGL.glBindTexture(local24, 0);
				OpenGL.glDisable(local24);
			}
			OpenGL.glEnable(this.anInt9162);
			this.aClass62_Sub1_Sub2_10.anIntArray394[local8] = this.anInt9162;
		}
		OpenGL.glBindTexture(this.anInt9162, this.anInt9158);
	}
}
