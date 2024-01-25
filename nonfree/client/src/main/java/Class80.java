import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fk")
public final class Class80 {

	@OriginalMember(owner = "client!fk", name = "n", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!fk", name = "y", descriptor = "Lclient!nt;")
	private Class7_Sub4_Sub11 aClass7_Sub4_Sub11_1;

	@OriginalMember(owner = "client!fk", name = "z", descriptor = "Lclient!nt;")
	private Class7_Sub4_Sub11 aClass7_Sub4_Sub11_2;

	@OriginalMember(owner = "client!fk", name = "A", descriptor = "Lclient!ud;")
	private Class59_Sub3 aClass59_Sub3_2;

	@OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
	private int anInt2327 = 0;

	@OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
	private int anInt2334 = 1;

	@OriginalMember(owner = "client!fk", name = "l", descriptor = "I")
	private int anInt2330 = 0;

	@OriginalMember(owner = "client!fk", name = "t", descriptor = "I")
	private int anInt2336 = 1;

	@OriginalMember(owner = "client!fk", name = "k", descriptor = "Lclient!fr;")
	private final Class85 aClass85_12 = new Class85();

	@OriginalMember(owner = "client!fk", name = "u", descriptor = "Z")
	private boolean aBoolean125 = false;

	@OriginalMember(owner = "client!fk", name = "v", descriptor = "Z")
	private boolean aBoolean126 = true;

	@OriginalMember(owner = "client!fk", name = "w", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!fk", name = "x", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!fk", name = "C", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!fk", name = "B", descriptor = "[Lclient!ud;")
	private Class59_Sub3[] aClass59_Sub3Array3 = new Class59_Sub3[2];

	@OriginalMember(owner = "client!fk", name = "D", descriptor = "I")
	private int anInt2337 = 0;

	@OriginalMember(owner = "client!fk", name = "E", descriptor = "I")
	private int anInt2338 = -1;

	@OriginalMember(owner = "client!fk", name = "m", descriptor = "Lclient!vd;")
	private final Class51_Sub2 aClass51_Sub2_18;

	@OriginalMember(owner = "client!fk", name = "h", descriptor = "Lclient!es;")
	private Class73 aClass73_2;

	@OriginalMember(owner = "client!fk", name = "i", descriptor = "Lclient!es;")
	private Class73 aClass73_3;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "Lclient!es;")
	private Class73 aClass73_1;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!vd;)V")
	public Class80(@OriginalArg(0) Class51_Sub2 arg0) {
		this.aClass51_Sub2_18 = arg0;
		if (this.aClass51_Sub2_18.aBoolean458 && this.aClass51_Sub2_18.aBoolean442) {
			this.aClass73_3 = this.aClass73_2 = new Class73(this.aClass51_Sub2_18);
			if (this.aClass51_Sub2_18.anInt6908 > 1 && this.aClass51_Sub2_18.aBoolean453 && this.aClass51_Sub2_18.aBoolean444) {
				this.aClass73_3 = this.aClass73_1 = new Class73(this.aClass51_Sub2_18);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIII)Z")
	public boolean method1946(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass73_3 == null || this.aClass85_12.method2007()) {
			return false;
		}
		if (this.anInt2334 != arg0 || this.anInt2336 != arg1) {
			this.anInt2336 = arg1;
			this.anInt2334 = arg0;
			for (@Pc(40) Class7 local40 = this.aClass85_12.method2010(); local40 != this.aClass85_12.aClass7_81; local40 = local40.aClass7_262) {
				((Class7_Sub23) local40).method3681(this.anInt2336, this.anInt2334);
			}
			this.aBoolean128 = true;
			this.aBoolean127 = true;
			this.aBoolean126 = true;
		}
		if (!this.method1952()) {
			return false;
		}
		this.anInt2327 = arg2;
		this.aBoolean124 = true;
		this.anInt2330 = arg3;
		this.aClass51_Sub2_18.method5386(this.aClass73_3);
		this.aClass73_3.method1741(0);
		this.aClass51_Sub2_18.method5429(this.anInt2336 - this.aClass73_3.method1735() - this.anInt2330, -this.anInt2327);
		return true;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
	public void method1947() {
		if (!this.aBoolean124) {
			return;
		}
		if (this.aClass73_1 != null) {
			this.aClass51_Sub2_18.method5369(this.aClass73_1);
			@Pc(20) short local20 = 16384;
			this.aClass51_Sub2_18.method5405(this.aClass73_2);
			this.aClass73_1.method1744();
			this.aClass73_2.method1741(0);
			if (this.aBoolean125) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt2334, this.anInt2336, 0, 0, this.anInt2334, this.anInt2336, local20, 9728);
			this.aClass51_Sub2_18.method5439(this.aClass73_1);
			this.aClass51_Sub2_18.method5385(this.aClass73_2);
		}
		this.aClass51_Sub2_18.method5379();
		this.aClass51_Sub2_18.method5412(0);
		this.aClass51_Sub2_18.method5400(1);
		this.aClass51_Sub2_18.e();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(116) Class7_Sub23 local116;
		for (@Pc(108) Class7_Sub23 local108 = (Class7_Sub23) this.aClass85_12.method2010(); local108 != null; local108 = local116) {
			local116 = (Class7_Sub23) this.aClass85_12.method2000();
			@Pc(120) int local120 = local108.method3685();
			for (@Pc(122) int local122 = 0; local122 < local120; local122++) {
				local108.method3680(this.aClass59_Sub3_2, local122, this.aClass59_Sub3Array3[local89]);
				if (local116 == null && local120 - 1 == local122) {
					this.aClass51_Sub2_18.method5372(this.aClass73_2);
					this.aClass51_Sub2_18.method5429(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2336);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2327, this.anInt2330);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2327, this.anInt2336 + this.anInt2330);
					OpenGL.glTexCoord2f((float) this.anInt2334, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2327 + this.anInt2334, this.anInt2330 - -this.anInt2336);
					OpenGL.glTexCoord2f((float) this.anInt2334, (float) this.anInt2336);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2327 + this.anInt2334, this.anInt2330);
					OpenGL.glEnd();
				} else {
					this.aClass73_2.method1741(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2336);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt2336);
					OpenGL.glTexCoord2f((float) this.anInt2334, (float) this.anInt2336);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2334, this.anInt2336);
					OpenGL.glTexCoord2f((float) this.anInt2334, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2334, 0);
					OpenGL.glEnd();
				}
				local89 = local89 + 1 & 0x1;
				local108.method3683(local122);
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean124 = false;
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(Lclient!id;B)V")
	public void method1949(@OriginalArg(0) Class7_Sub23 arg0) {
		arg0.aBoolean292 = false;
		arg0.method3687();
		arg0.method5802();
		this.method1953();
	}

	@OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)Z")
	private boolean method1952() {
		if (this.aBoolean127) {
			if (this.aClass7_Sub4_Sub11_2 != null) {
				this.aClass7_Sub4_Sub11_2.method3712();
				this.aClass7_Sub4_Sub11_2 = null;
			}
			if (this.aClass59_Sub3_2 != null) {
				this.aClass59_Sub3_2.method5763();
				this.aClass59_Sub3_2 = null;
			}
			if (this.aClass73_1 != null) {
				this.aClass7_Sub4_Sub11_2 = new Class7_Sub4_Sub11(this.aClass51_Sub2_18, 6402, this.anInt2334, this.anInt2336, this.aClass51_Sub2_18.anInt6908);
			}
			if (this.aBoolean125) {
				this.aClass59_Sub3_2 = new Class59_Sub3(this.aClass51_Sub2_18, 34037, 6402, this.anInt2334, this.anInt2336);
			} else if (this.aClass7_Sub4_Sub11_2 == null) {
				this.aClass7_Sub4_Sub11_2 = new Class7_Sub4_Sub11(this.aClass51_Sub2_18, 6402, this.anInt2334, this.anInt2336);
			}
			this.aBoolean129 = true;
			this.aBoolean126 = true;
			this.aBoolean127 = false;
		}
		if (this.aBoolean128) {
			if (this.aClass7_Sub4_Sub11_1 != null) {
				this.aClass7_Sub4_Sub11_1.method3712();
				this.aClass7_Sub4_Sub11_1 = null;
			}
			if (this.aClass59_Sub3Array3[0] != null) {
				this.aClass59_Sub3Array3[0].method5763();
				this.aClass59_Sub3Array3[0] = null;
			}
			if (this.aClass59_Sub3Array3[1] != null) {
				this.aClass59_Sub3Array3[1].method5763();
				this.aClass59_Sub3Array3[1] = null;
			}
			if (this.aClass73_1 != null) {
				this.aClass7_Sub4_Sub11_1 = new Class7_Sub4_Sub11(this.aClass51_Sub2_18, this.anInt2338, this.anInt2334, this.anInt2336, this.aClass51_Sub2_18.anInt6908);
			}
			this.aClass59_Sub3Array3[0] = new Class59_Sub3(this.aClass51_Sub2_18, 34037, this.anInt2338, this.anInt2334, this.anInt2336);
			this.aClass59_Sub3Array3[1] = this.anInt2337 <= 1 ? null : new Class59_Sub3(this.aClass51_Sub2_18, 34037, this.anInt2338, this.anInt2334, this.anInt2336);
			this.aBoolean129 = true;
			this.aBoolean126 = true;
			this.aBoolean128 = false;
		}
		if (this.aBoolean126) {
			if (this.aClass73_1 == null) {
				this.aClass51_Sub2_18.method5386(this.aClass73_2);
				this.aClass73_2.method1740(0);
				this.aClass73_2.method1740(1);
				this.aClass73_2.method1740(8);
				this.aClass73_2.method1737(0, this.aClass59_Sub3Array3[0]);
				if (this.anInt2337 > 1) {
					this.aClass73_2.method1737(1, this.aClass59_Sub3Array3[1]);
				}
				if (this.aBoolean125) {
					this.aClass73_2.method1737(8, this.aClass59_Sub3_2);
				} else {
					this.aClass73_2.method1738(8, this.aClass7_Sub4_Sub11_2);
				}
				this.aClass51_Sub2_18.method5372(this.aClass73_2);
			} else {
				this.aClass51_Sub2_18.method5386(this.aClass73_2);
				this.aClass73_2.method1740(0);
				this.aClass73_2.method1740(1);
				this.aClass73_2.method1740(8);
				this.aClass73_2.method1737(0, this.aClass59_Sub3Array3[0]);
				if (this.anInt2337 > 1) {
					this.aClass73_2.method1737(1, this.aClass59_Sub3Array3[1]);
				}
				if (this.aBoolean125) {
					this.aClass73_2.method1737(8, this.aClass59_Sub3_2);
				}
				this.aClass51_Sub2_18.method5372(this.aClass73_2);
				this.aClass51_Sub2_18.method5386(this.aClass73_1);
				this.aClass73_1.method1740(0);
				this.aClass73_1.method1740(8);
				this.aClass73_1.method1738(0, this.aClass7_Sub4_Sub11_1);
				this.aClass73_1.method1738(8, this.aClass7_Sub4_Sub11_2);
				this.aClass51_Sub2_18.method5372(this.aClass73_1);
			}
			this.aBoolean129 = true;
			this.aBoolean126 = false;
		}
		if (this.aBoolean129) {
			this.aClass51_Sub2_18.method5386(this.aClass73_3);
			this.aBoolean129 = !this.aClass73_3.method1739();
			this.aClass51_Sub2_18.method5372(this.aClass73_3);
		}
		return !this.aBoolean129;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
	private void method1953() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class7_Sub23 local17 = (Class7_Sub23) this.aClass85_12.method2010(); local17 != null; local17 = (Class7_Sub23) this.aClass85_12.method2000()) {
			local23 = local17.method3679();
			local11 += local17.method3685();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method3684();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt2338) {
			this.aBoolean128 = true;
			this.anInt2338 = local23;
		}
		@Pc(91) int local91 = this.anInt2337 <= 2 ? this.anInt2337 : 2;
		@Pc(100) int local100 = local11 <= 2 ? local11 : 2;
		this.anInt2337 = local11;
		if (local7 != this.aBoolean125) {
			this.aBoolean125 = local7;
			this.aBoolean127 = true;
		}
		if (local100 != local91) {
			this.aBoolean126 = this.aBoolean128 = true;
		}
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(Lclient!id;B)Z")
	public boolean method1954(@OriginalArg(0) Class7_Sub23 arg0) {
		if (this.aClass73_3 != null) {
			if (arg0.method3678() || arg0.method3686()) {
				this.aClass85_12.method2011(arg0);
				this.method1953();
				if (this.method1952()) {
					if (this.anInt2334 != -1 && this.anInt2336 != -1) {
						arg0.method3681(this.anInt2336, this.anInt2334);
					}
					arg0.aBoolean292 = true;
					return true;
				}
			}
			this.method1949(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
	public void method1955() {
		this.aClass7_Sub4_Sub11_1 = null;
		this.aClass59_Sub3_2 = null;
		this.aClass73_3 = this.aClass73_1 = this.aClass73_2 = null;
		this.aClass59_Sub3Array3 = null;
		this.aClass7_Sub4_Sub11_2 = null;
		if (!this.aClass85_12.method2007()) {
			for (@Pc(36) Class7 local36 = this.aClass85_12.method2010(); local36 != this.aClass85_12.aClass7_81; local36 = local36.aClass7_262) {
				((Class7_Sub23) local36).method3687();
			}
		}
		this.anInt2334 = this.anInt2336 = 1;
	}

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "(B)Z")
	public boolean method1956() {
		return this.aClass73_3 != null;
	}
}
