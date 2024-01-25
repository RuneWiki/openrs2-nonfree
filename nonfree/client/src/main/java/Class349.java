import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class349 {

	@OriginalMember(owner = "client!tq", name = "u", descriptor = "Z")
	private boolean aBoolean703;

	@OriginalMember(owner = "client!tq", name = "B", descriptor = "Lclient!jt;")
	private Class6_Sub2_Sub12 aClass6_Sub2_Sub12_1;

	@OriginalMember(owner = "client!tq", name = "h", descriptor = "Lclient!jt;")
	private Class6_Sub2_Sub12 aClass6_Sub2_Sub12_2;

	@OriginalMember(owner = "client!tq", name = "D", descriptor = "Lclient!bp;")
	private Class44_Sub1 aClass44_Sub1_4;

	@OriginalMember(owner = "client!tq", name = "A", descriptor = "I")
	private int anInt9451 = 1;

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
	private int anInt9456 = 1;

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "I")
	private int anInt9452 = 0;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
	private int anInt9455 = 0;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "Lclient!tf;")
	private final Class340 aClass340_72 = new Class340();

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "I")
	private int anInt9460 = 0;

	@OriginalMember(owner = "client!tq", name = "G", descriptor = "Z")
	private boolean aBoolean704 = true;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Z")
	private boolean aBoolean706 = true;

	@OriginalMember(owner = "client!tq", name = "o", descriptor = "[Lclient!bp;")
	private Class44_Sub1[] aClass44_Sub1Array3 = new Class44_Sub1[2];

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "Z")
	private boolean aBoolean705 = false;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "Z")
	private boolean aBoolean707 = true;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
	private int anInt9461 = -1;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "Z")
	private boolean aBoolean708 = true;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_37;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "Lclient!hb;")
	private Class146 aClass146_4;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "Lclient!hb;")
	private Class146 aClass146_3;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "Lclient!hb;")
	private Class146 aClass146_5;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class349(@OriginalArg(0) Class75_Sub3 arg0) {
		this.aClass75_Sub3_37 = arg0;
		if (this.aClass75_Sub3_37.aBoolean473 && this.aClass75_Sub3_37.aBoolean492) {
			this.aClass146_3 = this.aClass146_4 = new Class146(this.aClass75_Sub3_37);
			if (this.aClass75_Sub3_37.anInt6527 > 1 && this.aClass75_Sub3_37.aBoolean481 && this.aClass75_Sub3_37.aBoolean477) {
				this.aClass146_3 = this.aClass146_5 = new Class146(this.aClass75_Sub3_37);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!dba;)V")
	public void method8246(@OriginalArg(1) Class6_Sub12 arg0) {
		arg0.aBoolean709 = false;
		arg0.method8266();
		arg0.method9051();
		this.method8248();
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V")
	public void method8247() {
		if (!this.aBoolean703) {
			return;
		}
		if (this.aClass146_5 != null) {
			this.aClass75_Sub3_37.method5819(this.aClass146_5);
			@Pc(21) short local21 = 16384;
			this.aClass75_Sub3_37.method5766(this.aClass146_4);
			this.aClass146_5.method3888();
			this.aClass146_4.method3885(0);
			if (this.aBoolean705) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9456, this.anInt9451, 0, 0, this.anInt9456, this.anInt9451, local21, 9728);
			this.aClass75_Sub3_37.method5802(this.aClass146_5);
			this.aClass75_Sub3_37.method5831(this.aClass146_4);
		}
		this.aClass75_Sub3_37.method5776();
		this.aClass75_Sub3_37.method5826(0);
		this.aClass75_Sub3_37.method5787(1);
		this.aClass75_Sub3_37.la();
		@Pc(90) int local90 = 0;
		@Pc(92) int local92 = 1;
		@Pc(116) Class6_Sub12 local116;
		for (@Pc(106) Class6_Sub12 local106 = (Class6_Sub12) this.aClass340_72.method8124(); local106 != null; local106 = local116) {
			local116 = (Class6_Sub12) this.aClass340_72.method8134();
			@Pc(120) int local120 = local106.method8268();
			for (@Pc(122) int local122 = 0; local122 < local120; local122++) {
				local106.method8271(this.aClass44_Sub1_4, local122, this.aClass44_Sub1Array3[local90]);
				if (local116 == null && local120 - 1 == local122) {
					this.aClass75_Sub3_37.method5791(this.aClass146_4);
					this.aClass75_Sub3_37.method5811(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9451);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9455, this.anInt9452);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9455, this.anInt9451 + this.anInt9452);
					OpenGL.glTexCoord2f((float) this.anInt9456, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9456 + this.anInt9455, this.anInt9452 - -this.anInt9451);
					OpenGL.glTexCoord2f((float) this.anInt9456, (float) this.anInt9451);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9456 + this.anInt9455, this.anInt9452);
					OpenGL.glEnd();
				} else {
					this.aClass146_4.method3885(local92);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9451);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt9451);
					OpenGL.glTexCoord2f((float) this.anInt9456, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9456, this.anInt9451);
					OpenGL.glTexCoord2f((float) this.anInt9456, (float) this.anInt9451);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9456, 0);
					OpenGL.glEnd();
				}
				local90 = local90 + 1 & 0x1;
				local106.method8273(local122);
				local92 = local92 + 1 & 0x1;
			}
		}
		this.aBoolean703 = false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
	private void method8248() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class6_Sub12 local17 = (Class6_Sub12) this.aClass340_72.method8124(); local17 != null; local17 = (Class6_Sub12) this.aClass340_72.method8134()) {
			local25 = local17.method8262();
			local11 += local17.method8268();
			if (local25 > local9) {
				local9 = local25;
			}
			local7 |= local17.method8265();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (this.anInt9461 != local25) {
			this.anInt9461 = local25;
			this.aBoolean704 = true;
		}
		@Pc(116) int local116 = this.anInt9460 <= 2 ? this.anInt9460 : 2;
		@Pc(126) int local126 = local11 > 2 ? 2 : local11;
		this.anInt9460 = local11;
		if (this.aBoolean705 != local7) {
			this.aBoolean706 = true;
			this.aBoolean705 = local7;
		}
		if (local116 != local126) {
			this.aBoolean707 = this.aBoolean704 = true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Lclient!dba;I)Z")
	public boolean method8249(@OriginalArg(0) Class6_Sub12 arg0) {
		if (this.aClass146_3 != null) {
			if (arg0.method8275() || arg0.method8264()) {
				this.aClass340_72.method8131(arg0);
				this.method8248();
				if (this.method8252()) {
					if (this.anInt9456 != -1 && this.anInt9451 != -1) {
						arg0.method8263(this.anInt9451, this.anInt9456);
					}
					arg0.aBoolean709 = true;
					return true;
				}
			}
			this.method8246(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZIII)Z")
	public boolean method8250(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass146_3 == null || this.aClass340_72.method8121()) {
			return false;
		}
		if (this.anInt9456 != arg3 || arg0 != this.anInt9451) {
			this.anInt9451 = arg0;
			this.anInt9456 = arg3;
			for (@Pc(54) Class6 local54 = this.aClass340_72.method8124(); local54 != this.aClass340_72.aClass6_283; local54 = local54.aClass6_339) {
				((Class6_Sub12) local54).method8263(this.anInt9451, this.anInt9456);
			}
			this.aBoolean704 = true;
			this.aBoolean706 = true;
			this.aBoolean707 = true;
		}
		if (!this.method8252()) {
			return false;
		}
		this.anInt9452 = arg2;
		this.anInt9455 = arg1;
		this.aBoolean703 = true;
		this.aClass75_Sub3_37.method5769(this.aClass146_3);
		this.aClass146_3.method3885(0);
		this.aClass75_Sub3_37.method5811(this.anInt9452 + this.anInt9451 - this.aClass75_Sub3_37.anInt6525, -this.anInt9455);
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)Z")
	public boolean method8251() {
		return this.aClass146_3 != null;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Z")
	private boolean method8252() {
		if (this.aBoolean706) {
			if (this.aClass6_Sub2_Sub12_1 != null) {
				this.aClass6_Sub2_Sub12_1.method4797();
				this.aClass6_Sub2_Sub12_1 = null;
			}
			if (this.aClass44_Sub1_4 != null) {
				this.aClass44_Sub1_4.method9005();
				this.aClass44_Sub1_4 = null;
			}
			if (this.aClass146_5 != null) {
				this.aClass6_Sub2_Sub12_1 = new Class6_Sub2_Sub12(this.aClass75_Sub3_37, 6402, this.anInt9456, this.anInt9451, this.aClass75_Sub3_37.anInt6527);
			}
			if (this.aBoolean705) {
				this.aClass44_Sub1_4 = new Class44_Sub1(this.aClass75_Sub3_37, 34037, 6402, this.anInt9456, this.anInt9451);
			} else if (this.aClass6_Sub2_Sub12_1 == null) {
				this.aClass6_Sub2_Sub12_1 = new Class6_Sub2_Sub12(this.aClass75_Sub3_37, 6402, this.anInt9456, this.anInt9451);
			}
			this.aBoolean707 = true;
			this.aBoolean708 = true;
			this.aBoolean706 = false;
		}
		if (this.aBoolean704) {
			if (this.aClass6_Sub2_Sub12_2 != null) {
				this.aClass6_Sub2_Sub12_2.method4797();
				this.aClass6_Sub2_Sub12_2 = null;
			}
			if (this.aClass44_Sub1Array3[0] != null) {
				this.aClass44_Sub1Array3[0].method9005();
				this.aClass44_Sub1Array3[0] = null;
			}
			if (this.aClass44_Sub1Array3[1] != null) {
				this.aClass44_Sub1Array3[1].method9005();
				this.aClass44_Sub1Array3[1] = null;
			}
			if (this.aClass146_5 != null) {
				this.aClass6_Sub2_Sub12_2 = new Class6_Sub2_Sub12(this.aClass75_Sub3_37, this.anInt9461, this.anInt9456, this.anInt9451, this.aClass75_Sub3_37.anInt6527);
			}
			this.aClass44_Sub1Array3[0] = new Class44_Sub1(this.aClass75_Sub3_37, 34037, this.anInt9461, this.anInt9456, this.anInt9451);
			this.aClass44_Sub1Array3[1] = this.anInt9460 <= 1 ? null : new Class44_Sub1(this.aClass75_Sub3_37, 34037, this.anInt9461, this.anInt9456, this.anInt9451);
			this.aBoolean708 = true;
			this.aBoolean707 = true;
			this.aBoolean704 = false;
		}
		if (this.aBoolean707) {
			if (this.aClass146_5 == null) {
				this.aClass75_Sub3_37.method5769(this.aClass146_4);
				this.aClass146_4.method3887(0);
				this.aClass146_4.method3887(1);
				this.aClass146_4.method3887(8);
				this.aClass146_4.method3889(this.aClass44_Sub1Array3[0], 0);
				if (this.anInt9460 > 1) {
					this.aClass146_4.method3889(this.aClass44_Sub1Array3[1], 1);
				}
				if (this.aBoolean705) {
					this.aClass146_4.method3889(this.aClass44_Sub1_4, 8);
				} else {
					this.aClass146_4.method3883(this.aClass6_Sub2_Sub12_1, 8);
				}
				this.aClass75_Sub3_37.method5791(this.aClass146_4);
			} else {
				this.aClass75_Sub3_37.method5769(this.aClass146_4);
				this.aClass146_4.method3887(0);
				this.aClass146_4.method3887(1);
				this.aClass146_4.method3887(8);
				this.aClass146_4.method3889(this.aClass44_Sub1Array3[0], 0);
				if (this.anInt9460 > 1) {
					this.aClass146_4.method3889(this.aClass44_Sub1Array3[1], 1);
				}
				if (this.aBoolean705) {
					this.aClass146_4.method3889(this.aClass44_Sub1_4, 8);
				}
				this.aClass75_Sub3_37.method5791(this.aClass146_4);
				this.aClass75_Sub3_37.method5769(this.aClass146_5);
				this.aClass146_5.method3887(0);
				this.aClass146_5.method3887(8);
				this.aClass146_5.method3883(this.aClass6_Sub2_Sub12_2, 0);
				this.aClass146_5.method3883(this.aClass6_Sub2_Sub12_1, 8);
				this.aClass75_Sub3_37.method5791(this.aClass146_5);
			}
			this.aBoolean708 = true;
			this.aBoolean707 = false;
		}
		if (this.aBoolean708) {
			this.aClass75_Sub3_37.method5769(this.aClass146_3);
			this.aBoolean708 = !this.aClass146_3.method3884();
			this.aClass75_Sub3_37.method5791(this.aClass146_3);
		}
		return !this.aBoolean708;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V")
	public void method8253() {
		this.aClass6_Sub2_Sub12_1 = null;
		this.aClass6_Sub2_Sub12_2 = null;
		this.aClass44_Sub1Array3 = null;
		this.aClass146_3 = this.aClass146_5 = this.aClass146_4 = null;
		this.aClass44_Sub1_4 = null;
		if (!this.aClass340_72.method8121()) {
			for (@Pc(45) Class6 local45 = this.aClass340_72.method8124(); local45 != this.aClass340_72.aClass6_283; local45 = local45.aClass6_339) {
				((Class6_Sub12) local45).method8266();
			}
		}
		this.anInt9456 = this.anInt9451 = 1;
	}
}
