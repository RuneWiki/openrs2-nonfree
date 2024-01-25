import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ei")
public final class Class88 {

	@OriginalMember(owner = "client!ei", name = "r", descriptor = "Z")
	private boolean aBoolean197;

	@OriginalMember(owner = "client!ei", name = "D", descriptor = "Lclient!saa;")
	private Class77_Sub1 aClass77_Sub1_1;

	@OriginalMember(owner = "client!ei", name = "I", descriptor = "Lclient!oaa;")
	private Class4_Sub5_Sub13 aClass4_Sub5_Sub13_1;

	@OriginalMember(owner = "client!ei", name = "J", descriptor = "Lclient!oaa;")
	private Class4_Sub5_Sub13 aClass4_Sub5_Sub13_2;

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
	private int anInt2679 = 1;

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	private int anInt2690 = 0;

	@OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
	private int anInt2686 = 1;

	@OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
	private int anInt2691 = 0;

	@OriginalMember(owner = "client!ei", name = "x", descriptor = "Lclient!oe;")
	private final Class244 aClass244_21 = new Class244();

	@OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
	private int anInt2694 = 0;

	@OriginalMember(owner = "client!ei", name = "E", descriptor = "Z")
	private boolean aBoolean200 = true;

	@OriginalMember(owner = "client!ei", name = "G", descriptor = "Z")
	private boolean aBoolean202 = true;

	@OriginalMember(owner = "client!ei", name = "C", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!ei", name = "F", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!ei", name = "H", descriptor = "[Lclient!saa;")
	private Class77_Sub1[] aClass77_Sub1Array1 = new Class77_Sub1[2];

	@OriginalMember(owner = "client!ei", name = "K", descriptor = "I")
	private int anInt2695 = -1;

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_12;

	@OriginalMember(owner = "client!ei", name = "w", descriptor = "Lclient!ci;")
	private Class51 aClass51_2;

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!ci;")
	private Class51 aClass51_1;

	@OriginalMember(owner = "client!ei", name = "y", descriptor = "Lclient!ci;")
	private Class51 aClass51_3;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!kga;)V")
	public Class88(@OriginalArg(0) Class44_Sub3 arg0) {
		this.aClass44_Sub3_12 = arg0;
		if (this.aClass44_Sub3_12.aBoolean412 && this.aClass44_Sub3_12.aBoolean400) {
			this.aClass51_1 = this.aClass51_2 = new Class51(this.aClass44_Sub3_12);
			if (this.aClass44_Sub3_12.anInt5468 > 1 && this.aClass44_Sub3_12.aBoolean410 && this.aClass44_Sub3_12.aBoolean396) {
				this.aClass51_1 = this.aClass51_3 = new Class51(this.aClass44_Sub3_12);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIBI)Z")
	public boolean method2468(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass51_1 == null || this.aClass244_21.method5961()) {
			return false;
		}
		if (this.anInt2679 != arg0 || arg1 != this.anInt2686) {
			this.anInt2679 = arg0;
			this.anInt2686 = arg1;
			for (@Pc(46) Class4 local46 = this.aClass244_21.method5963(); local46 != this.aClass244_21.aClass4_185; local46 = local46.aClass4_285) {
				((Class4_Sub46) local46).method7558(this.anInt2686, this.anInt2679);
			}
			this.aBoolean200 = true;
			this.aBoolean202 = true;
			this.aBoolean199 = true;
		}
		if (!this.method2475()) {
			return false;
		}
		this.aBoolean197 = true;
		this.anInt2690 = arg2;
		this.anInt2691 = arg3;
		this.aClass44_Sub3_12.method4626(this.aClass51_1);
		this.aClass51_1.method1103(0);
		this.aClass44_Sub3_12.method4677(-this.anInt2690, this.anInt2691 + this.anInt2686 - this.aClass44_Sub3_12.anInt5285);
		return true;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public void method2470() {
		if (!this.aBoolean197) {
			return;
		}
		if (this.aClass51_3 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass44_Sub3_12.method4628(this.aClass51_3);
			this.aClass44_Sub3_12.method4659(this.aClass51_2);
			this.aClass51_3.method1099();
			this.aClass51_2.method1103(0);
			if (this.aBoolean198) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt2679, this.anInt2686, 0, 0, this.anInt2679, this.anInt2686, local14, 9728);
			this.aClass44_Sub3_12.method4614(this.aClass51_3);
			this.aClass44_Sub3_12.method4631(this.aClass51_2);
		}
		this.aClass44_Sub3_12.method4606();
		this.aClass44_Sub3_12.method4669(0);
		this.aClass44_Sub3_12.method4658(1);
		this.aClass44_Sub3_12.JA();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class4_Sub46 local113;
		for (@Pc(105) Class4_Sub46 local105 = (Class4_Sub46) this.aClass244_21.method5963(); local105 != null; local105 = local113) {
			local113 = (Class4_Sub46) this.aClass244_21.method5965();
			@Pc(117) int local117 = local105.method7555();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method7559(this.aClass77_Sub1_1, local119, this.aClass77_Sub1Array1[local97]);
				if (local113 == null && local119 == local117 - 1) {
					this.aClass44_Sub3_12.method4627(this.aClass51_2);
					this.aClass44_Sub3_12.method4677(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2686);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2690, this.anInt2691);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2690, this.anInt2686 + this.anInt2691);
					OpenGL.glTexCoord2f((float) this.anInt2679, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2679 + this.anInt2690, this.anInt2686 + this.anInt2691);
					OpenGL.glTexCoord2f((float) this.anInt2679, (float) this.anInt2686);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2679 + this.anInt2690, this.anInt2691);
					OpenGL.glEnd();
				} else {
					this.aClass51_2.method1103(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2686);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt2686);
					OpenGL.glTexCoord2f((float) this.anInt2679, (float) this.anInt2686);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2679, this.anInt2686);
					OpenGL.glTexCoord2f((float) this.anInt2679, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2679, 0);
					OpenGL.glEnd();
				}
				local97 = local97 + 1 & 0x1;
				local105.method7552(local119);
				local99 = local99 + 1 & 0x1;
			}
		}
		this.aBoolean197 = false;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)Z")
	public boolean method2471() {
		return this.aClass51_1 != null;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V")
	public void method2472() {
		this.aClass4_Sub5_Sub13_1 = null;
		this.aClass51_1 = this.aClass51_3 = this.aClass51_2 = null;
		this.aClass77_Sub1_1 = null;
		this.aClass4_Sub5_Sub13_2 = null;
		this.aClass77_Sub1Array1 = null;
		if (!this.aClass244_21.method5961()) {
			for (@Pc(44) Class4 local44 = this.aClass244_21.method5963(); local44 != this.aClass244_21.aClass4_185; local44 = local44.aClass4_285) {
				((Class4_Sub46) local44).method7560();
			}
		}
		this.anInt2679 = this.anInt2686 = 1;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
	private void method2473() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class4_Sub46 local17 = (Class4_Sub46) this.aClass244_21.method5963(); local17 != null; local17 = (Class4_Sub46) this.aClass244_21.method5965()) {
			local23 = local17.method7556();
			local11 += local17.method7555();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method7550();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt2695) {
			this.aBoolean199 = true;
			this.anInt2695 = local23;
		}
		@Pc(89) int local89 = this.anInt2694 <= 2 ? this.anInt2694 : 2;
		@Pc(96) int local96 = local11 <= 2 ? local11 : 2;
		if (this.aBoolean198 != local7) {
			this.aBoolean198 = local7;
			this.aBoolean200 = true;
		}
		if (local89 != local96) {
			this.aBoolean202 = this.aBoolean199 = true;
		}
		this.anInt2694 = local11;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!uk;B)Z")
	public boolean method2474(@OriginalArg(0) Class4_Sub46 arg0) {
		if (this.aClass51_1 != null) {
			if (arg0.method7554() || arg0.method7557()) {
				this.aClass244_21.method5960(arg0);
				this.method2473();
				if (this.method2475()) {
					if (this.anInt2679 != -1 && this.anInt2686 != -1) {
						arg0.method7558(this.anInt2686, this.anInt2679);
					}
					arg0.aBoolean646 = true;
					return true;
				}
			}
			this.method2476(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)Z")
	private boolean method2475() {
		if (this.aBoolean200) {
			if (this.aClass4_Sub5_Sub13_1 != null) {
				this.aClass4_Sub5_Sub13_1.method5875();
				this.aClass4_Sub5_Sub13_1 = null;
			}
			if (this.aClass77_Sub1_1 != null) {
				this.aClass77_Sub1_1.method7069();
				this.aClass77_Sub1_1 = null;
			}
			if (this.aClass51_3 != null) {
				this.aClass4_Sub5_Sub13_1 = new Class4_Sub5_Sub13(this.aClass44_Sub3_12, 6402, this.anInt2679, this.anInt2686, this.aClass44_Sub3_12.anInt5468);
			}
			if (this.aBoolean198) {
				this.aClass77_Sub1_1 = new Class77_Sub1(this.aClass44_Sub3_12, 34037, 6402, this.anInt2679, this.anInt2686);
			} else if (this.aClass4_Sub5_Sub13_1 == null) {
				this.aClass4_Sub5_Sub13_1 = new Class4_Sub5_Sub13(this.aClass44_Sub3_12, 6402, this.anInt2679, this.anInt2686);
			}
			this.aBoolean201 = true;
			this.aBoolean202 = true;
			this.aBoolean200 = false;
		}
		if (this.aBoolean199) {
			if (this.aClass4_Sub5_Sub13_2 != null) {
				this.aClass4_Sub5_Sub13_2.method5875();
				this.aClass4_Sub5_Sub13_2 = null;
			}
			if (this.aClass77_Sub1Array1[0] != null) {
				this.aClass77_Sub1Array1[0].method7069();
				this.aClass77_Sub1Array1[0] = null;
			}
			if (this.aClass77_Sub1Array1[1] != null) {
				this.aClass77_Sub1Array1[1].method7069();
				this.aClass77_Sub1Array1[1] = null;
			}
			if (this.aClass51_3 != null) {
				this.aClass4_Sub5_Sub13_2 = new Class4_Sub5_Sub13(this.aClass44_Sub3_12, this.anInt2695, this.anInt2679, this.anInt2686, this.aClass44_Sub3_12.anInt5468);
			}
			this.aClass77_Sub1Array1[0] = new Class77_Sub1(this.aClass44_Sub3_12, 34037, this.anInt2695, this.anInt2679, this.anInt2686);
			this.aClass77_Sub1Array1[1] = this.anInt2694 > 1 ? new Class77_Sub1(this.aClass44_Sub3_12, 34037, this.anInt2695, this.anInt2679, this.anInt2686) : null;
			this.aBoolean199 = false;
			this.aBoolean202 = true;
			this.aBoolean201 = true;
		}
		if (this.aBoolean202) {
			if (this.aClass51_3 == null) {
				this.aClass44_Sub3_12.method4626(this.aClass51_2);
				this.aClass51_2.method1100(0);
				this.aClass51_2.method1100(1);
				this.aClass51_2.method1100(8);
				this.aClass51_2.method1093(this.aClass77_Sub1Array1[0], 0);
				if (this.anInt2694 > 1) {
					this.aClass51_2.method1093(this.aClass77_Sub1Array1[1], 1);
				}
				if (this.aBoolean198) {
					this.aClass51_2.method1093(this.aClass77_Sub1_1, 8);
				} else {
					this.aClass51_2.method1096(this.aClass4_Sub5_Sub13_1, 8);
				}
				this.aClass44_Sub3_12.method4627(this.aClass51_2);
			} else {
				this.aClass44_Sub3_12.method4626(this.aClass51_2);
				this.aClass51_2.method1100(0);
				this.aClass51_2.method1100(1);
				this.aClass51_2.method1100(8);
				this.aClass51_2.method1093(this.aClass77_Sub1Array1[0], 0);
				if (this.anInt2694 > 1) {
					this.aClass51_2.method1093(this.aClass77_Sub1Array1[1], 1);
				}
				if (this.aBoolean198) {
					this.aClass51_2.method1093(this.aClass77_Sub1_1, 8);
				}
				this.aClass44_Sub3_12.method4627(this.aClass51_2);
				this.aClass44_Sub3_12.method4626(this.aClass51_3);
				this.aClass51_3.method1100(0);
				this.aClass51_3.method1100(8);
				this.aClass51_3.method1096(this.aClass4_Sub5_Sub13_2, 0);
				this.aClass51_3.method1096(this.aClass4_Sub5_Sub13_1, 8);
				this.aClass44_Sub3_12.method4627(this.aClass51_3);
			}
			this.aBoolean202 = false;
			this.aBoolean201 = true;
		}
		if (this.aBoolean201) {
			this.aClass44_Sub3_12.method4626(this.aClass51_1);
			this.aBoolean201 = !this.aClass51_1.method1102();
			this.aClass44_Sub3_12.method4627(this.aClass51_1);
		}
		return !this.aBoolean201;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILclient!uk;)V")
	public void method2476(@OriginalArg(1) Class4_Sub46 arg0) {
		arg0.aBoolean646 = false;
		arg0.method7560();
		arg0.method8379();
		this.method2473();
	}
}
