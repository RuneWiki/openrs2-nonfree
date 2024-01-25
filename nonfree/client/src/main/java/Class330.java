import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class330 {

	@OriginalMember(owner = "client!uea", name = "l", descriptor = "Z")
	private boolean aBoolean621;

	@OriginalMember(owner = "client!uea", name = "y", descriptor = "Lclient!bm;")
	private Class4_Sub7_Sub2 aClass4_Sub7_Sub2_1;

	@OriginalMember(owner = "client!uea", name = "A", descriptor = "Lclient!gaa;")
	private Class114_Sub1 aClass114_Sub1_4;

	@OriginalMember(owner = "client!uea", name = "H", descriptor = "Lclient!bm;")
	private Class4_Sub7_Sub2 aClass4_Sub7_Sub2_2;

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
	private int anInt8999 = 0;

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
	private int anInt9002 = 1;

	@OriginalMember(owner = "client!uea", name = "t", descriptor = "I")
	private int anInt9004 = 0;

	@OriginalMember(owner = "client!uea", name = "v", descriptor = "I")
	private int anInt9006 = 1;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "Lclient!gj;")
	private final Class124 aClass124_61 = new Class124();

	@OriginalMember(owner = "client!uea", name = "x", descriptor = "I")
	private int anInt9007 = 0;

	@OriginalMember(owner = "client!uea", name = "B", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "client!uea", name = "F", descriptor = "Z")
	private boolean aBoolean626 = true;

	@OriginalMember(owner = "client!uea", name = "C", descriptor = "Z")
	private boolean aBoolean624 = true;

	@OriginalMember(owner = "client!uea", name = "D", descriptor = "Z")
	private boolean aBoolean625 = true;

	@OriginalMember(owner = "client!uea", name = "w", descriptor = "Z")
	private boolean aBoolean622 = true;

	@OriginalMember(owner = "client!uea", name = "G", descriptor = "I")
	private int anInt9008 = -1;

	@OriginalMember(owner = "client!uea", name = "z", descriptor = "[Lclient!gaa;")
	private Class114_Sub1[] aClass114_Sub1Array4 = new Class114_Sub1[2];

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "Lclient!no;")
	private final Class66_Sub3 aClass66_Sub3_37;

	@OriginalMember(owner = "client!uea", name = "q", descriptor = "Lclient!vga;")
	private Class347 aClass347_7;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "Lclient!vga;")
	private Class347 aClass347_5;

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "Lclient!vga;")
	private Class347 aClass347_6;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!no;)V")
	public Class330(@OriginalArg(0) Class66_Sub3 arg0) {
		this.aClass66_Sub3_37 = arg0;
		if (this.aClass66_Sub3_37.aBoolean482 && this.aClass66_Sub3_37.aBoolean489) {
			this.aClass347_5 = this.aClass347_7 = new Class347(this.aClass66_Sub3_37);
			if (this.aClass66_Sub3_37.anInt6437 > 1 && this.aClass66_Sub3_37.aBoolean475 && this.aClass66_Sub3_37.aBoolean492) {
				this.aClass347_5 = this.aClass347_6 = new Class347(this.aClass66_Sub3_37);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!li;B)V")
	public void method7387(@OriginalArg(0) Class4_Sub29 arg0) {
		arg0.aBoolean427 = false;
		arg0.method4875();
		arg0.method8013();
		this.method7390();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)V")
	public void method7389() {
		if (!this.aBoolean621) {
			return;
		}
		if (this.aClass347_6 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass66_Sub3_37.method5369(this.aClass347_6);
			this.aClass66_Sub3_37.method5383(this.aClass347_7);
			this.aClass347_6.method7683();
			this.aClass347_7.method7691(0);
			if (this.aBoolean623) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9006, this.anInt9002, 0, 0, this.anInt9006, this.anInt9002, local14, 9728);
			this.aClass66_Sub3_37.method5400(this.aClass347_6);
			this.aClass66_Sub3_37.method5356(this.aClass347_7);
		}
		this.aClass66_Sub3_37.method5366();
		this.aClass66_Sub3_37.method5398(0);
		this.aClass66_Sub3_37.method5355(1);
		this.aClass66_Sub3_37.F();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(113) Class4_Sub29 local113;
		for (@Pc(105) Class4_Sub29 local105 = (Class4_Sub29) this.aClass124_61.method3267(); local105 != null; local105 = local113) {
			local113 = (Class4_Sub29) this.aClass124_61.method3273();
			@Pc(117) int local117 = local105.method4867();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method4868(this.aClass114_Sub1Array4[local89], this.aClass114_Sub1_4, local119);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass66_Sub3_37.method5410(this.aClass347_7);
					this.aClass66_Sub3_37.method5415(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9002);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9004, this.anInt8999);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9004, this.anInt9002 + this.anInt8999);
					OpenGL.glTexCoord2f((float) this.anInt9006, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9006 + this.anInt9004, this.anInt9002 + this.anInt8999);
					OpenGL.glTexCoord2f((float) this.anInt9006, (float) this.anInt9002);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9006 + this.anInt9004, this.anInt8999);
					OpenGL.glEnd();
				} else {
					this.aClass347_7.method7691(--local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9002);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt9002);
					OpenGL.glTexCoord2f((float) this.anInt9006, (float) this.anInt9002);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9006, this.anInt9002);
					OpenGL.glTexCoord2f((float) this.anInt9006, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9006, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local89 = local89 + 1 & 0x1;
				local105.method4873(local119);
			}
		}
		this.aBoolean621 = false;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)V")
	private void method7390() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class4_Sub29 local17 = (Class4_Sub29) this.aClass124_61.method3267(); local17 != null; local17 = (Class4_Sub29) this.aClass124_61.method3273()) {
			local23 = local17.method4871();
			local11 += local17.method4867();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method4866();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt9008 != local23) {
			this.anInt9008 = local23;
			this.aBoolean625 = true;
		}
		@Pc(89) int local89 = this.anInt9007 > 2 ? 2 : this.anInt9007;
		@Pc(104) int local104 = local11 <= 2 ? local11 : 2;
		if (local7 != this.aBoolean623) {
			this.aBoolean622 = true;
			this.aBoolean623 = local7;
		}
		if (local104 != local89) {
			this.aBoolean624 = this.aBoolean625 = true;
		}
		this.anInt9007 = local11;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(I)Z")
	private boolean method7392() {
		if (this.aBoolean622) {
			if (this.aClass4_Sub7_Sub2_1 != null) {
				this.aClass4_Sub7_Sub2_1.method721();
				this.aClass4_Sub7_Sub2_1 = null;
			}
			if (this.aClass114_Sub1_4 != null) {
				this.aClass114_Sub1_4.method5006();
				this.aClass114_Sub1_4 = null;
			}
			if (this.aClass347_6 != null) {
				this.aClass4_Sub7_Sub2_1 = new Class4_Sub7_Sub2(this.aClass66_Sub3_37, 6402, this.anInt9006, this.anInt9002, this.aClass66_Sub3_37.anInt6437);
			}
			if (this.aBoolean623) {
				this.aClass114_Sub1_4 = new Class114_Sub1(this.aClass66_Sub3_37, 34037, 6402, this.anInt9006, this.anInt9002);
			} else if (this.aClass4_Sub7_Sub2_1 == null) {
				this.aClass4_Sub7_Sub2_1 = new Class4_Sub7_Sub2(this.aClass66_Sub3_37, 6402, this.anInt9006, this.anInt9002);
			}
			this.aBoolean622 = false;
			this.aBoolean624 = true;
			this.aBoolean626 = true;
		}
		if (this.aBoolean625) {
			if (this.aClass4_Sub7_Sub2_2 != null) {
				this.aClass4_Sub7_Sub2_2.method721();
				this.aClass4_Sub7_Sub2_2 = null;
			}
			if (this.aClass114_Sub1Array4[0] != null) {
				this.aClass114_Sub1Array4[0].method5006();
				this.aClass114_Sub1Array4[0] = null;
			}
			if (this.aClass114_Sub1Array4[1] != null) {
				this.aClass114_Sub1Array4[1].method5006();
				this.aClass114_Sub1Array4[1] = null;
			}
			if (this.aClass347_6 != null) {
				this.aClass4_Sub7_Sub2_2 = new Class4_Sub7_Sub2(this.aClass66_Sub3_37, this.anInt9008, this.anInt9006, this.anInt9002, this.aClass66_Sub3_37.anInt6437);
			}
			this.aClass114_Sub1Array4[0] = new Class114_Sub1(this.aClass66_Sub3_37, 34037, this.anInt9008, this.anInt9006, this.anInt9002);
			this.aClass114_Sub1Array4[1] = this.anInt9007 <= 1 ? null : new Class114_Sub1(this.aClass66_Sub3_37, 34037, this.anInt9008, this.anInt9006, this.anInt9002);
			this.aBoolean624 = true;
			this.aBoolean626 = true;
			this.aBoolean625 = false;
		}
		if (this.aBoolean624) {
			if (this.aClass347_6 == null) {
				this.aClass66_Sub3_37.method5391(this.aClass347_7);
				this.aClass347_7.method7686(0);
				this.aClass347_7.method7686(1);
				this.aClass347_7.method7686(8);
				this.aClass347_7.method7687(this.aClass114_Sub1Array4[0], 0);
				if (this.anInt9007 > 1) {
					this.aClass347_7.method7687(this.aClass114_Sub1Array4[1], 1);
				}
				if (this.aBoolean623) {
					this.aClass347_7.method7687(this.aClass114_Sub1_4, 8);
				} else {
					this.aClass347_7.method7680(this.aClass4_Sub7_Sub2_1, 8);
				}
				this.aClass66_Sub3_37.method5410(this.aClass347_7);
			} else {
				this.aClass66_Sub3_37.method5391(this.aClass347_7);
				this.aClass347_7.method7686(0);
				this.aClass347_7.method7686(1);
				this.aClass347_7.method7686(8);
				this.aClass347_7.method7687(this.aClass114_Sub1Array4[0], 0);
				if (this.anInt9007 > 1) {
					this.aClass347_7.method7687(this.aClass114_Sub1Array4[1], 1);
				}
				if (this.aBoolean623) {
					this.aClass347_7.method7687(this.aClass114_Sub1_4, 8);
				}
				this.aClass66_Sub3_37.method5410(this.aClass347_7);
				this.aClass66_Sub3_37.method5391(this.aClass347_6);
				this.aClass347_6.method7686(0);
				this.aClass347_6.method7686(8);
				this.aClass347_6.method7680(this.aClass4_Sub7_Sub2_2, 0);
				this.aClass347_6.method7680(this.aClass4_Sub7_Sub2_1, 8);
				this.aClass66_Sub3_37.method5410(this.aClass347_6);
			}
			this.aBoolean626 = true;
			this.aBoolean624 = false;
		}
		if (this.aBoolean626) {
			this.aClass66_Sub3_37.method5391(this.aClass347_5);
			this.aBoolean626 = !this.aClass347_5.method7689();
			this.aClass66_Sub3_37.method5410(this.aClass347_5);
		}
		return !this.aBoolean626;
	}

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "(B)V")
	public void method7393() {
		this.aClass4_Sub7_Sub2_2 = null;
		this.aClass114_Sub1Array4 = null;
		this.aClass347_5 = this.aClass347_6 = this.aClass347_7 = null;
		this.aClass114_Sub1_4 = null;
		this.aClass4_Sub7_Sub2_1 = null;
		if (!this.aClass124_61.method3264()) {
			for (@Pc(40) Class4 local40 = this.aClass124_61.method3267(); local40 != this.aClass124_61.aClass4_90; local40 = local40.aClass4_287) {
				((Class4_Sub29) local40).method4875();
			}
		}
		this.anInt9006 = this.anInt9002 = 1;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZLclient!li;)Z")
	public boolean method7395(@OriginalArg(1) Class4_Sub29 arg0) {
		if (this.aClass347_5 != null) {
			if (arg0.method4864() || arg0.method4865()) {
				this.aClass124_61.method3275(arg0);
				this.method7390();
				if (this.method7392()) {
					if (this.anInt9006 != -1 && this.anInt9002 != -1) {
						arg0.method4869(this.anInt9002, this.anInt9006);
					}
					arg0.aBoolean427 = true;
					return true;
				}
			}
			this.method7387(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIBI)Z")
	public boolean method7396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass347_5 == null || this.aClass124_61.method3264()) {
			return false;
		}
		if (this.anInt9006 != arg2 || this.anInt9002 != arg3) {
			this.anInt9006 = arg2;
			this.anInt9002 = arg3;
			for (@Pc(46) Class4 local46 = this.aClass124_61.method3267(); local46 != this.aClass124_61.aClass4_90; local46 = local46.aClass4_287) {
				((Class4_Sub29) local46).method4869(this.anInt9002, this.anInt9006);
			}
			this.aBoolean625 = true;
			this.aBoolean624 = true;
			this.aBoolean622 = true;
		}
		if (!this.method7392()) {
			return false;
		}
		this.anInt8999 = arg1;
		this.anInt9004 = arg0;
		this.aBoolean621 = true;
		this.aClass66_Sub3_37.method5391(this.aClass347_5);
		this.aClass347_5.method7691(0);
		this.aClass66_Sub3_37.method5415(this.anInt9002 + this.anInt8999 - this.aClass66_Sub3_37.anInt6320, -this.anInt9004);
		return true;
	}

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "(B)Z")
	public boolean method7397() {
		return this.aClass347_5 != null;
	}
}
