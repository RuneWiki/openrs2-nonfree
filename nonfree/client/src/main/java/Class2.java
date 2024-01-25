import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aa")
public final class Class2 {

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "Z")
	private boolean aBoolean3;

	@OriginalMember(owner = "client!aa", name = "x", descriptor = "Lclient!lc;")
	private Class1_Sub3_Sub12 aClass1_Sub3_Sub12_1;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "Lclient!lc;")
	private Class1_Sub3_Sub12 aClass1_Sub3_Sub12_2;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!gu;")
	private Class23_Sub3 aClass23_Sub3_1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	private int anInt9 = 0;

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	private int anInt16 = 1;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "I")
	private int anInt24 = 0;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
	private int anInt25 = 1;

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "Lclient!am;")
	private final Class14 aClass14_1 = new Class14();

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "Z")
	private boolean aBoolean6 = true;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
	private int anInt26 = -1;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "Z")
	private boolean aBoolean7 = true;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Z")
	private boolean aBoolean4 = true;

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "Z")
	private boolean aBoolean8 = true;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "I")
	private int anInt27 = 0;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "[Lclient!gu;")
	private Class23_Sub3[] aClass23_Sub3Array1 = new Class23_Sub3[2];

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Z")
	private boolean aBoolean5 = false;

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!gb;")
	private Class90 aClass90_2;

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!gb;")
	private Class90 aClass90_1;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!gb;")
	private Class90 aClass90_3;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class2(@OriginalArg(0) Class117_Sub1 arg0) {
		this.aClass117_Sub1_1 = arg0;
		if (this.aClass117_Sub1_1.aBoolean310 && this.aClass117_Sub1_1.aBoolean309) {
			this.aClass90_1 = this.aClass90_2 = new Class90(this.aClass117_Sub1_1);
			if (this.aClass117_Sub1_1.anInt3083 > 1 && this.aClass117_Sub1_1.aBoolean294 && this.aClass117_Sub1_1.aBoolean300) {
				this.aClass90_1 = this.aClass90_3 = new Class90(this.aClass117_Sub1_1);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIII)Z")
	public boolean method12(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass90_1 == null || this.aClass14_1.method209()) {
			return false;
		}
		if (this.anInt25 != arg0 || this.anInt16 != arg3) {
			this.anInt25 = arg0;
			this.anInt16 = arg3;
			for (@Pc(43) Class1 local43 = this.aClass14_1.method203(); local43 != this.aClass14_1.aClass1_5; local43 = local43.aClass1_267) {
				((Class1_Sub23) local43).method2725(this.anInt25, this.anInt16);
			}
			this.aBoolean7 = true;
			this.aBoolean6 = true;
			this.aBoolean4 = true;
		}
		if (!this.method14()) {
			return false;
		}
		this.anInt9 = arg2;
		this.anInt24 = arg1;
		this.aBoolean3 = true;
		this.aClass117_Sub1_1.method2464(this.aClass90_1);
		this.aClass90_1.method1658(0);
		this.aClass117_Sub1_1.method2478(-this.anInt24, this.anInt16 - this.aClass90_1.method1654() - this.anInt9);
		return true;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!qh;I)V")
	public void method13(@OriginalArg(0) Class1_Sub23 arg0) {
		arg0.aBoolean335 = false;
		arg0.method2729();
		arg0.method5953();
		this.method16();
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)Z")
	private boolean method14() {
		if (this.aBoolean7) {
			if (this.aClass1_Sub3_Sub12_1 != null) {
				this.aClass1_Sub3_Sub12_1.method3291();
				this.aClass1_Sub3_Sub12_1 = null;
			}
			if (this.aClass23_Sub3_1 != null) {
				this.aClass23_Sub3_1.method5800();
				this.aClass23_Sub3_1 = null;
			}
			if (this.aClass90_3 != null) {
				this.aClass1_Sub3_Sub12_1 = new Class1_Sub3_Sub12(this.aClass117_Sub1_1, 6402, this.anInt25, this.anInt16, this.aClass117_Sub1_1.anInt3083);
			}
			if (this.aBoolean5) {
				this.aClass23_Sub3_1 = new Class23_Sub3(this.aClass117_Sub1_1, 34037, 6402, this.anInt25, this.anInt16);
			} else if (this.aClass1_Sub3_Sub12_1 == null) {
				this.aClass1_Sub3_Sub12_1 = new Class1_Sub3_Sub12(this.aClass117_Sub1_1, 6402, this.anInt25, this.anInt16);
			}
			this.aBoolean7 = false;
			this.aBoolean8 = true;
			this.aBoolean4 = true;
		}
		if (this.aBoolean6) {
			if (this.aClass1_Sub3_Sub12_2 != null) {
				this.aClass1_Sub3_Sub12_2.method3291();
				this.aClass1_Sub3_Sub12_2 = null;
			}
			if (this.aClass23_Sub3Array1[0] != null) {
				this.aClass23_Sub3Array1[0].method5800();
				this.aClass23_Sub3Array1[0] = null;
			}
			if (this.aClass23_Sub3Array1[1] != null) {
				this.aClass23_Sub3Array1[1].method5800();
				this.aClass23_Sub3Array1[1] = null;
			}
			if (this.aClass90_3 != null) {
				this.aClass1_Sub3_Sub12_2 = new Class1_Sub3_Sub12(this.aClass117_Sub1_1, this.anInt26, this.anInt25, this.anInt16, this.aClass117_Sub1_1.anInt3083);
			}
			this.aClass23_Sub3Array1[0] = new Class23_Sub3(this.aClass117_Sub1_1, 34037, this.anInt26, this.anInt25, this.anInt16);
			this.aClass23_Sub3Array1[1] = this.anInt27 <= 1 ? null : new Class23_Sub3(this.aClass117_Sub1_1, 34037, this.anInt26, this.anInt25, this.anInt16);
			this.aBoolean8 = true;
			this.aBoolean6 = false;
			this.aBoolean4 = true;
		}
		if (this.aBoolean4) {
			if (this.aClass90_3 == null) {
				this.aClass117_Sub1_1.method2464(this.aClass90_2);
				this.aClass90_2.method1649(0);
				this.aClass90_2.method1649(1);
				this.aClass90_2.method1649(8);
				this.aClass90_2.method1650(this.aClass23_Sub3Array1[0], 0);
				if (this.anInt27 > 1) {
					this.aClass90_2.method1650(this.aClass23_Sub3Array1[1], 1);
				}
				if (this.aBoolean5) {
					this.aClass90_2.method1650(this.aClass23_Sub3_1, 8);
				} else {
					this.aClass90_2.method1656(8, this.aClass1_Sub3_Sub12_1);
				}
				this.aClass117_Sub1_1.method2467(this.aClass90_2);
			} else {
				this.aClass117_Sub1_1.method2464(this.aClass90_2);
				this.aClass90_2.method1649(0);
				this.aClass90_2.method1649(1);
				this.aClass90_2.method1649(8);
				this.aClass90_2.method1650(this.aClass23_Sub3Array1[0], 0);
				if (this.anInt27 > 1) {
					this.aClass90_2.method1650(this.aClass23_Sub3Array1[1], 1);
				}
				if (this.aBoolean5) {
					this.aClass90_2.method1650(this.aClass23_Sub3_1, 8);
				}
				this.aClass117_Sub1_1.method2467(this.aClass90_2);
				this.aClass117_Sub1_1.method2464(this.aClass90_3);
				this.aClass90_3.method1649(0);
				this.aClass90_3.method1649(8);
				this.aClass90_3.method1656(0, this.aClass1_Sub3_Sub12_2);
				this.aClass90_3.method1656(8, this.aClass1_Sub3_Sub12_1);
				this.aClass117_Sub1_1.method2467(this.aClass90_3);
			}
			this.aBoolean4 = false;
			this.aBoolean8 = true;
		}
		if (this.aBoolean8) {
			this.aClass117_Sub1_1.method2464(this.aClass90_1);
			this.aBoolean8 = !this.aClass90_1.method1659();
			this.aClass117_Sub1_1.method2467(this.aClass90_1);
		}
		return !this.aBoolean8;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(I)V")
	public void method15() {
		if (!this.aBoolean3) {
			return;
		}
		if (this.aClass90_3 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass117_Sub1_1.method2472(this.aClass90_3);
			this.aClass117_Sub1_1.method2502(this.aClass90_2);
			this.aClass90_3.method1652();
			this.aClass90_2.method1658(0);
			if (this.aBoolean5) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt25, this.anInt16, 0, 0, this.anInt25, this.anInt16, local14, 9728);
			this.aClass117_Sub1_1.method2514(this.aClass90_3);
			this.aClass117_Sub1_1.method2506(this.aClass90_2);
		}
		this.aClass117_Sub1_1.method2466();
		this.aClass117_Sub1_1.method2503(0);
		this.aClass117_Sub1_1.method2535(1);
		this.aClass117_Sub1_1.va();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(109) Class1_Sub23 local109;
		for (@Pc(101) Class1_Sub23 local101 = (Class1_Sub23) this.aClass14_1.method203(); local101 != null; local101 = local109) {
			local109 = (Class1_Sub23) this.aClass14_1.method208();
			@Pc(113) int local113 = local101.method2727();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method2731(this.aClass23_Sub3_1, this.aClass23_Sub3Array1[local91], local115);
				if (local109 == null && local115 == local113 - 1) {
					this.aClass117_Sub1_1.method2467(this.aClass90_2);
					this.aClass117_Sub1_1.method2478(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt16);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt24, this.anInt9);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt24, this.anInt9 + this.anInt16);
					OpenGL.glTexCoord2f((float) this.anInt25, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt25 + this.anInt24, this.anInt9 + this.anInt16);
					OpenGL.glTexCoord2f((float) this.anInt25, (float) this.anInt16);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt24 + this.anInt25, this.anInt9);
					OpenGL.glEnd();
				} else {
					this.aClass90_2.method1658(--local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt16);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt16);
					OpenGL.glTexCoord2f((float) this.anInt25, (float) this.anInt16);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt25, this.anInt16);
					OpenGL.glTexCoord2f((float) this.anInt25, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt25, 0);
					OpenGL.glEnd();
				}
				local93 = local93 + 1 & 0x1;
				local101.method2720(local115);
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean3 = false;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	private void method16() {
		@Pc(7) boolean local7 = false;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(33) int local33;
		for (@Pc(27) Class1_Sub23 local27 = (Class1_Sub23) this.aClass14_1.method203(); local27 != null; local27 = (Class1_Sub23) this.aClass14_1.method208()) {
			local33 = local27.method2728();
			if (local33 > local17) {
				local17 = local33;
			}
			local19 += local27.method2727();
			local7 |= local27.method2726();
		}
		if (local17 == 2) {
			local33 = 34836;
		} else if (local17 == 1) {
			local33 = 34842;
		} else {
			local33 = 6408;
		}
		if (this.anInt26 != local33) {
			this.aBoolean6 = true;
			this.anInt26 = local33;
		}
		@Pc(105) int local105 = this.anInt27 > 2 ? 2 : this.anInt27;
		@Pc(114) int local114 = local19 <= 2 ? local19 : 2;
		if (local7 != this.aBoolean5) {
			this.aBoolean7 = true;
			this.aBoolean5 = local7;
		}
		this.anInt27 = local19;
		if (local105 != local114) {
			this.aBoolean4 = this.aBoolean6 = true;
		}
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)Z")
	public boolean method18() {
		return this.aClass90_1 != null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILclient!qh;)Z")
	public boolean method19(@OriginalArg(1) Class1_Sub23 arg0) {
		if (this.aClass90_1 != null) {
			if (arg0.method2724() || arg0.method2722()) {
				this.aClass14_1.method205(arg0);
				this.method16();
				if (this.method14()) {
					if (this.anInt25 != -1 && this.anInt16 != -1) {
						arg0.method2725(this.anInt25, this.anInt16);
					}
					arg0.aBoolean335 = true;
					return true;
				}
			}
			this.method13(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)V")
	public void method21() {
		this.aClass23_Sub3_1 = null;
		this.aClass23_Sub3Array1 = null;
		this.aClass90_1 = this.aClass90_3 = this.aClass90_2 = null;
		this.aClass1_Sub3_Sub12_1 = null;
		this.aClass1_Sub3_Sub12_2 = null;
		if (!this.aClass14_1.method209()) {
			for (@Pc(42) Class1 local42 = this.aClass14_1.method203(); local42 != this.aClass14_1.aClass1_5; local42 = local42.aClass1_267) {
				((Class1_Sub23) local42).method2729();
			}
		}
		this.anInt25 = this.anInt16 = 1;
	}
}
