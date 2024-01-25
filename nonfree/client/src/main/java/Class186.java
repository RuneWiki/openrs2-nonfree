import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class186 {

	@OriginalMember(owner = "client!iq", name = "q", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "Lclient!eb;")
	private Class2_Sub6_Sub4 aClass2_Sub6_Sub4_1;

	@OriginalMember(owner = "client!iq", name = "x", descriptor = "Lclient!ng;")
	private Class64_Sub4 aClass64_Sub4_4;

	@OriginalMember(owner = "client!iq", name = "w", descriptor = "Lclient!eb;")
	private Class2_Sub6_Sub4 aClass2_Sub6_Sub4_2;

	@OriginalMember(owner = "client!iq", name = "p", descriptor = "I")
	private int anInt4370 = 1;

	@OriginalMember(owner = "client!iq", name = "j", descriptor = "I")
	private int anInt4369 = 1;

	@OriginalMember(owner = "client!iq", name = "l", descriptor = "I")
	private int anInt4378 = 0;

	@OriginalMember(owner = "client!iq", name = "h", descriptor = "I")
	private int anInt4376 = 0;

	@OriginalMember(owner = "client!iq", name = "A", descriptor = "Lclient!cga;")
	private final Class60 aClass60_89 = new Class60();

	@OriginalMember(owner = "client!iq", name = "C", descriptor = "[Lclient!ng;")
	private Class64_Sub4[] aClass64_Sub4Array2 = new Class64_Sub4[2];

	@OriginalMember(owner = "client!iq", name = "E", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!iq", name = "s", descriptor = "Z")
	private boolean aBoolean380 = true;

	@OriginalMember(owner = "client!iq", name = "r", descriptor = "Z")
	private boolean aBoolean382 = true;

	@OriginalMember(owner = "client!iq", name = "t", descriptor = "I")
	private int anInt4381 = -1;

	@OriginalMember(owner = "client!iq", name = "m", descriptor = "I")
	private int anInt4382 = 0;

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "Z")
	private boolean aBoolean383 = true;

	@OriginalMember(owner = "client!iq", name = "k", descriptor = "Z")
	private boolean aBoolean384 = true;

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "Lclient!uja;")
	private final Class145_Sub3 aClass145_Sub3_23;

	@OriginalMember(owner = "client!iq", name = "D", descriptor = "Lclient!hi;")
	private Class155 aClass155_5;

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "Lclient!hi;")
	private Class155 aClass155_3;

	@OriginalMember(owner = "client!iq", name = "g", descriptor = "Lclient!hi;")
	private Class155 aClass155_4;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!uja;)V")
	public Class186(@OriginalArg(0) Class145_Sub3 arg0) {
		this.aClass145_Sub3_23 = arg0;
		if (this.aClass145_Sub3_23.aBoolean876 && this.aClass145_Sub3_23.aBoolean860) {
			this.aClass155_3 = this.aClass155_5 = new Class155(this.aClass145_Sub3_23);
			if (this.aClass145_Sub3_23.anInt10104 > 1 && this.aClass145_Sub3_23.aBoolean866 && this.aClass145_Sub3_23.aBoolean861) {
				this.aClass155_3 = this.aClass155_4 = new Class155(this.aClass145_Sub3_23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lclient!aaa;I)Z")
	public boolean method3946(@OriginalArg(0) Class2_Sub1 arg0) {
		if (this.aClass155_3 != null) {
			if (arg0.method3766() || arg0.method3764()) {
				this.aClass60_89.method1233(arg0);
				this.method3951();
				if (this.method3953()) {
					if (this.anInt4369 != -1 && this.anInt4370 != -1) {
						arg0.method3768(this.anInt4369, this.anInt4370);
					}
					arg0.aBoolean371 = true;
					return true;
				}
			}
			this.method3947(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZLclient!aaa;)V")
	public void method3947(@OriginalArg(1) Class2_Sub1 arg0) {
		arg0.aBoolean371 = false;
		arg0.method3765();
		arg0.method9872();
		this.method3951();
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(B)Z")
	public boolean method3948() {
		return this.aClass155_3 != null;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	public void method3949() {
		if (!this.aBoolean379) {
			return;
		}
		if (this.aClass155_4 != null) {
			this.aClass145_Sub3_23.method8858(this.aClass155_4);
			@Pc(31) short local31 = 16384;
			this.aClass145_Sub3_23.method8870(this.aClass155_5);
			this.aClass155_4.method3381();
			this.aClass155_5.method3389(0);
			if (this.aBoolean381) {
				local31 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4369, this.anInt4370, 0, 0, this.anInt4369, this.anInt4370, local31, 9728);
			this.aClass145_Sub3_23.method8871(this.aClass155_4);
			this.aClass145_Sub3_23.method8887(this.aClass155_5);
		}
		this.aClass145_Sub3_23.method8894();
		this.aClass145_Sub3_23.method8847(0);
		this.aClass145_Sub3_23.method8900(1);
		this.aClass145_Sub3_23.la();
		@Pc(102) int local102 = 0;
		@Pc(104) int local104 = 1;
		@Pc(122) Class2_Sub1 local122;
		for (@Pc(112) Class2_Sub1 local112 = (Class2_Sub1) this.aClass60_89.method1226(7); local112 != null; local112 = local122) {
			local122 = (Class2_Sub1) this.aClass60_89.method1228();
			@Pc(128) int local128 = local112.method3763();
			for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
				local112.method3761(local130, this.aClass64_Sub4Array2[local102], this.aClass64_Sub4_4);
				if (local122 == null && local128 - 1 == local130) {
					this.aClass145_Sub3_23.method8863(this.aClass155_5);
					this.aClass145_Sub3_23.method8920(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4370);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4378, this.anInt4376);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4378, this.anInt4376 + this.anInt4370);
					OpenGL.glTexCoord2f((float) this.anInt4369, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4378 + this.anInt4369, this.anInt4376 - -this.anInt4370);
					OpenGL.glTexCoord2f((float) this.anInt4369, (float) this.anInt4370);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4369 + this.anInt4378, this.anInt4376);
					OpenGL.glEnd();
				} else {
					this.aClass155_5.method3389(local104);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4370);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4370);
					OpenGL.glTexCoord2f((float) this.anInt4369, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4369, this.anInt4370);
					OpenGL.glTexCoord2f((float) this.anInt4369, (float) this.anInt4370);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4369, 0);
					OpenGL.glEnd();
				}
				local112.method3759(local130);
				local104 = local104 + 1 & 0x1;
				local102 = local102 + 1 & 0x1;
			}
		}
		this.aBoolean379 = false;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)V")
	private void method3951() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(20) int local20 = 0;
		@Pc(34) int local34;
		for (@Pc(26) Class2_Sub1 local26 = (Class2_Sub1) this.aClass60_89.method1226(7); local26 != null; local26 = (Class2_Sub1) this.aClass60_89.method1228()) {
			local34 = local26.method3762();
			if (local9 < local34) {
				local9 = local34;
			}
			local20 += local26.method3763();
			local7 |= local26.method3760();
		}
		if (local9 == 2) {
			local34 = 34836;
		} else if (local9 == 1) {
			local34 = 34842;
		} else {
			local34 = 6408;
		}
		if (this.anInt4381 != local34) {
			this.anInt4381 = local34;
			this.aBoolean384 = true;
		}
		@Pc(115) int local115 = this.anInt4382 > 2 ? 2 : this.anInt4382;
		@Pc(123) int local123 = local20 > 2 ? 2 : local20;
		if (local115 != local123) {
			this.aBoolean380 = this.aBoolean384 = true;
		}
		this.anInt4382 = local20;
		if (this.aBoolean381 != local7) {
			this.aBoolean381 = local7;
			this.aBoolean383 = true;
		}
	}

	@OriginalMember(owner = "client!iq", name = "c", descriptor = "(I)V")
	public void method3952() {
		this.aClass2_Sub6_Sub4_2 = null;
		this.aClass155_3 = this.aClass155_4 = this.aClass155_5 = null;
		this.aClass2_Sub6_Sub4_1 = null;
		this.aClass64_Sub4_4 = null;
		this.aClass64_Sub4Array2 = null;
		if (!this.aClass60_89.method1221()) {
			for (@Pc(38) Class2 local38 = this.aClass60_89.method1226(7); local38 != this.aClass60_89.aClass2_47; local38 = local38.aClass2_345) {
				((Class2_Sub1) local38).method3765();
			}
		}
		this.anInt4369 = this.anInt4370 = 1;
	}

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "(I)Z")
	private boolean method3953() {
		if (this.aBoolean383) {
			if (this.aClass2_Sub6_Sub4_2 != null) {
				this.aClass2_Sub6_Sub4_2.method1974();
				this.aClass2_Sub6_Sub4_2 = null;
			}
			if (this.aClass64_Sub4_4 != null) {
				this.aClass64_Sub4_4.method4545();
				this.aClass64_Sub4_4 = null;
			}
			if (this.aClass155_4 != null) {
				this.aClass2_Sub6_Sub4_2 = new Class2_Sub6_Sub4(this.aClass145_Sub3_23, 6402, this.anInt4369, this.anInt4370, this.aClass145_Sub3_23.anInt10104);
			}
			if (this.aBoolean381) {
				this.aClass64_Sub4_4 = new Class64_Sub4(this.aClass145_Sub3_23, 34037, 6402, this.anInt4369, this.anInt4370);
			} else if (this.aClass2_Sub6_Sub4_2 == null) {
				this.aClass2_Sub6_Sub4_2 = new Class2_Sub6_Sub4(this.aClass145_Sub3_23, 6402, this.anInt4369, this.anInt4370);
			}
			this.aBoolean383 = false;
			this.aBoolean382 = true;
			this.aBoolean380 = true;
		}
		if (this.aBoolean384) {
			if (this.aClass2_Sub6_Sub4_1 != null) {
				this.aClass2_Sub6_Sub4_1.method1974();
				this.aClass2_Sub6_Sub4_1 = null;
			}
			if (this.aClass64_Sub4Array2[0] != null) {
				this.aClass64_Sub4Array2[0].method4545();
				this.aClass64_Sub4Array2[0] = null;
			}
			if (this.aClass64_Sub4Array2[1] != null) {
				this.aClass64_Sub4Array2[1].method4545();
				this.aClass64_Sub4Array2[1] = null;
			}
			if (this.aClass155_4 != null) {
				this.aClass2_Sub6_Sub4_1 = new Class2_Sub6_Sub4(this.aClass145_Sub3_23, this.anInt4381, this.anInt4369, this.anInt4370, this.aClass145_Sub3_23.anInt10104);
			}
			this.aClass64_Sub4Array2[0] = new Class64_Sub4(this.aClass145_Sub3_23, 34037, this.anInt4381, this.anInt4369, this.anInt4370);
			this.aClass64_Sub4Array2[1] = this.anInt4382 <= 1 ? null : new Class64_Sub4(this.aClass145_Sub3_23, 34037, this.anInt4381, this.anInt4369, this.anInt4370);
			this.aBoolean380 = true;
			this.aBoolean384 = false;
			this.aBoolean382 = true;
		}
		if (this.aBoolean380) {
			if (this.aClass155_4 == null) {
				this.aClass145_Sub3_23.method8906(this.aClass155_5);
				this.aClass155_5.method3380(0);
				this.aClass155_5.method3380(1);
				this.aClass155_5.method3380(8);
				this.aClass155_5.method3391(this.aClass64_Sub4Array2[0], 0);
				if (this.anInt4382 > 1) {
					this.aClass155_5.method3391(this.aClass64_Sub4Array2[1], 1);
				}
				if (this.aBoolean381) {
					this.aClass155_5.method3391(this.aClass64_Sub4_4, 8);
				} else {
					this.aClass155_5.method3382(8, this.aClass2_Sub6_Sub4_2);
				}
				this.aClass145_Sub3_23.method8863(this.aClass155_5);
			} else {
				this.aClass145_Sub3_23.method8906(this.aClass155_5);
				this.aClass155_5.method3380(0);
				this.aClass155_5.method3380(1);
				this.aClass155_5.method3380(8);
				this.aClass155_5.method3391(this.aClass64_Sub4Array2[0], 0);
				if (this.anInt4382 > 1) {
					this.aClass155_5.method3391(this.aClass64_Sub4Array2[1], 1);
				}
				if (this.aBoolean381) {
					this.aClass155_5.method3391(this.aClass64_Sub4_4, 8);
				}
				this.aClass145_Sub3_23.method8863(this.aClass155_5);
				this.aClass145_Sub3_23.method8906(this.aClass155_4);
				this.aClass155_4.method3380(0);
				this.aClass155_4.method3380(8);
				this.aClass155_4.method3382(0, this.aClass2_Sub6_Sub4_1);
				this.aClass155_4.method3382(8, this.aClass2_Sub6_Sub4_2);
				this.aClass145_Sub3_23.method8863(this.aClass155_4);
			}
			this.aBoolean382 = true;
			this.aBoolean380 = false;
		}
		if (this.aBoolean382) {
			this.aClass145_Sub3_23.method8906(this.aClass155_3);
			this.aBoolean382 = !this.aClass155_3.method3383();
			this.aClass145_Sub3_23.method8863(this.aClass155_3);
		}
		return !this.aBoolean382;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIBI)Z")
	public boolean method3955(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass155_3 == null || this.aClass60_89.method1221()) {
			return false;
		}
		if (arg2 != this.anInt4369 || arg1 != this.anInt4370) {
			this.anInt4369 = arg2;
			this.anInt4370 = arg1;
			for (@Pc(45) Class2 local45 = this.aClass60_89.method1226(7); local45 != this.aClass60_89.aClass2_47; local45 = local45.aClass2_345) {
				((Class2_Sub1) local45).method3768(this.anInt4369, this.anInt4370);
			}
			this.aBoolean383 = true;
			this.aBoolean384 = true;
			this.aBoolean380 = true;
		}
		if (!this.method3953()) {
			return false;
		}
		this.aBoolean379 = true;
		this.anInt4376 = arg0;
		this.anInt4378 = arg3;
		this.aClass145_Sub3_23.method8906(this.aClass155_3);
		this.aClass155_3.method3389(0);
		this.aClass145_Sub3_23.method8920(this.anInt4370 + this.anInt4376 - this.aClass145_Sub3_23.anInt10030, -this.anInt4378);
		return true;
	}
}
