import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public final class Class209 {

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Z")
	private boolean aBoolean345;

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "Lclient!kia;")
	private Class29_Sub3 aClass29_Sub3_4;

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "Lclient!ad;")
	private Class5_Sub1_Sub1 aClass5_Sub1_Sub1_1;

	@OriginalMember(owner = "client!kp", name = "E", descriptor = "Lclient!ad;")
	private Class5_Sub1_Sub1 aClass5_Sub1_Sub1_2;

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	private int anInt5333 = 1;

	@OriginalMember(owner = "client!kp", name = "m", descriptor = "I")
	private int anInt5338 = 0;

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "I")
	private int anInt5340 = 1;

	@OriginalMember(owner = "client!kp", name = "G", descriptor = "I")
	private int anInt5344 = 0;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "Lclient!at;")
	private final Class20 aClass20_21 = new Class20();

	@OriginalMember(owner = "client!kp", name = "I", descriptor = "Z")
	private boolean aBoolean346 = true;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "[Lclient!kia;")
	private Class29_Sub3[] aClass29_Sub3Array2 = new Class29_Sub3[2];

	@OriginalMember(owner = "client!kp", name = "B", descriptor = "Z")
	private boolean aBoolean347 = true;

	@OriginalMember(owner = "client!kp", name = "F", descriptor = "Z")
	private boolean aBoolean349 = true;

	@OriginalMember(owner = "client!kp", name = "C", descriptor = "I")
	private int anInt5347 = -1;

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "Z")
	private boolean aBoolean348 = false;

	@OriginalMember(owner = "client!kp", name = "q", descriptor = "I")
	private int anInt5346 = 0;

	@OriginalMember(owner = "client!kp", name = "t", descriptor = "Z")
	private boolean aBoolean350 = true;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_24;

	@OriginalMember(owner = "client!kp", name = "z", descriptor = "Lclient!lea;")
	private Class219 aClass219_5;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!lea;")
	private Class219 aClass219_4;

	@OriginalMember(owner = "client!kp", name = "v", descriptor = "Lclient!lea;")
	private Class219 aClass219_3;

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class209(@OriginalArg(0) Class100_Sub3 arg0) {
		this.aClass100_Sub3_24 = arg0;
		if (this.aClass100_Sub3_24.aBoolean741 && this.aClass100_Sub3_24.aBoolean731) {
			this.aClass219_4 = this.aClass219_5 = new Class219(this.aClass100_Sub3_24);
			if (this.aClass100_Sub3_24.anInt10236 > 1 && this.aClass100_Sub3_24.aBoolean722 && this.aClass100_Sub3_24.aBoolean723) {
				this.aClass219_4 = this.aClass219_3 = new Class219(this.aClass100_Sub3_24);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kp", name = "d", descriptor = "(I)V")
	private void method4797() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(19) int local19 = 0;
		@Pc(33) int local33;
		for (@Pc(25) Class5_Sub23 local25 = (Class5_Sub23) this.aClass20_21.method378(); local25 != null; local25 = (Class5_Sub23) this.aClass20_21.method366()) {
			local33 = local25.method3251();
			if (local33 > local9) {
				local9 = local33;
			}
			local19 += local25.method3258();
			local7 |= local25.method3255();
		}
		if (local9 == 2) {
			local33 = 34836;
		} else if (local9 == 1) {
			local33 = 34842;
		} else {
			local33 = 6408;
		}
		if (this.anInt5347 != local33) {
			this.anInt5347 = local33;
			this.aBoolean346 = true;
		}
		@Pc(114) int local114 = this.anInt5346 <= 2 ? this.anInt5346 : 2;
		@Pc(122) int local122 = local19 <= 2 ? local19 : 2;
		if (local114 != local122) {
			this.aBoolean350 = this.aBoolean346 = true;
		}
		this.anInt5346 = local19;
		if (local7 != this.aBoolean348) {
			this.aBoolean349 = true;
			this.aBoolean348 = local7;
		}
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)V")
	public void method4798() {
		if (!this.aBoolean345) {
			return;
		}
		if (this.aClass219_3 != null) {
			this.aClass100_Sub3_24.method8705(this.aClass219_3);
			@Pc(21) short local21 = 16384;
			this.aClass100_Sub3_24.method8689(this.aClass219_5);
			this.aClass219_3.method4975();
			this.aClass219_5.method4967(0);
			if (this.aBoolean348) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5340, this.anInt5333, 0, 0, this.anInt5340, this.anInt5333, local21, 9728);
			this.aClass100_Sub3_24.method8725(this.aClass219_3);
			this.aClass100_Sub3_24.method8731(this.aClass219_5);
		}
		this.aClass100_Sub3_24.method8677();
		this.aClass100_Sub3_24.method8728(0);
		this.aClass100_Sub3_24.method8671(1);
		this.aClass100_Sub3_24.la();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 1;
		@Pc(110) Class5_Sub23 local110;
		for (@Pc(100) Class5_Sub23 local100 = (Class5_Sub23) this.aClass20_21.method378(); local100 != null; local100 = local110) {
			local110 = (Class5_Sub23) this.aClass20_21.method366();
			@Pc(114) int local114 = local100.method3258();
			for (@Pc(116) int local116 = 0; local116 < local114; local116++) {
				local100.method3260(this.aClass29_Sub3_4, this.aClass29_Sub3Array2[local92], local116);
				if (local110 == null && local114 - 1 == local116) {
					this.aClass100_Sub3_24.method8748(this.aClass219_5);
					this.aClass100_Sub3_24.method8718(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5333);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5338, this.anInt5344);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5338, this.anInt5344 + this.anInt5333);
					OpenGL.glTexCoord2f((float) this.anInt5340, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5338 + this.anInt5340, this.anInt5333 + this.anInt5344);
					OpenGL.glTexCoord2f((float) this.anInt5340, (float) this.anInt5333);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5340 + this.anInt5338, this.anInt5344);
					OpenGL.glEnd();
				} else {
					this.aClass219_5.method4967(local94);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5333);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt5333);
					OpenGL.glTexCoord2f((float) this.anInt5340, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5340, this.anInt5333);
					OpenGL.glTexCoord2f((float) this.anInt5340, (float) this.anInt5333);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5340, 0);
					OpenGL.glEnd();
				}
				local94 = local94 + 1 & 0x1;
				local92 = local92 + 1 & 0x1;
				local100.method3262(local116);
			}
		}
		this.aBoolean345 = false;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(BIIII)Z")
	public boolean method4799(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass219_4 == null || this.aClass20_21.method367()) {
			return false;
		}
		if (this.anInt5340 != arg0 || this.anInt5333 != arg2) {
			this.anInt5333 = arg2;
			this.anInt5340 = arg0;
			for (@Pc(47) Class5 local47 = this.aClass20_21.method378(); local47 != this.aClass20_21.aClass5_19; local47 = local47.aClass5_338) {
				((Class5_Sub23) local47).method3257(this.anInt5340, this.anInt5333);
			}
			this.aBoolean349 = true;
			this.aBoolean350 = true;
			this.aBoolean346 = true;
		}
		if (!this.method4805()) {
			return false;
		}
		this.aBoolean345 = true;
		this.anInt5338 = arg1;
		this.anInt5344 = arg3;
		this.aClass100_Sub3_24.method8670(this.aClass219_4);
		this.aClass219_4.method4967(0);
		this.aClass100_Sub3_24.method8718(-this.anInt5338, this.anInt5344 + this.anInt5333 - this.aClass100_Sub3_24.anInt10175);
		return true;
	}

	@OriginalMember(owner = "client!kp", name = "c", descriptor = "(I)V")
	public void method4800() {
		this.aClass219_4 = this.aClass219_3 = this.aClass219_5 = null;
		this.aClass5_Sub1_Sub1_2 = null;
		this.aClass29_Sub3_4 = null;
		this.aClass29_Sub3Array2 = null;
		this.aClass5_Sub1_Sub1_1 = null;
		if (!this.aClass20_21.method367()) {
			for (@Pc(44) Class5 local44 = this.aClass20_21.method378(); local44 != this.aClass20_21.aClass5_19; local44 = local44.aClass5_338) {
				((Class5_Sub23) local44).method3252();
			}
		}
		this.anInt5340 = this.anInt5333 = 1;
	}

	@OriginalMember(owner = "client!kp", name = "e", descriptor = "(I)Z")
	public boolean method4803() {
		return this.aClass219_4 != null;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!vaa;Z)V")
	public void method4804(@OriginalArg(0) Class5_Sub23 arg0) {
		arg0.aBoolean255 = false;
		arg0.method3252();
		arg0.method9222();
		this.method4797();
	}

	@OriginalMember(owner = "client!kp", name = "f", descriptor = "(I)Z")
	private boolean method4805() {
		if (this.aBoolean349) {
			if (this.aClass5_Sub1_Sub1_1 != null) {
				this.aClass5_Sub1_Sub1_1.method121();
				this.aClass5_Sub1_Sub1_1 = null;
			}
			if (this.aClass29_Sub3_4 != null) {
				this.aClass29_Sub3_4.method8167();
				this.aClass29_Sub3_4 = null;
			}
			if (this.aClass219_3 != null) {
				this.aClass5_Sub1_Sub1_1 = new Class5_Sub1_Sub1(this.aClass100_Sub3_24, 6402, this.anInt5340, this.anInt5333, this.aClass100_Sub3_24.anInt10236);
			}
			if (this.aBoolean348) {
				this.aClass29_Sub3_4 = new Class29_Sub3(this.aClass100_Sub3_24, 34037, 6402, this.anInt5340, this.anInt5333);
			} else if (this.aClass5_Sub1_Sub1_1 == null) {
				this.aClass5_Sub1_Sub1_1 = new Class5_Sub1_Sub1(this.aClass100_Sub3_24, 6402, this.anInt5340, this.anInt5333);
			}
			this.aBoolean350 = true;
			this.aBoolean349 = false;
			this.aBoolean347 = true;
		}
		if (this.aBoolean346) {
			if (this.aClass5_Sub1_Sub1_2 != null) {
				this.aClass5_Sub1_Sub1_2.method121();
				this.aClass5_Sub1_Sub1_2 = null;
			}
			if (this.aClass29_Sub3Array2[0] != null) {
				this.aClass29_Sub3Array2[0].method8167();
				this.aClass29_Sub3Array2[0] = null;
			}
			if (this.aClass29_Sub3Array2[1] != null) {
				this.aClass29_Sub3Array2[1].method8167();
				this.aClass29_Sub3Array2[1] = null;
			}
			if (this.aClass219_3 != null) {
				this.aClass5_Sub1_Sub1_2 = new Class5_Sub1_Sub1(this.aClass100_Sub3_24, this.anInt5347, this.anInt5340, this.anInt5333, this.aClass100_Sub3_24.anInt10236);
			}
			this.aClass29_Sub3Array2[0] = new Class29_Sub3(this.aClass100_Sub3_24, 34037, this.anInt5347, this.anInt5340, this.anInt5333);
			this.aClass29_Sub3Array2[1] = this.anInt5346 <= 1 ? null : new Class29_Sub3(this.aClass100_Sub3_24, 34037, this.anInt5347, this.anInt5340, this.anInt5333);
			this.aBoolean350 = true;
			this.aBoolean347 = true;
			this.aBoolean346 = false;
		}
		if (this.aBoolean350) {
			if (this.aClass219_3 == null) {
				this.aClass100_Sub3_24.method8670(this.aClass219_5);
				this.aClass219_5.method4976(0);
				this.aClass219_5.method4976(1);
				this.aClass219_5.method4976(8);
				this.aClass219_5.method4969(this.aClass29_Sub3Array2[0], 0);
				if (this.anInt5346 > 1) {
					this.aClass219_5.method4969(this.aClass29_Sub3Array2[1], 1);
				}
				if (this.aBoolean348) {
					this.aClass219_5.method4969(this.aClass29_Sub3_4, 8);
				} else {
					this.aClass219_5.method4979(this.aClass5_Sub1_Sub1_1, 8);
				}
				this.aClass100_Sub3_24.method8748(this.aClass219_5);
			} else {
				this.aClass100_Sub3_24.method8670(this.aClass219_5);
				this.aClass219_5.method4976(0);
				this.aClass219_5.method4976(1);
				this.aClass219_5.method4976(8);
				this.aClass219_5.method4969(this.aClass29_Sub3Array2[0], 0);
				if (this.anInt5346 > 1) {
					this.aClass219_5.method4969(this.aClass29_Sub3Array2[1], 1);
				}
				if (this.aBoolean348) {
					this.aClass219_5.method4969(this.aClass29_Sub3_4, 8);
				}
				this.aClass100_Sub3_24.method8748(this.aClass219_5);
				this.aClass100_Sub3_24.method8670(this.aClass219_3);
				this.aClass219_3.method4976(0);
				this.aClass219_3.method4976(8);
				this.aClass219_3.method4979(this.aClass5_Sub1_Sub1_2, 0);
				this.aClass219_3.method4979(this.aClass5_Sub1_Sub1_1, 8);
				this.aClass100_Sub3_24.method8748(this.aClass219_3);
			}
			this.aBoolean350 = false;
			this.aBoolean347 = true;
		}
		if (this.aBoolean347) {
			this.aClass100_Sub3_24.method8670(this.aClass219_4);
			this.aBoolean347 = !this.aClass219_4.method4974();
			this.aClass100_Sub3_24.method8748(this.aClass219_4);
		}
		return !this.aBoolean347;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(Lclient!vaa;I)Z")
	public boolean method4806(@OriginalArg(0) Class5_Sub23 arg0) {
		if (this.aClass219_4 != null) {
			if (arg0.method3254() || arg0.method3261()) {
				this.aClass20_21.method370(arg0);
				this.method4797();
				if (this.method4805()) {
					if (this.anInt5340 != -1 && this.anInt5333 != -1) {
						arg0.method3257(this.anInt5340, this.anInt5333);
					}
					arg0.aBoolean255 = true;
					return true;
				}
			}
			this.method4804(arg0);
		}
		return false;
	}
}
