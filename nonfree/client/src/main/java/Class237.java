import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class237 {

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!to", name = "y", descriptor = "Lclient!kd;")
	private Class6_Sub1_Sub13 aClass6_Sub1_Sub13_1;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "Lclient!kd;")
	private Class6_Sub1_Sub13 aClass6_Sub1_Sub13_2;

	@OriginalMember(owner = "client!to", name = "D", descriptor = "Lclient!sg;")
	private Class40_Sub3 aClass40_Sub3_7;

	@OriginalMember(owner = "client!to", name = "d", descriptor = "I")
	private int anInt6394 = 0;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "I")
	private int anInt6395 = 1;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "I")
	private int anInt6402 = 0;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	private int anInt6404 = 1;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Lclient!ft;")
	private final Class88 aClass88_45 = new Class88();

	@OriginalMember(owner = "client!to", name = "v", descriptor = "I")
	private int anInt6406 = 0;

	@OriginalMember(owner = "client!to", name = "u", descriptor = "I")
	private int anInt6405 = -1;

	@OriginalMember(owner = "client!to", name = "x", descriptor = "Z")
	private boolean aBoolean422 = true;

	@OriginalMember(owner = "client!to", name = "w", descriptor = "Z")
	private boolean aBoolean421 = true;

	@OriginalMember(owner = "client!to", name = "C", descriptor = "[Lclient!sg;")
	private Class40_Sub3[] aClass40_Sub3Array4 = new Class40_Sub3[2];

	@OriginalMember(owner = "client!to", name = "E", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "Z")
	private boolean aBoolean425 = true;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "Z")
	private boolean aBoolean423 = true;

	@OriginalMember(owner = "client!to", name = "c", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_38;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!mg;")
	private Class166 aClass166_5;

	@OriginalMember(owner = "client!to", name = "t", descriptor = "Lclient!mg;")
	private Class166 aClass166_7;

	@OriginalMember(owner = "client!to", name = "p", descriptor = "Lclient!mg;")
	private Class166 aClass166_6;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class237(@OriginalArg(0) Class28_Sub1 arg0) {
		this.aClass28_Sub1_38 = arg0;
		if (this.aClass28_Sub1_38.aBoolean60 && this.aClass28_Sub1_38.aBoolean40) {
			this.aClass166_7 = this.aClass166_5 = new Class166(this.aClass28_Sub1_38);
			if (this.aClass28_Sub1_38.anInt725 > 1 && this.aClass28_Sub1_38.aBoolean48 && this.aClass28_Sub1_38.aBoolean53) {
				this.aClass166_7 = this.aClass166_6 = new Class166(this.aClass28_Sub1_38);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	private void method5340() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class6_Sub21 local23 = (Class6_Sub21) this.aClass88_45.method1882(); local23 != null; local23 = (Class6_Sub21) this.aClass88_45.method1891()) {
			local29 = local23.method3443();
			local11 += local23.method3446();
			if (local9 < local29) {
				local9 = local29;
			}
			local7 |= local23.method3447();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt6405) {
			this.aBoolean425 = true;
			this.anInt6405 = local29;
		}
		@Pc(91) int local91 = this.anInt6406 <= 2 ? this.anInt6406 : 2;
		@Pc(100) int local100 = local11 <= 2 ? local11 : 2;
		this.anInt6406 = local11;
		if (local7 != this.aBoolean424) {
			this.aBoolean424 = local7;
			this.aBoolean422 = true;
		}
		if (local100 != local91) {
			this.aBoolean423 = this.aBoolean425 = true;
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(BLclient!mr;)V")
	public void method5341(@OriginalArg(1) Class6_Sub21 arg0) {
		arg0.aBoolean252 = false;
		arg0.method3444();
		arg0.method5977();
		this.method5340();
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(B)Z")
	public boolean method5342() {
		return this.aClass166_7 != null;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	public void method5343() {
		this.aClass40_Sub3_7 = null;
		this.aClass6_Sub1_Sub13_2 = null;
		this.aClass6_Sub1_Sub13_1 = null;
		this.aClass166_7 = this.aClass166_6 = this.aClass166_5 = null;
		this.aClass40_Sub3Array4 = null;
		if (!this.aClass88_45.method1888()) {
			for (@Pc(36) Class6 local36 = this.aClass88_45.method1882(); local36 != this.aClass88_45.aClass6_73; local36 = local36.aClass6_252) {
				((Class6_Sub21) local36).method3444();
			}
		}
		this.anInt6404 = this.anInt6395 = 1;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)V")
	public void method5345() {
		if (!this.aBoolean420) {
			return;
		}
		if (this.aClass166_6 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass28_Sub1_38.method663(this.aClass166_6);
			this.aClass28_Sub1_38.method664(this.aClass166_5);
			this.aClass166_6.method3756();
			this.aClass166_5.method3754(0);
			if (this.aBoolean424) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6404, this.anInt6395, 0, 0, this.anInt6404, this.anInt6395, local14, 9728);
			this.aClass28_Sub1_38.method687(this.aClass166_6);
			this.aClass28_Sub1_38.method660(this.aClass166_5);
		}
		this.aClass28_Sub1_38.method648();
		this.aClass28_Sub1_38.method708(0);
		this.aClass28_Sub1_38.method678(1);
		this.aClass28_Sub1_38.method3554();
		@Pc(99) int local99 = 0;
		@Pc(101) int local101 = 1;
		@Pc(115) Class6_Sub21 local115;
		for (@Pc(107) Class6_Sub21 local107 = (Class6_Sub21) this.aClass88_45.method1882(); local107 != null; local107 = local115) {
			local115 = (Class6_Sub21) this.aClass88_45.method1891();
			@Pc(119) int local119 = local107.method3446();
			for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
				local107.method3442(this.aClass40_Sub3Array4[local99], local121, this.aClass40_Sub3_7);
				if (local115 == null && local121 == local119 - 1) {
					this.aClass28_Sub1_38.method659(this.aClass166_5);
					this.aClass28_Sub1_38.method706(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6395);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6402, this.anInt6394);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6402, this.anInt6394 + this.anInt6395);
					OpenGL.glTexCoord2f((float) this.anInt6404, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6402 + this.anInt6404, this.anInt6394 + this.anInt6395);
					OpenGL.glTexCoord2f((float) this.anInt6404, (float) this.anInt6395);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6402 + this.anInt6404, this.anInt6394);
					OpenGL.glEnd();
				} else {
					this.aClass166_5.method3754(local101);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6395);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6395);
					OpenGL.glTexCoord2f((float) this.anInt6404, (float) this.anInt6395);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6404, this.anInt6395);
					OpenGL.glTexCoord2f((float) this.anInt6404, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6404, 0);
					OpenGL.glEnd();
				}
				local107.method3453(local121);
				local99 = local99 + 1 & 0x1;
				local101 = local101 + 1 & 0x1;
			}
		}
		this.aBoolean420 = false;
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)Z")
	private boolean method5346() {
		if (this.aBoolean422) {
			if (this.aClass6_Sub1_Sub13_1 != null) {
				this.aClass6_Sub1_Sub13_1.method3170();
				this.aClass6_Sub1_Sub13_1 = null;
			}
			if (this.aClass40_Sub3_7 != null) {
				this.aClass40_Sub3_7.method5154();
				this.aClass40_Sub3_7 = null;
			}
			if (this.aClass166_6 != null) {
				this.aClass6_Sub1_Sub13_1 = new Class6_Sub1_Sub13(this.aClass28_Sub1_38, 6402, this.anInt6404, this.anInt6395, this.aClass28_Sub1_38.anInt725);
			}
			if (this.aBoolean424) {
				this.aClass40_Sub3_7 = new Class40_Sub3(this.aClass28_Sub1_38, 34037, 6402, this.anInt6404, this.anInt6395);
			} else if (this.aClass6_Sub1_Sub13_1 == null) {
				this.aClass6_Sub1_Sub13_1 = new Class6_Sub1_Sub13(this.aClass28_Sub1_38, 6402, this.anInt6404, this.anInt6395);
			}
			this.aBoolean421 = true;
			this.aBoolean422 = false;
			this.aBoolean423 = true;
		}
		if (this.aBoolean425) {
			if (this.aClass6_Sub1_Sub13_2 != null) {
				this.aClass6_Sub1_Sub13_2.method3170();
				this.aClass6_Sub1_Sub13_2 = null;
			}
			if (this.aClass40_Sub3Array4[0] != null) {
				this.aClass40_Sub3Array4[0].method5154();
				this.aClass40_Sub3Array4[0] = null;
			}
			if (this.aClass40_Sub3Array4[1] != null) {
				this.aClass40_Sub3Array4[1].method5154();
				this.aClass40_Sub3Array4[1] = null;
			}
			if (this.aClass166_6 != null) {
				this.aClass6_Sub1_Sub13_2 = new Class6_Sub1_Sub13(this.aClass28_Sub1_38, this.anInt6405, this.anInt6404, this.anInt6395, this.aClass28_Sub1_38.anInt725);
			}
			this.aClass40_Sub3Array4[0] = new Class40_Sub3(this.aClass28_Sub1_38, 34037, this.anInt6405, this.anInt6404, this.anInt6395);
			this.aClass40_Sub3Array4[1] = this.anInt6406 <= 1 ? null : new Class40_Sub3(this.aClass28_Sub1_38, 34037, this.anInt6405, this.anInt6404, this.anInt6395);
			this.aBoolean423 = true;
			this.aBoolean425 = false;
			this.aBoolean421 = true;
		}
		if (this.aBoolean423) {
			if (this.aClass166_6 == null) {
				this.aClass28_Sub1_38.method680(this.aClass166_5);
				this.aClass166_5.method3763(0);
				this.aClass166_5.method3763(1);
				this.aClass166_5.method3763(8);
				this.aClass166_5.method3761(0, this.aClass40_Sub3Array4[0]);
				if (this.anInt6406 > 1) {
					this.aClass166_5.method3761(1, this.aClass40_Sub3Array4[1]);
				}
				if (this.aBoolean424) {
					this.aClass166_5.method3761(8, this.aClass40_Sub3_7);
				} else {
					this.aClass166_5.method3762(this.aClass6_Sub1_Sub13_1, 8);
				}
				this.aClass28_Sub1_38.method659(this.aClass166_5);
			} else {
				this.aClass28_Sub1_38.method680(this.aClass166_5);
				this.aClass166_5.method3763(0);
				this.aClass166_5.method3763(1);
				this.aClass166_5.method3763(8);
				this.aClass166_5.method3761(0, this.aClass40_Sub3Array4[0]);
				if (this.anInt6406 > 1) {
					this.aClass166_5.method3761(1, this.aClass40_Sub3Array4[1]);
				}
				if (this.aBoolean424) {
					this.aClass166_5.method3761(8, this.aClass40_Sub3_7);
				}
				this.aClass28_Sub1_38.method659(this.aClass166_5);
				this.aClass28_Sub1_38.method680(this.aClass166_6);
				this.aClass166_6.method3763(0);
				this.aClass166_6.method3763(8);
				this.aClass166_6.method3762(this.aClass6_Sub1_Sub13_2, 0);
				this.aClass166_6.method3762(this.aClass6_Sub1_Sub13_1, 8);
				this.aClass28_Sub1_38.method659(this.aClass166_6);
			}
			this.aBoolean421 = true;
			this.aBoolean423 = false;
		}
		if (this.aBoolean421) {
			this.aClass28_Sub1_38.method680(this.aClass166_7);
			this.aBoolean421 = !this.aClass166_7.method3758();
			this.aClass28_Sub1_38.method659(this.aClass166_7);
		}
		return !this.aBoolean421;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ZIIII)Z")
	public boolean method5347(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass166_7 == null || this.aClass88_45.method1888()) {
			return false;
		}
		if (this.anInt6404 != arg0 || this.anInt6395 != arg3) {
			this.anInt6404 = arg0;
			this.anInt6395 = arg3;
			for (@Pc(47) Class6 local47 = this.aClass88_45.method1882(); local47 != this.aClass88_45.aClass6_73; local47 = local47.aClass6_252) {
				((Class6_Sub21) local47).method3450(this.anInt6404, this.anInt6395);
			}
			this.aBoolean423 = true;
			this.aBoolean425 = true;
			this.aBoolean422 = true;
		}
		if (!this.method5346()) {
			return false;
		}
		this.anInt6394 = arg2;
		this.aBoolean420 = true;
		this.anInt6402 = arg1;
		this.aClass28_Sub1_38.method680(this.aClass166_7);
		this.aClass166_7.method3754(0);
		this.aClass28_Sub1_38.method706(-this.anInt6402, this.anInt6395 - this.aClass166_7.method3757() - this.anInt6394);
		return true;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!mr;I)Z")
	public boolean method5348(@OriginalArg(0) Class6_Sub21 arg0) {
		if (this.aClass166_7 != null) {
			if (arg0.method3452() || arg0.method3451()) {
				this.aClass88_45.method1878(arg0);
				this.method5340();
				if (this.method5346()) {
					if (this.anInt6404 != -1 && this.anInt6395 != -1) {
						arg0.method3450(this.anInt6404, this.anInt6395);
					}
					arg0.aBoolean252 = true;
					return true;
				}
			}
			this.method5341(arg0);
		}
		return false;
	}
}
