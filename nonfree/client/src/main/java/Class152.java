import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public final class Class152 {

	@OriginalMember(owner = "client!hia", name = "o", descriptor = "Z")
	private boolean aBoolean392;

	@OriginalMember(owner = "client!hia", name = "v", descriptor = "Lclient!po;")
	private Class3_Sub4_Sub16 aClass3_Sub4_Sub16_1;

	@OriginalMember(owner = "client!hia", name = "l", descriptor = "Lclient!po;")
	private Class3_Sub4_Sub16 aClass3_Sub4_Sub16_2;

	@OriginalMember(owner = "client!hia", name = "x", descriptor = "Lclient!nw;")
	private Class245_Sub2 aClass245_Sub2_5;

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "I")
	private int anInt4524 = 0;

	@OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
	private int anInt4522 = 1;

	@OriginalMember(owner = "client!hia", name = "f", descriptor = "I")
	private int anInt4529 = 1;

	@OriginalMember(owner = "client!hia", name = "g", descriptor = "I")
	private int anInt4532 = 0;

	@OriginalMember(owner = "client!hia", name = "z", descriptor = "Lclient!tj;")
	private final Class357 aClass357_22 = new Class357();

	@OriginalMember(owner = "client!hia", name = "i", descriptor = "[Lclient!nw;")
	private Class245_Sub2[] aClass245_Sub2Array2 = new Class245_Sub2[2];

	@OriginalMember(owner = "client!hia", name = "B", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "Z")
	private boolean aBoolean394 = true;

	@OriginalMember(owner = "client!hia", name = "p", descriptor = "I")
	private int anInt4533 = -1;

	@OriginalMember(owner = "client!hia", name = "E", descriptor = "I")
	private int anInt4535 = 0;

	@OriginalMember(owner = "client!hia", name = "D", descriptor = "Z")
	private boolean aBoolean396 = true;

	@OriginalMember(owner = "client!hia", name = "C", descriptor = "Z")
	private boolean aBoolean395 = true;

	@OriginalMember(owner = "client!hia", name = "j", descriptor = "Z")
	private boolean aBoolean397 = true;

	@OriginalMember(owner = "client!hia", name = "s", descriptor = "Lclient!gia;")
	private final Class67_Sub2 aClass67_Sub2_16;

	@OriginalMember(owner = "client!hia", name = "y", descriptor = "Lclient!sj;")
	private Class339 aClass339_5;

	@OriginalMember(owner = "client!hia", name = "n", descriptor = "Lclient!sj;")
	private Class339 aClass339_6;

	@OriginalMember(owner = "client!hia", name = "t", descriptor = "Lclient!sj;")
	private Class339 aClass339_7;

	@OriginalMember(owner = "client!hia", name = "<init>", descriptor = "(Lclient!gia;)V")
	public Class152(@OriginalArg(0) Class67_Sub2 arg0) {
		this.aClass67_Sub2_16 = arg0;
		if (this.aClass67_Sub2_16.aBoolean309 && this.aClass67_Sub2_16.aBoolean308) {
			this.aClass339_6 = this.aClass339_5 = new Class339(this.aClass67_Sub2_16);
			if (this.aClass67_Sub2_16.anInt3873 > 1 && this.aClass67_Sub2_16.aBoolean312 && this.aClass67_Sub2_16.aBoolean323) {
				this.aClass339_6 = this.aClass339_7 = new Class339(this.aClass67_Sub2_16);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Z)V")
	public void method3702() {
		this.aClass245_Sub2Array2 = null;
		this.aClass3_Sub4_Sub16_1 = null;
		this.aClass3_Sub4_Sub16_2 = null;
		this.aClass339_6 = this.aClass339_7 = this.aClass339_5 = null;
		this.aClass245_Sub2_5 = null;
		if (!this.aClass357_22.method8404()) {
			for (@Pc(36) Class3 local36 = this.aClass357_22.method8391(); local36 != this.aClass357_22.aClass3_303; local36 = local36.aClass3_341) {
				((Class3_Sub19) local36).method2916();
			}
		}
		this.anInt4529 = this.anInt4522 = 1;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(ILclient!eb;)V")
	public void method3703(@OriginalArg(1) Class3_Sub19 arg0) {
		arg0.aBoolean274 = false;
		arg0.method2916();
		arg0.method9446();
		this.method3706();
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!eb;B)Z")
	public boolean method3704(@OriginalArg(0) Class3_Sub19 arg0) {
		if (this.aClass339_6 != null) {
			if (arg0.method2919() || arg0.method2924()) {
				this.aClass357_22.method8401(arg0);
				this.method3706();
				if (this.method3707()) {
					if (this.anInt4529 != -1 && this.anInt4522 != -1) {
						arg0.method2914(this.anInt4529, this.anInt4522);
					}
					arg0.aBoolean274 = true;
					return true;
				}
			}
			this.method3703(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(IIBII)Z")
	public boolean method3705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass339_6 == null || this.aClass357_22.method8404()) {
			return false;
		}
		if (this.anInt4529 != arg3 || arg2 != this.anInt4522) {
			this.anInt4522 = arg2;
			this.anInt4529 = arg3;
			for (@Pc(53) Class3 local53 = this.aClass357_22.method8391(); local53 != this.aClass357_22.aClass3_303; local53 = local53.aClass3_341) {
				((Class3_Sub19) local53).method2914(this.anInt4529, this.anInt4522);
			}
			this.aBoolean397 = true;
			this.aBoolean395 = true;
			this.aBoolean394 = true;
		}
		if (!this.method3707()) {
			return false;
		}
		this.anInt4532 = arg1;
		this.anInt4524 = arg0;
		this.aBoolean392 = true;
		this.aClass67_Sub2_16.method3253(this.aClass339_6);
		this.aClass339_6.method8083(0);
		this.aClass67_Sub2_16.method3252(-this.anInt4524, this.anInt4522 + this.anInt4532 - this.aClass67_Sub2_16.anInt3828);
		return true;
	}

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "(I)V")
	private void method3706() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class3_Sub19 local17 = (Class3_Sub19) this.aClass357_22.method8391(); local17 != null; local17 = (Class3_Sub19) this.aClass357_22.method8392()) {
			local25 = local17.method2915();
			local11 += local17.method2918();
			if (local25 > local9) {
				local9 = local25;
			}
			local7 |= local17.method2920();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (this.anInt4533 != local25) {
			this.anInt4533 = local25;
			this.aBoolean397 = true;
		}
		@Pc(106) int local106 = this.anInt4535 > 2 ? 2 : this.anInt4535;
		@Pc(121) int local121 = local11 <= 2 ? local11 : 2;
		if (this.aBoolean393 != local7) {
			this.aBoolean393 = local7;
			this.aBoolean394 = true;
		}
		if (local121 != local106) {
			this.aBoolean395 = this.aBoolean397 = true;
		}
		this.anInt4535 = local11;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)Z")
	private boolean method3707() {
		if (this.aBoolean394) {
			if (this.aClass3_Sub4_Sub16_2 != null) {
				this.aClass3_Sub4_Sub16_2.method7171();
				this.aClass3_Sub4_Sub16_2 = null;
			}
			if (this.aClass245_Sub2_5 != null) {
				this.aClass245_Sub2_5.method8676();
				this.aClass245_Sub2_5 = null;
			}
			if (this.aClass339_7 != null) {
				this.aClass3_Sub4_Sub16_2 = new Class3_Sub4_Sub16(this.aClass67_Sub2_16, 6402, this.anInt4529, this.anInt4522, this.aClass67_Sub2_16.anInt3873);
			}
			if (this.aBoolean393) {
				this.aClass245_Sub2_5 = new Class245_Sub2(this.aClass67_Sub2_16, 34037, 6402, this.anInt4529, this.anInt4522);
			} else if (this.aClass3_Sub4_Sub16_2 == null) {
				this.aClass3_Sub4_Sub16_2 = new Class3_Sub4_Sub16(this.aClass67_Sub2_16, 6402, this.anInt4529, this.anInt4522);
			}
			this.aBoolean395 = true;
			this.aBoolean394 = false;
			this.aBoolean396 = true;
		}
		if (this.aBoolean397) {
			if (this.aClass3_Sub4_Sub16_1 != null) {
				this.aClass3_Sub4_Sub16_1.method7171();
				this.aClass3_Sub4_Sub16_1 = null;
			}
			if (this.aClass245_Sub2Array2[0] != null) {
				this.aClass245_Sub2Array2[0].method8676();
				this.aClass245_Sub2Array2[0] = null;
			}
			if (this.aClass245_Sub2Array2[1] != null) {
				this.aClass245_Sub2Array2[1].method8676();
				this.aClass245_Sub2Array2[1] = null;
			}
			if (this.aClass339_7 != null) {
				this.aClass3_Sub4_Sub16_1 = new Class3_Sub4_Sub16(this.aClass67_Sub2_16, this.anInt4533, this.anInt4529, this.anInt4522, this.aClass67_Sub2_16.anInt3873);
			}
			this.aClass245_Sub2Array2[0] = new Class245_Sub2(this.aClass67_Sub2_16, 34037, this.anInt4533, this.anInt4529, this.anInt4522);
			this.aClass245_Sub2Array2[1] = this.anInt4535 <= 1 ? null : new Class245_Sub2(this.aClass67_Sub2_16, 34037, this.anInt4533, this.anInt4529, this.anInt4522);
			this.aBoolean395 = true;
			this.aBoolean396 = true;
			this.aBoolean397 = false;
		}
		if (this.aBoolean395) {
			if (this.aClass339_7 == null) {
				this.aClass67_Sub2_16.method3253(this.aClass339_5);
				this.aClass339_5.method8077(0);
				this.aClass339_5.method8077(1);
				this.aClass339_5.method8077(8);
				this.aClass339_5.method8076(0, this.aClass245_Sub2Array2[0]);
				if (this.anInt4535 > 1) {
					this.aClass339_5.method8076(1, this.aClass245_Sub2Array2[1]);
				}
				if (this.aBoolean393) {
					this.aClass339_5.method8076(8, this.aClass245_Sub2_5);
				} else {
					this.aClass339_5.method8073(8, this.aClass3_Sub4_Sub16_2);
				}
				this.aClass67_Sub2_16.method3223(this.aClass339_5);
			} else {
				this.aClass67_Sub2_16.method3253(this.aClass339_5);
				this.aClass339_5.method8077(0);
				this.aClass339_5.method8077(1);
				this.aClass339_5.method8077(8);
				this.aClass339_5.method8076(0, this.aClass245_Sub2Array2[0]);
				if (this.anInt4535 > 1) {
					this.aClass339_5.method8076(1, this.aClass245_Sub2Array2[1]);
				}
				if (this.aBoolean393) {
					this.aClass339_5.method8076(8, this.aClass245_Sub2_5);
				}
				this.aClass67_Sub2_16.method3223(this.aClass339_5);
				this.aClass67_Sub2_16.method3253(this.aClass339_7);
				this.aClass339_7.method8077(0);
				this.aClass339_7.method8077(8);
				this.aClass339_7.method8073(0, this.aClass3_Sub4_Sub16_1);
				this.aClass339_7.method8073(8, this.aClass3_Sub4_Sub16_2);
				this.aClass67_Sub2_16.method3223(this.aClass339_7);
			}
			this.aBoolean396 = true;
			this.aBoolean395 = false;
		}
		if (this.aBoolean396) {
			this.aClass67_Sub2_16.method3253(this.aClass339_6);
			this.aBoolean396 = !this.aClass339_6.method8070();
			this.aClass67_Sub2_16.method3223(this.aClass339_6);
		}
		return !this.aBoolean396;
	}

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "(I)V")
	public void method3708() {
		if (!this.aBoolean392) {
			return;
		}
		if (this.aClass339_7 != null) {
			this.aClass67_Sub2_16.method3284(this.aClass339_7);
			@Pc(26) short local26 = 16384;
			this.aClass67_Sub2_16.method3296(this.aClass339_5);
			this.aClass339_7.method8075();
			this.aClass339_5.method8083(0);
			if (this.aBoolean393) {
				local26 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4529, this.anInt4522, 0, 0, this.anInt4529, this.anInt4522, local26, 9728);
			this.aClass67_Sub2_16.method3246(this.aClass339_7);
			this.aClass67_Sub2_16.method3258(this.aClass339_5);
		}
		this.aClass67_Sub2_16.method3295();
		this.aClass67_Sub2_16.method3257(0);
		this.aClass67_Sub2_16.method3255(1);
		this.aClass67_Sub2_16.la();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(113) Class3_Sub19 local113;
		for (@Pc(103) Class3_Sub19 local103 = (Class3_Sub19) this.aClass357_22.method8391(); local103 != null; local103 = local113) {
			local113 = (Class3_Sub19) this.aClass357_22.method8392();
			@Pc(117) int local117 = local103.method2918();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local103.method2913(this.aClass245_Sub2Array2[local95], this.aClass245_Sub2_5, local119);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass67_Sub2_16.method3223(this.aClass339_5);
					this.aClass67_Sub2_16.method3252(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4522);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4524, this.anInt4532);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4524, this.anInt4532 + this.anInt4522);
					OpenGL.glTexCoord2f((float) this.anInt4529, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4529 + this.anInt4524, this.anInt4532 + this.anInt4522);
					OpenGL.glTexCoord2f((float) this.anInt4529, (float) this.anInt4522);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4529 + this.anInt4524, this.anInt4532);
					OpenGL.glEnd();
				} else {
					this.aClass339_5.method8083(local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4522);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4522);
					OpenGL.glTexCoord2f((float) this.anInt4529, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4529, this.anInt4522);
					OpenGL.glTexCoord2f((float) this.anInt4529, (float) this.anInt4522);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4529, 0);
					OpenGL.glEnd();
				}
				local103.method2917(local119);
				local97 = local97 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean392 = false;
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)Z")
	public boolean method3709() {
		return this.aClass339_6 != null;
	}
}
