import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class131 {

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "Z")
	private boolean aBoolean215;

	@OriginalMember(owner = "client!gi", name = "F", descriptor = "Lclient!ho;")
	private Class44_Sub1 aClass44_Sub1_3;

	@OriginalMember(owner = "client!gi", name = "H", descriptor = "Lclient!gba;")
	private Class5_Sub2_Sub6 aClass5_Sub2_Sub6_1;

	@OriginalMember(owner = "client!gi", name = "I", descriptor = "Lclient!gba;")
	private Class5_Sub2_Sub6 aClass5_Sub2_Sub6_2;

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "I")
	private int anInt3106 = 0;

	@OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
	private int anInt3107 = 1;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private int anInt3111 = 1;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "I")
	private int anInt3102 = 0;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "Lclient!ga;")
	private final Class124 aClass124_33 = new Class124();

	@OriginalMember(owner = "client!gi", name = "y", descriptor = "I")
	private int anInt3117 = -1;

	@OriginalMember(owner = "client!gi", name = "A", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!gi", name = "D", descriptor = "Z")
	private boolean aBoolean220 = true;

	@OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
	private int anInt3118 = 0;

	@OriginalMember(owner = "client!gi", name = "C", descriptor = "Z")
	private boolean aBoolean219 = true;

	@OriginalMember(owner = "client!gi", name = "E", descriptor = "[Lclient!ho;")
	private Class44_Sub1[] aClass44_Sub1Array4 = new Class44_Sub1[2];

	@OriginalMember(owner = "client!gi", name = "z", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!gi", name = "B", descriptor = "Z")
	private boolean aBoolean218 = false;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_20;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "Lclient!sca;")
	private Class318 aClass318_3;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "Lclient!sca;")
	private Class318 aClass318_4;

	@OriginalMember(owner = "client!gi", name = "w", descriptor = "Lclient!sca;")
	private Class318 aClass318_5;

	@OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class131(@OriginalArg(0) Class143_Sub2 arg0) {
		this.aClass143_Sub2_20 = arg0;
		if (this.aClass143_Sub2_20.aBoolean420 && this.aClass143_Sub2_20.aBoolean424) {
			this.aClass318_4 = this.aClass318_3 = new Class318(this.aClass143_Sub2_20);
			if (this.aClass143_Sub2_20.anInt5816 > 1 && this.aClass143_Sub2_20.aBoolean418 && this.aClass143_Sub2_20.aBoolean419) {
				this.aClass318_4 = this.aClass318_5 = new Class318(this.aClass143_Sub2_20);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
	public void method2742() {
		if (!this.aBoolean215) {
			return;
		}
		if (this.aClass318_5 != null) {
			this.aClass143_Sub2_20.method4968(this.aClass318_5);
			@Pc(20) short local20 = 16384;
			this.aClass143_Sub2_20.method4989(this.aClass318_3);
			this.aClass318_5.method7394();
			this.aClass318_3.method7389(0);
			if (this.aBoolean218) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3107, this.anInt3111, 0, 0, this.anInt3107, this.anInt3111, local20, 9728);
			this.aClass143_Sub2_20.method4991(this.aClass318_5);
			this.aClass143_Sub2_20.method4923(this.aClass318_3);
		}
		this.aClass143_Sub2_20.method4969();
		this.aClass143_Sub2_20.method4922(0);
		this.aClass143_Sub2_20.method4994(1);
		this.aClass143_Sub2_20.la();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(111) Class5_Sub17 local111;
		for (@Pc(103) Class5_Sub17 local103 = (Class5_Sub17) this.aClass124_33.method2572(); local103 != null; local103 = local111) {
			local111 = (Class5_Sub17) this.aClass124_33.method2569();
			@Pc(115) int local115 = local103.method1734();
			for (@Pc(117) int local117 = 0; local117 < local115; local117++) {
				local103.method1726(local117, this.aClass44_Sub1_3, this.aClass44_Sub1Array4[local89]);
				if (local111 == null && local117 == local115 - 1) {
					this.aClass143_Sub2_20.method4966(this.aClass318_3);
					this.aClass143_Sub2_20.method4946(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3111);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3106, this.anInt3102);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3106, this.anInt3102 + this.anInt3111);
					OpenGL.glTexCoord2f((float) this.anInt3107, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3106 + this.anInt3107, this.anInt3102 + this.anInt3111);
					OpenGL.glTexCoord2f((float) this.anInt3107, (float) this.anInt3111);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3106 + this.anInt3107, this.anInt3102);
					OpenGL.glEnd();
				} else {
					this.aClass318_3.method7389(--local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3111);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt3111);
					OpenGL.glTexCoord2f((float) this.anInt3107, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3107, this.anInt3111);
					OpenGL.glTexCoord2f((float) this.anInt3107, (float) this.anInt3111);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3107, 0);
					OpenGL.glEnd();
				}
				local103.method1730(local117);
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean215 = false;
	}

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "(I)V")
	private void method2744() {
		@Pc(5) boolean local5 = false;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(20) int local20;
		for (@Pc(15) Class5_Sub17 local15 = (Class5_Sub17) this.aClass124_33.method2572(); local15 != null; local15 = (Class5_Sub17) this.aClass124_33.method2569()) {
			local20 = local15.method1727();
			local9 += local15.method1734();
			if (local7 < local20) {
				local7 = local20;
			}
			local5 |= local15.method1732();
		}
		if (local7 == 2) {
			local20 = 34836;
		} else if (local7 == 1) {
			local20 = 34842;
		} else {
			local20 = 6408;
		}
		if (this.anInt3117 != local20) {
			this.anInt3117 = local20;
			this.aBoolean219 = true;
		}
		@Pc(90) int local90 = this.anInt3118 > 2 ? 2 : this.anInt3118;
		@Pc(108) int local108 = local9 > 2 ? 2 : local9;
		if (local90 != local108) {
			this.aBoolean217 = this.aBoolean219 = true;
		}
		if (local5 != this.aBoolean218) {
			this.aBoolean218 = local5;
			this.aBoolean216 = true;
		}
		this.anInt3118 = local9;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ek;B)Z")
	public boolean method2745(@OriginalArg(0) Class5_Sub17 arg0) {
		if (this.aClass318_4 != null) {
			if (arg0.method1733() || arg0.method1729()) {
				this.aClass124_33.method2574(arg0);
				this.method2744();
				if (this.method2747()) {
					if (this.anInt3107 != -1 && this.anInt3111 != -1) {
						arg0.method1736(this.anInt3107, this.anInt3111);
					}
					arg0.aBoolean126 = true;
					return true;
				}
			}
			this.method2749(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "(I)Z")
	public boolean method2746() {
		return this.aClass318_4 != null;
	}

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "(I)Z")
	private boolean method2747() {
		if (this.aBoolean216) {
			if (this.aClass5_Sub2_Sub6_2 != null) {
				this.aClass5_Sub2_Sub6_2.method2614();
				this.aClass5_Sub2_Sub6_2 = null;
			}
			if (this.aClass44_Sub1_3 != null) {
				this.aClass44_Sub1_3.method6703();
				this.aClass44_Sub1_3 = null;
			}
			if (this.aClass318_5 != null) {
				this.aClass5_Sub2_Sub6_2 = new Class5_Sub2_Sub6(this.aClass143_Sub2_20, 6402, this.anInt3107, this.anInt3111, this.aClass143_Sub2_20.anInt5816);
			}
			if (this.aBoolean218) {
				this.aClass44_Sub1_3 = new Class44_Sub1(this.aClass143_Sub2_20, 34037, 6402, this.anInt3107, this.anInt3111);
			} else if (this.aClass5_Sub2_Sub6_2 == null) {
				this.aClass5_Sub2_Sub6_2 = new Class5_Sub2_Sub6(this.aClass143_Sub2_20, 6402, this.anInt3107, this.anInt3111);
			}
			this.aBoolean216 = false;
			this.aBoolean217 = true;
			this.aBoolean220 = true;
		}
		if (this.aBoolean219) {
			if (this.aClass5_Sub2_Sub6_1 != null) {
				this.aClass5_Sub2_Sub6_1.method2614();
				this.aClass5_Sub2_Sub6_1 = null;
			}
			if (this.aClass44_Sub1Array4[0] != null) {
				this.aClass44_Sub1Array4[0].method6703();
				this.aClass44_Sub1Array4[0] = null;
			}
			if (this.aClass44_Sub1Array4[1] != null) {
				this.aClass44_Sub1Array4[1].method6703();
				this.aClass44_Sub1Array4[1] = null;
			}
			if (this.aClass318_5 != null) {
				this.aClass5_Sub2_Sub6_1 = new Class5_Sub2_Sub6(this.aClass143_Sub2_20, this.anInt3117, this.anInt3107, this.anInt3111, this.aClass143_Sub2_20.anInt5816);
			}
			this.aClass44_Sub1Array4[0] = new Class44_Sub1(this.aClass143_Sub2_20, 34037, this.anInt3117, this.anInt3107, this.anInt3111);
			this.aClass44_Sub1Array4[1] = this.anInt3118 <= 1 ? null : new Class44_Sub1(this.aClass143_Sub2_20, 34037, this.anInt3117, this.anInt3107, this.anInt3111);
			this.aBoolean219 = false;
			this.aBoolean220 = true;
			this.aBoolean217 = true;
		}
		if (this.aBoolean217) {
			if (this.aClass318_5 == null) {
				this.aClass143_Sub2_20.method4987(this.aClass318_3);
				this.aClass318_3.method7388(0);
				this.aClass318_3.method7388(1);
				this.aClass318_3.method7388(8);
				this.aClass318_3.method7393(this.aClass44_Sub1Array4[0], 0);
				if (this.anInt3118 > 1) {
					this.aClass318_3.method7393(this.aClass44_Sub1Array4[1], 1);
				}
				if (this.aBoolean218) {
					this.aClass318_3.method7393(this.aClass44_Sub1_3, 8);
				} else {
					this.aClass318_3.method7395(8, this.aClass5_Sub2_Sub6_2);
				}
				this.aClass143_Sub2_20.method4966(this.aClass318_3);
			} else {
				this.aClass143_Sub2_20.method4987(this.aClass318_3);
				this.aClass318_3.method7388(0);
				this.aClass318_3.method7388(1);
				this.aClass318_3.method7388(8);
				this.aClass318_3.method7393(this.aClass44_Sub1Array4[0], 0);
				if (this.anInt3118 > 1) {
					this.aClass318_3.method7393(this.aClass44_Sub1Array4[1], 1);
				}
				if (this.aBoolean218) {
					this.aClass318_3.method7393(this.aClass44_Sub1_3, 8);
				}
				this.aClass143_Sub2_20.method4966(this.aClass318_3);
				this.aClass143_Sub2_20.method4987(this.aClass318_5);
				this.aClass318_5.method7388(0);
				this.aClass318_5.method7388(8);
				this.aClass318_5.method7395(0, this.aClass5_Sub2_Sub6_1);
				this.aClass318_5.method7395(8, this.aClass5_Sub2_Sub6_2);
				this.aClass143_Sub2_20.method4966(this.aClass318_5);
			}
			this.aBoolean220 = true;
			this.aBoolean217 = false;
		}
		if (this.aBoolean220) {
			this.aClass143_Sub2_20.method4987(this.aClass318_4);
			this.aBoolean220 = !this.aClass318_4.method7392();
			this.aClass143_Sub2_20.method4966(this.aClass318_4);
		}
		return !this.aBoolean220;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIBII)Z")
	public boolean method2748(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass318_4 == null || this.aClass124_33.method2577()) {
			return false;
		}
		if (arg2 != this.anInt3107 || this.anInt3111 != arg3) {
			this.anInt3107 = arg2;
			this.anInt3111 = arg3;
			for (@Pc(42) Class5 local42 = this.aClass124_33.method2572(); local42 != this.aClass124_33.aClass5_123; local42 = local42.aClass5_337) {
				((Class5_Sub17) local42).method1736(this.anInt3107, this.anInt3111);
			}
			this.aBoolean217 = true;
			this.aBoolean219 = true;
			this.aBoolean216 = true;
		}
		if (!this.method2747()) {
			return false;
		}
		this.anInt3106 = arg0;
		this.anInt3102 = arg1;
		this.aBoolean215 = true;
		this.aClass143_Sub2_20.method4987(this.aClass318_4);
		this.aClass318_4.method7389(0);
		this.aClass143_Sub2_20.method4946(-this.anInt3106, this.anInt3111 + this.anInt3102 - this.aClass143_Sub2_20.anInt5737);
		return true;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ek;Z)V")
	public void method2749(@OriginalArg(0) Class5_Sub17 arg0) {
		arg0.aBoolean126 = false;
		arg0.method1731();
		arg0.method8829();
		this.method2744();
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)V")
	public void method2751() {
		this.aClass5_Sub2_Sub6_1 = null;
		this.aClass318_4 = this.aClass318_5 = this.aClass318_3 = null;
		this.aClass44_Sub1_3 = null;
		this.aClass5_Sub2_Sub6_2 = null;
		this.aClass44_Sub1Array4 = null;
		if (!this.aClass124_33.method2577()) {
			for (@Pc(41) Class5 local41 = this.aClass124_33.method2572(); local41 != this.aClass124_33.aClass5_123; local41 = local41.aClass5_337) {
				((Class5_Sub17) local41).method1731();
			}
		}
		this.anInt3107 = this.anInt3111 = 1;
	}
}
