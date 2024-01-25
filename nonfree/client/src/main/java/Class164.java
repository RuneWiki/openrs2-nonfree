import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class164 {

	@OriginalMember(owner = "client!q", name = "m", descriptor = "Lclient!ir;")
	private Class44_Sub1 aClass44_Sub1_7;

	@OriginalMember(owner = "client!q", name = "o", descriptor = "Lclient!tm;")
	private Class195 aClass195_1;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "I")
	private int anInt5017 = -1;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	private int anInt5016 = 0;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "I")
	private int anInt5014 = -1;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	private int anInt5015 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "Lclient!ar;")
	private final Class14 aClass14_24 = new Class14();

	@OriginalMember(owner = "client!q", name = "h", descriptor = "Z")
	private boolean aBoolean415 = true;

	@OriginalMember(owner = "client!q", name = "n", descriptor = "Z")
	private boolean aBoolean418 = true;

	@OriginalMember(owner = "client!q", name = "l", descriptor = "[Lclient!ir;")
	private Class44_Sub1[] aClass44_Sub1Array2 = new Class44_Sub1[2];

	@OriginalMember(owner = "client!q", name = "i", descriptor = "Z")
	private boolean aBoolean416 = false;

	@OriginalMember(owner = "client!q", name = "j", descriptor = "I")
	private int anInt5018 = -1;

	@OriginalMember(owner = "client!q", name = "p", descriptor = "I")
	private int anInt5019 = 0;

	@OriginalMember(owner = "client!q", name = "k", descriptor = "Z")
	private boolean aBoolean417 = true;

	@OriginalMember(owner = "client!q", name = "d", descriptor = "Lclient!nf;")
	private final Class105_Sub1 aClass105_Sub1_32;

	@OriginalMember(owner = "client!q", name = "g", descriptor = "Lclient!ej;")
	private Class57 aClass57_4;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "(Lclient!nf;)V")
	public Class164(@OriginalArg(0) Class105_Sub1 arg0) {
		this.aClass105_Sub1_32 = arg0;
		if (this.aClass105_Sub1_32.aBoolean326 && this.aClass105_Sub1_32.aBoolean317) {
			this.aClass57_4 = new Class57(this.aClass105_Sub1_32);
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IIII)Z")
	public boolean method4348(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass57_4 == null || this.aClass14_24.method308()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5017 != arg2 || this.anInt5014 != arg3) {
			this.anInt5017 = arg2;
			this.anInt5014 = arg3;
			for (@Pc(30) Class1 local30 = this.aClass14_24.method302(); local30 != this.aClass14_24.aClass1_17; local30 = local30.aClass1_247) {
				((Class1_Sub15) local30).method1509(this.anInt5017, this.anInt5014);
			}
			this.aBoolean417 = true;
			this.aBoolean418 = true;
		}
		if (this.aBoolean418) {
			if (this.aClass195_1 != null) {
				this.aClass195_1.method5222();
				this.aClass195_1 = null;
			}
			if (this.aClass44_Sub1_7 != null) {
				this.aClass44_Sub1_7.method5577();
				this.aClass44_Sub1_7 = null;
			}
			if (this.aBoolean416) {
				this.aClass44_Sub1_7 = new Class44_Sub1(this.aClass105_Sub1_32, 34037, 6402, this.anInt5017, this.anInt5014);
			} else {
				this.aClass195_1 = new Class195(this.aClass105_Sub1_32, 6402, this.anInt5017, this.anInt5014);
			}
			this.aBoolean415 = true;
			this.aBoolean418 = false;
			local11 = true;
		}
		if (this.aBoolean417) {
			if (this.aClass44_Sub1Array2[0] != null) {
				this.aClass44_Sub1Array2[0].method5577();
				this.aClass44_Sub1Array2[0] = null;
			}
			if (this.aClass44_Sub1Array2[1] != null) {
				this.aClass44_Sub1Array2[1].method5577();
				this.aClass44_Sub1Array2[1] = null;
			}
			this.aClass44_Sub1Array2[0] = new Class44_Sub1(this.aClass105_Sub1_32, 34037, this.anInt5018, this.anInt5017, this.anInt5014);
			this.aClass44_Sub1Array2[1] = this.anInt5019 > 1 ? new Class44_Sub1(this.aClass105_Sub1_32, 34037, this.anInt5018, this.anInt5017, this.anInt5014) : null;
			this.aBoolean415 = true;
			this.aBoolean417 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass105_Sub1_32.method3580().method3559();
		this.aClass105_Sub1_32.method3614(this.aClass57_4);
		if (this.aBoolean415) {
			this.aClass57_4.method1238(0);
			this.aClass57_4.method1238(1);
			this.aClass57_4.method1238(8);
			if (this.aClass44_Sub1Array2[0] != null) {
				this.aClass57_4.method1241(0, this.aClass44_Sub1Array2[0]);
			}
			if (this.aClass44_Sub1Array2[1] != null) {
				this.aClass57_4.method1241(1, this.aClass44_Sub1Array2[1]);
			}
			if (this.aClass44_Sub1_7 != null) {
				this.aClass57_4.method1241(8, this.aClass44_Sub1_7);
			}
			if (this.aClass195_1 != null) {
				this.aClass57_4.method1240(this.aClass195_1);
			}
			this.aClass57_4.method1236(0);
			this.aBoolean415 = false;
			local11 = true;
		}
		if (!local11 || this.aClass57_4.method1235()) {
			this.anInt5016 = arg0;
			this.anInt5015 = arg1;
			this.aClass105_Sub1_32.method3612(-this.anInt5016, this.anInt5015 + this.anInt5014 - local194);
			return true;
		}
		this.aClass105_Sub1_32.method3629(this.aClass57_4);
		this.aBoolean417 = true;
		this.aBoolean418 = true;
		this.aBoolean415 = true;
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!sk;)V")
	public void method4349(@OriginalArg(0) Class1_Sub15 arg0) {
		this.method4351(arg0);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "()Z")
	private boolean method4350() {
		return this.aClass105_Sub1_32.method3580() == this.aClass57_4;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!sk;Z)V")
	private void method4351(@OriginalArg(0) Class1_Sub15 arg0) {
		arg0.method1507();
		arg0.aBoolean135 = false;
		arg0.method5796();
		this.method4352();
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "()V")
	private void method4352() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class1_Sub15 local11 = (Class1_Sub15) this.aClass14_24.method302(); local11 != null; local11 = (Class1_Sub15) this.aClass14_24.method313()) {
			local16 = local11.method1506();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method1510();
			local5 |= local11.method1503();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5018) {
			this.anInt5018 = local45;
			this.aBoolean417 = true;
		}
		local16 = this.anInt5019 > 2 ? 2 : this.anInt5019;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean415 = this.aBoolean417 = true;
		}
		if (local5 != this.aBoolean416) {
			this.aBoolean416 = local5;
			this.aBoolean418 = true;
		}
		this.anInt5019 = local3;
	}

	@OriginalMember(owner = "client!q", name = "c", descriptor = "()V")
	public void method4353() {
		if (!this.method4350()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass105_Sub1_32.anOpengl1;
		this.aClass105_Sub1_32.method3592();
		this.aClass105_Sub1_32.method3603(0);
		this.aClass105_Sub1_32.method4233();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class1_Sub15 local35;
		for (@Pc(27) Class1_Sub15 local27 = (Class1_Sub15) this.aClass14_24.method302(); local27 != null; local27 = local35) {
			local35 = (Class1_Sub15) this.aClass14_24.method313();
			@Pc(39) int local39 = local27.method1510();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method1512(local41, this.aClass44_Sub1Array2[local19], this.aClass44_Sub1_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass105_Sub1_32.method3629(this.aClass57_4);
					this.aClass105_Sub1_32.method3612(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5014);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5016, this.anInt5015);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5016, this.anInt5015 + this.anInt5014);
					local7.glTexCoord2f((float) this.anInt5017, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5016 + this.anInt5017, this.anInt5015 + this.anInt5014);
					local7.glTexCoord2f((float) this.anInt5017, (float) this.anInt5014);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5016 + this.anInt5017, this.anInt5015);
					local7.glEnd();
				} else {
					this.aClass57_4.method1236(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5014);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5014);
					local7.glTexCoord2f((float) this.anInt5017, (float) this.anInt5014);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5017, this.anInt5014);
					local7.glTexCoord2f((float) this.anInt5017, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5017, 0);
					local7.glEnd();
				}
				local27.method1508(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!q", name = "d", descriptor = "()V")
	public void method4354() {
		if (this.aClass57_4 != null) {
			this.aClass57_4 = null;
			this.aClass44_Sub1Array2 = null;
			this.aClass195_1 = null;
			this.aClass44_Sub1_7 = null;
			this.aBoolean417 = true;
			this.aBoolean418 = true;
			this.aBoolean415 = true;
			if (!this.aClass14_24.method308()) {
				for (@Pc(33) Class1 local33 = this.aClass14_24.method302(); local33 != this.aClass14_24.aClass1_17; local33 = local33.aClass1_247) {
					((Class1_Sub15) local33).method1507();
				}
			}
		}
		this.anInt5017 = this.anInt5014 = -1;
	}

	@OriginalMember(owner = "client!q", name = "b", descriptor = "(Lclient!sk;)Z")
	public boolean method4355(@OriginalArg(0) Class1_Sub15 arg0) {
		if (this.aClass57_4 != null) {
			if (arg0.method1511() || arg0.method1505()) {
				if (this.anInt5017 != -1 && this.anInt5014 != -1) {
					arg0.method1509(this.anInt5017, this.anInt5014);
				}
				arg0.aBoolean135 = true;
				this.aClass14_24.method300(arg0);
				this.method4352();
				return true;
			}
			arg0.method1507();
		}
		return false;
	}
}
