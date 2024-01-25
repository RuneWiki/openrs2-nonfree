import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "l", descriptor = "Lclient!wm;")
	private Class215 aClass215_1;

	@OriginalMember(owner = "client!ag", name = "p", descriptor = "Lclient!im;")
	private Class56_Sub4 aClass56_Sub4_1;

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "I")
	private int anInt35 = -1;

	@OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
	private int anInt36 = 0;

	@OriginalMember(owner = "client!ag", name = "g", descriptor = "I")
	private int anInt37 = 0;

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "I")
	private int anInt34 = -1;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "Lclient!aq;")
	private final Class16 aClass16_2 = new Class16();

	@OriginalMember(owner = "client!ag", name = "h", descriptor = "[Lclient!im;")
	private Class56_Sub4[] aClass56_Sub4Array1 = new Class56_Sub4[2];

	@OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
	private boolean aBoolean2 = true;

	@OriginalMember(owner = "client!ag", name = "j", descriptor = "I")
	private int anInt38 = 0;

	@OriginalMember(owner = "client!ag", name = "n", descriptor = "I")
	private int anInt39 = -1;

	@OriginalMember(owner = "client!ag", name = "m", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!ag", name = "k", descriptor = "Z")
	private boolean aBoolean3 = true;

	@OriginalMember(owner = "client!ag", name = "o", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_1;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "Lclient!wq;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class7(@OriginalArg(0) Class129_Sub2 arg0) {
		this.aClass129_Sub2_1 = arg0;
		if (this.aClass129_Sub2_1.aBoolean396 && this.aClass129_Sub2_1.aBoolean380) {
			this.aClass217_1 = new Class217(this.aClass129_Sub2_1);
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "()Z")
	private boolean method28() {
		return this.aClass129_Sub2_1.method5078() == this.aClass217_1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!lh;)V")
	public void method29(@OriginalArg(0) Class11_Sub23 arg0) {
		this.method34(arg0);
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "()V")
	public void method30() {
		if (!this.method28()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass129_Sub2_1.anOpengl2;
		this.aClass129_Sub2_1.method5036();
		this.aClass129_Sub2_1.method5035(0);
		this.aClass129_Sub2_1.method4966();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class11_Sub23 local35;
		for (@Pc(27) Class11_Sub23 local27 = (Class11_Sub23) this.aClass16_2.method193(); local27 != null; local27 = local35) {
			local35 = (Class11_Sub23) this.aClass16_2.method188();
			@Pc(39) int local39 = local27.method2232();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method2240(local41, this.aClass56_Sub4Array1[local19], this.aClass56_Sub4_1);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass129_Sub2_1.method5082(this.aClass217_1);
					this.aClass129_Sub2_1.method5090(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt34);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt37, this.anInt36);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt37, this.anInt36 + this.anInt34);
					local7.glTexCoord2f((float) this.anInt35, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt37 + this.anInt35, this.anInt36 + this.anInt34);
					local7.glTexCoord2f((float) this.anInt35, (float) this.anInt34);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt37 + this.anInt35, this.anInt36);
					local7.glEnd();
				} else {
					this.aClass217_1.method5727(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt34);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt34);
					local7.glTexCoord2f((float) this.anInt35, (float) this.anInt34);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt35, this.anInt34);
					local7.glTexCoord2f((float) this.anInt35, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt35, 0);
					local7.glEnd();
				}
				local27.method2237(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!ag", name = "c", descriptor = "()V")
	private void method31() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class11_Sub23 local11 = (Class11_Sub23) this.aClass16_2.method193(); local11 != null; local11 = (Class11_Sub23) this.aClass16_2.method188()) {
			local16 = local11.method2234();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method2232();
			local5 |= local11.method2238();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt39) {
			this.anInt39 = local45;
			this.aBoolean2 = true;
		}
		local16 = this.anInt38 > 2 ? 2 : this.anInt38;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean4 = this.aBoolean2 = true;
		}
		if (local5 != this.aBoolean5) {
			this.aBoolean5 = local5;
			this.aBoolean3 = true;
		}
		this.anInt38 = local3;
	}

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(Lclient!lh;)Z")
	public boolean method32(@OriginalArg(0) Class11_Sub23 arg0) {
		if (this.aClass217_1 != null) {
			if (arg0.method2235() || arg0.method2239()) {
				if (this.anInt35 != -1 && this.anInt34 != -1) {
					arg0.method2233(this.anInt35, this.anInt34);
				}
				arg0.aBoolean181 = true;
				this.aClass16_2.method190(arg0);
				this.method31();
				return true;
			}
			arg0.method2236();
		}
		return false;
	}

	@OriginalMember(owner = "client!ag", name = "d", descriptor = "()V")
	public void method33() {
		if (this.aClass217_1 != null) {
			this.aClass217_1 = null;
			this.aClass56_Sub4Array1 = null;
			this.aClass215_1 = null;
			this.aClass56_Sub4_1 = null;
			this.aBoolean2 = true;
			this.aBoolean3 = true;
			this.aBoolean4 = true;
			if (!this.aClass16_2.method194()) {
				for (@Pc(33) Class11 local33 = this.aClass16_2.method193(); local33 != this.aClass16_2.aClass11_9; local33 = local33.aClass11_251) {
					((Class11_Sub23) local33).method2236();
				}
			}
		}
		this.anInt35 = this.anInt34 = -1;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!lh;Z)V")
	private void method34(@OriginalArg(0) Class11_Sub23 arg0) {
		arg0.method2236();
		arg0.aBoolean181 = false;
		arg0.method5701();
		this.method31();
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIII)Z")
	public boolean method35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass217_1 == null || this.aClass16_2.method194()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt35 != arg2 || this.anInt34 != arg3) {
			this.anInt35 = arg2;
			this.anInt34 = arg3;
			for (@Pc(30) Class11 local30 = this.aClass16_2.method193(); local30 != this.aClass16_2.aClass11_9; local30 = local30.aClass11_251) {
				((Class11_Sub23) local30).method2233(this.anInt35, this.anInt34);
			}
			this.aBoolean2 = true;
			this.aBoolean3 = true;
		}
		if (this.aBoolean3) {
			if (this.aClass215_1 != null) {
				this.aClass215_1.method5675();
				this.aClass215_1 = null;
			}
			if (this.aClass56_Sub4_1 != null) {
				this.aClass56_Sub4_1.method2545();
				this.aClass56_Sub4_1 = null;
			}
			if (this.aBoolean5) {
				this.aClass56_Sub4_1 = new Class56_Sub4(this.aClass129_Sub2_1, 34037, 6402, this.anInt35, this.anInt34);
			} else {
				this.aClass215_1 = new Class215(this.aClass129_Sub2_1, 6402, this.anInt35, this.anInt34);
			}
			this.aBoolean4 = true;
			this.aBoolean3 = false;
			local11 = true;
		}
		if (this.aBoolean2) {
			if (this.aClass56_Sub4Array1[0] != null) {
				this.aClass56_Sub4Array1[0].method2545();
				this.aClass56_Sub4Array1[0] = null;
			}
			if (this.aClass56_Sub4Array1[1] != null) {
				this.aClass56_Sub4Array1[1].method2545();
				this.aClass56_Sub4Array1[1] = null;
			}
			this.aClass56_Sub4Array1[0] = new Class56_Sub4(this.aClass129_Sub2_1, 34037, this.anInt39, this.anInt35, this.anInt34);
			this.aClass56_Sub4Array1[1] = this.anInt38 > 1 ? new Class56_Sub4(this.aClass129_Sub2_1, 34037, this.anInt39, this.anInt35, this.anInt34) : null;
			this.aBoolean4 = true;
			this.aBoolean2 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass129_Sub2_1.method5078().method5722();
		this.aClass129_Sub2_1.method5039(this.aClass217_1);
		if (this.aBoolean4) {
			this.aClass217_1.method5731(0);
			this.aClass217_1.method5731(1);
			this.aClass217_1.method5731(8);
			if (this.aClass56_Sub4Array1[0] != null) {
				this.aClass217_1.method5729(0, this.aClass56_Sub4Array1[0]);
			}
			if (this.aClass56_Sub4Array1[1] != null) {
				this.aClass217_1.method5729(1, this.aClass56_Sub4Array1[1]);
			}
			if (this.aClass56_Sub4_1 != null) {
				this.aClass217_1.method5729(8, this.aClass56_Sub4_1);
			}
			if (this.aClass215_1 != null) {
				this.aClass217_1.method5728(this.aClass215_1);
			}
			this.aClass217_1.method5727(0);
			this.aBoolean4 = false;
			local11 = true;
		}
		if (!local11 || this.aClass217_1.method5732()) {
			this.anInt37 = arg0;
			this.anInt36 = arg1;
			this.aClass129_Sub2_1.method5090(-this.anInt37, this.anInt36 + this.anInt34 - local194);
			return true;
		}
		this.aClass129_Sub2_1.method5082(this.aClass217_1);
		this.aBoolean2 = true;
		this.aBoolean3 = true;
		this.aBoolean4 = true;
		return false;
	}
}
