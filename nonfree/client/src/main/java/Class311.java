import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class311 implements Interface20 {

	@OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
	private int anInt8927;

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "I")
	private int anInt8932;

	@OriginalMember(owner = "client!wd", name = "q", descriptor = "I")
	private int anInt8933;

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
	private int anInt8919 = -1;

	@OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
	private int anInt8929 = 0;

	@OriginalMember(owner = "client!wd", name = "n", descriptor = "[Lclient!vc;")
	private final Interface19[] anInterface19Array1 = new Interface19[9];

	@OriginalMember(owner = "client!wd", name = "i", descriptor = "Lclient!uq;")
	private final Class122_Sub3 aClass122_Sub3_41;

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private final int anInt8942;

	static {
		new Class306("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
	}

	@OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(Lclient!uq;)V")
	public Class311(@OriginalArg(0) Class122_Sub3 arg0) {
		if (!arg0.aBoolean601) {
			throw new IllegalStateException("");
		}
		this.aClass122_Sub3_41 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static282.anIntArray726, 0);
		this.anInt8942 = Static282.anIntArray726[0];
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IILclient!ku;I)V")
	private void method7347(@OriginalArg(1) int arg0, @OriginalArg(2) Class73_Sub1 arg1) {
		if (this.anInt8919 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt8933) == 0) {
			this.anInt8932 = arg1.anInt2339;
			this.anInt8927 = arg1.anInt2337;
		} else if (arg1.anInt2337 != this.anInt8927 || this.anInt8932 != arg1.anInt2339) {
			throw new RuntimeException();
		}
		arg1.method1956(Static63.anIntArray146[arg0], this.anInt8919);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt8933 |= local16;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIBLclient!sk;)V")
	public void method7348(@OriginalArg(1) int arg0, @OriginalArg(3) Class73_Sub4 arg1) {
		this.method7349(arg0, arg1);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IBIILclient!sk;)V")
	private void method7349(@OriginalArg(3) int arg0, @OriginalArg(4) Class73_Sub4 arg1) {
		if (this.anInt8919 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8933 & 0xFFFFFFFE) == 0) {
			this.anInt8927 = arg1.anInt7639;
			this.anInt8932 = arg1.anInt7639;
		} else if (arg1.anInt7639 != this.anInt8927 || arg1.anInt7639 != this.anInt8932) {
			throw new RuntimeException();
		}
		arg1.method6360(this.anInt8919, Static63.anIntArray146[0], arg0);
		this.anInterface19Array1[0] = arg1;
		this.anInt8933 |= 0x1;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)V")
	public void method7350(@OriginalArg(1) int arg0) {
		if (this.anInt8919 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static63.anIntArray146[arg0]);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILclient!jv;I)V")
	public void method7351(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub8 arg1) {
		if (this.anInt8919 == -1) {
			throw new RuntimeException();
		}
		@Pc(24) int local24 = 0x1 << arg0;
		if ((this.anInt8933 & ~local24) == 0) {
			this.anInt8932 = arg1.anInt4780;
			this.anInt8927 = arg1.anInt4781;
		} else if (this.anInt8927 != arg1.anInt4781 || this.anInt8932 != arg1.anInt4780) {
			throw new RuntimeException();
		}
		arg1.method4128(Static63.anIntArray146[arg0], this.anInt8919);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt8933 |= local24;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!ku;II)V")
	public void method7352(@OriginalArg(0) Class73_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7347(arg1, arg0);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	@Override
	public void method7345() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8942);
		this.anInt8929 |= 0x4;
		this.anInt8919 = this.method7357();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
	@Override
	public void method7341() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8942);
		this.anInt8929 |= 0x1;
		this.anInt8919 = this.method7357();
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Z")
	public boolean method7354() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8919);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)V")
	public void method7355() {
		if (this.anInt8919 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static63.anIntArray146[0]);
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(ZI)V")
	public void method7356(@OriginalArg(1) int arg0) {
		if (this.anInterface19Array1[arg0] != null) {
			this.anInterface19Array1[arg0].method6345();
		}
		this.anInt8933 &= ~(0x1 << arg0);
		this.anInterface19Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)I")
	private int method7357() {
		if ((this.anInt8929 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8929 & 0x2) == 0) {
			return (this.anInt8929 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)I")
	public int method7358() {
		return this.anInt8932;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
	@Override
	public void method7342() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8942);
		this.anInt8929 |= 0x2;
		this.anInt8919 = this.method7357();
	}

	@OriginalMember(owner = "client!wd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass122_Sub3_41.method6907(this.anInt8942);
		super.finalize();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
	@Override
	public void method7344() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8929 &= 0xFFFFFFFD;
		this.anInt8919 = this.method7357();
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)V")
	@Override
	public void method7346() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8929 &= 0xFFFFFFFB;
		this.anInt8919 = this.method7357();
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
	@Override
	public void method7343() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8929 &= 0xFFFFFFFE;
		this.anInt8919 = this.method7357();
	}
}
