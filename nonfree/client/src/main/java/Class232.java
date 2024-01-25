import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class232 {

	@OriginalMember(owner = "client!ph", name = "i", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!ph", name = "x", descriptor = "Lclient!cm;")
	private Class5_Sub2_Sub6 aClass5_Sub2_Sub6_1;

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "Lclient!hp;")
	private Class4_Sub2 aClass4_Sub2_3;

	@OriginalMember(owner = "client!ph", name = "C", descriptor = "Lclient!cm;")
	private Class5_Sub2_Sub6 aClass5_Sub2_Sub6_2;

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
	private int anInt6950 = 1;

	@OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
	private int anInt6954 = 0;

	@OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
	private int anInt6957 = 1;

	@OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
	private int anInt6961 = 0;

	@OriginalMember(owner = "client!ph", name = "p", descriptor = "Lclient!fea;")
	private final Class99 aClass99_58 = new Class99();

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
	private int anInt6964 = -1;

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "Z")
	private boolean aBoolean485 = false;

	@OriginalMember(owner = "client!ph", name = "D", descriptor = "Z")
	private boolean aBoolean487 = true;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "Z")
	private boolean aBoolean486 = true;

	@OriginalMember(owner = "client!ph", name = "F", descriptor = "[Lclient!hp;")
	private Class4_Sub2[] aClass4_Sub2Array3 = new Class4_Sub2[2];

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "Z")
	private boolean aBoolean489 = true;

	@OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
	private int anInt6965 = 0;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "Z")
	private boolean aBoolean488 = true;

	@OriginalMember(owner = "client!ph", name = "h", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_29;

	@OriginalMember(owner = "client!ph", name = "t", descriptor = "Lclient!fs;")
	private Class103 aClass103_4;

	@OriginalMember(owner = "client!ph", name = "c", descriptor = "Lclient!fs;")
	private Class103 aClass103_2;

	@OriginalMember(owner = "client!ph", name = "j", descriptor = "Lclient!fs;")
	private Class103 aClass103_3;

	@OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lclient!jj;)V")
	public Class232(@OriginalArg(0) Class62_Sub3 arg0) {
		this.aClass62_Sub3_29 = arg0;
		if (this.aClass62_Sub3_29.aBoolean282 && this.aClass62_Sub3_29.aBoolean271) {
			this.aClass103_2 = this.aClass103_4 = new Class103(this.aClass62_Sub3_29);
			if (this.aClass62_Sub3_29.anInt4615 > 1 && this.aClass62_Sub3_29.aBoolean297 && this.aClass62_Sub3_29.aBoolean285) {
				this.aClass103_2 = this.aClass103_3 = new Class103(this.aClass62_Sub3_29);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V")
	public void method5652() {
		this.aClass103_2 = this.aClass103_3 = this.aClass103_4 = null;
		this.aClass4_Sub2_3 = null;
		this.aClass4_Sub2Array3 = null;
		this.aClass5_Sub2_Sub6_1 = null;
		this.aClass5_Sub2_Sub6_2 = null;
		if (!this.aClass99_58.method2523()) {
			for (@Pc(42) Class5 local42 = this.aClass99_58.method2526(); local42 != this.aClass99_58.aClass5_102; local42 = local42.aClass5_284) {
				((Class5_Sub8) local42).method6711();
			}
		}
		this.anInt6950 = this.anInt6957 = 1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!cg;)Z")
	public boolean method5653(@OriginalArg(1) Class5_Sub8 arg0) {
		if (this.aClass103_2 != null) {
			if (arg0.method6712() || arg0.method6716()) {
				this.aClass99_58.method2513(arg0);
				this.method5658();
				if (this.method5661()) {
					if (this.anInt6950 != -1 && this.anInt6957 != -1) {
						arg0.method6710(this.anInt6957, this.anInt6950);
					}
					arg0.aBoolean601 = true;
					return true;
				}
			}
			this.method5654(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!cg;Z)V")
	public void method5654(@OriginalArg(0) Class5_Sub8 arg0) {
		arg0.aBoolean601 = false;
		arg0.method6711();
		arg0.method7425();
		this.method5658();
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
	public void method5655() {
		if (!this.aBoolean484) {
			return;
		}
		if (this.aClass103_3 != null) {
			this.aClass62_Sub3_29.method4012(this.aClass103_3);
			@Pc(20) short local20 = 16384;
			this.aClass62_Sub3_29.method4010(this.aClass103_4);
			this.aClass103_3.method2740();
			this.aClass103_4.method2737(0);
			if (this.aBoolean485) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6950, this.anInt6957, 0, 0, this.anInt6950, this.anInt6957, local20, 9728);
			this.aClass62_Sub3_29.method3945(this.aClass103_3);
			this.aClass62_Sub3_29.method3959(this.aClass103_4);
		}
		this.aClass62_Sub3_29.method3978();
		this.aClass62_Sub3_29.method3979(0);
		this.aClass62_Sub3_29.method3999(1);
		this.aClass62_Sub3_29.n();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class5_Sub8 local109;
		for (@Pc(101) Class5_Sub8 local101 = (Class5_Sub8) this.aClass99_58.method2526(); local101 != null; local101 = local109) {
			local109 = (Class5_Sub8) this.aClass99_58.method2519();
			@Pc(113) int local113 = local101.method6717();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method6708(local115, this.aClass4_Sub2_3, this.aClass4_Sub2Array3[local93]);
				if (local109 == null && local115 == local113 - 1) {
					this.aClass62_Sub3_29.method3962(this.aClass103_4);
					this.aClass62_Sub3_29.method3985(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6957);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6954, this.anInt6961);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6954, this.anInt6957 + this.anInt6961);
					OpenGL.glTexCoord2f((float) this.anInt6950, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6950 + this.anInt6954, this.anInt6957 + this.anInt6961);
					OpenGL.glTexCoord2f((float) this.anInt6950, (float) this.anInt6957);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6950 + this.anInt6954, this.anInt6961);
					OpenGL.glEnd();
				} else {
					this.aClass103_4.method2737(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6957);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6957);
					OpenGL.glTexCoord2f((float) this.anInt6950, (float) this.anInt6957);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6950, this.anInt6957);
					OpenGL.glTexCoord2f((float) this.anInt6950, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6950, 0);
					OpenGL.glEnd();
				}
				local101.method6706(local115);
				local93 = local93 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean484 = false;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(B)Z")
	public boolean method5657() {
		return this.aClass103_2 != null;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V")
	private void method5658() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class5_Sub8 local17 = (Class5_Sub8) this.aClass99_58.method2526(); local17 != null; local17 = (Class5_Sub8) this.aClass99_58.method2519()) {
			local23 = local17.method6715();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method6717();
			local7 |= local17.method6713();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (local23 != this.anInt6964) {
			this.anInt6964 = local23;
			this.aBoolean486 = true;
		}
		@Pc(89) int local89 = this.anInt6965 <= 2 ? this.anInt6965 : 2;
		@Pc(96) int local96 = local11 > 2 ? 2 : local11;
		this.anInt6965 = local11;
		if (local7 != this.aBoolean485) {
			this.aBoolean485 = local7;
			this.aBoolean488 = true;
		}
		if (local96 != local89) {
			this.aBoolean487 = this.aBoolean486 = true;
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIII)Z")
	public boolean method5660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass103_2 == null || this.aClass99_58.method2523()) {
			return false;
		}
		if (arg3 != this.anInt6950 || this.anInt6957 != arg2) {
			this.anInt6950 = arg3;
			this.anInt6957 = arg2;
			for (@Pc(46) Class5 local46 = this.aClass99_58.method2526(); local46 != this.aClass99_58.aClass5_102; local46 = local46.aClass5_284) {
				((Class5_Sub8) local46).method6710(this.anInt6957, this.anInt6950);
			}
			this.aBoolean487 = true;
			this.aBoolean486 = true;
			this.aBoolean488 = true;
		}
		if (!this.method5661()) {
			return false;
		}
		this.anInt6961 = arg1;
		this.aBoolean484 = true;
		this.anInt6954 = arg0;
		this.aClass62_Sub3_29.method3948(this.aClass103_2);
		this.aClass103_2.method2737(0);
		this.aClass62_Sub3_29.method3985(-this.anInt6954, this.anInt6957 - this.aClass103_2.method2750() - this.anInt6961);
		return true;
	}

	@OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)Z")
	private boolean method5661() {
		if (this.aBoolean488) {
			if (this.aClass5_Sub2_Sub6_2 != null) {
				this.aClass5_Sub2_Sub6_2.method1312();
				this.aClass5_Sub2_Sub6_2 = null;
			}
			if (this.aClass4_Sub2_3 != null) {
				this.aClass4_Sub2_3.method5494();
				this.aClass4_Sub2_3 = null;
			}
			if (this.aClass103_3 != null) {
				this.aClass5_Sub2_Sub6_2 = new Class5_Sub2_Sub6(this.aClass62_Sub3_29, 6402, this.anInt6950, this.anInt6957, this.aClass62_Sub3_29.anInt4615);
			}
			if (this.aBoolean485) {
				this.aClass4_Sub2_3 = new Class4_Sub2(this.aClass62_Sub3_29, 34037, 6402, this.anInt6950, this.anInt6957);
			} else if (this.aClass5_Sub2_Sub6_2 == null) {
				this.aClass5_Sub2_Sub6_2 = new Class5_Sub2_Sub6(this.aClass62_Sub3_29, 6402, this.anInt6950, this.anInt6957);
			}
			this.aBoolean488 = false;
			this.aBoolean487 = true;
			this.aBoolean489 = true;
		}
		if (this.aBoolean486) {
			if (this.aClass5_Sub2_Sub6_1 != null) {
				this.aClass5_Sub2_Sub6_1.method1312();
				this.aClass5_Sub2_Sub6_1 = null;
			}
			if (this.aClass4_Sub2Array3[0] != null) {
				this.aClass4_Sub2Array3[0].method5494();
				this.aClass4_Sub2Array3[0] = null;
			}
			if (this.aClass4_Sub2Array3[1] != null) {
				this.aClass4_Sub2Array3[1].method5494();
				this.aClass4_Sub2Array3[1] = null;
			}
			if (this.aClass103_3 != null) {
				this.aClass5_Sub2_Sub6_1 = new Class5_Sub2_Sub6(this.aClass62_Sub3_29, this.anInt6964, this.anInt6950, this.anInt6957, this.aClass62_Sub3_29.anInt4615);
			}
			this.aClass4_Sub2Array3[0] = new Class4_Sub2(this.aClass62_Sub3_29, 34037, this.anInt6964, this.anInt6950, this.anInt6957);
			this.aClass4_Sub2Array3[1] = this.anInt6965 <= 1 ? null : new Class4_Sub2(this.aClass62_Sub3_29, 34037, this.anInt6964, this.anInt6950, this.anInt6957);
			this.aBoolean487 = true;
			this.aBoolean489 = true;
			this.aBoolean486 = false;
		}
		if (this.aBoolean487) {
			if (this.aClass103_3 == null) {
				this.aClass62_Sub3_29.method3948(this.aClass103_4);
				this.aClass103_4.method2746(0);
				this.aClass103_4.method2746(1);
				this.aClass103_4.method2746(8);
				this.aClass103_4.method2743(this.aClass4_Sub2Array3[0], 0);
				if (this.anInt6965 > 1) {
					this.aClass103_4.method2743(this.aClass4_Sub2Array3[1], 1);
				}
				if (this.aBoolean485) {
					this.aClass103_4.method2743(this.aClass4_Sub2_3, 8);
				} else {
					this.aClass103_4.method2744(8, this.aClass5_Sub2_Sub6_2);
				}
				this.aClass62_Sub3_29.method3962(this.aClass103_4);
			} else {
				this.aClass62_Sub3_29.method3948(this.aClass103_4);
				this.aClass103_4.method2746(0);
				this.aClass103_4.method2746(1);
				this.aClass103_4.method2746(8);
				this.aClass103_4.method2743(this.aClass4_Sub2Array3[0], 0);
				if (this.anInt6965 > 1) {
					this.aClass103_4.method2743(this.aClass4_Sub2Array3[1], 1);
				}
				if (this.aBoolean485) {
					this.aClass103_4.method2743(this.aClass4_Sub2_3, 8);
				}
				this.aClass62_Sub3_29.method3962(this.aClass103_4);
				this.aClass62_Sub3_29.method3948(this.aClass103_3);
				this.aClass103_3.method2746(0);
				this.aClass103_3.method2746(8);
				this.aClass103_3.method2744(0, this.aClass5_Sub2_Sub6_1);
				this.aClass103_3.method2744(8, this.aClass5_Sub2_Sub6_2);
				this.aClass62_Sub3_29.method3962(this.aClass103_3);
			}
			this.aBoolean489 = true;
			this.aBoolean487 = false;
		}
		if (this.aBoolean489) {
			this.aClass62_Sub3_29.method3948(this.aClass103_2);
			this.aBoolean489 = !this.aClass103_2.method2741();
			this.aClass62_Sub3_29.method3962(this.aClass103_2);
		}
		return !this.aBoolean489;
	}
}
