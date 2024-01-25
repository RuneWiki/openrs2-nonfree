import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nr")
public final class Class254 {

	@OriginalMember(owner = "client!nr", name = "n", descriptor = "Z")
	private boolean aBoolean519;

	@OriginalMember(owner = "client!nr", name = "D", descriptor = "Lclient!fw;")
	private Class3_Sub6_Sub10 aClass3_Sub6_Sub10_1;

	@OriginalMember(owner = "client!nr", name = "H", descriptor = "Lclient!fw;")
	private Class3_Sub6_Sub10 aClass3_Sub6_Sub10_2;

	@OriginalMember(owner = "client!nr", name = "I", descriptor = "Lclient!kf;")
	private Class39_Sub4 aClass39_Sub4_6;

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "I")
	private int anInt6916 = 1;

	@OriginalMember(owner = "client!nr", name = "f", descriptor = "I")
	private int anInt6920 = 1;

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "I")
	private int anInt6919 = 0;

	@OriginalMember(owner = "client!nr", name = "i", descriptor = "I")
	private int anInt6923 = 0;

	@OriginalMember(owner = "client!nr", name = "s", descriptor = "Lclient!jia;")
	private final Class193 aClass193_36 = new Class193();

	@OriginalMember(owner = "client!nr", name = "x", descriptor = "Z")
	private boolean aBoolean521 = true;

	@OriginalMember(owner = "client!nr", name = "w", descriptor = "Z")
	private boolean aBoolean520 = true;

	@OriginalMember(owner = "client!nr", name = "z", descriptor = "I")
	private int anInt6930 = -1;

	@OriginalMember(owner = "client!nr", name = "F", descriptor = "Z")
	private boolean aBoolean524 = true;

	@OriginalMember(owner = "client!nr", name = "B", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
	private int anInt6933 = 0;

	@OriginalMember(owner = "client!nr", name = "y", descriptor = "Z")
	private boolean aBoolean522 = true;

	@OriginalMember(owner = "client!nr", name = "G", descriptor = "[Lclient!kf;")
	private Class39_Sub4[] aClass39_Sub4Array2 = new Class39_Sub4[2];

	@OriginalMember(owner = "client!nr", name = "j", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_34;

	@OriginalMember(owner = "client!nr", name = "r", descriptor = "Lclient!et;")
	private Class109 aClass109_6;

	@OriginalMember(owner = "client!nr", name = "t", descriptor = "Lclient!et;")
	private Class109 aClass109_7;

	@OriginalMember(owner = "client!nr", name = "p", descriptor = "Lclient!et;")
	private Class109 aClass109_5;

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!hk;)V")
	public Class254(@OriginalArg(0) Class16_Sub2 arg0) {
		this.aClass16_Sub2_34 = arg0;
		if (this.aClass16_Sub2_34.aBoolean331 && this.aClass16_Sub2_34.aBoolean318) {
			this.aClass109_7 = this.aClass109_6 = new Class109(this.aClass16_Sub2_34);
			if (this.aClass16_Sub2_34.anInt4361 > 1 && this.aClass16_Sub2_34.aBoolean335 && this.aClass16_Sub2_34.aBoolean319) {
				this.aClass109_7 = this.aClass109_5 = new Class109(this.aClass16_Sub2_34);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(ZLclient!rp;)V")
	public void method5788(@OriginalArg(1) Class3_Sub31 arg0) {
		arg0.aBoolean449 = false;
		arg0.method4773();
		arg0.method8770();
		this.method5790();
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(IBIII)Z")
	public boolean method5789(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass109_7 == null || this.aClass193_36.method4454()) {
			return false;
		}
		if (arg0 != this.anInt6916 || this.anInt6920 != arg3) {
			this.anInt6920 = arg3;
			this.anInt6916 = arg0;
			for (@Pc(40) Class3 local40 = this.aClass193_36.method4457(); local40 != this.aClass193_36.aClass3_155; local40 = local40.aClass3_337) {
				((Class3_Sub31) local40).method4779(this.anInt6920, this.anInt6916);
			}
			this.aBoolean522 = true;
			this.aBoolean521 = true;
			this.aBoolean520 = true;
		}
		if (!this.method5792()) {
			return false;
		}
		this.anInt6919 = arg2;
		this.aBoolean519 = true;
		this.anInt6923 = arg1;
		this.aClass16_Sub2_34.method3615(this.aClass109_7);
		this.aClass109_7.method2556(0);
		this.aClass16_Sub2_34.method3621(-this.anInt6919, this.anInt6920 + this.anInt6923 - this.aClass16_Sub2_34.anInt4359);
		return true;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)V")
	private void method5790() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub31 local17 = (Class3_Sub31) this.aClass193_36.method4457(); local17 != null; local17 = (Class3_Sub31) this.aClass193_36.method4459()) {
			local23 = local17.method4780();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method4783();
			local7 |= local17.method4772();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt6930 != local23) {
			this.aBoolean520 = true;
			this.anInt6930 = local23;
		}
		@Pc(97) int local97 = this.anInt6933 <= 2 ? this.anInt6933 : 2;
		@Pc(106) int local106 = local11 > 2 ? 2 : local11;
		if (this.aBoolean523 != local7) {
			this.aBoolean521 = true;
			this.aBoolean523 = local7;
		}
		if (local106 != local97) {
			this.aBoolean522 = this.aBoolean520 = true;
		}
		this.anInt6933 = local11;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)V")
	public void method5791() {
		if (!this.aBoolean519) {
			return;
		}
		if (this.aClass109_5 != null) {
			this.aClass16_Sub2_34.method3645(this.aClass109_5);
			@Pc(20) short local20 = 16384;
			this.aClass16_Sub2_34.method3630(this.aClass109_6);
			this.aClass109_5.method2547();
			this.aClass109_6.method2556(0);
			if (this.aBoolean523) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6916, this.anInt6920, 0, 0, this.anInt6916, this.anInt6920, local20, 9728);
			this.aClass16_Sub2_34.method3670(this.aClass109_5);
			this.aClass16_Sub2_34.method3649(this.aClass109_6);
		}
		this.aClass16_Sub2_34.method3633();
		this.aClass16_Sub2_34.method3654(0);
		this.aClass16_Sub2_34.method3680(1);
		this.aClass16_Sub2_34.la();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class3_Sub31 local113;
		for (@Pc(105) Class3_Sub31 local105 = (Class3_Sub31) this.aClass193_36.method4457(); local105 != null; local105 = local113) {
			local113 = (Class3_Sub31) this.aClass193_36.method4459();
			@Pc(117) int local117 = local105.method4783();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method4781(this.aClass39_Sub4Array2[local97], local119, this.aClass39_Sub4_6);
				if (local113 == null && local119 == local117 - 1) {
					this.aClass16_Sub2_34.method3635(this.aClass109_6);
					this.aClass16_Sub2_34.method3621(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6920);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6919, this.anInt6923);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6919, this.anInt6920 + this.anInt6923);
					OpenGL.glTexCoord2f((float) this.anInt6916, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6919 + this.anInt6916, this.anInt6923 - -this.anInt6920);
					OpenGL.glTexCoord2f((float) this.anInt6916, (float) this.anInt6920);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6916 + this.anInt6919, this.anInt6923);
					OpenGL.glEnd();
				} else {
					this.aClass109_6.method2556(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6920);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt6920);
					OpenGL.glTexCoord2f((float) this.anInt6916, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6916, this.anInt6920);
					OpenGL.glTexCoord2f((float) this.anInt6916, (float) this.anInt6920);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6916, 0);
					OpenGL.glEnd();
				}
				local97 = local97 + 1 & 0x1;
				local99 = local99 + 1 & 0x1;
				local105.method4777(local119);
			}
		}
		this.aBoolean519 = false;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)Z")
	private boolean method5792() {
		if (this.aBoolean521) {
			if (this.aClass3_Sub6_Sub10_1 != null) {
				this.aClass3_Sub6_Sub10_1.method2994();
				this.aClass3_Sub6_Sub10_1 = null;
			}
			if (this.aClass39_Sub4_6 != null) {
				this.aClass39_Sub4_6.method8467();
				this.aClass39_Sub4_6 = null;
			}
			if (this.aClass109_5 != null) {
				this.aClass3_Sub6_Sub10_1 = new Class3_Sub6_Sub10(this.aClass16_Sub2_34, 6402, this.anInt6916, this.anInt6920, this.aClass16_Sub2_34.anInt4361);
			}
			if (this.aBoolean523) {
				this.aClass39_Sub4_6 = new Class39_Sub4(this.aClass16_Sub2_34, 34037, 6402, this.anInt6916, this.anInt6920);
			} else if (this.aClass3_Sub6_Sub10_1 == null) {
				this.aClass3_Sub6_Sub10_1 = new Class3_Sub6_Sub10(this.aClass16_Sub2_34, 6402, this.anInt6916, this.anInt6920);
			}
			this.aBoolean524 = true;
			this.aBoolean521 = false;
			this.aBoolean522 = true;
		}
		if (this.aBoolean520) {
			if (this.aClass3_Sub6_Sub10_2 != null) {
				this.aClass3_Sub6_Sub10_2.method2994();
				this.aClass3_Sub6_Sub10_2 = null;
			}
			if (this.aClass39_Sub4Array2[0] != null) {
				this.aClass39_Sub4Array2[0].method8467();
				this.aClass39_Sub4Array2[0] = null;
			}
			if (this.aClass39_Sub4Array2[1] != null) {
				this.aClass39_Sub4Array2[1].method8467();
				this.aClass39_Sub4Array2[1] = null;
			}
			if (this.aClass109_5 != null) {
				this.aClass3_Sub6_Sub10_2 = new Class3_Sub6_Sub10(this.aClass16_Sub2_34, this.anInt6930, this.anInt6916, this.anInt6920, this.aClass16_Sub2_34.anInt4361);
			}
			this.aClass39_Sub4Array2[0] = new Class39_Sub4(this.aClass16_Sub2_34, 34037, this.anInt6930, this.anInt6916, this.anInt6920);
			this.aClass39_Sub4Array2[1] = this.anInt6933 <= 1 ? null : new Class39_Sub4(this.aClass16_Sub2_34, 34037, this.anInt6930, this.anInt6916, this.anInt6920);
			this.aBoolean522 = true;
			this.aBoolean524 = true;
			this.aBoolean520 = false;
		}
		if (this.aBoolean522) {
			if (this.aClass109_5 == null) {
				this.aClass16_Sub2_34.method3615(this.aClass109_6);
				this.aClass109_6.method2552(0);
				this.aClass109_6.method2552(1);
				this.aClass109_6.method2552(8);
				this.aClass109_6.method2554(0, this.aClass39_Sub4Array2[0]);
				if (this.anInt6933 > 1) {
					this.aClass109_6.method2554(1, this.aClass39_Sub4Array2[1]);
				}
				if (this.aBoolean523) {
					this.aClass109_6.method2554(8, this.aClass39_Sub4_6);
				} else {
					this.aClass109_6.method2548(this.aClass3_Sub6_Sub10_1, 8);
				}
				this.aClass16_Sub2_34.method3635(this.aClass109_6);
			} else {
				this.aClass16_Sub2_34.method3615(this.aClass109_6);
				this.aClass109_6.method2552(0);
				this.aClass109_6.method2552(1);
				this.aClass109_6.method2552(8);
				this.aClass109_6.method2554(0, this.aClass39_Sub4Array2[0]);
				if (this.anInt6933 > 1) {
					this.aClass109_6.method2554(1, this.aClass39_Sub4Array2[1]);
				}
				if (this.aBoolean523) {
					this.aClass109_6.method2554(8, this.aClass39_Sub4_6);
				}
				this.aClass16_Sub2_34.method3635(this.aClass109_6);
				this.aClass16_Sub2_34.method3615(this.aClass109_5);
				this.aClass109_5.method2552(0);
				this.aClass109_5.method2552(8);
				this.aClass109_5.method2548(this.aClass3_Sub6_Sub10_2, 0);
				this.aClass109_5.method2548(this.aClass3_Sub6_Sub10_1, 8);
				this.aClass16_Sub2_34.method3635(this.aClass109_5);
			}
			this.aBoolean522 = false;
			this.aBoolean524 = true;
		}
		if (this.aBoolean524) {
			this.aClass16_Sub2_34.method3615(this.aClass109_7);
			this.aBoolean524 = !this.aClass109_7.method2549();
			this.aClass16_Sub2_34.method3635(this.aClass109_7);
		}
		return !this.aBoolean524;
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)Z")
	public boolean method5793() {
		return this.aClass109_7 != null;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(BLclient!rp;)Z")
	public boolean method5794(@OriginalArg(1) Class3_Sub31 arg0) {
		if (this.aClass109_7 != null) {
			if (arg0.method4778() || arg0.method4775()) {
				this.aClass193_36.method4462(arg0);
				this.method5790();
				if (this.method5792()) {
					if (this.anInt6916 != -1 && this.anInt6920 != -1) {
						arg0.method4779(this.anInt6920, this.anInt6916);
					}
					arg0.aBoolean449 = true;
					return true;
				}
			}
			this.method5788(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!nr", name = "e", descriptor = "(I)V")
	public void method5795() {
		this.aClass109_7 = this.aClass109_5 = this.aClass109_6 = null;
		this.aClass3_Sub6_Sub10_2 = null;
		this.aClass39_Sub4_6 = null;
		this.aClass3_Sub6_Sub10_1 = null;
		this.aClass39_Sub4Array2 = null;
		if (!this.aClass193_36.method4454()) {
			for (@Pc(36) Class3 local36 = this.aClass193_36.method4457(); local36 != this.aClass193_36.aClass3_155; local36 = local36.aClass3_337) {
				((Class3_Sub31) local36).method4773();
			}
		}
		this.anInt6916 = this.anInt6920 = 1;
	}
}
