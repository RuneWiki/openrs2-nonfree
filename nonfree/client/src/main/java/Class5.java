import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mm")
public abstract class Class5 implements Interface1 {

	@OriginalMember(owner = "client!mm", name = "w", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray5 = new Rectangle[100];

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "Lclient!tn;")
	private Class318 aClass318_10 = Static132.aClass318_4;

	@OriginalMember(owner = "client!mm", name = "h", descriptor = "I")
	protected final int anInt9565;

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "I")
	private final int anInt9563;

	@OriginalMember(owner = "client!mm", name = "p", descriptor = "Z")
	private final boolean aBoolean650;

	@OriginalMember(owner = "client!mm", name = "k", descriptor = "Lclient!jb;")
	protected final Class161 aClass161_18;

	@OriginalMember(owner = "client!mm", name = "t", descriptor = "Lclient!ad;")
	protected final Class7_Sub1_Sub1 aClass7_Sub1_Sub1_11;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "Lclient!qda;")
	protected final Class273 aClass273_17;

	@OriginalMember(owner = "client!mm", name = "i", descriptor = "I")
	private int anInt9566;

	static {
		for (@Pc(94) int local94 = 0; local94 < 100; local94++) {
			aRectangleArray5[local94] = new Rectangle();
		}
	}

	@OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lclient!ad;ILclient!jb;Lclient!qda;IZ)V")
	protected Class5(@OriginalArg(0) Class7_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class161 arg2, @OriginalArg(3) Class273 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		this.anInt9565 = arg1;
		this.anInt9563 = arg4;
		this.aBoolean650 = arg5;
		this.aClass161_18 = arg2;
		this.aClass7_Sub1_Sub1_11 = arg0;
		this.aClass273_17 = arg3;
		OpenGL.glGenTextures(1, Static553.anIntArray569, 0);
		this.anInt9566 = Static553.anIntArray569[0];
		this.method7367();
		this.method7368();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IBI[II)V")
	protected final void method7360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 > 0 && !Static32.method1002(arg3)) {
			throw new IllegalArgumentException("");
		} else if (arg1 > 0 && !Static32.method1002(arg1)) {
			throw new IllegalArgumentException("");
		} else if (Static151.aClass161_6 == this.aClass161_18) {
			@Pc(41) int local41 = 0;
			@Pc(59) int local59 = arg3 < arg1 ? arg3 : arg1;
			@Pc(63) int local63 = arg3 >> 1;
			@Pc(67) int local67 = arg1 >> 1;
			@Pc(69) int[] local69 = arg2;
			@Pc(74) int[] local74 = new int[local63 * local67];
			while (true) {
				OpenGL.glTexImage2Di(arg0, local41, this.method7363(), arg3, arg1, 0, 32993, this.aClass7_Sub1_Sub1_11.anInt721, local69, 0);
				if (local59 <= 1) {
					return;
				}
				@Pc(96) int local96 = 0;
				@Pc(98) int local98 = 0;
				@Pc(102) int local102 = arg3;
				for (@Pc(104) int local104 = 0; local104 < local67; local104++) {
					for (@Pc(108) int local108 = 0; local108 < local63; local108++) {
						@Pc(115) int local115 = local69[local98++];
						@Pc(120) int local120 = local69[local102++];
						@Pc(125) int local125 = local69[local98++];
						@Pc(131) int local131 = local115 >> 24 & 0xFF;
						@Pc(137) int local137 = local115 >> 8 & 0xFF;
						@Pc(143) int local143 = local115 >> 16 & 0xFF;
						@Pc(148) int local148 = local69[local102++];
						@Pc(152) int local152 = local115 & 0xFF;
						@Pc(160) int local160 = local131 + (local125 >> 24 & 0xFF);
						@Pc(166) int local166 = local152 + (local125 & 0xFF);
						@Pc(174) int local174 = local143 + (local125 >> 16 & 0xFF);
						@Pc(182) int local182 = local137 + (local125 >> 8 & 0xFF);
						@Pc(188) int local188 = local166 + (local120 & 0xFF);
						@Pc(196) int local196 = local174 + (local120 >> 16 & 0xFF);
						@Pc(204) int local204 = local160 + (local120 >> 24 & 0xFF);
						@Pc(212) int local212 = local182 + (local120 >> 8 & 0xFF);
						@Pc(220) int local220 = local204 + (local148 >> 24 & 0xFF);
						@Pc(226) int local226 = local188 + (local148 & 0xFF);
						@Pc(234) int local234 = local212 + (local148 >> 8 & 0xFF);
						@Pc(242) int local242 = local196 + (local148 >> 16 & 0xFF);
						local74[local96++] = local226 >> 2 & 0xFF | (local220 & 0x3FC) << 22 | (local242 & 0x3FC) << 14 | (local234 & 0x3FC) << 6;
					}
					local98 += arg3;
					local102 += arg3;
				}
				@Pc(291) int[] local291 = local74;
				local74 = local69;
				arg1 = local67;
				arg3 = local63;
				local69 = local291;
				local67 >>= 0x1;
				local59 >>= 0x1;
				local63 >>= 0x1;
				local41++;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(BLclient!tn;)V")
	@Override
	public final void method7869(@OriginalArg(1) Class318 arg0) {
		if (arg0 != this.aClass318_10) {
			this.aClass318_10 = arg0;
			this.method7367();
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II[BZI)V")
	protected final void method7362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 > 0 && !Static32.method1002(arg1)) {
			throw new IllegalArgumentException("");
		} else if (arg0 <= 0 || Static32.method1002(arg0)) {
			@Pc(34) int local34 = this.aClass161_18.anInt4901;
			@Pc(36) int local36 = 0;
			@Pc(43) int local43 = arg1 >= arg0 ? arg0 : arg1;
			@Pc(47) int local47 = arg1 >> 1;
			@Pc(51) int local51 = arg0 >> 1;
			@Pc(53) byte[] local53 = arg2;
			@Pc(66) byte[] local66 = new byte[local51 * local47 * local34];
			while (true) {
				OpenGL.glTexImage2Dub(arg3, local36, this.method7363(), arg1, arg0, 0, Static546.method7654(this.aClass161_18), 5121, local53, 0);
				if (local43 <= 1) {
					return;
				}
				@Pc(91) int local91 = arg1 * local34;
				for (@Pc(93) int local93 = 0; local93 < local34; local93++) {
					@Pc(97) int local97 = local93;
					@Pc(99) int local99 = local93;
					@Pc(103) int local103 = local91 + local93;
					for (@Pc(105) int local105 = 0; local105 < local51; local105++) {
						for (@Pc(109) int local109 = 0; local109 < local47; local109++) {
							@Pc(115) byte local115 = local53[local99];
							local99 += local34;
							@Pc(125) int local125 = local115 + local53[local99];
							@Pc(131) int local131 = local125 + local53[local103];
							local99 += local34;
							local103 += local34;
							@Pc(145) int local145 = local131 + local53[local103];
							local103 += local34;
							local66[local97] = (byte) (local145 >> 2);
							local97 += local34;
						}
						local99 += local91;
						local103 += local91;
					}
				}
				@Pc(186) byte[] local186 = local66;
				local66 = local53;
				arg0 = local51;
				local53 = local186;
				arg1 = local47;
				local51 >>= 0x1;
				local36++;
				local43 >>= 0x1;
				local47 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)I")
	protected final int method7363() {
		if (this.aClass273_17 == Static424.aClass273_12) {
			if (this.aClass161_18 == Static72.aClass161_4) {
				return 6407;
			}
			if (Static151.aClass161_6 == this.aClass161_18) {
				return 6408;
			}
			if (Static129.aClass161_5 == this.aClass161_18) {
				return 6406;
			}
			if (Static206.aClass161_20 == this.aClass161_18) {
				return 6409;
			}
			if (this.aClass161_18 == Static470.aClass161_16) {
				return 6410;
			}
			if (Static1.aClass161_12 == this.aClass161_18) {
				return 6145;
			}
		} else if (Static424.aClass273_15 == this.aClass273_17) {
			if (Static72.aClass161_4 == this.aClass161_18) {
				return 34843;
			}
			if (this.aClass161_18 == Static151.aClass161_6) {
				return 34842;
			}
			if (this.aClass161_18 == Static129.aClass161_5) {
				return 34844;
			}
			if (Static206.aClass161_20 == this.aClass161_18) {
				return 34846;
			}
			if (Static470.aClass161_16 == this.aClass161_18) {
				return 34847;
			}
			if (this.aClass161_18 == Static1.aClass161_12) {
				return 6145;
			}
		} else if (this.aClass273_17 == Static424.aClass273_16) {
			if (Static72.aClass161_4 == this.aClass161_18) {
				return 34837;
			}
			if (Static151.aClass161_6 == this.aClass161_18) {
				return 34836;
			}
			if (this.aClass161_18 == Static129.aClass161_5) {
				return 34838;
			}
			if (this.aClass161_18 == Static206.aClass161_20) {
				return 34840;
			}
			if (Static470.aClass161_16 == this.aClass161_18) {
				return 34841;
			}
			if (Static1.aClass161_12 == this.aClass161_18) {
				return 6145;
			}
		}
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII[F)V")
	protected final void method7365(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) float[] arg3) {
		if (arg0 > 0 && !Static32.method1002(arg0)) {
			throw new IllegalArgumentException("");
		} else if (arg2 <= 0 || Static32.method1002(arg2)) {
			@Pc(31) int local31 = this.aClass161_18.anInt4901;
			@Pc(40) int local40 = 0;
			@Pc(51) int local51 = arg2 > arg0 ? arg0 : arg2;
			@Pc(55) int local55 = arg0 >> 1;
			@Pc(59) int local59 = arg2 >> 1;
			@Pc(61) float[] local61 = arg3;
			@Pc(68) float[] local68 = new float[local31 * local55 * local59];
			while (true) {
				OpenGL.glTexImage2Df(arg1, local40, this.method7363(), arg0, arg2, 0, Static546.method7654(this.aClass161_18), 5126, local61, 0);
				if (local51 <= 1) {
					return;
				}
				@Pc(92) int local92 = local31 * arg0;
				for (@Pc(94) int local94 = 0; local94 < local31; local94++) {
					@Pc(98) int local98 = local94;
					@Pc(100) int local100 = local94;
					@Pc(104) int local104 = local92 + local94;
					for (@Pc(106) int local106 = 0; local106 < local59; local106++) {
						for (@Pc(110) int local110 = 0; local110 < local55; local110++) {
							@Pc(116) float local116 = local61[local100];
							local100 += local31;
							@Pc(126) float local126 = local116 + local61[local100];
							@Pc(132) float local132 = local126 + local61[local104];
							local100 += local31;
							local104 += local31;
							@Pc(146) float local146 = local132 + local61[local104];
							local104 += local31;
							local68[local98] = local146 * 0.25F;
							local98 += local31;
						}
						local100 += local92;
						local104 += local92;
					}
				}
				@Pc(182) float[] local182 = local68;
				local68 = local61;
				arg2 = local59;
				arg0 = local55;
				local61 = local182;
				local59 >>= 0x1;
				local55 >>= 0x1;
				local40++;
				local51 >>= 0x1;
			}
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!mm", name = "f", descriptor = "(I)I")
	private int method7366() {
		@Pc(20) int local20 = this.aClass161_18.anInt4901 * this.aClass273_17.anInt8146 * this.anInt9563;
		return this.aBoolean650 ? local20 * 4 / 3 : local20;
	}

	@OriginalMember(owner = "client!mm", name = "g", descriptor = "(I)V")
	private void method7367() {
		this.aClass7_Sub1_Sub1_11.method5694(this);
		if (Static132.aClass318_4 == this.aClass318_10) {
			OpenGL.glTexParameteri(this.anInt9565, 10241, this.aBoolean650 ? 9987 : 9729);
			OpenGL.glTexParameteri(this.anInt9565, 10240, 9729);
		} else {
			OpenGL.glTexParameteri(this.anInt9565, 10241, this.aBoolean650 ? 9984 : 9728);
			OpenGL.glTexParameteri(this.anInt9565, 10240, 9728);
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
	private void method7368() {
		this.aClass7_Sub1_Sub1_11.anInt7341 += this.method7366();
	}

	@OriginalMember(owner = "client!mm", name = "finalize", descriptor = "()V")
	@Override
	public final void finalize() throws Throwable {
		this.method7369();
		super.finalize();
	}

	@OriginalMember(owner = "client!mm", name = "b", descriptor = "(B)V")
	private void method7369() {
		if (this.anInt9566 > 0) {
			this.aClass7_Sub1_Sub1_11.method632(this.method7366(), this.anInt9566);
			this.anInt9566 = 0;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(I)V")
	@Override
	public final void method7871() {
		@Pc(14) int local14 = this.aClass7_Sub1_Sub1_11.method5670();
		@Pc(20) int local20 = this.aClass7_Sub1_Sub1_11.anIntArray10[local14];
		if (this.anInt9565 != local20) {
			if (local20 != 0) {
				OpenGL.glBindTexture(local20, 0);
				OpenGL.glDisable(local20);
			}
			OpenGL.glEnable(this.anInt9565);
			this.aClass7_Sub1_Sub1_11.anIntArray10[local14] = this.anInt9565;
		}
		OpenGL.glBindTexture(this.anInt9565, this.anInt9566);
	}
}
