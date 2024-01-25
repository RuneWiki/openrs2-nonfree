import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class52 {

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "Z")
	private boolean aBoolean102;

	@OriginalMember(owner = "client!cf", name = "x", descriptor = "Lclient!ob;")
	private Class79_Sub2 aClass79_Sub2_1;

	@OriginalMember(owner = "client!cf", name = "D", descriptor = "Lclient!fda;")
	private Class12_Sub4_Sub5 aClass12_Sub4_Sub5_1;

	@OriginalMember(owner = "client!cf", name = "G", descriptor = "Lclient!fda;")
	private Class12_Sub4_Sub5 aClass12_Sub4_Sub5_2;

	@OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
	private int anInt1455 = 0;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	private int anInt1453 = 0;

	@OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
	private int anInt1458 = 1;

	@OriginalMember(owner = "client!cf", name = "v", descriptor = "I")
	private int anInt1460 = 1;

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "Lclient!dm;")
	private final Class73 aClass73_14 = new Class73();

	@OriginalMember(owner = "client!cf", name = "y", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!cf", name = "w", descriptor = "Z")
	private boolean aBoolean103 = true;

	@OriginalMember(owner = "client!cf", name = "E", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
	private int anInt1461 = -1;

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
	private int anInt1463 = 0;

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!cf", name = "A", descriptor = "[Lclient!ob;")
	private Class79_Sub2[] aClass79_Sub2Array1 = new Class79_Sub2[2];

	@OriginalMember(owner = "client!cf", name = "p", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_2;

	@OriginalMember(owner = "client!cf", name = "r", descriptor = "Lclient!aea;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "Lclient!aea;")
	private Class9 aClass9_1;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!aea;")
	private Class9 aClass9_2;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!gi;)V")
	public Class52(@OriginalArg(0) Class42_Sub3 arg0) {
		this.aClass42_Sub3_2 = arg0;
		if (this.aClass42_Sub3_2.aBoolean305 && this.aClass42_Sub3_2.aBoolean291) {
			this.aClass9_1 = this.aClass9_3 = new Class9(this.aClass42_Sub3_2);
			if (this.aClass42_Sub3_2.anInt3671 > 1 && this.aClass42_Sub3_2.aBoolean284 && this.aClass42_Sub3_2.aBoolean307) {
				this.aClass9_1 = this.aClass9_2 = new Class9(this.aClass42_Sub3_2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
	public void method1447() {
		if (!this.aBoolean102) {
			return;
		}
		if (this.aClass9_2 != null) {
			@Pc(18) short local18 = 16384;
			this.aClass42_Sub3_2.method3249(this.aClass9_2);
			this.aClass42_Sub3_2.method3243(this.aClass9_3);
			this.aClass9_2.method281();
			this.aClass9_3.method288(0);
			if (this.aBoolean107) {
				local18 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1460, this.anInt1458, 0, 0, this.anInt1460, this.anInt1458, local18, 9728);
			this.aClass42_Sub3_2.method3271(this.aClass9_2);
			this.aClass42_Sub3_2.method3216(this.aClass9_3);
		}
		this.aClass42_Sub3_2.method3247();
		this.aClass42_Sub3_2.method3209(0);
		this.aClass42_Sub3_2.method3257(1);
		this.aClass42_Sub3_2.n();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class12_Sub43 local109;
		for (@Pc(101) Class12_Sub43 local101 = (Class12_Sub43) this.aClass73_14.method2005(); local101 != null; local101 = local109) {
			local109 = (Class12_Sub43) this.aClass73_14.method2009();
			@Pc(113) int local113 = local101.method7227();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method7235(this.aClass79_Sub2Array1[local93], local115, this.aClass79_Sub2_1);
				if (local109 == null && local115 == local113 - 1) {
					this.aClass42_Sub3_2.method3256(this.aClass9_3);
					this.aClass42_Sub3_2.method3189(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1458);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1455, this.anInt1453);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1455, this.anInt1453 + this.anInt1458);
					OpenGL.glTexCoord2f((float) this.anInt1460, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1460 + this.anInt1455, this.anInt1453 - -this.anInt1458);
					OpenGL.glTexCoord2f((float) this.anInt1460, (float) this.anInt1458);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1460 + this.anInt1455, this.anInt1453);
					OpenGL.glEnd();
				} else {
					this.aClass9_3.method288(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1458);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt1458);
					OpenGL.glTexCoord2f((float) this.anInt1460, (float) this.anInt1458);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1460, this.anInt1458);
					OpenGL.glTexCoord2f((float) this.anInt1460, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1460, 0);
					OpenGL.glEnd();
				}
				local101.method7232(local115);
				local93 = local93 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean102 = false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Z")
	public boolean method1448() {
		return this.aClass9_1 != null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIII)Z")
	public boolean method1449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass9_1 == null || this.aClass73_14.method2015()) {
			return false;
		}
		if (arg0 != this.anInt1460 || this.anInt1458 != arg3) {
			this.anInt1458 = arg3;
			this.anInt1460 = arg0;
			for (@Pc(38) Class12 local38 = this.aClass73_14.method2005(); local38 != this.aClass73_14.aClass12_47; local38 = local38.aClass12_283) {
				((Class12_Sub43) local38).method7228(this.anInt1460, this.anInt1458);
			}
			this.aBoolean103 = true;
			this.aBoolean104 = true;
			this.aBoolean106 = true;
		}
		if (!this.method1451()) {
			return false;
		}
		this.aBoolean102 = true;
		this.anInt1455 = arg1;
		this.anInt1453 = arg2;
		this.aClass42_Sub3_2.method3211(this.aClass9_1);
		this.aClass9_1.method288(0);
		this.aClass42_Sub3_2.method3189(-this.anInt1455, this.anInt1458 - this.aClass9_1.method286() - this.anInt1453);
		return true;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!pq;I)Z")
	public boolean method1450(@OriginalArg(0) Class12_Sub43 arg0) {
		if (this.aClass9_1 != null) {
			if (arg0.method7230() || arg0.method7234()) {
				this.aClass73_14.method2012(arg0);
				this.method1455();
				if (this.method1451()) {
					if (this.anInt1460 != -1 && this.anInt1458 != -1) {
						arg0.method7228(this.anInt1460, this.anInt1458);
					}
					arg0.aBoolean618 = true;
					return true;
				}
			}
			this.method1454(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)Z")
	private boolean method1451() {
		if (this.aBoolean103) {
			if (this.aClass12_Sub4_Sub5_2 != null) {
				this.aClass12_Sub4_Sub5_2.method2746();
				this.aClass12_Sub4_Sub5_2 = null;
			}
			if (this.aClass79_Sub2_1 != null) {
				this.aClass79_Sub2_1.method5271();
				this.aClass79_Sub2_1 = null;
			}
			if (this.aClass9_2 != null) {
				this.aClass12_Sub4_Sub5_2 = new Class12_Sub4_Sub5(this.aClass42_Sub3_2, 6402, this.anInt1460, this.anInt1458, this.aClass42_Sub3_2.anInt3671);
			}
			if (this.aBoolean107) {
				this.aClass79_Sub2_1 = new Class79_Sub2(this.aClass42_Sub3_2, 34037, 6402, this.anInt1460, this.anInt1458);
			} else if (this.aClass12_Sub4_Sub5_2 == null) {
				this.aClass12_Sub4_Sub5_2 = new Class12_Sub4_Sub5(this.aClass42_Sub3_2, 6402, this.anInt1460, this.anInt1458);
			}
			this.aBoolean103 = false;
			this.aBoolean106 = true;
			this.aBoolean105 = true;
		}
		if (this.aBoolean104) {
			if (this.aClass12_Sub4_Sub5_1 != null) {
				this.aClass12_Sub4_Sub5_1.method2746();
				this.aClass12_Sub4_Sub5_1 = null;
			}
			if (this.aClass79_Sub2Array1[0] != null) {
				this.aClass79_Sub2Array1[0].method5271();
				this.aClass79_Sub2Array1[0] = null;
			}
			if (this.aClass79_Sub2Array1[1] != null) {
				this.aClass79_Sub2Array1[1].method5271();
				this.aClass79_Sub2Array1[1] = null;
			}
			if (this.aClass9_2 != null) {
				this.aClass12_Sub4_Sub5_1 = new Class12_Sub4_Sub5(this.aClass42_Sub3_2, this.anInt1461, this.anInt1460, this.anInt1458, this.aClass42_Sub3_2.anInt3671);
			}
			this.aClass79_Sub2Array1[0] = new Class79_Sub2(this.aClass42_Sub3_2, 34037, this.anInt1461, this.anInt1460, this.anInt1458);
			this.aClass79_Sub2Array1[1] = this.anInt1463 <= 1 ? null : new Class79_Sub2(this.aClass42_Sub3_2, 34037, this.anInt1461, this.anInt1460, this.anInt1458);
			this.aBoolean105 = true;
			this.aBoolean106 = true;
			this.aBoolean104 = false;
		}
		if (this.aBoolean106) {
			if (this.aClass9_2 == null) {
				this.aClass42_Sub3_2.method3211(this.aClass9_3);
				this.aClass9_3.method287(0);
				this.aClass9_3.method287(1);
				this.aClass9_3.method287(8);
				this.aClass9_3.method275(this.aClass79_Sub2Array1[0], 0);
				if (this.anInt1463 > 1) {
					this.aClass9_3.method275(this.aClass79_Sub2Array1[1], 1);
				}
				if (this.aBoolean107) {
					this.aClass9_3.method275(this.aClass79_Sub2_1, 8);
				} else {
					this.aClass9_3.method285(this.aClass12_Sub4_Sub5_2, 8);
				}
				this.aClass42_Sub3_2.method3256(this.aClass9_3);
			} else {
				this.aClass42_Sub3_2.method3211(this.aClass9_3);
				this.aClass9_3.method287(0);
				this.aClass9_3.method287(1);
				this.aClass9_3.method287(8);
				this.aClass9_3.method275(this.aClass79_Sub2Array1[0], 0);
				if (this.anInt1463 > 1) {
					this.aClass9_3.method275(this.aClass79_Sub2Array1[1], 1);
				}
				if (this.aBoolean107) {
					this.aClass9_3.method275(this.aClass79_Sub2_1, 8);
				}
				this.aClass42_Sub3_2.method3256(this.aClass9_3);
				this.aClass42_Sub3_2.method3211(this.aClass9_2);
				this.aClass9_2.method287(0);
				this.aClass9_2.method287(8);
				this.aClass9_2.method285(this.aClass12_Sub4_Sub5_1, 0);
				this.aClass9_2.method285(this.aClass12_Sub4_Sub5_2, 8);
				this.aClass42_Sub3_2.method3256(this.aClass9_2);
			}
			this.aBoolean106 = false;
			this.aBoolean105 = true;
		}
		if (this.aBoolean105) {
			this.aClass42_Sub3_2.method3211(this.aClass9_1);
			this.aBoolean105 = !this.aClass9_1.method284();
			this.aClass42_Sub3_2.method3256(this.aClass9_1);
		}
		return !this.aBoolean105;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(Lclient!pq;I)V")
	public void method1454(@OriginalArg(0) Class12_Sub43 arg0) {
		arg0.aBoolean618 = false;
		arg0.method7226();
		arg0.method7967();
		this.method1455();
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	private void method1455() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class12_Sub43 local23 = (Class12_Sub43) this.aClass73_14.method2005(); local23 != null; local23 = (Class12_Sub43) this.aClass73_14.method2009()) {
			local29 = local23.method7231();
			local11 += local23.method7227();
			if (local9 < local29) {
				local9 = local29;
			}
			local7 |= local23.method7233();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt1461) {
			this.anInt1461 = local29;
			this.aBoolean104 = true;
		}
		@Pc(93) int local93 = this.anInt1463 > 2 ? 2 : this.anInt1463;
		@Pc(102) int local102 = local11 <= 2 ? local11 : 2;
		if (this.aBoolean107 != local7) {
			this.aBoolean103 = true;
			this.aBoolean107 = local7;
		}
		this.anInt1463 = local11;
		if (local102 != local93) {
			this.aBoolean106 = this.aBoolean104 = true;
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public void method1456() {
		this.aClass79_Sub2_1 = null;
		this.aClass9_1 = this.aClass9_2 = this.aClass9_3 = null;
		this.aClass79_Sub2Array1 = null;
		this.aClass12_Sub4_Sub5_1 = null;
		this.aClass12_Sub4_Sub5_2 = null;
		if (!this.aClass73_14.method2015()) {
			for (@Pc(36) Class12 local36 = this.aClass73_14.method2005(); local36 != this.aClass73_14.aClass12_47; local36 = local36.aClass12_283) {
				((Class12_Sub43) local36).method7226();
			}
		}
		this.anInt1460 = this.anInt1458 = 1;
	}
}
