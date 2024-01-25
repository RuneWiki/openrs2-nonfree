import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class4_Sub41 extends Class4 {

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!ui", name = "y", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer4;

	@OriginalMember(owner = "client!ui", name = "B", descriptor = "Lclient!jd;")
	private Class118 aClass118_12;

	@OriginalMember(owner = "client!ui", name = "G", descriptor = "Lclient!gu;")
	private final Class14_Sub2 aClass14_Sub2_3;

	@OriginalMember(owner = "client!ui", name = "C", descriptor = "[I")
	private final int[] anIntArray589;

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
	public final int anInt7252;

	@OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
	public final int anInt7254;

	@OriginalMember(owner = "client!ui", name = "F", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_41;

	@OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
	public final int anInt7255;

	@OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
	public final int anInt7262;

	@OriginalMember(owner = "client!ui", name = "H", descriptor = "F")
	public final float aFloat92;

	@OriginalMember(owner = "client!ui", name = "w", descriptor = "Lclient!nr;")
	private final Class129_Sub2 aClass129_Sub2_2;

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lclient!gu;IIIII)V")
	public Class4_Sub41(@OriginalArg(0) Class14_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass14_Sub2_3 = arg0;
		this.anIntArray589 = new int[this.aClass14_Sub2_3.anInt2835 * this.aClass14_Sub2_3.anInt2832];
		this.anInt7252 = arg1;
		this.anInt7254 = arg4;
		this.aClass30_Sub1_41 = this.aClass14_Sub2_3.aClass30_Sub1_13;
		this.anInt7255 = arg5;
		this.anInt7262 = arg3;
		this.aFloat92 = arg2;
		this.aClass129_Sub2_2 = new Class129_Sub2(this.aClass30_Sub1_41, 5123, null, 1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public void method5805(@OriginalArg(0) int arg0) {
		this.aNativeBuffer4 = this.aClass30_Sub1_41.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer4);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZI[I)V")
	public void method5807(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(12) int local12 = 0;
		@Pc(16) Class4_Sub20_Sub2 local16 = this.aClass30_Sub1_41.aClass4_Sub20_Sub2_1;
		local16.anInt5526 = 0;
		@Pc(42) short[] local42;
		@Pc(31) int local31;
		@Pc(36) int local36;
		@Pc(25) int local25;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass30_Sub1_41.aBoolean51) {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local36 = this.anIntArray589[local31];
				local42 = this.aClass14_Sub2_3.aShortArrayArray2[local31];
				if (local36 != 0 && local42 != null) {
					local48 = 0;
					local50 = 0;
					while (local42.length > local50) {
						if ((0x1 << local48++ & local36) == 0) {
							local50 += 3;
						} else {
							local12++;
							local16.method4558(local42[local50++] & 0xFFFF);
							local16.method4558(local42[local50++] & 0xFFFF);
							local12++;
							local16.method4558(local42[local50++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg0; local25++) {
				local31 = arg1[local25];
				local42 = this.aClass14_Sub2_3.aShortArrayArray2[local31];
				local36 = this.anIntArray589[local31];
				if (local36 != 0 && local42 != null) {
					local48 = 0;
					local50 = 0;
					while (local42.length > local50) {
						if ((0x1 << local48++ & local36) == 0) {
							local50 += 3;
						} else {
							local12++;
							local16.method4604(local42[local50++] & 0xFFFF);
							local12++;
							local16.method4604(local42[local50++] & 0xFFFF);
							local16.method4604(local42[local50++] & 0xFFFF);
							local12++;
						}
					}
				}
			}
		}
		if (local12 <= 0) {
			return;
		}
		this.aClass129_Sub2_2.method4363(local16.aByteArray77, local16.anInt5526);
		this.aClass30_Sub1_41.method748(this.aClass118_12, this.aClass14_Sub2_3.aClass118_4, this.aClass14_Sub2_3.aClass118_3, this.aClass14_Sub2_3.aClass118_6);
		this.aClass30_Sub1_41.method708(this.anInt7252, (this.aClass14_Sub2_3.anInt2836 & 0x7) != 0, (this.aClass14_Sub2_3.anInt2836 & 0x8) != 0);
		if (this.aClass30_Sub1_41.aBoolean53) {
			this.aClass30_Sub1_41.KA(Integer.MAX_VALUE, this.anInt7262, this.anInt7254, this.anInt7255);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat92, 1.0F / this.aFloat92, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass30_Sub1_41.method748(this.aClass118_12, this.aClass14_Sub2_3.aClass118_4, this.aClass14_Sub2_3.aClass118_3, this.aClass14_Sub2_3.aClass118_6);
		this.aClass30_Sub1_41.method721(0, local12, this.aClass129_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(BI)V")
	public void method5808(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b();
		@Pc(18) Interface9 local18 = this.aClass30_Sub1_41.method763(arg0 * 4, this.aNativeBuffer4, 4);
		this.aClass118_12 = new Class118(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer4 = null;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(FIIBI)V")
	public void method5809(@OriginalArg(0) float arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) int local22;
		@Pc(35) int local35;
		if (this.anInt7252 != -1) {
			@Pc(17) Class160 local17 = this.aClass30_Sub1_41.anInterface4_5.method5685(this.anInt7252);
			local22 = local17.aByte49 & 0xFF;
			@Pc(59) int local59;
			if (local22 != 0 && local17.aByte51 != 4) {
				if (arg2 < 0) {
					local35 = 0;
				} else if (arg2 > 127) {
					local35 = 16777215;
				} else {
					local35 = arg2 * 131586;
				}
				if (local22 == 256) {
					arg1 = local35;
				} else {
					local59 = 256 - local22;
					arg1 = ((arg1 & 0xFF00) * local59 + (local35 & 0xFF00) * local22 & 0xFF0000) + (local59 * (arg1 & 0xFF00FF) + local22 * (local35 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local35 = local17.aByte53 & 0xFF;
			if (local35 != 0) {
				local35 += 256;
				@Pc(112) int local112 = (arg1 >> 16 & 0xFF) * local35;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local59 = local35 * (arg1 >> 8 & 0xFF);
				if (local59 > 65535) {
					local59 = 65535;
				}
				@Pc(140) int local140 = (arg1 & 0xFF) * local35;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg1 = ((local112 & 0x8400FF00) << 8) + (local59 & 0xFF00) + (local140 >> 8);
			}
		}
		this.aNativeStream1.a(arg3 * 4);
		if (arg0 != 1.0F) {
			@Pc(177) int local177 = arg1 >> 16 & 0xFF;
			local22 = arg1 >> 8 & 0xFF;
			local35 = arg1 & 0xFF;
			local177 = (int) ((float) local177 * arg0);
			if (local177 < 0) {
				local177 = 0;
			} else if (local177 > 255) {
				local177 = 255;
			}
			local22 = (int) ((float) local22 * arg0);
			local35 = (int) ((float) local35 * arg0);
			if (local22 < 0) {
				local22 = 0;
			} else if (local22 > 255) {
				local22 = 255;
			}
			if (local35 < 0) {
				local35 = 0;
			} else if (local35 > 255) {
				local35 = 255;
			}
			arg1 = local177 << 16 | local22 << 8 | local35;
		}
		this.aNativeStream1.b((byte) (arg1 >> 16));
		this.aNativeStream1.b((byte) (arg1 >> 8));
		this.aNativeStream1.b((byte) arg1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)V")
	public void method5812(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a(arg0 * 4 + 3);
		this.aNativeStream1.b(-1);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIII)V")
	public void method5813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray589[arg1 + arg2 * this.aClass14_Sub2_3.anInt2832] |= 0x1 << arg0;
	}
}
