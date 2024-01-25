import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import jaggl.memory.NativeStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hj")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!hj", name = "r", descriptor = "Lclient!jaggl/memory/NativeBuffer;")
	private NativeBuffer aNativeBuffer3;

	@OriginalMember(owner = "client!hj", name = "s", descriptor = "Lclient!jaggl/memory/NativeStream;")
	private NativeStream aNativeStream1;

	@OriginalMember(owner = "client!hj", name = "z", descriptor = "Lclient!m;")
	private Class145 aClass145_10;

	@OriginalMember(owner = "client!hj", name = "v", descriptor = "Lclient!e;")
	private final Class55_Sub1 aClass55_Sub1_3;

	@OriginalMember(owner = "client!hj", name = "k", descriptor = "[I")
	private final int[] anIntArray147;

	@OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
	public final int anInt2769;

	@OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
	public final int anInt2766;

	@OriginalMember(owner = "client!hj", name = "t", descriptor = "I")
	public final int anInt2765;

	@OriginalMember(owner = "client!hj", name = "j", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_14;

	@OriginalMember(owner = "client!hj", name = "B", descriptor = "F")
	public final float aFloat49;

	@OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
	public final int anInt2770;

	@OriginalMember(owner = "client!hj", name = "m", descriptor = "Lclient!li;")
	private final Class89_Sub2 aClass89_Sub2_2;

	@OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lclient!e;IIIII)V")
	public Class3_Sub22(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass55_Sub1_3 = arg0;
		this.anIntArray147 = new int[this.aClass55_Sub1_3.anInt4611 * this.aClass55_Sub1_3.anInt4614];
		this.anInt2769 = arg3;
		this.anInt2766 = arg4;
		this.anInt2765 = arg5;
		this.aClass167_Sub1_14 = this.aClass55_Sub1_3.aClass167_Sub1_7;
		this.aFloat49 = arg2;
		this.anInt2770 = arg1;
		this.aClass89_Sub2_2 = new Class89_Sub2(this.aClass167_Sub1_14, 5123, null, 1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IB)V")
	public void method2356(@OriginalArg(0) int arg0) {
		this.aNativeStream1.c();
		@Pc(18) Interface9 local18 = this.aClass167_Sub1_14.method3989(4, this.aNativeBuffer3, arg0 * 4);
		this.aClass145_10 = new Class145(local18, 5121, 4, 0);
		this.aNativeStream1 = null;
		this.aNativeBuffer3 = null;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
	public void method2358(@OriginalArg(1) int arg0) {
		this.aNativeStream1.b(arg0 * 4 + 3);
		this.aNativeStream1.a(-1);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIII)V")
	public void method2359(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray147[arg0 * this.aClass55_Sub1_3.anInt4614 + arg1] |= 0x1 << arg2;
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIFII)V")
	public void method2360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) int arg3) {
		@Pc(19) int local19;
		@Pc(36) int local36;
		if (this.anInt2770 != -1) {
			@Pc(14) Class105 local14 = this.aClass167_Sub1_14.anInterface7_8.method4417(this.anInt2770);
			local19 = local14.aByte39 & 0xFF;
			@Pc(58) int local58;
			if (local19 != 0 && local14.aByte37 != 4) {
				if (arg1 < 0) {
					local36 = 0;
				} else if (arg1 > 127) {
					local36 = 16777215;
				} else {
					local36 = arg1 * 131586;
				}
				if (local19 == 256) {
					arg3 = local36;
				} else {
					local58 = 256 - local19;
					arg3 = ((arg3 & 0xFF00FF) * local58 + (local36 & 0xFF00FF) * local19 & 0xFF00FF00) + (local19 * (local36 & 0xFF00) + (arg3 & 0xFF00) * local58 & 0xFF0000) >> 8;
				}
			}
			local36 = local14.aByte36 & 0xFF;
			if (local36 != 0) {
				local36 += 256;
				@Pc(108) int local108 = local36 * (arg3 >> 16 & 0xFF);
				if (local108 > 65535) {
					local108 = 65535;
				}
				local58 = local36 * (arg3 >> 8 & 0xFF);
				if (local58 > 65535) {
					local58 = 65535;
				}
				@Pc(136) int local136 = (arg3 & 0xFF) * local36;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg3 = (local58 & 0xFF00) + (((local108 & 0x6800FF00) << 8) + (local136 >> 8));
			}
		}
		if (arg2 != 1.0F) {
			@Pc(178) int local178 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local178 = (int) ((float) local178 * arg2);
			local36 = arg3 & 0xFF;
			local19 = (int) ((float) local19 * arg2);
			if (local178 < 0) {
				local178 = 0;
			} else if (local178 > 255) {
				local178 = 255;
			}
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			local36 = (int) ((float) local36 * arg2);
			if (local36 < 0) {
				local36 = 0;
			} else if (local36 > 255) {
				local36 = 255;
			}
			arg3 = local36 | local19 << 8 | local178 << 16;
		}
		this.aNativeStream1.b(arg0 * 4);
		this.aNativeStream1.a((byte) (arg3 >> 16));
		this.aNativeStream1.a((byte) (arg3 >> 8));
		this.aNativeStream1.a((byte) arg3);
	}

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(BI[I)V")
	public void method2361(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(19) Class3_Sub25_Sub2 local19 = this.aClass167_Sub1_14.aClass3_Sub25_Sub2_3;
		local19.anInt4974 = 0;
		@Pc(45) short[] local45;
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(28) int local28;
		@Pc(51) int local51;
		@Pc(53) int local53;
		if (this.aClass167_Sub1_14.aBoolean349) {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local39 = this.anIntArray147[local34];
				local45 = this.aClass55_Sub1_3.aShortArrayArray1[local34];
				if (local39 != 0 && local45 != null) {
					local51 = 0;
					local53 = 0;
					while (local45.length > local53) {
						if ((local39 & 0x1 << local51++) == 0) {
							local53 += 3;
						} else {
							local7++;
							local19.method4123(local45[local53++] & 0xFFFF);
							local19.method4123(local45[local53++] & 0xFFFF);
							local7++;
							local19.method4123(local45[local53++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local28 = 0; local28 < arg0; local28++) {
				local34 = arg1[local28];
				local39 = this.anIntArray147[local34];
				local45 = this.aClass55_Sub1_3.aShortArrayArray1[local34];
				if (local39 != 0 && local45 != null) {
					local51 = 0;
					local53 = 0;
					while (local53 < local45.length) {
						if ((0x1 << local51++ & local39) == 0) {
							local53 += 3;
						} else {
							local7++;
							local19.method4120(local45[local53++] & 0xFFFF);
							local7++;
							local19.method4120(local45[local53++] & 0xFFFF);
							local7++;
							local19.method4120(local45[local53++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		this.aClass89_Sub2_2.method4215(local19.anInt4974, local19.aByteArray88);
		this.aClass167_Sub1_14.method4045(this.aClass55_Sub1_3.aClass145_7, this.aClass55_Sub1_3.aClass145_5, this.aClass55_Sub1_3.aClass145_6, this.aClass145_10);
		this.aClass167_Sub1_14.method3987(this.anInt2770, (this.aClass55_Sub1_3.anInt1490 & 0x8) != 0, (this.aClass55_Sub1_3.anInt1490 & 0x7) != 0);
		if (this.aClass167_Sub1_14.aBoolean342) {
			this.aClass167_Sub1_14.KA(Integer.MAX_VALUE, this.anInt2769, this.anInt2766, this.anInt2765);
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(1.0F / this.aFloat49, 1.0F / this.aFloat49, 1.0F);
		OpenGL.glMatrixMode(5888);
		this.aClass167_Sub1_14.method4045(this.aClass55_Sub1_3.aClass145_7, this.aClass55_Sub1_3.aClass145_5, this.aClass55_Sub1_3.aClass145_6, this.aClass145_10);
		this.aClass167_Sub1_14.method4018(0, local7, this.aClass89_Sub2_2);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hj", name = "b", descriptor = "(II)V")
	public void method2363(@OriginalArg(0) int arg0) {
		this.aNativeBuffer3 = this.aClass167_Sub1_14.aNativeHeap2.a(arg0 * 4);
		this.aNativeStream1 = new NativeStream(this.aNativeBuffer3);
	}
}
