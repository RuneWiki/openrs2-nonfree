import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public abstract class Class32 implements Interface19 {

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "Lclient!se;")
	private Class328 aClass328_11 = Static464.aClass328_10;

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "Lclient!ua;")
	protected final Class358 aClass358_17;

	@OriginalMember(owner = "client!vs", name = "n", descriptor = "Lclient!tia;")
	protected final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_11;

	@OriginalMember(owner = "client!vs", name = "p", descriptor = "Z")
	private final boolean aBoolean755;

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "I")
	private final int anInt10551;

	@OriginalMember(owner = "client!vs", name = "q", descriptor = "Lclient!dn;")
	protected final Class86 aClass86_20;

	@OriginalMember(owner = "client!vs", name = "x", descriptor = "I")
	protected final int anInt10540;

	@OriginalMember(owner = "client!vs", name = "u", descriptor = "I")
	private int anInt10547;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!tia;ILclient!ua;Lclient!dn;IZ)V")
	protected Class32(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class358 arg2, @OriginalArg(3) Class86 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass358_17 = arg2;
		this.aClass100_Sub1_Sub2_11 = arg0;
		this.aBoolean755 = arg5;
		this.anInt10551 = arg4;
		this.aClass86_20 = arg3;
		this.anInt10540 = arg1;
		OpenGL.glGenTextures(1, Static535.anIntArray487, 0);
		this.anInt10547 = Static535.anIntArray487[0];
		this.method8901();
		this.method8897();
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!se;)V")
	@Override
	public final void method8896(@OriginalArg(1) Class328 arg0) {
		if (arg0 != this.aClass328_11) {
			this.aClass328_11 = arg0;
			this.method8901();
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(II)V")
	private void method8897() {
		this.aClass100_Sub1_Sub2_11.anInt9220 += this.method8900();
	}

	@OriginalMember(owner = "client!vs", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method8902();
		super.finalize();
	}

	@OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)V")
	@Override
	public final void method8895() {
		@Pc(16) int local16 = this.aClass100_Sub1_Sub2_11.method7874();
		@Pc(22) int local22 = this.aClass100_Sub1_Sub2_11.anIntArray522[local16];
		if (this.anInt10540 != local22) {
			if (local22 != 0) {
				OpenGL.glBindTexture(local22, 0);
				OpenGL.glDisable(local22);
			}
			OpenGL.glEnable(this.anInt10540);
			this.aClass100_Sub1_Sub2_11.anIntArray522[local16] = this.anInt10540;
		}
		OpenGL.glBindTexture(this.anInt10540, this.anInt10547);
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(B)I")
	protected final int method8898() {
		if (this.aClass86_20 == Static104.aClass86_8) {
			if (this.aClass358_17 == Static221.aClass358_8) {
				return 6407;
			}
			if (this.aClass358_17 == Static171.aClass358_12) {
				return 6408;
			}
			if (Static624.aClass358_16 == this.aClass358_17) {
				return 6406;
			}
			if (this.aClass358_17 == Static338.aClass358_13) {
				return 6409;
			}
			if (this.aClass358_17 == Static266.aClass358_10) {
				return 6410;
			}
			if (Static205.aClass358_7 == this.aClass358_17) {
				return 6145;
			}
		} else if (this.aClass86_20 == Static104.aClass86_11) {
			if (Static221.aClass358_8 == this.aClass358_17) {
				return 34843;
			}
			if (Static171.aClass358_12 == this.aClass358_17) {
				return 34842;
			}
			if (this.aClass358_17 == Static624.aClass358_16) {
				return 34844;
			}
			if (Static338.aClass358_13 == this.aClass358_17) {
				return 34846;
			}
			if (Static266.aClass358_10 == this.aClass358_17) {
				return 34847;
			}
			if (Static205.aClass358_7 == this.aClass358_17) {
				return 6145;
			}
		} else if (Static104.aClass86_12 == this.aClass86_20) {
			if (Static221.aClass358_8 == this.aClass358_17) {
				return 34837;
			}
			if (Static171.aClass358_12 == this.aClass358_17) {
				return 34836;
			}
			if (Static624.aClass358_16 == this.aClass358_17) {
				return 34838;
			}
			if (Static338.aClass358_13 == this.aClass358_17) {
				return 34840;
			}
			if (this.aClass358_17 == Static266.aClass358_10) {
				return 34841;
			}
			if (this.aClass358_17 == Static205.aClass358_7) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I")
	private int method8900() {
		@Pc(22) int local22 = this.aClass358_17.anInt9551 * this.aClass86_20.anInt1714 * this.anInt10551;
		return this.aBoolean755 ? local22 * 4 / 3 : local22;
	}

	@OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)V")
	private void method8901() {
		this.aClass100_Sub1_Sub2_11.method7923(this);
		if (Static464.aClass328_10 == this.aClass328_11) {
			OpenGL.glTexParameteri(this.anInt10540, 10241, this.aBoolean755 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt10540, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt10540, 10241, this.aBoolean755 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt10540, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!vs", name = "c", descriptor = "(B)V")
	private void method8902() {
		if (this.anInt10547 > 0) {
			this.aClass100_Sub1_Sub2_11.method8002(this.anInt10547, this.method8900());
			this.anInt10547 = 0;
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([BIZII)V")
	protected final void method8903(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static197.method3300(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static197.method3300(arg2)) {
			@Pc(40) int local40 = this.aClass358_17.anInt9551;
			@Pc(42) int local42 = 0;
			@Pc(50) int local50 = arg3 >= arg2 ? arg2 : arg3;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(58) int local58 = arg2 >> 1;
			@Pc(60) byte[] local60 = arg0;
			@Pc(67) byte[] local67 = new byte[local58 * local54 * local40];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local42, this.method8898(), arg3, arg2, 0, Static298.method4688(this.aClass358_17), 5121, local60, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg3 * local40;
				for (@Pc(94) int local94 = 0; local94 < local40; local94++) {
					@Pc(100) int local100 = local94;
					@Pc(102) int local102 = local94;
					@Pc(106) int local106 = local92 + local94;
					for (@Pc(108) int local108 = 0; local108 < local58; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local54; local112++) {
							@Pc(120) byte local120 = local60[local102];
							local102 += local40;
							@Pc(130) int local130 = local120 + local60[local102];
							local102 += local40;
							@Pc(140) int local140 = local130 + local60[local106];
							local106 += local40;
							@Pc(150) int local150 = local140 + local60[local106];
							local106 += local40;
							local67[local100] = (byte) (local150 >> 2);
							local100 += local40;
						}
						local102 += local92;
						local106 += local92;
					}
				}
				@Pc(191) byte[] local191 = local67;
				local67 = local60;
				local60 = local191;
				arg2 = local58;
				arg3 = local54;
				local54 >>= 0x1;
				local42++;
				local50 >>= 0x1;
				local58 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "([FIIII)V")
	protected final void method8904(@OriginalArg(0) float[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static197.method3300(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 <= 0 || Static197.method3300(arg1)) {
			@Pc(40) int local40 = this.aClass358_17.anInt9551;
			@Pc(42) int local42 = 0;
			@Pc(50) int local50 = arg1 > arg3 ? arg3 : arg1;
			@Pc(54) int local54 = arg3 >> 1;
			@Pc(63) int local63 = arg1 >> 1;
			@Pc(65) float[] local65 = arg0;
			@Pc(72) float[] local72 = new float[local40 * local54 * local63];
			while (true) {
				OpenGL.glTexImage2Df(arg2, local42, this.method8898(), arg3, arg1, 0, Static298.method4688(this.aClass358_17), 5126, local65, 0);
				if (local50 <= 1) {
					return;
				}
				@Pc(97) int local97 = local40 * arg3;
				@Pc(99) float[] local99 = local72;
				for (@Pc(101) int local101 = 0; local101 < local40; local101++) {
					@Pc(107) int local107 = local101;
					@Pc(109) int local109 = local101;
					@Pc(113) int local113 = local97 + local101;
					for (@Pc(115) int local115 = 0; local115 < local63; local115++) {
						for (@Pc(119) int local119 = 0; local119 < local54; local119++) {
							@Pc(125) float local125 = local65[local109];
							local109 += local40;
							@Pc(135) float local135 = local125 + local65[local109];
							@Pc(141) float local141 = local135 + local65[local113];
							local109 += local40;
							local113 += local40;
							@Pc(155) float local155 = local141 + local65[local113];
							local72[local107] = local155 * 0.25F;
							local113 += local40;
							local107 += local40;
						}
						local109 += local97;
						local113 += local97;
					}
				}
				local72 = local65;
				arg1 = local63;
				local65 = local99;
				arg3 = local54;
				local50 >>= 0x1;
				local63 >>= 0x1;
				local42++;
				local54 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I[IIBI)V")
	protected final void method8906(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static197.method3300(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 > 0 && !Static197.method3300(arg2)) {
			throw new IllegalArgumentException("");
		} else if (Static171.aClass358_12 == this.aClass358_17) {
			@Pc(45) int local45 = 0;
			@Pc(57) int local57 = arg2 <= arg0 ? arg2 : arg0;
			@Pc(61) int local61 = arg0 >> 1;
			@Pc(65) int local65 = arg2 >> 1;
			@Pc(75) int[] local75 = arg1;
			@Pc(80) int[] local80 = new int[local65 * local61];
			while (true) {
				OpenGL.glTexImage2Di(arg3, local45, this.method8898(), arg0, arg2, 0, 32993, this.aClass100_Sub1_Sub2_11.anInt9359, local75, 0);
				if (local57 <= 1) {
					return;
				}
				@Pc(100) int local100 = 0;
				@Pc(102) int local102 = 0;
				@Pc(106) int local106 = arg0;
				for (@Pc(108) int local108 = 0; local108 < local65; local108++) {
					for (@Pc(114) int local114 = 0; local114 < local61; local114++) {
						@Pc(123) int local123 = local75[local102++];
						@Pc(128) int local128 = local75[local102++];
						@Pc(133) int local133 = local75[local106++];
						@Pc(137) int local137 = local123 & 0xFF;
						@Pc(143) int local143 = local123 >> 24 & 0xFF;
						@Pc(149) int local149 = local123 >> 8 & 0xFF;
						@Pc(155) int local155 = local123 >> 16 & 0xFF;
						@Pc(160) int local160 = local75[local106++];
						@Pc(166) int local166 = local137 + (local128 & 0xFF);
						@Pc(174) int local174 = local149 + (local128 >> 8 & 0xFF);
						@Pc(182) int local182 = local143 + (local128 >> 24 & 0xFF);
						@Pc(190) int local190 = local155 + (local128 >> 16 & 0xFF);
						@Pc(198) int local198 = local182 + (local133 >> 24 & 0xFF);
						@Pc(206) int local206 = local174 + (local133 >> 8 & 0xFF);
						@Pc(212) int local212 = local166 + (local133 & 0xFF);
						@Pc(220) int local220 = local190 + (local133 >> 16 & 0xFF);
						@Pc(226) int local226 = local212 + (local160 & 0xFF);
						@Pc(234) int local234 = local198 + (local160 >> 24 & 0xFF);
						@Pc(242) int local242 = local220 + (local160 >> 16 & 0xFF);
						@Pc(250) int local250 = local206 + (local160 >> 8 & 0xFF);
						local80[local100++] = (local250 & 0x3FC) << 6 | (local242 & 0x3FC) << 14 | (local234 & 0x3FC) << 22 | local226 >> 2 & 0xFF;
					}
					local102 += arg0;
					local106 += arg0;
				}
				@Pc(301) int[] local301 = local80;
				local80 = local75;
				arg2 = local65;
				local75 = local301;
				arg0 = local61;
				local57 >>= 0x1;
				local61 >>= 0x1;
				local45++;
				local65 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
