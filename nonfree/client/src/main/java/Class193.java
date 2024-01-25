import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kea")
public final class Class193 {

	@OriginalMember(owner = "client!kea", name = "j", descriptor = "Z")
	private boolean aBoolean516;

	@OriginalMember(owner = "client!kea", name = "y", descriptor = "Lclient!ru;")
	private Class5_Sub3_Sub18 aClass5_Sub3_Sub18_1;

	@OriginalMember(owner = "client!kea", name = "E", descriptor = "Lclient!gha;")
	private Class80_Sub2 aClass80_Sub2_5;

	@OriginalMember(owner = "client!kea", name = "F", descriptor = "Lclient!ru;")
	private Class5_Sub3_Sub18 aClass5_Sub3_Sub18_2;

	@OriginalMember(owner = "client!kea", name = "i", descriptor = "I")
	private int anInt5874 = 1;

	@OriginalMember(owner = "client!kea", name = "q", descriptor = "I")
	private int anInt5878 = 0;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "I")
	private int anInt5871 = 1;

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "I")
	private int anInt5882 = 0;

	@OriginalMember(owner = "client!kea", name = "p", descriptor = "Lclient!fca;")
	private final Class114 aClass114_41 = new Class114();

	@OriginalMember(owner = "client!kea", name = "C", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "client!kea", name = "D", descriptor = "Z")
	private boolean aBoolean520 = true;

	@OriginalMember(owner = "client!kea", name = "z", descriptor = "Z")
	private boolean aBoolean517 = true;

	@OriginalMember(owner = "client!kea", name = "G", descriptor = "I")
	private int anInt5885 = -1;

	@OriginalMember(owner = "client!kea", name = "H", descriptor = "Z")
	private boolean aBoolean521 = true;

	@OriginalMember(owner = "client!kea", name = "A", descriptor = "I")
	private int anInt5884 = 0;

	@OriginalMember(owner = "client!kea", name = "B", descriptor = "Z")
	private boolean aBoolean518 = true;

	@OriginalMember(owner = "client!kea", name = "I", descriptor = "[Lclient!gha;")
	private Class80_Sub2[] aClass80_Sub2Array2 = new Class80_Sub2[2];

	@OriginalMember(owner = "client!kea", name = "n", descriptor = "Lclient!ck;")
	private final Class65_Sub1 aClass65_Sub1_15;

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "Lclient!vd;")
	private Class363 aClass363_5;

	@OriginalMember(owner = "client!kea", name = "x", descriptor = "Lclient!vd;")
	private Class363 aClass363_7;

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "Lclient!vd;")
	private Class363 aClass363_6;

	@OriginalMember(owner = "client!kea", name = "<init>", descriptor = "(Lclient!ck;)V")
	public Class193(@OriginalArg(0) Class65_Sub1 arg0) {
		this.aClass65_Sub1_15 = arg0;
		if (this.aClass65_Sub1_15.aBoolean100 && this.aClass65_Sub1_15.aBoolean99) {
			this.aClass363_7 = this.aClass363_5 = new Class363(this.aClass65_Sub1_15);
			if (this.aClass65_Sub1_15.anInt1377 > 1 && this.aClass65_Sub1_15.aBoolean95 && this.aClass65_Sub1_15.aBoolean116) {
				this.aClass363_7 = this.aClass363_6 = new Class363(this.aClass65_Sub1_15);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)Z")
	private boolean method4869() {
		if (this.aBoolean521) {
			if (this.aClass5_Sub3_Sub18_1 != null) {
				this.aClass5_Sub3_Sub18_1.method7434();
				this.aClass5_Sub3_Sub18_1 = null;
			}
			if (this.aClass80_Sub2_5 != null) {
				this.aClass80_Sub2_5.method7136();
				this.aClass80_Sub2_5 = null;
			}
			if (this.aClass363_6 != null) {
				this.aClass5_Sub3_Sub18_1 = new Class5_Sub3_Sub18(this.aClass65_Sub1_15, 6402, this.anInt5871, this.anInt5874, this.aClass65_Sub1_15.anInt1377);
			}
			if (this.aBoolean519) {
				this.aClass80_Sub2_5 = new Class80_Sub2(this.aClass65_Sub1_15, 34037, 6402, this.anInt5871, this.anInt5874);
			} else if (this.aClass5_Sub3_Sub18_1 == null) {
				this.aClass5_Sub3_Sub18_1 = new Class5_Sub3_Sub18(this.aClass65_Sub1_15, 6402, this.anInt5871, this.anInt5874);
			}
			this.aBoolean520 = true;
			this.aBoolean517 = true;
			this.aBoolean521 = false;
		}
		if (this.aBoolean518) {
			if (this.aClass5_Sub3_Sub18_2 != null) {
				this.aClass5_Sub3_Sub18_2.method7434();
				this.aClass5_Sub3_Sub18_2 = null;
			}
			if (this.aClass80_Sub2Array2[0] != null) {
				this.aClass80_Sub2Array2[0].method7136();
				this.aClass80_Sub2Array2[0] = null;
			}
			if (this.aClass80_Sub2Array2[1] != null) {
				this.aClass80_Sub2Array2[1].method7136();
				this.aClass80_Sub2Array2[1] = null;
			}
			if (this.aClass363_6 != null) {
				this.aClass5_Sub3_Sub18_2 = new Class5_Sub3_Sub18(this.aClass65_Sub1_15, this.anInt5885, this.anInt5871, this.anInt5874, this.aClass65_Sub1_15.anInt1377);
			}
			this.aClass80_Sub2Array2[0] = new Class80_Sub2(this.aClass65_Sub1_15, 34037, this.anInt5885, this.anInt5871, this.anInt5874);
			this.aClass80_Sub2Array2[1] = this.anInt5884 <= 1 ? null : new Class80_Sub2(this.aClass65_Sub1_15, 34037, this.anInt5885, this.anInt5871, this.anInt5874);
			this.aBoolean517 = true;
			this.aBoolean518 = false;
			this.aBoolean520 = true;
		}
		if (this.aBoolean520) {
			if (this.aClass363_6 == null) {
				this.aClass65_Sub1_15.method1299(this.aClass363_5);
				this.aClass363_5.method8446(0);
				this.aClass363_5.method8446(1);
				this.aClass363_5.method8446(8);
				this.aClass363_5.method8449(this.aClass80_Sub2Array2[0], 0);
				if (this.anInt5884 > 1) {
					this.aClass363_5.method8449(this.aClass80_Sub2Array2[1], 1);
				}
				if (this.aBoolean519) {
					this.aClass363_5.method8449(this.aClass80_Sub2_5, 8);
				} else {
					this.aClass363_5.method8451(8, this.aClass5_Sub3_Sub18_1);
				}
				this.aClass65_Sub1_15.method1229(this.aClass363_5);
			} else {
				this.aClass65_Sub1_15.method1299(this.aClass363_5);
				this.aClass363_5.method8446(0);
				this.aClass363_5.method8446(1);
				this.aClass363_5.method8446(8);
				this.aClass363_5.method8449(this.aClass80_Sub2Array2[0], 0);
				if (this.anInt5884 > 1) {
					this.aClass363_5.method8449(this.aClass80_Sub2Array2[1], 1);
				}
				if (this.aBoolean519) {
					this.aClass363_5.method8449(this.aClass80_Sub2_5, 8);
				}
				this.aClass65_Sub1_15.method1229(this.aClass363_5);
				this.aClass65_Sub1_15.method1299(this.aClass363_6);
				this.aClass363_6.method8446(0);
				this.aClass363_6.method8446(8);
				this.aClass363_6.method8451(0, this.aClass5_Sub3_Sub18_2);
				this.aClass363_6.method8451(8, this.aClass5_Sub3_Sub18_1);
				this.aClass65_Sub1_15.method1229(this.aClass363_6);
			}
			this.aBoolean517 = true;
			this.aBoolean520 = false;
		}
		if (this.aBoolean517) {
			this.aClass65_Sub1_15.method1299(this.aClass363_7);
			this.aBoolean517 = !this.aClass363_7.method8445();
			this.aClass65_Sub1_15.method1229(this.aClass363_7);
		}
		return !this.aBoolean517;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(BIIII)Z")
	public boolean method4870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass363_7 == null || this.aClass114_41.method2810()) {
			return false;
		}
		if (this.anInt5871 != arg0 || this.anInt5874 != arg3) {
			this.anInt5871 = arg0;
			this.anInt5874 = arg3;
			for (@Pc(47) Class5 local47 = this.aClass114_41.method2805(); local47 != this.aClass114_41.aClass5_84; local47 = local47.aClass5_338) {
				((Class5_Sub34) local47).method4738(this.anInt5871, this.anInt5874);
			}
			this.aBoolean520 = true;
			this.aBoolean518 = true;
			this.aBoolean521 = true;
		}
		if (!this.method4869()) {
			return false;
		}
		this.anInt5878 = arg2;
		this.anInt5882 = arg1;
		this.aBoolean516 = true;
		this.aClass65_Sub1_15.method1299(this.aClass363_7);
		this.aClass363_7.method8447(0);
		this.aClass65_Sub1_15.method1262(-this.anInt5878, this.anInt5882 + this.anInt5874 - this.aClass65_Sub1_15.anInt1374);
		return true;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)Z")
	public boolean method4871() {
		return this.aClass363_7 != null;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!lp;I)Z")
	public boolean method4873(@OriginalArg(0) Class5_Sub34 arg0) {
		if (this.aClass363_7 != null) {
			if (arg0.method4737() || arg0.method4743()) {
				this.aClass114_41.method2807(arg0);
				this.method4878();
				if (this.method4869()) {
					if (this.anInt5871 != -1 && this.anInt5874 != -1) {
						arg0.method4738(this.anInt5871, this.anInt5874);
					}
					arg0.aBoolean499 = true;
					return true;
				}
			}
			this.method4876(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(I)V")
	public void method4875() {
		if (!this.aBoolean516) {
			return;
		}
		if (this.aClass363_6 != null) {
			this.aClass65_Sub1_15.method1275(this.aClass363_6);
			@Pc(20) short local20 = 16384;
			this.aClass65_Sub1_15.method1295(this.aClass363_5);
			this.aClass363_6.method8454();
			this.aClass363_5.method8447(0);
			if (this.aBoolean519) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5871, this.anInt5874, 0, 0, this.anInt5871, this.anInt5874, local20, 9728);
			this.aClass65_Sub1_15.method1273(this.aClass363_6);
			this.aClass65_Sub1_15.method1251(this.aClass363_5);
		}
		this.aClass65_Sub1_15.method1225();
		this.aClass65_Sub1_15.method1231(0);
		this.aClass65_Sub1_15.method1290(1);
		this.aClass65_Sub1_15.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(112) Class5_Sub34 local112;
		for (@Pc(104) Class5_Sub34 local104 = (Class5_Sub34) this.aClass114_41.method2805(); local104 != null; local104 = local112) {
			local112 = (Class5_Sub34) this.aClass114_41.method2814();
			@Pc(116) int local116 = local104.method4747();
			for (@Pc(118) int local118 = 0; local118 < local116; local118++) {
				local104.method4735(local118, this.aClass80_Sub2_5, this.aClass80_Sub2Array2[local89]);
				if (local112 == null && local116 - 1 == local118) {
					this.aClass65_Sub1_15.method1229(this.aClass363_5);
					this.aClass65_Sub1_15.method1262(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5874);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5878, this.anInt5882);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5878, this.anInt5882 + this.anInt5874);
					OpenGL.glTexCoord2f((float) this.anInt5871, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5871 + this.anInt5878, this.anInt5874 + this.anInt5882);
					OpenGL.glTexCoord2f((float) this.anInt5871, (float) this.anInt5874);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5871 + this.anInt5878, this.anInt5882);
					OpenGL.glEnd();
				} else {
					this.aClass363_5.method8447(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5874);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt5874);
					OpenGL.glTexCoord2f((float) this.anInt5871, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5871, this.anInt5874);
					OpenGL.glTexCoord2f((float) this.anInt5871, (float) this.anInt5874);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5871, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local104.method4739(local118);
				local89 = local89 + 1 & 0x1;
			}
		}
		this.aBoolean516 = false;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(Lclient!lp;B)V")
	public void method4876(@OriginalArg(0) Class5_Sub34 arg0) {
		arg0.aBoolean499 = false;
		arg0.method4740();
		arg0.method9052();
		this.method4878();
	}

	@OriginalMember(owner = "client!kea", name = "d", descriptor = "(I)V")
	public void method4877() {
		this.aClass80_Sub2_5 = null;
		this.aClass80_Sub2Array2 = null;
		this.aClass5_Sub3_Sub18_1 = null;
		this.aClass363_7 = this.aClass363_6 = this.aClass363_5 = null;
		this.aClass5_Sub3_Sub18_2 = null;
		if (!this.aClass114_41.method2810()) {
			for (@Pc(42) Class5 local42 = this.aClass114_41.method2805(); local42 != this.aClass114_41.aClass5_84; local42 = local42.aClass5_338) {
				((Class5_Sub34) local42).method4740();
			}
		}
		this.anInt5871 = this.anInt5874 = 1;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)V")
	private void method4878() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class5_Sub34 local17 = (Class5_Sub34) this.aClass114_41.method2805(); local17 != null; local17 = (Class5_Sub34) this.aClass114_41.method2814()) {
			local23 = local17.method4741();
			local11 += local17.method4747();
			if (local23 > local9) {
				local9 = local23;
			}
			local7 |= local17.method4742();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt5885) {
			this.aBoolean518 = true;
			this.anInt5885 = local23;
		}
		@Pc(101) int local101 = this.anInt5884 <= 2 ? this.anInt5884 : 2;
		@Pc(108) int local108 = local11 > 2 ? 2 : local11;
		if (local7 != this.aBoolean519) {
			this.aBoolean521 = true;
			this.aBoolean519 = local7;
		}
		if (local108 != local101) {
			this.aBoolean520 = this.aBoolean518 = true;
		}
		this.anInt5884 = local11;
	}
}
