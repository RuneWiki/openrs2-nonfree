import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class34 {

	@OriginalMember(owner = "client!cg", name = "k", descriptor = "Z")
	private boolean aBoolean85;

	@OriginalMember(owner = "client!cg", name = "z", descriptor = "Lclient!wg;")
	private Class1_Sub3 aClass1_Sub3_4;

	@OriginalMember(owner = "client!cg", name = "B", descriptor = "Lclient!po;")
	private Class4_Sub1_Sub15 aClass4_Sub1_Sub15_1;

	@OriginalMember(owner = "client!cg", name = "F", descriptor = "Lclient!po;")
	private Class4_Sub1_Sub15 aClass4_Sub1_Sub15_2;

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
	private int anInt1352 = 0;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	private int anInt1350 = 0;

	@OriginalMember(owner = "client!cg", name = "s", descriptor = "I")
	private int anInt1361 = 1;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "I")
	private int anInt1364 = 1;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!vr;")
	private final Class258 aClass258_14 = new Class258();

	@OriginalMember(owner = "client!cg", name = "A", descriptor = "Z")
	private boolean aBoolean86 = true;

	@OriginalMember(owner = "client!cg", name = "C", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!cg", name = "J", descriptor = "Z")
	private boolean aBoolean89 = true;

	@OriginalMember(owner = "client!cg", name = "L", descriptor = "Z")
	private boolean aBoolean90 = true;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
	private int anInt1366 = 0;

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "[Lclient!wg;")
	private Class1_Sub3[] aClass1_Sub3Array1 = new Class1_Sub3[2];

	@OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
	private int anInt1368 = -1;

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_6;

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Lclient!ks;")
	private Class142 aClass142_4;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!ks;")
	private Class142 aClass142_3;

	@OriginalMember(owner = "client!cg", name = "j", descriptor = "Lclient!ks;")
	private Class142 aClass142_5;

	static {
		new Class242("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class34(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_6 = arg0;
		if (this.aClass30_Sub1_6.aBoolean69 && this.aClass30_Sub1_6.aBoolean68) {
			this.aClass142_3 = this.aClass142_4 = new Class142(this.aClass30_Sub1_6);
			if (this.aClass30_Sub1_6.anInt1234 > 1 && this.aClass30_Sub1_6.aBoolean59 && this.aClass30_Sub1_6.aBoolean72) {
				this.aClass142_3 = this.aClass142_5 = new Class142(this.aClass30_Sub1_6);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILclient!mp;)Z")
	public boolean method1027(@OriginalArg(1) Class4_Sub12 arg0) {
		if (this.aClass142_3 != null) {
			if (arg0.method1730() || arg0.method1735()) {
				this.aClass258_14.method5526(arg0);
				this.method1031();
				if (this.method1037()) {
					if (this.anInt1361 != -1 && this.anInt1364 != -1) {
						arg0.method1737(this.anInt1364, this.anInt1361);
					}
					arg0.aBoolean180 = true;
					return true;
				}
			}
			this.method1030(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
	public void method1028() {
		this.aClass1_Sub3Array1 = null;
		this.aClass1_Sub3_4 = null;
		this.aClass4_Sub1_Sub15_2 = null;
		this.aClass4_Sub1_Sub15_1 = null;
		this.aClass142_3 = this.aClass142_5 = this.aClass142_4 = null;
		if (!this.aClass258_14.method5533()) {
			for (@Pc(38) Class4 local38 = this.aClass258_14.method5538(); local38 != this.aClass258_14.aClass4_240; local38 = local38.aClass4_261) {
				((Class4_Sub12) local38).method1738();
			}
		}
		this.anInt1361 = this.anInt1364 = 1;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(ILclient!mp;)V")
	public void method1030(@OriginalArg(1) Class4_Sub12 arg0) {
		arg0.aBoolean180 = false;
		arg0.method1738();
		arg0.method5854();
		this.method1031();
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V")
	private void method1031() {
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = 0;
		@Pc(30) int local30;
		for (@Pc(24) Class4_Sub12 local24 = (Class4_Sub12) this.aClass258_14.method5538(); local24 != null; local24 = (Class4_Sub12) this.aClass258_14.method5528()) {
			local30 = local24.method1729();
			local18 += local24.method1740();
			if (local16 < local30) {
				local16 = local30;
			}
			local14 |= local24.method1733();
		}
		if (local16 == 2) {
			local30 = 34836;
		} else if (local16 == 1) {
			local30 = 34842;
		} else {
			local30 = 6408;
		}
		if (local30 != this.anInt1368) {
			this.aBoolean88 = true;
			this.anInt1368 = local30;
		}
		@Pc(102) int local102 = this.anInt1366 <= 2 ? this.anInt1366 : 2;
		@Pc(109) int local109 = local18 > 2 ? 2 : local18;
		if (local102 != local109) {
			this.aBoolean89 = this.aBoolean88 = true;
		}
		if (local14 != this.aBoolean87) {
			this.aBoolean87 = local14;
			this.aBoolean86 = true;
		}
		this.anInt1366 = local18;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIBII)Z")
	public boolean method1035(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass142_3 == null || this.aClass258_14.method5533()) {
			return false;
		}
		if (arg1 != this.anInt1361 || this.anInt1364 != arg3) {
			this.anInt1361 = arg1;
			this.anInt1364 = arg3;
			for (@Pc(41) Class4 local41 = this.aClass258_14.method5538(); local41 != this.aClass258_14.aClass4_240; local41 = local41.aClass4_261) {
				((Class4_Sub12) local41).method1737(this.anInt1364, this.anInt1361);
			}
			this.aBoolean89 = true;
			this.aBoolean88 = true;
			this.aBoolean86 = true;
		}
		if (!this.method1037()) {
			return false;
		}
		this.anInt1350 = arg2;
		this.anInt1352 = arg0;
		this.aBoolean85 = true;
		this.aClass30_Sub1_6.method972(this.aClass142_3);
		this.aClass142_3.method3096(0);
		this.aClass30_Sub1_6.method966(-this.anInt1350, this.anInt1364 - this.aClass142_3.method3085() - this.anInt1352);
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z")
	public boolean method1036() {
		return this.aClass142_3 != null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)Z")
	private boolean method1037() {
		if (this.aBoolean86) {
			if (this.aClass4_Sub1_Sub15_2 != null) {
				this.aClass4_Sub1_Sub15_2.method4258();
				this.aClass4_Sub1_Sub15_2 = null;
			}
			if (this.aClass1_Sub3_4 != null) {
				this.aClass1_Sub3_4.method4271();
				this.aClass1_Sub3_4 = null;
			}
			if (this.aClass142_5 != null) {
				this.aClass4_Sub1_Sub15_2 = new Class4_Sub1_Sub15(this.aClass30_Sub1_6, 6402, this.anInt1361, this.anInt1364, this.aClass30_Sub1_6.anInt1234);
			}
			if (this.aBoolean87) {
				this.aClass1_Sub3_4 = new Class1_Sub3(this.aClass30_Sub1_6, 34037, 6402, this.anInt1361, this.anInt1364);
			} else if (this.aClass4_Sub1_Sub15_2 == null) {
				this.aClass4_Sub1_Sub15_2 = new Class4_Sub1_Sub15(this.aClass30_Sub1_6, 6402, this.anInt1361, this.anInt1364);
			}
			this.aBoolean89 = true;
			this.aBoolean90 = true;
			this.aBoolean86 = false;
		}
		if (this.aBoolean88) {
			if (this.aClass4_Sub1_Sub15_1 != null) {
				this.aClass4_Sub1_Sub15_1.method4258();
				this.aClass4_Sub1_Sub15_1 = null;
			}
			if (this.aClass1_Sub3Array1[0] != null) {
				this.aClass1_Sub3Array1[0].method4271();
				this.aClass1_Sub3Array1[0] = null;
			}
			if (this.aClass1_Sub3Array1[1] != null) {
				this.aClass1_Sub3Array1[1].method4271();
				this.aClass1_Sub3Array1[1] = null;
			}
			if (this.aClass142_5 != null) {
				this.aClass4_Sub1_Sub15_1 = new Class4_Sub1_Sub15(this.aClass30_Sub1_6, this.anInt1368, this.anInt1361, this.anInt1364, this.aClass30_Sub1_6.anInt1234);
			}
			this.aClass1_Sub3Array1[0] = new Class1_Sub3(this.aClass30_Sub1_6, 34037, this.anInt1368, this.anInt1361, this.anInt1364);
			this.aClass1_Sub3Array1[1] = this.anInt1366 <= 1 ? null : new Class1_Sub3(this.aClass30_Sub1_6, 34037, this.anInt1368, this.anInt1361, this.anInt1364);
			this.aBoolean88 = false;
			this.aBoolean89 = true;
			this.aBoolean90 = true;
		}
		if (this.aBoolean89) {
			if (this.aClass142_5 == null) {
				this.aClass30_Sub1_6.method972(this.aClass142_4);
				this.aClass142_4.method3097(0);
				this.aClass142_4.method3097(1);
				this.aClass142_4.method3097(8);
				this.aClass142_4.method3088(0, this.aClass1_Sub3Array1[0]);
				if (this.anInt1366 > 1) {
					this.aClass142_4.method3088(1, this.aClass1_Sub3Array1[1]);
				}
				if (this.aBoolean87) {
					this.aClass142_4.method3088(8, this.aClass1_Sub3_4);
				} else {
					this.aClass142_4.method3087(this.aClass4_Sub1_Sub15_2, 8);
				}
				this.aClass30_Sub1_6.method908(this.aClass142_4);
			} else {
				this.aClass30_Sub1_6.method972(this.aClass142_4);
				this.aClass142_4.method3097(0);
				this.aClass142_4.method3097(1);
				this.aClass142_4.method3097(8);
				this.aClass142_4.method3088(0, this.aClass1_Sub3Array1[0]);
				if (this.anInt1366 > 1) {
					this.aClass142_4.method3088(1, this.aClass1_Sub3Array1[1]);
				}
				if (this.aBoolean87) {
					this.aClass142_4.method3088(8, this.aClass1_Sub3_4);
				}
				this.aClass30_Sub1_6.method908(this.aClass142_4);
				this.aClass30_Sub1_6.method972(this.aClass142_5);
				this.aClass142_5.method3097(0);
				this.aClass142_5.method3097(8);
				this.aClass142_5.method3087(this.aClass4_Sub1_Sub15_1, 0);
				this.aClass142_5.method3087(this.aClass4_Sub1_Sub15_2, 8);
				this.aClass30_Sub1_6.method908(this.aClass142_5);
			}
			this.aBoolean89 = false;
			this.aBoolean90 = true;
		}
		if (this.aBoolean90) {
			this.aClass30_Sub1_6.method972(this.aClass142_3);
			this.aBoolean90 = !this.aClass142_3.method3094();
			this.aClass30_Sub1_6.method908(this.aClass142_3);
		}
		return !this.aBoolean90;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
	public void method1038() {
		if (!this.aBoolean85) {
			return;
		}
		if (this.aClass142_5 != null) {
			this.aClass30_Sub1_6.method900(this.aClass142_5);
			@Pc(20) short local20 = 16384;
			this.aClass30_Sub1_6.method901(this.aClass142_4);
			this.aClass142_5.method3086();
			this.aClass142_4.method3096(0);
			if (this.aBoolean87) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt1361, this.anInt1364, 0, 0, this.anInt1361, this.anInt1364, local20, 9728);
			this.aClass30_Sub1_6.method951(this.aClass142_5);
			this.aClass30_Sub1_6.method906(this.aClass142_4);
		}
		this.aClass30_Sub1_6.method962();
		this.aClass30_Sub1_6.method931(0);
		this.aClass30_Sub1_6.method923(1);
		this.aClass30_Sub1_6.va();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class4_Sub12 local105;
		for (@Pc(97) Class4_Sub12 local97 = (Class4_Sub12) this.aClass258_14.method5538(); local97 != null; local97 = local105) {
			local105 = (Class4_Sub12) this.aClass258_14.method5528();
			@Pc(109) int local109 = local97.method1740();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method1734(this.aClass1_Sub3Array1[local89], this.aClass1_Sub3_4, local111);
				if (local105 == null && local109 - 1 == local111) {
					this.aClass30_Sub1_6.method908(this.aClass142_4);
					this.aClass30_Sub1_6.method966(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1364);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1350, this.anInt1352);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1350, this.anInt1352 + this.anInt1364);
					OpenGL.glTexCoord2f((float) this.anInt1361, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1350 + this.anInt1361, this.anInt1364 + this.anInt1352);
					OpenGL.glTexCoord2f((float) this.anInt1361, (float) this.anInt1364);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1361 + this.anInt1350, this.anInt1352);
					OpenGL.glEnd();
				} else {
					this.aClass142_4.method3096(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt1364);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt1364);
					OpenGL.glTexCoord2f((float) this.anInt1361, (float) this.anInt1364);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt1361, this.anInt1364);
					OpenGL.glTexCoord2f((float) this.anInt1361, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt1361, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local89 = local89 + 1 & 0x1;
				local97.method1732(local111);
			}
		}
		this.aBoolean85 = false;
	}
}
