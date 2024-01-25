import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oa")
public final class Class248 {

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Z")
	private boolean aBoolean486;

	@OriginalMember(owner = "client!oa", name = "C", descriptor = "Lclient!dh;")
	private Class2_Sub2_Sub3 aClass2_Sub2_Sub3_1;

	@OriginalMember(owner = "client!oa", name = "F", descriptor = "Lclient!dh;")
	private Class2_Sub2_Sub3 aClass2_Sub2_Sub3_2;

	@OriginalMember(owner = "client!oa", name = "H", descriptor = "Lclient!aaa;")
	private Class3_Sub1 aClass3_Sub1_3;

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "I")
	private int anInt6217 = 0;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	private int anInt6224 = 1;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "I")
	private int anInt6226 = 0;

	@OriginalMember(owner = "client!oa", name = "f", descriptor = "I")
	private int anInt6218 = 1;

	@OriginalMember(owner = "client!oa", name = "e", descriptor = "Lclient!dc;")
	private final Class70 aClass70_41 = new Class70();

	@OriginalMember(owner = "client!oa", name = "B", descriptor = "Z")
	private boolean aBoolean488 = false;

	@OriginalMember(owner = "client!oa", name = "z", descriptor = "Z")
	private boolean aBoolean487 = true;

	@OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
	private int anInt6233 = -1;

	@OriginalMember(owner = "client!oa", name = "G", descriptor = "Z")
	private boolean aBoolean489 = true;

	@OriginalMember(owner = "client!oa", name = "K", descriptor = "[Lclient!aaa;")
	private Class3_Sub1[] aClass3_Sub1Array4 = new Class3_Sub1[2];

	@OriginalMember(owner = "client!oa", name = "J", descriptor = "Z")
	private boolean aBoolean491 = true;

	@OriginalMember(owner = "client!oa", name = "E", descriptor = "I")
	private int anInt6234 = 0;

	@OriginalMember(owner = "client!oa", name = "I", descriptor = "Z")
	private boolean aBoolean490 = true;

	@OriginalMember(owner = "client!oa", name = "m", descriptor = "Lclient!uca;")
	private final Class162_Sub3 aClass162_Sub3_28;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!ffa;")
	private Class105 aClass105_4;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!ffa;")
	private Class105 aClass105_3;

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!ffa;")
	private Class105 aClass105_5;

	@OriginalMember(owner = "client!oa", name = "<init>", descriptor = "(Lclient!uca;)V")
	public Class248(@OriginalArg(0) Class162_Sub3 arg0) {
		this.aClass162_Sub3_28 = arg0;
		if (this.aClass162_Sub3_28.aBoolean721 && this.aClass162_Sub3_28.aBoolean735) {
			this.aClass105_3 = this.aClass105_4 = new Class105(this.aClass162_Sub3_28);
			if (this.aClass162_Sub3_28.anInt8678 > 1 && this.aClass162_Sub3_28.aBoolean727 && this.aClass162_Sub3_28.aBoolean737) {
				this.aClass105_3 = this.aClass105_5 = new Class105(this.aClass162_Sub3_28);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!ff;Z)V")
	public void method5206(@OriginalArg(0) Class2_Sub15 arg0) {
		arg0.aBoolean369 = false;
		arg0.method4038();
		arg0.method7657();
		this.method5214();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Z)Z")
	private boolean method5209() {
		if (this.aBoolean487) {
			if (this.aClass2_Sub2_Sub3_2 != null) {
				this.aClass2_Sub2_Sub3_2.method1386();
				this.aClass2_Sub2_Sub3_2 = null;
			}
			if (this.aClass3_Sub1_3 != null) {
				this.aClass3_Sub1_3.method5569();
				this.aClass3_Sub1_3 = null;
			}
			if (this.aClass105_5 != null) {
				this.aClass2_Sub2_Sub3_2 = new Class2_Sub2_Sub3(this.aClass162_Sub3_28, 6402, this.anInt6224, this.anInt6218, this.aClass162_Sub3_28.anInt8678);
			}
			if (this.aBoolean488) {
				this.aClass3_Sub1_3 = new Class3_Sub1(this.aClass162_Sub3_28, 34037, 6402, this.anInt6224, this.anInt6218);
			} else if (this.aClass2_Sub2_Sub3_2 == null) {
				this.aClass2_Sub2_Sub3_2 = new Class2_Sub2_Sub3(this.aClass162_Sub3_28, 6402, this.anInt6224, this.anInt6218);
			}
			this.aBoolean487 = false;
			this.aBoolean489 = true;
			this.aBoolean491 = true;
		}
		if (this.aBoolean490) {
			if (this.aClass2_Sub2_Sub3_1 != null) {
				this.aClass2_Sub2_Sub3_1.method1386();
				this.aClass2_Sub2_Sub3_1 = null;
			}
			if (this.aClass3_Sub1Array4[0] != null) {
				this.aClass3_Sub1Array4[0].method5569();
				this.aClass3_Sub1Array4[0] = null;
			}
			if (this.aClass3_Sub1Array4[1] != null) {
				this.aClass3_Sub1Array4[1].method5569();
				this.aClass3_Sub1Array4[1] = null;
			}
			if (this.aClass105_5 != null) {
				this.aClass2_Sub2_Sub3_1 = new Class2_Sub2_Sub3(this.aClass162_Sub3_28, this.anInt6233, this.anInt6224, this.anInt6218, this.aClass162_Sub3_28.anInt8678);
			}
			this.aClass3_Sub1Array4[0] = new Class3_Sub1(this.aClass162_Sub3_28, 34037, this.anInt6233, this.anInt6224, this.anInt6218);
			this.aClass3_Sub1Array4[1] = this.anInt6234 <= 1 ? null : new Class3_Sub1(this.aClass162_Sub3_28, 34037, this.anInt6233, this.anInt6224, this.anInt6218);
			this.aBoolean490 = false;
			this.aBoolean491 = true;
			this.aBoolean489 = true;
		}
		if (this.aBoolean489) {
			if (this.aClass105_5 == null) {
				this.aClass162_Sub3_28.method6942(this.aClass105_4);
				this.aClass105_4.method1949(0);
				this.aClass105_4.method1949(1);
				this.aClass105_4.method1949(8);
				this.aClass105_4.method1940(this.aClass3_Sub1Array4[0], 0);
				if (this.anInt6234 > 1) {
					this.aClass105_4.method1940(this.aClass3_Sub1Array4[1], 1);
				}
				if (this.aBoolean488) {
					this.aClass105_4.method1940(this.aClass3_Sub1_3, 8);
				} else {
					this.aClass105_4.method1944(this.aClass2_Sub2_Sub3_2, 8);
				}
				this.aClass162_Sub3_28.method6897(this.aClass105_4);
			} else {
				this.aClass162_Sub3_28.method6942(this.aClass105_4);
				this.aClass105_4.method1949(0);
				this.aClass105_4.method1949(1);
				this.aClass105_4.method1949(8);
				this.aClass105_4.method1940(this.aClass3_Sub1Array4[0], 0);
				if (this.anInt6234 > 1) {
					this.aClass105_4.method1940(this.aClass3_Sub1Array4[1], 1);
				}
				if (this.aBoolean488) {
					this.aClass105_4.method1940(this.aClass3_Sub1_3, 8);
				}
				this.aClass162_Sub3_28.method6897(this.aClass105_4);
				this.aClass162_Sub3_28.method6942(this.aClass105_5);
				this.aClass105_5.method1949(0);
				this.aClass105_5.method1949(8);
				this.aClass105_5.method1944(this.aClass2_Sub2_Sub3_1, 0);
				this.aClass105_5.method1944(this.aClass2_Sub2_Sub3_2, 8);
				this.aClass162_Sub3_28.method6897(this.aClass105_5);
			}
			this.aBoolean489 = false;
			this.aBoolean491 = true;
		}
		if (this.aBoolean491) {
			this.aClass162_Sub3_28.method6942(this.aClass105_3);
			this.aBoolean491 = !this.aClass105_3.method1943();
			this.aClass162_Sub3_28.method6897(this.aClass105_3);
		}
		return !this.aBoolean491;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ff;)Z")
	public boolean method5210(@OriginalArg(1) Class2_Sub15 arg0) {
		if (this.aClass105_3 != null) {
			if (arg0.method4029() || arg0.method4036()) {
				this.aClass70_41.method1269(arg0);
				this.method5214();
				if (this.method5209()) {
					if (this.anInt6224 != -1 && this.anInt6218 != -1) {
						arg0.method4032(this.anInt6224, this.anInt6218);
					}
					arg0.aBoolean369 = true;
					return true;
				}
			}
			this.method5206(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public void method5211() {
		this.aClass2_Sub2_Sub3_2 = null;
		this.aClass105_3 = this.aClass105_5 = this.aClass105_4 = null;
		this.aClass2_Sub2_Sub3_1 = null;
		this.aClass3_Sub1Array4 = null;
		this.aClass3_Sub1_3 = null;
		if (!this.aClass70_41.method1263()) {
			for (@Pc(40) Class2 local40 = this.aClass70_41.method1264(); local40 != this.aClass70_41.aClass2_39; local40 = local40.aClass2_286) {
				((Class2_Sub15) local40).method4038();
			}
		}
		this.anInt6224 = this.anInt6218 = 1;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)Z")
	public boolean method5212() {
		return this.aClass105_3 != null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIIBI)Z")
	public boolean method5213(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass105_3 == null || this.aClass70_41.method1263()) {
			return false;
		}
		if (arg2 != this.anInt6224 || this.anInt6218 != arg1) {
			this.anInt6218 = arg1;
			this.anInt6224 = arg2;
			for (@Pc(46) Class2 local46 = this.aClass70_41.method1264(); local46 != this.aClass70_41.aClass2_39; local46 = local46.aClass2_286) {
				((Class2_Sub15) local46).method4032(this.anInt6224, this.anInt6218);
			}
			this.aBoolean489 = true;
			this.aBoolean487 = true;
			this.aBoolean490 = true;
		}
		if (!this.method5209()) {
			return false;
		}
		this.anInt6226 = arg0;
		this.anInt6217 = arg3;
		this.aBoolean486 = true;
		this.aClass162_Sub3_28.method6942(this.aClass105_3);
		this.aClass105_3.method1950(0);
		this.aClass162_Sub3_28.method6966(-this.anInt6217, this.anInt6226 + this.anInt6218 - this.aClass162_Sub3_28.anInt8634);
		return true;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	private void method5214() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub15 local17 = (Class2_Sub15) this.aClass70_41.method1264(); local17 != null; local17 = (Class2_Sub15) this.aClass70_41.method1261()) {
			local23 = local17.method4035();
			local11 += local17.method4027();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method4033();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt6233) {
			this.aBoolean490 = true;
			this.anInt6233 = local23;
		}
		@Pc(99) int local99 = this.anInt6234 <= 2 ? this.anInt6234 : 2;
		@Pc(106) int local106 = local11 <= 2 ? local11 : 2;
		if (local106 != local99) {
			this.aBoolean489 = this.aBoolean490 = true;
		}
		if (local7 != this.aBoolean488) {
			this.aBoolean487 = true;
			this.aBoolean488 = local7;
		}
		this.anInt6234 = local11;
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(Z)V")
	public void method5215() {
		if (!this.aBoolean486) {
			return;
		}
		if (this.aClass105_5 != null) {
			@Pc(18) short local18 = 16384;
			this.aClass162_Sub3_28.method6927(this.aClass105_5);
			this.aClass162_Sub3_28.method6902(this.aClass105_4);
			this.aClass105_5.method1951();
			this.aClass105_4.method1950(0);
			if (this.aBoolean488) {
				local18 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6224, this.anInt6218, 0, 0, this.anInt6224, this.anInt6218, local18, 9728);
			this.aClass162_Sub3_28.method6901(this.aClass105_5);
			this.aClass162_Sub3_28.method6894(this.aClass105_4);
		}
		this.aClass162_Sub3_28.method6950();
		this.aClass162_Sub3_28.method6923(0);
		this.aClass162_Sub3_28.method6953(1);
		this.aClass162_Sub3_28.JA();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(113) Class2_Sub15 local113;
		for (@Pc(105) Class2_Sub15 local105 = (Class2_Sub15) this.aClass70_41.method1264(); local105 != null; local105 = local113) {
			local113 = (Class2_Sub15) this.aClass70_41.method1261();
			@Pc(117) int local117 = local105.method4027();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method4039(this.aClass3_Sub1_3, this.aClass3_Sub1Array4[local93], local119);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass162_Sub3_28.method6897(this.aClass105_4);
					this.aClass162_Sub3_28.method6966(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6218);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6217, this.anInt6226);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6217, this.anInt6218 + this.anInt6226);
					OpenGL.glTexCoord2f((float) this.anInt6224, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6224 + this.anInt6217, this.anInt6218 + this.anInt6226);
					OpenGL.glTexCoord2f((float) this.anInt6224, (float) this.anInt6218);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6217 + this.anInt6224, this.anInt6226);
					OpenGL.glEnd();
				} else {
					this.aClass105_4.method1950(--local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6218);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6218);
					OpenGL.glTexCoord2f((float) this.anInt6224, (float) this.anInt6218);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6224, this.anInt6218);
					OpenGL.glTexCoord2f((float) this.anInt6224, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6224, 0);
					OpenGL.glEnd();
				}
				local93 = local93 + 1 & 0x1;
				local105.method4031(local119);
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean486 = false;
	}
}
