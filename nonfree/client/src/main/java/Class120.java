import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class120 {

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Lclient!hi;")
	private Class15_Sub2 aClass15_Sub2_3;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "Lclient!kf;")
	private Class133 aClass133_1;

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
	private int anInt3183 = -1;

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "I")
	private int anInt3180 = -1;

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "I")
	private int anInt3181 = 0;

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
	private int anInt3182 = 0;

	@OriginalMember(owner = "client!jl", name = "g", descriptor = "Lclient!at;")
	private final Class17 aClass17_31 = new Class17();

	@OriginalMember(owner = "client!jl", name = "h", descriptor = "[Lclient!hi;")
	private Class15_Sub2[] aClass15_Sub2Array2 = new Class15_Sub2[2];

	@OriginalMember(owner = "client!jl", name = "n", descriptor = "Z")
	private boolean aBoolean287 = true;

	@OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
	private int anInt3184 = -1;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "Z")
	private boolean aBoolean286 = true;

	@OriginalMember(owner = "client!jl", name = "k", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!jl", name = "j", descriptor = "Z")
	private boolean aBoolean284 = true;

	@OriginalMember(owner = "client!jl", name = "o", descriptor = "I")
	private int anInt3185 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Lclient!nm;")
	private final Class164_Sub1 aClass164_Sub1_21;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "Lclient!gg;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lclient!nm;)V")
	public Class120(@OriginalArg(0) Class164_Sub1 arg0) {
		this.aClass164_Sub1_21 = arg0;
		if (this.aClass164_Sub1_21.aBoolean420 && this.aClass164_Sub1_21.aBoolean400) {
			this.aClass90_3 = new Class90(this.aClass164_Sub1_21);
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIII)Z")
	public boolean method2573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass90_3 == null || this.aClass17_31.method204()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt3180 != arg2 || this.anInt3183 != arg3) {
			this.anInt3180 = arg2;
			this.anInt3183 = arg3;
			for (@Pc(30) Class1 local30 = this.aClass17_31.method202(); local30 != this.aClass17_31.aClass1_15; local30 = local30.aClass1_243) {
				((Class1_Sub20) local30).method2495(this.anInt3180, this.anInt3183);
			}
			this.aBoolean287 = true;
			this.aBoolean284 = true;
		}
		if (this.aBoolean284) {
			if (this.aClass133_1 != null) {
				this.aClass133_1.method2687();
				this.aClass133_1 = null;
			}
			if (this.aClass15_Sub2_3 != null) {
				this.aClass15_Sub2_3.method5550();
				this.aClass15_Sub2_3 = null;
			}
			if (this.aBoolean285) {
				this.aClass15_Sub2_3 = new Class15_Sub2(this.aClass164_Sub1_21, 34037, 6402, this.anInt3180, this.anInt3183);
			} else {
				this.aClass133_1 = new Class133(this.aClass164_Sub1_21, 6402, this.anInt3180, this.anInt3183);
			}
			this.aBoolean286 = true;
			this.aBoolean284 = false;
			local11 = true;
		}
		if (this.aBoolean287) {
			if (this.aClass15_Sub2Array2[0] != null) {
				this.aClass15_Sub2Array2[0].method5550();
				this.aClass15_Sub2Array2[0] = null;
			}
			if (this.aClass15_Sub2Array2[1] != null) {
				this.aClass15_Sub2Array2[1].method5550();
				this.aClass15_Sub2Array2[1] = null;
			}
			this.aClass15_Sub2Array2[0] = new Class15_Sub2(this.aClass164_Sub1_21, 34037, this.anInt3184, this.anInt3180, this.anInt3183);
			this.aClass15_Sub2Array2[1] = this.anInt3185 > 1 ? new Class15_Sub2(this.aClass164_Sub1_21, 34037, this.anInt3184, this.anInt3180, this.anInt3183) : null;
			this.aBoolean286 = true;
			this.aBoolean287 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass164_Sub1_21.method3591().method3557();
		this.aClass164_Sub1_21.method3562(this.aClass90_3);
		if (this.aBoolean286) {
			this.aClass90_3.method1712(0);
			this.aClass90_3.method1712(1);
			this.aClass90_3.method1712(8);
			if (this.aClass15_Sub2Array2[0] != null) {
				this.aClass90_3.method1707(0, this.aClass15_Sub2Array2[0]);
			}
			if (this.aClass15_Sub2Array2[1] != null) {
				this.aClass90_3.method1707(1, this.aClass15_Sub2Array2[1]);
			}
			if (this.aClass15_Sub2_3 != null) {
				this.aClass90_3.method1707(8, this.aClass15_Sub2_3);
			}
			if (this.aClass133_1 != null) {
				this.aClass90_3.method1710(this.aClass133_1);
			}
			this.aClass90_3.method1706(0);
			this.aBoolean286 = false;
			local11 = true;
		}
		if (!local11 || this.aClass90_3.method1713()) {
			this.anInt3181 = arg0;
			this.anInt3182 = arg1;
			this.aClass164_Sub1_21.method3570(-this.anInt3181, this.anInt3182 + this.anInt3183 - local194);
			return true;
		}
		this.aClass164_Sub1_21.method3609(this.aClass90_3);
		this.aBoolean287 = true;
		this.aBoolean284 = true;
		this.aBoolean286 = true;
		return false;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!kh;)V")
	public void method2574(@OriginalArg(0) Class1_Sub20 arg0) {
		this.method2575(arg0);
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!kh;Z)V")
	private void method2575(@OriginalArg(0) Class1_Sub20 arg0) {
		arg0.method2491();
		arg0.aBoolean259 = false;
		arg0.method5577();
		this.method2580();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	public void method2576() {
		if (!this.method2578()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass164_Sub1_21.anOpengl1;
		this.aClass164_Sub1_21.method3623();
		this.aClass164_Sub1_21.method3607(0);
		this.aClass164_Sub1_21.method5306();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class1_Sub20 local35;
		for (@Pc(27) Class1_Sub20 local27 = (Class1_Sub20) this.aClass17_31.method202(); local27 != null; local27 = local35) {
			local35 = (Class1_Sub20) this.aClass17_31.method207();
			@Pc(39) int local39 = local27.method2493();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method2499(local41, this.aClass15_Sub2Array2[local19], this.aClass15_Sub2_3);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass164_Sub1_21.method3609(this.aClass90_3);
					this.aClass164_Sub1_21.method3570(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt3183);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt3181, this.anInt3182);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt3181, this.anInt3182 + this.anInt3183);
					local7.glTexCoord2f((float) this.anInt3180, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt3181 + this.anInt3180, this.anInt3182 + this.anInt3183);
					local7.glTexCoord2f((float) this.anInt3180, (float) this.anInt3183);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt3181 + this.anInt3180, this.anInt3182);
					local7.glEnd();
				} else {
					this.aClass90_3.method1706(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt3183);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt3183);
					local7.glTexCoord2f((float) this.anInt3180, (float) this.anInt3183);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt3180, this.anInt3183);
					local7.glTexCoord2f((float) this.anInt3180, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt3180, 0);
					local7.glEnd();
				}
				local27.method2490(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(Lclient!kh;)Z")
	public boolean method2577(@OriginalArg(0) Class1_Sub20 arg0) {
		if (this.aClass90_3 != null) {
			if (arg0.method2497() || arg0.method2494()) {
				if (this.anInt3180 != -1 && this.anInt3183 != -1) {
					arg0.method2495(this.anInt3180, this.anInt3183);
				}
				arg0.aBoolean259 = true;
				this.aClass17_31.method199(arg0);
				this.method2580();
				return true;
			}
			arg0.method2491();
		}
		return false;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "()Z")
	private boolean method2578() {
		return this.aClass164_Sub1_21.method3591() == this.aClass90_3;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "()V")
	public void method2579() {
		if (this.aClass90_3 != null) {
			this.aClass90_3 = null;
			this.aClass15_Sub2Array2 = null;
			this.aClass133_1 = null;
			this.aClass15_Sub2_3 = null;
			this.aBoolean287 = true;
			this.aBoolean284 = true;
			this.aBoolean286 = true;
			if (!this.aClass17_31.method204()) {
				for (@Pc(33) Class1 local33 = this.aClass17_31.method202(); local33 != this.aClass17_31.aClass1_15; local33 = local33.aClass1_243) {
					((Class1_Sub20) local33).method2491();
				}
			}
		}
		this.anInt3180 = this.anInt3183 = -1;
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "()V")
	private void method2580() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class1_Sub20 local11 = (Class1_Sub20) this.aClass17_31.method202(); local11 != null; local11 = (Class1_Sub20) this.aClass17_31.method207()) {
			local16 = local11.method2498();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method2493();
			local5 |= local11.method2496();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt3184) {
			this.anInt3184 = local45;
			this.aBoolean287 = true;
		}
		local16 = this.anInt3185 > 2 ? 2 : this.anInt3185;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean286 = this.aBoolean287 = true;
		}
		if (local5 != this.aBoolean285) {
			this.aBoolean285 = local5;
			this.aBoolean284 = true;
		}
		this.anInt3185 = local3;
	}
}
