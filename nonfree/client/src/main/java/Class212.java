import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class212 {

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "Z")
	private boolean aBoolean419;

	@OriginalMember(owner = "client!mw", name = "y", descriptor = "Lclient!hc;")
	private Class6_Sub2_Sub8 aClass6_Sub2_Sub8_1;

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "Lclient!hc;")
	private Class6_Sub2_Sub8 aClass6_Sub2_Sub8_2;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "Lclient!co;")
	private Class51_Sub1 aClass51_Sub1_5;

	@OriginalMember(owner = "client!mw", name = "e", descriptor = "I")
	private int anInt5952 = 0;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "I")
	private int anInt5961 = 1;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
	private int anInt5959 = 1;

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	private int anInt5964 = 0;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "Lclient!ws;")
	private final Class361 aClass361_48 = new Class361();

	@OriginalMember(owner = "client!mw", name = "w", descriptor = "Z")
	private boolean aBoolean421 = true;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "Z")
	private boolean aBoolean420 = true;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "I")
	private int anInt5965 = -1;

	@OriginalMember(owner = "client!mw", name = "E", descriptor = "Z")
	private boolean aBoolean424 = true;

	@OriginalMember(owner = "client!mw", name = "A", descriptor = "Z")
	private boolean aBoolean422 = true;

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "[Lclient!co;")
	private Class51_Sub1[] aClass51_Sub1Array4 = new Class51_Sub1[2];

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
	private int anInt5966 = 0;

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_29;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "Lclient!ds;")
	private Class74 aClass74_7;

	@OriginalMember(owner = "client!mw", name = "g", descriptor = "Lclient!ds;")
	private Class74 aClass74_6;

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "Lclient!ds;")
	private Class74 aClass74_5;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class212(@OriginalArg(0) Class14_Sub3 arg0) {
		this.aClass14_Sub3_29 = arg0;
		if (this.aClass14_Sub3_29.aBoolean302 && this.aClass14_Sub3_29.aBoolean299) {
			this.aClass74_6 = this.aClass74_7 = new Class74(this.aClass14_Sub3_29);
			if (this.aClass14_Sub3_29.anInt4535 > 1 && this.aClass14_Sub3_29.aBoolean307 && this.aClass14_Sub3_29.aBoolean317) {
				this.aClass74_6 = this.aClass74_5 = new Class74(this.aClass14_Sub3_29);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(ILclient!bg;)V")
	public void method5118(@OriginalArg(1) Class6_Sub6 arg0) {
		arg0.aBoolean207 = false;
		arg0.method2538();
		arg0.method7804();
		this.method5120();
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)Z")
	private boolean method5119() {
		if (this.aBoolean424) {
			if (this.aClass6_Sub2_Sub8_2 != null) {
				this.aClass6_Sub2_Sub8_2.method3252();
				this.aClass6_Sub2_Sub8_2 = null;
			}
			if (this.aClass51_Sub1_5 != null) {
				this.aClass51_Sub1_5.method7730();
				this.aClass51_Sub1_5 = null;
			}
			if (this.aClass74_5 != null) {
				this.aClass6_Sub2_Sub8_2 = new Class6_Sub2_Sub8(this.aClass14_Sub3_29, 6402, this.anInt5959, this.anInt5961, this.aClass14_Sub3_29.anInt4535);
			}
			if (this.aBoolean423) {
				this.aClass51_Sub1_5 = new Class51_Sub1(this.aClass14_Sub3_29, 34037, 6402, this.anInt5959, this.anInt5961);
			} else if (this.aClass6_Sub2_Sub8_2 == null) {
				this.aClass6_Sub2_Sub8_2 = new Class6_Sub2_Sub8(this.aClass14_Sub3_29, 6402, this.anInt5959, this.anInt5961);
			}
			this.aBoolean421 = true;
			this.aBoolean420 = true;
			this.aBoolean424 = false;
		}
		if (this.aBoolean422) {
			if (this.aClass6_Sub2_Sub8_1 != null) {
				this.aClass6_Sub2_Sub8_1.method3252();
				this.aClass6_Sub2_Sub8_1 = null;
			}
			if (this.aClass51_Sub1Array4[0] != null) {
				this.aClass51_Sub1Array4[0].method7730();
				this.aClass51_Sub1Array4[0] = null;
			}
			if (this.aClass51_Sub1Array4[1] != null) {
				this.aClass51_Sub1Array4[1].method7730();
				this.aClass51_Sub1Array4[1] = null;
			}
			if (this.aClass74_5 != null) {
				this.aClass6_Sub2_Sub8_1 = new Class6_Sub2_Sub8(this.aClass14_Sub3_29, this.anInt5965, this.anInt5959, this.anInt5961, this.aClass14_Sub3_29.anInt4535);
			}
			this.aClass51_Sub1Array4[0] = new Class51_Sub1(this.aClass14_Sub3_29, 34037, this.anInt5965, this.anInt5959, this.anInt5961);
			this.aClass51_Sub1Array4[1] = this.anInt5966 <= 1 ? null : new Class51_Sub1(this.aClass14_Sub3_29, 34037, this.anInt5965, this.anInt5959, this.anInt5961);
			this.aBoolean420 = true;
			this.aBoolean421 = true;
			this.aBoolean422 = false;
		}
		if (this.aBoolean420) {
			if (this.aClass74_5 == null) {
				this.aClass14_Sub3_29.method3910(this.aClass74_7);
				this.aClass74_7.method1777(0);
				this.aClass74_7.method1777(1);
				this.aClass74_7.method1777(8);
				this.aClass74_7.method1769(0, this.aClass51_Sub1Array4[0]);
				if (this.anInt5966 > 1) {
					this.aClass74_7.method1769(1, this.aClass51_Sub1Array4[1]);
				}
				if (this.aBoolean423) {
					this.aClass74_7.method1769(8, this.aClass51_Sub1_5);
				} else {
					this.aClass74_7.method1764(8, this.aClass6_Sub2_Sub8_2);
				}
				this.aClass14_Sub3_29.method3955(this.aClass74_7);
			} else {
				this.aClass14_Sub3_29.method3910(this.aClass74_7);
				this.aClass74_7.method1777(0);
				this.aClass74_7.method1777(1);
				this.aClass74_7.method1777(8);
				this.aClass74_7.method1769(0, this.aClass51_Sub1Array4[0]);
				if (this.anInt5966 > 1) {
					this.aClass74_7.method1769(1, this.aClass51_Sub1Array4[1]);
				}
				if (this.aBoolean423) {
					this.aClass74_7.method1769(8, this.aClass51_Sub1_5);
				}
				this.aClass14_Sub3_29.method3955(this.aClass74_7);
				this.aClass14_Sub3_29.method3910(this.aClass74_5);
				this.aClass74_5.method1777(0);
				this.aClass74_5.method1777(8);
				this.aClass74_5.method1764(0, this.aClass6_Sub2_Sub8_1);
				this.aClass74_5.method1764(8, this.aClass6_Sub2_Sub8_2);
				this.aClass14_Sub3_29.method3955(this.aClass74_5);
			}
			this.aBoolean420 = false;
			this.aBoolean421 = true;
		}
		if (this.aBoolean421) {
			this.aClass14_Sub3_29.method3910(this.aClass74_6);
			this.aBoolean421 = !this.aClass74_6.method1766();
			this.aClass14_Sub3_29.method3955(this.aClass74_6);
		}
		return !this.aBoolean421;
	}

	@OriginalMember(owner = "client!mw", name = "b", descriptor = "(I)V")
	private void method5120() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class6_Sub6 local17 = (Class6_Sub6) this.aClass361_48.method7838(); local17 != null; local17 = (Class6_Sub6) this.aClass361_48.method7845()) {
			local23 = local17.method2529();
			local11 += local17.method2530();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method2527();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt5965) {
			this.anInt5965 = local23;
			this.aBoolean422 = true;
		}
		@Pc(97) int local97 = this.anInt5966 > 2 ? 2 : this.anInt5966;
		@Pc(104) int local104 = local11 > 2 ? 2 : local11;
		if (local97 != local104) {
			this.aBoolean420 = this.aBoolean422 = true;
		}
		this.anInt5966 = local11;
		if (this.aBoolean423 != local7) {
			this.aBoolean424 = true;
			this.aBoolean423 = local7;
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(B)V")
	public void method5121() {
		if (!this.aBoolean419) {
			return;
		}
		if (this.aClass74_5 != null) {
			this.aClass14_Sub3_29.method3923(this.aClass74_5);
			@Pc(20) short local20 = 16384;
			this.aClass14_Sub3_29.method3948(this.aClass74_7);
			this.aClass74_5.method1771();
			this.aClass74_7.method1767(0);
			if (this.aBoolean423) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5959, this.anInt5961, 0, 0, this.anInt5959, this.anInt5961, local20, 9728);
			this.aClass14_Sub3_29.method3934(this.aClass74_5);
			this.aClass14_Sub3_29.method3967(this.aClass74_7);
		}
		this.aClass14_Sub3_29.method3906();
		this.aClass14_Sub3_29.method3937(0);
		this.aClass14_Sub3_29.method3925(1);
		this.aClass14_Sub3_29.F();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class6_Sub6 local105;
		for (@Pc(97) Class6_Sub6 local97 = (Class6_Sub6) this.aClass361_48.method7838(); local97 != null; local97 = local105) {
			local105 = (Class6_Sub6) this.aClass361_48.method7845();
			@Pc(109) int local109 = local97.method2530();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method2533(this.aClass51_Sub1_5, local111, this.aClass51_Sub1Array4[local89]);
				if (local105 == null && local109 - 1 == local111) {
					this.aClass14_Sub3_29.method3955(this.aClass74_7);
					this.aClass14_Sub3_29.method3979(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5961);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5952, this.anInt5964);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5952, this.anInt5961 + this.anInt5964);
					OpenGL.glTexCoord2f((float) this.anInt5959, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5952 + this.anInt5959, this.anInt5961 + this.anInt5964);
					OpenGL.glTexCoord2f((float) this.anInt5959, (float) this.anInt5961);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5952 + this.anInt5959, this.anInt5964);
					OpenGL.glEnd();
				} else {
					this.aClass74_7.method1767(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5961);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt5961);
					OpenGL.glTexCoord2f((float) this.anInt5959, (float) this.anInt5961);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5959, this.anInt5961);
					OpenGL.glTexCoord2f((float) this.anInt5959, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5959, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local97.method2535(local111);
				local89 = local89 + 1 & 0x1;
			}
		}
		this.aBoolean419 = false;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lclient!bg;B)Z")
	public boolean method5122(@OriginalArg(0) Class6_Sub6 arg0) {
		if (this.aClass74_6 != null) {
			if (arg0.method2536() || arg0.method2531()) {
				this.aClass361_48.method7833(arg0);
				this.method5120();
				if (this.method5119()) {
					if (this.anInt5959 != -1 && this.anInt5961 != -1) {
						arg0.method2537(this.anInt5959, this.anInt5961);
					}
					arg0.aBoolean207 = true;
					return true;
				}
			}
			this.method5118(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!mw", name = "c", descriptor = "(I)V")
	public void method5123() {
		this.aClass74_6 = this.aClass74_5 = this.aClass74_7 = null;
		this.aClass6_Sub2_Sub8_1 = null;
		this.aClass6_Sub2_Sub8_2 = null;
		this.aClass51_Sub1_5 = null;
		this.aClass51_Sub1Array4 = null;
		if (!this.aClass361_48.method7837()) {
			for (@Pc(44) Class6 local44 = this.aClass361_48.method7838(); local44 != this.aClass361_48.aClass6_287; local44 = local44.aClass6_286) {
				((Class6_Sub6) local44).method2538();
			}
		}
		this.anInt5959 = this.anInt5961 = 1;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIII)Z")
	public boolean method5124(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass74_6 == null || this.aClass361_48.method7837()) {
			return false;
		}
		if (this.anInt5959 != arg0 || arg2 != this.anInt5961) {
			this.anInt5961 = arg2;
			this.anInt5959 = arg0;
			for (@Pc(47) Class6 local47 = this.aClass361_48.method7838(); local47 != this.aClass361_48.aClass6_287; local47 = local47.aClass6_286) {
				((Class6_Sub6) local47).method2537(this.anInt5959, this.anInt5961);
			}
			this.aBoolean422 = true;
			this.aBoolean420 = true;
			this.aBoolean424 = true;
		}
		if (!this.method5119()) {
			return false;
		}
		this.aBoolean419 = true;
		this.anInt5964 = arg3;
		this.anInt5952 = arg1;
		this.aClass14_Sub3_29.method3910(this.aClass74_6);
		this.aClass74_6.method1767(0);
		this.aClass14_Sub3_29.method3979(-this.anInt5952, this.anInt5964 + this.anInt5961 - this.aClass14_Sub3_29.anInt4385);
		return true;
	}

	@OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)Z")
	public boolean method5125() {
		return this.aClass74_6 != null;
	}
}
