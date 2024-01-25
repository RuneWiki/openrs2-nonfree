import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!me")
public final class Class157 {

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Z")
	private boolean aBoolean336;

	@OriginalMember(owner = "client!me", name = "w", descriptor = "Lclient!ec;")
	private Class1_Sub1_Sub7 aClass1_Sub1_Sub7_1;

	@OriginalMember(owner = "client!me", name = "y", descriptor = "Lclient!ec;")
	private Class1_Sub1_Sub7 aClass1_Sub1_Sub7_2;

	@OriginalMember(owner = "client!me", name = "B", descriptor = "Lclient!jp;")
	private Class21_Sub2 aClass21_Sub2_2;

	@OriginalMember(owner = "client!me", name = "f", descriptor = "I")
	private int anInt4255 = 1;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "I")
	private int anInt4262 = 0;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "I")
	private int anInt4254 = 0;

	@OriginalMember(owner = "client!me", name = "l", descriptor = "I")
	private int anInt4260 = 1;

	@OriginalMember(owner = "client!me", name = "s", descriptor = "Lclient!ko;")
	private final Class142 aClass142_25 = new Class142();

	@OriginalMember(owner = "client!me", name = "x", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!me", name = "z", descriptor = "I")
	private int anInt4266 = -1;

	@OriginalMember(owner = "client!me", name = "v", descriptor = "[Lclient!jp;")
	private Class21_Sub2[] aClass21_Sub2Array1 = new Class21_Sub2[2];

	@OriginalMember(owner = "client!me", name = "D", descriptor = "Z")
	private boolean aBoolean340 = false;

	@OriginalMember(owner = "client!me", name = "C", descriptor = "Z")
	private boolean aBoolean339 = true;

	@OriginalMember(owner = "client!me", name = "A", descriptor = "Z")
	private boolean aBoolean338 = true;

	@OriginalMember(owner = "client!me", name = "u", descriptor = "I")
	private int anInt4265 = 0;

	@OriginalMember(owner = "client!me", name = "E", descriptor = "Z")
	private boolean aBoolean341 = true;

	@OriginalMember(owner = "client!me", name = "e", descriptor = "Lclient!qg;")
	private final Class121_Sub2 aClass121_Sub2_22;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "Lclient!bb;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!me", name = "n", descriptor = "Lclient!bb;")
	private Class19 aClass19_3;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!bb;")
	private Class19 aClass19_2;

	@OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lclient!qg;)V")
	public Class157(@OriginalArg(0) Class121_Sub2 arg0) {
		this.aClass121_Sub2_22 = arg0;
		if (this.aClass121_Sub2_22.aBoolean466 && this.aClass121_Sub2_22.aBoolean484) {
			this.aClass19_3 = this.aClass19_1 = new Class19(this.aClass121_Sub2_22);
			if (this.aClass121_Sub2_22.anInt5931 > 1 && this.aClass121_Sub2_22.aBoolean472 && this.aClass121_Sub2_22.aBoolean470) {
				this.aClass19_3 = this.aClass19_2 = new Class19(this.aClass121_Sub2_22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)Z")
	public boolean method3533() {
		return this.aClass19_3 != null;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	private void method3534() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub42 local17 = (Class1_Sub42) this.aClass142_25.method3199(); local17 != null; local17 = (Class1_Sub42) this.aClass142_25.method3198()) {
			local23 = local17.method5572();
			local11 += local17.method5578();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method5577();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt4266) {
			this.aBoolean341 = true;
			this.anInt4266 = local23;
		}
		@Pc(95) int local95 = this.anInt4265 <= 2 ? this.anInt4265 : 2;
		@Pc(104) int local104 = local11 > 2 ? 2 : local11;
		if (this.aBoolean340 != local7) {
			this.aBoolean340 = local7;
			this.aBoolean338 = true;
		}
		if (local95 != local104) {
			this.aBoolean337 = this.aBoolean341 = true;
		}
		this.anInt4265 = local11;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BLclient!vl;)Z")
	public boolean method3535(@OriginalArg(1) Class1_Sub42 arg0) {
		if (this.aClass19_3 != null) {
			if (arg0.method5576() || arg0.method5574()) {
				this.aClass142_25.method3212(arg0);
				this.method3534();
				if (this.method3539()) {
					if (this.anInt4260 != -1 && this.anInt4255 != -1) {
						arg0.method5570(this.anInt4260, this.anInt4255);
					}
					arg0.aBoolean601 = true;
					return true;
				}
			}
			this.method3538(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V")
	public void method3536() {
		if (!this.aBoolean336) {
			return;
		}
		if (this.aClass19_2 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass121_Sub2_22.method4698(this.aClass19_2);
			this.aClass121_Sub2_22.method4701(this.aClass19_1);
			this.aClass19_2.method314();
			this.aClass19_1.method310(0);
			if (this.aBoolean340) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4260, this.anInt4255, 0, 0, this.anInt4260, this.anInt4255, local14, 9728);
			this.aClass121_Sub2_22.method4695(this.aClass19_2);
			this.aClass121_Sub2_22.method4722(this.aClass19_1);
		}
		this.aClass121_Sub2_22.method4674();
		this.aClass121_Sub2_22.method4700(0);
		this.aClass121_Sub2_22.method4707(1);
		this.aClass121_Sub2_22.va();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(107) Class1_Sub42 local107;
		for (@Pc(99) Class1_Sub42 local99 = (Class1_Sub42) this.aClass142_25.method3199(); local99 != null; local99 = local107) {
			local107 = (Class1_Sub42) this.aClass142_25.method3198();
			@Pc(111) int local111 = local99.method5578();
			for (@Pc(113) int local113 = 0; local113 < local111; local113++) {
				local99.method5575(this.aClass21_Sub2_2, local113, this.aClass21_Sub2Array1[local91]);
				if (local107 == null && local111 - 1 == local113) {
					this.aClass121_Sub2_22.method4699(this.aClass19_1);
					this.aClass121_Sub2_22.method4706(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4255);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4262, this.anInt4254);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4262, this.anInt4255 + this.anInt4254);
					OpenGL.glTexCoord2f((float) this.anInt4260, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4262 + this.anInt4260, this.anInt4255 + this.anInt4254);
					OpenGL.glTexCoord2f((float) this.anInt4260, (float) this.anInt4255);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4262 + this.anInt4260, this.anInt4254);
					OpenGL.glEnd();
				} else {
					this.aClass19_1.method310(--local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4255);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4255);
					OpenGL.glTexCoord2f((float) this.anInt4260, (float) this.anInt4255);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4260, this.anInt4255);
					OpenGL.glTexCoord2f((float) this.anInt4260, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4260, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local93 = local93 + 1 & 0x1;
				local99.method5571(local113);
			}
		}
		this.aBoolean336 = false;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
	public void method3537() {
		this.aClass21_Sub2Array1 = null;
		this.aClass19_3 = this.aClass19_2 = this.aClass19_1 = null;
		this.aClass1_Sub1_Sub7_1 = null;
		this.aClass1_Sub1_Sub7_2 = null;
		this.aClass21_Sub2_2 = null;
		if (!this.aClass142_25.method3210()) {
			for (@Pc(41) Class1 local41 = this.aClass142_25.method3199(); local41 != this.aClass142_25.aClass1_143; local41 = local41.aClass1_262) {
				((Class1_Sub42) local41).method5579();
			}
		}
		this.anInt4260 = this.anInt4255 = 1;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!vl;)V")
	public void method3538(@OriginalArg(1) Class1_Sub42 arg0) {
		arg0.aBoolean601 = false;
		arg0.method5579();
		arg0.method5965();
		this.method3534();
	}

	@OriginalMember(owner = "client!me", name = "c", descriptor = "(B)Z")
	private boolean method3539() {
		if (this.aBoolean338) {
			if (this.aClass1_Sub1_Sub7_2 != null) {
				this.aClass1_Sub1_Sub7_2.method1206();
				this.aClass1_Sub1_Sub7_2 = null;
			}
			if (this.aClass21_Sub2_2 != null) {
				this.aClass21_Sub2_2.method3752();
				this.aClass21_Sub2_2 = null;
			}
			if (this.aClass19_2 != null) {
				this.aClass1_Sub1_Sub7_2 = new Class1_Sub1_Sub7(this.aClass121_Sub2_22, 6402, this.anInt4260, this.anInt4255, this.aClass121_Sub2_22.anInt5931);
			}
			if (this.aBoolean340) {
				this.aClass21_Sub2_2 = new Class21_Sub2(this.aClass121_Sub2_22, 34037, 6402, this.anInt4260, this.anInt4255);
			} else if (this.aClass1_Sub1_Sub7_2 == null) {
				this.aClass1_Sub1_Sub7_2 = new Class1_Sub1_Sub7(this.aClass121_Sub2_22, 6402, this.anInt4260, this.anInt4255);
			}
			this.aBoolean338 = false;
			this.aBoolean339 = true;
			this.aBoolean337 = true;
		}
		if (this.aBoolean341) {
			if (this.aClass1_Sub1_Sub7_1 != null) {
				this.aClass1_Sub1_Sub7_1.method1206();
				this.aClass1_Sub1_Sub7_1 = null;
			}
			if (this.aClass21_Sub2Array1[0] != null) {
				this.aClass21_Sub2Array1[0].method3752();
				this.aClass21_Sub2Array1[0] = null;
			}
			if (this.aClass21_Sub2Array1[1] != null) {
				this.aClass21_Sub2Array1[1].method3752();
				this.aClass21_Sub2Array1[1] = null;
			}
			if (this.aClass19_2 != null) {
				this.aClass1_Sub1_Sub7_1 = new Class1_Sub1_Sub7(this.aClass121_Sub2_22, this.anInt4266, this.anInt4260, this.anInt4255, this.aClass121_Sub2_22.anInt5931);
			}
			this.aClass21_Sub2Array1[0] = new Class21_Sub2(this.aClass121_Sub2_22, 34037, this.anInt4266, this.anInt4260, this.anInt4255);
			this.aClass21_Sub2Array1[1] = this.anInt4265 <= 1 ? null : new Class21_Sub2(this.aClass121_Sub2_22, 34037, this.anInt4266, this.anInt4260, this.anInt4255);
			this.aBoolean339 = true;
			this.aBoolean337 = true;
			this.aBoolean341 = false;
		}
		if (this.aBoolean337) {
			if (this.aClass19_2 == null) {
				this.aClass121_Sub2_22.method4675(this.aClass19_1);
				this.aClass19_1.method321(0);
				this.aClass19_1.method321(1);
				this.aClass19_1.method321(8);
				this.aClass19_1.method324(this.aClass21_Sub2Array1[0], 0);
				if (this.anInt4265 > 1) {
					this.aClass19_1.method324(this.aClass21_Sub2Array1[1], 1);
				}
				if (this.aBoolean340) {
					this.aClass19_1.method324(this.aClass21_Sub2_2, 8);
				} else {
					this.aClass19_1.method315(this.aClass1_Sub1_Sub7_2, 8);
				}
				this.aClass121_Sub2_22.method4699(this.aClass19_1);
			} else {
				this.aClass121_Sub2_22.method4675(this.aClass19_1);
				this.aClass19_1.method321(0);
				this.aClass19_1.method321(1);
				this.aClass19_1.method321(8);
				this.aClass19_1.method324(this.aClass21_Sub2Array1[0], 0);
				if (this.anInt4265 > 1) {
					this.aClass19_1.method324(this.aClass21_Sub2Array1[1], 1);
				}
				if (this.aBoolean340) {
					this.aClass19_1.method324(this.aClass21_Sub2_2, 8);
				}
				this.aClass121_Sub2_22.method4699(this.aClass19_1);
				this.aClass121_Sub2_22.method4675(this.aClass19_2);
				this.aClass19_2.method321(0);
				this.aClass19_2.method321(8);
				this.aClass19_2.method315(this.aClass1_Sub1_Sub7_1, 0);
				this.aClass19_2.method315(this.aClass1_Sub1_Sub7_2, 8);
				this.aClass121_Sub2_22.method4699(this.aClass19_2);
			}
			this.aBoolean337 = false;
			this.aBoolean339 = true;
		}
		if (this.aBoolean339) {
			this.aClass121_Sub2_22.method4675(this.aClass19_3);
			this.aBoolean339 = !this.aClass19_3.method320();
			this.aClass121_Sub2_22.method4699(this.aClass19_3);
		}
		return !this.aBoolean339;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)Z")
	public boolean method3540(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass19_3 == null || this.aClass142_25.method3210()) {
			return false;
		}
		if (this.anInt4260 != arg2 || this.anInt4255 != arg3) {
			this.anInt4260 = arg2;
			this.anInt4255 = arg3;
			for (@Pc(38) Class1 local38 = this.aClass142_25.method3199(); local38 != this.aClass142_25.aClass1_143; local38 = local38.aClass1_262) {
				((Class1_Sub42) local38).method5570(this.anInt4260, this.anInt4255);
			}
			this.aBoolean341 = true;
			this.aBoolean337 = true;
			this.aBoolean338 = true;
		}
		if (!this.method3539()) {
			return false;
		}
		this.anInt4254 = arg1;
		this.anInt4262 = arg0;
		this.aBoolean336 = true;
		this.aClass121_Sub2_22.method4675(this.aClass19_3);
		this.aClass19_3.method310(0);
		this.aClass121_Sub2_22.method4706(this.anInt4255 - this.aClass19_3.method316() - this.anInt4254, -this.anInt4262);
		return true;
	}
}
