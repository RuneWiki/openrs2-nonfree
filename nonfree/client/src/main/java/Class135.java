import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hk")
public final class Class135 {

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "Z")
	private boolean aBoolean296;

	@OriginalMember(owner = "client!hk", name = "A", descriptor = "Lclient!aw;")
	private Class3_Sub2 aClass3_Sub2_1;

	@OriginalMember(owner = "client!hk", name = "D", descriptor = "Lclient!aea;")
	private Class6_Sub2_Sub2 aClass6_Sub2_Sub2_1;

	@OriginalMember(owner = "client!hk", name = "F", descriptor = "Lclient!aea;")
	private Class6_Sub2_Sub2 aClass6_Sub2_Sub2_2;

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "I")
	private int anInt4206 = 0;

	@OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
	private int anInt4213 = 1;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	private int anInt4216 = 1;

	@OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
	private int anInt4214 = 0;

	@OriginalMember(owner = "client!hk", name = "q", descriptor = "Lclient!ada;")
	private final Class8 aClass8_22 = new Class8();

	@OriginalMember(owner = "client!hk", name = "v", descriptor = "[Lclient!aw;")
	private Class3_Sub2[] aClass3_Sub2Array1 = new Class3_Sub2[2];

	@OriginalMember(owner = "client!hk", name = "y", descriptor = "Z")
	private boolean aBoolean298 = true;

	@OriginalMember(owner = "client!hk", name = "x", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!hk", name = "w", descriptor = "I")
	private int anInt4220 = 0;

	@OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
	private int anInt4222 = -1;

	@OriginalMember(owner = "client!hk", name = "z", descriptor = "Z")
	private boolean aBoolean299 = true;

	@OriginalMember(owner = "client!hk", name = "C", descriptor = "Z")
	private boolean aBoolean300 = true;

	@OriginalMember(owner = "client!hk", name = "G", descriptor = "Z")
	private boolean aBoolean301 = true;

	@OriginalMember(owner = "client!hk", name = "m", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_25;

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "Lclient!iha;")
	private Class149 aClass149_1;

	@OriginalMember(owner = "client!hk", name = "h", descriptor = "Lclient!iha;")
	private Class149 aClass149_2;

	@OriginalMember(owner = "client!hk", name = "r", descriptor = "Lclient!iha;")
	private Class149 aClass149_3;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class135(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_25 = arg0;
		if (this.aClass100_Sub3_25.aBoolean698 && this.aClass100_Sub3_25.aBoolean710) {
			this.aClass149_2 = this.aClass149_1 = new Class149(this.aClass100_Sub3_25);
			if (this.aClass100_Sub3_25.anInt10580 > 1 && this.aClass100_Sub3_25.aBoolean720 && this.aClass100_Sub3_25.aBoolean707) {
				this.aClass149_2 = this.aClass149_3 = new Class149(this.aClass100_Sub3_25);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lclient!uga;I)Z")
	public boolean method3653(@OriginalArg(0) Class6_Sub25 arg0) {
		if (this.aClass149_2 != null) {
			if (arg0.method3990() || arg0.method3988()) {
				this.aClass8_22.method157(arg0);
				this.method3656();
				if (this.method3659()) {
					if (this.anInt4216 != -1 && this.anInt4213 != -1) {
						arg0.method3999(this.anInt4213, this.anInt4216);
					}
					arg0.aBoolean329 = true;
					return true;
				}
			}
			this.method3657(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(IIIIB)Z")
	public boolean method3654(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass149_2 == null || this.aClass8_22.method151()) {
			return false;
		}
		if (this.anInt4216 != arg2 || arg3 != this.anInt4213) {
			this.anInt4216 = arg2;
			this.anInt4213 = arg3;
			for (@Pc(34) Class6 local34 = this.aClass8_22.method149(); local34 != this.aClass8_22.aClass6_7; local34 = local34.aClass6_299) {
				((Class6_Sub25) local34).method3999(this.anInt4213, this.anInt4216);
			}
			this.aBoolean301 = true;
			this.aBoolean298 = true;
			this.aBoolean300 = true;
		}
		if (!this.method3659()) {
			return false;
		}
		this.anInt4206 = arg1;
		this.aBoolean296 = true;
		this.anInt4214 = arg0;
		this.aClass100_Sub3_25.method8935(this.aClass149_2);
		this.aClass149_2.method4097(0);
		this.aClass100_Sub3_25.method8930(-this.anInt4206, this.anInt4214 + this.anInt4213 - this.aClass100_Sub3_25.anInt10436);
		return true;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)V")
	public void method3655() {
		this.aClass6_Sub2_Sub2_2 = null;
		this.aClass3_Sub2_1 = null;
		this.aClass3_Sub2Array1 = null;
		this.aClass149_2 = this.aClass149_3 = this.aClass149_1 = null;
		this.aClass6_Sub2_Sub2_1 = null;
		if (!this.aClass8_22.method151()) {
			for (@Pc(44) Class6 local44 = this.aClass8_22.method149(); local44 != this.aClass8_22.aClass6_7; local44 = local44.aClass6_299) {
				((Class6_Sub25) local44).method3989();
			}
		}
		this.anInt4216 = this.anInt4213 = 1;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)V")
	private void method3656() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(17) int local17 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class6_Sub25 local23 = (Class6_Sub25) this.aClass8_22.method149(); local23 != null; local23 = (Class6_Sub25) this.aClass8_22.method155()) {
			local29 = local23.method4000();
			if (local29 > local9) {
				local9 = local29;
			}
			local17 += local23.method3996();
			local7 |= local23.method3992();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt4222) {
			this.aBoolean300 = true;
			this.anInt4222 = local29;
		}
		@Pc(95) int local95 = this.anInt4220 > 2 ? 2 : this.anInt4220;
		@Pc(102) int local102 = local17 > 2 ? 2 : local17;
		if (local102 != local95) {
			this.aBoolean298 = this.aBoolean300 = true;
		}
		this.anInt4220 = local17;
		if (this.aBoolean297 != local7) {
			this.aBoolean301 = true;
			this.aBoolean297 = local7;
		}
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Lclient!uga;I)V")
	public void method3657(@OriginalArg(0) Class6_Sub25 arg0) {
		arg0.aBoolean329 = false;
		arg0.method3989();
		arg0.method9043();
		this.method3656();
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)Z")
	private boolean method3659() {
		if (this.aBoolean301) {
			if (this.aClass6_Sub2_Sub2_2 != null) {
				this.aClass6_Sub2_Sub2_2.method209();
				this.aClass6_Sub2_Sub2_2 = null;
			}
			if (this.aClass3_Sub2_1 != null) {
				this.aClass3_Sub2_1.method5770();
				this.aClass3_Sub2_1 = null;
			}
			if (this.aClass149_3 != null) {
				this.aClass6_Sub2_Sub2_2 = new Class6_Sub2_Sub2(this.aClass100_Sub3_25, 6402, this.anInt4216, this.anInt4213, this.aClass100_Sub3_25.anInt10580);
			}
			if (this.aBoolean297) {
				this.aClass3_Sub2_1 = new Class3_Sub2(this.aClass100_Sub3_25, 34037, 6402, this.anInt4216, this.anInt4213);
			} else if (this.aClass6_Sub2_Sub2_2 == null) {
				this.aClass6_Sub2_Sub2_2 = new Class6_Sub2_Sub2(this.aClass100_Sub3_25, 6402, this.anInt4216, this.anInt4213);
			}
			this.aBoolean298 = true;
			this.aBoolean301 = false;
			this.aBoolean299 = true;
		}
		if (this.aBoolean300) {
			if (this.aClass6_Sub2_Sub2_1 != null) {
				this.aClass6_Sub2_Sub2_1.method209();
				this.aClass6_Sub2_Sub2_1 = null;
			}
			if (this.aClass3_Sub2Array1[0] != null) {
				this.aClass3_Sub2Array1[0].method5770();
				this.aClass3_Sub2Array1[0] = null;
			}
			if (this.aClass3_Sub2Array1[1] != null) {
				this.aClass3_Sub2Array1[1].method5770();
				this.aClass3_Sub2Array1[1] = null;
			}
			if (this.aClass149_3 != null) {
				this.aClass6_Sub2_Sub2_1 = new Class6_Sub2_Sub2(this.aClass100_Sub3_25, this.anInt4222, this.anInt4216, this.anInt4213, this.aClass100_Sub3_25.anInt10580);
			}
			this.aClass3_Sub2Array1[0] = new Class3_Sub2(this.aClass100_Sub3_25, 34037, this.anInt4222, this.anInt4216, this.anInt4213);
			this.aClass3_Sub2Array1[1] = this.anInt4220 > 1 ? new Class3_Sub2(this.aClass100_Sub3_25, 34037, this.anInt4222, this.anInt4216, this.anInt4213) : null;
			this.aBoolean298 = true;
			this.aBoolean300 = false;
			this.aBoolean299 = true;
		}
		if (this.aBoolean298) {
			if (this.aClass149_3 == null) {
				this.aClass100_Sub3_25.method8935(this.aClass149_1);
				this.aClass149_1.method4104(0);
				this.aClass149_1.method4104(1);
				this.aClass149_1.method4104(8);
				this.aClass149_1.method4098(0, this.aClass3_Sub2Array1[0]);
				if (this.anInt4220 > 1) {
					this.aClass149_1.method4098(1, this.aClass3_Sub2Array1[1]);
				}
				if (this.aBoolean297) {
					this.aClass149_1.method4098(8, this.aClass3_Sub2_1);
				} else {
					this.aClass149_1.method4102(this.aClass6_Sub2_Sub2_2, 8);
				}
				this.aClass100_Sub3_25.method8896(this.aClass149_1);
			} else {
				this.aClass100_Sub3_25.method8935(this.aClass149_1);
				this.aClass149_1.method4104(0);
				this.aClass149_1.method4104(1);
				this.aClass149_1.method4104(8);
				this.aClass149_1.method4098(0, this.aClass3_Sub2Array1[0]);
				if (this.anInt4220 > 1) {
					this.aClass149_1.method4098(1, this.aClass3_Sub2Array1[1]);
				}
				if (this.aBoolean297) {
					this.aClass149_1.method4098(8, this.aClass3_Sub2_1);
				}
				this.aClass100_Sub3_25.method8896(this.aClass149_1);
				this.aClass100_Sub3_25.method8935(this.aClass149_3);
				this.aClass149_3.method4104(0);
				this.aClass149_3.method4104(8);
				this.aClass149_3.method4102(this.aClass6_Sub2_Sub2_1, 0);
				this.aClass149_3.method4102(this.aClass6_Sub2_Sub2_2, 8);
				this.aClass100_Sub3_25.method8896(this.aClass149_3);
			}
			this.aBoolean299 = true;
			this.aBoolean298 = false;
		}
		if (this.aBoolean299) {
			this.aClass100_Sub3_25.method8935(this.aClass149_2);
			this.aBoolean299 = !this.aClass149_2.method4101();
			this.aClass100_Sub3_25.method8896(this.aClass149_2);
		}
		return !this.aBoolean299;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
	public void method3660() {
		if (!this.aBoolean296) {
			return;
		}
		if (this.aClass149_3 != null) {
			this.aClass100_Sub3_25.method8868(this.aClass149_3);
			@Pc(20) short local20 = 16384;
			this.aClass100_Sub3_25.method8906(this.aClass149_1);
			this.aClass149_3.method4091();
			this.aClass149_1.method4097(0);
			if (this.aBoolean297) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4216, this.anInt4213, 0, 0, this.anInt4216, this.anInt4213, local20, 9728);
			this.aClass100_Sub3_25.method8917(this.aClass149_3);
			this.aClass100_Sub3_25.method8879(this.aClass149_1);
		}
		this.aClass100_Sub3_25.method8904();
		this.aClass100_Sub3_25.method8876(0);
		this.aClass100_Sub3_25.method8903(1);
		this.aClass100_Sub3_25.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(107) Class6_Sub25 local107;
		for (@Pc(97) Class6_Sub25 local97 = (Class6_Sub25) this.aClass8_22.method149(); local97 != null; local97 = local107) {
			local107 = (Class6_Sub25) this.aClass8_22.method155();
			@Pc(111) int local111 = local97.method3996();
			for (@Pc(113) int local113 = 0; local113 < local111; local113++) {
				local97.method3998(local113, this.aClass3_Sub2Array1[local89], this.aClass3_Sub2_1);
				if (local107 == null && local113 == local111 - 1) {
					this.aClass100_Sub3_25.method8896(this.aClass149_1);
					this.aClass100_Sub3_25.method8930(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4213);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4206, this.anInt4214);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4206, this.anInt4213 + this.anInt4214);
					OpenGL.glTexCoord2f((float) this.anInt4216, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4206 + this.anInt4216, this.anInt4214 - -this.anInt4213);
					OpenGL.glTexCoord2f((float) this.anInt4216, (float) this.anInt4213);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4216 + this.anInt4206, this.anInt4214);
					OpenGL.glEnd();
				} else {
					this.aClass149_1.method4097(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4213);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4213);
					OpenGL.glTexCoord2f((float) this.anInt4216, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4216, this.anInt4213);
					OpenGL.glTexCoord2f((float) this.anInt4216, (float) this.anInt4213);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4216, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local97.method3995(local113);
				local89 = local89 + 1 & 0x1;
			}
		}
		this.aBoolean296 = false;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)Z")
	public boolean method3661() {
		return this.aClass149_2 != null;
	}
}
