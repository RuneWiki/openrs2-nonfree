import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class186 {

	@OriginalMember(owner = "client!pf", name = "g", descriptor = "Z")
	private boolean aBoolean596;

	@OriginalMember(owner = "client!pf", name = "t", descriptor = "Lclient!km;")
	private Class10_Sub1 aClass10_Sub1_4;

	@OriginalMember(owner = "client!pf", name = "v", descriptor = "Lclient!tq;")
	private Class1_Sub5_Sub17 aClass1_Sub5_Sub17_1;

	@OriginalMember(owner = "client!pf", name = "H", descriptor = "Lclient!tq;")
	private Class1_Sub5_Sub17 aClass1_Sub5_Sub17_2;

	@OriginalMember(owner = "client!pf", name = "h", descriptor = "I")
	private int anInt5251 = 0;

	@OriginalMember(owner = "client!pf", name = "i", descriptor = "I")
	private int anInt5252 = 1;

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "I")
	private int anInt5253 = 0;

	@OriginalMember(owner = "client!pf", name = "q", descriptor = "I")
	private int anInt5256 = 1;

	@OriginalMember(owner = "client!pf", name = "p", descriptor = "Lclient!sr;")
	private final Class227 aClass227_31 = new Class227();

	@OriginalMember(owner = "client!pf", name = "x", descriptor = "Z")
	private boolean aBoolean598 = false;

	@OriginalMember(owner = "client!pf", name = "w", descriptor = "Z")
	private boolean aBoolean597 = true;

	@OriginalMember(owner = "client!pf", name = "z", descriptor = "I")
	private int anInt5260 = -1;

	@OriginalMember(owner = "client!pf", name = "C", descriptor = "Z")
	private boolean aBoolean601 = true;

	@OriginalMember(owner = "client!pf", name = "A", descriptor = "Z")
	private boolean aBoolean600 = true;

	@OriginalMember(owner = "client!pf", name = "y", descriptor = "Z")
	private boolean aBoolean599 = true;

	@OriginalMember(owner = "client!pf", name = "B", descriptor = "I")
	private int anInt5261 = 0;

	@OriginalMember(owner = "client!pf", name = "F", descriptor = "[Lclient!km;")
	private Class10_Sub1[] aClass10_Sub1Array2 = new Class10_Sub1[2];

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_26;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!mq;")
	private Class158 aClass158_4;

	@OriginalMember(owner = "client!pf", name = "d", descriptor = "Lclient!mq;")
	private Class158 aClass158_5;

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "Lclient!mq;")
	private Class158 aClass158_3;

	static {
		new Class119("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
		new Class119("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class186(@OriginalArg(0) Class34_Sub2 arg0) {
		this.aClass34_Sub2_26 = arg0;
		if (this.aClass34_Sub2_26.aBoolean774 && this.aClass34_Sub2_26.aBoolean759) {
			this.aClass158_5 = this.aClass158_4 = new Class158(this.aClass34_Sub2_26);
			if (this.aClass34_Sub2_26.anInt7056 > 1 && this.aClass34_Sub2_26.aBoolean765 && this.aClass34_Sub2_26.aBoolean769) {
				this.aClass158_5 = this.aClass158_3 = new Class158(this.aClass34_Sub2_26);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	public void method4139() {
		if (!this.aBoolean596) {
			return;
		}
		if (this.aClass158_3 != null) {
			@Pc(14) short local14 = 16384;
			this.aClass34_Sub2_26.method5485(this.aClass158_3);
			this.aClass34_Sub2_26.method5554(this.aClass158_4);
			this.aClass158_3.method3664();
			this.aClass158_4.method3666(0);
			if (this.aBoolean598) {
				local14 = 16640;
			}
			OpenGL.glBlitFramebufferEXT(0, 0, this.anInt5252, this.anInt5256, 0, 0, this.anInt5252, this.anInt5256, local14, 9728);
			this.aClass34_Sub2_26.method5502(this.aClass158_3);
			this.aClass34_Sub2_26.method5506(this.aClass158_4);
		}
		this.aClass34_Sub2_26.method5530();
		this.aClass34_Sub2_26.method5536(0);
		this.aClass34_Sub2_26.method5517(1);
		this.aClass34_Sub2_26.va();
		@Pc(89) int local89 = 0;
		@Pc(91) int local91 = 1;
		@Pc(105) Class1_Sub21 local105;
		for (@Pc(97) Class1_Sub21 local97 = (Class1_Sub21) this.aClass227_31.method4967(); local97 != null; local97 = local105) {
			local105 = (Class1_Sub21) this.aClass227_31.method4973();
			@Pc(109) int local109 = local97.method2211();
			for (@Pc(111) int local111 = 0; local111 < local109; local111++) {
				local97.method2215(this.aClass10_Sub1Array2[local89], this.aClass10_Sub1_4, local111);
				if (local105 == null && local111 == local109 - 1) {
					this.aClass34_Sub2_26.method5528(this.aClass158_4);
					this.aClass34_Sub2_26.method5563(0, 0);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5256);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5251, this.anInt5253);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5251, this.anInt5256 + this.anInt5253);
					OpenGL.glTexCoord2f((float) this.anInt5252, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5252 + this.anInt5251, this.anInt5256 + this.anInt5253);
					OpenGL.glTexCoord2f((float) this.anInt5252, (float) this.anInt5256);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5252 + this.anInt5251, this.anInt5253);
					OpenGL.glEnd();
				} else {
					this.aClass158_4.method3666(local91);
					OpenGL.glBegin(7);
					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);
					OpenGL.glTexCoord2f(0.0F, (float) this.anInt5256);
					OpenGL.glMultiTexCoord2f(33985, 0.0F, 1.0F);
					OpenGL.glVertex2i(0, this.anInt5256);
					OpenGL.glTexCoord2f((float) this.anInt5252, (float) this.anInt5256);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 1.0F);
					OpenGL.glVertex2i(this.anInt5252, this.anInt5256);
					OpenGL.glTexCoord2f((float) this.anInt5252, 0.0F);
					OpenGL.glMultiTexCoord2f(33985, 1.0F, 0.0F);
					OpenGL.glVertex2i(this.anInt5252, 0);
					OpenGL.glEnd();
				}
				local97.method2213(local111);
				local89 = local89 + 1 & 0x1;
				local91 = local91 + 1 & 0x1;
			}
		}
		this.aBoolean596 = false;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Z")
	private boolean method4140() {
		if (this.aBoolean601) {
			if (this.aClass1_Sub5_Sub17_2 != null) {
				this.aClass1_Sub5_Sub17_2.method5160();
				this.aClass1_Sub5_Sub17_2 = null;
			}
			if (this.aClass10_Sub1_4 != null) {
				this.aClass10_Sub1_4.method5926();
				this.aClass10_Sub1_4 = null;
			}
			if (this.aClass158_3 != null) {
				this.aClass1_Sub5_Sub17_2 = new Class1_Sub5_Sub17(this.aClass34_Sub2_26, 6402, this.anInt5252, this.anInt5256, this.aClass34_Sub2_26.anInt7056);
			}
			if (this.aBoolean598) {
				this.aClass10_Sub1_4 = new Class10_Sub1(this.aClass34_Sub2_26, 34037, 6402, this.anInt5252, this.anInt5256);
			} else if (this.aClass1_Sub5_Sub17_2 == null) {
				this.aClass1_Sub5_Sub17_2 = new Class1_Sub5_Sub17(this.aClass34_Sub2_26, 6402, this.anInt5252, this.anInt5256);
			}
			this.aBoolean599 = true;
			this.aBoolean597 = true;
			this.aBoolean601 = false;
		}
		if (this.aBoolean600) {
			if (this.aClass1_Sub5_Sub17_1 != null) {
				this.aClass1_Sub5_Sub17_1.method5160();
				this.aClass1_Sub5_Sub17_1 = null;
			}
			if (this.aClass10_Sub1Array2[0] != null) {
				this.aClass10_Sub1Array2[0].method5926();
				this.aClass10_Sub1Array2[0] = null;
			}
			if (this.aClass10_Sub1Array2[1] != null) {
				this.aClass10_Sub1Array2[1].method5926();
				this.aClass10_Sub1Array2[1] = null;
			}
			if (this.aClass158_3 != null) {
				this.aClass1_Sub5_Sub17_1 = new Class1_Sub5_Sub17(this.aClass34_Sub2_26, this.anInt5260, this.anInt5252, this.anInt5256, this.aClass34_Sub2_26.anInt7056);
			}
			this.aClass10_Sub1Array2[0] = new Class10_Sub1(this.aClass34_Sub2_26, 34037, this.anInt5260, this.anInt5252, this.anInt5256);
			this.aClass10_Sub1Array2[1] = this.anInt5261 <= 1 ? null : new Class10_Sub1(this.aClass34_Sub2_26, 34037, this.anInt5260, this.anInt5252, this.anInt5256);
			this.aBoolean599 = true;
			this.aBoolean600 = false;
			this.aBoolean597 = true;
		}
		if (this.aBoolean599) {
			if (this.aClass158_3 == null) {
				this.aClass34_Sub2_26.method5521(this.aClass158_4);
				this.aClass158_4.method3659(0);
				this.aClass158_4.method3659(1);
				this.aClass158_4.method3659(8);
				this.aClass158_4.method3663(0, this.aClass10_Sub1Array2[0]);
				if (this.anInt5261 > 1) {
					this.aClass158_4.method3663(1, this.aClass10_Sub1Array2[1]);
				}
				if (this.aBoolean598) {
					this.aClass158_4.method3663(8, this.aClass10_Sub1_4);
				} else {
					this.aClass158_4.method3669(8, this.aClass1_Sub5_Sub17_2);
				}
				this.aClass34_Sub2_26.method5528(this.aClass158_4);
			} else {
				this.aClass34_Sub2_26.method5521(this.aClass158_4);
				this.aClass158_4.method3659(0);
				this.aClass158_4.method3659(1);
				this.aClass158_4.method3659(8);
				this.aClass158_4.method3663(0, this.aClass10_Sub1Array2[0]);
				if (this.anInt5261 > 1) {
					this.aClass158_4.method3663(1, this.aClass10_Sub1Array2[1]);
				}
				if (this.aBoolean598) {
					this.aClass158_4.method3663(8, this.aClass10_Sub1_4);
				}
				this.aClass34_Sub2_26.method5528(this.aClass158_4);
				this.aClass34_Sub2_26.method5521(this.aClass158_3);
				this.aClass158_3.method3659(0);
				this.aClass158_3.method3659(8);
				this.aClass158_3.method3669(0, this.aClass1_Sub5_Sub17_1);
				this.aClass158_3.method3669(8, this.aClass1_Sub5_Sub17_2);
				this.aClass34_Sub2_26.method5528(this.aClass158_3);
			}
			this.aBoolean599 = false;
			this.aBoolean597 = true;
		}
		if (this.aBoolean597) {
			this.aClass34_Sub2_26.method5521(this.aClass158_5);
			this.aBoolean597 = !this.aClass158_5.method3667();
			this.aClass34_Sub2_26.method5528(this.aClass158_5);
		}
		return !this.aBoolean597;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIII)Z")
	public boolean method4142(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass158_5 == null || this.aClass227_31.method4976()) {
			return false;
		}
		if (arg3 != this.anInt5252 || arg1 != this.anInt5256) {
			this.anInt5256 = arg1;
			this.anInt5252 = arg3;
			for (@Pc(43) Class1 local43 = this.aClass227_31.method4967(); local43 != this.aClass227_31.aClass1_225; local43 = local43.aClass1_261) {
				((Class1_Sub21) local43).method2212(this.anInt5252, this.anInt5256);
			}
			this.aBoolean599 = true;
			this.aBoolean601 = true;
			this.aBoolean600 = true;
		}
		if (!this.method4140()) {
			return false;
		}
		this.anInt5251 = arg2;
		this.aBoolean596 = true;
		this.anInt5253 = arg0;
		this.aClass34_Sub2_26.method5521(this.aClass158_5);
		this.aClass158_5.method3666(0);
		this.aClass34_Sub2_26.method5563(-this.anInt5251, this.anInt5256 - this.aClass158_5.method3671() - this.anInt5253);
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLclient!hf;)V")
	public void method4143(@OriginalArg(1) Class1_Sub21 arg0) {
		arg0.aBoolean297 = false;
		arg0.method2217();
		arg0.method5915();
		this.method4147();
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(B)V")
	public void method4144() {
		this.aClass1_Sub5_Sub17_1 = null;
		this.aClass10_Sub1Array2 = null;
		this.aClass10_Sub1_4 = null;
		this.aClass1_Sub5_Sub17_2 = null;
		this.aClass158_5 = this.aClass158_3 = this.aClass158_4 = null;
		if (!this.aClass227_31.method4976()) {
			for (@Pc(42) Class1 local42 = this.aClass227_31.method4967(); local42 != this.aClass227_31.aClass1_225; local42 = local42.aClass1_261) {
				((Class1_Sub21) local42).method2217();
			}
		}
		this.anInt5252 = this.anInt5256 = 1;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!hf;I)Z")
	public boolean method4145(@OriginalArg(0) Class1_Sub21 arg0) {
		if (this.aClass158_5 != null) {
			if (arg0.method2204() || arg0.method2210()) {
				this.aClass227_31.method4972(arg0);
				this.method4147();
				if (this.method4140()) {
					if (this.anInt5252 != -1 && this.anInt5256 != -1) {
						arg0.method2212(this.anInt5252, this.anInt5256);
					}
					arg0.aBoolean297 = true;
					return true;
				}
			}
			this.method4143(arg0);
		}
		return false;
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)Z")
	public boolean method4146() {
		return this.aClass158_5 != null;
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)V")
	private void method4147() {
		@Pc(15) boolean local15 = false;
		@Pc(17) int local17 = 0;
		@Pc(19) int local19 = 0;
		@Pc(31) int local31;
		for (@Pc(25) Class1_Sub21 local25 = (Class1_Sub21) this.aClass227_31.method4967(); local25 != null; local25 = (Class1_Sub21) this.aClass227_31.method4973()) {
			local31 = local25.method2209();
			if (local31 > local17) {
				local17 = local31;
			}
			local19 += local25.method2211();
			local15 |= local25.method2214();
		}
		if (local17 == 2) {
			local31 = 34836;
		} else if (local17 == 1) {
			local31 = 34842;
		} else {
			local31 = 6408;
		}
		if (this.anInt5260 != local31) {
			this.aBoolean600 = true;
			this.anInt5260 = local31;
		}
		@Pc(95) int local95 = this.anInt5261 > 2 ? 2 : this.anInt5261;
		@Pc(104) int local104 = local19 <= 2 ? local19 : 2;
		if (this.aBoolean598 != local15) {
			this.aBoolean601 = true;
			this.aBoolean598 = local15;
		}
		if (local95 != local104) {
			this.aBoolean599 = this.aBoolean600 = true;
		}
		this.anInt5261 = local19;
	}
}
