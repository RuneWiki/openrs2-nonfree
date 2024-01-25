import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class185 {

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!ij;")
	private Class94 aClass94_1;

	@OriginalMember(owner = "client!sp", name = "p", descriptor = "Lclient!oa;")
	private Class66_Sub1 aClass66_Sub1_7;

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
	private int anInt5815 = -1;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
	private int anInt5816 = 0;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "I")
	private int anInt5817 = 0;

	@OriginalMember(owner = "client!sp", name = "g", descriptor = "I")
	private int anInt5818 = -1;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!m;")
	private final Class127 aClass127_38 = new Class127();

	@OriginalMember(owner = "client!sp", name = "i", descriptor = "[Lclient!oa;")
	private Class66_Sub1[] aClass66_Sub1Array2 = new Class66_Sub1[2];

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Z")
	private boolean aBoolean397 = false;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "Z")
	private boolean aBoolean399 = true;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Z")
	private boolean aBoolean396 = true;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Z")
	private boolean aBoolean398 = true;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
	private int anInt5820 = 0;

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "I")
	private int anInt5819 = -1;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Lclient!se;")
	private final Class122_Sub2 aClass122_Sub2_40;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Lclient!jj;")
	private Class109 aClass109_4;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!se;)V")
	public Class185(@OriginalArg(0) Class122_Sub2 arg0) {
		this.aClass122_Sub2_40 = arg0;
		if (this.aClass122_Sub2_40.aBoolean355 && this.aClass122_Sub2_40.aBoolean357) {
			this.aClass109_4 = new Class109(this.aClass122_Sub2_40);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIII)Z")
	public boolean method4956(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass109_4 == null || this.aClass127_38.method3390()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5815 != arg2 || this.anInt5818 != arg3) {
			this.anInt5815 = arg2;
			this.anInt5818 = arg3;
			for (@Pc(30) Class3 local30 = this.aClass127_38.method3402(); local30 != this.aClass127_38.aClass3_156; local30 = local30.aClass3_248) {
				((Class3_Sub31) local30).method3718(this.anInt5815, this.anInt5818);
			}
			this.aBoolean396 = true;
			this.aBoolean398 = true;
		}
		if (this.aBoolean398) {
			if (this.aClass94_1 != null) {
				this.aClass94_1.method2237();
				this.aClass94_1 = null;
			}
			if (this.aClass66_Sub1_7 != null) {
				this.aClass66_Sub1_7.method4050();
				this.aClass66_Sub1_7 = null;
			}
			if (this.aBoolean397) {
				this.aClass66_Sub1_7 = new Class66_Sub1(this.aClass122_Sub2_40, 34037, 6402, this.anInt5815, this.anInt5818);
			} else {
				this.aClass94_1 = new Class94(this.aClass122_Sub2_40, 6402, this.anInt5815, this.anInt5818);
			}
			this.aBoolean399 = true;
			this.aBoolean398 = false;
			local11 = true;
		}
		if (this.aBoolean396) {
			if (this.aClass66_Sub1Array2[0] != null) {
				this.aClass66_Sub1Array2[0].method4050();
				this.aClass66_Sub1Array2[0] = null;
			}
			if (this.aClass66_Sub1Array2[1] != null) {
				this.aClass66_Sub1Array2[1].method4050();
				this.aClass66_Sub1Array2[1] = null;
			}
			this.aClass66_Sub1Array2[0] = new Class66_Sub1(this.aClass122_Sub2_40, 34037, this.anInt5819, this.anInt5815, this.anInt5818);
			this.aClass66_Sub1Array2[1] = this.anInt5820 > 1 ? new Class66_Sub1(this.aClass122_Sub2_40, 34037, this.anInt5819, this.anInt5815, this.anInt5818) : null;
			this.aBoolean399 = true;
			this.aBoolean396 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass122_Sub2_40.method4858().method4806();
		this.aClass122_Sub2_40.method4833(this.aClass109_4);
		if (this.aBoolean399) {
			this.aClass109_4.method2429(0);
			this.aClass109_4.method2429(1);
			this.aClass109_4.method2429(8);
			if (this.aClass66_Sub1Array2[0] != null) {
				this.aClass109_4.method2436(0, this.aClass66_Sub1Array2[0]);
			}
			if (this.aClass66_Sub1Array2[1] != null) {
				this.aClass109_4.method2436(1, this.aClass66_Sub1Array2[1]);
			}
			if (this.aClass66_Sub1_7 != null) {
				this.aClass109_4.method2436(8, this.aClass66_Sub1_7);
			}
			if (this.aClass94_1 != null) {
				this.aClass109_4.method2435(this.aClass94_1);
			}
			this.aClass109_4.method2433(0);
			this.aBoolean399 = false;
			local11 = true;
		}
		if (!local11 || this.aClass109_4.method2437()) {
			this.anInt5816 = arg0;
			this.anInt5817 = arg1;
			this.aClass122_Sub2_40.method4825(-this.anInt5816, this.anInt5817 + this.anInt5818 - local194);
			return true;
		}
		this.aClass122_Sub2_40.method4865(this.aClass109_4);
		this.aBoolean396 = true;
		this.aBoolean398 = true;
		this.aBoolean399 = true;
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "()Z")
	private boolean method4957() {
		return this.aClass122_Sub2_40.method4858() == this.aClass109_4;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!nm;)V")
	public void method4958(@OriginalArg(0) Class3_Sub31 arg0) {
		this.method4963(arg0);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "()V")
	public void method4959() {
		if (!this.method4957()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass122_Sub2_40.anOpengl2;
		this.aClass122_Sub2_40.method4877();
		this.aClass122_Sub2_40.method4882(0);
		this.aClass122_Sub2_40.method4734();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class3_Sub31 local35;
		for (@Pc(27) Class3_Sub31 local27 = (Class3_Sub31) this.aClass127_38.method3402(); local27 != null; local27 = local35) {
			local35 = (Class3_Sub31) this.aClass127_38.method3400();
			@Pc(39) int local39 = local27.method3711();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method3709(local41, this.aClass66_Sub1Array2[local19], this.aClass66_Sub1_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass122_Sub2_40.method4865(this.aClass109_4);
					this.aClass122_Sub2_40.method4825(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5818);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5816, this.anInt5817);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5816, this.anInt5817 + this.anInt5818);
					local7.glTexCoord2f((float) this.anInt5815, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5816 + this.anInt5815, this.anInt5817 + this.anInt5818);
					local7.glTexCoord2f((float) this.anInt5815, (float) this.anInt5818);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5816 + this.anInt5815, this.anInt5817);
					local7.glEnd();
				} else {
					this.aClass109_4.method2433(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5818);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5818);
					local7.glTexCoord2f((float) this.anInt5815, (float) this.anInt5818);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5815, this.anInt5818);
					local7.glTexCoord2f((float) this.anInt5815, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5815, 0);
					local7.glEnd();
				}
				local27.method3714(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(Lclient!nm;)Z")
	public boolean method4960(@OriginalArg(0) Class3_Sub31 arg0) {
		if (this.aClass109_4 != null) {
			if (arg0.method3716() || arg0.method3713()) {
				if (this.anInt5815 != -1 && this.anInt5818 != -1) {
					arg0.method3718(this.anInt5815, this.anInt5818);
				}
				arg0.aBoolean244 = true;
				this.aClass127_38.method3387(arg0);
				this.method4962();
				return true;
			}
			arg0.method3717();
		}
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "()V")
	public void method4961() {
		if (this.aClass109_4 != null) {
			this.aClass109_4 = null;
			this.aClass66_Sub1Array2 = null;
			this.aClass94_1 = null;
			this.aClass66_Sub1_7 = null;
			this.aBoolean396 = true;
			this.aBoolean398 = true;
			this.aBoolean399 = true;
			if (!this.aClass127_38.method3390()) {
				for (@Pc(33) Class3 local33 = this.aClass127_38.method3402(); local33 != this.aClass127_38.aClass3_156; local33 = local33.aClass3_248) {
					((Class3_Sub31) local33).method3717();
				}
			}
		}
		this.anInt5815 = this.anInt5818 = -1;
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "()V")
	private void method4962() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class3_Sub31 local11 = (Class3_Sub31) this.aClass127_38.method3402(); local11 != null; local11 = (Class3_Sub31) this.aClass127_38.method3400()) {
			local16 = local11.method3712();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method3711();
			local5 |= local11.method3710();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5819) {
			this.anInt5819 = local45;
			this.aBoolean396 = true;
		}
		local16 = this.anInt5820 > 2 ? 2 : this.anInt5820;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean399 = this.aBoolean396 = true;
		}
		if (local5 != this.aBoolean397) {
			this.aBoolean397 = local5;
			this.aBoolean398 = true;
		}
		this.anInt5820 = local3;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!nm;Z)V")
	private void method4963(@OriginalArg(0) Class3_Sub31 arg0) {
		arg0.method3717();
		arg0.aBoolean244 = false;
		arg0.method5717();
		this.method4962();
	}
}
