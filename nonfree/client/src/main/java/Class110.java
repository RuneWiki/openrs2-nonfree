import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class110 {

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!ln;")
	private Class1_Sub1_Sub3_Sub2 aClass1_Sub1_Sub3_Sub2_2;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "I")
	private int anInt3422;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "I")
	private int anInt3426;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	private int anInt3430;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	public int anInt3431;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	private int anInt3436;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
	private int anInt3425 = -1;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private int anInt3432 = -1;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Z")
	private boolean aBoolean237 = true;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private int anInt3429;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private int anInt3433;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	private int anInt3434;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
	private boolean aBoolean236;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "I")
	private int anInt3421;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "I")
	private int anInt3423;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt3428;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	private int anInt3435;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt3429 = arg2;
		this.anInt3433 = arg3;
		this.anInt3434 = arg4;
		this.aBoolean236 = arg7;
		this.anInt3421 = arg1;
		this.anInt3423 = arg6;
		this.anInt3428 = arg5;
		this.anInt3435 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIII)Z")
	public boolean method2764(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean236) {
			this.anInt3431 = 1073741823;
			local7 = this.anInt3429;
			local12 = this.anInt3433;
			local17 = this.anInt3434;
		} else {
			local7 = this.anInt3429 - arg0;
			local12 = this.anInt3433 - arg1;
			local17 = this.anInt3434 - arg2;
			this.anInt3431 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt3431 == 0) {
				this.anInt3431 = 1;
			}
			local7 = (local7 << 8) / this.anInt3431;
			local12 = (local12 << 8) / this.anInt3431;
			local17 = (local17 << 8) / this.anInt3431;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt3436 = this.anInt3428 * arg3 / (this.aBoolean236 ? 1024 : this.anInt3431);
		} else {
			this.anInt3436 = 0;
		}
		if (this.anInt3436 < 8) {
			this.method2777();
			this.aClass1_Sub1_Sub3_Sub2_2 = null;
			return false;
		}
		@Pc(145) int local145 = Static302.method4512(this.anInt3436);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt3430) {
			this.anInt3430 = local145;
		}
		this.anInt3422 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt3426 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean237 = true;
		this.aClass1_Sub1_Sub3_Sub2_2 = null;
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIIILclient!mb;)V")
	public void method2765(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class110 arg6) {
		@Pc(6) int local6 = this.anInt3422 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3426 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt3436) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt3436) / 2;
		if (local42 < arg3 && local42 + this.anInt3436 > 0 && local51 < arg2 && local51 + this.anInt3436 > 0 && this.method2766(arg6)) {
			this.aClass1_Sub1_Sub3_Sub2_2.method4631(local51 + arg0, local42 + arg1, this.anInt3436, this.anInt3436);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;)Z")
	private boolean method2766(@OriginalArg(0) Class110 arg0) {
		if (this.aClass1_Sub1_Sub3_Sub2_2 == null) {
			if (this.anInt3435 == 0) {
				this.aClass1_Sub1_Sub3_Sub2_2 = Static18.anInterface1_1.method1628(true, Static18.aFloat3, this.anInt3421, this.anInt3430);
			} else if (this.anInt3435 == 2) {
				this.method2768(arg0);
			} else if (this.anInt3435 == 1) {
				this.method2773(arg0);
			}
		}
		return this.aClass1_Sub1_Sub3_Sub2_2 != null;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Lclient!mb;)V")
	private void method2767(@OriginalArg(0) Class110 arg0) {
		Static163.method2763();
		Static163.method2776();
		@Pc(3) GL local3 = Static291.aGL1;
		Static133.method2169(Static163.anIntArray275);
		Static133.method2166();
		local3.glClearColor((float) (this.anInt3423 >> 16 & 0xFF) / 255.0F, (float) (this.anInt3423 >> 8 & 0xFF) / 255.0F, (float) (this.anInt3423 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean236) {
				local39 = -arg0.anInt3429;
				local41 = -arg0.anInt3433;
				local43 = -arg0.anInt3434;
			} else {
				local39 = this.anInt3429 - arg0.anInt3429;
				local41 = this.anInt3433 - arg0.anInt3433;
				local43 = this.anInt3434 - arg0.anInt3434;
			}
		}
		Static180.method2962(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt3430, this.anInt3430);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt3422 != 0) {
			local96 = Class17.anIntArray22[this.anInt3422];
			local101 = Class17.anIntArray24[this.anInt3422];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt3426 != 0) {
			local96 = this.anInt3426 - 1024 & 0x7FF;
			local101 = Class17.anIntArray22[local96];
			local113 = Class17.anIntArray24[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static96.method1392((float) -local39, (float) -local41, (float) local43);
		Static96.method1397(16777215, 0.5F, 0.5F, 1.0F);
		Static96.method1390();
		if (this.anInt3423 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static18.anInterface1_1.method1633(this.anInt3421, this.anInt3430);
		Static291.method4331(true);
		if (Static291.aBoolean405) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static163.aByteBuffer10.position(0));
		local3.glVertexPointer(2, 5126, 20, Static163.aByteBuffer10.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static163.aByteBuffer10.position(12));
		local3.glDrawElements(5, Static163.aByteBuffer11.limit() / 2, 5123, Static163.aByteBuffer11.position(0));
		local3.glEnableClientState(32886);
		Static291.method4331(false);
		if (this.anInt3423 != 0) {
			Static207.method3280(0, 0);
			Static291.method4296(1);
			Static291.method4323(0);
			Static291.method4310(Static163.anInt3427);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt3423 >> 16), (byte) (this.anInt3423 >> 8), (byte) this.anInt3423, (byte) 127);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glTexEnvi(8960, 34200, 770);
			local3.glLoadIdentity();
			local3.glColorMask(true, true, true, true);
			local3.glBlendFunc(773, 772);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt3423 >> 16), (byte) (this.anInt3423 >> 8), (byte) this.anInt3423, (byte) -1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(-1, -1);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glVertex2i(1, -1);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glVertex2i(1, 1);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glVertex2i(-1, 1);
			local3.glEnd();
			local3.glBlendFunc(770, 771);
			local3.glTexEnvi(8960, 34176, 5890);
		}
		Static180.method2965();
		Static291.method4310(this.anInt3432);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3430, this.anInt3430, 0);
		Static133.method2167(Static163.anIntArray275);
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(Lclient!mb;)V")
	private void method2768(@OriginalArg(0) Class110 arg0) {
		@Pc(5) Class22_Sub7 local5 = Static275.method4085(Static308.aClass138_88, this.anInt3421);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub1_Sub3_Sub2_2 = new Class1_Sub1_Sub3_Sub2(this.anInt3430, this.anInt3430);
		Static41.method748(Static163.anIntArray275);
		this.aClass1_Sub1_Sub3_Sub2_2.method3470();
		Static18.method310();
		Static41.method730(0, 0, this.anInt3430, this.anInt3430, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean236) {
				local33 = -arg0.anInt3429;
				local35 = -arg0.anInt3433;
				local37 = -arg0.anInt3434;
			} else {
				local33 = this.anInt3429 - arg0.anInt3429;
				local35 = this.anInt3433 - arg0.anInt3433;
				local37 = this.anInt3434 - arg0.anInt3434;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt3422 != 0) {
			local81 = Class17.anIntArray22[this.anInt3422];
			local86 = Class17.anIntArray24[this.anInt3422];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt3426 != 0) {
			local81 = this.anInt3426 - 1024 & 0x7FF;
			local86 = Class17.anIntArray22[local81];
			local98 = Class17.anIntArray24[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class22_Sub4_Sub2 local167 = local5.method4091(64, 768, -local33, -local35, -local37);
		local86 = local167.method3560() - local167.method3553();
		local98 = local167.method3564() - local167.method4071();
		local142 = local167.method3553() + local86 / 2;
		@Pc(193) int local193 = local167.method4071() + local98 / 2;
		if (local86 > local98) {
			local167.method3593(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt3430);
		} else {
			local167.method3593(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt3430);
		}
		Static242.aClass62_1.method4468();
		Static41.method744(Static163.anIntArray275);
		Static18.method310();
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()V")
	private void method2769() {
		@Pc(2) int local2 = this.anInt3430;
		@Pc(5) int local5 = this.anInt3430;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static41.anInt829 - local2;
		if (local5 > Static41.anInt827) {
			local5 -= local5 - Static41.anInt827;
		}
		@Pc(37) int local37;
		if (Static41.anInt824 > 0) {
			local37 = Static41.anInt824;
			local5 -= local37;
			local19 = local37 * Static41.anInt829;
			local17 = local13 * local37;
		}
		if (local2 > Static41.anInt825) {
			local37 = local2 - Static41.anInt825;
			local2 -= local37;
			local23 += local37;
		}
		if (Static41.anInt828 > 0) {
			local37 = Static41.anInt828;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method2778(Static41.anIntArray62, this.anInt3423, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2770(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static163.aByteArray36[(arg2 >> 16) + local12] & 0xFF) + 64;
					if (local37 > 255) {
						local37 = 255;
					}
					@Pc(46) int local46 = 256 - local37;
					arg0[arg4] = ((arg1 & 0xFF00FF) * local46 + (local25 & 0xFF00FF) * local37 & -16711936) + ((arg1 & 0xFF00) * local46 + (local25 & 0xFF00) * local37 & 0xFF0000) >> 8 | 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()V")
	private void method2771() {
		@Pc(6) int local6 = this.anInt3430 * 3 / 32;
		@Pc(15) int local15 = this.anInt3430 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static41.anInt829;
		@Pc(35) int local35 = Static41.anInt829 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static41.anInt827) {
			local17 = local15 + Static41.anInt827 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static41.anInt824) {
			local59 = Static41.anInt824 - local6;
			local17 -= local59;
			local31 += local59 * Static41.anInt829;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static41.anInt825) {
			local59 = local6 + local15 - Static41.anInt825;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static41.anInt828) {
			local59 = Static41.anInt828 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method2770(Static41.anIntArray62, this.anInt3423, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(Lclient!mb;)V")
	private void method2773(@OriginalArg(0) Class110 arg0) {
		Static163.method2772();
		Static163.method2775();
		this.aClass1_Sub1_Sub3_Sub2_2 = new Class1_Sub1_Sub3_Sub2_Sub1(this.anInt3430, this.anInt3430);
		Static41.method748(Static163.anIntArray275);
		this.aClass1_Sub1_Sub3_Sub2_2.method3470();
		Static18.method310();
		Static41.method730(0, 0, this.anInt3430, this.anInt3430, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean236) {
				local26 = -arg0.anInt3429;
				local28 = -arg0.anInt3433;
				local30 = -arg0.anInt3434;
			} else {
				local26 = this.anInt3429 - arg0.anInt3429;
				local28 = this.anInt3433 - arg0.anInt3433;
				local30 = this.anInt3434 - arg0.anInt3434;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt3422 != 0) {
			local74 = Class17.anIntArray22[this.anInt3422];
			local79 = Class17.anIntArray24[this.anInt3422];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt3426 != 0) {
			local74 = this.anInt3426 - 1024 & 0x7FF;
			local79 = Class17.anIntArray22[local74];
			local91 = Class17.anIntArray24[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static319.method507(Static163.aClass22_Sub7_1.aShortArray83, 0, Static163.aClass22_Sub7_1.anInt5257, (short) Static18.anInterface1_1.method1625(this.anInt3421));
		@Pc(172) Class22_Sub4_Sub2 local172 = Static163.aClass22_Sub7_1.method4091(64, 512, -local26, -local28, -local30);
		local79 = local172.method3560() - local172.method3553();
		local91 = local172.method3564() - local172.method4071();
		if (local79 > local91) {
			local135 = this.anInt3423 == 0 ? (local79 << 9) / this.anInt3430 : (local79 * 16 << 9) / (this.anInt3430 * 13);
			local172.method3593(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt3423 == 0 ? (local91 << 9) / this.anInt3430 : (local91 * 16 << 9) / (this.anInt3430 * 13);
			local172.method3593(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt3423 == 0) {
			for (local135 = 0; local135 < Static41.anIntArray62.length; local135++) {
				if (Static41.anIntArray62[local135] != 0) {
					Static41.anIntArray62[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method2771();
			this.method2769();
		}
		Static242.aClass62_1.method4468();
		Static41.method744(Static163.anIntArray275);
		Static18.method310();
	}

	@OriginalMember(owner = "client!mb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2777();
		super.finalize();
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIII)V")
	public void method2774(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt3422 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3426 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt3436) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt3436) / 2;
		if (local42 >= arg3 || local42 + this.anInt3436 <= 0 || local51 >= arg2 || local51 + this.anInt3436 <= 0) {
			return;
		}
		if (this.anInt3435 == 0) {
			Static18.anInterface1_1.method1633(this.anInt3421, this.anInt3430);
		} else if (this.anInt3432 == -1) {
			return;
		} else {
			Static291.method4310(this.anInt3432);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt3436;
		@Pc(105) int local105 = local27 + this.anInt3436;
		@Pc(107) GL local107 = Static291.aGL1;
		local107.glBegin(7);
		local107.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local107.glTexCoord2f(0.0F, 0.0F);
		local107.glVertex2i(local33, local27);
		local107.glTexCoord2f(0.0F, 1.0F);
		local107.glVertex2i(local33, local105);
		local107.glTexCoord2f(1.0F, 1.0F);
		local107.glVertex2i(local100, local105);
		local107.glTexCoord2f(1.0F, 0.0F);
		local107.glVertex2i(local100, local27);
		local107.glEnd();
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()V")
	private void method2777() {
		if (this.anInt3432 != -1) {
			Static74.method1189(this.anInt3432, 0, this.anInt3425);
		}
		this.aBoolean237 = true;
		this.anInt3432 = -1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2778(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static163.aByteArray36[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
				} else {
					arg0[arg4] |= 0xFF000000;
				}
				arg4++;
				arg2 += arg8;
			}
			arg3 += arg9;
			arg2 = local1;
			arg4 += arg5;
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(Lclient!mb;)Z")
	private boolean method2780(@OriginalArg(0) Class110 arg0) {
		@Pc(5) Class22_Sub7 local5 = Static275.method4085(Static308.aClass138_88, this.anInt3421);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static291.aGL1;
		Static133.method2169(Static163.anIntArray275);
		Static133.method2166();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean236) {
				local25 = -arg0.anInt3429;
				local27 = -arg0.anInt3433;
				local29 = -arg0.anInt3434;
			} else {
				local25 = this.anInt3429 - arg0.anInt3429;
				local27 = this.anInt3433 - arg0.anInt3433;
				local29 = this.anInt3434 - arg0.anInt3434;
			}
		}
		local5.method4105();
		@Pc(78) Class22_Sub4 local78 = local5.method4097(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3560() - local78.method3553()) / 2;
		@Pc(94) int local94 = (local78.method3564() - local78.method4071()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static180.method2959((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt3430, this.anInt3430);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt3422 != 0) {
			local126 = Class17.anIntArray22[this.anInt3422];
			local131 = Class17.anIntArray24[this.anInt3422];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt3426 != 0) {
			local126 = this.anInt3426 - 1024 & 0x7FF;
			local131 = Class17.anIntArray22[local126];
			local143 = Class17.anIntArray24[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static96.method1392((float) -local25, (float) local27, (float) -local29);
		Static96.method1397(16777215, 0.5F, 0.5F, 0.5F);
		Static96.method1390();
		Static291.method4333();
		Static291.method4292(true);
		Static291.method4331(true);
		local78.method3571(0, 0, 0, -local86 - local78.method3553(), -local94 - local78.method4071(), 0, -1L);
		Static291.method4331(false);
		Static291.method4292(false);
		Static291.method4330();
		Static180.method2965();
		Static291.method4310(this.anInt3432);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3430, this.anInt3430, 0);
		Static133.method2167(Static163.anIntArray275);
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(Lclient!mb;)V")
	public void method2781(@OriginalArg(0) Class110 arg0) {
		if (this.anInt3435 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt3432 == -1 || this.anInt3425 != Static74.anInt1419;
		if (!this.aBoolean237 && !local14) {
			return;
		}
		if (local14) {
			this.anInt3425 = Static74.anInt1419;
			this.anInt3432 = Static160.method2700(Static160.anInt3370, this.anInt3430, this.anInt3430);
		} else {
			Static291.method4310(this.anInt3432);
			Static160.method2705(Static160.anInt3370, this.anInt3430, this.anInt3430);
		}
		if (this.anInt3435 == 1) {
			this.method2767(arg0);
			this.aBoolean237 = false;
		} else if (this.anInt3435 == 2) {
			this.aBoolean237 = !this.method2780(arg0);
		}
	}
}
