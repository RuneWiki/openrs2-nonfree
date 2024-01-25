import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fo")
public final class Class76 {

	@OriginalMember(owner = "client!fo", name = "n", descriptor = "Lclient!jo;")
	private Class70_Sub4 aClass70_Sub4_3;

	@OriginalMember(owner = "client!fo", name = "o", descriptor = "Lclient!vf;")
	private Class208 aClass208_1;

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
	private int anInt2058 = 0;

	@OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
	private int anInt2059 = -1;

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
	private int anInt2057 = -1;

	@OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
	private int anInt2060 = 0;

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "Lclient!mk;")
	private final Class130 aClass130_36 = new Class130();

	@OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!fo", name = "l", descriptor = "[Lclient!jo;")
	private Class70_Sub4[] aClass70_Sub4Array4 = new Class70_Sub4[2];

	@OriginalMember(owner = "client!fo", name = "i", descriptor = "I")
	private int anInt2061 = -1;

	@OriginalMember(owner = "client!fo", name = "j", descriptor = "I")
	private int anInt2062 = 0;

	@OriginalMember(owner = "client!fo", name = "k", descriptor = "Z")
	private boolean aBoolean181 = true;

	@OriginalMember(owner = "client!fo", name = "m", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!fo", name = "p", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!fo", name = "f", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_9;

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "Lclient!vr;")
	private Class214 aClass214_3;

	@OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lclient!ql;)V")
	public Class76(@OriginalArg(0) Class92_Sub2 arg0) {
		this.aClass92_Sub2_9 = arg0;
		if (this.aClass92_Sub2_9.aBoolean464 && this.aClass92_Sub2_9.aBoolean473) {
			this.aClass214_3 = new Class214(this.aClass92_Sub2_9);
		}
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "()V")
	public void method1644() {
		if (!this.method1649()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass92_Sub2_9.anOpengl2;
		this.aClass92_Sub2_9.method4619();
		this.aClass92_Sub2_9.method4560(0);
		this.aClass92_Sub2_9.method4467();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class4_Sub3 local35;
		for (@Pc(27) Class4_Sub3 local27 = (Class4_Sub3) this.aClass130_36.method3499(); local27 != null; local27 = local35) {
			local35 = (Class4_Sub3) this.aClass130_36.method3512();
			@Pc(39) int local39 = local27.method424();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method422(local41, this.aClass70_Sub4Array4[local19], this.aClass70_Sub4_3);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass92_Sub2_9.method4613(this.aClass214_3);
					this.aClass92_Sub2_9.method4583(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt2057);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt2058, this.anInt2060);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt2058, this.anInt2060 + this.anInt2057);
					local7.glTexCoord2f((float) this.anInt2059, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt2058 + this.anInt2059, this.anInt2060 + this.anInt2057);
					local7.glTexCoord2f((float) this.anInt2059, (float) this.anInt2057);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt2058 + this.anInt2059, this.anInt2060);
					local7.glEnd();
				} else {
					this.aClass214_3.method5566(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt2057);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt2057);
					local7.glTexCoord2f((float) this.anInt2059, (float) this.anInt2057);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt2059, this.anInt2057);
					local7.glTexCoord2f((float) this.anInt2059, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt2059, 0);
					local7.glEnd();
				}
				local27.method430(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "()V")
	public void method1645() {
		if (this.aClass214_3 != null) {
			this.aClass214_3 = null;
			this.aClass70_Sub4Array4 = null;
			this.aClass208_1 = null;
			this.aClass70_Sub4_3 = null;
			this.aBoolean180 = true;
			this.aBoolean183 = true;
			this.aBoolean181 = true;
			if (!this.aClass130_36.method3508()) {
				for (@Pc(33) Class4 local33 = this.aClass130_36.method3499(); local33 != this.aClass130_36.aClass4_144; local33 = local33.aClass4_247) {
					((Class4_Sub3) local33).method429();
				}
			}
		}
		this.anInt2059 = this.anInt2057 = -1;
	}

	@OriginalMember(owner = "client!fo", name = "c", descriptor = "()V")
	private void method1646() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class4_Sub3 local11 = (Class4_Sub3) this.aClass130_36.method3499(); local11 != null; local11 = (Class4_Sub3) this.aClass130_36.method3512()) {
			local16 = local11.method431();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method424();
			local5 |= local11.method423();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt2061) {
			this.anInt2061 = local45;
			this.aBoolean180 = true;
		}
		local16 = this.anInt2062 > 2 ? 2 : this.anInt2062;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean181 = this.aBoolean180 = true;
		}
		if (local5 != this.aBoolean182) {
			this.aBoolean182 = local5;
			this.aBoolean183 = true;
		}
		this.anInt2062 = local3;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!tk;Z)V")
	private void method1647(@OriginalArg(0) Class4_Sub3 arg0) {
		arg0.method429();
		arg0.aBoolean26 = false;
		arg0.method5667();
		this.method1646();
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIII)Z")
	public boolean method1648(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass214_3 == null || this.aClass130_36.method3508()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt2059 != arg2 || this.anInt2057 != arg3) {
			this.anInt2059 = arg2;
			this.anInt2057 = arg3;
			for (@Pc(30) Class4 local30 = this.aClass130_36.method3499(); local30 != this.aClass130_36.aClass4_144; local30 = local30.aClass4_247) {
				((Class4_Sub3) local30).method426(this.anInt2059, this.anInt2057);
			}
			this.aBoolean180 = true;
			this.aBoolean183 = true;
		}
		if (this.aBoolean183) {
			if (this.aClass208_1 != null) {
				this.aClass208_1.method5490();
				this.aClass208_1 = null;
			}
			if (this.aClass70_Sub4_3 != null) {
				this.aClass70_Sub4_3.method1981();
				this.aClass70_Sub4_3 = null;
			}
			if (this.aBoolean182) {
				this.aClass70_Sub4_3 = new Class70_Sub4(this.aClass92_Sub2_9, 34037, 6402, this.anInt2059, this.anInt2057);
			} else {
				this.aClass208_1 = new Class208(this.aClass92_Sub2_9, 6402, this.anInt2059, this.anInt2057);
			}
			this.aBoolean181 = true;
			this.aBoolean183 = false;
			local11 = true;
		}
		if (this.aBoolean180) {
			if (this.aClass70_Sub4Array4[0] != null) {
				this.aClass70_Sub4Array4[0].method1981();
				this.aClass70_Sub4Array4[0] = null;
			}
			if (this.aClass70_Sub4Array4[1] != null) {
				this.aClass70_Sub4Array4[1].method1981();
				this.aClass70_Sub4Array4[1] = null;
			}
			this.aClass70_Sub4Array4[0] = new Class70_Sub4(this.aClass92_Sub2_9, 34037, this.anInt2061, this.anInt2059, this.anInt2057);
			this.aClass70_Sub4Array4[1] = this.anInt2062 > 1 ? new Class70_Sub4(this.aClass92_Sub2_9, 34037, this.anInt2061, this.anInt2059, this.anInt2057) : null;
			this.aBoolean181 = true;
			this.aBoolean180 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass92_Sub2_9.method4617().method5562();
		this.aClass92_Sub2_9.method4615(this.aClass214_3);
		if (this.aBoolean181) {
			this.aClass214_3.method5569(0);
			this.aClass214_3.method5569(1);
			this.aClass214_3.method5569(8);
			if (this.aClass70_Sub4Array4[0] != null) {
				this.aClass214_3.method5570(0, this.aClass70_Sub4Array4[0]);
			}
			if (this.aClass70_Sub4Array4[1] != null) {
				this.aClass214_3.method5570(1, this.aClass70_Sub4Array4[1]);
			}
			if (this.aClass70_Sub4_3 != null) {
				this.aClass214_3.method5570(8, this.aClass70_Sub4_3);
			}
			if (this.aClass208_1 != null) {
				this.aClass214_3.method5571(this.aClass208_1);
			}
			this.aClass214_3.method5566(0);
			this.aBoolean181 = false;
			local11 = true;
		}
		if (!local11 || this.aClass214_3.method5565()) {
			this.anInt2058 = arg0;
			this.anInt2060 = arg1;
			this.aClass92_Sub2_9.method4583(-this.anInt2058, this.anInt2060 + this.anInt2057 - local194);
			return true;
		}
		this.aClass92_Sub2_9.method4613(this.aClass214_3);
		this.aBoolean180 = true;
		this.aBoolean183 = true;
		this.aBoolean181 = true;
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "d", descriptor = "()Z")
	private boolean method1649() {
		return this.aClass92_Sub2_9.method4617() == this.aClass214_3;
	}

	@OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lclient!tk;)Z")
	public boolean method1650(@OriginalArg(0) Class4_Sub3 arg0) {
		if (this.aClass214_3 != null) {
			if (arg0.method428() || arg0.method427()) {
				if (this.anInt2059 != -1 && this.anInt2057 != -1) {
					arg0.method426(this.anInt2059, this.anInt2057);
				}
				arg0.aBoolean26 = true;
				this.aClass130_36.method3510(arg0);
				this.method1646();
				return true;
			}
			arg0.method429();
		}
		return false;
	}

	@OriginalMember(owner = "client!fo", name = "b", descriptor = "(Lclient!tk;)V")
	public void method1651(@OriginalArg(0) Class4_Sub3 arg0) {
		this.method1647(arg0);
	}
}
