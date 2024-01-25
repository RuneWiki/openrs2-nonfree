import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public final class Class238 {

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Z")
	private boolean aBoolean460;

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "Lclient!wn;")
	private Class40_Sub3 aClass40_Sub3_3;

	@OriginalMember(owner = "client!nk", name = "C", descriptor = "Lclient!eaa;")
	private Class1_Sub6_Sub3 aClass1_Sub6_Sub3_1;

	@OriginalMember(owner = "client!nk", name = "E", descriptor = "Lclient!eaa;")
	private Class1_Sub6_Sub3 aClass1_Sub6_Sub3_2;

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
	private int anInt5903 = 0;

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "I")
	private int anInt5913 = 1;

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
	private int anInt5909 = 0;

	@OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
	private int anInt5914 = 1;

	@OriginalMember(owner = "client!nk", name = "j", descriptor = "Lclient!wba;")
	private final Class353 aClass353_41 = new Class353();

	@OriginalMember(owner = "client!nk", name = "y", descriptor = "Z")
	private boolean aBoolean463 = true;

	@OriginalMember(owner = "client!nk", name = "B", descriptor = "Z")
	private boolean aBoolean464 = true;

	@OriginalMember(owner = "client!nk", name = "A", descriptor = "[Lclient!wn;")
	private Class40_Sub3[] aClass40_Sub3Array2 = new Class40_Sub3[2];

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "Z")
	private boolean aBoolean461 = true;

	@OriginalMember(owner = "client!nk", name = "x", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!nk", name = "F", descriptor = "I")
	private int anInt5916 = -1;

	@OriginalMember(owner = "client!nk", name = "G", descriptor = "I")
	private int anInt5917 = 0;

	@OriginalMember(owner = "client!nk", name = "D", descriptor = "Z")
	private boolean aBoolean465 = true;

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_24;

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "Lclient!faa;")
	private Class98 aClass98_3;

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!faa;")
	private Class98 aClass98_4;

	@OriginalMember(owner = "client!nk", name = "g", descriptor = "Lclient!faa;")
	private Class98 aClass98_5;

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class238(@OriginalArg(0) Class134_Sub2 arg0) {
		this.aClass134_Sub2_24 = arg0;
		if (this.aClass134_Sub2_24.aBoolean518 && this.aClass134_Sub2_24.aBoolean505) {
			this.aClass98_4 = this.aClass98_3 = new Class98(this.aClass134_Sub2_24);
			if (this.aClass134_Sub2_24.anInt6548 > 1 && this.aClass134_Sub2_24.aBoolean525 && this.aClass134_Sub2_24.aBoolean526) {
				this.aClass98_4 = this.aClass98_5 = new Class98(this.aClass134_Sub2_24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V")
	private void method4837() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub8 local17 = (Class1_Sub8) this.aClass353_41.method7677(); local17 != null; local17 = (Class1_Sub8) this.aClass353_41.method7687()) {
			local23 = local17.method587();
			local11 += local17.method596();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method593();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt5916) {
			this.aBoolean465 = true;
			this.anInt5916 = local23;
		}
		@Pc(97) int local97 = this.anInt5917 > 2 ? 2 : this.anInt5917;
		@Pc(106) int local106 = local11 > 2 ? 2 : local11;
		this.anInt5917 = local11;
		if (local97 != local106) {
			this.aBoolean463 = this.aBoolean465 = true;
		}
		if (this.aBoolean462 != local7) {
			this.aBoolean462 = local7;
			this.aBoolean461 = true;
		}
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)Z")
	public boolean method4838() {
		return this.aClass98_4 != null;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIII)Z")
	public boolean method4839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass98_4 == null || this.aClass353_41.method7686()) {
			return false;
		}
		if (this.anInt5914 != arg1 || arg3 != this.anInt5913) {
			this.anInt5914 = arg1;
			this.anInt5913 = arg3;
			for (@Pc(34) Class1 local34 = this.aClass353_41.method7677(); local34 != this.aClass353_41.aClass1_271; local34 = local34.aClass1_285) {
				((Class1_Sub8) local34).method590(this.anInt5913, this.anInt5914);
			}
			this.aBoolean465 = true;
			this.aBoolean461 = true;
			this.aBoolean463 = true;
		}
		if (!this.method4847()) {
			return false;
		}
		this.anInt5903 = arg2;
		this.anInt5909 = arg0;
		this.aBoolean460 = true;
		this.aClass134_Sub2_24.method5275(this.aClass98_4);
		this.aClass98_4.method1979(0);
		this.aClass134_Sub2_24.method5215(this.anInt5913 + this.anInt5909 - this.aClass134_Sub2_24.anInt6489, -this.anInt5903);
		return true;
	}

	@OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)V")
	public void method4840() {
		if (!this.aBoolean460) {
			return;
		}
		if (this.aClass98_5 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass134_Sub2_24.method5269(this.aClass98_5);
			this.aClass134_Sub2_24.method5195(this.aClass98_3);
			this.aClass98_5.method1982();
			this.aClass98_3.method1979(0);
			if (this.aBoolean462) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5914, this.anInt5913, 0, 0, this.anInt5914, this.anInt5913, local14, 9728);
			this.aClass134_Sub2_24.method5244(this.aClass98_5);
			this.aClass134_Sub2_24.method5199(this.aClass98_3);
		}
		this.aClass134_Sub2_24.method5191();
		this.aClass134_Sub2_24.method5233(0);
		this.aClass134_Sub2_24.method5194(1);
		this.aClass134_Sub2_24.JA();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(114) Class1_Sub8 local114;
		for (@Pc(99) Class1_Sub8 local99 = (Class1_Sub8) this.aClass353_41.method7677(); local99 != null; local99 = local114) {
			local114 = (Class1_Sub8) this.aClass353_41.method7687();
			@Pc(118) int local118 = local99.method596();
			for (@Pc(120) int local120 = 0; local120 < local118; local120++) {
				local99.method589(local120, this.aClass40_Sub3Array2[local91], this.aClass40_Sub3_3);
				if (local114 == null && local118 - 1 == local120) {
					this.aClass134_Sub2_24.method5262(this.aClass98_3);
					this.aClass134_Sub2_24.method5215(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5913);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5903, this.anInt5909);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5903, this.anInt5913 + this.anInt5909);
					OpenGL.glTexCoord2f((float) this.anInt5914, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5903 + this.anInt5914, this.anInt5913 + this.anInt5909);
					OpenGL.glTexCoord2f((float) this.anInt5914, (float) this.anInt5913);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5903 + this.anInt5914, this.anInt5909);
					OpenGL.glEnd();
				} else {
					this.aClass98_3.method1979(local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5913);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt5913);
					OpenGL.glTexCoord2f((float) this.anInt5914, (float) this.anInt5913);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5914, this.anInt5913);
					OpenGL.glTexCoord2f((float) this.anInt5914, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5914, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local93 = local93 + 1 & 0x1;
				local99.method586(local120);
			}
		}
		this.aBoolean460 = false;
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V")
	public void method4842() {
		this.aClass1_Sub6_Sub3_2 = null;
		this.aClass98_4 = this.aClass98_5 = this.aClass98_3 = null;
		this.aClass40_Sub3Array2 = null;
		this.aClass40_Sub3_3 = null;
		this.aClass1_Sub6_Sub3_1 = null;
		if (!this.aClass353_41.method7686()) {
			for (@Pc(43) Class1 local43 = this.aClass353_41.method7677(); local43 != this.aClass353_41.aClass1_271; local43 = local43.aClass1_285) {
				((Class1_Sub8) local43).method588();
			}
		}
		this.anInt5914 = this.anInt5913 = 1;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lclient!cw;I)Z")
	public boolean method4844(@OriginalArg(0) Class1_Sub8 arg0) {
		if (this.aClass98_4 != null) {
			if (arg0.method591() || arg0.method585()) {
				this.aClass353_41.method7679(arg0);
				this.method4837();
				if (this.method4847()) {
					if (this.anInt5914 != -1 && this.anInt5913 != -1) {
						arg0.method590(this.anInt5913, this.anInt5914);
					}
					arg0.aBoolean59 = true;
					return true;
				}
			}
			this.method4845(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!nk", name = "a", descriptor = "(BLclient!cw;)V")
	public void method4845(@OriginalArg(1) Class1_Sub8 arg0) {
		arg0.aBoolean59 = false;
		arg0.method588();
		arg0.method7859();
		this.method4837();
	}

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "(I)Z")
	private boolean method4847() {
		if (this.aBoolean461) {
			if (this.aClass1_Sub6_Sub3_2 != null) {
				this.aClass1_Sub6_Sub3_2.method1682();
				this.aClass1_Sub6_Sub3_2 = null;
			}
			if (this.aClass40_Sub3_3 != null) {
				this.aClass40_Sub3_3.method5873();
				this.aClass40_Sub3_3 = null;
			}
			if (this.aClass98_5 != null) {
				this.aClass1_Sub6_Sub3_2 = new Class1_Sub6_Sub3(this.aClass134_Sub2_24, 6402, this.anInt5914, this.anInt5913, this.aClass134_Sub2_24.anInt6548);
			}
			if (this.aBoolean462) {
				this.aClass40_Sub3_3 = new Class40_Sub3(this.aClass134_Sub2_24, 34037, 6402, this.anInt5914, this.anInt5913);
			} else if (this.aClass1_Sub6_Sub3_2 == null) {
				this.aClass1_Sub6_Sub3_2 = new Class1_Sub6_Sub3(this.aClass134_Sub2_24, 6402, this.anInt5914, this.anInt5913);
			}
			this.aBoolean464 = true;
			this.aBoolean463 = true;
			this.aBoolean461 = false;
		}
		if (this.aBoolean465) {
			if (this.aClass1_Sub6_Sub3_1 != null) {
				this.aClass1_Sub6_Sub3_1.method1682();
				this.aClass1_Sub6_Sub3_1 = null;
			}
			if (this.aClass40_Sub3Array2[0] != null) {
				this.aClass40_Sub3Array2[0].method5873();
				this.aClass40_Sub3Array2[0] = null;
			}
			if (this.aClass40_Sub3Array2[1] != null) {
				this.aClass40_Sub3Array2[1].method5873();
				this.aClass40_Sub3Array2[1] = null;
			}
			if (this.aClass98_5 != null) {
				this.aClass1_Sub6_Sub3_1 = new Class1_Sub6_Sub3(this.aClass134_Sub2_24, this.anInt5916, this.anInt5914, this.anInt5913, this.aClass134_Sub2_24.anInt6548);
			}
			this.aClass40_Sub3Array2[0] = new Class40_Sub3(this.aClass134_Sub2_24, 34037, this.anInt5916, this.anInt5914, this.anInt5913);
			this.aClass40_Sub3Array2[1] = this.anInt5917 > 1 ? new Class40_Sub3(this.aClass134_Sub2_24, 34037, this.anInt5916, this.anInt5914, this.anInt5913) : null;
			this.aBoolean464 = true;
			this.aBoolean463 = true;
			this.aBoolean465 = false;
		}
		if (this.aBoolean463) {
			if (this.aClass98_5 == null) {
				this.aClass134_Sub2_24.method5275(this.aClass98_3);
				this.aClass98_3.method1973(0);
				this.aClass98_3.method1973(1);
				this.aClass98_3.method1973(8);
				this.aClass98_3.method1981(this.aClass40_Sub3Array2[0], 0);
				if (this.anInt5917 > 1) {
					this.aClass98_3.method1981(this.aClass40_Sub3Array2[1], 1);
				}
				if (this.aBoolean462) {
					this.aClass98_3.method1981(this.aClass40_Sub3_3, 8);
				} else {
					this.aClass98_3.method1984(8, this.aClass1_Sub6_Sub3_2);
				}
				this.aClass134_Sub2_24.method5262(this.aClass98_3);
			} else {
				this.aClass134_Sub2_24.method5275(this.aClass98_3);
				this.aClass98_3.method1973(0);
				this.aClass98_3.method1973(1);
				this.aClass98_3.method1973(8);
				this.aClass98_3.method1981(this.aClass40_Sub3Array2[0], 0);
				if (this.anInt5917 > 1) {
					this.aClass98_3.method1981(this.aClass40_Sub3Array2[1], 1);
				}
				if (this.aBoolean462) {
					this.aClass98_3.method1981(this.aClass40_Sub3_3, 8);
				}
				this.aClass134_Sub2_24.method5262(this.aClass98_3);
				this.aClass134_Sub2_24.method5275(this.aClass98_5);
				this.aClass98_5.method1973(0);
				this.aClass98_5.method1973(8);
				this.aClass98_5.method1984(0, this.aClass1_Sub6_Sub3_1);
				this.aClass98_5.method1984(8, this.aClass1_Sub6_Sub3_2);
				this.aClass134_Sub2_24.method5262(this.aClass98_5);
			}
			this.aBoolean464 = true;
			this.aBoolean463 = false;
		}
		if (this.aBoolean464) {
			this.aClass134_Sub2_24.method5275(this.aClass98_4);
			this.aBoolean464 = !this.aClass98_4.method1975();
			this.aClass134_Sub2_24.method5262(this.aClass98_4);
		}
		return !this.aBoolean464;
	}
}
