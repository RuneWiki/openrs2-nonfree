import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class39 {

	@OriginalMember(owner = "client!bo", name = "p", descriptor = "Z")
	private boolean aBoolean79;

	@OriginalMember(owner = "client!bo", name = "E", descriptor = "Lclient!df;")
	private Class3_Sub5_Sub5 aClass3_Sub5_Sub5_1;

	@OriginalMember(owner = "client!bo", name = "F", descriptor = "Lclient!rba;")
	private Class10_Sub2 aClass10_Sub2_1;

	@OriginalMember(owner = "client!bo", name = "H", descriptor = "Lclient!df;")
	private Class3_Sub5_Sub5 aClass3_Sub5_Sub5_2;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	private int anInt1160 = 0;

	@OriginalMember(owner = "client!bo", name = "e", descriptor = "I")
	private int anInt1159 = 1;

	@OriginalMember(owner = "client!bo", name = "t", descriptor = "I")
	private int anInt1168 = 0;

	@OriginalMember(owner = "client!bo", name = "v", descriptor = "I")
	private int anInt1169 = 1;

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "Lclient!qw;")
	private final Class302 aClass302_5 = new Class302();

	@OriginalMember(owner = "client!bo", name = "z", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!bo", name = "y", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!bo", name = "B", descriptor = "Z")
	private boolean aBoolean83 = true;

	@OriginalMember(owner = "client!bo", name = "D", descriptor = "I")
	private int anInt1173 = -1;

	@OriginalMember(owner = "client!bo", name = "x", descriptor = "Z")
	private boolean aBoolean80 = false;

	@OriginalMember(owner = "client!bo", name = "G", descriptor = "I")
	private int anInt1174 = 0;

	@OriginalMember(owner = "client!bo", name = "J", descriptor = "Z")
	private boolean aBoolean84 = true;

	@OriginalMember(owner = "client!bo", name = "I", descriptor = "[Lclient!rba;")
	private Class10_Sub2[] aClass10_Sub2Array1 = new Class10_Sub2[2];

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_7;

	@OriginalMember(owner = "client!bo", name = "u", descriptor = "Lclient!gea;")
	private Class127 aClass127_3;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Lclient!gea;")
	private Class127 aClass127_2;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "Lclient!gea;")
	private Class127 aClass127_1;

	@OriginalMember(owner = "client!bo", name = "<init>", descriptor = "(Lclient!lf;)V")
	public Class39(@OriginalArg(0) Class95_Sub3 arg0) {
		this.aClass95_Sub3_7 = arg0;
		if (this.aClass95_Sub3_7.aBoolean392 && this.aClass95_Sub3_7.aBoolean384) {
			this.aClass127_2 = this.aClass127_3 = new Class127(this.aClass95_Sub3_7);
			if (this.aClass95_Sub3_7.anInt5748 > 1 && this.aClass95_Sub3_7.aBoolean370 && this.aClass95_Sub3_7.aBoolean379) {
				this.aClass127_2 = this.aClass127_1 = new Class127(this.aClass95_Sub3_7);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)Z")
	public boolean method1039() {
		return this.aClass127_2 != null;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(Lclient!ov;I)V")
	public void method1040(@OriginalArg(0) Class3_Sub36 arg0) {
		arg0.aBoolean459 = false;
		arg0.method5562();
		arg0.method9034();
		this.method1042();
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(B)V")
	private void method1042() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub36 local17 = (Class3_Sub36) this.aClass302_5.method6603(); local17 != null; local17 = (Class3_Sub36) this.aClass302_5.method6605()) {
			local23 = local17.method5561();
			local11 += local17.method5568();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method5566();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt1173) {
			this.aBoolean83 = true;
			this.anInt1173 = local23;
		}
		@Pc(95) int local95 = this.anInt1174 <= 2 ? this.anInt1174 : 2;
		@Pc(102) int local102 = local11 > 2 ? 2 : local11;
		if (local7 != this.aBoolean80) {
			this.aBoolean82 = true;
			this.aBoolean80 = local7;
		}
		if (local102 != local95) {
			this.aBoolean84 = this.aBoolean83 = true;
		}
		this.anInt1174 = local11;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V")
	public void method1043() {
		this.aClass10_Sub2_1 = null;
		this.aClass3_Sub5_Sub5_1 = null;
		this.aClass3_Sub5_Sub5_2 = null;
		this.aClass127_2 = this.aClass127_1 = this.aClass127_3 = null;
		this.aClass10_Sub2Array1 = null;
		if (!this.aClass302_5.method6612()) {
			for (@Pc(40) Class3 local40 = this.aClass302_5.method6603(); local40 != this.aClass302_5.aClass3_241; local40 = local40.aClass3_337) {
				((Class3_Sub36) local40).method5562();
			}
		}
		this.anInt1159 = this.anInt1169 = 1;
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(IIIII)Z")
	public boolean method1044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass127_2 == null || this.aClass302_5.method6612()) {
			return false;
		}
		if (arg1 != this.anInt1159 || this.anInt1169 != arg3) {
			this.anInt1159 = arg1;
			this.anInt1169 = arg3;
			for (@Pc(38) Class3 local38 = this.aClass302_5.method6603(); local38 != this.aClass302_5.aClass3_241; local38 = local38.aClass3_337) {
				((Class3_Sub36) local38).method5559(this.anInt1159, this.anInt1169);
			}
			this.aBoolean82 = true;
			this.aBoolean84 = true;
			this.aBoolean83 = true;
		}
		if (!this.method1048()) {
			return false;
		}
		this.anInt1168 = arg0;
		this.aBoolean79 = true;
		this.anInt1160 = arg2;
		this.aClass95_Sub3_7.method4863(this.aClass127_2);
		this.aClass127_2.method2987(0);
		this.aClass95_Sub3_7.method4890(-this.anInt1160, this.anInt1168 + this.anInt1169 - this.aClass95_Sub3_7.anInt5669);
		return true;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Z)V")
	public void method1045() {
		if (!this.aBoolean79) {
			return;
		}
		if (this.aClass127_1 != null) {
			this.aClass95_Sub3_7.method4878(this.aClass127_1);
			@Pc(20) short local20 = 16384;
			this.aClass95_Sub3_7.method4905(this.aClass127_3);
			this.aClass127_1.method2981();
			this.aClass127_3.method2987(0);
			if (this.aBoolean80) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1159, this.anInt1169, 0, 0, this.anInt1159, this.anInt1169, local20, 9728);
			this.aClass95_Sub3_7.method4875(this.aClass127_1);
			this.aClass95_Sub3_7.method4855(this.aClass127_3);
		}
		this.aClass95_Sub3_7.method4867();
		this.aClass95_Sub3_7.method4833(0);
		this.aClass95_Sub3_7.method4870(1);
		this.aClass95_Sub3_7.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class3_Sub36 local105;
		for (@Pc(97) Class3_Sub36 local97 = (Class3_Sub36) this.aClass302_5.method6603(); local97 != null; local97 = local105) {
			local105 = (Class3_Sub36) this.aClass302_5.method6605();
			@Pc(109) int local109 = local97.method5568();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method5560(this.aClass10_Sub2Array1[local89], this.aClass10_Sub2_1, local111);
				if (local105 == null && local109 - 1 == local111) {
					this.aClass95_Sub3_7.method4836(this.aClass127_3);
					this.aClass95_Sub3_7.method4890(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1169);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1160, this.anInt1168);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1160, this.anInt1168 + this.anInt1169);
					OpenGL.glTexCoord2f((float) this.anInt1159, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1159 + this.anInt1160, this.anInt1169 + this.anInt1168);
					OpenGL.glTexCoord2f((float) this.anInt1159, (float) this.anInt1169);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1159 + this.anInt1160, this.anInt1168);
					OpenGL.glEnd();
				} else {
					this.aClass127_3.method2987(--local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1169);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt1169);
					OpenGL.glTexCoord2f((float) this.anInt1159, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1159, this.anInt1169);
					OpenGL.glTexCoord2f((float) this.anInt1159, (float) this.anInt1169);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1159, 0);
					OpenGL.glEnd();
				}
				local89 = local89 + 1 & 0x1;
				local97.method5569(local111);
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean79 = false;
	}

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "(I)Z")
	private boolean method1048() {
		if (this.aBoolean82) {
			if (this.aClass3_Sub5_Sub5_2 != null) {
				this.aClass3_Sub5_Sub5_2.method1686();
				this.aClass3_Sub5_Sub5_2 = null;
			}
			if (this.aClass10_Sub2_1 != null) {
				this.aClass10_Sub2_1.method6094();
				this.aClass10_Sub2_1 = null;
			}
			if (this.aClass127_1 != null) {
				this.aClass3_Sub5_Sub5_2 = new Class3_Sub5_Sub5(this.aClass95_Sub3_7, 6402, this.anInt1159, this.anInt1169, this.aClass95_Sub3_7.anInt5748);
			}
			if (this.aBoolean80) {
				this.aClass10_Sub2_1 = new Class10_Sub2(this.aClass95_Sub3_7, 34037, 6402, this.anInt1159, this.anInt1169);
			} else if (this.aClass3_Sub5_Sub5_2 == null) {
				this.aClass3_Sub5_Sub5_2 = new Class3_Sub5_Sub5(this.aClass95_Sub3_7, 6402, this.anInt1159, this.anInt1169);
			}
			this.aBoolean81 = true;
			this.aBoolean82 = false;
			this.aBoolean84 = true;
		}
		if (this.aBoolean83) {
			if (this.aClass3_Sub5_Sub5_1 != null) {
				this.aClass3_Sub5_Sub5_1.method1686();
				this.aClass3_Sub5_Sub5_1 = null;
			}
			if (this.aClass10_Sub2Array1[0] != null) {
				this.aClass10_Sub2Array1[0].method6094();
				this.aClass10_Sub2Array1[0] = null;
			}
			if (this.aClass10_Sub2Array1[1] != null) {
				this.aClass10_Sub2Array1[1].method6094();
				this.aClass10_Sub2Array1[1] = null;
			}
			if (this.aClass127_1 != null) {
				this.aClass3_Sub5_Sub5_1 = new Class3_Sub5_Sub5(this.aClass95_Sub3_7, this.anInt1173, this.anInt1159, this.anInt1169, this.aClass95_Sub3_7.anInt5748);
			}
			this.aClass10_Sub2Array1[0] = new Class10_Sub2(this.aClass95_Sub3_7, 34037, this.anInt1173, this.anInt1159, this.anInt1169);
			this.aClass10_Sub2Array1[1] = this.anInt1174 > 1 ? new Class10_Sub2(this.aClass95_Sub3_7, 34037, this.anInt1173, this.anInt1159, this.anInt1169) : null;
			this.aBoolean83 = false;
			this.aBoolean84 = true;
			this.aBoolean81 = true;
		}
		if (this.aBoolean84) {
			if (this.aClass127_1 == null) {
				this.aClass95_Sub3_7.method4863(this.aClass127_3);
				this.aClass127_3.method2983(0);
				this.aClass127_3.method2983(1);
				this.aClass127_3.method2983(8);
				this.aClass127_3.method2978(0, this.aClass10_Sub2Array1[0]);
				if (this.anInt1174 > 1) {
					this.aClass127_3.method2978(1, this.aClass10_Sub2Array1[1]);
				}
				if (this.aBoolean80) {
					this.aClass127_3.method2978(8, this.aClass10_Sub2_1);
				} else {
					this.aClass127_3.method2986(this.aClass3_Sub5_Sub5_2, 8);
				}
				this.aClass95_Sub3_7.method4836(this.aClass127_3);
			} else {
				this.aClass95_Sub3_7.method4863(this.aClass127_3);
				this.aClass127_3.method2983(0);
				this.aClass127_3.method2983(1);
				this.aClass127_3.method2983(8);
				this.aClass127_3.method2978(0, this.aClass10_Sub2Array1[0]);
				if (this.anInt1174 > 1) {
					this.aClass127_3.method2978(1, this.aClass10_Sub2Array1[1]);
				}
				if (this.aBoolean80) {
					this.aClass127_3.method2978(8, this.aClass10_Sub2_1);
				}
				this.aClass95_Sub3_7.method4836(this.aClass127_3);
				this.aClass95_Sub3_7.method4863(this.aClass127_1);
				this.aClass127_1.method2983(0);
				this.aClass127_1.method2983(8);
				this.aClass127_1.method2986(this.aClass3_Sub5_Sub5_1, 0);
				this.aClass127_1.method2986(this.aClass3_Sub5_Sub5_2, 8);
				this.aClass95_Sub3_7.method4836(this.aClass127_1);
			}
			this.aBoolean81 = true;
			this.aBoolean84 = false;
		}
		if (this.aBoolean81) {
			this.aClass95_Sub3_7.method4863(this.aClass127_2);
			this.aBoolean81 = !this.aClass127_2.method2988();
			this.aClass95_Sub3_7.method4836(this.aClass127_2);
		}
		return !this.aBoolean81;
	}

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "(Lclient!ov;I)Z")
	public boolean method1049(@OriginalArg(0) Class3_Sub36 arg0) {
		if (this.aClass127_2 != null) {
			if (arg0.method5570() || arg0.method5564()) {
				this.aClass302_5.method6613(arg0);
				this.method1042();
				if (this.method1048()) {
					if (this.anInt1159 != -1 && this.anInt1169 != -1) {
						arg0.method5559(this.anInt1159, this.anInt1169);
					}
					arg0.aBoolean459 = true;
					return true;
				}
			}
			this.method1040(arg0);
		}
		return false;
	}
}
