import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!of")
public final class Class154 {

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!qb;")
	private Class19_Sub3 aClass19_Sub3_4;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "Lclient!q;")
	private Class166 aClass166_1;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "I")
	private int anInt4513 = 0;

	@OriginalMember(owner = "client!of", name = "b", descriptor = "I")
	private int anInt4514 = -1;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "I")
	private int anInt4515 = -1;

	@OriginalMember(owner = "client!of", name = "g", descriptor = "I")
	private int anInt4516 = 0;

	@OriginalMember(owner = "client!of", name = "c", descriptor = "Lclient!eb;")
	private final Class42 aClass42_38 = new Class42();

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Z")
	private boolean aBoolean334 = true;

	@OriginalMember(owner = "client!of", name = "k", descriptor = "Z")
	private boolean aBoolean336 = true;

	@OriginalMember(owner = "client!of", name = "l", descriptor = "[Lclient!qb;")
	private Class19_Sub3[] aClass19_Sub3Array3 = new Class19_Sub3[2];

	@OriginalMember(owner = "client!of", name = "j", descriptor = "Z")
	private boolean aBoolean335 = false;

	@OriginalMember(owner = "client!of", name = "m", descriptor = "I")
	private int anInt4517 = 0;

	@OriginalMember(owner = "client!of", name = "p", descriptor = "I")
	private int anInt4518 = -1;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "Lclient!ks;")
	private final Class63_Sub1 aClass63_Sub1_31;

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!tj;")
	private Class197 aClass197_2;

	@OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Lclient!ks;)V")
	public Class154(@OriginalArg(0) Class63_Sub1 arg0) {
		this.aClass63_Sub1_31 = arg0;
		if (this.aClass63_Sub1_31.aBoolean254 && this.aClass63_Sub1_31.aBoolean263) {
			this.aClass197_2 = new Class197(this.aClass63_Sub1_31);
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "()V")
	private void method4162() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class1_Sub19 local11 = (Class1_Sub19) this.aClass42_38.method1543(); local11 != null; local11 = (Class1_Sub19) this.aClass42_38.method1551()) {
			local16 = local11.method5454();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method5456();
			local5 |= local11.method5453();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt4518) {
			this.anInt4518 = local45;
			this.aBoolean336 = true;
		}
		local16 = this.anInt4517 > 2 ? 2 : this.anInt4517;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean334 = this.aBoolean336 = true;
		}
		if (local5 != this.aBoolean335) {
			this.aBoolean335 = local5;
			this.aBoolean337 = true;
		}
		this.anInt4517 = local3;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "()V")
	public void method4163() {
		if (!this.method4169()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass63_Sub1_31.anOpengl1;
		this.aClass63_Sub1_31.method3326();
		this.aClass63_Sub1_31.method3374(0);
		this.aClass63_Sub1_31.method4651();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class1_Sub19 local35;
		for (@Pc(27) Class1_Sub19 local27 = (Class1_Sub19) this.aClass42_38.method1543(); local27 != null; local27 = local35) {
			local35 = (Class1_Sub19) this.aClass42_38.method1551();
			@Pc(39) int local39 = local27.method5456();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method5458(local41, this.aClass19_Sub3Array3[local19], this.aClass19_Sub3_4);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass63_Sub1_31.method3377(this.aClass197_2);
					this.aClass63_Sub1_31.method3347(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt4515);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt4513, this.anInt4516);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt4513, this.anInt4516 + this.anInt4515);
					local7.glTexCoord2f((float) this.anInt4514, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt4513 + this.anInt4514, this.anInt4516 + this.anInt4515);
					local7.glTexCoord2f((float) this.anInt4514, (float) this.anInt4515);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt4513 + this.anInt4514, this.anInt4516);
					local7.glEnd();
				} else {
					this.aClass197_2.method5357(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt4515);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt4515);
					local7.glTexCoord2f((float) this.anInt4514, (float) this.anInt4515);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt4514, this.anInt4515);
					local7.glTexCoord2f((float) this.anInt4514, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt4514, 0);
					local7.glEnd();
				}
				local27.method5459(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!gh;)Z")
	public boolean method4164(@OriginalArg(0) Class1_Sub19 arg0) {
		if (this.aClass197_2 != null) {
			if (arg0.method5455() || arg0.method5460()) {
				if (this.anInt4514 != -1 && this.anInt4515 != -1) {
					arg0.method5451(this.anInt4514, this.anInt4515);
				}
				arg0.aBoolean452 = true;
				this.aClass42_38.method1549(arg0);
				this.method4162();
				return true;
			}
			arg0.method5452();
		}
		return false;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!gh;Z)V")
	private void method4165(@OriginalArg(0) Class1_Sub19 arg0) {
		arg0.method5452();
		arg0.aBoolean452 = false;
		arg0.method6045();
		this.method4162();
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Lclient!gh;)V")
	public void method4166(@OriginalArg(0) Class1_Sub19 arg0) {
		this.method4165(arg0);
	}

	@OriginalMember(owner = "client!of", name = "c", descriptor = "()V")
	public void method4167() {
		if (this.aClass197_2 != null) {
			this.aClass197_2 = null;
			this.aClass19_Sub3Array3 = null;
			this.aClass166_1 = null;
			this.aClass19_Sub3_4 = null;
			this.aBoolean336 = true;
			this.aBoolean337 = true;
			this.aBoolean334 = true;
			if (!this.aClass42_38.method1538()) {
				for (@Pc(33) Class1 local33 = this.aClass42_38.method1543(); local33 != this.aClass42_38.aClass1_73; local33 = local33.aClass1_251) {
					((Class1_Sub19) local33).method5452();
				}
			}
		}
		this.anInt4514 = this.anInt4515 = -1;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)Z")
	public boolean method4168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass197_2 == null || this.aClass42_38.method1538()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt4514 != arg2 || this.anInt4515 != arg3) {
			this.anInt4514 = arg2;
			this.anInt4515 = arg3;
			for (@Pc(30) Class1 local30 = this.aClass42_38.method1543(); local30 != this.aClass42_38.aClass1_73; local30 = local30.aClass1_251) {
				((Class1_Sub19) local30).method5451(this.anInt4514, this.anInt4515);
			}
			this.aBoolean336 = true;
			this.aBoolean337 = true;
		}
		if (this.aBoolean337) {
			if (this.aClass166_1 != null) {
				this.aClass166_1.method4709();
				this.aClass166_1 = null;
			}
			if (this.aClass19_Sub3_4 != null) {
				this.aClass19_Sub3_4.method4234();
				this.aClass19_Sub3_4 = null;
			}
			if (this.aBoolean335) {
				this.aClass19_Sub3_4 = new Class19_Sub3(this.aClass63_Sub1_31, 34037, 6402, this.anInt4514, this.anInt4515);
			} else {
				this.aClass166_1 = new Class166(this.aClass63_Sub1_31, 6402, this.anInt4514, this.anInt4515);
			}
			this.aBoolean334 = true;
			this.aBoolean337 = false;
			local11 = true;
		}
		if (this.aBoolean336) {
			if (this.aClass19_Sub3Array3[0] != null) {
				this.aClass19_Sub3Array3[0].method4234();
				this.aClass19_Sub3Array3[0] = null;
			}
			if (this.aClass19_Sub3Array3[1] != null) {
				this.aClass19_Sub3Array3[1].method4234();
				this.aClass19_Sub3Array3[1] = null;
			}
			this.aClass19_Sub3Array3[0] = new Class19_Sub3(this.aClass63_Sub1_31, 34037, this.anInt4518, this.anInt4514, this.anInt4515);
			this.aClass19_Sub3Array3[1] = this.anInt4517 > 1 ? new Class19_Sub3(this.aClass63_Sub1_31, 34037, this.anInt4518, this.anInt4514, this.anInt4515) : null;
			this.aBoolean334 = true;
			this.aBoolean336 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass63_Sub1_31.method3350().method5354();
		this.aClass63_Sub1_31.method3329(this.aClass197_2);
		if (this.aBoolean334) {
			this.aClass197_2.method5358(0);
			this.aClass197_2.method5358(1);
			this.aClass197_2.method5358(8);
			if (this.aClass19_Sub3Array3[0] != null) {
				this.aClass197_2.method5360(0, this.aClass19_Sub3Array3[0]);
			}
			if (this.aClass19_Sub3Array3[1] != null) {
				this.aClass197_2.method5360(1, this.aClass19_Sub3Array3[1]);
			}
			if (this.aClass19_Sub3_4 != null) {
				this.aClass197_2.method5360(8, this.aClass19_Sub3_4);
			}
			if (this.aClass166_1 != null) {
				this.aClass197_2.method5363(this.aClass166_1);
			}
			this.aClass197_2.method5357(0);
			this.aBoolean334 = false;
			local11 = true;
		}
		if (!local11 || this.aClass197_2.method5356()) {
			this.anInt4513 = arg0;
			this.anInt4516 = arg1;
			this.aClass63_Sub1_31.method3347(-this.anInt4513, this.anInt4516 + this.anInt4515 - local194);
			return true;
		}
		this.aClass63_Sub1_31.method3377(this.aClass197_2);
		this.aBoolean336 = true;
		this.aBoolean337 = true;
		this.aBoolean334 = true;
		return false;
	}

	@OriginalMember(owner = "client!of", name = "d", descriptor = "()Z")
	private boolean method4169() {
		return this.aClass63_Sub1_31.method3350() == this.aClass197_2;
	}
}
