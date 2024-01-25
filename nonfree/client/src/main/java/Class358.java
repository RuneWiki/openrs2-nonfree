import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vn")
public final class Class358 {

	@OriginalMember(owner = "client!vn", name = "g", descriptor = "Z")
	private boolean aBoolean750;

	@OriginalMember(owner = "client!vn", name = "A", descriptor = "Lclient!bca;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_1;

	@OriginalMember(owner = "client!vn", name = "F", descriptor = "Lclient!fba;")
	private Class94_Sub2 aClass94_Sub2_6;

	@OriginalMember(owner = "client!vn", name = "G", descriptor = "Lclient!bca;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_2;

	@OriginalMember(owner = "client!vn", name = "h", descriptor = "I")
	private int anInt9809 = 1;

	@OriginalMember(owner = "client!vn", name = "l", descriptor = "I")
	private int anInt9812 = 1;

	@OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
	private int anInt9811 = 0;

	@OriginalMember(owner = "client!vn", name = "v", descriptor = "I")
	private int anInt9820 = 0;

	@OriginalMember(owner = "client!vn", name = "s", descriptor = "Lclient!mba;")
	private final Class216 aClass216_71 = new Class216();

	@OriginalMember(owner = "client!vn", name = "z", descriptor = "I")
	private int anInt9821 = 0;

	@OriginalMember(owner = "client!vn", name = "B", descriptor = "Z")
	private boolean aBoolean753 = true;

	@OriginalMember(owner = "client!vn", name = "C", descriptor = "[Lclient!fba;")
	private Class94_Sub2[] aClass94_Sub2Array4 = new Class94_Sub2[2];

	@OriginalMember(owner = "client!vn", name = "x", descriptor = "Z")
	private boolean aBoolean751 = false;

	@OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
	private int anInt9823 = -1;

	@OriginalMember(owner = "client!vn", name = "y", descriptor = "Z")
	private boolean aBoolean752 = true;

	@OriginalMember(owner = "client!vn", name = "J", descriptor = "Z")
	private boolean aBoolean755 = true;

	@OriginalMember(owner = "client!vn", name = "D", descriptor = "Z")
	private boolean aBoolean754 = true;

	@OriginalMember(owner = "client!vn", name = "j", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_42;

	@OriginalMember(owner = "client!vn", name = "w", descriptor = "Lclient!eba;")
	private Class85 aClass85_7;

	@OriginalMember(owner = "client!vn", name = "q", descriptor = "Lclient!eba;")
	private Class85 aClass85_6;

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "Lclient!eba;")
	private Class85 aClass85_5;

	@OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class358(@OriginalArg(0) Class82_Sub1 arg0) {
		this.aClass82_Sub1_42 = arg0;
		if (this.aClass82_Sub1_42.aBoolean185 && this.aClass82_Sub1_42.aBoolean176) {
			this.aClass85_6 = this.aClass85_7 = new Class85(this.aClass82_Sub1_42);
			if (this.aClass82_Sub1_42.anInt2459 > 1 && this.aClass82_Sub1_42.aBoolean199 && this.aClass82_Sub1_42.aBoolean178) {
				this.aClass85_6 = this.aClass85_5 = new Class85(this.aClass82_Sub1_42);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V")
	public void method8334() {
		this.aClass85_6 = this.aClass85_5 = this.aClass85_7 = null;
		this.aClass94_Sub2_6 = null;
		this.aClass3_Sub7_Sub2_2 = null;
		this.aClass3_Sub7_Sub2_1 = null;
		this.aClass94_Sub2Array4 = null;
		if (!this.aClass216_71.method5455()) {
			for (@Pc(39) Class3 local39 = this.aClass216_71.method5457(); local39 != this.aClass216_71.aClass3_185; local39 = local39.aClass3_300) {
				((Class3_Sub44) local39).method7734();
			}
		}
		this.anInt9812 = this.anInt9809 = 1;
	}

	@OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V")
	public void method8335() {
		if (!this.aBoolean750) {
			return;
		}
		if (this.aClass85_5 != null) {
			this.aClass82_Sub1_42.method2038(this.aClass85_5);
			@Pc(20) short local20 = 16384;
			this.aClass82_Sub1_42.method2081(this.aClass85_7);
			this.aClass85_5.method2144();
			this.aClass85_7.method2149(0);
			if (this.aBoolean751) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9812, this.anInt9809, 0, 0, this.anInt9812, this.anInt9809, local20, 9728);
			this.aClass82_Sub1_42.method2058(this.aClass85_5);
			this.aClass82_Sub1_42.method2099(this.aClass85_7);
		}
		this.aClass82_Sub1_42.method2060();
		this.aClass82_Sub1_42.method2085(0);
		this.aClass82_Sub1_42.method2068(1);
		this.aClass82_Sub1_42.la();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(117) Class3_Sub44 local117;
		for (@Pc(107) Class3_Sub44 local107 = (Class3_Sub44) this.aClass216_71.method5457(); local107 != null; local107 = local117) {
			local117 = (Class3_Sub44) this.aClass216_71.method5458();
			@Pc(121) int local121 = local107.method7731();
			for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
				local107.method7741(this.aClass94_Sub2Array4[local97], local123, this.aClass94_Sub2_6);
				if (local117 == null && local123 == local121 - 1) {
					this.aClass82_Sub1_42.method2042(this.aClass85_7);
					this.aClass82_Sub1_42.method2071(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9809);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9820, this.anInt9811);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9820, this.anInt9811 + this.anInt9809);
					OpenGL.glTexCoord2f((float) this.anInt9812, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9820 + this.anInt9812, this.anInt9809 + this.anInt9811);
					OpenGL.glTexCoord2f((float) this.anInt9812, (float) this.anInt9809);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9812 + this.anInt9820, this.anInt9811);
					OpenGL.glEnd();
				} else {
					this.aClass85_7.method2149(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9809);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt9809);
					OpenGL.glTexCoord2f((float) this.anInt9812, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9812, this.anInt9809);
					OpenGL.glTexCoord2f((float) this.anInt9812, (float) this.anInt9809);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9812, 0);
					OpenGL.glEnd();
				}
				local107.method7739(local123);
				local99 = local99 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
			}
		}
		this.aBoolean750 = false;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(ILclient!qu;)V")
	public void method8337(@OriginalArg(1) Class3_Sub44 arg0) {
		arg0.aBoolean671 = false;
		arg0.method7734();
		arg0.method8682();
		this.method8343();
	}

	@OriginalMember(owner = "client!vn", name = "c", descriptor = "(I)Z")
	private boolean method8338() {
		if (this.aBoolean754) {
			if (this.aClass3_Sub7_Sub2_1 != null) {
				this.aClass3_Sub7_Sub2_1.method470();
				this.aClass3_Sub7_Sub2_1 = null;
			}
			if (this.aClass94_Sub2_6 != null) {
				this.aClass94_Sub2_6.method4008();
				this.aClass94_Sub2_6 = null;
			}
			if (this.aClass85_5 != null) {
				this.aClass3_Sub7_Sub2_1 = new Class3_Sub7_Sub2(this.aClass82_Sub1_42, 6402, this.anInt9812, this.anInt9809, this.aClass82_Sub1_42.anInt2459);
			}
			if (this.aBoolean751) {
				this.aClass94_Sub2_6 = new Class94_Sub2(this.aClass82_Sub1_42, 34037, 6402, this.anInt9812, this.anInt9809);
			} else if (this.aClass3_Sub7_Sub2_1 == null) {
				this.aClass3_Sub7_Sub2_1 = new Class3_Sub7_Sub2(this.aClass82_Sub1_42, 6402, this.anInt9812, this.anInt9809);
			}
			this.aBoolean754 = false;
			this.aBoolean753 = true;
			this.aBoolean752 = true;
		}
		if (this.aBoolean755) {
			if (this.aClass3_Sub7_Sub2_2 != null) {
				this.aClass3_Sub7_Sub2_2.method470();
				this.aClass3_Sub7_Sub2_2 = null;
			}
			if (this.aClass94_Sub2Array4[0] != null) {
				this.aClass94_Sub2Array4[0].method4008();
				this.aClass94_Sub2Array4[0] = null;
			}
			if (this.aClass94_Sub2Array4[1] != null) {
				this.aClass94_Sub2Array4[1].method4008();
				this.aClass94_Sub2Array4[1] = null;
			}
			if (this.aClass85_5 != null) {
				this.aClass3_Sub7_Sub2_2 = new Class3_Sub7_Sub2(this.aClass82_Sub1_42, this.anInt9823, this.anInt9812, this.anInt9809, this.aClass82_Sub1_42.anInt2459);
			}
			this.aClass94_Sub2Array4[0] = new Class94_Sub2(this.aClass82_Sub1_42, 34037, this.anInt9823, this.anInt9812, this.anInt9809);
			this.aClass94_Sub2Array4[1] = this.anInt9821 <= 1 ? null : new Class94_Sub2(this.aClass82_Sub1_42, 34037, this.anInt9823, this.anInt9812, this.anInt9809);
			this.aBoolean755 = false;
			this.aBoolean753 = true;
			this.aBoolean752 = true;
		}
		if (this.aBoolean752) {
			if (this.aClass85_5 == null) {
				this.aClass82_Sub1_42.method2043(this.aClass85_7);
				this.aClass85_7.method2145(0);
				this.aClass85_7.method2145(1);
				this.aClass85_7.method2145(8);
				this.aClass85_7.method2153(0, this.aClass94_Sub2Array4[0]);
				if (this.anInt9821 > 1) {
					this.aClass85_7.method2153(1, this.aClass94_Sub2Array4[1]);
				}
				if (this.aBoolean751) {
					this.aClass85_7.method2153(8, this.aClass94_Sub2_6);
				} else {
					this.aClass85_7.method2142(this.aClass3_Sub7_Sub2_1, 8);
				}
				this.aClass82_Sub1_42.method2042(this.aClass85_7);
			} else {
				this.aClass82_Sub1_42.method2043(this.aClass85_7);
				this.aClass85_7.method2145(0);
				this.aClass85_7.method2145(1);
				this.aClass85_7.method2145(8);
				this.aClass85_7.method2153(0, this.aClass94_Sub2Array4[0]);
				if (this.anInt9821 > 1) {
					this.aClass85_7.method2153(1, this.aClass94_Sub2Array4[1]);
				}
				if (this.aBoolean751) {
					this.aClass85_7.method2153(8, this.aClass94_Sub2_6);
				}
				this.aClass82_Sub1_42.method2042(this.aClass85_7);
				this.aClass82_Sub1_42.method2043(this.aClass85_5);
				this.aClass85_5.method2145(0);
				this.aClass85_5.method2145(8);
				this.aClass85_5.method2142(this.aClass3_Sub7_Sub2_2, 0);
				this.aClass85_5.method2142(this.aClass3_Sub7_Sub2_1, 8);
				this.aClass82_Sub1_42.method2042(this.aClass85_5);
			}
			this.aBoolean752 = false;
			this.aBoolean753 = true;
		}
		if (this.aBoolean753) {
			this.aClass82_Sub1_42.method2043(this.aClass85_6);
			this.aBoolean753 = !this.aClass85_6.method2143();
			this.aClass82_Sub1_42.method2042(this.aClass85_6);
		}
		return !this.aBoolean753;
	}

	@OriginalMember(owner = "client!vn", name = "d", descriptor = "(I)Z")
	public boolean method8340() {
		return this.aClass85_6 != null;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(Lclient!qu;B)Z")
	public boolean method8341(@OriginalArg(0) Class3_Sub44 arg0) {
		if (this.aClass85_6 != null) {
			if (arg0.method7740() || arg0.method7733()) {
				this.aClass216_71.method5449(arg0);
				this.method8343();
				if (this.method8338()) {
					if (this.anInt9812 != -1 && this.anInt9809 != -1) {
						arg0.method7736(this.anInt9812, this.anInt9809);
					}
					arg0.aBoolean671 = true;
					return true;
				}
			}
			this.method8337(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBIII)Z")
	public boolean method8342(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass85_6 == null || this.aClass216_71.method5455()) {
			return false;
		}
		if (this.anInt9812 != arg0 || arg1 != this.anInt9809) {
			this.anInt9809 = arg1;
			this.anInt9812 = arg0;
			for (@Pc(50) Class3 local50 = this.aClass216_71.method5457(); local50 != this.aClass216_71.aClass3_185; local50 = local50.aClass3_300) {
				((Class3_Sub44) local50).method7736(this.anInt9812, this.anInt9809);
			}
			this.aBoolean755 = true;
			this.aBoolean754 = true;
			this.aBoolean752 = true;
		}
		if (!this.method8338()) {
			return false;
		}
		this.anInt9820 = arg2;
		this.anInt9811 = arg3;
		this.aBoolean750 = true;
		this.aClass82_Sub1_42.method2043(this.aClass85_6);
		this.aClass85_6.method2149(0);
		this.aClass82_Sub1_42.method2071(-this.anInt9820, this.anInt9811 + this.anInt9809 - this.aClass82_Sub1_42.anInt2450);
		return true;
	}

	@OriginalMember(owner = "client!vn", name = "e", descriptor = "(I)V")
	private void method8343() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class3_Sub44 local23 = (Class3_Sub44) this.aClass216_71.method5457(); local23 != null; local23 = (Class3_Sub44) this.aClass216_71.method5458()) {
			local29 = local23.method7737();
			if (local29 > local15) {
				local15 = local29;
			}
			local17 += local23.method7731();
			local13 |= local23.method7738();
		}
		if (local15 == 2) {
			local29 = 34836;
		} else if (local15 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (this.anInt9823 != local29) {
			this.anInt9823 = local29;
			this.aBoolean755 = true;
		}
		@Pc(93) int local93 = this.anInt9821 > 2 ? 2 : this.anInt9821;
		@Pc(100) int local100 = local17 > 2 ? 2 : local17;
		if (local93 != local100) {
			this.aBoolean752 = this.aBoolean755 = true;
		}
		if (this.aBoolean751 != local13) {
			this.aBoolean751 = local13;
			this.aBoolean754 = true;
		}
		this.anInt9821 = local17;
	}
}
