import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class235 {

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "Z")
	private boolean aBoolean609;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!vga;")
	private Class11_Sub2 aClass11_Sub2_4;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "Lclient!wj;")
	private Class3_Sub4_Sub19 aClass3_Sub4_Sub19_1;

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "Lclient!wj;")
	private Class3_Sub4_Sub19 aClass3_Sub4_Sub19_2;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
	private int anInt7206 = 1;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
	private int anInt7209 = 0;

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
	private int anInt7210 = 0;

	@OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
	private int anInt7212 = 1;

	@OriginalMember(owner = "client!ob", name = "n", descriptor = "Lclient!ki;")
	private final Class183 aClass183_45 = new Class183();

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "Z")
	private boolean aBoolean611 = true;

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Z")
	private boolean aBoolean610 = false;

	@OriginalMember(owner = "client!ob", name = "E", descriptor = "I")
	private int anInt7220 = -1;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Z")
	private boolean aBoolean612 = true;

	@OriginalMember(owner = "client!ob", name = "F", descriptor = "Z")
	private boolean aBoolean613 = true;

	@OriginalMember(owner = "client!ob", name = "G", descriptor = "[Lclient!vga;")
	private Class11_Sub2[] aClass11_Sub2Array2 = new Class11_Sub2[2];

	@OriginalMember(owner = "client!ob", name = "K", descriptor = "I")
	private int anInt7222 = 0;

	@OriginalMember(owner = "client!ob", name = "I", descriptor = "Z")
	private boolean aBoolean614 = true;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_25;

	@OriginalMember(owner = "client!ob", name = "r", descriptor = "Lclient!qf;")
	private Class269 aClass269_6;

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "Lclient!qf;")
	private Class269 aClass269_7;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!qf;")
	private Class269 aClass269_5;

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class235(@OriginalArg(0) Class15_Sub3 arg0) {
		this.aClass15_Sub3_25 = arg0;
		if (this.aClass15_Sub3_25.aBoolean444 && this.aClass15_Sub3_25.aBoolean446) {
			this.aClass269_7 = this.aClass269_6 = new Class269(this.aClass15_Sub3_25);
			if (this.aClass15_Sub3_25.anInt5322 > 1 && this.aClass15_Sub3_25.aBoolean461 && this.aClass15_Sub3_25.aBoolean454) {
				this.aClass269_7 = this.aClass269_5 = new Class269(this.aClass15_Sub3_25);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Z")
	private boolean method5999() {
		if (this.aBoolean613) {
			if (this.aClass3_Sub4_Sub19_2 != null) {
				this.aClass3_Sub4_Sub19_2.method8312();
				this.aClass3_Sub4_Sub19_2 = null;
			}
			if (this.aClass11_Sub2_4 != null) {
				this.aClass11_Sub2_4.method7411();
				this.aClass11_Sub2_4 = null;
			}
			if (this.aClass269_5 != null) {
				this.aClass3_Sub4_Sub19_2 = new Class3_Sub4_Sub19(this.aClass15_Sub3_25, 6402, this.anInt7206, this.anInt7212, this.aClass15_Sub3_25.anInt5322);
			}
			if (this.aBoolean610) {
				this.aClass11_Sub2_4 = new Class11_Sub2(this.aClass15_Sub3_25, 34037, 6402, this.anInt7206, this.anInt7212);
			} else if (this.aClass3_Sub4_Sub19_2 == null) {
				this.aClass3_Sub4_Sub19_2 = new Class3_Sub4_Sub19(this.aClass15_Sub3_25, 6402, this.anInt7206, this.anInt7212);
			}
			this.aBoolean613 = false;
			this.aBoolean612 = true;
			this.aBoolean611 = true;
		}
		if (this.aBoolean614) {
			if (this.aClass3_Sub4_Sub19_1 != null) {
				this.aClass3_Sub4_Sub19_1.method8312();
				this.aClass3_Sub4_Sub19_1 = null;
			}
			if (this.aClass11_Sub2Array2[0] != null) {
				this.aClass11_Sub2Array2[0].method7411();
				this.aClass11_Sub2Array2[0] = null;
			}
			if (this.aClass11_Sub2Array2[1] != null) {
				this.aClass11_Sub2Array2[1].method7411();
				this.aClass11_Sub2Array2[1] = null;
			}
			if (this.aClass269_5 != null) {
				this.aClass3_Sub4_Sub19_1 = new Class3_Sub4_Sub19(this.aClass15_Sub3_25, this.anInt7220, this.anInt7206, this.anInt7212, this.aClass15_Sub3_25.anInt5322);
			}
			this.aClass11_Sub2Array2[0] = new Class11_Sub2(this.aClass15_Sub3_25, 34037, this.anInt7220, this.anInt7206, this.anInt7212);
			this.aClass11_Sub2Array2[1] = this.anInt7222 > 1 ? new Class11_Sub2(this.aClass15_Sub3_25, 34037, this.anInt7220, this.anInt7206, this.anInt7212) : null;
			this.aBoolean614 = false;
			this.aBoolean612 = true;
			this.aBoolean611 = true;
		}
		if (this.aBoolean611) {
			if (this.aClass269_5 == null) {
				this.aClass15_Sub3_25.method4384(this.aClass269_6);
				this.aClass269_6.method6783(0);
				this.aClass269_6.method6783(1);
				this.aClass269_6.method6783(8);
				this.aClass269_6.method6781(this.aClass11_Sub2Array2[0], 0);
				if (this.anInt7222 > 1) {
					this.aClass269_6.method6781(this.aClass11_Sub2Array2[1], 1);
				}
				if (this.aBoolean610) {
					this.aClass269_6.method6781(this.aClass11_Sub2_4, 8);
				} else {
					this.aClass269_6.method6779(8, this.aClass3_Sub4_Sub19_2);
				}
				this.aClass15_Sub3_25.method4379(this.aClass269_6);
			} else {
				this.aClass15_Sub3_25.method4384(this.aClass269_6);
				this.aClass269_6.method6783(0);
				this.aClass269_6.method6783(1);
				this.aClass269_6.method6783(8);
				this.aClass269_6.method6781(this.aClass11_Sub2Array2[0], 0);
				if (this.anInt7222 > 1) {
					this.aClass269_6.method6781(this.aClass11_Sub2Array2[1], 1);
				}
				if (this.aBoolean610) {
					this.aClass269_6.method6781(this.aClass11_Sub2_4, 8);
				}
				this.aClass15_Sub3_25.method4379(this.aClass269_6);
				this.aClass15_Sub3_25.method4384(this.aClass269_5);
				this.aClass269_5.method6783(0);
				this.aClass269_5.method6783(8);
				this.aClass269_5.method6779(0, this.aClass3_Sub4_Sub19_1);
				this.aClass269_5.method6779(8, this.aClass3_Sub4_Sub19_2);
				this.aClass15_Sub3_25.method4379(this.aClass269_5);
			}
			this.aBoolean612 = true;
			this.aBoolean611 = false;
		}
		if (this.aBoolean612) {
			this.aClass15_Sub3_25.method4384(this.aClass269_7);
			this.aBoolean612 = !this.aClass269_7.method6773();
			this.aClass15_Sub3_25.method4379(this.aClass269_7);
		}
		return !this.aBoolean612;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!om;)Z")
	public boolean method6001(@OriginalArg(1) Class3_Sub8 arg0) {
		if (this.aClass269_7 != null) {
			if (arg0.method1551() || arg0.method1554()) {
				this.aClass183_45.method4792(arg0);
				this.method6002();
				if (this.method5999()) {
					if (this.anInt7206 != -1 && this.anInt7212 != -1) {
						arg0.method1543(this.anInt7212, this.anInt7206);
					}
					arg0.aBoolean112 = true;
					return true;
				}
			}
			this.method6005(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	private void method6002() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class3_Sub8 local23 = (Class3_Sub8) this.aClass183_45.method4795(); local23 != null; local23 = (Class3_Sub8) this.aClass183_45.method4793()) {
			local29 = local23.method1549();
			if (local29 > local9) {
				local9 = local29;
			}
			local11 += local23.method1553();
			local7 |= local23.method1546();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt7220) {
			this.aBoolean614 = true;
			this.anInt7220 = local29;
		}
		@Pc(91) int local91 = this.anInt7222 > 2 ? 2 : this.anInt7222;
		@Pc(100) int local100 = local11 <= 2 ? local11 : 2;
		if (local100 != local91) {
			this.aBoolean611 = this.aBoolean614 = true;
		}
		if (local7 != this.aBoolean610) {
			this.aBoolean610 = local7;
			this.aBoolean613 = true;
		}
		this.anInt7222 = local11;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	public void method6003() {
		this.aClass269_7 = this.aClass269_5 = this.aClass269_6 = null;
		this.aClass11_Sub2Array2 = null;
		this.aClass11_Sub2_4 = null;
		this.aClass3_Sub4_Sub19_1 = null;
		this.aClass3_Sub4_Sub19_2 = null;
		if (!this.aClass183_45.method4798()) {
			for (@Pc(51) Class3 local51 = this.aClass183_45.method4795(); local51 != this.aClass183_45.aClass3_161; local51 = local51.aClass3_288) {
				((Class3_Sub8) local51).method1548();
			}
		}
		this.anInt7206 = this.anInt7212 = 1;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(ILclient!om;)V")
	public void method6005(@OriginalArg(1) Class3_Sub8 arg0) {
		arg0.aBoolean112 = false;
		arg0.method1548();
		arg0.method8412();
		this.method6002();
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZIIII)Z")
	public boolean method6007(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass269_7 == null || this.aClass183_45.method4798()) {
			return false;
		}
		if (this.anInt7206 != arg3 || arg2 != this.anInt7212) {
			this.anInt7212 = arg2;
			this.anInt7206 = arg3;
			for (@Pc(42) Class3 local42 = this.aClass183_45.method4795(); local42 != this.aClass183_45.aClass3_161; local42 = local42.aClass3_288) {
				((Class3_Sub8) local42).method1543(this.anInt7212, this.anInt7206);
			}
			this.aBoolean611 = true;
			this.aBoolean614 = true;
			this.aBoolean613 = true;
		}
		if (!this.method5999()) {
			return false;
		}
		this.aBoolean609 = true;
		this.anInt7210 = arg1;
		this.anInt7209 = arg0;
		this.aClass15_Sub3_25.method4384(this.aClass269_7);
		this.aClass269_7.method6780(0);
		this.aClass15_Sub3_25.method4399(-this.anInt7210, this.anInt7209 + this.anInt7212 - this.aClass15_Sub3_25.lb);
		return true;
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)V")
	public void method6008() {
		if (!this.aBoolean609) {
			return;
		}
		if (this.aClass269_5 != null) {
			this.aClass15_Sub3_25.method4454(this.aClass269_5);
			@Pc(18) short local18 = 16384;
			this.aClass15_Sub3_25.method4391(this.aClass269_6);
			this.aClass269_5.method6775();
			this.aClass269_6.method6780(0);
			if (this.aBoolean610) {
				local18 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt7206, this.anInt7212, 0, 0, this.anInt7206, this.anInt7212, local18, 9728);
			this.aClass15_Sub3_25.method4408(this.aClass269_5);
			this.aClass15_Sub3_25.method4431(this.aClass269_6);
		}
		this.aClass15_Sub3_25.method4430();
		this.aClass15_Sub3_25.method4392(0);
		this.aClass15_Sub3_25.method4432(1);
		this.aClass15_Sub3_25.F();
		@Pc(87) int local87 = 0;
		@Pc(89) int local89 = 1;
		@Pc(108) Class3_Sub8 local108;
		for (@Pc(101) Class3_Sub8 local101 = (Class3_Sub8) this.aClass183_45.method4795(); local101 != null; local101 = local108) {
			local108 = (Class3_Sub8) this.aClass183_45.method4793();
			@Pc(112) int local112 = local101.method1553();
			for (@Pc(114) int local114 = 0; local114 < local112; local114++) {
				local101.method1550(this.aClass11_Sub2_4, this.aClass11_Sub2Array2[local87], local114);
				if (local108 == null && local112 - 1 == local114) {
					this.aClass15_Sub3_25.method4379(this.aClass269_6);
					this.aClass15_Sub3_25.method4399(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7212);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7210, this.anInt7209);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7210, this.anInt7212 + this.anInt7209);
					OpenGL.glTexCoord2f((float) this.anInt7206, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7210 + this.anInt7206, this.anInt7209 - -this.anInt7212);
					OpenGL.glTexCoord2f((float) this.anInt7206, (float) this.anInt7212);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7206 + this.anInt7210, this.anInt7209);
					OpenGL.glEnd();
				} else {
					this.aClass269_6.method6780(local89);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7212);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt7212);
					OpenGL.glTexCoord2f((float) this.anInt7206, (float) this.anInt7212);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7206, this.anInt7212);
					OpenGL.glTexCoord2f((float) this.anInt7206, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7206, 0);
					OpenGL.glEnd();
				}
				local101.method1544(local114);
				local87 = local87 + 1 & 0x1;
				local89 = local89 + 1 & 0x1;
			}
		}
		this.aBoolean609 = false;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Z")
	public boolean method6009() {
		return this.aClass269_7 != null;
	}
}
