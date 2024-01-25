import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class4_Sub48 extends Class4 {

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer7;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "Lclient!rba;")
	private Class284 aClass284_16;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "Lclient!sm;")
	private final Class83_Sub3 aClass83_Sub3_3;

	@OriginalMember(owner = "client!ut", name = "k", descriptor = "I")
	public final int anInt9649;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "[I")
	private final int[] anIntArray517;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
	public final int anInt9654;

	@OriginalMember(owner = "client!ut", name = "q", descriptor = "F")
	public final float aFloat222;

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_43;

	@OriginalMember(owner = "client!ut", name = "n", descriptor = "I")
	public final int anInt9652;

	@OriginalMember(owner = "client!ut", name = "r", descriptor = "I")
	public final int anInt9655;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "Lclient!tf;")
	private final Class21_Sub2 aClass21_Sub2_2;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!sm;IIIII)V")
	public Class4_Sub48(@OriginalArg(0) Class83_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass83_Sub3_3 = arg0;
		this.anInt9649 = arg5;
		this.anIntArray517 = new int[this.aClass83_Sub3_3.anInt8829 * this.aClass83_Sub3_3.anInt8830];
		this.anInt9654 = arg3;
		this.aFloat222 = arg2;
		this.aClass44_Sub3_43 = this.aClass83_Sub3_3.aClass44_Sub3_38;
		this.anInt9652 = arg1;
		this.anInt9655 = arg4;
		this.aClass21_Sub2_2 = new Class21_Sub2(this.aClass44_Sub3_43, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(BI)V")
	public void method7884(@OriginalArg(1) int arg0) {
		this.aStream6.c(arg0 * 4 + 3);
		this.aStream6.d(-1);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIII)V")
	public void method7885(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray517[arg2 + this.aClass83_Sub3_3.anInt8829 * arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIZFI)V")
	public void method7886(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(27) int local27;
		@Pc(50) int local50;
		if (this.anInt9652 != -1) {
			@Pc(22) Class14 local22 = this.aClass44_Sub3_43.anInterface11_11.method7405(this.anInt9652);
			local27 = local22.aByte7 & 0xFF;
			@Pc(72) int local72;
			if (local27 != 0 && local22.aByte9 != 4) {
				if (arg0 < 0) {
					local50 = 0;
				} else if (arg0 <= 127) {
					local50 = arg0 * 131586;
				} else {
					local50 = 16777215;
				}
				if (local27 == 256) {
					arg3 = local50;
				} else {
					local72 = 256 - local27;
					arg3 = (local27 * (local50 & 0xFF00) + (arg3 & 0xFF00) * local72 & 0xFF0000) + ((local50 & 0xFF00FF) * local27 + ((arg3 & 0xFF00FF) * local72) & 0xFF00FF00) >> 8;
				}
			}
			local50 = local22.aByte8 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(119) int local119 = (arg3 >> 16 & 0xFF) * local50;
				if (local119 > 65535) {
					local119 = 65535;
				}
				local72 = (arg3 >> 8 & 0xFF) * local50;
				if (local72 > 65535) {
					local72 = 65535;
				}
				@Pc(145) int local145 = (arg3 & 0xFF) * local50;
				if (local145 > 65535) {
					local145 = 65535;
				}
				arg3 = (local145 >> 8) + ((local119 << 8 & 0xFF0069) + (local72 & 0xFF00));
			}
		}
		this.aStream6.c(arg1 * 4);
		if (arg2 != 1.0F) {
			@Pc(181) int local181 = arg3 >> 16 & 0xFF;
			local27 = arg3 >> 8 & 0xFF;
			local50 = arg3 & 0xFF;
			local181 = (int) ((float) local181 * arg2);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local27 = (int) ((float) local27 * arg2);
			local50 = (int) ((float) local50 * arg2);
			if (local27 < 0) {
				local27 = 0;
			} else if (local27 > 255) {
				local27 = 255;
			}
			if (local50 < 0) {
				local50 = 0;
			} else if (local50 > 255) {
				local50 = 255;
			}
			arg3 = local27 << 8 | local181 << 16 | local50;
		}
		this.aStream6.d((byte) (arg3 >> 16));
		this.aStream6.d((byte) (arg3 >> 8));
		this.aStream6.d((byte) arg3);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I[II)V")
	public void method7888(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class4_Sub11_Sub2 local11 = this.aClass44_Sub3_43.aClass4_Sub11_Sub2_2;
		local11.anInt5831 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass44_Sub3_43.aBoolean399) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass83_Sub3_3.aShortArrayArray10[local26];
				local37 = this.anIntArray517[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((0x1 << local43++ & local37) == 0) {
							local45 += 3;
						} else {
							local11.method4937(local32[local45++] & 0xFFFF);
							local7++;
							local11.method4937(local32[local45++] & 0xFFFF);
							local7++;
							local11.method4937(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local32 = this.aClass83_Sub3_3.aShortArrayArray10[local26];
				local37 = this.anIntArray517[local26];
				if (local37 != 0 && local32 != null) {
					local43 = 0;
					local45 = 0;
					while (local32.length > local45) {
						if ((0x1 << local43++ & local37) == 0) {
							local45 += 3;
						} else {
							local11.method4912(local32[local45++] & 0xFFFF);
							local7++;
							local7++;
							local11.method4912(local32[local45++] & 0xFFFF);
							local11.method4912(local32[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass21_Sub2_2.method7399(local11.aByteArray68, local11.anInt5831);
		this.aClass44_Sub3_43.method4633(this.aClass83_Sub3_3.aClass284_13, this.aClass83_Sub3_3.aClass284_15, this.aClass83_Sub3_3.aClass284_12, this.aClass284_16);
		this.aClass44_Sub3_43.method4681((this.aClass83_Sub3_3.anInt8852 & 0x7) != 0, this.anInt9652, (this.aClass83_Sub3_3.anInt8852 & 0x8) != 0);
		if (this.aClass44_Sub3_43.aBoolean408) {
			this.aClass44_Sub3_43.YA(Integer.MAX_VALUE, this.anInt9654, this.anInt9655, this.anInt9649);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat222, 1.0F / this.aFloat222, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass44_Sub3_43.method4633(this.aClass83_Sub3_3.aClass284_13, this.aClass83_Sub3_3.aClass284_15, this.aClass83_Sub3_3.aClass284_12, this.aClass284_16);
		this.aClass44_Sub3_43.method4657(local7, 0, this.aClass21_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)V")
	public void method7889(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer7 = this.aClass44_Sub3_43.aNativeHeap6.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer7);
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(BI)V")
	public void method7891(@OriginalArg(1) int arg0) {
		this.aStream6.a();
		@Pc(26) Interface10 local26 = this.aClass44_Sub3_43.method4607(arg0 * 4, 4, this.aNativeHeapBuffer7);
		this.aClass284_16 = new Class284(local26, 5121, 4, 0);
		this.aStream6 = null;
		this.aNativeHeapBuffer7 = null;
	}
}
