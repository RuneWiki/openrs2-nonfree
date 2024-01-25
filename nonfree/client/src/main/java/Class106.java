import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class106 {

	@OriginalMember(owner = "client!ih", name = "r", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!ih", name = "y", descriptor = "Lclient!uk;")
	private Class62_Sub2 aClass62_Sub2_2;

	@OriginalMember(owner = "client!ih", name = "A", descriptor = "Lclient!at;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ih", name = "D", descriptor = "Lclient!at;")
	private Class4_Sub1_Sub3 aClass4_Sub1_Sub3_2;

	@OriginalMember(owner = "client!ih", name = "k", descriptor = "I")
	private int anInt3292 = 0;

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
	private int anInt3289 = 0;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	private int anInt3291 = 1;

	@OriginalMember(owner = "client!ih", name = "w", descriptor = "I")
	private int anInt3299 = 1;

	@OriginalMember(owner = "client!ih", name = "f", descriptor = "Lclient!gw;")
	private final Class91 aClass91_18 = new Class91();

	@OriginalMember(owner = "client!ih", name = "z", descriptor = "I")
	private int anInt3301 = -1;

	@OriginalMember(owner = "client!ih", name = "B", descriptor = "[Lclient!uk;")
	private Class62_Sub2[] aClass62_Sub2Array1 = new Class62_Sub2[2];

	@OriginalMember(owner = "client!ih", name = "F", descriptor = "Z")
	private boolean aBoolean215 = true;

	@OriginalMember(owner = "client!ih", name = "I", descriptor = "Z")
	private boolean aBoolean217 = true;

	@OriginalMember(owner = "client!ih", name = "H", descriptor = "Z")
	private boolean aBoolean216 = true;

	@OriginalMember(owner = "client!ih", name = "C", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "I")
	private int anInt3303 = 0;

	@OriginalMember(owner = "client!ih", name = "E", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!ih", name = "v", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_17;

	@OriginalMember(owner = "client!ih", name = "t", descriptor = "Lclient!nn;")
	private Class172 aClass172_4;

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "Lclient!nn;")
	private Class172 aClass172_2;

	@OriginalMember(owner = "client!ih", name = "j", descriptor = "Lclient!nn;")
	private Class172 aClass172_3;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class106(@OriginalArg(0) Class30_Sub1 arg0) {
		this.aClass30_Sub1_17 = arg0;
		if (this.aClass30_Sub1_17.aBoolean60 && this.aClass30_Sub1_17.aBoolean39) {
			this.aClass172_2 = this.aClass172_4 = new Class172(this.aClass30_Sub1_17);
			if (this.aClass30_Sub1_17.anInt833 > 1 && this.aClass30_Sub1_17.aBoolean57 && this.aClass30_Sub1_17.aBoolean44) {
				this.aClass172_2 = this.aClass172_3 = new Class172(this.aClass30_Sub1_17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(IIIII)Z")
	public boolean method2930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass172_2 == null || this.aClass91_18.method2575()) {
			return false;
		}
		if (this.anInt3299 != arg2 || arg1 != this.anInt3291) {
			this.anInt3299 = arg2;
			this.anInt3291 = arg1;
			for (@Pc(34) Class4 local34 = this.aClass91_18.method2584(); local34 != this.aClass91_18.aClass4_103; local34 = local34.aClass4_269) {
				((Class4_Sub13) local34).method5067(this.anInt3291, this.anInt3299);
			}
			this.aBoolean216 = true;
			this.aBoolean217 = true;
			this.aBoolean215 = true;
		}
		if (!this.method2932()) {
			return false;
		}
		this.aBoolean212 = true;
		this.anInt3289 = arg3;
		this.anInt3292 = arg0;
		this.aClass30_Sub1_17.method734(this.aClass172_2);
		this.aClass172_2.method4328(0);
		this.aClass30_Sub1_17.method687(-this.anInt3289, this.anInt3291 - this.aClass172_2.method4331() - this.anInt3292);
		return true;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
	public void method2931() {
		if (!this.aBoolean212) {
			return;
		}
		if (this.aClass172_3 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass30_Sub1_17.method737(this.aClass172_3);
			this.aClass30_Sub1_17.method697(this.aClass172_4);
			this.aClass172_3.method4337();
			this.aClass172_4.method4328(0);
			if (this.aBoolean213) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3299, this.anInt3291, 0, 0, this.anInt3299, this.anInt3291, local14, 9728);
			this.aClass30_Sub1_17.method756(this.aClass172_3);
			this.aClass30_Sub1_17.method685(this.aClass172_4);
		}
		this.aClass30_Sub1_17.method727();
		this.aClass30_Sub1_17.method703(0);
		this.aClass30_Sub1_17.method713(1);
		this.aClass30_Sub1_17.H();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(111) Class4_Sub13 local111;
		for (@Pc(103) Class4_Sub13 local103 = (Class4_Sub13) this.aClass91_18.method2584(); local103 != null; local103 = local111) {
			local111 = (Class4_Sub13) this.aClass91_18.method2586();
			@Pc(115) int local115 = local103.method5075();
			for (@Pc(117) int local117 = 0; local117 < local115; local117++) {
				local103.method5073(local117, this.aClass62_Sub2_2, this.aClass62_Sub2Array1[local95]);
				if (local111 == null && local115 - 1 == local117) {
					this.aClass30_Sub1_17.method728(this.aClass172_4);
					this.aClass30_Sub1_17.method687(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3291);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3289, this.anInt3292);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3289, this.anInt3291 + this.anInt3292);
					OpenGL.glTexCoord2f((float) this.anInt3299, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3289 + this.anInt3299, this.anInt3291 + this.anInt3292);
					OpenGL.glTexCoord2f((float) this.anInt3299, (float) this.anInt3291);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3289 + this.anInt3299, this.anInt3292);
					OpenGL.glEnd();
				} else {
					this.aClass172_4.method4328(--local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3291);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt3291);
					OpenGL.glTexCoord2f((float) this.anInt3299, (float) this.anInt3291);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3299, this.anInt3291);
					OpenGL.glTexCoord2f((float) this.anInt3299, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3299, 0);
					OpenGL.glEnd();
				}
				local97 = local97 + 1 & 0x1;
				local103.method5066(local117);
				local95 = local95 + 1 & 0x1;
			}
		}
		this.aBoolean212 = false;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(I)Z")
	private boolean method2932() {
		if (this.aBoolean216) {
			if (this.aClass4_Sub1_Sub3_1 != null) {
				this.aClass4_Sub1_Sub3_1.method293();
				this.aClass4_Sub1_Sub3_1 = null;
			}
			if (this.aClass62_Sub2_2 != null) {
				this.aClass62_Sub2_2.method5353();
				this.aClass62_Sub2_2 = null;
			}
			if (this.aClass172_3 != null) {
				this.aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3(this.aClass30_Sub1_17, 6402, this.anInt3299, this.anInt3291, this.aClass30_Sub1_17.anInt833);
			}
			if (this.aBoolean213) {
				this.aClass62_Sub2_2 = new Class62_Sub2(this.aClass30_Sub1_17, 34037, 6402, this.anInt3299, this.anInt3291);
			} else if (this.aClass4_Sub1_Sub3_1 == null) {
				this.aClass4_Sub1_Sub3_1 = new Class4_Sub1_Sub3(this.aClass30_Sub1_17, 6402, this.anInt3299, this.anInt3291);
			}
			this.aBoolean214 = true;
			this.aBoolean217 = true;
			this.aBoolean216 = false;
		}
		if (this.aBoolean215) {
			if (this.aClass4_Sub1_Sub3_2 != null) {
				this.aClass4_Sub1_Sub3_2.method293();
				this.aClass4_Sub1_Sub3_2 = null;
			}
			if (this.aClass62_Sub2Array1[0] != null) {
				this.aClass62_Sub2Array1[0].method5353();
				this.aClass62_Sub2Array1[0] = null;
			}
			if (this.aClass62_Sub2Array1[1] != null) {
				this.aClass62_Sub2Array1[1].method5353();
				this.aClass62_Sub2Array1[1] = null;
			}
			if (this.aClass172_3 != null) {
				this.aClass4_Sub1_Sub3_2 = new Class4_Sub1_Sub3(this.aClass30_Sub1_17, this.anInt3301, this.anInt3299, this.anInt3291, this.aClass30_Sub1_17.anInt833);
			}
			this.aClass62_Sub2Array1[0] = new Class62_Sub2(this.aClass30_Sub1_17, 34037, this.anInt3301, this.anInt3299, this.anInt3291);
			this.aClass62_Sub2Array1[1] = this.anInt3303 <= 1 ? null : new Class62_Sub2(this.aClass30_Sub1_17, 34037, this.anInt3301, this.anInt3299, this.anInt3291);
			this.aBoolean215 = false;
			this.aBoolean217 = true;
			this.aBoolean214 = true;
		}
		if (this.aBoolean217) {
			if (this.aClass172_3 == null) {
				this.aClass30_Sub1_17.method734(this.aClass172_4);
				this.aClass172_4.method4334(0);
				this.aClass172_4.method4334(1);
				this.aClass172_4.method4334(8);
				this.aClass172_4.method4332(0, this.aClass62_Sub2Array1[0]);
				if (this.anInt3303 > 1) {
					this.aClass172_4.method4332(1, this.aClass62_Sub2Array1[1]);
				}
				if (this.aBoolean213) {
					this.aClass172_4.method4332(8, this.aClass62_Sub2_2);
				} else {
					this.aClass172_4.method4338(8, this.aClass4_Sub1_Sub3_1);
				}
				this.aClass30_Sub1_17.method728(this.aClass172_4);
			} else {
				this.aClass30_Sub1_17.method734(this.aClass172_4);
				this.aClass172_4.method4334(0);
				this.aClass172_4.method4334(1);
				this.aClass172_4.method4334(8);
				this.aClass172_4.method4332(0, this.aClass62_Sub2Array1[0]);
				if (this.anInt3303 > 1) {
					this.aClass172_4.method4332(1, this.aClass62_Sub2Array1[1]);
				}
				if (this.aBoolean213) {
					this.aClass172_4.method4332(8, this.aClass62_Sub2_2);
				}
				this.aClass30_Sub1_17.method728(this.aClass172_4);
				this.aClass30_Sub1_17.method734(this.aClass172_3);
				this.aClass172_3.method4334(0);
				this.aClass172_3.method4334(8);
				this.aClass172_3.method4338(0, this.aClass4_Sub1_Sub3_2);
				this.aClass172_3.method4338(8, this.aClass4_Sub1_Sub3_1);
				this.aClass30_Sub1_17.method728(this.aClass172_3);
			}
			this.aBoolean217 = false;
			this.aBoolean214 = true;
		}
		if (this.aBoolean214) {
			this.aClass30_Sub1_17.method734(this.aClass172_2);
			this.aBoolean214 = !this.aClass172_2.method4326();
			this.aClass30_Sub1_17.method728(this.aClass172_2);
		}
		return !this.aBoolean214;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(BLclient!ek;)Z")
	public boolean method2933(@OriginalArg(1) Class4_Sub13 arg0) {
		if (this.aClass172_2 != null) {
			if (arg0.method5076() || arg0.method5077()) {
				this.aClass91_18.method2587(arg0);
				this.method2934();
				if (this.method2932()) {
					if (this.anInt3299 != -1 && this.anInt3291 != -1) {
						arg0.method5067(this.anInt3291, this.anInt3299);
					}
					arg0.aBoolean456 = true;
					return true;
				}
			}
			this.method2938(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(I)V")
	private void method2934() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class4_Sub13 local17 = (Class4_Sub13) this.aClass91_18.method2584(); local17 != null; local17 = (Class4_Sub13) this.aClass91_18.method2586()) {
			local23 = local17.method5074();
			if (local23 > local9) {
				local9 = local23;
			}
			local11 += local17.method5075();
			local7 |= local17.method5071();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt3301 != local23) {
			this.aBoolean215 = true;
			this.anInt3301 = local23;
		}
		@Pc(95) int local95 = this.anInt3303 <= 2 ? this.anInt3303 : 2;
		@Pc(104) int local104 = local11 > 2 ? 2 : local11;
		this.anInt3303 = local11;
		if (this.aBoolean213 != local7) {
			this.aBoolean216 = true;
			this.aBoolean213 = local7;
		}
		if (local95 != local104) {
			this.aBoolean217 = this.aBoolean215 = true;
		}
	}

	@OriginalMember(owner = "client!ih", name = "d", descriptor = "(I)Z")
	public boolean method2935() {
		return this.aClass172_2 != null;
	}

	@OriginalMember(owner = "client!ih", name = "e", descriptor = "(I)V")
	public void method2936() {
		this.aClass172_2 = this.aClass172_3 = this.aClass172_4 = null;
		this.aClass62_Sub2Array1 = null;
		this.aClass62_Sub2_2 = null;
		this.aClass4_Sub1_Sub3_1 = null;
		this.aClass4_Sub1_Sub3_2 = null;
		if (!this.aClass91_18.method2575()) {
			for (@Pc(38) Class4 local38 = this.aClass91_18.method2584(); local38 != this.aClass91_18.aClass4_103; local38 = local38.aClass4_269) {
				((Class4_Sub13) local38).method5078();
			}
		}
		this.anInt3299 = this.anInt3291 = 1;
	}

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "(BLclient!ek;)V")
	public void method2938(@OriginalArg(1) Class4_Sub13 arg0) {
		arg0.aBoolean456 = false;
		arg0.method5078();
		arg0.method6330();
		this.method2934();
	}
}
