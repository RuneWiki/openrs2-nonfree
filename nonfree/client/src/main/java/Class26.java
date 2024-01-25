import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bh")
public final class Class26 {

	@OriginalMember(owner = "client!bh", name = "e", descriptor = "Z")
	private boolean aBoolean37;

	@OriginalMember(owner = "client!bh", name = "B", descriptor = "Lclient!jv;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_1;

	@OriginalMember(owner = "client!bh", name = "D", descriptor = "Lclient!jv;")
	private Class1_Sub1_Sub8 aClass1_Sub1_Sub8_2;

	@OriginalMember(owner = "client!bh", name = "F", descriptor = "Lclient!ku;")
	private Class73_Sub1 aClass73_Sub1_1;

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
	private int anInt843 = 0;

	@OriginalMember(owner = "client!bh", name = "n", descriptor = "I")
	private int anInt846 = 1;

	@OriginalMember(owner = "client!bh", name = "o", descriptor = "I")
	private int anInt847 = 0;

	@OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
	private int anInt850 = 1;

	@OriginalMember(owner = "client!bh", name = "j", descriptor = "Lclient!bv;")
	private final Class37 aClass37_12 = new Class37();

	@OriginalMember(owner = "client!bh", name = "A", descriptor = "[Lclient!ku;")
	private Class73_Sub1[] aClass73_Sub1Array1 = new Class73_Sub1[2];

	@OriginalMember(owner = "client!bh", name = "E", descriptor = "Z")
	private boolean aBoolean40 = true;

	@OriginalMember(owner = "client!bh", name = "C", descriptor = "Z")
	private boolean aBoolean39 = true;

	@OriginalMember(owner = "client!bh", name = "G", descriptor = "Z")
	private boolean aBoolean41 = true;

	@OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
	private int anInt853 = -1;

	@OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
	private int anInt854 = 0;

	@OriginalMember(owner = "client!bh", name = "H", descriptor = "Z")
	private boolean aBoolean42 = true;

	@OriginalMember(owner = "client!bh", name = "I", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!bh", name = "i", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_4;

	@OriginalMember(owner = "client!bh", name = "y", descriptor = "Lclient!wd;")
	private Class311 aClass311_3;

	@OriginalMember(owner = "client!bh", name = "r", descriptor = "Lclient!wd;")
	private Class311 aClass311_2;

	@OriginalMember(owner = "client!bh", name = "m", descriptor = "Lclient!wd;")
	private Class311 aClass311_1;

	static {
		new Class64("", 73);
	}

	@OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class26(@OriginalArg(0) Class122_Sub3 arg0) {
		this.aClass122_Sub3_4 = arg0;
		if (this.aClass122_Sub3_4.aBoolean601 && this.aClass122_Sub3_4.aBoolean579) {
			this.aClass311_2 = this.aClass311_3 = new Class311(this.aClass122_Sub3_4);
			if (this.aClass122_Sub3_4.anInt8414 > 1 && this.aClass122_Sub3_4.aBoolean602 && this.aClass122_Sub3_4.aBoolean593) {
				this.aClass311_2 = this.aClass311_1 = new Class311(this.aClass122_Sub3_4);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
	public void method886() {
		this.aClass1_Sub1_Sub8_2 = null;
		this.aClass73_Sub1Array1 = null;
		this.aClass311_2 = this.aClass311_1 = this.aClass311_3 = null;
		this.aClass1_Sub1_Sub8_1 = null;
		this.aClass73_Sub1_1 = null;
		if (!this.aClass37_12.method968()) {
			for (@Pc(42) Class1 local42 = this.aClass37_12.method977(); local42 != this.aClass37_12.aClass1_47; local42 = local42.aClass1_284) {
				((Class1_Sub11) local42).method5293();
			}
		}
		this.anInt846 = this.anInt850 = 1;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(BIIII)Z")
	public boolean method888(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass311_2 == null || this.aClass37_12.method968()) {
			return false;
		}
		if (this.anInt846 != arg3 || this.anInt850 != arg2) {
			this.anInt850 = arg2;
			this.anInt846 = arg3;
			for (@Pc(43) Class1 local43 = this.aClass37_12.method977(); local43 != this.aClass37_12.aClass1_47; local43 = local43.aClass1_284) {
				((Class1_Sub11) local43).method5298(this.anInt846, this.anInt850);
			}
			this.aBoolean41 = true;
			this.aBoolean42 = true;
			this.aBoolean39 = true;
		}
		if (!this.method892()) {
			return false;
		}
		this.aBoolean37 = true;
		this.anInt843 = arg1;
		this.anInt847 = arg0;
		this.aClass122_Sub3_4.method6884(this.aClass311_2);
		this.aClass311_2.method7350(0);
		this.aClass122_Sub3_4.method6904(this.anInt850 - this.aClass311_2.method7358() - this.anInt843, -this.anInt847);
		return true;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
	public void method889() {
		if (!this.aBoolean37) {
			return;
		}
		if (this.aClass311_1 != null) {
			this.aClass122_Sub3_4.method6869(this.aClass311_1);
			@Pc(20) short local20 = 16384;
			this.aClass122_Sub3_4.method6923(this.aClass311_3);
			this.aClass311_1.method7355();
			this.aClass311_3.method7350(0);
			if (this.aBoolean43) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt846, this.anInt850, 0, 0, this.anInt846, this.anInt850, local20, 9728);
			this.aClass122_Sub3_4.method6934(this.aClass311_1);
			this.aClass122_Sub3_4.method6903(this.aClass311_3);
		}
		this.aClass122_Sub3_4.method6864();
		this.aClass122_Sub3_4.method6871(0);
		this.aClass122_Sub3_4.method6875(1);
		this.aClass122_Sub3_4.n();
		@Pc(97) int local97 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class1_Sub11 local113;
		for (@Pc(105) Class1_Sub11 local105 = (Class1_Sub11) this.aClass37_12.method977(); local105 != null; local105 = local113) {
			local113 = (Class1_Sub11) this.aClass37_12.method971();
			@Pc(117) int local117 = local105.method5297();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method5301(this.aClass73_Sub1Array1[local97], this.aClass73_Sub1_1, local119);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass122_Sub3_4.method6883(this.aClass311_3);
					this.aClass122_Sub3_4.method6904(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt850);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt847, this.anInt843);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt847, this.anInt843 + this.anInt850);
					OpenGL.glTexCoord2f((float) this.anInt846, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt846 + this.anInt847, this.anInt843 + this.anInt850);
					OpenGL.glTexCoord2f((float) this.anInt846, (float) this.anInt850);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt847 + this.anInt846, this.anInt843);
					OpenGL.glEnd();
				} else {
					this.aClass311_3.method7350(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt850);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt850);
					OpenGL.glTexCoord2f((float) this.anInt846, (float) this.anInt850);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt846, this.anInt850);
					OpenGL.glTexCoord2f((float) this.anInt846, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt846, 0);
					OpenGL.glEnd();
				}
				local99 = local99 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
				local105.method5295(local119);
			}
		}
		this.aBoolean37 = false;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILclient!co;)V")
	public void method891(@OriginalArg(1) Class1_Sub11 arg0) {
		arg0.aBoolean455 = false;
		arg0.method5293();
		arg0.method7525();
		this.method893();
	}

	@OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)Z")
	private boolean method892() {
		if (this.aBoolean39) {
			if (this.aClass1_Sub1_Sub8_1 != null) {
				this.aClass1_Sub1_Sub8_1.method4126();
				this.aClass1_Sub1_Sub8_1 = null;
			}
			if (this.aClass73_Sub1_1 != null) {
				this.aClass73_Sub1_1.method6354();
				this.aClass73_Sub1_1 = null;
			}
			if (this.aClass311_1 != null) {
				this.aClass1_Sub1_Sub8_1 = new Class1_Sub1_Sub8(this.aClass122_Sub3_4, 6402, this.anInt846, this.anInt850, this.aClass122_Sub3_4.anInt8414);
			}
			if (this.aBoolean43) {
				this.aClass73_Sub1_1 = new Class73_Sub1(this.aClass122_Sub3_4, 34037, 6402, this.anInt846, this.anInt850);
			} else if (this.aClass1_Sub1_Sub8_1 == null) {
				this.aClass1_Sub1_Sub8_1 = new Class1_Sub1_Sub8(this.aClass122_Sub3_4, 6402, this.anInt846, this.anInt850);
			}
			this.aBoolean40 = true;
			this.aBoolean42 = true;
			this.aBoolean39 = false;
		}
		if (this.aBoolean41) {
			if (this.aClass1_Sub1_Sub8_2 != null) {
				this.aClass1_Sub1_Sub8_2.method4126();
				this.aClass1_Sub1_Sub8_2 = null;
			}
			if (this.aClass73_Sub1Array1[0] != null) {
				this.aClass73_Sub1Array1[0].method6354();
				this.aClass73_Sub1Array1[0] = null;
			}
			if (this.aClass73_Sub1Array1[1] != null) {
				this.aClass73_Sub1Array1[1].method6354();
				this.aClass73_Sub1Array1[1] = null;
			}
			if (this.aClass311_1 != null) {
				this.aClass1_Sub1_Sub8_2 = new Class1_Sub1_Sub8(this.aClass122_Sub3_4, this.anInt853, this.anInt846, this.anInt850, this.aClass122_Sub3_4.anInt8414);
			}
			this.aClass73_Sub1Array1[0] = new Class73_Sub1(this.aClass122_Sub3_4, 34037, this.anInt853, this.anInt846, this.anInt850);
			this.aClass73_Sub1Array1[1] = this.anInt854 <= 1 ? null : new Class73_Sub1(this.aClass122_Sub3_4, 34037, this.anInt853, this.anInt846, this.anInt850);
			this.aBoolean40 = true;
			this.aBoolean41 = false;
			this.aBoolean42 = true;
		}
		if (this.aBoolean42) {
			if (this.aClass311_1 == null) {
				this.aClass122_Sub3_4.method6884(this.aClass311_3);
				this.aClass311_3.method7356(0);
				this.aClass311_3.method7356(1);
				this.aClass311_3.method7356(8);
				this.aClass311_3.method7352(this.aClass73_Sub1Array1[0], 0);
				if (this.anInt854 > 1) {
					this.aClass311_3.method7352(this.aClass73_Sub1Array1[1], 1);
				}
				if (this.aBoolean43) {
					this.aClass311_3.method7352(this.aClass73_Sub1_1, 8);
				} else {
					this.aClass311_3.method7351(8, this.aClass1_Sub1_Sub8_1);
				}
				this.aClass122_Sub3_4.method6883(this.aClass311_3);
			} else {
				this.aClass122_Sub3_4.method6884(this.aClass311_3);
				this.aClass311_3.method7356(0);
				this.aClass311_3.method7356(1);
				this.aClass311_3.method7356(8);
				this.aClass311_3.method7352(this.aClass73_Sub1Array1[0], 0);
				if (this.anInt854 > 1) {
					this.aClass311_3.method7352(this.aClass73_Sub1Array1[1], 1);
				}
				if (this.aBoolean43) {
					this.aClass311_3.method7352(this.aClass73_Sub1_1, 8);
				}
				this.aClass122_Sub3_4.method6883(this.aClass311_3);
				this.aClass122_Sub3_4.method6884(this.aClass311_1);
				this.aClass311_1.method7356(0);
				this.aClass311_1.method7356(8);
				this.aClass311_1.method7351(0, this.aClass1_Sub1_Sub8_2);
				this.aClass311_1.method7351(8, this.aClass1_Sub1_Sub8_1);
				this.aClass122_Sub3_4.method6883(this.aClass311_1);
			}
			this.aBoolean40 = true;
			this.aBoolean42 = false;
		}
		if (this.aBoolean40) {
			this.aClass122_Sub3_4.method6884(this.aClass311_2);
			this.aBoolean40 = !this.aClass311_2.method7354();
			this.aClass122_Sub3_4.method6883(this.aClass311_2);
		}
		return !this.aBoolean40;
	}

	@OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)V")
	private void method893() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub11 local17 = (Class1_Sub11) this.aClass37_12.method977(); local17 != null; local17 = (Class1_Sub11) this.aClass37_12.method971()) {
			local23 = local17.method5299();
			local11 += local17.method5297();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method5303();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt853 != local23) {
			this.aBoolean41 = true;
			this.anInt853 = local23;
		}
		@Pc(91) int local91 = this.anInt854 > 2 ? 2 : this.anInt854;
		@Pc(100) int local100 = local11 > 2 ? 2 : local11;
		if (local100 != local91) {
			this.aBoolean42 = this.aBoolean41 = true;
		}
		if (local7 != this.aBoolean43) {
			this.aBoolean39 = true;
			this.aBoolean43 = local7;
		}
		this.anInt854 = local11;
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lclient!co;I)Z")
	public boolean method894(@OriginalArg(0) Class1_Sub11 arg0) {
		if (this.aClass311_2 != null) {
			if (arg0.method5302() || arg0.method5300()) {
				this.aClass37_12.method970(arg0);
				this.method893();
				if (this.method892()) {
					if (this.anInt846 != -1 && this.anInt850 != -1) {
						arg0.method5298(this.anInt846, this.anInt850);
					}
					arg0.aBoolean455 = true;
					return true;
				}
			}
			this.method891(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!bh", name = "d", descriptor = "(I)Z")
	public boolean method895() {
		return this.aClass311_2 != null;
	}
}
