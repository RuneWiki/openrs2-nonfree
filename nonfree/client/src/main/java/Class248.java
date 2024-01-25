import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class248 {

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
	private boolean aBoolean450;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "Lclient!gb;")
	private Class1_Sub2_Sub7 aClass1_Sub2_Sub7_1;

	@OriginalMember(owner = "client!un", name = "F", descriptor = "Lclient!gb;")
	private Class1_Sub2_Sub7 aClass1_Sub2_Sub7_2;

	@OriginalMember(owner = "client!un", name = "H", descriptor = "Lclient!fo;")
	private Class3_Sub2 aClass3_Sub2_4;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "I")
	private int anInt6628 = 0;

	@OriginalMember(owner = "client!un", name = "g", descriptor = "I")
	private int anInt6632 = 1;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "I")
	private int anInt6637 = 0;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "I")
	private int anInt6633 = 1;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "Lclient!oe;")
	private final Class181 aClass181_59 = new Class181();

	@OriginalMember(owner = "client!un", name = "w", descriptor = "I")
	private int anInt6642 = 0;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "Z")
	private boolean aBoolean452 = true;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "Z")
	private boolean aBoolean454 = true;

	@OriginalMember(owner = "client!un", name = "A", descriptor = "Z")
	private boolean aBoolean453 = true;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "Z")
	private boolean aBoolean451 = false;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	private int anInt6643 = -1;

	@OriginalMember(owner = "client!un", name = "E", descriptor = "[Lclient!fo;")
	private Class3_Sub2[] aClass3_Sub2Array2 = new Class3_Sub2[2];

	@OriginalMember(owner = "client!un", name = "G", descriptor = "Z")
	private boolean aBoolean455 = true;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "Lclient!kd;")
	private final Class39_Sub2 aClass39_Sub2_39;

	@OriginalMember(owner = "client!un", name = "m", descriptor = "Lclient!tv;")
	private Class238 aClass238_4;

	@OriginalMember(owner = "client!un", name = "s", descriptor = "Lclient!tv;")
	private Class238 aClass238_6;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "Lclient!tv;")
	private Class238 aClass238_5;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!kd;)V")
	public Class248(@OriginalArg(0) Class39_Sub2 arg0) {
		this.aClass39_Sub2_39 = arg0;
		if (this.aClass39_Sub2_39.aBoolean251 && this.aClass39_Sub2_39.aBoolean229) {
			this.aClass238_6 = this.aClass238_4 = new Class238(this.aClass39_Sub2_39);
			if (this.aClass39_Sub2_39.anInt3774 > 1 && this.aClass39_Sub2_39.aBoolean249 && this.aClass39_Sub2_39.aBoolean236) {
				this.aClass238_6 = this.aClass238_5 = new Class238(this.aClass39_Sub2_39);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!pb;I)Z")
	public boolean method5511(@OriginalArg(0) Class1_Sub9 arg0) {
		if (this.aClass238_6 != null) {
			if (arg0.method650() || arg0.method644()) {
				this.aClass181_59.method4102(arg0);
				this.method5517();
				if (this.method5515()) {
					if (this.anInt6632 != -1 && this.anInt6633 != -1) {
						arg0.method642(this.anInt6632, this.anInt6633);
					}
					arg0.aBoolean31 = true;
					return true;
				}
			}
			this.method5518(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)Z")
	public boolean method5512() {
		return this.aClass238_6 != null;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
	public void method5513() {
		this.aClass3_Sub2_4 = null;
		this.aClass1_Sub2_Sub7_1 = null;
		this.aClass238_6 = this.aClass238_5 = this.aClass238_4 = null;
		this.aClass1_Sub2_Sub7_2 = null;
		this.aClass3_Sub2Array2 = null;
		if (!this.aClass181_59.method4113()) {
			for (@Pc(34) Class1 local34 = this.aClass181_59.method4112(); local34 != this.aClass181_59.aClass1_179; local34 = local34.aClass1_261) {
				((Class1_Sub9) local34).method647();
			}
		}
		this.anInt6632 = this.anInt6633 = 1;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)Z")
	private boolean method5515() {
		if (this.aBoolean452) {
			if (this.aClass1_Sub2_Sub7_1 != null) {
				this.aClass1_Sub2_Sub7_1.method2212();
				this.aClass1_Sub2_Sub7_1 = null;
			}
			if (this.aClass3_Sub2_4 != null) {
				this.aClass3_Sub2_4.method4152();
				this.aClass3_Sub2_4 = null;
			}
			if (this.aClass238_5 != null) {
				this.aClass1_Sub2_Sub7_1 = new Class1_Sub2_Sub7(this.aClass39_Sub2_39, 6402, this.anInt6632, this.anInt6633, this.aClass39_Sub2_39.anInt3774);
			}
			if (this.aBoolean451) {
				this.aClass3_Sub2_4 = new Class3_Sub2(this.aClass39_Sub2_39, 34037, 6402, this.anInt6632, this.anInt6633);
			} else if (this.aClass1_Sub2_Sub7_1 == null) {
				this.aClass1_Sub2_Sub7_1 = new Class1_Sub2_Sub7(this.aClass39_Sub2_39, 6402, this.anInt6632, this.anInt6633);
			}
			this.aBoolean452 = false;
			this.aBoolean455 = true;
			this.aBoolean453 = true;
		}
		if (this.aBoolean454) {
			if (this.aClass1_Sub2_Sub7_2 != null) {
				this.aClass1_Sub2_Sub7_2.method2212();
				this.aClass1_Sub2_Sub7_2 = null;
			}
			if (this.aClass3_Sub2Array2[0] != null) {
				this.aClass3_Sub2Array2[0].method4152();
				this.aClass3_Sub2Array2[0] = null;
			}
			if (this.aClass3_Sub2Array2[1] != null) {
				this.aClass3_Sub2Array2[1].method4152();
				this.aClass3_Sub2Array2[1] = null;
			}
			if (this.aClass238_5 != null) {
				this.aClass1_Sub2_Sub7_2 = new Class1_Sub2_Sub7(this.aClass39_Sub2_39, this.anInt6643, this.anInt6632, this.anInt6633, this.aClass39_Sub2_39.anInt3774);
			}
			this.aClass3_Sub2Array2[0] = new Class3_Sub2(this.aClass39_Sub2_39, 34037, this.anInt6643, this.anInt6632, this.anInt6633);
			this.aClass3_Sub2Array2[1] = this.anInt6642 > 1 ? new Class3_Sub2(this.aClass39_Sub2_39, 34037, this.anInt6643, this.anInt6632, this.anInt6633) : null;
			this.aBoolean455 = true;
			this.aBoolean453 = true;
			this.aBoolean454 = false;
		}
		if (this.aBoolean453) {
			if (this.aClass238_5 == null) {
				this.aClass39_Sub2_39.method3198(this.aClass238_4);
				this.aClass238_4.method5322(0);
				this.aClass238_4.method5322(1);
				this.aClass238_4.method5322(8);
				this.aClass238_4.method5324(0, this.aClass3_Sub2Array2[0]);
				if (this.anInt6642 > 1) {
					this.aClass238_4.method5324(1, this.aClass3_Sub2Array2[1]);
				}
				if (this.aBoolean451) {
					this.aClass238_4.method5324(8, this.aClass3_Sub2_4);
				} else {
					this.aClass238_4.method5317(this.aClass1_Sub2_Sub7_1, 8);
				}
				this.aClass39_Sub2_39.method3197(this.aClass238_4);
			} else {
				this.aClass39_Sub2_39.method3198(this.aClass238_4);
				this.aClass238_4.method5322(0);
				this.aClass238_4.method5322(1);
				this.aClass238_4.method5322(8);
				this.aClass238_4.method5324(0, this.aClass3_Sub2Array2[0]);
				if (this.anInt6642 > 1) {
					this.aClass238_4.method5324(1, this.aClass3_Sub2Array2[1]);
				}
				if (this.aBoolean451) {
					this.aClass238_4.method5324(8, this.aClass3_Sub2_4);
				}
				this.aClass39_Sub2_39.method3197(this.aClass238_4);
				this.aClass39_Sub2_39.method3198(this.aClass238_5);
				this.aClass238_5.method5322(0);
				this.aClass238_5.method5322(8);
				this.aClass238_5.method5317(this.aClass1_Sub2_Sub7_2, 0);
				this.aClass238_5.method5317(this.aClass1_Sub2_Sub7_1, 8);
				this.aClass39_Sub2_39.method3197(this.aClass238_5);
			}
			this.aBoolean455 = true;
			this.aBoolean453 = false;
		}
		if (this.aBoolean455) {
			this.aClass39_Sub2_39.method3198(this.aClass238_6);
			this.aBoolean455 = !this.aClass238_6.method5321();
			this.aClass39_Sub2_39.method3197(this.aClass238_6);
		}
		return !this.aBoolean455;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public void method5516() {
		if (!this.aBoolean450) {
			return;
		}
		if (this.aClass238_5 != null) {
			this.aClass39_Sub2_39.method3178(this.aClass238_5);
			@Pc(20) short local20 = 16384;
			this.aClass39_Sub2_39.method3229(this.aClass238_4);
			this.aClass238_5.method5323();
			this.aClass238_4.method5316(0);
			if (this.aBoolean451) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6632, this.anInt6633, 0, 0, this.anInt6632, this.anInt6633, local20, 9728);
			this.aClass39_Sub2_39.method3232(this.aClass238_5);
			this.aClass39_Sub2_39.method3183(this.aClass238_4);
		}
		this.aClass39_Sub2_39.method3228();
		this.aClass39_Sub2_39.method3205(0);
		this.aClass39_Sub2_39.method3162(1);
		this.aClass39_Sub2_39.e();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class1_Sub9 local113;
		for (@Pc(105) Class1_Sub9 local105 = (Class1_Sub9) this.aClass181_59.method4112(); local105 != null; local105 = local113) {
			local113 = (Class1_Sub9) this.aClass181_59.method4104();
			@Pc(117) int local117 = local105.method640();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method646(this.aClass3_Sub2_4, local119, this.aClass3_Sub2Array2[local97]);
				if (local113 == null && local119 == local117 - 1) {
					this.aClass39_Sub2_39.method3197(this.aClass238_4);
					this.aClass39_Sub2_39.method3195(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6633);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6637, this.anInt6628);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6637, this.anInt6628 + this.anInt6633);
					OpenGL.glTexCoord2f((float) this.anInt6632, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6637 + this.anInt6632, this.anInt6628 - -this.anInt6633);
					OpenGL.glTexCoord2f((float) this.anInt6632, (float) this.anInt6633);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6632 + this.anInt6637, this.anInt6628);
					OpenGL.glEnd();
				} else {
					this.aClass238_4.method5316(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6633);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6633);
					OpenGL.glTexCoord2f((float) this.anInt6632, (float) this.anInt6633);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6632, this.anInt6633);
					OpenGL.glTexCoord2f((float) this.anInt6632, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6632, 0);
					OpenGL.glEnd();
				}
				local99 = local99 + 1 & 0x1;
				local105.method645(local119);
				local97 = local97 + 1 & 0x1;
			}
		}
		this.aBoolean450 = false;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)V")
	private void method5517() {
		@Pc(5) boolean local5 = false;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(20) int local20;
		for (@Pc(15) Class1_Sub9 local15 = (Class1_Sub9) this.aClass181_59.method4112(); local15 != null; local15 = (Class1_Sub9) this.aClass181_59.method4104()) {
			local20 = local15.method651();
			if (local7 < local20) {
				local7 = local20;
			}
			local9 += local15.method640();
			local5 |= local15.method643();
		}
		if (local7 == 2) {
			local20 = 34836;
		} else if (local7 == 1) {
			local20 = 34842;
		} else {
			local20 = 6408;
		}
		if (local20 != this.anInt6643) {
			this.aBoolean454 = true;
			this.anInt6643 = local20;
		}
		@Pc(82) int local82 = this.anInt6642 <= 2 ? this.anInt6642 : 2;
		@Pc(97) int local97 = local9 <= 2 ? local9 : 2;
		this.anInt6642 = local9;
		if (local97 != local82) {
			this.aBoolean453 = this.aBoolean454 = true;
		}
		if (this.aBoolean451 != local5) {
			this.aBoolean452 = true;
			this.aBoolean451 = local5;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!pb;B)V")
	public void method5518(@OriginalArg(0) Class1_Sub9 arg0) {
		arg0.aBoolean31 = false;
		arg0.method647();
		arg0.method6020();
		this.method5517();
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIII)Z")
	public boolean method5519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass238_6 == null || this.aClass181_59.method4113()) {
			return false;
		}
		if (this.anInt6632 != arg1 || arg0 != this.anInt6633) {
			this.anInt6633 = arg0;
			this.anInt6632 = arg1;
			for (@Pc(44) Class1 local44 = this.aClass181_59.method4112(); local44 != this.aClass181_59.aClass1_179; local44 = local44.aClass1_261) {
				((Class1_Sub9) local44).method642(this.anInt6632, this.anInt6633);
			}
			this.aBoolean454 = true;
			this.aBoolean452 = true;
			this.aBoolean453 = true;
		}
		if (!this.method5515()) {
			return false;
		}
		this.anInt6637 = arg2;
		this.aBoolean450 = true;
		this.anInt6628 = arg3;
		this.aClass39_Sub2_39.method3198(this.aClass238_6);
		this.aClass238_6.method5316(0);
		this.aClass39_Sub2_39.method3195(this.anInt6633 - this.aClass238_6.method5318() - this.anInt6628, -this.anInt6637);
		return true;
	}
}
