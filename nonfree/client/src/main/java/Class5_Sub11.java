import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!di")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!di", name = "i", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer4;

	@OriginalMember(owner = "client!di", name = "p", descriptor = "Lclient!pe;")
	private Class156 aClass156_1;

	@OriginalMember(owner = "client!di", name = "o", descriptor = "Lclient!wa;")
	private final Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "I")
	private final int anInt1373;

	@OriginalMember(owner = "client!di", name = "m", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_13;

	@OriginalMember(owner = "client!di", name = "k", descriptor = "F")
	private final float aFloat19;

	@OriginalMember(owner = "client!di", name = "q", descriptor = "[I")
	private final int[] anIntArray64;

	@OriginalMember(owner = "client!di", name = "j", descriptor = "I")
	private final int anInt1371;

	@OriginalMember(owner = "client!di", name = "l", descriptor = "I")
	private final int anInt1372;

	@OriginalMember(owner = "client!di", name = "<init>", descriptor = "(Lclient!wa;IIII)V")
	public Class5_Sub11(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass3_Sub2_1 = arg0;
		this.anInt1373 = arg1;
		this.aClass59_Sub1_13 = this.aClass3_Sub2_1.aClass59_Sub1_38;
		this.aFloat19 = arg2;
		this.anIntArray64 = new int[this.aClass3_Sub2_1.anInt6360 * this.aClass3_Sub2_1.anInt6361];
		this.anInt1371 = arg4;
		this.anInt1372 = arg3;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IZ)V")
	public void method1207(@OriginalArg(0) int arg0) {
		this.aByteBuffer4 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BIII)V")
	public void method1208(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray64[arg1 * this.aClass3_Sub2_1.anInt6360 + arg2] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IB)V")
	public void method1209(@OriginalArg(0) int arg0) {
		this.aByteBuffer4.position(arg0 * 4 + 3);
		this.aByteBuffer4.put((byte) -1);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(IIBIF)V")
	public void method1210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) float arg3) {
		@Pc(16) int local16;
		@Pc(29) int local29;
		if (this.anInt1373 != -1) {
			@Pc(11) Class84 local11 = this.aClass59_Sub1_13.anInterface1_5.method2005(this.anInt1373);
			local16 = local11.aByte26 & 0xFF;
			@Pc(49) int local49;
			if (local16 != 0 && local11.aByte29 != 4) {
				if (arg0 < 0) {
					local29 = 0;
				} else if (arg0 > 127) {
					local29 = 16777215;
				} else {
					local29 = arg0 * 131586;
				}
				if (local16 == 256) {
					arg2 = local29;
				} else {
					local49 = 256 - local16;
					arg2 = (local16 * (local29 & 0xFF00) + (arg2 & 0xFF00) * local49 & 0xFF0000) + (local49 * (arg2 & 0xFF00FF) + local16 * (local29 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local29 = local11.aByte30 & 0xFF;
			if (local29 != 0) {
				local29 += 256;
				@Pc(103) int local103 = local29 * (arg2 >> 16 & 0xFF);
				if (local103 > 65535) {
					local103 = 65535;
				}
				local49 = local29 * (arg2 >> 8 & 0xFF);
				if (local49 > 65535) {
					local49 = 65535;
				}
				@Pc(131) int local131 = local29 * (arg2 & 0xFF);
				if (local131 > 65535) {
					local131 = 65535;
				}
				arg2 = (local131 >> 8) + (local49 & 0xFF00) + (local103 << 8 & 0xFF000A);
			}
		}
		this.aByteBuffer4.position(arg1 * 4);
		if (arg3 != 1.0F) {
			@Pc(174) int local174 = arg2 >> 16 & 0xFF;
			local16 = arg2 >> 8 & 0xFF;
			local29 = arg2 & 0xFF;
			local174 = (int) ((float) local174 * arg3);
			if (local174 < 0) {
				local174 = 0;
			} else if (local174 > 255) {
				local174 = 255;
			}
			local16 = (int) ((float) local16 * arg3);
			if (local16 < 0) {
				local16 = 0;
			} else if (local16 > 255) {
				local16 = 255;
			}
			local29 = (int) ((float) local29 * arg3);
			if (local29 < 0) {
				local29 = 0;
			} else if (local29 > 255) {
				local29 = 255;
			}
			arg2 = local29 | local174 << 16 | local16 << 8;
		}
		this.aByteBuffer4.put((byte) (arg2 >> 16));
		this.aByteBuffer4.put((byte) (arg2 >> 8));
		this.aByteBuffer4.put((byte) arg2);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "([III)V")
	public void method1211(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		Static340.aClass5_Sub1_9.anInt2029 = 0;
		@Pc(23) short[] local23;
		@Pc(17) int local17;
		@Pc(28) int local28;
		@Pc(10) int local10;
		@Pc(35) int local35;
		@Pc(37) int local37;
		if (this.aClass59_Sub1_13.aBoolean350) {
			for (local10 = 0; local10 < arg1; local10++) {
				local17 = arg0[local10];
				local23 = this.aClass3_Sub2_1.aShortArrayArray16[local17];
				local28 = this.anIntArray64[local17];
				if (local28 != 0 && local23 != null) {
					local35 = 0;
					local37 = 0;
					while (local37 < local23.length) {
						if ((0x1 << local35++ & local28) == 0) {
							local37 += 3;
						} else {
							Static340.aClass5_Sub1_9.method1870(local23[local37++]);
							local1++;
							Static340.aClass5_Sub1_9.method1870(local23[local37++]);
							local1++;
							local1++;
							Static340.aClass5_Sub1_9.method1870(local23[local37++]);
						}
					}
				}
			}
		} else {
			for (local10 = 0; local10 < arg1; local10++) {
				local17 = arg0[local10];
				local23 = this.aClass3_Sub2_1.aShortArrayArray16[local17];
				local28 = this.anIntArray64[local17];
				if (local28 != 0 && local23 != null) {
					local35 = 0;
					local37 = 0;
					while (local23.length > local37) {
						if ((local28 & 0x1 << local35++) == 0) {
							local37 += 3;
						} else {
							local1++;
							Static340.aClass5_Sub1_9.method1829(local23[local37++]);
							Static340.aClass5_Sub1_9.method1829(local23[local37++]);
							local1++;
							local1++;
							Static340.aClass5_Sub1_9.method1829(local23[local37++]);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(178) opengl local178 = this.aClass59_Sub1_13.anOpengl2;
		this.aClass59_Sub1_13.method4293(this.anInt1373, (this.aClass3_Sub2_1.anInt6365 & 0x7) != 0, (this.aClass3_Sub2_1.anInt6365 & 0x8) != 0);
		if (this.aClass59_Sub1_13.aBoolean363) {
			this.aClass59_Sub1_13.method4863(Integer.MAX_VALUE, this.anInt1372, this.anInt1371);
		}
		this.aClass59_Sub1_13.anInterface2_4.method2597(Static340.aClass5_Sub1_9.aByteArray18, Static340.aClass5_Sub1_9.anInt2029);
		local178.glMatrixMode(5890);
		local178.glPushMatrix();
		local178.glScalef(1.0F / this.aFloat19, 1.0F / this.aFloat19, 1.0F);
		local178.glMatrixMode(5888);
		this.aClass59_Sub1_13.method4322(this.aClass156_1);
		this.aClass59_Sub1_13.method4288(this.aClass3_Sub2_1.aClass156_13);
		this.aClass59_Sub1_13.method4275(0, this.aClass3_Sub2_1.aClass156_14);
		if ((this.aClass3_Sub2_1.anInt6365 & 0x7) == 0) {
			this.aClass59_Sub1_13.method4321(false);
		} else {
			this.aClass59_Sub1_13.method4268(this.aClass3_Sub2_1.aClass156_15);
			this.aClass59_Sub1_13.method4321(true);
		}
		if (this.aClass3_Sub2_1.aClass156_16 != null) {
			this.aClass59_Sub1_13.method4275(1, this.aClass3_Sub2_1.aClass156_16);
		}
		this.aClass59_Sub1_13.method4325();
		this.aClass59_Sub1_13.method4318(this.aClass59_Sub1_13.anInterface2_4, 0, local1);
		local178.glMatrixMode(5890);
		local178.glPopMatrix();
		local178.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(II)V")
	public void method1212(@OriginalArg(0) int arg0) {
		this.aByteBuffer4.position(arg0 * 4);
		this.aByteBuffer4.flip();
		@Pc(18) Interface9 local18 = this.aClass59_Sub1_13.method4300(0, this.aByteBuffer4);
		this.aClass156_1 = new Class156(this.aClass59_Sub1_13, local18, 5121, 4, 0);
		this.aByteBuffer4 = null;
	}
}
