import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ng")
public final class Class167 {

	@OriginalMember(owner = "client!ng", name = "r", descriptor = "Z")
	private boolean aBoolean311;

	@OriginalMember(owner = "client!ng", name = "v", descriptor = "Lclient!rc;")
	private Class2_Sub5_Sub14 aClass2_Sub5_Sub14_1;

	@OriginalMember(owner = "client!ng", name = "w", descriptor = "Lclient!rc;")
	private Class2_Sub5_Sub14 aClass2_Sub5_Sub14_2;

	@OriginalMember(owner = "client!ng", name = "D", descriptor = "Lclient!bd;")
	private Class20_Sub1 aClass20_Sub1_4;

	@OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
	private int anInt4396 = 0;

	@OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
	private int anInt4395 = 0;

	@OriginalMember(owner = "client!ng", name = "g", descriptor = "I")
	private int anInt4397 = 1;

	@OriginalMember(owner = "client!ng", name = "s", descriptor = "I")
	private int anInt4405 = 1;

	@OriginalMember(owner = "client!ng", name = "u", descriptor = "Lclient!mg;")
	private final Class156 aClass156_33 = new Class156();

	@OriginalMember(owner = "client!ng", name = "C", descriptor = "Z")
	private boolean aBoolean315 = true;

	@OriginalMember(owner = "client!ng", name = "z", descriptor = "[Lclient!bd;")
	private Class20_Sub1[] aClass20_Sub1Array2 = new Class20_Sub1[2];

	@OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
	private int anInt4407 = -1;

	@OriginalMember(owner = "client!ng", name = "A", descriptor = "Z")
	private boolean aBoolean313 = true;

	@OriginalMember(owner = "client!ng", name = "B", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!ng", name = "y", descriptor = "Z")
	private boolean aBoolean312 = true;

	@OriginalMember(owner = "client!ng", name = "F", descriptor = "I")
	private int anInt4408 = 0;

	@OriginalMember(owner = "client!ng", name = "E", descriptor = "Z")
	private boolean aBoolean316 = true;

	@OriginalMember(owner = "client!ng", name = "m", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_29;

	@OriginalMember(owner = "client!ng", name = "d", descriptor = "Lclient!eb;")
	private Class61 aClass61_3;

	@OriginalMember(owner = "client!ng", name = "h", descriptor = "Lclient!eb;")
	private Class61 aClass61_4;

	@OriginalMember(owner = "client!ng", name = "k", descriptor = "Lclient!eb;")
	private Class61 aClass61_5;

	@OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class167(@OriginalArg(0) Class163_Sub2 arg0) {
		this.aClass163_Sub2_29 = arg0;
		if (this.aClass163_Sub2_29.aBoolean368 && this.aClass163_Sub2_29.aBoolean377) {
			this.aClass61_4 = this.aClass61_3 = new Class61(this.aClass163_Sub2_29);
			if (this.aClass163_Sub2_29.anInt5218 > 1 && this.aClass163_Sub2_29.aBoolean369 && this.aClass163_Sub2_29.aBoolean382) {
				this.aClass61_4 = this.aClass61_5 = new Class61(this.aClass163_Sub2_29);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(ZLclient!ft;)Z")
	public boolean method3620(@OriginalArg(1) Class2_Sub9 arg0) {
		if (this.aClass61_4 != null) {
			if (arg0.method868() || arg0.method878()) {
				this.aClass156_33.method3157(arg0);
				this.method3628();
				if (this.method3625()) {
					if (this.anInt4397 != -1 && this.anInt4405 != -1) {
						arg0.method877(this.anInt4397, this.anInt4405);
					}
					arg0.aBoolean94 = true;
					return true;
				}
			}
			this.method3627(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)Z")
	public boolean method3621() {
		return this.aClass61_4 != null;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIII)Z")
	public boolean method3622(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass61_4 == null || this.aClass156_33.method3153()) {
			return false;
		}
		if (arg2 != this.anInt4397 || arg1 != this.anInt4405) {
			this.anInt4405 = arg1;
			this.anInt4397 = arg2;
			for (@Pc(45) Class2 local45 = this.aClass156_33.method3155(); local45 != this.aClass156_33.aClass2_159; local45 = local45.aClass2_264) {
				((Class2_Sub9) local45).method877(this.anInt4397, this.anInt4405);
			}
			this.aBoolean316 = true;
			this.aBoolean312 = true;
			this.aBoolean315 = true;
		}
		if (!this.method3625()) {
			return false;
		}
		this.anInt4396 = arg0;
		this.aBoolean311 = true;
		this.anInt4395 = arg3;
		this.aClass163_Sub2_29.method4142(this.aClass61_4);
		this.aClass61_4.method1402(0);
		this.aClass163_Sub2_29.method4158(-this.anInt4396, this.anInt4405 - this.aClass61_4.method1405() - this.anInt4395);
		return true;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V")
	public void method3624() {
		if (!this.aBoolean311) {
			return;
		}
		if (this.aClass61_5 != null) {
			this.aClass163_Sub2_29.method4150(this.aClass61_5);
			@Pc(20) short local20 = 16384;
			this.aClass163_Sub2_29.method4175(this.aClass61_3);
			this.aClass61_5.method1400();
			this.aClass61_3.method1402(0);
			if (this.aBoolean314) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4397, this.anInt4405, 0, 0, this.anInt4397, this.anInt4405, local20, 9728);
			this.aClass163_Sub2_29.method4153(this.aClass61_5);
			this.aClass163_Sub2_29.method4113(this.aClass61_3);
		}
		this.aClass163_Sub2_29.method4173();
		this.aClass163_Sub2_29.method4174(0);
		this.aClass163_Sub2_29.method4107(1);
		this.aClass163_Sub2_29.va();
		@Pc(106) int local106 = 0;
		@Pc(108) int local108 = 1;
		@Pc(124) Class2_Sub9 local124;
		for (@Pc(116) Class2_Sub9 local116 = (Class2_Sub9) this.aClass156_33.method3155(); local116 != null; local116 = local124) {
			local124 = (Class2_Sub9) this.aClass156_33.method3150();
			@Pc(128) int local128 = local116.method876();
			for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
				local116.method870(local130, this.aClass20_Sub1Array2[local106], this.aClass20_Sub1_4);
				if (local124 == null && local128 - 1 == local130) {
					this.aClass163_Sub2_29.method4111(this.aClass61_3);
					this.aClass163_Sub2_29.method4158(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4405);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4396, this.anInt4395);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4396, this.anInt4405 + this.anInt4395);
					OpenGL.glTexCoord2f((float) this.anInt4397, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4397 + this.anInt4396, this.anInt4405 + this.anInt4395);
					OpenGL.glTexCoord2f((float) this.anInt4397, (float) this.anInt4405);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4397 + this.anInt4396, this.anInt4395);
					OpenGL.glEnd();
				} else {
					this.aClass61_3.method1402(local108);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4405);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4405);
					OpenGL.glTexCoord2f((float) this.anInt4397, (float) this.anInt4405);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4397, this.anInt4405);
					OpenGL.glTexCoord2f((float) this.anInt4397, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4397, 0);
					OpenGL.glEnd();
				}
				local116.method867(local130);
				local108 = local108 + 1 & 0x1;
				local106 = local106 + 1 & 0x1;
			}
		}
		this.aBoolean311 = false;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)Z")
	private boolean method3625() {
		if (this.aBoolean312) {
			if (this.aClass2_Sub5_Sub14_1 != null) {
				this.aClass2_Sub5_Sub14_1.method4536();
				this.aClass2_Sub5_Sub14_1 = null;
			}
			if (this.aClass20_Sub1_4 != null) {
				this.aClass20_Sub1_4.method3108();
				this.aClass20_Sub1_4 = null;
			}
			if (this.aClass61_5 != null) {
				this.aClass2_Sub5_Sub14_1 = new Class2_Sub5_Sub14(this.aClass163_Sub2_29, 6402, this.anInt4397, this.anInt4405, this.aClass163_Sub2_29.anInt5218);
			}
			if (this.aBoolean314) {
				this.aClass20_Sub1_4 = new Class20_Sub1(this.aClass163_Sub2_29, 34037, 6402, this.anInt4397, this.anInt4405);
			} else if (this.aClass2_Sub5_Sub14_1 == null) {
				this.aClass2_Sub5_Sub14_1 = new Class2_Sub5_Sub14(this.aClass163_Sub2_29, 6402, this.anInt4397, this.anInt4405);
			}
			this.aBoolean313 = true;
			this.aBoolean316 = true;
			this.aBoolean312 = false;
		}
		if (this.aBoolean315) {
			if (this.aClass2_Sub5_Sub14_2 != null) {
				this.aClass2_Sub5_Sub14_2.method4536();
				this.aClass2_Sub5_Sub14_2 = null;
			}
			if (this.aClass20_Sub1Array2[0] != null) {
				this.aClass20_Sub1Array2[0].method3108();
				this.aClass20_Sub1Array2[0] = null;
			}
			if (this.aClass20_Sub1Array2[1] != null) {
				this.aClass20_Sub1Array2[1].method3108();
				this.aClass20_Sub1Array2[1] = null;
			}
			if (this.aClass61_5 != null) {
				this.aClass2_Sub5_Sub14_2 = new Class2_Sub5_Sub14(this.aClass163_Sub2_29, this.anInt4407, this.anInt4397, this.anInt4405, this.aClass163_Sub2_29.anInt5218);
			}
			this.aClass20_Sub1Array2[0] = new Class20_Sub1(this.aClass163_Sub2_29, 34037, this.anInt4407, this.anInt4397, this.anInt4405);
			this.aClass20_Sub1Array2[1] = this.anInt4408 <= 1 ? null : new Class20_Sub1(this.aClass163_Sub2_29, 34037, this.anInt4407, this.anInt4397, this.anInt4405);
			this.aBoolean313 = true;
			this.aBoolean315 = false;
			this.aBoolean316 = true;
		}
		if (this.aBoolean316) {
			if (this.aClass61_5 == null) {
				this.aClass163_Sub2_29.method4142(this.aClass61_3);
				this.aClass61_3.method1407(0);
				this.aClass61_3.method1407(1);
				this.aClass61_3.method1407(8);
				this.aClass61_3.method1413(0, this.aClass20_Sub1Array2[0]);
				if (this.anInt4408 > 1) {
					this.aClass61_3.method1413(1, this.aClass20_Sub1Array2[1]);
				}
				if (this.aBoolean314) {
					this.aClass61_3.method1413(8, this.aClass20_Sub1_4);
				} else {
					this.aClass61_3.method1401(this.aClass2_Sub5_Sub14_1, 8);
				}
				this.aClass163_Sub2_29.method4111(this.aClass61_3);
			} else {
				this.aClass163_Sub2_29.method4142(this.aClass61_3);
				this.aClass61_3.method1407(0);
				this.aClass61_3.method1407(1);
				this.aClass61_3.method1407(8);
				this.aClass61_3.method1413(0, this.aClass20_Sub1Array2[0]);
				if (this.anInt4408 > 1) {
					this.aClass61_3.method1413(1, this.aClass20_Sub1Array2[1]);
				}
				if (this.aBoolean314) {
					this.aClass61_3.method1413(8, this.aClass20_Sub1_4);
				}
				this.aClass163_Sub2_29.method4111(this.aClass61_3);
				this.aClass163_Sub2_29.method4142(this.aClass61_5);
				this.aClass61_5.method1407(0);
				this.aClass61_5.method1407(8);
				this.aClass61_5.method1401(this.aClass2_Sub5_Sub14_2, 0);
				this.aClass61_5.method1401(this.aClass2_Sub5_Sub14_1, 8);
				this.aClass163_Sub2_29.method4111(this.aClass61_5);
			}
			this.aBoolean313 = true;
			this.aBoolean316 = false;
		}
		if (this.aBoolean313) {
			this.aClass163_Sub2_29.method4142(this.aClass61_4);
			this.aBoolean313 = !this.aClass61_4.method1410();
			this.aClass163_Sub2_29.method4111(this.aClass61_4);
		}
		return !this.aBoolean313;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lclient!ft;B)V")
	public void method3627(@OriginalArg(0) Class2_Sub9 arg0) {
		arg0.aBoolean94 = false;
		arg0.method875();
		arg0.method5703();
		this.method3628();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(B)V")
	private void method3628() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(19) int local19 = 0;
		@Pc(31) int local31;
		for (@Pc(25) Class2_Sub9 local25 = (Class2_Sub9) this.aClass156_33.method3155(); local25 != null; local25 = (Class2_Sub9) this.aClass156_33.method3150()) {
			local31 = local25.method869();
			if (local31 > local9) {
				local9 = local31;
			}
			local19 += local25.method876();
			local7 |= local25.method874();
		}
		if (local9 == 2) {
			local31 = 34836;
		} else if (local9 == 1) {
			local31 = 34842;
		} else {
			local31 = 6408;
		}
		if (local31 != this.anInt4407) {
			this.anInt4407 = local31;
			this.aBoolean315 = true;
		}
		@Pc(101) int local101 = this.anInt4408 > 2 ? 2 : this.anInt4408;
		@Pc(108) int local108 = local19 <= 2 ? local19 : 2;
		if (this.aBoolean314 != local7) {
			this.aBoolean314 = local7;
			this.aBoolean312 = true;
		}
		if (local108 != local101) {
			this.aBoolean316 = this.aBoolean315 = true;
		}
		this.anInt4408 = local19;
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V")
	public void method3629() {
		this.aClass20_Sub1Array2 = null;
		this.aClass61_4 = this.aClass61_5 = this.aClass61_3 = null;
		this.aClass2_Sub5_Sub14_2 = null;
		this.aClass2_Sub5_Sub14_1 = null;
		this.aClass20_Sub1_4 = null;
		if (!this.aClass156_33.method3153()) {
			for (@Pc(43) Class2 local43 = this.aClass156_33.method3155(); local43 != this.aClass156_33.aClass2_159; local43 = local43.aClass2_264) {
				((Class2_Sub9) local43).method875();
			}
		}
		this.anInt4397 = this.anInt4405 = 1;
	}
}
