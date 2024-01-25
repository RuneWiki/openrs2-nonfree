import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class90 {

	@OriginalMember(owner = "client!es", name = "r", descriptor = "Z")
	private boolean aBoolean256;

	@OriginalMember(owner = "client!es", name = "w", descriptor = "Lclient!wn;")
	private Class20_Sub4 aClass20_Sub4_2;

	@OriginalMember(owner = "client!es", name = "y", descriptor = "Lclient!ds;")
	private Class8_Sub5_Sub5 aClass8_Sub5_Sub5_1;

	@OriginalMember(owner = "client!es", name = "F", descriptor = "Lclient!ds;")
	private Class8_Sub5_Sub5 aClass8_Sub5_Sub5_2;

	@OriginalMember(owner = "client!es", name = "a", descriptor = "I")
	private int anInt3547 = 0;

	@OriginalMember(owner = "client!es", name = "l", descriptor = "I")
	private int anInt3554 = 1;

	@OriginalMember(owner = "client!es", name = "j", descriptor = "I")
	private int anInt3552 = 1;

	@OriginalMember(owner = "client!es", name = "t", descriptor = "I")
	private int anInt3559 = 0;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "Lclient!bq;")
	private final Class43 aClass43_22 = new Class43();

	@OriginalMember(owner = "client!es", name = "z", descriptor = "Z")
	private boolean aBoolean258 = true;

	@OriginalMember(owner = "client!es", name = "v", descriptor = "Z")
	private boolean aBoolean257 = true;

	@OriginalMember(owner = "client!es", name = "B", descriptor = "I")
	private int anInt3562 = -1;

	@OriginalMember(owner = "client!es", name = "x", descriptor = "I")
	private int anInt3561 = 0;

	@OriginalMember(owner = "client!es", name = "C", descriptor = "[Lclient!wn;")
	private Class20_Sub4[] aClass20_Sub4Array1 = new Class20_Sub4[2];

	@OriginalMember(owner = "client!es", name = "A", descriptor = "Z")
	private boolean aBoolean259 = true;

	@OriginalMember(owner = "client!es", name = "D", descriptor = "Z")
	private boolean aBoolean260 = true;

	@OriginalMember(owner = "client!es", name = "E", descriptor = "Z")
	private boolean aBoolean261 = false;

	@OriginalMember(owner = "client!es", name = "f", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_17;

	@OriginalMember(owner = "client!es", name = "g", descriptor = "Lclient!er;")
	private Class89 aClass89_1;

	@OriginalMember(owner = "client!es", name = "h", descriptor = "Lclient!er;")
	private Class89 aClass89_2;

	@OriginalMember(owner = "client!es", name = "m", descriptor = "Lclient!er;")
	private Class89 aClass89_3;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class90(@OriginalArg(0) Class16_Sub3 arg0) {
		this.aClass16_Sub3_17 = arg0;
		if (this.aClass16_Sub3_17.aBoolean524 && this.aClass16_Sub3_17.aBoolean521) {
			this.aClass89_2 = this.aClass89_1 = new Class89(this.aClass16_Sub3_17);
			if (this.aClass16_Sub3_17.anInt7335 > 1 && this.aClass16_Sub3_17.aBoolean515 && this.aClass16_Sub3_17.aBoolean511) {
				this.aClass89_2 = this.aClass89_3 = new Class89(this.aClass16_Sub3_17);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(BLclient!ns;)Z")
	public boolean method2935(@OriginalArg(1) Class8_Sub32 arg0) {
		if (this.aClass89_2 != null) {
			if (arg0.method4956() || arg0.method4954()) {
				this.aClass43_22.method1424(arg0);
				this.method2941();
				if (this.method2940()) {
					if (this.anInt3554 != -1 && this.anInt3552 != -1) {
						arg0.method4948(this.anInt3554, this.anInt3552);
					}
					arg0.aBoolean432 = true;
					return true;
				}
			}
			this.method2942(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	public void method2936() {
		if (!this.aBoolean256) {
			return;
		}
		if (this.aClass89_3 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass16_Sub3_17.method5999(this.aClass89_3);
			this.aClass16_Sub3_17.method6011(this.aClass89_1);
			this.aClass89_3.method2934();
			this.aClass89_1.method2926(0);
			if (this.aBoolean261) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt3554, this.anInt3552, 0, 0, this.anInt3554, this.anInt3552, local14, 9728);
			this.aClass16_Sub3_17.method5961(this.aClass89_3);
			this.aClass16_Sub3_17.method6017(this.aClass89_1);
		}
		this.aClass16_Sub3_17.method6019();
		this.aClass16_Sub3_17.method6005(0);
		this.aClass16_Sub3_17.method5972(1);
		this.aClass16_Sub3_17.la();
		@Pc(95) int local95 = 0;
		@Pc(97) int local97 = 1;
		@Pc(111) Class8_Sub32 local111;
		for (@Pc(103) Class8_Sub32 local103 = (Class8_Sub32) this.aClass43_22.method1422(); local103 != null; local103 = local111) {
			local111 = (Class8_Sub32) this.aClass43_22.method1426();
			@Pc(115) int local115 = local103.method4958();
			for (@Pc(117) int local117 = 0; local117 < local115; local117++) {
				local103.method4951(this.aClass20_Sub4Array1[local95], local117, this.aClass20_Sub4_2);
				if (local111 == null && local117 == local115 - 1) {
					this.aClass16_Sub3_17.method6016(this.aClass89_1);
					this.aClass16_Sub3_17.method5951(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3552);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3559, this.anInt3547);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3559, this.anInt3547 + this.anInt3552);
					OpenGL.glTexCoord2f((float) this.anInt3554, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3554 + this.anInt3559, this.anInt3547 + this.anInt3552);
					OpenGL.glTexCoord2f((float) this.anInt3554, (float) this.anInt3552);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3554 + this.anInt3559, this.anInt3547);
					OpenGL.glEnd();
				} else {
					this.aClass89_1.method2926(local97);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt3552);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt3552);
					OpenGL.glTexCoord2f((float) this.anInt3554, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt3554, this.anInt3552);
					OpenGL.glTexCoord2f((float) this.anInt3554, (float) this.anInt3552);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt3554, 0);
					OpenGL.glEnd();
				}
				local95 = local95 + 1 & 0x1;
				local97 = local97 + 1 & 0x1;
				local103.method4947(local117);
			}
		}
		this.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(IIIII)Z")
	public boolean method2937(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass89_2 == null || this.aClass43_22.method1420()) {
			return false;
		}
		if (this.anInt3554 != arg0 || this.anInt3552 != arg2) {
			this.anInt3552 = arg2;
			this.anInt3554 = arg0;
			for (@Pc(40) Class8 local40 = this.aClass43_22.method1422(); local40 != this.aClass43_22.aClass8_37; local40 = local40.aClass8_300) {
				((Class8_Sub32) local40).method4948(this.anInt3554, this.anInt3552);
			}
			this.aBoolean258 = true;
			this.aBoolean259 = true;
			this.aBoolean260 = true;
		}
		if (!this.method2940()) {
			return false;
		}
		this.aBoolean256 = true;
		this.anInt3547 = arg3;
		this.anInt3559 = arg1;
		this.aClass16_Sub3_17.method6014(this.aClass89_2);
		this.aClass89_2.method2926(0);
		this.aClass16_Sub3_17.method5951(-this.anInt3559, this.anInt3552 + this.anInt3547 - this.aClass16_Sub3_17.anInt7270);
		return true;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)Z")
	public boolean method2938() {
		return this.aClass89_2 != null;
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "(I)Z")
	private boolean method2940() {
		if (this.aBoolean259) {
			if (this.aClass8_Sub5_Sub5_1 != null) {
				this.aClass8_Sub5_Sub5_1.method2409();
				this.aClass8_Sub5_Sub5_1 = null;
			}
			if (this.aClass20_Sub4_2 != null) {
				this.aClass20_Sub4_2.method7614();
				this.aClass20_Sub4_2 = null;
			}
			if (this.aClass89_3 != null) {
				this.aClass8_Sub5_Sub5_1 = new Class8_Sub5_Sub5(this.aClass16_Sub3_17, 6402, this.anInt3554, this.anInt3552, this.aClass16_Sub3_17.anInt7335);
			}
			if (this.aBoolean261) {
				this.aClass20_Sub4_2 = new Class20_Sub4(this.aClass16_Sub3_17, 34037, 6402, this.anInt3554, this.anInt3552);
			} else if (this.aClass8_Sub5_Sub5_1 == null) {
				this.aClass8_Sub5_Sub5_1 = new Class8_Sub5_Sub5(this.aClass16_Sub3_17, 6402, this.anInt3554, this.anInt3552);
			}
			this.aBoolean257 = true;
			this.aBoolean259 = false;
			this.aBoolean258 = true;
		}
		if (this.aBoolean260) {
			if (this.aClass8_Sub5_Sub5_2 != null) {
				this.aClass8_Sub5_Sub5_2.method2409();
				this.aClass8_Sub5_Sub5_2 = null;
			}
			if (this.aClass20_Sub4Array1[0] != null) {
				this.aClass20_Sub4Array1[0].method7614();
				this.aClass20_Sub4Array1[0] = null;
			}
			if (this.aClass20_Sub4Array1[1] != null) {
				this.aClass20_Sub4Array1[1].method7614();
				this.aClass20_Sub4Array1[1] = null;
			}
			if (this.aClass89_3 != null) {
				this.aClass8_Sub5_Sub5_2 = new Class8_Sub5_Sub5(this.aClass16_Sub3_17, this.anInt3562, this.anInt3554, this.anInt3552, this.aClass16_Sub3_17.anInt7335);
			}
			this.aClass20_Sub4Array1[0] = new Class20_Sub4(this.aClass16_Sub3_17, 34037, this.anInt3562, this.anInt3554, this.anInt3552);
			this.aClass20_Sub4Array1[1] = this.anInt3561 <= 1 ? null : new Class20_Sub4(this.aClass16_Sub3_17, 34037, this.anInt3562, this.anInt3554, this.anInt3552);
			this.aBoolean257 = true;
			this.aBoolean258 = true;
			this.aBoolean260 = false;
		}
		if (this.aBoolean258) {
			if (this.aClass89_3 == null) {
				this.aClass16_Sub3_17.method6014(this.aClass89_1);
				this.aClass89_1.method2932(0);
				this.aClass89_1.method2932(1);
				this.aClass89_1.method2932(8);
				this.aClass89_1.method2930(0, this.aClass20_Sub4Array1[0]);
				if (this.anInt3561 > 1) {
					this.aClass89_1.method2930(1, this.aClass20_Sub4Array1[1]);
				}
				if (this.aBoolean261) {
					this.aClass89_1.method2930(8, this.aClass20_Sub4_2);
				} else {
					this.aClass89_1.method2924(this.aClass8_Sub5_Sub5_1, 8);
				}
				this.aClass16_Sub3_17.method6016(this.aClass89_1);
			} else {
				this.aClass16_Sub3_17.method6014(this.aClass89_1);
				this.aClass89_1.method2932(0);
				this.aClass89_1.method2932(1);
				this.aClass89_1.method2932(8);
				this.aClass89_1.method2930(0, this.aClass20_Sub4Array1[0]);
				if (this.anInt3561 > 1) {
					this.aClass89_1.method2930(1, this.aClass20_Sub4Array1[1]);
				}
				if (this.aBoolean261) {
					this.aClass89_1.method2930(8, this.aClass20_Sub4_2);
				}
				this.aClass16_Sub3_17.method6016(this.aClass89_1);
				this.aClass16_Sub3_17.method6014(this.aClass89_3);
				this.aClass89_3.method2932(0);
				this.aClass89_3.method2932(8);
				this.aClass89_3.method2924(this.aClass8_Sub5_Sub5_2, 0);
				this.aClass89_3.method2924(this.aClass8_Sub5_Sub5_1, 8);
				this.aClass16_Sub3_17.method6016(this.aClass89_3);
			}
			this.aBoolean257 = true;
			this.aBoolean258 = false;
		}
		if (this.aBoolean257) {
			this.aClass16_Sub3_17.method6014(this.aClass89_2);
			this.aBoolean257 = !this.aClass89_2.method2925();
			this.aClass16_Sub3_17.method6016(this.aClass89_2);
		}
		return !this.aBoolean257;
	}

	@OriginalMember(owner = "client!es", name = "e", descriptor = "(I)V")
	private void method2941() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(25) int local25;
		for (@Pc(19) Class8_Sub32 local19 = (Class8_Sub32) this.aClass43_22.method1422(); local19 != null; local19 = (Class8_Sub32) this.aClass43_22.method1426()) {
			local25 = local19.method4959();
			local11 += local19.method4958();
			if (local9 < local25) {
				local9 = local25;
			}
			local7 |= local19.method4952();
		}
		if (local9 == 2) {
			local25 = 34836;
		} else if (local9 == 1) {
			local25 = 34842;
		} else {
			local25 = 6408;
		}
		if (local25 != this.anInt3562) {
			this.anInt3562 = local25;
			this.aBoolean260 = true;
		}
		@Pc(93) int local93 = this.anInt3561 <= 2 ? this.anInt3561 : 2;
		@Pc(102) int local102 = local11 > 2 ? 2 : local11;
		this.anInt3561 = local11;
		if (local93 != local102) {
			this.aBoolean258 = this.aBoolean260 = true;
		}
		if (local7 != this.aBoolean261) {
			this.aBoolean261 = local7;
			this.aBoolean259 = true;
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ILclient!ns;)V")
	public void method2942(@OriginalArg(1) Class8_Sub32 arg0) {
		arg0.aBoolean432 = false;
		arg0.method4950();
		arg0.method8640();
		this.method2941();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	public void method2943() {
		this.aClass89_2 = this.aClass89_3 = this.aClass89_1 = null;
		this.aClass20_Sub4Array1 = null;
		this.aClass20_Sub4_2 = null;
		this.aClass8_Sub5_Sub5_2 = null;
		this.aClass8_Sub5_Sub5_1 = null;
		if (!this.aClass43_22.method1420()) {
			for (@Pc(42) Class8 local42 = this.aClass43_22.method1422(); local42 != this.aClass43_22.aClass8_37; local42 = local42.aClass8_300) {
				((Class8_Sub32) local42).method4950();
			}
		}
		this.anInt3554 = this.anInt3552 = 1;
	}
}
