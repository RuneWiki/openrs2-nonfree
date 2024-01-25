import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class242 {

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "Z")
	private boolean aBoolean398;

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!df;")
	private Class3_Sub7_Sub4 aClass3_Sub7_Sub4_1;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Lclient!df;")
	private Class3_Sub7_Sub4 aClass3_Sub7_Sub4_2;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!fu;")
	private Class125_Sub1 aClass125_Sub1_6;

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
	private int anInt6153 = 1;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
	private int anInt6149 = 0;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "I")
	private int anInt6158 = 1;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private int anInt6156 = 0;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!sja;")
	private final Class342 aClass342_46 = new Class342();

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "Z")
	private boolean aBoolean400 = true;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Z")
	private boolean aBoolean402 = true;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[Lclient!fu;")
	private Class125_Sub1[] aClass125_Sub1Array4 = new Class125_Sub1[2];

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "Z")
	private boolean aBoolean401 = true;

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "Z")
	private boolean aBoolean399 = true;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
	private int anInt6161 = 0;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	private int anInt6162 = -1;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Z")
	private boolean aBoolean403 = false;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_27;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!cb;")
	private Class52 aClass52_5;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!cb;")
	private Class52 aClass52_6;

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!cb;")
	private Class52 aClass52_7;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class242(@OriginalArg(0) Class22_Sub1 arg0) {
		this.aClass22_Sub1_27 = arg0;
		if (this.aClass22_Sub1_27.aBoolean66 && this.aClass22_Sub1_27.aBoolean70) {
			this.aClass52_6 = this.aClass52_5 = new Class52(this.aClass22_Sub1_27);
			if (this.aClass22_Sub1_27.anInt990 > 1 && this.aClass22_Sub1_27.aBoolean68 && this.aClass22_Sub1_27.aBoolean56) {
				this.aClass52_6 = this.aClass52_7 = new Class52(this.aClass22_Sub1_27);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(B)V")
	public void method5348() {
		this.aClass125_Sub1_6 = null;
		this.aClass3_Sub7_Sub4_1 = null;
		this.aClass52_6 = this.aClass52_7 = this.aClass52_5 = null;
		this.aClass3_Sub7_Sub4_2 = null;
		this.aClass125_Sub1Array4 = null;
		if (!this.aClass342_46.method7652()) {
			for (@Pc(45) Class3 local45 = this.aClass342_46.method7644(); local45 != this.aClass342_46.aClass3_291; local45 = local45.aClass3_346) {
				((Class3_Sub13) local45).method3128();
			}
		}
		this.anInt6153 = this.anInt6158 = 1;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method5349() {
		if (!this.aBoolean398) {
			return;
		}
		if (this.aClass52_7 != null) {
			this.aClass22_Sub1_27.method965(this.aClass52_7);
			@Pc(21) short local21 = 16384;
			this.aClass22_Sub1_27.method970(this.aClass52_5);
			this.aClass52_7.method1508();
			this.aClass52_5.method1518(0);
			if (this.aBoolean403) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6153, this.anInt6158, 0, 0, this.anInt6153, this.anInt6158, local21, 9728);
			this.aClass22_Sub1_27.method891(this.aClass52_7);
			this.aClass22_Sub1_27.method898(this.aClass52_5);
		}
		this.aClass22_Sub1_27.method926();
		this.aClass22_Sub1_27.method964(0);
		this.aClass22_Sub1_27.method894(1);
		this.aClass22_Sub1_27.la();
		@Pc(92) int local92 = 0;
		@Pc(94) int local94 = 1;
		@Pc(112) Class3_Sub13 local112;
		for (@Pc(102) Class3_Sub13 local102 = (Class3_Sub13) this.aClass342_46.method7644(); local102 != null; local102 = local112) {
			local112 = (Class3_Sub13) this.aClass342_46.method7650();
			@Pc(116) int local116 = local102.method3140();
			for (@Pc(118) int local118 = 0; local118 < local116; local118++) {
				local102.method3133(this.aClass125_Sub1_6, local118, this.aClass125_Sub1Array4[local92]);
				if (local112 == null && local116 - 1 == local118) {
					this.aClass22_Sub1_27.method923(this.aClass52_5);
					this.aClass22_Sub1_27.method915(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6158);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6156, this.anInt6149);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6156, this.anInt6149 + this.anInt6158);
					OpenGL.glTexCoord2f((float) this.anInt6153, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6153 + this.anInt6156, this.anInt6149 + this.anInt6158);
					OpenGL.glTexCoord2f((float) this.anInt6153, (float) this.anInt6158);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6153 + this.anInt6156, this.anInt6149);
					OpenGL.glEnd();
				} else {
					this.aClass52_5.method1518(--local94);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6158);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt6158);
					OpenGL.glTexCoord2f((float) this.anInt6153, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6153, this.anInt6158);
					OpenGL.glTexCoord2f((float) this.anInt6153, (float) this.anInt6158);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6153, 0);
					OpenGL.glEnd();
				}
				local94 = local94 + 1 & 0x1;
				local102.method3135(local118);
				local92 = local92 + 1 & 0x1;
			}
		}
		this.aBoolean398 = false;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BLclient!cca;)Z")
	public boolean method5350(@OriginalArg(1) Class3_Sub13 arg0) {
		if (this.aClass52_6 != null) {
			if (arg0.method3132() || arg0.method3138()) {
				this.aClass342_46.method7654(arg0);
				this.method5353();
				if (this.method5355()) {
					if (this.anInt6153 != -1 && this.anInt6158 != -1) {
						arg0.method3130(this.anInt6158, this.anInt6153);
					}
					arg0.aBoolean217 = true;
					return true;
				}
			}
			this.method5356(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Z")
	public boolean method5351() {
		return this.aClass52_6 != null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIIIB)Z")
	public boolean method5352(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass52_6 == null || this.aClass342_46.method7652()) {
			return false;
		}
		if (this.anInt6153 != arg3 || arg1 != this.anInt6158) {
			this.anInt6158 = arg1;
			this.anInt6153 = arg3;
			for (@Pc(51) Class3 local51 = this.aClass342_46.method7644(); local51 != this.aClass342_46.aClass3_291; local51 = local51.aClass3_346) {
				((Class3_Sub13) local51).method3130(this.anInt6158, this.anInt6153);
			}
			this.aBoolean401 = true;
			this.aBoolean400 = true;
			this.aBoolean399 = true;
		}
		if (!this.method5355()) {
			return false;
		}
		this.aBoolean398 = true;
		this.anInt6156 = arg0;
		this.anInt6149 = arg2;
		this.aClass22_Sub1_27.method959(this.aClass52_6);
		this.aClass52_6.method1518(0);
		this.aClass22_Sub1_27.method915(this.anInt6149 + this.anInt6158 - this.aClass22_Sub1_27.anInt833, -this.anInt6156);
		return true;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	private void method5353() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(17) Class3_Sub13 local17 = (Class3_Sub13) this.aClass342_46.method7644(); local17 != null; local17 = (Class3_Sub13) this.aClass342_46.method7650()) {
			local25 = local17.method3131();
			if (local9 < local25) {
				local9 = local25;
			}
			local11 += local17.method3140();
			local7 |= local17.method3136();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (local25 != this.anInt6162) {
			this.anInt6162 = local25;
			this.aBoolean401 = true;
		}
		@Pc(96) int local96 = this.anInt6161 > 2 ? 2 : this.anInt6161;
		@Pc(104) int local104 = local11 > 2 ? 2 : local11;
		if (local96 != local104) {
			this.aBoolean400 = this.aBoolean401 = true;
		}
		if (local7 != this.aBoolean403) {
			this.aBoolean399 = true;
			this.aBoolean403 = local7;
		}
		this.anInt6161 = local11;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)Z")
	private boolean method5355() {
		if (this.aBoolean399) {
			if (this.aClass3_Sub7_Sub4_2 != null) {
				this.aClass3_Sub7_Sub4_2.method2115();
				this.aClass3_Sub7_Sub4_2 = null;
			}
			if (this.aClass125_Sub1_6 != null) {
				this.aClass125_Sub1_6.method9209();
				this.aClass125_Sub1_6 = null;
			}
			if (this.aClass52_7 != null) {
				this.aClass3_Sub7_Sub4_2 = new Class3_Sub7_Sub4(this.aClass22_Sub1_27, 6402, this.anInt6153, this.anInt6158, this.aClass22_Sub1_27.anInt990);
			}
			if (this.aBoolean403) {
				this.aClass125_Sub1_6 = new Class125_Sub1(this.aClass22_Sub1_27, 34037, 6402, this.anInt6153, this.anInt6158);
			} else if (this.aClass3_Sub7_Sub4_2 == null) {
				this.aClass3_Sub7_Sub4_2 = new Class3_Sub7_Sub4(this.aClass22_Sub1_27, 6402, this.anInt6153, this.anInt6158);
			}
			this.aBoolean399 = false;
			this.aBoolean400 = true;
			this.aBoolean402 = true;
		}
		if (this.aBoolean401) {
			if (this.aClass3_Sub7_Sub4_1 != null) {
				this.aClass3_Sub7_Sub4_1.method2115();
				this.aClass3_Sub7_Sub4_1 = null;
			}
			if (this.aClass125_Sub1Array4[0] != null) {
				this.aClass125_Sub1Array4[0].method9209();
				this.aClass125_Sub1Array4[0] = null;
			}
			if (this.aClass125_Sub1Array4[1] != null) {
				this.aClass125_Sub1Array4[1].method9209();
				this.aClass125_Sub1Array4[1] = null;
			}
			if (this.aClass52_7 != null) {
				this.aClass3_Sub7_Sub4_1 = new Class3_Sub7_Sub4(this.aClass22_Sub1_27, this.anInt6162, this.anInt6153, this.anInt6158, this.aClass22_Sub1_27.anInt990);
			}
			this.aClass125_Sub1Array4[0] = new Class125_Sub1(this.aClass22_Sub1_27, 34037, this.anInt6162, this.anInt6153, this.anInt6158);
			this.aClass125_Sub1Array4[1] = this.anInt6161 <= 1 ? null : new Class125_Sub1(this.aClass22_Sub1_27, 34037, this.anInt6162, this.anInt6153, this.anInt6158);
			this.aBoolean400 = true;
			this.aBoolean402 = true;
			this.aBoolean401 = false;
		}
		if (this.aBoolean400) {
			if (this.aClass52_7 == null) {
				this.aClass22_Sub1_27.method959(this.aClass52_5);
				this.aClass52_5.method1512(0);
				this.aClass52_5.method1512(1);
				this.aClass52_5.method1512(8);
				this.aClass52_5.method1509(0, this.aClass125_Sub1Array4[0]);
				if (this.anInt6161 > 1) {
					this.aClass52_5.method1509(1, this.aClass125_Sub1Array4[1]);
				}
				if (this.aBoolean403) {
					this.aClass52_5.method1509(8, this.aClass125_Sub1_6);
				} else {
					this.aClass52_5.method1515(this.aClass3_Sub7_Sub4_2, 8);
				}
				this.aClass22_Sub1_27.method923(this.aClass52_5);
			} else {
				this.aClass22_Sub1_27.method959(this.aClass52_5);
				this.aClass52_5.method1512(0);
				this.aClass52_5.method1512(1);
				this.aClass52_5.method1512(8);
				this.aClass52_5.method1509(0, this.aClass125_Sub1Array4[0]);
				if (this.anInt6161 > 1) {
					this.aClass52_5.method1509(1, this.aClass125_Sub1Array4[1]);
				}
				if (this.aBoolean403) {
					this.aClass52_5.method1509(8, this.aClass125_Sub1_6);
				}
				this.aClass22_Sub1_27.method923(this.aClass52_5);
				this.aClass22_Sub1_27.method959(this.aClass52_7);
				this.aClass52_7.method1512(0);
				this.aClass52_7.method1512(8);
				this.aClass52_7.method1515(this.aClass3_Sub7_Sub4_1, 0);
				this.aClass52_7.method1515(this.aClass3_Sub7_Sub4_2, 8);
				this.aClass22_Sub1_27.method923(this.aClass52_7);
			}
			this.aBoolean402 = true;
			this.aBoolean400 = false;
		}
		if (this.aBoolean402) {
			this.aClass22_Sub1_27.method959(this.aClass52_6);
			this.aBoolean402 = !this.aClass52_6.method1510();
			this.aClass22_Sub1_27.method923(this.aClass52_6);
		}
		return !this.aBoolean402;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!cca;)V")
	public void method5356(@OriginalArg(1) Class3_Sub13 arg0) {
		arg0.aBoolean217 = false;
		arg0.method3128();
		arg0.method9596();
		this.method5353();
	}
}
