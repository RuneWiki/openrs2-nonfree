import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class196 {

	@OriginalMember(owner = "client!kba", name = "s", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!kba", name = "y", descriptor = "Lclient!bq;")
	private Class10_Sub2 aClass10_Sub2_2;

	@OriginalMember(owner = "client!kba", name = "H", descriptor = "Lclient!mt;")
	private Class2_Sub7_Sub10 aClass2_Sub7_Sub10_1;

	@OriginalMember(owner = "client!kba", name = "I", descriptor = "Lclient!mt;")
	private Class2_Sub7_Sub10 aClass2_Sub7_Sub10_2;

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
	private int anInt5166 = 1;

	@OriginalMember(owner = "client!kba", name = "p", descriptor = "I")
	private int anInt5175 = 0;

	@OriginalMember(owner = "client!kba", name = "t", descriptor = "I")
	private int anInt5177 = 1;

	@OriginalMember(owner = "client!kba", name = "m", descriptor = "I")
	private int anInt5173 = 0;

	@OriginalMember(owner = "client!kba", name = "q", descriptor = "Lclient!fh;")
	private final Class114 aClass114_26 = new Class114();

	@OriginalMember(owner = "client!kba", name = "B", descriptor = "I")
	private int anInt5181 = 0;

	@OriginalMember(owner = "client!kba", name = "D", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!kba", name = "F", descriptor = "[Lclient!bq;")
	private Class10_Sub2[] aClass10_Sub2Array1 = new Class10_Sub2[2];

	@OriginalMember(owner = "client!kba", name = "z", descriptor = "Z")
	private boolean aBoolean385 = true;

	@OriginalMember(owner = "client!kba", name = "x", descriptor = "Z")
	private boolean aBoolean384 = true;

	@OriginalMember(owner = "client!kba", name = "E", descriptor = "Z")
	private boolean aBoolean387 = true;

	@OriginalMember(owner = "client!kba", name = "A", descriptor = "I")
	private int anInt5180 = -1;

	@OriginalMember(owner = "client!kba", name = "w", descriptor = "Z")
	private boolean aBoolean383 = true;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_22;

	@OriginalMember(owner = "client!kba", name = "l", descriptor = "Lclient!mj;")
	private Class227 aClass227_4;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "Lclient!mj;")
	private Class227 aClass227_3;

	@OriginalMember(owner = "client!kba", name = "n", descriptor = "Lclient!mj;")
	private Class227 aClass227_5;

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class196(@OriginalArg(0) Class13_Sub2 arg0) {
		this.aClass13_Sub2_22 = arg0;
		if (this.aClass13_Sub2_22.aBoolean91 && this.aClass13_Sub2_22.aBoolean95) {
			this.aClass227_3 = this.aClass227_4 = new Class227(this.aClass13_Sub2_22);
			if (this.aClass13_Sub2_22.anInt1072 > 1 && this.aClass13_Sub2_22.aBoolean104 && this.aClass13_Sub2_22.aBoolean103) {
				this.aClass227_3 = this.aClass227_5 = new Class227(this.aClass13_Sub2_22);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)V")
	public void method4524() {
		this.aClass10_Sub2_2 = null;
		this.aClass2_Sub7_Sub10_1 = null;
		this.aClass227_3 = this.aClass227_5 = this.aClass227_4 = null;
		this.aClass10_Sub2Array1 = null;
		this.aClass2_Sub7_Sub10_2 = null;
		if (!this.aClass114_26.method2767()) {
			for (@Pc(36) Class2 local36 = this.aClass114_26.method2772(); local36 != this.aClass114_26.aClass2_90; local36 = local36.aClass2_300) {
				((Class2_Sub37) local36).method6467();
			}
		}
		this.anInt5177 = this.anInt5166 = 1;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(ILclient!rga;)Z")
	public boolean method4525(@OriginalArg(1) Class2_Sub37 arg0) {
		if (this.aClass227_3 != null) {
			if (arg0.method6462() || arg0.method6461()) {
				this.aClass114_26.method2771(arg0);
				this.method4528();
				if (this.method4533()) {
					if (this.anInt5177 != -1 && this.anInt5166 != -1) {
						arg0.method6464(this.anInt5166, this.anInt5177);
					}
					arg0.aBoolean528 = true;
					return true;
				}
			}
			this.method4532(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(IIBII)Z")
	public boolean method4527(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass227_3 == null || this.aClass114_26.method2767()) {
			return false;
		}
		if (arg0 != this.anInt5177 || arg2 != this.anInt5166) {
			this.anInt5177 = arg0;
			this.anInt5166 = arg2;
			for (@Pc(38) Class2 local38 = this.aClass114_26.method2772(); local38 != this.aClass114_26.aClass2_90; local38 = local38.aClass2_300) {
				((Class2_Sub37) local38).method6464(this.anInt5166, this.anInt5177);
			}
			this.aBoolean383 = true;
			this.aBoolean385 = true;
			this.aBoolean384 = true;
		}
		if (!this.method4533()) {
			return false;
		}
		this.anInt5173 = arg1;
		this.anInt5175 = arg3;
		this.aBoolean382 = true;
		this.aClass13_Sub2_22.method1061(this.aClass227_3);
		this.aClass227_3.method5343(0);
		this.aClass13_Sub2_22.method1084(this.anInt5175 + this.anInt5166 - this.aClass13_Sub2_22.anInt980, -this.anInt5173);
		return true;
	}

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "(I)V")
	private void method4528() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub37 local17 = (Class2_Sub37) this.aClass114_26.method2772(); local17 != null; local17 = (Class2_Sub37) this.aClass114_26.method2762()) {
			local23 = local17.method6468();
			local11 += local17.method6459();
			if (local23 > local9) {
				local9 = local23;
			}
			local7 |= local17.method6465();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt5180) {
			this.aBoolean385 = true;
			this.anInt5180 = local23;
		}
		@Pc(85) int local85 = this.anInt5181 > 2 ? 2 : this.anInt5181;
		@Pc(100) int local100 = local11 > 2 ? 2 : local11;
		this.anInt5181 = local11;
		if (this.aBoolean386 != local7) {
			this.aBoolean386 = local7;
			this.aBoolean383 = true;
		}
		if (local85 != local100) {
			this.aBoolean384 = this.aBoolean385 = true;
		}
	}

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "(I)V")
	public void method4529() {
		if (!this.aBoolean382) {
			return;
		}
		if (this.aClass227_5 != null) {
			this.aClass13_Sub2_22.method1074(this.aClass227_5);
			@Pc(20) short local20 = 16384;
			this.aClass13_Sub2_22.method1095(this.aClass227_4);
			this.aClass227_5.method5340();
			this.aClass227_4.method5343(0);
			if (this.aBoolean386) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5177, this.anInt5166, 0, 0, this.anInt5177, this.anInt5166, local20, 9728);
			this.aClass13_Sub2_22.method1082(this.aClass227_5);
			this.aClass13_Sub2_22.method1079(this.aClass227_4);
		}
		this.aClass13_Sub2_22.method1050();
		this.aClass13_Sub2_22.method1090(0);
		this.aClass13_Sub2_22.method1046(1);
		this.aClass13_Sub2_22.la();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(107) Class2_Sub37 local107;
		for (@Pc(99) Class2_Sub37 local99 = (Class2_Sub37) this.aClass114_26.method2772(); local99 != null; local99 = local107) {
			local107 = (Class2_Sub37) this.aClass114_26.method2762();
			@Pc(111) int local111 = local99.method6459();
			for (@Pc(113) int local113 = 0; local113 < local111; local113++) {
				local99.method6463(this.aClass10_Sub2_2, local113, this.aClass10_Sub2Array1[local91]);
				if (local107 == null && local113 == local111 - 1) {
					this.aClass13_Sub2_22.method1097(this.aClass227_4);
					this.aClass13_Sub2_22.method1084(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5166);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5173, this.anInt5175);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5173, this.anInt5175 + this.anInt5166);
					OpenGL.glTexCoord2f((float) this.anInt5177, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5173 + this.anInt5177, this.anInt5175 - -this.anInt5166);
					OpenGL.glTexCoord2f((float) this.anInt5177, (float) this.anInt5166);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5177 + this.anInt5173, this.anInt5175);
					OpenGL.glEnd();
				} else {
					this.aClass227_4.method5343(local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5166);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt5166);
					OpenGL.glTexCoord2f((float) this.anInt5177, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5177, this.anInt5166);
					OpenGL.glTexCoord2f((float) this.anInt5177, (float) this.anInt5166);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5177, 0);
					OpenGL.glEnd();
				}
				local93 = local93 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
				local99.method6469(local113);
			}
		}
		this.aBoolean382 = false;
	}

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "(I)Z")
	public boolean method4531() {
		return this.aClass227_3 != null;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!rga;I)V")
	public void method4532(@OriginalArg(0) Class2_Sub37 arg0) {
		arg0.aBoolean528 = false;
		arg0.method6467();
		arg0.method8920();
		this.method4528();
	}

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "(I)Z")
	private boolean method4533() {
		if (this.aBoolean383) {
			if (this.aClass2_Sub7_Sub10_2 != null) {
				this.aClass2_Sub7_Sub10_2.method5463();
				this.aClass2_Sub7_Sub10_2 = null;
			}
			if (this.aClass10_Sub2_2 != null) {
				this.aClass10_Sub2_2.method7257();
				this.aClass10_Sub2_2 = null;
			}
			if (this.aClass227_5 != null) {
				this.aClass2_Sub7_Sub10_2 = new Class2_Sub7_Sub10(this.aClass13_Sub2_22, 6402, this.anInt5177, this.anInt5166, this.aClass13_Sub2_22.anInt1072);
			}
			if (this.aBoolean386) {
				this.aClass10_Sub2_2 = new Class10_Sub2(this.aClass13_Sub2_22, 34037, 6402, this.anInt5177, this.anInt5166);
			} else if (this.aClass2_Sub7_Sub10_2 == null) {
				this.aClass2_Sub7_Sub10_2 = new Class2_Sub7_Sub10(this.aClass13_Sub2_22, 6402, this.anInt5177, this.anInt5166);
			}
			this.aBoolean383 = false;
			this.aBoolean387 = true;
			this.aBoolean384 = true;
		}
		if (this.aBoolean385) {
			if (this.aClass2_Sub7_Sub10_1 != null) {
				this.aClass2_Sub7_Sub10_1.method5463();
				this.aClass2_Sub7_Sub10_1 = null;
			}
			if (this.aClass10_Sub2Array1[0] != null) {
				this.aClass10_Sub2Array1[0].method7257();
				this.aClass10_Sub2Array1[0] = null;
			}
			if (this.aClass10_Sub2Array1[1] != null) {
				this.aClass10_Sub2Array1[1].method7257();
				this.aClass10_Sub2Array1[1] = null;
			}
			if (this.aClass227_5 != null) {
				this.aClass2_Sub7_Sub10_1 = new Class2_Sub7_Sub10(this.aClass13_Sub2_22, this.anInt5180, this.anInt5177, this.anInt5166, this.aClass13_Sub2_22.anInt1072);
			}
			this.aClass10_Sub2Array1[0] = new Class10_Sub2(this.aClass13_Sub2_22, 34037, this.anInt5180, this.anInt5177, this.anInt5166);
			this.aClass10_Sub2Array1[1] = this.anInt5181 <= 1 ? null : new Class10_Sub2(this.aClass13_Sub2_22, 34037, this.anInt5180, this.anInt5177, this.anInt5166);
			this.aBoolean387 = true;
			this.aBoolean384 = true;
			this.aBoolean385 = false;
		}
		if (this.aBoolean384) {
			if (this.aClass227_5 == null) {
				this.aClass13_Sub2_22.method1061(this.aClass227_4);
				this.aClass227_4.method5342(0);
				this.aClass227_4.method5342(1);
				this.aClass227_4.method5342(8);
				this.aClass227_4.method5349(0, this.aClass10_Sub2Array1[0]);
				if (this.anInt5181 > 1) {
					this.aClass227_4.method5349(1, this.aClass10_Sub2Array1[1]);
				}
				if (this.aBoolean386) {
					this.aClass227_4.method5349(8, this.aClass10_Sub2_2);
				} else {
					this.aClass227_4.method5345(8, this.aClass2_Sub7_Sub10_2);
				}
				this.aClass13_Sub2_22.method1097(this.aClass227_4);
			} else {
				this.aClass13_Sub2_22.method1061(this.aClass227_4);
				this.aClass227_4.method5342(0);
				this.aClass227_4.method5342(1);
				this.aClass227_4.method5342(8);
				this.aClass227_4.method5349(0, this.aClass10_Sub2Array1[0]);
				if (this.anInt5181 > 1) {
					this.aClass227_4.method5349(1, this.aClass10_Sub2Array1[1]);
				}
				if (this.aBoolean386) {
					this.aClass227_4.method5349(8, this.aClass10_Sub2_2);
				}
				this.aClass13_Sub2_22.method1097(this.aClass227_4);
				this.aClass13_Sub2_22.method1061(this.aClass227_5);
				this.aClass227_5.method5342(0);
				this.aClass227_5.method5342(8);
				this.aClass227_5.method5345(0, this.aClass2_Sub7_Sub10_1);
				this.aClass227_5.method5345(8, this.aClass2_Sub7_Sub10_2);
				this.aClass13_Sub2_22.method1097(this.aClass227_5);
			}
			this.aBoolean387 = true;
			this.aBoolean384 = false;
		}
		if (this.aBoolean387) {
			this.aClass13_Sub2_22.method1061(this.aClass227_3);
			this.aBoolean387 = !this.aClass227_3.method5351();
			this.aClass13_Sub2_22.method1097(this.aClass227_3);
		}
		return !this.aBoolean387;
	}
}
