import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!vv;")
	private Class346 aClass346_4;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!ef", name = "C", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!ef", name = "D", descriptor = "Lclient!wo;")
	private final Class4_Sub3 aClass4_Sub3_1;

	@OriginalMember(owner = "client!ef", name = "F", descriptor = "I")
	public final int anInt2625;

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_10;

	@OriginalMember(owner = "client!ef", name = "v", descriptor = "F")
	public final float aFloat28;

	@OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
	public final int anInt2624;

	@OriginalMember(owner = "client!ef", name = "x", descriptor = "I")
	public final int anInt2622;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "[I")
	private final int[] anIntArray129;

	@OriginalMember(owner = "client!ef", name = "G", descriptor = "I")
	public final int anInt2626;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "Lclient!ur;")
	private final Class94_Sub2 aClass94_Sub2_1;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!wo;IIIII)V")
	public Class3_Sub13(@OriginalArg(0) Class4_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass4_Sub3_1 = arg0;
		this.anInt2625 = arg3;
		this.aClass15_Sub3_10 = this.aClass4_Sub3_1.aClass15_Sub3_44;
		this.aFloat28 = arg2;
		this.anInt2624 = arg1;
		this.anInt2622 = arg5;
		this.anIntArray129 = new int[this.aClass4_Sub3_1.anInt10459 * this.aClass4_Sub3_1.anInt10461];
		this.anInt2626 = arg4;
		this.aClass94_Sub2_1 = new Class94_Sub2(this.aClass15_Sub3_10, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
	public void method2307(@OriginalArg(1) int arg0) {
		this.aStream1.b(arg0 * 4 + 3);
		this.aStream1.c(-1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[IB)V")
	public void method2308(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(13) int local13 = 0;
		@Pc(17) Class3_Sub7_Sub2 local17 = this.aClass15_Sub3_10.aClass3_Sub7_Sub2_3;
		local17.anInt7869 = 0;
		@Pc(38) short[] local38;
		@Pc(32) int local32;
		@Pc(43) int local43;
		@Pc(26) int local26;
		@Pc(49) int local49;
		@Pc(51) int local51;
		if (this.aClass15_Sub3_10.aBoolean442) {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local43 = this.anIntArray129[local32];
				local38 = this.aClass4_Sub3_1.aShortArrayArray13[local32];
				if (local43 != 0 && local38 != null) {
					local49 = 0;
					local51 = 0;
					while (local51 < local38.length) {
						if ((local43 & 0x1 << local49++) == 0) {
							local51 += 3;
						} else {
							local13++;
							local17.method6528(local38[local51++] & 0xFFFF);
							local17.method6528(local38[local51++] & 0xFFFF);
							local13++;
							local13++;
							local17.method6528(local38[local51++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local26 = 0; local26 < arg0; local26++) {
				local32 = arg1[local26];
				local38 = this.aClass4_Sub3_1.aShortArrayArray13[local32];
				local43 = this.anIntArray129[local32];
				if (local43 != 0 && local38 != null) {
					local49 = 0;
					local51 = 0;
					while (local38.length > local51) {
						if ((local43 & 0x1 << local49++) == 0) {
							local51 += 3;
						} else {
							local17.method6498(local38[local51++] & 0xFFFF);
							local13++;
							local17.method6498(local38[local51++] & 0xFFFF);
							local13++;
							local17.method6498(local38[local51++] & 0xFFFF);
							local13++;
						}
					}
				}
			}
		}
		if (local13 <= 0) {
			return;
		}
		this.aClass94_Sub2_1.method7918(local17.aByteArray86, local17.anInt7869);
		this.aClass15_Sub3_10.method4409(this.aClass346_4, this.aClass4_Sub3_1.aClass346_16, this.aClass4_Sub3_1.aClass346_15, this.aClass4_Sub3_1.aClass346_13);
		this.aClass15_Sub3_10.method4425(this.anInt2624, (this.aClass4_Sub3_1.anInt10327 & 0x7) != 0, (this.aClass4_Sub3_1.anInt10327 & 0x8) != 0);
		if (this.aClass15_Sub3_10.aBoolean441) {
			this.aClass15_Sub3_10.LA(Integer.MAX_VALUE, this.anInt2625, this.anInt2626, this.anInt2622);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat28, 1.0F / this.aFloat28, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass15_Sub3_10.method4409(this.aClass346_4, this.aClass4_Sub3_1.aClass346_16, this.aClass4_Sub3_1.aClass346_15, this.aClass4_Sub3_1.aClass346_13);
		this.aClass15_Sub3_10.method4453(local13, this.aClass94_Sub2_1, 0);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
	public void method2309(@OriginalArg(1) int arg0) {
		this.aStream1.a();
		@Pc(18) Interface16 local18 = this.aClass15_Sub3_10.method4373(this.aNativeHeapBuffer1, 4, arg0 * 4);
		this.aClass346_4 = new Class346(local18, 5121, 4, 0);
		this.aNativeHeapBuffer1 = null;
		this.aStream1 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZII)V")
	public void method2310(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray129[this.aClass4_Sub3_1.anInt10461 * arg1 + arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIFII)V")
	public void method2311(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(31) int local31;
		@Pc(53) int local53;
		if (this.anInt2624 != -1) {
			@Pc(26) Class178 local26 = this.aClass15_Sub3_10.anInterface4_11.method3088(this.anInt2624);
			local31 = local26.aByte52 & 0xFF;
			@Pc(71) int local71;
			if (local31 != 0 && local26.aByte54 != 4) {
				if (arg0 < 0) {
					local53 = 0;
				} else if (arg0 <= 127) {
					local53 = arg0 * 131586;
				} else {
					local53 = 16777215;
				}
				if (local31 == 256) {
					arg3 = local53;
				} else {
					local71 = 256 - local31;
					arg3 = (local71 * (arg3 & 0xFF00) + local31 * (local53 & 0xFF00) & 0xFF0000) + ((local53 & 0xFF00FF) * local31 + (local71 * (arg3 & 0xFF00FF)) & 0xFF00FF00) >> 8;
				}
			}
			local53 = local26.aByte57 & 0xFF;
			if (local53 != 0) {
				local53 += 256;
				@Pc(122) int local122 = local53 * (arg3 >> 16 & 0xFF);
				if (local122 > 65535) {
					local122 = 65535;
				}
				local71 = (arg3 >> 8 & 0xFF) * local53;
				if (local71 > 65535) {
					local71 = 65535;
				}
				@Pc(146) int local146 = local53 * (arg3 & 0xFF);
				if (local146 > 65535) {
					local146 = 65535;
				}
				arg3 = (local146 >> 8) + (local71 & 0xFF00) + ((local122 & 0x8100FF00) << 8);
			}
		}
		this.aStream1.b(arg2 * 4);
		if (arg1 != 1.0F) {
			@Pc(183) int local183 = arg3 >> 16 & 0xFF;
			local31 = arg3 >> 8 & 0xFF;
			local183 = (int) ((float) local183 * arg1);
			local53 = arg3 & 0xFF;
			local31 = (int) ((float) local31 * arg1);
			if (local183 < 0) {
				local183 = 0;
			} else if (local183 > 255) {
				local183 = 255;
			}
			local53 = (int) ((float) local53 * arg1);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			if (local53 < 0) {
				local53 = 0;
			} else if (local53 > 255) {
				local53 = 255;
			}
			arg3 = local183 << 16 | local31 << 8 | local53;
		}
		this.aStream1.c((byte) (arg3 >> 16));
		this.aStream1.c((byte) (arg3 >> 8));
		this.aStream1.c((byte) arg3);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
	public void method2312(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass15_Sub3_10.aNativeHeap4.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1);
	}
}
