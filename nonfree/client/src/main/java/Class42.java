import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!df")
public final class Class42 {

	@OriginalMember(owner = "client!df", name = "l", descriptor = "Lclient!rj;")
	private Class124_Sub2 aClass124_Sub2_4;

	@OriginalMember(owner = "client!df", name = "o", descriptor = "Lclient!to;")
	private Class190 aClass190_1;

	@OriginalMember(owner = "client!df", name = "g", descriptor = "I")
	private int anInt1165 = 0;

	@OriginalMember(owner = "client!df", name = "b", descriptor = "I")
	private int anInt1162 = 0;

	@OriginalMember(owner = "client!df", name = "e", descriptor = "I")
	private int anInt1164 = -1;

	@OriginalMember(owner = "client!df", name = "d", descriptor = "I")
	private int anInt1163 = -1;

	@OriginalMember(owner = "client!df", name = "a", descriptor = "Lclient!wq;")
	private final Class216 aClass216_18 = new Class216();

	@OriginalMember(owner = "client!df", name = "h", descriptor = "I")
	private int anInt1166 = -1;

	@OriginalMember(owner = "client!df", name = "j", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!df", name = "i", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!df", name = "k", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!df", name = "n", descriptor = "I")
	private int anInt1167 = 0;

	@OriginalMember(owner = "client!df", name = "p", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!df", name = "m", descriptor = "[Lclient!rj;")
	private Class124_Sub2[] aClass124_Sub2Array1 = new Class124_Sub2[2];

	@OriginalMember(owner = "client!df", name = "c", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_5;

	@OriginalMember(owner = "client!df", name = "f", descriptor = "Lclient!mg;")
	private Class128 aClass128_2;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class42(@OriginalArg(0) Class4_Sub1 arg0) {
		this.aClass4_Sub1_5 = arg0;
		if (this.aClass4_Sub1_5.aBoolean45 && this.aClass4_Sub1_5.aBoolean48) {
			this.aClass128_2 = new Class128(this.aClass4_Sub1_5);
		}
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "()Z")
	private boolean method1232() {
		return this.aClass4_Sub1_5.method569() == this.aClass128_2;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "()V")
	public void method1233() {
		if (this.aClass128_2 != null) {
			this.aClass128_2 = null;
			this.aClass124_Sub2Array1 = null;
			this.aClass190_1 = null;
			this.aClass124_Sub2_4 = null;
			this.aBoolean106 = true;
			this.aBoolean107 = true;
			this.aBoolean108 = true;
			if (!this.aClass216_18.method5990()) {
				for (@Pc(33) Class2 local33 = this.aClass216_18.method5992(); local33 != this.aClass216_18.aClass2_251; local33 = local33.aClass2_250) {
					((Class2_Sub34) local33).method4352();
				}
			}
		}
		this.anInt1164 = this.anInt1163 = -1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!pg;)Z")
	public boolean method1234(@OriginalArg(0) Class2_Sub34 arg0) {
		if (this.aClass128_2 != null) {
			if (arg0.method4360() || arg0.method4359()) {
				if (this.anInt1164 != -1 && this.anInt1163 != -1) {
					arg0.method4357(this.anInt1164, this.anInt1163);
				}
				arg0.aBoolean438 = true;
				this.aClass216_18.method5995(arg0);
				this.method1235();
				return true;
			}
			arg0.method4352();
		}
		return false;
	}

	@OriginalMember(owner = "client!df", name = "c", descriptor = "()V")
	private void method1235() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class2_Sub34 local11 = (Class2_Sub34) this.aClass216_18.method5992(); local11 != null; local11 = (Class2_Sub34) this.aClass216_18.method6000()) {
			local16 = local11.method4355();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method4351();
			local5 |= local11.method4358();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt1166) {
			this.anInt1166 = local45;
			this.aBoolean106 = true;
		}
		local16 = this.anInt1167 > 2 ? 2 : this.anInt1167;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean108 = this.aBoolean106 = true;
		}
		if (local5 != this.aBoolean105) {
			this.aBoolean105 = local5;
			this.aBoolean107 = true;
		}
		this.anInt1167 = local3;
	}

	@OriginalMember(owner = "client!df", name = "d", descriptor = "()V")
	public void method1236() {
		if (!this.method1232()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass4_Sub1_5.anOpengl1;
		this.aClass4_Sub1_5.method603();
		this.aClass4_Sub1_5.method572(0);
		this.aClass4_Sub1_5.method4299();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class2_Sub34 local35;
		for (@Pc(27) Class2_Sub34 local27 = (Class2_Sub34) this.aClass216_18.method5992(); local27 != null; local27 = local35) {
			local35 = (Class2_Sub34) this.aClass216_18.method6000();
			@Pc(39) int local39 = local27.method4351();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method4353(local41, this.aClass124_Sub2Array1[local19], this.aClass124_Sub2_4);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass4_Sub1_5.method546(this.aClass128_2);
					this.aClass4_Sub1_5.method553(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt1163);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt1165, this.anInt1162);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt1165, this.anInt1162 + this.anInt1163);
					local7.glTexCoord2f((float) this.anInt1164, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt1165 + this.anInt1164, this.anInt1162 + this.anInt1163);
					local7.glTexCoord2f((float) this.anInt1164, (float) this.anInt1163);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt1165 + this.anInt1164, this.anInt1162);
					local7.glEnd();
				} else {
					this.aClass128_2.method3568(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt1163);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt1163);
					local7.glTexCoord2f((float) this.anInt1164, (float) this.anInt1163);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt1164, this.anInt1163);
					local7.glTexCoord2f((float) this.anInt1164, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt1164, 0);
					local7.glEnd();
				}
				local27.method4356(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(Lclient!pg;)V")
	public void method1237(@OriginalArg(0) Class2_Sub34 arg0) {
		this.method1238(arg0);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(Lclient!pg;Z)V")
	private void method1238(@OriginalArg(0) Class2_Sub34 arg0) {
		arg0.method4352();
		arg0.aBoolean438 = false;
		arg0.method5945();
		this.method1235();
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IIII)Z")
	public boolean method1239(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass128_2 == null || this.aClass216_18.method5990()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt1164 != arg2 || this.anInt1163 != arg3) {
			this.anInt1164 = arg2;
			this.anInt1163 = arg3;
			for (@Pc(30) Class2 local30 = this.aClass216_18.method5992(); local30 != this.aClass216_18.aClass2_251; local30 = local30.aClass2_250) {
				((Class2_Sub34) local30).method4357(this.anInt1164, this.anInt1163);
			}
			this.aBoolean106 = true;
			this.aBoolean107 = true;
		}
		if (this.aBoolean107) {
			if (this.aClass190_1 != null) {
				this.aClass190_1.method5421();
				this.aClass190_1 = null;
			}
			if (this.aClass124_Sub2_4 != null) {
				this.aClass124_Sub2_4.method5898();
				this.aClass124_Sub2_4 = null;
			}
			if (this.aBoolean105) {
				this.aClass124_Sub2_4 = new Class124_Sub2(this.aClass4_Sub1_5, 34037, 6402, this.anInt1164, this.anInt1163);
			} else {
				this.aClass190_1 = new Class190(this.aClass4_Sub1_5, 6402, this.anInt1164, this.anInt1163);
			}
			this.aBoolean108 = true;
			this.aBoolean107 = false;
			local11 = true;
		}
		if (this.aBoolean106) {
			if (this.aClass124_Sub2Array1[0] != null) {
				this.aClass124_Sub2Array1[0].method5898();
				this.aClass124_Sub2Array1[0] = null;
			}
			if (this.aClass124_Sub2Array1[1] != null) {
				this.aClass124_Sub2Array1[1].method5898();
				this.aClass124_Sub2Array1[1] = null;
			}
			this.aClass124_Sub2Array1[0] = new Class124_Sub2(this.aClass4_Sub1_5, 34037, this.anInt1166, this.anInt1164, this.anInt1163);
			this.aClass124_Sub2Array1[1] = this.anInt1167 > 1 ? new Class124_Sub2(this.aClass4_Sub1_5, 34037, this.anInt1166, this.anInt1164, this.anInt1163) : null;
			this.aBoolean108 = true;
			this.aBoolean106 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass4_Sub1_5.method569().method3560();
		this.aClass4_Sub1_5.method597(this.aClass128_2);
		if (this.aBoolean108) {
			this.aClass128_2.method3565(0);
			this.aClass128_2.method3565(1);
			this.aClass128_2.method3565(8);
			if (this.aClass124_Sub2Array1[0] != null) {
				this.aClass128_2.method3561(0, this.aClass124_Sub2Array1[0]);
			}
			if (this.aClass124_Sub2Array1[1] != null) {
				this.aClass128_2.method3561(1, this.aClass124_Sub2Array1[1]);
			}
			if (this.aClass124_Sub2_4 != null) {
				this.aClass128_2.method3561(8, this.aClass124_Sub2_4);
			}
			if (this.aClass190_1 != null) {
				this.aClass128_2.method3567(this.aClass190_1);
			}
			this.aClass128_2.method3568(0);
			this.aBoolean108 = false;
			local11 = true;
		}
		if (!local11 || this.aClass128_2.method3563()) {
			this.anInt1165 = arg0;
			this.anInt1162 = arg1;
			this.aClass4_Sub1_5.method553(-this.anInt1165, this.anInt1162 + this.anInt1163 - local194);
			return true;
		}
		this.aClass4_Sub1_5.method546(this.aClass128_2);
		this.aBoolean106 = true;
		this.aBoolean107 = true;
		this.aBoolean108 = true;
		return false;
	}
}
