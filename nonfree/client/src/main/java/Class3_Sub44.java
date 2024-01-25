import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class3_Sub44 extends Class3 {

	@OriginalMember(owner = "client!wo", name = "p", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer7;

	@OriginalMember(owner = "client!wo", name = "q", descriptor = "Lclient!ga;")
	private Class88 aClass88_14;

	@OriginalMember(owner = "client!wo", name = "o", descriptor = "Lclient!ag;")
	private final Class7_Sub1 aClass7_Sub1_3;

	@OriginalMember(owner = "client!wo", name = "r", descriptor = "I")
	public final int anInt6464;

	@OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
	public final int anInt6465;

	@OriginalMember(owner = "client!wo", name = "l", descriptor = "F")
	public final float aFloat77;

	@OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
	public final int anInt6466;

	@OriginalMember(owner = "client!wo", name = "m", descriptor = "[I")
	private final int[] anIntArray704;

	@OriginalMember(owner = "client!wo", name = "s", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_42;

	@OriginalMember(owner = "client!wo", name = "v", descriptor = "I")
	public final int anInt6467;

	@OriginalMember(owner = "client!wo", name = "n", descriptor = "Lclient!ig;")
	private final Class109_Sub1 aClass109_Sub1_2;

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lclient!ag;IIIII)V")
	public Class3_Sub44(@OriginalArg(0) Class7_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass7_Sub1_3 = arg0;
		this.anInt6464 = arg4;
		this.anInt6465 = arg3;
		this.aFloat77 = arg2;
		this.anInt6466 = arg1;
		this.anIntArray704 = new int[this.aClass7_Sub1_3.anInt6380 * this.aClass7_Sub1_3.anInt6381];
		this.aClass155_Sub1_42 = this.aClass7_Sub1_3.aClass155_Sub1_3;
		this.anInt6467 = arg5;
		this.aClass109_Sub1_2 = new Class109_Sub1(this.aClass155_Sub1_42, 5123, null, 1);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IBII)V")
	public void method5704(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray704[arg2 + arg0 * this.aClass7_Sub1_3.anInt6380] |= 0x1 << arg1;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(BI)V")
	public void method5705(@OriginalArg(1) int arg0) {
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.flip();
		@Pc(24) Interface5 local24 = this.aClass155_Sub1_42.method3625(0, this.aByteBuffer7);
		this.aClass88_14 = new Class88(this.aClass155_Sub1_42, local24, 5121, 4, 0);
		this.aByteBuffer7 = null;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IZ)V")
	public void method5706(@OriginalArg(0) int arg0) {
		this.aByteBuffer7.position(arg0 * 4 + 3);
		this.aByteBuffer7.put((byte) -1);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)V")
	public void method5707(@OriginalArg(1) int arg0) {
		this.aByteBuffer7 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(IIIFI)V")
	public void method5708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		@Pc(39) int local39;
		if (this.anInt6466 != -1) {
			@Pc(13) Class121 local13 = this.aClass155_Sub1_42.anInterface10_7.method192(this.anInt6466);
			local18 = local13.aByte44 & 0xFF;
			@Pc(55) int local55;
			if (local18 != 0 && local13.aByte40 != 4) {
				if (arg1 < 0) {
					local39 = 0;
				} else if (arg1 <= 127) {
					local39 = arg1 * 131586;
				} else {
					local39 = 16777215;
				}
				if (local18 == 256) {
					arg3 = local39;
				} else {
					local55 = 256 - local18;
					arg3 = (local55 * (arg3 & 0xFF00FF) + (local39 & 0xFF00FF) * local18 & 0xFF00FF00) + (local55 * (arg3 & 0xFF00) + local18 * (local39 & 0xFF00) & 0xFF0000) >> 8;
				}
			}
			local39 = local13.aByte42 & 0xFF;
			if (local39 != 0) {
				local39 += 256;
				@Pc(109) int local109 = local39 * (arg3 >> 16 & 0xFF);
				if (local109 > 65535) {
					local109 = 65535;
				}
				local55 = (arg3 >> 8 & 0xFF) * local39;
				if (local55 > 65535) {
					local55 = 65535;
				}
				@Pc(135) int local135 = local39 * (arg3 & 0xFF);
				if (local135 > 65535) {
					local135 = 65535;
				}
				arg3 = ((local109 & 0xD500FF00) << 8) + (local55 & 0xFF00) + (local135 >> 8);
			}
		}
		if (arg2 != 1.0F) {
			@Pc(166) int local166 = arg3 >> 16 & 0xFF;
			local18 = arg3 >> 8 & 0xFF;
			local39 = arg3 & 0xFF;
			local166 = (int) ((float) local166 * arg2);
			if (local166 < 0) {
				local166 = 0;
			} else if (local166 > 255) {
				local166 = 255;
			}
			local18 = (int) ((float) local18 * arg2);
			local39 = (int) ((float) local39 * arg2);
			if (local18 < 0) {
				local18 = 0;
			} else if (local18 > 255) {
				local18 = 255;
			}
			if (local39 < 0) {
				local39 = 0;
			} else if (local39 > 255) {
				local39 = 255;
			}
			arg3 = local39 | local166 << 16 | local18 << 8;
		}
		this.aByteBuffer7.position(arg0 * 4);
		this.aByteBuffer7.put((byte) (arg3 >> 16));
		this.aByteBuffer7.put((byte) (arg3 >> 8));
		this.aByteBuffer7.put((byte) arg3);
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[II)V")
	public void method5709(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		@Pc(5) int local5 = 0;
		@Pc(7) Class3_Sub5 local7 = Static7.aClass3_Sub5_1;
		local7.anInt3121 = 0;
		@Pc(34) short[] local34;
		@Pc(23) int local23;
		@Pc(28) int local28;
		@Pc(16) int local16;
		@Pc(41) int local41;
		@Pc(43) int local43;
		if (this.aClass155_Sub1_42.aBoolean298) {
			for (local16 = 0; local16 < arg0; local16++) {
				local23 = arg1[local16];
				local28 = this.anIntArray704[local23];
				local34 = this.aClass7_Sub1_3.aShortArrayArray1[local23];
				if (local28 != 0 && local34 != null) {
					local41 = 0;
					local43 = 0;
					while (local34.length > local43) {
						if ((0x1 << local41++ & local28) == 0) {
							local43 += 3;
						} else {
							local5++;
							local7.method2749(local34[local43++] & 0xFFFF);
							local5++;
							local7.method2749(local34[local43++] & 0xFFFF);
							local7.method2749(local34[local43++] & 0xFFFF);
							local5++;
						}
					}
				}
			}
		} else {
			for (local16 = 0; local16 < arg0; local16++) {
				local23 = arg1[local16];
				local34 = this.aClass7_Sub1_3.aShortArrayArray1[local23];
				local28 = this.anIntArray704[local23];
				if (local28 != 0 && local34 != null) {
					local41 = 0;
					local43 = 0;
					while (local34.length > local43) {
						if ((0x1 << local41++ & local28) == 0) {
							local43 += 3;
						} else {
							local7.method2729(local34[local43++] & 0xFFFF);
							local5++;
							local7.method2729(local34[local43++] & 0xFFFF);
							local5++;
							local5++;
							local7.method2729(local34[local43++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local5 <= 0) {
			return;
		}
		@Pc(185) opengl local185 = this.aClass155_Sub1_42.anOpengl1;
		this.aClass109_Sub1_2.method2311(local7.aByteArray42, local7.anInt3121);
		this.aClass155_Sub1_42.method3626(this.aClass7_Sub1_3.aClass88_2, this.aClass7_Sub1_3.aClass88_3, this.aClass88_14, this.aClass7_Sub1_3.aClass88_1);
		this.aClass155_Sub1_42.method3582(this.anInt6466, (this.aClass7_Sub1_3.anInt136 & 0x7) != 0, (this.aClass7_Sub1_3.anInt136 & 0x8) != 0);
		if (this.aClass155_Sub1_42.aBoolean296) {
			this.aClass155_Sub1_42.method4927(Integer.MAX_VALUE, this.anInt6465, this.anInt6464, this.anInt6467);
		}
		local185.glMatrixMode(5890);
		local185.glPushMatrix();
		local185.glScalef(1.0F / this.aFloat77, 1.0F / this.aFloat77, 1.0F);
		local185.glMatrixMode(5888);
		this.aClass155_Sub1_42.method3626(this.aClass7_Sub1_3.aClass88_2, this.aClass7_Sub1_3.aClass88_3, this.aClass88_14, this.aClass7_Sub1_3.aClass88_1);
		this.aClass155_Sub1_42.method3616(this.aClass109_Sub1_2, 0, local5);
		local185.glMatrixMode(5890);
		local185.glPopMatrix();
		local185.glMatrixMode(5888);
	}
}
