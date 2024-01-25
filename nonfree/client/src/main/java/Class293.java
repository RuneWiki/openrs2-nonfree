import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class293 {

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "Z")
	private boolean aBoolean627;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!ra;")
	private Class2_Sub1_Sub17 aClass2_Sub1_Sub17_1;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!wi;")
	private Class50_Sub4 aClass50_Sub4_3;

	@OriginalMember(owner = "client!qc", name = "C", descriptor = "Lclient!ra;")
	private Class2_Sub1_Sub17 aClass2_Sub1_Sub17_2;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
	private int anInt8593 = 1;

	@OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
	private int anInt8604 = 0;

	@OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
	private int anInt8599 = 1;

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
	private int anInt8603 = 0;

	@OriginalMember(owner = "client!qc", name = "p", descriptor = "Lclient!ow;")
	private final Class271 aClass271_49 = new Class271();

	@OriginalMember(owner = "client!qc", name = "x", descriptor = "I")
	private int anInt8606 = 0;

	@OriginalMember(owner = "client!qc", name = "y", descriptor = "Z")
	private boolean aBoolean628 = false;

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "I")
	private int anInt8605 = -1;

	@OriginalMember(owner = "client!qc", name = "z", descriptor = "Z")
	private boolean aBoolean629 = true;

	@OriginalMember(owner = "client!qc", name = "A", descriptor = "Z")
	private boolean aBoolean630 = true;

	@OriginalMember(owner = "client!qc", name = "E", descriptor = "Z")
	private boolean aBoolean631 = true;

	@OriginalMember(owner = "client!qc", name = "D", descriptor = "[Lclient!wi;")
	private Class50_Sub4[] aClass50_Sub4Array3 = new Class50_Sub4[2];

	@OriginalMember(owner = "client!qc", name = "F", descriptor = "Z")
	private boolean aBoolean632 = true;

	@OriginalMember(owner = "client!qc", name = "j", descriptor = "Lclient!lea;")
	private final Class101_Sub2 aClass101_Sub2_30;

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "Lclient!bq;")
	private Class39 aClass39_3;

	@OriginalMember(owner = "client!qc", name = "s", descriptor = "Lclient!bq;")
	private Class39 aClass39_5;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "Lclient!bq;")
	private Class39 aClass39_4;

	@OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lclient!lea;)V")
	public Class293(@OriginalArg(0) Class101_Sub2 arg0) {
		this.aClass101_Sub2_30 = arg0;
		if (this.aClass101_Sub2_30.aBoolean463 && this.aClass101_Sub2_30.aBoolean467) {
			this.aClass39_5 = this.aClass39_3 = new Class39(this.aClass101_Sub2_30);
			if (this.aClass101_Sub2_30.anInt6313 > 1 && this.aClass101_Sub2_30.aBoolean472 && this.aClass101_Sub2_30.aBoolean458) {
				this.aClass39_5 = this.aClass39_4 = new Class39(this.aClass101_Sub2_30);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public void method7616() {
		this.aClass50_Sub4Array3 = null;
		this.aClass2_Sub1_Sub17_1 = null;
		this.aClass2_Sub1_Sub17_2 = null;
		this.aClass50_Sub4_3 = null;
		this.aClass39_5 = this.aClass39_4 = this.aClass39_3 = null;
		if (!this.aClass271_49.method7169()) {
			for (@Pc(36) Class2 local36 = this.aClass271_49.method7177(); local36 != this.aClass271_49.aClass2_230; local36 = local36.aClass2_338) {
				((Class2_Sub31) local36).method9288();
			}
		}
		this.anInt8593 = this.anInt8599 = 1;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)Z")
	private boolean method7617() {
		if (this.aBoolean632) {
			if (this.aClass2_Sub1_Sub17_2 != null) {
				this.aClass2_Sub1_Sub17_2.method7894();
				this.aClass2_Sub1_Sub17_2 = null;
			}
			if (this.aClass50_Sub4_3 != null) {
				this.aClass50_Sub4_3.method9140();
				this.aClass50_Sub4_3 = null;
			}
			if (this.aClass39_4 != null) {
				this.aClass2_Sub1_Sub17_2 = new Class2_Sub1_Sub17(this.aClass101_Sub2_30, 6402, this.anInt8593, this.anInt8599, this.aClass101_Sub2_30.anInt6313);
			}
			if (this.aBoolean628) {
				this.aClass50_Sub4_3 = new Class50_Sub4(this.aClass101_Sub2_30, 34037, 6402, this.anInt8593, this.anInt8599);
			} else if (this.aClass2_Sub1_Sub17_2 == null) {
				this.aClass2_Sub1_Sub17_2 = new Class2_Sub1_Sub17(this.aClass101_Sub2_30, 6402, this.anInt8593, this.anInt8599);
			}
			this.aBoolean631 = true;
			this.aBoolean630 = true;
			this.aBoolean632 = false;
		}
		if (this.aBoolean629) {
			if (this.aClass2_Sub1_Sub17_1 != null) {
				this.aClass2_Sub1_Sub17_1.method7894();
				this.aClass2_Sub1_Sub17_1 = null;
			}
			if (this.aClass50_Sub4Array3[0] != null) {
				this.aClass50_Sub4Array3[0].method9140();
				this.aClass50_Sub4Array3[0] = null;
			}
			if (this.aClass50_Sub4Array3[1] != null) {
				this.aClass50_Sub4Array3[1].method9140();
				this.aClass50_Sub4Array3[1] = null;
			}
			if (this.aClass39_4 != null) {
				this.aClass2_Sub1_Sub17_1 = new Class2_Sub1_Sub17(this.aClass101_Sub2_30, this.anInt8605, this.anInt8593, this.anInt8599, this.aClass101_Sub2_30.anInt6313);
			}
			this.aClass50_Sub4Array3[0] = new Class50_Sub4(this.aClass101_Sub2_30, 34037, this.anInt8605, this.anInt8593, this.anInt8599);
			this.aClass50_Sub4Array3[1] = this.anInt8606 <= 1 ? null : new Class50_Sub4(this.aClass101_Sub2_30, 34037, this.anInt8605, this.anInt8593, this.anInt8599);
			this.aBoolean631 = true;
			this.aBoolean630 = true;
			this.aBoolean629 = false;
		}
		if (this.aBoolean630) {
			if (this.aClass39_4 == null) {
				this.aClass101_Sub2_30.method5613(this.aClass39_3);
				this.aClass39_3.method1114(0);
				this.aClass39_3.method1114(1);
				this.aClass39_3.method1114(8);
				this.aClass39_3.method1111(0, this.aClass50_Sub4Array3[0]);
				if (this.anInt8606 > 1) {
					this.aClass39_3.method1111(1, this.aClass50_Sub4Array3[1]);
				}
				if (this.aBoolean628) {
					this.aClass39_3.method1111(8, this.aClass50_Sub4_3);
				} else {
					this.aClass39_3.method1112(this.aClass2_Sub1_Sub17_2, 8);
				}
				this.aClass101_Sub2_30.method5678(this.aClass39_3);
			} else {
				this.aClass101_Sub2_30.method5613(this.aClass39_3);
				this.aClass39_3.method1114(0);
				this.aClass39_3.method1114(1);
				this.aClass39_3.method1114(8);
				this.aClass39_3.method1111(0, this.aClass50_Sub4Array3[0]);
				if (this.anInt8606 > 1) {
					this.aClass39_3.method1111(1, this.aClass50_Sub4Array3[1]);
				}
				if (this.aBoolean628) {
					this.aClass39_3.method1111(8, this.aClass50_Sub4_3);
				}
				this.aClass101_Sub2_30.method5678(this.aClass39_3);
				this.aClass101_Sub2_30.method5613(this.aClass39_4);
				this.aClass39_4.method1114(0);
				this.aClass39_4.method1114(8);
				this.aClass39_4.method1112(this.aClass2_Sub1_Sub17_1, 0);
				this.aClass39_4.method1112(this.aClass2_Sub1_Sub17_2, 8);
				this.aClass101_Sub2_30.method5678(this.aClass39_4);
			}
			this.aBoolean630 = false;
			this.aBoolean631 = true;
		}
		if (this.aBoolean631) {
			this.aClass101_Sub2_30.method5613(this.aClass39_5);
			this.aBoolean631 = !this.aClass39_5.method1110();
			this.aClass101_Sub2_30.method5678(this.aClass39_5);
		}
		return !this.aBoolean631;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public void method7618() {
		if (!this.aBoolean627) {
			return;
		}
		if (this.aClass39_4 != null) {
			this.aClass101_Sub2_30.method5659(this.aClass39_4);
			@Pc(20) short local20 = 16384;
			this.aClass101_Sub2_30.method5624(this.aClass39_3);
			this.aClass39_4.method1116();
			this.aClass39_3.method1109(0);
			if (this.aBoolean628) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt8593, this.anInt8599, 0, 0, this.anInt8593, this.anInt8599, local20, 9728);
			this.aClass101_Sub2_30.method5623(this.aClass39_4);
			this.aClass101_Sub2_30.method5633(this.aClass39_3);
		}
		this.aClass101_Sub2_30.method5626();
		this.aClass101_Sub2_30.method5614(0);
		this.aClass101_Sub2_30.method5681(1);
		this.aClass101_Sub2_30.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class2_Sub31 local105;
		for (@Pc(97) Class2_Sub31 local97 = (Class2_Sub31) this.aClass271_49.method7177(); local97 != null; local97 = local105) {
			local105 = (Class2_Sub31) this.aClass271_49.method7175();
			@Pc(109) int local109 = local97.method9278();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method9281(this.aClass50_Sub4Array3[local89], this.aClass50_Sub4_3, local111);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass101_Sub2_30.method5678(this.aClass39_3);
					this.aClass101_Sub2_30.method5651(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8599);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8603, this.anInt8604);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8603, this.anInt8599 + this.anInt8604);
					OpenGL.glTexCoord2f((float) this.anInt8593, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8603 + this.anInt8593, this.anInt8604 + this.anInt8599);
					OpenGL.glTexCoord2f((float) this.anInt8593, (float) this.anInt8599);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8593 + this.anInt8603, this.anInt8604);
					OpenGL.glEnd();
				} else {
					this.aClass39_3.method1109(--local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8599);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt8599);
					OpenGL.glTexCoord2f((float) this.anInt8593, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8593, this.anInt8599);
					OpenGL.glTexCoord2f((float) this.anInt8593, (float) this.anInt8599);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8593, 0);
					OpenGL.glEnd();
				}
				local97.method9283(local111);
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean627 = false;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIII)Z")
	public boolean method7619(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass39_5 == null || this.aClass271_49.method7169()) {
			return false;
		}
		if (this.anInt8593 != arg3 || this.anInt8599 != arg0) {
			this.anInt8593 = arg3;
			this.anInt8599 = arg0;
			for (@Pc(38) Class2 local38 = this.aClass271_49.method7177(); local38 != this.aClass271_49.aClass2_230; local38 = local38.aClass2_338) {
				((Class2_Sub31) local38).method9280(this.anInt8599, this.anInt8593);
			}
			this.aBoolean630 = true;
			this.aBoolean632 = true;
			this.aBoolean629 = true;
		}
		if (!this.method7617()) {
			return false;
		}
		this.anInt8604 = arg2;
		this.anInt8603 = arg1;
		this.aBoolean627 = true;
		this.aClass101_Sub2_30.method5613(this.aClass39_5);
		this.aClass39_5.method1109(0);
		this.aClass101_Sub2_30.method5651(this.anInt8604 + this.anInt8599 - this.aClass101_Sub2_30.anInt6211, -this.anInt8603);
		return true;
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)Z")
	public boolean method7621() {
		return this.aClass39_5 != null;
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(Z)V")
	private void method7622() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub31 local17 = (Class2_Sub31) this.aClass271_49.method7177(); local17 != null; local17 = (Class2_Sub31) this.aClass271_49.method7175()) {
			local23 = local17.method9276();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method9278();
			local7 |= local17.method9275();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt8605) {
			this.anInt8605 = local23;
			this.aBoolean629 = true;
		}
		@Pc(93) int local93 = this.anInt8606 <= 2 ? this.anInt8606 : 2;
		@Pc(100) int local100 = local11 <= 2 ? local11 : 2;
		if (local7 != this.aBoolean628) {
			this.aBoolean628 = local7;
			this.aBoolean632 = true;
		}
		if (local100 != local93) {
			this.aBoolean630 = this.aBoolean629 = true;
		}
		this.anInt8606 = local11;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(BLclient!hp;)V")
	public void method7624(@OriginalArg(1) Class2_Sub31 arg0) {
		arg0.aBoolean783 = false;
		arg0.method9288();
		arg0.method9825();
		this.method7622();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!hp;)Z")
	public boolean method7625(@OriginalArg(1) Class2_Sub31 arg0) {
		if (this.aClass39_5 != null) {
			if (arg0.method9282() || arg0.method9274()) {
				this.aClass271_49.method7174(arg0);
				this.method7622();
				if (this.method7617()) {
					if (this.anInt8593 != -1 && this.anInt8599 != -1) {
						arg0.method9280(this.anInt8599, this.anInt8593);
					}
					arg0.aBoolean783 = true;
					return true;
				}
			}
			this.method7624(arg0);
		}
		return false;
	}
}
