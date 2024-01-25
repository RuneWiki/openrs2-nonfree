import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class2_Sub38 extends Class2 {

	@OriginalMember(owner = "client!tt", name = "t", descriptor = "Lclient!uk;")
	private Class229 aClass229_14;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "Lclient!ch;")
	private final Class33_Sub1 aClass33_Sub1_3;

	@OriginalMember(owner = "client!tt", name = "u", descriptor = "I")
	public final int anInt6127;

	@OriginalMember(owner = "client!tt", name = "p", descriptor = "F")
	public final float aFloat94;

	@OriginalMember(owner = "client!tt", name = "w", descriptor = "I")
	public final int anInt6128;

	@OriginalMember(owner = "client!tt", name = "s", descriptor = "[I")
	private final int[] anIntArray734;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_38;

	@OriginalMember(owner = "client!tt", name = "o", descriptor = "I")
	public final int anInt6125;

	@OriginalMember(owner = "client!tt", name = "r", descriptor = "I")
	public final int anInt6126;

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "Lclient!kb;")
	private final Class131_Sub1 aClass131_Sub1_2;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!ch;IIIII)V")
	public Class2_Sub38(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33_Sub1_3 = arg0;
		this.anInt6127 = arg4;
		this.aFloat94 = arg2;
		this.anInt6128 = arg3;
		this.anIntArray734 = new int[this.aClass33_Sub1_3.anInt4627 * this.aClass33_Sub1_3.anInt4626];
		this.aClass82_Sub2_38 = this.aClass33_Sub1_3.aClass82_Sub2_12;
		this.anInt6125 = arg5;
		this.anInt6126 = arg1;
		this.aClass131_Sub1_2 = new Class131_Sub1(this.aClass82_Sub2_38, 5123, null, 1);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIIIF)V")
	public void method5283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(16) int local16;
		@Pc(40) int local40;
		if (this.anInt6126 != -1) {
			@Pc(11) Class182 local11 = this.aClass82_Sub2_38.anInterface1_4.method2849(this.anInt6126);
			local16 = local11.aByte49 & 0xFF;
			@Pc(57) int local57;
			if (local16 != 0 && local11.aByte47 != 4) {
				if (arg1 < 0) {
					local40 = 0;
				} else if (arg1 <= 127) {
					local40 = arg1 * 131586;
				} else {
					local40 = 16777215;
				}
				if (local16 == 256) {
					arg0 = local40;
				} else {
					local57 = 256 - local16;
					arg0 = ((local40 & 0xFF00) * local16 + local57 * (arg0 & 0xFF00) & 0xFF0000) + (local16 * (local40 & 0xFF00FF) + (arg0 & 0xFF00FF) * local57 & 0xFF00FF00) >> 8;
				}
			}
			local40 = local11.aByte51 & 0xFF;
			if (local40 != 0) {
				local40 += 256;
				@Pc(110) int local110 = (arg0 >> 16 & 0xFF) * local40;
				if (local110 > 65535) {
					local110 = 65535;
				}
				local57 = local40 * (arg0 >> 8 & 0xFF);
				if (local57 > 65535) {
					local57 = 65535;
				}
				@Pc(137) int local137 = local40 * (arg0 & 0xFF);
				if (local137 > 65535) {
					local137 = 65535;
				}
				arg0 = (local137 >> 8) + (local57 & 0xFF00) + (local110 << 8 & 0xFF008A);
			}
		}
		if (arg3 != 1.0F) {
			@Pc(167) int local167 = arg0 >> 16 & 0xFF;
			local16 = arg0 >> 8 & 0xFF;
			local167 = (int) ((float) local167 * arg3);
			local40 = arg0 & 0xFF;
			if (local167 < 0) {
				local167 = 0;
			} else if (local167 > 255) {
				local167 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local40 = (int) ((float) local40 * arg3);
			if (local40 < 0) {
				local40 = 0;
			} else if (local40 > 255) {
				local40 = 255;
			}
			arg0 = local40 | local167 << 16 | local16 << 8;
		}
		this.aByteBuffer7.position(arg2 * 4);
		this.aByteBuffer7.put((byte) (arg0 >> 16));
		this.aByteBuffer7.put((byte) (arg0 >> 8));
		this.aByteBuffer7.put((byte) arg0);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIII)V")
	public void method5284(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray734[arg2 + arg1 * this.aClass33_Sub1_3.anInt4627] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZI)V")
	public void method5285(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(25) Interface7 local25 = this.aClass82_Sub2_38.method4601(0, this.aByteBuffer7);
		this.aClass229_14 = new Class229(this.aClass82_Sub2_38, local25, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I[IB)V")
	public void method5286(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class2_Sub13 local3 = Static36.aClass2_Sub13_5;
		local3.anInt4788 = 0;
		@Pc(29) short[] local29;
		@Pc(23) int local23;
		@Pc(34) int local34;
		@Pc(12) int local12;
		@Pc(42) int local42;
		@Pc(44) int local44;
		if (this.aClass82_Sub2_38.aBoolean403) {
			for (local12 = 0; local12 < arg0; local12++) {
				local23 = arg1[local12];
				local29 = this.aClass33_Sub1_3.aShortArrayArray5[local23];
				local34 = this.anIntArray734[local23];
				if (local34 != 0 && local29 != null) {
					local42 = 0;
					local44 = 0;
					while (local29.length > local44) {
						if ((local34 & 0x1 << local42++) == 0) {
							local44 += 3;
						} else {
							local3.method4199(local29[local44++] & 0xFFFF);
							local1++;
							local1++;
							local3.method4199(local29[local44++] & 0xFFFF);
							local3.method4199(local29[local44++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local12 = 0; local12 < arg0; local12++) {
				local23 = arg1[local12];
				local29 = this.aClass33_Sub1_3.aShortArrayArray5[local23];
				local34 = this.anIntArray734[local23];
				if (local34 != 0 && local29 != null) {
					local42 = 0;
					local44 = 0;
					while (local44 < local29.length) {
						if ((local34 & 0x1 << local42++) == 0) {
							local44 += 3;
						} else {
							local3.method4243(local29[local44++] & 0xFFFF);
							local1++;
							local1++;
							local3.method4243(local29[local44++] & 0xFFFF);
							local3.method4243(local29[local44++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(184) opengl local184 = this.aClass82_Sub2_38.anOpengl2;
		this.aClass131_Sub1_2.method3548(local3.aByteArray77, local3.anInt4788);
		this.aClass82_Sub2_38.method4580(this.aClass33_Sub1_3.aClass229_4, this.aClass33_Sub1_3.aClass229_2, this.aClass229_14, this.aClass33_Sub1_3.aClass229_3);
		this.aClass82_Sub2_38.method4606(this.anInt6126, (this.aClass33_Sub1_3.anInt754 & 0x7) != 0, (this.aClass33_Sub1_3.anInt754 & 0x8) != 0);
		if (this.aClass82_Sub2_38.aBoolean398) {
			this.aClass82_Sub2_38.method4557(Integer.MAX_VALUE, this.anInt6128, this.anInt6127, this.anInt6125);
		}
		local184.glMatrixMode(5890);
		local184.glPushMatrix();
		local184.glScalef(1.0F / this.aFloat94, 1.0F / this.aFloat94, 1.0F);
		local184.glMatrixMode(5888);
		this.aClass82_Sub2_38.method4580(this.aClass33_Sub1_3.aClass229_4, this.aClass33_Sub1_3.aClass229_2, this.aClass229_14, this.aClass33_Sub1_3.aClass229_3);
		this.aClass82_Sub2_38.method4595(this.aClass131_Sub1_2, 0, local1);
		local184.glMatrixMode(5890);
		local184.glPopMatrix();
		local184.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(II)V")
	public void method5287(@OriginalArg(0) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)V")
	public void method5288(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}
}
