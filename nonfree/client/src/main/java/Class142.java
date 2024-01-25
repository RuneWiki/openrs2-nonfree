import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ks")
public final class Class142 implements Interface1 {

	@OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
	private int anInt4061;

	@OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
	private int anInt4067;

	@OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
	private int anInt4068;

	@OriginalMember(owner = "client!ks", name = "k", descriptor = "[Lclient!ih;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
	private int anInt4062 = 0;

	@OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
	private int anInt4070 = -1;

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_24;

	@OriginalMember(owner = "client!ks", name = "n", descriptor = "I")
	private final int anInt4059;

	static {
		new Class242("To go here you must login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um dort hinzukommen.", "Vous devez vous connecter à un serveur d'abonnés pour aller à cet endroit.", "Para entrar aqui, acesse um servidor para membros.");
		new Class242(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lclient!bv;)V")
	public Class142(@OriginalArg(0) Class30_Sub1 arg0) {
		if (!arg0.aBoolean69) {
			throw new IllegalStateException("");
		}
		this.aClass30_Sub1_24 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static206.anIntArray323, 0);
		this.anInt4059 = Static206.anIntArray323[0];
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)V")
	@Override
	public void method3078() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4062 &= 0xFFFFFFFE;
		this.anInt4070 = this.method3093();
	}

	@OriginalMember(owner = "client!ks", name = "e", descriptor = "(I)I")
	public int method3085() {
		return this.anInt4061;
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
	@Override
	public void method3079() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4062 &= 0xFFFFFFFD;
		this.anInt4070 = this.method3093();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(B)V")
	@Override
	public void method3080() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4059);
		this.anInt4062 |= 0x2;
		this.anInt4070 = this.method3093();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(II)V")
	public void method3086() {
		if (this.anInt4070 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static360.anIntArray561[0]);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Lclient!po;BI)V")
	public void method3087(@OriginalArg(0) Class4_Sub1_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4070 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt4067 & ~local15) == 0) {
			this.anInt4068 = arg0.anInt5540;
			this.anInt4061 = arg0.anInt5541;
		} else if (arg0.anInt5540 != this.anInt4068 || arg0.anInt5541 != this.anInt4061) {
			throw new RuntimeException();
		}
		arg0.method4259(Static360.anIntArray561[arg1], this.anInt4070);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt4067 |= local15;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IILclient!wg;)V")
	public void method3088(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		this.method3098(arg0, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "c", descriptor = "(I)V")
	@Override
	public void method3082() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4059);
		this.anInt4062 |= 0x1;
		this.anInt4070 = this.method3093();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIIILclient!lr;)V")
	private void method3089(@OriginalArg(3) int arg0, @OriginalArg(4) Class1_Sub2 arg1) {
		if (this.anInt4070 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4067 & 0xFFFFFFFE) == 0) {
			this.anInt4068 = arg1.anInt4346;
			this.anInt4061 = arg1.anInt4346;
		} else if (this.anInt4068 != arg1.anInt4346 || arg1.anInt4346 != this.anInt4061) {
			throw new RuntimeException();
		}
		arg1.method3285(arg0, Static360.anIntArray561[0], this.anInt4070);
		this.anInterface9Array1[0] = arg1;
		this.anInt4067 |= 0x1;
	}

	@OriginalMember(owner = "client!ks", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_24.method897(this.anInt4059);
		super.finalize();
	}

	@OriginalMember(owner = "client!ks", name = "d", descriptor = "(I)V")
	@Override
	public void method3083() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4059);
		this.anInt4062 |= 0x4;
		this.anInt4070 = this.method3093();
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILclient!lr;IB)V")
	public void method3091(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2 arg1) {
		this.method3089(arg0, arg1);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I")
	private int method3093() {
		if ((this.anInt4062 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4062 & 0x2) == 0) {
			return (this.anInt4062 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ks", name = "b", descriptor = "(B)V")
	@Override
	public void method3081() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4062 &= 0xFFFFFFFB;
		this.anInt4070 = this.method3093();
	}

	@OriginalMember(owner = "client!ks", name = "h", descriptor = "(I)Z")
	public boolean method3094() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4070);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IB)V")
	public void method3096(@OriginalArg(0) int arg0) {
		if (this.anInt4070 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static360.anIntArray561[arg0]);
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BI)V")
	public void method3097(@OriginalArg(1) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4264();
		}
		this.anInt4067 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(BILclient!wg;I)V")
	private void method3098(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (this.anInt4070 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg0;
		if ((this.anInt4067 & ~local21) == 0) {
			this.anInt4061 = arg1.anInt5173;
			this.anInt4068 = arg1.anInt5174;
		} else if (arg1.anInt5174 != this.anInt4068 || arg1.anInt5173 != this.anInt4061) {
			throw new RuntimeException();
		}
		arg1.method3965(Static360.anIntArray561[arg0], this.anInt4070);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt4067 |= local21;
	}
}
