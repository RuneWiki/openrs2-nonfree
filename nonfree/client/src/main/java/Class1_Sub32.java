import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!np")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!np", name = "l", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer5;

	@OriginalMember(owner = "client!np", name = "r", descriptor = "Lclient!jt;")
	private Class126 aClass126_11;

	@OriginalMember(owner = "client!np", name = "s", descriptor = "Lclient!lg;")
	private final Class42_Sub1 aClass42_Sub1_3;

	@OriginalMember(owner = "client!np", name = "t", descriptor = "F")
	public final float aFloat54;

	@OriginalMember(owner = "client!np", name = "v", descriptor = "I")
	public final int anInt4130;

	@OriginalMember(owner = "client!np", name = "o", descriptor = "I")
	public final int anInt4128;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_30;

	@OriginalMember(owner = "client!np", name = "n", descriptor = "I")
	public final int anInt4127;

	@OriginalMember(owner = "client!np", name = "m", descriptor = "[I")
	private final int[] anIntArray517;

	@OriginalMember(owner = "client!np", name = "p", descriptor = "I")
	public final int anInt4129;

	@OriginalMember(owner = "client!np", name = "u", descriptor = "Lclient!bb;")
	private final Class21_Sub1 aClass21_Sub1_2;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(Lclient!lg;IIIII)V")
	public Class1_Sub32(@OriginalArg(0) Class42_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass42_Sub1_3 = arg0;
		this.aFloat54 = arg2;
		this.anInt4130 = arg1;
		this.anInt4128 = arg5;
		this.aClass164_Sub1_30 = this.aClass42_Sub1_3.aClass164_Sub1_26;
		this.anInt4127 = arg3;
		this.anIntArray517 = new int[this.aClass42_Sub1_3.anInt3742 * this.aClass42_Sub1_3.anInt3739];
		this.anInt4129 = arg4;
		this.aClass21_Sub1_2 = new Class21_Sub1(this.aClass164_Sub1_30, 5123, null, 1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(BI)V")
	public void method3664(@OriginalArg(1) int arg0) {
		this.aByteBuffer5.position(arg0 * 4 + 3);
		this.aByteBuffer5.put((byte) -1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIIFI)V")
	public void method3665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3) {
		@Pc(17) int local17;
		@Pc(31) int local31;
		if (this.anInt4130 != -1) {
			@Pc(12) Class98 local12 = this.aClass164_Sub1_30.anInterface2_7.method4741(this.anInt4130);
			local17 = local12.aByte31 & 0xFF;
			@Pc(56) int local56;
			if (local17 != 0 && local12.aByte33 != 4) {
				if (arg1 < 0) {
					local31 = 0;
				} else if (arg1 <= 127) {
					local31 = arg1 * 131586;
				} else {
					local31 = 16777215;
				}
				if (local17 == 256) {
					arg0 = local31;
				} else {
					local56 = 256 - local17;
					arg0 = (local56 * (arg0 & 0xFF00FF) + local17 * (local31 & 0xFF00FF) & 0xFF00FF00) + ((arg0 & 0xFF00) * local56 + (local31 & 0xFF00) * local17 & 0xFF0000) >> 8;
				}
			}
			local31 = local12.aByte30 & 0xFF;
			if (local31 != 0) {
				local31 += 256;
				@Pc(109) int local109 = (arg0 >> 16 & 0xFF) * local31;
				if (local109 > 65535) {
					local109 = 65535;
				}
				local56 = (arg0 >> 8 & 0xFF) * local31;
				if (local56 > 65535) {
					local56 = 65535;
				}
				@Pc(136) int local136 = (arg0 & 0xFF) * local31;
				if (local136 > 65535) {
					local136 = 65535;
				}
				arg0 = (local136 >> 8) + (local56 & 0xFF00) + ((local109 & 0x6500FF00) << 8);
			}
		}
		this.aByteBuffer5.position(arg2 * 4);
		if (arg3 != 1.0F) {
			@Pc(173) int local173 = arg0 >> 16 & 0xFF;
			local17 = arg0 >> 8 & 0xFF;
			local173 = (int) ((float) local173 * arg3);
			local31 = arg0 & 0xFF;
			local17 = (int) ((float) local17 * arg3);
			if (local173 < 0) {
				local173 = 0;
			} else if (local173 > 255) {
				local173 = 255;
			}
			local31 = (int) ((float) local31 * arg3);
			if (local17 < 0) {
				local17 = 0;
			} else if (local17 > 255) {
				local17 = 255;
			}
			if (local31 < 0) {
				local31 = 0;
			} else if (local31 > 255) {
				local31 = 255;
			}
			arg0 = local17 << 8 | local173 << 16 | local31;
		}
		this.aByteBuffer5.put((byte) (arg0 >> 16));
		this.aByteBuffer5.put((byte) (arg0 >> 8));
		this.aByteBuffer5.put((byte) arg0);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIBI)V")
	public void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray517[arg2 * this.aClass42_Sub1_3.anInt3739 + arg1] |= 0x1 << arg0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(BI)V")
	public void method3667(@OriginalArg(1) int arg0) {
		this.aByteBuffer5.position(arg0 * 4);
		this.aByteBuffer5.flip();
		@Pc(26) Interface3 local26 = this.aClass164_Sub1_30.method3568(0, this.aByteBuffer5);
		this.aClass126_11 = new Class126(this.aClass164_Sub1_30, local26, 5121, 4, 0);
		this.aByteBuffer5 = null;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)V")
	public void method3668(@OriginalArg(0) int arg0) {
		this.aByteBuffer5 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I[IZ)V")
	public void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(7) int local7 = 0;
		@Pc(9) Class1_Sub33 local9 = Static204.aClass1_Sub33_5;
		local9.lb = 0;
		@Pc(36) short[] local36;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(18) int local18;
		@Pc(43) int local43;
		@Pc(45) int local45;
		if (this.aClass164_Sub1_30.aBoolean413) {
			for (local18 = 0; local18 < arg0; local18++) {
				local25 = arg1[local18];
				local30 = this.anIntArray517[local25];
				local36 = this.aClass42_Sub1_3.aShortArrayArray7[local25];
				if (local30 != 0 && local36 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local36.length) {
						if ((local30 & 0x1 << local43++) == 0) {
							local45 += 3;
						} else {
							local7++;
							local9.method5138(local36[local45++] & 0xFFFF);
							local9.method5138(local36[local45++] & 0xFFFF);
							local7++;
							local9.method5138(local36[local45++] & 0xFFFF);
							local7++;
						}
					}
				}
			}
		} else {
			for (local18 = 0; local18 < arg0; local18++) {
				local25 = arg1[local18];
				local36 = this.aClass42_Sub1_3.aShortArrayArray7[local25];
				local30 = this.anIntArray517[local25];
				if (local30 != 0 && local36 != null) {
					local43 = 0;
					local45 = 0;
					while (local45 < local36.length) {
						if ((0x1 << local43++ & local30) == 0) {
							local45 += 3;
						} else {
							local9.method5169(local36[local45++] & 0xFFFF);
							local7++;
							local9.method5169(local36[local45++] & 0xFFFF);
							local7++;
							local7++;
							local9.method5169(local36[local45++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local7 <= 0) {
			return;
		}
		@Pc(187) opengl local187 = this.aClass164_Sub1_30.anOpengl1;
		this.aClass21_Sub1_2.method3105(local9.aByteArray86, local9.lb);
		this.aClass164_Sub1_30.method3624(this.aClass42_Sub1_3.aClass126_10, this.aClass42_Sub1_3.aClass126_9, this.aClass126_11, this.aClass42_Sub1_3.aClass126_8);
		this.aClass164_Sub1_30.method3616(this.anInt4130, (this.aClass42_Sub1_3.anInt3580 & 0x7) != 0, (this.aClass42_Sub1_3.anInt3580 & 0x8) != 0);
		if (this.aClass164_Sub1_30.aBoolean419) {
			this.aClass164_Sub1_30.method5383(Integer.MAX_VALUE, this.anInt4127, this.anInt4129, this.anInt4128);
		}
		local187.glMatrixMode(5890);
		local187.glPushMatrix();
		local187.glScalef(1.0F / this.aFloat54, 1.0F / this.aFloat54, 1.0F);
		local187.glMatrixMode(5888);
		this.aClass164_Sub1_30.method3624(this.aClass42_Sub1_3.aClass126_10, this.aClass42_Sub1_3.aClass126_9, this.aClass126_11, this.aClass42_Sub1_3.aClass126_8);
		this.aClass164_Sub1_30.method3614(this.aClass21_Sub1_2, 0, local7);
		local187.glMatrixMode(5890);
		local187.glPopMatrix();
		local187.glMatrixMode(5888);
	}
}
