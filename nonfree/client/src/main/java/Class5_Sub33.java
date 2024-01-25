import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qi")
public final class Class5_Sub33 extends Class5 {

	@OriginalMember(owner = "client!qi", name = "u", descriptor = "Ljava/nio/ByteBuffer;")
	private ByteBuffer aByteBuffer6;

	@OriginalMember(owner = "client!qi", name = "y", descriptor = "Lclient!vl;")
	private Class203 aClass203_9;

	@OriginalMember(owner = "client!qi", name = "w", descriptor = "Lclient!eb;")
	private final Class51_Sub1 aClass51_Sub1_2;

	@OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
	private final int anInt5195;

	@OriginalMember(owner = "client!qi", name = "p", descriptor = "F")
	private final float aFloat61;

	@OriginalMember(owner = "client!qi", name = "x", descriptor = "[I")
	private final int[] anIntArray496;

	@OriginalMember(owner = "client!qi", name = "q", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_33;

	@OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
	private final int anInt5194;

	@OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
	private final int anInt5196;

	@OriginalMember(owner = "client!qi", name = "t", descriptor = "Lclient!aq;")
	private final Class12_Sub1 aClass12_Sub1_2;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!eb;IIII)V")
	public Class5_Sub33(@OriginalArg(0) Class51_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass51_Sub1_2 = arg0;
		this.anInt5195 = arg3;
		this.aFloat61 = arg2;
		this.anIntArray496 = new int[this.aClass51_Sub1_2.anInt1963 * this.aClass51_Sub1_2.anInt1961];
		this.aClass55_Sub1_33 = this.aClass51_Sub1_2.aClass55_Sub1_13;
		this.anInt5194 = arg1;
		this.anInt5196 = arg4;
		this.aClass12_Sub1_2 = new Class12_Sub1(this.aClass55_Sub1_33, 5123, null, 1);
	}

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "(II)V")
	public void method4645(@OriginalArg(0) int arg0) {
		this.aByteBuffer6.position(arg0 * 4);
		this.aByteBuffer6.flip();
		@Pc(18) Interface8 local18 = this.aClass55_Sub1_33.method3647(0, this.aByteBuffer6);
		this.aClass203_9 = new Class203(this.aClass55_Sub1_33, local18, 5121, 4, 0);
		this.aByteBuffer6 = null;
	}

	@OriginalMember(owner = "client!qi", name = "c", descriptor = "(II)V")
	public void method4646(@OriginalArg(0) int arg0) {
		this.aByteBuffer6.position(arg0 * 4 + 3);
		this.aByteBuffer6.put((byte) -1);
	}

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "(II)V")
	public void method4647(@OriginalArg(0) int arg0) {
		this.aByteBuffer6 = ByteBuffer.allocateDirect(arg0 * 4);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(II[I)V")
	public void method4648(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		@Pc(1) int local1 = 0;
		@Pc(7) Class5_Sub12 local7 = Static67.aClass5_Sub12_1;
		local7.anInt5731 = 0;
		@Pc(33) short[] local33;
		@Pc(27) int local27;
		@Pc(38) int local38;
		@Pc(16) int local16;
		@Pc(46) int local46;
		@Pc(48) int local48;
		if (this.aClass55_Sub1_33.aBoolean308) {
			for (local16 = 0; local16 < arg0; local16++) {
				local27 = arg1[local16];
				local33 = this.aClass51_Sub1_2.aShortArrayArray2[local27];
				local38 = this.anIntArray496[local27];
				if (local38 != 0 && local33 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local33.length) {
						if ((local38 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local1++;
							local7.method5084(local33[local48++] & 0xFFFF);
							local1++;
							local7.method5084(local33[local48++] & 0xFFFF);
							local7.method5084(local33[local48++] & 0xFFFF);
							local1++;
						}
					}
				}
			}
		} else {
			for (local16 = 0; local16 < arg0; local16++) {
				local27 = arg1[local16];
				local38 = this.anIntArray496[local27];
				local33 = this.aClass51_Sub1_2.aShortArrayArray2[local27];
				if (local38 != 0 && local33 != null) {
					local46 = 0;
					local48 = 0;
					while (local48 < local33.length) {
						if ((local38 & 0x1 << local46++) == 0) {
							local48 += 3;
						} else {
							local1++;
							local7.method5080(local33[local48++] & 0xFFFF);
							local1++;
							local7.method5080(local33[local48++] & 0xFFFF);
							local1++;
							local7.method5080(local33[local48++] & 0xFFFF);
						}
					}
				}
			}
		}
		if (local1 <= 0) {
			return;
		}
		@Pc(200) opengl local200 = this.aClass55_Sub1_33.anOpengl1;
		this.aClass55_Sub1_33.method3669(this.anInt5194, (this.aClass51_Sub1_2.anInt1184 & 0x7) != 0, (this.aClass51_Sub1_2.anInt1184 & 0x8) != 0);
		if (this.aClass55_Sub1_33.aBoolean320) {
			this.aClass55_Sub1_33.method5163(Integer.MAX_VALUE, this.anInt5195, this.anInt5196);
		}
		this.aClass12_Sub1_2.method5665(local7.aByteArray90, local7.anInt5731);
		local200.glMatrixMode(5890);
		local200.glPushMatrix();
		local200.glScalef(1.0F / this.aFloat61, 1.0F / this.aFloat61, 1.0F);
		local200.glMatrixMode(5888);
		this.aClass55_Sub1_33.method3640(this.aClass51_Sub1_2.aClass203_2, this.aClass51_Sub1_2.aClass203_4, this.aClass203_9, this.aClass51_Sub1_2.aClass203_1);
		this.aClass55_Sub1_33.method3673(this.aClass12_Sub1_2, 0, local1);
		local200.glMatrixMode(5890);
		local200.glPopMatrix();
		local200.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIBFI)V")
	public void method4649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24;
		@Pc(37) int local37;
		if (this.anInt5194 != -1) {
			@Pc(19) Class200 local19 = this.aClass55_Sub1_33.anInterface3_4.method1511(this.anInt5194);
			local24 = local19.aByte66 & 0xFF;
			@Pc(62) int local62;
			if (local24 != 0 && local19.aByte63 != 4) {
				if (arg1 < 0) {
					local37 = 0;
				} else if (arg1 <= 127) {
					local37 = arg1 * 131586;
				} else {
					local37 = 16777215;
				}
				if (local24 == 256) {
					arg3 = local37;
				} else {
					local62 = 256 - local24;
					arg3 = (local24 * (local37 & 0xFF00) + local62 * (arg3 & 0xFF00) & 0xFF0000) + (local62 * (arg3 & 0xFF00FF) + (local37 & 0xFF00FF) * local24 & 0xFF00FF00) >> 8;
				}
			}
			local37 = local19.aByte65 & 0xFF;
			if (local37 != 0) {
				local37 += 256;
				@Pc(113) int local113 = local37 * (arg3 >> 16 & 0xFF);
				if (local113 > 65535) {
					local113 = 65535;
				}
				local62 = (arg3 >> 8 & 0xFF) * local37;
				if (local62 > 65535) {
					local62 = 65535;
				}
				@Pc(140) int local140 = (arg3 & 0xFF) * local37;
				if (local140 > 65535) {
					local140 = 65535;
				}
				arg3 = (local113 << 8 & 0xFF00E5) + ((local62 & 0xFF00) + (local140 >> 8));
			}
		}
		if (arg2 != 1.0F) {
			@Pc(172) int local172 = arg3 >> 16 & 0xFF;
			local24 = arg3 >> 8 & 0xFF;
			local37 = arg3 & 0xFF;
			local172 = (int) ((float) local172 * arg2);
			if (local172 < 0) {
				local172 = 0;
			} else if (local172 > 255) {
				local172 = 255;
			}
			local24 = (int) ((float) local24 * arg2);
			if (local24 < 0) {
				local24 = 0;
			} else if (local24 > 255) {
				local24 = 255;
			}
			local37 = (int) ((float) local37 * arg2);
			if (local37 < 0) {
				local37 = 0;
			} else if (local37 > 255) {
				local37 = 255;
			}
			arg3 = local24 << 8 | local172 << 16 | local37;
		}
		this.aByteBuffer6.position(arg0 * 4);
		this.aByteBuffer6.put((byte) (arg3 >> 16));
		this.aByteBuffer6.put((byte) (arg3 >> 8));
		this.aByteBuffer6.put((byte) arg3);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)V")
	public void method4650(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anIntArray496[arg2 + this.aClass51_Sub1_2.anInt1963 * arg0] |= 0x1 << arg1;
	}
}
