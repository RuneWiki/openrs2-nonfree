import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fw")
public final class Class112 {

	@OriginalMember(owner = "client!fw", name = "m", descriptor = "Z")
	private boolean aBoolean269;

	@OriginalMember(owner = "client!fw", name = "u", descriptor = "Lclient!kq;")
	private Class3_Sub11_Sub12 aClass3_Sub11_Sub12_1;

	@OriginalMember(owner = "client!fw", name = "y", descriptor = "Lclient!kq;")
	private Class3_Sub11_Sub12 aClass3_Sub11_Sub12_2;

	@OriginalMember(owner = "client!fw", name = "C", descriptor = "Lclient!tca;")
	private Class85_Sub3 aClass85_Sub3_4;

	@OriginalMember(owner = "client!fw", name = "f", descriptor = "I")
	private int anInt3528 = 1;

	@OriginalMember(owner = "client!fw", name = "i", descriptor = "I")
	private int anInt3531 = 0;

	@OriginalMember(owner = "client!fw", name = "l", descriptor = "I")
	private int anInt3533 = 1;

	@OriginalMember(owner = "client!fw", name = "r", descriptor = "I")
	private int anInt3536 = 0;

	@OriginalMember(owner = "client!fw", name = "n", descriptor = "Lclient!tm;")
	private final Class338 aClass338_93 = new Class338();

	@OriginalMember(owner = "client!fw", name = "w", descriptor = "Z")
	private boolean aBoolean270 = true;

	@OriginalMember(owner = "client!fw", name = "x", descriptor = "Z")
	private boolean aBoolean271 = true;

	@OriginalMember(owner = "client!fw", name = "A", descriptor = "Z")
	private boolean aBoolean272 = false;

	@OriginalMember(owner = "client!fw", name = "v", descriptor = "I")
	private int anInt3538 = -1;

	@OriginalMember(owner = "client!fw", name = "z", descriptor = "I")
	private int anInt3539 = 0;

	@OriginalMember(owner = "client!fw", name = "D", descriptor = "Z")
	private boolean aBoolean273 = true;

	@OriginalMember(owner = "client!fw", name = "E", descriptor = "[Lclient!tca;")
	private Class85_Sub3[] aClass85_Sub3Array2 = new Class85_Sub3[2];

	@OriginalMember(owner = "client!fw", name = "F", descriptor = "Z")
	private boolean aBoolean274 = true;

	@OriginalMember(owner = "client!fw", name = "e", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_12;

	@OriginalMember(owner = "client!fw", name = "t", descriptor = "Lclient!mj;")
	private Class221 aClass221_7;

	@OriginalMember(owner = "client!fw", name = "j", descriptor = "Lclient!mj;")
	private Class221 aClass221_5;

	@OriginalMember(owner = "client!fw", name = "o", descriptor = "Lclient!mj;")
	private Class221 aClass221_6;

	@OriginalMember(owner = "client!fw", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class112(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_12 = arg0;
		if (this.aClass13_Sub2_12.aBoolean172 && this.aClass13_Sub2_12.aBoolean176) {
			this.aClass221_5 = this.aClass221_7 = new Class221(this.aClass13_Sub2_12);
			if (this.aClass13_Sub2_12.anInt2142 > 1 && this.aClass13_Sub2_12.aBoolean174 && this.aClass13_Sub2_12.aBoolean175) {
				this.aClass221_5 = this.aClass221_6 = new Class221(this.aClass13_Sub2_12);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(Lclient!dda;B)Z")
	public boolean method3214(@OriginalArg(0) Class3_Sub7 arg0) {
		if (this.aClass221_5 != null) {
			if (arg0.method784() || arg0.method776()) {
				this.aClass338_93.method8171(arg0);
				this.method3223();
				if (this.method3218()) {
					if (this.anInt3533 != -1 && this.anInt3528 != -1) {
						arg0.method777(this.anInt3528, this.anInt3533);
					}
					arg0.aBoolean47 = true;
					return true;
				}
			}
			this.method3224(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(I)V")
	public void method3215() {
		this.aClass3_Sub11_Sub12_2 = null;
		this.aClass85_Sub3Array2 = null;
		this.aClass221_5 = this.aClass221_6 = this.aClass221_7 = null;
		this.aClass3_Sub11_Sub12_1 = null;
		this.aClass85_Sub3_4 = null;
		if (!this.aClass338_93.method8166()) {
			for (@Pc(38) Class3 local38 = this.aClass338_93.method8177(); local38 != this.aClass338_93.aClass3_302; local38 = local38.aClass3_337) {
				((Class3_Sub7) local38).method783();
			}
		}
		this.anInt3533 = this.anInt3528 = 1;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIZI)Z")
	public boolean method3216(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass221_5 == null || this.aClass338_93.method8166()) {
			return false;
		}
		if (this.anInt3533 != arg1 || arg3 != this.anInt3528) {
			this.anInt3528 = arg3;
			this.anInt3533 = arg1;
			for (@Pc(46) Class3 local46 = this.aClass338_93.method8177(); local46 != this.aClass338_93.aClass3_302; local46 = local46.aClass3_337) {
				((Class3_Sub7) local46).method777(this.anInt3528, this.anInt3533);
			}
			this.aBoolean273 = true;
			this.aBoolean274 = true;
			this.aBoolean270 = true;
		}
		if (!this.method3218()) {
			return false;
		}
		this.aBoolean269 = true;
		this.anInt3531 = arg0;
		this.anInt3536 = arg2;
		this.aClass13_Sub2_12.method2009(this.aClass221_5);
		this.aClass221_5.method5436(0);
		this.aClass13_Sub2_12.method1978(-this.anInt3531, this.anInt3528 + this.anInt3536 - this.aClass13_Sub2_12.anInt2132);
		return true;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(I)V")
	public void method3217() {
		if (!this.aBoolean269) {
			return;
		}
		if (this.aClass221_6 != null) {
			this.aClass13_Sub2_12.method2026(this.aClass221_6);
			@Pc(20) short local20 = 16384;
			this.aClass13_Sub2_12.method2007(this.aClass221_7);
			this.aClass221_6.method5427();
			this.aClass221_7.method5436(0);
			if (this.aBoolean272) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3533, this.anInt3528, 0, 0, this.anInt3533, this.anInt3528, local20, 9728);
			this.aClass13_Sub2_12.method2025(this.aClass221_6);
			this.aClass13_Sub2_12.method1987(this.aClass221_7);
		}
		this.aClass13_Sub2_12.method1974();
		this.aClass13_Sub2_12.method2019(0);
		this.aClass13_Sub2_12.method1960(1);
		this.aClass13_Sub2_12.la();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(111) Class3_Sub7 local111;
		for (@Pc(103) Class3_Sub7 local103 = (Class3_Sub7) this.aClass338_93.method8177(); local103 != null; local103 = local111) {
			local111 = (Class3_Sub7) this.aClass338_93.method8168();
			@Pc(117) int local117 = local103.method779();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local103.method775(this.aClass85_Sub3_4, local119, this.aClass85_Sub3Array2[local95]);
				if (local111 == null && local119 == local117 - 1) {
					this.aClass13_Sub2_12.method1992(this.aClass221_7);
					this.aClass13_Sub2_12.method1978(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3528);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3531, this.anInt3536);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3531, this.anInt3536 + this.anInt3528);
					OpenGL.glTexCoord2f((float) this.anInt3533, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3531 + this.anInt3533, this.anInt3536 - -this.anInt3528);
					OpenGL.glTexCoord2f((float) this.anInt3533, (float) this.anInt3528);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3531 + this.anInt3533, this.anInt3536);
					OpenGL.glEnd();
				} else {
					this.aClass221_7.method5436(--local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3528);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt3528);
					OpenGL.glTexCoord2f((float) this.anInt3533, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3533, this.anInt3528);
					OpenGL.glTexCoord2f((float) this.anInt3533, (float) this.anInt3528);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3533, 0);
					OpenGL.glEnd();
				}
				local97 = local97 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
				local103.method780(local119);
			}
		}
		this.aBoolean269 = false;
	}

	@OriginalMember(owner = "client!fw", name = "a", descriptor = "(B)Z")
	private boolean method3218() {
		if (this.aBoolean274) {
			if (this.aClass3_Sub11_Sub12_2 != null) {
				this.aClass3_Sub11_Sub12_2.method4917();
				this.aClass3_Sub11_Sub12_2 = null;
			}
			if (this.aClass85_Sub3_4 != null) {
				this.aClass85_Sub3_4.method7870();
				this.aClass85_Sub3_4 = null;
			}
			if (this.aClass221_6 != null) {
				this.aClass3_Sub11_Sub12_2 = new Class3_Sub11_Sub12(this.aClass13_Sub2_12, 6402, this.anInt3533, this.anInt3528, this.aClass13_Sub2_12.anInt2142);
			}
			if (this.aBoolean272) {
				this.aClass85_Sub3_4 = new Class85_Sub3(this.aClass13_Sub2_12, 34037, 6402, this.anInt3533, this.anInt3528);
			} else if (this.aClass3_Sub11_Sub12_2 == null) {
				this.aClass3_Sub11_Sub12_2 = new Class3_Sub11_Sub12(this.aClass13_Sub2_12, 6402, this.anInt3533, this.anInt3528);
			}
			this.aBoolean270 = true;
			this.aBoolean271 = true;
			this.aBoolean274 = false;
		}
		if (this.aBoolean273) {
			if (this.aClass3_Sub11_Sub12_1 != null) {
				this.aClass3_Sub11_Sub12_1.method4917();
				this.aClass3_Sub11_Sub12_1 = null;
			}
			if (this.aClass85_Sub3Array2[0] != null) {
				this.aClass85_Sub3Array2[0].method7870();
				this.aClass85_Sub3Array2[0] = null;
			}
			if (this.aClass85_Sub3Array2[1] != null) {
				this.aClass85_Sub3Array2[1].method7870();
				this.aClass85_Sub3Array2[1] = null;
			}
			if (this.aClass221_6 != null) {
				this.aClass3_Sub11_Sub12_1 = new Class3_Sub11_Sub12(this.aClass13_Sub2_12, this.anInt3538, this.anInt3533, this.anInt3528, this.aClass13_Sub2_12.anInt2142);
			}
			this.aClass85_Sub3Array2[0] = new Class85_Sub3(this.aClass13_Sub2_12, 34037, this.anInt3538, this.anInt3533, this.anInt3528);
			this.aClass85_Sub3Array2[1] = this.anInt3539 > 1 ? new Class85_Sub3(this.aClass13_Sub2_12, 34037, this.anInt3538, this.anInt3533, this.anInt3528) : null;
			this.aBoolean270 = true;
			this.aBoolean273 = false;
			this.aBoolean271 = true;
		}
		if (this.aBoolean270) {
			if (this.aClass221_6 == null) {
				this.aClass13_Sub2_12.method2009(this.aClass221_7);
				this.aClass221_7.method5433(0);
				this.aClass221_7.method5433(1);
				this.aClass221_7.method5433(8);
				this.aClass221_7.method5430(0, this.aClass85_Sub3Array2[0]);
				if (this.anInt3539 > 1) {
					this.aClass221_7.method5430(1, this.aClass85_Sub3Array2[1]);
				}
				if (this.aBoolean272) {
					this.aClass221_7.method5430(8, this.aClass85_Sub3_4);
				} else {
					this.aClass221_7.method5435(this.aClass3_Sub11_Sub12_2, 8);
				}
				this.aClass13_Sub2_12.method1992(this.aClass221_7);
			} else {
				this.aClass13_Sub2_12.method2009(this.aClass221_7);
				this.aClass221_7.method5433(0);
				this.aClass221_7.method5433(1);
				this.aClass221_7.method5433(8);
				this.aClass221_7.method5430(0, this.aClass85_Sub3Array2[0]);
				if (this.anInt3539 > 1) {
					this.aClass221_7.method5430(1, this.aClass85_Sub3Array2[1]);
				}
				if (this.aBoolean272) {
					this.aClass221_7.method5430(8, this.aClass85_Sub3_4);
				}
				this.aClass13_Sub2_12.method1992(this.aClass221_7);
				this.aClass13_Sub2_12.method2009(this.aClass221_6);
				this.aClass221_6.method5433(0);
				this.aClass221_6.method5433(8);
				this.aClass221_6.method5435(this.aClass3_Sub11_Sub12_1, 0);
				this.aClass221_6.method5435(this.aClass3_Sub11_Sub12_2, 8);
				this.aClass13_Sub2_12.method1992(this.aClass221_6);
			}
			this.aBoolean271 = true;
			this.aBoolean270 = false;
		}
		if (this.aBoolean271) {
			this.aClass13_Sub2_12.method2009(this.aClass221_5);
			this.aBoolean271 = !this.aClass221_5.method5428();
			this.aClass13_Sub2_12.method1992(this.aClass221_5);
		}
		return !this.aBoolean271;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(B)Z")
	public boolean method3219() {
		return this.aClass221_5 != null;
	}

	@OriginalMember(owner = "client!fw", name = "d", descriptor = "(I)V")
	private void method3223() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(17) int local17 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class3_Sub7 local23 = (Class3_Sub7) this.aClass338_93.method8177(); local23 != null; local23 = (Class3_Sub7) this.aClass338_93.method8168()) {
			local29 = local23.method778();
			if (local9 < local29) {
				local9 = local29;
			}
			local17 += local23.method779();
			local7 |= local23.method781();
		}
		if (local9 == 2) {
			local29 = 34836;
		} else if (local9 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt3538) {
			this.aBoolean273 = true;
			this.anInt3538 = local29;
		}
		@Pc(101) int local101 = this.anInt3539 > 2 ? 2 : this.anInt3539;
		@Pc(108) int local108 = local17 <= 2 ? local17 : 2;
		if (local101 != local108) {
			this.aBoolean270 = this.aBoolean273 = true;
		}
		if (this.aBoolean272 != local7) {
			this.aBoolean274 = true;
			this.aBoolean272 = local7;
		}
		this.anInt3539 = local17;
	}

	@OriginalMember(owner = "client!fw", name = "b", descriptor = "(Lclient!dda;B)V")
	public void method3224(@OriginalArg(0) Class3_Sub7 arg0) {
		arg0.aBoolean47 = false;
		arg0.method783();
		arg0.method9380();
		this.method3223();
	}
}
