import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class14_Sub40 extends Class14 {

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!qd;")
	private Class168 aClass168_14;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!vn", name = "r", descriptor = "Lclient!kg;")
	private final Class114_Sub1 aClass114_Sub1_3;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "[I")
	private final int[] anIntArray621;

	@OriginalMember(owner = "client!vn", name = "m", descriptor = "I")
	private final int anInt6494;

	@OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
	private final int anInt6495;

	@OriginalMember(owner = "client!vn", name = "n", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_41;

	@OriginalMember(owner = "client!vn", name = "u", descriptor = "F")
	private final float aFloat143;

	@OriginalMember(owner = "client!vn", name = "t", descriptor = "I")
	private final int anInt6496;

	@OriginalMember(owner = "client!vn", name = "p", descriptor = "Lclient!so;")
	private final Class182_Sub1 aClass182_Sub1_1;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!kg;IIII)V")
	public Class14_Sub40(@OriginalArg(0) Class114_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass114_Sub1_3 = arg0;
		this.anIntArray621 = new int[this.aClass114_Sub1_3.anInt3873 * this.aClass114_Sub1_3.anInt3871];
		this.anInt6494 = arg3;
		this.anInt6495 = arg1;
		this.aClass46_Sub2_41 = this.aClass114_Sub1_3.aClass46_Sub2_20;
		this.aFloat143 = arg2;
		this.anInt6496 = arg4;
		this.aClass182_Sub1_1 = new Class182_Sub1(this.aClass46_Sub2_41, 5123, null, 1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(BI)V")
	public void method5788(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "([IIZ)V")
	public void method5789(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		@Pc(3) Class14_Sub4 local3 = Static163.aClass14_Sub4_6;
		local3.anInt2637 = 0;
		@Pc(32) short[] local32;
		@Pc(26) int local26;
		@Pc(37) int local37;
		@Pc(15) int local15;
		@Pc(47) int local47;
		@Pc(49) int local49;
		if (this.aClass46_Sub2_41.aBoolean397) {
			for (local15 = 0; local15 < arg1; local15++) {
				local26 = arg0[local15];
				local32 = this.aClass114_Sub1_3.aShortArrayArray4[local26];
				local37 = this.anIntArray621[local26];
				if (local37 != 0 && local32 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local32.length) {
						if ((0x1 << local47++ & local37) == 0) {
							local49 += 3;
						} else {
							local3.method2509(local32[local49++] & 0xFFFF);
							local1++;
							local1++;
							local3.method2509(local32[local49++] & 0xFFFF);
							local1++;
							local3.method2509(local32[local49++] & 0xFFFF);
						}
					}
				}
			}
		} else {
			for (local15 = 0; local15 < arg1; local15++) {
				local26 = arg0[local15];
				local37 = this.anIntArray621[local26];
				local32 = this.aClass114_Sub1_3.aShortArrayArray4[local26];
				if (local37 != 0 && local32 != null) {
					local47 = 0;
					local49 = 0;
					while (local49 < local32.length) {
						if ((0x1 << local47++ & local37) == 0) {
							local49 += 3;
						} else {
							local3.method2545(local32[local49++] & 0xFFFF);
							local1++;
							local1++;
							local3.method2545(local32[local49++] & 0xFFFF);
							local3.method2545(local32[local49++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(193) opengl local193 = this.aClass46_Sub2_41.anOpengl1;
		this.aClass46_Sub2_41.method5206(this.anInt6495, (this.aClass114_Sub1_3.anInt3431 & 0x7) != 0, (this.aClass114_Sub1_3.anInt3431 & 0x8) != 0);
		if (this.aClass46_Sub2_41.aBoolean399) {
			this.aClass46_Sub2_41.method5186(Integer.MAX_VALUE, this.anInt6494, this.anInt6496);
		}
		this.aClass182_Sub1_1.method5081(local3.aByteArray74, local3.anInt2637);
		local193.glMatrixMode(5890);
		local193.glPushMatrix();
		local193.glScalef(1.0F / this.aFloat143, 1.0F / this.aFloat143, 1.0F);
		local193.glMatrixMode(5888);
		this.aClass46_Sub2_41.method5217(this.aClass114_Sub1_3.aClass168_7, this.aClass114_Sub1_3.aClass168_10, this.aClass168_14, this.aClass114_Sub1_3.aClass168_8);
		this.aClass46_Sub2_41.method5231(this.aClass182_Sub1_1, 0, local1);
		local193.glMatrixMode(5890);
		local193.glPopMatrix();
		local193.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB)V")
	public void method5790(@OriginalArg(0) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)V")
	public void method5791(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(18) Interface3 local18 = this.aClass46_Sub2_41.method5196(0, this.aByteBuffer7);
		this.aClass168_14 = new Class168(this.aClass46_Sub2_41, local18, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IFIBI)V")
	public void method5792(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(34) int local34;
		if (this.anInt6495 != -1) {
			@Pc(13) Class154 local13 = this.aClass46_Sub2_41.anInterface2_6.method116(this.anInt6495);
			local18 = local13.aByte51 & 0xFF;
			@Pc(55) int local55;
			if (local18 != 0 && local13.aByte48 != 4) {
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
					local55 = 256 - local18;
					arg0 = ((local34 & 0xFF00) * local18 + (arg0 & 0xFF00) * local55 & 0xFF0000) + (local55 * (arg0 & 0xFF00FF) + (local34 & 0xFF00FF) * local18 & 0xFF00FF00) >> 8;
				}
			}
			local34 = local13.aByte49 & 0xFF;
			if (local34 != 0) {
				local34 += 256;
				@Pc(102) int local102 = (arg0 >> 16 & 0xFF) * local34;
				if (local102 > 65535) {
					local102 = 65535;
				}
				local55 = local34 * (arg0 >> 8 & 0xFF);
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(130) int local130 = (arg0 & 0xFF) * local34;
				if (local130 > 65535) {
					local130 = 65535;
				}
				arg0 = (local102 << 8 & 0xFF00A2) + (local55 & 0xFF00) + (local130 >> 8);
			}
		}
		if (arg1 != 1.0F) {
			@Pc(165) int local165 = arg0 >> 16 & 0xFF;
			local18 = arg0 >> 8 & 0xFF;
			local34 = arg0 & 0xFF;
			local165 = (int) ((float) local165 * arg1);
			if (local165 < 0) {
				local165 = 0;
			} else if (local165 > 255) {
				local165 = 255;
			}
			local18 = (int) ((float) local18 * arg1);
			local34 = (int) ((float) local34 * arg1);
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
			arg0 = local18 << 8 | local165 << 16 | local34;
		}
		this.aByteBuffer7.position(arg2 * 4);
		this.aByteBuffer7.put((byte) (arg0 >> 16));
		this.aByteBuffer7.put((byte) (arg0 >> 8));
		this.aByteBuffer7.put((byte) arg0);
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIZ)V")
	public void method5793(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anIntArray621[arg0 + arg1 * this.aClass114_Sub1_3.anInt3871] |= 0x1 << arg2;
	}
}
