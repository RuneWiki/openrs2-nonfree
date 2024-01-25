import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!si")
public final class Class305 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Z")
	private boolean aBoolean642;

	@OriginalMember(owner = "client!si", name = "D", descriptor = "Lclient!nh;")
	private Class2_Sub5_Sub15 aClass2_Sub5_Sub15_1;

	@OriginalMember(owner = "client!si", name = "E", descriptor = "Lclient!me;")
	private Class88_Sub2 aClass88_Sub2_4;

	@OriginalMember(owner = "client!si", name = "F", descriptor = "Lclient!nh;")
	private Class2_Sub5_Sub15 aClass2_Sub5_Sub15_2;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	private int anInt8682 = 1;

	@OriginalMember(owner = "client!si", name = "q", descriptor = "I")
	private int anInt8683 = 1;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "I")
	private int anInt8673 = 0;

	@OriginalMember(owner = "client!si", name = "r", descriptor = "I")
	private int anInt8684 = 0;

	@OriginalMember(owner = "client!si", name = "b", descriptor = "Lclient!nt;")
	private final Class238 aClass238_61 = new Class238();

	@OriginalMember(owner = "client!si", name = "y", descriptor = "Z")
	private boolean aBoolean643 = false;

	@OriginalMember(owner = "client!si", name = "B", descriptor = "Z")
	private boolean aBoolean646 = true;

	@OriginalMember(owner = "client!si", name = "C", descriptor = "Z")
	private boolean aBoolean647 = true;

	@OriginalMember(owner = "client!si", name = "x", descriptor = "[Lclient!me;")
	private Class88_Sub2[] aClass88_Sub2Array3 = new Class88_Sub2[2];

	@OriginalMember(owner = "client!si", name = "z", descriptor = "Z")
	private boolean aBoolean644 = true;

	@OriginalMember(owner = "client!si", name = "G", descriptor = "I")
	private int anInt8688 = -1;

	@OriginalMember(owner = "client!si", name = "A", descriptor = "Z")
	private boolean aBoolean645 = true;

	@OriginalMember(owner = "client!si", name = "H", descriptor = "I")
	private int anInt8689 = 0;

	@OriginalMember(owner = "client!si", name = "v", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_34;

	@OriginalMember(owner = "client!si", name = "f", descriptor = "Lclient!ij;")
	private Class161 aClass161_3;

	@OriginalMember(owner = "client!si", name = "u", descriptor = "Lclient!ij;")
	private Class161 aClass161_5;

	@OriginalMember(owner = "client!si", name = "k", descriptor = "Lclient!ij;")
	private Class161 aClass161_4;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class305(@OriginalArg(0) Class87_Sub2 arg0) {
		this.aClass87_Sub2_34 = arg0;
		if (this.aClass87_Sub2_34.aBoolean546 && this.aClass87_Sub2_34.aBoolean538) {
			this.aClass161_5 = this.aClass161_3 = new Class161(this.aClass87_Sub2_34);
			if (this.aClass87_Sub2_34.anInt7365 > 1 && this.aClass87_Sub2_34.aBoolean557 && this.aClass87_Sub2_34.aBoolean551) {
				this.aClass161_5 = this.aClass161_4 = new Class161(this.aClass87_Sub2_34);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIZI)Z")
	public boolean method7278(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass161_5 == null || this.aClass238_61.method5839()) {
			return false;
		}
		if (this.anInt8683 != arg2 || arg0 != this.anInt8682) {
			this.anInt8682 = arg0;
			this.anInt8683 = arg2;
			for (@Pc(38) Class2 local38 = this.aClass238_61.method5833(); local38 != this.aClass238_61.aClass2_201; local38 = local38.aClass2_300) {
				((Class2_Sub48) local38).method7777(this.anInt8683, this.anInt8682);
			}
			this.aBoolean644 = true;
			this.aBoolean645 = true;
			this.aBoolean646 = true;
		}
		if (!this.method7280()) {
			return false;
		}
		this.aBoolean642 = true;
		this.anInt8684 = arg3;
		this.anInt8673 = arg1;
		this.aClass87_Sub2_34.method6188(this.aClass161_5);
		this.aClass161_5.method3968(0);
		this.aClass87_Sub2_34.method6208(this.anInt8673 + this.anInt8682 - this.aClass87_Sub2_34.anInt7352, -this.anInt8684);
		return true;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)Z")
	private boolean method7280() {
		if (this.aBoolean644) {
			if (this.aClass2_Sub5_Sub15_2 != null) {
				this.aClass2_Sub5_Sub15_2.method5682();
				this.aClass2_Sub5_Sub15_2 = null;
			}
			if (this.aClass88_Sub2_4 != null) {
				this.aClass88_Sub2_4.method6984();
				this.aClass88_Sub2_4 = null;
			}
			if (this.aClass161_4 != null) {
				this.aClass2_Sub5_Sub15_2 = new Class2_Sub5_Sub15(this.aClass87_Sub2_34, 6402, this.anInt8683, this.anInt8682, this.aClass87_Sub2_34.anInt7365);
			}
			if (this.aBoolean643) {
				this.aClass88_Sub2_4 = new Class88_Sub2(this.aClass87_Sub2_34, 34037, 6402, this.anInt8683, this.anInt8682);
			} else if (this.aClass2_Sub5_Sub15_2 == null) {
				this.aClass2_Sub5_Sub15_2 = new Class2_Sub5_Sub15(this.aClass87_Sub2_34, 6402, this.anInt8683, this.anInt8682);
			}
			this.aBoolean644 = false;
			this.aBoolean646 = true;
			this.aBoolean647 = true;
		}
		if (this.aBoolean645) {
			if (this.aClass2_Sub5_Sub15_1 != null) {
				this.aClass2_Sub5_Sub15_1.method5682();
				this.aClass2_Sub5_Sub15_1 = null;
			}
			if (this.aClass88_Sub2Array3[0] != null) {
				this.aClass88_Sub2Array3[0].method6984();
				this.aClass88_Sub2Array3[0] = null;
			}
			if (this.aClass88_Sub2Array3[1] != null) {
				this.aClass88_Sub2Array3[1].method6984();
				this.aClass88_Sub2Array3[1] = null;
			}
			if (this.aClass161_4 != null) {
				this.aClass2_Sub5_Sub15_1 = new Class2_Sub5_Sub15(this.aClass87_Sub2_34, this.anInt8688, this.anInt8683, this.anInt8682, this.aClass87_Sub2_34.anInt7365);
			}
			this.aClass88_Sub2Array3[0] = new Class88_Sub2(this.aClass87_Sub2_34, 34037, this.anInt8688, this.anInt8683, this.anInt8682);
			this.aClass88_Sub2Array3[1] = this.anInt8689 > 1 ? new Class88_Sub2(this.aClass87_Sub2_34, 34037, this.anInt8688, this.anInt8683, this.anInt8682) : null;
			this.aBoolean645 = false;
			this.aBoolean646 = true;
			this.aBoolean647 = true;
		}
		if (this.aBoolean646) {
			if (this.aClass161_4 == null) {
				this.aClass87_Sub2_34.method6188(this.aClass161_3);
				this.aClass161_3.method3958(0);
				this.aClass161_3.method3958(1);
				this.aClass161_3.method3958(8);
				this.aClass161_3.method3959(this.aClass88_Sub2Array3[0], 0);
				if (this.anInt8689 > 1) {
					this.aClass161_3.method3959(this.aClass88_Sub2Array3[1], 1);
				}
				if (this.aBoolean643) {
					this.aClass161_3.method3959(this.aClass88_Sub2_4, 8);
				} else {
					this.aClass161_3.method3967(8, this.aClass2_Sub5_Sub15_2);
				}
				this.aClass87_Sub2_34.method6184(this.aClass161_3);
			} else {
				this.aClass87_Sub2_34.method6188(this.aClass161_3);
				this.aClass161_3.method3958(0);
				this.aClass161_3.method3958(1);
				this.aClass161_3.method3958(8);
				this.aClass161_3.method3959(this.aClass88_Sub2Array3[0], 0);
				if (this.anInt8689 > 1) {
					this.aClass161_3.method3959(this.aClass88_Sub2Array3[1], 1);
				}
				if (this.aBoolean643) {
					this.aClass161_3.method3959(this.aClass88_Sub2_4, 8);
				}
				this.aClass87_Sub2_34.method6184(this.aClass161_3);
				this.aClass87_Sub2_34.method6188(this.aClass161_4);
				this.aClass161_4.method3958(0);
				this.aClass161_4.method3958(8);
				this.aClass161_4.method3967(0, this.aClass2_Sub5_Sub15_1);
				this.aClass161_4.method3967(8, this.aClass2_Sub5_Sub15_2);
				this.aClass87_Sub2_34.method6184(this.aClass161_4);
			}
			this.aBoolean646 = false;
			this.aBoolean647 = true;
		}
		if (this.aBoolean647) {
			this.aClass87_Sub2_34.method6188(this.aClass161_5);
			this.aBoolean647 = !this.aClass161_5.method3960();
			this.aClass87_Sub2_34.method6184(this.aClass161_5);
		}
		return !this.aBoolean647;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!tj;I)V")
	public void method7281(@OriginalArg(0) Class2_Sub48 arg0) {
		arg0.aBoolean681 = false;
		arg0.method7781();
		arg0.method8599();
		this.method7283();
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Z")
	public boolean method7282() {
		return this.aClass161_5 != null;
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
	private void method7283() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(27) int local27;
		for (@Pc(21) Class2_Sub48 local21 = (Class2_Sub48) this.aClass238_61.method5833(); local21 != null; local21 = (Class2_Sub48) this.aClass238_61.method5838()) {
			local27 = local21.method7782();
			if (local9 < local27) {
				local9 = local27;
			}
			local11 += local21.method7775();
			local7 |= local21.method7773();
		}
		if (local9 == 2) {
			local27 = 34836;
		} else if (local9 == 1) {
			local27 = 34842;
		} else {
			local27 = 6408;
		}
		if (this.anInt8688 != local27) {
			this.aBoolean645 = true;
			this.anInt8688 = local27;
		}
		@Pc(99) int local99 = this.anInt8689 <= 2 ? this.anInt8689 : 2;
		@Pc(108) int local108 = local11 <= 2 ? local11 : 2;
		if (local7 != this.aBoolean643) {
			this.aBoolean643 = local7;
			this.aBoolean644 = true;
		}
		this.anInt8689 = local11;
		if (local108 != local99) {
			this.aBoolean646 = this.aBoolean645 = true;
		}
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
	public void method7284() {
		this.aClass161_5 = this.aClass161_4 = this.aClass161_3 = null;
		this.aClass88_Sub2_4 = null;
		this.aClass88_Sub2Array3 = null;
		this.aClass2_Sub5_Sub15_1 = null;
		this.aClass2_Sub5_Sub15_2 = null;
		if (!this.aClass238_61.method5839()) {
			for (@Pc(38) Class2 local38 = this.aClass238_61.method5833(); local38 != this.aClass238_61.aClass2_201; local38 = local38.aClass2_300) {
				((Class2_Sub48) local38).method7781();
			}
		}
		this.anInt8683 = this.anInt8682 = 1;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BLclient!tj;)Z")
	public boolean method7285(@OriginalArg(1) Class2_Sub48 arg0) {
		if (this.aClass161_5 != null) {
			if (arg0.method7780() || arg0.method7783()) {
				this.aClass238_61.method5837(arg0);
				this.method7283();
				if (this.method7280()) {
					if (this.anInt8683 != -1 && this.anInt8682 != -1) {
						arg0.method7777(this.anInt8683, this.anInt8682);
					}
					arg0.aBoolean681 = true;
					return true;
				}
			}
			this.method7281(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V")
	public void method7286() {
		if (!this.aBoolean642) {
			return;
		}
		if (this.aClass161_4 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass87_Sub2_34.method6223(this.aClass161_4);
			this.aClass87_Sub2_34.method6147(this.aClass161_3);
			this.aClass161_4.method3957();
			this.aClass161_3.method3968(0);
			if (this.aBoolean643) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt8683, this.anInt8682, 0, 0, this.anInt8683, this.anInt8682, local14, 9728);
			this.aClass87_Sub2_34.method6182(this.aClass161_4);
			this.aClass87_Sub2_34.method6161(this.aClass161_3);
		}
		this.aClass87_Sub2_34.method6197();
		this.aClass87_Sub2_34.method6196(0);
		this.aClass87_Sub2_34.method6159(1);
		this.aClass87_Sub2_34.la();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(113) Class2_Sub48 local113;
		for (@Pc(105) Class2_Sub48 local105 = (Class2_Sub48) this.aClass238_61.method5833(); local105 != null; local105 = local113) {
			local113 = (Class2_Sub48) this.aClass238_61.method5838();
			@Pc(117) int local117 = local105.method7775();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method7776(local119, this.aClass88_Sub2_4, this.aClass88_Sub2Array3[local91]);
				if (local113 == null && local117 - 1 == local119) {
					this.aClass87_Sub2_34.method6184(this.aClass161_3);
					this.aClass87_Sub2_34.method6208(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8682);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8684, this.anInt8673);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8684, this.anInt8682 + this.anInt8673);
					OpenGL.glTexCoord2f((float) this.anInt8683, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8683 + this.anInt8684, this.anInt8673 + this.anInt8682);
					OpenGL.glTexCoord2f((float) this.anInt8683, (float) this.anInt8682);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8684 + this.anInt8683, this.anInt8673);
					OpenGL.glEnd();
				} else {
					this.aClass161_3.method3968(local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8682);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt8682);
					OpenGL.glTexCoord2f((float) this.anInt8683, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8683, this.anInt8682);
					OpenGL.glTexCoord2f((float) this.anInt8683, (float) this.anInt8682);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8683, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local105.method7774(local119);
				local93 = local93 + 1 & 0x1;
			}
		}
		this.aBoolean642 = false;
	}
}
