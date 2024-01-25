import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public final class Class11 implements Interface13 {

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
	private int anInt247;

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
	private int anInt258;

	@OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
	private int anInt246 = -1;

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	private int anInt242 = 0;

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "[Lclient!eq;")
	private final Interface4[] anInterface4Array1 = new Interface4[9];

	@OriginalMember(owner = "client!ak", name = "q", descriptor = "Lclient!tt;")
	private final Class200_Sub2 aClass200_Sub2_1;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
	private final int anInt260;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lclient!tt;)V")
	public Class11(@OriginalArg(0) Class200_Sub2 arg0) {
		if (!arg0.aBoolean435) {
			throw new IllegalStateException("");
		}
		this.aClass200_Sub2_1 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static145.anIntArray138, 0);
		this.anInt260 = Static145.anIntArray138[0];
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!cd;II)V")
	private void method187(@OriginalArg(0) int arg0, @OriginalArg(1) Class31_Sub1 arg1) {
		if (this.anInt246 == -1) {
			throw new RuntimeException();
		}
		@Pc(25) int local25 = 0x1 << arg0;
		if ((~local25 & this.anInt258) == 0) {
			this.anInt247 = arg1.anInt1865;
			this.anInt235 = arg1.anInt1864;
		} else if (arg1.anInt1864 != this.anInt235 || arg1.anInt1865 != this.anInt247) {
			throw new RuntimeException();
		}
		arg1.method1519(Static223.anIntArray233[arg0], this.anInt246);
		this.anInterface4Array1[arg0] = arg1;
		this.anInt258 |= local25;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!rh;II)V")
	public void method189(@OriginalArg(1) Class31_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method199(arg0, arg1);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
	public void method191(@OriginalArg(1) int arg0) {
		if (this.anInt246 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static223.anIntArray233[arg0]);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V")
	public void method192() {
		if (this.anInt246 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static223.anIntArray233[0]);
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
	@Override
	public void method186() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt260);
		this.anInt242 |= 0x2;
		this.anInt246 = this.method198();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
	@Override
	public void method185() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt242 &= 0xFFFFFFFE;
		this.anInt246 = this.method198();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
	@Override
	public void method182() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt260);
		this.anInt242 |= 0x1;
		this.anInt246 = this.method198();
	}

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "(I)Z")
	public boolean method195() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt246);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	@Override
	public void method184() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt242 &= 0xFFFFFFFD;
		this.anInt246 = this.method198();
	}

	@OriginalMember(owner = "client!ak", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass200_Sub2_1.method5339(this.anInt260);
		super.finalize();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)I")
	public int method196() {
		return this.anInt247;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
	@Override
	public void method183() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt242 &= 0xFFFFFFFB;
		this.anInt246 = this.method198();
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(Z)I")
	private int method198() {
		if ((this.anInt242 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt242 & 0x2) == 0) {
			return (this.anInt242 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
	@Override
	public void method181() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt260);
		this.anInt242 |= 0x4;
		this.anInt246 = this.method198();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!rh;IIII)V")
	private void method199(@OriginalArg(0) Class31_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt246 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt258 & 0xFFFFFFFE) == 0) {
			this.anInt235 = arg0.anInt5796;
			this.anInt247 = arg0.anInt5796;
		} else if (this.anInt235 != arg0.anInt5796 || this.anInt247 != arg0.anInt5796) {
			throw new RuntimeException();
		}
		arg0.method4595(Static223.anIntArray233[0], arg1, this.anInt246);
		this.anInterface4Array1[0] = arg0;
		this.anInt258 |= 0x1;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(BLclient!cd;I)V")
	public void method200(@OriginalArg(1) Class31_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method187(arg1, arg0);
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!dr;ZI)V")
	public void method202(@OriginalArg(0) Class5_Sub2_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt246 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg1;
		if ((this.anInt258 & ~local22) == 0) {
			this.anInt247 = arg0.anInt1492;
			this.anInt235 = arg0.anInt1503;
		} else if (arg0.anInt1503 != this.anInt235 || arg0.anInt1492 != this.anInt247) {
			throw new RuntimeException();
		}
		arg0.method1228(this.anInt246, Static223.anIntArray233[arg1]);
		this.anInterface4Array1[arg1] = arg0;
		this.anInt258 |= local22;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "(BI)V")
	public void method203(@OriginalArg(1) int arg0) {
		if (this.anInterface4Array1[arg0] != null) {
			this.anInterface4Array1[arg0].method4581();
		}
		this.anInt258 &= ~(0x1 << arg0);
		this.anInterface4Array1[arg0] = null;
	}
}
