import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
public final class Class197 {

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "Lclient!vf;")
	private Class209 aClass209_1;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "Lclient!fc;")
	private Class11_Sub1 aClass11_Sub1_7;

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
	private int anInt5996 = 0;

	@OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
	private int anInt5997 = -1;

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "I")
	private int anInt5995 = 0;

	@OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
	private int anInt5998 = -1;

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "Lclient!vn;")
	private final Class211 aClass211_35 = new Class211();

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "Z")
	private boolean aBoolean448 = true;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "[Lclient!fc;")
	private Class11_Sub1[] aClass11_Sub1Array4 = new Class11_Sub1[2];

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "Z")
	private boolean aBoolean449 = true;

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	private int anInt6000 = -1;

	@OriginalMember(owner = "client!ub", name = "m", descriptor = "Z")
	private boolean aBoolean450 = true;

	@OriginalMember(owner = "client!ub", name = "j", descriptor = "I")
	private int anInt5999 = 0;

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "Z")
	private boolean aBoolean451 = false;

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_35;

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "Lclient!ib;")
	private Class87 aClass87_4;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!po;)V")
	public Class197(@OriginalArg(0) Class59_Sub1 arg0) {
		this.aClass59_Sub1_35 = arg0;
		if (this.aClass59_Sub1_35.aBoolean367 && this.aClass59_Sub1_35.aBoolean362) {
			this.aClass87_4 = new Class87(this.aClass59_Sub1_35);
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "()V")
	public void method5335() {
		if (this.aClass87_4 != null) {
			this.aClass87_4 = null;
			this.aClass11_Sub1Array4 = null;
			this.aClass209_1 = null;
			this.aClass11_Sub1_7 = null;
			this.aBoolean450 = true;
			this.aBoolean449 = true;
			this.aBoolean448 = true;
			if (!this.aClass211_35.method5606()) {
				for (@Pc(33) Class5 local33 = this.aClass211_35.method5608(); local33 != this.aClass211_35.aClass5_235; local33 = local33.aClass5_247) {
					((Class5_Sub5) local33).method822();
				}
			}
		}
		this.anInt5997 = this.anInt5998 = -1;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!he;)Z")
	public boolean method5336(@OriginalArg(0) Class5_Sub5 arg0) {
		if (this.aClass87_4 != null) {
			if (arg0.method826() || arg0.method819()) {
				if (this.anInt5997 != -1 && this.anInt5998 != -1) {
					arg0.method820(this.anInt5997, this.anInt5998);
				}
				arg0.aBoolean65 = true;
				this.aClass211_35.method5609(arg0);
				this.method5339();
				return true;
			}
			arg0.method822();
		}
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "()Z")
	private boolean method5337() {
		return this.aClass59_Sub1_35.method4290() == this.aClass87_4;
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lclient!he;)V")
	public void method5338(@OriginalArg(0) Class5_Sub5 arg0) {
		this.method5341(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "c", descriptor = "()V")
	private void method5339() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(5) boolean local5 = false;
		@Pc(16) int local16;
		for (@Pc(11) Class5_Sub5 local11 = (Class5_Sub5) this.aClass211_35.method5608(); local11 != null; local11 = (Class5_Sub5) this.aClass211_35.method5603()) {
			local16 = local11.method823();
			if (local16 > local1) {
				local1 = local16;
			}
			local3 += local11.method825();
			local5 |= local11.method827();
		}
		@Pc(45) int local45;
		if (local1 == 2) {
			local45 = 34836;
		} else if (local1 == 1) {
			local45 = 34842;
		} else {
			local45 = 6408;
		}
		if (local45 != this.anInt6000) {
			this.anInt6000 = local45;
			this.aBoolean450 = true;
		}
		local16 = this.anInt5999 > 2 ? 2 : this.anInt5999;
		@Pc(80) int local80 = local3 > 2 ? 2 : local3;
		if (local16 != local80) {
			this.aBoolean448 = this.aBoolean450 = true;
		}
		if (local5 != this.aBoolean451) {
			this.aBoolean451 = local5;
			this.aBoolean449 = true;
		}
		this.anInt5999 = local3;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)Z")
	public boolean method5340(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass87_4 == null || this.aClass211_35.method5606()) {
			return false;
		}
		@Pc(11) boolean local11 = false;
		if (this.anInt5997 != arg2 || this.anInt5998 != arg3) {
			this.anInt5997 = arg2;
			this.anInt5998 = arg3;
			for (@Pc(30) Class5 local30 = this.aClass211_35.method5608(); local30 != this.aClass211_35.aClass5_235; local30 = local30.aClass5_247) {
				((Class5_Sub5) local30).method820(this.anInt5997, this.anInt5998);
			}
			this.aBoolean450 = true;
			this.aBoolean449 = true;
		}
		if (this.aBoolean449) {
			if (this.aClass209_1 != null) {
				this.aClass209_1.method5526();
				this.aClass209_1 = null;
			}
			if (this.aClass11_Sub1_7 != null) {
				this.aClass11_Sub1_7.method3573();
				this.aClass11_Sub1_7 = null;
			}
			if (this.aBoolean451) {
				this.aClass11_Sub1_7 = new Class11_Sub1(this.aClass59_Sub1_35, 34037, 6402, this.anInt5997, this.anInt5998);
			} else {
				this.aClass209_1 = new Class209(this.aClass59_Sub1_35, 6402, this.anInt5997, this.anInt5998);
			}
			this.aBoolean448 = true;
			this.aBoolean449 = false;
			local11 = true;
		}
		if (this.aBoolean450) {
			if (this.aClass11_Sub1Array4[0] != null) {
				this.aClass11_Sub1Array4[0].method3573();
				this.aClass11_Sub1Array4[0] = null;
			}
			if (this.aClass11_Sub1Array4[1] != null) {
				this.aClass11_Sub1Array4[1].method3573();
				this.aClass11_Sub1Array4[1] = null;
			}
			this.aClass11_Sub1Array4[0] = new Class11_Sub1(this.aClass59_Sub1_35, 34037, this.anInt6000, this.anInt5997, this.anInt5998);
			this.aClass11_Sub1Array4[1] = this.anInt5999 > 1 ? new Class11_Sub1(this.aClass59_Sub1_35, 34037, this.anInt6000, this.anInt5997, this.anInt5998) : null;
			this.aBoolean448 = true;
			this.aBoolean450 = false;
			local11 = true;
		}
		@Pc(194) int local194 = this.aClass59_Sub1_35.method4290().method4264();
		this.aClass59_Sub1_35.method4289(this.aClass87_4);
		if (this.aBoolean448) {
			this.aClass87_4.method2457(0);
			this.aClass87_4.method2457(1);
			this.aClass87_4.method2457(8);
			if (this.aClass11_Sub1Array4[0] != null) {
				this.aClass87_4.method2458(0, this.aClass11_Sub1Array4[0]);
			}
			if (this.aClass11_Sub1Array4[1] != null) {
				this.aClass87_4.method2458(1, this.aClass11_Sub1Array4[1]);
			}
			if (this.aClass11_Sub1_7 != null) {
				this.aClass87_4.method2458(8, this.aClass11_Sub1_7);
			}
			if (this.aClass209_1 != null) {
				this.aClass87_4.method2459(this.aClass209_1);
			}
			this.aClass87_4.method2462(0);
			this.aBoolean448 = false;
			local11 = true;
		}
		if (!local11 || this.aClass87_4.method2464()) {
			this.anInt5996 = arg0;
			this.anInt5995 = arg1;
			this.aClass59_Sub1_35.method4277(-this.anInt5996, this.anInt5995 + this.anInt5998 - local194);
			return true;
		}
		this.aClass59_Sub1_35.method4315(this.aClass87_4);
		this.aBoolean450 = true;
		this.aBoolean449 = true;
		this.aBoolean448 = true;
		return false;
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lclient!he;Z)V")
	private void method5341(@OriginalArg(0) Class5_Sub5 arg0) {
		arg0.method822();
		arg0.aBoolean65 = false;
		arg0.method5803();
		this.method5339();
	}

	@OriginalMember(owner = "client!ub", name = "d", descriptor = "()V")
	public void method5342() {
		if (!this.method5337()) {
			return;
		}
		@Pc(7) opengl local7 = this.aClass59_Sub1_35.anOpengl2;
		this.aClass59_Sub1_35.method4305();
		this.aClass59_Sub1_35.method4342(0);
		this.aClass59_Sub1_35.method4810();
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 1;
		@Pc(35) Class5_Sub5 local35;
		for (@Pc(27) Class5_Sub5 local27 = (Class5_Sub5) this.aClass211_35.method5608(); local27 != null; local27 = local35) {
			local35 = (Class5_Sub5) this.aClass211_35.method5603();
			@Pc(39) int local39 = local27.method825();
			for (@Pc(41) int local41 = 0; local41 < local39; local41++) {
				local27.method824(local41, this.aClass11_Sub1Array4[local19], this.aClass11_Sub1_7);
				if (local35 == null && local41 == local39 - 1) {
					this.aClass59_Sub1_35.method4315(this.aClass87_4);
					this.aClass59_Sub1_35.method4277(0, 0);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, (float) this.anInt5998);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(this.anInt5996, this.anInt5995);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(this.anInt5996, this.anInt5995 + this.anInt5998);
					local7.glTexCoord2f((float) this.anInt5997, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5996 + this.anInt5997, this.anInt5995 + this.anInt5998);
					local7.glTexCoord2f((float) this.anInt5997, (float) this.anInt5998);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5996 + this.anInt5997, this.anInt5995);
					local7.glEnd();
				} else {
					this.aClass87_4.method2462(local21);
					local7.glBegin(7);
					local7.glTexCoord2f(0.0F, 0.0F);
					local7.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					local7.glVertex2i(0, 0);
					local7.glTexCoord2f(0.0F, (float) this.anInt5998);
					local7.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					local7.glVertex2i(0, this.anInt5998);
					local7.glTexCoord2f((float) this.anInt5997, (float) this.anInt5998);
					local7.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					local7.glVertex2i(this.anInt5997, this.anInt5998);
					local7.glTexCoord2f((float) this.anInt5997, 0.0F);
					local7.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					local7.glVertex2i(this.anInt5997, 0);
					local7.glEnd();
				}
				local27.method821(local41);
				local21 = local21 + 1 & 0x1;
				local19 = local19 + 1 & 0x1;
			}
		}
	}
}
