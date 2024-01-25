import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class4_Sub37 extends Class4 {

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "Lclient!wi;")
	private Class217 aClass217_12;

	@OriginalMember(owner = "client!qs", name = "t", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!qs", name = "q", descriptor = "Lclient!er;")
	private final Class60_Sub1 aClass60_Sub1_1;

	@OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
	private final int anInt5358;

	@OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
	private final int anInt5359;

	@OriginalMember(owner = "client!qs", name = "r", descriptor = "[I")
	private final int[] anIntArray433;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
	private final int anInt5360;

	@OriginalMember(owner = "client!qs", name = "u", descriptor = "F")
	private final float aFloat87;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_31;

	@OriginalMember(owner = "client!qs", name = "w", descriptor = "Lclient!pg;")
	private final Class66_Sub2 aClass66_Sub2_2;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!er;IIII)V")
	public Class4_Sub37(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass60_Sub1_1 = arg0;
		this.anInt5358 = arg3;
		this.anInt5359 = arg1;
		this.anIntArray433 = new int[this.aClass60_Sub1_1.anInt2567 * this.aClass60_Sub1_1.anInt2564];
		this.anInt5360 = arg4;
		this.aFloat87 = arg2;
		this.aClass47_Sub2_31 = this.aClass60_Sub1_1.aClass47_Sub2_11;
		this.aClass66_Sub2_2 = new Class66_Sub2(this.aClass47_Sub2_31, 5123, null, 1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IFIII)V")
	public void method4606(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(19) int local19;
		@Pc(32) int local32;
		if (this.anInt5359 != -1) {
			@Pc(14) Class102 local14 = this.aClass47_Sub2_31.anInterface3_5.method5441(this.anInt5359);
			local19 = local14.aByte41 & 0xFF;
			@Pc(60) int local60;
			if (local19 != 0 && local14.aByte36 != 4) {
				if (arg2 < 0) {
					local32 = 0;
				} else if (arg2 <= 127) {
					local32 = arg2 * 131586;
				} else {
					local32 = 16777215;
				}
				if (local19 == 256) {
					arg3 = local32;
				} else {
					local60 = 256 - local19;
					arg3 = (local19 * (local32 & 0xFF00FF) + (arg3 & 0xFF00FF) * local60 & 0xFF00FF00) + ((local32 & 0xFF00) * local19 + (arg3 & 0xFF00) * local60 & 0xFF0000) >> 8;
				}
			}
			local32 = local14.aByte38 & 0xFF;
			if (local32 != 0) {
				local32 += 256;
				@Pc(110) int local110 = (arg3 >> 16 & 0xFF) * local32;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local60 = (arg3 >> 8 & 0xFF) * local32;
				if (local60 > 65535) {
					local60 = 65535;
				}
				@Pc(139) int local139 = (arg3 & 0xFF) * local32;
				if (local139 > 65535) {
					local139 = 65535;
				}
				arg3 = (local60 & 0xFF00) + ((local110 & 0x9800FF00) << 8) + (local139 >> 8);
			}
		}
		this.aByteBuffer7.position(arg1 * 4);
		if (arg0 != 1.0F) {
			@Pc(175) int local175 = arg3 >> 16 & 0xFF;
			local19 = arg3 >> 8 & 0xFF;
			local175 = (int) ((float) local175 * arg0);
			local32 = arg3 & 0xFF;
			if (local175 < 0) {
				local175 = 0;
			} else if (local175 > 255) {
				local175 = 255;
			}
			local19 = (int) ((float) local19 * arg0);
			local32 = (int) ((float) local32 * arg0);
			if (local19 < 0) {
				local19 = 0;
			} else if (local19 > 255) {
				local19 = 255;
			}
			if (local32 < 0) {
				local32 = 0;
			} else if (local32 > 255) {
				local32 = 255;
			}
			arg3 = local32 | local19 << 8 | local175 << 16;
		}
		this.aByteBuffer7.put((byte) (arg3 >> 16));
		this.aByteBuffer7.put((byte) (arg3 >> 8));
		this.aByteBuffer7.put((byte) arg3);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(II)V")
	public void method4607(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIB)V")
	public void method4608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray433[arg2 + arg1 * this.aClass60_Sub1_1.anInt2567] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(II)V")
	public void method4609(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(22) Interface8 local22 = this.aClass47_Sub2_31.method2787(0, this.aByteBuffer7);
		this.aClass217_12 = new Class217(this.aClass47_Sub2_31, local22, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "([III)V")
	public void method4610(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class4_Sub11 local3 = Static79.aClass4_Sub11_6;
		local3.anInt3768 = 0;
		@Pc(30) short[] local30;
		@Pc(19) int local19;
		@Pc(24) int local24;
		@Pc(12) int local12;
		@Pc(39) int local39;
		@Pc(41) int local41;
		if (this.aClass47_Sub2_31.aBoolean235) {
			for (local12 = 0; local12 < arg1; local12++) {
				local19 = arg0[local12];
				local30 = this.aClass60_Sub1_1.aShortArrayArray2[local19];
				local24 = this.anIntArray433[local19];
				if (local24 != 0 && local30 != null) {
					local39 = 0;
					local41 = 0;
					while (local30.length > local41) {
						if ((local24 & 0x1 << local39++) == 0) {
							local41 += 3;
						} else {
							local3.method3402(local30[local41++] & 0xFFFF);
							local1++;
							local1++;
							local3.method3402(local30[local41++] & 0xFFFF);
							local1++;
							local3.method3402(local30[local41++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local12 = 0; local12 < arg1; local12++) {
				local19 = arg0[local12];
				local24 = this.anIntArray433[local19];
				local30 = this.aClass60_Sub1_1.aShortArrayArray2[local19];
				if (local24 != 0 && local30 != null) {
					local39 = 0;
					local41 = 0;
					while (local41 < local30.length) {
						if ((local24 & 0x1 << local39++) == 0) {
							local41 += 3;
						} else {
							local1++;
							local3.method3430(local30[local41++] & 0xFFFF);
							local1++;
							local3.method3430(local30[local41++] & 0xFFFF);
							local1++;
							local3.method3430(local30[local41++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(194) opengl local194 = this.aClass47_Sub2_31.anOpengl2;
		this.aClass47_Sub2_31.method2774(this.anInt5359, (this.aClass60_Sub1_1.anInt2108 & 0x7) != 0, (this.aClass60_Sub1_1.anInt2108 & 0x8) != 0);
		if (this.aClass47_Sub2_31.aBoolean224) {
			this.aClass47_Sub2_31.method2741(Integer.MAX_VALUE, this.anInt5358, this.anInt5360);
		}
		this.aClass66_Sub2_2.method4258(local3.aByteArray55, local3.anInt3768);
		local194.glMatrixMode(5890);
		local194.glPushMatrix();
		local194.glScalef(1.0F / this.aFloat87, 1.0F / this.aFloat87, 1.0F);
		local194.glMatrixMode(5888);
		this.aClass47_Sub2_31.method2805(this.aClass60_Sub1_1.aClass217_7, this.aClass60_Sub1_1.aClass217_8, this.aClass217_12, this.aClass60_Sub1_1.aClass217_6);
		this.aClass47_Sub2_31.method2818(this.aClass66_Sub2_2, 0, local1);
		local194.glMatrixMode(5890);
		local194.glPopMatrix();
		local194.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "(II)V")
	public void method4611(@OriginalArg(0) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}
}
