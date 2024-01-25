import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class239 {

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
	private boolean aBoolean479;

	@OriginalMember(owner = "client!oh", name = "B", descriptor = "Lclient!mea;")
	private Class1_Sub3_Sub12 aClass1_Sub3_Sub12_1;

	@OriginalMember(owner = "client!oh", name = "E", descriptor = "Lclient!mea;")
	private Class1_Sub3_Sub12 aClass1_Sub3_Sub12_2;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "Lclient!dga;")
	private Class52_Sub1 aClass52_Sub1_4;

	@OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
	private int anInt6725 = 1;

	@OriginalMember(owner = "client!oh", name = "n", descriptor = "I")
	private int anInt6723 = 1;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
	private int anInt6728 = 0;

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
	private int anInt6717 = 0;

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "Lclient!wo;")
	private final Class361 aClass361_68 = new Class361();

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
	private int anInt6731 = -1;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "Z")
	private boolean aBoolean480 = true;

	@OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
	private int anInt6730 = 0;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "Z")
	private boolean aBoolean484 = true;

	@OriginalMember(owner = "client!oh", name = "z", descriptor = "[Lclient!dga;")
	private Class52_Sub1[] aClass52_Sub1Array3 = new Class52_Sub1[2];

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Z")
	private boolean aBoolean482 = true;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "Z")
	private boolean aBoolean483 = true;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "Lclient!ag;")
	private final Class12_Sub1 aClass12_Sub1_29;

	@OriginalMember(owner = "client!oh", name = "o", descriptor = "Lclient!iu;")
	private Class161 aClass161_4;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "Lclient!iu;")
	private Class161 aClass161_3;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "Lclient!iu;")
	private Class161 aClass161_5;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!ag;)V")
	public Class239(@OriginalArg(0) Class12_Sub1 arg0) {
		this.aClass12_Sub1_29 = arg0;
		if (this.aClass12_Sub1_29.aBoolean34 && this.aClass12_Sub1_29.aBoolean21) {
			this.aClass161_3 = this.aClass161_4 = new Class161(this.aClass12_Sub1_29);
			if (this.aClass12_Sub1_29.anInt459 > 1 && this.aClass12_Sub1_29.aBoolean20 && this.aClass12_Sub1_29.aBoolean33) {
				this.aClass161_3 = this.aClass161_5 = new Class161(this.aClass12_Sub1_29);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
	public void method5509() {
		this.aClass161_3 = this.aClass161_5 = this.aClass161_4 = null;
		this.aClass52_Sub1Array3 = null;
		this.aClass52_Sub1_4 = null;
		this.aClass1_Sub3_Sub12_1 = null;
		this.aClass1_Sub3_Sub12_2 = null;
		if (!this.aClass361_68.method7847()) {
			for (@Pc(36) Class1 local36 = this.aClass361_68.method7854(); local36 != this.aClass361_68.aClass1_281; local36 = local36.aClass1_286) {
				((Class1_Sub24) local36).method6882();
			}
		}
		this.anInt6723 = this.anInt6725 = 1;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(BLclient!lga;)Z")
	public boolean method5510(@OriginalArg(1) Class1_Sub24 arg0) {
		if (this.aClass161_3 != null) {
			if (arg0.method6885() || arg0.method6887()) {
				this.aClass361_68.method7855(arg0);
				this.method5516();
				if (this.method5511()) {
					if (this.anInt6723 != -1 && this.anInt6725 != -1) {
						arg0.method6890(this.anInt6723, this.anInt6725);
					}
					arg0.aBoolean597 = true;
					return true;
				}
			}
			this.method5514(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)Z")
	private boolean method5511() {
		if (this.aBoolean480) {
			if (this.aClass1_Sub3_Sub12_1 != null) {
				this.aClass1_Sub3_Sub12_1.method4881();
				this.aClass1_Sub3_Sub12_1 = null;
			}
			if (this.aClass52_Sub1_4 != null) {
				this.aClass52_Sub1_4.method5643();
				this.aClass52_Sub1_4 = null;
			}
			if (this.aClass161_5 != null) {
				this.aClass1_Sub3_Sub12_1 = new Class1_Sub3_Sub12(this.aClass12_Sub1_29, 6402, this.anInt6723, this.anInt6725, this.aClass12_Sub1_29.anInt459);
			}
			if (this.aBoolean481) {
				this.aClass52_Sub1_4 = new Class52_Sub1(this.aClass12_Sub1_29, 34037, 6402, this.anInt6723, this.anInt6725);
			} else if (this.aClass1_Sub3_Sub12_1 == null) {
				this.aClass1_Sub3_Sub12_1 = new Class1_Sub3_Sub12(this.aClass12_Sub1_29, 6402, this.anInt6723, this.anInt6725);
			}
			this.aBoolean484 = true;
			this.aBoolean480 = false;
			this.aBoolean483 = true;
		}
		if (this.aBoolean482) {
			if (this.aClass1_Sub3_Sub12_2 != null) {
				this.aClass1_Sub3_Sub12_2.method4881();
				this.aClass1_Sub3_Sub12_2 = null;
			}
			if (this.aClass52_Sub1Array3[0] != null) {
				this.aClass52_Sub1Array3[0].method5643();
				this.aClass52_Sub1Array3[0] = null;
			}
			if (this.aClass52_Sub1Array3[1] != null) {
				this.aClass52_Sub1Array3[1].method5643();
				this.aClass52_Sub1Array3[1] = null;
			}
			if (this.aClass161_5 != null) {
				this.aClass1_Sub3_Sub12_2 = new Class1_Sub3_Sub12(this.aClass12_Sub1_29, this.anInt6731, this.anInt6723, this.anInt6725, this.aClass12_Sub1_29.anInt459);
			}
			this.aClass52_Sub1Array3[0] = new Class52_Sub1(this.aClass12_Sub1_29, 34037, this.anInt6731, this.anInt6723, this.anInt6725);
			this.aClass52_Sub1Array3[1] = this.anInt6730 > 1 ? new Class52_Sub1(this.aClass12_Sub1_29, 34037, this.anInt6731, this.anInt6723, this.anInt6725) : null;
			this.aBoolean484 = true;
			this.aBoolean483 = true;
			this.aBoolean482 = false;
		}
		if (this.aBoolean484) {
			if (this.aClass161_5 == null) {
				this.aClass12_Sub1_29.method424(this.aClass161_4);
				this.aClass161_4.method3784(0);
				this.aClass161_4.method3784(1);
				this.aClass161_4.method3784(8);
				this.aClass161_4.method3790(this.aClass52_Sub1Array3[0], 0);
				if (this.anInt6730 > 1) {
					this.aClass161_4.method3790(this.aClass52_Sub1Array3[1], 1);
				}
				if (this.aBoolean481) {
					this.aClass161_4.method3790(this.aClass52_Sub1_4, 8);
				} else {
					this.aClass161_4.method3791(this.aClass1_Sub3_Sub12_1, 8);
				}
				this.aClass12_Sub1_29.method372(this.aClass161_4);
			} else {
				this.aClass12_Sub1_29.method424(this.aClass161_4);
				this.aClass161_4.method3784(0);
				this.aClass161_4.method3784(1);
				this.aClass161_4.method3784(8);
				this.aClass161_4.method3790(this.aClass52_Sub1Array3[0], 0);
				if (this.anInt6730 > 1) {
					this.aClass161_4.method3790(this.aClass52_Sub1Array3[1], 1);
				}
				if (this.aBoolean481) {
					this.aClass161_4.method3790(this.aClass52_Sub1_4, 8);
				}
				this.aClass12_Sub1_29.method372(this.aClass161_4);
				this.aClass12_Sub1_29.method424(this.aClass161_5);
				this.aClass161_5.method3784(0);
				this.aClass161_5.method3784(8);
				this.aClass161_5.method3791(this.aClass1_Sub3_Sub12_2, 0);
				this.aClass161_5.method3791(this.aClass1_Sub3_Sub12_1, 8);
				this.aClass12_Sub1_29.method372(this.aClass161_5);
			}
			this.aBoolean484 = false;
			this.aBoolean483 = true;
		}
		if (this.aBoolean483) {
			this.aClass12_Sub1_29.method424(this.aClass161_3);
			this.aBoolean483 = !this.aClass161_3.method3792();
			this.aClass12_Sub1_29.method372(this.aClass161_3);
		}
		return !this.aBoolean483;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)Z")
	public boolean method5512() {
		return this.aClass161_3 != null;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIII)Z")
	public boolean method5513(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass161_3 == null || this.aClass361_68.method7847()) {
			return false;
		}
		if (this.anInt6723 != arg2 || this.anInt6725 != arg3) {
			this.anInt6725 = arg3;
			this.anInt6723 = arg2;
			for (@Pc(48) Class1 local48 = this.aClass361_68.method7854(); local48 != this.aClass361_68.aClass1_281; local48 = local48.aClass1_286) {
				((Class1_Sub24) local48).method6890(this.anInt6723, this.anInt6725);
			}
			this.aBoolean482 = true;
			this.aBoolean480 = true;
			this.aBoolean484 = true;
		}
		if (!this.method5511()) {
			return false;
		}
		this.aBoolean479 = true;
		this.anInt6717 = arg0;
		this.anInt6728 = arg1;
		this.aClass12_Sub1_29.method424(this.aClass161_3);
		this.aClass161_3.method3786(0);
		this.aClass12_Sub1_29.method422(this.anInt6717 + this.anInt6725 - this.aClass12_Sub1_29.anInt414, -this.anInt6728);
		return true;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!lga;)V")
	public void method5514(@OriginalArg(1) Class1_Sub24 arg0) {
		arg0.aBoolean597 = false;
		arg0.method6882();
		arg0.method7878();
		this.method5516();
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
	private void method5516() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(30) int local30;
		for (@Pc(17) Class1_Sub24 local17 = (Class1_Sub24) this.aClass361_68.method7854(); local17 != null; local17 = (Class1_Sub24) this.aClass361_68.method7853()) {
			local30 = local17.method6892();
			if (local30 > local9) {
				local9 = local30;
			}
			local11 += local17.method6886();
			local7 |= local17.method6889();
		}
		if (local9 == 2) {
			local30 = 34836;
		} else if (local9 == 1) {
			local30 = 34842;
		} else {
			local30 = 6408;
		}
		if (local30 != this.anInt6731) {
			this.aBoolean482 = true;
			this.anInt6731 = local30;
		}
		@Pc(96) int local96 = this.anInt6730 > 2 ? 2 : this.anInt6730;
		@Pc(103) int local103 = local11 <= 2 ? local11 : 2;
		this.anInt6730 = local11;
		if (local7 != this.aBoolean481) {
			this.aBoolean481 = local7;
			this.aBoolean480 = true;
		}
		if (local96 != local103) {
			this.aBoolean484 = this.aBoolean482 = true;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(I)V")
	public void method5517() {
		if (!this.aBoolean479) {
			return;
		}
		if (this.aClass161_5 != null) {
			this.aClass12_Sub1_29.method446(this.aClass161_5);
			@Pc(20) short local20 = 16384;
			this.aClass12_Sub1_29.method427(this.aClass161_4);
			this.aClass161_5.method3789();
			this.aClass161_4.method3786(0);
			if (this.aBoolean481) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6723, this.anInt6725, 0, 0, this.anInt6723, this.anInt6725, local20, 9728);
			this.aClass12_Sub1_29.method396(this.aClass161_5);
			this.aClass12_Sub1_29.method374(this.aClass161_4);
		}
		this.aClass12_Sub1_29.method380();
		this.aClass12_Sub1_29.method395(0);
		this.aClass12_Sub1_29.method401(1);
		this.aClass12_Sub1_29.JA();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(112) Class1_Sub24 local112;
		for (@Pc(97) Class1_Sub24 local97 = (Class1_Sub24) this.aClass361_68.method7854(); local97 != null; local97 = local112) {
			local112 = (Class1_Sub24) this.aClass361_68.method7853();
			@Pc(116) int local116 = local97.method6886();
			for (@Pc(118) int local118 = 0; local118 < local116; local118++) {
				local97.method6883(this.aClass52_Sub1_4, local118, this.aClass52_Sub1Array3[local89]);
				if (local112 == null && local116 - 1 == local118) {
					this.aClass12_Sub1_29.method372(this.aClass161_4);
					this.aClass12_Sub1_29.method422(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6725);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6728, this.anInt6717);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6728, this.anInt6717 + this.anInt6725);
					OpenGL.glTexCoord2f((float) this.anInt6723, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6723 + this.anInt6728, this.anInt6725 + this.anInt6717);
					OpenGL.glTexCoord2f((float) this.anInt6723, (float) this.anInt6725);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6723 + this.anInt6728, this.anInt6717);
					OpenGL.glEnd();
				} else {
					this.aClass161_4.method3786(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6725);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6725);
					OpenGL.glTexCoord2f((float) this.anInt6723, (float) this.anInt6725);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6723, this.anInt6725);
					OpenGL.glTexCoord2f((float) this.anInt6723, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6723, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local97.method6884(local118);
				local89 = local89 + 1 & 0x1;
			}
		}
		this.aBoolean479 = false;
	}
}
