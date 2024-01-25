import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rl")
public final class Class179 {

	@OriginalMember(owner = "client!rl", name = "j", descriptor = "Lclient!rq;")
	private Class18_Sub1 aClass18_Sub1_4;

	@OriginalMember(owner = "client!rl", name = "l", descriptor = "Lclient!um;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
	private int anInt5331 = 0;

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
	private int anInt5330 = -1;

	@OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
	private int anInt5332 = -1;

	@OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
	private int anInt5333 = 0;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "Lclient!tc;")
	private final Class195 aClass195_45 = new Class195();

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Z")
	private boolean aBoolean454 = true;

	@OriginalMember(owner = "client!rl", name = "i", descriptor = "[Lclient!rq;")
	private Class18_Sub1[] aClass18_Sub1Array3 = new Class18_Sub1[2];

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "Z")
	private boolean aBoolean455 = true;

	@OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
	private int anInt5334 = -1;

	@OriginalMember(owner = "client!rl", name = "o", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Z")
	private boolean aBoolean456 = true;

	@OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
	private int anInt5335 = 0;

	@OriginalMember(owner = "client!rl", name = "e", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_32;

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "Lclient!vi;")
	private Class211 aClass211_2;

	@OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class179(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass2_Sub1_32 = arg0;
		if (this.aClass2_Sub1_32.aBoolean217 && this.aClass2_Sub1_32.aBoolean214) {
			this.aClass211_2 = new Class211(this.aClass2_Sub1_32);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ps;Z)V")
	private void method4752(@OriginalArg(0) Class1_Sub32 arg0) {
		arg0.method5587();
		arg0.aBoolean562 = false;
		arg0.method5710();
		this.method4755();
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "()V")
	public void method4753() {
		if (this.aClass211_2 != null) {
			this.aClass211_2 = null;
			this.aClass18_Sub1Array3 = null;
			this.aClass206_1 = null;
			this.aClass18_Sub1_4 = null;
			this.aBoolean454 = true;
			this.aBoolean455 = true;
			this.aBoolean456 = true;
			if (!this.aClass195_45.method5017()) {
				for (@Pc(33) Class1 local33 = this.aClass195_45.method5029(); local33 != this.aClass195_45.aClass1_207; local33 = local33.aClass1_247) {
					((Class1_Sub32) local33).method5587();
				}
			}
		}
		this.anInt5332 = this.anInt5330 = -1;
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lclient!ps;)V")
	public void method4754(@OriginalArg(0) Class1_Sub32 arg0) {
		this.method4752(arg0);
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "()V")
	private void method4755() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class1_Sub32 local11 = (Class1_Sub32) this.aClass195_45.method5029(); local11 != null; local11 = (Class1_Sub32) this.aClass195_45.method5021()) {
			local16 = local11.method5593();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method5594();
			local5 |= local11.method5586();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt5334) {
			this.anInt5334 = local45;
			this.aBoolean454 = true;
		}
		local16 = this.anInt5335 > 2 ? 2 : this.anInt5335;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean456 = this.aBoolean454 = true;
		}
		if (local5 != this.aBoolean457) {
			this.aBoolean457 = local5;
			this.aBoolean455 = true;
		}
		this.anInt5335 = local3;
	}

	@OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lclient!ps;)Z")
	public boolean method4756(@OriginalArg(0) Class1_Sub32 arg0) {
		if (this.aClass211_2 != null) {
			if (arg0.method5592() || arg0.method5588()) {
				if (this.anInt5332 != -1 && this.anInt5330 != -1) {
					arg0.method5591(this.anInt5332, this.anInt5330);
				}
				arg0.aBoolean562 = true;
				this.aClass195_45.method5018(arg0);
				this.method4755();
				return true;
			}
			arg0.method5587();
		}
		return false;
	}

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "()Z")
	private boolean method4757() {
		return this.aClass2_Sub1_32.method2382() == this.aClass211_2;
	}

	@OriginalMember(owner = "client!rl", name = "d", descriptor = "()V")
	public void method4758() {
		if (!this.method4757()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass2_Sub1_32.anOpengl1;
		this.aClass2_Sub1_32.method2329();
		this.aClass2_Sub1_32.method2336(0);
		this.aClass2_Sub1_32.method3327();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class1_Sub32 local35;
		for (@Pc(27) Class1_Sub32 local27 = (Class1_Sub32) this.aClass195_45.method5029(); local27 != null; local27 = local35) {
			local35 = (Class1_Sub32) this.aClass195_45.method5021();
			@Pc(39) int local39 = local27.method5594();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method5590(local41, this.aClass18_Sub1Array3[local19], this.aClass18_Sub1_4);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass2_Sub1_32.method2381(this.aClass211_2);
					this.aClass2_Sub1_32.method2316(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5330);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5331, this.anInt5333);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5331, this.anInt5333 + this.anInt5330);
					local7.glTexCoord2f((float) this.anInt5332, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5331 + this.anInt5332, this.anInt5333 + this.anInt5330);
					local7.glTexCoord2f((float) this.anInt5332, (float) this.anInt5330);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5331 + this.anInt5332, this.anInt5333);
					local7.glEnd();
				} else {
					this.aClass211_2.method5536(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5330);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5330);
					local7.glTexCoord2f((float) this.anInt5332, (float) this.anInt5330);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5332, this.anInt5330);
					local7.glTexCoord2f((float) this.anInt5332, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5332, 0);
					local7.glEnd();
				}
				local27.method5595(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIII)Z")
	public boolean method4759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass211_2 == null || this.aClass195_45.method5017()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5332 != arg2 || this.anInt5330 != arg3) {
			this.anInt5332 = arg2;
			this.anInt5330 = arg3;
			for (@Pc(30) Class1 local30 = this.aClass195_45.method5029(); local30 != this.aClass195_45.aClass1_207; local30 = local30.aClass1_247) {
				((Class1_Sub32) local30).method5591(this.anInt5332, this.anInt5330);
			}
			this.aBoolean454 = true;
			this.aBoolean455 = true;
		}
		if (this.aBoolean455) {
			if (this.aClass206_1 != null) {
				this.aClass206_1.method5356();
				this.aClass206_1 = null;
			}
			if (this.aClass18_Sub1_4 != null) {
				this.aClass18_Sub1_4.method4843();
				this.aClass18_Sub1_4 = null;
			}
			if (this.aBoolean457) {
				this.aClass18_Sub1_4 = new Class18_Sub1(this.aClass2_Sub1_32, 34037, 6402, this.anInt5332, this.anInt5330);
			} else {
				this.aClass206_1 = new Class206(this.aClass2_Sub1_32, 6402, this.anInt5332, this.anInt5330);
			}
			this.aBoolean456 = true;
			this.aBoolean455 = false;
			local11 = true;
		}
		if (this.aBoolean454) {
			if (this.aClass18_Sub1Array3[0] != null) {
				this.aClass18_Sub1Array3[0].method4843();
				this.aClass18_Sub1Array3[0] = null;
			}
			if (this.aClass18_Sub1Array3[1] != null) {
				this.aClass18_Sub1Array3[1].method4843();
				this.aClass18_Sub1Array3[1] = null;
			}
			this.aClass18_Sub1Array3[0] = new Class18_Sub1(this.aClass2_Sub1_32, 34037, this.anInt5334, this.anInt5332, this.anInt5330);
			this.aClass18_Sub1Array3[1] = this.anInt5335 > 1 ? new Class18_Sub1(this.aClass2_Sub1_32, 34037, this.anInt5334, this.anInt5332, this.anInt5330) : null;
			this.aBoolean456 = true;
			this.aBoolean454 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass2_Sub1_32.method2382().method5528();
		this.aClass2_Sub1_32.method2339(this.aClass211_2);
		if (this.aBoolean456) {
			this.aClass211_2.method5532(0);
			this.aClass211_2.method5532(1);
			this.aClass211_2.method5532(8);
			if (this.aClass18_Sub1Array3[0] != null) {
				this.aClass211_2.method5531(0, this.aClass18_Sub1Array3[0]);
			}
			if (this.aClass18_Sub1Array3[1] != null) {
				this.aClass211_2.method5531(1, this.aClass18_Sub1Array3[1]);
			}
			if (this.aClass18_Sub1_4 != null) {
				this.aClass211_2.method5531(8, this.aClass18_Sub1_4);
			}
			if (this.aClass206_1 != null) {
				this.aClass211_2.method5537(this.aClass206_1);
			}
			this.aClass211_2.method5536(0);
			this.aBoolean456 = false;
			local11 = true;
		}
		if (!local11 || this.aClass211_2.method5530()) {
			this.anInt5331 = arg0;
			this.anInt5333 = arg1;
			this.aClass2_Sub1_32.method2316(-this.anInt5331, this.anInt5333 + this.anInt5330 - local194);
			return true;
		}
		this.aClass2_Sub1_32.method2381(this.aClass211_2);
		this.aBoolean454 = true;
		this.aBoolean455 = true;
		this.aBoolean456 = true;
		return false;
	}
}
