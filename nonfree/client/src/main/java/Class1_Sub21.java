import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class1_Sub21 extends Class1 {

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "Lclient!jaclib/memory/Stream;")
	private Stream aStream3;

	@OriginalMember(owner = "client!hr", name = "v", descriptor = "Lclient!jaclib/memory/heap/NativeHeapBuffer;")
	private NativeHeapBuffer aNativeHeapBuffer3;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "Lclient!maa;")
	private Class188 aClass188_1;

	@OriginalMember(owner = "client!hr", name = "t", descriptor = "Lclient!sb;")
	private final Class10_Sub3 aClass10_Sub3_1;

	@OriginalMember(owner = "client!hr", name = "A", descriptor = "I")
	public final int anInt3998;

	@OriginalMember(owner = "client!hr", name = "j", descriptor = "I")
	public final int anInt3990;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
	public final int anInt3995;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "[I")
	private final int[] anIntArray306;

	@OriginalMember(owner = "client!hr", name = "m", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_17;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "I")
	public final int anInt3992;

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "F")
	public final float aFloat88;

	@OriginalMember(owner = "client!hr", name = "o", descriptor = "Lclient!oe;")
	private final Class92_Sub2 aClass92_Sub2_1;

	static {
		new Class114("Invalid name", "Unzulässiger Name!", "Nom incorrect", "Nome inválido");
	}

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!sb;IIIII)V")
	public Class1_Sub21(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass10_Sub3_1 = arg0;
		this.anInt3998 = arg4;
		this.anInt3990 = arg5;
		this.anInt3995 = arg3;
		this.anIntArray306 = new int[this.aClass10_Sub3_1.anInt7412 * this.aClass10_Sub3_1.anInt7409];
		this.aClass9_Sub3_17 = this.aClass10_Sub3_1.aClass9_Sub3_37;
		this.anInt3992 = arg1;
		this.aFloat88 = arg2;
		this.aClass92_Sub2_1 = new Class92_Sub2(this.aClass9_Sub3_17, 5123, null, 1);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIFII)V")
	public void method3545(@OriginalArg(1) int arg0, @OriginalArg(2) float arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(40) int local40;
		if (this.anInt3992 != -1) {
			@Pc(14) Class175 local14 = this.aClass9_Sub3_17.anInterface8_13.method7085(this.anInt3992);
			local19 = local14.aByte59 & 0xFF;
			@Pc(64) int local64;
			if (local19 != 0 && local14.aByte54 != 4) {
				if (arg0 < 0) {
					local40 = 0;
				} else if (arg0 > 127) {
					local40 = 16777215;
				} else {
					local40 = arg0 * 131586;
				}
				if (local19 == 256) {
					arg2 = local40;
				} else {
					local64 = 256 - local19;
					arg2 = ((arg2 & 0xFF00) * local64 + local19 * (local40 & 0xFF00) & 0xFF0000) + (local64 * (arg2 & 0xFF00FF) + (local40 & 0xFF00FF) * local19 & 0xFF00FF00) >> 8;
				}
			}
			local40 = local14.aByte58 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(113) int local113 = local40 * (arg2 >> 16 & 0xFF);
				if (local113 > 65535) {
					local113 = 65535;
				}
				local64 = (arg2 >> 8 & 0xFF) * local40;
				if (local64 > 65535) {
					local64 = 65535;
				}
				@Pc(141) int local141 = (arg2 & 0xFF) * local40;
				if (local141 > 65535) {
					local141 = 65535;
				}
				arg2 = (local141 >> 8) + ((local113 << 8 & 0xFF00C5) + (local64 & 0xFF00));
			}
		}
		this.aStream3.d(arg3 * 4);
		if (arg1 != 1.0F) {
			@Pc(181) int local181 = arg2 >> 16 & 0xFF;
			local19 = arg2 >> 8 & 0xFF;
			local181 = (int) ((float) local181 * arg1);
			local40 = arg2 & 0xFF;
			if (local181 < 0) {
				local181 = 0;
			} else if (local181 > 255) {
				local181 = 255;
			}
			local19 = (int) ((float) local19 * arg1);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local40 = (int) ((float) local40 * arg1);
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg2 = local181 << 16 | local19 << 8 | local40;
		}
		this.aStream3.b((byte) (arg2 >> 16));
		this.aStream3.b((byte) (arg2 >> 8));
		this.aStream3.b((byte) arg2);
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(II)V")
	public void method3547(@OriginalArg(0) int arg0) {
		this.aStream3.d(arg0 * 4 + 3);
		this.aStream3.b(-1);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIII)V")
	public void method3548(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray306[arg2 + this.aClass10_Sub3_1.anInt7412 * arg0] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB[I)V")
	public void method3550(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1_Sub13_Sub1 local11 = this.aClass9_Sub3_17.aClass1_Sub13_Sub1_3;
		local11.anInt3400 = 0;
		@Pc(47) short[] local47;
		@Pc(36) int local36;
		@Pc(41) int local41;
		@Pc(30) int local30;
		@Pc(56) int local56;
		@Pc(58) int local58;
		if (this.aClass9_Sub3_17.aBoolean523) {
			for (local30 = 0; local30 < arg0; local30++) {
				local36 = arg1[local30];
				local41 = this.anIntArray306[local36];
				local47 = this.aClass10_Sub3_1.aShortArrayArray11[local36];
				if (local41 != 0 && local47 != null) {
					local56 = 0;
					local58 = 0;
					while (local58 < local47.length) {
						if ((0x1 << local56++ & local41) == 0) {
							local58 += 3;
						} else {
							local7++;
							local11.method3038(local47[local58++] & 0xFFFF);
							local7++;
							local11.method3038(local47[local58++] & 0xFFFF);
							local7++;
							local11.method3038(local47[local58++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local30 = 0; local30 < arg0; local30++) {
				local36 = arg1[local30];
				local41 = this.anIntArray306[local36];
				local47 = this.aClass10_Sub3_1.aShortArrayArray11[local36];
				if (local41 != 0 && local47 != null) {
					local56 = 0;
					local58 = 0;
					while (local58 < local47.length) {
						if ((local41 & 0x1 << local56++) == 0) {
							local58 += 3;
						} else {
							local11.method3068(local47[local58++] & 0xFFFF);
							local7++;
							local11.method3068(local47[local58++] & 0xFFFF);
							local7++;
							local11.method3068(local47[local58++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass92_Sub2_1.method6741(local11.anInt3400, local11.aByteArray45);
		this.aClass9_Sub3_17.method6713(this.aClass10_Sub3_1.aClass188_13, this.aClass10_Sub3_1.aClass188_11, this.aClass10_Sub3_1.aClass188_14, this.aClass188_1);
		this.aClass9_Sub3_17.method6718((this.aClass10_Sub3_1.anInt7418 & 0x8) != 0, (this.aClass10_Sub3_1.anInt7418 & 0x7) != 0, this.anInt3992);
		if (this.aClass9_Sub3_17.aBoolean516) {
			this.aClass9_Sub3_17.JA(Integer.MAX_VALUE, this.anInt3995, this.anInt3998, this.anInt3990);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat88, 1.0F / this.aFloat88, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass9_Sub3_17.method6713(this.aClass10_Sub3_1.aClass188_13, this.aClass10_Sub3_1.aClass188_11, this.aClass10_Sub3_1.aClass188_14, this.aClass188_1);
		this.aClass9_Sub3_17.method6719(0, local7, this.aClass92_Sub2_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "(II)V")
	public void method3551(@OriginalArg(1) int arg0) {
		this.aStream3.b();
		@Pc(22) Interface16 local22 = this.aClass9_Sub3_17.method6721(arg0 * 4, 4, this.aNativeHeapBuffer3);
		this.aClass188_1 = new Class188(local22, 5121, 4, 0);
		this.aNativeHeapBuffer3 = null;
		this.aStream3 = null;
	}

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "(II)V")
	public void method3552(@OriginalArg(0) int arg0) {
		this.aNativeHeapBuffer3 = this.aClass9_Sub3_17.aNativeHeap5.a(arg0 * 4, true);
		this.aStream3 = new Stream(this.aNativeHeapBuffer3);
	}
}
