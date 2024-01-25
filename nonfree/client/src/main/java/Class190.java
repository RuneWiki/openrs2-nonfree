import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kg")
public final class Class190 {

	@OriginalMember(owner = "client!kg", name = "j", descriptor = "Z")
	private boolean aBoolean328;

	@OriginalMember(owner = "client!kg", name = "w", descriptor = "Lclient!lf;")
	private Class2_Sub2_Sub13 aClass2_Sub2_Sub13_1;

	@OriginalMember(owner = "client!kg", name = "A", descriptor = "Lclient!lf;")
	private Class2_Sub2_Sub13 aClass2_Sub2_Sub13_2;

	@OriginalMember(owner = "client!kg", name = "B", descriptor = "Lclient!fq;")
	private Class65_Sub1 aClass65_Sub1_3;

	@OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
	private int anInt4735 = 1;

	@OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
	private int anInt4739 = 1;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "I")
	private int anInt4742 = 0;

	@OriginalMember(owner = "client!kg", name = "t", descriptor = "I")
	private int anInt4745 = 0;

	@OriginalMember(owner = "client!kg", name = "l", descriptor = "Lclient!fha;")
	private final Class109 aClass109_33 = new Class109();

	@OriginalMember(owner = "client!kg", name = "v", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!kg", name = "y", descriptor = "I")
	private int anInt4746 = 0;

	@OriginalMember(owner = "client!kg", name = "z", descriptor = "Z")
	private boolean aBoolean331 = true;

	@OriginalMember(owner = "client!kg", name = "D", descriptor = "Z")
	private boolean aBoolean332 = true;

	@OriginalMember(owner = "client!kg", name = "C", descriptor = "I")
	private int anInt4747 = -1;

	@OriginalMember(owner = "client!kg", name = "G", descriptor = "[Lclient!fq;")
	private Class65_Sub1[] aClass65_Sub1Array3 = new Class65_Sub1[2];

	@OriginalMember(owner = "client!kg", name = "F", descriptor = "Z")
	private boolean aBoolean333 = true;

	@OriginalMember(owner = "client!kg", name = "x", descriptor = "Z")
	private boolean aBoolean330 = true;

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_22;

	@OriginalMember(owner = "client!kg", name = "n", descriptor = "Lclient!tea;")
	private Class333 aClass333_4;

	@OriginalMember(owner = "client!kg", name = "h", descriptor = "Lclient!tea;")
	private Class333 aClass333_3;

	@OriginalMember(owner = "client!kg", name = "r", descriptor = "Lclient!tea;")
	private Class333 aClass333_5;

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class190(@OriginalArg(0) Class95_Sub1 arg0) {
		this.aClass95_Sub1_22 = arg0;
		if (this.aClass95_Sub1_22.aBoolean184 && this.aClass95_Sub1_22.aBoolean176) {
			this.aClass333_3 = this.aClass333_4 = new Class333(this.aClass95_Sub1_22);
			if (this.aClass95_Sub1_22.anInt2512 > 1 && this.aClass95_Sub1_22.aBoolean181 && this.aClass95_Sub1_22.aBoolean194) {
				this.aClass333_3 = this.aClass333_5 = new Class333(this.aClass95_Sub1_22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V")
	private void method4018() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub15 local17 = (Class2_Sub15) this.aClass109_33.method2325(); local17 != null; local17 = (Class2_Sub15) this.aClass109_33.method2318()) {
			local23 = local17.method7778();
			local11 += local17.method7783();
			if (local23 > local9) {
				local9 = local23;
			}
			local7 |= local17.method7784();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt4747) {
			this.aBoolean333 = true;
			this.anInt4747 = local23;
		}
		@Pc(93) int local93 = this.anInt4746 > 2 ? 2 : this.anInt4746;
		@Pc(106) int local106 = local11 <= 2 ? local11 : 2;
		this.anInt4746 = local11;
		if (local106 != local93) {
			this.aBoolean330 = this.aBoolean333 = true;
		}
		if (local7 != this.aBoolean329) {
			this.aBoolean332 = true;
			this.aBoolean329 = local7;
		}
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!gga;Z)V")
	public void method4019(@OriginalArg(0) Class2_Sub15 arg0) {
		arg0.aBoolean689 = false;
		arg0.method7788();
		arg0.method8653();
		this.method4018();
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIZ)Z")
	public boolean method4020(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass333_3 == null || this.aClass109_33.method2328()) {
			return false;
		}
		if (this.anInt4739 != arg1 || this.anInt4735 != arg2) {
			this.anInt4739 = arg1;
			this.anInt4735 = arg2;
			for (@Pc(40) Class2 local40 = this.aClass109_33.method2325(); local40 != this.aClass109_33.aClass2_78; local40 = local40.aClass2_300) {
				((Class2_Sub15) local40).method7785(this.anInt4735, this.anInt4739);
			}
			this.aBoolean330 = true;
			this.aBoolean333 = true;
			this.aBoolean332 = true;
		}
		if (!this.method4026()) {
			return false;
		}
		this.anInt4745 = arg3;
		this.anInt4742 = arg0;
		this.aBoolean328 = true;
		this.aClass95_Sub1_22.method2090(this.aClass333_3);
		this.aClass333_3.method7488(0);
		this.aClass95_Sub1_22.method2116(this.anInt4745 + this.anInt4735 - this.aClass95_Sub1_22.anInt2469, -this.anInt4742);
		return true;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!gga;I)Z")
	public boolean method4021(@OriginalArg(0) Class2_Sub15 arg0) {
		if (this.aClass333_3 != null) {
			if (arg0.method7786() || arg0.method7789()) {
				this.aClass109_33.method2323(arg0);
				this.method4018();
				if (this.method4026()) {
					if (this.anInt4739 != -1 && this.anInt4735 != -1) {
						arg0.method7785(this.anInt4735, this.anInt4739);
					}
					arg0.aBoolean689 = true;
					return true;
				}
			}
			this.method4019(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)V")
	public void method4022() {
		if (!this.aBoolean328) {
			return;
		}
		if (this.aClass333_5 != null) {
			this.aClass95_Sub1_22.method2075(this.aClass333_5);
			@Pc(28) short local28 = 16384;
			this.aClass95_Sub1_22.method2091(this.aClass333_4);
			this.aClass333_5.method7486();
			this.aClass333_4.method7488(0);
			if (this.aBoolean329) {
				local28 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4739, this.anInt4735, 0, 0, this.anInt4739, this.anInt4735, local28, 9728);
			this.aClass95_Sub1_22.method2080(this.aClass333_5);
			this.aClass95_Sub1_22.method2067(this.aClass333_4);
		}
		this.aClass95_Sub1_22.method2093();
		this.aClass95_Sub1_22.method2062(0);
		this.aClass95_Sub1_22.method2106(1);
		this.aClass95_Sub1_22.la();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class2_Sub15 local113;
		for (@Pc(105) Class2_Sub15 local105 = (Class2_Sub15) this.aClass109_33.method2325(); local105 != null; local105 = local113) {
			local113 = (Class2_Sub15) this.aClass109_33.method2318();
			@Pc(117) int local117 = local105.method7783();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method7790(this.aClass65_Sub1_3, local119, this.aClass65_Sub1Array3[local97]);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass95_Sub1_22.method2070(this.aClass333_4);
					this.aClass95_Sub1_22.method2116(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4742, this.anInt4745);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4742, this.anInt4745 + this.anInt4735);
					OpenGL.glTexCoord2f((float) this.anInt4739, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4742 + this.anInt4739, this.anInt4745 - -this.anInt4735);
					OpenGL.glTexCoord2f((float) this.anInt4739, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4742 + this.anInt4739, this.anInt4745);
					OpenGL.glEnd();
				} else {
					this.aClass333_4.method7488(--local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4735);
					OpenGL.glTexCoord2f((float) this.anInt4739, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4739, this.anInt4735);
					OpenGL.glTexCoord2f((float) this.anInt4739, (float) this.anInt4735);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4739, 0);
					OpenGL.glEnd();
				}
				local99 = local99 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
				local105.method7779(local119);
			}
		}
		this.aBoolean328 = false;
	}

	@OriginalMember(owner = "client!kg", name = "d", descriptor = "(I)V")
	public void method4024() {
		this.aClass333_3 = this.aClass333_5 = this.aClass333_4 = null;
		this.aClass65_Sub1Array3 = null;
		this.aClass2_Sub2_Sub13_2 = null;
		this.aClass2_Sub2_Sub13_1 = null;
		this.aClass65_Sub1_3 = null;
		if (!this.aClass109_33.method2328()) {
			for (@Pc(36) Class2 local36 = this.aClass109_33.method2325(); local36 != this.aClass109_33.aClass2_78; local36 = local36.aClass2_300) {
				((Class2_Sub15) local36).method7788();
			}
		}
		this.anInt4739 = this.anInt4735 = 1;
	}

	@OriginalMember(owner = "client!kg", name = "e", descriptor = "(I)Z")
	public boolean method4025() {
		return this.aClass333_3 != null;
	}

	@OriginalMember(owner = "client!kg", name = "f", descriptor = "(I)Z")
	private boolean method4026() {
		if (this.aBoolean332) {
			if (this.aClass2_Sub2_Sub13_1 != null) {
				this.aClass2_Sub2_Sub13_1.method4275();
				this.aClass2_Sub2_Sub13_1 = null;
			}
			if (this.aClass65_Sub1_3 != null) {
				this.aClass65_Sub1_3.method6828();
				this.aClass65_Sub1_3 = null;
			}
			if (this.aClass333_5 != null) {
				this.aClass2_Sub2_Sub13_1 = new Class2_Sub2_Sub13(this.aClass95_Sub1_22, 6402, this.anInt4739, this.anInt4735, this.aClass95_Sub1_22.anInt2512);
			}
			if (this.aBoolean329) {
				this.aClass65_Sub1_3 = new Class65_Sub1(this.aClass95_Sub1_22, 34037, 6402, this.anInt4739, this.anInt4735);
			} else if (this.aClass2_Sub2_Sub13_1 == null) {
				this.aClass2_Sub2_Sub13_1 = new Class2_Sub2_Sub13(this.aClass95_Sub1_22, 6402, this.anInt4739, this.anInt4735);
			}
			this.aBoolean332 = false;
			this.aBoolean330 = true;
			this.aBoolean331 = true;
		}
		if (this.aBoolean333) {
			if (this.aClass2_Sub2_Sub13_2 != null) {
				this.aClass2_Sub2_Sub13_2.method4275();
				this.aClass2_Sub2_Sub13_2 = null;
			}
			if (this.aClass65_Sub1Array3[0] != null) {
				this.aClass65_Sub1Array3[0].method6828();
				this.aClass65_Sub1Array3[0] = null;
			}
			if (this.aClass65_Sub1Array3[1] != null) {
				this.aClass65_Sub1Array3[1].method6828();
				this.aClass65_Sub1Array3[1] = null;
			}
			if (this.aClass333_5 != null) {
				this.aClass2_Sub2_Sub13_2 = new Class2_Sub2_Sub13(this.aClass95_Sub1_22, this.anInt4747, this.anInt4739, this.anInt4735, this.aClass95_Sub1_22.anInt2512);
			}
			this.aClass65_Sub1Array3[0] = new Class65_Sub1(this.aClass95_Sub1_22, 34037, this.anInt4747, this.anInt4739, this.anInt4735);
			this.aClass65_Sub1Array3[1] = this.anInt4746 > 1 ? new Class65_Sub1(this.aClass95_Sub1_22, 34037, this.anInt4747, this.anInt4739, this.anInt4735) : null;
			this.aBoolean330 = true;
			this.aBoolean331 = true;
			this.aBoolean333 = false;
		}
		if (this.aBoolean330) {
			if (this.aClass333_5 == null) {
				this.aClass95_Sub1_22.method2090(this.aClass333_4);
				this.aClass333_4.method7485(0);
				this.aClass333_4.method7485(1);
				this.aClass333_4.method7485(8);
				this.aClass333_4.method7483(this.aClass65_Sub1Array3[0], 0);
				if (this.anInt4746 > 1) {
					this.aClass333_4.method7483(this.aClass65_Sub1Array3[1], 1);
				}
				if (this.aBoolean329) {
					this.aClass333_4.method7483(this.aClass65_Sub1_3, 8);
				} else {
					this.aClass333_4.method7491(this.aClass2_Sub2_Sub13_1, 8);
				}
				this.aClass95_Sub1_22.method2070(this.aClass333_4);
			} else {
				this.aClass95_Sub1_22.method2090(this.aClass333_4);
				this.aClass333_4.method7485(0);
				this.aClass333_4.method7485(1);
				this.aClass333_4.method7485(8);
				this.aClass333_4.method7483(this.aClass65_Sub1Array3[0], 0);
				if (this.anInt4746 > 1) {
					this.aClass333_4.method7483(this.aClass65_Sub1Array3[1], 1);
				}
				if (this.aBoolean329) {
					this.aClass333_4.method7483(this.aClass65_Sub1_3, 8);
				}
				this.aClass95_Sub1_22.method2070(this.aClass333_4);
				this.aClass95_Sub1_22.method2090(this.aClass333_5);
				this.aClass333_5.method7485(0);
				this.aClass333_5.method7485(8);
				this.aClass333_5.method7491(this.aClass2_Sub2_Sub13_2, 0);
				this.aClass333_5.method7491(this.aClass2_Sub2_Sub13_1, 8);
				this.aClass95_Sub1_22.method2070(this.aClass333_5);
			}
			this.aBoolean330 = false;
			this.aBoolean331 = true;
		}
		if (this.aBoolean331) {
			this.aClass95_Sub1_22.method2090(this.aClass333_3);
			this.aBoolean331 = !this.aClass333_3.method7490();
			this.aClass95_Sub1_22.method2070(this.aClass333_3);
		}
		return !this.aBoolean331;
	}
}
