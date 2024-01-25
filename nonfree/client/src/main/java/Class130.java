import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class130 {

	@OriginalMember(owner = "client!ji", name = "o", descriptor = "Z")
	private boolean aBoolean237;

	@OriginalMember(owner = "client!ji", name = "z", descriptor = "Lclient!ud;")
	private Class19_Sub4 aClass19_Sub4_2;

	@OriginalMember(owner = "client!ji", name = "A", descriptor = "Lclient!ip;")
	private Class6_Sub2_Sub5 aClass6_Sub2_Sub5_1;

	@OriginalMember(owner = "client!ji", name = "D", descriptor = "Lclient!ip;")
	private Class6_Sub2_Sub5 aClass6_Sub2_Sub5_2;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
	private int anInt3657 = 1;

	@OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
	private int anInt3666 = 0;

	@OriginalMember(owner = "client!ji", name = "k", descriptor = "I")
	private int anInt3662 = 1;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	private int anInt3665 = 0;

	@OriginalMember(owner = "client!ji", name = "u", descriptor = "Lclient!um;")
	private final Class244 aClass244_17 = new Class244();

	@OriginalMember(owner = "client!ji", name = "w", descriptor = "Z")
	private boolean aBoolean238 = true;

	@OriginalMember(owner = "client!ji", name = "x", descriptor = "Z")
	private boolean aBoolean239 = false;

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
	private int anInt3670 = -1;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "[Lclient!ud;")
	private Class19_Sub4[] aClass19_Sub4Array3 = new Class19_Sub4[2];

	@OriginalMember(owner = "client!ji", name = "C", descriptor = "I")
	private int anInt3671 = 0;

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "Z")
	private boolean aBoolean240 = true;

	@OriginalMember(owner = "client!ji", name = "F", descriptor = "Z")
	private boolean aBoolean241 = true;

	@OriginalMember(owner = "client!ji", name = "G", descriptor = "Z")
	private boolean aBoolean242 = true;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_21;

	@OriginalMember(owner = "client!ji", name = "j", descriptor = "Lclient!pr;")
	private Class200 aClass200_2;

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "Lclient!pr;")
	private Class200 aClass200_1;

	@OriginalMember(owner = "client!ji", name = "r", descriptor = "Lclient!pr;")
	private Class200 aClass200_3;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class130(@OriginalArg(0) Class66_Sub2 arg0) {
		this.aClass66_Sub2_21 = arg0;
		if (this.aClass66_Sub2_21.aBoolean372 && this.aClass66_Sub2_21.aBoolean396) {
			this.aClass200_1 = this.aClass200_2 = new Class200(this.aClass66_Sub2_21);
			if (this.aClass66_Sub2_21.anInt6138 > 1 && this.aClass66_Sub2_21.aBoolean384 && this.aClass66_Sub2_21.aBoolean380) {
				this.aClass200_1 = this.aClass200_3 = new Class200(this.aClass66_Sub2_21);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)Z")
	public boolean method3016(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass200_1 == null || this.aClass244_17.method5970()) {
			return false;
		}
		if (arg3 != this.anInt3657 || arg1 != this.anInt3662) {
			this.anInt3657 = arg3;
			this.anInt3662 = arg1;
			for (@Pc(47) Class6 local47 = this.aClass244_17.method5976(); local47 != this.aClass244_17.aClass6_220; local47 = local47.aClass6_252) {
				((Class6_Sub16) local47).method4748(this.anInt3662, this.anInt3657);
			}
			this.aBoolean241 = true;
			this.aBoolean238 = true;
			this.aBoolean242 = true;
		}
		if (!this.method3020()) {
			return false;
		}
		this.aBoolean237 = true;
		this.anInt3666 = arg2;
		this.anInt3665 = arg0;
		this.aClass66_Sub2_21.method5098(this.aClass200_1);
		this.aClass200_1.method4549(0);
		this.aClass66_Sub2_21.method5132(this.anInt3662 - this.aClass200_1.method4548() - this.anInt3666, -this.anInt3665);
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!fm;)V")
	public void method3018(@OriginalArg(1) Class6_Sub16 arg0) {
		arg0.aBoolean353 = false;
		arg0.method4745();
		arg0.method6525();
		this.method3021();
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
	public void method3019() {
		this.aClass19_Sub4_2 = null;
		this.aClass19_Sub4Array3 = null;
		this.aClass6_Sub2_Sub5_2 = null;
		this.aClass200_1 = this.aClass200_3 = this.aClass200_2 = null;
		this.aClass6_Sub2_Sub5_1 = null;
		if (!this.aClass244_17.method5970()) {
			for (@Pc(40) Class6 local40 = this.aClass244_17.method5976(); local40 != this.aClass244_17.aClass6_220; local40 = local40.aClass6_252) {
				((Class6_Sub16) local40).method4745();
			}
		}
		this.anInt3657 = this.anInt3662 = 1;
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)Z")
	private boolean method3020() {
		if (this.aBoolean242) {
			if (this.aClass6_Sub2_Sub5_2 != null) {
				this.aClass6_Sub2_Sub5_2.method2900();
				this.aClass6_Sub2_Sub5_2 = null;
			}
			if (this.aClass19_Sub4_2 != null) {
				this.aClass19_Sub4_2.method4252();
				this.aClass19_Sub4_2 = null;
			}
			if (this.aClass200_3 != null) {
				this.aClass6_Sub2_Sub5_2 = new Class6_Sub2_Sub5(this.aClass66_Sub2_21, 6402, this.anInt3657, this.anInt3662, this.aClass66_Sub2_21.anInt6138);
			}
			if (this.aBoolean239) {
				this.aClass19_Sub4_2 = new Class19_Sub4(this.aClass66_Sub2_21, 34037, 6402, this.anInt3657, this.anInt3662);
			} else if (this.aClass6_Sub2_Sub5_2 == null) {
				this.aClass6_Sub2_Sub5_2 = new Class6_Sub2_Sub5(this.aClass66_Sub2_21, 6402, this.anInt3657, this.anInt3662);
			}
			this.aBoolean242 = false;
			this.aBoolean240 = true;
			this.aBoolean241 = true;
		}
		if (this.aBoolean238) {
			if (this.aClass6_Sub2_Sub5_1 != null) {
				this.aClass6_Sub2_Sub5_1.method2900();
				this.aClass6_Sub2_Sub5_1 = null;
			}
			if (this.aClass19_Sub4Array3[0] != null) {
				this.aClass19_Sub4Array3[0].method4252();
				this.aClass19_Sub4Array3[0] = null;
			}
			if (this.aClass19_Sub4Array3[1] != null) {
				this.aClass19_Sub4Array3[1].method4252();
				this.aClass19_Sub4Array3[1] = null;
			}
			if (this.aClass200_3 != null) {
				this.aClass6_Sub2_Sub5_1 = new Class6_Sub2_Sub5(this.aClass66_Sub2_21, this.anInt3670, this.anInt3657, this.anInt3662, this.aClass66_Sub2_21.anInt6138);
			}
			this.aClass19_Sub4Array3[0] = new Class19_Sub4(this.aClass66_Sub2_21, 34037, this.anInt3670, this.anInt3657, this.anInt3662);
			this.aClass19_Sub4Array3[1] = this.anInt3671 <= 1 ? null : new Class19_Sub4(this.aClass66_Sub2_21, 34037, this.anInt3670, this.anInt3657, this.anInt3662);
			this.aBoolean240 = true;
			this.aBoolean238 = false;
			this.aBoolean241 = true;
		}
		if (this.aBoolean241) {
			if (this.aClass200_3 == null) {
				this.aClass66_Sub2_21.method5098(this.aClass200_2);
				this.aClass200_2.method4541(0);
				this.aClass200_2.method4541(1);
				this.aClass200_2.method4541(8);
				this.aClass200_2.method4542(this.aClass19_Sub4Array3[0], 0);
				if (this.anInt3671 > 1) {
					this.aClass200_2.method4542(this.aClass19_Sub4Array3[1], 1);
				}
				if (this.aBoolean239) {
					this.aClass200_2.method4542(this.aClass19_Sub4_2, 8);
				} else {
					this.aClass200_2.method4540(8, this.aClass6_Sub2_Sub5_2);
				}
				this.aClass66_Sub2_21.method5153(this.aClass200_2);
			} else {
				this.aClass66_Sub2_21.method5098(this.aClass200_2);
				this.aClass200_2.method4541(0);
				this.aClass200_2.method4541(1);
				this.aClass200_2.method4541(8);
				this.aClass200_2.method4542(this.aClass19_Sub4Array3[0], 0);
				if (this.anInt3671 > 1) {
					this.aClass200_2.method4542(this.aClass19_Sub4Array3[1], 1);
				}
				if (this.aBoolean239) {
					this.aClass200_2.method4542(this.aClass19_Sub4_2, 8);
				}
				this.aClass66_Sub2_21.method5153(this.aClass200_2);
				this.aClass66_Sub2_21.method5098(this.aClass200_3);
				this.aClass200_3.method4541(0);
				this.aClass200_3.method4541(8);
				this.aClass200_3.method4540(0, this.aClass6_Sub2_Sub5_1);
				this.aClass200_3.method4540(8, this.aClass6_Sub2_Sub5_2);
				this.aClass66_Sub2_21.method5153(this.aClass200_3);
			}
			this.aBoolean241 = false;
			this.aBoolean240 = true;
		}
		if (this.aBoolean240) {
			this.aClass66_Sub2_21.method5098(this.aClass200_1);
			this.aBoolean240 = !this.aClass200_1.method4546();
			this.aClass66_Sub2_21.method5153(this.aClass200_1);
		}
		return !this.aBoolean240;
	}

	@OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V")
	private void method3021() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class6_Sub16 local17 = (Class6_Sub16) this.aClass244_17.method5976(); local17 != null; local17 = (Class6_Sub16) this.aClass244_17.method5964()) {
			local25 = local17.method4749();
			local11 += local17.method4741();
			if (local9 < local25) {
				local9 = local25;
			}
			local7 |= local17.method4744();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (this.anInt3670 != local25) {
			this.aBoolean238 = true;
			this.anInt3670 = local25;
		}
		@Pc(93) int local93 = this.anInt3671 <= 2 ? this.anInt3671 : 2;
		@Pc(108) int local108 = local11 <= 2 ? local11 : 2;
		if (local108 != local93) {
			this.aBoolean241 = this.aBoolean238 = true;
		}
		this.anInt3671 = local11;
		if (local7 != this.aBoolean239) {
			this.aBoolean239 = local7;
			this.aBoolean242 = true;
		}
	}

	@OriginalMember(owner = "client!ji", name = "d", descriptor = "(I)V")
	public void method3022() {
		if (!this.aBoolean237) {
			return;
		}
		if (this.aClass200_3 != null) {
			this.aClass66_Sub2_21.method5104(this.aClass200_3);
			@Pc(28) short local28 = 16384;
			this.aClass66_Sub2_21.method5115(this.aClass200_2);
			this.aClass200_3.method4543();
			this.aClass200_2.method4549(0);
			if (this.aBoolean239) {
				local28 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3657, this.anInt3662, 0, 0, this.anInt3657, this.anInt3662, local28, 9728);
			this.aClass66_Sub2_21.method5120(this.aClass200_3);
			this.aClass66_Sub2_21.method5133(this.aClass200_2);
		}
		this.aClass66_Sub2_21.method5151();
		this.aClass66_Sub2_21.method5078(0);
		this.aClass66_Sub2_21.method5140(1);
		this.aClass66_Sub2_21.method5070();
		@Pc(101) int local101 = 0;
		@Pc(103) int local103 = 1;
		@Pc(119) Class6_Sub16 local119;
		for (@Pc(111) Class6_Sub16 local111 = (Class6_Sub16) this.aClass244_17.method5976(); local111 != null; local111 = local119) {
			local119 = (Class6_Sub16) this.aClass244_17.method5964();
			@Pc(123) int local123 = local111.method4741();
			for (@Pc(125) int local125 = 0; local125 < local123; local125++) {
				local111.method4746(this.aClass19_Sub4_2, local125, this.aClass19_Sub4Array3[local101]);
				if (local119 == null && local123 - 1 == local125) {
					this.aClass66_Sub2_21.method5153(this.aClass200_2);
					this.aClass66_Sub2_21.method5132(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3662);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3665, this.anInt3666);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3665, this.anInt3666 + this.anInt3662);
					OpenGL.glTexCoord2f((float) this.anInt3657, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3665 + this.anInt3657, this.anInt3662 + this.anInt3666);
					OpenGL.glTexCoord2f((float) this.anInt3657, (float) this.anInt3662);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3665 + this.anInt3657, this.anInt3666);
					OpenGL.glEnd();
				} else {
					this.aClass200_2.method4549(local103);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3662);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt3662);
					OpenGL.glTexCoord2f((float) this.anInt3657, (float) this.anInt3662);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3657, this.anInt3662);
					OpenGL.glTexCoord2f((float) this.anInt3657, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3657, 0);
					OpenGL.glEnd();
				}
				local101 = local101 + 1 & 0x1;
				local111.method4740(local125);
				local103 = local103 + 1 & 0x1;
			}
		}
		this.aBoolean237 = false;
	}

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "(I)Z")
	public boolean method3023() {
		return this.aClass200_1 != null;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lclient!fm;B)Z")
	public boolean method3024(@OriginalArg(0) Class6_Sub16 arg0) {
		if (this.aClass200_1 != null) {
			if (arg0.method4750() || arg0.method4742()) {
				this.aClass244_17.method5966(arg0);
				this.method3021();
				if (this.method3020()) {
					if (this.anInt3657 != -1 && this.anInt3662 != -1) {
						arg0.method4748(this.anInt3662, this.anInt3657);
					}
					arg0.aBoolean353 = true;
					return true;
				}
			}
			this.method3018(arg0);
		}
		return false;
	}
}
