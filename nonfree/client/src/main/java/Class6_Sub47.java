import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public final class Class6_Sub47 extends Class6 {

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!tw", name = "u", descriptor = "Lclient!cm;")
	private Class53 aClass53_16;

	@OriginalMember(owner = "client!tw", name = "v", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!tw", name = "B", descriptor = "Lclient!le;")
	private final Class60_Sub2 aClass60_Sub2_3;

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "I")
	public final int anInt8324;

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_38;

	@OriginalMember(owner = "client!tw", name = "k", descriptor = "I")
	public final int anInt8317;

	@OriginalMember(owner = "client!tw", name = "D", descriptor = "F")
	public final float aFloat176;

	@OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
	public final int anInt8325;

	@OriginalMember(owner = "client!tw", name = "C", descriptor = "I")
	public final int anInt8327;

	@OriginalMember(owner = "client!tw", name = "y", descriptor = "[I")
	private final int[] anIntArray648;

	@OriginalMember(owner = "client!tw", name = "A", descriptor = "Lclient!fw;")
	private final Class113_Sub1 aClass113_Sub1_2;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Lclient!le;IIIII)V")
	public Class6_Sub47(@OriginalArg(0) Class60_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass60_Sub2_3 = arg0;
		this.anInt8324 = arg1;
		this.aClass121_Sub3_38 = this.aClass60_Sub2_3.aClass121_Sub3_25;
		this.anInt8317 = arg5;
		this.aFloat176 = arg2;
		this.anInt8325 = arg3;
		this.anInt8327 = arg4;
		this.anIntArray648 = new int[this.aClass60_Sub2_3.anInt9656 * this.aClass60_Sub2_3.anInt9657];
		this.aClass113_Sub1_2 = new Class113_Sub1(this.aClass121_Sub3_38, 5123, null, 1);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(II)V")
	public void method6895(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass121_Sub3_38.aNativeHeap5.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(BI)V")
	public void method6896(@OriginalArg(1) int arg0) {
		this.aStream6.c();
		@Pc(18) Interface2 local18 = this.aClass121_Sub3_38.method5705(this.aNativeHeapBuffer6, arg0 * 4, 4);
		this.aClass53_16 = new Class53(local18, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer6 = null;
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IB)V")
	public void method6897(@OriginalArg(0) int arg0) {
		this.aStream6.e(arg0 * 4 + 3);
		this.aStream6.c(-1);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(I[IZ)V")
	public void method6899(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6_Sub14_Sub1 local11 = this.aClass121_Sub3_38.aClass6_Sub14_Sub1_3;
		local11.anInt7244 = 0;
		@Pc(37) short[] local37;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass121_Sub3_38.aBoolean458) {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local31 = this.anIntArray648[local26];
				local37 = this.aClass60_Sub2_3.aShortArrayArray10[local26];
				if (local31 != 0 && local37 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local37.length) {
						if ((local31 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local7++;
							local11.method5999(local37[local45++] & 0xFFFF);
							local7++;
							local11.method5999(local37[local45++] & 0xFFFF);
							local7++;
							local11.method5999(local37[local45++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg0; local20++) {
				local26 = arg1[local20];
				local31 = this.anIntArray648[local26];
				local37 = this.aClass60_Sub2_3.aShortArrayArray10[local26];
				if (local31 != 0 && local37 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local37.length) {
						if ((local31 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local11.method6038(local37[local45++] & 0xFFFF);
							local7++;
							local11.method6038(local37[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method6038(local37[local45++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass113_Sub1_2.method6484(local11.aByteArray88, local11.anInt7244);
		this.aClass121_Sub3_38.method5727(this.aClass60_Sub2_3.aClass53_10, this.aClass60_Sub2_3.aClass53_13, this.aClass60_Sub2_3.aClass53_11, this.aClass53_16);
		this.aClass121_Sub3_38.method5681((this.aClass60_Sub2_3.anInt4651 & 0x7) != 0, (this.aClass60_Sub2_3.anInt4651 & 0x8) != 0, this.anInt8324);
		if (this.aClass121_Sub3_38.aBoolean461) {
			this.aClass121_Sub3_38.LA(Integer.MAX_VALUE, this.anInt8325, this.anInt8327, this.anInt8317);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat176, 1.0F / this.aFloat176, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass121_Sub3_38.method5727(this.aClass60_Sub2_3.aClass53_10, this.aClass60_Sub2_3.aClass53_13, this.aClass60_Sub2_3.aClass53_11, this.aClass53_16);
		this.aClass121_Sub3_38.method5657(local7, 0, this.aClass113_Sub1_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIFII)V")
	public void method6900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(42) int local42;
		if (this.anInt8324 != -1) {
			@Pc(17) Class76 local17 = this.aClass121_Sub3_38.anInterface7_14.method5209(this.anInt8324);
			local22 = local17.aByte23 & 0xFF;
			@Pc(61) int local61;
			if (local22 != 0 && local17.aByte24 != 4) {
				if (arg3 < 0) {
					local42 = 0;
				} else if (arg3 > 127) {
					local42 = 16777215;
				} else {
					local42 = arg3 * 131586;
				}
				if (local22 == 256) {
					arg1 = local42;
				} else {
					local61 = 256 - local22;
					arg1 = ((arg1 & 0xFF00FF) * local61 + (local42 & 0xFF00FF) * local22 & 0xFF00FF00) + (local61 * (arg1 & 0xFF00) + (local42 & 0xFF00) * local22 & 0xFF0000) >> 8;
				}
			}
			local42 = local17.aByte21 & 0xFF;
			if (local42 != 0) {
				local42 += 256;
				@Pc(112) int local112 = (arg1 >> 16 & 0xFF) * local42;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local61 = (arg1 >> 8 & 0xFF) * local42;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(136) int local136 = local42 * (arg1 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg1 = (local136 >> 8) + (local61 & 0xFF00) + (local112 << 8 & 0xFF00AE);
			}
		}
		this.aStream6.e(arg0 * 4);
		if (arg2 != 1.0F) {
			@Pc(177) int local177 = arg1 >> 16 & 0xFF;
			local22 = arg1 >> 8 & 0xFF;
			local177 = (int) ((float) local177 * arg2);
			local42 = arg1 & 0xFF;
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local22 = (int) ((float) local22 * arg2);
			local42 = (int) ((float) local42 * arg2);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local42 < 0) {
				local42 = 0;
			} else if (local42 > 255) {
				local42 = 255;
			}
			arg1 = local22 << 8 | local177 << 16 | local42;
		}
		this.aStream6.c((byte) (arg1 >> 16));
		this.aStream6.c((byte) (arg1 >> 8));
		this.aStream6.c((byte) arg1);
	}

	@OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)V")
	public void method6902(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray648[arg1 + arg0 * this.aClass60_Sub2_3.anInt9656] |= 0x1 << arg2;
	}
}
