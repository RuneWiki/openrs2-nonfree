import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class131 {

	@OriginalMember(owner = "client!hh", name = "t", descriptor = "Z")
	private boolean aBoolean353;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "Lclient!kw;")
	private Class2_Sub6_Sub13 aClass2_Sub6_Sub13_1;

	@OriginalMember(owner = "client!hh", name = "C", descriptor = "Lclient!kw;")
	private Class2_Sub6_Sub13 aClass2_Sub6_Sub13_2;

	@OriginalMember(owner = "client!hh", name = "F", descriptor = "Lclient!tp;")
	private Class85_Sub1 aClass85_Sub1_2;

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "I")
	private int anInt4749 = 1;

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
	private int anInt4750 = 0;

	@OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
	private int anInt4757 = 0;

	@OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
	private int anInt4756 = 1;

	@OriginalMember(owner = "client!hh", name = "w", descriptor = "Lclient!uh;")
	private final Class341 aClass341_38 = new Class341();

	@OriginalMember(owner = "client!hh", name = "x", descriptor = "Z")
	private boolean aBoolean354 = true;

	@OriginalMember(owner = "client!hh", name = "z", descriptor = "[Lclient!tp;")
	private Class85_Sub1[] aClass85_Sub1Array1 = new Class85_Sub1[2];

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "Z")
	private boolean aBoolean356 = true;

	@OriginalMember(owner = "client!hh", name = "y", descriptor = "Z")
	private boolean aBoolean355 = true;

	@OriginalMember(owner = "client!hh", name = "D", descriptor = "Z")
	private boolean aBoolean357 = true;

	@OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
	private int anInt4761 = 0;

	@OriginalMember(owner = "client!hh", name = "H", descriptor = "I")
	private int anInt4760 = -1;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "Z")
	private boolean aBoolean358 = false;

	@OriginalMember(owner = "client!hh", name = "u", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_19;

	@OriginalMember(owner = "client!hh", name = "l", descriptor = "Lclient!rg;")
	private Class295 aClass295_1;

	@OriginalMember(owner = "client!hh", name = "o", descriptor = "Lclient!rg;")
	private Class295 aClass295_2;

	@OriginalMember(owner = "client!hh", name = "p", descriptor = "Lclient!rg;")
	private Class295 aClass295_3;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class131(@OriginalArg(0) Class20_Sub3 arg0) {
		this.aClass20_Sub3_19 = arg0;
		if (this.aClass20_Sub3_19.aBoolean626 && this.aClass20_Sub3_19.aBoolean629) {
			this.aClass295_2 = this.aClass295_1 = new Class295(this.aClass20_Sub3_19);
			if (this.aClass20_Sub3_19.anInt8760 > 1 && this.aClass20_Sub3_19.aBoolean624 && this.aClass20_Sub3_19.aBoolean623) {
				this.aClass295_2 = this.aClass295_3 = new Class295(this.aClass20_Sub3_19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
	public void method4126() {
		if (!this.aBoolean353) {
			return;
		}
		if (this.aClass295_3 != null) {
			this.aClass20_Sub3_19.method7351(this.aClass295_3);
			@Pc(20) short local20 = 16384;
			this.aClass20_Sub3_19.method7338(this.aClass295_1);
			this.aClass295_3.method7567();
			this.aClass295_1.method7565(0);
			if (this.aBoolean358) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4756, this.anInt4749, 0, 0, this.anInt4756, this.anInt4749, local20, 9728);
			this.aClass20_Sub3_19.method7392(this.aClass295_3);
			this.aClass20_Sub3_19.method7369(this.aClass295_1);
		}
		this.aClass20_Sub3_19.method7379();
		this.aClass20_Sub3_19.method7340(0);
		this.aClass20_Sub3_19.method7348(1);
		this.aClass20_Sub3_19.la();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class2_Sub17 local113;
		for (@Pc(105) Class2_Sub17 local105 = (Class2_Sub17) this.aClass341_38.method8524(); local105 != null; local105 = local113) {
			local113 = (Class2_Sub17) this.aClass341_38.method8519();
			@Pc(117) int local117 = local105.method7513();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method7499(this.aClass85_Sub1_2, this.aClass85_Sub1Array1[local97], local119);
				if (local113 == null && local119 == local117 - 1) {
					this.aClass20_Sub3_19.method7357(this.aClass295_1);
					this.aClass20_Sub3_19.method7377(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4749);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4757, this.anInt4750);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4757, this.anInt4750 + this.anInt4749);
					OpenGL.glTexCoord2f((float) this.anInt4756, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4757 + this.anInt4756, this.anInt4750 + this.anInt4749);
					OpenGL.glTexCoord2f((float) this.anInt4756, (float) this.anInt4749);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4756 + this.anInt4757, this.anInt4750);
					OpenGL.glEnd();
				} else {
					this.aClass295_1.method7565(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4749);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4749);
					OpenGL.glTexCoord2f((float) this.anInt4756, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4756, this.anInt4749);
					OpenGL.glTexCoord2f((float) this.anInt4756, (float) this.anInt4749);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4756, 0);
					OpenGL.glEnd();
				}
				local105.method7505(local119);
				local97 = local97 + 1 & 0x1;
				local99 = local99 + 1 & 0x1;
			}
		}
		this.aBoolean353 = false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!fba;Z)Z")
	public boolean method4128(@OriginalArg(0) Class2_Sub17 arg0) {
		if (this.aClass295_2 != null) {
			if (arg0.method7500() || arg0.method7507()) {
				this.aClass341_38.method8528(arg0);
				this.method4135();
				if (this.method4130()) {
					if (this.anInt4756 != -1 && this.anInt4749 != -1) {
						arg0.method7503(this.anInt4749, this.anInt4756);
					}
					arg0.aBoolean650 = true;
					return true;
				}
			}
			this.method4132(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIIII)Z")
	public boolean method4129(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass295_2 == null || this.aClass341_38.method8531()) {
			return false;
		}
		if (arg0 != this.anInt4756 || arg2 != this.anInt4749) {
			this.anInt4756 = arg0;
			this.anInt4749 = arg2;
			for (@Pc(45) Class2 local45 = this.aClass341_38.method8524(); local45 != this.aClass341_38.aClass2_271; local45 = local45.aClass2_299) {
				((Class2_Sub17) local45).method7503(this.anInt4749, this.anInt4756);
			}
			this.aBoolean356 = true;
			this.aBoolean354 = true;
			this.aBoolean355 = true;
		}
		if (!this.method4130()) {
			return false;
		}
		this.aBoolean353 = true;
		this.anInt4750 = arg3;
		this.anInt4757 = arg1;
		this.aClass20_Sub3_19.method7360(this.aClass295_2);
		this.aClass295_2.method7565(0);
		this.aClass20_Sub3_19.method7377(this.anInt4749 + this.anInt4750 - this.aClass20_Sub3_19.anInt8691, -this.anInt4757);
		return true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Z)Z")
	private boolean method4130() {
		if (this.aBoolean354) {
			if (this.aClass2_Sub6_Sub13_2 != null) {
				this.aClass2_Sub6_Sub13_2.method5452();
				this.aClass2_Sub6_Sub13_2 = null;
			}
			if (this.aClass85_Sub1_2 != null) {
				this.aClass85_Sub1_2.method9097();
				this.aClass85_Sub1_2 = null;
			}
			if (this.aClass295_3 != null) {
				this.aClass2_Sub6_Sub13_2 = new Class2_Sub6_Sub13(this.aClass20_Sub3_19, 6402, this.anInt4756, this.anInt4749, this.aClass20_Sub3_19.anInt8760);
			}
			if (this.aBoolean358) {
				this.aClass85_Sub1_2 = new Class85_Sub1(this.aClass20_Sub3_19, 34037, 6402, this.anInt4756, this.anInt4749);
			} else if (this.aClass2_Sub6_Sub13_2 == null) {
				this.aClass2_Sub6_Sub13_2 = new Class2_Sub6_Sub13(this.aClass20_Sub3_19, 6402, this.anInt4756, this.anInt4749);
			}
			this.aBoolean354 = false;
			this.aBoolean355 = true;
			this.aBoolean357 = true;
		}
		if (this.aBoolean356) {
			if (this.aClass2_Sub6_Sub13_1 != null) {
				this.aClass2_Sub6_Sub13_1.method5452();
				this.aClass2_Sub6_Sub13_1 = null;
			}
			if (this.aClass85_Sub1Array1[0] != null) {
				this.aClass85_Sub1Array1[0].method9097();
				this.aClass85_Sub1Array1[0] = null;
			}
			if (this.aClass85_Sub1Array1[1] != null) {
				this.aClass85_Sub1Array1[1].method9097();
				this.aClass85_Sub1Array1[1] = null;
			}
			if (this.aClass295_3 != null) {
				this.aClass2_Sub6_Sub13_1 = new Class2_Sub6_Sub13(this.aClass20_Sub3_19, this.anInt4760, this.anInt4756, this.anInt4749, this.aClass20_Sub3_19.anInt8760);
			}
			this.aClass85_Sub1Array1[0] = new Class85_Sub1(this.aClass20_Sub3_19, 34037, this.anInt4760, this.anInt4756, this.anInt4749);
			this.aClass85_Sub1Array1[1] = this.anInt4761 > 1 ? new Class85_Sub1(this.aClass20_Sub3_19, 34037, this.anInt4760, this.anInt4756, this.anInt4749) : null;
			this.aBoolean355 = true;
			this.aBoolean357 = true;
			this.aBoolean356 = false;
		}
		if (this.aBoolean355) {
			if (this.aClass295_3 == null) {
				this.aClass20_Sub3_19.method7360(this.aClass295_1);
				this.aClass295_1.method7562(0);
				this.aClass295_1.method7562(1);
				this.aClass295_1.method7562(8);
				this.aClass295_1.method7571(this.aClass85_Sub1Array1[0], 0);
				if (this.anInt4761 > 1) {
					this.aClass295_1.method7571(this.aClass85_Sub1Array1[1], 1);
				}
				if (this.aBoolean358) {
					this.aClass295_1.method7571(this.aClass85_Sub1_2, 8);
				} else {
					this.aClass295_1.method7570(8, this.aClass2_Sub6_Sub13_2);
				}
				this.aClass20_Sub3_19.method7357(this.aClass295_1);
			} else {
				this.aClass20_Sub3_19.method7360(this.aClass295_1);
				this.aClass295_1.method7562(0);
				this.aClass295_1.method7562(1);
				this.aClass295_1.method7562(8);
				this.aClass295_1.method7571(this.aClass85_Sub1Array1[0], 0);
				if (this.anInt4761 > 1) {
					this.aClass295_1.method7571(this.aClass85_Sub1Array1[1], 1);
				}
				if (this.aBoolean358) {
					this.aClass295_1.method7571(this.aClass85_Sub1_2, 8);
				}
				this.aClass20_Sub3_19.method7357(this.aClass295_1);
				this.aClass20_Sub3_19.method7360(this.aClass295_3);
				this.aClass295_3.method7562(0);
				this.aClass295_3.method7562(8);
				this.aClass295_3.method7570(0, this.aClass2_Sub6_Sub13_1);
				this.aClass295_3.method7570(8, this.aClass2_Sub6_Sub13_2);
				this.aClass20_Sub3_19.method7357(this.aClass295_3);
			}
			this.aBoolean355 = false;
			this.aBoolean357 = true;
		}
		if (this.aBoolean357) {
			this.aClass20_Sub3_19.method7360(this.aClass295_2);
			this.aBoolean357 = !this.aClass295_2.method7569();
			this.aClass20_Sub3_19.method7357(this.aClass295_2);
		}
		return !this.aBoolean357;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Lclient!fba;Z)V")
	public void method4132(@OriginalArg(0) Class2_Sub17 arg0) {
		arg0.aBoolean650 = false;
		arg0.method7512();
		arg0.method9253();
		this.method4135();
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
	public void method4133() {
		this.aClass2_Sub6_Sub13_1 = null;
		this.aClass295_2 = this.aClass295_3 = this.aClass295_1 = null;
		this.aClass85_Sub1_2 = null;
		this.aClass2_Sub6_Sub13_2 = null;
		this.aClass85_Sub1Array1 = null;
		if (!this.aClass341_38.method8531()) {
			for (@Pc(44) Class2 local44 = this.aClass341_38.method8524(); local44 != this.aClass341_38.aClass2_271; local44 = local44.aClass2_299) {
				((Class2_Sub17) local44).method7512();
			}
		}
		this.anInt4756 = this.anInt4749 = 1;
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)Z")
	public boolean method4134() {
		return this.aClass295_2 != null;
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
	private void method4135() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(31) int local31;
		for (@Pc(17) Class2_Sub17 local17 = (Class2_Sub17) this.aClass341_38.method8524(); local17 != null; local17 = (Class2_Sub17) this.aClass341_38.method8519()) {
			local31 = local17.method7510();
			local11 += local17.method7513();
			if (local31 > local9) {
				local9 = local31;
			}
			local7 |= local17.method7508();
		}
		if (local9 == 2) {
			local31 = 34836;
		} else if (local9 == 1) {
			local31 = 34842;
		} else {
			local31 = 6408;
		}
		if (this.anInt4760 != local31) {
			this.aBoolean356 = true;
			this.anInt4760 = local31;
		}
		@Pc(99) int local99 = this.anInt4761 > 2 ? 2 : this.anInt4761;
		@Pc(106) int local106 = local11 <= 2 ? local11 : 2;
		this.anInt4761 = local11;
		if (local7 != this.aBoolean358) {
			this.aBoolean358 = local7;
			this.aBoolean354 = true;
		}
		if (local106 != local99) {
			this.aBoolean355 = this.aBoolean356 = true;
		}
	}
}
