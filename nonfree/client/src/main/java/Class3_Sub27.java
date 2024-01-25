import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class3_Sub27 extends Class3 {

	@OriginalMember(owner = "client!ij", name = "z", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer5;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream5;

	@OriginalMember(owner = "client!ij", name = "u", descriptor = "Lclient!li;")
	private Class229 aClass229_8;

	@OriginalMember(owner = "client!ij", name = "B", descriptor = "Lclient!vr;")
	private final Class313_Sub3 aClass313_Sub3_2;

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "F")
	public final float aFloat90;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	public final int anInt5016;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_19;

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "[I")
	private final int[] anIntArray287;

	@OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
	public final int anInt5020;

	@OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
	public final int anInt5024;

	@OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
	public final int anInt5025;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "Lclient!eka;")
	private final Class49_Sub1 aClass49_Sub1_1;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!vr;IIIII)V")
	public Class3_Sub27(@OriginalArg(0) Class313_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass313_Sub3_2 = arg0;
		this.aFloat90 = (float) arg2;
		this.anInt5016 = arg3;
		this.aClass67_Sub2_19 = this.aClass313_Sub3_2.aClass67_Sub2_42;
		this.anIntArray287 = new int[this.aClass313_Sub3_2.anInt10875 * this.aClass313_Sub3_2.anInt10872];
		this.anInt5020 = arg5;
		this.anInt5024 = arg4;
		this.anInt5025 = arg1;
		this.aClass49_Sub1_1 = new Class49_Sub1(this.aClass67_Sub2_19, 5123, (byte[]) null, 1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "([III)V")
	public void method4199(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		@Pc(16) Class3_Sub28_Sub1 local16 = this.aClass67_Sub2_19.aClass3_Sub28_Sub1_3;
		local16.anInt6241 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(25) int local25;
		@Pc(50) int local50;
		@Pc(52) int local52;
		if (this.aClass67_Sub2_19.aBoolean322) {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local37 = this.aClass313_Sub3_2.aShortArrayArray6[local31];
				local42 = this.anIntArray287[local31];
				if (local42 != 0 && local37 != null) {
					local50 = 0;
					local52 = 0;
					while (local37.length > local52) {
						if ((local42 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local16.method5282(local37[local52++] & 0xFFFF);
							local12++;
							local16.method5282(local37[local52++] & 0xFFFF);
							local12++;
							local16.method5282(local37[local52++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local42 = this.anIntArray287[local31];
				local37 = this.aClass313_Sub3_2.aShortArrayArray6[local31];
				if (local42 != 0 && local37 != null) {
					local50 = 0;
					local52 = 0;
					while (local52 < local37.length) {
						if ((local42 & 0x1 << local50++) == 0) {
							local52 += 3;
						} else {
							local12++;
							local16.method5280(local37[local52++] & 0xFFFF);
							local16.method5280(local37[local52++] & 0xFFFF);
							local12++;
							local16.method5280(local37[local52++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		}
		if (local12 <= 0) {
			return;
		}
		this.aClass49_Sub1_1.method2434(local16.aByteArray50, local16.anInt6241);
		this.aClass67_Sub2_19.method3283(this.aClass313_Sub3_2.aClass229_15, this.aClass229_8, this.aClass313_Sub3_2.aClass229_14, this.aClass313_Sub3_2.aClass229_13);
		this.aClass67_Sub2_19.method3276((this.aClass313_Sub3_2.anInt10888 & 0x7) != 0, this.anInt5025, (this.aClass313_Sub3_2.anInt10888 & 0x8) != 0);
		if (this.aClass67_Sub2_19.aBoolean314) {
			this.aClass67_Sub2_19.EA(Integer.MAX_VALUE, this.anInt5016, this.anInt5024, this.anInt5020);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat90, 1.0F / this.aFloat90, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass67_Sub2_19.method3283(this.aClass313_Sub3_2.aClass229_15, this.aClass229_8, this.aClass313_Sub3_2.aClass229_14, this.aClass313_Sub3_2.aClass229_13);
		this.aClass67_Sub2_19.method3232(this.aClass49_Sub1_1, 0, local12);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIF)V")
	public void method4200(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(19) int local19;
		@Pc(44) int local44;
		if (this.anInt5025 != -1) {
			@Pc(14) Class32 local14 = this.aClass67_Sub2_19.anInterface2_11.method1027(this.anInt5025);
			local19 = local14.aByte20 & 0xFF;
			@Pc(66) int local66;
			if (local19 != 0 && local14.aByte25 != 4) {
				if (arg0 < 0) {
					local44 = 0;
				} else if (arg0 <= 127) {
					local44 = arg0 * 131586;
				} else {
					local44 = 16777215;
				}
				if (local19 == 256) {
					arg1 = local44;
				} else {
					local66 = 256 - local19;
					arg1 = (local66 * (arg1 & 0xFF00FF) + local19 * (local44 & 0xFF00FF) & 0xFF00FF00) + (local19 * (local44 & 0xFF00) + (local66 * (arg1 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local44 = local14.aByte24 & 0xFF;
			if (local44 != 0) {
				local44 += 256;
				@Pc(116) int local116 = local44 * (arg1 >> 16 & 0xFF);
				if (local116 > 65535) {
					local116 = 65535;
				}
				local66 = local44 * (arg1 >> 8 & 0xFF);
				if (local66 > 65535) {
					local66 = 65535;
				}
				@Pc(142) int local142 = local44 * (arg1 & 0xFF);
				if (local142 > 65535) {
					local142 = 65535;
				}
				arg1 = (local66 & 0xFF00) + ((local116 & 0x9B00FF00) << 8) + (local142 >> 8);
			}
		}
		this.aStream5.e(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(181) int local181 = arg1 >> 16 & 0xFF;
			local19 = arg1 >> 8 & 0xFF;
			local44 = arg1 & 0xFF;
			local181 = (int) ((float) local181 * arg3);
			local19 = (int) ((float) local19 * arg3);
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local44 = (int) ((float) local44 * arg3);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local44 < 0) {
				local44 = 0;
			} else if (local44 > 255) {
				local44 = 255;
			}
			arg1 = local181 << 16 | local19 << 8 | local44;
		}
		this.aStream5.f((byte) (arg1 >> 16));
		this.aStream5.f((byte) (arg1 >> 8));
		this.aStream5.f((byte) arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)V")
	public void method4201(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer5 = this.aClass67_Sub2_19.aNativeHeap4.a(arg0 * 4, true);
		this.aStream5 = new Stream(this.aNativeHeapBuffer5);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIBI)V")
	public void method4202(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray287[arg1 + this.aClass313_Sub3_2.anInt10875 * arg0] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)V")
	public void method4204(@OriginalArg(0) int arg0) {
		this.aStream5.a();
		@Pc(18) Interface24 local18 = this.aClass67_Sub2_19.method3290(arg0 * 4, 4, this.aNativeHeapBuffer5);
		this.aClass229_8 = new Class229(local18, 5121, 4, 0);
		this.aNativeHeapBuffer5 = null;
		this.aStream5 = null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public void method4206(@OriginalArg(0) int arg0) {
		this.aStream5.e(arg0 * 4 + 3);
		this.aStream5.f(-1);
	}
}
