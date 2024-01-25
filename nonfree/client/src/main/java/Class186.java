import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ov")
public final class Class186 {

	@OriginalMember(owner = "client!ov", name = "m", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!ov", name = "y", descriptor = "Lclient!ve;")
	private Class1_Sub3_Sub18 aClass1_Sub3_Sub18_1;

	@OriginalMember(owner = "client!ov", name = "A", descriptor = "Lclient!ve;")
	private Class1_Sub3_Sub18 aClass1_Sub3_Sub18_2;

	@OriginalMember(owner = "client!ov", name = "B", descriptor = "Lclient!ah;")
	private Class5_Sub1 aClass5_Sub1_7;

	@OriginalMember(owner = "client!ov", name = "k", descriptor = "I")
	private int anInt4996 = 1;

	@OriginalMember(owner = "client!ov", name = "o", descriptor = "I")
	private int anInt4999 = 0;

	@OriginalMember(owner = "client!ov", name = "e", descriptor = "I")
	private int anInt4993 = 1;

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "I")
	private int anInt4990 = 0;

	@OriginalMember(owner = "client!ov", name = "g", descriptor = "Lclient!vp;")
	private final Class254 aClass254_39 = new Class254();

	@OriginalMember(owner = "client!ov", name = "v", descriptor = "Z")
	private boolean aBoolean397 = true;

	@OriginalMember(owner = "client!ov", name = "x", descriptor = "[Lclient!ah;")
	private Class5_Sub1[] aClass5_Sub1Array2 = new Class5_Sub1[2];

	@OriginalMember(owner = "client!ov", name = "z", descriptor = "Z")
	private boolean aBoolean398 = false;

	@OriginalMember(owner = "client!ov", name = "C", descriptor = "I")
	private int anInt5006 = 0;

	@OriginalMember(owner = "client!ov", name = "D", descriptor = "Z")
	private boolean aBoolean399 = true;

	@OriginalMember(owner = "client!ov", name = "E", descriptor = "Z")
	private boolean aBoolean400 = true;

	@OriginalMember(owner = "client!ov", name = "F", descriptor = "Z")
	private boolean aBoolean401 = true;

	@OriginalMember(owner = "client!ov", name = "w", descriptor = "I")
	private int anInt5005 = -1;

	@OriginalMember(owner = "client!ov", name = "j", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_31;

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "Lclient!fv;")
	private Class87 aClass87_5;

	@OriginalMember(owner = "client!ov", name = "r", descriptor = "Lclient!fv;")
	private Class87 aClass87_7;

	@OriginalMember(owner = "client!ov", name = "f", descriptor = "Lclient!fv;")
	private Class87 aClass87_6;

	static {
		new Class151("The channel you tried to join is currently full.", "Der von dir gewünschte Chatraum ist derzeit überfüllt.", "Le canal que vous essayez de rejoindre est plein.", "O canal que você tentou acessar está cheio no momento.");
	}

	@OriginalMember(owner = "client!ov", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class186(@OriginalArg(0) Class128_Sub2 arg0) {
		this.aClass128_Sub2_31 = arg0;
		if (this.aClass128_Sub2_31.aBoolean363 && this.aClass128_Sub2_31.aBoolean372) {
			this.aClass87_7 = this.aClass87_5 = new Class87(this.aClass128_Sub2_31);
			if (this.aClass128_Sub2_31.anInt4603 > 1 && this.aClass128_Sub2_31.aBoolean353 && this.aClass128_Sub2_31.aBoolean373) {
				this.aClass87_7 = this.aClass87_6 = new Class87(this.aClass128_Sub2_31);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(BLclient!bi;)Z")
	public boolean method3904(@OriginalArg(1) Class1_Sub4 arg0) {
		if (this.aClass87_7 != null) {
			if (arg0.method879() || arg0.method875()) {
				this.aClass254_39.method5430(arg0);
				this.method3909();
				if (this.method3905()) {
					if (this.anInt4993 != -1 && this.anInt4996 != -1) {
						arg0.method872(this.anInt4996, this.anInt4993);
					}
					arg0.aBoolean83 = true;
					return true;
				}
			}
			this.method3911(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(I)Z")
	private boolean method3905() {
		if (this.aBoolean399) {
			if (this.aClass1_Sub3_Sub18_1 != null) {
				this.aClass1_Sub3_Sub18_1.method5318();
				this.aClass1_Sub3_Sub18_1 = null;
			}
			if (this.aClass5_Sub1_7 != null) {
				this.aClass5_Sub1_7.method5538();
				this.aClass5_Sub1_7 = null;
			}
			if (this.aClass87_6 != null) {
				this.aClass1_Sub3_Sub18_1 = new Class1_Sub3_Sub18(this.aClass128_Sub2_31, 6402, this.anInt4993, this.anInt4996, this.aClass128_Sub2_31.anInt4603);
			}
			if (this.aBoolean398) {
				this.aClass5_Sub1_7 = new Class5_Sub1(this.aClass128_Sub2_31, 34037, 6402, this.anInt4993, this.anInt4996);
			} else if (this.aClass1_Sub3_Sub18_1 == null) {
				this.aClass1_Sub3_Sub18_1 = new Class1_Sub3_Sub18(this.aClass128_Sub2_31, 6402, this.anInt4993, this.anInt4996);
			}
			this.aBoolean400 = true;
			this.aBoolean397 = true;
			this.aBoolean399 = false;
		}
		if (this.aBoolean401) {
			if (this.aClass1_Sub3_Sub18_2 != null) {
				this.aClass1_Sub3_Sub18_2.method5318();
				this.aClass1_Sub3_Sub18_2 = null;
			}
			if (this.aClass5_Sub1Array2[0] != null) {
				this.aClass5_Sub1Array2[0].method5538();
				this.aClass5_Sub1Array2[0] = null;
			}
			if (this.aClass5_Sub1Array2[1] != null) {
				this.aClass5_Sub1Array2[1].method5538();
				this.aClass5_Sub1Array2[1] = null;
			}
			if (this.aClass87_6 != null) {
				this.aClass1_Sub3_Sub18_2 = new Class1_Sub3_Sub18(this.aClass128_Sub2_31, this.anInt5005, this.anInt4993, this.anInt4996, this.aClass128_Sub2_31.anInt4603);
			}
			this.aClass5_Sub1Array2[0] = new Class5_Sub1(this.aClass128_Sub2_31, 34037, this.anInt5005, this.anInt4993, this.anInt4996);
			this.aClass5_Sub1Array2[1] = this.anInt5006 > 1 ? new Class5_Sub1(this.aClass128_Sub2_31, 34037, this.anInt5005, this.anInt4993, this.anInt4996) : null;
			this.aBoolean400 = true;
			this.aBoolean401 = false;
			this.aBoolean397 = true;
		}
		if (this.aBoolean397) {
			if (this.aClass87_6 == null) {
				this.aClass128_Sub2_31.method3628(this.aClass87_5);
				this.aClass87_5.method1776(0);
				this.aClass87_5.method1776(1);
				this.aClass87_5.method1776(8);
				this.aClass87_5.method1774(this.aClass5_Sub1Array2[0], 0);
				if (this.anInt5006 > 1) {
					this.aClass87_5.method1774(this.aClass5_Sub1Array2[1], 1);
				}
				if (this.aBoolean398) {
					this.aClass87_5.method1774(this.aClass5_Sub1_7, 8);
				} else {
					this.aClass87_5.method1771(this.aClass1_Sub3_Sub18_1, 8);
				}
				this.aClass128_Sub2_31.method3624(this.aClass87_5);
			} else {
				this.aClass128_Sub2_31.method3628(this.aClass87_5);
				this.aClass87_5.method1776(0);
				this.aClass87_5.method1776(1);
				this.aClass87_5.method1776(8);
				this.aClass87_5.method1774(this.aClass5_Sub1Array2[0], 0);
				if (this.anInt5006 > 1) {
					this.aClass87_5.method1774(this.aClass5_Sub1Array2[1], 1);
				}
				if (this.aBoolean398) {
					this.aClass87_5.method1774(this.aClass5_Sub1_7, 8);
				}
				this.aClass128_Sub2_31.method3624(this.aClass87_5);
				this.aClass128_Sub2_31.method3628(this.aClass87_6);
				this.aClass87_6.method1776(0);
				this.aClass87_6.method1776(8);
				this.aClass87_6.method1771(this.aClass1_Sub3_Sub18_2, 0);
				this.aClass87_6.method1771(this.aClass1_Sub3_Sub18_1, 8);
				this.aClass128_Sub2_31.method3624(this.aClass87_6);
			}
			this.aBoolean397 = false;
			this.aBoolean400 = true;
		}
		if (this.aBoolean400) {
			this.aClass128_Sub2_31.method3628(this.aClass87_7);
			this.aBoolean400 = !this.aClass87_7.method1773();
			this.aClass128_Sub2_31.method3624(this.aClass87_7);
		}
		return !this.aBoolean400;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(B)V")
	public void method3906() {
		this.aClass5_Sub1Array2 = null;
		this.aClass87_7 = this.aClass87_6 = this.aClass87_5 = null;
		this.aClass1_Sub3_Sub18_1 = null;
		this.aClass5_Sub1_7 = null;
		this.aClass1_Sub3_Sub18_2 = null;
		if (!this.aClass254_39.method5444()) {
			for (@Pc(41) Class1 local41 = this.aClass254_39.method5437(); local41 != this.aClass254_39.aClass1_249; local41 = local41.aClass1_262) {
				((Class1_Sub4) local41).method871();
			}
		}
		this.anInt4993 = this.anInt4996 = 1;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(Z)Z")
	public boolean method3907() {
		return this.aClass87_7 != null;
	}

	@OriginalMember(owner = "client!ov", name = "a", descriptor = "(IIIII)Z")
	public boolean method3908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass87_7 == null || this.aClass254_39.method5444()) {
			return false;
		}
		if (arg3 != this.anInt4993 || arg1 != this.anInt4996) {
			this.anInt4996 = arg1;
			this.anInt4993 = arg3;
			for (@Pc(42) Class1 local42 = this.aClass254_39.method5437(); local42 != this.aClass254_39.aClass1_249; local42 = local42.aClass1_262) {
				((Class1_Sub4) local42).method872(this.anInt4996, this.anInt4993);
			}
			this.aBoolean401 = true;
			this.aBoolean399 = true;
			this.aBoolean397 = true;
		}
		if (!this.method3905()) {
			return false;
		}
		this.aBoolean396 = true;
		this.anInt4999 = arg0;
		this.anInt4990 = arg2;
		this.aClass128_Sub2_31.method3628(this.aClass87_7);
		this.aClass87_7.method1767(0);
		this.aClass128_Sub2_31.method3689(-this.anInt4990, this.anInt4996 - this.aClass87_7.method1768() - this.anInt4999);
		return true;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(B)V")
	private void method3909() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class1_Sub4 local17 = (Class1_Sub4) this.aClass254_39.method5437(); local17 != null; local17 = (Class1_Sub4) this.aClass254_39.method5433()) {
			local23 = local17.method874();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method876();
			local7 |= local17.method878();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt5005) {
			this.anInt5005 = local23;
			this.aBoolean401 = true;
		}
		@Pc(91) int local91 = this.anInt5006 > 2 ? 2 : this.anInt5006;
		@Pc(98) int local98 = local11 > 2 ? 2 : local11;
		if (local7 != this.aBoolean398) {
			this.aBoolean399 = true;
			this.aBoolean398 = local7;
		}
		if (local91 != local98) {
			this.aBoolean397 = this.aBoolean401 = true;
		}
		this.anInt5006 = local11;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(I)V")
	public void method3910() {
		if (!this.aBoolean396) {
			return;
		}
		if (this.aClass87_6 != null) {
			this.aClass128_Sub2_31.method3625(this.aClass87_6);
			@Pc(20) short local20 = 16384;
			this.aClass128_Sub2_31.method3660(this.aClass87_5);
			this.aClass87_6.method1772();
			this.aClass87_5.method1767(0);
			if (this.aBoolean398) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4993, this.anInt4996, 0, 0, this.anInt4993, this.anInt4996, local20, 9728);
			this.aClass128_Sub2_31.method3615(this.aClass87_6);
			this.aClass128_Sub2_31.method3671(this.aClass87_5);
		}
		this.aClass128_Sub2_31.method3672();
		this.aClass128_Sub2_31.method3653(0);
		this.aClass128_Sub2_31.method3677(1);
		this.aClass128_Sub2_31.va();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(111) Class1_Sub4 local111;
		for (@Pc(101) Class1_Sub4 local101 = (Class1_Sub4) this.aClass254_39.method5437(); local101 != null; local101 = local111) {
			local111 = (Class1_Sub4) this.aClass254_39.method5433();
			@Pc(117) int local117 = local101.method876();
			for (@Pc(119) int local119 = 0; local119 < local117; local119++) {
				local101.method877(this.aClass5_Sub1Array2[local93], local119, this.aClass5_Sub1_7);
				if (local111 == null && local117 - 1 == local119) {
					this.aClass128_Sub2_31.method3624(this.aClass87_5);
					this.aClass128_Sub2_31.method3689(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4996);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4990, this.anInt4999);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4990, this.anInt4996 + this.anInt4999);
					OpenGL.glTexCoord2f((float) this.anInt4993, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4990 + this.anInt4993, this.anInt4996 + this.anInt4999);
					OpenGL.glTexCoord2f((float) this.anInt4993, (float) this.anInt4996);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4990 + this.anInt4993, this.anInt4999);
					OpenGL.glEnd();
				} else {
					this.aClass87_5.method1767(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4996);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4996);
					OpenGL.glTexCoord2f((float) this.anInt4993, (float) this.anInt4996);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4993, this.anInt4996);
					OpenGL.glTexCoord2f((float) this.anInt4993, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4993, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local93 = local93 + 1 & 0x1;
				local101.method867(local119);
			}
		}
		this.aBoolean396 = false;
	}

	@OriginalMember(owner = "client!ov", name = "b", descriptor = "(BLclient!bi;)V")
	public void method3911(@OriginalArg(1) Class1_Sub4 arg0) {
		arg0.aBoolean83 = false;
		arg0.method871();
		arg0.method5617();
		this.method3909();
	}
}
