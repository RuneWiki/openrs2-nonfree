import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class129 {

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "Lclient!af;")
	private Class2_Sub3_Sub1_Sub1 aClass2_Sub3_Sub1_Sub1_3;

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "I")
	private int anInt3995;

	@OriginalMember(owner = "client!ok", name = "h", descriptor = "I")
	private int anInt3997;

	@OriginalMember(owner = "client!ok", name = "j", descriptor = "I")
	private int anInt3999;

	@OriginalMember(owner = "client!ok", name = "n", descriptor = "I")
	private int anInt4002;

	@OriginalMember(owner = "client!ok", name = "t", descriptor = "I")
	public int anInt4006;

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "I")
	private int anInt3998 = -1;

	@OriginalMember(owner = "client!ok", name = "r", descriptor = "I")
	private int anInt4005 = -1;

	@OriginalMember(owner = "client!ok", name = "s", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!ok", name = "l", descriptor = "I")
	private int anInt4001;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	private int anInt3993;

	@OriginalMember(owner = "client!ok", name = "k", descriptor = "I")
	private int anInt4000;

	@OriginalMember(owner = "client!ok", name = "m", descriptor = "Z")
	private boolean aBoolean336;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
	private int anInt3994;

	@OriginalMember(owner = "client!ok", name = "o", descriptor = "I")
	private int anInt4003;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
	private int anInt3992;

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "I")
	private int anInt3996;

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4001 = arg2;
		this.anInt3993 = arg3;
		this.anInt4000 = arg4;
		this.aBoolean336 = arg7;
		this.anInt3994 = arg1;
		this.anInt4003 = arg6;
		this.anInt3992 = arg5;
		this.anInt3996 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ok;)V")
	private void method3220(@OriginalArg(0) Class129 arg0) {
		@Pc(5) Class36_Sub6 local5 = Static252.method4038(Static204.aClass84_87, this.anInt3994);
		if (local5 == null) {
			return;
		}
		this.aClass2_Sub3_Sub1_Sub1_3 = new Class2_Sub3_Sub1_Sub1(this.anInt3997, this.anInt3997);
		Static160.method2775(Static193.anIntArray326);
		this.aClass2_Sub3_Sub1_Sub1_3.method4389();
		Static93.method1725();
		Static160.method2788(0, 0, this.anInt3997, this.anInt3997, 0);
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 0;
		@Pc(37) int local37 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean336) {
				local33 = -arg0.anInt4001;
				local35 = -arg0.anInt3993;
				local37 = -arg0.anInt4000;
			} else {
				local33 = this.anInt4001 - arg0.anInt4001;
				local35 = this.anInt3993 - arg0.anInt3993;
				local37 = this.anInt4000 - arg0.anInt4000;
			}
		}
		@Pc(81) int local81;
		@Pc(86) int local86;
		@Pc(98) int local98;
		if (this.anInt3999 != 0) {
			local81 = Class66.anIntArray148[this.anInt3999];
			local86 = Class66.anIntArray153[this.anInt3999];
			local98 = local35 * local86 + 32767 - local37 * local81 >> 16;
			local37 = local35 * local81 + local37 * local86 + 32767 >> 16;
			local35 = local98;
		}
		@Pc(142) int local142;
		if (this.anInt3995 != 0) {
			local81 = this.anInt3995 - 1024 & 0x7FF;
			local86 = Class66.anIntArray148[local81];
			local98 = Class66.anIntArray153[local81];
			local142 = local37 * local86 + local33 * local98 + 32767 >> 16;
			local37 = local37 * local98 + 32767 - local33 * local86 >> 16;
			local33 = local142;
		}
		@Pc(167) Class36_Sub2_Sub2 local167 = local5.method4051(64, 768, -local33, -local35, -local37);
		local86 = local167.method3841() - local167.method3847();
		local98 = local167.method3850() - local167.method4881();
		local142 = local167.method3847() + local86 / 2;
		@Pc(193) int local193 = local167.method4881() + local98 / 2;
		if (local86 > local98) {
			local167.method3867(0, 0, 0, -local142, -local193, 0, (local86 << 9) / this.anInt3997);
		} else {
			local167.method3867(0, 0, 0, -local142, -local193, 0, (local98 << 9) / this.anInt3997);
		}
		Static170.aClass14_1.method1192();
		Static160.method2790(Static193.anIntArray326);
		Static93.method1725();
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(Lclient!ok;)V")
	public void method3221(@OriginalArg(0) Class129 arg0) {
		if (this.anInt3996 == 0) {
			return;
		}
		@Pc(14) boolean local14 = this.anInt4005 == -1 || this.anInt3998 != Static256.anInt5185;
		if (!this.aBoolean337 && !local14) {
			return;
		}
		if (local14) {
			this.anInt3998 = Static256.anInt5185;
			this.anInt4005 = Static48.method983(Static48.anInt1121, this.anInt3997, this.anInt3997);
		} else {
			Static60.method1157(this.anInt4005);
			Static48.method975(Static48.anInt1121, this.anInt3997, this.anInt3997);
		}
		if (this.anInt3996 == 1) {
			this.method3225(arg0);
			this.aBoolean337 = false;
		} else if (this.anInt3996 == 2) {
			this.aBoolean337 = !this.method3223(arg0);
		}
	}

	@OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.method3237();
		super.finalize();
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(Lclient!ok;)V")
	private void method3222(@OriginalArg(0) Class129 arg0) {
		Static193.method3218();
		Static193.method3224();
		this.aClass2_Sub3_Sub1_Sub1_3 = new Class2_Sub3_Sub1_Sub1_Sub1(this.anInt3997, this.anInt3997);
		Static160.method2775(Static193.anIntArray326);
		this.aClass2_Sub3_Sub1_Sub1_3.method4389();
		Static93.method1725();
		Static160.method2788(0, 0, this.anInt3997, this.anInt3997, 0);
		@Pc(26) int local26 = 0;
		@Pc(28) int local28 = 0;
		@Pc(30) int local30 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean336) {
				local26 = -arg0.anInt4001;
				local28 = -arg0.anInt3993;
				local30 = -arg0.anInt4000;
			} else {
				local26 = this.anInt4001 - arg0.anInt4001;
				local28 = this.anInt3993 - arg0.anInt3993;
				local30 = this.anInt4000 - arg0.anInt4000;
			}
		}
		@Pc(74) int local74;
		@Pc(79) int local79;
		@Pc(91) int local91;
		if (this.anInt3999 != 0) {
			local74 = Class66.anIntArray148[this.anInt3999];
			local79 = Class66.anIntArray153[this.anInt3999];
			local91 = local28 * local79 + 32767 - local30 * local74 >> 16;
			local30 = local28 * local74 + local30 * local79 + 32767 >> 16;
			local28 = local91;
		}
		@Pc(135) int local135;
		if (this.anInt3995 != 0) {
			local74 = this.anInt3995 - 1024 & 0x7FF;
			local79 = Class66.anIntArray148[local74];
			local91 = Class66.anIntArray153[local74];
			local135 = local30 * local79 + local26 * local91 + 32767 >> 16;
			local30 = local30 * local91 + 32767 - local26 * local79 >> 16;
			local26 = local135;
		}
		Static301.method297(Static193.aClass36_Sub6_1.aShortArray81, 0, Static193.aClass36_Sub6_1.anInt5033, (short) Static93.anInterface5_1.method3521(this.anInt3994));
		@Pc(172) Class36_Sub2_Sub2 local172 = Static193.aClass36_Sub6_1.method4051(64, 512, -local26, -local28, -local30);
		local79 = local172.method3841() - local172.method3847();
		local91 = local172.method3850() - local172.method4881();
		if (local79 > local91) {
			local135 = this.anInt4003 == 0 ? (local79 << 9) / this.anInt3997 : (local79 * 16 << 9) / (this.anInt3997 * 13);
			local172.method3867(0, 0, 0, 0, 0, 0, local135);
		} else {
			local135 = this.anInt4003 == 0 ? (local91 << 9) / this.anInt3997 : (local91 * 16 << 9) / (this.anInt3997 * 13);
			local172.method3867(0, 0, 0, 0, 0, 0, local135);
		}
		if (this.anInt4003 == 0) {
			for (local135 = 0; local135 < Static160.anIntArray254.length; local135++) {
				if (Static160.anIntArray254[local135] != 0) {
					Static160.anIntArray254[local135] |= 0xFF000000;
				}
			}
		} else {
			this.method3230();
			this.method3228();
		}
		Static170.aClass14_1.method1192();
		Static160.method2790(Static193.anIntArray326);
		Static93.method1725();
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(Lclient!ok;)Z")
	private boolean method3223(@OriginalArg(0) Class129 arg0) {
		@Pc(5) Class36_Sub6 local5 = Static252.method4038(Static204.aClass84_87, this.anInt3994);
		if (local5 == null) {
			return false;
		}
		@Pc(11) GL local11 = Static60.aGL1;
		Static94.method1760(Static193.anIntArray326);
		Static94.method1750();
		local11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
		local11.glClear(16640);
		@Pc(25) int local25 = 0;
		@Pc(27) int local27 = 0;
		@Pc(29) int local29 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean336) {
				local25 = -arg0.anInt4001;
				local27 = -arg0.anInt3993;
				local29 = -arg0.anInt4000;
			} else {
				local25 = this.anInt4001 - arg0.anInt4001;
				local27 = this.anInt3993 - arg0.anInt3993;
				local29 = this.anInt4000 - arg0.anInt4000;
			}
		}
		local5.method4047();
		@Pc(78) Class36_Sub2 local78 = local5.method4049(64, 768, -local25, -local27, -local29);
		@Pc(86) int local86 = (local78.method3841() - local78.method3847()) / 2;
		@Pc(94) int local94 = (local78.method3850() - local78.method4881()) / 2;
		@Pc(101) int local101 = local86 > local94 ? local86 : local94;
		Static147.method2587((float) -local101, (float) local101, (float) -local101, (float) local101, 2048.0F, -2048.0F, this.anInt3997, this.anInt3997);
		@Pc(126) int local126;
		@Pc(131) int local131;
		@Pc(143) int local143;
		if (this.anInt3999 != 0) {
			local126 = Class66.anIntArray148[this.anInt3999];
			local131 = Class66.anIntArray153[this.anInt3999];
			local143 = local27 * local131 + 32767 - local29 * local126 >> 16;
			local29 = local27 * local126 + local29 * local131 + 32767 >> 16;
			local27 = local143;
		}
		if (this.anInt3995 != 0) {
			local126 = this.anInt3995 - 1024 & 0x7FF;
			local131 = Class66.anIntArray148[local126];
			local143 = Class66.anIntArray153[local126];
			@Pc(187) int local187 = local29 * local131 + local25 * local143 + 32767 >> 16;
			local29 = local29 * local143 + 32767 - local25 * local131 >> 16;
			local25 = local187;
		}
		Static117.method2157((float) -local25, (float) local27, (float) -local29);
		Static117.method2159(16777215, 0.5F, 0.5F, 0.5F);
		Static117.method2154();
		Static60.method1145();
		Static60.method1178(true);
		Static60.method1164(true);
		local78.method3846(0, 0, 0, -local86 - local78.method3847(), -local94 - local78.method4881(), 0, -1L);
		Static60.method1164(false);
		Static60.method1178(false);
		Static60.method1158();
		Static147.method2588();
		Static60.method1157(this.anInt4005);
		local11.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3997, this.anInt3997, 0);
		Static94.method1748(Static193.anIntArray326);
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "(Lclient!ok;)V")
	private void method3225(@OriginalArg(0) Class129 arg0) {
		Static193.method3219();
		Static193.method3227();
		@Pc(3) GL local3 = Static60.aGL1;
		Static94.method1760(Static193.anIntArray326);
		Static94.method1750();
		local3.glClearColor((float) (this.anInt4003 >> 16 & 0xFF) / 255.0F, (float) (this.anInt4003 >> 8 & 0xFF) / 255.0F, (float) (this.anInt4003 & 0xFF) / 255.0F, 0.0F);
		local3.glClear(16640);
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(43) int local43 = 256;
		if (arg0 != null) {
			if (arg0.aBoolean336) {
				local39 = -arg0.anInt4001;
				local41 = -arg0.anInt3993;
				local43 = -arg0.anInt4000;
			} else {
				local39 = this.anInt4001 - arg0.anInt4001;
				local41 = this.anInt3993 - arg0.anInt3993;
				local43 = this.anInt4000 - arg0.anInt4000;
			}
		}
		Static147.method2589(-1.0F, 1.0F, -1.0F, 1.0F, this.anInt3997, this.anInt3997);
		@Pc(96) int local96;
		@Pc(101) int local101;
		@Pc(113) int local113;
		if (this.anInt3999 != 0) {
			local96 = Class66.anIntArray148[this.anInt3999];
			local101 = Class66.anIntArray153[this.anInt3999];
			local113 = local41 * local101 + 32767 - local43 * local96 >> 16;
			local43 = local41 * local96 + local43 * local101 + 32767 >> 16;
			local41 = local113;
		}
		if (this.anInt3995 != 0) {
			local96 = this.anInt3995 - 1024 & 0x7FF;
			local101 = Class66.anIntArray148[local96];
			local113 = Class66.anIntArray153[local96];
			@Pc(157) int local157 = local43 * local101 + local39 * local113 + 32767 >> 16;
			local43 = local43 * local113 + 32767 - local39 * local101 >> 16;
			local39 = local157;
		}
		Static117.method2157((float) -local39, (float) -local41, (float) local43);
		Static117.method2159(16777215, 0.5F, 0.5F, 1.0F);
		Static117.method2154();
		if (this.anInt4003 != 0) {
			local3.glScalef(0.8125F, 0.8125F, 1.0F);
		}
		Static93.anInterface5_1.method3522(this.anInt3994, this.anInt3997);
		Static60.method1164(true);
		if (Static60.aBoolean110) {
			local3.glBindBufferARB(34962, 0);
			local3.glBindBufferARB(34963, 0);
		}
		local3.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		local3.glDisableClientState(32886);
		local3.glNormalPointer(5126, 20, Static193.aByteBuffer12.position(0));
		local3.glVertexPointer(2, 5126, 20, Static193.aByteBuffer12.position(0));
		local3.glTexCoordPointer(2, 5126, 20, Static193.aByteBuffer12.position(12));
		local3.glDrawElements(5, Static193.aByteBuffer11.limit() / 2, 5123, Static193.aByteBuffer11.position(0));
		local3.glEnableClientState(32886);
		Static60.method1164(false);
		if (this.anInt4003 != 0) {
			Static4.method119(0, 0);
			Static60.method1139(1);
			Static60.method1168(0);
			Static60.method1157(Static193.anInt4007);
			local3.glColorMask(true, true, true, false);
			local3.glTexEnvi(8960, 34176, 34168);
			local3.glTexEnvi(8960, 34200, 771);
			local3.glBegin(7);
			local3.glColor4ub((byte) (this.anInt4003 >> 16), (byte) (this.anInt4003 >> 8), (byte) this.anInt4003, (byte) 127);
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
			local3.glColor4ub((byte) (this.anInt4003 >> 16), (byte) (this.anInt4003 >> 8), (byte) this.anInt4003, (byte) -1);
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
		Static147.method2588();
		Static60.method1157(this.anInt4005);
		local3.glCopyTexImage2D(3553, 0, 6408, 0, 0, this.anInt3997, this.anInt3997, 0);
		Static94.method1748(Static193.anIntArray326);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "()V")
	private void method3228() {
		@Pc(2) int local2 = this.anInt3997;
		@Pc(5) int local5 = this.anInt3997;
		@Pc(9) int local9 = 8388608 / local2;
		@Pc(13) int local13 = 8388608 / local5;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(23) int local23 = Static160.anInt3390 - local2;
		if (local5 > Static160.anInt3392) {
			local5 -= local5 - Static160.anInt3392;
		}
		@Pc(37) int local37;
		if (Static160.anInt3391 > 0) {
			local37 = Static160.anInt3391;
			local5 -= local37;
			local19 = local37 * Static160.anInt3390;
			local17 = local13 * local37;
		}
		if (local2 > Static160.anInt3387) {
			local37 = local2 - Static160.anInt3387;
			local2 -= local37;
			local23 += local37;
		}
		if (Static160.anInt3389 > 0) {
			local37 = Static160.anInt3389;
			local2 -= local37;
			local19 += local37;
			local15 = local9 * local37;
			local23 += local37;
		}
		this.method3234(Static160.anIntArray254, this.anInt4003, local15, local17, local19, local23, local2, local5, local9, local13);
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIIILclient!ok;)V")
	public void method3229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class129 arg6) {
		@Pc(6) int local6 = this.anInt3999 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3995 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4002) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4002) / 2;
		if (local42 < arg3 && local42 + this.anInt4002 > 0 && local51 < arg2 && local51 + this.anInt4002 > 0 && this.method3231(arg6)) {
			this.aClass2_Sub3_Sub1_Sub1_3.method4363(local51 + arg0, local42 + arg1, this.anInt4002, this.anInt4002);
		}
	}

	@OriginalMember(owner = "client!ok", name = "g", descriptor = "()V")
	private void method3230() {
		@Pc(6) int local6 = this.anInt3997 * 3 / 32;
		@Pc(15) int local15 = this.anInt3997 * 13 / 16;
		@Pc(17) int local17 = local15;
		@Pc(21) int local21 = 8388608 / local15;
		@Pc(25) int local25 = 8388608 / local15;
		@Pc(31) int local31 = local6 + local6 * Static160.anInt3390;
		@Pc(35) int local35 = Static160.anInt3390 - local15;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		if (local6 + local15 > Static160.anInt3392) {
			local17 = local15 + Static160.anInt3392 - local6 - local15;
		}
		@Pc(59) int local59;
		if (local6 < Static160.anInt3391) {
			local59 = Static160.anInt3391 - local6;
			local17 -= local59;
			local31 += local59 * Static160.anInt3390;
			local39 = local25 * local59;
		}
		if (local6 + local15 > Static160.anInt3387) {
			local59 = local6 + local15 - Static160.anInt3387;
			local15 -= local59;
			local35 += local59;
		}
		if (local6 < Static160.anInt3389) {
			local59 = Static160.anInt3389 - local6;
			local15 -= local59;
			local31 += local59;
			local37 = local21 * local59;
			local35 += local59;
		}
		this.method3235(Static160.anIntArray254, this.anInt4003, local37, local39, local31, local35, local15, local17, local21, local25);
	}

	@OriginalMember(owner = "client!ok", name = "f", descriptor = "(Lclient!ok;)Z")
	private boolean method3231(@OriginalArg(0) Class129 arg0) {
		if (this.aClass2_Sub3_Sub1_Sub1_3 == null) {
			if (this.anInt3996 == 0) {
				this.aClass2_Sub3_Sub1_Sub1_3 = Static93.anInterface5_1.method3525(Static93.aFloat23, true, this.anInt3997, this.anInt3994);
			} else if (this.anInt3996 == 2) {
				this.method3220(arg0);
			} else if (this.anInt3996 == 1) {
				this.method3222(arg0);
			}
		}
		return this.aClass2_Sub3_Sub1_Sub1_3 != null;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII)V")
	public void method3233(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(6) int local6 = this.anInt3999 - arg4 & 0x7FF;
		@Pc(13) int local13 = this.anInt3995 - arg5 & 0x7FF;
		if (local13 > 1024) {
			local13 -= 2048;
		}
		if (local6 > 1024) {
			local6 -= 2048;
		}
		@Pc(27) int local27 = local6 * arg3 / 512;
		@Pc(33) int local33 = local13 * arg3 / -512;
		@Pc(42) int local42 = local27 + (arg3 - this.anInt4002) / 2;
		@Pc(51) int local51 = local33 + (arg2 - this.anInt4002) / 2;
		if (local42 >= arg3 || local42 + this.anInt4002 <= 0 || local51 >= arg2 || local51 + this.anInt4002 <= 0) {
			return;
		}
		if (this.anInt3996 == 0) {
			Static93.anInterface5_1.method3522(this.anInt3994, this.anInt3997);
		} else if (this.anInt4005 == -1) {
			return;
		} else {
			Static60.method1157(this.anInt4005);
		}
		local27 = local42 + arg1;
		local33 = local51 + arg0;
		@Pc(100) int local100 = local33 + this.anInt4002;
		@Pc(105) int local105 = local27 + this.anInt4002;
		@Pc(107) GL local107 = Static60.aGL1;
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

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIIIIIIIII)V")
	private void method3234(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] == 0) {
					arg0[arg4] = (Static193.aByteArray35[(arg2 >> 16) + local12] & 0xFF) << 24 | arg1;
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

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "([IIIIIIIIIIII)V")
	private void method3235(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(1) int local1 = arg2;
		for (@Pc(4) int local4 = -arg7; local4 < 0; local4++) {
			@Pc(12) int local12 = (arg3 >> 16) * 128;
			for (@Pc(15) int local15 = -arg6; local15 < 0; local15++) {
				if (arg0[arg4] != 0) {
					@Pc(25) int local25 = arg0[arg4];
					@Pc(37) int local37 = (Static193.aByteArray35[(arg2 >> 16) + local12] & 0xFF) + 64;
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

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)Z")
	public boolean method3236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean336) {
			this.anInt4006 = 1073741823;
			local7 = this.anInt4001;
			local12 = this.anInt3993;
			local17 = this.anInt4000;
		} else {
			local7 = this.anInt4001 - arg0;
			local12 = this.anInt3993 - arg1;
			local17 = this.anInt4000 - arg2;
			this.anInt4006 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt4006 == 0) {
				this.anInt4006 = 1;
			}
			local7 = (local7 << 8) / this.anInt4006;
			local12 = (local12 << 8) / this.anInt4006;
			local17 = (local17 << 8) / this.anInt4006;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt4002 = this.anInt3992 * arg3 / (this.aBoolean336 ? 1024 : this.anInt4006);
		} else {
			this.anInt4002 = 0;
		}
		if (this.anInt4002 < 8) {
			this.method3237();
			this.aClass2_Sub3_Sub1_Sub1_3 = null;
			return false;
		}
		@Pc(145) int local145 = Static186.method3169(this.anInt4002);
		if (local145 > 512) {
			local145 = 512;
		}
		if (local145 != this.anInt3997) {
			this.anInt3997 = local145;
		}
		this.anInt3999 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 325.9493103027344D) & 0x7FF;
		this.anInt3995 = (int) (Math.atan2((double) local7, (double) -local17) * 325.9493103027344D) & 0x7FF;
		this.aBoolean337 = true;
		this.aClass2_Sub3_Sub1_Sub1_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!ok", name = "i", descriptor = "()V")
	private void method3237() {
		if (this.anInt4005 != -1) {
			Static256.method4129(this.anInt4005, 0, this.anInt3998);
		}
		this.aBoolean337 = true;
		this.anInt4005 = -1;
	}
}
