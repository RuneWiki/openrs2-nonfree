import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class87 implements Interface8 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
	private int anInt2572;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
	private int anInt2575;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "I")
	private int anInt2595;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "[Lclient!tf;")
	private final Interface22[] anInterface22Array1 = new Interface22[9];

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	private int anInt2582 = 0;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	private int anInt2584 = -1;

	@OriginalMember(owner = "client!ec", name = "u", descriptor = "Lclient!kfa;")
	private final Class7_Sub2 aClass7_Sub2_9;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
	private final int anInt2573;

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lclient!kfa;)V")
	public Class87(@OriginalArg(0) Class7_Sub2 arg0) {
		if (!arg0.aBoolean390) {
			throw new IllegalStateException("");
		}
		this.aClass7_Sub2_9 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static346.anIntArray372, 0);
		this.anInt2573 = Static346.anIntArray372[0];
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!kf;I)V")
	public void method2063(@OriginalArg(1) Class4_Sub6_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2584 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt2595 & ~local16) == 0) {
			this.anInt2572 = arg0.anInt5391;
			this.anInt2575 = arg0.anInt5379;
		} else if (this.anInt2575 != arg0.anInt5379 || this.anInt2572 != arg0.anInt5391) {
			throw new RuntimeException();
		}
		arg0.method4194(Static346.anIntArray371[arg1], this.anInt2584);
		this.anInterface22Array1[arg1] = arg0;
		this.anInt2595 |= local16;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	@Override
	public void method2059() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2573);
		this.anInt2582 |= 0x4;
		this.anInt2584 = this.method2068();
	}

	@OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass7_Sub2_9.method4349(this.anInt2573);
		super.finalize();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
	@Override
	public void method2060() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2582 &= 0xFFFFFFFD;
		this.anInt2584 = this.method2068();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IILclient!gfa;I)V")
	public void method2064(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		this.method2067(arg1, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public void method2065() {
		if (this.anInt2584 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static346.anIntArray371[0]);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIILclient!il;)V")
	private void method2066(@OriginalArg(1) int arg0, @OriginalArg(3) Class3_Sub2 arg1) {
		if (this.anInt2584 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg0;
		if ((this.anInt2595 & ~local17) == 0) {
			this.anInt2572 = arg1.anInt1104;
			this.anInt2575 = arg1.anInt1100;
		} else if (arg1.anInt1100 != this.anInt2575 || this.anInt2572 != arg1.anInt1104) {
			throw new RuntimeException();
		}
		arg1.method950(Static346.anIntArray371[arg0], this.anInt2584);
		this.anInterface22Array1[arg0] = arg1;
		this.anInt2595 |= local17;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZLclient!gfa;II)V")
	private void method2067(@OriginalArg(2) Class3_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt2584 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2595 & 0xFFFFFFFE) == 0) {
			this.anInt2575 = arg0.anInt3459;
			this.anInt2572 = arg0.anInt3459;
		} else if (this.anInt2575 != arg0.anInt3459 || this.anInt2572 != arg0.anInt3459) {
			throw new RuntimeException();
		}
		arg0.method2750(this.anInt2584, Static346.anIntArray371[0], arg1);
		this.anInterface22Array1[0] = arg0;
		this.anInt2595 |= 0x1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	@Override
	public void method2058() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2573);
		this.anInt2582 |= 0x2;
		this.anInt2584 = this.method2068();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)I")
	private int method2068() {
		if ((this.anInt2582 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2582 & 0x2) == 0) {
			return (this.anInt2582 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
	@Override
	public void method2057() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2582 &= 0xFFFFFFFB;
		this.anInt2584 = this.method2068();
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	@Override
	public void method2061() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2582 &= 0xFFFFFFFE;
		this.anInt2584 = this.method2068();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	public void method2070(@OriginalArg(1) int arg0) {
		if (this.anInterface22Array1[arg0] != null) {
			this.anInterface22Array1[arg0].method4191();
		}
		this.anInt2595 &= ~(0x1 << arg0);
		this.anInterface22Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
	@Override
	public void method2062() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2573);
		this.anInt2582 |= 0x1;
		this.anInt2584 = this.method2068();
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)V")
	public void method2071(@OriginalArg(1) int arg0) {
		if (this.anInt2584 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static346.anIntArray371[arg0]);
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)Z")
	public boolean method2072() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2584);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!il;I)V")
	public void method2073(@OriginalArg(1) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method2066(arg1, arg0);
	}
}
