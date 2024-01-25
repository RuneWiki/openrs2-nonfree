import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class1_Sub23 extends Class1 {

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer1;

	@OriginalMember(owner = "client!kq", name = "r", descriptor = "Lclient!bg;")
	private Class21 aClass21_6;

	@OriginalMember(owner = "client!kq", name = "B", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!kq", name = "y", descriptor = "Lclient!on;")
	private final Class163_Sub1 aClass163_Sub1_3;

	@OriginalMember(owner = "client!kq", name = "x", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_22;

	@OriginalMember(owner = "client!kq", name = "H", descriptor = "[I")
	private final int[] anIntArray189;

	@OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
	public final int anInt3457;

	@OriginalMember(owner = "client!kq", name = "F", descriptor = "F")
	public final float aFloat47;

	@OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
	public final int anInt3456;

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "I")
	public final int anInt3447;

	@OriginalMember(owner = "client!kq", name = "w", descriptor = "I")
	public final int anInt3450;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "Lclient!tj;")
	private final Class154_Sub2 aClass154_Sub2_2;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(Lclient!on;IIIII)V")
	public Class1_Sub23(@OriginalArg(0) Class163_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass163_Sub1_3 = arg0;
		this.aClass128_Sub2_22 = this.aClass163_Sub1_3.aClass128_Sub2_29;
		this.anIntArray189 = new int[this.aClass163_Sub1_3.anInt5796 * this.aClass163_Sub1_3.anInt5795];
		this.anInt3457 = arg5;
		this.aFloat47 = arg2;
		this.anInt3456 = arg1;
		this.anInt3447 = arg4;
		this.anInt3450 = arg3;
		this.aClass154_Sub2_2 = new Class154_Sub2(this.aClass128_Sub2_22, 5123, null, 1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(BI)V")
	public void method2845(@OriginalArg(1) int arg0) {
		this.aNativeBuffer1 = this.aClass128_Sub2_22.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)V")
	public void method2847(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a();
		@Pc(18) Interface10 local18 = this.aClass128_Sub2_22.method3623(arg0 * 4, this.aNativeBuffer1, 4);
		this.aClass21_6 = new Class21(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer1 = null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIFII)V")
	public void method2848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(41) int local41;
		if (this.anInt3456 != -1) {
			@Pc(14) Class201 local14 = this.aClass128_Sub2_22.anInterface8_8.method1375(this.anInt3456);
			local19 = local14.aByte65 & 0xFF;
			@Pc(61) int local61;
			if (local19 != 0 && local14.aByte61 != 4) {
				if (arg0 < 0) {
					local41 = 0;
				} else if (arg0 <= 127) {
					local41 = arg0 * 131586;
				} else {
					local41 = 16777215;
				}
				if (local19 == 256) {
					arg3 = local41;
				} else {
					local61 = 256 - local19;
					arg3 = (local61 * (arg3 & 0xFF00FF) + (local41 & 0xFF00FF) * local19 & 0xFF00FF00) + (local19 * (local41 & 0xFF00) + (local61 * (arg3 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local41 = local14.aByte63 & 0xFF;
			if (local41 != 0) {
				local41 += 256;
				@Pc(112) int local112 = (arg3 >> 16 & 0xFF) * local41;
				if (local112 > 65535) {
					local112 = 65535;
				}
				local61 = (arg3 >> 8 & 0xFF) * local41;
				if (local61 > 65535) {
					local61 = 65535;
				}
				@Pc(138) int local138 = (arg3 & 0xFF) * local41;
				if (local138 > 65535) {
					local138 = 65535;
				}
				arg3 = (local112 << 8 & 0xFF00A4) + ((local61 & 0xFF00) + (local138 >> 8));
			}
		}
		this.aNativeStream1.b(arg1 * 4);
		if (arg2 != 1.0F) {
			@Pc(180) int local180 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local41 = arg3 & 0xFF;
			local180 = (int) ((float) local180 * arg2);
			if (local180 < 0) {
				local180 = 0;
			} else if (local180 > 255) {
				local180 = 255;
			}
			local19 = (int) ((float) local19 * arg2);
			local41 = (int) ((float) local41 * arg2);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local41 < 0) {
				local41 = 0;
			} else if (local41 > 255) {
				local41 = 255;
			}
			arg3 = local41 | local180 << 16 | local19 << 8;
		}
		this.aNativeStream1.a((byte) (arg3 >> 16));
		this.aNativeStream1.a((byte) (arg3 >> 8));
		this.aNativeStream1.a((byte) arg3);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIII)V")
	public void method2849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray189[arg2 + arg1 * this.aClass163_Sub1_3.anInt5796] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)V")
	public void method2852(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I[II)V")
	public void method2853(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(16) Class1_Sub11 local16 = Static298.aClass1_Sub11_5;
		local16.anInt5766 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(25) int local25;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass128_Sub2_22.aBoolean360) {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local42 = this.anIntArray189[local31];
				local37 = this.aClass163_Sub1_3.aShortArrayArray23[local31];
				if (local42 != 0 && local37 != null) {
					local51 = 0;
					local53 = 0;
					while (local37.length > local53) {
						if ((0x1 << local51++ & local42) == 0) {
							local53 += 3;
						} else {
							local7++;
							local16.method4448(local37[local53++] & 0xFFFF);
							local16.method4448(local37[local53++] & 0xFFFF);
							local7++;
							local7++;
							local16.method4448(local37[local53++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local37 = this.aClass163_Sub1_3.aShortArrayArray23[local31];
				local42 = this.anIntArray189[local31];
				if (local42 != 0 && local37 != null) {
					local51 = 0;
					local53 = 0;
					while (local37.length > local53) {
						if ((0x1 << local51++ & local42) == 0) {
							local53 += 3;
						} else {
							local7++;
							local16.method4488(local37[local53++] & 0xFFFF);
							local7++;
							local16.method4488(local37[local53++] & 0xFFFF);
							local16.method4488(local37[local53++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass154_Sub2_2.method4932(local16.anInt5766, local16.aByteArray64);
		this.aClass128_Sub2_22.method3664(this.aClass163_Sub1_3.aClass21_11, this.aClass21_6, this.aClass163_Sub1_3.aClass21_9, this.aClass163_Sub1_3.aClass21_10);
		this.aClass128_Sub2_22.method3651(this.anInt3456, (this.aClass163_Sub1_3.anInt4816 & 0x8) != 0, (this.aClass163_Sub1_3.anInt4816 & 0x7) != 0);
		if (this.aClass128_Sub2_22.aBoolean356) {
			this.aClass128_Sub2_22.ba(Integer.MAX_VALUE, this.anInt3450, this.anInt3447, this.anInt3457);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat47, 1.0F / this.aFloat47, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass128_Sub2_22.method3664(this.aClass163_Sub1_3.aClass21_11, this.aClass21_6, this.aClass163_Sub1_3.aClass21_9, this.aClass163_Sub1_3.aClass21_10);
		this.aClass128_Sub2_22.method3627(local7, 0, this.aClass154_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
