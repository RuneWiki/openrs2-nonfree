import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public final class Class161 {

	@OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
	private boolean aBoolean291;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "Lclient!hk;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_1;

	@OriginalMember(owner = "client!kf", name = "E", descriptor = "Lclient!hk;")
	private Class1_Sub1_Sub9 aClass1_Sub1_Sub9_2;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Lclient!ea;")
	private Class20_Sub3 aClass20_Sub3_2;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	private int anInt4844 = 1;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	private int anInt4841 = 0;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	private int anInt4853 = 1;

	@OriginalMember(owner = "client!kf", name = "w", descriptor = "I")
	private int anInt4855 = 0;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!bu;")
	private final Class38 aClass38_38 = new Class38();

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	private int anInt4856 = 0;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "client!kf", name = "A", descriptor = "Z")
	private boolean aBoolean294 = true;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "Z")
	private boolean aBoolean296 = true;

	@OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
	private int anInt4857 = -1;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "Z")
	private boolean aBoolean292 = true;

	@OriginalMember(owner = "client!kf", name = "H", descriptor = "[Lclient!ea;")
	private Class20_Sub3[] aClass20_Sub3Array1 = new Class20_Sub3[2];

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "Z")
	private boolean aBoolean293 = true;

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_21;

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!ne;")
	private Class205 aClass205_1;

	@OriginalMember(owner = "client!kf", name = "q", descriptor = "Lclient!ne;")
	private Class205 aClass205_3;

	@OriginalMember(owner = "client!kf", name = "i", descriptor = "Lclient!ne;")
	private Class205 aClass205_2;

	static {
		new Class114("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
	}

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class161(@OriginalArg(0) Class9_Sub3 arg0) {
		this.aClass9_Sub3_21 = arg0;
		if (this.aClass9_Sub3_21.aBoolean527 && this.aClass9_Sub3_21.aBoolean515) {
			this.aClass205_3 = this.aClass205_1 = new Class205(this.aClass9_Sub3_21);
			if (this.aClass9_Sub3_21.anInt7872 > 1 && this.aClass9_Sub3_21.aBoolean509 && this.aClass9_Sub3_21.aBoolean514) {
				this.aClass205_3 = this.aClass205_2 = new Class205(this.aClass9_Sub3_21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public void method4229() {
		this.aClass205_3 = this.aClass205_2 = this.aClass205_1 = null;
		this.aClass20_Sub3_2 = null;
		this.aClass20_Sub3Array1 = null;
		this.aClass1_Sub1_Sub9_1 = null;
		this.aClass1_Sub1_Sub9_2 = null;
		if (!this.aClass38_38.method1414()) {
			for (@Pc(41) Class1 local41 = this.aClass38_38.method1419(); local41 != this.aClass38_38.aClass1_27; local41 = local41.aClass1_283) {
				((Class1_Sub14) local41).method6196();
			}
		}
		this.anInt4853 = this.anInt4844 = 1;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public void method4230() {
		if (!this.aBoolean291) {
			return;
		}
		if (this.aClass205_2 != null) {
			this.aClass9_Sub3_21.method6665(this.aClass205_2);
			@Pc(20) short local20 = 16384;
			this.aClass9_Sub3_21.method6676(this.aClass205_1);
			this.aClass205_2.method5236();
			this.aClass205_1.method5227(0);
			if (this.aBoolean295) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4853, this.anInt4844, 0, 0, this.anInt4853, this.anInt4844, local20, 9728);
			this.aClass9_Sub3_21.method6673(this.aClass205_2);
			this.aClass9_Sub3_21.method6696(this.aClass205_1);
		}
		this.aClass9_Sub3_21.method6708();
		this.aClass9_Sub3_21.method6654(0);
		this.aClass9_Sub3_21.method6670(1);
		this.aClass9_Sub3_21.n();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class1_Sub14 local109;
		for (@Pc(101) Class1_Sub14 local101 = (Class1_Sub14) this.aClass38_38.method1419(); local101 != null; local101 = local109) {
			local109 = (Class1_Sub14) this.aClass38_38.method1415();
			@Pc(113) int local113 = local101.method6195();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method6189(local115, this.aClass20_Sub3Array1[local93], this.aClass20_Sub3_2);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass9_Sub3_21.method6707(this.aClass205_1);
					this.aClass9_Sub3_21.method6682(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4844);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4855, this.anInt4841);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4855, this.anInt4844 + this.anInt4841);
					OpenGL.glTexCoord2f((float) this.anInt4853, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4853 + this.anInt4855, this.anInt4844 + this.anInt4841);
					OpenGL.glTexCoord2f((float) this.anInt4853, (float) this.anInt4844);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4853 + this.anInt4855, this.anInt4841);
					OpenGL.glEnd();
				} else {
					this.aClass205_1.method5227(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4844);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4844);
					OpenGL.glTexCoord2f((float) this.anInt4853, (float) this.anInt4844);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4853, this.anInt4844);
					OpenGL.glTexCoord2f((float) this.anInt4853, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4853, 0);
					OpenGL.glEnd();
				}
				local93 = local93 + 1 & 0x1;
				local101.method6191(local115);
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean291 = false;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZLclient!ep;)V")
	public void method4231(@OriginalArg(1) Class1_Sub14 arg0) {
		arg0.aBoolean478 = false;
		arg0.method6196();
		arg0.method7983();
		this.method4235();
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lclient!ep;B)Z")
	public boolean method4232(@OriginalArg(0) Class1_Sub14 arg0) {
		if (this.aClass205_3 != null) {
			if (arg0.method6187() || arg0.method6198()) {
				this.aClass38_38.method1426(arg0);
				this.method4235();
				if (this.method4239()) {
					if (this.anInt4853 != -1 && this.anInt4844 != -1) {
						arg0.method6186(this.anInt4844, this.anInt4853);
					}
					arg0.aBoolean478 = true;
					return true;
				}
			}
			this.method4231(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIII)Z")
	public boolean method4233(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass205_3 == null || this.aClass38_38.method1414()) {
			return false;
		}
		if (this.anInt4853 != arg1 || arg3 != this.anInt4844) {
			this.anInt4853 = arg1;
			this.anInt4844 = arg3;
			for (@Pc(34) Class1 local34 = this.aClass38_38.method1419(); local34 != this.aClass38_38.aClass1_27; local34 = local34.aClass1_283) {
				((Class1_Sub14) local34).method6186(this.anInt4844, this.anInt4853);
			}
			this.aBoolean296 = true;
			this.aBoolean294 = true;
			this.aBoolean293 = true;
		}
		if (!this.method4239()) {
			return false;
		}
		this.anInt4855 = arg2;
		this.anInt4841 = arg0;
		this.aBoolean291 = true;
		this.aClass9_Sub3_21.method6698(this.aClass205_3);
		this.aClass205_3.method5227(0);
		this.aClass9_Sub3_21.method6682(this.anInt4844 - this.aClass205_3.method5234() - this.anInt4841, -this.anInt4855);
		return true;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	private void method4235() {
		@Pc(9) boolean local9 = false;
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(24) int local24;
		for (@Pc(19) Class1_Sub14 local19 = (Class1_Sub14) this.aClass38_38.method1419(); local19 != null; local19 = (Class1_Sub14) this.aClass38_38.method1415()) {
			local24 = local19.method6194();
			if (local11 < local24) {
				local11 = local24;
			}
			local13 += local19.method6195();
			local9 |= local19.method6192();
		}
		if (local11 == 2) {
			local24 = 34836;
		} else if (local11 == 1) {
			local24 = 34842;
		} else {
			local24 = 6408;
		}
		if (this.anInt4857 != local24) {
			this.anInt4857 = local24;
			this.aBoolean293 = true;
		}
		@Pc(92) int local92 = this.anInt4856 <= 2 ? this.anInt4856 : 2;
		@Pc(101) int local101 = local13 > 2 ? 2 : local13;
		if (local101 != local92) {
			this.aBoolean296 = this.aBoolean293 = true;
		}
		this.anInt4856 = local13;
		if (this.aBoolean295 != local9) {
			this.aBoolean294 = true;
			this.aBoolean295 = local9;
		}
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)Z")
	public boolean method4238() {
		return this.aClass205_3 != null;
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(B)Z")
	private boolean method4239() {
		if (this.aBoolean294) {
			if (this.aClass1_Sub1_Sub9_2 != null) {
				this.aClass1_Sub1_Sub9_2.method3489();
				this.aClass1_Sub1_Sub9_2 = null;
			}
			if (this.aClass20_Sub3_2 != null) {
				this.aClass20_Sub3_2.method6239();
				this.aClass20_Sub3_2 = null;
			}
			if (this.aClass205_2 != null) {
				this.aClass1_Sub1_Sub9_2 = new Class1_Sub1_Sub9(this.aClass9_Sub3_21, 6402, this.anInt4853, this.anInt4844, this.aClass9_Sub3_21.anInt7872);
			}
			if (this.aBoolean295) {
				this.aClass20_Sub3_2 = new Class20_Sub3(this.aClass9_Sub3_21, 34037, 6402, this.anInt4853, this.anInt4844);
			} else if (this.aClass1_Sub1_Sub9_2 == null) {
				this.aClass1_Sub1_Sub9_2 = new Class1_Sub1_Sub9(this.aClass9_Sub3_21, 6402, this.anInt4853, this.anInt4844);
			}
			this.aBoolean292 = true;
			this.aBoolean294 = false;
			this.aBoolean296 = true;
		}
		if (this.aBoolean293) {
			if (this.aClass1_Sub1_Sub9_1 != null) {
				this.aClass1_Sub1_Sub9_1.method3489();
				this.aClass1_Sub1_Sub9_1 = null;
			}
			if (this.aClass20_Sub3Array1[0] != null) {
				this.aClass20_Sub3Array1[0].method6239();
				this.aClass20_Sub3Array1[0] = null;
			}
			if (this.aClass20_Sub3Array1[1] != null) {
				this.aClass20_Sub3Array1[1].method6239();
				this.aClass20_Sub3Array1[1] = null;
			}
			if (this.aClass205_2 != null) {
				this.aClass1_Sub1_Sub9_1 = new Class1_Sub1_Sub9(this.aClass9_Sub3_21, this.anInt4857, this.anInt4853, this.anInt4844, this.aClass9_Sub3_21.anInt7872);
			}
			this.aClass20_Sub3Array1[0] = new Class20_Sub3(this.aClass9_Sub3_21, 34037, this.anInt4857, this.anInt4853, this.anInt4844);
			this.aClass20_Sub3Array1[1] = this.anInt4856 <= 1 ? null : new Class20_Sub3(this.aClass9_Sub3_21, 34037, this.anInt4857, this.anInt4853, this.anInt4844);
			this.aBoolean292 = true;
			this.aBoolean293 = false;
			this.aBoolean296 = true;
		}
		if (this.aBoolean296) {
			if (this.aClass205_2 == null) {
				this.aClass9_Sub3_21.method6698(this.aClass205_1);
				this.aClass205_1.method5233(0);
				this.aClass205_1.method5233(1);
				this.aClass205_1.method5233(8);
				this.aClass205_1.method5240(this.aClass20_Sub3Array1[0], 0);
				if (this.anInt4856 > 1) {
					this.aClass205_1.method5240(this.aClass20_Sub3Array1[1], 1);
				}
				if (this.aBoolean295) {
					this.aClass205_1.method5240(this.aClass20_Sub3_2, 8);
				} else {
					this.aClass205_1.method5228(8, this.aClass1_Sub1_Sub9_2);
				}
				this.aClass9_Sub3_21.method6707(this.aClass205_1);
			} else {
				this.aClass9_Sub3_21.method6698(this.aClass205_1);
				this.aClass205_1.method5233(0);
				this.aClass205_1.method5233(1);
				this.aClass205_1.method5233(8);
				this.aClass205_1.method5240(this.aClass20_Sub3Array1[0], 0);
				if (this.anInt4856 > 1) {
					this.aClass205_1.method5240(this.aClass20_Sub3Array1[1], 1);
				}
				if (this.aBoolean295) {
					this.aClass205_1.method5240(this.aClass20_Sub3_2, 8);
				}
				this.aClass9_Sub3_21.method6707(this.aClass205_1);
				this.aClass9_Sub3_21.method6698(this.aClass205_2);
				this.aClass205_2.method5233(0);
				this.aClass205_2.method5233(8);
				this.aClass205_2.method5228(0, this.aClass1_Sub1_Sub9_1);
				this.aClass205_2.method5228(8, this.aClass1_Sub1_Sub9_2);
				this.aClass9_Sub3_21.method6707(this.aClass205_2);
			}
			this.aBoolean292 = true;
			this.aBoolean296 = false;
		}
		if (this.aBoolean292) {
			this.aClass9_Sub3_21.method6698(this.aClass205_3);
			this.aBoolean292 = !this.aClass205_3.method5232();
			this.aClass9_Sub3_21.method6707(this.aClass205_3);
		}
		return !this.aBoolean292;
	}
}
