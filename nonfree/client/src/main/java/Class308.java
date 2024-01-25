import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!to")
public final class Class308 {

	@OriginalMember(owner = "client!to", name = "p", descriptor = "Z")
	private boolean aBoolean561;

	@OriginalMember(owner = "client!to", name = "A", descriptor = "Lclient!ga;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_1;

	@OriginalMember(owner = "client!to", name = "E", descriptor = "Lclient!qw;")
	private Class35_Sub3 aClass35_Sub3_5;

	@OriginalMember(owner = "client!to", name = "F", descriptor = "Lclient!ga;")
	private Class6_Sub1_Sub8 aClass6_Sub1_Sub8_2;

	@OriginalMember(owner = "client!to", name = "s", descriptor = "I")
	private int anInt8261 = 0;

	@OriginalMember(owner = "client!to", name = "w", descriptor = "I")
	private int anInt8265 = 1;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "I")
	private int anInt8249 = 1;

	@OriginalMember(owner = "client!to", name = "o", descriptor = "I")
	private int anInt8258 = 0;

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Lclient!rh;")
	private final Class275 aClass275_174 = new Class275();

	@OriginalMember(owner = "client!to", name = "C", descriptor = "Z")
	private boolean aBoolean563 = false;

	@OriginalMember(owner = "client!to", name = "B", descriptor = "Z")
	private boolean aBoolean562 = true;

	@OriginalMember(owner = "client!to", name = "z", descriptor = "[Lclient!qw;")
	private Class35_Sub3[] aClass35_Sub3Array4 = new Class35_Sub3[2];

	@OriginalMember(owner = "client!to", name = "D", descriptor = "Z")
	private boolean aBoolean564 = true;

	@OriginalMember(owner = "client!to", name = "H", descriptor = "Z")
	private boolean aBoolean565 = true;

	@OriginalMember(owner = "client!to", name = "G", descriptor = "I")
	private int anInt8267 = 0;

	@OriginalMember(owner = "client!to", name = "I", descriptor = "I")
	private int anInt8268 = -1;

	@OriginalMember(owner = "client!to", name = "J", descriptor = "Z")
	private boolean aBoolean566 = true;

	@OriginalMember(owner = "client!to", name = "n", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_37;

	@OriginalMember(owner = "client!to", name = "e", descriptor = "Lclient!uf;")
	private Class315 aClass315_5;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!uf;")
	private Class315 aClass315_4;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "Lclient!uf;")
	private Class315 aClass315_6;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class308(@OriginalArg(0) Class121_Sub3 arg0) {
		this.aClass121_Sub3_37 = arg0;
		if (this.aClass121_Sub3_37.aBoolean468 && this.aClass121_Sub3_37.aBoolean464) {
			this.aClass315_4 = this.aClass315_5 = new Class315(this.aClass121_Sub3_37);
			if (this.aClass121_Sub3_37.anInt6795 > 1 && this.aClass121_Sub3_37.aBoolean474 && this.aClass121_Sub3_37.aBoolean482) {
				this.aClass315_4 = this.aClass315_6 = new Class315(this.aClass121_Sub3_37);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Z")
	private boolean method6816() {
		if (this.aBoolean566) {
			if (this.aClass6_Sub1_Sub8_2 != null) {
				this.aClass6_Sub1_Sub8_2.method2273();
				this.aClass6_Sub1_Sub8_2 = null;
			}
			if (this.aClass35_Sub3_5 != null) {
				this.aClass35_Sub3_5.method5325();
				this.aClass35_Sub3_5 = null;
			}
			if (this.aClass315_6 != null) {
				this.aClass6_Sub1_Sub8_2 = new Class6_Sub1_Sub8(this.aClass121_Sub3_37, 6402, this.anInt8265, this.anInt8249, this.aClass121_Sub3_37.anInt6795);
			}
			if (this.aBoolean563) {
				this.aClass35_Sub3_5 = new Class35_Sub3(this.aClass121_Sub3_37, 34037, 6402, this.anInt8265, this.anInt8249);
			} else if (this.aClass6_Sub1_Sub8_2 == null) {
				this.aClass6_Sub1_Sub8_2 = new Class6_Sub1_Sub8(this.aClass121_Sub3_37, 6402, this.anInt8265, this.anInt8249);
			}
			this.aBoolean565 = true;
			this.aBoolean566 = false;
			this.aBoolean562 = true;
		}
		if (this.aBoolean564) {
			if (this.aClass6_Sub1_Sub8_1 != null) {
				this.aClass6_Sub1_Sub8_1.method2273();
				this.aClass6_Sub1_Sub8_1 = null;
			}
			if (this.aClass35_Sub3Array4[0] != null) {
				this.aClass35_Sub3Array4[0].method5325();
				this.aClass35_Sub3Array4[0] = null;
			}
			if (this.aClass35_Sub3Array4[1] != null) {
				this.aClass35_Sub3Array4[1].method5325();
				this.aClass35_Sub3Array4[1] = null;
			}
			if (this.aClass315_6 != null) {
				this.aClass6_Sub1_Sub8_1 = new Class6_Sub1_Sub8(this.aClass121_Sub3_37, this.anInt8268, this.anInt8265, this.anInt8249, this.aClass121_Sub3_37.anInt6795);
			}
			this.aClass35_Sub3Array4[0] = new Class35_Sub3(this.aClass121_Sub3_37, 34037, this.anInt8268, this.anInt8265, this.anInt8249);
			this.aClass35_Sub3Array4[1] = this.anInt8267 <= 1 ? null : new Class35_Sub3(this.aClass121_Sub3_37, 34037, this.anInt8268, this.anInt8265, this.anInt8249);
			this.aBoolean565 = true;
			this.aBoolean562 = true;
			this.aBoolean564 = false;
		}
		if (this.aBoolean565) {
			if (this.aClass315_6 == null) {
				this.aClass121_Sub3_37.method5701(this.aClass315_5);
				this.aClass315_5.method7060(0);
				this.aClass315_5.method7060(1);
				this.aClass315_5.method7060(8);
				this.aClass315_5.method7050(this.aClass35_Sub3Array4[0], 0);
				if (this.anInt8267 > 1) {
					this.aClass315_5.method7050(this.aClass35_Sub3Array4[1], 1);
				}
				if (this.aBoolean563) {
					this.aClass315_5.method7050(this.aClass35_Sub3_5, 8);
				} else {
					this.aClass315_5.method7053(this.aClass6_Sub1_Sub8_2, 8);
				}
				this.aClass121_Sub3_37.method5682(this.aClass315_5);
			} else {
				this.aClass121_Sub3_37.method5701(this.aClass315_5);
				this.aClass315_5.method7060(0);
				this.aClass315_5.method7060(1);
				this.aClass315_5.method7060(8);
				this.aClass315_5.method7050(this.aClass35_Sub3Array4[0], 0);
				if (this.anInt8267 > 1) {
					this.aClass315_5.method7050(this.aClass35_Sub3Array4[1], 1);
				}
				if (this.aBoolean563) {
					this.aClass315_5.method7050(this.aClass35_Sub3_5, 8);
				}
				this.aClass121_Sub3_37.method5682(this.aClass315_5);
				this.aClass121_Sub3_37.method5701(this.aClass315_6);
				this.aClass315_6.method7060(0);
				this.aClass315_6.method7060(8);
				this.aClass315_6.method7053(this.aClass6_Sub1_Sub8_1, 0);
				this.aClass315_6.method7053(this.aClass6_Sub1_Sub8_2, 8);
				this.aClass121_Sub3_37.method5682(this.aClass315_6);
			}
			this.aBoolean562 = true;
			this.aBoolean565 = false;
		}
		if (this.aBoolean562) {
			this.aClass121_Sub3_37.method5701(this.aClass315_4);
			this.aBoolean562 = !this.aClass315_4.method7059();
			this.aClass121_Sub3_37.method5682(this.aClass315_4);
		}
		return !this.aBoolean562;
	}

	@OriginalMember(owner = "client!to", name = "b", descriptor = "(I)V")
	private void method6818() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(31) int local31;
		for (@Pc(25) Class6_Sub27 local25 = (Class6_Sub27) this.aClass275_174.method6366(); local25 != null; local25 = (Class6_Sub27) this.aClass275_174.method6364()) {
			local31 = local25.method4970();
			local11 += local25.method4962();
			if (local9 < local31) {
				local9 = local31;
			}
			local7 |= local25.method4963();
		}
		if (local9 == 2) {
			local31 = 34836;
		} else if (local9 == 1) {
			local31 = 34842;
		} else {
			local31 = 6408;
		}
		if (local31 != this.anInt8268) {
			this.anInt8268 = local31;
			this.aBoolean564 = true;
		}
		@Pc(101) int local101 = this.anInt8267 <= 2 ? this.anInt8267 : 2;
		@Pc(110) int local110 = local11 <= 2 ? local11 : 2;
		if (this.aBoolean563 != local7) {
			this.aBoolean563 = local7;
			this.aBoolean566 = true;
		}
		if (local101 != local110) {
			this.aBoolean565 = this.aBoolean564 = true;
		}
		this.anInt8267 = local11;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIII)Z")
	public boolean method6820(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass315_4 == null || this.aClass275_174.method6371()) {
			return false;
		}
		if (arg2 != this.anInt8265 || this.anInt8249 != arg1) {
			this.anInt8265 = arg2;
			this.anInt8249 = arg1;
			for (@Pc(44) Class6 local44 = this.aClass275_174.method6366(); local44 != this.aClass275_174.aClass6_229; local44 = local44.aClass6_284) {
				((Class6_Sub27) local44).method4972(this.anInt8249, this.anInt8265);
			}
			this.aBoolean564 = true;
			this.aBoolean566 = true;
			this.aBoolean565 = true;
		}
		if (!this.method6816()) {
			return false;
		}
		this.anInt8261 = arg3;
		this.aBoolean561 = true;
		this.anInt8258 = arg0;
		this.aClass121_Sub3_37.method5701(this.aClass315_4);
		this.aClass315_4.method7056(0);
		this.aClass121_Sub3_37.method5683(-this.anInt8261, this.anInt8258 + this.anInt8249 - this.aClass121_Sub3_37.anInt6787);
		return true;
	}

	@OriginalMember(owner = "client!to", name = "d", descriptor = "(I)Z")
	public boolean method6822() {
		return this.aClass315_4 != null;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!jo;B)Z")
	public boolean method6823(@OriginalArg(0) Class6_Sub27 arg0) {
		if (this.aClass315_4 != null) {
			if (arg0.method4973() || arg0.method4964()) {
				this.aClass275_174.method6370(arg0);
				this.method6818();
				if (this.method6816()) {
					if (this.anInt8265 != -1 && this.anInt8249 != -1) {
						arg0.method4972(this.anInt8249, this.anInt8265);
					}
					arg0.aBoolean370 = true;
					return true;
				}
			}
			this.method6825(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!to", name = "e", descriptor = "(I)V")
	public void method6824() {
		if (!this.aBoolean561) {
			return;
		}
		if (this.aClass315_6 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass121_Sub3_37.method5689(this.aClass315_6);
			this.aClass121_Sub3_37.method5699(this.aClass315_5);
			this.aClass315_6.method7057();
			this.aClass315_5.method7056(0);
			if (this.aBoolean563) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt8265, this.anInt8249, 0, 0, this.anInt8265, this.anInt8249, local14, 9728);
			this.aClass121_Sub3_37.method5652(this.aClass315_6);
			this.aClass121_Sub3_37.method5720(this.aClass315_5);
		}
		this.aClass121_Sub3_37.method5724();
		this.aClass121_Sub3_37.method5707(0);
		this.aClass121_Sub3_37.method5684(1);
		this.aClass121_Sub3_37.F();
		@Pc(91) int local91 = 0;
		@Pc(93) int local93 = 1;
		@Pc(109) Class6_Sub27 local109;
		for (@Pc(99) Class6_Sub27 local99 = (Class6_Sub27) this.aClass275_174.method6366(); local99 != null; local99 = local109) {
			local109 = (Class6_Sub27) this.aClass275_174.method6364();
			@Pc(113) int local113 = local99.method4962();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local99.method4968(this.aClass35_Sub3Array4[local91], this.aClass35_Sub3_5, local115);
				if (local109 == null && local115 == local113 - 1) {
					this.aClass121_Sub3_37.method5682(this.aClass315_5);
					this.aClass121_Sub3_37.method5683(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8249);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8261, this.anInt8258);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8261, this.anInt8249 + this.anInt8258);
					OpenGL.glTexCoord2f((float) this.anInt8265, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8261 + this.anInt8265, this.anInt8249 + this.anInt8258);
					OpenGL.glTexCoord2f((float) this.anInt8265, (float) this.anInt8249);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8265 + this.anInt8261, this.anInt8258);
					OpenGL.glEnd();
				} else {
					this.aClass315_5.method7056(--local93);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt8249);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt8249);
					OpenGL.glTexCoord2f((float) this.anInt8265, (float) this.anInt8249);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt8265, this.anInt8249);
					OpenGL.glTexCoord2f((float) this.anInt8265, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt8265, 0);
					OpenGL.glEnd();
				}
				local91 = local91 + 1 & 0x1;
				local99.method4971(local115);
				local93 = local93 + 1 & 0x1;
			}
		}
		this.aBoolean561 = false;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(Lclient!jo;Z)V")
	public void method6825(@OriginalArg(0) Class6_Sub27 arg0) {
		arg0.aBoolean370 = false;
		arg0.method4967();
		arg0.method7849();
		this.method6818();
	}

	@OriginalMember(owner = "client!to", name = "f", descriptor = "(I)V")
	public void method6827() {
		this.aClass315_4 = this.aClass315_6 = this.aClass315_5 = null;
		this.aClass35_Sub3_5 = null;
		this.aClass6_Sub1_Sub8_1 = null;
		this.aClass6_Sub1_Sub8_2 = null;
		this.aClass35_Sub3Array4 = null;
		if (!this.aClass275_174.method6371()) {
			for (@Pc(44) Class6 local44 = this.aClass275_174.method6366(); local44 != this.aClass275_174.aClass6_229; local44 = local44.aClass6_284) {
				((Class6_Sub27) local44).method4967();
			}
		}
		this.anInt8265 = this.anInt8249 = 1;
	}
}
