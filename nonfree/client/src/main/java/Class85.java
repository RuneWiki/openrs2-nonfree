import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eba")
public final class Class85 implements Interface15 {

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "I")
	private int anInt2546;

	@OriginalMember(owner = "client!eba", name = "o", descriptor = "I")
	private int anInt2556;

	@OriginalMember(owner = "client!eba", name = "u", descriptor = "I")
	private int anInt2561;

	@OriginalMember(owner = "client!eba", name = "r", descriptor = "I")
	private int anInt2559 = 0;

	@OriginalMember(owner = "client!eba", name = "B", descriptor = "I")
	private int anInt2568 = -1;

	@OriginalMember(owner = "client!eba", name = "t", descriptor = "[Lclient!fca;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!eba", name = "n", descriptor = "Lclient!dw;")
	private final Class82_Sub1 aClass82_Sub1_13;

	@OriginalMember(owner = "client!eba", name = "z", descriptor = "I")
	private final int anInt2566;

	@OriginalMember(owner = "client!eba", name = "<init>", descriptor = "(Lclient!dw;)V")
	public Class85(@OriginalArg(0) Class82_Sub1 arg0) {
		if (!arg0.aBoolean185) {
			throw new IllegalStateException("");
		}
		this.aClass82_Sub1_13 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static460.anIntArray486, 0);
		this.anInt2566 = Static460.anIntArray486[0];
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(B)I")
	private int method2141() {
		if ((this.anInt2559 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2559 & 0x2) == 0) {
			return (this.anInt2559 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!bca;I)V")
	public void method2142(@OriginalArg(1) Class3_Sub7_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2568 == -1) {
			throw new RuntimeException();
		}
		@Pc(24) int local24 = 0x1 << arg1;
		if ((~local24 & this.anInt2556) == 0) {
			this.anInt2561 = arg0.anInt494;
			this.anInt2546 = arg0.anInt495;
		} else if (this.anInt2561 != arg0.anInt494 || arg0.anInt495 != this.anInt2546) {
			throw new RuntimeException();
		}
		arg0.method471(this.anInt2568, Static46.anIntArray57[arg1]);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt2556 |= local24;
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(Z)V")
	@Override
	public void method2137() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2559 &= 0xFFFFFFFD;
		this.anInt2568 = this.method2141();
	}

	@OriginalMember(owner = "client!eba", name = "c", descriptor = "(I)V")
	@Override
	public void method2139() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2559 &= 0xFFFFFFFE;
		this.anInt2568 = this.method2141();
	}

	@OriginalMember(owner = "client!eba", name = "e", descriptor = "(I)Z")
	public boolean method2143() {
		@Pc(11) int local11 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2568);
		return local11 == 36053;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(I)V")
	@Override
	public void method2135() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2566);
		this.anInt2559 |= 0x1;
		this.anInt2568 = this.method2141();
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IZ)V")
	public void method2144() {
		if (this.anInt2568 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static46.anIntArray57[0]);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Z)V")
	@Override
	public void method2136() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2566);
		this.anInt2559 |= 0x2;
		this.anInt2568 = this.method2141();
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(IZ)V")
	public void method2145(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4004();
		}
		this.anInt2556 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(BILclient!ifa;I)V")
	public void method2146(@OriginalArg(1) int arg0, @OriginalArg(2) Class94_Sub4 arg1) {
		this.method2152(arg1, arg0);
	}

	@OriginalMember(owner = "client!eba", name = "d", descriptor = "(I)V")
	@Override
	public void method2140() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2566);
		this.anInt2559 |= 0x4;
		this.anInt2568 = this.method2141();
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(II)V")
	public void method2149(@OriginalArg(0) int arg0) {
		if (this.anInt2568 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static46.anIntArray57[arg0]);
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!fba;BII)V")
	private void method2151(@OriginalArg(0) Class94_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2568 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt2556 & ~local15) == 0) {
			this.anInt2546 = arg0.anInt3659;
			this.anInt2561 = arg0.anInt3653;
		} else if (arg0.anInt3653 != this.anInt2561 || this.anInt2546 != arg0.anInt3659) {
			throw new RuntimeException();
		}
		arg0.method3126(Static46.anIntArray57[arg1], this.anInt2568);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt2556 |= local15;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ILclient!ifa;III)V")
	private void method2152(@OriginalArg(1) Class94_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2568 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2556 & 0xFFFFFFFE) == 0) {
			this.anInt2561 = arg0.anInt4689;
			this.anInt2546 = arg0.anInt4689;
		} else if (arg0.anInt4689 != this.anInt2561 || this.anInt2546 != arg0.anInt4689) {
			throw new RuntimeException();
		}
		arg0.method4017(Static46.anIntArray57[0], arg1, this.anInt2568);
		this.anInterface9Array1[0] = arg0;
		this.anInt2556 |= 0x1;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(IBLclient!fba;)V")
	public void method2153(@OriginalArg(0) int arg0, @OriginalArg(2) Class94_Sub2 arg1) {
		this.method2151(arg1, arg0);
	}

	@OriginalMember(owner = "client!eba", name = "b", descriptor = "(I)V")
	@Override
	public void method2138() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2559 &= 0xFFFFFFFB;
		this.anInt2568 = this.method2141();
	}

	@OriginalMember(owner = "client!eba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass82_Sub1_13.method2067(this.anInt2566);
		super.finalize();
	}
}
