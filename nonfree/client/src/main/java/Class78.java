import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class78 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	private int anInt2667;

	@OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
	private int anInt2673;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
	public int anInt2674;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "I")
	private int anInt2675;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!af;")
	private Class4_Sub2_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_2;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "I")
	private int anInt2678;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
	private boolean aBoolean175 = true;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	private int anInt2679 = -1;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
	private int anInt2680 = -1;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	private int anInt2668;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	private int anInt2677;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
	private int anInt2670;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "Z")
	private boolean aBoolean176;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
	private int anInt2681;

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
	private int anInt2666;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	private int anInt2669;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	private int anInt2676;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2668 = arg2;
		this.anInt2677 = arg3;
		this.anInt2670 = arg4;
		this.aBoolean176 = arg7;
		this.anInt2681 = arg1;
		this.anInt2666 = arg6;
		this.anInt2669 = arg5;
		this.anInt2676 = arg0;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIIILclient!jf;)V")
	public void method2063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class78 arg6) {
		@Pc(6) int local6 = this.anInt2667 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2675 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt2673) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt2673) / 2;
		if (local42 < arg3 && local42 + this.anInt2673 > 0 && local51 < arg2 && local51 + this.anInt2673 > 0 && this.method2072(arg6)) {
			this.aClass4_Sub2_Sub1_Sub1_2.method3462(local51 + arg0, local42 + arg1, this.anInt2673, this.anInt2673);
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "()V")
	private void method2065() {
		@Pc(6) int local6 = this.anInt2678 * 3 / 32;
		@Pc(15) int local15 = this.anInt2678 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static166.anInt3305;
		@Pc(35) int local35 = Static166.anInt3305 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static166.anInt3304) {
			local17 = local15 + Static166.anInt3304 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static166.anInt3303) {
			local59 = Static166.anInt3303 - local6;
			local17 -= local59;
			local31 += local59 * Static166.anInt3305;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static166.anInt3306) {
			local59 = local6 + local15 - Static166.anInt3306;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static166.anInt3302) {
			local59 = Static166.anInt3302 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method2070(Static166.anIntArray293, this.anInt2666, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "()V")
	private void method2066() {
		@Pc(2) int local2 = this.anInt2678;
		@Pc(5) int local5 = this.anInt2678;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static166.anInt3305 - local2;
		if (local5 > Static166.anInt3304) {
			local5 -= local5 - Static166.anInt3304;
		}
		@Pc(37) int local37;
		if (Static166.anInt3303 > 0) {
			local37 = Static166.anInt3303;
			local5 -= local37;
			local19 = local37 * Static166.anInt3305;
			local17 = local13 * local37;
		}
		if (local2 > Static166.anInt3306) {
			local37 = local2 - Static166.anInt3306;
			local2 -= local37;
			local23 += local37;
		}
		if (Static166.anInt3302 > 0) {
			local37 = Static166.anInt3302;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method2067(Static166.anIntArray293, this.anInt2666, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method2067(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static123.aByteArray31[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
	public void method2068(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt2667 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt2675 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt2673) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt2673) / 2;
		if (local42 >= arg3 || local42 + this.anInt2673 <= 0 || local51 >= arg2 || local51 + this.anInt2673 <= 0) {
			return;
		}
		if (this.anInt2676 == 0) {
			Static204.anInterface2_1.method1972(this.anInt2678, this.anInt2681);
		} else if (this.anInt2679 == -1) {
			return;
		} else {
			Static178.method2763(this.anInt2679);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt2673;
		@Pc(105) int local105 = local27 + this.anInt2673;
		@Pc(107) GL local107 = Static178.aGL1;
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

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!jf;)V")
	private void method2069(@OriginalArg(0) Class78 arg0) {
		Static123.method2074();
		Static123.method2082();
		@Pc(3) GL local3 = Static178.aGL1;
		Static186.method2961(Static123.anIntArray241);
		Static186.method2957();
		local3.glClearColor((float) (this.anInt2666 >> 16 & 0xFF) / 255.0F, (float) (this.anInt2666 >> 8 & 0xFF) / 255.0F, (float) (this.anInt2666 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean176) {
				local39 = -arg0.anInt2668;
				local41 = -arg0.anInt2677;
				local43 = -arg0.anInt2670;
			} else {
				local39 = this.anInt2668 - arg0.anInt2668;
				local41 = this.anInt2677 - arg0.anInt2677;
				local43 = this.anInt2670 - arg0.anInt2670;
			}
		}
		Static29.method456(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt2678, this.anInt2678);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt2667 != 0) {
			local96 = Class131.anIntArray355[this.anInt2667];
			local101 = Class131.anIntArray353[this.anInt2667];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt2675 != 0) {
			local96 = this.anInt2675 - 1024 & 0x7FF;
			local101 = Class131.anIntArray355[local96];
			local113 = Class131.anIntArray353[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static291.method4317((float) -local39, (float) -local41, (float) local43);
		Static291.method4313(16777215, 0.5F, 0.5F, 1.0F);
		Static291.method4311();
		if (this.anInt2666 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static204.anInterface2_1.method1972(this.anInt2678, this.anInt2681);
		Static178.method2776(true);
		if (Static178.aBoolean225) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static123.aByteBuffer6.position(0));
		local3.glVertexPointer(2, 5126, 20, Static123.aByteBuffer6.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static123.aByteBuffer6.position(12));
		local3.glDrawElements(5, Static123.aByteBuffer5.limit() / 2, 5123, Static123.aByteBuffer5.position(0));
		local3.glEnableClientState(32886);
		Static178.method2776(false);
		if (this.anInt2666 != 0) {
			Static32.method479(0, 0);
			Static178.method2754(1);
			Static178.method2769(0);
			Static178.method2763(Static123.anInt2671);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt2666 >> 16), (byte) (this.anInt2666 >> 8), (byte) this.anInt2666, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt2666 >> 16), (byte) (this.anInt2666 >> 8), (byte) this.anInt2666, (byte) -1);
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
		Static29.method446();
		Static178.method2763(this.anInt2679);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt2678, this.anInt2678, 0);
		Static186.method2956(Static123.anIntArray241);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method2070(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static123.aByteArray31[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Lclient!jf;)Z")
	private boolean method2072(@OriginalArg(0) Class78 arg0) {
		if (this.aClass4_Sub2_Sub1_Sub1_2 == null) {
			if (this.anInt2676 == 0) {
				this.aClass4_Sub2_Sub1_Sub1_2 = Static204.anInterface2_1.method1971(true, this.anInt2678, this.anInt2681, Static204.aFloat42);
			} else if (this.anInt2676 == 2) {
				this.method2076(arg0);
			} else if (this.anInt2676 == 1) {
				this.method2073(arg0);
			}
		}
		return this.aClass4_Sub2_Sub1_Sub1_2 != null;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(Lclient!jf;)V")
	private void method2073(@OriginalArg(0) Class78 arg0) {
		Static123.method2064();
		Static123.method2077();
		this.aClass4_Sub2_Sub1_Sub1_2 = new Class4_Sub2_Sub1_Sub1_Sub1(this.anInt2678, this.anInt2678);
		Static166.method2609(Static123.anIntArray241);
		this.aClass4_Sub2_Sub1_Sub1_2.method3469();
		Static204.method3238();
		Static166.method2627(0, 0, this.anInt2678, this.anInt2678, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean176) {
				local26 = -arg0.anInt2668;
				local28 = -arg0.anInt2677;
				local30 = -arg0.anInt2670;
			} else {
				local26 = this.anInt2668 - arg0.anInt2668;
				local28 = this.anInt2677 - arg0.anInt2677;
				local30 = this.anInt2670 - arg0.anInt2670;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt2667 != 0) {
			local74 = Class131.anIntArray355[this.anInt2667];
			local79 = Class131.anIntArray353[this.anInt2667];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt2675 != 0) {
			local74 = this.anInt2675 - 1024 & 0x7FF;
			local79 = Class131.anIntArray355[local74];
			local91 = Class131.anIntArray353[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static307.method3247(Static123.aClass12_Sub7_1.aShortArray63, 0, Static123.aClass12_Sub7_1.anInt4096, (short) Static204.anInterface2_1.method1979(this.anInt2681));
		@Pc(172) Class12_Sub2_Sub1 local172 = Static123.aClass12_Sub7_1.method3341(64, 512, -local26, -local28, -local30);
		local79 = local172.method3146() - local172.method3148();
		local91 = local172.method3160() - local172.method3355();
		if (local79 > local91) {
			local135 = this.anInt2666 == 0 ? (local79 << 9) / this.anInt2678 : (local79 * 16 << 9) / (this.anInt2678 * 13);
			local172.method604(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt2666 == 0 ? (local91 << 9) / this.anInt2678 : (local91 * 16 << 9) / (this.anInt2678 * 13);
			local172.method604(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt2666 == 0) {
			for (local135 = 0; local135 < Static166.anIntArray293.length; local135++) {
				if (Static166.anIntArray293[local135] != 0) {
					Static166.anIntArray293[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method2065();
			this.method2066();
		}
		Static26.aClass119_1.method3926();
		Static166.method2618(Static123.anIntArray241);
		Static204.method3238();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIII)Z")
	public boolean method2075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean176) {
			this.anInt2674 = 1073741823;
			local7 = this.anInt2668;
			local12 = this.anInt2677;
			local17 = this.anInt2670;
		} else {
			local7 = this.anInt2668 - arg0;
			local12 = this.anInt2677 - arg1;
			local17 = this.anInt2670 - arg2;
			this.anInt2674 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2674 == 0) {
				this.anInt2674 = 1;
			}
			local7 = (local7 << 8) / this.anInt2674;
			local12 = (local12 << 8) / this.anInt2674;
			local17 = (local17 << 8) / this.anInt2674;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2673 = this.anInt2669 * arg3 / (this.aBoolean176 ? 1024 : this.anInt2674);
		} else {
			this.anInt2673 = 0;
		}
		if (this.anInt2673 < 8) {
			this.method2078();
			this.aClass4_Sub2_Sub1_Sub1_2 = null;
			return false;
		}
		@Pc(145) int local145 = Static276.method4104(this.anInt2673);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt2678) {
			this.anInt2678 = local145;
		}
		this.anInt2667 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt2675 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean175 = true;
		this.aClass4_Sub2_Sub1_Sub1_2 = null;
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "(Lclient!jf;)V")
	private void method2076(@OriginalArg(0) Class78 arg0) {
		@Pc(5) Class12_Sub7 local5 = Static208.method3332(Static285.aClass98_169, this.anInt2681);
		if (local5 == null) {
			return;
		}
		this.aClass4_Sub2_Sub1_Sub1_2 = new Class4_Sub2_Sub1_Sub1(this.anInt2678, this.anInt2678);
		Static166.method2609(Static123.anIntArray241);
		this.aClass4_Sub2_Sub1_Sub1_2.method3469();
		Static204.method3238();
		Static166.method2627(0, 0, this.anInt2678, this.anInt2678, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean176) {
				local33 = -arg0.anInt2668;
				local35 = -arg0.anInt2677;
				local37 = -arg0.anInt2670;
			} else {
				local33 = this.anInt2668 - arg0.anInt2668;
				local35 = this.anInt2677 - arg0.anInt2677;
				local37 = this.anInt2670 - arg0.anInt2670;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt2667 != 0) {
			local81 = Class131.anIntArray355[this.anInt2667];
			local86 = Class131.anIntArray353[this.anInt2667];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt2675 != 0) {
			local81 = this.anInt2675 - 1024 & 0x7FF;
			local86 = Class131.anIntArray355[local81];
			local98 = Class131.anIntArray353[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class12_Sub2_Sub1 local167 = local5.method3341(64, 768, -local33, -local35, -local37);
		local86 = local167.method3146() - local167.method3148();
		local98 = local167.method3160() - local167.method3355();
		local142 = local167.method3148() + local86 / 2;
		@Pc(193) int local193 = local167.method3355() + local98 / 2;
		if (local86 > local98) {
			local167.method604(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt2678);
		} else {
			local167.method604(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt2678);
		}
		Static26.aClass119_1.method3926();
		Static166.method2618(Static123.anIntArray241);
		Static204.method3238();
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "()V")
	private void method2078() {
		if (this.anInt2679 != -1) {
			Static163.method2523(this.anInt2679, 0, this.anInt2680);
		}
		this.aBoolean175 = true;
		this.anInt2679 = -1;
	}

	@OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method2078();
		super.finalize();
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(Lclient!jf;)V")
	public void method2079(@OriginalArg(0) Class78 arg0) {
		if (this.anInt2676 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt2679 == -1 || this.anInt2680 != Static163.anInt3218;
		if (!this.aBoolean175 && !local14) {
			return;
		}
		if (local14) {
			this.anInt2680 = Static163.anInt3218;
			this.anInt2679 = Static144.method2323(Static144.anInt2930, this.anInt2678, this.anInt2678);
		} else {
			Static178.method2763(this.anInt2679);
			Static144.method2328(Static144.anInt2930, this.anInt2678, this.anInt2678);
		}
		if (this.anInt2676 == 1) {
			this.method2069(arg0);
			this.aBoolean175 = false;
		} else if (this.anInt2676 == 2) {
			this.aBoolean175 = !this.method2081(arg0);
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(Lclient!jf;)Z")
	private boolean method2081(@OriginalArg(0) Class78 arg0) {
		@Pc(5) Class12_Sub7 local5 = Static208.method3332(Static285.aClass98_169, this.anInt2681);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static178.aGL1;
		Static186.method2961(Static123.anIntArray241);
		Static186.method2957();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean176) {
				local25 = -arg0.anInt2668;
				local27 = -arg0.anInt2677;
				local29 = -arg0.anInt2670;
			} else {
				local25 = this.anInt2668 - arg0.anInt2668;
				local27 = this.anInt2677 - arg0.anInt2677;
				local29 = this.anInt2670 - arg0.anInt2670;
			}
		}
		local5.method3318();
		@Pc(78) Class12_Sub2 local78 = local5.method3325(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3146() - local78.method3148()) / 2;
		@Pc(94) int local94 = (local78.method3160() - local78.method3355()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static29.method453((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt2678, this.anInt2678);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt2667 != 0) {
			local126 = Class131.anIntArray355[this.anInt2667];
			local131 = Class131.anIntArray353[this.anInt2667];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt2675 != 0) {
			local126 = this.anInt2675 - 1024 & 0x7FF;
			local131 = Class131.anIntArray355[local126];
			local143 = Class131.anIntArray353[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static291.method4317((float) -local25, (float) local27, (float) -local29);
		Static291.method4313(16777215, 0.5F, 0.5F, 0.5F);
		Static291.method4311();
		Static178.method2748();
		Static178.method2751(true);
		Static178.method2776(true);
		local78.method3163(0, 0, 0, -local86 - local78.method3148(), -local94 - local78.method3355(), 0, -1L);
		Static178.method2776(false);
		Static178.method2751(false);
		Static178.method2784();
		Static29.method446();
		Static178.method2763(this.anInt2679);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt2678, this.anInt2678, 0);
		Static186.method2956(Static123.anIntArray241);
		return true;
	}
}
