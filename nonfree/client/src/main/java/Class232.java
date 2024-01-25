import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class232 {

	@OriginalMember(owner = "client!ur", name = "j", descriptor = "Lclient!ai;")
	private Class7_Sub1 aClass7_Sub1_7;

	@OriginalMember(owner = "client!ur", name = "p", descriptor = "Lclient!mn;")
	private Class152 aClass152_1;

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "I")
	private int anInt6309 = -1;

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
	private int anInt6310 = 0;

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
	private int anInt6308 = 0;

	@OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
	private int anInt6311 = -1;

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "Lclient!sm;")
	private final Class210 aClass210_46 = new Class210();

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Z")
	private boolean aBoolean470 = false;

	@OriginalMember(owner = "client!ur", name = "l", descriptor = "I")
	private int anInt6313 = 0;

	@OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
	private int anInt6312 = -1;

	@OriginalMember(owner = "client!ur", name = "o", descriptor = "Z")
	private boolean aBoolean472 = true;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "Z")
	private boolean aBoolean471 = true;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "[Lclient!ai;")
	private Class7_Sub1[] aClass7_Sub1Array4 = new Class7_Sub1[2];

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Z")
	private boolean aBoolean469 = true;

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "Lclient!qi;")
	private final Class82_Sub2 aClass82_Sub2_40;

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "Lclient!ct;")
	private Class42 aClass42_4;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!qi;)V")
	public Class232(@OriginalArg(0) Class82_Sub2 arg0) {
		this.aClass82_Sub2_40 = arg0;
		if (this.aClass82_Sub2_40.aBoolean406 && this.aClass82_Sub2_40.aBoolean404) {
			this.aClass42_4 = new Class42(this.aClass82_Sub2_40);
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "()V")
	public void method5440() {
		if (this.aClass42_4 != null) {
			this.aClass42_4 = null;
			this.aClass7_Sub1Array4 = null;
			this.aClass152_1 = null;
			this.aClass7_Sub1_7 = null;
			this.aBoolean469 = true;
			this.aBoolean472 = true;
			this.aBoolean471 = true;
			if (!this.aClass210_46.method5040()) {
				for (@Pc(33) Class2 local33 = this.aClass210_46.method5035(); local33 != this.aClass210_46.aClass2_199; local33 = local33.aClass2_244) {
					((Class2_Sub28) local33).method3955();
				}
			}
		}
		this.anInt6311 = this.anInt6309 = -1;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!wn;)V")
	public void method5441(@OriginalArg(0) Class2_Sub28 arg0) {
		this.method5443(arg0);
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "()V")
	public void method5442() {
		if (!this.method5447()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass82_Sub2_40.anOpengl2;
		this.aClass82_Sub2_40.method4626();
		this.aClass82_Sub2_40.method4575(0);
		this.aClass82_Sub2_40.method4512();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub28 local35;
		for (@Pc(27) Class2_Sub28 local27 = (Class2_Sub28) this.aClass210_46.method5035(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub28) this.aClass210_46.method5037();
			@Pc(39) int local39 = local27.method3957();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method3951(local41, this.aClass7_Sub1Array4[local19], this.aClass7_Sub1_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass82_Sub2_40.method4579(this.aClass42_4);
					this.aClass82_Sub2_40.method4572(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt6309);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt6308, this.anInt6310);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt6308, this.anInt6310 + this.anInt6309);
					local7.glTexCoord2f((float) this.anInt6311, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt6308 + this.anInt6311, this.anInt6310 + this.anInt6309);
					local7.glTexCoord2f((float) this.anInt6311, (float) this.anInt6309);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt6308 + this.anInt6311, this.anInt6310);
					local7.glEnd();
				} else {
					this.aClass42_4.method928(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt6309);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt6309);
					local7.glTexCoord2f((float) this.anInt6311, (float) this.anInt6309);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt6311, this.anInt6309);
					local7.glTexCoord2f((float) this.anInt6311, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt6311, 0);
					local7.glEnd();
				}
				local27.method3958(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lclient!wn;Z)V")
	private void method5443(@OriginalArg(0) Class2_Sub28 arg0) {
		arg0.method3955();
		arg0.aBoolean334 = false;
		arg0.method5745();
		this.method5445();
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(Lclient!wn;)Z")
	public boolean method5444(@OriginalArg(0) Class2_Sub28 arg0) {
		if (this.aClass42_4 != null) {
			if (arg0.method3952() || arg0.method3950()) {
				if (this.anInt6311 != -1 && this.anInt6309 != -1) {
					arg0.method3954(this.anInt6311, this.anInt6309);
				}
				arg0.aBoolean334 = true;
				this.aClass210_46.method5044(arg0);
				this.method5445();
				return true;
			}
			arg0.method3955();
		}
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "()V")
	private void method5445() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass210_46.method5035(); local11 != null; local11 = (Class2_Sub28) this.aClass210_46.method5037()) {
			local16 = local11.method3953();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method3957();
			local5 |= local11.method3956();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt6312) {
			this.anInt6312 = local45;
			this.aBoolean469 = true;
		}
		local16 = this.anInt6313 > 2 ? 2 : this.anInt6313;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean471 = this.aBoolean469 = true;
		}
		if (local5 != this.aBoolean470) {
			this.aBoolean470 = local5;
			this.aBoolean472 = true;
		}
		this.anInt6313 = local3;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIII)Z")
	public boolean method5446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass42_4 == null || this.aClass210_46.method5040()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt6311 != arg2 || this.anInt6309 != arg3) {
			this.anInt6311 = arg2;
			this.anInt6309 = arg3;
			for (@Pc(30) Class2 local30 = this.aClass210_46.method5035(); local30 != this.aClass210_46.aClass2_199; local30 = local30.aClass2_244) {
				((Class2_Sub28) local30).method3954(this.anInt6311, this.anInt6309);
			}
			this.aBoolean469 = true;
			this.aBoolean472 = true;
		}
		if (this.aBoolean472) {
			if (this.aClass152_1 != null) {
				this.aClass152_1.method3714();
				this.aClass152_1 = null;
			}
			if (this.aClass7_Sub1_7 != null) {
				this.aClass7_Sub1_7.method4732();
				this.aClass7_Sub1_7 = null;
			}
			if (this.aBoolean470) {
				this.aClass7_Sub1_7 = new Class7_Sub1(this.aClass82_Sub2_40, 34037, 6402, this.anInt6311, this.anInt6309);
			} else {
				this.aClass152_1 = new Class152(this.aClass82_Sub2_40, 6402, this.anInt6311, this.anInt6309);
			}
			this.aBoolean471 = true;
			this.aBoolean472 = false;
			local11 = true;
		}
		if (this.aBoolean469) {
			if (this.aClass7_Sub1Array4[0] != null) {
				this.aClass7_Sub1Array4[0].method4732();
				this.aClass7_Sub1Array4[0] = null;
			}
			if (this.aClass7_Sub1Array4[1] != null) {
				this.aClass7_Sub1Array4[1].method4732();
				this.aClass7_Sub1Array4[1] = null;
			}
			this.aClass7_Sub1Array4[0] = new Class7_Sub1(this.aClass82_Sub2_40, 34037, this.anInt6312, this.anInt6311, this.anInt6309);
			this.aClass7_Sub1Array4[1] = this.anInt6313 > 1 ? new Class7_Sub1(this.aClass82_Sub2_40, 34037, this.anInt6312, this.anInt6311, this.anInt6309) : null;
			this.aBoolean471 = true;
			this.aBoolean469 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass82_Sub2_40.method4607().method4559();
		this.aClass82_Sub2_40.method4602(this.aClass42_4);
		if (this.aBoolean471) {
			this.aClass42_4.method927(0);
			this.aClass42_4.method927(1);
			this.aClass42_4.method927(8);
			if (this.aClass7_Sub1Array4[0] != null) {
				this.aClass42_4.method929(0, this.aClass7_Sub1Array4[0]);
			}
			if (this.aClass7_Sub1Array4[1] != null) {
				this.aClass42_4.method929(1, this.aClass7_Sub1Array4[1]);
			}
			if (this.aClass7_Sub1_7 != null) {
				this.aClass42_4.method929(8, this.aClass7_Sub1_7);
			}
			if (this.aClass152_1 != null) {
				this.aClass42_4.method930(this.aClass152_1);
			}
			this.aClass42_4.method928(0);
			this.aBoolean471 = false;
			local11 = true;
		}
		if (!local11 || this.aClass42_4.method933()) {
			this.anInt6308 = arg0;
			this.anInt6310 = arg1;
			this.aClass82_Sub2_40.method4572(-this.anInt6308, this.anInt6310 + this.anInt6309 - local194);
			return true;
		}
		this.aClass82_Sub2_40.method4579(this.aClass42_4);
		this.aBoolean469 = true;
		this.aBoolean472 = true;
		this.aBoolean471 = true;
		return false;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "()Z")
	private boolean method5447() {
		return this.aClass82_Sub2_40.method4607() == this.aClass42_4;
	}
}
