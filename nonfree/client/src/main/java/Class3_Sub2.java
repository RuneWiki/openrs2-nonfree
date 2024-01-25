import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream1;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer1;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!hea;")
	private Class126 aClass126_1;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!mea;")
	private final Class34_Sub3 aClass34_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
	public final int anInt117;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "[I")
	private final int[] anIntArray6;

	@OriginalMember(owner = "client!ac", name = "F", descriptor = "F")
	public final float aFloat1;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public final int anInt106;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
	public final int anInt109;

	@OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
	public final int anInt119;

	@OriginalMember(owner = "client!ac", name = "y", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_1;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "Lclient!gj;")
	private final Class111_Sub1 aClass111_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lclient!mea;IIIII)V")
	public Class3_Sub2(@OriginalArg(0) Class34_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass34_Sub3_1 = arg0;
		this.anInt117 = arg1;
		this.anIntArray6 = new int[this.aClass34_Sub3_1.anInt7854 * this.aClass34_Sub3_1.anInt7852];
		this.aFloat1 = arg2;
		this.anInt106 = arg3;
		this.anInt109 = arg4;
		this.anInt119 = arg5;
		this.aClass45_Sub3_1 = this.aClass34_Sub3_1.aClass45_Sub3_34;
		this.aClass111_Sub1_1 = new Class111_Sub1(this.aClass45_Sub3_1, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IFIII)V")
	public void method80(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(37) int local37;
		if (this.anInt117 != -1) {
			@Pc(14) Class55 local14 = this.aClass45_Sub3_1.anInterface3_12.method4776(this.anInt117);
			local19 = local14.aByte17 & 0xFF;
			@Pc(63) int local63;
			if (local19 != 0 && local14.aByte16 != 4) {
				if (arg2 < 0) {
					local37 = 0;
				} else if (arg2 > 127) {
					local37 = 16777215;
				} else {
					local37 = arg2 * 131586;
				}
				if (local19 == 256) {
					arg1 = local37;
				} else {
					local63 = 256 - local19;
					arg1 = (local19 * (local37 & 0xFF00) + local63 * (arg1 & 0xFF00) & 0xFF0000) + ((local37 & 0xFF00FF) * local19 + (arg1 & 0xFF00FF) * local63 & 0xFF00FF00) >> 8;
				}
			}
			local37 = local14.aByte15 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(112) int local112 = (arg1 >> 16 & 0xFF) * local37;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local63 = (arg1 >> 8 & 0xFF) * local37;
				if (local63 > 65535) {
					local63 = 65535;
				}
				@Pc(140) int local140 = (arg1 & 0xFF) * local37;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg1 = (local140 >> 8) + (local112 << 8 & 0xFF0057) + (local63 & 0xFF00);
			}
		}
		if (arg0 != 1.0F) {
			@Pc(174) int local174 = arg1 >> 16 & 0xFF;
			local19 = arg1 >> 8 & 0xFF;
			local37 = arg1 & 0xFF;
			local174 = (int) ((float) local174 * arg0);
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local19 = (int) ((float) local19 * arg0);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local37 = (int) ((float) local37 * arg0);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg1 = local37 | local174 << 16 | local19 << 8;
		}
		this.aStream1.f(arg3 * 4);
		this.aStream1.d((byte) (arg1 >> 16));
		this.aStream1.d((byte) (arg1 >> 8));
		this.aStream1.d((byte) arg1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIBI)V")
	public void method82(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray6[arg1 + arg0 * this.aClass34_Sub3_1.anInt7854] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	public void method83(@OriginalArg(0) int arg0) {
		this.aStream1.a();
		@Pc(18) Interface21 local18 = this.aClass45_Sub3_1.method7485(arg0 * 4, this.aNativeHeapBuffer1, 4);
		this.aClass126_1 = new Class126(local18, 5121, 4, 0);
		this.aStream1 = null;
		this.aNativeHeapBuffer1 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB[I)V")
	public void method84(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3_Sub11_Sub2 local11 = this.aClass45_Sub3_1.aClass3_Sub11_Sub2_3;
		local11.anInt6128 = 0;
		@Pc(40) short[] local40;
		@Pc(34) int local34;
		@Pc(45) int local45;
		@Pc(28) int local28;
		@Pc(54) int local54;
		@Pc(56) int local56;
		if (this.aClass45_Sub3_1.aBoolean687) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass34_Sub3_1.aShortArrayArray20[local34];
				local45 = this.anIntArray6[local34];
				if (local45 != 0 && local40 != null) {
					local54 = 0;
					local56 = 0;
					while (local56 < local40.length) {
						if ((local45 & 0x1 << local54++) == 0) {
							local56 += 3;
						} else {
							local7++;
							local11.method5200(local40[local56++] & 0xFFFF);
							local11.method5200(local40[local56++] & 0xFFFF);
							local7++;
							local11.method5200(local40[local56++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local40 = this.aClass34_Sub3_1.aShortArrayArray20[local34];
				local45 = this.anIntArray6[local34];
				if (local45 != 0 && local40 != null) {
					local54 = 0;
					local56 = 0;
					while (local40.length > local56) {
						if ((0x1 << local54++ & local45) == 0) {
							local56 += 3;
						} else {
							local7++;
							local11.method5222(local40[local56++] & 0xFFFF);
							local11.method5222(local40[local56++] & 0xFFFF);
							local7++;
							local11.method5222(local40[local56++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass111_Sub1_1.method7527(local11.aByteArray62, local11.anInt6128);
		this.aClass45_Sub3_1.method7498(this.aClass34_Sub3_1.aClass126_11, this.aClass126_1, this.aClass34_Sub3_1.aClass126_9, this.aClass34_Sub3_1.aClass126_12);
		this.aClass45_Sub3_1.method7453((this.aClass34_Sub3_1.anInt5494 & 0x8) != 0, (this.aClass34_Sub3_1.anInt5494 & 0x7) != 0, this.anInt117);
		if (this.aClass45_Sub3_1.aBoolean686) {
			this.aClass45_Sub3_1.YA(Integer.MAX_VALUE, this.anInt106, this.anInt109, this.anInt119);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat1, 1.0F / this.aFloat1, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass45_Sub3_1.method7498(this.aClass34_Sub3_1.aClass126_11, this.aClass126_1, this.aClass34_Sub3_1.aClass126_9, this.aClass34_Sub3_1.aClass126_12);
		this.aClass45_Sub3_1.method7482(this.aClass111_Sub1_1, 0, local7);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)V")
	public void method85(@OriginalArg(1) int arg0) {
		this.aNativeHeapBuffer1 = this.aClass45_Sub3_1.aNativeHeap6.a(arg0 * 4, true);
		this.aStream1 = new Stream(this.aNativeHeapBuffer1);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IB)V")
	public void method87(@OriginalArg(0) int arg0) {
		this.aStream1.f(arg0 * 4 + 3);
		this.aStream1.d(-1);
	}
}
