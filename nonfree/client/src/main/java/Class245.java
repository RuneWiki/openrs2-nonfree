import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public final class Class245 {

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "Z")
	private boolean aBoolean471;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "Lclient!dr;")
	private Class5_Sub2_Sub5 aClass5_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ut", name = "A", descriptor = "Lclient!dr;")
	private Class5_Sub2_Sub5 aClass5_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ut", name = "F", descriptor = "Lclient!cd;")
	private Class31_Sub1 aClass31_Sub1_4;

	@OriginalMember(owner = "client!ut", name = "d", descriptor = "I")
	private int anInt6984 = 0;

	@OriginalMember(owner = "client!ut", name = "m", descriptor = "I")
	private int anInt6990 = 1;

	@OriginalMember(owner = "client!ut", name = "o", descriptor = "I")
	private int anInt6992 = 1;

	@OriginalMember(owner = "client!ut", name = "t", descriptor = "I")
	private int anInt6995 = 0;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "Lclient!nv;")
	private final Class177 aClass177_46 = new Class177();

	@OriginalMember(owner = "client!ut", name = "B", descriptor = "Z")
	private boolean aBoolean474 = true;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "Z")
	private boolean aBoolean472 = true;

	@OriginalMember(owner = "client!ut", name = "C", descriptor = "I")
	private int anInt6996 = -1;

	@OriginalMember(owner = "client!ut", name = "E", descriptor = "I")
	private int anInt6997 = 0;

	@OriginalMember(owner = "client!ut", name = "G", descriptor = "Z")
	private boolean aBoolean475 = true;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "Z")
	private boolean aBoolean473 = true;

	@OriginalMember(owner = "client!ut", name = "D", descriptor = "[Lclient!cd;")
	private Class31_Sub1[] aClass31_Sub1Array4 = new Class31_Sub1[2];

	@OriginalMember(owner = "client!ut", name = "H", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_41;

	@OriginalMember(owner = "client!ut", name = "f", descriptor = "Lclient!ak;")
	private Class11 aClass11_5;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "Lclient!ak;")
	private Class11 aClass11_6;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Lclient!ak;")
	private Class11 aClass11_4;

	static {
		new Class198("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class245(@OriginalArg(0) Class200_Sub2 arg0) {
		this.aClass200_Sub2_41 = arg0;
		if (this.aClass200_Sub2_41.aBoolean435 && this.aClass200_Sub2_41.aBoolean432) {
			this.aClass11_6 = this.aClass11_5 = new Class11(this.aClass200_Sub2_41);
			if (this.aClass200_Sub2_41.anInt6710 > 1 && this.aClass200_Sub2_41.aBoolean448 && this.aClass200_Sub2_41.aBoolean437) {
				this.aClass11_6 = this.aClass11_4 = new Class11(this.aClass200_Sub2_41);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ILclient!tf;)V")
	public void method5522(@OriginalArg(1) Class5_Sub39 arg0) {
		arg0.aBoolean426 = false;
		arg0.method5190();
		arg0.method6003();
		this.method5528();
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(B)V")
	public void method5523() {
		if (!this.aBoolean471) {
			return;
		}
		if (this.aClass11_4 != null) {
			@Pc(22) short local22 = 16384;
			this.aClass200_Sub2_41.method5300(this.aClass11_4);
			this.aClass200_Sub2_41.method5277(this.aClass11_5);
			this.aClass11_4.method192();
			this.aClass11_5.method191(0);
			if (this.aBoolean476) {
				local22 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6992, this.anInt6990, 0, 0, this.anInt6992, this.anInt6990, local22, 9728);
			this.aClass200_Sub2_41.method5334(this.aClass11_4);
			this.aClass200_Sub2_41.method5350(this.aClass11_5);
		}
		this.aClass200_Sub2_41.method5321();
		this.aClass200_Sub2_41.method5295(0);
		this.aClass200_Sub2_41.method5297(1);
		this.aClass200_Sub2_41.va();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class5_Sub39 local113;
		for (@Pc(105) Class5_Sub39 local105 = (Class5_Sub39) this.aClass177_46.method3618(); local105 != null; local105 = local113) {
			local113 = (Class5_Sub39) this.aClass177_46.method3619();
			@Pc(117) int local117 = local105.method5181();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method5180(this.aClass31_Sub1Array4[local97], this.aClass31_Sub1_4, local119);
				if (local113 == null && local119 == local117 - 1) {
					this.aClass200_Sub2_41.method5345(this.aClass11_5);
					this.aClass200_Sub2_41.method5318(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6990);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6995, this.anInt6984);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6995, this.anInt6990 + this.anInt6984);
					OpenGL.glTexCoord2f((float) this.anInt6992, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6992 + this.anInt6995, this.anInt6990 + this.anInt6984);
					OpenGL.glTexCoord2f((float) this.anInt6992, (float) this.anInt6990);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6995 + this.anInt6992, this.anInt6984);
					OpenGL.glEnd();
				} else {
					this.aClass11_5.method191(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6990);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6990);
					OpenGL.glTexCoord2f((float) this.anInt6992, (float) this.anInt6990);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6992, this.anInt6990);
					OpenGL.glTexCoord2f((float) this.anInt6992, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6992, 0);
					OpenGL.glEnd();
				}
				local105.method5184(local119);
				local99 = local99 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
			}
		}
		this.aBoolean471 = false;
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(B)Z")
	private boolean method5524() {
		if (this.aBoolean472) {
			if (this.aClass5_Sub2_Sub5_2 != null) {
				this.aClass5_Sub2_Sub5_2.method1223();
				this.aClass5_Sub2_Sub5_2 = null;
			}
			if (this.aClass31_Sub1_4 != null) {
				this.aClass31_Sub1_4.method4582();
				this.aClass31_Sub1_4 = null;
			}
			if (this.aClass11_4 != null) {
				this.aClass5_Sub2_Sub5_2 = new Class5_Sub2_Sub5(this.aClass200_Sub2_41, 6402, this.anInt6992, this.anInt6990, this.aClass200_Sub2_41.anInt6710);
			}
			if (this.aBoolean476) {
				this.aClass31_Sub1_4 = new Class31_Sub1(this.aClass200_Sub2_41, 34037, 6402, this.anInt6992, this.anInt6990);
			} else if (this.aClass5_Sub2_Sub5_2 == null) {
				this.aClass5_Sub2_Sub5_2 = new Class5_Sub2_Sub5(this.aClass200_Sub2_41, 6402, this.anInt6992, this.anInt6990);
			}
			this.aBoolean475 = true;
			this.aBoolean472 = false;
			this.aBoolean473 = true;
		}
		if (this.aBoolean474) {
			if (this.aClass5_Sub2_Sub5_1 != null) {
				this.aClass5_Sub2_Sub5_1.method1223();
				this.aClass5_Sub2_Sub5_1 = null;
			}
			if (this.aClass31_Sub1Array4[0] != null) {
				this.aClass31_Sub1Array4[0].method4582();
				this.aClass31_Sub1Array4[0] = null;
			}
			if (this.aClass31_Sub1Array4[1] != null) {
				this.aClass31_Sub1Array4[1].method4582();
				this.aClass31_Sub1Array4[1] = null;
			}
			if (this.aClass11_4 != null) {
				this.aClass5_Sub2_Sub5_1 = new Class5_Sub2_Sub5(this.aClass200_Sub2_41, this.anInt6996, this.anInt6992, this.anInt6990, this.aClass200_Sub2_41.anInt6710);
			}
			this.aClass31_Sub1Array4[0] = new Class31_Sub1(this.aClass200_Sub2_41, 34037, this.anInt6996, this.anInt6992, this.anInt6990);
			this.aClass31_Sub1Array4[1] = this.anInt6997 > 1 ? new Class31_Sub1(this.aClass200_Sub2_41, 34037, this.anInt6996, this.anInt6992, this.anInt6990) : null;
			this.aBoolean475 = true;
			this.aBoolean474 = false;
			this.aBoolean473 = true;
		}
		if (this.aBoolean473) {
			if (this.aClass11_4 == null) {
				this.aClass200_Sub2_41.method5328(this.aClass11_5);
				this.aClass11_5.method203(0);
				this.aClass11_5.method203(1);
				this.aClass11_5.method203(8);
				this.aClass11_5.method200(this.aClass31_Sub1Array4[0], 0);
				if (this.anInt6997 > 1) {
					this.aClass11_5.method200(this.aClass31_Sub1Array4[1], 1);
				}
				if (this.aBoolean476) {
					this.aClass11_5.method200(this.aClass31_Sub1_4, 8);
				} else {
					this.aClass11_5.method202(this.aClass5_Sub2_Sub5_2, 8);
				}
				this.aClass200_Sub2_41.method5345(this.aClass11_5);
			} else {
				this.aClass200_Sub2_41.method5328(this.aClass11_5);
				this.aClass11_5.method203(0);
				this.aClass11_5.method203(1);
				this.aClass11_5.method203(8);
				this.aClass11_5.method200(this.aClass31_Sub1Array4[0], 0);
				if (this.anInt6997 > 1) {
					this.aClass11_5.method200(this.aClass31_Sub1Array4[1], 1);
				}
				if (this.aBoolean476) {
					this.aClass11_5.method200(this.aClass31_Sub1_4, 8);
				}
				this.aClass200_Sub2_41.method5345(this.aClass11_5);
				this.aClass200_Sub2_41.method5328(this.aClass11_4);
				this.aClass11_4.method203(0);
				this.aClass11_4.method203(8);
				this.aClass11_4.method202(this.aClass5_Sub2_Sub5_1, 0);
				this.aClass11_4.method202(this.aClass5_Sub2_Sub5_2, 8);
				this.aClass200_Sub2_41.method5345(this.aClass11_4);
			}
			this.aBoolean473 = false;
			this.aBoolean475 = true;
		}
		if (this.aBoolean475) {
			this.aClass200_Sub2_41.method5328(this.aClass11_6);
			this.aBoolean475 = !this.aClass11_6.method195();
			this.aClass200_Sub2_41.method5345(this.aClass11_6);
		}
		return !this.aBoolean475;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Z)Z")
	public boolean method5526() {
		return this.aClass11_6 != null;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IIIIB)Z")
	public boolean method5527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass11_6 == null || this.aClass177_46.method3616()) {
			return false;
		}
		if (this.anInt6992 != arg1 || arg2 != this.anInt6990) {
			this.anInt6992 = arg1;
			this.anInt6990 = arg2;
			for (@Pc(48) Class5 local48 = this.aClass177_46.method3618(); local48 != this.aClass177_46.aClass5_167; local48 = local48.aClass5_267) {
				((Class5_Sub39) local48).method5191(this.anInt6990, this.anInt6992);
			}
			this.aBoolean474 = true;
			this.aBoolean473 = true;
			this.aBoolean472 = true;
		}
		if (!this.method5524()) {
			return false;
		}
		this.anInt6984 = arg3;
		this.aBoolean471 = true;
		this.anInt6995 = arg0;
		this.aClass200_Sub2_41.method5328(this.aClass11_6);
		this.aClass11_6.method191(0);
		this.aClass200_Sub2_41.method5318(this.anInt6990 - this.aClass11_6.method196() - this.anInt6984, -this.anInt6995);
		return true;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)V")
	private void method5528() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class5_Sub39 local23 = (Class5_Sub39) this.aClass177_46.method3618(); local23 != null; local23 = (Class5_Sub39) this.aClass177_46.method3619()) {
			local29 = local23.method5183();
			local11 += local23.method5181();
			if (local29 > local9) {
				local9 = local29;
			}
			local7 |= local23.method5189();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (this.anInt6996 != local29) {
			this.anInt6996 = local29;
			this.aBoolean474 = true;
		}
		@Pc(91) int local91 = this.anInt6997 > 2 ? 2 : this.anInt6997;
		@Pc(100) int local100 = local11 > 2 ? 2 : local11;
		this.anInt6997 = local11;
		if (this.aBoolean476 != local7) {
			this.aBoolean476 = local7;
			this.aBoolean472 = true;
		}
		if (local100 != local91) {
			this.aBoolean473 = this.aBoolean474 = true;
		}
	}

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
	public void method5529() {
		this.aClass11_6 = this.aClass11_4 = this.aClass11_5 = null;
		this.aClass31_Sub1_4 = null;
		this.aClass31_Sub1Array4 = null;
		this.aClass5_Sub2_Sub5_2 = null;
		this.aClass5_Sub2_Sub5_1 = null;
		if (!this.aClass177_46.method3616()) {
			for (@Pc(40) Class5 local40 = this.aClass177_46.method3618(); local40 != this.aClass177_46.aClass5_167; local40 = local40.aClass5_267) {
				((Class5_Sub39) local40).method5190();
			}
		}
		this.anInt6992 = this.anInt6990 = 1;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!tf;Z)Z")
	public boolean method5531(@OriginalArg(0) Class5_Sub39 arg0) {
		if (this.aClass11_6 != null) {
			if (arg0.method5185() || arg0.method5186()) {
				this.aClass177_46.method3615(arg0);
				this.method5528();
				if (this.method5524()) {
					if (this.anInt6992 != -1 && this.anInt6990 != -1) {
						arg0.method5191(this.anInt6990, this.anInt6992);
					}
					arg0.aBoolean426 = true;
					return true;
				}
			}
			this.method5522(arg0);
		}
		return false;
	}
}
