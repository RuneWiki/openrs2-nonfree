import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class162 {

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "Z")
	private boolean aBoolean387;

	@OriginalMember(owner = "client!mq", name = "y", descriptor = "Lclient!cj;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_1;

	@OriginalMember(owner = "client!mq", name = "F", descriptor = "Lclient!wr;")
	private Class65_Sub3 aClass65_Sub3_5;

	@OriginalMember(owner = "client!mq", name = "G", descriptor = "Lclient!cj;")
	private Class2_Sub2_Sub4 aClass2_Sub2_Sub4_2;

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	private int anInt4722 = 0;

	@OriginalMember(owner = "client!mq", name = "t", descriptor = "I")
	private int anInt4734 = 0;

	@OriginalMember(owner = "client!mq", name = "j", descriptor = "I")
	private int anInt4726 = 1;

	@OriginalMember(owner = "client!mq", name = "v", descriptor = "I")
	private int anInt4735 = 1;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "Lclient!wl;")
	private final Class265 aClass265_38 = new Class265();

	@OriginalMember(owner = "client!mq", name = "x", descriptor = "I")
	private int anInt4737 = -1;

	@OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
	private int anInt4738 = 0;

	@OriginalMember(owner = "client!mq", name = "C", descriptor = "Z")
	private boolean aBoolean390 = true;

	@OriginalMember(owner = "client!mq", name = "B", descriptor = "Z")
	private boolean aBoolean389 = true;

	@OriginalMember(owner = "client!mq", name = "D", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!mq", name = "E", descriptor = "[Lclient!wr;")
	private Class65_Sub3[] aClass65_Sub3Array1 = new Class65_Sub3[2];

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "Z")
	private boolean aBoolean388 = true;

	@OriginalMember(owner = "client!mq", name = "H", descriptor = "Z")
	private boolean aBoolean392 = true;

	@OriginalMember(owner = "client!mq", name = "p", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_23;

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "Lclient!qh;")
	private Class200 aClass200_4;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!qh;")
	private Class200 aClass200_5;

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "Lclient!qh;")
	private Class200 aClass200_3;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class162(@OriginalArg(0) Class26_Sub1 arg0) {
		this.aClass26_Sub1_23 = arg0;
		if (this.aClass26_Sub1_23.aBoolean80 && this.aClass26_Sub1_23.aBoolean72) {
			this.aClass200_5 = this.aClass200_4 = new Class200(this.aClass26_Sub1_23);
			if (this.aClass26_Sub1_23.anInt921 > 1 && this.aClass26_Sub1_23.aBoolean82 && this.aClass26_Sub1_23.aBoolean67) {
				this.aClass200_5 = this.aClass200_3 = new Class200(this.aClass26_Sub1_23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	public void method3822() {
		this.aClass200_5 = this.aClass200_3 = this.aClass200_4 = null;
		this.aClass65_Sub3Array1 = null;
		this.aClass2_Sub2_Sub4_1 = null;
		this.aClass65_Sub3_5 = null;
		this.aClass2_Sub2_Sub4_2 = null;
		if (!this.aClass265_38.method5997()) {
			for (@Pc(42) Class2 local42 = this.aClass265_38.method6005(); local42 != this.aClass265_38.aClass2_257; local42 = local42.aClass2_261) {
				((Class2_Sub32) local42).method5806();
			}
		}
		this.anInt4726 = this.anInt4735 = 1;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!pi;)V")
	public void method3823(@OriginalArg(1) Class2_Sub32 arg0) {
		arg0.aBoolean639 = false;
		arg0.method5806();
		arg0.method6072();
		this.method3827();
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)Z")
	public boolean method3824() {
		return this.aClass200_5 != null;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
	private void method3827() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub32 local17 = (Class2_Sub32) this.aClass265_38.method6005(); local17 != null; local17 = (Class2_Sub32) this.aClass265_38.method6001()) {
			local23 = local17.method5812();
			if (local23 > local9) {
				local9 = local23;
			}
			local11 += local17.method5805();
			local7 |= local17.method5810();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt4737 != local23) {
			this.aBoolean390 = true;
			this.anInt4737 = local23;
		}
		@Pc(97) int local97 = this.anInt4738 <= 2 ? this.anInt4738 : 2;
		@Pc(106) int local106 = local11 <= 2 ? local11 : 2;
		if (local97 != local106) {
			this.aBoolean389 = this.aBoolean390 = true;
		}
		if (this.aBoolean391 != local7) {
			this.aBoolean391 = local7;
			this.aBoolean392 = true;
		}
		this.anInt4738 = local11;
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(ILclient!pi;)Z")
	public boolean method3828(@OriginalArg(1) Class2_Sub32 arg0) {
		if (this.aClass200_5 != null) {
			if (arg0.method5809() || arg0.method5801()) {
				this.aClass265_38.method5999(arg0);
				this.method3827();
				if (this.method3829()) {
					if (this.anInt4726 != -1 && this.anInt4735 != -1) {
						arg0.method5802(this.anInt4735, this.anInt4726);
					}
					arg0.aBoolean639 = true;
					return true;
				}
			}
			this.method3823(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
	private boolean method3829() {
		if (this.aBoolean392) {
			if (this.aClass2_Sub2_Sub4_2 != null) {
				this.aClass2_Sub2_Sub4_2.method1032();
				this.aClass2_Sub2_Sub4_2 = null;
			}
			if (this.aClass65_Sub3_5 != null) {
				this.aClass65_Sub3_5.method4258();
				this.aClass65_Sub3_5 = null;
			}
			if (this.aClass200_3 != null) {
				this.aClass2_Sub2_Sub4_2 = new Class2_Sub2_Sub4(this.aClass26_Sub1_23, 6402, this.anInt4726, this.anInt4735, this.aClass26_Sub1_23.anInt921);
			}
			if (this.aBoolean391) {
				this.aClass65_Sub3_5 = new Class65_Sub3(this.aClass26_Sub1_23, 34037, 6402, this.anInt4726, this.anInt4735);
			} else if (this.aClass2_Sub2_Sub4_2 == null) {
				this.aClass2_Sub2_Sub4_2 = new Class2_Sub2_Sub4(this.aClass26_Sub1_23, 6402, this.anInt4726, this.anInt4735);
			}
			this.aBoolean389 = true;
			this.aBoolean392 = false;
			this.aBoolean388 = true;
		}
		if (this.aBoolean390) {
			if (this.aClass2_Sub2_Sub4_1 != null) {
				this.aClass2_Sub2_Sub4_1.method1032();
				this.aClass2_Sub2_Sub4_1 = null;
			}
			if (this.aClass65_Sub3Array1[0] != null) {
				this.aClass65_Sub3Array1[0].method4258();
				this.aClass65_Sub3Array1[0] = null;
			}
			if (this.aClass65_Sub3Array1[1] != null) {
				this.aClass65_Sub3Array1[1].method4258();
				this.aClass65_Sub3Array1[1] = null;
			}
			if (this.aClass200_3 != null) {
				this.aClass2_Sub2_Sub4_1 = new Class2_Sub2_Sub4(this.aClass26_Sub1_23, this.anInt4737, this.anInt4726, this.anInt4735, this.aClass26_Sub1_23.anInt921);
			}
			this.aClass65_Sub3Array1[0] = new Class65_Sub3(this.aClass26_Sub1_23, 34037, this.anInt4737, this.anInt4726, this.anInt4735);
			this.aClass65_Sub3Array1[1] = this.anInt4738 > 1 ? new Class65_Sub3(this.aClass26_Sub1_23, 34037, this.anInt4737, this.anInt4726, this.anInt4735) : null;
			this.aBoolean390 = false;
			this.aBoolean388 = true;
			this.aBoolean389 = true;
		}
		if (this.aBoolean389) {
			if (this.aClass200_3 == null) {
				this.aClass26_Sub1_23.method631(this.aClass200_4);
				this.aClass200_4.method4548(0);
				this.aClass200_4.method4548(1);
				this.aClass200_4.method4548(8);
				this.aClass200_4.method4549(0, this.aClass65_Sub3Array1[0]);
				if (this.anInt4738 > 1) {
					this.aClass200_4.method4549(1, this.aClass65_Sub3Array1[1]);
				}
				if (this.aBoolean391) {
					this.aClass200_4.method4549(8, this.aClass65_Sub3_5);
				} else {
					this.aClass200_4.method4539(this.aClass2_Sub2_Sub4_2, 8);
				}
				this.aClass26_Sub1_23.method635(this.aClass200_4);
			} else {
				this.aClass26_Sub1_23.method631(this.aClass200_4);
				this.aClass200_4.method4548(0);
				this.aClass200_4.method4548(1);
				this.aClass200_4.method4548(8);
				this.aClass200_4.method4549(0, this.aClass65_Sub3Array1[0]);
				if (this.anInt4738 > 1) {
					this.aClass200_4.method4549(1, this.aClass65_Sub3Array1[1]);
				}
				if (this.aBoolean391) {
					this.aClass200_4.method4549(8, this.aClass65_Sub3_5);
				}
				this.aClass26_Sub1_23.method635(this.aClass200_4);
				this.aClass26_Sub1_23.method631(this.aClass200_3);
				this.aClass200_3.method4548(0);
				this.aClass200_3.method4548(8);
				this.aClass200_3.method4539(this.aClass2_Sub2_Sub4_1, 0);
				this.aClass200_3.method4539(this.aClass2_Sub2_Sub4_2, 8);
				this.aClass26_Sub1_23.method635(this.aClass200_3);
			}
			this.aBoolean388 = true;
			this.aBoolean389 = false;
		}
		if (this.aBoolean388) {
			this.aClass26_Sub1_23.method631(this.aClass200_5);
			this.aBoolean388 = !this.aClass200_5.method4552();
			this.aClass26_Sub1_23.method635(this.aClass200_5);
		}
		return !this.aBoolean388;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	public void method3830() {
		if (!this.aBoolean387) {
			return;
		}
		if (this.aClass200_3 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass26_Sub1_23.method681(this.aClass200_3);
			this.aClass26_Sub1_23.method684(this.aClass200_4);
			this.aClass200_3.method4537();
			this.aClass200_4.method4538(0);
			if (this.aBoolean391) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4726, this.anInt4735, 0, 0, this.anInt4726, this.anInt4735, local14, 9728);
			this.aClass26_Sub1_23.method676(this.aClass200_3);
			this.aClass26_Sub1_23.method703(this.aClass200_4);
		}
		this.aClass26_Sub1_23.method630();
		this.aClass26_Sub1_23.method671(0);
		this.aClass26_Sub1_23.method669(1);
		this.aClass26_Sub1_23.va();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(115) Class2_Sub32 local115;
		for (@Pc(105) Class2_Sub32 local105 = (Class2_Sub32) this.aClass265_38.method6005(); local105 != null; local105 = local115) {
			local115 = (Class2_Sub32) this.aClass265_38.method6001();
			@Pc(119) int local119 = local105.method5805();
			for (@Pc(121) int local121 = 0; local121 < local119; local121++) {
				local105.method5807(local121, this.aClass65_Sub3_5, this.aClass65_Sub3Array1[local91]);
				if (local115 == null && local121 == local119 - 1) {
					this.aClass26_Sub1_23.method635(this.aClass200_4);
					this.aClass26_Sub1_23.method704(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4722, this.anInt4734);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4722, this.anInt4735 + this.anInt4734);
					OpenGL.glTexCoord2f((float) this.anInt4726, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4722 + this.anInt4726, this.anInt4735 + this.anInt4734);
					OpenGL.glTexCoord2f((float) this.anInt4726, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4722 + this.anInt4726, this.anInt4734);
					OpenGL.glEnd();
				} else {
					this.aClass200_4.method4538(local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4735);
					OpenGL.glTexCoord2f((float) this.anInt4726, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4726, this.anInt4735);
					OpenGL.glTexCoord2f((float) this.anInt4726, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4726, 0);
					OpenGL.glEnd();
				}
				local93 = local93 + 1 & 0x1;
				local105.method5804(local121);
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean387 = false;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIIII)Z")
	public boolean method3831(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass200_5 == null || this.aClass265_38.method5997()) {
			return false;
		}
		if (arg3 != this.anInt4726 || this.anInt4735 != arg1) {
			this.anInt4735 = arg1;
			this.anInt4726 = arg3;
			for (@Pc(43) Class2 local43 = this.aClass265_38.method6005(); local43 != this.aClass265_38.aClass2_257; local43 = local43.aClass2_261) {
				((Class2_Sub32) local43).method5802(this.anInt4735, this.anInt4726);
			}
			this.aBoolean390 = true;
			this.aBoolean392 = true;
			this.aBoolean389 = true;
		}
		if (!this.method3829()) {
			return false;
		}
		this.anInt4734 = arg2;
		this.aBoolean387 = true;
		this.anInt4722 = arg0;
		this.aClass26_Sub1_23.method631(this.aClass200_5);
		this.aClass200_5.method4538(0);
		this.aClass26_Sub1_23.method704(this.anInt4735 - this.aClass200_5.method4547() - this.anInt4734, -this.anInt4722);
		return true;
	}
}
