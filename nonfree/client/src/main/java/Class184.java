import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!w")
public final class Class184 {

	@OriginalMember(owner = "client!w", name = "d", descriptor = "I")
	private int anInt5463;

	@OriginalMember(owner = "client!w", name = "e", descriptor = "Lclient!le;")
	private Class1_Sub5_Sub6_Sub1 aClass1_Sub5_Sub6_Sub1_5;

	@OriginalMember(owner = "client!w", name = "n", descriptor = "I")
	public int anInt5469;

	@OriginalMember(owner = "client!w", name = "o", descriptor = "I")
	private int anInt5470;

	@OriginalMember(owner = "client!w", name = "q", descriptor = "I")
	private int anInt5472;

	@OriginalMember(owner = "client!w", name = "v", descriptor = "I")
	private int anInt5476;

	@OriginalMember(owner = "client!w", name = "g", descriptor = "Z")
	private boolean aBoolean516 = true;

	@OriginalMember(owner = "client!w", name = "r", descriptor = "I")
	private int anInt5473 = -1;

	@OriginalMember(owner = "client!w", name = "m", descriptor = "I")
	private int anInt5468 = -1;

	@OriginalMember(owner = "client!w", name = "u", descriptor = "I")
	private int anInt5475;

	@OriginalMember(owner = "client!w", name = "l", descriptor = "I")
	private int anInt5467;

	@OriginalMember(owner = "client!w", name = "f", descriptor = "I")
	private int anInt5464;

	@OriginalMember(owner = "client!w", name = "w", descriptor = "Z")
	private boolean aBoolean517;

	@OriginalMember(owner = "client!w", name = "p", descriptor = "I")
	private int anInt5471;

	@OriginalMember(owner = "client!w", name = "j", descriptor = "I")
	private int anInt5465;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	private int anInt5461;

	@OriginalMember(owner = "client!w", name = "k", descriptor = "I")
	private int anInt5466;

	@OriginalMember(owner = "client!w", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class184(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5475 = arg2;
		this.anInt5467 = arg3;
		this.anInt5464 = arg4;
		this.aBoolean517 = arg7;
		this.anInt5471 = arg1;
		this.anInt5465 = arg6;
		this.anInt5461 = arg5;
		this.anInt5466 = arg0;
	}

	@OriginalMember(owner = "client!w", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4530();
		super.finalize();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "()V")
	private void method4529() {
		@Pc(6) int local6 = this.anInt5472 * 3 / 32;
		@Pc(15) int local15 = this.anInt5472 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static77.anInt1706;
		@Pc(35) int local35 = Static77.anInt1706 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static77.anInt1707) {
			local17 = local15 + Static77.anInt1707 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static77.anInt1709) {
			local59 = Static77.anInt1709 - local6;
			local17 -= local59;
			local31 += local59 * Static77.anInt1706;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static77.anInt1705) {
			local59 = local6 + local15 - Static77.anInt1705;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static77.anInt1708) {
			local59 = Static77.anInt1708 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method4539(Static77.anIntArray131, this.anInt5465, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "()V")
	private void method4530() {
		if (this.anInt5473 != -1) {
			Static162.method2800(this.anInt5473, 0, this.anInt5468);
		}
		this.aBoolean516 = true;
		this.anInt5473 = -1;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(Lclient!w;)V")
	private void method4531(@OriginalArg(0) Class184 arg0) {
		Static303.method4545();
		Static303.method4546();
		@Pc(3) GL local3 = Static71.aGL1;
		Static93.method1769(Static303.anIntArray600);
		Static93.method1776();
		local3.glClearColor((float) (this.anInt5465 >> 16 & 0xFF) / 255.0F, (float) (this.anInt5465 >> 8 & 0xFF) / 255.0F, (float) (this.anInt5465 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean517) {
				local39 = -arg0.anInt5475;
				local41 = -arg0.anInt5467;
				local43 = -arg0.anInt5464;
			} else {
				local39 = this.anInt5475 - arg0.anInt5475;
				local41 = this.anInt5467 - arg0.anInt5467;
				local43 = this.anInt5464 - arg0.anInt5464;
			}
		}
		Static127.method2232(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt5472, this.anInt5472);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt5463 != 0) {
			local96 = Class87.anIntArray173[this.anInt5463];
			local101 = Class87.anIntArray177[this.anInt5463];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt5470 != 0) {
			local96 = this.anInt5470 - 1024 & 0x7FF;
			local101 = Class87.anIntArray173[local96];
			local113 = Class87.anIntArray177[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static65.method1146((float) -local39, (float) -local41, (float) local43);
		Static65.method1149(16777215, 0.5F, 0.5F, 1.0F);
		Static65.method1150();
		if (this.anInt5465 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static119.anInterface5_1.method1485(this.anInt5471, this.anInt5472);
		Static71.method1411(true);
		if (Static71.aBoolean159) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static303.aByteBuffer14.position(0));
		local3.glVertexPointer(2, 5126, 20, Static303.aByteBuffer14.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static303.aByteBuffer14.position(12));
		local3.glDrawElements(5, Static303.aByteBuffer15.limit() / 2, 5123, Static303.aByteBuffer15.position(0));
		local3.glEnableClientState(32886);
		Static71.method1411(false);
		if (this.anInt5465 != 0) {
			Static165.method4612(0, 0);
			Static71.method1392(1);
			Static71.method1380(0);
			Static71.method1400(Static303.anInt5474);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt5465 >> 16), (byte) (this.anInt5465 >> 8), (byte) this.anInt5465, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt5465 >> 16), (byte) (this.anInt5465 >> 8), (byte) this.anInt5465, (byte) -1);
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
		Static127.method2239();
		Static71.method1400(this.anInt5473);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt5472, this.anInt5472, 0);
		Static93.method1764(Static303.anIntArray600);
	}

	@OriginalMember(owner = "client!w", name = "d", descriptor = "()V")
	private void method4533() {
		@Pc(2) int local2 = this.anInt5472;
		@Pc(5) int local5 = this.anInt5472;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static77.anInt1706 - local2;
		if (local5 > Static77.anInt1707) {
			local5 -= local5 - Static77.anInt1707;
		}
		@Pc(37) int local37;
		if (Static77.anInt1709 > 0) {
			local37 = Static77.anInt1709;
			local5 -= local37;
			local19 = local37 * Static77.anInt1706;
			local17 = local13 * local37;
		}
		if (local2 > Static77.anInt1705) {
			local37 = local2 - Static77.anInt1705;
			local2 -= local37;
			local23 += local37;
		}
		if (Static77.anInt1708 > 0) {
			local37 = Static77.anInt1708;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method4547(Static77.anIntArray131, this.anInt5465, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIILclient!w;)V")
	public void method4534(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class184 arg6) {
		@Pc(6) int local6 = this.anInt5463 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt5470 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt5476) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt5476) / 2;
		if (local42 < arg3 && local42 + this.anInt5476 > 0 && local51 < arg2 && local51 + this.anInt5476 > 0 && this.method4537(arg6)) {
			this.aClass1_Sub5_Sub6_Sub1_5.method3200(local51 + arg0, local42 + arg1, this.anInt5476, this.anInt5476);
		}
	}

	@OriginalMember(owner = "client!w", name = "b", descriptor = "(Lclient!w;)Z")
	private boolean method4537(@OriginalArg(0) Class184 arg0) {
		if (this.aClass1_Sub5_Sub6_Sub1_5 == null) {
			if (this.anInt5466 == 0) {
				this.aClass1_Sub5_Sub6_Sub1_5 = Static119.anInterface5_1.method1476(this.anInt5472, this.anInt5471, Static119.aFloat57, true);
			} else if (this.anInt5466 == 2) {
				this.method4548(arg0);
			} else if (this.anInt5466 == 1) {
				this.method4538(arg0);
			}
		}
		return this.aClass1_Sub5_Sub6_Sub1_5 != null;
	}

	@OriginalMember(owner = "client!w", name = "c", descriptor = "(Lclient!w;)V")
	private void method4538(@OriginalArg(0) Class184 arg0) {
		Static303.method4532();
		Static303.method4535();
		this.aClass1_Sub5_Sub6_Sub1_5 = new Class1_Sub5_Sub6_Sub1_Sub1(this.anInt5472, this.anInt5472);
		Static77.method1583(Static303.anIntArray600);
		this.aClass1_Sub5_Sub6_Sub1_5.method1281();
		Static119.method2151();
		Static77.method1596(0, 0, this.anInt5472, this.anInt5472, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean517) {
				local26 = -arg0.anInt5475;
				local28 = -arg0.anInt5467;
				local30 = -arg0.anInt5464;
			} else {
				local26 = this.anInt5475 - arg0.anInt5475;
				local28 = this.anInt5467 - arg0.anInt5467;
				local30 = this.anInt5464 - arg0.anInt5464;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt5463 != 0) {
			local74 = Class87.anIntArray173[this.anInt5463];
			local79 = Class87.anIntArray177[this.anInt5463];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt5470 != 0) {
			local74 = this.anInt5470 - 1024 & 0x7FF;
			local79 = Class87.anIntArray173[local74];
			local91 = Class87.anIntArray177[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static317.method1051(Static303.aClass11_Sub5_1.aShortArray65, 0, Static303.aClass11_Sub5_1.anInt3475, (short) Static119.anInterface5_1.method1486(this.anInt5471));
		@Pc(172) Class11_Sub1_Sub2 local172 = Static303.aClass11_Sub5_1.method3064(64, 512, -local26, -local28, -local30);
		local79 = local172.method2921() - local172.method2914();
		local91 = local172.method2915() - local172.method4297();
		if (local79 > local91) {
			local135 = this.anInt5465 == 0 ? (local79 << 9) / this.anInt5472 : (local79 * 16 << 9) / (this.anInt5472 * 13);
			local172.method2928(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt5465 == 0 ? (local91 << 9) / this.anInt5472 : (local91 * 16 << 9) / (this.anInt5472 * 13);
			local172.method2928(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt5465 == 0) {
			for (local135 = 0; local135 < Static77.anIntArray131.length; local135++) {
				if (Static77.anIntArray131[local135] != 0) {
					Static77.anIntArray131[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method4529();
			this.method4533();
		}
		Static82.aClass130_1.method4485();
		Static77.method1603(Static303.anIntArray600);
		Static119.method2151();
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method4539(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static303.aByteArray185[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!w", name = "d", descriptor = "(Lclient!w;)V")
	public void method4541(@OriginalArg(0) Class184 arg0) {
		if (this.anInt5466 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt5473 == -1 || this.anInt5468 != Static162.anInt3245;
		if (!this.aBoolean516 && !local14) {
			return;
		}
		if (local14) {
			this.anInt5468 = Static162.anInt3245;
			this.anInt5473 = Static157.method2698(Static157.anInt3130, this.anInt5472, this.anInt5472);
		} else {
			Static71.method1400(this.anInt5473);
			Static157.method2695(Static157.anInt3130, this.anInt5472, this.anInt5472);
		}
		if (this.anInt5466 == 1) {
			this.method4531(arg0);
			this.aBoolean516 = false;
		} else if (this.anInt5466 == 2) {
			this.aBoolean516 = !this.method4543(arg0);
		}
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIII)Z")
	public boolean method4542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean517) {
			this.anInt5469 = 1073741823;
			local7 = this.anInt5475;
			local12 = this.anInt5467;
			local17 = this.anInt5464;
		} else {
			local7 = this.anInt5475 - arg0;
			local12 = this.anInt5467 - arg1;
			local17 = this.anInt5464 - arg2;
			this.anInt5469 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5469 == 0) {
				this.anInt5469 = 1;
			}
			local7 = (local7 << 8) / this.anInt5469;
			local12 = (local12 << 8) / this.anInt5469;
			local17 = (local17 << 8) / this.anInt5469;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5476 = this.anInt5461 * arg3 / (this.aBoolean517 ? 1024 : this.anInt5469);
		} else {
			this.anInt5476 = 0;
		}
		if (this.anInt5476 < 8) {
			this.method4530();
			this.aClass1_Sub5_Sub6_Sub1_5 = null;
			return false;
		}
		@Pc(145) int local145 = Static218.method3531(this.anInt5476);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt5472) {
			this.anInt5472 = local145;
		}
		this.anInt5463 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt5470 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean516 = true;
		this.aClass1_Sub5_Sub6_Sub1_5 = null;
		return true;
	}

	@OriginalMember(owner = "client!w", name = "e", descriptor = "(Lclient!w;)Z")
	private boolean method4543(@OriginalArg(0) Class184 arg0) {
		@Pc(5) Class11_Sub5 local5 = Static180.method3074(Static200.aClass119_70, this.anInt5471);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static71.aGL1;
		Static93.method1769(Static303.anIntArray600);
		Static93.method1776();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean517) {
				local25 = -arg0.anInt5475;
				local27 = -arg0.anInt5467;
				local29 = -arg0.anInt5464;
			} else {
				local25 = this.anInt5475 - arg0.anInt5475;
				local27 = this.anInt5467 - arg0.anInt5467;
				local29 = this.anInt5464 - arg0.anInt5464;
			}
		}
		local5.method3081();
		@Pc(78) Class11_Sub1 local78 = local5.method3055(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method2921() - local78.method2914()) / 2;
		@Pc(94) int local94 = (local78.method2915() - local78.method4297()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static127.method2241((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt5472, this.anInt5472);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt5463 != 0) {
			local126 = Class87.anIntArray173[this.anInt5463];
			local131 = Class87.anIntArray177[this.anInt5463];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt5470 != 0) {
			local126 = this.anInt5470 - 1024 & 0x7FF;
			local131 = Class87.anIntArray173[local126];
			local143 = Class87.anIntArray177[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static65.method1146((float) -local25, (float) local27, (float) -local29);
		Static65.method1149(16777215, 0.5F, 0.5F, 0.5F);
		Static65.method1150();
		Static71.method1395();
		Static71.method1413(true);
		Static71.method1411(true);
		local78.method2900(0, 0, 0, -local86 - local78.method2914(), -local94 - local78.method4297(), 0, -1L);
		Static71.method1411(false);
		Static71.method1413(false);
		Static71.method1384();
		Static127.method2239();
		Static71.method1400(this.anInt5473);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt5472, this.anInt5472, 0);
		Static93.method1764(Static303.anIntArray600);
		return true;
	}

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIII)V")
	public void method4544(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt5463 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt5470 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt5476) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt5476) / 2;
		if (local42 >= arg3 || local42 + this.anInt5476 <= 0 || local51 >= arg2 || local51 + this.anInt5476 <= 0) {
			return;
		}
		if (this.anInt5466 == 0) {
			Static119.anInterface5_1.method1485(this.anInt5471, this.anInt5472);
		} else if (this.anInt5473 == -1) {
			return;
		} else {
			Static71.method1400(this.anInt5473);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt5476;
		@Pc(105) int local105 = local27 + this.anInt5476;
		@Pc(107) GL local107 = Static71.aGL1;
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

	@OriginalMember(owner = "client!w", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method4547(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static303.aByteArray185[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!w", name = "f", descriptor = "(Lclient!w;)V")
	private void method4548(@OriginalArg(0) Class184 arg0) {
		@Pc(5) Class11_Sub5 local5 = Static180.method3074(Static200.aClass119_70, this.anInt5471);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub5_Sub6_Sub1_5 = new Class1_Sub5_Sub6_Sub1(this.anInt5472, this.anInt5472);
		Static77.method1583(Static303.anIntArray600);
		this.aClass1_Sub5_Sub6_Sub1_5.method1281();
		Static119.method2151();
		Static77.method1596(0, 0, this.anInt5472, this.anInt5472, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean517) {
				local33 = -arg0.anInt5475;
				local35 = -arg0.anInt5467;
				local37 = -arg0.anInt5464;
			} else {
				local33 = this.anInt5475 - arg0.anInt5475;
				local35 = this.anInt5467 - arg0.anInt5467;
				local37 = this.anInt5464 - arg0.anInt5464;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt5463 != 0) {
			local81 = Class87.anIntArray173[this.anInt5463];
			local86 = Class87.anIntArray177[this.anInt5463];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt5470 != 0) {
			local81 = this.anInt5470 - 1024 & 0x7FF;
			local86 = Class87.anIntArray173[local81];
			local98 = Class87.anIntArray177[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class11_Sub1_Sub2 local167 = local5.method3064(64, 768, -local33, -local35, -local37);
		local86 = local167.method2921() - local167.method2914();
		local98 = local167.method2915() - local167.method4297();
		local142 = local167.method2914() + local86 / 2;
		@Pc(193) int local193 = local167.method4297() + local98 / 2;
		if (local86 > local98) {
			local167.method2928(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt5472);
		} else {
			local167.method2928(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt5472);
		}
		Static82.aClass130_1.method4485();
		Static77.method1603(Static303.anIntArray600);
		Static119.method2151();
	}
}
