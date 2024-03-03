import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class200 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "Lclient!pq;")
	private Class184 aClass184_1;

	@OriginalMember(owner = "client!rd", name = "o", descriptor = "Lclient!al;")
	private Class8_Sub1 aClass8_Sub1_4;

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
	private int anInt5591 = -1;

	@OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
	private int anInt5593 = -1;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
	private int anInt5592 = 0;

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
	private int anInt5594 = 0;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!ld;")
	private final Class135 aClass135_33 = new Class135();

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	private int anInt5595 = -1;

	@OriginalMember(owner = "client!rd", name = "i", descriptor = "Z")
	private boolean aBoolean394 = true;

	@OriginalMember(owner = "client!rd", name = "j", descriptor = "Z")
	private boolean aBoolean395 = true;

	@OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
	private int anInt5596 = 0;

	@OriginalMember(owner = "client!rd", name = "n", descriptor = "[Lclient!al;")
	private Class8_Sub1[] aClass8_Sub1Array3 = new Class8_Sub1[2];

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "Z")
	private boolean aBoolean396 = false;

	@OriginalMember(owner = "client!rd", name = "p", descriptor = "Z")
	private boolean aBoolean397 = true;

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_32;

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "Lclient!ua;")
	private Class228 aClass228_2;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!bf;)V", line = 361)
	public Class200(@OriginalArg(0) Class19_Sub1 arg0) {
		this.aClass19_Sub1_32 = arg0;
		if (this.aClass19_Sub1_32.aBoolean36 && this.aClass19_Sub1_32.aBoolean41) {
			this.aClass228_2 = new Class228(this.aClass19_Sub1_32);
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!uk;)Z", line = 3)
	public boolean method5116(@OriginalArg(0) Class2_Sub38 arg0) {
		if (this.aClass228_2 != null) {
			if (arg0.method6309() || arg0.method6301()) {
				if (this.anInt5591 != -1 && this.anInt5593 != -1) {
					arg0.method6307(this.anInt5591, this.anInt5593);
				}
				arg0.aBoolean479 = true;
				this.aClass135_33.method3541(arg0);
				this.method5117();
				return true;
			}
			arg0.method6306();
		}
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "()V", line = 30)
	private void method5117() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub38 local11 = (Class2_Sub38) this.aClass135_33.method3552(); local11 != null; local11 = (Class2_Sub38) this.aClass135_33.method3553()) {
			local16 = local11.method6302();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method6304();
			local5 |= local11.method6303();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5595) {
			this.anInt5595 = local45;
			this.aBoolean397 = true;
		}
		local16 = this.anInt5596 > 2 ? 2 : this.anInt5596;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean394 = this.aBoolean397 = true;
		}
		if (local5 != this.aBoolean396) {
			this.aBoolean396 = local5;
			this.aBoolean395 = true;
		}
		this.anInt5596 = local3;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "()V", line = 83)
	public void method5118() {
		if (!this.method5120()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass19_Sub1_32.anOpengl1;
		this.aClass19_Sub1_32.method824();
		this.aClass19_Sub1_32.method779(0);
		this.aClass19_Sub1_32.method2900();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub38 local35;
		for (@Pc(27) Class2_Sub38 local27 = (Class2_Sub38) this.aClass135_33.method3552(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub38) this.aClass135_33.method3553();
			@Pc(39) int local39 = local27.method6304();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method6310(local41, this.aClass8_Sub1Array3[local19], this.aClass8_Sub1_4);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass19_Sub1_32.method830(this.aClass228_2);
					this.aClass19_Sub1_32.method843(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5593);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5594, this.anInt5592);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5594, this.anInt5592 + this.anInt5593);
					local7.glTexCoord2f((float) this.anInt5591, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5594 + this.anInt5591, this.anInt5592 + this.anInt5593);
					local7.glTexCoord2f((float) this.anInt5591, (float) this.anInt5593);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5594 + this.anInt5591, this.anInt5592);
					local7.glEnd();
				} else {
					this.aClass228_2.method5797(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5593);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5593);
					local7.glTexCoord2f((float) this.anInt5591, (float) this.anInt5593);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5591, this.anInt5593);
					local7.glTexCoord2f((float) this.anInt5591, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5591, 0);
					local7.glEnd();
				}
				local27.method6308(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lclient!uk;Z)V", line = 161)
	private void method5119(@OriginalArg(0) Class2_Sub38 arg0) {
		arg0.method6306();
		arg0.aBoolean479 = false;
		arg0.method6469();
		this.method5117();
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "()Z", line = 173)
	private boolean method5120() {
		return this.aClass19_Sub1_32.method821() == this.aClass228_2;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "()V", line = 176)
	public void method5121() {
		if (this.aClass228_2 != null) {
			this.aClass228_2 = null;
			this.aClass8_Sub1Array3 = null;
			this.aClass184_1 = null;
			this.aClass8_Sub1_4 = null;
			this.aBoolean397 = true;
			this.aBoolean395 = true;
			this.aBoolean394 = true;
			if (!this.aClass135_33.method3551()) {
				for (@Pc(33) Class2 local33 = this.aClass135_33.method3552(); local33 != this.aClass135_33.aClass2_130; local33 = local33.aClass2_243) {
					((Class2_Sub38) local33).method6306();
				}
			}
		}
		this.anInt5591 = this.anInt5593 = -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z", line = 207)
	public boolean method5122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass228_2 == null || this.aClass135_33.method3551()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5591 != arg2 || this.anInt5593 != arg3) {
			this.anInt5591 = arg2;
			this.anInt5593 = arg3;
			for (@Pc(30) Class2 local30 = this.aClass135_33.method3552(); local30 != this.aClass135_33.aClass2_130; local30 = local30.aClass2_243) {
				((Class2_Sub38) local30).method6307(this.anInt5591, this.anInt5593);
			}
			this.aBoolean397 = true;
			this.aBoolean395 = true;
		}
		if (this.aBoolean395) {
			if (this.aClass184_1 != null) {
				this.aClass184_1.method4651();
				this.aClass184_1 = null;
			}
			if (this.aClass8_Sub1_4 != null) {
				this.aClass8_Sub1_4.method6157();
				this.aClass8_Sub1_4 = null;
			}
			if (this.aBoolean396) {
				this.aClass8_Sub1_4 = new Class8_Sub1(this.aClass19_Sub1_32, 34037, 6402, this.anInt5591, this.anInt5593);
			} else {
				this.aClass184_1 = new Class184(this.aClass19_Sub1_32, 6402, this.anInt5591, this.anInt5593);
			}
			this.aBoolean394 = true;
			this.aBoolean395 = false;
			local11 = true;
		}
		if (this.aBoolean397) {
			if (this.aClass8_Sub1Array3[0] != null) {
				this.aClass8_Sub1Array3[0].method6157();
				this.aClass8_Sub1Array3[0] = null;
			}
			if (this.aClass8_Sub1Array3[1] != null) {
				this.aClass8_Sub1Array3[1].method6157();
				this.aClass8_Sub1Array3[1] = null;
			}
			this.aClass8_Sub1Array3[0] = new Class8_Sub1(this.aClass19_Sub1_32, 34037, this.anInt5595, this.anInt5591, this.anInt5593);
			this.aClass8_Sub1Array3[1] = this.anInt5596 > 1 ? new Class8_Sub1(this.aClass19_Sub1_32, 34037, this.anInt5595, this.anInt5591, this.anInt5593) : null;
			this.aBoolean394 = true;
			this.aBoolean397 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass19_Sub1_32.method821().method5794();
		this.aClass19_Sub1_32.method808(this.aClass228_2);
		if (this.aBoolean394) {
			this.aClass228_2.method5799(0);
			this.aClass228_2.method5799(1);
			this.aClass228_2.method5799(8);
			if (this.aClass8_Sub1Array3[0] != null) {
				this.aClass228_2.method5795(0, this.aClass8_Sub1Array3[0]);
			}
			if (this.aClass8_Sub1Array3[1] != null) {
				this.aClass228_2.method5795(1, this.aClass8_Sub1Array3[1]);
			}
			if (this.aClass8_Sub1_4 != null) {
				this.aClass228_2.method5795(8, this.aClass8_Sub1_4);
			}
			if (this.aClass184_1 != null) {
				this.aClass228_2.method5801(this.aClass184_1);
			}
			this.aClass228_2.method5797(0);
			this.aBoolean394 = false;
			local11 = true;
		}
		if (!local11 || this.aClass228_2.method5800()) {
			this.anInt5594 = arg0;
			this.anInt5592 = arg1;
			this.aClass19_Sub1_32.method843(-this.anInt5594, this.anInt5592 + this.anInt5593 - local194);
			return true;
		}
		this.aClass19_Sub1_32.method830(this.aClass228_2);
		this.aBoolean397 = true;
		this.aBoolean395 = true;
		this.aBoolean394 = true;
		return false;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Lclient!uk;)V", line = 322)
	public void method5123(@OriginalArg(0) Class2_Sub38 arg0) {
		this.method5119(arg0);
	}
}
