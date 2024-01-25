import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lca")
public final class Class193 {

	@OriginalMember(owner = "client!lca", name = "h", descriptor = "Z")
	private boolean aBoolean420;

	@OriginalMember(owner = "client!lca", name = "y", descriptor = "Lclient!rc;")
	private Class6_Sub4_Sub13 aClass6_Sub4_Sub13_1;

	@OriginalMember(owner = "client!lca", name = "B", descriptor = "Lclient!rc;")
	private Class6_Sub4_Sub13 aClass6_Sub4_Sub13_2;

	@OriginalMember(owner = "client!lca", name = "D", descriptor = "Lclient!kp;")
	private Class132_Sub1 aClass132_Sub1_3;

	@OriginalMember(owner = "client!lca", name = "g", descriptor = "I")
	private int anInt5559 = 1;

	@OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
	private int anInt5564 = 0;

	@OriginalMember(owner = "client!lca", name = "e", descriptor = "I")
	private int anInt5558 = 1;

	@OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
	private int anInt5570 = 0;

	@OriginalMember(owner = "client!lca", name = "m", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_42 = new Class211();

	@OriginalMember(owner = "client!lca", name = "A", descriptor = "Z")
	private boolean aBoolean422 = true;

	@OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
	private int anInt5571 = -1;

	@OriginalMember(owner = "client!lca", name = "C", descriptor = "Z")
	private boolean aBoolean423 = true;

	@OriginalMember(owner = "client!lca", name = "F", descriptor = "Z")
	private boolean aBoolean425 = true;

	@OriginalMember(owner = "client!lca", name = "E", descriptor = "Z")
	private boolean aBoolean424 = true;

	@OriginalMember(owner = "client!lca", name = "G", descriptor = "[Lclient!kp;")
	private Class132_Sub1[] aClass132_Sub1Array1 = new Class132_Sub1[2];

	@OriginalMember(owner = "client!lca", name = "z", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "client!lca", name = "H", descriptor = "I")
	private int anInt5572 = 0;

	@OriginalMember(owner = "client!lca", name = "w", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_19;

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "Lclient!ei;")
	private Class89 aClass89_2;

	@OriginalMember(owner = "client!lca", name = "f", descriptor = "Lclient!ei;")
	private Class89 aClass89_3;

	@OriginalMember(owner = "client!lca", name = "n", descriptor = "Lclient!ei;")
	private Class89 aClass89_4;

	@OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lclient!ap;)V")
	public Class193(@OriginalArg(0) Class9_Sub2 arg0) {
		this.aClass9_Sub2_19 = arg0;
		if (this.aClass9_Sub2_19.aBoolean70 && this.aClass9_Sub2_19.aBoolean60) {
			this.aClass89_3 = this.aClass89_2 = new Class89(this.aClass9_Sub2_19);
			if (this.aClass9_Sub2_19.anInt804 > 1 && this.aClass9_Sub2_19.aBoolean61 && this.aClass9_Sub2_19.aBoolean57) {
				this.aClass89_3 = this.aClass89_4 = new Class89(this.aClass9_Sub2_19);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V")
	public void method4778() {
		this.aClass132_Sub1Array1 = null;
		this.aClass6_Sub4_Sub13_1 = null;
		this.aClass6_Sub4_Sub13_2 = null;
		this.aClass132_Sub1_3 = null;
		this.aClass89_3 = this.aClass89_4 = this.aClass89_2 = null;
		if (!this.aClass211_42.method5170()) {
			for (@Pc(43) Class6 local43 = this.aClass211_42.method5183(); local43 != this.aClass211_42.aClass6_154; local43 = local43.aClass6_283) {
				((Class6_Sub9) local43).method7849();
			}
		}
		this.anInt5558 = this.anInt5559 = 1;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lclient!cba;I)Z")
	public boolean method4779(@OriginalArg(0) Class6_Sub9 arg0) {
		if (this.aClass89_3 != null) {
			if (arg0.method7854() || arg0.method7851()) {
				this.aClass211_42.method5173(arg0);
				this.method4782();
				if (this.method4781()) {
					if (this.anInt5558 != -1 && this.anInt5559 != -1) {
						arg0.method7852(this.anInt5558, this.anInt5559);
					}
					arg0.aBoolean700 = true;
					return true;
				}
			}
			this.method4788(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V")
	public void method4780() {
		if (!this.aBoolean420) {
			return;
		}
		if (this.aClass89_4 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass9_Sub2_19.method768(this.aClass89_4);
			this.aClass9_Sub2_19.method831(this.aClass89_2);
			this.aClass89_4.method2375();
			this.aClass89_2.method2376(0);
			if (this.aBoolean421) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5558, this.anInt5559, 0, 0, this.anInt5558, this.anInt5559, local14, 9728);
			this.aClass9_Sub2_19.method800(this.aClass89_4);
			this.aClass9_Sub2_19.method794(this.aClass89_2);
		}
		this.aClass9_Sub2_19.method817();
		this.aClass9_Sub2_19.method804(0);
		this.aClass9_Sub2_19.method822(1);
		this.aClass9_Sub2_19.F();
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 1;
		@Pc(117) Class6_Sub9 local117;
		for (@Pc(109) Class6_Sub9 local109 = (Class6_Sub9) this.aClass211_42.method5183(); local109 != null; local109 = local117) {
			local117 = (Class6_Sub9) this.aClass211_42.method5177();
			@Pc(121) int local121 = local109.method7847();
			for (@Pc(123) int local123 = 0; local123 < local121; local123++) {
				local109.method7848(this.aClass132_Sub1Array1[local101], local123, this.aClass132_Sub1_3);
				if (local117 == null && local121 - 1 == local123) {
					this.aClass9_Sub2_19.method767(this.aClass89_2);
					this.aClass9_Sub2_19.method815(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5559);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5564, this.anInt5570);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5564, this.anInt5570 + this.anInt5559);
					OpenGL.glTexCoord2f((float) this.anInt5558, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5558 + this.anInt5564, this.anInt5559 + this.anInt5570);
					OpenGL.glTexCoord2f((float) this.anInt5558, (float) this.anInt5559);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5558 + this.anInt5564, this.anInt5570);
					OpenGL.glEnd();
				} else {
					this.aClass89_2.method2376(local103);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5559);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt5559);
					OpenGL.glTexCoord2f((float) this.anInt5558, (float) this.anInt5559);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5558, this.anInt5559);
					OpenGL.glTexCoord2f((float) this.anInt5558, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5558, 0);
					OpenGL.glEnd();
				}
				local101 = local101 + 1 & 0x1;
				local103 = local103 + 1 & 0x1;
				local109.method7845(local123);
			}
		}
		this.aBoolean420 = false;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)Z")
	private boolean method4781() {
		if (this.aBoolean422) {
			if (this.aClass6_Sub4_Sub13_2 != null) {
				this.aClass6_Sub4_Sub13_2.method6647();
				this.aClass6_Sub4_Sub13_2 = null;
			}
			if (this.aClass132_Sub1_3 != null) {
				this.aClass132_Sub1_3.method5609();
				this.aClass132_Sub1_3 = null;
			}
			if (this.aClass89_4 != null) {
				this.aClass6_Sub4_Sub13_2 = new Class6_Sub4_Sub13(this.aClass9_Sub2_19, 6402, this.anInt5558, this.anInt5559, this.aClass9_Sub2_19.anInt804);
			}
			if (this.aBoolean421) {
				this.aClass132_Sub1_3 = new Class132_Sub1(this.aClass9_Sub2_19, 34037, 6402, this.anInt5558, this.anInt5559);
			} else if (this.aClass6_Sub4_Sub13_2 == null) {
				this.aClass6_Sub4_Sub13_2 = new Class6_Sub4_Sub13(this.aClass9_Sub2_19, 6402, this.anInt5558, this.anInt5559);
			}
			this.aBoolean424 = true;
			this.aBoolean422 = false;
			this.aBoolean423 = true;
		}
		if (this.aBoolean425) {
			if (this.aClass6_Sub4_Sub13_1 != null) {
				this.aClass6_Sub4_Sub13_1.method6647();
				this.aClass6_Sub4_Sub13_1 = null;
			}
			if (this.aClass132_Sub1Array1[0] != null) {
				this.aClass132_Sub1Array1[0].method5609();
				this.aClass132_Sub1Array1[0] = null;
			}
			if (this.aClass132_Sub1Array1[1] != null) {
				this.aClass132_Sub1Array1[1].method5609();
				this.aClass132_Sub1Array1[1] = null;
			}
			if (this.aClass89_4 != null) {
				this.aClass6_Sub4_Sub13_1 = new Class6_Sub4_Sub13(this.aClass9_Sub2_19, this.anInt5571, this.anInt5558, this.anInt5559, this.aClass9_Sub2_19.anInt804);
			}
			this.aClass132_Sub1Array1[0] = new Class132_Sub1(this.aClass9_Sub2_19, 34037, this.anInt5571, this.anInt5558, this.anInt5559);
			this.aClass132_Sub1Array1[1] = this.anInt5572 > 1 ? new Class132_Sub1(this.aClass9_Sub2_19, 34037, this.anInt5571, this.anInt5558, this.anInt5559) : null;
			this.aBoolean423 = true;
			this.aBoolean425 = false;
			this.aBoolean424 = true;
		}
		if (this.aBoolean424) {
			if (this.aClass89_4 == null) {
				this.aClass9_Sub2_19.method821(this.aClass89_2);
				this.aClass89_2.method2382(0);
				this.aClass89_2.method2382(1);
				this.aClass89_2.method2382(8);
				this.aClass89_2.method2378(0, this.aClass132_Sub1Array1[0]);
				if (this.anInt5572 > 1) {
					this.aClass89_2.method2378(1, this.aClass132_Sub1Array1[1]);
				}
				if (this.aBoolean421) {
					this.aClass89_2.method2378(8, this.aClass132_Sub1_3);
				} else {
					this.aClass89_2.method2371(this.aClass6_Sub4_Sub13_2, 8);
				}
				this.aClass9_Sub2_19.method767(this.aClass89_2);
			} else {
				this.aClass9_Sub2_19.method821(this.aClass89_2);
				this.aClass89_2.method2382(0);
				this.aClass89_2.method2382(1);
				this.aClass89_2.method2382(8);
				this.aClass89_2.method2378(0, this.aClass132_Sub1Array1[0]);
				if (this.anInt5572 > 1) {
					this.aClass89_2.method2378(1, this.aClass132_Sub1Array1[1]);
				}
				if (this.aBoolean421) {
					this.aClass89_2.method2378(8, this.aClass132_Sub1_3);
				}
				this.aClass9_Sub2_19.method767(this.aClass89_2);
				this.aClass9_Sub2_19.method821(this.aClass89_4);
				this.aClass89_4.method2382(0);
				this.aClass89_4.method2382(8);
				this.aClass89_4.method2371(this.aClass6_Sub4_Sub13_1, 0);
				this.aClass89_4.method2371(this.aClass6_Sub4_Sub13_2, 8);
				this.aClass9_Sub2_19.method767(this.aClass89_4);
			}
			this.aBoolean424 = false;
			this.aBoolean423 = true;
		}
		if (this.aBoolean423) {
			this.aClass9_Sub2_19.method821(this.aClass89_3);
			this.aBoolean423 = !this.aClass89_3.method2370();
			this.aClass9_Sub2_19.method767(this.aClass89_3);
		}
		return !this.aBoolean423;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(B)V")
	private void method4782() {
		@Pc(11) boolean local11 = false;
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		@Pc(27) int local27;
		for (@Pc(21) Class6_Sub9 local21 = (Class6_Sub9) this.aClass211_42.method5183(); local21 != null; local21 = (Class6_Sub9) this.aClass211_42.method5177()) {
			local27 = local21.method7850();
			if (local27 > local13) {
				local13 = local27;
			}
			local15 += local21.method7847();
			local11 |= local21.method7855();
		}
		if (local13 == 2) {
			local27 = 34836;
		} else if (local13 == 1) {
			local27 = 34842;
		} else {
			local27 = 6408;
		}
		if (local27 != this.anInt5571) {
			this.aBoolean425 = true;
			this.anInt5571 = local27;
		}
		@Pc(95) int local95 = this.anInt5572 > 2 ? 2 : this.anInt5572;
		@Pc(104) int local104 = local15 <= 2 ? local15 : 2;
		if (local95 != local104) {
			this.aBoolean424 = this.aBoolean425 = true;
		}
		if (local11 != this.aBoolean421) {
			this.aBoolean421 = local11;
			this.aBoolean422 = true;
		}
		this.anInt5572 = local15;
	}

	@OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)Z")
	public boolean method4783() {
		return this.aClass89_3 != null;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIII)Z")
	public boolean method4787(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass89_3 == null || this.aClass211_42.method5170()) {
			return false;
		}
		if (this.anInt5558 != arg0 || arg1 != this.anInt5559) {
			this.anInt5558 = arg0;
			this.anInt5559 = arg1;
			for (@Pc(40) Class6 local40 = this.aClass211_42.method5183(); local40 != this.aClass211_42.aClass6_154; local40 = local40.aClass6_283) {
				((Class6_Sub9) local40).method7852(this.anInt5558, this.anInt5559);
			}
			this.aBoolean424 = true;
			this.aBoolean425 = true;
			this.aBoolean422 = true;
		}
		if (!this.method4781()) {
			return false;
		}
		this.anInt5564 = arg3;
		this.aBoolean420 = true;
		this.anInt5570 = arg2;
		this.aClass9_Sub2_19.method821(this.aClass89_3);
		this.aClass89_3.method2376(0);
		this.aClass9_Sub2_19.method815(this.anInt5559 + this.anInt5570 - this.aClass9_Sub2_19.anInt799, -this.anInt5564);
		return true;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILclient!cba;)V")
	public void method4788(@OriginalArg(1) Class6_Sub9 arg0) {
		arg0.aBoolean700 = false;
		arg0.method7849();
		arg0.method8151();
		this.method4782();
	}
}
