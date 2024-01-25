import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jj")
public final class Class7_Sub18 extends Class7 {

	@OriginalMember(owner = "client!jj", name = "p", descriptor = "Lclient!rs;")
	private Class181 aClass181_18;

	@OriginalMember(owner = "client!jj", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!jj", name = "o", descriptor = "Lclient!ag;")
	private final Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
	private final int anInt3260;

	@OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
	private final int anInt3259;

	@OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
	private final int anInt3261;

	@OriginalMember(owner = "client!jj", name = "m", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_22;

	@OriginalMember(owner = "client!jj", name = "t", descriptor = "F")
	private final float aFloat46;

	@OriginalMember(owner = "client!jj", name = "r", descriptor = "[I")
	private final int[] anIntArray428;

	@OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lclient!ag;IIII)V")
	public Class7_Sub18(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass8_Sub1_3 = arg0;
		this.anInt3260 = arg4;
		this.anInt3259 = arg3;
		this.anInt3261 = arg1;
		this.aClass89_Sub1_22 = this.aClass8_Sub1_3.aClass89_Sub1_1;
		this.aFloat46 = arg2;
		this.anIntArray428 = new int[this.aClass8_Sub1_3.anInt4755 * this.aClass8_Sub1_3.anInt4760];
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
	public void method2982(@OriginalArg(1) int arg0) {
		this.aByteBuffer5.position(arg0 * 4 + 3);
		this.aByteBuffer5.put((byte) -1);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)V")
	public void method2983(@OriginalArg(0) int arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
	public void method2984(@OriginalArg(0) int arg0) {
		this.aByteBuffer5.position(arg0 * 4);
		this.aByteBuffer5.flip();
		@Pc(18) Interface3 local18 = this.aClass89_Sub1_22.method2437(0, this.aByteBuffer5);
		this.aClass181_18 = new Class181(this.aClass89_Sub1_22, local18, 5121, 4, 0);
		this.aByteBuffer5 = null;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(BIII)V")
	public void method2985(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray428[arg2 + arg0 * this.aClass8_Sub1_3.anInt4755] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(I[II)V")
	public void method2986(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		Static7.aClass7_Sub3_1.anInt3005 = 0;
		@Pc(11) int local11 = 0;
		@Pc(35) short[] local35;
		@Pc(24) int local24;
		@Pc(29) int local29;
		@Pc(17) int local17;
		@Pc(44) int local44;
		@Pc(46) int local46;
		if (this.aClass89_Sub1_22.aBoolean195) {
			for (local17 = 0; local17 < arg0; local17++) {
				local24 = arg1[local17];
				local29 = this.anIntArray428[local24];
				local35 = this.aClass8_Sub1_3.aShortArrayArray1[local24];
				if (local29 != 0 && local35 != null) {
					local44 = 0;
					local46 = 0;
					while (local35.length > local46) {
						if ((local29 & 0x1 << local44++) == 0) {
							local46 += 3;
						} else {
							local11++;
							Static7.aClass7_Sub3_1.method2788(local35[local46++]);
							Static7.aClass7_Sub3_1.method2788(local35[local46++]);
							local11++;
							local11++;
							Static7.aClass7_Sub3_1.method2788(local35[local46++]);
						}
					}
				}
			}
		} else {
			for (local17 = 0; local17 < arg0; local17++) {
				local24 = arg1[local17];
				local35 = this.aClass8_Sub1_3.aShortArrayArray1[local24];
				local29 = this.anIntArray428[local24];
				if (local29 != 0 && local35 != null) {
					local44 = 0;
					local46 = 0;
					while (local35.length > local46) {
						if ((local29 & 0x1 << local44++) == 0) {
							local46 += 3;
						} else {
							local11++;
							Static7.aClass7_Sub3_1.method2753(local35[local46++]);
							Static7.aClass7_Sub3_1.method2753(local35[local46++]);
							local11++;
							local11++;
							Static7.aClass7_Sub3_1.method2753(local35[local46++]);
						}
					}
				}
			}
		}
		if (local11 <= 0) {
			return;
		}
		@Pc(164) opengl local164 = this.aClass89_Sub1_22.anOpengl2;
		this.aClass89_Sub1_22.method2461(this.anInt3261, (this.aClass8_Sub1_3.anInt148 & 0x7) != 0, (this.aClass8_Sub1_3.anInt148 & 0x8) != 0);
		if (this.aClass89_Sub1_22.aBoolean198) {
			this.aClass89_Sub1_22.method5417(Integer.MAX_VALUE, this.anInt3259, this.anInt3260);
		}
		this.aClass89_Sub1_22.anInterface9_3.method5712(Static7.aClass7_Sub3_1.aByteArray33, Static7.aClass7_Sub3_1.anInt3005);
		local164.glMatrixMode(5890);
		local164.glPushMatrix();
		local164.glScalef(1.0F / this.aFloat46, 1.0F / this.aFloat46, 1.0F);
		local164.glMatrixMode(5888);
		this.aClass89_Sub1_22.method2467(this.aClass181_18);
		this.aClass89_Sub1_22.method2427(this.aClass8_Sub1_3.aClass181_4);
		this.aClass89_Sub1_22.method2426(0, this.aClass8_Sub1_3.aClass181_5);
		if ((this.aClass8_Sub1_3.anInt148 & 0x7) == 0) {
			this.aClass89_Sub1_22.method2407(false);
		} else {
			this.aClass89_Sub1_22.method2421(this.aClass8_Sub1_3.aClass181_3);
			this.aClass89_Sub1_22.method2407(true);
		}
		if (this.aClass8_Sub1_3.aClass181_2 != null) {
			this.aClass89_Sub1_22.method2426(1, this.aClass8_Sub1_3.aClass181_2);
		}
		this.aClass89_Sub1_22.method2435();
		this.aClass89_Sub1_22.method2398(this.aClass89_Sub1_22.anInterface9_3, 0, local11);
		local164.glMatrixMode(5890);
		local164.glPopMatrix();
		local164.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIFI)V")
	public void method2987(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(34) int local34;
		if (this.anInt3261 != -1) {
			@Pc(13) Class18 local13 = this.aClass89_Sub1_22.anInterface6_3.method5614(this.anInt3261);
			local18 = local13.aByte7 & 0xFF;
			@Pc(54) int local54;
			if (local18 != 0 && local13.aByte5 != 4) {
				if (arg3 < 0) {
					local34 = 0;
				} else if (arg3 > 127) {
					local34 = 16777215;
				} else {
					local34 = arg3 * 131586;
				}
				if (local18 == 256) {
					arg0 = local34;
				} else {
					local54 = 256 - local18;
					arg0 = ((arg0 & 0xFF00) * local54 + local18 * (local34 & 0xFF00) & 0xFF0000) + ((local34 & 0xFF00FF) * local18 + (arg0 & 0xFF00FF) * local54 & 0xFF00FF00) >> 8;
				}
			}
			local34 = local13.aByte2 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(107) int local107 = (arg0 >> 16 & 0xFF) * local34;
				if (local107 > 65535) {
					local107 = 65535;
				}
				local54 = (arg0 >> 8 & 0xFF) * local34;
				if (local54 > 65535) {
					local54 = 65535;
				}
				@Pc(133) int local133 = (arg0 & 0xFF) * local34;
				if (local133 > 65535) {
					local133 = 65535;
				}
				arg0 = (local133 >> 8) + (local107 << 8 & 0xFF00C3) + (local54 & 0xFF00);
			}
		}
		this.aByteBuffer5.position(arg1 * 4);
		if (arg2 != 1.0F) {
			@Pc(173) int local173 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local34 = arg0 & 0xFF;
			local173 = (int) ((float) local173 * arg2);
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 255) {
				local173 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			local34 = (int) ((float) local34 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local34 < 0) {
				local34 = 0;
			} else if (local34 > 255) {
				local34 = 255;
			}
			arg0 = local173 << 16 | local18 << 8 | local34;
		}
		this.aByteBuffer5.put((byte) (arg0 >> 16));
		this.aByteBuffer5.put((byte) (arg0 >> 8));
		this.aByteBuffer5.put((byte) arg0);
	}
}
