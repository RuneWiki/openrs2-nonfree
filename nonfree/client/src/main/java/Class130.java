import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!je")
public final class Class130 {

	@OriginalMember(owner = "client!je", name = "l", descriptor = "Z")
	private boolean aBoolean216;

	@OriginalMember(owner = "client!je", name = "x", descriptor = "Lclient!tr;")
	private Class2_Sub1_Sub17 aClass2_Sub1_Sub17_1;

	@OriginalMember(owner = "client!je", name = "A", descriptor = "Lclient!sa;")
	private Class64_Sub4 aClass64_Sub4_3;

	@OriginalMember(owner = "client!je", name = "D", descriptor = "Lclient!tr;")
	private Class2_Sub1_Sub17 aClass2_Sub1_Sub17_2;

	@OriginalMember(owner = "client!je", name = "g", descriptor = "I")
	private int anInt3367 = 1;

	@OriginalMember(owner = "client!je", name = "i", descriptor = "I")
	private int anInt3368 = 0;

	@OriginalMember(owner = "client!je", name = "n", descriptor = "I")
	private int anInt3371 = 1;

	@OriginalMember(owner = "client!je", name = "p", descriptor = "I")
	private int anInt3373 = 0;

	@OriginalMember(owner = "client!je", name = "t", descriptor = "Lclient!nj;")
	private final Class181 aClass181_15 = new Class181();

	@OriginalMember(owner = "client!je", name = "B", descriptor = "I")
	private int anInt3378 = -1;

	@OriginalMember(owner = "client!je", name = "z", descriptor = "I")
	private int anInt3377 = 0;

	@OriginalMember(owner = "client!je", name = "y", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!je", name = "C", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!je", name = "H", descriptor = "[Lclient!sa;")
	private Class64_Sub4[] aClass64_Sub4Array2 = new Class64_Sub4[2];

	@OriginalMember(owner = "client!je", name = "F", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!je", name = "G", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!je", name = "I", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!je", name = "w", descriptor = "Lclient!na;")
	private final Class75_Sub2 aClass75_Sub2_17;

	@OriginalMember(owner = "client!je", name = "h", descriptor = "Lclient!dg;")
	private Class51 aClass51_3;

	@OriginalMember(owner = "client!je", name = "r", descriptor = "Lclient!dg;")
	private Class51 aClass51_5;

	@OriginalMember(owner = "client!je", name = "m", descriptor = "Lclient!dg;")
	private Class51 aClass51_4;

	@OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lclient!na;)V")
	public Class130(@OriginalArg(0) Class75_Sub2 arg0) {
		this.aClass75_Sub2_17 = arg0;
		if (this.aClass75_Sub2_17.aBoolean339 && this.aClass75_Sub2_17.aBoolean345) {
			this.aClass51_5 = this.aClass51_3 = new Class51(this.aClass75_Sub2_17);
			if (this.aClass75_Sub2_17.anInt4853 > 1 && this.aClass75_Sub2_17.aBoolean336 && this.aClass75_Sub2_17.aBoolean340) {
				this.aClass51_5 = this.aClass51_4 = new Class51(this.aClass75_Sub2_17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
	public void method2763() {
		this.aClass51_5 = this.aClass51_4 = this.aClass51_3 = null;
		this.aClass64_Sub4Array2 = null;
		this.aClass2_Sub1_Sub17_2 = null;
		this.aClass2_Sub1_Sub17_1 = null;
		this.aClass64_Sub4_3 = null;
		if (!this.aClass181_15.method3971()) {
			for (@Pc(40) Class2 local40 = this.aClass181_15.method3972(); local40 != this.aClass181_15.aClass2_156; local40 = local40.aClass2_268) {
				((Class2_Sub6) local40).method683();
			}
		}
		this.anInt3371 = this.anInt3367 = 1;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(B)Z")
	private boolean method2766() {
		if (this.aBoolean219) {
			if (this.aClass2_Sub1_Sub17_1 != null) {
				this.aClass2_Sub1_Sub17_1.method5598();
				this.aClass2_Sub1_Sub17_1 = null;
			}
			if (this.aClass64_Sub4_3 != null) {
				this.aClass64_Sub4_3.method3518();
				this.aClass64_Sub4_3 = null;
			}
			if (this.aClass51_4 != null) {
				this.aClass2_Sub1_Sub17_1 = new Class2_Sub1_Sub17(this.aClass75_Sub2_17, 6402, this.anInt3371, this.anInt3367, this.aClass75_Sub2_17.anInt4853);
			}
			if (this.aBoolean218) {
				this.aClass64_Sub4_3 = new Class64_Sub4(this.aClass75_Sub2_17, 34037, 6402, this.anInt3371, this.anInt3367);
			} else if (this.aClass2_Sub1_Sub17_1 == null) {
				this.aClass2_Sub1_Sub17_1 = new Class2_Sub1_Sub17(this.aClass75_Sub2_17, 6402, this.anInt3371, this.anInt3367);
			}
			this.aBoolean221 = true;
			this.aBoolean219 = false;
			this.aBoolean220 = true;
		}
		if (this.aBoolean217) {
			if (this.aClass2_Sub1_Sub17_2 != null) {
				this.aClass2_Sub1_Sub17_2.method5598();
				this.aClass2_Sub1_Sub17_2 = null;
			}
			if (this.aClass64_Sub4Array2[0] != null) {
				this.aClass64_Sub4Array2[0].method3518();
				this.aClass64_Sub4Array2[0] = null;
			}
			if (this.aClass64_Sub4Array2[1] != null) {
				this.aClass64_Sub4Array2[1].method3518();
				this.aClass64_Sub4Array2[1] = null;
			}
			if (this.aClass51_4 != null) {
				this.aClass2_Sub1_Sub17_2 = new Class2_Sub1_Sub17(this.aClass75_Sub2_17, this.anInt3378, this.anInt3371, this.anInt3367, this.aClass75_Sub2_17.anInt4853);
			}
			this.aClass64_Sub4Array2[0] = new Class64_Sub4(this.aClass75_Sub2_17, 34037, this.anInt3378, this.anInt3371, this.anInt3367);
			this.aClass64_Sub4Array2[1] = this.anInt3377 <= 1 ? null : new Class64_Sub4(this.aClass75_Sub2_17, 34037, this.anInt3378, this.anInt3371, this.anInt3367);
			this.aBoolean220 = true;
			this.aBoolean221 = true;
			this.aBoolean217 = false;
		}
		if (this.aBoolean220) {
			if (this.aClass51_4 == null) {
				this.aClass75_Sub2_17.method3826(this.aClass51_3);
				this.aClass51_3.method1081(0);
				this.aClass51_3.method1081(1);
				this.aClass51_3.method1081(8);
				this.aClass51_3.method1080(this.aClass64_Sub4Array2[0], 0);
				if (this.anInt3377 > 1) {
					this.aClass51_3.method1080(this.aClass64_Sub4Array2[1], 1);
				}
				if (this.aBoolean218) {
					this.aClass51_3.method1080(this.aClass64_Sub4_3, 8);
				} else {
					this.aClass51_3.method1082(8, this.aClass2_Sub1_Sub17_1);
				}
				this.aClass75_Sub2_17.method3807(this.aClass51_3);
			} else {
				this.aClass75_Sub2_17.method3826(this.aClass51_3);
				this.aClass51_3.method1081(0);
				this.aClass51_3.method1081(1);
				this.aClass51_3.method1081(8);
				this.aClass51_3.method1080(this.aClass64_Sub4Array2[0], 0);
				if (this.anInt3377 > 1) {
					this.aClass51_3.method1080(this.aClass64_Sub4Array2[1], 1);
				}
				if (this.aBoolean218) {
					this.aClass51_3.method1080(this.aClass64_Sub4_3, 8);
				}
				this.aClass75_Sub2_17.method3807(this.aClass51_3);
				this.aClass75_Sub2_17.method3826(this.aClass51_4);
				this.aClass51_4.method1081(0);
				this.aClass51_4.method1081(8);
				this.aClass51_4.method1082(0, this.aClass2_Sub1_Sub17_2);
				this.aClass51_4.method1082(8, this.aClass2_Sub1_Sub17_1);
				this.aClass75_Sub2_17.method3807(this.aClass51_4);
			}
			this.aBoolean220 = false;
			this.aBoolean221 = true;
		}
		if (this.aBoolean221) {
			this.aClass75_Sub2_17.method3826(this.aClass51_5);
			this.aBoolean221 = !this.aClass51_5.method1089();
			this.aClass75_Sub2_17.method3807(this.aClass51_5);
		}
		return !this.aBoolean221;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(ILclient!uf;)Z")
	public boolean method2768(@OriginalArg(1) Class2_Sub6 arg0) {
		if (this.aClass51_5 != null) {
			if (arg0.method689() || arg0.method691()) {
				this.aClass181_15.method3973(arg0);
				this.method2772();
				if (this.method2766()) {
					if (this.anInt3371 != -1 && this.anInt3367 != -1) {
						arg0.method685(this.anInt3371, this.anInt3367);
					}
					arg0.aBoolean30 = true;
					return true;
				}
			}
			this.method2774(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(IZIII)Z")
	public boolean method2770(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass51_5 == null || this.aClass181_15.method3971()) {
			return false;
		}
		if (this.anInt3371 != arg2 || arg3 != this.anInt3367) {
			this.anInt3371 = arg2;
			this.anInt3367 = arg3;
			for (@Pc(38) Class2 local38 = this.aClass181_15.method3972(); local38 != this.aClass181_15.aClass2_156; local38 = local38.aClass2_268) {
				((Class2_Sub6) local38).method685(this.anInt3371, this.anInt3367);
			}
			this.aBoolean220 = true;
			this.aBoolean217 = true;
			this.aBoolean219 = true;
		}
		if (!this.method2766()) {
			return false;
		}
		this.anInt3373 = arg0;
		this.aBoolean216 = true;
		this.anInt3368 = arg1;
		this.aClass75_Sub2_17.method3826(this.aClass51_5);
		this.aClass51_5.method1078(0);
		this.aClass75_Sub2_17.method3864(this.anInt3367 - this.aClass51_5.method1083() - this.anInt3368, -this.anInt3373);
		return true;
	}

	@OriginalMember(owner = "client!je", name = "d", descriptor = "(I)Z")
	public boolean method2771() {
		return this.aClass51_5 != null;
	}

	@OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V")
	private void method2772() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub6 local17 = (Class2_Sub6) this.aClass181_15.method3972(); local17 != null; local17 = (Class2_Sub6) this.aClass181_15.method3975()) {
			local23 = local17.method695();
			local11 += local17.method690();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method692();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt3378) {
			this.anInt3378 = local23;
			this.aBoolean217 = true;
		}
		@Pc(95) int local95 = this.anInt3377 <= 2 ? this.anInt3377 : 2;
		@Pc(102) int local102 = local11 > 2 ? 2 : local11;
		if (local102 != local95) {
			this.aBoolean220 = this.aBoolean217 = true;
		}
		if (local7 != this.aBoolean218) {
			this.aBoolean219 = true;
			this.aBoolean218 = local7;
		}
		this.anInt3377 = local11;
	}

	@OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V")
	public void method2773() {
		if (!this.aBoolean216) {
			return;
		}
		if (this.aClass51_4 != null) {
			this.aClass75_Sub2_17.method3869(this.aClass51_4);
			@Pc(20) short local20 = 16384;
			this.aClass75_Sub2_17.method3810(this.aClass51_3);
			this.aClass51_4.method1091();
			this.aClass51_3.method1078(0);
			if (this.aBoolean218) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3371, this.anInt3367, 0, 0, this.anInt3371, this.anInt3367, local20, 9728);
			this.aClass75_Sub2_17.method3819(this.aClass51_4);
			this.aClass75_Sub2_17.method3842(this.aClass51_3);
		}
		this.aClass75_Sub2_17.method3833();
		this.aClass75_Sub2_17.method3870(0);
		this.aClass75_Sub2_17.method3798(1);
		this.aClass75_Sub2_17.va();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class2_Sub6 local105;
		for (@Pc(97) Class2_Sub6 local97 = (Class2_Sub6) this.aClass181_15.method3972(); local97 != null; local97 = local105) {
			local105 = (Class2_Sub6) this.aClass181_15.method3975();
			@Pc(109) int local109 = local97.method690();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method688(local111, this.aClass64_Sub4Array2[local89], this.aClass64_Sub4_3);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass75_Sub2_17.method3807(this.aClass51_3);
					this.aClass75_Sub2_17.method3864(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3367);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3373, this.anInt3368);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3373, this.anInt3367 + this.anInt3368);
					OpenGL.glTexCoord2f((float) this.anInt3371, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3371 + this.anInt3373, this.anInt3367 + this.anInt3368);
					OpenGL.glTexCoord2f((float) this.anInt3371, (float) this.anInt3367);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3373 + this.anInt3371, this.anInt3368);
					OpenGL.glEnd();
				} else {
					this.aClass51_3.method1078(--local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3367);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt3367);
					OpenGL.glTexCoord2f((float) this.anInt3371, (float) this.anInt3367);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3371, this.anInt3367);
					OpenGL.glTexCoord2f((float) this.anInt3371, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3371, 0);
					OpenGL.glEnd();
				}
				local97.method696(local111);
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean216 = false;
	}

	@OriginalMember(owner = "client!je", name = "a", descriptor = "(Lclient!uf;I)V")
	public void method2774(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.aBoolean30 = false;
		arg0.method683();
		arg0.method6260();
		this.method2772();
	}
}
