import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lg")
public final class Class175 {

	@OriginalMember(owner = "client!lg", name = "z", descriptor = "Z")
	private boolean aBoolean375;

	@OriginalMember(owner = "client!lg", name = "C", descriptor = "Lclient!kh;")
	private Class2_Sub13_Sub8 aClass2_Sub13_Sub8_1;

	@OriginalMember(owner = "client!lg", name = "F", descriptor = "Lclient!kh;")
	private Class2_Sub13_Sub8 aClass2_Sub13_Sub8_2;

	@OriginalMember(owner = "client!lg", name = "J", descriptor = "Lclient!ot;")
	private Class19_Sub2 aClass19_Sub2_4;

	@OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
	private int anInt4983 = 1;

	@OriginalMember(owner = "client!lg", name = "q", descriptor = "I")
	private int anInt4988 = 0;

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
	private int anInt4978 = 0;

	@OriginalMember(owner = "client!lg", name = "u", descriptor = "I")
	private int anInt4991 = 1;

	@OriginalMember(owner = "client!lg", name = "x", descriptor = "Lclient!rk;")
	private final Class249 aClass249_24 = new Class249();

	@OriginalMember(owner = "client!lg", name = "A", descriptor = "[Lclient!ot;")
	private Class19_Sub2[] aClass19_Sub2Array4 = new Class19_Sub2[2];

	@OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
	private int anInt4995 = -1;

	@OriginalMember(owner = "client!lg", name = "D", descriptor = "Z")
	private boolean aBoolean377 = true;

	@OriginalMember(owner = "client!lg", name = "H", descriptor = "Z")
	private boolean aBoolean379 = false;

	@OriginalMember(owner = "client!lg", name = "I", descriptor = "Z")
	private boolean aBoolean380 = true;

	@OriginalMember(owner = "client!lg", name = "B", descriptor = "Z")
	private boolean aBoolean376 = true;

	@OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
	private int anInt4996 = 0;

	@OriginalMember(owner = "client!lg", name = "G", descriptor = "Z")
	private boolean aBoolean378 = true;

	@OriginalMember(owner = "client!lg", name = "e", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_23;

	@OriginalMember(owner = "client!lg", name = "j", descriptor = "Lclient!vb;")
	private Class293 aClass293_3;

	@OriginalMember(owner = "client!lg", name = "s", descriptor = "Lclient!vb;")
	private Class293 aClass293_5;

	@OriginalMember(owner = "client!lg", name = "o", descriptor = "Lclient!vb;")
	private Class293 aClass293_4;

	@OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class175(@OriginalArg(0) Class39_Sub3 arg0) {
		this.aClass39_Sub3_23 = arg0;
		if (this.aClass39_Sub3_23.aBoolean484 && this.aClass39_Sub3_23.aBoolean506) {
			this.aClass293_5 = this.aClass293_3 = new Class293(this.aClass39_Sub3_23);
			if (this.aClass39_Sub3_23.anInt6711 > 1 && this.aClass39_Sub3_23.aBoolean511 && this.aClass39_Sub3_23.aBoolean502) {
				this.aClass293_5 = this.aClass293_4 = new Class293(this.aClass39_Sub3_23);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V")
	public void method4343() {
		if (!this.aBoolean375) {
			return;
		}
		if (this.aClass293_4 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass39_Sub3_23.method5693(this.aClass293_4);
			this.aClass39_Sub3_23.method5701(this.aClass293_3);
			this.aClass293_4.method7370();
			this.aClass293_3.method7361(0);
			if (this.aBoolean379) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt4991, this.anInt4983, 0, 0, this.anInt4991, this.anInt4983, local14, 9728);
			this.aClass39_Sub3_23.method5706(this.aClass293_4);
			this.aClass39_Sub3_23.method5683(this.aClass293_3);
		}
		this.aClass39_Sub3_23.method5722();
		this.aClass39_Sub3_23.method5704(0);
		this.aClass39_Sub3_23.method5699(1);
		this.aClass39_Sub3_23.n();
		@Pc(93) int local93 = 0;
		@Pc(95) int local95 = 1;
		@Pc(109) Class2_Sub1 local109;
		for (@Pc(101) Class2_Sub1 local101 = (Class2_Sub1) this.aClass249_24.method6527(); local101 != null; local101 = local109) {
			local109 = (Class2_Sub1) this.aClass249_24.method6525();
			@Pc(113) int local113 = local101.method249();
			for (@Pc(115) int local115 = 0; local115 < local113; local115++) {
				local101.method247(local115, this.aClass19_Sub2_4, this.aClass19_Sub2Array4[local93]);
				if (local109 == null && local113 - 1 == local115) {
					this.aClass39_Sub3_23.method5696(this.aClass293_3);
					this.aClass39_Sub3_23.method5758(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4983);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4978, this.anInt4988);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4978, this.anInt4983 + this.anInt4988);
					OpenGL.glTexCoord2f((float) this.anInt4991, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4978 + this.anInt4991, this.anInt4988 - -this.anInt4983);
					OpenGL.glTexCoord2f((float) this.anInt4991, (float) this.anInt4983);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4991 + this.anInt4978, this.anInt4988);
					OpenGL.glEnd();
				} else {
					this.aClass293_3.method7361(local95);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt4983);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt4983);
					OpenGL.glTexCoord2f((float) this.anInt4991, (float) this.anInt4983);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt4991, this.anInt4983);
					OpenGL.glTexCoord2f((float) this.anInt4991, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt4991, 0);
					OpenGL.glEnd();
				}
				local93 = local93 + 1 & 0x1;
				local95 = local95 + 1 & 0x1;
				local101.method252(local115);
			}
		}
		this.aBoolean375 = false;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!hq;B)V")
	public void method4344(@OriginalArg(0) Class2_Sub1 arg0) {
		arg0.aBoolean7 = false;
		arg0.method256();
		arg0.method7802();
		this.method4349();
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V")
	public void method4345() {
		this.aClass19_Sub2Array4 = null;
		this.aClass2_Sub13_Sub8_2 = null;
		this.aClass19_Sub2_4 = null;
		this.aClass2_Sub13_Sub8_1 = null;
		this.aClass293_5 = this.aClass293_4 = this.aClass293_3 = null;
		if (!this.aClass249_24.method6519()) {
			for (@Pc(36) Class2 local36 = this.aClass249_24.method6527(); local36 != this.aClass249_24.aClass2_224; local36 = local36.aClass2_284) {
				((Class2_Sub1) local36).method256();
			}
		}
		this.anInt4991 = this.anInt4983 = 1;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lclient!hq;Z)Z")
	public boolean method4348(@OriginalArg(0) Class2_Sub1 arg0) {
		if (this.aClass293_5 != null) {
			if (arg0.method245() || arg0.method258()) {
				this.aClass249_24.method6523(arg0);
				this.method4349();
				if (this.method4353()) {
					if (this.anInt4991 != -1 && this.anInt4983 != -1) {
						arg0.method250(this.anInt4983, this.anInt4991);
					}
					arg0.aBoolean7 = true;
					return true;
				}
			}
			this.method4344(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
	private void method4349() {
		@Pc(7) boolean local7 = false;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(23) int local23;
		for (@Pc(17) Class2_Sub1 local17 = (Class2_Sub1) this.aClass249_24.method6527(); local17 != null; local17 = (Class2_Sub1) this.aClass249_24.method6525()) {
			local23 = local17.method246();
			local11 += local17.method249();
			if (local23 > local9) {
				local9 = local23;
			}
			local7 |= local17.method255();
		}
		if (local9 == 2) {
			local23 = 34836;
		} else if (local9 == 1) {
			local23 = 34842;
		} else {
			local23 = 6408;
		}
		if (this.anInt4995 != local23) {
			this.anInt4995 = local23;
			this.aBoolean376 = true;
		}
		@Pc(93) int local93 = this.anInt4996 > 2 ? 2 : this.anInt4996;
		@Pc(102) int local102 = local11 <= 2 ? local11 : 2;
		if (this.aBoolean379 != local7) {
			this.aBoolean379 = local7;
			this.aBoolean378 = true;
		}
		if (local102 != local93) {
			this.aBoolean377 = this.aBoolean376 = true;
		}
		this.anInt4996 = local11;
	}

	@OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIII)Z")
	public boolean method4350(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass293_5 == null || this.aClass249_24.method6519()) {
			return false;
		}
		if (this.anInt4991 != arg1 || arg3 != this.anInt4983) {
			this.anInt4983 = arg3;
			this.anInt4991 = arg1;
			for (@Pc(34) Class2 local34 = this.aClass249_24.method6527(); local34 != this.aClass249_24.aClass2_224; local34 = local34.aClass2_284) {
				((Class2_Sub1) local34).method250(this.anInt4983, this.anInt4991);
			}
			this.aBoolean376 = true;
			this.aBoolean377 = true;
			this.aBoolean378 = true;
		}
		if (!this.method4353()) {
			return false;
		}
		this.aBoolean375 = true;
		this.anInt4978 = arg0;
		this.anInt4988 = arg2;
		this.aClass39_Sub3_23.method5697(this.aClass293_5);
		this.aClass293_5.method7361(0);
		this.aClass39_Sub3_23.method5758(this.anInt4983 - this.aClass293_5.method7365() - this.anInt4988, -this.anInt4978);
		return true;
	}

	@OriginalMember(owner = "client!lg", name = "d", descriptor = "(I)Z")
	public boolean method4351() {
		return this.aClass293_5 != null;
	}

	@OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)Z")
	private boolean method4353() {
		if (this.aBoolean378) {
			if (this.aClass2_Sub13_Sub8_2 != null) {
				this.aClass2_Sub13_Sub8_2.method3956();
				this.aClass2_Sub13_Sub8_2 = null;
			}
			if (this.aClass19_Sub2_4 != null) {
				this.aClass19_Sub2_4.method4800();
				this.aClass19_Sub2_4 = null;
			}
			if (this.aClass293_4 != null) {
				this.aClass2_Sub13_Sub8_2 = new Class2_Sub13_Sub8(this.aClass39_Sub3_23, 6402, this.anInt4991, this.anInt4983, this.aClass39_Sub3_23.anInt6711);
			}
			if (this.aBoolean379) {
				this.aClass19_Sub2_4 = new Class19_Sub2(this.aClass39_Sub3_23, 34037, 6402, this.anInt4991, this.anInt4983);
			} else if (this.aClass2_Sub13_Sub8_2 == null) {
				this.aClass2_Sub13_Sub8_2 = new Class2_Sub13_Sub8(this.aClass39_Sub3_23, 6402, this.anInt4991, this.anInt4983);
			}
			this.aBoolean377 = true;
			this.aBoolean378 = false;
			this.aBoolean380 = true;
		}
		if (this.aBoolean376) {
			if (this.aClass2_Sub13_Sub8_1 != null) {
				this.aClass2_Sub13_Sub8_1.method3956();
				this.aClass2_Sub13_Sub8_1 = null;
			}
			if (this.aClass19_Sub2Array4[0] != null) {
				this.aClass19_Sub2Array4[0].method4800();
				this.aClass19_Sub2Array4[0] = null;
			}
			if (this.aClass19_Sub2Array4[1] != null) {
				this.aClass19_Sub2Array4[1].method4800();
				this.aClass19_Sub2Array4[1] = null;
			}
			if (this.aClass293_4 != null) {
				this.aClass2_Sub13_Sub8_1 = new Class2_Sub13_Sub8(this.aClass39_Sub3_23, this.anInt4995, this.anInt4991, this.anInt4983, this.aClass39_Sub3_23.anInt6711);
			}
			this.aClass19_Sub2Array4[0] = new Class19_Sub2(this.aClass39_Sub3_23, 34037, this.anInt4995, this.anInt4991, this.anInt4983);
			this.aClass19_Sub2Array4[1] = this.anInt4996 <= 1 ? null : new Class19_Sub2(this.aClass39_Sub3_23, 34037, this.anInt4995, this.anInt4991, this.anInt4983);
			this.aBoolean377 = true;
			this.aBoolean376 = false;
			this.aBoolean380 = true;
		}
		if (this.aBoolean377) {
			if (this.aClass293_4 == null) {
				this.aClass39_Sub3_23.method5697(this.aClass293_3);
				this.aClass293_3.method7367(0);
				this.aClass293_3.method7367(1);
				this.aClass293_3.method7367(8);
				this.aClass293_3.method7372(this.aClass19_Sub2Array4[0], 0);
				if (this.anInt4996 > 1) {
					this.aClass293_3.method7372(this.aClass19_Sub2Array4[1], 1);
				}
				if (this.aBoolean379) {
					this.aClass293_3.method7372(this.aClass19_Sub2_4, 8);
				} else {
					this.aClass293_3.method7371(this.aClass2_Sub13_Sub8_2, 8);
				}
				this.aClass39_Sub3_23.method5696(this.aClass293_3);
			} else {
				this.aClass39_Sub3_23.method5697(this.aClass293_3);
				this.aClass293_3.method7367(0);
				this.aClass293_3.method7367(1);
				this.aClass293_3.method7367(8);
				this.aClass293_3.method7372(this.aClass19_Sub2Array4[0], 0);
				if (this.anInt4996 > 1) {
					this.aClass293_3.method7372(this.aClass19_Sub2Array4[1], 1);
				}
				if (this.aBoolean379) {
					this.aClass293_3.method7372(this.aClass19_Sub2_4, 8);
				}
				this.aClass39_Sub3_23.method5696(this.aClass293_3);
				this.aClass39_Sub3_23.method5697(this.aClass293_4);
				this.aClass293_4.method7367(0);
				this.aClass293_4.method7367(8);
				this.aClass293_4.method7371(this.aClass2_Sub13_Sub8_1, 0);
				this.aClass293_4.method7371(this.aClass2_Sub13_Sub8_2, 8);
				this.aClass39_Sub3_23.method5696(this.aClass293_4);
			}
			this.aBoolean380 = true;
			this.aBoolean377 = false;
		}
		if (this.aBoolean380) {
			this.aClass39_Sub3_23.method5697(this.aClass293_5);
			this.aBoolean380 = !this.aClass293_5.method7368();
			this.aClass39_Sub3_23.method5696(this.aClass293_5);
		}
		return !this.aBoolean380;
	}
}
