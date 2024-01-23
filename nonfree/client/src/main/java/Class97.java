import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kk")
public final class Class97 {

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
	private int anInt2668;

	@OriginalMember(owner = "client!kk", name = "l", descriptor = "Lclient!ek;")
	private Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_4;

	@OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
	private int anInt2675;

	@OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
	private int anInt2676;

	@OriginalMember(owner = "client!kk", name = "w", descriptor = "I")
	private int anInt2682;

	@OriginalMember(owner = "client!kk", name = "x", descriptor = "I")
	public int anInt2683;

	@OriginalMember(owner = "client!kk", name = "j", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
	private int anInt2671 = -1;

	@OriginalMember(owner = "client!kk", name = "s", descriptor = "I")
	private int anInt2678 = -1;

	@OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
	private int anInt2672;

	@OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
	private int anInt2674;

	@OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
	private int anInt2679;

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "Z")
	private boolean aBoolean188;

	@OriginalMember(owner = "client!kk", name = "u", descriptor = "I")
	private int anInt2680;

	@OriginalMember(owner = "client!kk", name = "r", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!kk", name = "v", descriptor = "I")
	private int anInt2681;

	@OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
	private int anInt2670;

	@OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class97(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2672 = arg2;
		this.anInt2674 = arg3;
		this.anInt2679 = arg4;
		this.aBoolean188 = arg7;
		this.anInt2680 = arg1;
		this.anInt2677 = arg6;
		this.anInt2681 = arg5;
		this.anInt2670 = arg0;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(Lclient!kk;)V")
	private void method2254(@OriginalArg(0) Class97 arg0) {
		Static144.method2253();
		Static144.method2272();
		this.aClass1_Sub2_Sub2_Sub1_4 = new Class1_Sub2_Sub2_Sub1_Sub1(this.anInt2676, this.anInt2676);
		Static213.method3384(Static144.anIntArray334);
		this.aClass1_Sub2_Sub2_Sub1_4.method3932();
		Static208.method3241();
		Static213.method3362(0, 0, this.anInt2676, this.anInt2676, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean188) {
				local26 = -arg0.anInt2672;
				local28 = -arg0.anInt2674;
				local30 = -arg0.anInt2679;
			} else {
				local26 = this.anInt2672 - arg0.anInt2672;
				local28 = this.anInt2674 - arg0.anInt2674;
				local30 = this.anInt2679 - arg0.anInt2679;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt2682 != 0) {
			local74 = Class135.anIntArray472[this.anInt2682];
			local79 = Class135.anIntArray474[this.anInt2682];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt2675 != 0) {
			local74 = this.anInt2675 - 1024 & 0x7FF;
			local79 = Class135.anIntArray472[local74];
			local91 = Class135.anIntArray474[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static300.method488(Static144.aClass6_Sub3_1.aShortArray34, 0, Static144.aClass6_Sub3_1.anInt1640, (short) Static208.anInterface4_1.method991(this.anInt2680));
		@Pc(172) Class6_Sub2_Sub1 local172 = Static144.aClass6_Sub3_1.method1441(64, 512, -local26, -local28, -local30);
		local79 = local172.method2097() - local172.method2092();
		local91 = local172.method2096() - local172.method3833();
		if (local79 > local91) {
			local135 = this.anInt2677 == 0 ? (local79 << 9) / this.anInt2676 : (local79 * 16 << 9) / (this.anInt2676 * 13);
			local172.method588(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt2677 == 0 ? (local91 << 9) / this.anInt2676 : (local91 * 16 << 9) / (this.anInt2676 * 13);
			local172.method588(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt2677 == 0) {
			for (local135 = 0; local135 < Static213.anIntArray495.length; local135++) {
				if (Static213.anIntArray495[local135] != 0) {
					Static213.anIntArray495[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method2255();
			this.method2258();
		}
		Static282.aClass23_33.method1012();
		Static213.method3365(Static144.anIntArray334);
		Static208.method3241();
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "()V")
	private void method2255() {
		@Pc(6) int local6 = this.anInt2676 * 3 / 32;
		@Pc(15) int local15 = this.anInt2676 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static213.anInt4239;
		@Pc(35) int local35 = Static213.anInt4239 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static213.anInt4238) {
			local17 = local15 + Static213.anInt4238 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static213.anInt4242) {
			local59 = Static213.anInt4242 - local6;
			local17 -= local59;
			local31 += local59 * Static213.anInt4239;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static213.anInt4241) {
			local59 = local6 + local15 - Static213.anInt4241;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static213.anInt4243) {
			local59 = Static213.anInt4243 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method2256(Static213.anIntArray495, this.anInt2677, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2256(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static144.aByteArray51[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "()V")
	private void method2258() {
		@Pc(2) int local2 = this.anInt2676;
		@Pc(5) int local5 = this.anInt2676;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static213.anInt4239 - local2;
		if (local5 > Static213.anInt4238) {
			local5 -= local5 - Static213.anInt4238;
		}
		@Pc(37) int local37;
		if (Static213.anInt4242 > 0) {
			local37 = Static213.anInt4242;
			local5 -= local37;
			local19 = local37 * Static213.anInt4239;
			local17 = local13 * local37;
		}
		if (local2 > Static213.anInt4241) {
			local37 = local2 - Static213.anInt4241;
			local2 -= local37;
			local23 += local37;
		}
		if (Static213.anInt4243 > 0) {
			local37 = Static213.anInt4243;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method2268(Static213.anIntArray495, this.anInt2677, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!kk", name = "b", descriptor = "(Lclient!kk;)V")
	private void method2259(@OriginalArg(0) Class97 arg0) {
		Static144.method2260();
		Static144.method2264();
		@Pc(3) GL local3 = Static240.aGL1;
		Static50.method874(Static144.anIntArray334);
		Static50.method869();
		local3.glClearColor((float) (this.anInt2677 >> 16 & 0xFF) / 255.0F, (float) (this.anInt2677 >> 8 & 0xFF) / 255.0F, (float) (this.anInt2677 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean188) {
				local39 = -arg0.anInt2672;
				local41 = -arg0.anInt2674;
				local43 = -arg0.anInt2679;
			} else {
				local39 = this.anInt2672 - arg0.anInt2672;
				local41 = this.anInt2674 - arg0.anInt2674;
				local43 = this.anInt2679 - arg0.anInt2679;
			}
		}
		Static157.method2442(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt2676, this.anInt2676);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt2682 != 0) {
			local96 = Class135.anIntArray472[this.anInt2682];
			local101 = Class135.anIntArray474[this.anInt2682];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt2675 != 0) {
			local96 = this.anInt2675 - 1024 & 0x7FF;
			local101 = Class135.anIntArray472[local96];
			local113 = Class135.anIntArray474[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static34.method628((float) -local39, (float) -local41, (float) local43);
		Static34.method632(16777215, 0.5F, 0.5F, 1.0F);
		Static34.method625();
		if (this.anInt2677 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static208.anInterface4_1.method992(this.anInt2680, this.anInt2676);
		Static240.method3787(true);
		if (Static240.aBoolean372) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static144.aByteBuffer8.position(0));
		local3.glVertexPointer(2, 5126, 20, Static144.aByteBuffer8.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static144.aByteBuffer8.position(12));
		local3.glDrawElements(5, Static144.aByteBuffer9.limit() / 2, 5123, Static144.aByteBuffer9.position(0));
		local3.glEnableClientState(32886);
		Static240.method3787(false);
		if (this.anInt2677 != 0) {
			Static122.method1910(0, 0);
			Static240.method3804(1);
			Static240.method3791(0);
			Static240.method3789(Static144.anInt2669);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt2677 >> 16), (byte) (this.anInt2677 >> 8), (byte) this.anInt2677, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt2677 >> 16), (byte) (this.anInt2677 >> 8), (byte) this.anInt2677, (byte) -1);
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
		Static157.method2451();
		Static240.method3789(this.anInt2671);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt2676, this.anInt2676, 0);
		Static50.method872(Static144.anIntArray334);
	}

	@OriginalMember(owner = "client!kk", name = "c", descriptor = "(Lclient!kk;)Z")
	private boolean method2261(@OriginalArg(0) Class97 arg0) {
		if (this.aClass1_Sub2_Sub2_Sub1_4 == null) {
			if (this.anInt2670 == 0) {
				this.aClass1_Sub2_Sub2_Sub1_4 = Static208.anInterface4_1.method989(Static208.aFloat123, this.anInt2680, true, this.anInt2676);
			} else if (this.anInt2670 == 2) {
				this.method2266(arg0);
			} else if (this.anInt2670 == 1) {
				this.method2254(arg0);
			}
		}
		return this.aClass1_Sub2_Sub2_Sub1_4 != null;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIIILclient!kk;)V")
	public void method2262(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class97 arg6) {
		@Pc(6) int local6 = this.anInt2682 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2675 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt2668) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt2668) / 2;
		if (local42 < arg3 && local42 + this.anInt2668 > 0 && local51 < arg2 && local51 + this.anInt2668 > 0 && this.method2261(arg6)) {
			this.aClass1_Sub2_Sub2_Sub1_4.method3922(local51 + arg0, local42 + arg1, this.anInt2668, this.anInt2668);
		}
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIII)Z")
	public boolean method2263(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean188) {
			this.anInt2683 = 1073741823;
			local7 = this.anInt2672;
			local12 = this.anInt2674;
			local17 = this.anInt2679;
		} else {
			local7 = this.anInt2672 - arg0;
			local12 = this.anInt2674 - arg1;
			local17 = this.anInt2679 - arg2;
			this.anInt2683 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2683 == 0) {
				this.anInt2683 = 1;
			}
			local7 = (local7 << 8) / this.anInt2683;
			local12 = (local12 << 8) / this.anInt2683;
			local17 = (local17 << 8) / this.anInt2683;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2668 = this.anInt2681 * arg3 / (this.aBoolean188 ? 1024 : this.anInt2683);
		} else {
			this.anInt2668 = 0;
		}
		if (this.anInt2668 < 8) {
			this.method2271();
			this.aClass1_Sub2_Sub2_Sub1_4 = null;
			return false;
		}
		@Pc(145) int local145 = Static202.method3145(this.anInt2668);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt2676) {
			this.anInt2676 = local145;
		}
		this.anInt2682 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt2675 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean189 = true;
		this.aClass1_Sub2_Sub2_Sub1_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIIII)V")
	public void method2265(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt2682 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2675 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt2668) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt2668) / 2;
		if (local42 >= arg3 || local42 + this.anInt2668 <= 0 || local51 >= arg2 || local51 + this.anInt2668 <= 0) {
			return;
		}
		if (this.anInt2670 == 0) {
			Static208.anInterface4_1.method992(this.anInt2680, this.anInt2676);
		} else if (this.anInt2671 == -1) {
			return;
		} else {
			Static240.method3789(this.anInt2671);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt2668;
		@Pc(105) int local105 = local27 + this.anInt2668;
		@Pc(107) GL local107 = Static240.aGL1;
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

	@OriginalMember(owner = "client!kk", name = "d", descriptor = "(Lclient!kk;)V")
	private void method2266(@OriginalArg(0) Class97 arg0) {
		@Pc(5) Class6_Sub3 local5 = Static85.method1434(Static172.aClass7_142, this.anInt2680);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub2_Sub2_Sub1_4 = new Class1_Sub2_Sub2_Sub1(this.anInt2676, this.anInt2676);
		Static213.method3384(Static144.anIntArray334);
		this.aClass1_Sub2_Sub2_Sub1_4.method3932();
		Static208.method3241();
		Static213.method3362(0, 0, this.anInt2676, this.anInt2676, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean188) {
				local33 = -arg0.anInt2672;
				local35 = -arg0.anInt2674;
				local37 = -arg0.anInt2679;
			} else {
				local33 = this.anInt2672 - arg0.anInt2672;
				local35 = this.anInt2674 - arg0.anInt2674;
				local37 = this.anInt2679 - arg0.anInt2679;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt2682 != 0) {
			local81 = Class135.anIntArray472[this.anInt2682];
			local86 = Class135.anIntArray474[this.anInt2682];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt2675 != 0) {
			local81 = this.anInt2675 - 1024 & 0x7FF;
			local86 = Class135.anIntArray472[local81];
			local98 = Class135.anIntArray474[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class6_Sub2_Sub1 local167 = local5.method1441(64, 768, -local33, -local35, -local37);
		local86 = local167.method2097() - local167.method2092();
		local98 = local167.method2096() - local167.method3833();
		local142 = local167.method2092() + local86 / 2;
		@Pc(193) int local193 = local167.method3833() + local98 / 2;
		if (local86 > local98) {
			local167.method588(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt2676);
		} else {
			local167.method588(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt2676);
		}
		Static282.aClass23_33.method1012();
		Static213.method3365(Static144.anIntArray334);
		Static208.method3241();
	}

	@OriginalMember(owner = "client!kk", name = "e", descriptor = "(Lclient!kk;)V")
	public void method2267(@OriginalArg(0) Class97 arg0) {
		if (this.anInt2670 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt2671 == -1 || this.anInt2678 != Static154.anInt2852;
		if (!this.aBoolean189 && !local14) {
			return;
		}
		if (local14) {
			this.anInt2678 = Static154.anInt2852;
			this.anInt2671 = Static231.method3696(Static231.anInt4842, this.anInt2676, this.anInt2676);
		} else {
			Static240.method3789(this.anInt2671);
			Static231.method3701(Static231.anInt4842, this.anInt2676, this.anInt2676);
		}
		if (this.anInt2670 == 1) {
			this.method2259(arg0);
			this.aBoolean189 = false;
		} else if (this.anInt2670 == 2) {
			this.aBoolean189 = !this.method2270(arg0);
		}
	}

	@OriginalMember(owner = "client!kk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2271();
		super.finalize();
	}

	@OriginalMember(owner = "client!kk", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2268(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static144.aByteArray51[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!kk", name = "f", descriptor = "(Lclient!kk;)Z")
	private boolean method2270(@OriginalArg(0) Class97 arg0) {
		@Pc(5) Class6_Sub3 local5 = Static85.method1434(Static172.aClass7_142, this.anInt2680);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static240.aGL1;
		Static50.method874(Static144.anIntArray334);
		Static50.method869();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean188) {
				local25 = -arg0.anInt2672;
				local27 = -arg0.anInt2674;
				local29 = -arg0.anInt2679;
			} else {
				local25 = this.anInt2672 - arg0.anInt2672;
				local27 = this.anInt2674 - arg0.anInt2674;
				local29 = this.anInt2679 - arg0.anInt2679;
			}
		}
		local5.method1435();
		@Pc(78) Class6_Sub2 local78 = local5.method1425(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method2097() - local78.method2092()) / 2;
		@Pc(94) int local94 = (local78.method2096() - local78.method3833()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static157.method2447((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt2676, this.anInt2676);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt2682 != 0) {
			local126 = Class135.anIntArray472[this.anInt2682];
			local131 = Class135.anIntArray474[this.anInt2682];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt2675 != 0) {
			local126 = this.anInt2675 - 1024 & 0x7FF;
			local131 = Class135.anIntArray472[local126];
			local143 = Class135.anIntArray474[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static34.method628((float) -local25, (float) local27, (float) -local29);
		Static34.method632(16777215, 0.5F, 0.5F, 0.5F);
		Static34.method625();
		Static240.method3808();
		Static240.method3801(true);
		Static240.method3787(true);
		local78.method2084(0, 0, 0, -local86 - local78.method2092(), -local94 - local78.method3833(), 0, -1L);
		Static240.method3787(false);
		Static240.method3801(false);
		Static240.method3800();
		Static157.method2451();
		Static240.method3789(this.anInt2671);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt2676, this.anInt2676, 0);
		Static50.method872(Static144.anIntArray334);
		return true;
	}

	@OriginalMember(owner = "client!kk", name = "h", descriptor = "()V")
	private void method2271() {
		if (this.anInt2671 != -1) {
			Static154.method2373(this.anInt2671, 0, this.anInt2678);
		}
		this.aBoolean189 = true;
		this.anInt2671 = -1;
	}
}
