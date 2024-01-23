import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class165 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "Lclient!n;")
	private Class1_Sub2_Sub14_Sub1 aClass1_Sub2_Sub14_Sub1_4;

	@OriginalMember(owner = "client!vc", name = "i", descriptor = "I")
	private int anInt5954;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "I")
	private int anInt5955;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "I")
	private int anInt5960;

	@OriginalMember(owner = "client!vc", name = "q", descriptor = "I")
	public int anInt5961;

	@OriginalMember(owner = "client!vc", name = "w", descriptor = "I")
	private int anInt5963;

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Z")
	private boolean aBoolean317 = true;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	private int anInt5957 = -1;

	@OriginalMember(owner = "client!vc", name = "u", descriptor = "I")
	private int anInt5962 = -1;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	private int anInt5959;

	@OriginalMember(owner = "client!vc", name = "g", descriptor = "I")
	private int anInt5952;

	@OriginalMember(owner = "client!vc", name = "x", descriptor = "I")
	private int anInt5964;

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Z")
	private boolean aBoolean318;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
	private int anInt5949;

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
	private int anInt5950;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "I")
	private int anInt5956;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "I")
	private int anInt5958;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt5959 = arg2;
		this.anInt5952 = arg3;
		this.anInt5964 = arg4;
		this.aBoolean318 = arg7;
		this.anInt5949 = arg1;
		this.anInt5950 = arg6;
		this.anInt5956 = arg5;
		this.anInt5958 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!vc;)V")
	private void method4612(@OriginalArg(0) Class165 arg0) {
		Static278.method4616();
		Static278.method4619();
		this.aClass1_Sub2_Sub14_Sub1_4 = new Class1_Sub2_Sub14_Sub1_Sub1(this.anInt5963, this.anInt5963);
		Static203.method3593(Static278.anIntArray597);
		this.aClass1_Sub2_Sub14_Sub1_4.method2490();
		Static151.method2838();
		Static203.method3592(0, 0, this.anInt5963, this.anInt5963, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean318) {
				local26 = -arg0.anInt5959;
				local28 = -arg0.anInt5952;
				local30 = -arg0.anInt5964;
			} else {
				local26 = this.anInt5959 - arg0.anInt5959;
				local28 = this.anInt5952 - arg0.anInt5952;
				local30 = this.anInt5964 - arg0.anInt5964;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt5955 != 0) {
			local74 = Class91.anIntArray319[this.anInt5955];
			local79 = Class91.anIntArray320[this.anInt5955];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt5960 != 0) {
			local74 = this.anInt5960 - 1024 & 0x7FF;
			local79 = Class91.anIntArray319[local74];
			local91 = Class91.anIntArray320[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static302.method1373(Static278.aClass25_Sub3_1.aShortArray60, 0, Static278.aClass25_Sub3_1.anInt3521, (short) Static151.anInterface2_1.method4416(this.anInt5949));
		@Pc(172) Class25_Sub2_Sub2 local172 = Static278.aClass25_Sub3_1.method2810(64, 512, -local26, -local28, -local30);
		local79 = local172.method3466() - local172.method3475();
		local91 = local172.method3462() - local172.method4773();
		if (local79 > local91) {
			local135 = this.anInt5950 == 0 ? (local79 << 9) / this.anInt5963 : (local79 * 16 << 9) / (this.anInt5963 * 13);
			local172.method3503(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt5950 == 0 ? (local91 << 9) / this.anInt5963 : (local91 * 16 << 9) / (this.anInt5963 * 13);
			local172.method3503(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt5950 == 0) {
			for (local135 = 0; local135 < Static203.anIntArray460.length; local135++) {
				if (Static203.anIntArray460[local135] != 0) {
					Static203.anIntArray460[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method4613();
			this.method4617();
		}
		Static1.aClass5_1.method1716();
		Static203.method3605(Static278.anIntArray597);
		Static151.method2838();
	}

	@OriginalMember(owner = "client!vc", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method4620();
		super.finalize();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "()V")
	private void method4613() {
		@Pc(6) int local6 = this.anInt5963 * 3 / 32;
		@Pc(15) int local15 = this.anInt5963 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static203.anInt4507;
		@Pc(35) int local35 = Static203.anInt4507 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static203.anInt4506) {
			local17 = local15 + Static203.anInt4506 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static203.anInt4509) {
			local59 = Static203.anInt4509 - local6;
			local17 -= local59;
			local31 += local59 * Static203.anInt4507;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static203.anInt4510) {
			local59 = local6 + local15 - Static203.anInt4510;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static203.anInt4508) {
			local59 = Static203.anInt4508 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method4629(Static203.anIntArray460, this.anInt5950, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIII)V")
	public void method4614(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt5955 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt5960 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt5954) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt5954) / 2;
		if (local42 >= arg3 || local42 + this.anInt5954 <= 0 || local51 >= arg2 || local51 + this.anInt5954 <= 0) {
			return;
		}
		if (this.anInt5958 == 0) {
			Static151.anInterface2_1.method4425(this.anInt5963, this.anInt5949);
		} else if (this.anInt5962 == -1) {
			return;
		} else {
			Static296.method4812(this.anInt5962);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt5954;
		@Pc(105) int local105 = local27 + this.anInt5954;
		@Pc(107) GL local107 = Static296.aGL1;
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

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "()V")
	private void method4617() {
		@Pc(2) int local2 = this.anInt5963;
		@Pc(5) int local5 = this.anInt5963;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static203.anInt4507 - local2;
		if (local5 > Static203.anInt4506) {
			local5 -= local5 - Static203.anInt4506;
		}
		@Pc(37) int local37;
		if (Static203.anInt4509 > 0) {
			local37 = Static203.anInt4509;
			local5 -= local37;
			local19 = local37 * Static203.anInt4507;
			local17 = local13 * local37;
		}
		if (local2 > Static203.anInt4510) {
			local37 = local2 - Static203.anInt4510;
			local2 -= local37;
			local23 += local37;
		}
		if (Static203.anInt4508 > 0) {
			local37 = Static203.anInt4508;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method4623(Static203.anIntArray460, this.anInt5950, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Lclient!vc;)V")
	private void method4618(@OriginalArg(0) Class165 arg0) {
		Static278.method4627();
		Static278.method4615();
		@Pc(3) GL local3 = Static296.aGL1;
		Static288.method4707(Static278.anIntArray597);
		Static288.method4710();
		local3.glClearColor((float) (this.anInt5950 >> 16 & 0xFF) / 255.0F, (float) (this.anInt5950 >> 8 & 0xFF) / 255.0F, (float) (this.anInt5950 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean318) {
				local39 = -arg0.anInt5959;
				local41 = -arg0.anInt5952;
				local43 = -arg0.anInt5964;
			} else {
				local39 = this.anInt5959 - arg0.anInt5959;
				local41 = this.anInt5952 - arg0.anInt5952;
				local43 = this.anInt5964 - arg0.anInt5964;
			}
		}
		Static17.method370(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt5963, this.anInt5963);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt5955 != 0) {
			local96 = Class91.anIntArray319[this.anInt5955];
			local101 = Class91.anIntArray320[this.anInt5955];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt5960 != 0) {
			local96 = this.anInt5960 - 1024 & 0x7FF;
			local101 = Class91.anIntArray319[local96];
			local113 = Class91.anIntArray320[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static201.method3576((float) -local39, (float) -local41, (float) local43);
		Static201.method3583(16777215, 0.5F, 0.5F, 1.0F);
		Static201.method3581();
		if (this.anInt5950 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static151.anInterface2_1.method4425(this.anInt5963, this.anInt5949);
		Static296.method4840(true);
		if (Static296.aBoolean347) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static278.aByteBuffer12.position(0));
		local3.glVertexPointer(2, 5126, 20, Static278.aByteBuffer12.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static278.aByteBuffer12.position(12));
		local3.glDrawElements(5, Static278.aByteBuffer11.limit() / 2, 5123, Static278.aByteBuffer11.position(0));
		local3.glEnableClientState(32886);
		Static296.method4840(false);
		if (this.anInt5950 != 0) {
			Static141.method2524(0, 0);
			Static296.method4805(1);
			Static296.method4823(0);
			Static296.method4812(Static278.anInt5953);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt5950 >> 16), (byte) (this.anInt5950 >> 8), (byte) this.anInt5950, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt5950 >> 16), (byte) (this.anInt5950 >> 8), (byte) this.anInt5950, (byte) -1);
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
		Static17.method369();
		Static296.method4812(this.anInt5962);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt5963, this.anInt5963, 0);
		Static288.method4708(Static278.anIntArray597);
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "()V")
	private void method4620() {
		if (this.anInt5962 != -1) {
			Static237.method4089(this.anInt5962, 0, this.anInt5957);
		}
		this.aBoolean317 = true;
		this.anInt5962 = -1;
	}

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "(Lclient!vc;)V")
	public void method4621(@OriginalArg(0) Class165 arg0) {
		if (this.anInt5958 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt5962 == -1 || this.anInt5957 != Static237.anInt5216;
		if (!this.aBoolean317 && !local14) {
			return;
		}
		if (local14) {
			this.anInt5957 = Static237.anInt5216;
			this.anInt5962 = Static297.method4850(Static297.anInt6219, this.anInt5963, this.anInt5963);
		} else {
			Static296.method4812(this.anInt5962);
			Static297.method4844(Static297.anInt6219, this.anInt5963, this.anInt5963);
		}
		if (this.anInt5958 == 1) {
			this.method4618(arg0);
			this.aBoolean317 = false;
		} else if (this.anInt5958 == 2) {
			this.aBoolean317 = !this.method4628(arg0);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method4623(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static278.aByteArray74[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!vc", name = "d", descriptor = "(Lclient!vc;)Z")
	private boolean method4624(@OriginalArg(0) Class165 arg0) {
		if (this.aClass1_Sub2_Sub14_Sub1_4 == null) {
			if (this.anInt5958 == 0) {
				this.aClass1_Sub2_Sub14_Sub1_4 = Static151.anInterface2_1.method4412(true, this.anInt5963, Static151.aFloat122, this.anInt5949);
			} else if (this.anInt5958 == 2) {
				this.method4626(arg0);
			} else if (this.anInt5958 == 1) {
				this.method4612(arg0);
			}
		}
		return this.aClass1_Sub2_Sub14_Sub1_4 != null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)Z")
	public boolean method4625(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean318) {
			this.anInt5961 = 1073741823;
			local7 = this.anInt5959;
			local12 = this.anInt5952;
			local17 = this.anInt5964;
		} else {
			local7 = this.anInt5959 - arg0;
			local12 = this.anInt5952 - arg1;
			local17 = this.anInt5964 - arg2;
			this.anInt5961 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt5961 == 0) {
				this.anInt5961 = 1;
			}
			local7 = (local7 << 8) / this.anInt5961;
			local12 = (local12 << 8) / this.anInt5961;
			local17 = (local17 << 8) / this.anInt5961;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt5954 = this.anInt5956 * arg3 / (this.aBoolean318 ? 1024 : this.anInt5961);
		} else {
			this.anInt5954 = 0;
		}
		if (this.anInt5954 < 8) {
			this.method4620();
			this.aClass1_Sub2_Sub14_Sub1_4 = null;
			return false;
		}
		@Pc(145) int local145 = Static56.method1126(this.anInt5954);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt5963) {
			this.anInt5963 = local145;
		}
		this.anInt5955 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt5960 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean317 = true;
		this.aClass1_Sub2_Sub14_Sub1_4 = null;
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "(Lclient!vc;)V")
	private void method4626(@OriginalArg(0) Class165 arg0) {
		@Pc(5) Class25_Sub3 local5 = Static149.method2801(Static248.aClass83_170, this.anInt5949);
		if (local5 == null) {
			return;
		}
		this.aClass1_Sub2_Sub14_Sub1_4 = new Class1_Sub2_Sub14_Sub1(this.anInt5963, this.anInt5963);
		Static203.method3593(Static278.anIntArray597);
		this.aClass1_Sub2_Sub14_Sub1_4.method2490();
		Static151.method2838();
		Static203.method3592(0, 0, this.anInt5963, this.anInt5963, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean318) {
				local33 = -arg0.anInt5959;
				local35 = -arg0.anInt5952;
				local37 = -arg0.anInt5964;
			} else {
				local33 = this.anInt5959 - arg0.anInt5959;
				local35 = this.anInt5952 - arg0.anInt5952;
				local37 = this.anInt5964 - arg0.anInt5964;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt5955 != 0) {
			local81 = Class91.anIntArray319[this.anInt5955];
			local86 = Class91.anIntArray320[this.anInt5955];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt5960 != 0) {
			local81 = this.anInt5960 - 1024 & 0x7FF;
			local86 = Class91.anIntArray319[local81];
			local98 = Class91.anIntArray320[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class25_Sub2_Sub2 local167 = local5.method2810(64, 768, -local33, -local35, -local37);
		local86 = local167.method3466() - local167.method3475();
		local98 = local167.method3462() - local167.method4773();
		local142 = local167.method3475() + local86 / 2;
		@Pc(193) int local193 = local167.method4773() + local98 / 2;
		if (local86 > local98) {
			local167.method3503(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt5963);
		} else {
			local167.method3503(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt5963);
		}
		Static1.aClass5_1.method1716();
		Static203.method3605(Static278.anIntArray597);
		Static151.method2838();
	}

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "(Lclient!vc;)Z")
	private boolean method4628(@OriginalArg(0) Class165 arg0) {
		@Pc(5) Class25_Sub3 local5 = Static149.method2801(Static248.aClass83_170, this.anInt5949);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static296.aGL1;
		Static288.method4707(Static278.anIntArray597);
		Static288.method4710();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean318) {
				local25 = -arg0.anInt5959;
				local27 = -arg0.anInt5952;
				local29 = -arg0.anInt5964;
			} else {
				local25 = this.anInt5959 - arg0.anInt5959;
				local27 = this.anInt5952 - arg0.anInt5952;
				local29 = this.anInt5964 - arg0.anInt5964;
			}
		}
		local5.method2797();
		@Pc(78) Class25_Sub2 local78 = local5.method2821(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3466() - local78.method3475()) / 2;
		@Pc(94) int local94 = (local78.method3462() - local78.method4773()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static17.method374((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt5963, this.anInt5963);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt5955 != 0) {
			local126 = Class91.anIntArray319[this.anInt5955];
			local131 = Class91.anIntArray320[this.anInt5955];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt5960 != 0) {
			local126 = this.anInt5960 - 1024 & 0x7FF;
			local131 = Class91.anIntArray319[local126];
			local143 = Class91.anIntArray320[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static201.method3576((float) -local25, (float) local27, (float) -local29);
		Static201.method3583(16777215, 0.5F, 0.5F, 0.5F);
		Static201.method3581();
		Static296.method4813();
		Static296.method4798(true);
		Static296.method4840(true);
		local78.method3487(0, 0, 0, -local86 - local78.method3475(), -local94 - local78.method4773(), 0, -1L);
		Static296.method4840(false);
		Static296.method4798(false);
		Static296.method4808();
		Static17.method369();
		Static296.method4812(this.anInt5962);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt5963, this.anInt5963, 0);
		Static288.method4708(Static278.anIntArray597);
		return true;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method4629(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static278.aByteArray74[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIIIILclient!vc;)V")
	public void method4631(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class165 arg6) {
		@Pc(6) int local6 = this.anInt5955 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt5960 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt5954) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt5954) / 2;
		if (local42 < arg3 && local42 + this.anInt5954 > 0 && local51 < arg2 && local51 + this.anInt5954 > 0 && this.method4624(arg6)) {
			this.aClass1_Sub2_Sub14_Sub1_4.method2726(local51 + arg0, local42 + arg1, this.anInt5954, this.anInt5954);
		}
	}
}
