import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class111 {

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "Lclient!hn;")
	private Class60_Sub4 aClass60_Sub4_3;

	@OriginalMember(owner = "client!kc", name = "m", descriptor = "Lclient!fb;")
	private Class67 aClass67_1;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private int anInt3238 = -1;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
	private int anInt3241 = 0;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "I")
	private int anInt3239 = -1;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
	private int anInt3240 = 0;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "Lclient!jm;")
	private final Class103 aClass103_77 = new Class103();

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "Z")
	private boolean aBoolean249 = true;

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
	private int anInt3242 = -1;

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
	private int anInt3243 = 0;

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "Z")
	private boolean aBoolean248 = false;

	@OriginalMember(owner = "client!kc", name = "n", descriptor = "[Lclient!hn;")
	private Class60_Sub4[] aClass60_Sub4Array4 = new Class60_Sub4[2];

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
	private boolean aBoolean251 = true;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "Z")
	private boolean aBoolean250 = true;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_25;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!qd;")
	private Class167 aClass167_3;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lclient!mm;)V")
	public Class111(@OriginalArg(0) Class55_Sub1 arg0) {
		this.aClass55_Sub1_25 = arg0;
		if (this.aClass55_Sub1_25.aBoolean309 && this.aClass55_Sub1_25.aBoolean315) {
			this.aClass167_3 = new Class167(this.aClass55_Sub1_25);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!uc;Z)V")
	private void method2873(@OriginalArg(0) Class5_Sub5 arg0) {
		arg0.method235();
		arg0.aBoolean23 = false;
		arg0.method6005();
		this.method2878();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()Z")
	private boolean method2874() {
		return this.aClass55_Sub1_25.method3708() == this.aClass167_3;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	public void method2875() {
		if (this.aClass167_3 != null) {
			this.aClass167_3 = null;
			this.aClass60_Sub4Array4 = null;
			this.aClass67_1 = null;
			this.aClass60_Sub4_3 = null;
			this.aBoolean250 = true;
			this.aBoolean251 = true;
			this.aBoolean249 = true;
			if (!this.aClass103_77.method2750()) {
				for (@Pc(33) Class5 local33 = this.aClass103_77.method2756(); local33 != this.aClass103_77.aClass5_114; local33 = local33.aClass5_251) {
					((Class5_Sub5) local33).method235();
				}
			}
		}
		this.anInt3239 = this.anInt3238 = -1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!uc;)Z")
	public boolean method2876(@OriginalArg(0) Class5_Sub5 arg0) {
		if (this.aClass167_3 != null) {
			if (arg0.method234() || arg0.method232()) {
				if (this.anInt3239 != -1 && this.anInt3238 != -1) {
					arg0.method236(this.anInt3239, this.anInt3238);
				}
				arg0.aBoolean23 = true;
				this.aClass103_77.method2745(arg0);
				this.method2878();
				return true;
			}
			arg0.method235();
		}
		return false;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Lclient!uc;)V")
	public void method2877(@OriginalArg(0) Class5_Sub5 arg0) {
		this.method2873(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	private void method2878() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class5_Sub5 local11 = (Class5_Sub5) this.aClass103_77.method2756(); local11 != null; local11 = (Class5_Sub5) this.aClass103_77.method2748()) {
			local16 = local11.method239();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method230();
			local5 |= local11.method233();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt3242) {
			this.anInt3242 = local45;
			this.aBoolean250 = true;
		}
		local16 = this.anInt3243 > 2 ? 2 : this.anInt3243;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean249 = this.aBoolean250 = true;
		}
		if (local5 != this.aBoolean248) {
			this.aBoolean248 = local5;
			this.aBoolean251 = true;
		}
		this.anInt3243 = local3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIII)Z")
	public boolean method2879(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass167_3 == null || this.aClass103_77.method2750()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt3239 != arg2 || this.anInt3238 != arg3) {
			this.anInt3239 = arg2;
			this.anInt3238 = arg3;
			for (@Pc(30) Class5 local30 = this.aClass103_77.method2756(); local30 != this.aClass103_77.aClass5_114; local30 = local30.aClass5_251) {
				((Class5_Sub5) local30).method236(this.anInt3239, this.anInt3238);
			}
			this.aBoolean250 = true;
			this.aBoolean251 = true;
		}
		if (this.aBoolean251) {
			if (this.aClass67_1 != null) {
				this.aClass67_1.method1502();
				this.aClass67_1 = null;
			}
			if (this.aClass60_Sub4_3 != null) {
				this.aClass60_Sub4_3.method5845();
				this.aClass60_Sub4_3 = null;
			}
			if (this.aBoolean248) {
				this.aClass60_Sub4_3 = new Class60_Sub4(this.aClass55_Sub1_25, 34037, 6402, this.anInt3239, this.anInt3238);
			} else {
				this.aClass67_1 = new Class67(this.aClass55_Sub1_25, 6402, this.anInt3239, this.anInt3238);
			}
			this.aBoolean249 = true;
			this.aBoolean251 = false;
			local11 = true;
		}
		if (this.aBoolean250) {
			if (this.aClass60_Sub4Array4[0] != null) {
				this.aClass60_Sub4Array4[0].method5845();
				this.aClass60_Sub4Array4[0] = null;
			}
			if (this.aClass60_Sub4Array4[1] != null) {
				this.aClass60_Sub4Array4[1].method5845();
				this.aClass60_Sub4Array4[1] = null;
			}
			this.aClass60_Sub4Array4[0] = new Class60_Sub4(this.aClass55_Sub1_25, 34037, this.anInt3242, this.anInt3239, this.anInt3238);
			this.aClass60_Sub4Array4[1] = this.anInt3243 > 1 ? new Class60_Sub4(this.aClass55_Sub1_25, 34037, this.anInt3242, this.anInt3239, this.anInt3238) : null;
			this.aBoolean249 = true;
			this.aBoolean250 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass55_Sub1_25.method3708().method4538();
		this.aClass55_Sub1_25.method3685(this.aClass167_3);
		if (this.aBoolean249) {
			this.aClass167_3.method4544(0);
			this.aClass167_3.method4544(1);
			this.aClass167_3.method4544(8);
			if (this.aClass60_Sub4Array4[0] != null) {
				this.aClass167_3.method4542(0, this.aClass60_Sub4Array4[0]);
			}
			if (this.aClass60_Sub4Array4[1] != null) {
				this.aClass167_3.method4542(1, this.aClass60_Sub4Array4[1]);
			}
			if (this.aClass60_Sub4_3 != null) {
				this.aClass167_3.method4542(8, this.aClass60_Sub4_3);
			}
			if (this.aClass67_1 != null) {
				this.aClass167_3.method4540(this.aClass67_1);
			}
			this.aClass167_3.method4543(0);
			this.aBoolean249 = false;
			local11 = true;
		}
		if (!local11 || this.aClass167_3.method4546()) {
			this.anInt3241 = arg0;
			this.anInt3240 = arg1;
			this.aClass55_Sub1_25.method3706(-this.anInt3241, this.anInt3240 + this.anInt3238 - local194);
			return true;
		}
		this.aClass55_Sub1_25.method3688(this.aClass167_3);
		this.aBoolean250 = true;
		this.aBoolean251 = true;
		this.aBoolean249 = true;
		return false;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	public void method2880() {
		if (!this.method2874()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass55_Sub1_25.anOpengl1;
		this.aClass55_Sub1_25.method3670();
		this.aClass55_Sub1_25.method3692(0);
		this.aClass55_Sub1_25.method5186();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class5_Sub5 local35;
		for (@Pc(27) Class5_Sub5 local27 = (Class5_Sub5) this.aClass103_77.method2756(); local27 != null; local27 = local35) {
			local35 = (Class5_Sub5) this.aClass103_77.method2748();
			@Pc(39) int local39 = local27.method230();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method237(local41, this.aClass60_Sub4Array4[local19], this.aClass60_Sub4_3);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass55_Sub1_25.method3688(this.aClass167_3);
					this.aClass55_Sub1_25.method3706(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt3238);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt3241, this.anInt3240);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt3241, this.anInt3240 + this.anInt3238);
					local7.glTexCoord2f((float) this.anInt3239, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt3241 + this.anInt3239, this.anInt3240 + this.anInt3238);
					local7.glTexCoord2f((float) this.anInt3239, (float) this.anInt3238);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt3241 + this.anInt3239, this.anInt3240);
					local7.glEnd();
				} else {
					this.aClass167_3.method4543(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt3238);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt3238);
					local7.glTexCoord2f((float) this.anInt3239, (float) this.anInt3238);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt3239, this.anInt3238);
					local7.glTexCoord2f((float) this.anInt3239, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt3239, 0);
					local7.glEnd();
				}
				local27.method231(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}
}
