import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class26 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "Z")
	private boolean aBoolean74;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "Lclient!so;")
	private Class3_Sub4_Sub21 aClass3_Sub4_Sub21_1;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "Lclient!so;")
	private Class3_Sub4_Sub21 aClass3_Sub4_Sub21_2;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "Lclient!ol;")
	private Class76_Sub3 aClass76_Sub3_1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	private int anInt1110 = 1;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	private int anInt1115 = 0;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	private int anInt1118 = 0;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	private int anInt1121 = 1;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "Lclient!mr;")
	private final Class223 aClass223_4 = new Class223();

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
	private int anInt1123 = -1;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Z")
	private boolean aBoolean76 = true;

	@OriginalMember(owner = "client!bc", name = "t", descriptor = "I")
	private int anInt1122 = 0;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "Z")
	private boolean aBoolean79 = true;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	private boolean aBoolean78 = true;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "[Lclient!ol;")
	private Class76_Sub3[] aClass76_Sub3Array1 = new Class76_Sub3[2];

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!bc", name = "j", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_4;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "Lclient!tg;")
	private Class320 aClass320_1;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "Lclient!tg;")
	private Class320 aClass320_2;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "Lclient!tg;")
	private Class320 aClass320_3;

	@OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class26(@OriginalArg(0) Class5_Sub2 arg0) {
		this.aClass5_Sub2_4 = arg0;
		if (this.aClass5_Sub2_4.aBoolean374 && this.aClass5_Sub2_4.aBoolean384) {
			this.aClass320_2 = this.aClass320_1 = new Class320(this.aClass5_Sub2_4);
			if (this.aClass5_Sub2_4.anInt5642 > 1 && this.aClass5_Sub2_4.aBoolean388 && this.aClass5_Sub2_4.aBoolean393) {
				this.aClass320_2 = this.aClass320_3 = new Class320(this.aClass5_Sub2_4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZIII)Z")
	public boolean method1202(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass320_2 == null || this.aClass223_4.method5864()) {
			return false;
		}
		if (arg1 != this.anInt1121 || arg3 != this.anInt1110) {
			this.anInt1110 = arg3;
			this.anInt1121 = arg1;
			for (@Pc(48) Class3 local48 = this.aClass223_4.method5874(); local48 != this.aClass223_4.aClass3_188; local48 = local48.aClass3_300) {
				((Class3_Sub20) local48).method7672(this.anInt1110, this.anInt1121);
			}
			this.aBoolean78 = true;
			this.aBoolean79 = true;
			this.aBoolean75 = true;
		}
		if (!this.method1203()) {
			return false;
		}
		this.aBoolean74 = true;
		this.anInt1115 = arg0;
		this.anInt1118 = arg2;
		this.aClass5_Sub2_4.method5028(this.aClass320_2);
		this.aClass320_2.method7963(0);
		this.aClass5_Sub2_4.method5021(-this.anInt1118, this.anInt1115 + this.anInt1110 - this.aClass5_Sub2_4.anInt5457);
		return true;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)Z")
	private boolean method1203() {
		if (this.aBoolean78) {
			if (this.aClass3_Sub4_Sub21_2 != null) {
				this.aClass3_Sub4_Sub21_2.method7754();
				this.aClass3_Sub4_Sub21_2 = null;
			}
			if (this.aClass76_Sub3_1 != null) {
				this.aClass76_Sub3_1.method7926();
				this.aClass76_Sub3_1 = null;
			}
			if (this.aClass320_3 != null) {
				this.aClass3_Sub4_Sub21_2 = new Class3_Sub4_Sub21(this.aClass5_Sub2_4, 6402, this.anInt1121, this.anInt1110, this.aClass5_Sub2_4.anInt5642);
			}
			if (this.aBoolean77) {
				this.aClass76_Sub3_1 = new Class76_Sub3(this.aClass5_Sub2_4, 34037, 6402, this.anInt1121, this.anInt1110);
			} else if (this.aClass3_Sub4_Sub21_2 == null) {
				this.aClass3_Sub4_Sub21_2 = new Class3_Sub4_Sub21(this.aClass5_Sub2_4, 6402, this.anInt1121, this.anInt1110);
			}
			this.aBoolean75 = true;
			this.aBoolean78 = false;
			this.aBoolean76 = true;
		}
		if (this.aBoolean79) {
			if (this.aClass3_Sub4_Sub21_1 != null) {
				this.aClass3_Sub4_Sub21_1.method7754();
				this.aClass3_Sub4_Sub21_1 = null;
			}
			if (this.aClass76_Sub3Array1[0] != null) {
				this.aClass76_Sub3Array1[0].method7926();
				this.aClass76_Sub3Array1[0] = null;
			}
			if (this.aClass76_Sub3Array1[1] != null) {
				this.aClass76_Sub3Array1[1].method7926();
				this.aClass76_Sub3Array1[1] = null;
			}
			if (this.aClass320_3 != null) {
				this.aClass3_Sub4_Sub21_1 = new Class3_Sub4_Sub21(this.aClass5_Sub2_4, this.anInt1123, this.anInt1121, this.anInt1110, this.aClass5_Sub2_4.anInt5642);
			}
			this.aClass76_Sub3Array1[0] = new Class76_Sub3(this.aClass5_Sub2_4, 34037, this.anInt1123, this.anInt1121, this.anInt1110);
			this.aClass76_Sub3Array1[1] = this.anInt1122 > 1 ? new Class76_Sub3(this.aClass5_Sub2_4, 34037, this.anInt1123, this.anInt1121, this.anInt1110) : null;
			this.aBoolean75 = true;
			this.aBoolean76 = true;
			this.aBoolean79 = false;
		}
		if (this.aBoolean75) {
			if (this.aClass320_3 == null) {
				this.aClass5_Sub2_4.method5028(this.aClass320_1);
				this.aClass320_1.method7961(0);
				this.aClass320_1.method7961(1);
				this.aClass320_1.method7961(8);
				this.aClass320_1.method7969(0, this.aClass76_Sub3Array1[0]);
				if (this.anInt1122 > 1) {
					this.aClass320_1.method7969(1, this.aClass76_Sub3Array1[1]);
				}
				if (this.aBoolean77) {
					this.aClass320_1.method7969(8, this.aClass76_Sub3_1);
				} else {
					this.aClass320_1.method7959(8, this.aClass3_Sub4_Sub21_2);
				}
				this.aClass5_Sub2_4.method5026(this.aClass320_1);
			} else {
				this.aClass5_Sub2_4.method5028(this.aClass320_1);
				this.aClass320_1.method7961(0);
				this.aClass320_1.method7961(1);
				this.aClass320_1.method7961(8);
				this.aClass320_1.method7969(0, this.aClass76_Sub3Array1[0]);
				if (this.anInt1122 > 1) {
					this.aClass320_1.method7969(1, this.aClass76_Sub3Array1[1]);
				}
				if (this.aBoolean77) {
					this.aClass320_1.method7969(8, this.aClass76_Sub3_1);
				}
				this.aClass5_Sub2_4.method5026(this.aClass320_1);
				this.aClass5_Sub2_4.method5028(this.aClass320_3);
				this.aClass320_3.method7961(0);
				this.aClass320_3.method7961(8);
				this.aClass320_3.method7959(0, this.aClass3_Sub4_Sub21_1);
				this.aClass320_3.method7959(8, this.aClass3_Sub4_Sub21_2);
				this.aClass5_Sub2_4.method5026(this.aClass320_3);
			}
			this.aBoolean76 = true;
			this.aBoolean75 = false;
		}
		if (this.aBoolean76) {
			this.aClass5_Sub2_4.method5028(this.aClass320_2);
			this.aBoolean76 = !this.aClass320_2.method7964();
			this.aClass5_Sub2_4.method5026(this.aClass320_2);
		}
		return !this.aBoolean76;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	private void method1204() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub20 local17 = (Class3_Sub20) this.aClass223_4.method5874(); local17 != null; local17 = (Class3_Sub20) this.aClass223_4.method5870()) {
			local23 = local17.method7680();
			if (local23 > local9) {
				local9 = local23;
			}
			local11 += local17.method7683();
			local7 |= local17.method7682();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt1123) {
			this.aBoolean79 = true;
			this.anInt1123 = local23;
		}
		@Pc(93) int local93 = this.anInt1122 <= 2 ? this.anInt1122 : 2;
		@Pc(102) int local102 = local11 <= 2 ? local11 : 2;
		if (this.aBoolean77 != local7) {
			this.aBoolean78 = true;
			this.aBoolean77 = local7;
		}
		this.anInt1122 = local11;
		if (local102 != local93) {
			this.aBoolean75 = this.aBoolean79 = true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public void method1206() {
		this.aClass76_Sub3_1 = null;
		this.aClass76_Sub3Array1 = null;
		this.aClass3_Sub4_Sub21_2 = null;
		this.aClass3_Sub4_Sub21_1 = null;
		this.aClass320_2 = this.aClass320_3 = this.aClass320_1 = null;
		if (!this.aClass223_4.method5864()) {
			for (@Pc(36) Class3 local36 = this.aClass223_4.method5874(); local36 != this.aClass223_4.aClass3_188; local36 = local36.aClass3_300) {
				((Class3_Sub20) local36).method7677();
			}
		}
		this.anInt1121 = this.anInt1110 = 1;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!f;I)Z")
	public boolean method1207(@OriginalArg(0) Class3_Sub20 arg0) {
		if (this.aClass320_2 != null) {
			if (arg0.method7678() || arg0.method7670()) {
				this.aClass223_4.method5868(arg0);
				this.method1204();
				if (this.method1203()) {
					if (this.anInt1121 != -1 && this.anInt1110 != -1) {
						arg0.method7672(this.anInt1110, this.anInt1121);
					}
					arg0.aBoolean635 = true;
					return true;
				}
			}
			this.method1212(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)Z")
	public boolean method1209() {
		return this.aClass320_2 != null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public void method1211() {
		if (!this.aBoolean74) {
			return;
		}
		if (this.aClass320_3 != null) {
			this.aClass5_Sub2_4.method4980(this.aClass320_3);
			@Pc(20) short local20 = 16384;
			this.aClass5_Sub2_4.method4964(this.aClass320_1);
			this.aClass320_3.method7966();
			this.aClass320_1.method7963(0);
			if (this.aBoolean77) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1121, this.anInt1110, 0, 0, this.anInt1121, this.anInt1110, local20, 9728);
			this.aClass5_Sub2_4.method5008(this.aClass320_3);
			this.aClass5_Sub2_4.method5025(this.aClass320_1);
		}
		this.aClass5_Sub2_4.method5005();
		this.aClass5_Sub2_4.method4971(0);
		this.aClass5_Sub2_4.method4953(1);
		this.aClass5_Sub2_4.la();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class3_Sub20 local113;
		for (@Pc(105) Class3_Sub20 local105 = (Class3_Sub20) this.aClass223_4.method5874(); local105 != null; local105 = local113) {
			local113 = (Class3_Sub20) this.aClass223_4.method5870();
			@Pc(117) int local117 = local105.method7683();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method7675(local119, this.aClass76_Sub3Array1[local97], this.aClass76_Sub3_1);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass5_Sub2_4.method5026(this.aClass320_1);
					this.aClass5_Sub2_4.method5021(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1110);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1118, this.anInt1115);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1118, this.anInt1115 + this.anInt1110);
					OpenGL.glTexCoord2f((float) this.anInt1121, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1118 + this.anInt1121, this.anInt1110 + this.anInt1115);
					OpenGL.glTexCoord2f((float) this.anInt1121, (float) this.anInt1110);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1118 + this.anInt1121, this.anInt1115);
					OpenGL.glEnd();
				} else {
					this.aClass320_1.method7963(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1110);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt1110);
					OpenGL.glTexCoord2f((float) this.anInt1121, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1121, this.anInt1110);
					OpenGL.glTexCoord2f((float) this.anInt1121, (float) this.anInt1110);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1121, 0);
					OpenGL.glEnd();
				}
				local97 = local97 + 1 & 0x1;
				local105.method7681(local119);
				local99 = local99 + 1 & 0x1;
			}
		}
		this.aBoolean74 = false;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Lclient!f;I)V")
	public void method1212(@OriginalArg(0) Class3_Sub20 arg0) {
		arg0.aBoolean635 = false;
		arg0.method7677();
		arg0.method8769();
		this.method1204();
	}
}
