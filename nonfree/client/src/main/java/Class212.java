import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class212 {

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Z")
	private boolean aBoolean410;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "Lclient!ml;")
	private Class55_Sub3 aClass55_Sub3_7;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Lclient!sf;")
	private Class2_Sub5_Sub15 aClass2_Sub5_Sub15_1;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "Lclient!sf;")
	private Class2_Sub5_Sub15 aClass2_Sub5_Sub15_2;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	private int anInt5835 = 0;

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
	private int anInt5837 = 0;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
	private int anInt5839 = 1;

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	private int anInt5842 = 1;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!ar;")
	private final Class14 aClass14_41 = new Class14();

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "[Lclient!ml;")
	private Class55_Sub3[] aClass55_Sub3Array4 = new Class55_Sub3[2];

	@OriginalMember(owner = "client!rf", name = "v", descriptor = "Z")
	private boolean aBoolean412 = true;

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "I")
	private int anInt5846 = -1;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "I")
	private int anInt5847 = 0;

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Z")
	private boolean aBoolean415 = true;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Z")
	private boolean aBoolean416 = true;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
	private boolean aBoolean414 = true;

	@OriginalMember(owner = "client!rf", name = "m", descriptor = "Lclient!ef;")
	private final Class49_Sub2 aClass49_Sub2_36;

	@OriginalMember(owner = "client!rf", name = "k", descriptor = "Lclient!je;")
	private Class127 aClass127_6;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!je;")
	private Class127 aClass127_7;

	@OriginalMember(owner = "client!rf", name = "i", descriptor = "Lclient!je;")
	private Class127 aClass127_5;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!ef;)V")
	public Class212(@OriginalArg(0) Class49_Sub2 arg0) {
		this.aClass49_Sub2_36 = arg0;
		if (this.aClass49_Sub2_36.aBoolean117 && this.aClass49_Sub2_36.aBoolean126) {
			this.aClass127_7 = this.aClass127_6 = new Class127(this.aClass49_Sub2_36);
			if (this.aClass49_Sub2_36.anInt2000 > 1 && this.aClass49_Sub2_36.aBoolean113 && this.aClass49_Sub2_36.aBoolean124) {
				this.aClass127_7 = this.aClass127_5 = new Class127(this.aClass49_Sub2_36);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
	public void method4704() {
		if (!this.aBoolean410) {
			return;
		}
		if (this.aClass127_5 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass49_Sub2_36.method1602(this.aClass127_5);
			this.aClass49_Sub2_36.method1633(this.aClass127_6);
			this.aClass127_5.method2881();
			this.aClass127_6.method2873(0);
			if (this.aBoolean413) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5839, this.anInt5842, 0, 0, this.anInt5839, this.anInt5842, local14, 9728);
			this.aClass49_Sub2_36.method1644(this.aClass127_5);
			this.aClass49_Sub2_36.method1651(this.aClass127_6);
		}
		this.aClass49_Sub2_36.method1584();
		this.aClass49_Sub2_36.method1626(0);
		this.aClass49_Sub2_36.method1624(1);
		this.aClass49_Sub2_36.e();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class2_Sub19 local105;
		for (@Pc(97) Class2_Sub19 local97 = (Class2_Sub19) this.aClass14_41.method309(); local97 != null; local97 = local105) {
			local105 = (Class2_Sub19) this.aClass14_41.method311();
			@Pc(109) int local109 = local97.method2769();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method2779(local111, this.aClass55_Sub3_7, this.aClass55_Sub3Array4[local89]);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass49_Sub2_36.method1659(this.aClass127_6);
					this.aClass49_Sub2_36.method1634(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5842);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5835, this.anInt5837);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5835, this.anInt5837 + this.anInt5842);
					OpenGL.glTexCoord2f((float) this.anInt5839, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5835 + this.anInt5839, this.anInt5842 + this.anInt5837);
					OpenGL.glTexCoord2f((float) this.anInt5839, (float) this.anInt5842);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5835 + this.anInt5839, this.anInt5837);
					OpenGL.glEnd();
				} else {
					this.aClass127_6.method2873(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5842);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt5842);
					OpenGL.glTexCoord2f((float) this.anInt5839, (float) this.anInt5842);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5839, this.anInt5842);
					OpenGL.glTexCoord2f((float) this.anInt5839, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5839, 0);
					OpenGL.glEnd();
				}
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
				local97.method2775(local111);
			}
		}
		this.aBoolean410 = false;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	private void method4705() {
		@Pc(7) boolean local7 = false;
		@Pc(14) int local14 = 0;
		@Pc(16) int local16 = 0;
		@Pc(28) int local28;
		for (@Pc(22) Class2_Sub19 local22 = (Class2_Sub19) this.aClass14_41.method309(); local22 != null; local22 = (Class2_Sub19) this.aClass14_41.method311()) {
			local28 = local22.method2774();
			local16 += local22.method2769();
			if (local14 < local28) {
				local14 = local28;
			}
			local7 |= local22.method2778();
		}
		if (local14 == 2) {
			local28 = 34836;
		} else if (local14 == 1) {
			local28 = 34842;
		} else {
			local28 = 6408;
		}
		if (this.anInt5846 != local28) {
			this.aBoolean416 = true;
			this.anInt5846 = local28;
		}
		@Pc(94) int local94 = this.anInt5847 > 2 ? 2 : this.anInt5847;
		@Pc(103) int local103 = local16 > 2 ? 2 : local16;
		this.anInt5847 = local16;
		if (local94 != local103) {
			this.aBoolean414 = this.aBoolean416 = true;
		}
		if (local7 != this.aBoolean413) {
			this.aBoolean412 = true;
			this.aBoolean413 = local7;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!kk;I)V")
	public void method4706(@OriginalArg(0) Class2_Sub19 arg0) {
		arg0.aBoolean259 = false;
		arg0.method2772();
		arg0.method5866();
		this.method4705();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIBI)Z")
	public boolean method4707(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass127_7 == null || this.aClass14_41.method298()) {
			return false;
		}
		if (arg2 != this.anInt5839 || this.anInt5842 != arg3) {
			this.anInt5839 = arg2;
			this.anInt5842 = arg3;
			for (@Pc(45) Class2 local45 = this.aClass14_41.method309(); local45 != this.aClass14_41.aClass2_17; local45 = local45.aClass2_261) {
				((Class2_Sub19) local45).method2776(this.anInt5842, this.anInt5839);
			}
			this.aBoolean412 = true;
			this.aBoolean416 = true;
			this.aBoolean414 = true;
		}
		if (!this.method4710()) {
			return false;
		}
		this.aBoolean410 = true;
		this.anInt5835 = arg0;
		this.anInt5837 = arg1;
		this.aClass49_Sub2_36.method1589(this.aClass127_7);
		this.aClass127_7.method2873(0);
		this.aClass49_Sub2_36.method1634(-this.anInt5835, this.anInt5842 - this.aClass127_7.method2877() - this.anInt5837);
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)Z")
	public boolean method4708() {
		return this.aClass127_7 != null;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public void method4709() {
		this.aClass127_7 = this.aClass127_5 = this.aClass127_6 = null;
		this.aClass55_Sub3Array4 = null;
		this.aClass2_Sub5_Sub15_1 = null;
		this.aClass2_Sub5_Sub15_2 = null;
		this.aClass55_Sub3_7 = null;
		if (!this.aClass14_41.method298()) {
			for (@Pc(44) Class2 local44 = this.aClass14_41.method309(); local44 != this.aClass14_41.aClass2_17; local44 = local44.aClass2_261) {
				((Class2_Sub19) local44).method2772();
			}
		}
		this.anInt5839 = this.anInt5842 = 1;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
	private boolean method4710() {
		if (this.aBoolean412) {
			if (this.aClass2_Sub5_Sub15_1 != null) {
				this.aClass2_Sub5_Sub15_1.method4872();
				this.aClass2_Sub5_Sub15_1 = null;
			}
			if (this.aClass55_Sub3_7 != null) {
				this.aClass55_Sub3_7.method5559();
				this.aClass55_Sub3_7 = null;
			}
			if (this.aClass127_5 != null) {
				this.aClass2_Sub5_Sub15_1 = new Class2_Sub5_Sub15(this.aClass49_Sub2_36, 6402, this.anInt5839, this.anInt5842, this.aClass49_Sub2_36.anInt2000);
			}
			if (this.aBoolean413) {
				this.aClass55_Sub3_7 = new Class55_Sub3(this.aClass49_Sub2_36, 34037, 6402, this.anInt5839, this.anInt5842);
			} else if (this.aClass2_Sub5_Sub15_1 == null) {
				this.aClass2_Sub5_Sub15_1 = new Class2_Sub5_Sub15(this.aClass49_Sub2_36, 6402, this.anInt5839, this.anInt5842);
			}
			this.aBoolean412 = false;
			this.aBoolean414 = true;
			this.aBoolean415 = true;
		}
		if (this.aBoolean416) {
			if (this.aClass2_Sub5_Sub15_2 != null) {
				this.aClass2_Sub5_Sub15_2.method4872();
				this.aClass2_Sub5_Sub15_2 = null;
			}
			if (this.aClass55_Sub3Array4[0] != null) {
				this.aClass55_Sub3Array4[0].method5559();
				this.aClass55_Sub3Array4[0] = null;
			}
			if (this.aClass55_Sub3Array4[1] != null) {
				this.aClass55_Sub3Array4[1].method5559();
				this.aClass55_Sub3Array4[1] = null;
			}
			if (this.aClass127_5 != null) {
				this.aClass2_Sub5_Sub15_2 = new Class2_Sub5_Sub15(this.aClass49_Sub2_36, this.anInt5846, this.anInt5839, this.anInt5842, this.aClass49_Sub2_36.anInt2000);
			}
			this.aClass55_Sub3Array4[0] = new Class55_Sub3(this.aClass49_Sub2_36, 34037, this.anInt5846, this.anInt5839, this.anInt5842);
			this.aClass55_Sub3Array4[1] = this.anInt5847 > 1 ? new Class55_Sub3(this.aClass49_Sub2_36, 34037, this.anInt5846, this.anInt5839, this.anInt5842) : null;
			this.aBoolean414 = true;
			this.aBoolean416 = false;
			this.aBoolean415 = true;
		}
		if (this.aBoolean414) {
			if (this.aClass127_5 == null) {
				this.aClass49_Sub2_36.method1589(this.aClass127_6);
				this.aClass127_6.method2875(0);
				this.aClass127_6.method2875(1);
				this.aClass127_6.method2875(8);
				this.aClass127_6.method2883(0, this.aClass55_Sub3Array4[0]);
				if (this.anInt5847 > 1) {
					this.aClass127_6.method2883(1, this.aClass55_Sub3Array4[1]);
				}
				if (this.aBoolean413) {
					this.aClass127_6.method2883(8, this.aClass55_Sub3_7);
				} else {
					this.aClass127_6.method2874(8, this.aClass2_Sub5_Sub15_1);
				}
				this.aClass49_Sub2_36.method1659(this.aClass127_6);
			} else {
				this.aClass49_Sub2_36.method1589(this.aClass127_6);
				this.aClass127_6.method2875(0);
				this.aClass127_6.method2875(1);
				this.aClass127_6.method2875(8);
				this.aClass127_6.method2883(0, this.aClass55_Sub3Array4[0]);
				if (this.anInt5847 > 1) {
					this.aClass127_6.method2883(1, this.aClass55_Sub3Array4[1]);
				}
				if (this.aBoolean413) {
					this.aClass127_6.method2883(8, this.aClass55_Sub3_7);
				}
				this.aClass49_Sub2_36.method1659(this.aClass127_6);
				this.aClass49_Sub2_36.method1589(this.aClass127_5);
				this.aClass127_5.method2875(0);
				this.aClass127_5.method2875(8);
				this.aClass127_5.method2874(0, this.aClass2_Sub5_Sub15_2);
				this.aClass127_5.method2874(8, this.aClass2_Sub5_Sub15_1);
				this.aClass49_Sub2_36.method1659(this.aClass127_5);
			}
			this.aBoolean415 = true;
			this.aBoolean414 = false;
		}
		if (this.aBoolean415) {
			this.aClass49_Sub2_36.method1589(this.aClass127_7);
			this.aBoolean415 = !this.aClass127_7.method2871();
			this.aClass49_Sub2_36.method1659(this.aClass127_7);
		}
		return !this.aBoolean415;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lclient!kk;Z)Z")
	public boolean method4711(@OriginalArg(0) Class2_Sub19 arg0) {
		if (this.aClass127_7 != null) {
			if (arg0.method2773() || arg0.method2767()) {
				this.aClass14_41.method300(arg0);
				this.method4705();
				if (this.method4710()) {
					if (this.anInt5839 != -1 && this.anInt5842 != -1) {
						arg0.method2776(this.anInt5842, this.anInt5839);
					}
					arg0.aBoolean259 = true;
					return true;
				}
			}
			this.method4706(arg0);
		}
		return false;
	}
}
