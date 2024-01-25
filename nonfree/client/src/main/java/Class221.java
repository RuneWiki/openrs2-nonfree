import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mda")
public final class Class221 {

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "Z")
	private boolean aBoolean406;

	@OriginalMember(owner = "client!mda", name = "A", descriptor = "Lclient!kk;")
	private Class6_Sub4_Sub9 aClass6_Sub4_Sub9_1;

	@OriginalMember(owner = "client!mda", name = "B", descriptor = "Lclient!rq;")
	private Class53_Sub2 aClass53_Sub2_5;

	@OriginalMember(owner = "client!mda", name = "F", descriptor = "Lclient!kk;")
	private Class6_Sub4_Sub9 aClass6_Sub4_Sub9_2;

	@OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
	private int anInt6170 = 1;

	@OriginalMember(owner = "client!mda", name = "m", descriptor = "I")
	private int anInt6172 = 1;

	@OriginalMember(owner = "client!mda", name = "p", descriptor = "I")
	private int anInt6174 = 0;

	@OriginalMember(owner = "client!mda", name = "q", descriptor = "I")
	private int anInt6175 = 0;

	@OriginalMember(owner = "client!mda", name = "h", descriptor = "Lclient!v;")
	private final Class362 aClass362_31 = new Class362();

	@OriginalMember(owner = "client!mda", name = "x", descriptor = "I")
	private int anInt6180 = 0;

	@OriginalMember(owner = "client!mda", name = "z", descriptor = "Z")
	private boolean aBoolean407 = false;

	@OriginalMember(owner = "client!mda", name = "y", descriptor = "[Lclient!rq;")
	private Class53_Sub2[] aClass53_Sub2Array2 = new Class53_Sub2[2];

	@OriginalMember(owner = "client!mda", name = "D", descriptor = "Z")
	private boolean aBoolean409 = true;

	@OriginalMember(owner = "client!mda", name = "E", descriptor = "Z")
	private boolean aBoolean410 = true;

	@OriginalMember(owner = "client!mda", name = "I", descriptor = "Z")
	private boolean aBoolean411 = true;

	@OriginalMember(owner = "client!mda", name = "C", descriptor = "Z")
	private boolean aBoolean408 = true;

	@OriginalMember(owner = "client!mda", name = "J", descriptor = "I")
	private int anInt6181 = -1;

	@OriginalMember(owner = "client!mda", name = "i", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_32;

	@OriginalMember(owner = "client!mda", name = "k", descriptor = "Lclient!hha;")
	private Class143 aClass143_4;

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "Lclient!hha;")
	private Class143 aClass143_3;

	@OriginalMember(owner = "client!mda", name = "l", descriptor = "Lclient!hha;")
	private Class143 aClass143_5;

	@OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class221(@OriginalArg(0) Class132_Sub3 arg0) {
		this.aClass132_Sub3_32 = arg0;
		if (this.aClass132_Sub3_32.aBoolean529 && this.aClass132_Sub3_32.aBoolean539) {
			this.aClass143_3 = this.aClass143_4 = new Class143(this.aClass132_Sub3_32);
			if (this.aClass132_Sub3_32.anInt7878 > 1 && this.aClass132_Sub3_32.aBoolean545 && this.aClass132_Sub3_32.aBoolean542) {
				this.aClass143_3 = this.aClass143_5 = new Class143(this.aClass132_Sub3_32);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
	public void method5213() {
		if (!this.aBoolean406) {
			return;
		}
		if (this.aClass143_5 != null) {
			@Pc(21) short local21 = 16384;
			this.aClass132_Sub3_32.method6754(this.aClass143_5);
			this.aClass132_Sub3_32.method6791(this.aClass143_4);
			this.aClass143_5.method3127();
			this.aClass143_4.method3129(0);
			if (this.aBoolean407) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6172, this.anInt6170, 0, 0, this.anInt6172, this.anInt6170, local21, 9728);
			this.aClass132_Sub3_32.method6807(this.aClass143_5);
			this.aClass132_Sub3_32.method6756(this.aClass143_4);
		}
		this.aClass132_Sub3_32.method6767();
		this.aClass132_Sub3_32.method6781(0);
		this.aClass132_Sub3_32.method6803(1);
		this.aClass132_Sub3_32.la();
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 1;
		@Pc(116) Class6_Sub11 local116;
		for (@Pc(108) Class6_Sub11 local108 = (Class6_Sub11) this.aClass362_31.method8538(); local108 != null; local108 = local116) {
			local116 = (Class6_Sub11) this.aClass362_31.method8530();
			@Pc(120) int local120 = local108.method1298();
			for (@Pc(122) int local122 = 0; local122 < local120; local122++) {
				local108.method1299(this.aClass53_Sub2_5, this.aClass53_Sub2Array2[local100], local122);
				if (local116 == null && local120 - 1 == local122) {
					this.aClass132_Sub3_32.method6799(this.aClass143_4);
					this.aClass132_Sub3_32.method6779(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6170);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6175, this.anInt6174);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6175, this.anInt6174 + this.anInt6170);
					OpenGL.glTexCoord2f((float) this.anInt6172, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6175 + this.anInt6172, this.anInt6170 + this.anInt6174);
					OpenGL.glTexCoord2f((float) this.anInt6172, (float) this.anInt6170);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6175 + this.anInt6172, this.anInt6174);
					OpenGL.glEnd();
				} else {
					this.aClass143_4.method3129(local102);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6170);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt6170);
					OpenGL.glTexCoord2f((float) this.anInt6172, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6172, this.anInt6170);
					OpenGL.glTexCoord2f((float) this.anInt6172, (float) this.anInt6170);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6172, 0);
					OpenGL.glEnd();
				}
				local108.method1289(local122);
				local100 = local100 + 1 & 0x1;
				local102 = local102 + 1 & 0x1;
			}
		}
		this.aBoolean406 = false;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(Lclient!efa;I)V")
	public void method5214(@OriginalArg(0) Class6_Sub11 arg0) {
		arg0.aBoolean74 = false;
		arg0.method1290();
		arg0.method9174();
		this.method5221();
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)Z")
	private boolean method5216() {
		if (this.aBoolean410) {
			if (this.aClass6_Sub4_Sub9_1 != null) {
				this.aClass6_Sub4_Sub9_1.method4441();
				this.aClass6_Sub4_Sub9_1 = null;
			}
			if (this.aClass53_Sub2_5 != null) {
				this.aClass53_Sub2_5.method8292();
				this.aClass53_Sub2_5 = null;
			}
			if (this.aClass143_5 != null) {
				this.aClass6_Sub4_Sub9_1 = new Class6_Sub4_Sub9(this.aClass132_Sub3_32, 6402, this.anInt6172, this.anInt6170, this.aClass132_Sub3_32.anInt7878);
			}
			if (this.aBoolean407) {
				this.aClass53_Sub2_5 = new Class53_Sub2(this.aClass132_Sub3_32, 34037, 6402, this.anInt6172, this.anInt6170);
			} else if (this.aClass6_Sub4_Sub9_1 == null) {
				this.aClass6_Sub4_Sub9_1 = new Class6_Sub4_Sub9(this.aClass132_Sub3_32, 6402, this.anInt6172, this.anInt6170);
			}
			this.aBoolean410 = false;
			this.aBoolean408 = true;
			this.aBoolean411 = true;
		}
		if (this.aBoolean409) {
			if (this.aClass6_Sub4_Sub9_2 != null) {
				this.aClass6_Sub4_Sub9_2.method4441();
				this.aClass6_Sub4_Sub9_2 = null;
			}
			if (this.aClass53_Sub2Array2[0] != null) {
				this.aClass53_Sub2Array2[0].method8292();
				this.aClass53_Sub2Array2[0] = null;
			}
			if (this.aClass53_Sub2Array2[1] != null) {
				this.aClass53_Sub2Array2[1].method8292();
				this.aClass53_Sub2Array2[1] = null;
			}
			if (this.aClass143_5 != null) {
				this.aClass6_Sub4_Sub9_2 = new Class6_Sub4_Sub9(this.aClass132_Sub3_32, this.anInt6181, this.anInt6172, this.anInt6170, this.aClass132_Sub3_32.anInt7878);
			}
			this.aClass53_Sub2Array2[0] = new Class53_Sub2(this.aClass132_Sub3_32, 34037, this.anInt6181, this.anInt6172, this.anInt6170);
			this.aClass53_Sub2Array2[1] = this.anInt6180 > 1 ? new Class53_Sub2(this.aClass132_Sub3_32, 34037, this.anInt6181, this.anInt6172, this.anInt6170) : null;
			this.aBoolean409 = false;
			this.aBoolean408 = true;
			this.aBoolean411 = true;
		}
		if (this.aBoolean411) {
			if (this.aClass143_5 == null) {
				this.aClass132_Sub3_32.method6814(this.aClass143_4);
				this.aClass143_4.method3138(0);
				this.aClass143_4.method3138(1);
				this.aClass143_4.method3138(8);
				this.aClass143_4.method3130(this.aClass53_Sub2Array2[0], 0);
				if (this.anInt6180 > 1) {
					this.aClass143_4.method3130(this.aClass53_Sub2Array2[1], 1);
				}
				if (this.aBoolean407) {
					this.aClass143_4.method3130(this.aClass53_Sub2_5, 8);
				} else {
					this.aClass143_4.method3132(8, this.aClass6_Sub4_Sub9_1);
				}
				this.aClass132_Sub3_32.method6799(this.aClass143_4);
			} else {
				this.aClass132_Sub3_32.method6814(this.aClass143_4);
				this.aClass143_4.method3138(0);
				this.aClass143_4.method3138(1);
				this.aClass143_4.method3138(8);
				this.aClass143_4.method3130(this.aClass53_Sub2Array2[0], 0);
				if (this.anInt6180 > 1) {
					this.aClass143_4.method3130(this.aClass53_Sub2Array2[1], 1);
				}
				if (this.aBoolean407) {
					this.aClass143_4.method3130(this.aClass53_Sub2_5, 8);
				}
				this.aClass132_Sub3_32.method6799(this.aClass143_4);
				this.aClass132_Sub3_32.method6814(this.aClass143_5);
				this.aClass143_5.method3138(0);
				this.aClass143_5.method3138(8);
				this.aClass143_5.method3132(0, this.aClass6_Sub4_Sub9_2);
				this.aClass143_5.method3132(8, this.aClass6_Sub4_Sub9_1);
				this.aClass132_Sub3_32.method6799(this.aClass143_5);
			}
			this.aBoolean411 = false;
			this.aBoolean408 = true;
		}
		if (this.aBoolean408) {
			this.aClass132_Sub3_32.method6814(this.aClass143_3);
			this.aBoolean408 = !this.aClass143_3.method3136();
			this.aClass132_Sub3_32.method6799(this.aClass143_3);
		}
		return !this.aBoolean408;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(Lclient!efa;I)Z")
	public boolean method5217(@OriginalArg(0) Class6_Sub11 arg0) {
		if (this.aClass143_3 != null) {
			if (arg0.method1291() || arg0.method1297()) {
				this.aClass362_31.method8536(arg0);
				this.method5221();
				if (this.method5216()) {
					if (this.anInt6172 != -1 && this.anInt6170 != -1) {
						arg0.method1294(this.anInt6172, this.anInt6170);
					}
					arg0.aBoolean74 = true;
					return true;
				}
			}
			this.method5214(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!mda", name = "b", descriptor = "(I)Z")
	public boolean method5218() {
		return this.aClass143_3 != null;
	}

	@OriginalMember(owner = "client!mda", name = "a", descriptor = "(IIIBI)Z")
	public boolean method5219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass143_3 == null || this.aClass362_31.method8541()) {
			return false;
		}
		if (arg3 != this.anInt6172 || this.anInt6170 != arg1) {
			this.anInt6172 = arg3;
			this.anInt6170 = arg1;
			for (@Pc(38) Class6 local38 = this.aClass362_31.method8538(); local38 != this.aClass362_31.aClass6_312; local38 = local38.aClass6_338) {
				((Class6_Sub11) local38).method1294(this.anInt6172, this.anInt6170);
			}
			this.aBoolean409 = true;
			this.aBoolean411 = true;
			this.aBoolean410 = true;
		}
		if (!this.method5216()) {
			return false;
		}
		this.anInt6175 = arg0;
		this.aBoolean406 = true;
		this.anInt6174 = arg2;
		this.aClass132_Sub3_32.method6814(this.aClass143_3);
		this.aClass143_3.method3129(0);
		this.aClass132_Sub3_32.method6779(this.anInt6174 + this.anInt6170 - this.aClass132_Sub3_32.anInt7710, -this.anInt6175);
		return true;
	}

	@OriginalMember(owner = "client!mda", name = "c", descriptor = "(B)V")
	public void method5220() {
		this.aClass53_Sub2_5 = null;
		this.aClass53_Sub2Array2 = null;
		this.aClass6_Sub4_Sub9_1 = null;
		this.aClass6_Sub4_Sub9_2 = null;
		this.aClass143_3 = this.aClass143_5 = this.aClass143_4 = null;
		if (!this.aClass362_31.method8541()) {
			for (@Pc(44) Class6 local44 = this.aClass362_31.method8538(); local44 != this.aClass362_31.aClass6_312; local44 = local44.aClass6_338) {
				((Class6_Sub11) local44).method1290();
			}
		}
		this.anInt6172 = this.anInt6170 = 1;
	}

	@OriginalMember(owner = "client!mda", name = "d", descriptor = "(B)V")
	private void method5221() {
		@Pc(13) boolean local13 = false;
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		@Pc(29) int local29;
		for (@Pc(23) Class6_Sub11 local23 = (Class6_Sub11) this.aClass362_31.method8538(); local23 != null; local23 = (Class6_Sub11) this.aClass362_31.method8530()) {
			local29 = local23.method1288();
			if (local29 > local15) {
				local15 = local29;
			}
			local17 += local23.method1298();
			local13 |= local23.method1295();
		}
		if (local15 == 2) {
			local29 = 34836;
		} else if (local15 == 1) {
			local29 = 34842;
		} else {
			local29 = 6408;
		}
		if (local29 != this.anInt6181) {
			this.aBoolean409 = true;
			this.anInt6181 = local29;
		}
		@Pc(95) int local95 = this.anInt6180 > 2 ? 2 : this.anInt6180;
		@Pc(102) int local102 = local17 > 2 ? 2 : local17;
		if (this.aBoolean407 != local13) {
			this.aBoolean407 = local13;
			this.aBoolean410 = true;
		}
		this.anInt6180 = local17;
		if (local95 != local102) {
			this.aBoolean411 = this.aBoolean409 = true;
		}
	}
}
