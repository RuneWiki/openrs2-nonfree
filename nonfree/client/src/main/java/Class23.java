import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class23 {

	@OriginalMember(owner = "client!bba", name = "u", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!bba", name = "y", descriptor = "Lclient!dca;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "Lclient!rr;")
	private Class164_Sub3 aClass164_Sub3_2;

	@OriginalMember(owner = "client!bba", name = "H", descriptor = "Lclient!dca;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_2;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "I")
	private int anInt754 = 0;

	@OriginalMember(owner = "client!bba", name = "s", descriptor = "I")
	private int anInt765 = 1;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
	private int anInt764 = 0;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
	private int anInt753 = 1;

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "Lclient!ui;")
	private final Class295 aClass295_5 = new Class295();

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "I")
	private int anInt769 = 0;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!bba", name = "C", descriptor = "I")
	private int anInt770 = -1;

	@OriginalMember(owner = "client!bba", name = "B", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!bba", name = "F", descriptor = "[Lclient!rr;")
	private Class164_Sub3[] aClass164_Sub3Array1 = new Class164_Sub3[2];

	@OriginalMember(owner = "client!bba", name = "E", descriptor = "Z")
	private boolean aBoolean66 = true;

	@OriginalMember(owner = "client!bba", name = "G", descriptor = "Z")
	private boolean aBoolean67 = true;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "Lclient!mh;")
	private final Class4_Sub3 aClass4_Sub3_4;

	@OriginalMember(owner = "client!bba", name = "o", descriptor = "Lclient!er;")
	private Class89 aClass89_2;

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "Lclient!er;")
	private Class89 aClass89_3;

	@OriginalMember(owner = "client!bba", name = "k", descriptor = "Lclient!er;")
	private Class89 aClass89_1;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!mh;)V")
	public Class23(@OriginalArg(0) Class4_Sub3 arg0) {
		this.aClass4_Sub3_4 = arg0;
		if (this.aClass4_Sub3_4.aBoolean448 && this.aClass4_Sub3_4.aBoolean433) {
			this.aClass89_3 = this.aClass89_2 = new Class89(this.aClass4_Sub3_4);
			if (this.aClass4_Sub3_4.anInt5791 > 1 && this.aClass4_Sub3_4.aBoolean446 && this.aClass4_Sub3_4.aBoolean441) {
				this.aClass89_3 = this.aClass89_1 = new Class89(this.aClass4_Sub3_4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)V")
	private void method788() {
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30;
		for (@Pc(24) Class1_Sub34 local24 = (Class1_Sub34) this.aClass295_5.method7543(); local24 != null; local24 = (Class1_Sub34) this.aClass295_5.method7540()) {
			local30 = local24.method5030();
			local18 += local24.method5031();
			if (local16 < local30) {
				local16 = local30;
			}
			local14 |= local24.method5025();
		}
		if (local16 == 2) {
			local30 = 34836;
		} else if (local16 == 1) {
			local30 = 34842;
		} else {
			local30 = 6408;
		}
		if (local30 != this.anInt770) {
			this.aBoolean66 = true;
			this.anInt770 = local30;
		}
		@Pc(96) int local96 = this.anInt769 <= 2 ? this.anInt769 : 2;
		@Pc(103) int local103 = local18 > 2 ? 2 : local18;
		if (local96 != local103) {
			this.aBoolean65 = this.aBoolean66 = true;
		}
		this.anInt769 = local18;
		if (local14 != this.aBoolean68) {
			this.aBoolean68 = local14;
			this.aBoolean67 = true;
		}
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(B)Z")
	public boolean method790() {
		return this.aClass89_3 != null;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIII)Z")
	public boolean method791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass89_3 == null || this.aClass295_5.method7536()) {
			return false;
		}
		if (this.anInt765 != arg3 || arg1 != this.anInt753) {
			this.anInt765 = arg3;
			this.anInt753 = arg1;
			for (@Pc(38) Class1 local38 = this.aClass295_5.method7543(); local38 != this.aClass295_5.aClass1_260; local38 = local38.aClass1_283) {
				((Class1_Sub34) local38).method5028(this.anInt753, this.anInt765);
			}
			this.aBoolean65 = true;
			this.aBoolean67 = true;
			this.aBoolean66 = true;
		}
		if (!this.method795()) {
			return false;
		}
		this.aBoolean63 = true;
		this.anInt754 = arg2;
		this.anInt764 = arg0;
		this.aClass4_Sub3_4.method5263(this.aClass89_3);
		this.aClass89_3.method2258(0);
		this.aClass4_Sub3_4.method5264(-this.anInt764, this.anInt753 - this.aClass89_3.method2260() - this.anInt754);
		return true;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!vb;B)V")
	public void method792(@OriginalArg(0) Class1_Sub34 arg0) {
		arg0.aBoolean412 = false;
		arg0.method5021();
		arg0.method8239();
		this.method788();
	}

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "(B)V")
	public void method793() {
		if (!this.aBoolean63) {
			return;
		}
		if (this.aClass89_1 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass4_Sub3_4.method5294(this.aClass89_1);
			this.aClass4_Sub3_4.method5277(this.aClass89_2);
			this.aClass89_1.method2264();
			this.aClass89_2.method2258(0);
			if (this.aBoolean68) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt765, this.anInt753, 0, 0, this.anInt765, this.anInt753, local14, 9728);
			this.aClass4_Sub3_4.method5280(this.aClass89_1);
			this.aClass4_Sub3_4.method5269(this.aClass89_2);
		}
		this.aClass4_Sub3_4.method5267();
		this.aClass4_Sub3_4.method5225(0);
		this.aClass4_Sub3_4.method5230(1);
		this.aClass4_Sub3_4.n();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class1_Sub34 local109;
		for (@Pc(101) Class1_Sub34 local101 = (Class1_Sub34) this.aClass295_5.method7543(); local101 != null; local101 = local109) {
			local109 = (Class1_Sub34) this.aClass295_5.method7540();
			@Pc(113) int local113 = local101.method5031();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method5029(this.aClass164_Sub3_2, local115, this.aClass164_Sub3Array1[local93]);
				if (local109 == null && local115 == local113 - 1) {
					this.aClass4_Sub3_4.method5276(this.aClass89_2);
					this.aClass4_Sub3_4.method5264(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt753);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt764, this.anInt754);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt764, this.anInt754 + this.anInt753);
					OpenGL.glTexCoord2f((float) this.anInt765, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt764 + this.anInt765, this.anInt754 + this.anInt753);
					OpenGL.glTexCoord2f((float) this.anInt765, (float) this.anInt753);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt764 + this.anInt765, this.anInt754);
					OpenGL.glEnd();
				} else {
					this.aClass89_2.method2258(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt753);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt753);
					OpenGL.glTexCoord2f((float) this.anInt765, (float) this.anInt753);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt765, this.anInt753);
					OpenGL.glTexCoord2f((float) this.anInt765, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt765, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local101.method5023(local115);
				local93 = local93 + 1 & 0x1;
			}
		}
		this.aBoolean63 = false;
	}

	@OriginalMember(owner = "client!bba", name = "d", descriptor = "(B)V")
	public void method794() {
		this.aClass89_3 = this.aClass89_1 = this.aClass89_2 = null;
		this.aClass164_Sub3Array1 = null;
		this.aClass1_Sub2_Sub5_2 = null;
		this.aClass164_Sub3_2 = null;
		this.aClass1_Sub2_Sub5_1 = null;
		if (!this.aClass295_5.method7536()) {
			for (@Pc(42) Class1 local42 = this.aClass295_5.method7543(); local42 != this.aClass295_5.aClass1_260; local42 = local42.aClass1_283) {
				((Class1_Sub34) local42).method5021();
			}
		}
		this.anInt765 = this.anInt753 = 1;
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)Z")
	private boolean method795() {
		if (this.aBoolean67) {
			if (this.aClass1_Sub2_Sub5_2 != null) {
				this.aClass1_Sub2_Sub5_2.method1789();
				this.aClass1_Sub2_Sub5_2 = null;
			}
			if (this.aClass164_Sub3_2 != null) {
				this.aClass164_Sub3_2.method8148();
				this.aClass164_Sub3_2 = null;
			}
			if (this.aClass89_1 != null) {
				this.aClass1_Sub2_Sub5_2 = new Class1_Sub2_Sub5(this.aClass4_Sub3_4, 6402, this.anInt765, this.anInt753, this.aClass4_Sub3_4.anInt5791);
			}
			if (this.aBoolean68) {
				this.aClass164_Sub3_2 = new Class164_Sub3(this.aClass4_Sub3_4, 34037, 6402, this.anInt765, this.anInt753);
			} else if (this.aClass1_Sub2_Sub5_2 == null) {
				this.aClass1_Sub2_Sub5_2 = new Class1_Sub2_Sub5(this.aClass4_Sub3_4, 6402, this.anInt765, this.anInt753);
			}
			this.aBoolean64 = true;
			this.aBoolean65 = true;
			this.aBoolean67 = false;
		}
		if (this.aBoolean66) {
			if (this.aClass1_Sub2_Sub5_1 != null) {
				this.aClass1_Sub2_Sub5_1.method1789();
				this.aClass1_Sub2_Sub5_1 = null;
			}
			if (this.aClass164_Sub3Array1[0] != null) {
				this.aClass164_Sub3Array1[0].method8148();
				this.aClass164_Sub3Array1[0] = null;
			}
			if (this.aClass164_Sub3Array1[1] != null) {
				this.aClass164_Sub3Array1[1].method8148();
				this.aClass164_Sub3Array1[1] = null;
			}
			if (this.aClass89_1 != null) {
				this.aClass1_Sub2_Sub5_1 = new Class1_Sub2_Sub5(this.aClass4_Sub3_4, this.anInt770, this.anInt765, this.anInt753, this.aClass4_Sub3_4.anInt5791);
			}
			this.aClass164_Sub3Array1[0] = new Class164_Sub3(this.aClass4_Sub3_4, 34037, this.anInt770, this.anInt765, this.anInt753);
			this.aClass164_Sub3Array1[1] = this.anInt769 > 1 ? new Class164_Sub3(this.aClass4_Sub3_4, 34037, this.anInt770, this.anInt765, this.anInt753) : null;
			this.aBoolean65 = true;
			this.aBoolean66 = false;
			this.aBoolean64 = true;
		}
		if (this.aBoolean65) {
			if (this.aClass89_1 == null) {
				this.aClass4_Sub3_4.method5263(this.aClass89_2);
				this.aClass89_2.method2253(0);
				this.aClass89_2.method2253(1);
				this.aClass89_2.method2253(8);
				this.aClass89_2.method2262(0, this.aClass164_Sub3Array1[0]);
				if (this.anInt769 > 1) {
					this.aClass89_2.method2262(1, this.aClass164_Sub3Array1[1]);
				}
				if (this.aBoolean68) {
					this.aClass89_2.method2262(8, this.aClass164_Sub3_2);
				} else {
					this.aClass89_2.method2256(8, this.aClass1_Sub2_Sub5_2);
				}
				this.aClass4_Sub3_4.method5276(this.aClass89_2);
			} else {
				this.aClass4_Sub3_4.method5263(this.aClass89_2);
				this.aClass89_2.method2253(0);
				this.aClass89_2.method2253(1);
				this.aClass89_2.method2253(8);
				this.aClass89_2.method2262(0, this.aClass164_Sub3Array1[0]);
				if (this.anInt769 > 1) {
					this.aClass89_2.method2262(1, this.aClass164_Sub3Array1[1]);
				}
				if (this.aBoolean68) {
					this.aClass89_2.method2262(8, this.aClass164_Sub3_2);
				}
				this.aClass4_Sub3_4.method5276(this.aClass89_2);
				this.aClass4_Sub3_4.method5263(this.aClass89_1);
				this.aClass89_1.method2253(0);
				this.aClass89_1.method2253(8);
				this.aClass89_1.method2256(0, this.aClass1_Sub2_Sub5_1);
				this.aClass89_1.method2256(8, this.aClass1_Sub2_Sub5_2);
				this.aClass4_Sub3_4.method5276(this.aClass89_1);
			}
			this.aBoolean64 = true;
			this.aBoolean65 = false;
		}
		if (this.aBoolean64) {
			this.aClass4_Sub3_4.method5263(this.aClass89_3);
			this.aBoolean64 = !this.aClass89_3.method2261();
			this.aClass4_Sub3_4.method5276(this.aClass89_3);
		}
		return !this.aBoolean64;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(BLclient!vb;)Z")
	public boolean method797(@OriginalArg(1) Class1_Sub34 arg0) {
		if (this.aClass89_3 != null) {
			if (arg0.method5022() || arg0.method5018()) {
				this.aClass295_5.method7533(arg0);
				this.method788();
				if (this.method795()) {
					if (this.anInt765 != -1 && this.anInt753 != -1) {
						arg0.method5028(this.anInt753, this.anInt765);
					}
					arg0.aBoolean412 = true;
					return true;
				}
			}
			this.method792(arg0);
		}
		return false;
	}
}
