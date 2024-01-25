import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ul")
public final class Class322 {

	@OriginalMember(owner = "client!ul", name = "u", descriptor = "Z")
	private boolean aBoolean588;

	@OriginalMember(owner = "client!ul", name = "z", descriptor = "Lclient!fj;")
	private Class6_Sub5_Sub4 aClass6_Sub5_Sub4_1;

	@OriginalMember(owner = "client!ul", name = "H", descriptor = "Lclient!waa;")
	private Class16_Sub1 aClass16_Sub1_5;

	@OriginalMember(owner = "client!ul", name = "S", descriptor = "Lclient!fj;")
	private Class6_Sub5_Sub4 aClass6_Sub5_Sub4_2;

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	private int anInt9117 = 1;

	@OriginalMember(owner = "client!ul", name = "r", descriptor = "I")
	private int anInt9128 = 1;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	private int anInt9125 = 0;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "I")
	private int anInt9126 = 0;

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!su;")
	private final Class298 aClass298_191 = new Class298();

	@OriginalMember(owner = "client!ul", name = "B", descriptor = "I")
	private int anInt9130 = -1;

	@OriginalMember(owner = "client!ul", name = "N", descriptor = "Z")
	private boolean aBoolean592 = true;

	@OriginalMember(owner = "client!ul", name = "Q", descriptor = "I")
	private int anInt9132 = 0;

	@OriginalMember(owner = "client!ul", name = "y", descriptor = "Z")
	private boolean aBoolean589 = false;

	@OriginalMember(owner = "client!ul", name = "A", descriptor = "Z")
	private boolean aBoolean590 = true;

	@OriginalMember(owner = "client!ul", name = "G", descriptor = "Z")
	private boolean aBoolean591 = true;

	@OriginalMember(owner = "client!ul", name = "O", descriptor = "Z")
	private boolean aBoolean593 = true;

	@OriginalMember(owner = "client!ul", name = "K", descriptor = "[Lclient!waa;")
	private Class16_Sub1[] aClass16_Sub1Array4 = new Class16_Sub1[2];

	@OriginalMember(owner = "client!ul", name = "w", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_40;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "Lclient!ufa;")
	private Class319 aClass319_4;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "Lclient!ufa;")
	private Class319 aClass319_5;

	@OriginalMember(owner = "client!ul", name = "k", descriptor = "Lclient!ufa;")
	private Class319 aClass319_6;

	@OriginalMember(owner = "client!ul", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class322(@OriginalArg(0) Class90_Sub1 arg0) {
		this.aClass90_Sub1_40 = arg0;
		if (this.aClass90_Sub1_40.aBoolean153 && this.aClass90_Sub1_40.aBoolean167) {
			this.aClass319_5 = this.aClass319_4 = new Class319(this.aClass90_Sub1_40);
			if (this.aClass90_Sub1_40.anInt2432 > 1 && this.aClass90_Sub1_40.aBoolean157 && this.aClass90_Sub1_40.aBoolean170) {
				this.aClass319_5 = this.aClass319_6 = new Class319(this.aClass90_Sub1_40);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)V")
	public void method7228() {
		if (!this.aBoolean588) {
			return;
		}
		if (this.aClass319_6 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass90_Sub1_40.method2121(this.aClass319_6);
			this.aClass90_Sub1_40.method2102(this.aClass319_4);
			this.aClass319_6.method7194();
			this.aClass319_4.method7201(0);
			if (this.aBoolean589) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt9128, this.anInt9117, 0, 0, this.anInt9128, this.anInt9117, local14, 9728);
			this.aClass90_Sub1_40.method2142(this.aClass319_6);
			this.aClass90_Sub1_40.method2078(this.aClass319_4);
		}
		this.aClass90_Sub1_40.method2130();
		this.aClass90_Sub1_40.method2090(0);
		this.aClass90_Sub1_40.method2123(1);
		this.aClass90_Sub1_40.F();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class6_Sub33 local109;
		for (@Pc(101) Class6_Sub33 local101 = (Class6_Sub33) this.aClass298_191.method6809(); local101 != null; local101 = local109) {
			local109 = (Class6_Sub33) this.aClass298_191.method6821();
			@Pc(113) int local113 = local101.method6429();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method6435(this.aClass16_Sub1_5, this.aClass16_Sub1Array4[local93], local115);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass90_Sub1_40.method2107(this.aClass319_4);
					this.aClass90_Sub1_40.method2135(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9117);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9125, this.anInt9126);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9125, this.anInt9117 + this.anInt9126);
					OpenGL.glTexCoord2f((float) this.anInt9128, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9125 + this.anInt9128, this.anInt9126 - -this.anInt9117);
					OpenGL.glTexCoord2f((float) this.anInt9128, (float) this.anInt9117);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9125 + this.anInt9128, this.anInt9126);
					OpenGL.glEnd();
				} else {
					this.aClass319_4.method7201(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt9117);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt9117);
					OpenGL.glTexCoord2f((float) this.anInt9128, (float) this.anInt9117);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt9128, this.anInt9117);
					OpenGL.glTexCoord2f((float) this.anInt9128, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt9128, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local101.method6431(local115);
				local93 = local93 + 1 & 0x1;
			}
		}
		this.aBoolean588 = false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(ILclient!oi;)Z")
	public boolean method7229(@OriginalArg(1) Class6_Sub33 arg0) {
		if (this.aClass319_5 != null) {
			if (arg0.method6426() || arg0.method6433()) {
				this.aClass298_191.method6812(arg0);
				this.method7232();
				if (this.method7238()) {
					if (this.anInt9128 != -1 && this.anInt9117 != -1) {
						arg0.method6430(this.anInt9117, this.anInt9128);
					}
					arg0.aBoolean522 = true;
					return true;
				}
			}
			this.method7236(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIBI)Z")
	public boolean method7230(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass319_5 == null || this.aClass298_191.method6813()) {
			return false;
		}
		if (this.anInt9128 != arg0 || this.anInt9117 != arg2) {
			this.anInt9117 = arg2;
			this.anInt9128 = arg0;
			for (@Pc(38) Class6 local38 = this.aClass298_191.method6809(); local38 != this.aClass298_191.aClass6_246; local38 = local38.aClass6_284) {
				((Class6_Sub33) local38).method6430(this.anInt9117, this.anInt9128);
			}
			this.aBoolean591 = true;
			this.aBoolean592 = true;
			this.aBoolean593 = true;
		}
		if (!this.method7238()) {
			return false;
		}
		this.anInt9125 = arg1;
		this.aBoolean588 = true;
		this.anInt9126 = arg3;
		this.aClass90_Sub1_40.method2139(this.aClass319_5);
		this.aClass319_5.method7201(0);
		this.aClass90_Sub1_40.method2135(this.anInt9126 + this.anInt9117 - this.aClass90_Sub1_40.anInt2266, -this.anInt9125);
		return true;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)Z")
	public boolean method7231() {
		return this.aClass319_5 != null;
	}

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	private void method7232() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class6_Sub33 local23 = (Class6_Sub33) this.aClass298_191.method6809(); local23 != null; local23 = (Class6_Sub33) this.aClass298_191.method6821()) {
			local29 = local23.method6434();
			local11 += local23.method6429();
			if (local29 > local9) {
				local9 = local29;
			}
			local7 |= local23.method6438();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (this.anInt9130 != local29) {
			this.anInt9130 = local29;
			this.aBoolean593 = true;
		}
		@Pc(99) int local99 = this.anInt9132 > 2 ? 2 : this.anInt9132;
		@Pc(106) int local106 = local11 > 2 ? 2 : local11;
		this.anInt9132 = local11;
		if (local106 != local99) {
			this.aBoolean591 = this.aBoolean593 = true;
		}
		if (local7 != this.aBoolean589) {
			this.aBoolean589 = local7;
			this.aBoolean592 = true;
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	public void method7234() {
		this.aClass16_Sub1Array4 = null;
		this.aClass6_Sub5_Sub4_2 = null;
		this.aClass16_Sub1_5 = null;
		this.aClass319_5 = this.aClass319_6 = this.aClass319_4 = null;
		this.aClass6_Sub5_Sub4_1 = null;
		if (!this.aClass298_191.method6813()) {
			for (@Pc(42) Class6 local42 = this.aClass298_191.method6809(); local42 != this.aClass298_191.aClass6_246; local42 = local42.aClass6_284) {
				((Class6_Sub33) local42).method6432();
			}
		}
		this.anInt9128 = this.anInt9117 = 1;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lclient!oi;I)V")
	public void method7236(@OriginalArg(0) Class6_Sub33 arg0) {
		arg0.aBoolean522 = false;
		arg0.method6432();
		arg0.method7948();
		this.method7232();
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(I)Z")
	private boolean method7238() {
		if (this.aBoolean592) {
			if (this.aClass6_Sub5_Sub4_1 != null) {
				this.aClass6_Sub5_Sub4_1.method2392();
				this.aClass6_Sub5_Sub4_1 = null;
			}
			if (this.aClass16_Sub1_5 != null) {
				this.aClass16_Sub1_5.method7847();
				this.aClass16_Sub1_5 = null;
			}
			if (this.aClass319_6 != null) {
				this.aClass6_Sub5_Sub4_1 = new Class6_Sub5_Sub4(this.aClass90_Sub1_40, 6402, this.anInt9128, this.anInt9117, this.aClass90_Sub1_40.anInt2432);
			}
			if (this.aBoolean589) {
				this.aClass16_Sub1_5 = new Class16_Sub1(this.aClass90_Sub1_40, 34037, 6402, this.anInt9128, this.anInt9117);
			} else if (this.aClass6_Sub5_Sub4_1 == null) {
				this.aClass6_Sub5_Sub4_1 = new Class6_Sub5_Sub4(this.aClass90_Sub1_40, 6402, this.anInt9128, this.anInt9117);
			}
			this.aBoolean591 = true;
			this.aBoolean590 = true;
			this.aBoolean592 = false;
		}
		if (this.aBoolean593) {
			if (this.aClass6_Sub5_Sub4_2 != null) {
				this.aClass6_Sub5_Sub4_2.method2392();
				this.aClass6_Sub5_Sub4_2 = null;
			}
			if (this.aClass16_Sub1Array4[0] != null) {
				this.aClass16_Sub1Array4[0].method7847();
				this.aClass16_Sub1Array4[0] = null;
			}
			if (this.aClass16_Sub1Array4[1] != null) {
				this.aClass16_Sub1Array4[1].method7847();
				this.aClass16_Sub1Array4[1] = null;
			}
			if (this.aClass319_6 != null) {
				this.aClass6_Sub5_Sub4_2 = new Class6_Sub5_Sub4(this.aClass90_Sub1_40, this.anInt9130, this.anInt9128, this.anInt9117, this.aClass90_Sub1_40.anInt2432);
			}
			this.aClass16_Sub1Array4[0] = new Class16_Sub1(this.aClass90_Sub1_40, 34037, this.anInt9130, this.anInt9128, this.anInt9117);
			this.aClass16_Sub1Array4[1] = this.anInt9132 <= 1 ? null : new Class16_Sub1(this.aClass90_Sub1_40, 34037, this.anInt9130, this.anInt9128, this.anInt9117);
			this.aBoolean591 = true;
			this.aBoolean593 = false;
			this.aBoolean590 = true;
		}
		if (this.aBoolean591) {
			if (this.aClass319_6 == null) {
				this.aClass90_Sub1_40.method2139(this.aClass319_4);
				this.aClass319_4.method7190(0);
				this.aClass319_4.method7190(1);
				this.aClass319_4.method7190(8);
				this.aClass319_4.method7198(this.aClass16_Sub1Array4[0], 0);
				if (this.anInt9132 > 1) {
					this.aClass319_4.method7198(this.aClass16_Sub1Array4[1], 1);
				}
				if (this.aBoolean589) {
					this.aClass319_4.method7198(this.aClass16_Sub1_5, 8);
				} else {
					this.aClass319_4.method7197(8, this.aClass6_Sub5_Sub4_1);
				}
				this.aClass90_Sub1_40.method2107(this.aClass319_4);
			} else {
				this.aClass90_Sub1_40.method2139(this.aClass319_4);
				this.aClass319_4.method7190(0);
				this.aClass319_4.method7190(1);
				this.aClass319_4.method7190(8);
				this.aClass319_4.method7198(this.aClass16_Sub1Array4[0], 0);
				if (this.anInt9132 > 1) {
					this.aClass319_4.method7198(this.aClass16_Sub1Array4[1], 1);
				}
				if (this.aBoolean589) {
					this.aClass319_4.method7198(this.aClass16_Sub1_5, 8);
				}
				this.aClass90_Sub1_40.method2107(this.aClass319_4);
				this.aClass90_Sub1_40.method2139(this.aClass319_6);
				this.aClass319_6.method7190(0);
				this.aClass319_6.method7190(8);
				this.aClass319_6.method7197(0, this.aClass6_Sub5_Sub4_2);
				this.aClass319_6.method7197(8, this.aClass6_Sub5_Sub4_1);
				this.aClass90_Sub1_40.method2107(this.aClass319_6);
			}
			this.aBoolean591 = false;
			this.aBoolean590 = true;
		}
		if (this.aBoolean590) {
			this.aClass90_Sub1_40.method2139(this.aClass319_5);
			this.aBoolean590 = !this.aClass319_5.method7196();
			this.aClass90_Sub1_40.method2107(this.aClass319_5);
		}
		return !this.aBoolean590;
	}
}
