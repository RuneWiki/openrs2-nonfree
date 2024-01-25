import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class124 {

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Z")
	private boolean aBoolean307;

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Lclient!pg;")
	private Class3_Sub10_Sub14 aClass3_Sub10_Sub14_1;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "Lclient!cs;")
	private Class11_Sub1 aClass11_Sub1_2;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "Lclient!pg;")
	private Class3_Sub10_Sub14 aClass3_Sub10_Sub14_2;

	@OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
	private int anInt4216 = 0;

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	private int anInt4212 = 1;

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
	private int anInt4221 = 1;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
	private int anInt4218 = 0;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Lclient!eea;")
	private final Class71 aClass71_35 = new Class71();

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "[Lclient!cs;")
	private Class11_Sub1[] aClass11_Sub1Array1 = new Class11_Sub1[2];

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "Z")
	private boolean aBoolean309 = false;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Z")
	private boolean aBoolean308 = true;

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "Z")
	private boolean aBoolean310 = true;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "Z")
	private boolean aBoolean312 = true;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "Z")
	private boolean aBoolean311 = true;

	@OriginalMember(owner = "client!hn", name = "E", descriptor = "I")
	private int anInt4223 = -1;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
	private int anInt4225 = 0;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_14;

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "Lclient!jaa;")
	private Class141 aClass141_3;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!jaa;")
	private Class141 aClass141_2;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "Lclient!jaa;")
	private Class141 aClass141_4;

	static {
		new Class67("clan_chat", "clanchat", "conversation_clan", "clan_chat");
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!ad;)V")
	public Class124(@OriginalArg(0) Class5_Sub1 arg0) {
		this.aClass5_Sub1_14 = arg0;
		if (this.aClass5_Sub1_14.aBoolean43 && this.aClass5_Sub1_14.aBoolean40) {
			this.aClass141_2 = this.aClass141_3 = new Class141(this.aClass5_Sub1_14);
			if (this.aClass5_Sub1_14.anInt362 > 1 && this.aClass5_Sub1_14.aBoolean29 && this.aClass5_Sub1_14.aBoolean16) {
				this.aClass141_2 = this.aClass141_4 = new Class141(this.aClass5_Sub1_14);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public void method3479() {
		this.aClass141_2 = this.aClass141_4 = this.aClass141_3 = null;
		this.aClass3_Sub10_Sub14_1 = null;
		this.aClass11_Sub1Array1 = null;
		this.aClass11_Sub1_2 = null;
		this.aClass3_Sub10_Sub14_2 = null;
		if (!this.aClass71_35.method2085()) {
			for (@Pc(36) Class3 local36 = this.aClass71_35.method2089(); local36 != this.aClass71_35.aClass3_73; local36 = local36.aClass3_284) {
				((Class3_Sub4) local36).method3537();
			}
		}
		this.anInt4221 = this.anInt4212 = 1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!aq;B)V")
	public void method3480(@OriginalArg(0) Class3_Sub4 arg0) {
		arg0.aBoolean317 = false;
		arg0.method3537();
		arg0.method7820();
		this.method3485();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIIZ)Z")
	public boolean method3483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass141_2 == null || this.aClass71_35.method2085()) {
			return false;
		}
		if (arg1 != this.anInt4221 || this.anInt4212 != arg2) {
			this.anInt4221 = arg1;
			this.anInt4212 = arg2;
			for (@Pc(38) Class3 local38 = this.aClass71_35.method2089(); local38 != this.aClass71_35.aClass3_73; local38 = local38.aClass3_284) {
				((Class3_Sub4) local38).method3548(this.anInt4212, this.anInt4221);
			}
			this.aBoolean312 = true;
			this.aBoolean310 = true;
			this.aBoolean311 = true;
		}
		if (!this.method3484()) {
			return false;
		}
		this.anInt4218 = arg0;
		this.anInt4216 = arg3;
		this.aBoolean307 = true;
		this.aClass5_Sub1_14.method394(this.aClass141_2);
		this.aClass141_2.method3975(0);
		this.aClass5_Sub1_14.method387(this.anInt4212 + this.anInt4218 - this.aClass5_Sub1_14.anInt256, -this.anInt4216);
		return true;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)Z")
	private boolean method3484() {
		if (this.aBoolean310) {
			if (this.aClass3_Sub10_Sub14_2 != null) {
				this.aClass3_Sub10_Sub14_2.method5847();
				this.aClass3_Sub10_Sub14_2 = null;
			}
			if (this.aClass11_Sub1_2 != null) {
				this.aClass11_Sub1_2.method7306();
				this.aClass11_Sub1_2 = null;
			}
			if (this.aClass141_4 != null) {
				this.aClass3_Sub10_Sub14_2 = new Class3_Sub10_Sub14(this.aClass5_Sub1_14, 6402, this.anInt4221, this.anInt4212, this.aClass5_Sub1_14.anInt362);
			}
			if (this.aBoolean309) {
				this.aClass11_Sub1_2 = new Class11_Sub1(this.aClass5_Sub1_14, 34037, 6402, this.anInt4221, this.anInt4212);
			} else if (this.aClass3_Sub10_Sub14_2 == null) {
				this.aClass3_Sub10_Sub14_2 = new Class3_Sub10_Sub14(this.aClass5_Sub1_14, 6402, this.anInt4221, this.anInt4212);
			}
			this.aBoolean308 = true;
			this.aBoolean312 = true;
			this.aBoolean310 = false;
		}
		if (this.aBoolean311) {
			if (this.aClass3_Sub10_Sub14_1 != null) {
				this.aClass3_Sub10_Sub14_1.method5847();
				this.aClass3_Sub10_Sub14_1 = null;
			}
			if (this.aClass11_Sub1Array1[0] != null) {
				this.aClass11_Sub1Array1[0].method7306();
				this.aClass11_Sub1Array1[0] = null;
			}
			if (this.aClass11_Sub1Array1[1] != null) {
				this.aClass11_Sub1Array1[1].method7306();
				this.aClass11_Sub1Array1[1] = null;
			}
			if (this.aClass141_4 != null) {
				this.aClass3_Sub10_Sub14_1 = new Class3_Sub10_Sub14(this.aClass5_Sub1_14, this.anInt4223, this.anInt4221, this.anInt4212, this.aClass5_Sub1_14.anInt362);
			}
			this.aClass11_Sub1Array1[0] = new Class11_Sub1(this.aClass5_Sub1_14, 34037, this.anInt4223, this.anInt4221, this.anInt4212);
			this.aClass11_Sub1Array1[1] = this.anInt4225 <= 1 ? null : new Class11_Sub1(this.aClass5_Sub1_14, 34037, this.anInt4223, this.anInt4221, this.anInt4212);
			this.aBoolean308 = true;
			this.aBoolean311 = false;
			this.aBoolean312 = true;
		}
		if (this.aBoolean312) {
			if (this.aClass141_4 == null) {
				this.aClass5_Sub1_14.method394(this.aClass141_3);
				this.aClass141_3.method3978(0);
				this.aClass141_3.method3978(1);
				this.aClass141_3.method3978(8);
				this.aClass141_3.method3979(0, this.aClass11_Sub1Array1[0]);
				if (this.anInt4225 > 1) {
					this.aClass141_3.method3979(1, this.aClass11_Sub1Array1[1]);
				}
				if (this.aBoolean309) {
					this.aClass141_3.method3979(8, this.aClass11_Sub1_2);
				} else {
					this.aClass141_3.method3974(8, this.aClass3_Sub10_Sub14_2);
				}
				this.aClass5_Sub1_14.method389(this.aClass141_3);
			} else {
				this.aClass5_Sub1_14.method394(this.aClass141_3);
				this.aClass141_3.method3978(0);
				this.aClass141_3.method3978(1);
				this.aClass141_3.method3978(8);
				this.aClass141_3.method3979(0, this.aClass11_Sub1Array1[0]);
				if (this.anInt4225 > 1) {
					this.aClass141_3.method3979(1, this.aClass11_Sub1Array1[1]);
				}
				if (this.aBoolean309) {
					this.aClass141_3.method3979(8, this.aClass11_Sub1_2);
				}
				this.aClass5_Sub1_14.method389(this.aClass141_3);
				this.aClass5_Sub1_14.method394(this.aClass141_4);
				this.aClass141_4.method3978(0);
				this.aClass141_4.method3978(8);
				this.aClass141_4.method3974(0, this.aClass3_Sub10_Sub14_1);
				this.aClass141_4.method3974(8, this.aClass3_Sub10_Sub14_2);
				this.aClass5_Sub1_14.method389(this.aClass141_4);
			}
			this.aBoolean312 = false;
			this.aBoolean308 = true;
		}
		if (this.aBoolean308) {
			this.aClass5_Sub1_14.method394(this.aClass141_2);
			this.aBoolean308 = !this.aClass141_2.method3977();
			this.aClass5_Sub1_14.method389(this.aClass141_2);
		}
		return !this.aBoolean308;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	private void method3485() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class3_Sub4 local17 = (Class3_Sub4) this.aClass71_35.method2089(); local17 != null; local17 = (Class3_Sub4) this.aClass71_35.method2086()) {
			local23 = local17.method3546();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method3544();
			local7 |= local17.method3549();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt4223 != local23) {
			this.anInt4223 = local23;
			this.aBoolean311 = true;
		}
		@Pc(95) int local95 = this.anInt4225 > 2 ? 2 : this.anInt4225;
		@Pc(102) int local102 = local11 > 2 ? 2 : local11;
		if (local7 != this.aBoolean309) {
			this.aBoolean310 = true;
			this.aBoolean309 = local7;
		}
		if (local95 != local102) {
			this.aBoolean312 = this.aBoolean311 = true;
		}
		this.anInt4225 = local11;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)V")
	public void method3486() {
		if (!this.aBoolean307) {
			return;
		}
		if (this.aClass141_4 != null) {
			this.aClass5_Sub1_14.method458(this.aClass141_4);
			@Pc(20) short local20 = 16384;
			this.aClass5_Sub1_14.method459(this.aClass141_3);
			this.aClass141_4.method3980();
			this.aClass141_3.method3975(0);
			if (this.aBoolean309) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4221, this.anInt4212, 0, 0, this.anInt4221, this.anInt4212, local20, 9728);
			this.aClass5_Sub1_14.method460(this.aClass141_4);
			this.aClass5_Sub1_14.method431(this.aClass141_3);
		}
		this.aClass5_Sub1_14.method451();
		this.aClass5_Sub1_14.method455(0);
		this.aClass5_Sub1_14.method416(1);
		this.aClass5_Sub1_14.F();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class3_Sub4 local109;
		for (@Pc(101) Class3_Sub4 local101 = (Class3_Sub4) this.aClass71_35.method2089(); local101 != null; local101 = local109) {
			local109 = (Class3_Sub4) this.aClass71_35.method2086();
			@Pc(113) int local113 = local101.method3544();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method3547(local115, this.aClass11_Sub1Array1[local93], this.aClass11_Sub1_2);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass5_Sub1_14.method389(this.aClass141_3);
					this.aClass5_Sub1_14.method387(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4212);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4216, this.anInt4218);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4216, this.anInt4218 + this.anInt4212);
					OpenGL.glTexCoord2f((float) this.anInt4221, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4216 + this.anInt4221, this.anInt4212 + this.anInt4218);
					OpenGL.glTexCoord2f((float) this.anInt4221, (float) this.anInt4212);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4221 + this.anInt4216, this.anInt4218);
					OpenGL.glEnd();
				} else {
					this.aClass141_3.method3975(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4212);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4212);
					OpenGL.glTexCoord2f((float) this.anInt4221, (float) this.anInt4212);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4221, this.anInt4212);
					OpenGL.glTexCoord2f((float) this.anInt4221, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4221, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local93 = local93 + 1 & 0x1;
				local101.method3538(local115);
			}
		}
		this.aBoolean307 = false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!aq;)Z")
	public boolean method3488(@OriginalArg(1) Class3_Sub4 arg0) {
		if (this.aClass141_2 != null) {
			if (arg0.method3539() || arg0.method3540()) {
				this.aClass71_35.method2076(arg0);
				this.method3485();
				if (this.method3484()) {
					if (this.anInt4221 != -1 && this.anInt4212 != -1) {
						arg0.method3548(this.anInt4212, this.anInt4221);
					}
					arg0.aBoolean317 = true;
					return true;
				}
			}
			this.method3480(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Z")
	public boolean method3489() {
		return this.aClass141_2 != null;
	}
}
