import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class178 {

	@OriginalMember(owner = "client!re", name = "j", descriptor = "Lclient!oh;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!re", name = "n", descriptor = "Lclient!bj;")
	private Class20_Sub1 aClass20_Sub1_5;

	@OriginalMember(owner = "client!re", name = "d", descriptor = "I")
	private int anInt5481 = -1;

	@OriginalMember(owner = "client!re", name = "b", descriptor = "I")
	private int anInt5480 = -1;

	@OriginalMember(owner = "client!re", name = "e", descriptor = "I")
	private int anInt5482 = 0;

	@OriginalMember(owner = "client!re", name = "f", descriptor = "I")
	private int anInt5483 = 0;

	@OriginalMember(owner = "client!re", name = "g", descriptor = "Lclient!bb;")
	private final Class16 aClass16_30 = new Class16();

	@OriginalMember(owner = "client!re", name = "i", descriptor = "Z")
	private boolean aBoolean529 = true;

	@OriginalMember(owner = "client!re", name = "l", descriptor = "Z")
	private boolean aBoolean531 = true;

	@OriginalMember(owner = "client!re", name = "k", descriptor = "Z")
	private boolean aBoolean530 = false;

	@OriginalMember(owner = "client!re", name = "m", descriptor = "I")
	private int anInt5485 = 0;

	@OriginalMember(owner = "client!re", name = "h", descriptor = "I")
	private int anInt5484 = -1;

	@OriginalMember(owner = "client!re", name = "o", descriptor = "Z")
	private boolean aBoolean532 = true;

	@OriginalMember(owner = "client!re", name = "p", descriptor = "[Lclient!bj;")
	private Class20_Sub1[] aClass20_Sub1Array1 = new Class20_Sub1[2];

	@OriginalMember(owner = "client!re", name = "a", descriptor = "Lclient!h;")
	private final Class32_Sub2 aClass32_Sub2_34;

	@OriginalMember(owner = "client!re", name = "c", descriptor = "Lclient!ao;")
	private Class11 aClass11_2;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!h;)V")
	public Class178(@OriginalArg(0) Class32_Sub2 arg0) {
		this.aClass32_Sub2_34 = arg0;
		if (this.aClass32_Sub2_34.aBoolean228 && this.aClass32_Sub2_34.aBoolean245) {
			this.aClass11_2 = new Class11(this.aClass32_Sub2_34);
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "()V")
	public void method4710() {
		if (!this.method4712()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass32_Sub2_34.anOpengl2;
		this.aClass32_Sub2_34.method2293();
		this.aClass32_Sub2_34.method2291(0);
		this.aClass32_Sub2_34.method2184();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class1_Sub20 local35;
		for (@Pc(27) Class1_Sub20 local27 = (Class1_Sub20) this.aClass16_30.method410(); local27 != null; local27 = local35) {
			local35 = (Class1_Sub20) this.aClass16_30.method419();
			@Pc(39) int local39 = local27.method5566();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method5574(local41, this.aClass20_Sub1Array1[local19], this.aClass20_Sub1_5);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass32_Sub2_34.method2302(this.aClass11_2);
					this.aClass32_Sub2_34.method2247(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5480);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5483, this.anInt5482);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5483, this.anInt5482 + this.anInt5480);
					local7.glTexCoord2f((float) this.anInt5481, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5483 + this.anInt5481, this.anInt5482 + this.anInt5480);
					local7.glTexCoord2f((float) this.anInt5481, (float) this.anInt5480);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5483 + this.anInt5481, this.anInt5482);
					local7.glEnd();
				} else {
					this.aClass11_2.method348(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5480);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5480);
					local7.glTexCoord2f((float) this.anInt5481, (float) this.anInt5480);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5481, this.anInt5480);
					local7.glTexCoord2f((float) this.anInt5481, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5481, 0);
					local7.glEnd();
				}
				local27.method5572(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ir;)V")
	public void method4711(@OriginalArg(0) Class1_Sub20 arg0) {
		this.method4716(arg0);
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "()Z")
	private boolean method4712() {
		return this.aClass32_Sub2_34.method2283() == this.aClass11_2;
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(Lclient!ir;)Z")
	public boolean method4713(@OriginalArg(0) Class1_Sub20 arg0) {
		if (this.aClass11_2 != null) {
			if (arg0.method5568() || arg0.method5571()) {
				if (this.anInt5481 != -1 && this.anInt5480 != -1) {
					arg0.method5569(this.anInt5481, this.anInt5480);
				}
				arg0.aBoolean655 = true;
				this.aClass16_30.method416(arg0);
				this.method4714();
				return true;
			}
			arg0.method5567();
		}
		return false;
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "()V")
	private void method4714() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class1_Sub20 local11 = (Class1_Sub20) this.aClass16_30.method410(); local11 != null; local11 = (Class1_Sub20) this.aClass16_30.method419()) {
			local16 = local11.method5565();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method5566();
			local5 |= local11.method5573();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5484) {
			this.anInt5484 = local45;
			this.aBoolean531 = true;
		}
		local16 = this.anInt5485 > 2 ? 2 : this.anInt5485;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean532 = this.aBoolean531 = true;
		}
		if (local5 != this.aBoolean530) {
			this.aBoolean530 = local5;
			this.aBoolean529 = true;
		}
		this.anInt5485 = local3;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IIII)Z")
	public boolean method4715(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass11_2 == null || this.aClass16_30.method418()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5481 != arg2 || this.anInt5480 != arg3) {
			this.anInt5481 = arg2;
			this.anInt5480 = arg3;
			for (@Pc(30) Class1 local30 = this.aClass16_30.method410(); local30 != this.aClass16_30.aClass1_25; local30 = local30.aClass1_252) {
				((Class1_Sub20) local30).method5569(this.anInt5481, this.anInt5480);
			}
			this.aBoolean531 = true;
			this.aBoolean529 = true;
		}
		if (this.aBoolean529) {
			if (this.aClass152_1 != null) {
				this.aClass152_1.method4153();
				this.aClass152_1 = null;
			}
			if (this.aClass20_Sub1_5 != null) {
				this.aClass20_Sub1_5.method5500();
				this.aClass20_Sub1_5 = null;
			}
			if (this.aBoolean530) {
				this.aClass20_Sub1_5 = new Class20_Sub1(this.aClass32_Sub2_34, 34037, 6402, this.anInt5481, this.anInt5480);
			} else {
				this.aClass152_1 = new Class152(this.aClass32_Sub2_34, 6402, this.anInt5481, this.anInt5480);
			}
			this.aBoolean532 = true;
			this.aBoolean529 = false;
			local11 = true;
		}
		if (this.aBoolean531) {
			if (this.aClass20_Sub1Array1[0] != null) {
				this.aClass20_Sub1Array1[0].method5500();
				this.aClass20_Sub1Array1[0] = null;
			}
			if (this.aClass20_Sub1Array1[1] != null) {
				this.aClass20_Sub1Array1[1].method5500();
				this.aClass20_Sub1Array1[1] = null;
			}
			this.aClass20_Sub1Array1[0] = new Class20_Sub1(this.aClass32_Sub2_34, 34037, this.anInt5484, this.anInt5481, this.anInt5480);
			this.aClass20_Sub1Array1[1] = this.anInt5485 > 1 ? new Class20_Sub1(this.aClass32_Sub2_34, 34037, this.anInt5484, this.anInt5481, this.anInt5480) : null;
			this.aBoolean532 = true;
			this.aBoolean531 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass32_Sub2_34.method2283().method2245();
		this.aClass32_Sub2_34.method2316(this.aClass11_2);
		if (this.aBoolean532) {
			this.aClass11_2.method345(0);
			this.aClass11_2.method345(1);
			this.aClass11_2.method345(8);
			if (this.aClass20_Sub1Array1[0] != null) {
				this.aClass11_2.method342(0, this.aClass20_Sub1Array1[0]);
			}
			if (this.aClass20_Sub1Array1[1] != null) {
				this.aClass11_2.method342(1, this.aClass20_Sub1Array1[1]);
			}
			if (this.aClass20_Sub1_5 != null) {
				this.aClass11_2.method342(8, this.aClass20_Sub1_5);
			}
			if (this.aClass152_1 != null) {
				this.aClass11_2.method343(this.aClass152_1);
			}
			this.aClass11_2.method348(0);
			this.aBoolean532 = false;
			local11 = true;
		}
		if (!local11 || this.aClass11_2.method346()) {
			this.anInt5483 = arg0;
			this.anInt5482 = arg1;
			this.aClass32_Sub2_34.method2247(-this.anInt5483, this.anInt5482 + this.anInt5480 - local194);
			return true;
		}
		this.aClass32_Sub2_34.method2302(this.aClass11_2);
		this.aBoolean531 = true;
		this.aBoolean529 = true;
		this.aBoolean532 = true;
		return false;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Lclient!ir;Z)V")
	private void method4716(@OriginalArg(0) Class1_Sub20 arg0) {
		arg0.method5567();
		arg0.aBoolean655 = false;
		arg0.method5628();
		this.method4714();
	}

	@OriginalMember(owner = "client!re", name = "d", descriptor = "()V")
	public void method4717() {
		if (this.aClass11_2 != null) {
			this.aClass11_2 = null;
			this.aClass20_Sub1Array1 = null;
			this.aClass152_1 = null;
			this.aClass20_Sub1_5 = null;
			this.aBoolean531 = true;
			this.aBoolean529 = true;
			this.aBoolean532 = true;
			if (!this.aClass16_30.method418()) {
				for (@Pc(33) Class1 local33 = this.aClass16_30.method410(); local33 != this.aClass16_30.aClass1_25; local33 = local33.aClass1_252) {
					((Class1_Sub20) local33).method5567();
				}
			}
		}
		this.anInt5481 = this.anInt5480 = -1;
	}
}
