import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class6 {

	@OriginalMember(owner = "client!af", name = "d", descriptor = "Lclient!n;")
	private Class4_Sub2_Sub4_Sub2 aClass4_Sub2_Sub4_Sub2_3;

	@OriginalMember(owner = "client!af", name = "l", descriptor = "I")
	private int anInt120;

	@OriginalMember(owner = "client!af", name = "n", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!af", name = "o", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!af", name = "p", descriptor = "I")
	private int anInt123;

	@OriginalMember(owner = "client!af", name = "v", descriptor = "I")
	public int anInt128;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "I")
	private int anInt114 = -1;

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Z")
	private boolean aBoolean10 = true;

	@OriginalMember(owner = "client!af", name = "e", descriptor = "I")
	private int anInt115 = -1;

	@OriginalMember(owner = "client!af", name = "x", descriptor = "I")
	private int anInt129;

	@OriginalMember(owner = "client!af", name = "t", descriptor = "I")
	private int anInt126;

	@OriginalMember(owner = "client!af", name = "j", descriptor = "I")
	private int anInt119;

	@OriginalMember(owner = "client!af", name = "w", descriptor = "Z")
	private boolean aBoolean11;

	@OriginalMember(owner = "client!af", name = "f", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!af", name = "u", descriptor = "I")
	private int anInt127;

	@OriginalMember(owner = "client!af", name = "q", descriptor = "I")
	private int anInt124;

	@OriginalMember(owner = "client!af", name = "h", descriptor = "I")
	private int anInt118;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt129 = arg2;
		this.anInt126 = arg3;
		this.anInt119 = arg4;
		this.aBoolean11 = arg7;
		this.anInt116 = arg1;
		this.anInt127 = arg6;
		this.anInt124 = arg5;
		this.anInt118 = arg0;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method90(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static6.aByteArray1[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIII)V")
	public void method92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt122 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt120 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt123) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt123) / 2;
		if (local42 >= arg3 || local42 + this.anInt123 <= 0 || local51 >= arg2 || local51 + this.anInt123 <= 0) {
			return;
		}
		if (this.anInt118 == 0) {
			Static283.anInterface1_1.method2424(this.anInt116, this.anInt121);
		} else if (this.anInt114 == -1) {
			return;
		} else {
			Static251.method3892(this.anInt114);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt123;
		@Pc(105) int local105 = local27 + this.anInt123;
		@Pc(107) GL local107 = Static251.aGL1;
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

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!af;)Z")
	private boolean method93(@OriginalArg(0) Class6 arg0) {
		@Pc(5) Class13_Sub7 local5 = Static271.method4293(Static119.aClass22_40, this.anInt116);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static251.aGL1;
		Static87.method1453(Static6.anIntArray4);
		Static87.method1462();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local25 = -arg0.anInt129;
				local27 = -arg0.anInt126;
				local29 = -arg0.anInt119;
			} else {
				local25 = this.anInt129 - arg0.anInt129;
				local27 = this.anInt126 - arg0.anInt126;
				local29 = this.anInt119 - arg0.anInt119;
			}
		}
		local5.method4295();
		@Pc(78) Class13_Sub1 local78 = local5.method4270(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method2737() - local78.method2741()) / 2;
		@Pc(94) int local94 = (local78.method2739() - local78.method4266()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static196.method3188((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt121, this.anInt121);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt122 != 0) {
			local126 = Class174.anIntArray444[this.anInt122];
			local131 = Class174.anIntArray443[this.anInt122];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt120 != 0) {
			local126 = this.anInt120 - 1024 & 0x7FF;
			local131 = Class174.anIntArray444[local126];
			local143 = Class174.anIntArray443[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static290.method4526((float) -local25, (float) local27, (float) -local29);
		Static290.method4524(16777215, 0.5F, 0.5F, 0.5F);
		Static290.method4518();
		Static251.method3878();
		Static251.method3868(true);
		Static251.method3854(true);
		local78.method2743(0, 0, 0, -local86 - local78.method2741(), -local94 - local78.method4266(), 0, -1L);
		Static251.method3854(false);
		Static251.method3868(false);
		Static251.method3856();
		Static196.method3190();
		Static251.method3892(this.anInt114);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt121, this.anInt121, 0);
		Static87.method1460(Static6.anIntArray4);
		return true;
	}

	@OriginalMember(owner = "client!af", name = "b", descriptor = "(Lclient!af;)Z")
	private boolean method94(@OriginalArg(0) Class6 arg0) {
		if (this.aClass4_Sub2_Sub4_Sub2_3 == null) {
			if (this.anInt118 == 0) {
				this.aClass4_Sub2_Sub4_Sub2_3 = Static283.anInterface1_1.method2428(true, this.anInt121, Static283.aFloat160, this.anInt116);
			} else if (this.anInt118 == 2) {
				this.method98(arg0);
			} else if (this.anInt118 == 1) {
				this.method97(arg0);
			}
		}
		return this.aClass4_Sub2_Sub4_Sub2_3 != null;
	}

	@OriginalMember(owner = "client!af", name = "c", descriptor = "(Lclient!af;)V")
	private void method96(@OriginalArg(0) Class6 arg0) {
		Static6.method95();
		Static6.method105();
		@Pc(3) GL local3 = Static251.aGL1;
		Static87.method1453(Static6.anIntArray4);
		Static87.method1462();
		local3.glClearColor((float) (this.anInt127 >> 16 & 0xFF) / 255.0F, (float) (this.anInt127 >> 8 & 0xFF) / 255.0F, (float) (this.anInt127 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local39 = -arg0.anInt129;
				local41 = -arg0.anInt126;
				local43 = -arg0.anInt119;
			} else {
				local39 = this.anInt129 - arg0.anInt129;
				local41 = this.anInt126 - arg0.anInt126;
				local43 = this.anInt119 - arg0.anInt119;
			}
		}
		Static196.method3192(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt121, this.anInt121);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt122 != 0) {
			local96 = Class174.anIntArray444[this.anInt122];
			local101 = Class174.anIntArray443[this.anInt122];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt120 != 0) {
			local96 = this.anInt120 - 1024 & 0x7FF;
			local101 = Class174.anIntArray444[local96];
			local113 = Class174.anIntArray443[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static290.method4526((float) -local39, (float) -local41, (float) local43);
		Static290.method4524(16777215, 0.5F, 0.5F, 1.0F);
		Static290.method4518();
		if (this.anInt127 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static283.anInterface1_1.method2424(this.anInt116, this.anInt121);
		Static251.method3854(true);
		if (Static251.aBoolean327) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static6.aByteBuffer1.position(0));
		local3.glVertexPointer(2, 5126, 20, Static6.aByteBuffer1.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static6.aByteBuffer1.position(12));
		local3.glDrawElements(5, Static6.aByteBuffer2.limit() / 2, 5123, Static6.aByteBuffer2.position(0));
		local3.glEnableClientState(32886);
		Static251.method3854(false);
		if (this.anInt127 != 0) {
			Static126.method2046(0, 0);
			Static251.method3870(1);
			Static251.method3851(0);
			Static251.method3892(Static6.anInt125);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt127 >> 16), (byte) (this.anInt127 >> 8), (byte) this.anInt127, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt127 >> 16), (byte) (this.anInt127 >> 8), (byte) this.anInt127, (byte) -1);
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
		Static196.method3190();
		Static251.method3892(this.anInt114);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt121, this.anInt121, 0);
		Static87.method1460(Static6.anIntArray4);
	}

	@OriginalMember(owner = "client!af", name = "d", descriptor = "(Lclient!af;)V")
	private void method97(@OriginalArg(0) Class6 arg0) {
		Static6.method100();
		Static6.method91();
		this.aClass4_Sub2_Sub4_Sub2_3 = new Class4_Sub2_Sub4_Sub2_Sub1(this.anInt121, this.anInt121);
		Static258.method4019(Static6.anIntArray4);
		this.aClass4_Sub2_Sub4_Sub2_3.method4151();
		Static283.method4415();
		Static258.method4031(0, 0, this.anInt121, this.anInt121, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local26 = -arg0.anInt129;
				local28 = -arg0.anInt126;
				local30 = -arg0.anInt119;
			} else {
				local26 = this.anInt129 - arg0.anInt129;
				local28 = this.anInt126 - arg0.anInt126;
				local30 = this.anInt119 - arg0.anInt119;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt122 != 0) {
			local74 = Class174.anIntArray444[this.anInt122];
			local79 = Class174.anIntArray443[this.anInt122];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt120 != 0) {
			local74 = this.anInt120 - 1024 & 0x7FF;
			local79 = Class174.anIntArray444[local74];
			local91 = Class174.anIntArray443[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static317.method3203(Static6.aClass13_Sub7_1.aShortArray91, 0, Static6.aClass13_Sub7_1.anInt5390, (short) Static283.anInterface1_1.method2431(this.anInt116));
		@Pc(172) Class13_Sub1_Sub1 local172 = Static6.aClass13_Sub7_1.method4289(64, 512, -local26, -local28, -local30);
		local79 = local172.method2737() - local172.method2741();
		local91 = local172.method2739() - local172.method4266();
		if (local79 > local91) {
			local135 = this.anInt127 == 0 ? (local79 << 9) / this.anInt121 : (local79 * 16 << 9) / (this.anInt121 * 13);
			local172.method405(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt127 == 0 ? (local91 << 9) / this.anInt121 : (local91 * 16 << 9) / (this.anInt121 * 13);
			local172.method405(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt127 == 0) {
			for (local135 = 0; local135 < Static258.anIntArray399.length; local135++) {
				if (Static258.anIntArray399[local135] != 0) {
					Static258.anIntArray399[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method104();
			this.method103();
		}
		Static147.aClass42_1.method3934();
		Static258.method4015(Static6.anIntArray4);
		Static283.method4415();
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "(Lclient!af;)V")
	private void method98(@OriginalArg(0) Class6 arg0) {
		@Pc(5) Class13_Sub7 local5 = Static271.method4293(Static119.aClass22_40, this.anInt116);
		if (local5 == null) {
			return;
		}
		this.aClass4_Sub2_Sub4_Sub2_3 = new Class4_Sub2_Sub4_Sub2(this.anInt121, this.anInt121);
		Static258.method4019(Static6.anIntArray4);
		this.aClass4_Sub2_Sub4_Sub2_3.method4151();
		Static283.method4415();
		Static258.method4031(0, 0, this.anInt121, this.anInt121, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean11) {
				local33 = -arg0.anInt129;
				local35 = -arg0.anInt126;
				local37 = -arg0.anInt119;
			} else {
				local33 = this.anInt129 - arg0.anInt129;
				local35 = this.anInt126 - arg0.anInt126;
				local37 = this.anInt119 - arg0.anInt119;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt122 != 0) {
			local81 = Class174.anIntArray444[this.anInt122];
			local86 = Class174.anIntArray443[this.anInt122];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt120 != 0) {
			local81 = this.anInt120 - 1024 & 0x7FF;
			local86 = Class174.anIntArray444[local81];
			local98 = Class174.anIntArray443[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class13_Sub1_Sub1 local167 = local5.method4289(64, 768, -local33, -local35, -local37);
		local86 = local167.method2737() - local167.method2741();
		local98 = local167.method2739() - local167.method4266();
		local142 = local167.method2741() + local86 / 2;
		@Pc(193) int local193 = local167.method4266() + local98 / 2;
		if (local86 > local98) {
			local167.method405(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt121);
		} else {
			local167.method405(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt121);
		}
		Static147.aClass42_1.method3934();
		Static258.method4015(Static6.anIntArray4);
		Static283.method4415();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIIIILclient!af;)V")
	public void method99(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6) {
		@Pc(6) int local6 = this.anInt122 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt120 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt123) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt123) / 2;
		if (local42 < arg3 && local42 + this.anInt123 > 0 && local51 < arg2 && local51 + this.anInt123 > 0 && this.method94(arg6)) {
			this.aClass4_Sub2_Sub4_Sub2_3.method4136(local51 + arg0, local42 + arg1, this.anInt123, this.anInt123);
		}
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "(Lclient!af;)V")
	public void method102(@OriginalArg(0) Class6 arg0) {
		if (this.anInt118 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt114 == -1 || this.anInt115 != Static239.anInt4726;
		if (!this.aBoolean10 && !local14) {
			return;
		}
		if (local14) {
			this.anInt115 = Static239.anInt4726;
			this.anInt114 = Static206.method3282(Static206.anInt4056, this.anInt121, this.anInt121);
		} else {
			Static251.method3892(this.anInt114);
			Static206.method3280(Static206.anInt4056, this.anInt121, this.anInt121);
		}
		if (this.anInt118 == 1) {
			this.method96(arg0);
			this.aBoolean10 = false;
		} else if (this.anInt118 == 2) {
			this.aBoolean10 = !this.method93(arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "e", descriptor = "()V")
	private void method103() {
		@Pc(2) int local2 = this.anInt121;
		@Pc(5) int local5 = this.anInt121;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static258.anInt5069 - local2;
		if (local5 > Static258.anInt5068) {
			local5 -= local5 - Static258.anInt5068;
		}
		@Pc(37) int local37;
		if (Static258.anInt5065 > 0) {
			local37 = Static258.anInt5065;
			local5 -= local37;
			local19 = local37 * Static258.anInt5069;
			local17 = local13 * local37;
		}
		if (local2 > Static258.anInt5066) {
			local37 = local2 - Static258.anInt5066;
			local2 -= local37;
			local23 += local37;
		}
		if (Static258.anInt5067 > 0) {
			local37 = Static258.anInt5067;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method109(Static258.anIntArray399, this.anInt127, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!af", name = "f", descriptor = "()V")
	private void method104() {
		@Pc(6) int local6 = this.anInt121 * 3 / 32;
		@Pc(15) int local15 = this.anInt121 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static258.anInt5069;
		@Pc(35) int local35 = Static258.anInt5069 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static258.anInt5068) {
			local17 = local15 + Static258.anInt5068 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static258.anInt5065) {
			local59 = Static258.anInt5065 - local6;
			local17 -= local59;
			local31 += local59 * Static258.anInt5069;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static258.anInt5066) {
			local59 = local6 + local15 - Static258.anInt5066;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static258.anInt5067) {
			local59 = Static258.anInt5067 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method90(Static258.anIntArray399, this.anInt127, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIII)Z")
	public boolean method107(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean11) {
			this.anInt128 = 1073741823;
			local7 = this.anInt129;
			local12 = this.anInt126;
			local17 = this.anInt119;
		} else {
			local7 = this.anInt129 - arg0;
			local12 = this.anInt126 - arg1;
			local17 = this.anInt119 - arg2;
			this.anInt128 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt128 == 0) {
				this.anInt128 = 1;
			}
			local7 = (local7 << 8) / this.anInt128;
			local12 = (local12 << 8) / this.anInt128;
			local17 = (local17 << 8) / this.anInt128;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt123 = this.anInt124 * arg3 / (this.aBoolean11 ? 1024 : this.anInt128);
		} else {
			this.anInt123 = 0;
		}
		if (this.anInt123 < 8) {
			this.method108();
			this.aClass4_Sub2_Sub4_Sub2_3 = null;
			return false;
		}
		@Pc(145) int local145 = Static70.method1196(this.anInt123);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt121) {
			this.anInt121 = local145;
		}
		this.anInt122 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt120 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean10 = true;
		this.aClass4_Sub2_Sub4_Sub2_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method108();
		super.finalize();
	}

	@OriginalMember(owner = "client!af", name = "i", descriptor = "()V")
	private void method108() {
		if (this.anInt114 != -1) {
			Static239.method3679(this.anInt114, 0, this.anInt115);
		}
		this.aBoolean10 = true;
		this.anInt114 = -1;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method109(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static6.aByteArray1[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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
}
