import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class33 {

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "Lclient!pq;")
	private Class81_Sub4 aClass81_Sub4_1;

	@OriginalMember(owner = "client!cc", name = "k", descriptor = "Lclient!ue;")
	private Class200 aClass200_1;

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
	private int anInt584 = 0;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "I")
	private int anInt586 = -1;

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "I")
	private int anInt585 = -1;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "I")
	private int anInt587 = 0;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "Lclient!sf;")
	private final Class180 aClass180_4 = new Class180();

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	private int anInt589 = 0;

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!cc", name = "n", descriptor = "Z")
	private boolean aBoolean51 = false;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "I")
	private int anInt588 = -1;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "Z")
	private boolean aBoolean49 = true;

	@OriginalMember(owner = "client!cc", name = "o", descriptor = "Z")
	private boolean aBoolean52 = true;

	@OriginalMember(owner = "client!cc", name = "p", descriptor = "[Lclient!pq;")
	private Class81_Sub4[] aClass81_Sub4Array3 = new Class81_Sub4[2];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "Lclient!cg;")
	private final Class37_Sub1 aClass37_Sub1_4;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "Lclient!bh;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!cg;)V")
	public Class33(@OriginalArg(0) Class37_Sub1 arg0) {
		this.aClass37_Sub1_4 = arg0;
		if (this.aClass37_Sub1_4.aBoolean77 && this.aClass37_Sub1_4.aBoolean66) {
			this.aClass23_1 = new Class23(this.aClass37_Sub1_4);
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!bm;)V")
	public void method493(@OriginalArg(0) Class2_Sub6 arg0) {
		this.method496(arg0);
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(Lclient!bm;)Z")
	public boolean method494(@OriginalArg(0) Class2_Sub6 arg0) {
		if (this.aClass23_1 != null) {
			if (arg0.method5325() || arg0.method5327()) {
				if (this.anInt586 != -1 && this.anInt585 != -1) {
					arg0.method5326(this.anInt586, this.anInt585);
				}
				arg0.aBoolean564 = true;
				this.aClass180_4.method4909(arg0);
				this.method497();
				return true;
			}
			arg0.method5321();
		}
		return false;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "()V")
	public void method495() {
		if (!this.method498()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass37_Sub1_4.anOpengl1;
		this.aClass37_Sub1_4.method754();
		this.aClass37_Sub1_4.method731(0);
		this.aClass37_Sub1_4.method3709();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub6 local35;
		for (@Pc(27) Class2_Sub6 local27 = (Class2_Sub6) this.aClass180_4.method4919(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub6) this.aClass180_4.method4916();
			@Pc(39) int local39 = local27.method5329();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method5324(local41, this.aClass81_Sub4Array3[local19], this.aClass81_Sub4_1);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass37_Sub1_4.method782(this.aClass23_1);
					this.aClass37_Sub1_4.method766(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt585);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt584, this.anInt587);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt584, this.anInt587 + this.anInt585);
					local7.glTexCoord2f((float) this.anInt586, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt584 + this.anInt586, this.anInt587 + this.anInt585);
					local7.glTexCoord2f((float) this.anInt586, (float) this.anInt585);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt584 + this.anInt586, this.anInt587);
					local7.glEnd();
				} else {
					this.aClass23_1.method351(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt585);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt585);
					local7.glTexCoord2f((float) this.anInt586, (float) this.anInt585);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt586, this.anInt585);
					local7.glTexCoord2f((float) this.anInt586, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt586, 0);
					local7.glEnd();
				}
				local27.method5320(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!bm;Z)V")
	private void method496(@OriginalArg(0) Class2_Sub6 arg0) {
		arg0.method5321();
		arg0.aBoolean564 = false;
		arg0.method5723();
		this.method497();
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "()V")
	private void method497() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub6 local11 = (Class2_Sub6) this.aClass180_4.method4919(); local11 != null; local11 = (Class2_Sub6) this.aClass180_4.method4916()) {
			local16 = local11.method5323();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method5329();
			local5 |= local11.method5322();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt588) {
			this.anInt588 = local45;
			this.aBoolean50 = true;
		}
		local16 = this.anInt589 > 2 ? 2 : this.anInt589;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean52 = this.aBoolean50 = true;
		}
		if (local5 != this.aBoolean51) {
			this.aBoolean51 = local5;
			this.aBoolean49 = true;
		}
		this.anInt589 = local3;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "()Z")
	private boolean method498() {
		return this.aClass37_Sub1_4.method775() == this.aClass23_1;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "()V")
	public void method499() {
		if (this.aClass23_1 != null) {
			this.aClass23_1 = null;
			this.aClass81_Sub4Array3 = null;
			this.aClass200_1 = null;
			this.aClass81_Sub4_1 = null;
			this.aBoolean50 = true;
			this.aBoolean49 = true;
			this.aBoolean52 = true;
			if (!this.aClass180_4.method4911()) {
				for (@Pc(33) Class2 local33 = this.aClass180_4.method4919(); local33 != this.aClass180_4.aClass2_207; local33 = local33.aClass2_251) {
					((Class2_Sub6) local33).method5321();
				}
			}
		}
		this.anInt586 = this.anInt585 = -1;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIII)Z")
	public boolean method500(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass23_1 == null || this.aClass180_4.method4911()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt586 != arg2 || this.anInt585 != arg3) {
			this.anInt586 = arg2;
			this.anInt585 = arg3;
			for (@Pc(30) Class2 local30 = this.aClass180_4.method4919(); local30 != this.aClass180_4.aClass2_207; local30 = local30.aClass2_251) {
				((Class2_Sub6) local30).method5326(this.anInt586, this.anInt585);
			}
			this.aBoolean50 = true;
			this.aBoolean49 = true;
		}
		if (this.aBoolean49) {
			if (this.aClass200_1 != null) {
				this.aClass200_1.method5339();
				this.aClass200_1 = null;
			}
			if (this.aClass81_Sub4_1 != null) {
				this.aClass81_Sub4_1.method4738();
				this.aClass81_Sub4_1 = null;
			}
			if (this.aBoolean51) {
				this.aClass81_Sub4_1 = new Class81_Sub4(this.aClass37_Sub1_4, 34037, 6402, this.anInt586, this.anInt585);
			} else {
				this.aClass200_1 = new Class200(this.aClass37_Sub1_4, 6402, this.anInt586, this.anInt585);
			}
			this.aBoolean52 = true;
			this.aBoolean49 = false;
			local11 = true;
		}
		if (this.aBoolean50) {
			if (this.aClass81_Sub4Array3[0] != null) {
				this.aClass81_Sub4Array3[0].method4738();
				this.aClass81_Sub4Array3[0] = null;
			}
			if (this.aClass81_Sub4Array3[1] != null) {
				this.aClass81_Sub4Array3[1].method4738();
				this.aClass81_Sub4Array3[1] = null;
			}
			this.aClass81_Sub4Array3[0] = new Class81_Sub4(this.aClass37_Sub1_4, 34037, this.anInt588, this.anInt586, this.anInt585);
			this.aClass81_Sub4Array3[1] = this.anInt589 > 1 ? new Class81_Sub4(this.aClass37_Sub1_4, 34037, this.anInt588, this.anInt586, this.anInt585) : null;
			this.aBoolean52 = true;
			this.aBoolean50 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass37_Sub1_4.method775().method729();
		this.aClass37_Sub1_4.method798(this.aClass23_1);
		if (this.aBoolean52) {
			this.aClass23_1.method348(0);
			this.aClass23_1.method348(1);
			this.aClass23_1.method348(8);
			if (this.aClass81_Sub4Array3[0] != null) {
				this.aClass23_1.method346(0, this.aClass81_Sub4Array3[0]);
			}
			if (this.aClass81_Sub4Array3[1] != null) {
				this.aClass23_1.method346(1, this.aClass81_Sub4Array3[1]);
			}
			if (this.aClass81_Sub4_1 != null) {
				this.aClass23_1.method346(8, this.aClass81_Sub4_1);
			}
			if (this.aClass200_1 != null) {
				this.aClass23_1.method349(this.aClass200_1);
			}
			this.aClass23_1.method351(0);
			this.aBoolean52 = false;
			local11 = true;
		}
		if (!local11 || this.aClass23_1.method344()) {
			this.anInt584 = arg0;
			this.anInt587 = arg1;
			this.aClass37_Sub1_4.method766(-this.anInt584, this.anInt587 + this.anInt585 - local194);
			return true;
		}
		this.aClass37_Sub1_4.method782(this.aClass23_1);
		this.aBoolean50 = true;
		this.aBoolean49 = true;
		this.aBoolean52 = true;
		return false;
	}
}
