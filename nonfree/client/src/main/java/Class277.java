import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pv")
public final class Class277 {

	@OriginalMember(owner = "client!pv", name = "y", descriptor = "Z")
	private boolean aBoolean557;

	@OriginalMember(owner = "client!pv", name = "M", descriptor = "Lclient!vfa;")
	private Class1_Sub8_Sub19 aClass1_Sub8_Sub19_1;

	@OriginalMember(owner = "client!pv", name = "N", descriptor = "Lclient!cw;")
	private Class46_Sub2 aClass46_Sub2_6;

	@OriginalMember(owner = "client!pv", name = "P", descriptor = "Lclient!vfa;")
	private Class1_Sub8_Sub19 aClass1_Sub8_Sub19_2;

	@OriginalMember(owner = "client!pv", name = "g", descriptor = "I")
	private int anInt7294 = 1;

	@OriginalMember(owner = "client!pv", name = "o", descriptor = "I")
	private int anInt7300 = 0;

	@OriginalMember(owner = "client!pv", name = "z", descriptor = "I")
	private int anInt7305 = 0;

	@OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
	private int anInt7308 = 1;

	@OriginalMember(owner = "client!pv", name = "s", descriptor = "Lclient!gca;")
	private final Class111 aClass111_46 = new Class111();

	@OriginalMember(owner = "client!pv", name = "L", descriptor = "Z")
	private boolean aBoolean562 = false;

	@OriginalMember(owner = "client!pv", name = "I", descriptor = "Z")
	private boolean aBoolean560 = true;

	@OriginalMember(owner = "client!pv", name = "J", descriptor = "Z")
	private boolean aBoolean561 = true;

	@OriginalMember(owner = "client!pv", name = "G", descriptor = "Z")
	private boolean aBoolean558 = true;

	@OriginalMember(owner = "client!pv", name = "F", descriptor = "[Lclient!cw;")
	private Class46_Sub2[] aClass46_Sub2Array2 = new Class46_Sub2[2];

	@OriginalMember(owner = "client!pv", name = "H", descriptor = "Z")
	private boolean aBoolean559 = true;

	@OriginalMember(owner = "client!pv", name = "K", descriptor = "I")
	private int anInt7310 = -1;

	@OriginalMember(owner = "client!pv", name = "O", descriptor = "I")
	private int anInt7311 = 0;

	@OriginalMember(owner = "client!pv", name = "q", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_34;

	@OriginalMember(owner = "client!pv", name = "k", descriptor = "Lclient!vca;")
	private Class343 aClass343_5;

	@OriginalMember(owner = "client!pv", name = "m", descriptor = "Lclient!vca;")
	private Class343 aClass343_6;

	@OriginalMember(owner = "client!pv", name = "t", descriptor = "Lclient!vca;")
	private Class343 aClass343_7;

	@OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class277(@OriginalArg(0) Class78_Sub3 arg0) {
		this.aClass78_Sub3_34 = arg0;
		if (this.aClass78_Sub3_34.aBoolean428 && this.aClass78_Sub3_34.aBoolean436) {
			this.aClass343_6 = this.aClass343_5 = new Class343(this.aClass78_Sub3_34);
			if (this.aClass78_Sub3_34.anInt5546 > 1 && this.aClass78_Sub3_34.aBoolean434 && this.aClass78_Sub3_34.aBoolean421) {
				this.aClass343_6 = this.aClass343_7 = new Class343(this.aClass78_Sub3_34);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V")
	public void method5865() {
		this.aClass46_Sub2_6 = null;
		this.aClass343_6 = this.aClass343_7 = this.aClass343_5 = null;
		this.aClass46_Sub2Array2 = null;
		this.aClass1_Sub8_Sub19_1 = null;
		this.aClass1_Sub8_Sub19_2 = null;
		if (!this.aClass111_46.method2546()) {
			for (@Pc(36) Class1 local36 = this.aClass111_46.method2547(); local36 != this.aClass111_46.aClass1_94; local36 = local36.aClass1_286) {
				((Class1_Sub15) local36).method1203();
			}
		}
		this.anInt7308 = this.anInt7294 = 1;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lclient!uca;I)V")
	public void method5866(@OriginalArg(0) Class1_Sub15 arg0) {
		arg0.aBoolean88 = false;
		arg0.method1203();
		arg0.method7908();
		this.method5869();
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(ILclient!uca;)Z")
	public boolean method5867(@OriginalArg(1) Class1_Sub15 arg0) {
		if (this.aClass343_6 != null) {
			if (arg0.method1216() || arg0.method1207()) {
				this.aClass111_46.method2552(arg0);
				this.method5869();
				if (this.method5874()) {
					if (this.anInt7308 != -1 && this.anInt7294 != -1) {
						arg0.method1215(this.anInt7294, this.anInt7308);
					}
					arg0.aBoolean88 = true;
					return true;
				}
			}
			this.method5866(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(B)Z")
	public boolean method5868() {
		return this.aClass343_6 != null;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(Z)V")
	private void method5869() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub15 local17 = (Class1_Sub15) this.aClass111_46.method2547(); local17 != null; local17 = (Class1_Sub15) this.aClass111_46.method2554()) {
			local23 = local17.method1211();
			local11 += local17.method1217();
			if (local23 > local9) {
				local9 = local23;
			}
			local7 |= local17.method1205();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt7310) {
			this.aBoolean559 = true;
			this.anInt7310 = local23;
		}
		@Pc(106) int local106 = this.anInt7311 <= 2 ? this.anInt7311 : 2;
		@Pc(115) int local115 = local11 <= 2 ? local11 : 2;
		if (local7 != this.aBoolean562) {
			this.aBoolean562 = local7;
			this.aBoolean558 = true;
		}
		this.anInt7311 = local11;
		if (local115 != local106) {
			this.aBoolean561 = this.aBoolean559 = true;
		}
	}

	@OriginalMember(owner = "client!pv", name = "c", descriptor = "(B)V")
	public void method5870() {
		if (!this.aBoolean557) {
			return;
		}
		if (this.aClass343_7 != null) {
			this.aClass78_Sub3_34.method4492(this.aClass343_7);
			@Pc(20) short local20 = 16384;
			this.aClass78_Sub3_34.method4521(this.aClass343_5);
			this.aClass343_7.method7465();
			this.aClass343_5.method7464(0);
			if (this.aBoolean562) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt7308, this.anInt7294, 0, 0, this.anInt7308, this.anInt7294, local20, 9728);
			this.aClass78_Sub3_34.method4563(this.aClass343_7);
			this.aClass78_Sub3_34.method4490(this.aClass343_5);
		}
		this.aClass78_Sub3_34.method4489();
		this.aClass78_Sub3_34.method4566(0);
		this.aClass78_Sub3_34.method4534(1);
		this.aClass78_Sub3_34.JA();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class1_Sub15 local109;
		for (@Pc(101) Class1_Sub15 local101 = (Class1_Sub15) this.aClass111_46.method2547(); local101 != null; local101 = local109) {
			local109 = (Class1_Sub15) this.aClass111_46.method2554();
			@Pc(113) int local113 = local101.method1217();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method1212(this.aClass46_Sub2_6, local115, this.aClass46_Sub2Array2[local93]);
				if (local109 == null && local115 == local113 - 1) {
					this.aClass78_Sub3_34.method4495(this.aClass343_5);
					this.aClass78_Sub3_34.method4507(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7294);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7300, this.anInt7305);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7300, this.anInt7294 + this.anInt7305);
					OpenGL.glTexCoord2f((float) this.anInt7308, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7308 + this.anInt7300, this.anInt7305 + this.anInt7294);
					OpenGL.glTexCoord2f((float) this.anInt7308, (float) this.anInt7294);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7308 + this.anInt7300, this.anInt7305);
					OpenGL.glEnd();
				} else {
					this.aClass343_5.method7464(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7294);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt7294);
					OpenGL.glTexCoord2f((float) this.anInt7308, (float) this.anInt7294);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7308, this.anInt7294);
					OpenGL.glTexCoord2f((float) this.anInt7308, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7308, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local101.method1219(local115);
				local93 = local93 + 1 & 0x1;
			}
		}
		this.aBoolean557 = false;
	}

	@OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIIB)Z")
	public boolean method5873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass343_6 == null || this.aClass111_46.method2546()) {
			return false;
		}
		if (this.anInt7308 != arg1 || arg0 != this.anInt7294) {
			this.anInt7308 = arg1;
			this.anInt7294 = arg0;
			for (@Pc(38) Class1 local38 = this.aClass111_46.method2547(); local38 != this.aClass111_46.aClass1_94; local38 = local38.aClass1_286) {
				((Class1_Sub15) local38).method1215(this.anInt7294, this.anInt7308);
			}
			this.aBoolean559 = true;
			this.aBoolean561 = true;
			this.aBoolean558 = true;
		}
		if (!this.method5874()) {
			return false;
		}
		this.aBoolean557 = true;
		this.anInt7300 = arg3;
		this.anInt7305 = arg2;
		this.aClass78_Sub3_34.method4529(this.aClass343_6);
		this.aClass343_6.method7464(0);
		this.aClass78_Sub3_34.method4507(-this.anInt7300, this.anInt7294 + this.anInt7305 - this.aClass78_Sub3_34.anInt5524);
		return true;
	}

	@OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)Z")
	private boolean method5874() {
		if (this.aBoolean558) {
			if (this.aClass1_Sub8_Sub19_1 != null) {
				this.aClass1_Sub8_Sub19_1.method7515();
				this.aClass1_Sub8_Sub19_1 = null;
			}
			if (this.aClass46_Sub2_6 != null) {
				this.aClass46_Sub2_6.method5139();
				this.aClass46_Sub2_6 = null;
			}
			if (this.aClass343_7 != null) {
				this.aClass1_Sub8_Sub19_1 = new Class1_Sub8_Sub19(this.aClass78_Sub3_34, 6402, this.anInt7308, this.anInt7294, this.aClass78_Sub3_34.anInt5546);
			}
			if (this.aBoolean562) {
				this.aClass46_Sub2_6 = new Class46_Sub2(this.aClass78_Sub3_34, 34037, 6402, this.anInt7308, this.anInt7294);
			} else if (this.aClass1_Sub8_Sub19_1 == null) {
				this.aClass1_Sub8_Sub19_1 = new Class1_Sub8_Sub19(this.aClass78_Sub3_34, 6402, this.anInt7308, this.anInt7294);
			}
			this.aBoolean560 = true;
			this.aBoolean561 = true;
			this.aBoolean558 = false;
		}
		if (this.aBoolean559) {
			if (this.aClass1_Sub8_Sub19_2 != null) {
				this.aClass1_Sub8_Sub19_2.method7515();
				this.aClass1_Sub8_Sub19_2 = null;
			}
			if (this.aClass46_Sub2Array2[0] != null) {
				this.aClass46_Sub2Array2[0].method5139();
				this.aClass46_Sub2Array2[0] = null;
			}
			if (this.aClass46_Sub2Array2[1] != null) {
				this.aClass46_Sub2Array2[1].method5139();
				this.aClass46_Sub2Array2[1] = null;
			}
			if (this.aClass343_7 != null) {
				this.aClass1_Sub8_Sub19_2 = new Class1_Sub8_Sub19(this.aClass78_Sub3_34, this.anInt7310, this.anInt7308, this.anInt7294, this.aClass78_Sub3_34.anInt5546);
			}
			this.aClass46_Sub2Array2[0] = new Class46_Sub2(this.aClass78_Sub3_34, 34037, this.anInt7310, this.anInt7308, this.anInt7294);
			this.aClass46_Sub2Array2[1] = this.anInt7311 <= 1 ? null : new Class46_Sub2(this.aClass78_Sub3_34, 34037, this.anInt7310, this.anInt7308, this.anInt7294);
			this.aBoolean560 = true;
			this.aBoolean559 = false;
			this.aBoolean561 = true;
		}
		if (this.aBoolean561) {
			if (this.aClass343_7 == null) {
				this.aClass78_Sub3_34.method4529(this.aClass343_5);
				this.aClass343_5.method7470(0);
				this.aClass343_5.method7470(1);
				this.aClass343_5.method7470(8);
				this.aClass343_5.method7472(this.aClass46_Sub2Array2[0], 0);
				if (this.anInt7311 > 1) {
					this.aClass343_5.method7472(this.aClass46_Sub2Array2[1], 1);
				}
				if (this.aBoolean562) {
					this.aClass343_5.method7472(this.aClass46_Sub2_6, 8);
				} else {
					this.aClass343_5.method7468(8, this.aClass1_Sub8_Sub19_1);
				}
				this.aClass78_Sub3_34.method4495(this.aClass343_5);
			} else {
				this.aClass78_Sub3_34.method4529(this.aClass343_5);
				this.aClass343_5.method7470(0);
				this.aClass343_5.method7470(1);
				this.aClass343_5.method7470(8);
				this.aClass343_5.method7472(this.aClass46_Sub2Array2[0], 0);
				if (this.anInt7311 > 1) {
					this.aClass343_5.method7472(this.aClass46_Sub2Array2[1], 1);
				}
				if (this.aBoolean562) {
					this.aClass343_5.method7472(this.aClass46_Sub2_6, 8);
				}
				this.aClass78_Sub3_34.method4495(this.aClass343_5);
				this.aClass78_Sub3_34.method4529(this.aClass343_7);
				this.aClass343_7.method7470(0);
				this.aClass343_7.method7470(8);
				this.aClass343_7.method7468(0, this.aClass1_Sub8_Sub19_2);
				this.aClass343_7.method7468(8, this.aClass1_Sub8_Sub19_1);
				this.aClass78_Sub3_34.method4495(this.aClass343_7);
			}
			this.aBoolean561 = false;
			this.aBoolean560 = true;
		}
		if (this.aBoolean560) {
			this.aClass78_Sub3_34.method4529(this.aClass343_6);
			this.aBoolean560 = !this.aClass343_6.method7469();
			this.aClass78_Sub3_34.method4495(this.aClass343_6);
		}
		return !this.aBoolean560;
	}
}
