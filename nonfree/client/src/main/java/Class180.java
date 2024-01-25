import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rq")
public final class Class180 {

	@OriginalMember(owner = "client!rq", name = "k", descriptor = "Lclient!ai;")
	private Class8_Sub1 aClass8_Sub1_3;

	@OriginalMember(owner = "client!rq", name = "n", descriptor = "Lclient!jn;")
	private Class108 aClass108_1;

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
	private int anInt5397 = 0;

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
	private int anInt5395 = -1;

	@OriginalMember(owner = "client!rq", name = "g", descriptor = "I")
	private int anInt5398 = -1;

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
	private int anInt5396 = 0;

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "Lclient!bd;")
	private final Class18 aClass18_34 = new Class18();

	@OriginalMember(owner = "client!rq", name = "i", descriptor = "I")
	private int anInt5400 = 0;

	@OriginalMember(owner = "client!rq", name = "h", descriptor = "I")
	private int anInt5399 = -1;

	@OriginalMember(owner = "client!rq", name = "l", descriptor = "[Lclient!ai;")
	private Class8_Sub1[] aClass8_Sub1Array4 = new Class8_Sub1[2];

	@OriginalMember(owner = "client!rq", name = "j", descriptor = "Z")
	private boolean aBoolean355 = true;

	@OriginalMember(owner = "client!rq", name = "m", descriptor = "Z")
	private boolean aBoolean356 = false;

	@OriginalMember(owner = "client!rq", name = "o", descriptor = "Z")
	private boolean aBoolean357 = true;

	@OriginalMember(owner = "client!rq", name = "p", descriptor = "Z")
	private boolean aBoolean358 = true;

	@OriginalMember(owner = "client!rq", name = "f", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_33;

	@OriginalMember(owner = "client!rq", name = "e", descriptor = "Lclient!ql;")
	private Class171 aClass171_3;

	@OriginalMember(owner = "client!rq", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class180(@OriginalArg(0) Class46_Sub2 arg0) {
		this.aClass46_Sub2_33 = arg0;
		if (this.aClass46_Sub2_33.lb && this.aClass46_Sub2_33.aBoolean388) {
			this.aClass171_3 = new Class171(this.aClass46_Sub2_33);
		}
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(IIII)Z")
	public boolean method4799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass171_3 == null || this.aClass18_34.method452()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5398 != arg2 || this.anInt5395 != arg3) {
			this.anInt5398 = arg2;
			this.anInt5395 = arg3;
			for (@Pc(30) Class14 local30 = this.aClass18_34.method459(); local30 != this.aClass18_34.aClass14_17; local30 = local30.aClass14_248) {
				((Class14_Sub1) local30).method267(this.anInt5398, this.anInt5395);
			}
			this.aBoolean358 = true;
			this.aBoolean355 = true;
		}
		if (this.aBoolean355) {
			if (this.aClass108_1 != null) {
				this.aClass108_1.method3014();
				this.aClass108_1 = null;
			}
			if (this.aClass8_Sub1_3 != null) {
				this.aClass8_Sub1_3.method4743();
				this.aClass8_Sub1_3 = null;
			}
			if (this.aBoolean356) {
				this.aClass8_Sub1_3 = new Class8_Sub1(this.aClass46_Sub2_33, 34037, 6402, this.anInt5398, this.anInt5395);
			} else {
				this.aClass108_1 = new Class108(this.aClass46_Sub2_33, 6402, this.anInt5398, this.anInt5395);
			}
			this.aBoolean357 = true;
			this.aBoolean355 = false;
			local11 = true;
		}
		if (this.aBoolean358) {
			if (this.aClass8_Sub1Array4[0] != null) {
				this.aClass8_Sub1Array4[0].method4743();
				this.aClass8_Sub1Array4[0] = null;
			}
			if (this.aClass8_Sub1Array4[1] != null) {
				this.aClass8_Sub1Array4[1].method4743();
				this.aClass8_Sub1Array4[1] = null;
			}
			this.aClass8_Sub1Array4[0] = new Class8_Sub1(this.aClass46_Sub2_33, 34037, this.anInt5399, this.anInt5398, this.anInt5395);
			this.aClass8_Sub1Array4[1] = this.anInt5400 > 1 ? new Class8_Sub1(this.aClass46_Sub2_33, 34037, this.anInt5399, this.anInt5398, this.anInt5395) : null;
			this.aBoolean357 = true;
			this.aBoolean358 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass46_Sub2_33.method5220().method5191();
		this.aClass46_Sub2_33.method5247(this.aClass171_3);
		if (this.aBoolean357) {
			this.aClass171_3.method4522(0);
			this.aClass171_3.method4522(1);
			this.aClass171_3.method4522(8);
			if (this.aClass8_Sub1Array4[0] != null) {
				this.aClass171_3.method4527(0, this.aClass8_Sub1Array4[0]);
			}
			if (this.aClass8_Sub1Array4[1] != null) {
				this.aClass171_3.method4527(1, this.aClass8_Sub1Array4[1]);
			}
			if (this.aClass8_Sub1_3 != null) {
				this.aClass171_3.method4527(8, this.aClass8_Sub1_3);
			}
			if (this.aClass108_1 != null) {
				this.aClass171_3.method4523(this.aClass108_1);
			}
			this.aClass171_3.method4524(0);
			this.aBoolean357 = false;
			local11 = true;
		}
		if (!local11 || this.aClass171_3.method4526()) {
			this.anInt5397 = arg0;
			this.anInt5396 = arg1;
			this.aClass46_Sub2_33.method5221(-this.anInt5397, this.anInt5396 + this.anInt5395 - local194);
			return true;
		}
		this.aClass46_Sub2_33.method5255(this.aClass171_3);
		this.aBoolean358 = true;
		this.aBoolean355 = true;
		this.aBoolean357 = true;
		return false;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "()V")
	private void method4800() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class14_Sub1 local11 = (Class14_Sub1) this.aClass18_34.method459(); local11 != null; local11 = (Class14_Sub1) this.aClass18_34.method453()) {
			local16 = local11.method265();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method259();
			local5 |= local11.method266();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5399) {
			this.anInt5399 = local45;
			this.aBoolean358 = true;
		}
		local16 = this.anInt5400 > 2 ? 2 : this.anInt5400;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean357 = this.aBoolean358 = true;
		}
		if (local5 != this.aBoolean356) {
			this.aBoolean356 = local5;
			this.aBoolean355 = true;
		}
		this.anInt5400 = local3;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!ie;Z)V")
	private void method4801(@OriginalArg(0) Class14_Sub1 arg0) {
		arg0.method263();
		arg0.aBoolean12 = false;
		arg0.method5986();
		this.method4800();
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "()V")
	public void method4802() {
		if (this.aClass171_3 != null) {
			this.aClass171_3 = null;
			this.aClass8_Sub1Array4 = null;
			this.aClass108_1 = null;
			this.aClass8_Sub1_3 = null;
			this.aBoolean358 = true;
			this.aBoolean355 = true;
			this.aBoolean357 = true;
			if (!this.aClass18_34.method452()) {
				for (@Pc(33) Class14 local33 = this.aClass18_34.method459(); local33 != this.aClass18_34.aClass14_17; local33 = local33.aClass14_248) {
					((Class14_Sub1) local33).method263();
				}
			}
		}
		this.anInt5398 = this.anInt5395 = -1;
	}

	@OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lclient!ie;)Z")
	public boolean method4803(@OriginalArg(0) Class14_Sub1 arg0) {
		if (this.aClass171_3 != null) {
			if (arg0.method260() || arg0.method261()) {
				if (this.anInt5398 != -1 && this.anInt5395 != -1) {
					arg0.method267(this.anInt5398, this.anInt5395);
				}
				arg0.aBoolean12 = true;
				this.aClass18_34.method451(arg0);
				this.method4800();
				return true;
			}
			arg0.method263();
		}
		return false;
	}

	@OriginalMember(owner = "client!rq", name = "b", descriptor = "(Lclient!ie;)V")
	public void method4804(@OriginalArg(0) Class14_Sub1 arg0) {
		this.method4801(arg0);
	}

	@OriginalMember(owner = "client!rq", name = "c", descriptor = "()Z")
	private boolean method4805() {
		return this.aClass46_Sub2_33.method5220() == this.aClass171_3;
	}

	@OriginalMember(owner = "client!rq", name = "d", descriptor = "()V")
	public void method4806() {
		if (!this.method4805()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass46_Sub2_33.anOpengl1;
		this.aClass46_Sub2_33.method5198();
		this.aClass46_Sub2_33.method5256(0);
		this.aClass46_Sub2_33.method5139();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class14_Sub1 local35;
		for (@Pc(27) Class14_Sub1 local27 = (Class14_Sub1) this.aClass18_34.method459(); local27 != null; local27 = local35) {
			local35 = (Class14_Sub1) this.aClass18_34.method453();
			@Pc(39) int local39 = local27.method259();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method264(local41, this.aClass8_Sub1Array4[local19], this.aClass8_Sub1_3);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass46_Sub2_33.method5255(this.aClass171_3);
					this.aClass46_Sub2_33.method5221(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5395);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5397, this.anInt5396);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5397, this.anInt5396 + this.anInt5395);
					local7.glTexCoord2f((float) this.anInt5398, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5397 + this.anInt5398, this.anInt5396 + this.anInt5395);
					local7.glTexCoord2f((float) this.anInt5398, (float) this.anInt5395);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5397 + this.anInt5398, this.anInt5396);
					local7.glEnd();
				} else {
					this.aClass171_3.method4524(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5395);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5395);
					local7.glTexCoord2f((float) this.anInt5398, (float) this.anInt5395);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5398, this.anInt5395);
					local7.glTexCoord2f((float) this.anInt5398, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5398, 0);
					local7.glEnd();
				}
				local27.method262(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}
}
