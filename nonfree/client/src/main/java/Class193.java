import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kj")
public final class Class193 {

	@OriginalMember(owner = "client!kj", name = "r", descriptor = "Z")
	private boolean aBoolean364;

	@OriginalMember(owner = "client!kj", name = "t", descriptor = "Lclient!ld;")
	private Class116_Sub2 aClass116_Sub2_4;

	@OriginalMember(owner = "client!kj", name = "z", descriptor = "Lclient!vw;")
	private Class4_Sub5_Sub20 aClass4_Sub5_Sub20_1;

	@OriginalMember(owner = "client!kj", name = "C", descriptor = "Lclient!vw;")
	private Class4_Sub5_Sub20 aClass4_Sub5_Sub20_2;

	@OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
	private int anInt4883 = 0;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	private int anInt4881 = 0;

	@OriginalMember(owner = "client!kj", name = "l", descriptor = "I")
	private int anInt4889 = 1;

	@OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
	private int anInt4885 = 1;

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_29 = new Class163();

	@OriginalMember(owner = "client!kj", name = "w", descriptor = "[Lclient!ld;")
	private Class116_Sub2[] aClass116_Sub2Array2 = new Class116_Sub2[2];

	@OriginalMember(owner = "client!kj", name = "v", descriptor = "Z")
	private boolean aBoolean366 = true;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "Z")
	private boolean aBoolean369 = true;

	@OriginalMember(owner = "client!kj", name = "x", descriptor = "Z")
	private boolean aBoolean367 = false;

	@OriginalMember(owner = "client!kj", name = "u", descriptor = "Z")
	private boolean aBoolean365 = true;

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
	private int anInt4893 = -1;

	@OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
	private int anInt4894 = 0;

	@OriginalMember(owner = "client!kj", name = "A", descriptor = "Z")
	private boolean aBoolean368 = true;

	@OriginalMember(owner = "client!kj", name = "n", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_15;

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "Lclient!vda;")
	private Class371 aClass371_3;

	@OriginalMember(owner = "client!kj", name = "p", descriptor = "Lclient!vda;")
	private Class371 aClass371_4;

	@OriginalMember(owner = "client!kj", name = "q", descriptor = "Lclient!vda;")
	private Class371 aClass371_5;

	@OriginalMember(owner = "client!kj", name = "<init>", descriptor = "(Lclient!pc;)V")
	public Class193(@OriginalArg(0) Class33_Sub3 arg0) {
		this.aClass33_Sub3_15 = arg0;
		if (this.aClass33_Sub3_15.aBoolean567 && this.aClass33_Sub3_15.aBoolean568) {
			this.aClass371_4 = this.aClass371_3 = new Class371(this.aClass33_Sub3_15);
			if (this.aClass33_Sub3_15.anInt7261 > 1 && this.aClass33_Sub3_15.aBoolean560 && this.aClass33_Sub3_15.aBoolean577) {
				this.aClass371_4 = this.aClass371_5 = new Class371(this.aClass33_Sub3_15);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!nd;Z)V")
	public void method4349(@OriginalArg(0) Class4_Sub18 arg0) {
		arg0.aBoolean218 = false;
		arg0.method2782();
		arg0.method9000();
		this.method4354();
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)Z")
	private boolean method4350() {
		if (this.aBoolean369) {
			if (this.aClass4_Sub5_Sub20_1 != null) {
				this.aClass4_Sub5_Sub20_1.method8678();
				this.aClass4_Sub5_Sub20_1 = null;
			}
			if (this.aClass116_Sub2_4 != null) {
				this.aClass116_Sub2_4.method8345();
				this.aClass116_Sub2_4 = null;
			}
			if (this.aClass371_5 != null) {
				this.aClass4_Sub5_Sub20_1 = new Class4_Sub5_Sub20(this.aClass33_Sub3_15, 6402, this.anInt4885, this.anInt4889, this.aClass33_Sub3_15.anInt7261);
			}
			if (this.aBoolean367) {
				this.aClass116_Sub2_4 = new Class116_Sub2(this.aClass33_Sub3_15, 34037, 6402, this.anInt4885, this.anInt4889);
			} else if (this.aClass4_Sub5_Sub20_1 == null) {
				this.aClass4_Sub5_Sub20_1 = new Class4_Sub5_Sub20(this.aClass33_Sub3_15, 6402, this.anInt4885, this.anInt4889);
			}
			this.aBoolean369 = false;
			this.aBoolean365 = true;
			this.aBoolean368 = true;
		}
		if (this.aBoolean366) {
			if (this.aClass4_Sub5_Sub20_2 != null) {
				this.aClass4_Sub5_Sub20_2.method8678();
				this.aClass4_Sub5_Sub20_2 = null;
			}
			if (this.aClass116_Sub2Array2[0] != null) {
				this.aClass116_Sub2Array2[0].method8345();
				this.aClass116_Sub2Array2[0] = null;
			}
			if (this.aClass116_Sub2Array2[1] != null) {
				this.aClass116_Sub2Array2[1].method8345();
				this.aClass116_Sub2Array2[1] = null;
			}
			if (this.aClass371_5 != null) {
				this.aClass4_Sub5_Sub20_2 = new Class4_Sub5_Sub20(this.aClass33_Sub3_15, this.anInt4893, this.anInt4885, this.anInt4889, this.aClass33_Sub3_15.anInt7261);
			}
			this.aClass116_Sub2Array2[0] = new Class116_Sub2(this.aClass33_Sub3_15, 34037, this.anInt4893, this.anInt4885, this.anInt4889);
			this.aClass116_Sub2Array2[1] = this.anInt4894 > 1 ? new Class116_Sub2(this.aClass33_Sub3_15, 34037, this.anInt4893, this.anInt4885, this.anInt4889) : null;
			this.aBoolean365 = true;
			this.aBoolean368 = true;
			this.aBoolean366 = false;
		}
		if (this.aBoolean365) {
			if (this.aClass371_5 == null) {
				this.aClass33_Sub3_15.method6360(this.aClass371_3);
				this.aClass371_3.method8447(0);
				this.aClass371_3.method8447(1);
				this.aClass371_3.method8447(8);
				this.aClass371_3.method8441(0, this.aClass116_Sub2Array2[0]);
				if (this.anInt4894 > 1) {
					this.aClass371_3.method8441(1, this.aClass116_Sub2Array2[1]);
				}
				if (this.aBoolean367) {
					this.aClass371_3.method8441(8, this.aClass116_Sub2_4);
				} else {
					this.aClass371_3.method8436(8, this.aClass4_Sub5_Sub20_1);
				}
				this.aClass33_Sub3_15.method6368(this.aClass371_3);
			} else {
				this.aClass33_Sub3_15.method6360(this.aClass371_3);
				this.aClass371_3.method8447(0);
				this.aClass371_3.method8447(1);
				this.aClass371_3.method8447(8);
				this.aClass371_3.method8441(0, this.aClass116_Sub2Array2[0]);
				if (this.anInt4894 > 1) {
					this.aClass371_3.method8441(1, this.aClass116_Sub2Array2[1]);
				}
				if (this.aBoolean367) {
					this.aClass371_3.method8441(8, this.aClass116_Sub2_4);
				}
				this.aClass33_Sub3_15.method6368(this.aClass371_3);
				this.aClass33_Sub3_15.method6360(this.aClass371_5);
				this.aClass371_5.method8447(0);
				this.aClass371_5.method8447(8);
				this.aClass371_5.method8436(0, this.aClass4_Sub5_Sub20_2);
				this.aClass371_5.method8436(8, this.aClass4_Sub5_Sub20_1);
				this.aClass33_Sub3_15.method6368(this.aClass371_5);
			}
			this.aBoolean368 = true;
			this.aBoolean365 = false;
		}
		if (this.aBoolean368) {
			this.aClass33_Sub3_15.method6360(this.aClass371_4);
			this.aBoolean368 = !this.aClass371_4.method8443();
			this.aClass33_Sub3_15.method6368(this.aClass371_4);
		}
		return !this.aBoolean368;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BIIII)Z")
	public boolean method4351(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass371_4 == null || this.aClass163_29.method3638()) {
			return false;
		}
		if (arg3 != this.anInt4885 || this.anInt4889 != arg1) {
			this.anInt4889 = arg1;
			this.anInt4885 = arg3;
			for (@Pc(44) Class4 local44 = this.aClass163_29.method3639(); local44 != this.aClass163_29.aClass4_127; local44 = local44.aClass4_337) {
				((Class4_Sub18) local44).method2774(this.anInt4885, this.anInt4889);
			}
			this.aBoolean369 = true;
			this.aBoolean366 = true;
			this.aBoolean365 = true;
		}
		if (!this.method4350()) {
			return false;
		}
		this.anInt4883 = arg2;
		this.aBoolean364 = true;
		this.anInt4881 = arg0;
		this.aClass33_Sub3_15.method6360(this.aClass371_4);
		this.aClass371_4.method8439(0);
		this.aClass33_Sub3_15.method6293(this.anInt4889 + this.anInt4883 - this.aClass33_Sub3_15.anInt7088, -this.anInt4881);
		return true;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)V")
	public void method4352() {
		if (!this.aBoolean364) {
			return;
		}
		if (this.aClass371_5 != null) {
			this.aClass33_Sub3_15.method6354(this.aClass371_5);
			@Pc(20) short local20 = 16384;
			this.aClass33_Sub3_15.method6347(this.aClass371_3);
			this.aClass371_5.method8445();
			this.aClass371_3.method8439(0);
			if (this.aBoolean367) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4885, this.anInt4889, 0, 0, this.anInt4885, this.anInt4889, local20, 9728);
			this.aClass33_Sub3_15.method6294(this.aClass371_5);
			this.aClass33_Sub3_15.method6372(this.aClass371_3);
		}
		this.aClass33_Sub3_15.method6355();
		this.aClass33_Sub3_15.method6292(0);
		this.aClass33_Sub3_15.method6336(1);
		this.aClass33_Sub3_15.la();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(109) Class4_Sub18 local109;
		for (@Pc(101) Class4_Sub18 local101 = (Class4_Sub18) this.aClass163_29.method3639(); local101 != null; local101 = local109) {
			local109 = (Class4_Sub18) this.aClass163_29.method3640();
			@Pc(113) int local113 = local101.method2772();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method2768(this.aClass116_Sub2_4, this.aClass116_Sub2Array2[local91], local115);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass33_Sub3_15.method6368(this.aClass371_3);
					this.aClass33_Sub3_15.method6293(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4889);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4881, this.anInt4883);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4881, this.anInt4883 + this.anInt4889);
					OpenGL.glTexCoord2f((float) this.anInt4885, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4881 + this.anInt4885, this.anInt4889 + this.anInt4883);
					OpenGL.glTexCoord2f((float) this.anInt4885, (float) this.anInt4889);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4885 + this.anInt4881, this.anInt4883);
					OpenGL.glEnd();
				} else {
					this.aClass371_3.method8439(--local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4889);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4889);
					OpenGL.glTexCoord2f((float) this.anInt4885, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4885, this.anInt4889);
					OpenGL.glTexCoord2f((float) this.anInt4885, (float) this.anInt4889);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4885, 0);
					OpenGL.glEnd();
				}
				local101.method2775(local115);
				local93 = local93 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean364 = false;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)Z")
	public boolean method4353() {
		return this.aClass371_4 != null;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V")
	private void method4354() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class4_Sub18 local23 = (Class4_Sub18) this.aClass163_29.method3639(); local23 != null; local23 = (Class4_Sub18) this.aClass163_29.method3640()) {
			local29 = local23.method2781();
			if (local29 > local15) {
				local15 = local29;
			}
			local17 += local23.method2772();
			local13 |= local23.method2769();
		}
		if (local15 == 2) {
			local29 = 34836;
		} else if (local15 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt4893) {
			this.anInt4893 = local29;
			this.aBoolean366 = true;
		}
		@Pc(93) int local93 = this.anInt4894 > 2 ? 2 : this.anInt4894;
		@Pc(100) int local100 = local17 > 2 ? 2 : local17;
		if (local13 != this.aBoolean367) {
			this.aBoolean367 = local13;
			this.aBoolean369 = true;
		}
		this.anInt4894 = local17;
		if (local100 != local93) {
			this.aBoolean365 = this.aBoolean366 = true;
		}
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
	public void method4355() {
		this.aClass116_Sub2Array2 = null;
		this.aClass116_Sub2_4 = null;
		this.aClass371_4 = this.aClass371_5 = this.aClass371_3 = null;
		this.aClass4_Sub5_Sub20_1 = null;
		this.aClass4_Sub5_Sub20_2 = null;
		if (!this.aClass163_29.method3638()) {
			for (@Pc(40) Class4 local40 = this.aClass163_29.method3639(); local40 != this.aClass163_29.aClass4_127; local40 = local40.aClass4_337) {
				((Class4_Sub18) local40).method2782();
			}
		}
		this.anInt4885 = this.anInt4889 = 1;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(Lclient!nd;Z)Z")
	public boolean method4356(@OriginalArg(0) Class4_Sub18 arg0) {
		if (this.aClass371_4 != null) {
			if (arg0.method2773() || arg0.method2766()) {
				this.aClass163_29.method3646(arg0);
				this.method4354();
				if (this.method4350()) {
					if (this.anInt4885 != -1 && this.anInt4889 != -1) {
						arg0.method2774(this.anInt4885, this.anInt4889);
					}
					arg0.aBoolean218 = true;
					return true;
				}
			}
			this.method4349(arg0);
		}
		return false;
	}
}
