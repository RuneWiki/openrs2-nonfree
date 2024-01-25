import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class147 {

	@OriginalMember(owner = "client!mc", name = "t", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "Lclient!wv;")
	private Class137_Sub1 aClass137_Sub1_2;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!in;")
	private Class3_Sub3_Sub12 aClass3_Sub3_Sub12_1;

	@OriginalMember(owner = "client!mc", name = "I", descriptor = "Lclient!in;")
	private Class3_Sub3_Sub12 aClass3_Sub3_Sub12_2;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
	private int anInt4249 = 1;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
	private int anInt4246 = 0;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
	private int anInt4242 = 1;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "I")
	private int anInt4256 = 0;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!ps;")
	private final Class193 aClass193_36 = new Class193();

	@OriginalMember(owner = "client!mc", name = "A", descriptor = "I")
	private int anInt4258 = 0;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Z")
	private boolean aBoolean306 = true;

	@OriginalMember(owner = "client!mc", name = "G", descriptor = "Z")
	private boolean aBoolean307 = true;

	@OriginalMember(owner = "client!mc", name = "B", descriptor = "Z")
	private boolean aBoolean304 = true;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "Z")
	private boolean aBoolean305 = true;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "Z")
	private boolean aBoolean308 = false;

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "I")
	private int anInt4259 = -1;

	@OriginalMember(owner = "client!mc", name = "D", descriptor = "[Lclient!wv;")
	private Class137_Sub1[] aClass137_Sub1Array3 = new Class137_Sub1[2];

	@OriginalMember(owner = "client!mc", name = "s", descriptor = "Lclient!nq;")
	private final Class167_Sub1 aClass167_Sub1_25;

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "Lclient!sk;")
	private Class224 aClass224_1;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!sk;")
	private Class224 aClass224_3;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!sk;")
	private Class224 aClass224_2;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class147(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aClass167_Sub1_25 = arg0;
		if (this.aClass167_Sub1_25.aBoolean343 && this.aClass167_Sub1_25.aBoolean365) {
			this.aClass224_3 = this.aClass224_1 = new Class224(this.aClass167_Sub1_25);
			if (this.aClass167_Sub1_25.anInt4884 > 1 && this.aClass167_Sub1_25.aBoolean354 && this.aClass167_Sub1_25.aBoolean352) {
				this.aClass224_3 = this.aClass224_2 = new Class224(this.aClass167_Sub1_25);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public void method3552() {
		if (!this.aBoolean303) {
			return;
		}
		if (this.aClass224_2 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass167_Sub1_25.method4006(this.aClass224_2);
			this.aClass167_Sub1_25.method3990(this.aClass224_1);
			this.aClass224_2.method5237();
			this.aClass224_1.method5228(0);
			if (this.aBoolean308) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4242, this.anInt4249, 0, 0, this.anInt4242, this.anInt4249, local14, 9728);
			this.aClass167_Sub1_25.method4035(this.aClass224_2);
			this.aClass167_Sub1_25.method3992(this.aClass224_1);
		}
		this.aClass167_Sub1_25.method4049();
		this.aClass167_Sub1_25.method4040(0);
		this.aClass167_Sub1_25.method3998(1);
		this.aClass167_Sub1_25.H();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class3_Sub39 local109;
		for (@Pc(101) Class3_Sub39 local101 = (Class3_Sub39) this.aClass193_36.method4519(); local101 != null; local101 = local109) {
			local109 = (Class3_Sub39) this.aClass193_36.method4525();
			@Pc(113) int local113 = local101.method4926();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method4918(this.aClass137_Sub1Array3[local93], this.aClass137_Sub1_2, local115);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass167_Sub1_25.method4008(this.aClass224_1);
					this.aClass167_Sub1_25.method4005(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4249);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4256, this.anInt4246);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4256, this.anInt4246 + this.anInt4249);
					OpenGL.glTexCoord2f((float) this.anInt4242, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4256 + this.anInt4242, this.anInt4249 + this.anInt4246);
					OpenGL.glTexCoord2f((float) this.anInt4242, (float) this.anInt4249);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4242 + this.anInt4256, this.anInt4246);
					OpenGL.glEnd();
				} else {
					this.aClass224_1.method5228(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4249);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4249);
					OpenGL.glTexCoord2f((float) this.anInt4242, (float) this.anInt4249);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4242, this.anInt4249);
					OpenGL.glTexCoord2f((float) this.anInt4242, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4242, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local93 = local93 + 1 & 0x1;
				local101.method4917(local115);
			}
		}
		this.aBoolean303 = false;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)Z")
	public boolean method3553(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass224_3 == null || this.aClass193_36.method4529()) {
			return false;
		}
		if (arg3 != this.anInt4242 || this.anInt4249 != arg1) {
			this.anInt4249 = arg1;
			this.anInt4242 = arg3;
			for (@Pc(34) Class3 local34 = this.aClass193_36.method4519(); local34 != this.aClass193_36.aClass3_198; local34 = local34.aClass3_268) {
				((Class3_Sub39) local34).method4920(this.anInt4249, this.anInt4242);
			}
			this.aBoolean307 = true;
			this.aBoolean305 = true;
			this.aBoolean304 = true;
		}
		if (!this.method3561()) {
			return false;
		}
		this.anInt4246 = arg0;
		this.aBoolean303 = true;
		this.anInt4256 = arg2;
		this.aClass167_Sub1_25.method4024(this.aClass224_3);
		this.aClass224_3.method5228(0);
		this.aClass167_Sub1_25.method4005(-this.anInt4256, this.anInt4249 - this.aClass224_3.method5233() - this.anInt4246);
		return true;
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)V")
	public void method3555() {
		this.aClass3_Sub3_Sub12_1 = null;
		this.aClass137_Sub1Array3 = null;
		this.aClass137_Sub1_2 = null;
		this.aClass224_3 = this.aClass224_2 = this.aClass224_1 = null;
		this.aClass3_Sub3_Sub12_2 = null;
		if (!this.aClass193_36.method4529()) {
			for (@Pc(36) Class3 local36 = this.aClass193_36.method4519(); local36 != this.aClass193_36.aClass3_198; local36 = local36.aClass3_268) {
				((Class3_Sub39) local36).method4924();
			}
		}
		this.anInt4242 = this.anInt4249 = 1;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!wo;I)V")
	public void method3558(@OriginalArg(0) Class3_Sub39 arg0) {
		arg0.aBoolean415 = false;
		arg0.method4924();
		arg0.method6288();
		this.method3562();
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)Z")
	public boolean method3560() {
		return this.aClass224_3 != null;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)Z")
	private boolean method3561() {
		if (this.aBoolean307) {
			if (this.aClass3_Sub3_Sub12_1 != null) {
				this.aClass3_Sub3_Sub12_1.method2848();
				this.aClass3_Sub3_Sub12_1 = null;
			}
			if (this.aClass137_Sub1_2 != null) {
				this.aClass137_Sub1_2.method5779();
				this.aClass137_Sub1_2 = null;
			}
			if (this.aClass224_2 != null) {
				this.aClass3_Sub3_Sub12_1 = new Class3_Sub3_Sub12(this.aClass167_Sub1_25, 6402, this.anInt4242, this.anInt4249, this.aClass167_Sub1_25.anInt4884);
			}
			if (this.aBoolean308) {
				this.aClass137_Sub1_2 = new Class137_Sub1(this.aClass167_Sub1_25, 34037, 6402, this.anInt4242, this.anInt4249);
			} else if (this.aClass3_Sub3_Sub12_1 == null) {
				this.aClass3_Sub3_Sub12_1 = new Class3_Sub3_Sub12(this.aClass167_Sub1_25, 6402, this.anInt4242, this.anInt4249);
			}
			this.aBoolean306 = true;
			this.aBoolean304 = true;
			this.aBoolean307 = false;
		}
		if (this.aBoolean305) {
			if (this.aClass3_Sub3_Sub12_2 != null) {
				this.aClass3_Sub3_Sub12_2.method2848();
				this.aClass3_Sub3_Sub12_2 = null;
			}
			if (this.aClass137_Sub1Array3[0] != null) {
				this.aClass137_Sub1Array3[0].method5779();
				this.aClass137_Sub1Array3[0] = null;
			}
			if (this.aClass137_Sub1Array3[1] != null) {
				this.aClass137_Sub1Array3[1].method5779();
				this.aClass137_Sub1Array3[1] = null;
			}
			if (this.aClass224_2 != null) {
				this.aClass3_Sub3_Sub12_2 = new Class3_Sub3_Sub12(this.aClass167_Sub1_25, this.anInt4259, this.anInt4242, this.anInt4249, this.aClass167_Sub1_25.anInt4884);
			}
			this.aClass137_Sub1Array3[0] = new Class137_Sub1(this.aClass167_Sub1_25, 34037, this.anInt4259, this.anInt4242, this.anInt4249);
			this.aClass137_Sub1Array3[1] = this.anInt4258 > 1 ? new Class137_Sub1(this.aClass167_Sub1_25, 34037, this.anInt4259, this.anInt4242, this.anInt4249) : null;
			this.aBoolean306 = true;
			this.aBoolean304 = true;
			this.aBoolean305 = false;
		}
		if (this.aBoolean304) {
			if (this.aClass224_2 == null) {
				this.aClass167_Sub1_25.method4024(this.aClass224_1);
				this.aClass224_1.method5234(0);
				this.aClass224_1.method5234(1);
				this.aClass224_1.method5234(8);
				this.aClass224_1.method5225(0, this.aClass137_Sub1Array3[0]);
				if (this.anInt4258 > 1) {
					this.aClass224_1.method5225(1, this.aClass137_Sub1Array3[1]);
				}
				if (this.aBoolean308) {
					this.aClass224_1.method5225(8, this.aClass137_Sub1_2);
				} else {
					this.aClass224_1.method5232(8, this.aClass3_Sub3_Sub12_1);
				}
				this.aClass167_Sub1_25.method4008(this.aClass224_1);
			} else {
				this.aClass167_Sub1_25.method4024(this.aClass224_1);
				this.aClass224_1.method5234(0);
				this.aClass224_1.method5234(1);
				this.aClass224_1.method5234(8);
				this.aClass224_1.method5225(0, this.aClass137_Sub1Array3[0]);
				if (this.anInt4258 > 1) {
					this.aClass224_1.method5225(1, this.aClass137_Sub1Array3[1]);
				}
				if (this.aBoolean308) {
					this.aClass224_1.method5225(8, this.aClass137_Sub1_2);
				}
				this.aClass167_Sub1_25.method4008(this.aClass224_1);
				this.aClass167_Sub1_25.method4024(this.aClass224_2);
				this.aClass224_2.method5234(0);
				this.aClass224_2.method5234(8);
				this.aClass224_2.method5232(0, this.aClass3_Sub3_Sub12_2);
				this.aClass224_2.method5232(8, this.aClass3_Sub3_Sub12_1);
				this.aClass167_Sub1_25.method4008(this.aClass224_2);
			}
			this.aBoolean306 = true;
			this.aBoolean304 = false;
		}
		if (this.aBoolean306) {
			this.aClass167_Sub1_25.method4024(this.aClass224_3);
			this.aBoolean306 = !this.aClass224_3.method5230();
			this.aClass167_Sub1_25.method4008(this.aClass224_3);
		}
		return !this.aBoolean306;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	private void method3562() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub39 local17 = (Class3_Sub39) this.aClass193_36.method4519(); local17 != null; local17 = (Class3_Sub39) this.aClass193_36.method4525()) {
			local23 = local17.method4927();
			local11 += local17.method4926();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method4925();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt4259 != local23) {
			this.aBoolean305 = true;
			this.anInt4259 = local23;
		}
		@Pc(95) int local95 = this.anInt4258 <= 2 ? this.anInt4258 : 2;
		@Pc(102) int local102 = local11 > 2 ? 2 : local11;
		this.anInt4258 = local11;
		if (this.aBoolean308 != local7) {
			this.aBoolean308 = local7;
			this.aBoolean307 = true;
		}
		if (local102 != local95) {
			this.aBoolean304 = this.aBoolean305 = true;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!wo;B)Z")
	public boolean method3563(@OriginalArg(0) Class3_Sub39 arg0) {
		if (this.aClass224_3 != null) {
			if (arg0.method4916() || arg0.method4915()) {
				this.aClass193_36.method4527(arg0);
				this.method3562();
				if (this.method3561()) {
					if (this.anInt4242 != -1 && this.anInt4249 != -1) {
						arg0.method4920(this.anInt4249, this.anInt4242);
					}
					arg0.aBoolean415 = true;
					return true;
				}
			}
			this.method3558(arg0);
		}
		return false;
	}
}
