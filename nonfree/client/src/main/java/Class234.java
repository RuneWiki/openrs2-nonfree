import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mja")
public final class Class234 {

	@OriginalMember(owner = "client!mja", name = "u", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!mja", name = "z", descriptor = "Lclient!mw;")
	private Class14_Sub3_Sub12 aClass14_Sub3_Sub12_1;

	@OriginalMember(owner = "client!mja", name = "B", descriptor = "Lclient!mw;")
	private Class14_Sub3_Sub12 aClass14_Sub3_Sub12_2;

	@OriginalMember(owner = "client!mja", name = "E", descriptor = "Lclient!km;")
	private Class66_Sub1 aClass66_Sub1_3;

	@OriginalMember(owner = "client!mja", name = "j", descriptor = "I")
	private int anInt6823 = 0;

	@OriginalMember(owner = "client!mja", name = "k", descriptor = "I")
	private int anInt6824 = 0;

	@OriginalMember(owner = "client!mja", name = "m", descriptor = "I")
	private int anInt6826 = 1;

	@OriginalMember(owner = "client!mja", name = "v", descriptor = "I")
	private int anInt6830 = 1;

	@OriginalMember(owner = "client!mja", name = "r", descriptor = "Lclient!ok;")
	private final Class262 aClass262_39 = new Class262();

	@OriginalMember(owner = "client!mja", name = "y", descriptor = "Z")
	private boolean aBoolean487 = true;

	@OriginalMember(owner = "client!mja", name = "A", descriptor = "[Lclient!km;")
	private Class66_Sub1[] aClass66_Sub1Array4 = new Class66_Sub1[2];

	@OriginalMember(owner = "client!mja", name = "D", descriptor = "Z")
	private boolean aBoolean489 = true;

	@OriginalMember(owner = "client!mja", name = "w", descriptor = "Z")
	private boolean aBoolean486 = true;

	@OriginalMember(owner = "client!mja", name = "x", descriptor = "I")
	private int anInt6831 = 0;

	@OriginalMember(owner = "client!mja", name = "F", descriptor = "Z")
	private boolean aBoolean490 = false;

	@OriginalMember(owner = "client!mja", name = "C", descriptor = "Z")
	private boolean aBoolean488 = true;

	@OriginalMember(owner = "client!mja", name = "G", descriptor = "I")
	private int anInt6832 = -1;

	@OriginalMember(owner = "client!mja", name = "s", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_23;

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "Lclient!gja;")
	private Class125 aClass125_4;

	@OriginalMember(owner = "client!mja", name = "o", descriptor = "Lclient!gja;")
	private Class125 aClass125_5;

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "Lclient!gja;")
	private Class125 aClass125_3;

	@OriginalMember(owner = "client!mja", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class234(@OriginalArg(0) Class137_Sub3 arg0) {
		this.aClass137_Sub3_23 = arg0;
		if (this.aClass137_Sub3_23.aBoolean608 && this.aClass137_Sub3_23.aBoolean596) {
			this.aClass125_5 = this.aClass125_4 = new Class125(this.aClass137_Sub3_23);
			if (this.aClass137_Sub3_23.anInt8543 > 1 && this.aClass137_Sub3_23.aBoolean586 && this.aClass137_Sub3_23.aBoolean602) {
				this.aClass125_5 = this.aClass125_3 = new Class125(this.aClass137_Sub3_23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Lclient!qca;I)V")
	public void method5532(@OriginalArg(0) Class14_Sub16 arg0) {
		arg0.aBoolean184 = false;
		arg0.method1887();
		arg0.method9315();
		this.method5536();
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(ILclient!qca;)Z")
	public boolean method5535(@OriginalArg(1) Class14_Sub16 arg0) {
		if (this.aClass125_5 != null) {
			if (arg0.method1884() || arg0.method1890()) {
				this.aClass262_39.method6314(arg0);
				this.method5536();
				if (this.method5539()) {
					if (this.anInt6830 != -1 && this.anInt6826 != -1) {
						arg0.method1881(this.anInt6826, this.anInt6830);
					}
					arg0.aBoolean184 = true;
					return true;
				}
			}
			this.method5532(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(B)V")
	private void method5536() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(19) int local19 = 0;
		@Pc(31) int local31;
		for (@Pc(25) Class14_Sub16 local25 = (Class14_Sub16) this.aClass262_39.method6318(); local25 != null; local25 = (Class14_Sub16) this.aClass262_39.method6311()) {
			local31 = local25.method1885();
			if (local31 > local9) {
				local9 = local31;
			}
			local19 += local25.method1889();
			local7 |= local25.method1891();
		}
		if (local9 == 2) {
			local31 = 34836;
		} else if (local9 == 1) {
			local31 = 34842;
		} else {
			local31 = 6408;
		}
		if (local31 != this.anInt6832) {
			this.aBoolean486 = true;
			this.anInt6832 = local31;
		}
		@Pc(95) int local95 = this.anInt6831 > 2 ? 2 : this.anInt6831;
		@Pc(104) int local104 = local19 <= 2 ? local19 : 2;
		if (local7 != this.aBoolean490) {
			this.aBoolean489 = true;
			this.aBoolean490 = local7;
		}
		this.anInt6831 = local19;
		if (local95 != local104) {
			this.aBoolean488 = this.aBoolean486 = true;
		}
	}

	@OriginalMember(owner = "client!mja", name = "b", descriptor = "(I)V")
	public void method5537() {
		this.aClass66_Sub1_3 = null;
		this.aClass66_Sub1Array4 = null;
		this.aClass14_Sub3_Sub12_1 = null;
		this.aClass125_5 = this.aClass125_3 = this.aClass125_4 = null;
		this.aClass14_Sub3_Sub12_2 = null;
		if (!this.aClass262_39.method6324()) {
			for (@Pc(36) Class14 local36 = this.aClass262_39.method6318(); local36 != this.aClass262_39.aClass14_230; local36 = local36.aClass14_338) {
				((Class14_Sub16) local36).method1887();
			}
		}
		this.anInt6830 = this.anInt6826 = 1;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(IIIII)Z")
	public boolean method5538(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass125_5 == null || this.aClass262_39.method6324()) {
			return false;
		}
		if (arg3 != this.anInt6830 || arg2 != this.anInt6826) {
			this.anInt6830 = arg3;
			this.anInt6826 = arg2;
			for (@Pc(50) Class14 local50 = this.aClass262_39.method6318(); local50 != this.aClass262_39.aClass14_230; local50 = local50.aClass14_338) {
				((Class14_Sub16) local50).method1881(this.anInt6826, this.anInt6830);
			}
			this.aBoolean488 = true;
			this.aBoolean489 = true;
			this.aBoolean486 = true;
		}
		if (!this.method5539()) {
			return false;
		}
		this.anInt6823 = arg0;
		this.anInt6824 = arg1;
		this.aBoolean485 = true;
		this.aClass137_Sub3_23.method7058(this.aClass125_5);
		this.aClass125_5.method2969(0);
		this.aClass137_Sub3_23.method7056(this.anInt6823 + this.anInt6826 - this.aClass137_Sub3_23.anInt8349, -this.anInt6824);
		return true;
	}

	@OriginalMember(owner = "client!mja", name = "c", descriptor = "(I)Z")
	private boolean method5539() {
		if (this.aBoolean489) {
			if (this.aClass14_Sub3_Sub12_2 != null) {
				this.aClass14_Sub3_Sub12_2.method5643();
				this.aClass14_Sub3_Sub12_2 = null;
			}
			if (this.aClass66_Sub1_3 != null) {
				this.aClass66_Sub1_3.method6846();
				this.aClass66_Sub1_3 = null;
			}
			if (this.aClass125_3 != null) {
				this.aClass14_Sub3_Sub12_2 = new Class14_Sub3_Sub12(this.aClass137_Sub3_23, 6402, this.anInt6830, this.anInt6826, this.aClass137_Sub3_23.anInt8543);
			}
			if (this.aBoolean490) {
				this.aClass66_Sub1_3 = new Class66_Sub1(this.aClass137_Sub3_23, 34037, 6402, this.anInt6830, this.anInt6826);
			} else if (this.aClass14_Sub3_Sub12_2 == null) {
				this.aClass14_Sub3_Sub12_2 = new Class14_Sub3_Sub12(this.aClass137_Sub3_23, 6402, this.anInt6830, this.anInt6826);
			}
			this.aBoolean487 = true;
			this.aBoolean488 = true;
			this.aBoolean489 = false;
		}
		if (this.aBoolean486) {
			if (this.aClass14_Sub3_Sub12_1 != null) {
				this.aClass14_Sub3_Sub12_1.method5643();
				this.aClass14_Sub3_Sub12_1 = null;
			}
			if (this.aClass66_Sub1Array4[0] != null) {
				this.aClass66_Sub1Array4[0].method6846();
				this.aClass66_Sub1Array4[0] = null;
			}
			if (this.aClass66_Sub1Array4[1] != null) {
				this.aClass66_Sub1Array4[1].method6846();
				this.aClass66_Sub1Array4[1] = null;
			}
			if (this.aClass125_3 != null) {
				this.aClass14_Sub3_Sub12_1 = new Class14_Sub3_Sub12(this.aClass137_Sub3_23, this.anInt6832, this.anInt6830, this.anInt6826, this.aClass137_Sub3_23.anInt8543);
			}
			this.aClass66_Sub1Array4[0] = new Class66_Sub1(this.aClass137_Sub3_23, 34037, this.anInt6832, this.anInt6830, this.anInt6826);
			this.aClass66_Sub1Array4[1] = this.anInt6831 > 1 ? new Class66_Sub1(this.aClass137_Sub3_23, 34037, this.anInt6832, this.anInt6830, this.anInt6826) : null;
			this.aBoolean487 = true;
			this.aBoolean486 = false;
			this.aBoolean488 = true;
		}
		if (this.aBoolean488) {
			if (this.aClass125_3 == null) {
				this.aClass137_Sub3_23.method7058(this.aClass125_4);
				this.aClass125_4.method2965(0);
				this.aClass125_4.method2965(1);
				this.aClass125_4.method2965(8);
				this.aClass125_4.method2973(this.aClass66_Sub1Array4[0], 0);
				if (this.anInt6831 > 1) {
					this.aClass125_4.method2973(this.aClass66_Sub1Array4[1], 1);
				}
				if (this.aBoolean490) {
					this.aClass125_4.method2973(this.aClass66_Sub1_3, 8);
				} else {
					this.aClass125_4.method2974(8, this.aClass14_Sub3_Sub12_2);
				}
				this.aClass137_Sub3_23.method7037(this.aClass125_4);
			} else {
				this.aClass137_Sub3_23.method7058(this.aClass125_4);
				this.aClass125_4.method2965(0);
				this.aClass125_4.method2965(1);
				this.aClass125_4.method2965(8);
				this.aClass125_4.method2973(this.aClass66_Sub1Array4[0], 0);
				if (this.anInt6831 > 1) {
					this.aClass125_4.method2973(this.aClass66_Sub1Array4[1], 1);
				}
				if (this.aBoolean490) {
					this.aClass125_4.method2973(this.aClass66_Sub1_3, 8);
				}
				this.aClass137_Sub3_23.method7037(this.aClass125_4);
				this.aClass137_Sub3_23.method7058(this.aClass125_3);
				this.aClass125_3.method2965(0);
				this.aClass125_3.method2965(8);
				this.aClass125_3.method2974(0, this.aClass14_Sub3_Sub12_1);
				this.aClass125_3.method2974(8, this.aClass14_Sub3_Sub12_2);
				this.aClass137_Sub3_23.method7037(this.aClass125_3);
			}
			this.aBoolean488 = false;
			this.aBoolean487 = true;
		}
		if (this.aBoolean487) {
			this.aClass137_Sub3_23.method7058(this.aClass125_5);
			this.aBoolean487 = !this.aClass125_5.method2968();
			this.aClass137_Sub3_23.method7037(this.aClass125_5);
		}
		return !this.aBoolean487;
	}

	@OriginalMember(owner = "client!mja", name = "d", descriptor = "(I)Z")
	public boolean method5540() {
		return this.aClass125_5 != null;
	}

	@OriginalMember(owner = "client!mja", name = "a", descriptor = "(Z)V")
	public void method5541() {
		if (!this.aBoolean485) {
			return;
		}
		if (this.aClass125_3 != null) {
			this.aClass137_Sub3_23.method7030(this.aClass125_3);
			@Pc(20) short local20 = 16384;
			this.aClass137_Sub3_23.method7045(this.aClass125_4);
			this.aClass125_3.method2977();
			this.aClass125_4.method2969(0);
			if (this.aBoolean490) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6830, this.anInt6826, 0, 0, this.anInt6830, this.anInt6826, local20, 9728);
			this.aClass137_Sub3_23.method7100(this.aClass125_3);
			this.aClass137_Sub3_23.method7081(this.aClass125_4);
		}
		this.aClass137_Sub3_23.method7091();
		this.aClass137_Sub3_23.method7082(0);
		this.aClass137_Sub3_23.method7077(1);
		this.aClass137_Sub3_23.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class14_Sub16 local105;
		for (@Pc(97) Class14_Sub16 local97 = (Class14_Sub16) this.aClass262_39.method6318(); local97 != null; local97 = local105) {
			local105 = (Class14_Sub16) this.aClass262_39.method6311();
			@Pc(109) int local109 = local97.method1889();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method1882(local111, this.aClass66_Sub1_3, this.aClass66_Sub1Array4[local89]);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass137_Sub3_23.method7037(this.aClass125_4);
					this.aClass137_Sub3_23.method7056(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6826);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6824, this.anInt6823);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6824, this.anInt6823 + this.anInt6826);
					OpenGL.glTexCoord2f((float) this.anInt6830, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6830 + this.anInt6824, this.anInt6823 - -this.anInt6826);
					OpenGL.glTexCoord2f((float) this.anInt6830, (float) this.anInt6826);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6830 + this.anInt6824, this.anInt6823);
					OpenGL.glEnd();
				} else {
					this.aClass125_4.method2969(--local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6826);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt6826);
					OpenGL.glTexCoord2f((float) this.anInt6830, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6830, this.anInt6826);
					OpenGL.glTexCoord2f((float) this.anInt6830, (float) this.anInt6826);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6830, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local89 = local89 + 1 & 0x1;
				local97.method1886(local111);
			}
		}
		this.aBoolean485 = false;
	}
}
