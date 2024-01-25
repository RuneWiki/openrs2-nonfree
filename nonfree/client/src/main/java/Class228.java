import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class228 {

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
	private boolean aBoolean421;

	@OriginalMember(owner = "client!sp", name = "A", descriptor = "Lclient!wa;")
	private Class10_Sub1_Sub18 aClass10_Sub1_Sub18_1;

	@OriginalMember(owner = "client!sp", name = "B", descriptor = "Lclient!wa;")
	private Class10_Sub1_Sub18 aClass10_Sub1_Sub18_2;

	@OriginalMember(owner = "client!sp", name = "E", descriptor = "Lclient!sq;")
	private Class4_Sub1 aClass4_Sub1_5;

	@OriginalMember(owner = "client!sp", name = "e", descriptor = "I")
	private int anInt6442 = 1;

	@OriginalMember(owner = "client!sp", name = "o", descriptor = "I")
	private int anInt6447 = 0;

	@OriginalMember(owner = "client!sp", name = "v", descriptor = "I")
	private int anInt6450 = 0;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	private int anInt6449 = 1;

	@OriginalMember(owner = "client!sp", name = "u", descriptor = "Lclient!mf;")
	private final Class163 aClass163_40 = new Class163();

	@OriginalMember(owner = "client!sp", name = "y", descriptor = "Z")
	private boolean aBoolean423 = true;

	@OriginalMember(owner = "client!sp", name = "z", descriptor = "I")
	private int anInt6453 = 0;

	@OriginalMember(owner = "client!sp", name = "G", descriptor = "Z")
	private boolean aBoolean426 = true;

	@OriginalMember(owner = "client!sp", name = "H", descriptor = "I")
	private int anInt6454 = -1;

	@OriginalMember(owner = "client!sp", name = "D", descriptor = "Z")
	private boolean aBoolean424 = true;

	@OriginalMember(owner = "client!sp", name = "F", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "client!sp", name = "C", descriptor = "[Lclient!sq;")
	private Class4_Sub1[] aClass4_Sub1Array4 = new Class4_Sub1[2];

	@OriginalMember(owner = "client!sp", name = "I", descriptor = "Z")
	private boolean aBoolean427 = true;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "Lclient!da;")
	private final Class50_Sub1 aClass50_Sub1_35;

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Lclient!vn;")
	private Class260 aClass260_4;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "Lclient!vn;")
	private Class260 aClass260_6;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "Lclient!vn;")
	private Class260 aClass260_5;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!da;)V")
	public Class228(@OriginalArg(0) Class50_Sub1 arg0) {
		this.aClass50_Sub1_35 = arg0;
		if (this.aClass50_Sub1_35.aBoolean98 && this.aClass50_Sub1_35.aBoolean92) {
			this.aClass260_6 = this.aClass260_4 = new Class260(this.aClass50_Sub1_35);
			if (this.aClass50_Sub1_35.anInt1399 > 1 && this.aClass50_Sub1_35.aBoolean78 && this.aClass50_Sub1_35.bf) {
				this.aClass260_6 = this.aClass260_5 = new Class260(this.aClass50_Sub1_35);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!su;B)Z")
	public boolean method5001(@OriginalArg(0) Class10_Sub10 arg0) {
		if (this.aClass260_6 != null) {
			if (arg0.method899() || arg0.method903()) {
				this.aClass163_40.method3613(arg0);
				this.method5007();
				if (this.method5002()) {
					if (this.anInt6449 != -1 && this.anInt6442 != -1) {
						arg0.method910(this.anInt6449, this.anInt6442);
					}
					arg0.aBoolean57 = true;
					return true;
				}
			}
			this.method5009(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)Z")
	private boolean method5002() {
		if (this.aBoolean424) {
			if (this.aClass10_Sub1_Sub18_2 != null) {
				this.aClass10_Sub1_Sub18_2.method5901();
				this.aClass10_Sub1_Sub18_2 = null;
			}
			if (this.aClass4_Sub1_5 != null) {
				this.aClass4_Sub1_5.method4575();
				this.aClass4_Sub1_5 = null;
			}
			if (this.aClass260_5 != null) {
				this.aClass10_Sub1_Sub18_2 = new Class10_Sub1_Sub18(this.aClass50_Sub1_35, 6402, this.anInt6449, this.anInt6442, this.aClass50_Sub1_35.anInt1399);
			}
			if (this.aBoolean425) {
				this.aClass4_Sub1_5 = new Class4_Sub1(this.aClass50_Sub1_35, 34037, 6402, this.anInt6449, this.anInt6442);
			} else if (this.aClass10_Sub1_Sub18_2 == null) {
				this.aClass10_Sub1_Sub18_2 = new Class10_Sub1_Sub18(this.aClass50_Sub1_35, 6402, this.anInt6449, this.anInt6442);
			}
			this.aBoolean424 = false;
			this.aBoolean427 = true;
			this.aBoolean423 = true;
		}
		if (this.aBoolean426) {
			if (this.aClass10_Sub1_Sub18_1 != null) {
				this.aClass10_Sub1_Sub18_1.method5901();
				this.aClass10_Sub1_Sub18_1 = null;
			}
			if (this.aClass4_Sub1Array4[0] != null) {
				this.aClass4_Sub1Array4[0].method4575();
				this.aClass4_Sub1Array4[0] = null;
			}
			if (this.aClass4_Sub1Array4[1] != null) {
				this.aClass4_Sub1Array4[1].method4575();
				this.aClass4_Sub1Array4[1] = null;
			}
			if (this.aClass260_5 != null) {
				this.aClass10_Sub1_Sub18_1 = new Class10_Sub1_Sub18(this.aClass50_Sub1_35, this.anInt6454, this.anInt6449, this.anInt6442, this.aClass50_Sub1_35.anInt1399);
			}
			this.aClass4_Sub1Array4[0] = new Class4_Sub1(this.aClass50_Sub1_35, 34037, this.anInt6454, this.anInt6449, this.anInt6442);
			this.aClass4_Sub1Array4[1] = this.anInt6453 > 1 ? new Class4_Sub1(this.aClass50_Sub1_35, 34037, this.anInt6454, this.anInt6449, this.anInt6442) : null;
			this.aBoolean426 = false;
			this.aBoolean423 = true;
			this.aBoolean427 = true;
		}
		if (this.aBoolean427) {
			if (this.aClass260_5 == null) {
				this.aClass50_Sub1_35.method1320(this.aClass260_4);
				this.aClass260_4.method5732(0);
				this.aClass260_4.method5732(1);
				this.aClass260_4.method5732(8);
				this.aClass260_4.method5729(0, this.aClass4_Sub1Array4[0]);
				if (this.anInt6453 > 1) {
					this.aClass260_4.method5729(1, this.aClass4_Sub1Array4[1]);
				}
				if (this.aBoolean425) {
					this.aClass260_4.method5729(8, this.aClass4_Sub1_5);
				} else {
					this.aClass260_4.method5730(8, this.aClass10_Sub1_Sub18_2);
				}
				this.aClass50_Sub1_35.method1284(this.aClass260_4);
			} else {
				this.aClass50_Sub1_35.method1320(this.aClass260_4);
				this.aClass260_4.method5732(0);
				this.aClass260_4.method5732(1);
				this.aClass260_4.method5732(8);
				this.aClass260_4.method5729(0, this.aClass4_Sub1Array4[0]);
				if (this.anInt6453 > 1) {
					this.aClass260_4.method5729(1, this.aClass4_Sub1Array4[1]);
				}
				if (this.aBoolean425) {
					this.aClass260_4.method5729(8, this.aClass4_Sub1_5);
				}
				this.aClass50_Sub1_35.method1284(this.aClass260_4);
				this.aClass50_Sub1_35.method1320(this.aClass260_5);
				this.aClass260_5.method5732(0);
				this.aClass260_5.method5732(8);
				this.aClass260_5.method5730(0, this.aClass10_Sub1_Sub18_1);
				this.aClass260_5.method5730(8, this.aClass10_Sub1_Sub18_2);
				this.aClass50_Sub1_35.method1284(this.aClass260_5);
			}
			this.aBoolean423 = true;
			this.aBoolean427 = false;
		}
		if (this.aBoolean423) {
			this.aClass50_Sub1_35.method1320(this.aClass260_6);
			this.aBoolean423 = !this.aClass260_6.method5736();
			this.aClass50_Sub1_35.method1284(this.aClass260_6);
		}
		return !this.aBoolean423;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
	public void method5003() {
		this.aClass10_Sub1_Sub18_2 = null;
		this.aClass10_Sub1_Sub18_1 = null;
		this.aClass4_Sub1Array4 = null;
		this.aClass4_Sub1_5 = null;
		this.aClass260_6 = this.aClass260_5 = this.aClass260_4 = null;
		if (!this.aClass163_40.method3617()) {
			for (@Pc(43) Class10 local43 = this.aClass163_40.method3620(); local43 != this.aClass163_40.aClass10_149; local43 = local43.aClass10_263) {
				((Class10_Sub10) local43).method907();
			}
		}
		this.anInt6449 = this.anInt6442 = 1;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIZII)Z")
	public boolean method5005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass260_6 == null || this.aClass163_40.method3617()) {
			return false;
		}
		if (this.anInt6449 != arg1 || arg2 != this.anInt6442) {
			this.anInt6442 = arg2;
			this.anInt6449 = arg1;
			for (@Pc(42) Class10 local42 = this.aClass163_40.method3620(); local42 != this.aClass163_40.aClass10_149; local42 = local42.aClass10_263) {
				((Class10_Sub10) local42).method910(this.anInt6449, this.anInt6442);
			}
			this.aBoolean426 = true;
			this.aBoolean424 = true;
			this.aBoolean427 = true;
		}
		if (!this.method5002()) {
			return false;
		}
		this.anInt6447 = arg3;
		this.anInt6450 = arg0;
		this.aBoolean421 = true;
		this.aClass50_Sub1_35.method1320(this.aClass260_6);
		this.aClass260_6.method5731(0);
		this.aClass50_Sub1_35.method1251(-this.anInt6450, this.anInt6442 - this.aClass260_6.method5738() - this.anInt6447);
		return true;
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	public void method5006() {
		if (!this.aBoolean421) {
			return;
		}
		if (this.aClass260_5 != null) {
			@Pc(25) short local25 = 16384;
			this.aClass50_Sub1_35.method1307(this.aClass260_5);
			this.aClass50_Sub1_35.method1303(this.aClass260_4);
			this.aClass260_5.method5739();
			this.aClass260_4.method5731(0);
			if (this.aBoolean425) {
				local25 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt6449, this.anInt6442, 0, 0, this.anInt6449, this.anInt6442, local25, 9728);
			this.aClass50_Sub1_35.method1311(this.aClass260_5);
			this.aClass50_Sub1_35.method1261(this.aClass260_4);
		}
		this.aClass50_Sub1_35.method1271();
		this.aClass50_Sub1_35.method1279(0);
		this.aClass50_Sub1_35.method1256(1);
		this.aClass50_Sub1_35.va();
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 1;
		@Pc(116) Class10_Sub10 local116;
		for (@Pc(108) Class10_Sub10 local108 = (Class10_Sub10) this.aClass163_40.method3620(); local108 != null; local108 = local116) {
			local116 = (Class10_Sub10) this.aClass163_40.method3621();
			@Pc(122) int local122 = local108.method904();
			for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
				local108.method901(this.aClass4_Sub1_5, this.aClass4_Sub1Array4[local100], local124);
				if (local116 == null && local122 - 1 == local124) {
					this.aClass50_Sub1_35.method1284(this.aClass260_4);
					this.aClass50_Sub1_35.method1251(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6442);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6450, this.anInt6447);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6450, this.anInt6447 + this.anInt6442);
					OpenGL.glTexCoord2f((float) this.anInt6449, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6450 + this.anInt6449, this.anInt6442 + this.anInt6447);
					OpenGL.glTexCoord2f((float) this.anInt6449, (float) this.anInt6442);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6450 + this.anInt6449, this.anInt6447);
					OpenGL.glEnd();
				} else {
					this.aClass260_4.method5731(local102);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt6442);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt6442);
					OpenGL.glTexCoord2f((float) this.anInt6449, (float) this.anInt6442);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt6449, this.anInt6442);
					OpenGL.glTexCoord2f((float) this.anInt6449, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt6449, 0);
					OpenGL.glEnd();
				}
				local100 = local100 + 1 & 0x1;
				local102 = local102 + 1 & 0x1;
				local108.method906(local124);
			}
		}
		this.aBoolean421 = false;
	}

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V")
	private void method5007() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class10_Sub10 local17 = (Class10_Sub10) this.aClass163_40.method3620(); local17 != null; local17 = (Class10_Sub10) this.aClass163_40.method3621()) {
			local23 = local17.method902();
			if (local9 < local23) {
				local9 = local23;
			}
			local11 += local17.method904();
			local7 |= local17.method905();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt6454 != local23) {
			this.aBoolean426 = true;
			this.anInt6454 = local23;
		}
		@Pc(93) int local93 = this.anInt6453 <= 2 ? this.anInt6453 : 2;
		@Pc(100) int local100 = local11 <= 2 ? local11 : 2;
		if (local93 != local100) {
			this.aBoolean427 = this.aBoolean426 = true;
		}
		if (this.aBoolean425 != local7) {
			this.aBoolean425 = local7;
			this.aBoolean424 = true;
		}
		this.anInt6453 = local11;
	}

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)Z")
	public boolean method5008() {
		return this.aClass260_6 != null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!su;I)V")
	public void method5009(@OriginalArg(0) Class10_Sub10 arg0) {
		arg0.aBoolean57 = false;
		arg0.method907();
		arg0.method6033();
		this.method5007();
	}
}
