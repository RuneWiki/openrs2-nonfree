import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public final class Class120 {

	@OriginalMember(owner = "client!gw", name = "j", descriptor = "Z")
	private boolean aBoolean274;

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "Lclient!laa;")
	private Class3_Sub7_Sub14 aClass3_Sub7_Sub14_1;

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "Lclient!wh;")
	private Class50_Sub1 aClass50_Sub1_3;

	@OriginalMember(owner = "client!gw", name = "F", descriptor = "Lclient!laa;")
	private Class3_Sub7_Sub14 aClass3_Sub7_Sub14_2;

	@OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
	private int anInt4005 = 0;

	@OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
	private int anInt4010 = 0;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	private int anInt4011 = 1;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
	private int anInt4012 = 1;

	@OriginalMember(owner = "client!gw", name = "n", descriptor = "Lclient!or;")
	private final Class244 aClass244_36 = new Class244();

	@OriginalMember(owner = "client!gw", name = "A", descriptor = "Z")
	private boolean aBoolean276 = true;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "I")
	private int anInt4014 = 0;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "Z")
	private boolean aBoolean278 = false;

	@OriginalMember(owner = "client!gw", name = "I", descriptor = "I")
	private int anInt4015 = -1;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "Z")
	private boolean aBoolean275 = true;

	@OriginalMember(owner = "client!gw", name = "C", descriptor = "Z")
	private boolean aBoolean277 = true;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "[Lclient!wh;")
	private Class50_Sub1[] aClass50_Sub1Array3 = new Class50_Sub1[2];

	@OriginalMember(owner = "client!gw", name = "J", descriptor = "Z")
	private boolean aBoolean279 = true;

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_17;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "Lclient!nb;")
	private Class219 aClass219_4;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "Lclient!nb;")
	private Class219 aClass219_3;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "Lclient!nb;")
	private Class219 aClass219_5;

	@OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class120(@OriginalArg(0) Class31_Sub2 arg0) {
		this.aClass31_Sub2_17 = arg0;
		if (this.aClass31_Sub2_17.aBoolean229 && this.aClass31_Sub2_17.aBoolean219) {
			this.aClass219_3 = this.aClass219_4 = new Class219(this.aClass31_Sub2_17);
			if (this.aClass31_Sub2_17.anInt3129 > 1 && this.aClass31_Sub2_17.aBoolean213 && this.aClass31_Sub2_17.aBoolean214) {
				this.aClass219_3 = this.aClass219_5 = new Class219(this.aClass31_Sub2_17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	private void method3247() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(15) int local15 = 0;
		@Pc(27) int local27;
		for (@Pc(21) Class3_Sub23 local21 = (Class3_Sub23) this.aClass244_36.method5572(); local21 != null; local21 = (Class3_Sub23) this.aClass244_36.method5576()) {
			local27 = local21.method6444();
			if (local27 > local9) {
				local9 = local27;
			}
			local15 += local21.method6436();
			local7 |= local21.method6442();
		}
		if (local9 == 2) {
			local27 = 34836;
		} else if (local9 == 1) {
			local27 = 34842;
		} else {
			local27 = 6408;
		}
		if (local27 != this.anInt4015) {
			this.anInt4015 = local27;
			this.aBoolean275 = true;
		}
		@Pc(101) int local101 = this.anInt4014 <= 2 ? this.anInt4014 : 2;
		@Pc(110) int local110 = local15 <= 2 ? local15 : 2;
		this.anInt4014 = local15;
		if (local101 != local110) {
			this.aBoolean276 = this.aBoolean275 = true;
		}
		if (local7 != this.aBoolean278) {
			this.aBoolean279 = true;
			this.aBoolean278 = local7;
		}
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(B)Z")
	private boolean method3248() {
		if (this.aBoolean279) {
			if (this.aClass3_Sub7_Sub14_2 != null) {
				this.aClass3_Sub7_Sub14_2.method4528();
				this.aClass3_Sub7_Sub14_2 = null;
			}
			if (this.aClass50_Sub1_3 != null) {
				this.aClass50_Sub1_3.method6157();
				this.aClass50_Sub1_3 = null;
			}
			if (this.aClass219_5 != null) {
				this.aClass3_Sub7_Sub14_2 = new Class3_Sub7_Sub14(this.aClass31_Sub2_17, 6402, this.anInt4012, this.anInt4011, this.aClass31_Sub2_17.anInt3129);
			}
			if (this.aBoolean278) {
				this.aClass50_Sub1_3 = new Class50_Sub1(this.aClass31_Sub2_17, 34037, 6402, this.anInt4012, this.anInt4011);
			} else if (this.aClass3_Sub7_Sub14_2 == null) {
				this.aClass3_Sub7_Sub14_2 = new Class3_Sub7_Sub14(this.aClass31_Sub2_17, 6402, this.anInt4012, this.anInt4011);
			}
			this.aBoolean277 = true;
			this.aBoolean276 = true;
			this.aBoolean279 = false;
		}
		if (this.aBoolean275) {
			if (this.aClass3_Sub7_Sub14_1 != null) {
				this.aClass3_Sub7_Sub14_1.method4528();
				this.aClass3_Sub7_Sub14_1 = null;
			}
			if (this.aClass50_Sub1Array3[0] != null) {
				this.aClass50_Sub1Array3[0].method6157();
				this.aClass50_Sub1Array3[0] = null;
			}
			if (this.aClass50_Sub1Array3[1] != null) {
				this.aClass50_Sub1Array3[1].method6157();
				this.aClass50_Sub1Array3[1] = null;
			}
			if (this.aClass219_5 != null) {
				this.aClass3_Sub7_Sub14_1 = new Class3_Sub7_Sub14(this.aClass31_Sub2_17, this.anInt4015, this.anInt4012, this.anInt4011, this.aClass31_Sub2_17.anInt3129);
			}
			this.aClass50_Sub1Array3[0] = new Class50_Sub1(this.aClass31_Sub2_17, 34037, this.anInt4015, this.anInt4012, this.anInt4011);
			this.aClass50_Sub1Array3[1] = this.anInt4014 > 1 ? new Class50_Sub1(this.aClass31_Sub2_17, 34037, this.anInt4015, this.anInt4012, this.anInt4011) : null;
			this.aBoolean277 = true;
			this.aBoolean276 = true;
			this.aBoolean275 = false;
		}
		if (this.aBoolean276) {
			if (this.aClass219_5 == null) {
				this.aClass31_Sub2_17.method2560(this.aClass219_4);
				this.aClass219_4.method5042(0);
				this.aClass219_4.method5042(1);
				this.aClass219_4.method5042(8);
				this.aClass219_4.method5044(0, this.aClass50_Sub1Array3[0]);
				if (this.anInt4014 > 1) {
					this.aClass219_4.method5044(1, this.aClass50_Sub1Array3[1]);
				}
				if (this.aBoolean278) {
					this.aClass219_4.method5044(8, this.aClass50_Sub1_3);
				} else {
					this.aClass219_4.method5041(8, this.aClass3_Sub7_Sub14_2);
				}
				this.aClass31_Sub2_17.method2507(this.aClass219_4);
			} else {
				this.aClass31_Sub2_17.method2560(this.aClass219_4);
				this.aClass219_4.method5042(0);
				this.aClass219_4.method5042(1);
				this.aClass219_4.method5042(8);
				this.aClass219_4.method5044(0, this.aClass50_Sub1Array3[0]);
				if (this.anInt4014 > 1) {
					this.aClass219_4.method5044(1, this.aClass50_Sub1Array3[1]);
				}
				if (this.aBoolean278) {
					this.aClass219_4.method5044(8, this.aClass50_Sub1_3);
				}
				this.aClass31_Sub2_17.method2507(this.aClass219_4);
				this.aClass31_Sub2_17.method2560(this.aClass219_5);
				this.aClass219_5.method5042(0);
				this.aClass219_5.method5042(8);
				this.aClass219_5.method5041(0, this.aClass3_Sub7_Sub14_1);
				this.aClass219_5.method5041(8, this.aClass3_Sub7_Sub14_2);
				this.aClass31_Sub2_17.method2507(this.aClass219_5);
			}
			this.aBoolean276 = false;
			this.aBoolean277 = true;
		}
		if (this.aBoolean277) {
			this.aClass31_Sub2_17.method2560(this.aClass219_3);
			this.aBoolean277 = !this.aClass219_3.method5046();
			this.aClass31_Sub2_17.method2507(this.aClass219_3);
		}
		return !this.aBoolean277;
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)V")
	public void method3249() {
		if (!this.aBoolean274) {
			return;
		}
		if (this.aClass219_5 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass31_Sub2_17.method2558(this.aClass219_5);
			this.aClass31_Sub2_17.method2555(this.aClass219_4);
			this.aClass219_5.method5047();
			this.aClass219_4.method5043(0);
			if (this.aBoolean278) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4012, this.anInt4011, 0, 0, this.anInt4012, this.anInt4011, local14, 9728);
			this.aClass31_Sub2_17.method2503(this.aClass219_5);
			this.aClass31_Sub2_17.method2533(this.aClass219_4);
		}
		this.aClass31_Sub2_17.method2501();
		this.aClass31_Sub2_17.method2568(0);
		this.aClass31_Sub2_17.method2495(1);
		this.aClass31_Sub2_17.JA();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 1;
		@Pc(116) Class3_Sub23 local116;
		for (@Pc(106) Class3_Sub23 local106 = (Class3_Sub23) this.aClass244_36.method5572(); local106 != null; local106 = local116) {
			local116 = (Class3_Sub23) this.aClass244_36.method5576();
			@Pc(120) int local120 = local106.method6436();
			for (@Pc(122) int local122 = 0; local122 < local120; local122++) {
				local106.method6438(local122, this.aClass50_Sub1Array3[local98], this.aClass50_Sub1_3);
				if (local116 == null && local120 - 1 == local122) {
					this.aClass31_Sub2_17.method2507(this.aClass219_4);
					this.aClass31_Sub2_17.method2514(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4011);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4005, this.anInt4010);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4005, this.anInt4011 + this.anInt4010);
					OpenGL.glTexCoord2f((float) this.anInt4012, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4005 + this.anInt4012, this.anInt4010 + this.anInt4011);
					OpenGL.glTexCoord2f((float) this.anInt4012, (float) this.anInt4011);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4012 + this.anInt4005, this.anInt4010);
					OpenGL.glEnd();
				} else {
					this.aClass219_4.method5043(local100);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4011);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4011);
					OpenGL.glTexCoord2f((float) this.anInt4012, (float) this.anInt4011);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4012, this.anInt4011);
					OpenGL.glTexCoord2f((float) this.anInt4012, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4012, 0);
					OpenGL.glEnd();
				}
				local106.method6440(local122);
				local98 = local98 + 1 & 0x1;
				local100 = local100 + 1 & 0x1;
			}
		}
		this.aBoolean274 = false;
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "(B)V")
	public void method3250() {
		this.aClass3_Sub7_Sub14_2 = null;
		this.aClass50_Sub1_3 = null;
		this.aClass219_3 = this.aClass219_5 = this.aClass219_4 = null;
		this.aClass50_Sub1Array3 = null;
		this.aClass3_Sub7_Sub14_1 = null;
		if (!this.aClass244_36.method5571()) {
			for (@Pc(42) Class3 local42 = this.aClass244_36.method5572(); local42 != this.aClass244_36.aClass3_189; local42 = local42.aClass3_285) {
				((Class3_Sub23) local42).method6441();
			}
		}
		this.anInt4012 = this.anInt4011 = 1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!gl;I)Z")
	public boolean method3252(@OriginalArg(0) Class3_Sub23 arg0) {
		if (this.aClass219_3 != null) {
			if (arg0.method6434() || arg0.method6437()) {
				this.aClass244_36.method5570(arg0);
				this.method3247();
				if (this.method3248()) {
					if (this.anInt4012 != -1 && this.anInt4011 != -1) {
						arg0.method6443(this.anInt4011, this.anInt4012);
					}
					arg0.aBoolean564 = true;
					return true;
				}
			}
			this.method3257(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)Z")
	public boolean method3253() {
		return this.aClass219_3 != null;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIII)Z")
	public boolean method3254(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass219_3 == null || this.aClass244_36.method5571()) {
			return false;
		}
		if (this.anInt4012 != arg0 || arg3 != this.anInt4011) {
			this.anInt4011 = arg3;
			this.anInt4012 = arg0;
			for (@Pc(42) Class3 local42 = this.aClass244_36.method5572(); local42 != this.aClass244_36.aClass3_189; local42 = local42.aClass3_285) {
				((Class3_Sub23) local42).method6443(this.anInt4011, this.anInt4012);
			}
			this.aBoolean279 = true;
			this.aBoolean275 = true;
			this.aBoolean276 = true;
		}
		if (!this.method3248()) {
			return false;
		}
		this.anInt4005 = arg1;
		this.anInt4010 = arg2;
		this.aBoolean274 = true;
		this.aClass31_Sub2_17.method2560(this.aClass219_3);
		this.aClass219_3.method5043(0);
		this.aClass31_Sub2_17.method2514(this.anInt4011 + this.anInt4010 - this.aClass31_Sub2_17.anInt3063, -this.anInt4005);
		return true;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(Lclient!gl;I)V")
	public void method3257(@OriginalArg(0) Class3_Sub23 arg0) {
		arg0.aBoolean564 = false;
		arg0.method6441();
		arg0.method8128();
		this.method3247();
	}
}
