import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hl")
public final class Class157 {

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "Z")
	private boolean aBoolean332;

	@OriginalMember(owner = "client!hl", name = "n", descriptor = "Lclient!sb;")
	private Class161_Sub1 aClass161_Sub1_2;

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "Lclient!jv;")
	private Class14_Sub2_Sub13 aClass14_Sub2_Sub13_1;

	@OriginalMember(owner = "client!hl", name = "E", descriptor = "Lclient!jv;")
	private Class14_Sub2_Sub13 aClass14_Sub2_Sub13_2;

	@OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
	private int anInt4379 = 0;

	@OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
	private int anInt4381 = 0;

	@OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
	private int anInt4387 = 1;

	@OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
	private int anInt4376 = 1;

	@OriginalMember(owner = "client!hl", name = "C", descriptor = "Lclient!bd;")
	private final Class32 aClass32_22 = new Class32();

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "Z")
	private boolean aBoolean334 = false;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "Z")
	private boolean aBoolean336 = true;

	@OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
	private int anInt4389 = 0;

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "Z")
	private boolean aBoolean333 = true;

	@OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
	private int anInt4390 = -1;

	@OriginalMember(owner = "client!hl", name = "q", descriptor = "Z")
	private boolean aBoolean335 = true;

	@OriginalMember(owner = "client!hl", name = "w", descriptor = "Z")
	private boolean aBoolean337 = true;

	@OriginalMember(owner = "client!hl", name = "D", descriptor = "[Lclient!sb;")
	private Class161_Sub1[] aClass161_Sub1Array1 = new Class161_Sub1[2];

	@OriginalMember(owner = "client!hl", name = "f", descriptor = "Lclient!pi;")
	private final Class144_Sub3 aClass144_Sub3_13;

	@OriginalMember(owner = "client!hl", name = "s", descriptor = "Lclient!lda;")
	private Class217 aClass217_1;

	@OriginalMember(owner = "client!hl", name = "F", descriptor = "Lclient!lda;")
	private Class217 aClass217_2;

	@OriginalMember(owner = "client!hl", name = "p", descriptor = "Lclient!lda;")
	private Class217 aClass217_3;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lclient!pi;)V")
	public Class157(@OriginalArg(0) Class144_Sub3 arg0) {
		this.aClass144_Sub3_13 = arg0;
		if (this.aClass144_Sub3_13.aBoolean576 && this.aClass144_Sub3_13.aBoolean575) {
			this.aClass217_2 = this.aClass217_1 = new Class217(this.aClass144_Sub3_13);
			if (this.aClass144_Sub3_13.anInt8051 > 1 && this.aClass144_Sub3_13.aBoolean558 && this.aClass144_Sub3_13.aBoolean561) {
				this.aClass217_2 = this.aClass217_3 = new Class217(this.aClass144_Sub3_13);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZIII)Z")
	public boolean method3841(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass217_2 == null || this.aClass32_22.method591()) {
			return false;
		}
		if (arg1 != this.anInt4376 || this.anInt4387 != arg0) {
			this.anInt4376 = arg1;
			this.anInt4387 = arg0;
			for (@Pc(52) Class14 local52 = this.aClass32_22.method584(); local52 != this.aClass32_22.aClass14_27; local52 = local52.aClass14_339) {
				((Class14_Sub5) local52).method5488(this.anInt4387, this.anInt4376);
			}
			this.aBoolean337 = true;
			this.aBoolean335 = true;
			this.aBoolean336 = true;
		}
		if (!this.method3851()) {
			return false;
		}
		this.anInt4379 = arg2;
		this.anInt4381 = arg3;
		this.aBoolean332 = true;
		this.aClass144_Sub3_13.method7006(this.aClass217_2);
		this.aClass217_2.method5180(0);
		this.aClass144_Sub3_13.method7052(this.anInt4387 + this.anInt4381 - this.aClass144_Sub3_13.anInt7942, -this.anInt4379);
		return true;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(ILclient!aw;)V")
	public void method3842(@OriginalArg(1) Class14_Sub5 arg0) {
		arg0.aBoolean435 = false;
		arg0.method5491();
		arg0.method9513();
		this.method3843();
	}

	@OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)V")
	private void method3843() {
		@Pc(5) boolean local5 = false;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		@Pc(20) int local20;
		for (@Pc(15) Class14_Sub5 local15 = (Class14_Sub5) this.aClass32_22.method584(); local15 != null; local15 = (Class14_Sub5) this.aClass32_22.method577()) {
			local20 = local15.method5494();
			local9 += local15.method5486();
			if (local20 > local7) {
				local7 = local20;
			}
			local5 |= local15.method5489();
		}
		if (local7 == 2) {
			local20 = 34836;
		} else if (local7 == 1) {
			local20 = 34842;
		} else {
			local20 = 6408;
		}
		if (this.anInt4390 != local20) {
			this.anInt4390 = local20;
			this.aBoolean337 = true;
		}
		@Pc(98) int local98 = this.anInt4389 <= 2 ? this.anInt4389 : 2;
		@Pc(106) int local106 = local9 > 2 ? 2 : local9;
		if (local106 != local98) {
			this.aBoolean335 = this.aBoolean337 = true;
		}
		if (local5 != this.aBoolean334) {
			this.aBoolean336 = true;
			this.aBoolean334 = local5;
		}
		this.anInt4389 = local9;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)V")
	public void method3845() {
		this.aClass161_Sub1_2 = null;
		this.aClass14_Sub2_Sub13_2 = null;
		this.aClass217_2 = this.aClass217_3 = this.aClass217_1 = null;
		this.aClass14_Sub2_Sub13_1 = null;
		this.aClass161_Sub1Array1 = null;
		if (!this.aClass32_22.method591()) {
			for (@Pc(34) Class14 local34 = this.aClass32_22.method584(); local34 != this.aClass32_22.aClass14_27; local34 = local34.aClass14_339) {
				((Class14_Sub5) local34).method5491();
			}
		}
		this.anInt4376 = this.anInt4387 = 1;
	}

	@OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
	public void method3847() {
		if (!this.aBoolean332) {
			return;
		}
		if (this.aClass217_3 != null) {
			this.aClass144_Sub3_13.method7004(this.aClass217_3);
			@Pc(21) short local21 = 16384;
			this.aClass144_Sub3_13.method6986(this.aClass217_1);
			this.aClass217_3.method5181();
			this.aClass217_1.method5180(0);
			if (this.aBoolean334) {
				local21 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4376, this.anInt4387, 0, 0, this.anInt4376, this.anInt4387, local21, 9728);
			this.aClass144_Sub3_13.method7010(this.aClass217_3);
			this.aClass144_Sub3_13.method7019(this.aClass217_1);
		}
		this.aClass144_Sub3_13.method7033();
		this.aClass144_Sub3_13.method7054(0);
		this.aClass144_Sub3_13.method6988(1);
		this.aClass144_Sub3_13.la();
		@Pc(96) int local96 = 0;
		@Pc(98) int local98 = 1;
		@Pc(124) Class14_Sub5 local124;
		for (@Pc(114) Class14_Sub5 local114 = (Class14_Sub5) this.aClass32_22.method584(); local114 != null; local114 = local124) {
			local124 = (Class14_Sub5) this.aClass32_22.method577();
			@Pc(128) int local128 = local114.method5486();
			for (@Pc(130) int local130 = 0; local130 < local128; local130++) {
				local114.method5493(this.aClass161_Sub1_2, local130, this.aClass161_Sub1Array1[local96]);
				if (local124 == null && local128 - 1 == local130) {
					this.aClass144_Sub3_13.method7030(this.aClass217_1);
					this.aClass144_Sub3_13.method7052(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4387);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4379, this.anInt4381);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4379, this.anInt4381 + this.anInt4387);
					OpenGL.glTexCoord2f((float) this.anInt4376, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4379 + this.anInt4376, this.anInt4387 + this.anInt4381);
					OpenGL.glTexCoord2f((float) this.anInt4376, (float) this.anInt4387);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4379 + this.anInt4376, this.anInt4381);
					OpenGL.glEnd();
				} else {
					this.aClass217_1.method5180(--local98);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4387);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, this.anInt4387);
					OpenGL.glTexCoord2f((float) this.anInt4376, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4376, this.anInt4387);
					OpenGL.glTexCoord2f((float) this.anInt4376, (float) this.anInt4387);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4376, 0);
					OpenGL.glEnd();
				}
				local114.method5485(local130);
				local98 = local98 + 1 & 0x1;
				local96 = local96 + 1 & 0x1;
			}
		}
		this.aBoolean332 = false;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILclient!aw;)Z")
	public boolean method3848(@OriginalArg(1) Class14_Sub5 arg0) {
		if (this.aClass217_2 != null) {
			if (arg0.method5490() || arg0.method5496()) {
				this.aClass32_22.method582(arg0);
				this.method3843();
				if (this.method3851()) {
					if (this.anInt4376 != -1 && this.anInt4387 != -1) {
						arg0.method5488(this.anInt4387, this.anInt4376);
					}
					arg0.aBoolean435 = true;
					return true;
				}
			}
			this.method3842(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)Z")
	public boolean method3849() {
		return this.aClass217_2 != null;
	}

	@OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)Z")
	private boolean method3851() {
		if (this.aBoolean336) {
			if (this.aClass14_Sub2_Sub13_1 != null) {
				this.aClass14_Sub2_Sub13_1.method4872();
				this.aClass14_Sub2_Sub13_1 = null;
			}
			if (this.aClass161_Sub1_2 != null) {
				this.aClass161_Sub1_2.method9167();
				this.aClass161_Sub1_2 = null;
			}
			if (this.aClass217_3 != null) {
				this.aClass14_Sub2_Sub13_1 = new Class14_Sub2_Sub13(this.aClass144_Sub3_13, 6402, this.anInt4376, this.anInt4387, this.aClass144_Sub3_13.anInt8051);
			}
			if (this.aBoolean334) {
				this.aClass161_Sub1_2 = new Class161_Sub1(this.aClass144_Sub3_13, 34037, 6402, this.anInt4376, this.anInt4387);
			} else if (this.aClass14_Sub2_Sub13_1 == null) {
				this.aClass14_Sub2_Sub13_1 = new Class14_Sub2_Sub13(this.aClass144_Sub3_13, 6402, this.anInt4376, this.anInt4387);
			}
			this.aBoolean333 = true;
			this.aBoolean336 = false;
			this.aBoolean335 = true;
		}
		if (this.aBoolean337) {
			if (this.aClass14_Sub2_Sub13_2 != null) {
				this.aClass14_Sub2_Sub13_2.method4872();
				this.aClass14_Sub2_Sub13_2 = null;
			}
			if (this.aClass161_Sub1Array1[0] != null) {
				this.aClass161_Sub1Array1[0].method9167();
				this.aClass161_Sub1Array1[0] = null;
			}
			if (this.aClass161_Sub1Array1[1] != null) {
				this.aClass161_Sub1Array1[1].method9167();
				this.aClass161_Sub1Array1[1] = null;
			}
			if (this.aClass217_3 != null) {
				this.aClass14_Sub2_Sub13_2 = new Class14_Sub2_Sub13(this.aClass144_Sub3_13, this.anInt4390, this.anInt4376, this.anInt4387, this.aClass144_Sub3_13.anInt8051);
			}
			this.aClass161_Sub1Array1[0] = new Class161_Sub1(this.aClass144_Sub3_13, 34037, this.anInt4390, this.anInt4376, this.anInt4387);
			this.aClass161_Sub1Array1[1] = this.anInt4389 <= 1 ? null : new Class161_Sub1(this.aClass144_Sub3_13, 34037, this.anInt4390, this.anInt4376, this.anInt4387);
			this.aBoolean335 = true;
			this.aBoolean337 = false;
			this.aBoolean333 = true;
		}
		if (this.aBoolean335) {
			if (this.aClass217_3 == null) {
				this.aClass144_Sub3_13.method7006(this.aClass217_1);
				this.aClass217_1.method5187(0);
				this.aClass217_1.method5187(1);
				this.aClass217_1.method5187(8);
				this.aClass217_1.method5186(0, this.aClass161_Sub1Array1[0]);
				if (this.anInt4389 > 1) {
					this.aClass217_1.method5186(1, this.aClass161_Sub1Array1[1]);
				}
				if (this.aBoolean334) {
					this.aClass217_1.method5186(8, this.aClass161_Sub1_2);
				} else {
					this.aClass217_1.method5189(this.aClass14_Sub2_Sub13_1, 8);
				}
				this.aClass144_Sub3_13.method7030(this.aClass217_1);
			} else {
				this.aClass144_Sub3_13.method7006(this.aClass217_1);
				this.aClass217_1.method5187(0);
				this.aClass217_1.method5187(1);
				this.aClass217_1.method5187(8);
				this.aClass217_1.method5186(0, this.aClass161_Sub1Array1[0]);
				if (this.anInt4389 > 1) {
					this.aClass217_1.method5186(1, this.aClass161_Sub1Array1[1]);
				}
				if (this.aBoolean334) {
					this.aClass217_1.method5186(8, this.aClass161_Sub1_2);
				}
				this.aClass144_Sub3_13.method7030(this.aClass217_1);
				this.aClass144_Sub3_13.method7006(this.aClass217_3);
				this.aClass217_3.method5187(0);
				this.aClass217_3.method5187(8);
				this.aClass217_3.method5189(this.aClass14_Sub2_Sub13_2, 0);
				this.aClass217_3.method5189(this.aClass14_Sub2_Sub13_1, 8);
				this.aClass144_Sub3_13.method7030(this.aClass217_3);
			}
			this.aBoolean335 = false;
			this.aBoolean333 = true;
		}
		if (this.aBoolean333) {
			this.aClass144_Sub3_13.method7006(this.aClass217_2);
			this.aBoolean333 = !this.aClass217_2.method5184();
			this.aClass144_Sub3_13.method7030(this.aClass217_2);
		}
		return !this.aBoolean333;
	}
}
