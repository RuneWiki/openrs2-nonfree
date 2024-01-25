import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wp")
public final class Class249 {

	@OriginalMember(owner = "client!wp", name = "h", descriptor = "Lclient!tr;")
	private Class81_Sub2 aClass81_Sub2_7;

	@OriginalMember(owner = "client!wp", name = "k", descriptor = "Lclient!sn;")
	private Class211 aClass211_1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	private int anInt7082 = -1;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	private int anInt7083 = -1;

	@OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
	private int anInt7084 = 0;

	@OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
	private int anInt7085 = 0;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!vf;")
	private final Class238 aClass238_43 = new Class238();

	@OriginalMember(owner = "client!wp", name = "i", descriptor = "Z")
	private boolean aBoolean503 = true;

	@OriginalMember(owner = "client!wp", name = "o", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "client!wp", name = "p", descriptor = "[Lclient!tr;")
	private Class81_Sub2[] aClass81_Sub2Array4 = new Class81_Sub2[2];

	@OriginalMember(owner = "client!wp", name = "n", descriptor = "I")
	private int anInt7087 = 0;

	@OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
	private int anInt7086 = -1;

	@OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
	private boolean aBoolean504 = true;

	@OriginalMember(owner = "client!wp", name = "m", descriptor = "Z")
	private boolean aBoolean505 = true;

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_42;

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "Lclient!js;")
	private Class121 aClass121_4;

	@OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(Lclient!ic;)V")
	public Class249(@OriginalArg(0) Class48_Sub2 arg0) {
		this.aClass48_Sub2_42 = arg0;
		if (this.aClass48_Sub2_42.aBoolean229 && this.aClass48_Sub2_42.aBoolean221) {
			this.aClass121_4 = new Class121(this.aClass48_Sub2_42);
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "()V")
	private void method6096() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub21 local11 = (Class2_Sub21) this.aClass238_43.method5795(); local11 != null; local11 = (Class2_Sub21) this.aClass238_43.method5799()) {
			local16 = local11.method2934();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method2931();
			local5 |= local11.method2932();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt7086) {
			this.anInt7086 = local45;
			this.aBoolean504 = true;
		}
		local16 = this.anInt7087 > 2 ? 2 : this.anInt7087;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean505 = this.aBoolean504 = true;
		}
		if (local5 != this.aBoolean506) {
			this.aBoolean506 = local5;
			this.aBoolean503 = true;
		}
		this.anInt7087 = local3;
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "()V")
	public void method6097() {
		if (!this.method6102()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass48_Sub2_42.anOpengl2;
		this.aClass48_Sub2_42.method2576();
		this.aClass48_Sub2_42.method2569(0);
		this.aClass48_Sub2_42.method2505();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub21 local35;
		for (@Pc(27) Class2_Sub21 local27 = (Class2_Sub21) this.aClass238_43.method5795(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub21) this.aClass238_43.method5799();
			@Pc(39) int local39 = local27.method2931();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method2937(local41, this.aClass81_Sub2Array4[local19], this.aClass81_Sub2_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass48_Sub2_42.method2608(this.aClass121_4);
					this.aClass48_Sub2_42.method2595(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt7082);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt7084, this.anInt7085);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt7084, this.anInt7085 + this.anInt7082);
					local7.glTexCoord2f((float) this.anInt7083, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt7084 + this.anInt7083, this.anInt7085 + this.anInt7082);
					local7.glTexCoord2f((float) this.anInt7083, (float) this.anInt7082);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt7084 + this.anInt7083, this.anInt7085);
					local7.glEnd();
				} else {
					this.aClass121_4.method3030(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt7082);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt7082);
					local7.glTexCoord2f((float) this.anInt7083, (float) this.anInt7082);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt7083, this.anInt7082);
					local7.glTexCoord2f((float) this.anInt7083, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt7083, 0);
					local7.glEnd();
				}
				local27.method2933(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)Z")
	public boolean method6098(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass121_4 == null || this.aClass238_43.method5805()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt7083 != arg2 || this.anInt7082 != arg3) {
			this.anInt7083 = arg2;
			this.anInt7082 = arg3;
			for (@Pc(30) Class2 local30 = this.aClass238_43.method5795(); local30 != this.aClass238_43.aClass2_225; local30 = local30.aClass2_244) {
				((Class2_Sub21) local30).method2938(this.anInt7083, this.anInt7082);
			}
			this.aBoolean504 = true;
			this.aBoolean503 = true;
		}
		if (this.aBoolean503) {
			if (this.aClass211_1 != null) {
				this.aClass211_1.method5236();
				this.aClass211_1 = null;
			}
			if (this.aClass81_Sub2_7 != null) {
				this.aClass81_Sub2_7.method4339();
				this.aClass81_Sub2_7 = null;
			}
			if (this.aBoolean506) {
				this.aClass81_Sub2_7 = new Class81_Sub2(this.aClass48_Sub2_42, 34037, 6402, this.anInt7083, this.anInt7082);
			} else {
				this.aClass211_1 = new Class211(this.aClass48_Sub2_42, 6402, this.anInt7083, this.anInt7082);
			}
			this.aBoolean505 = true;
			this.aBoolean503 = false;
			local11 = true;
		}
		if (this.aBoolean504) {
			if (this.aClass81_Sub2Array4[0] != null) {
				this.aClass81_Sub2Array4[0].method4339();
				this.aClass81_Sub2Array4[0] = null;
			}
			if (this.aClass81_Sub2Array4[1] != null) {
				this.aClass81_Sub2Array4[1].method4339();
				this.aClass81_Sub2Array4[1] = null;
			}
			this.aClass81_Sub2Array4[0] = new Class81_Sub2(this.aClass48_Sub2_42, 34037, this.anInt7086, this.anInt7083, this.anInt7082);
			this.aClass81_Sub2Array4[1] = this.anInt7087 > 1 ? new Class81_Sub2(this.aClass48_Sub2_42, 34037, this.anInt7086, this.anInt7083, this.anInt7082) : null;
			this.aBoolean505 = true;
			this.aBoolean504 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass48_Sub2_42.method2560().method3022();
		this.aClass48_Sub2_42.method2556(this.aClass121_4);
		if (this.aBoolean505) {
			this.aClass121_4.method3024(0);
			this.aClass121_4.method3024(1);
			this.aClass121_4.method3024(8);
			if (this.aClass81_Sub2Array4[0] != null) {
				this.aClass121_4.method3029(0, this.aClass81_Sub2Array4[0]);
			}
			if (this.aClass81_Sub2Array4[1] != null) {
				this.aClass121_4.method3029(1, this.aClass81_Sub2Array4[1]);
			}
			if (this.aClass81_Sub2_7 != null) {
				this.aClass121_4.method3029(8, this.aClass81_Sub2_7);
			}
			if (this.aClass211_1 != null) {
				this.aClass121_4.method3025(this.aClass211_1);
			}
			this.aClass121_4.method3030(0);
			this.aBoolean505 = false;
			local11 = true;
		}
		if (!local11 || this.aClass121_4.method3028()) {
			this.anInt7084 = arg0;
			this.anInt7085 = arg1;
			this.aClass48_Sub2_42.method2595(-this.anInt7084, this.anInt7085 + this.anInt7082 - local194);
			return true;
		}
		this.aClass48_Sub2_42.method2608(this.aClass121_4);
		this.aBoolean504 = true;
		this.aBoolean503 = true;
		this.aBoolean505 = true;
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!jg;)V")
	public void method6099(@OriginalArg(0) Class2_Sub21 arg0) {
		this.method6100(arg0);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!jg;Z)V")
	private void method6100(@OriginalArg(0) Class2_Sub21 arg0) {
		arg0.method2929();
		arg0.aBoolean258 = false;
		arg0.method6130();
		this.method6096();
	}

	@OriginalMember(owner = "client!wp", name = "b", descriptor = "(Lclient!jg;)Z")
	public boolean method6101(@OriginalArg(0) Class2_Sub21 arg0) {
		if (this.aClass121_4 != null) {
			if (arg0.method2930() || arg0.method2935()) {
				if (this.anInt7083 != -1 && this.anInt7082 != -1) {
					arg0.method2938(this.anInt7083, this.anInt7082);
				}
				arg0.aBoolean258 = true;
				this.aClass238_43.method5796(arg0);
				this.method6096();
				return true;
			}
			arg0.method2929();
		}
		return false;
	}

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "()Z")
	private boolean method6102() {
		return this.aClass48_Sub2_42.method2560() == this.aClass121_4;
	}

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "()V")
	public void method6103() {
		if (this.aClass121_4 != null) {
			this.aClass121_4 = null;
			this.aClass81_Sub2Array4 = null;
			this.aClass211_1 = null;
			this.aClass81_Sub2_7 = null;
			this.aBoolean504 = true;
			this.aBoolean503 = true;
			this.aBoolean505 = true;
			if (!this.aClass238_43.method5805()) {
				for (@Pc(33) Class2 local33 = this.aClass238_43.method5795(); local33 != this.aClass238_43.aClass2_225; local33 = local33.aClass2_244) {
					((Class2_Sub21) local33).method2929();
				}
			}
		}
		this.anInt7083 = this.anInt7082 = -1;
	}
}
