import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ti")
public final class Class315 {

	@OriginalMember(owner = "client!ti", name = "k", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!ti", name = "z", descriptor = "Lclient!kf;")
	private Class4_Sub6_Sub12 aClass4_Sub6_Sub12_1;

	@OriginalMember(owner = "client!ti", name = "H", descriptor = "Lclient!kf;")
	private Class4_Sub6_Sub12 aClass4_Sub6_Sub12_2;

	@OriginalMember(owner = "client!ti", name = "J", descriptor = "Lclient!il;")
	private Class3_Sub2 aClass3_Sub2_6;

	@OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
	private int anInt9462 = 1;

	@OriginalMember(owner = "client!ti", name = "d", descriptor = "I")
	private int anInt9459 = 1;

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
	private int anInt9468 = 0;

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	private int anInt9469 = 0;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Lclient!au;")
	private final Class22 aClass22_62 = new Class22();

	@OriginalMember(owner = "client!ti", name = "C", descriptor = "Z")
	private boolean aBoolean641 = true;

	@OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
	private int anInt9473 = -1;

	@OriginalMember(owner = "client!ti", name = "B", descriptor = "[Lclient!il;")
	private Class3_Sub2[] aClass3_Sub2Array2 = new Class3_Sub2[2];

	@OriginalMember(owner = "client!ti", name = "G", descriptor = "Z")
	private boolean aBoolean644 = false;

	@OriginalMember(owner = "client!ti", name = "F", descriptor = "Z")
	private boolean aBoolean643 = true;

	@OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
	private int anInt9475 = 0;

	@OriginalMember(owner = "client!ti", name = "D", descriptor = "Z")
	private boolean aBoolean642 = true;

	@OriginalMember(owner = "client!ti", name = "K", descriptor = "Z")
	private boolean aBoolean645 = true;

	@OriginalMember(owner = "client!ti", name = "u", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_39;

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "Lclient!ec;")
	private Class87 aClass87_5;

	@OriginalMember(owner = "client!ti", name = "i", descriptor = "Lclient!ec;")
	private Class87 aClass87_6;

	@OriginalMember(owner = "client!ti", name = "y", descriptor = "Lclient!ec;")
	private Class87 aClass87_7;

	@OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class315(@OriginalArg(0) Class7_Sub2 arg0) {
		this.aClass7_Sub2_39 = arg0;
		if (this.aClass7_Sub2_39.aBoolean390 && this.aClass7_Sub2_39.aBoolean381) {
			this.aClass87_6 = this.aClass87_5 = new Class87(this.aClass7_Sub2_39);
			if (this.aClass7_Sub2_39.anInt5592 > 1 && this.aClass7_Sub2_39.aBoolean398 && this.aClass7_Sub2_39.aBoolean399) {
				this.aClass87_6 = this.aClass87_7 = new Class87(this.aClass7_Sub2_39);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z")
	private boolean method7289() {
		if (this.aBoolean645) {
			if (this.aClass4_Sub6_Sub12_2 != null) {
				this.aClass4_Sub6_Sub12_2.method4192();
				this.aClass4_Sub6_Sub12_2 = null;
			}
			if (this.aClass3_Sub2_6 != null) {
				this.aClass3_Sub2_6.method2746();
				this.aClass3_Sub2_6 = null;
			}
			if (this.aClass87_7 != null) {
				this.aClass4_Sub6_Sub12_2 = new Class4_Sub6_Sub12(this.aClass7_Sub2_39, 6402, this.anInt9462, this.anInt9459, this.aClass7_Sub2_39.anInt5592);
			}
			if (this.aBoolean644) {
				this.aClass3_Sub2_6 = new Class3_Sub2(this.aClass7_Sub2_39, 34037, 6402, this.anInt9462, this.anInt9459);
			} else if (this.aClass4_Sub6_Sub12_2 == null) {
				this.aClass4_Sub6_Sub12_2 = new Class4_Sub6_Sub12(this.aClass7_Sub2_39, 6402, this.anInt9462, this.anInt9459);
			}
			this.aBoolean645 = false;
			this.aBoolean642 = true;
			this.aBoolean643 = true;
		}
		if (this.aBoolean641) {
			if (this.aClass4_Sub6_Sub12_1 != null) {
				this.aClass4_Sub6_Sub12_1.method4192();
				this.aClass4_Sub6_Sub12_1 = null;
			}
			if (this.aClass3_Sub2Array2[0] != null) {
				this.aClass3_Sub2Array2[0].method2746();
				this.aClass3_Sub2Array2[0] = null;
			}
			if (this.aClass3_Sub2Array2[1] != null) {
				this.aClass3_Sub2Array2[1].method2746();
				this.aClass3_Sub2Array2[1] = null;
			}
			if (this.aClass87_7 != null) {
				this.aClass4_Sub6_Sub12_1 = new Class4_Sub6_Sub12(this.aClass7_Sub2_39, this.anInt9473, this.anInt9462, this.anInt9459, this.aClass7_Sub2_39.anInt5592);
			}
			this.aClass3_Sub2Array2[0] = new Class3_Sub2(this.aClass7_Sub2_39, 34037, this.anInt9473, this.anInt9462, this.anInt9459);
			this.aClass3_Sub2Array2[1] = this.anInt9475 <= 1 ? null : new Class3_Sub2(this.aClass7_Sub2_39, 34037, this.anInt9473, this.anInt9462, this.anInt9459);
			this.aBoolean641 = false;
			this.aBoolean643 = true;
			this.aBoolean642 = true;
		}
		if (this.aBoolean642) {
			if (this.aClass87_7 == null) {
				this.aClass7_Sub2_39.method4281(this.aClass87_5);
				this.aClass87_5.method2070(0);
				this.aClass87_5.method2070(1);
				this.aClass87_5.method2070(8);
				this.aClass87_5.method2073(this.aClass3_Sub2Array2[0], 0);
				if (this.anInt9475 > 1) {
					this.aClass87_5.method2073(this.aClass3_Sub2Array2[1], 1);
				}
				if (this.aBoolean644) {
					this.aClass87_5.method2073(this.aClass3_Sub2_6, 8);
				} else {
					this.aClass87_5.method2063(this.aClass4_Sub6_Sub12_2, 8);
				}
				this.aClass7_Sub2_39.method4358(this.aClass87_5);
			} else {
				this.aClass7_Sub2_39.method4281(this.aClass87_5);
				this.aClass87_5.method2070(0);
				this.aClass87_5.method2070(1);
				this.aClass87_5.method2070(8);
				this.aClass87_5.method2073(this.aClass3_Sub2Array2[0], 0);
				if (this.anInt9475 > 1) {
					this.aClass87_5.method2073(this.aClass3_Sub2Array2[1], 1);
				}
				if (this.aBoolean644) {
					this.aClass87_5.method2073(this.aClass3_Sub2_6, 8);
				}
				this.aClass7_Sub2_39.method4358(this.aClass87_5);
				this.aClass7_Sub2_39.method4281(this.aClass87_7);
				this.aClass87_7.method2070(0);
				this.aClass87_7.method2070(8);
				this.aClass87_7.method2063(this.aClass4_Sub6_Sub12_1, 0);
				this.aClass87_7.method2063(this.aClass4_Sub6_Sub12_2, 8);
				this.aClass7_Sub2_39.method4358(this.aClass87_7);
			}
			this.aBoolean643 = true;
			this.aBoolean642 = false;
		}
		if (this.aBoolean643) {
			this.aClass7_Sub2_39.method4281(this.aClass87_6);
			this.aBoolean643 = !this.aClass87_6.method2072();
			this.aClass7_Sub2_39.method4358(this.aClass87_6);
		}
		return !this.aBoolean643;
	}

	@OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)V")
	private void method7290() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(27) int local27;
		for (@Pc(19) Class4_Sub31 local19 = (Class4_Sub31) this.aClass22_62.method895(); local19 != null; local19 = (Class4_Sub31) this.aClass22_62.method889()) {
			local27 = local19.method5056();
			if (local27 > local9) {
				local9 = local27;
			}
			local11 += local19.method5055();
			local7 |= local19.method5053();
		}
		if (local9 == 2) {
			local27 = 34836;
		} else if (local9 == 1) {
			local27 = 34842;
		} else {
			local27 = 6408;
		}
		if (this.anInt9473 != local27) {
			this.anInt9473 = local27;
			this.aBoolean641 = true;
		}
		@Pc(95) int local95 = this.anInt9475 > 2 ? 2 : this.anInt9475;
		@Pc(102) int local102 = local11 > 2 ? 2 : local11;
		this.anInt9475 = local11;
		if (this.aBoolean644 != local7) {
			this.aBoolean645 = true;
			this.aBoolean644 = local7;
		}
		if (local102 != local95) {
			this.aBoolean642 = this.aBoolean641 = true;
		}
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIBI)Z")
	public boolean method7291(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass87_6 == null || this.aClass22_62.method893()) {
			return false;
		}
		if (arg1 != this.anInt9462 || this.anInt9459 != arg3) {
			this.anInt9459 = arg3;
			this.anInt9462 = arg1;
			for (@Pc(46) Class4 local46 = this.aClass22_62.method895(); local46 != this.aClass22_62.aClass4_13; local46 = local46.aClass4_286) {
				((Class4_Sub31) local46).method5062(this.anInt9459, this.anInt9462);
			}
			this.aBoolean641 = true;
			this.aBoolean642 = true;
			this.aBoolean645 = true;
		}
		if (!this.method7289()) {
			return false;
		}
		this.anInt9469 = arg0;
		this.aBoolean640 = true;
		this.anInt9468 = arg2;
		this.aClass7_Sub2_39.method4281(this.aClass87_6);
		this.aClass87_6.method2071(0);
		this.aClass7_Sub2_39.method4297(this.anInt9459 + this.anInt9468 - this.aClass7_Sub2_39.anInt5447, -this.anInt9469);
		return true;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
	public void method7294() {
		this.aClass3_Sub2_6 = null;
		this.aClass87_6 = this.aClass87_7 = this.aClass87_5 = null;
		this.aClass4_Sub6_Sub12_2 = null;
		this.aClass3_Sub2Array2 = null;
		this.aClass4_Sub6_Sub12_1 = null;
		if (!this.aClass22_62.method893()) {
			for (@Pc(36) Class4 local36 = this.aClass22_62.method895(); local36 != this.aClass22_62.aClass4_13; local36 = local36.aClass4_286) {
				((Class4_Sub31) local36).method5057();
			}
		}
		this.anInt9462 = this.anInt9459 = 1;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!oba;Z)Z")
	public boolean method7295(@OriginalArg(0) Class4_Sub31 arg0) {
		if (this.aClass87_6 != null) {
			if (arg0.method5061() || arg0.method5052()) {
				this.aClass22_62.method894(arg0);
				this.method7290();
				if (this.method7289()) {
					if (this.anInt9462 != -1 && this.anInt9459 != -1) {
						arg0.method5062(this.anInt9459, this.anInt9462);
					}
					arg0.aBoolean439 = true;
					return true;
				}
			}
			this.method7299(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
	public boolean method7296() {
		return this.aClass87_6 != null;
	}

	@OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)V")
	public void method7297() {
		if (!this.aBoolean640) {
			return;
		}
		if (this.aClass87_7 != null) {
			this.aClass7_Sub2_39.method4291(this.aClass87_7);
			@Pc(20) short local20 = 16384;
			this.aClass7_Sub2_39.method4282(this.aClass87_5);
			this.aClass87_7.method2065();
			this.aClass87_5.method2071(0);
			if (this.aBoolean644) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9462, this.anInt9459, 0, 0, this.anInt9462, this.anInt9459, local20, 9728);
			this.aClass7_Sub2_39.method4289(this.aClass87_7);
			this.aClass7_Sub2_39.method4348(this.aClass87_5);
		}
		this.aClass7_Sub2_39.method4355();
		this.aClass7_Sub2_39.method4343(0);
		this.aClass7_Sub2_39.method4288(1);
		this.aClass7_Sub2_39.JA();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class4_Sub31 local105;
		for (@Pc(97) Class4_Sub31 local97 = (Class4_Sub31) this.aClass22_62.method895(); local97 != null; local97 = local105) {
			local105 = (Class4_Sub31) this.aClass22_62.method889();
			@Pc(109) int local109 = local97.method5055();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method5059(this.aClass3_Sub2Array2[local89], this.aClass3_Sub2_6, local111);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass7_Sub2_39.method4358(this.aClass87_5);
					this.aClass7_Sub2_39.method4297(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9459);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9469, this.anInt9468);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9469, this.anInt9468 + this.anInt9459);
					OpenGL.glTexCoord2f((float) this.anInt9462, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9469 + this.anInt9462, this.anInt9468 + this.anInt9459);
					OpenGL.glTexCoord2f((float) this.anInt9462, (float) this.anInt9459);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9469 + this.anInt9462, this.anInt9468);
					OpenGL.glEnd();
				} else {
					this.aClass87_5.method2071(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9459);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt9459);
					OpenGL.glTexCoord2f((float) this.anInt9462, (float) this.anInt9459);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9462, this.anInt9459);
					OpenGL.glTexCoord2f((float) this.anInt9462, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9462, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local89 = local89 + 1 & 0x1;
				local97.method5054(local111);
			}
		}
		this.aBoolean640 = false;
	}

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLclient!oba;)V")
	public void method7299(@OriginalArg(1) Class4_Sub31 arg0) {
		arg0.aBoolean439 = false;
		arg0.method5057();
		arg0.method8193();
		this.method7290();
	}
}
