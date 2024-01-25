import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dk")
public final class Class79 {

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "Z")
	private boolean aBoolean175;

	@OriginalMember(owner = "client!dk", name = "I", descriptor = "Lclient!pm;")
	private Class23_Sub1 aClass23_Sub1_3;

	@OriginalMember(owner = "client!dk", name = "N", descriptor = "Lclient!pca;")
	private Class2_Sub3_Sub12 aClass2_Sub3_Sub12_1;

	@OriginalMember(owner = "client!dk", name = "Q", descriptor = "Lclient!pca;")
	private Class2_Sub3_Sub12 aClass2_Sub3_Sub12_2;

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "I")
	private int anInt2008 = 0;

	@OriginalMember(owner = "client!dk", name = "v", descriptor = "I")
	private int anInt2020 = 0;

	@OriginalMember(owner = "client!dk", name = "n", descriptor = "I")
	private int anInt2016 = 1;

	@OriginalMember(owner = "client!dk", name = "z", descriptor = "I")
	private int anInt2024 = 1;

	@OriginalMember(owner = "client!dk", name = "t", descriptor = "Lclient!ae;")
	private final Class8 aClass8_11 = new Class8();

	@OriginalMember(owner = "client!dk", name = "E", descriptor = "I")
	private int anInt2026 = 0;

	@OriginalMember(owner = "client!dk", name = "F", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!dk", name = "H", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!dk", name = "J", descriptor = "[Lclient!pm;")
	private Class23_Sub1[] aClass23_Sub1Array2 = new Class23_Sub1[2];

	@OriginalMember(owner = "client!dk", name = "M", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!dk", name = "D", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!dk", name = "L", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!dk", name = "O", descriptor = "I")
	private int anInt2027 = -1;

	@OriginalMember(owner = "client!dk", name = "d", descriptor = "Lclient!qj;")
	private final Class100_Sub3 aClass100_Sub3_14;

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "Lclient!qk;")
	private Class271 aClass271_3;

	@OriginalMember(owner = "client!dk", name = "u", descriptor = "Lclient!qk;")
	private Class271 aClass271_5;

	@OriginalMember(owner = "client!dk", name = "g", descriptor = "Lclient!qk;")
	private Class271 aClass271_4;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lclient!qj;)V")
	public Class79(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_14 = arg0;
		if (this.aClass100_Sub3_14.aBoolean600 && this.aClass100_Sub3_14.aBoolean586) {
			this.aClass271_5 = this.aClass271_3 = new Class271(this.aClass100_Sub3_14);
			if (this.aClass100_Sub3_14.anInt7641 > 1 && this.aClass100_Sub3_14.aBoolean587 && this.aClass100_Sub3_14.aBoolean606) {
				this.aClass271_5 = this.aClass271_4 = new Class271(this.aClass100_Sub3_14);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V")
	public void method1469() {
		this.aClass23_Sub1Array2 = null;
		this.aClass23_Sub1_3 = null;
		this.aClass2_Sub3_Sub12_1 = null;
		this.aClass2_Sub3_Sub12_2 = null;
		this.aClass271_5 = this.aClass271_4 = this.aClass271_3 = null;
		if (!this.aClass8_11.method219()) {
			for (@Pc(36) Class2 local36 = this.aClass8_11.method210(); local36 != this.aClass8_11.aClass2_9; local36 = local36.aClass2_286) {
				((Class2_Sub4) local36).method614();
			}
		}
		this.anInt2016 = this.anInt2024 = 1;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILclient!qh;)Z")
	public boolean method1470(@OriginalArg(1) Class2_Sub4 arg0) {
		if (this.aClass271_5 != null) {
			if (arg0.method622() || arg0.method618()) {
				this.aClass8_11.method212(arg0);
				this.method1475();
				if (this.method1478()) {
					if (this.anInt2016 != -1 && this.anInt2024 != -1) {
						arg0.method617(this.anInt2016, this.anInt2024);
					}
					arg0.aBoolean59 = true;
					return true;
				}
			}
			this.method1471(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(BLclient!qh;)V")
	public void method1471(@OriginalArg(1) Class2_Sub4 arg0) {
		arg0.aBoolean59 = false;
		arg0.method614();
		arg0.method7966();
		this.method1475();
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
	private void method1475() {
		@Pc(7) boolean local7 = false;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(29) int local29;
		for (@Pc(21) Class2_Sub4 local21 = (Class2_Sub4) this.aClass8_11.method210(); local21 != null; local21 = (Class2_Sub4) this.aClass8_11.method218()) {
			local29 = local21.method612();
			local15 += local21.method613();
			if (local29 > local13) {
				local13 = local29;
			}
			local7 |= local21.method616();
		}
		if (local13 == 2) {
			local29 = 34836;
		} else if (local13 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (this.anInt2027 != local29) {
			this.aBoolean178 = true;
			this.anInt2027 = local29;
		}
		@Pc(89) int local89 = this.anInt2026 > 2 ? 2 : this.anInt2026;
		@Pc(98) int local98 = local15 <= 2 ? local15 : 2;
		this.anInt2026 = local15;
		if (local89 != local98) {
			this.aBoolean177 = this.aBoolean178 = true;
		}
		if (this.aBoolean179 != local7) {
			this.aBoolean179 = local7;
			this.aBoolean180 = true;
		}
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)V")
	public void method1476() {
		if (!this.aBoolean175) {
			return;
		}
		if (this.aClass271_4 != null) {
			this.aClass100_Sub3_14.method6303(this.aClass271_4);
			@Pc(20) short local20 = 16384;
			this.aClass100_Sub3_14.method6269(this.aClass271_3);
			this.aClass271_4.method6359();
			this.aClass271_3.method6356(0);
			if (this.aBoolean179) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt2016, this.anInt2024, 0, 0, this.anInt2016, this.anInt2024, local20, 9728);
			this.aClass100_Sub3_14.method6338(this.aClass271_4);
			this.aClass100_Sub3_14.method6268(this.aClass271_3);
		}
		this.aClass100_Sub3_14.method6339();
		this.aClass100_Sub3_14.method6334(0);
		this.aClass100_Sub3_14.method6322(1);
		this.aClass100_Sub3_14.JA();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 1;
		@Pc(112) Class2_Sub4 local112;
		for (@Pc(104) Class2_Sub4 local104 = (Class2_Sub4) this.aClass8_11.method210(); local104 != null; local104 = local112) {
			local112 = (Class2_Sub4) this.aClass8_11.method218();
			@Pc(116) int local116 = local104.method613();
			for (@Pc(118) int local118 = 0; local118 < local116; local118++) {
				local104.method611(this.aClass23_Sub1Array2[local96], local118, this.aClass23_Sub1_3);
				if (local112 == null && local116 - 1 == local118) {
					this.aClass100_Sub3_14.method6298(this.aClass271_3);
					this.aClass100_Sub3_14.method6318(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2024);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2020, this.anInt2008);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2020, this.anInt2008 + this.anInt2024);
					OpenGL.glTexCoord2f((float) this.anInt2016, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2020 + this.anInt2016, this.anInt2024 + this.anInt2008);
					OpenGL.glTexCoord2f((float) this.anInt2016, (float) this.anInt2024);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2016 + this.anInt2020, this.anInt2008);
					OpenGL.glEnd();
				} else {
					this.aClass271_3.method6356(local98);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt2024);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt2024);
					OpenGL.glTexCoord2f((float) this.anInt2016, (float) this.anInt2024);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt2016, this.anInt2024);
					OpenGL.glTexCoord2f((float) this.anInt2016, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt2016, 0);
					OpenGL.glEnd();
				}
				local96 = local96 + 1 & 0x1;
				local104.method621(local118);
				local98 = local98 + 1 & 0x1;
			}
		}
		this.aBoolean175 = false;
	}

	@OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIIII)Z")
	public boolean method1477(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass271_5 == null || this.aClass8_11.method219()) {
			return false;
		}
		if (this.anInt2016 != arg2 || this.anInt2024 != arg1) {
			this.anInt2016 = arg2;
			this.anInt2024 = arg1;
			for (@Pc(46) Class2 local46 = this.aClass8_11.method210(); local46 != this.aClass8_11.aClass2_9; local46 = local46.aClass2_286) {
				((Class2_Sub4) local46).method617(this.anInt2016, this.anInt2024);
			}
			this.aBoolean180 = true;
			this.aBoolean177 = true;
			this.aBoolean178 = true;
		}
		if (!this.method1478()) {
			return false;
		}
		this.anInt2008 = arg0;
		this.anInt2020 = arg3;
		this.aBoolean175 = true;
		this.aClass100_Sub3_14.method6343(this.aClass271_5);
		this.aClass271_5.method6356(0);
		this.aClass100_Sub3_14.method6318(this.anInt2008 + this.anInt2024 - this.aClass100_Sub3_14.anInt7521, -this.anInt2020);
		return true;
	}

	@OriginalMember(owner = "client!dk", name = "b", descriptor = "(I)Z")
	private boolean method1478() {
		if (this.aBoolean180) {
			if (this.aClass2_Sub3_Sub12_2 != null) {
				this.aClass2_Sub3_Sub12_2.method5833();
				this.aClass2_Sub3_Sub12_2 = null;
			}
			if (this.aClass23_Sub1_3 != null) {
				this.aClass23_Sub1_3.method7779();
				this.aClass23_Sub1_3 = null;
			}
			if (this.aClass271_4 != null) {
				this.aClass2_Sub3_Sub12_2 = new Class2_Sub3_Sub12(this.aClass100_Sub3_14, 6402, this.anInt2016, this.anInt2024, this.aClass100_Sub3_14.anInt7641);
			}
			if (this.aBoolean179) {
				this.aClass23_Sub1_3 = new Class23_Sub1(this.aClass100_Sub3_14, 34037, 6402, this.anInt2016, this.anInt2024);
			} else if (this.aClass2_Sub3_Sub12_2 == null) {
				this.aClass2_Sub3_Sub12_2 = new Class2_Sub3_Sub12(this.aClass100_Sub3_14, 6402, this.anInt2016, this.anInt2024);
			}
			this.aBoolean180 = false;
			this.aBoolean176 = true;
			this.aBoolean177 = true;
		}
		if (this.aBoolean178) {
			if (this.aClass2_Sub3_Sub12_1 != null) {
				this.aClass2_Sub3_Sub12_1.method5833();
				this.aClass2_Sub3_Sub12_1 = null;
			}
			if (this.aClass23_Sub1Array2[0] != null) {
				this.aClass23_Sub1Array2[0].method7779();
				this.aClass23_Sub1Array2[0] = null;
			}
			if (this.aClass23_Sub1Array2[1] != null) {
				this.aClass23_Sub1Array2[1].method7779();
				this.aClass23_Sub1Array2[1] = null;
			}
			if (this.aClass271_4 != null) {
				this.aClass2_Sub3_Sub12_1 = new Class2_Sub3_Sub12(this.aClass100_Sub3_14, this.anInt2027, this.anInt2016, this.anInt2024, this.aClass100_Sub3_14.anInt7641);
			}
			this.aClass23_Sub1Array2[0] = new Class23_Sub1(this.aClass100_Sub3_14, 34037, this.anInt2027, this.anInt2016, this.anInt2024);
			this.aClass23_Sub1Array2[1] = this.anInt2026 <= 1 ? null : new Class23_Sub1(this.aClass100_Sub3_14, 34037, this.anInt2027, this.anInt2016, this.anInt2024);
			this.aBoolean176 = true;
			this.aBoolean177 = true;
			this.aBoolean178 = false;
		}
		if (this.aBoolean177) {
			if (this.aClass271_4 == null) {
				this.aClass100_Sub3_14.method6343(this.aClass271_3);
				this.aClass271_3.method6352(0);
				this.aClass271_3.method6352(1);
				this.aClass271_3.method6352(8);
				this.aClass271_3.method6361(this.aClass23_Sub1Array2[0], 0);
				if (this.anInt2026 > 1) {
					this.aClass271_3.method6361(this.aClass23_Sub1Array2[1], 1);
				}
				if (this.aBoolean179) {
					this.aClass271_3.method6361(this.aClass23_Sub1_3, 8);
				} else {
					this.aClass271_3.method6358(8, this.aClass2_Sub3_Sub12_2);
				}
				this.aClass100_Sub3_14.method6298(this.aClass271_3);
			} else {
				this.aClass100_Sub3_14.method6343(this.aClass271_3);
				this.aClass271_3.method6352(0);
				this.aClass271_3.method6352(1);
				this.aClass271_3.method6352(8);
				this.aClass271_3.method6361(this.aClass23_Sub1Array2[0], 0);
				if (this.anInt2026 > 1) {
					this.aClass271_3.method6361(this.aClass23_Sub1Array2[1], 1);
				}
				if (this.aBoolean179) {
					this.aClass271_3.method6361(this.aClass23_Sub1_3, 8);
				}
				this.aClass100_Sub3_14.method6298(this.aClass271_3);
				this.aClass100_Sub3_14.method6343(this.aClass271_4);
				this.aClass271_4.method6352(0);
				this.aClass271_4.method6352(8);
				this.aClass271_4.method6358(0, this.aClass2_Sub3_Sub12_1);
				this.aClass271_4.method6358(8, this.aClass2_Sub3_Sub12_2);
				this.aClass100_Sub3_14.method6298(this.aClass271_4);
			}
			this.aBoolean176 = true;
			this.aBoolean177 = false;
		}
		if (this.aBoolean176) {
			this.aClass100_Sub3_14.method6343(this.aClass271_5);
			this.aBoolean176 = !this.aClass271_5.method6357();
			this.aClass100_Sub3_14.method6298(this.aClass271_5);
		}
		return !this.aBoolean176;
	}

	@OriginalMember(owner = "client!dk", name = "c", descriptor = "(I)Z")
	public boolean method1479() {
		return this.aClass271_5 != null;
	}
}
