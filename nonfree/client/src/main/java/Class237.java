import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class237 {

	@OriginalMember(owner = "client!th", name = "t", descriptor = "Z")
	private boolean aBoolean432;

	@OriginalMember(owner = "client!th", name = "y", descriptor = "Lclient!cf;")
	private Class4_Sub2_Sub5 aClass4_Sub2_Sub5_1;

	@OriginalMember(owner = "client!th", name = "C", descriptor = "Lclient!ml;")
	private Class65_Sub2 aClass65_Sub2_2;

	@OriginalMember(owner = "client!th", name = "H", descriptor = "Lclient!cf;")
	private Class4_Sub2_Sub5 aClass4_Sub2_Sub5_2;

	@OriginalMember(owner = "client!th", name = "p", descriptor = "I")
	private int anInt6289 = 0;

	@OriginalMember(owner = "client!th", name = "q", descriptor = "I")
	private int anInt6290 = 0;

	@OriginalMember(owner = "client!th", name = "v", descriptor = "I")
	private int anInt6294 = 1;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	private int anInt6293 = 1;

	@OriginalMember(owner = "client!th", name = "k", descriptor = "Lclient!ub;")
	private final Class244 aClass244_37 = new Class244();

	@OriginalMember(owner = "client!th", name = "A", descriptor = "[Lclient!ml;")
	private Class65_Sub2[] aClass65_Sub2Array3 = new Class65_Sub2[2];

	@OriginalMember(owner = "client!th", name = "E", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "client!th", name = "D", descriptor = "Z")
	private boolean aBoolean435 = true;

	@OriginalMember(owner = "client!th", name = "F", descriptor = "I")
	private int anInt6296 = -1;

	@OriginalMember(owner = "client!th", name = "z", descriptor = "I")
	private int anInt6295 = 0;

	@OriginalMember(owner = "client!th", name = "x", descriptor = "Z")
	private boolean aBoolean433 = true;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "Z")
	private boolean aBoolean434 = true;

	@OriginalMember(owner = "client!th", name = "G", descriptor = "Z")
	private boolean aBoolean437 = true;

	@OriginalMember(owner = "client!th", name = "w", descriptor = "Lclient!ug;")
	private final Class135_Sub2 aClass135_Sub2_35;

	@OriginalMember(owner = "client!th", name = "g", descriptor = "Lclient!ns;")
	private Class183 aClass183_1;

	@OriginalMember(owner = "client!th", name = "m", descriptor = "Lclient!ns;")
	private Class183 aClass183_3;

	@OriginalMember(owner = "client!th", name = "l", descriptor = "Lclient!ns;")
	private Class183 aClass183_2;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!ug;)V")
	public Class237(@OriginalArg(0) Class135_Sub2 arg0) {
		this.aClass135_Sub2_35 = arg0;
		if (this.aClass135_Sub2_35.aBoolean458 && this.aClass135_Sub2_35.aBoolean479) {
			this.aClass183_3 = this.aClass183_1 = new Class183(this.aClass135_Sub2_35);
			if (this.aClass135_Sub2_35.anInt6773 > 1 && this.aClass135_Sub2_35.aBoolean465 && this.aClass135_Sub2_35.aBoolean467) {
				this.aClass183_3 = this.aClass183_2 = new Class183(this.aClass135_Sub2_35);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
	private void method5085() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class4_Sub40 local17 = (Class4_Sub40) this.aClass244_37.method5263(); local17 != null; local17 = (Class4_Sub40) this.aClass244_37.method5271()) {
			local23 = local17.method5195();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method5185();
			local7 |= local17.method5196();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt6296 != local23) {
			this.aBoolean434 = true;
			this.anInt6296 = local23;
		}
		@Pc(101) int local101 = this.anInt6295 > 2 ? 2 : this.anInt6295;
		@Pc(108) int local108 = local11 <= 2 ? local11 : 2;
		this.anInt6295 = local11;
		if (local7 != this.aBoolean436) {
			this.aBoolean436 = local7;
			this.aBoolean435 = true;
		}
		if (local101 != local108) {
			this.aBoolean437 = this.aBoolean434 = true;
		}
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V")
	public void method5086() {
		if (!this.aBoolean432) {
			return;
		}
		if (this.aClass183_2 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass135_Sub2_35.method5475(this.aClass183_2);
			this.aClass135_Sub2_35.method5460(this.aClass183_1);
			this.aClass183_2.method3618();
			this.aClass183_1.method3607(0);
			if (this.aBoolean436) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6294, this.anInt6293, 0, 0, this.anInt6294, this.anInt6293, local14, 9728);
			this.aClass135_Sub2_35.method5434(this.aClass183_2);
			this.aClass135_Sub2_35.method5424(this.aClass183_1);
		}
		this.aClass135_Sub2_35.method5454();
		this.aClass135_Sub2_35.method5426(0);
		this.aClass135_Sub2_35.method5441(1);
		this.aClass135_Sub2_35.e();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class4_Sub40 local105;
		for (@Pc(97) Class4_Sub40 local97 = (Class4_Sub40) this.aClass244_37.method5263(); local97 != null; local97 = local105) {
			local105 = (Class4_Sub40) this.aClass244_37.method5271();
			@Pc(109) int local109 = local97.method5185();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method5193(this.aClass65_Sub2_2, local111, this.aClass65_Sub2Array3[local89]);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass135_Sub2_35.method5419(this.aClass183_1);
					this.aClass135_Sub2_35.method5414(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6293);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6290, this.anInt6289);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6290, this.anInt6289 + this.anInt6293);
					OpenGL.glTexCoord2f((float) this.anInt6294, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6294 + this.anInt6290, this.anInt6293 + this.anInt6289);
					OpenGL.glTexCoord2f((float) this.anInt6294, (float) this.anInt6293);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6290 + this.anInt6294, this.anInt6289);
					OpenGL.glEnd();
				} else {
					this.aClass183_1.method3607(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6293);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6293);
					OpenGL.glTexCoord2f((float) this.anInt6294, (float) this.anInt6293);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6294, this.anInt6293);
					OpenGL.glTexCoord2f((float) this.anInt6294, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6294, 0);
					OpenGL.glEnd();
				}
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
				local97.method5192(local111);
			}
		}
		this.aBoolean432 = false;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)Z")
	public boolean method5087() {
		return this.aClass183_3 != null;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Lclient!uv;I)Z")
	public boolean method5088(@OriginalArg(0) Class4_Sub40 arg0) {
		if (this.aClass183_3 != null) {
			if (arg0.method5188() || arg0.method5186()) {
				this.aClass244_37.method5273(arg0);
				this.method5085();
				if (this.method5089()) {
					if (this.anInt6294 != -1 && this.anInt6293 != -1) {
						arg0.method5191(this.anInt6293, this.anInt6294);
					}
					arg0.aBoolean445 = true;
					return true;
				}
			}
			this.method5090(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Z")
	private boolean method5089() {
		if (this.aBoolean435) {
			if (this.aClass4_Sub2_Sub5_2 != null) {
				this.aClass4_Sub2_Sub5_2.method631();
				this.aClass4_Sub2_Sub5_2 = null;
			}
			if (this.aClass65_Sub2_2 != null) {
				this.aClass65_Sub2_2.method4770();
				this.aClass65_Sub2_2 = null;
			}
			if (this.aClass183_2 != null) {
				this.aClass4_Sub2_Sub5_2 = new Class4_Sub2_Sub5(this.aClass135_Sub2_35, 6402, this.anInt6294, this.anInt6293, this.aClass135_Sub2_35.anInt6773);
			}
			if (this.aBoolean436) {
				this.aClass65_Sub2_2 = new Class65_Sub2(this.aClass135_Sub2_35, 34037, 6402, this.anInt6294, this.anInt6293);
			} else if (this.aClass4_Sub2_Sub5_2 == null) {
				this.aClass4_Sub2_Sub5_2 = new Class4_Sub2_Sub5(this.aClass135_Sub2_35, 6402, this.anInt6294, this.anInt6293);
			}
			this.aBoolean435 = false;
			this.aBoolean437 = true;
			this.aBoolean433 = true;
		}
		if (this.aBoolean434) {
			if (this.aClass4_Sub2_Sub5_1 != null) {
				this.aClass4_Sub2_Sub5_1.method631();
				this.aClass4_Sub2_Sub5_1 = null;
			}
			if (this.aClass65_Sub2Array3[0] != null) {
				this.aClass65_Sub2Array3[0].method4770();
				this.aClass65_Sub2Array3[0] = null;
			}
			if (this.aClass65_Sub2Array3[1] != null) {
				this.aClass65_Sub2Array3[1].method4770();
				this.aClass65_Sub2Array3[1] = null;
			}
			if (this.aClass183_2 != null) {
				this.aClass4_Sub2_Sub5_1 = new Class4_Sub2_Sub5(this.aClass135_Sub2_35, this.anInt6296, this.anInt6294, this.anInt6293, this.aClass135_Sub2_35.anInt6773);
			}
			this.aClass65_Sub2Array3[0] = new Class65_Sub2(this.aClass135_Sub2_35, 34037, this.anInt6296, this.anInt6294, this.anInt6293);
			this.aClass65_Sub2Array3[1] = this.anInt6295 <= 1 ? null : new Class65_Sub2(this.aClass135_Sub2_35, 34037, this.anInt6296, this.anInt6294, this.anInt6293);
			this.aBoolean433 = true;
			this.aBoolean437 = true;
			this.aBoolean434 = false;
		}
		if (this.aBoolean437) {
			if (this.aClass183_2 == null) {
				this.aClass135_Sub2_35.method5439(this.aClass183_1);
				this.aClass183_1.method3605(0);
				this.aClass183_1.method3605(1);
				this.aClass183_1.method3605(8);
				this.aClass183_1.method3610(this.aClass65_Sub2Array3[0], 0);
				if (this.anInt6295 > 1) {
					this.aClass183_1.method3610(this.aClass65_Sub2Array3[1], 1);
				}
				if (this.aBoolean436) {
					this.aClass183_1.method3610(this.aClass65_Sub2_2, 8);
				} else {
					this.aClass183_1.method3619(this.aClass4_Sub2_Sub5_2, 8);
				}
				this.aClass135_Sub2_35.method5419(this.aClass183_1);
			} else {
				this.aClass135_Sub2_35.method5439(this.aClass183_1);
				this.aClass183_1.method3605(0);
				this.aClass183_1.method3605(1);
				this.aClass183_1.method3605(8);
				this.aClass183_1.method3610(this.aClass65_Sub2Array3[0], 0);
				if (this.anInt6295 > 1) {
					this.aClass183_1.method3610(this.aClass65_Sub2Array3[1], 1);
				}
				if (this.aBoolean436) {
					this.aClass183_1.method3610(this.aClass65_Sub2_2, 8);
				}
				this.aClass135_Sub2_35.method5419(this.aClass183_1);
				this.aClass135_Sub2_35.method5439(this.aClass183_2);
				this.aClass183_2.method3605(0);
				this.aClass183_2.method3605(8);
				this.aClass183_2.method3619(this.aClass4_Sub2_Sub5_1, 0);
				this.aClass183_2.method3619(this.aClass4_Sub2_Sub5_2, 8);
				this.aClass135_Sub2_35.method5419(this.aClass183_2);
			}
			this.aBoolean437 = false;
			this.aBoolean433 = true;
		}
		if (this.aBoolean433) {
			this.aClass135_Sub2_35.method5439(this.aClass183_3);
			this.aBoolean433 = !this.aClass183_3.method3616();
			this.aClass135_Sub2_35.method5419(this.aClass183_3);
		}
		return !this.aBoolean433;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(BLclient!uv;)V")
	public void method5090(@OriginalArg(1) Class4_Sub40 arg0) {
		arg0.aBoolean445 = false;
		arg0.method5187();
		arg0.method6059();
		this.method5085();
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(IBIII)Z")
	public boolean method5093(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass183_3 == null || this.aClass244_37.method5272()) {
			return false;
		}
		if (this.anInt6294 != arg1 || arg0 != this.anInt6293) {
			this.anInt6294 = arg1;
			this.anInt6293 = arg0;
			for (@Pc(42) Class4 local42 = this.aClass244_37.method5263(); local42 != this.aClass244_37.aClass4_227; local42 = local42.aClass4_261) {
				((Class4_Sub40) local42).method5191(this.anInt6293, this.anInt6294);
			}
			this.aBoolean434 = true;
			this.aBoolean435 = true;
			this.aBoolean437 = true;
		}
		if (!this.method5089()) {
			return false;
		}
		this.anInt6290 = arg3;
		this.aBoolean432 = true;
		this.anInt6289 = arg2;
		this.aClass135_Sub2_35.method5439(this.aClass183_3);
		this.aClass183_3.method3607(0);
		this.aClass135_Sub2_35.method5414(-this.anInt6290, this.anInt6293 - this.aClass183_3.method3608() - this.anInt6289);
		return true;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
	public void method5095() {
		this.aClass4_Sub2_Sub5_1 = null;
		this.aClass183_3 = this.aClass183_2 = this.aClass183_1 = null;
		this.aClass65_Sub2Array3 = null;
		this.aClass65_Sub2_2 = null;
		this.aClass4_Sub2_Sub5_2 = null;
		if (!this.aClass244_37.method5272()) {
			for (@Pc(36) Class4 local36 = this.aClass244_37.method5263(); local36 != this.aClass244_37.aClass4_227; local36 = local36.aClass4_261) {
				((Class4_Sub40) local36).method5187();
			}
		}
		this.anInt6294 = this.anInt6293 = 1;
	}
}
