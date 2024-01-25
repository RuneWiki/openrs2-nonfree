import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class75 {

	@OriginalMember(owner = "client!er", name = "r", descriptor = "Z")
	private boolean aBoolean102;

	@OriginalMember(owner = "client!er", name = "v", descriptor = "Lclient!ps;")
	private Class1_Sub2_Sub16 aClass1_Sub2_Sub16_1;

	@OriginalMember(owner = "client!er", name = "y", descriptor = "Lclient!ps;")
	private Class1_Sub2_Sub16 aClass1_Sub2_Sub16_2;

	@OriginalMember(owner = "client!er", name = "C", descriptor = "Lclient!qv;")
	private Class13_Sub1 aClass13_Sub1_1;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	private int anInt1826 = 0;

	@OriginalMember(owner = "client!er", name = "l", descriptor = "I")
	private int anInt1828 = 1;

	@OriginalMember(owner = "client!er", name = "s", descriptor = "I")
	private int anInt1833 = 0;

	@OriginalMember(owner = "client!er", name = "k", descriptor = "I")
	private int anInt1827 = 1;

	@OriginalMember(owner = "client!er", name = "c", descriptor = "Lclient!wo;")
	private final Class266 aClass266_14 = new Class266();

	@OriginalMember(owner = "client!er", name = "z", descriptor = "Z")
	private boolean aBoolean103 = false;

	@OriginalMember(owner = "client!er", name = "D", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!er", name = "B", descriptor = "I")
	private int anInt1835 = 0;

	@OriginalMember(owner = "client!er", name = "x", descriptor = "[Lclient!qv;")
	private Class13_Sub1[] aClass13_Sub1Array1 = new Class13_Sub1[2];

	@OriginalMember(owner = "client!er", name = "E", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!er", name = "F", descriptor = "I")
	private int anInt1836 = -1;

	@OriginalMember(owner = "client!er", name = "A", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!er", name = "G", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!er", name = "u", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_12;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "Lclient!lr;")
	private Class150 aClass150_3;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "Lclient!lr;")
	private Class150 aClass150_1;

	@OriginalMember(owner = "client!er", name = "d", descriptor = "Lclient!lr;")
	private Class150 aClass150_2;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class75(@OriginalArg(0) Class109_Sub1 arg0) {
		this.aClass109_Sub1_12 = arg0;
		if (this.aClass109_Sub1_12.aBoolean153 && this.aClass109_Sub1_12.aBoolean156) {
			this.aClass150_1 = this.aClass150_3 = new Class150(this.aClass109_Sub1_12);
			if (this.aClass109_Sub1_12.anInt2969 > 1 && this.aClass109_Sub1_12.aBoolean155 && this.aClass109_Sub1_12.aBoolean168) {
				this.aClass150_1 = this.aClass150_2 = new Class150(this.aClass109_Sub1_12);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	public void method1529() {
		this.aClass13_Sub1_1 = null;
		this.aClass1_Sub2_Sub16_2 = null;
		this.aClass1_Sub2_Sub16_1 = null;
		this.aClass13_Sub1Array1 = null;
		this.aClass150_1 = this.aClass150_2 = this.aClass150_3 = null;
		if (!this.aClass266_14.method5996()) {
			for (@Pc(41) Class1 local41 = this.aClass266_14.method6000(); local41 != this.aClass266_14.aClass1_255; local41 = local41.aClass1_261) {
				((Class1_Sub10) local41).method2215();
			}
		}
		this.anInt1828 = this.anInt1827 = 1;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	public void method1531() {
		if (!this.aBoolean102) {
			return;
		}
		if (this.aClass150_2 != null) {
			this.aClass109_Sub1_12.method2581(this.aClass150_2);
			@Pc(20) short local20 = 16384;
			this.aClass109_Sub1_12.method2588(this.aClass150_3);
			this.aClass150_2.method3522();
			this.aClass150_3.method3529(0);
			if (this.aBoolean103) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1828, this.anInt1827, 0, 0, this.anInt1828, this.anInt1827, local20, 9728);
			this.aClass109_Sub1_12.method2575(this.aClass150_2);
			this.aClass109_Sub1_12.method2533(this.aClass150_3);
		}
		this.aClass109_Sub1_12.method2589();
		this.aClass109_Sub1_12.method2522(0);
		this.aClass109_Sub1_12.method2531(1);
		this.aClass109_Sub1_12.va();
		@Pc(89) int local89 = 0;
		@Pc(99) int local99 = 1;
		@Pc(113) Class1_Sub10 local113;
		for (@Pc(105) Class1_Sub10 local105 = (Class1_Sub10) this.aClass266_14.method6000(); local105 != null; local105 = local113) {
			local113 = (Class1_Sub10) this.aClass266_14.method5994();
			@Pc(117) int local117 = local105.method2205();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local105.method2214(local119, this.aClass13_Sub1Array1[local89], this.aClass13_Sub1_1);
				if (local113 == null && local119 == local117 - 1) {
					this.aClass109_Sub1_12.method2591(this.aClass150_3);
					this.aClass109_Sub1_12.method2595(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1827);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1833, this.anInt1826);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1833, this.anInt1826 + this.anInt1827);
					OpenGL.glTexCoord2f((float) this.anInt1828, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1833 + this.anInt1828, this.anInt1827 + this.anInt1826);
					OpenGL.glTexCoord2f((float) this.anInt1828, (float) this.anInt1827);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1833 + this.anInt1828, this.anInt1826);
					OpenGL.glEnd();
				} else {
					this.aClass150_3.method3529(local99);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1827);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt1827);
					OpenGL.glTexCoord2f((float) this.anInt1828, (float) this.anInt1827);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1828, this.anInt1827);
					OpenGL.glTexCoord2f((float) this.anInt1828, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1828, 0);
					OpenGL.glEnd();
				}
				local89 = local89 + 1 & 0x1;
				local105.method2208(local119);
				local99 = local99 + 1 & 0x1;
			}
		}
		this.aBoolean102 = false;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIII)Z")
	public boolean method1532(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass150_1 == null || this.aClass266_14.method5996()) {
			return false;
		}
		if (this.anInt1828 != arg3 || arg1 != this.anInt1827) {
			this.anInt1827 = arg1;
			this.anInt1828 = arg3;
			for (@Pc(38) Class1 local38 = this.aClass266_14.method6000(); local38 != this.aClass266_14.aClass1_255; local38 = local38.aClass1_261) {
				((Class1_Sub10) local38).method2207(this.anInt1828, this.anInt1827);
			}
			this.aBoolean105 = true;
			this.aBoolean104 = true;
			this.aBoolean106 = true;
		}
		if (!this.method1534()) {
			return false;
		}
		this.anInt1833 = arg2;
		this.aBoolean102 = true;
		this.anInt1826 = arg0;
		this.aClass109_Sub1_12.method2600(this.aClass150_1);
		this.aClass150_1.method3529(0);
		this.aClass109_Sub1_12.method2595(-this.anInt1833, this.anInt1827 - this.aClass150_1.method3528() - this.anInt1826);
		return true;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)Z")
	public boolean method1533() {
		return this.aClass150_1 != null;
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(B)Z")
	private boolean method1534() {
		if (this.aBoolean104) {
			if (this.aClass1_Sub2_Sub16_1 != null) {
				this.aClass1_Sub2_Sub16_1.method4470();
				this.aClass1_Sub2_Sub16_1 = null;
			}
			if (this.aClass13_Sub1_1 != null) {
				this.aClass13_Sub1_1.method2744();
				this.aClass13_Sub1_1 = null;
			}
			if (this.aClass150_2 != null) {
				this.aClass1_Sub2_Sub16_1 = new Class1_Sub2_Sub16(this.aClass109_Sub1_12, 6402, this.anInt1828, this.anInt1827, this.aClass109_Sub1_12.anInt2969);
			}
			if (this.aBoolean103) {
				this.aClass13_Sub1_1 = new Class13_Sub1(this.aClass109_Sub1_12, 34037, 6402, this.anInt1828, this.anInt1827);
			} else if (this.aClass1_Sub2_Sub16_1 == null) {
				this.aClass1_Sub2_Sub16_1 = new Class1_Sub2_Sub16(this.aClass109_Sub1_12, 6402, this.anInt1828, this.anInt1827);
			}
			this.aBoolean104 = false;
			this.aBoolean107 = true;
			this.aBoolean105 = true;
		}
		if (this.aBoolean106) {
			if (this.aClass1_Sub2_Sub16_2 != null) {
				this.aClass1_Sub2_Sub16_2.method4470();
				this.aClass1_Sub2_Sub16_2 = null;
			}
			if (this.aClass13_Sub1Array1[0] != null) {
				this.aClass13_Sub1Array1[0].method2744();
				this.aClass13_Sub1Array1[0] = null;
			}
			if (this.aClass13_Sub1Array1[1] != null) {
				this.aClass13_Sub1Array1[1].method2744();
				this.aClass13_Sub1Array1[1] = null;
			}
			if (this.aClass150_2 != null) {
				this.aClass1_Sub2_Sub16_2 = new Class1_Sub2_Sub16(this.aClass109_Sub1_12, this.anInt1836, this.anInt1828, this.anInt1827, this.aClass109_Sub1_12.anInt2969);
			}
			this.aClass13_Sub1Array1[0] = new Class13_Sub1(this.aClass109_Sub1_12, 34037, this.anInt1836, this.anInt1828, this.anInt1827);
			this.aClass13_Sub1Array1[1] = this.anInt1835 <= 1 ? null : new Class13_Sub1(this.aClass109_Sub1_12, 34037, this.anInt1836, this.anInt1828, this.anInt1827);
			this.aBoolean106 = false;
			this.aBoolean107 = true;
			this.aBoolean105 = true;
		}
		if (this.aBoolean105) {
			if (this.aClass150_2 == null) {
				this.aClass109_Sub1_12.method2600(this.aClass150_3);
				this.aClass150_3.method3525(0);
				this.aClass150_3.method3525(1);
				this.aClass150_3.method3525(8);
				this.aClass150_3.method3527(this.aClass13_Sub1Array1[0], 0);
				if (this.anInt1835 > 1) {
					this.aClass150_3.method3527(this.aClass13_Sub1Array1[1], 1);
				}
				if (this.aBoolean103) {
					this.aClass150_3.method3527(this.aClass13_Sub1_1, 8);
				} else {
					this.aClass150_3.method3520(this.aClass1_Sub2_Sub16_1, 8);
				}
				this.aClass109_Sub1_12.method2591(this.aClass150_3);
			} else {
				this.aClass109_Sub1_12.method2600(this.aClass150_3);
				this.aClass150_3.method3525(0);
				this.aClass150_3.method3525(1);
				this.aClass150_3.method3525(8);
				this.aClass150_3.method3527(this.aClass13_Sub1Array1[0], 0);
				if (this.anInt1835 > 1) {
					this.aClass150_3.method3527(this.aClass13_Sub1Array1[1], 1);
				}
				if (this.aBoolean103) {
					this.aClass150_3.method3527(this.aClass13_Sub1_1, 8);
				}
				this.aClass109_Sub1_12.method2591(this.aClass150_3);
				this.aClass109_Sub1_12.method2600(this.aClass150_2);
				this.aClass150_2.method3525(0);
				this.aClass150_2.method3525(8);
				this.aClass150_2.method3520(this.aClass1_Sub2_Sub16_2, 0);
				this.aClass150_2.method3520(this.aClass1_Sub2_Sub16_1, 8);
				this.aClass109_Sub1_12.method2591(this.aClass150_2);
			}
			this.aBoolean107 = true;
			this.aBoolean105 = false;
		}
		if (this.aBoolean107) {
			this.aClass109_Sub1_12.method2600(this.aClass150_1);
			this.aBoolean107 = !this.aClass150_1.method3526();
			this.aClass109_Sub1_12.method2591(this.aClass150_1);
		}
		return !this.aBoolean107;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BLclient!fh;)V")
	public void method1535(@OriginalArg(1) Class1_Sub10 arg0) {
		arg0.aBoolean136 = false;
		arg0.method2215();
		arg0.method6071();
		this.method1536();
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(B)V")
	private void method1536() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub10 local17 = (Class1_Sub10) this.aClass266_14.method6000(); local17 != null; local17 = (Class1_Sub10) this.aClass266_14.method5994()) {
			local23 = local17.method2212();
			if (local23 > local9) {
				local9 = local23;
			}
			local11 += local17.method2205();
			local7 |= local17.method2210();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt1836) {
			this.aBoolean106 = true;
			this.anInt1836 = local23;
		}
		@Pc(87) int local87 = this.anInt1835 > 2 ? 2 : this.anInt1835;
		@Pc(96) int local96 = local11 > 2 ? 2 : local11;
		if (local87 != local96) {
			this.aBoolean105 = this.aBoolean106 = true;
		}
		if (this.aBoolean103 != local7) {
			this.aBoolean103 = local7;
			this.aBoolean104 = true;
		}
		this.anInt1835 = local11;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(ILclient!fh;)Z")
	public boolean method1537(@OriginalArg(1) Class1_Sub10 arg0) {
		if (this.aClass150_1 != null) {
			if (arg0.method2211() || arg0.method2213()) {
				this.aClass266_14.method5998(arg0);
				this.method1536();
				if (this.method1534()) {
					if (this.anInt1828 != -1 && this.anInt1827 != -1) {
						arg0.method2207(this.anInt1828, this.anInt1827);
					}
					arg0.aBoolean136 = true;
					return true;
				}
			}
			this.method1535(arg0);
		}
		return false;
	}
}
