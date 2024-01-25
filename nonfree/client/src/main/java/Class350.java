import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class350 {

	@OriginalMember(owner = "client!vd", name = "j", descriptor = "Z")
	private boolean aBoolean820;

	@OriginalMember(owner = "client!vd", name = "x", descriptor = "Lclient!hga;")
	private Class121_Sub2 aClass121_Sub2_6;

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "Lclient!gk;")
	private Class3_Sub1_Sub5 aClass3_Sub1_Sub5_1;

	@OriginalMember(owner = "client!vd", name = "H", descriptor = "Lclient!gk;")
	private Class3_Sub1_Sub5 aClass3_Sub1_Sub5_2;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
	private int anInt9923 = 0;

	@OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
	private int anInt9928 = 0;

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
	private int anInt9925 = 1;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "I")
	private int anInt9929 = 1;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!qia;")
	private final Class276 aClass276_61 = new Class276();

	@OriginalMember(owner = "client!vd", name = "y", descriptor = "Z")
	private boolean aBoolean822 = false;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "I")
	private int anInt9930 = 0;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "Z")
	private boolean aBoolean825 = true;

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
	private int anInt9931 = -1;

	@OriginalMember(owner = "client!vd", name = "G", descriptor = "[Lclient!hga;")
	private Class121_Sub2[] aClass121_Sub2Array4 = new Class121_Sub2[2];

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Z")
	private boolean aBoolean826 = true;

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Z")
	private boolean aBoolean823 = true;

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Z")
	private boolean aBoolean824 = true;

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_41;

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!tt;")
	private Class324 aClass324_5;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!tt;")
	private Class324 aClass324_6;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!tt;")
	private Class324 aClass324_7;

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class350(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_41 = arg0;
		if (this.aClass33_Sub3_41.aBoolean273 && this.aClass33_Sub3_41.aBoolean262) {
			this.aClass324_6 = this.aClass324_5 = new Class324(this.aClass33_Sub3_41);
			if (this.aClass33_Sub3_41.anInt3415 > 1 && this.aClass33_Sub3_41.aBoolean268 && this.aClass33_Sub3_41.aBoolean261) {
				this.aClass324_6 = this.aClass324_7 = new Class324(this.aClass33_Sub3_41);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public void method8143() {
		this.aClass324_6 = this.aClass324_7 = this.aClass324_5 = null;
		this.aClass121_Sub2Array4 = null;
		this.aClass3_Sub1_Sub5_1 = null;
		this.aClass121_Sub2_6 = null;
		this.aClass3_Sub1_Sub5_2 = null;
		if (!this.aClass276_61.method6908()) {
			for (@Pc(38) Class3 local38 = this.aClass276_61.method6907(); local38 != this.aClass276_61.aClass3_231; local38 = local38.aClass3_300) {
				((Class3_Sub21) local38).method3428();
			}
		}
		this.anInt9925 = this.anInt9929 = 1;
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	private void method8144() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub21 local17 = (Class3_Sub21) this.aClass276_61.method6907(); local17 != null; local17 = (Class3_Sub21) this.aClass276_61.method6912()) {
			local23 = local17.method3426();
			local11 += local17.method3425();
			if (local23 > local9) {
				local9 = local23;
			}
			local7 |= local17.method3430();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt9931) {
			this.anInt9931 = local23;
			this.aBoolean825 = true;
		}
		@Pc(90) int local90 = this.anInt9930 > 2 ? 2 : this.anInt9930;
		@Pc(97) int local97 = local11 > 2 ? 2 : local11;
		if (local97 != local90) {
			this.aBoolean824 = this.aBoolean825 = true;
		}
		if (local7 != this.aBoolean822) {
			this.aBoolean822 = local7;
			this.aBoolean823 = true;
		}
		this.anInt9930 = local11;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!mt;B)V")
	public void method8146(@OriginalArg(0) Class3_Sub21 arg0) {
		arg0.aBoolean334 = false;
		arg0.method3428();
		arg0.method8671();
		this.method8144();
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lclient!mt;I)Z")
	public boolean method8147(@OriginalArg(0) Class3_Sub21 arg0) {
		if (this.aClass324_6 != null) {
			if (arg0.method3427() || arg0.method3429()) {
				this.aClass276_61.method6906(arg0);
				this.method8144();
				if (this.method8150()) {
					if (this.anInt9925 != -1 && this.anInt9929 != -1) {
						arg0.method3424(this.anInt9925, this.anInt9929);
					}
					arg0.aBoolean334 = true;
					return true;
				}
			}
			this.method8146(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)Z")
	public boolean method8148(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass324_6 == null || this.aClass276_61.method6908()) {
			return false;
		}
		if (this.anInt9925 != arg1 || arg2 != this.anInt9929) {
			this.anInt9929 = arg2;
			this.anInt9925 = arg1;
			for (@Pc(52) Class3 local52 = this.aClass276_61.method6907(); local52 != this.aClass276_61.aClass3_231; local52 = local52.aClass3_300) {
				((Class3_Sub21) local52).method3424(this.anInt9925, this.anInt9929);
			}
			this.aBoolean824 = true;
			this.aBoolean823 = true;
			this.aBoolean825 = true;
		}
		if (!this.method8150()) {
			return false;
		}
		this.aBoolean820 = true;
		this.anInt9923 = arg3;
		this.anInt9928 = arg0;
		this.aClass33_Sub3_41.method3050(this.aClass324_6);
		this.aClass324_6.method7842(0);
		this.aClass33_Sub3_41.method3070(-this.anInt9928, this.anInt9923 + this.anInt9929 - this.aClass33_Sub3_41.anInt3352);
		return true;
	}

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "(I)V")
	public void method8149() {
		if (!this.aBoolean820) {
			return;
		}
		if (this.aClass324_7 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass33_Sub3_41.method3084(this.aClass324_7);
			this.aClass33_Sub3_41.method3083(this.aClass324_5);
			this.aClass324_7.method7851();
			this.aClass324_5.method7842(0);
			if (this.aBoolean822) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9925, this.anInt9929, 0, 0, this.anInt9925, this.anInt9929, local14, 9728);
			this.aClass33_Sub3_41.method3065(this.aClass324_7);
			this.aClass33_Sub3_41.method3089(this.aClass324_5);
		}
		this.aClass33_Sub3_41.method3008();
		this.aClass33_Sub3_41.method3087(0);
		this.aClass33_Sub3_41.method3045(1);
		this.aClass33_Sub3_41.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(112) Class3_Sub21 local112;
		for (@Pc(102) Class3_Sub21 local102 = (Class3_Sub21) this.aClass276_61.method6907(); local102 != null; local102 = local112) {
			local112 = (Class3_Sub21) this.aClass276_61.method6912();
			@Pc(116) int local116 = local102.method3425();
			for (@Pc(118) int local118 = 0; local118 < local116; local118++) {
				local102.method3431(this.aClass121_Sub2Array4[local89], local118, this.aClass121_Sub2_6);
				if (local112 == null && local116 - 1 == local118) {
					this.aClass33_Sub3_41.method3034(this.aClass324_5);
					this.aClass33_Sub3_41.method3070(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9929);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9928, this.anInt9923);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9928, this.anInt9923 + this.anInt9929);
					OpenGL.glTexCoord2f((float) this.anInt9925, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9928 + this.anInt9925, this.anInt9929 + this.anInt9923);
					OpenGL.glTexCoord2f((float) this.anInt9925, (float) this.anInt9929);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9925 + this.anInt9928, this.anInt9923);
					OpenGL.glEnd();
				} else {
					this.aClass324_5.method7842(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9929);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt9929);
					OpenGL.glTexCoord2f((float) this.anInt9925, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9925, this.anInt9929);
					OpenGL.glTexCoord2f((float) this.anInt9925, (float) this.anInt9929);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9925, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local102.method3423(local118);
				local89 = local89 + 1 & 0x1;
			}
		}
		this.aBoolean820 = false;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)Z")
	private boolean method8150() {
		if (this.aBoolean823) {
			if (this.aClass3_Sub1_Sub5_2 != null) {
				this.aClass3_Sub1_Sub5_2.method3726();
				this.aClass3_Sub1_Sub5_2 = null;
			}
			if (this.aClass121_Sub2_6 != null) {
				this.aClass121_Sub2_6.method7322();
				this.aClass121_Sub2_6 = null;
			}
			if (this.aClass324_7 != null) {
				this.aClass3_Sub1_Sub5_2 = new Class3_Sub1_Sub5(this.aClass33_Sub3_41, 6402, this.anInt9925, this.anInt9929, this.aClass33_Sub3_41.anInt3415);
			}
			if (this.aBoolean822) {
				this.aClass121_Sub2_6 = new Class121_Sub2(this.aClass33_Sub3_41, 34037, 6402, this.anInt9925, this.anInt9929);
			} else if (this.aClass3_Sub1_Sub5_2 == null) {
				this.aClass3_Sub1_Sub5_2 = new Class3_Sub1_Sub5(this.aClass33_Sub3_41, 6402, this.anInt9925, this.anInt9929);
			}
			this.aBoolean823 = false;
			this.aBoolean824 = true;
			this.aBoolean826 = true;
		}
		if (this.aBoolean825) {
			if (this.aClass3_Sub1_Sub5_1 != null) {
				this.aClass3_Sub1_Sub5_1.method3726();
				this.aClass3_Sub1_Sub5_1 = null;
			}
			if (this.aClass121_Sub2Array4[0] != null) {
				this.aClass121_Sub2Array4[0].method7322();
				this.aClass121_Sub2Array4[0] = null;
			}
			if (this.aClass121_Sub2Array4[1] != null) {
				this.aClass121_Sub2Array4[1].method7322();
				this.aClass121_Sub2Array4[1] = null;
			}
			if (this.aClass324_7 != null) {
				this.aClass3_Sub1_Sub5_1 = new Class3_Sub1_Sub5(this.aClass33_Sub3_41, this.anInt9931, this.anInt9925, this.anInt9929, this.aClass33_Sub3_41.anInt3415);
			}
			this.aClass121_Sub2Array4[0] = new Class121_Sub2(this.aClass33_Sub3_41, 34037, this.anInt9931, this.anInt9925, this.anInt9929);
			this.aClass121_Sub2Array4[1] = this.anInt9930 > 1 ? new Class121_Sub2(this.aClass33_Sub3_41, 34037, this.anInt9931, this.anInt9925, this.anInt9929) : null;
			this.aBoolean824 = true;
			this.aBoolean826 = true;
			this.aBoolean825 = false;
		}
		if (this.aBoolean824) {
			if (this.aClass324_7 == null) {
				this.aClass33_Sub3_41.method3050(this.aClass324_5);
				this.aClass324_5.method7845(0);
				this.aClass324_5.method7845(1);
				this.aClass324_5.method7845(8);
				this.aClass324_5.method7853(0, this.aClass121_Sub2Array4[0]);
				if (this.anInt9930 > 1) {
					this.aClass324_5.method7853(1, this.aClass121_Sub2Array4[1]);
				}
				if (this.aBoolean822) {
					this.aClass324_5.method7853(8, this.aClass121_Sub2_6);
				} else {
					this.aClass324_5.method7846(8, this.aClass3_Sub1_Sub5_2);
				}
				this.aClass33_Sub3_41.method3034(this.aClass324_5);
			} else {
				this.aClass33_Sub3_41.method3050(this.aClass324_5);
				this.aClass324_5.method7845(0);
				this.aClass324_5.method7845(1);
				this.aClass324_5.method7845(8);
				this.aClass324_5.method7853(0, this.aClass121_Sub2Array4[0]);
				if (this.anInt9930 > 1) {
					this.aClass324_5.method7853(1, this.aClass121_Sub2Array4[1]);
				}
				if (this.aBoolean822) {
					this.aClass324_5.method7853(8, this.aClass121_Sub2_6);
				}
				this.aClass33_Sub3_41.method3034(this.aClass324_5);
				this.aClass33_Sub3_41.method3050(this.aClass324_7);
				this.aClass324_7.method7845(0);
				this.aClass324_7.method7845(8);
				this.aClass324_7.method7846(0, this.aClass3_Sub1_Sub5_1);
				this.aClass324_7.method7846(8, this.aClass3_Sub1_Sub5_2);
				this.aClass33_Sub3_41.method3034(this.aClass324_7);
			}
			this.aBoolean824 = false;
			this.aBoolean826 = true;
		}
		if (this.aBoolean826) {
			this.aClass33_Sub3_41.method3050(this.aClass324_6);
			this.aBoolean826 = !this.aClass324_6.method7847();
			this.aClass33_Sub3_41.method3034(this.aClass324_6);
		}
		return !this.aBoolean826;
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Z")
	public boolean method8151() {
		return this.aClass324_6 != null;
	}
}
