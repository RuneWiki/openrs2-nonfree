import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Lclient!mk;")
	private Class208 aClass208_10;

	@OriginalMember(owner = "client!pf", name = "E", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer6;

	@OriginalMember(owner = "client!pf", name = "J", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream6;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "Lclient!tv;")
	private final Class127_Sub2 aClass127_Sub2_2;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "I")
	public final int anInt7356;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_33;

	@OriginalMember(owner = "client!pf", name = "u", descriptor = "F")
	public final float aFloat158;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	public final int anInt7359;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "I")
	public final int anInt7361;

	@OriginalMember(owner = "client!pf", name = "D", descriptor = "[I")
	private final int[] anIntArray416;

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "I")
	public final int anInt7357;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Lclient!lda;")
	private final Class166_Sub2 aClass166_Sub2_2;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!tv;IIIII)V")
	public Class3_Sub41(@OriginalArg(0) Class127_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass127_Sub2_2 = arg0;
		this.anInt7356 = arg1;
		this.aClass31_Sub2_33 = this.aClass127_Sub2_2.aClass31_Sub2_41;
		this.aFloat158 = arg2;
		this.anInt7359 = arg4;
		this.anInt7361 = arg5;
		this.anIntArray416 = new int[this.aClass127_Sub2_2.anInt10007 * this.aClass127_Sub2_2.anInt10004];
		this.anInt7357 = arg3;
		this.aClass166_Sub2_2 = new Class166_Sub2(this.aClass31_Sub2_33, 5123, null, 1);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)V")
	public void method5752(@OriginalArg(1) int arg0) {
		this.aStream6.c();
		@Pc(24) Interface22 local24 = this.aClass31_Sub2_33.method2575(this.aNativeHeapBuffer6, 4, arg0 * 4);
		this.aClass208_10 = new Class208(local24, 5121, 4, 0);
		this.aNativeHeapBuffer6 = null;
		this.aStream6 = null;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IFIIB)V")
	public void method5753(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(34) int local34;
		if (this.anInt7356 != -1) {
			@Pc(14) Class172 local14 = this.aClass31_Sub2_33.anInterface4_14.method7229(this.anInt7356);
			local19 = local14.aByte61 & 0xFF;
			@Pc(58) int local58;
			if (local19 != 0 && local14.aByte62 != 4) {
				if (arg3 < 0) {
					local34 = 0;
				} else if (arg3 <= 127) {
					local34 = arg3 * 131586;
				} else {
					local34 = 16777215;
				}
				if (local19 == 256) {
					arg2 = local34;
				} else {
					local58 = 256 - local19;
					arg2 = ((arg2 & 0xFF00FF) * local58 + local19 * (local34 & 0xFF00FF) & 0xFF00FF00) + (local58 * (arg2 & 0xFF00) + (local34 & 0xFF00) * local19 & 0xFF0000) >> 8;
				}
			}
			local34 = local14.aByte58 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(108) int local108 = (arg2 >> 16 & 0xFF) * local34;
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = (arg2 >> 8 & 0xFF) * local34;
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(136) int local136 = local34 * (arg2 & 0xFF);
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg2 = ((local108 & 0xA100FF00) << 8) + (local58 & 0xFF00) + (local136 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(170) int local170 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local170 = (int) ((float) local170 * arg1);
			local34 = arg2 & 0xFF;
			local19 = (int) ((float) local19 * arg1);
			if (local170 < 0) {
				local170 = 0;
			} else if (local170 > 255) {
				local170 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local34 = (int) ((float) local34 * arg1);
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg2 = local170 << 16 | local19 << 8 | local34;
		}
		this.aStream6.a(arg0 * 4);
		this.aStream6.f((byte) (arg2 >> 16));
		this.aStream6.f((byte) (arg2 >> 8));
		this.aStream6.f((byte) arg2);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIBI)V")
	public void method5754(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray416[arg1 + arg2 * this.aClass127_Sub2_2.anInt10004] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)V")
	public void method5755(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer6 = this.aClass31_Sub2_33.aNativeHeap4.a(arg0 * 4, true);
		this.aStream6 = new Stream(this.aNativeHeapBuffer6);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "([III)V")
	public void method5756(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub26_Sub2 local11 = this.aClass31_Sub2_33.aClass3_Sub26_Sub2_2;
		local11.anInt8703 = 0;
		@Pc(37) short[] local37;
		@Pc(26) int local26;
		@Pc(31) int local31;
		@Pc(20) int local20;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass31_Sub2_33.aBoolean216) {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local37 = this.aClass127_Sub2_2.aShortArrayArray8[local26];
				local31 = this.anIntArray416[local26];
				if (local31 != 0 && local37 != null) {
					local43 = 0;
					local45 = 0;
					while (local37.length > local45) {
						if ((0x1 << local43++ & local31) == 0) {
							local45 += 3;
						} else {
							local7++;
							local11.method6769(local37[local45++] & 0xFFFF);
							local7++;
							local11.method6769(local37[local45++] & 0xFFFF);
							local11.method6769(local37[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local20 = 0; local20 < arg1; local20++) {
				local26 = arg0[local20];
				local31 = this.anIntArray416[local26];
				local37 = this.aClass127_Sub2_2.aShortArrayArray8[local26];
				if (local31 != 0 && local37 != null) {
					local43 = 0;
					local45 = 0;
					while (local37.length > local45) {
						if ((local31 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local11.method6793(local37[local45++] & 0xFFFF);
							local7++;
							local11.method6793(local37[local45++] & 0xFFFF);
							local7++;
							local11.method6793(local37[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass166_Sub2_2.method5869(local11.anInt8703, local11.aByteArray213);
		this.aClass31_Sub2_33.method2537(this.aClass127_Sub2_2.aClass208_14, this.aClass208_10, this.aClass127_Sub2_2.aClass208_13, this.aClass127_Sub2_2.aClass208_12);
		this.aClass31_Sub2_33.method2540((this.aClass127_Sub2_2.anInt9220 & 0x8) != 0, this.anInt7356, (this.aClass127_Sub2_2.anInt9220 & 0x7) != 0);
		if (this.aClass31_Sub2_33.aBoolean223) {
			this.aClass31_Sub2_33.YA(Integer.MAX_VALUE, this.anInt7357, this.anInt7359, this.anInt7361);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat158, 1.0F / this.aFloat158, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass31_Sub2_33.method2537(this.aClass127_Sub2_2.aClass208_14, this.aClass208_10, this.aClass127_Sub2_2.aClass208_13, this.aClass127_Sub2_2.aClass208_12);
		this.aClass31_Sub2_33.method2498(local7, 0, this.aClass166_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IZ)V")
	public void method5758(@OriginalArg(0) int arg0) {
		this.aStream6.a(arg0 * 4 + 3);
		this.aStream6.f(-1);
	}
}
