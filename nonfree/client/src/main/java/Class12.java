import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public abstract class Class12 implements Interface10 {

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Lclient!ju;")
	private Class164 aClass164_14 = Static411.aClass164_15;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	private final int anInt9290;

	@OriginalMember(owner = "client!dh", name = "l", descriptor = "I")
	protected final int anInt9288;

	@OriginalMember(owner = "client!dh", name = "w", descriptor = "Lclient!nh;")
	protected final Class219 aClass219_15;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "Z")
	private final boolean aBoolean719;

	@OriginalMember(owner = "client!dh", name = "k", descriptor = "Lclient!jr;")
	protected final Class161 aClass161_20;

	@OriginalMember(owner = "client!dh", name = "x", descriptor = "Lclient!el;")
	protected final Class14_Sub2_Sub1 aClass14_Sub2_Sub1_10;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
	private int anInt9286;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lclient!el;ILclient!nh;Lclient!jr;IZ)V")
	protected Class12(@OriginalArg(0) Class14_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class219 arg2, @OriginalArg(3) Class161 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9290 = arg4;
		this.anInt9288 = arg1;
		this.aClass219_15 = arg2;
		this.aBoolean719 = arg5;
		this.aClass161_20 = arg3;
		this.aClass14_Sub2_Sub1_10 = arg0;
		OpenGL.glGenTextures(1, Static596.anIntArray722, 0);
		this.anInt9286 = Static596.anIntArray722[0];
		this.method7588();
		this.method7590();
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	private void method7588() {
		this.aClass14_Sub2_Sub1_10.method7034(this);
		if (this.aClass164_14 == Static411.aClass164_15) {
			OpenGL.glTexParameteri(this.anInt9288, 10241, this.aBoolean719 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9288, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9288, 10241, this.aBoolean719 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9288, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(BI)V")
	private void method7590() {
		this.aClass14_Sub2_Sub1_10.anInt8577 += this.method7594();
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)I")
	protected final int method7591() {
		if (Static239.aClass161_12 == this.aClass161_20) {
			if (Static156.aClass219_11 == this.aClass219_15) {
				return 6407;
			}
			if (this.aClass219_15 == Static122.aClass219_7) {
				return 6408;
			}
			if (this.aClass219_15 == Static145.aClass219_10) {
				return 6406;
			}
			if (Static544.aClass219_14 == this.aClass219_15) {
				return 6409;
			}
			if (Static132.aClass219_8 == this.aClass219_15) {
				return 6410;
			}
			if (this.aClass219_15 == Static34.aClass219_3) {
				return 6145;
			}
		} else if (Static239.aClass161_15 == this.aClass161_20) {
			if (this.aClass219_15 == Static156.aClass219_11) {
				return 34843;
			}
			if (this.aClass219_15 == Static122.aClass219_7) {
				return 34842;
			}
			if (Static145.aClass219_10 == this.aClass219_15) {
				return 34844;
			}
			if (this.aClass219_15 == Static544.aClass219_14) {
				return 34846;
			}
			if (Static132.aClass219_8 == this.aClass219_15) {
				return 34847;
			}
			if (this.aClass219_15 == Static34.aClass219_3) {
				return 6145;
			}
		} else if (this.aClass161_20 == Static239.aClass161_16) {
			if (this.aClass219_15 == Static156.aClass219_11) {
				return 34837;
			}
			if (this.aClass219_15 == Static122.aClass219_7) {
				return 34836;
			}
			if (Static145.aClass219_10 == this.aClass219_15) {
				return 34838;
			}
			if (this.aClass219_15 == Static544.aClass219_14) {
				return 34840;
			}
			if (this.aClass219_15 == Static132.aClass219_8) {
				return 34841;
			}
			if (Static34.aClass219_3 == this.aClass219_15) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)V")
	private void method7593() {
		if (this.anInt9286 > 0) {
			this.aClass14_Sub2_Sub1_10.method2477(this.method7594(), this.anInt9286);
			this.anInt9286 = 0;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Z)I")
	private int method7594() {
		@Pc(24) int local24 = this.anInt9290 * this.aClass161_20.anInt4850 * this.aClass219_15.anInt6139;
		return this.aBoolean719 ? local24 * 4 / 3 : local24;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[II)V")
	protected final void method7596(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static404.method5927(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static404.method5927(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static122.aClass219_7 == this.aClass219_15) {
			@Pc(45) int local45 = 0;
			@Pc(56) int local56 = arg3 <= arg0 ? arg3 : arg0;
			@Pc(60) int local60 = arg0 >> 1;
			@Pc(64) int local64 = arg3 >> 1;
			@Pc(66) int[] local66 = arg2;
			@Pc(71) int[] local71 = new int[local64 * local60];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local45, this.method7591(), arg0, arg3, 0, 32993, this.aClass14_Sub2_Sub1_10.anInt2779, local66, 0);
				if (local56 <= 1) {
					return;
				}
				@Pc(94) int local94 = 0;
				@Pc(96) int local96 = 0;
				@Pc(100) int local100 = arg0;
				@Pc(102) int[] local102 = local71;
				for (@Pc(104) int local104 = 0; local104 < local64; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local60; local108++) {
						@Pc(115) int local115 = local66[local96++];
						@Pc(120) int local120 = local66[local100++];
						@Pc(125) int local125 = local66[local96++];
						@Pc(131) int local131 = local115 >> 24 & 0xFF;
						@Pc(137) int local137 = local115 >> 8 & 0xFF;
						@Pc(142) int local142 = local66[local100++];
						@Pc(146) int local146 = local115 & 0xFF;
						@Pc(152) int local152 = local115 >> 16 & 0xFF;
						@Pc(160) int local160 = local152 + (local125 >> 16 & 0xFF);
						@Pc(168) int local168 = local137 + (local125 >> 8 & 0xFF);
						@Pc(176) int local176 = local131 + (local125 >> 24 & 0xFF);
						@Pc(182) int local182 = local146 + (local125 & 0xFF);
						@Pc(190) int local190 = local160 + (local120 >> 16 & 0xFF);
						@Pc(198) int local198 = local176 + (local120 >> 24 & 0xFF);
						@Pc(204) int local204 = local182 + (local120 & 0xFF);
						@Pc(212) int local212 = local168 + (local120 >> 8 & 0xFF);
						@Pc(218) int local218 = local204 + (local142 & 0xFF);
						@Pc(226) int local226 = local198 + (local142 >> 24 & 0xFF);
						@Pc(234) int local234 = local212 + (local142 >> 8 & 0xFF);
						@Pc(242) int local242 = local190 + (local142 >> 16 & 0xFF);
						local71[local94++] = local218 >> 2 & 0xFF | (local234 & 0x3FC) << 6 | (local242 & 0x3FC) << 14 | (local226 & 0x3FC) << 22;
					}
					local96 += arg0;
					local100 += arg0;
				}
				local71 = local66;
				arg3 = local64;
				arg0 = local60;
				local66 = local102;
				local60 >>= 0x1;
				local56 >>= 0x1;
				local45++;
				local64 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([FIIBI)V")
	protected final void method7597(@OriginalArg(0) float[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > 0 && !Static404.method5927(arg2)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static404.method5927(arg3)) {
			@Pc(42) int local42 = this.aClass219_15.anInt6139;
			@Pc(44) int local44 = 0;
			@Pc(51) int local51 = arg3 <= arg2 ? arg3 : arg2;
			@Pc(55) int local55 = arg2 >> 1;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(61) float[] local61 = arg0;
			@Pc(68) float[] local68 = new float[local42 * local59 * local55];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local44, this.method7591(), arg2, arg3, 0, Static255.method4299(this.aClass219_15), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(92) int local92 = local42 * arg2;
				@Pc(94) float[] local94 = local68;
				for (@Pc(96) int local96 = 0; local96 < local42; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local96 + local92;
					for (@Pc(108) int local108 = 0; local108 < local59; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local55; local112++) {
							@Pc(118) float local118 = local61[local102];
							local102 += local42;
							@Pc(128) float local128 = local118 + local61[local102];
							local102 += local42;
							@Pc(138) float local138 = local128 + local61[local106];
							local106 += local42;
							@Pc(148) float local148 = local138 + local61[local106];
							local106 += local42;
							local68[local100] = local148 * 0.25F;
							local100 += local42;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local68 = local61;
				arg2 = local55;
				arg3 = local59;
				local61 = local94;
				local51 >>= 0x1;
				local59 >>= 0x1;
				local44++;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7593();
		super.finalize();
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(III[BI)V")
	protected final void method7598(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static404.method5927(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static404.method5927(arg0)) {
			@Pc(34) int local34 = this.aClass219_15.anInt6139;
			@Pc(36) int local36 = 0;
			@Pc(47) int local47 = arg3 >= arg0 ? arg0 : arg3;
			@Pc(51) int local51 = arg3 >> 1;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(57) byte[] local57 = arg2;
			@Pc(68) byte[] local68 = new byte[local51 * local55 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg1, local36, this.method7591(), arg3, arg0, 0, Static255.method4299(this.aClass219_15), 5121, local57, 0);
				if (local47 <= 1) {
					return;
				}
				@Pc(95) int local95 = arg3 * local34;
				for (@Pc(97) int local97 = 0; local97 < local34; local97++) {
					@Pc(101) int local101 = local97;
					@Pc(103) int local103 = local97;
					@Pc(107) int local107 = local97 + local95;
					for (@Pc(109) int local109 = 0; local109 < local55; local109++) {
						for (@Pc(113) int local113 = 0; local113 < local51; local113++) {
							@Pc(119) byte local119 = local57[local103];
							local103 += local34;
							@Pc(129) int local129 = local119 + local57[local103];
							local103 += local34;
							@Pc(139) int local139 = local129 + local57[local107];
							local107 += local34;
							@Pc(149) int local149 = local139 + local57[local107];
							local107 += local34;
							local68[local101] = (byte) (local149 >> 2);
							local101 += local34;
						}
						local103 += local95;
						local107 += local95;
					}
				}
				@Pc(186) byte[] local186 = local68;
				local68 = local57;
				arg3 = local51;
				arg0 = local55;
				local57 = local186;
				local51 >>= 0x1;
				local36++;
				local47 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	@Override
	public final void method7586() {
		@Pc(18) int local18 = this.aClass14_Sub2_Sub1_10.method6972();
		@Pc(24) int local24 = this.aClass14_Sub2_Sub1_10.anIntArray169[local18];
		if (local24 != this.anInt9288) {
			if (local24 != 0) {
				OpenGL.glBindTexture(local24, 0);
				OpenGL.glDisable(local24);
			}
			OpenGL.glEnable(this.anInt9288);
			this.aClass14_Sub2_Sub1_10.anIntArray169[local18] = this.anInt9288;
		}
		OpenGL.glBindTexture(this.anInt9288, this.anInt9286);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!ju;)V")
	@Override
	public final void method7587(@OriginalArg(1) Class164 arg0) {
		if (arg0 != this.aClass164_14) {
			this.aClass164_14 = arg0;
			this.method7588();
		}
	}
}
