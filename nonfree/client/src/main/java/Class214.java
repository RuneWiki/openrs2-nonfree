import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rf")
public final class Class214 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "Z")
	private boolean aBoolean502;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "Lclient!ip;")
	private Class3_Sub4_Sub10 aClass3_Sub4_Sub10_1;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Lclient!mf;")
	private Class112_Sub2 aClass112_Sub2_4;

	@OriginalMember(owner = "client!rf", name = "H", descriptor = "Lclient!ip;")
	private Class3_Sub4_Sub10 aClass3_Sub4_Sub10_2;

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
	private int anInt5868 = 1;

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
	private int anInt5867 = 0;

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "I")
	private int anInt5877 = 0;

	@OriginalMember(owner = "client!rf", name = "r", descriptor = "I")
	private int anInt5878 = 1;

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!ug;")
	private final Class243 aClass243_36 = new Class243();

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Z")
	private boolean aBoolean503 = true;

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "I")
	private int anInt5882 = 0;

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Z")
	private boolean aBoolean504 = true;

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "I")
	private int anInt5883 = -1;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "[Lclient!mf;")
	private Class112_Sub2[] aClass112_Sub2Array4 = new Class112_Sub2[2];

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Z")
	private boolean aBoolean506 = true;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "Z")
	private boolean aBoolean505 = true;

	@OriginalMember(owner = "client!rf", name = "I", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_30;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "Lclient!vh;")
	private Class259 aClass259_5;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Lclient!vh;")
	private Class259 aClass259_4;

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "Lclient!vh;")
	private Class259 aClass259_3;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class214(@OriginalArg(0) Class172_Sub2 arg0) {
		this.aClass172_Sub2_30 = arg0;
		if (this.aClass172_Sub2_30.aBoolean605 && this.aClass172_Sub2_30.aBoolean607) {
			this.aClass259_4 = this.aClass259_5 = new Class259(this.aClass172_Sub2_30);
			if (this.aClass172_Sub2_30.anInt7156 > 1 && this.aClass172_Sub2_30.aBoolean606 && this.aClass172_Sub2_30.aBoolean601) {
				this.aClass259_4 = this.aClass259_3 = new Class259(this.aClass172_Sub2_30);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)Z")
	public boolean method4581() {
		return this.aClass259_4 != null;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(I)V")
	public void method4582() {
		this.aClass112_Sub2_4 = null;
		this.aClass3_Sub4_Sub10_1 = null;
		this.aClass3_Sub4_Sub10_2 = null;
		this.aClass112_Sub2Array4 = null;
		this.aClass259_4 = this.aClass259_3 = this.aClass259_5 = null;
		if (!this.aClass243_36.method5211()) {
			for (@Pc(38) Class3 local38 = this.aClass243_36.method5208(); local38 != this.aClass243_36.aClass3_231; local38 = local38.aClass3_261) {
				((Class3_Sub21) local38).method4528();
			}
		}
		this.anInt5868 = this.anInt5878 = 1;
	}

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "(I)V")
	public void method4583() {
		if (!this.aBoolean502) {
			return;
		}
		if (this.aClass259_3 != null) {
			this.aClass172_Sub2_30.method5575(this.aClass259_3);
			@Pc(20) short local20 = 16384;
			this.aClass172_Sub2_30.method5564(this.aClass259_5);
			this.aClass259_3.method5443();
			this.aClass259_5.method5452(0);
			if (this.aBoolean507) {
				local20 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5868, this.anInt5878, 0, 0, this.anInt5868, this.anInt5878, local20, 9728);
			this.aClass172_Sub2_30.method5600(this.aClass259_3);
			this.aClass172_Sub2_30.method5563(this.aClass259_5);
		}
		this.aClass172_Sub2_30.method5570();
		this.aClass172_Sub2_30.method5574(0);
		this.aClass172_Sub2_30.method5629(1);
		this.aClass172_Sub2_30.va();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(107) Class3_Sub21 local107;
		for (@Pc(99) Class3_Sub21 local99 = (Class3_Sub21) this.aClass243_36.method5208(); local99 != null; local99 = local107) {
			local107 = (Class3_Sub21) this.aClass243_36.method5203();
			@Pc(111) int local111 = local99.method4529();
			for (@Pc(113) int local113 = 0; local113 < local111; local113++) {
				local99.method4530(this.aClass112_Sub2_4, this.aClass112_Sub2Array4[local89], local113);
				if (local107 == null && local113 == local111 - 1) {
					this.aClass172_Sub2_30.method5556(this.aClass259_5);
					this.aClass172_Sub2_30.method5599(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5878);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5867, this.anInt5877);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5867, this.anInt5878 + this.anInt5877);
					OpenGL.glTexCoord2f((float) this.anInt5868, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5867 + this.anInt5868, this.anInt5877 + this.anInt5878);
					OpenGL.glTexCoord2f((float) this.anInt5868, (float) this.anInt5878);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5867 + this.anInt5868, this.anInt5877);
					OpenGL.glEnd();
				} else {
					this.aClass259_5.method5452(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5878);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt5878);
					OpenGL.glTexCoord2f((float) this.anInt5868, (float) this.anInt5878);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5868, this.anInt5878);
					OpenGL.glTexCoord2f((float) this.anInt5868, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5868, 0);
					OpenGL.glEnd();
				}
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
				local99.method4524(local113);
			}
		}
		this.aBoolean502 = false;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)Z")
	public boolean method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass259_4 == null || this.aClass243_36.method5211()) {
			return false;
		}
		if (this.anInt5868 != arg3 || this.anInt5878 != arg0) {
			this.anInt5868 = arg3;
			this.anInt5878 = arg0;
			for (@Pc(39) Class3 local39 = this.aClass243_36.method5208(); local39 != this.aClass243_36.aClass3_231; local39 = local39.aClass3_261) {
				((Class3_Sub21) local39).method4527(this.anInt5878, this.anInt5868);
			}
			this.aBoolean505 = true;
			this.aBoolean506 = true;
			this.aBoolean504 = true;
		}
		if (!this.method4587()) {
			return false;
		}
		this.anInt5867 = arg2;
		this.anInt5877 = arg1;
		this.aBoolean502 = true;
		this.aClass172_Sub2_30.method5585(this.aClass259_4);
		this.aClass259_4.method5452(0);
		this.aClass172_Sub2_30.method5599(this.anInt5878 - this.aClass259_4.method5438() - this.anInt5877, -this.anInt5867);
		return true;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)V")
	private void method4586() {
		@Pc(5) boolean local5 = false;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(20) int local20;
		for (@Pc(15) Class3_Sub21 local15 = (Class3_Sub21) this.aClass243_36.method5208(); local15 != null; local15 = (Class3_Sub21) this.aClass243_36.method5203()) {
			local20 = local15.method4521();
			local9 += local15.method4529();
			if (local20 > local7) {
				local7 = local20;
			}
			local5 |= local15.method4522();
		}
		if (local7 == 2) {
			local20 = 34836;
		} else if (local7 == 1) {
			local20 = 34842;
		} else {
			local20 = 6408;
		}
		if (this.anInt5883 != local20) {
			this.anInt5883 = local20;
			this.aBoolean505 = true;
		}
		@Pc(95) int local95 = this.anInt5882 > 2 ? 2 : this.anInt5882;
		@Pc(104) int local104 = local9 <= 2 ? local9 : 2;
		this.anInt5882 = local9;
		if (local5 != this.aBoolean507) {
			this.aBoolean507 = local5;
			this.aBoolean504 = true;
		}
		if (local95 != local104) {
			this.aBoolean506 = this.aBoolean505 = true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)Z")
	private boolean method4587() {
		if (this.aBoolean504) {
			if (this.aClass3_Sub4_Sub10_1 != null) {
				this.aClass3_Sub4_Sub10_1.method2813();
				this.aClass3_Sub4_Sub10_1 = null;
			}
			if (this.aClass112_Sub2_4 != null) {
				this.aClass112_Sub2_4.method4553();
				this.aClass112_Sub2_4 = null;
			}
			if (this.aClass259_3 != null) {
				this.aClass3_Sub4_Sub10_1 = new Class3_Sub4_Sub10(this.aClass172_Sub2_30, 6402, this.anInt5868, this.anInt5878, this.aClass172_Sub2_30.anInt7156);
			}
			if (this.aBoolean507) {
				this.aClass112_Sub2_4 = new Class112_Sub2(this.aClass172_Sub2_30, 34037, 6402, this.anInt5868, this.anInt5878);
			} else if (this.aClass3_Sub4_Sub10_1 == null) {
				this.aClass3_Sub4_Sub10_1 = new Class3_Sub4_Sub10(this.aClass172_Sub2_30, 6402, this.anInt5868, this.anInt5878);
			}
			this.aBoolean506 = true;
			this.aBoolean504 = false;
			this.aBoolean503 = true;
		}
		if (this.aBoolean505) {
			if (this.aClass3_Sub4_Sub10_2 != null) {
				this.aClass3_Sub4_Sub10_2.method2813();
				this.aClass3_Sub4_Sub10_2 = null;
			}
			if (this.aClass112_Sub2Array4[0] != null) {
				this.aClass112_Sub2Array4[0].method4553();
				this.aClass112_Sub2Array4[0] = null;
			}
			if (this.aClass112_Sub2Array4[1] != null) {
				this.aClass112_Sub2Array4[1].method4553();
				this.aClass112_Sub2Array4[1] = null;
			}
			if (this.aClass259_3 != null) {
				this.aClass3_Sub4_Sub10_2 = new Class3_Sub4_Sub10(this.aClass172_Sub2_30, this.anInt5883, this.anInt5868, this.anInt5878, this.aClass172_Sub2_30.anInt7156);
			}
			this.aClass112_Sub2Array4[0] = new Class112_Sub2(this.aClass172_Sub2_30, 34037, this.anInt5883, this.anInt5868, this.anInt5878);
			this.aClass112_Sub2Array4[1] = this.anInt5882 > 1 ? new Class112_Sub2(this.aClass172_Sub2_30, 34037, this.anInt5883, this.anInt5868, this.anInt5878) : null;
			this.aBoolean506 = true;
			this.aBoolean503 = true;
			this.aBoolean505 = false;
		}
		if (this.aBoolean506) {
			if (this.aClass259_3 == null) {
				this.aClass172_Sub2_30.method5585(this.aClass259_5);
				this.aClass259_5.method5441(0);
				this.aClass259_5.method5441(1);
				this.aClass259_5.method5441(8);
				this.aClass259_5.method5451(0, this.aClass112_Sub2Array4[0]);
				if (this.anInt5882 > 1) {
					this.aClass259_5.method5451(1, this.aClass112_Sub2Array4[1]);
				}
				if (this.aBoolean507) {
					this.aClass259_5.method5451(8, this.aClass112_Sub2_4);
				} else {
					this.aClass259_5.method5442(8, this.aClass3_Sub4_Sub10_1);
				}
				this.aClass172_Sub2_30.method5556(this.aClass259_5);
			} else {
				this.aClass172_Sub2_30.method5585(this.aClass259_5);
				this.aClass259_5.method5441(0);
				this.aClass259_5.method5441(1);
				this.aClass259_5.method5441(8);
				this.aClass259_5.method5451(0, this.aClass112_Sub2Array4[0]);
				if (this.anInt5882 > 1) {
					this.aClass259_5.method5451(1, this.aClass112_Sub2Array4[1]);
				}
				if (this.aBoolean507) {
					this.aClass259_5.method5451(8, this.aClass112_Sub2_4);
				}
				this.aClass172_Sub2_30.method5556(this.aClass259_5);
				this.aClass172_Sub2_30.method5585(this.aClass259_3);
				this.aClass259_3.method5441(0);
				this.aClass259_3.method5441(8);
				this.aClass259_3.method5442(0, this.aClass3_Sub4_Sub10_2);
				this.aClass259_3.method5442(8, this.aClass3_Sub4_Sub10_1);
				this.aClass172_Sub2_30.method5556(this.aClass259_3);
			}
			this.aBoolean506 = false;
			this.aBoolean503 = true;
		}
		if (this.aBoolean503) {
			this.aClass172_Sub2_30.method5585(this.aClass259_4);
			this.aBoolean503 = !this.aClass259_4.method5444();
			this.aClass172_Sub2_30.method5556(this.aClass259_4);
		}
		return !this.aBoolean503;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!is;)V")
	public void method4589(@OriginalArg(1) Class3_Sub21 arg0) {
		arg0.aBoolean495 = false;
		arg0.method4528();
		arg0.method5977();
		this.method4586();
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLclient!is;)Z")
	public boolean method4590(@OriginalArg(1) Class3_Sub21 arg0) {
		if (this.aClass259_4 != null) {
			if (arg0.method4523() || arg0.method4520()) {
				this.aClass243_36.method5198(arg0);
				this.method4586();
				if (this.method4587()) {
					if (this.anInt5868 != -1 && this.anInt5878 != -1) {
						arg0.method4527(this.anInt5878, this.anInt5868);
					}
					arg0.aBoolean495 = true;
					return true;
				}
			}
			this.method4589(arg0);
		}
		return false;
	}
}
