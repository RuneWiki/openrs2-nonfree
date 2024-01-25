import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jr")
public final class Class136 {

	@OriginalMember(owner = "client!jr", name = "v", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!jr", name = "C", descriptor = "Lclient!cj;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_1;

	@OriginalMember(owner = "client!jr", name = "I", descriptor = "Lclient!cj;")
	private Class1_Sub1_Sub4 aClass1_Sub1_Sub4_2;

	@OriginalMember(owner = "client!jr", name = "K", descriptor = "Lclient!ah;")
	private Class8_Sub1 aClass8_Sub1_2;

	@OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
	private int anInt4106 = 1;

	@OriginalMember(owner = "client!jr", name = "o", descriptor = "I")
	private int anInt4110 = 0;

	@OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
	private int anInt4109 = 1;

	@OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
	private int anInt4112 = 0;

	@OriginalMember(owner = "client!jr", name = "B", descriptor = "Lclient!pu;")
	private final Class203 aClass203_36 = new Class203();

	@OriginalMember(owner = "client!jr", name = "D", descriptor = "I")
	private int anInt4115 = -1;

	@OriginalMember(owner = "client!jr", name = "H", descriptor = "Z")
	private boolean aBoolean256 = true;

	@OriginalMember(owner = "client!jr", name = "J", descriptor = "I")
	private int anInt4116 = 0;

	@OriginalMember(owner = "client!jr", name = "L", descriptor = "Z")
	private boolean aBoolean257 = true;

	@OriginalMember(owner = "client!jr", name = "N", descriptor = "[Lclient!ah;")
	private Class8_Sub1[] aClass8_Sub1Array3 = new Class8_Sub1[2];

	@OriginalMember(owner = "client!jr", name = "E", descriptor = "Z")
	private boolean aBoolean254 = false;

	@OriginalMember(owner = "client!jr", name = "F", descriptor = "Z")
	private boolean aBoolean255 = true;

	@OriginalMember(owner = "client!jr", name = "M", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_27;

	@OriginalMember(owner = "client!jr", name = "u", descriptor = "Lclient!jk;")
	private Class131 aClass131_4;

	@OriginalMember(owner = "client!jr", name = "q", descriptor = "Lclient!jk;")
	private Class131 aClass131_2;

	@OriginalMember(owner = "client!jr", name = "s", descriptor = "Lclient!jk;")
	private Class131 aClass131_3;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class136(@OriginalArg(0) Class106_Sub2 arg0) {
		this.aClass106_Sub2_27 = arg0;
		if (this.aClass106_Sub2_27.aBoolean233 && this.aClass106_Sub2_27.aBoolean216) {
			this.aClass131_2 = this.aClass131_4 = new Class131(this.aClass106_Sub2_27);
			if (this.aClass106_Sub2_27.anInt3731 > 1 && this.aClass106_Sub2_27.aBoolean231 && this.aClass106_Sub2_27.aBoolean235) {
				this.aClass131_2 = this.aClass131_3 = new Class131(this.aClass106_Sub2_27);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILclient!kf;)V")
	public void method3195(@OriginalArg(1) Class1_Sub24 arg0) {
		arg0.aBoolean299 = false;
		arg0.method3580();
		arg0.method6178();
		this.method3197();
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(ILclient!kf;)Z")
	public boolean method3196(@OriginalArg(1) Class1_Sub24 arg0) {
		if (this.aClass131_2 != null) {
			if (arg0.method3581() || arg0.method3576()) {
				this.aClass203_36.method4551(arg0);
				this.method3197();
				if (this.method3200()) {
					if (this.anInt4106 != -1 && this.anInt4109 != -1) {
						arg0.method3577(this.anInt4109, this.anInt4106);
					}
					arg0.aBoolean299 = true;
					return true;
				}
			}
			this.method3195(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
	private void method3197() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub24 local17 = (Class1_Sub24) this.aClass203_36.method4548(); local17 != null; local17 = (Class1_Sub24) this.aClass203_36.method4545()) {
			local23 = local17.method3575();
			local11 += local17.method3582();
			if (local9 < local23) {
				local9 = local23;
			}
			local7 |= local17.method3586();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt4115 != local23) {
			this.anInt4115 = local23;
			this.aBoolean257 = true;
		}
		@Pc(99) int local99 = this.anInt4116 > 2 ? 2 : this.anInt4116;
		@Pc(106) int local106 = local11 > 2 ? 2 : local11;
		this.anInt4116 = local11;
		if (local106 != local99) {
			this.aBoolean258 = this.aBoolean257 = true;
		}
		if (local7 != this.aBoolean254) {
			this.aBoolean254 = local7;
			this.aBoolean255 = true;
		}
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
	public void method3198() {
		if (!this.aBoolean253) {
			return;
		}
		if (this.aClass131_3 != null) {
			@Pc(12) short local12 = 16384;
			this.aClass106_Sub2_27.method2872(this.aClass131_3);
			this.aClass106_Sub2_27.method2906(this.aClass131_4);
			this.aClass131_3.method3150();
			this.aClass131_4.method3139(0);
			if (this.aBoolean254) {
				local12 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4106, this.anInt4109, 0, 0, this.anInt4106, this.anInt4109, local12, 9728);
			this.aClass106_Sub2_27.method2879(this.aClass131_3);
			this.aClass106_Sub2_27.method2897(this.aClass131_4);
		}
		this.aClass106_Sub2_27.method2866();
		this.aClass106_Sub2_27.method2927(0);
		this.aClass106_Sub2_27.method2851(1);
		this.aClass106_Sub2_27.va();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(106) Class1_Sub24 local106;
		for (@Pc(99) Class1_Sub24 local99 = (Class1_Sub24) this.aClass203_36.method4548(); local99 != null; local99 = local106) {
			local106 = (Class1_Sub24) this.aClass203_36.method4545();
			@Pc(110) int local110 = local99.method3582();
			for (@Pc(112) int local112 = 0; local112 < local110; local112++) {
				local99.method3579(this.aClass8_Sub1_2, this.aClass8_Sub1Array3[local91], local112);
				if (local106 == null && local110 - 1 == local112) {
					this.aClass106_Sub2_27.method2857(this.aClass131_4);
					this.aClass106_Sub2_27.method2856(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4109);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4112, this.anInt4110);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4112, this.anInt4110 + this.anInt4109);
					OpenGL.glTexCoord2f((float) this.anInt4106, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4106 + this.anInt4112, this.anInt4109 + this.anInt4110);
					OpenGL.glTexCoord2f((float) this.anInt4106, (float) this.anInt4109);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4106 + this.anInt4112, this.anInt4110);
					OpenGL.glEnd();
				} else {
					this.aClass131_4.method3139(local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4109);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4109);
					OpenGL.glTexCoord2f((float) this.anInt4106, (float) this.anInt4109);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4106, this.anInt4109);
					OpenGL.glTexCoord2f((float) this.anInt4106, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4106, 0);
					OpenGL.glEnd();
				}
				local99.method3585(local112);
				local93 = local93 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean253 = false;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(Z)V")
	public void method3199() {
		this.aClass8_Sub1Array3 = null;
		this.aClass1_Sub1_Sub4_1 = null;
		this.aClass8_Sub1_2 = null;
		this.aClass131_2 = this.aClass131_3 = this.aClass131_4 = null;
		this.aClass1_Sub1_Sub4_2 = null;
		if (!this.aClass203_36.method4554()) {
			for (@Pc(38) Class1 local38 = this.aClass203_36.method4548(); local38 != this.aClass203_36.aClass1_195; local38 = local38.aClass1_264) {
				((Class1_Sub24) local38).method3580();
			}
		}
		this.anInt4106 = this.anInt4109 = 1;
	}

	@OriginalMember(owner = "client!jr", name = "b", descriptor = "(I)Z")
	private boolean method3200() {
		if (this.aBoolean255) {
			if (this.aClass1_Sub1_Sub4_2 != null) {
				this.aClass1_Sub1_Sub4_2.method995();
				this.aClass1_Sub1_Sub4_2 = null;
			}
			if (this.aClass8_Sub1_2 != null) {
				this.aClass8_Sub1_2.method3074();
				this.aClass8_Sub1_2 = null;
			}
			if (this.aClass131_3 != null) {
				this.aClass1_Sub1_Sub4_2 = new Class1_Sub1_Sub4(this.aClass106_Sub2_27, 6402, this.anInt4106, this.anInt4109, this.aClass106_Sub2_27.anInt3731);
			}
			if (this.aBoolean254) {
				this.aClass8_Sub1_2 = new Class8_Sub1(this.aClass106_Sub2_27, 34037, 6402, this.anInt4106, this.anInt4109);
			} else if (this.aClass1_Sub1_Sub4_2 == null) {
				this.aClass1_Sub1_Sub4_2 = new Class1_Sub1_Sub4(this.aClass106_Sub2_27, 6402, this.anInt4106, this.anInt4109);
			}
			this.aBoolean258 = true;
			this.aBoolean255 = false;
			this.aBoolean256 = true;
		}
		if (this.aBoolean257) {
			if (this.aClass1_Sub1_Sub4_1 != null) {
				this.aClass1_Sub1_Sub4_1.method995();
				this.aClass1_Sub1_Sub4_1 = null;
			}
			if (this.aClass8_Sub1Array3[0] != null) {
				this.aClass8_Sub1Array3[0].method3074();
				this.aClass8_Sub1Array3[0] = null;
			}
			if (this.aClass8_Sub1Array3[1] != null) {
				this.aClass8_Sub1Array3[1].method3074();
				this.aClass8_Sub1Array3[1] = null;
			}
			if (this.aClass131_3 != null) {
				this.aClass1_Sub1_Sub4_1 = new Class1_Sub1_Sub4(this.aClass106_Sub2_27, this.anInt4115, this.anInt4106, this.anInt4109, this.aClass106_Sub2_27.anInt3731);
			}
			this.aClass8_Sub1Array3[0] = new Class8_Sub1(this.aClass106_Sub2_27, 34037, this.anInt4115, this.anInt4106, this.anInt4109);
			this.aClass8_Sub1Array3[1] = this.anInt4116 > 1 ? new Class8_Sub1(this.aClass106_Sub2_27, 34037, this.anInt4115, this.anInt4106, this.anInt4109) : null;
			this.aBoolean257 = false;
			this.aBoolean256 = true;
			this.aBoolean258 = true;
		}
		if (this.aBoolean258) {
			if (this.aClass131_3 == null) {
				this.aClass106_Sub2_27.method2870(this.aClass131_4);
				this.aClass131_4.method3146(0);
				this.aClass131_4.method3146(1);
				this.aClass131_4.method3146(8);
				this.aClass131_4.method3145(0, this.aClass8_Sub1Array3[0]);
				if (this.anInt4116 > 1) {
					this.aClass131_4.method3145(1, this.aClass8_Sub1Array3[1]);
				}
				if (this.aBoolean254) {
					this.aClass131_4.method3145(8, this.aClass8_Sub1_2);
				} else {
					this.aClass131_4.method3143(this.aClass1_Sub1_Sub4_2, 8);
				}
				this.aClass106_Sub2_27.method2857(this.aClass131_4);
			} else {
				this.aClass106_Sub2_27.method2870(this.aClass131_4);
				this.aClass131_4.method3146(0);
				this.aClass131_4.method3146(1);
				this.aClass131_4.method3146(8);
				this.aClass131_4.method3145(0, this.aClass8_Sub1Array3[0]);
				if (this.anInt4116 > 1) {
					this.aClass131_4.method3145(1, this.aClass8_Sub1Array3[1]);
				}
				if (this.aBoolean254) {
					this.aClass131_4.method3145(8, this.aClass8_Sub1_2);
				}
				this.aClass106_Sub2_27.method2857(this.aClass131_4);
				this.aClass106_Sub2_27.method2870(this.aClass131_3);
				this.aClass131_3.method3146(0);
				this.aClass131_3.method3146(8);
				this.aClass131_3.method3143(this.aClass1_Sub1_Sub4_1, 0);
				this.aClass131_3.method3143(this.aClass1_Sub1_Sub4_2, 8);
				this.aClass106_Sub2_27.method2857(this.aClass131_3);
			}
			this.aBoolean258 = false;
			this.aBoolean256 = true;
		}
		if (this.aBoolean256) {
			this.aClass106_Sub2_27.method2870(this.aClass131_2);
			this.aBoolean256 = !this.aClass131_2.method3154();
			this.aClass106_Sub2_27.method2857(this.aClass131_2);
		}
		return !this.aBoolean256;
	}

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "(IBIII)Z")
	public boolean method3201(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass131_2 == null || this.aClass203_36.method4554()) {
			return false;
		}
		if (this.anInt4106 != arg3 || this.anInt4109 != arg0) {
			this.anInt4106 = arg3;
			this.anInt4109 = arg0;
			for (@Pc(46) Class1 local46 = this.aClass203_36.method4548(); local46 != this.aClass203_36.aClass1_195; local46 = local46.aClass1_264) {
				((Class1_Sub24) local46).method3577(this.anInt4109, this.anInt4106);
			}
			this.aBoolean258 = true;
			this.aBoolean257 = true;
			this.aBoolean255 = true;
		}
		if (!this.method3200()) {
			return false;
		}
		this.aBoolean253 = true;
		this.anInt4110 = arg1;
		this.anInt4112 = arg2;
		this.aClass106_Sub2_27.method2870(this.aClass131_2);
		this.aClass131_2.method3139(0);
		this.aClass106_Sub2_27.method2856(-this.anInt4112, this.anInt4109 - this.aClass131_2.method3148() - this.anInt4110);
		return true;
	}

	@OriginalMember(owner = "client!jr", name = "d", descriptor = "(I)Z")
	public boolean method3205() {
		return this.aClass131_2 != null;
	}
}
