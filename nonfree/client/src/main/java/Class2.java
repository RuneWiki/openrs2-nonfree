import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!cl;")
	private Class35 aClass35_1;

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!lb;")
	private Class28_Sub3 aClass28_Sub3_1;

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
	private int anInt40 = 0;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
	private int anInt41 = -1;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
	private int anInt39 = -1;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
	private int anInt42 = 0;

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "Lclient!vq;")
	private final Class211 aClass211_1 = new Class211();

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "[Lclient!lb;")
	private Class28_Sub3[] aClass28_Sub3Array1 = new Class28_Sub3[2];

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "I")
	private int anInt43 = 0;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Z")
	private boolean aBoolean5 = true;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Z")
	private boolean aBoolean3 = true;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	private int anInt44 = -1;

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "Z")
	private boolean aBoolean6 = false;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "Lclient!jd;")
	private Class105 aClass105_1;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!ge;)V")
	public Class2(@OriginalArg(0) Class81_Sub1 arg0) {
		this.aClass81_Sub1_1 = arg0;
		if (this.aClass81_Sub1_1.aBoolean132 && this.aClass81_Sub1_1.aBoolean140) {
			this.aClass105_1 = new Class105(this.aClass81_Sub1_1);
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "()V")
	public void method35() {
		if (this.aClass105_1 != null) {
			this.aClass105_1 = null;
			this.aClass28_Sub3Array1 = null;
			this.aClass35_1 = null;
			this.aClass28_Sub3_1 = null;
			this.aBoolean3 = true;
			this.aBoolean5 = true;
			this.aBoolean4 = true;
			if (!this.aClass211_1.method5589()) {
				for (@Pc(33) Class6 local33 = this.aClass211_1.method5594(); local33 != this.aClass211_1.aClass6_237; local33 = local33.aClass6_248) {
					((Class6_Sub14) local33).method2055();
				}
			}
		}
		this.anInt41 = this.anInt39 = -1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!fo;Z)V")
	private void method36(@OriginalArg(0) Class6_Sub14 arg0) {
		arg0.method2055();
		arg0.aBoolean167 = false;
		arg0.method5756();
		this.method37();
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "()V")
	private void method37() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class6_Sub14 local11 = (Class6_Sub14) this.aClass211_1.method5594(); local11 != null; local11 = (Class6_Sub14) this.aClass211_1.method5582()) {
			local16 = local11.method2057();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method2051();
			local5 |= local11.method2056();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt44) {
			this.anInt44 = local45;
			this.aBoolean3 = true;
		}
		local16 = this.anInt43 > 2 ? 2 : this.anInt43;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean4 = this.aBoolean3 = true;
		}
		if (local5 != this.aBoolean6) {
			this.aBoolean6 = local5;
			this.aBoolean5 = true;
		}
		this.anInt43 = local3;
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "()V")
	public void method38() {
		if (!this.method41()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass81_Sub1_1.anOpengl1;
		this.aClass81_Sub1_1.method2026();
		this.aClass81_Sub1_1.method1963(0);
		this.aClass81_Sub1_1.method3032();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class6_Sub14 local35;
		for (@Pc(27) Class6_Sub14 local27 = (Class6_Sub14) this.aClass211_1.method5594(); local27 != null; local27 = local35) {
			local35 = (Class6_Sub14) this.aClass211_1.method5582();
			@Pc(39) int local39 = local27.method2051();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method2059(local41, this.aClass28_Sub3Array1[local19], this.aClass28_Sub3_1);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass81_Sub1_1.method1964(this.aClass105_1);
					this.aClass81_Sub1_1.method1978(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt39);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt40, this.anInt42);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt40, this.anInt42 + this.anInt39);
					local7.glTexCoord2f((float) this.anInt41, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt40 + this.anInt41, this.anInt42 + this.anInt39);
					local7.glTexCoord2f((float) this.anInt41, (float) this.anInt39);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt40 + this.anInt41, this.anInt42);
					local7.glEnd();
				} else {
					this.aClass105_1.method2749(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt39);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt39);
					local7.glTexCoord2f((float) this.anInt41, (float) this.anInt39);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt41, this.anInt39);
					local7.glTexCoord2f((float) this.anInt41, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt41, 0);
					local7.glEnd();
				}
				local27.method2054(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!fo;)V")
	public void method39(@OriginalArg(0) Class6_Sub14 arg0) {
		this.method36(arg0);
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(Lclient!fo;)Z")
	public boolean method40(@OriginalArg(0) Class6_Sub14 arg0) {
		if (this.aClass105_1 != null) {
			if (arg0.method2050() || arg0.method2053()) {
				if (this.anInt41 != -1 && this.anInt39 != -1) {
					arg0.method2052(this.anInt41, this.anInt39);
				}
				arg0.aBoolean167 = true;
				this.aClass211_1.method5585(arg0);
				this.method37();
				return true;
			}
			arg0.method2055();
		}
		return false;
	}

	@OriginalMember(owner = "client!aa", name = "d", descriptor = "()Z")
	private boolean method41() {
		return this.aClass81_Sub1_1.method1955() == this.aClass105_1;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)Z")
	public boolean method42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass105_1 == null || this.aClass211_1.method5589()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt41 != arg2 || this.anInt39 != arg3) {
			this.anInt41 = arg2;
			this.anInt39 = arg3;
			for (@Pc(30) Class6 local30 = this.aClass211_1.method5594(); local30 != this.aClass211_1.aClass6_237; local30 = local30.aClass6_248) {
				((Class6_Sub14) local30).method2052(this.anInt41, this.anInt39);
			}
			this.aBoolean3 = true;
			this.aBoolean5 = true;
		}
		if (this.aBoolean5) {
			if (this.aClass35_1 != null) {
				this.aClass35_1.method707();
				this.aClass35_1 = null;
			}
			if (this.aClass28_Sub3_1 != null) {
				this.aClass28_Sub3_1.method4117();
				this.aClass28_Sub3_1 = null;
			}
			if (this.aBoolean6) {
				this.aClass28_Sub3_1 = new Class28_Sub3(this.aClass81_Sub1_1, 34037, 6402, this.anInt41, this.anInt39);
			} else {
				this.aClass35_1 = new Class35(this.aClass81_Sub1_1, 6402, this.anInt41, this.anInt39);
			}
			this.aBoolean4 = true;
			this.aBoolean5 = false;
			local11 = true;
		}
		if (this.aBoolean3) {
			if (this.aClass28_Sub3Array1[0] != null) {
				this.aClass28_Sub3Array1[0].method4117();
				this.aClass28_Sub3Array1[0] = null;
			}
			if (this.aClass28_Sub3Array1[1] != null) {
				this.aClass28_Sub3Array1[1].method4117();
				this.aClass28_Sub3Array1[1] = null;
			}
			this.aClass28_Sub3Array1[0] = new Class28_Sub3(this.aClass81_Sub1_1, 34037, this.anInt44, this.anInt41, this.anInt39);
			this.aClass28_Sub3Array1[1] = this.anInt43 > 1 ? new Class28_Sub3(this.aClass81_Sub1_1, 34037, this.anInt44, this.anInt41, this.anInt39) : null;
			this.aBoolean4 = true;
			this.aBoolean3 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass81_Sub1_1.method1955().method2744();
		this.aClass81_Sub1_1.method1997(this.aClass105_1);
		if (this.aBoolean4) {
			this.aClass105_1.method2746(0);
			this.aClass105_1.method2746(1);
			this.aClass105_1.method2746(8);
			if (this.aClass28_Sub3Array1[0] != null) {
				this.aClass105_1.method2752(0, this.aClass28_Sub3Array1[0]);
			}
			if (this.aClass28_Sub3Array1[1] != null) {
				this.aClass105_1.method2752(1, this.aClass28_Sub3Array1[1]);
			}
			if (this.aClass28_Sub3_1 != null) {
				this.aClass105_1.method2752(8, this.aClass28_Sub3_1);
			}
			if (this.aClass35_1 != null) {
				this.aClass105_1.method2748(this.aClass35_1);
			}
			this.aClass105_1.method2749(0);
			this.aBoolean4 = false;
			local11 = true;
		}
		if (!local11 || this.aClass105_1.method2750()) {
			this.anInt40 = arg0;
			this.anInt42 = arg1;
			this.aClass81_Sub1_1.method1978(-this.anInt40, this.anInt42 + this.anInt39 - local194);
			return true;
		}
		this.aClass81_Sub1_1.method1964(this.aClass105_1);
		this.aBoolean3 = true;
		this.aBoolean5 = true;
		this.aBoolean4 = true;
		return false;
	}
}
