import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class150 implements Interface11 {

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "I")
	private int anInt4239;

	@OriginalMember(owner = "client!lr", name = "x", descriptor = "I")
	private int anInt4256;

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	private int anInt4262;

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "I")
	private int anInt4238 = 0;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	private int anInt4252 = -1;

	@OriginalMember(owner = "client!lr", name = "h", descriptor = "[Lclient!ov;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!lr", name = "v", descriptor = "Lclient!ht;")
	private final Class109_Sub1 aClass109_Sub1_30;

	@OriginalMember(owner = "client!lr", name = "y", descriptor = "I")
	private final int anInt4257;

	static {
		new Class84("Unable to add friend - system busy.", "Der Freund konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un ami - système occupé.", "Não foi possível adicionar o amigo. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!ht;)V")
	public Class150(@OriginalArg(0) Class109_Sub1 arg0) {
		if (!arg0.aBoolean153) {
			throw new IllegalStateException("");
		}
		this.aClass109_Sub1_30 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static193.anIntArray71, 0);
		this.anInt4257 = Static193.anIntArray71[0];
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!il;IBI)V")
	private void method3516(@OriginalArg(1) Class13_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4252 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4239 & 0xFFFFFFFE) == 0) {
			this.anInt4262 = arg0.anInt3214;
			this.anInt4256 = arg0.anInt3214;
		} else if (this.anInt4256 != arg0.anInt3214 || arg0.anInt3214 != this.anInt4262) {
			throw new RuntimeException();
		}
		arg0.method2752(Static406.anIntArray583[0], arg1, this.anInt4252);
		this.anInterface9Array1[0] = arg0;
		this.anInt4239 |= 0x1;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IIILclient!qv;)V")
	private void method3517(@OriginalArg(2) int arg0, @OriginalArg(3) Class13_Sub1 arg1) {
		if (this.anInt4252 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt4239 & ~local15) == 0) {
			this.anInt4262 = arg1.anInt1239;
			this.anInt4256 = arg1.anInt1238;
		} else if (arg1.anInt1238 != this.anInt4256 || this.anInt4262 != arg1.anInt1239) {
			throw new RuntimeException();
		}
		arg1.method1052(Static406.anIntArray583[arg0], this.anInt4252);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt4239 |= local15;
	}

	@OriginalMember(owner = "client!lr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass109_Sub1_30.method2562(this.anInt4257);
		super.finalize();
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	@Override
	public void method3513() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4257);
		this.anInt4238 |= 0x4;
		this.anInt4252 = this.method3523();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!ps;I)V")
	public void method3520(@OriginalArg(1) Class1_Sub2_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4252 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt4239 & ~local16) == 0) {
			this.anInt4262 = arg0.anInt5573;
			this.anInt4256 = arg0.anInt5572;
		} else if (arg0.anInt5572 != this.anInt4256 || this.anInt4262 != arg0.anInt5573) {
			throw new RuntimeException();
		}
		arg0.method4468(this.anInt4252, Static406.anIntArray583[arg1]);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt4239 |= local16;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
	public void method3522() {
		if (this.anInt4252 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static406.anIntArray583[0]);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	@Override
	public void method3510() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4238 &= 0xFFFFFFFB;
		this.anInt4252 = this.method3523();
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(I)I")
	private int method3523() {
		if ((this.anInt4238 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4238 & 0x2) == 0) {
			return (this.anInt4238 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!il;I)V")
	public void method3524(@OriginalArg(1) int arg0, @OriginalArg(2) Class13_Sub4 arg1) {
		this.method3516(arg1, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IB)V")
	public void method3525(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4467();
		}
		this.anInt4239 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!lr", name = "e", descriptor = "(B)Z")
	public boolean method3526() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4252);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	@Override
	public void method3512() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4257);
		this.anInt4238 |= 0x1;
		this.anInt4252 = this.method3523();
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "(B)V")
	@Override
	public void method3515() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4238 &= 0xFFFFFFFD;
		this.anInt4252 = this.method3523();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Lclient!qv;IB)V")
	public void method3527(@OriginalArg(0) Class13_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.method3517(arg1, arg0);
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(B)V")
	@Override
	public void method3511() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4238 &= 0xFFFFFFFE;
		this.anInt4252 = this.method3523();
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(B)V")
	@Override
	public void method3514() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4257);
		this.anInt4238 |= 0x2;
		this.anInt4252 = this.method3523();
	}

	@OriginalMember(owner = "client!lr", name = "f", descriptor = "(B)I")
	public int method3528() {
		return this.anInt4262;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(II)V")
	public void method3529(@OriginalArg(0) int arg0) {
		if (this.anInt4252 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static406.anIntArray583[arg0]);
	}
}
