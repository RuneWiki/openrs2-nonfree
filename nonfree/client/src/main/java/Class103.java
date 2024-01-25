import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fu")
public abstract class Class103 implements Interface10 {

	@OriginalMember(owner = "client!fu", name = "k", descriptor = "Lclient!mv;")
	private Class227 aClass227_11 = Static85.aClass227_1;

	@OriginalMember(owner = "client!fu", name = "o", descriptor = "Lclient!ec;")
	protected final Class88 aClass88_14;

	@OriginalMember(owner = "client!fu", name = "x", descriptor = "Lclient!bt;")
	protected final Class42 aClass42_20;

	@OriginalMember(owner = "client!fu", name = "u", descriptor = "I")
	protected final int anInt8494;

	@OriginalMember(owner = "client!fu", name = "p", descriptor = "I")
	private final int anInt8489;

	@OriginalMember(owner = "client!fu", name = "d", descriptor = "Lclient!lm;")
	protected final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_12;

	@OriginalMember(owner = "client!fu", name = "j", descriptor = "Z")
	private final boolean aBoolean655;

	@OriginalMember(owner = "client!fu", name = "i", descriptor = "I")
	private int anInt8485;

	@OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lclient!lm;ILclient!ec;Lclient!bt;IZ)V")
	protected Class103(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class88 arg2, @OriginalArg(3) Class42 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.aClass88_14 = arg2;
		this.aClass42_20 = arg3;
		this.anInt8494 = arg1;
		this.anInt8489 = arg4;
		this.aClass100_Sub1_Sub2_12 = arg0;
		this.aBoolean655 = arg5;
		OpenGL.glGenTextures(1, Static488.anIntArray592, 0);
		this.anInt8485 = Static488.anIntArray592[0];
		this.method7052();
		this.method7055();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IBI[II)V")
	protected final void method7051(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 > 0 && !Static19.method380(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg3 > 0 && !Static19.method380(arg3)) {
			throw new IllegalArgumentException("");
		} else if (Static356.aClass88_11 == this.aClass88_14) {
			@Pc(44) int local44 = 0;
			@Pc(55) int local55 = arg0 >= arg3 ? arg3 : arg0;
			@Pc(66) int local66 = arg0 >> 1;
			@Pc(70) int local70 = arg3 >> 1;
			@Pc(72) int[] local72 = arg2;
			@Pc(77) int[] local77 = new int[local70 * local66];
			while (true) {
				OpenGL.glTexImage2Di(arg1, local44, this.method7057(), arg0, arg3, 0, 32993, this.aClass100_Sub1_Sub2_12.anInt5876, local72, 0);
				if (local55 <= 1) {
					return;
				}
				@Pc(100) int local100 = 0;
				@Pc(102) int local102 = 0;
				@Pc(107) int local107 = arg0;
				for (@Pc(109) int local109 = 0; local109 < local70; local109++) {
					for (@Pc(113) int local113 = 0; local113 < local66; local113++) {
						@Pc(120) int local120 = local72[local102++];
						@Pc(125) int local125 = local72[local107++];
						@Pc(130) int local130 = local72[local102++];
						@Pc(136) int local136 = local120 >> 16 & 0xFF;
						@Pc(140) int local140 = local120 & 0xFF;
						@Pc(146) int local146 = local120 >> 24 & 0xFF;
						@Pc(151) int local151 = local72[local107++];
						@Pc(157) int local157 = local120 >> 8 & 0xFF;
						@Pc(163) int local163 = local140 + (local130 & 0xFF);
						@Pc(171) int local171 = local146 + (local130 >> 24 & 0xFF);
						@Pc(179) int local179 = local157 + (local130 >> 8 & 0xFF);
						@Pc(187) int local187 = local136 + (local130 >> 16 & 0xFF);
						@Pc(193) int local193 = local163 + (local125 & 0xFF);
						@Pc(201) int local201 = local187 + (local125 >> 16 & 0xFF);
						@Pc(209) int local209 = local171 + (local125 >> 24 & 0xFF);
						@Pc(217) int local217 = local179 + (local125 >> 8 & 0xFF);
						@Pc(225) int local225 = local217 + (local151 >> 8 & 0xFF);
						@Pc(231) int local231 = local193 + (local151 & 0xFF);
						@Pc(239) int local239 = local209 + (local151 >> 24 & 0xFF);
						@Pc(247) int local247 = local201 + (local151 >> 16 & 0xFF);
						local77[local100++] = local231 >> 2 & 0xFF | (local239 & 0x3FC) << 22 | (local247 & 0x3FC) << 14 | (local225 & 0x3FC) << 6;
					}
					local107 += arg0;
					local102 += arg0;
				}
				@Pc(292) int[] local292 = local77;
				local77 = local72;
				local72 = local292;
				arg3 = local70;
				arg0 = local66;
				local44++;
				local66 >>= 0x1;
				local70 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fu", name = "c", descriptor = "(I)V")
	private void method7052() {
		this.aClass100_Sub1_Sub2_12.method4876(this);
		if (this.aClass227_11 == Static85.aClass227_1) {
			OpenGL.glTexParameteri(this.anInt8494, 10241, this.aBoolean655 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt8494, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt8494, 10241, this.aBoolean655 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt8494, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!fu", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7061();
		super.finalize();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(II[BIB)V")
	protected final void method7053(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3) {
		if (arg1 > 0 && !Static19.method380(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg3 <= 0 || Static19.method380(arg3)) {
			@Pc(38) int local38 = this.aClass88_14.anInt2256;
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg3 > arg1 ? arg1 : arg3;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(59) int local59 = arg3 >> 1;
			@Pc(61) byte[] local61 = arg2;
			@Pc(68) byte[] local68 = new byte[local59 * local55 * local38];
			while (true) {
				OpenGL.glTexImage2Dub(arg0, local40, this.method7057(), arg1, arg3, 0, Static314.method7316(this.aClass88_14), 5121, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(92) int local92 = arg1 * local38;
				@Pc(94) byte[] local94 = local68;
				for (@Pc(96) int local96 = 0; local96 < local38; local96++) {
					@Pc(100) int local100 = local96;
					@Pc(102) int local102 = local96;
					@Pc(106) int local106 = local92 + local96;
					for (@Pc(108) int local108 = 0; local108 < local59; local108++) {
						for (@Pc(112) int local112 = 0; local112 < local55; local112++) {
							@Pc(118) byte local118 = local61[local102];
							local102 += local38;
							@Pc(128) int local128 = local118 + local61[local102];
							local102 += local38;
							@Pc(138) int local138 = local128 + local61[local106];
							local106 += local38;
							@Pc(148) int local148 = local138 + local61[local106];
							local68[local100] = (byte) (local148 >> 2);
							local106 += local38;
							local100 += local38;
						}
						local106 += local92;
						local102 += local92;
					}
				}
				local68 = local61;
				arg1 = local55;
				local61 = local94;
				arg3 = local59;
				local40++;
				local51 >>= 0x1;
				local59 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IB)V")
	private void method7055() {
		this.aClass100_Sub1_Sub2_12.anInt5751 += this.method7062();
	}

	@OriginalMember(owner = "client!fu", name = "e", descriptor = "(I)I")
	protected final int method7057() {
		if (this.aClass42_20 == Static47.aClass42_4) {
			if (Static530.aClass88_15 == this.aClass88_14) {
				return 6407;
			}
			if (this.aClass88_14 == Static356.aClass88_11) {
				return 6408;
			}
			if (Static104.aClass88_3 == this.aClass88_14) {
				return 6406;
			}
			if (this.aClass88_14 == Static242.aClass88_10) {
				return 6409;
			}
			if (this.aClass88_14 == Static5.aClass88_1) {
				return 6410;
			}
			if (this.aClass88_14 == Static103.aClass88_2) {
				return 6145;
			}
		} else if (Static47.aClass42_7 == this.aClass42_20) {
			if (this.aClass88_14 == Static530.aClass88_15) {
				return 34843;
			}
			if (Static356.aClass88_11 == this.aClass88_14) {
				return 34842;
			}
			if (Static104.aClass88_3 == this.aClass88_14) {
				return 34844;
			}
			if (this.aClass88_14 == Static242.aClass88_10) {
				return 34846;
			}
			if (Static5.aClass88_1 == this.aClass88_14) {
				return 34847;
			}
			if (this.aClass88_14 == Static103.aClass88_2) {
				return 6145;
			}
		} else if (Static47.aClass42_8 == this.aClass42_20) {
			if (Static530.aClass88_15 == this.aClass88_14) {
				return 34837;
			}
			if (this.aClass88_14 == Static356.aClass88_11) {
				return 34836;
			}
			if (Static104.aClass88_3 == this.aClass88_14) {
				return 34838;
			}
			if (this.aClass88_14 == Static242.aClass88_10) {
				return 34840;
			}
			if (Static5.aClass88_1 == this.aClass88_14) {
				return 34841;
			}
			if (Static103.aClass88_2 == this.aClass88_14) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lclient!mv;I)V")
	@Override
	public final void method7050(@OriginalArg(0) Class227 arg0) {
		if (arg0 != this.aClass227_11) {
			this.aClass227_11 = arg0;
			this.method7052();
		}
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V")
	@Override
	public final void method7049() {
		@Pc(14) int local14 = this.aClass100_Sub1_Sub2_12.method4830();
		@Pc(20) int local20 = this.aClass100_Sub1_Sub2_12.anIntArray415[local14];
		if (this.anInt8494 != local20) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt8494);
			this.aClass100_Sub1_Sub2_12.anIntArray415[local14] = this.anInt8494;
		}
		OpenGL.glBindTexture(this.anInt8494, this.anInt8485);
	}

	@OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIB[FI)V")
	protected final void method7059(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static19.method380(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static19.method380(arg0)) {
			@Pc(34) int local34 = this.aClass88_14.anInt2256;
			@Pc(36) int local36 = 0;
			@Pc(51) int local51 = arg1 < arg0 ? arg1 : arg0;
			@Pc(55) int local55 = arg1 >> 1;
			@Pc(59) int local59 = arg0 >> 1;
			@Pc(61) float[] local61 = arg2;
			@Pc(68) float[] local68 = new float[local55 * local59 * local34];
			while (true) {
				OpenGL.glTexImage2Df(arg3, local36, this.method7057(), arg1, arg0, 0, Static314.method7316(this.aClass88_14), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(94) int local94 = arg1 * local34;
				@Pc(96) float[] local96 = local68;
				for (@Pc(98) int local98 = 0; local98 < local34; local98++) {
					@Pc(102) int local102 = local98;
					@Pc(104) int local104 = local98;
					@Pc(109) int local109 = local98 + local94;
					for (@Pc(111) int local111 = 0; local111 < local59; local111++) {
						for (@Pc(115) int local115 = 0; local115 < local55; local115++) {
							@Pc(121) float local121 = local61[local104];
							local104 += local34;
							@Pc(131) float local131 = local121 + local61[local104];
							@Pc(137) float local137 = local131 + local61[local109];
							local104 += local34;
							local109 += local34;
							@Pc(151) float local151 = local137 + local61[local109];
							local68[local102] = local151 * 0.25F;
							local109 += local34;
							local102 += local34;
						}
						local104 += local94;
						local109 += local94;
					}
				}
				local68 = local61;
				arg1 = local55;
				arg0 = local59;
				local61 = local96;
				local36++;
				local59 >>= 0x1;
				local51 >>= 0x1;
				local55 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!fu", name = "b", descriptor = "(B)V")
	private void method7061() {
		if (this.anInt8485 > 0) {
			this.aClass100_Sub1_Sub2_12.method4888(this.anInt8485, this.method7062());
			this.anInt8485 = 0;
		}
	}

	@OriginalMember(owner = "client!fu", name = "f", descriptor = "(I)I")
	private int method7062() {
		@Pc(14) int local14 = this.anInt8489 * this.aClass42_20.anInt1131 * this.aClass88_14.anInt2256;
		return this.aBoolean655 ? local14 * 4 / 3 : local14;
	}
}
