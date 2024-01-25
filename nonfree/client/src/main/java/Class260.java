import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class260 {

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "Z")
	private boolean aBoolean669;

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "Lclient!io;")
	private Class4_Sub1_Sub13 aClass4_Sub1_Sub13_1;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "Lclient!af;")
	private Class6_Sub1 aClass6_Sub1_7;

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "Lclient!io;")
	private Class4_Sub1_Sub13 aClass4_Sub1_Sub13_2;

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
	private int anInt7127 = 1;

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
	private int anInt7132 = 0;

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
	private int anInt7130 = 0;

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
	private int anInt7128 = 1;

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "Lclient!pk;")
	private final Class183 aClass183_50 = new Class183();

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "I")
	private int anInt7138 = -1;

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "Z")
	private boolean aBoolean670 = true;

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "Z")
	private boolean aBoolean672 = true;

	@OriginalMember(owner = "client!wb", name = "v", descriptor = "I")
	private int anInt7137 = 0;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Z")
	private boolean aBoolean674 = true;

	@OriginalMember(owner = "client!wb", name = "C", descriptor = "[Lclient!af;")
	private Class6_Sub1[] aClass6_Sub1Array4 = new Class6_Sub1[2];

	@OriginalMember(owner = "client!wb", name = "t", descriptor = "Z")
	private boolean aBoolean671 = true;

	@OriginalMember(owner = "client!wb", name = "B", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_42;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "Lclient!ml;")
	private Class150 aClass150_7;

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "Lclient!ml;")
	private Class150 aClass150_5;

	@OriginalMember(owner = "client!wb", name = "m", descriptor = "Lclient!ml;")
	private Class150 aClass150_6;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class260(@OriginalArg(0) Class19_Sub2 arg0) {
		this.aClass19_Sub2_42 = arg0;
		if (this.aClass19_Sub2_42.aBoolean191 && this.aClass19_Sub2_42.aBoolean207) {
			this.aClass150_5 = this.aClass150_7 = new Class150(this.aClass19_Sub2_42);
			if (this.aClass19_Sub2_42.anInt2272 > 1 && this.aClass19_Sub2_42.aBoolean204 && this.aClass19_Sub2_42.aBoolean209) {
				this.aClass150_5 = this.aClass150_6 = new Class150(this.aClass19_Sub2_42);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	public void method5524() {
		this.aClass6_Sub1_7 = null;
		this.aClass4_Sub1_Sub13_2 = null;
		this.aClass150_5 = this.aClass150_6 = this.aClass150_7 = null;
		this.aClass6_Sub1Array4 = null;
		this.aClass4_Sub1_Sub13_1 = null;
		if (!this.aClass183_50.method4147()) {
			for (@Pc(42) Class4 local42 = this.aClass183_50.method4140(); local42 != this.aClass183_50.aClass4_207; local42 = local42.aClass4_262) {
				((Class4_Sub10) local42).method2006();
			}
		}
		this.anInt7128 = this.anInt7127 = 1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!cg;)Z")
	public boolean method5525(@OriginalArg(1) Class4_Sub10 arg0) {
		if (this.aClass150_5 != null) {
			if (arg0.method2004() || arg0.method2005()) {
				this.aClass183_50.method4137(arg0);
				this.method5526();
				if (this.method5528()) {
					if (this.anInt7128 != -1 && this.anInt7127 != -1) {
						arg0.method2007(this.anInt7127, this.anInt7128);
					}
					arg0.aBoolean220 = true;
					return true;
				}
			}
			this.method5529(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	private void method5526() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(19) Class4_Sub10 local19 = (Class4_Sub10) this.aClass183_50.method4140(); local19 != null; local19 = (Class4_Sub10) this.aClass183_50.method4144()) {
			local25 = local19.method1999();
			local11 += local19.method2001();
			if (local25 > local9) {
				local9 = local25;
			}
			local7 |= local19.method1998();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (local25 != this.anInt7138) {
			this.aBoolean674 = true;
			this.anInt7138 = local25;
		}
		@Pc(91) int local91 = this.anInt7137 > 2 ? 2 : this.anInt7137;
		@Pc(100) int local100 = local11 > 2 ? 2 : local11;
		if (local7 != this.aBoolean673) {
			this.aBoolean673 = local7;
			this.aBoolean670 = true;
		}
		if (local91 != local100) {
			this.aBoolean671 = this.aBoolean674 = true;
		}
		this.anInt7137 = local11;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)Z")
	private boolean method5528() {
		if (this.aBoolean670) {
			if (this.aClass4_Sub1_Sub13_2 != null) {
				this.aClass4_Sub1_Sub13_2.method2772();
				this.aClass4_Sub1_Sub13_2 = null;
			}
			if (this.aClass6_Sub1_7 != null) {
				this.aClass6_Sub1_7.method4183();
				this.aClass6_Sub1_7 = null;
			}
			if (this.aClass150_6 != null) {
				this.aClass4_Sub1_Sub13_2 = new Class4_Sub1_Sub13(this.aClass19_Sub2_42, 6402, this.anInt7128, this.anInt7127, this.aClass19_Sub2_42.anInt2272);
			}
			if (this.aBoolean673) {
				this.aClass6_Sub1_7 = new Class6_Sub1(this.aClass19_Sub2_42, 34037, 6402, this.anInt7128, this.anInt7127);
			} else if (this.aClass4_Sub1_Sub13_2 == null) {
				this.aClass4_Sub1_Sub13_2 = new Class4_Sub1_Sub13(this.aClass19_Sub2_42, 6402, this.anInt7128, this.anInt7127);
			}
			this.aBoolean671 = true;
			this.aBoolean670 = false;
			this.aBoolean672 = true;
		}
		if (this.aBoolean674) {
			if (this.aClass4_Sub1_Sub13_1 != null) {
				this.aClass4_Sub1_Sub13_1.method2772();
				this.aClass4_Sub1_Sub13_1 = null;
			}
			if (this.aClass6_Sub1Array4[0] != null) {
				this.aClass6_Sub1Array4[0].method4183();
				this.aClass6_Sub1Array4[0] = null;
			}
			if (this.aClass6_Sub1Array4[1] != null) {
				this.aClass6_Sub1Array4[1].method4183();
				this.aClass6_Sub1Array4[1] = null;
			}
			if (this.aClass150_6 != null) {
				this.aClass4_Sub1_Sub13_1 = new Class4_Sub1_Sub13(this.aClass19_Sub2_42, this.anInt7138, this.anInt7128, this.anInt7127, this.aClass19_Sub2_42.anInt2272);
			}
			this.aClass6_Sub1Array4[0] = new Class6_Sub1(this.aClass19_Sub2_42, 34037, this.anInt7138, this.anInt7128, this.anInt7127);
			this.aClass6_Sub1Array4[1] = this.anInt7137 <= 1 ? null : new Class6_Sub1(this.aClass19_Sub2_42, 34037, this.anInt7138, this.anInt7128, this.anInt7127);
			this.aBoolean674 = false;
			this.aBoolean672 = true;
			this.aBoolean671 = true;
		}
		if (this.aBoolean671) {
			if (this.aClass150_6 == null) {
				this.aClass19_Sub2_42.method1922(this.aClass150_7);
				this.aClass150_7.method3611(0);
				this.aClass150_7.method3611(1);
				this.aClass150_7.method3611(8);
				this.aClass150_7.method3621(this.aClass6_Sub1Array4[0], 0);
				if (this.anInt7137 > 1) {
					this.aClass150_7.method3621(this.aClass6_Sub1Array4[1], 1);
				}
				if (this.aBoolean673) {
					this.aClass150_7.method3621(this.aClass6_Sub1_7, 8);
				} else {
					this.aClass150_7.method3614(this.aClass4_Sub1_Sub13_2, 8);
				}
				this.aClass19_Sub2_42.method1971(this.aClass150_7);
			} else {
				this.aClass19_Sub2_42.method1922(this.aClass150_7);
				this.aClass150_7.method3611(0);
				this.aClass150_7.method3611(1);
				this.aClass150_7.method3611(8);
				this.aClass150_7.method3621(this.aClass6_Sub1Array4[0], 0);
				if (this.anInt7137 > 1) {
					this.aClass150_7.method3621(this.aClass6_Sub1Array4[1], 1);
				}
				if (this.aBoolean673) {
					this.aClass150_7.method3621(this.aClass6_Sub1_7, 8);
				}
				this.aClass19_Sub2_42.method1971(this.aClass150_7);
				this.aClass19_Sub2_42.method1922(this.aClass150_6);
				this.aClass150_6.method3611(0);
				this.aClass150_6.method3611(8);
				this.aClass150_6.method3614(this.aClass4_Sub1_Sub13_1, 0);
				this.aClass150_6.method3614(this.aClass4_Sub1_Sub13_2, 8);
				this.aClass19_Sub2_42.method1971(this.aClass150_6);
			}
			this.aBoolean672 = true;
			this.aBoolean671 = false;
		}
		if (this.aBoolean672) {
			this.aClass19_Sub2_42.method1922(this.aClass150_5);
			this.aBoolean672 = !this.aClass150_5.method3616();
			this.aClass19_Sub2_42.method1971(this.aClass150_5);
		}
		return !this.aBoolean672;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ILclient!cg;)V")
	public void method5529(@OriginalArg(1) Class4_Sub10 arg0) {
		arg0.aBoolean220 = false;
		arg0.method2006();
		arg0.method5684();
		this.method5526();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIII)Z")
	public boolean method5530(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass150_5 == null || this.aClass183_50.method4147()) {
			return false;
		}
		if (this.anInt7128 != arg1 || arg3 != this.anInt7127) {
			this.anInt7127 = arg3;
			this.anInt7128 = arg1;
			for (@Pc(49) Class4 local49 = this.aClass183_50.method4140(); local49 != this.aClass183_50.aClass4_207; local49 = local49.aClass4_262) {
				((Class4_Sub10) local49).method2007(this.anInt7127, this.anInt7128);
			}
			this.aBoolean674 = true;
			this.aBoolean671 = true;
			this.aBoolean670 = true;
		}
		if (!this.method5528()) {
			return false;
		}
		this.anInt7132 = arg0;
		this.anInt7130 = arg2;
		this.aBoolean669 = true;
		this.aClass19_Sub2_42.method1922(this.aClass150_5);
		this.aClass150_5.method3610(0);
		this.aClass19_Sub2_42.method1931(this.anInt7127 - this.aClass150_5.method3615() - this.anInt7130, -this.anInt7132);
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(I)Z")
	public boolean method5531() {
		return this.aClass150_5 != null;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(B)V")
	public void method5532() {
		if (!this.aBoolean669) {
			return;
		}
		if (this.aClass150_6 != null) {
			this.aClass19_Sub2_42.method1949(this.aClass150_6);
			@Pc(20) short local20 = 16384;
			this.aClass19_Sub2_42.method1956(this.aClass150_7);
			this.aClass150_6.method3618();
			this.aClass150_7.method3610(0);
			if (this.aBoolean673) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt7128, this.anInt7127, 0, 0, this.anInt7128, this.anInt7127, local20, 9728);
			this.aClass19_Sub2_42.method1935(this.aClass150_6);
			this.aClass19_Sub2_42.method1940(this.aClass150_7);
		}
		this.aClass19_Sub2_42.method1930();
		this.aClass19_Sub2_42.method1958(0);
		this.aClass19_Sub2_42.method1900(1);
		this.aClass19_Sub2_42.e();
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 1;
		@Pc(117) Class4_Sub10 local117;
		for (@Pc(109) Class4_Sub10 local109 = (Class4_Sub10) this.aClass183_50.method4140(); local109 != null; local109 = local117) {
			local117 = (Class4_Sub10) this.aClass183_50.method4144();
			@Pc(121) int local121 = local109.method2001();
			for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
				local109.method2000(local123, this.aClass6_Sub1Array4[local101], this.aClass6_Sub1_7);
				if (local117 == null && local123 == local121 - 1) {
					this.aClass19_Sub2_42.method1971(this.aClass150_7);
					this.aClass19_Sub2_42.method1931(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7127);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7132, this.anInt7130);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7132, this.anInt7127 + this.anInt7130);
					OpenGL.glTexCoord2f((float) this.anInt7128, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7132 + this.anInt7128, this.anInt7127 + this.anInt7130);
					OpenGL.glTexCoord2f((float) this.anInt7128, (float) this.anInt7127);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7128 + this.anInt7132, this.anInt7130);
					OpenGL.glEnd();
				} else {
					this.aClass150_7.method3610(local103);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt7127);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt7127);
					OpenGL.glTexCoord2f((float) this.anInt7128, (float) this.anInt7127);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt7128, this.anInt7127);
					OpenGL.glTexCoord2f((float) this.anInt7128, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt7128, 0);
					OpenGL.glEnd();
				}
				local101 = local101 + 1 & 0x1;
				local103 = local103 + 1 & 0x1;
				local109.method1996(local123);
			}
		}
		this.aBoolean669 = false;
	}
}
