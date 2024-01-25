import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class2_Sub30 extends Class2 {

	@OriginalMember(owner = "client!pr", name = "p", descriptor = "Lclient!tf;")
	private Class190 aClass190_9;

	@OriginalMember(owner = "client!pr", name = "v", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!pr", name = "q", descriptor = "Lclient!pj;")
	private final Class105_Sub2 aClass105_Sub2_2;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_33;

	@OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
	private final int anInt5359;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	private final int anInt5358;

	@OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
	private final int anInt5360;

	@OriginalMember(owner = "client!pr", name = "w", descriptor = "F")
	private final float aFloat64;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "[I")
	private final int[] anIntArray416;

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "Lclient!sd;")
	private final Class106_Sub2 aClass106_Sub2_2;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!pj;IIII)V")
	public Class2_Sub30(@OriginalArg(0) Class105_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass105_Sub2_2 = arg0;
		this.aClass37_Sub1_33 = this.aClass105_Sub2_2.aClass37_Sub1_31;
		this.anInt5359 = arg3;
		this.anInt5358 = arg4;
		this.anInt5360 = arg1;
		this.aFloat64 = arg2;
		this.anIntArray416 = new int[this.aClass105_Sub2_2.anInt5260 * this.aClass105_Sub2_2.anInt5261];
		this.aClass106_Sub2_2 = new Class106_Sub2(this.aClass37_Sub1_33, 5123, null, 1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public void method4547(@OriginalArg(0) int arg0) {
		this.aByteBuffer6.position(arg0 * 4 + 3);
		this.aByteBuffer6.put((byte) -1);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)V")
	public void method4548(@OriginalArg(1) int arg0) {
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "([III)V")
	public void method4549(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(13) Class2_Sub12 local13 = Static252.aClass2_Sub12_6;
		local13.anInt3606 = 0;
		@Pc(40) short[] local40;
		@Pc(29) int local29;
		@Pc(34) int local34;
		@Pc(22) int local22;
		@Pc(49) int local49;
		@Pc(51) int local51;
		if (this.aClass37_Sub1_33.aBoolean72) {
			for (local22 = 0; local22 < arg1; local22++) {
				local29 = arg0[local22];
				local40 = this.aClass105_Sub2_2.aShortArrayArray13[local29];
				local34 = this.anIntArray416[local29];
				if (local34 != 0 && local40 != null) {
					local49 = 0;
					local51 = 0;
					while (local51 < local40.length) {
						if ((local34 & 0x1 << local49++) == 0) {
							local51 += 3;
						} else {
							local13.method3158(local40[local51++] & 0xFFFF);
							local1++;
							local13.method3158(local40[local51++] & 0xFFFF);
							local1++;
							local13.method3158(local40[local51++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local22 = 0; local22 < arg1; local22++) {
				local29 = arg0[local22];
				local34 = this.anIntArray416[local29];
				local40 = this.aClass105_Sub2_2.aShortArrayArray13[local29];
				if (local34 != 0 && local40 != null) {
					local49 = 0;
					local51 = 0;
					while (local51 < local40.length) {
						if ((0x1 << local49++ & local34) == 0) {
							local51 += 3;
						} else {
							local1++;
							local13.method3110(local40[local51++] & 0xFFFF);
							local1++;
							local13.method3110(local40[local51++] & 0xFFFF);
							local1++;
							local13.method3110(local40[local51++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(185) opengl local185 = this.aClass37_Sub1_33.anOpengl1;
		this.aClass37_Sub1_33.method771(this.anInt5360, (this.aClass105_Sub2_2.anInt5266 & 0x7) != 0, (this.aClass105_Sub2_2.anInt5266 & 0x8) != 0);
		if (this.aClass37_Sub1_33.aBoolean69) {
			this.aClass37_Sub1_33.method3730(Integer.MAX_VALUE, this.anInt5359, this.anInt5358);
		}
		this.aClass106_Sub2_2.method4905(local13.aByteArray30, local13.anInt3606);
		local185.glMatrixMode(5890);
		local185.glPushMatrix();
		local185.glScalef(1.0F / this.aFloat64, 1.0F / this.aFloat64, 1.0F);
		local185.glMatrixMode(5888);
		this.aClass37_Sub1_33.method737(this.aClass105_Sub2_2.aClass190_5, this.aClass105_Sub2_2.aClass190_7, this.aClass190_9, this.aClass105_Sub2_2.aClass190_8);
		this.aClass37_Sub1_33.method765(this.aClass106_Sub2_2, 0, local1);
		local185.glMatrixMode(5890);
		local185.glPopMatrix();
		local185.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IZ)V")
	public void method4550(@OriginalArg(0) int arg0) {
		this.aByteBuffer6.position(arg0 * 4);
		this.aByteBuffer6.flip();
		@Pc(22) Interface7 local22 = this.aClass37_Sub1_33.method760(0, this.aByteBuffer6);
		this.aClass190_9 = new Class190(this.aClass37_Sub1_33, local22, 5121, 4, 0);
		this.aByteBuffer6 = null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIII)V")
	public void method4551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray416[arg2 * this.aClass105_Sub2_2.anInt5260 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IIIIF)V")
	public void method4552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(16) int local16;
		@Pc(34) int local34;
		if (this.anInt5360 != -1) {
			@Pc(11) Class89 local11 = this.aClass37_Sub1_33.anInterface3_1.method166(this.anInt5360);
			local16 = local11.aByte27 & 0xFF;
			@Pc(52) int local52;
			if (local16 != 0 && local11.aByte28 != 4) {
				if (arg2 < 0) {
					local34 = 0;
				} else if (arg2 > 127) {
					local34 = 16777215;
				} else {
					local34 = arg2 * 131586;
				}
				if (local16 == 256) {
					arg0 = local34;
				} else {
					local52 = 256 - local16;
					arg0 = ((local34 & 0xFF00) * local16 + local52 * (arg0 & 0xFF00) & 0xFF0000) + ((local34 & 0xFF00FF) * local16 + (arg0 & 0xFF00FF) * local52 & 0xFF00FF00) >> 8;
				}
			}
			local34 = local11.aByte25 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(101) int local101 = (arg0 >> 16 & 0xFF) * local34;
				if (local101 > 65535) {
					local101 = 65535;
				}
				local52 = local34 * (arg0 >> 8 & 0xFF);
				if (local52 > 65535) {
					local52 = 65535;
				}
				@Pc(129) int local129 = (arg0 & 0xFF) * local34;
				if (local129 > 65535) {
					local129 = 65535;
				}
				arg0 = ((local101 & 0xDB00FF00) << 8) - (-(local52 & 0xFF00) - (local129 >> 8));
			}
		}
		this.aByteBuffer6.position(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(167) int local167 = arg0 >> 16 & 0xFF;
			local16 = arg0 >> 8 & 0xFF;
			local167 = (int) ((float) local167 * arg3);
			local34 = arg0 & 0xFF;
			local16 = (int) ((float) local16 * arg3);
			if (local167 < 0) {
				local167 = 0;
			} else if (local167 > 255) {
				local167 = 255;
			}
			local34 = (int) ((float) local34 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg0 = local167 << 16 | local16 << 8 | local34;
		}
		this.aByteBuffer6.put((byte) (arg0 >> 16));
		this.aByteBuffer6.put((byte) (arg0 >> 8));
		this.aByteBuffer6.put((byte) arg0);
	}
}
