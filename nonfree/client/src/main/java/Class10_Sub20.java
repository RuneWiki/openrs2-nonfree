import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hv")
public final class Class10_Sub20 extends Class10 {

	@OriginalMember(owner = "client!hv", name = "y", descriptor = "Lclient!er;")
	private Class71 aClass71_10;

	@OriginalMember(owner = "client!hv", name = "z", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!hv", name = "G", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!hv", name = "o", descriptor = "Lclient!wv;")
	private final Class154_Sub2 aClass154_Sub2_2;

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_20;

	@OriginalMember(owner = "client!hv", name = "x", descriptor = "I")
	public final int anInt3240;

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "I")
	public final int anInt3232;

	@OriginalMember(owner = "client!hv", name = "H", descriptor = "F")
	public final float aFloat56;

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "[I")
	private final int[] anIntArray311;

	@OriginalMember(owner = "client!hv", name = "F", descriptor = "I")
	public final int anInt3244;

	@OriginalMember(owner = "client!hv", name = "r", descriptor = "I")
	public final int anInt3235;

	@OriginalMember(owner = "client!hv", name = "m", descriptor = "Lclient!bi;")
	private final Class26_Sub1 aClass26_Sub1_1;

	@OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lclient!wv;IIIII)V")
	public Class10_Sub20(@OriginalArg(0) Class154_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass154_Sub2_2 = arg0;
		this.aClass50_Sub1_20 = this.aClass154_Sub2_2.aClass50_Sub1_43;
		this.anInt3240 = arg1;
		this.anInt3232 = arg4;
		this.aFloat56 = arg2;
		this.anIntArray311 = new int[this.aClass154_Sub2_2.anInt7614 * this.aClass154_Sub2_2.anInt7616];
		this.anInt3244 = arg5;
		this.anInt3235 = arg3;
		this.aClass26_Sub1_1 = new Class26_Sub1(this.aClass50_Sub1_20, 5123, null, 1);
	}

	@OriginalMember(owner = "client!hv", name = "b", descriptor = "(II)V")
	public void method2713(@OriginalArg(0) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IZ)V")
	public void method2714(@OriginalArg(0) int arg0) {
		this.aNativeStream1.a();
		@Pc(24) Interface4 local24 = this.aClass50_Sub1_20.method1302(arg0 * 4, this.aNativeBuffer3, 4);
		this.aClass71_10 = new Class71(local24, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer3 = null;
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IIIIF)V")
	public void method2715(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(31) int local31;
		@Pc(50) int local50;
		if (this.anInt3240 != -1) {
			@Pc(26) Class259 local26 = this.aClass50_Sub1_20.anInterface7_8.method4447(this.anInt3240);
			local31 = local26.aByte99 & 0xFF;
			@Pc(68) int local68;
			if (local31 != 0 && local26.aByte100 != 4) {
				if (arg1 < 0) {
					local50 = 0;
				} else if (arg1 <= 127) {
					local50 = arg1 * 131586;
				} else {
					local50 = 16777215;
				}
				if (local31 == 256) {
					arg0 = local50;
				} else {
					local68 = 256 - local31;
					arg0 = (local31 * (local50 & 0xFF00) + (arg0 & 0xFF00) * local68 & 0xFF0000) + ((local50 & 0xFF00FF) * local31 + (arg0 & 0xFF00FF) * local68 & 0xFF00FF00) >> 8;
				}
			}
			local50 = local26.aByte102 & 0xFF;
			if (local50 != 0) {
				local50 += 256;
				@Pc(118) int local118 = (arg0 >> 16 & 0xFF) * local50;
				if (local118 > 65535) {
					local118 = 65535;
				}
				local68 = local50 * (arg0 >> 8 & 0xFF);
				if (local68 > 65535) {
					local68 = 65535;
				}
				@Pc(144) int local144 = (arg0 & 0xFF) * local50;
				if (local144 > 65535) {
					local144 = 65535;
				}
				arg0 = (local144 >> 8) + (local68 & 0xFF00) + (local118 << 8 & 0xFF002A);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(175) int local175 = arg0 >> 16 & 0xFF;
			local31 = arg0 >> 8 & 0xFF;
			local175 = (int) ((float) local175 * arg3);
			local50 = arg0 & 0xFF;
			local31 = (int) ((float) local31 * arg3);
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local50 = (int) ((float) local50 * arg3);
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			if (local50 < 0) {
				local50 = 0;
			} else if (local50 > 255) {
				local50 = 255;
			}
			arg0 = local31 << 8 | local175 << 16 | local50;
		}
		this.aNativeStream1.b(arg2 * 4);
		this.aNativeStream1.a((byte) (arg0 >> 16));
		this.aNativeStream1.a((byte) (arg0 >> 8));
		this.aNativeStream1.a((byte) arg0);
	}

	@OriginalMember(owner = "client!hv", name = "c", descriptor = "(II)V")
	public void method2717(@OriginalArg(1) int arg0) {
		this.aNativeBuffer3 = this.aClass50_Sub1_20.aNativeHeap1.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "([III)V")
	public void method2720(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class10_Sub8_Sub1 local11 = this.aClass50_Sub1_20.aClass10_Sub8_Sub1_2;
		local11.anInt2989 = 0;
		@Pc(37) short[] local37;
		@Pc(31) int local31;
		@Pc(42) int local42;
		@Pc(25) int local25;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (this.aClass50_Sub1_20.aBoolean99) {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local37 = this.aClass154_Sub2_2.aShortArrayArray10[local31];
				local42 = this.anIntArray311[local31];
				if (local42 != 0 && local37 != null) {
					local48 = 0;
					local50 = 0;
					while (local37.length > local50) {
						if ((0x1 << local48++ & local42) == 0) {
							local50 += 3;
						} else {
							local11.method2509(local37[local50++] & 0xFFFF);
							local7++;
							local7++;
							local11.method2509(local37[local50++] & 0xFFFF);
							local7++;
							local11.method2509(local37[local50++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local25 = 0; local25 < arg1; local25++) {
				local31 = arg0[local25];
				local42 = this.anIntArray311[local31];
				local37 = this.aClass154_Sub2_2.aShortArrayArray10[local31];
				if (local42 != 0 && local37 != null) {
					local48 = 0;
					local50 = 0;
					while (local37.length > local50) {
						if ((local42 & 0x1 << local48++) == 0) {
							local50 += 3;
						} else {
							local7++;
							local11.method2496(local37[local50++] & 0xFFFF);
							local11.method2496(local37[local50++] & 0xFFFF);
							local7++;
							local7++;
							local11.method2496(local37[local50++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass26_Sub1_1.method1769(local11.aByteArray44, local11.anInt2989);
		this.aClass50_Sub1_20.method1283(this.aClass154_Sub2_2.aClass71_16, this.aClass154_Sub2_2.aClass71_13, this.aClass154_Sub2_2.aClass71_14, this.aClass71_10);
		this.aClass50_Sub1_20.method1317((this.aClass154_Sub2_2.anInt7623 & 0x7) != 0, (this.aClass154_Sub2_2.anInt7623 & 0x8) != 0, this.anInt3240);
		if (this.aClass50_Sub1_20.aBoolean91) {
			this.aClass50_Sub1_20.a(Integer.MAX_VALUE, this.anInt3235, this.anInt3232, this.anInt3244);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat56, 1.0F / this.aFloat56, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass50_Sub1_20.method1283(this.aClass154_Sub2_2.aClass71_16, this.aClass154_Sub2_2.aClass71_13, this.aClass154_Sub2_2.aClass71_14, this.aClass71_10);
		this.aClass50_Sub1_20.method1290(local7, 0, this.aClass26_Sub1_1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hv", name = "a", descriptor = "(IBII)V")
	public void method2721(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray311[arg2 * this.aClass154_Sub2_2.anInt7614 + arg0] |= 0x1 << arg1;
	}
}
