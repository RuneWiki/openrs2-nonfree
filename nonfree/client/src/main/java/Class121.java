import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class121 {

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "Z")
	private boolean aBoolean292;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!hp;")
	private Class3_Sub3_Sub11 aClass3_Sub3_Sub11_1;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Lclient!sr;")
	private Class42_Sub1 aClass42_Sub1_4;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!hp;")
	private Class3_Sub3_Sub11 aClass3_Sub3_Sub11_2;

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
	private int anInt3766 = 0;

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	private int anInt3773 = 1;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	private int anInt3776 = 0;

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
	private int anInt3767 = 1;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!tu;")
	private final Class229 aClass229_26 = new Class229();

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Z")
	private boolean aBoolean293 = true;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "Z")
	private boolean aBoolean294 = true;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "I")
	private int anInt3778 = 0;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	private int anInt3779 = -1;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Z")
	private boolean aBoolean296 = true;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Z")
	private boolean aBoolean295 = false;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "[Lclient!sr;")
	private Class42_Sub1[] aClass42_Sub1Array1 = new Class42_Sub1[2];

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "Z")
	private boolean aBoolean297 = true;

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "Lclient!gk;")
	private final Class75_Sub2 aClass75_Sub2_22;

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "Lclient!jh;")
	private Class122 aClass122_3;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "Lclient!jh;")
	private Class122 aClass122_5;

	@OriginalMember(owner = "client!jf", name = "j", descriptor = "Lclient!jh;")
	private Class122 aClass122_4;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!gk;)V")
	public Class121(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_22 = arg0;
		if (this.aClass75_Sub2_22.aBoolean220 && this.aClass75_Sub2_22.aBoolean244) {
			this.aClass122_5 = this.aClass122_3 = new Class122(this.aClass75_Sub2_22);
			if (this.aClass75_Sub2_22.anInt3077 > 1 && this.aClass75_Sub2_22.aBoolean218 && this.aClass75_Sub2_22.aBoolean242) {
				this.aClass122_5 = this.aClass122_4 = new Class122(this.aClass75_Sub2_22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIII)Z")
	public boolean method3124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass122_5 == null || this.aClass229_26.method5317()) {
			return false;
		}
		if (arg2 != this.anInt3767 || arg3 != this.anInt3773) {
			this.anInt3773 = arg3;
			this.anInt3767 = arg2;
			for (@Pc(44) Class3 local44 = this.aClass229_26.method5328(); local44 != this.aClass229_26.aClass3_233; local44 = local44.aClass3_261) {
				((Class3_Sub17) local44).method4935(this.anInt3773, this.anInt3767);
			}
			this.aBoolean293 = true;
			this.aBoolean294 = true;
			this.aBoolean297 = true;
		}
		if (!this.method3127()) {
			return false;
		}
		this.aBoolean292 = true;
		this.anInt3776 = arg1;
		this.anInt3766 = arg0;
		this.aClass75_Sub2_22.method2432(this.aClass122_5);
		this.aClass122_5.method3164(0);
		this.aClass75_Sub2_22.method2408(-this.anInt3766, this.anInt3773 - this.aClass122_5.method3163() - this.anInt3776);
		return true;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BLclient!fg;)V")
	public void method3125(@OriginalArg(1) Class3_Sub17 arg0) {
		arg0.aBoolean438 = false;
		arg0.method4937();
		arg0.method5987();
		this.method3132();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Z)Z")
	private boolean method3127() {
		if (this.aBoolean293) {
			if (this.aClass3_Sub3_Sub11_1 != null) {
				this.aClass3_Sub3_Sub11_1.method2757();
				this.aClass3_Sub3_Sub11_1 = null;
			}
			if (this.aClass42_Sub1_4 != null) {
				this.aClass42_Sub1_4.method4919();
				this.aClass42_Sub1_4 = null;
			}
			if (this.aClass122_4 != null) {
				this.aClass3_Sub3_Sub11_1 = new Class3_Sub3_Sub11(this.aClass75_Sub2_22, 6402, this.anInt3767, this.anInt3773, this.aClass75_Sub2_22.anInt3077);
			}
			if (this.aBoolean295) {
				this.aClass42_Sub1_4 = new Class42_Sub1(this.aClass75_Sub2_22, 34037, 6402, this.anInt3767, this.anInt3773);
			} else if (this.aClass3_Sub3_Sub11_1 == null) {
				this.aClass3_Sub3_Sub11_1 = new Class3_Sub3_Sub11(this.aClass75_Sub2_22, 6402, this.anInt3767, this.anInt3773);
			}
			this.aBoolean293 = false;
			this.aBoolean294 = true;
			this.aBoolean296 = true;
		}
		if (this.aBoolean297) {
			if (this.aClass3_Sub3_Sub11_2 != null) {
				this.aClass3_Sub3_Sub11_2.method2757();
				this.aClass3_Sub3_Sub11_2 = null;
			}
			if (this.aClass42_Sub1Array1[0] != null) {
				this.aClass42_Sub1Array1[0].method4919();
				this.aClass42_Sub1Array1[0] = null;
			}
			if (this.aClass42_Sub1Array1[1] != null) {
				this.aClass42_Sub1Array1[1].method4919();
				this.aClass42_Sub1Array1[1] = null;
			}
			if (this.aClass122_4 != null) {
				this.aClass3_Sub3_Sub11_2 = new Class3_Sub3_Sub11(this.aClass75_Sub2_22, this.anInt3779, this.anInt3767, this.anInt3773, this.aClass75_Sub2_22.anInt3077);
			}
			this.aClass42_Sub1Array1[0] = new Class42_Sub1(this.aClass75_Sub2_22, 34037, this.anInt3779, this.anInt3767, this.anInt3773);
			this.aClass42_Sub1Array1[1] = this.anInt3778 > 1 ? new Class42_Sub1(this.aClass75_Sub2_22, 34037, this.anInt3779, this.anInt3767, this.anInt3773) : null;
			this.aBoolean296 = true;
			this.aBoolean294 = true;
			this.aBoolean297 = false;
		}
		if (this.aBoolean294) {
			if (this.aClass122_4 == null) {
				this.aClass75_Sub2_22.method2432(this.aClass122_3);
				this.aClass122_3.method3165(0);
				this.aClass122_3.method3165(1);
				this.aClass122_3.method3165(8);
				this.aClass122_3.method3168(this.aClass42_Sub1Array1[0], 0);
				if (this.anInt3778 > 1) {
					this.aClass122_3.method3168(this.aClass42_Sub1Array1[1], 1);
				}
				if (this.aBoolean295) {
					this.aClass122_3.method3168(this.aClass42_Sub1_4, 8);
				} else {
					this.aClass122_3.method3167(8, this.aClass3_Sub3_Sub11_1);
				}
				this.aClass75_Sub2_22.method2455(this.aClass122_3);
			} else {
				this.aClass75_Sub2_22.method2432(this.aClass122_3);
				this.aClass122_3.method3165(0);
				this.aClass122_3.method3165(1);
				this.aClass122_3.method3165(8);
				this.aClass122_3.method3168(this.aClass42_Sub1Array1[0], 0);
				if (this.anInt3778 > 1) {
					this.aClass122_3.method3168(this.aClass42_Sub1Array1[1], 1);
				}
				if (this.aBoolean295) {
					this.aClass122_3.method3168(this.aClass42_Sub1_4, 8);
				}
				this.aClass75_Sub2_22.method2455(this.aClass122_3);
				this.aClass75_Sub2_22.method2432(this.aClass122_4);
				this.aClass122_4.method3165(0);
				this.aClass122_4.method3165(8);
				this.aClass122_4.method3167(0, this.aClass3_Sub3_Sub11_2);
				this.aClass122_4.method3167(8, this.aClass3_Sub3_Sub11_1);
				this.aClass75_Sub2_22.method2455(this.aClass122_4);
			}
			this.aBoolean296 = true;
			this.aBoolean294 = false;
		}
		if (this.aBoolean296) {
			this.aClass75_Sub2_22.method2432(this.aClass122_5);
			this.aBoolean296 = !this.aClass122_5.method3174();
			this.aClass75_Sub2_22.method2455(this.aClass122_5);
		}
		return !this.aBoolean296;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!fg;I)Z")
	public boolean method3128(@OriginalArg(0) Class3_Sub17 arg0) {
		if (this.aClass122_5 != null) {
			if (arg0.method4943() || arg0.method4936()) {
				this.aClass229_26.method5321(arg0);
				this.method3132();
				if (this.method3127()) {
					if (this.anInt3767 != -1 && this.anInt3773 != -1) {
						arg0.method4935(this.anInt3773, this.anInt3767);
					}
					arg0.aBoolean438 = true;
					return true;
				}
			}
			this.method3125(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z")
	public boolean method3129() {
		return this.aClass122_5 != null;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
	public void method3131() {
		this.aClass42_Sub1Array1 = null;
		this.aClass122_5 = this.aClass122_4 = this.aClass122_3 = null;
		this.aClass3_Sub3_Sub11_2 = null;
		this.aClass42_Sub1_4 = null;
		this.aClass3_Sub3_Sub11_1 = null;
		if (!this.aClass229_26.method5317()) {
			for (@Pc(38) Class3 local38 = this.aClass229_26.method5328(); local38 != this.aClass229_26.aClass3_233; local38 = local38.aClass3_261) {
				((Class3_Sub17) local38).method4937();
			}
		}
		this.anInt3767 = this.anInt3773 = 1;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(Z)V")
	private void method3132() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub17 local17 = (Class3_Sub17) this.aClass229_26.method5328(); local17 != null; local17 = (Class3_Sub17) this.aClass229_26.method5325()) {
			local23 = local17.method4940();
			if (local23 > local9) {
				local9 = local23;
			}
			local11 += local17.method4941();
			local7 |= local17.method4945();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt3779 != local23) {
			this.aBoolean297 = true;
			this.anInt3779 = local23;
		}
		@Pc(97) int local97 = this.anInt3778 <= 2 ? this.anInt3778 : 2;
		@Pc(106) int local106 = local11 > 2 ? 2 : local11;
		this.anInt3778 = local11;
		if (local97 != local106) {
			this.aBoolean294 = this.aBoolean297 = true;
		}
		if (this.aBoolean295 != local7) {
			this.aBoolean295 = local7;
			this.aBoolean293 = true;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	public void method3133() {
		if (!this.aBoolean292) {
			return;
		}
		if (this.aClass122_4 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass75_Sub2_22.method2409(this.aClass122_4);
			this.aClass75_Sub2_22.method2425(this.aClass122_3);
			this.aClass122_4.method3169();
			this.aClass122_3.method3164(0);
			if (this.aBoolean295) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3767, this.anInt3773, 0, 0, this.anInt3767, this.anInt3773, local14, 9728);
			this.aClass75_Sub2_22.method2442(this.aClass122_4);
			this.aClass75_Sub2_22.method2407(this.aClass122_3);
		}
		this.aClass75_Sub2_22.method2465();
		this.aClass75_Sub2_22.method2445(0);
		this.aClass75_Sub2_22.method2424(1);
		this.aClass75_Sub2_22.va();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(111) Class3_Sub17 local111;
		for (@Pc(103) Class3_Sub17 local103 = (Class3_Sub17) this.aClass229_26.method5328(); local103 != null; local103 = local111) {
			local111 = (Class3_Sub17) this.aClass229_26.method5325();
			@Pc(115) int local115 = local103.method4941();
			for (@Pc(117) int local117 = 0; local117 < local115; local117++) {
				local103.method4933(this.aClass42_Sub1_4, this.aClass42_Sub1Array1[local95], local117);
				if (local111 == null && local117 == local115 - 1) {
					this.aClass75_Sub2_22.method2455(this.aClass122_3);
					this.aClass75_Sub2_22.method2408(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3773);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3766, this.anInt3776);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3766, this.anInt3773 + this.anInt3776);
					OpenGL.glTexCoord2f((float) this.anInt3767, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3767 + this.anInt3766, this.anInt3773 + this.anInt3776);
					OpenGL.glTexCoord2f((float) this.anInt3767, (float) this.anInt3773);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3766 + this.anInt3767, this.anInt3776);
					OpenGL.glEnd();
				} else {
					this.aClass122_3.method3164(local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3773);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt3773);
					OpenGL.glTexCoord2f((float) this.anInt3767, (float) this.anInt3773);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3767, this.anInt3773);
					OpenGL.glTexCoord2f((float) this.anInt3767, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3767, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
				local103.method4939(local117);
			}
		}
		this.aBoolean292 = false;
	}
}
