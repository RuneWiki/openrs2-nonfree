import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ufa")
public final class Class319 implements Interface21 {

	@OriginalMember(owner = "client!ufa", name = "q", descriptor = "[Lclient!wn;")
	public static final Class349[] aClass349Array1 = new Class349[5];

	@OriginalMember(owner = "client!ufa", name = "o", descriptor = "I")
	private int anInt9081;

	@OriginalMember(owner = "client!ufa", name = "s", descriptor = "I")
	private int anInt9084;

	@OriginalMember(owner = "client!ufa", name = "u", descriptor = "I")
	private int anInt9086;

	@OriginalMember(owner = "client!ufa", name = "g", descriptor = "I")
	private int anInt9075 = 0;

	@OriginalMember(owner = "client!ufa", name = "n", descriptor = "[Lclient!qi;")
	private final Interface18[] anInterface18Array1 = new Interface18[9];

	@OriginalMember(owner = "client!ufa", name = "B", descriptor = "I")
	private int anInt9092 = -1;

	@OriginalMember(owner = "client!ufa", name = "k", descriptor = "Lclient!en;")
	private final Class90_Sub1 aClass90_Sub1_39;

	@OriginalMember(owner = "client!ufa", name = "m", descriptor = "I")
	private final int anInt9080;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass349Array1.length; local4++) {
			aClass349Array1[local4] = new Class349();
		}
	}

	@OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lclient!en;)V")
	public Class319(@OriginalArg(0) Class90_Sub1 arg0) {
		if (!arg0.aBoolean153) {
			throw new IllegalStateException("");
		}
		this.aClass90_Sub1_39 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static497.anIntArray619, 0);
		this.anInt9080 = Static497.anIntArray619[0];
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)V")
	@Override
	public void method7186() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9080);
		this.anInt9075 |= 0x4;
		this.anInt9092 = this.method7193();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)V")
	@Override
	public void method7185() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9075 &= 0xFFFFFFFD;
		this.anInt9092 = this.method7193();
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Z)V")
	@Override
	public void method7189() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9080);
		this.anInt9075 |= 0x1;
		this.anInt9092 = this.method7193();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BI)V")
	public void method7190(@OriginalArg(1) int arg0) {
		if (this.anInterface18Array1[arg0] != null) {
			this.anInterface18Array1[arg0].method7838();
		}
		this.anInt9086 &= ~(0x1 << arg0);
		this.anInterface18Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!wg;IIB)V")
	public void method7191(@OriginalArg(0) Class16_Sub4 arg0, @OriginalArg(1) int arg1) {
		this.method7195(arg1, arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IIILclient!waa;)V")
	private void method7192(@OriginalArg(2) int arg0, @OriginalArg(3) Class16_Sub1 arg1) {
		if (this.anInt9092 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((this.anInt9086 & ~local20) == 0) {
			this.anInt9081 = arg1.anInt350;
			this.anInt9084 = arg1.anInt345;
		} else if (this.anInt9084 != arg1.anInt345 || arg1.anInt350 != this.anInt9081) {
			throw new RuntimeException();
		}
		arg1.method300(this.anInt9092, Static554.anIntArray702[arg0]);
		this.anInterface18Array1[arg0] = arg1;
		this.anInt9086 |= local20;
	}

	@OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)I")
	private int method7193() {
		if ((this.anInt9075 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9075 & 0x2) == 0) {
			return (this.anInt9075 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(IZ)V")
	public void method7194() {
		if (this.anInt9092 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static554.anIntArray702[0]);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BIILclient!wg;I)V")
	private void method7195(@OriginalArg(2) int arg0, @OriginalArg(3) Class16_Sub4 arg1) {
		if (this.anInt9092 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9086 & 0xFFFFFFFE) == 0) {
			this.anInt9081 = arg1.anInt9867;
			this.anInt9084 = arg1.anInt9867;
		} else if (arg1.anInt9867 != this.anInt9084 || arg1.anInt9867 != this.anInt9081) {
			throw new RuntimeException();
		}
		arg1.method7850(Static554.anIntArray702[0], arg0, this.anInt9092);
		this.anInterface18Array1[0] = arg1;
		this.anInt9086 |= 0x1;
	}

	@OriginalMember(owner = "client!ufa", name = "d", descriptor = "(I)Z")
	public boolean method7196() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9092);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)V")
	@Override
	public void method7188() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9080);
		this.anInt9075 |= 0x2;
		this.anInt9092 = this.method7193();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILclient!fj;I)V")
	public void method7197(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub5_Sub4 arg1) {
		if (this.anInt9092 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg0;
		if ((~local23 & this.anInt9086) == 0) {
			this.anInt9084 = arg1.anInt2814;
			this.anInt9081 = arg1.anInt2815;
		} else if (arg1.anInt2814 != this.anInt9084 || arg1.anInt2815 != this.anInt9081) {
			throw new RuntimeException();
		}
		arg1.method2388(Static554.anIntArray702[arg0], this.anInt9092);
		this.anInterface18Array1[arg0] = arg1;
		this.anInt9086 |= local23;
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
	@Override
	public void method7184() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9075 &= 0xFFFFFFFB;
		this.anInt9092 = this.method7193();
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lclient!waa;BI)V")
	public void method7198(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7192(arg1, arg0);
	}

	@OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Z)V")
	@Override
	public void method7187() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9075 &= 0xFFFFFFFE;
		this.anInt9092 = this.method7193();
	}

	@OriginalMember(owner = "client!ufa", name = "b", descriptor = "(BI)V")
	public void method7201(@OriginalArg(1) int arg0) {
		if (this.anInt9092 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static554.anIntArray702[arg0]);
	}

	@OriginalMember(owner = "client!ufa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass90_Sub1_39.method2114(this.anInt9080);
		super.finalize();
	}
}
