import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rr")
public final class Class297 implements Interface14 {

	@OriginalMember(owner = "client!rr", name = "h", descriptor = "I")
	private int anInt8737;

	@OriginalMember(owner = "client!rr", name = "l", descriptor = "I")
	private int anInt8740;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	private int anInt8745;

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "[Lclient!au;")
	private final Interface3[] anInterface3Array1 = new Interface3[9];

	@OriginalMember(owner = "client!rr", name = "y", descriptor = "I")
	private int anInt8752 = -1;

	@OriginalMember(owner = "client!rr", name = "C", descriptor = "I")
	private int anInt8756 = 0;

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "Lclient!ac;")
	private final Class5_Sub1 aClass5_Sub1_35;

	@OriginalMember(owner = "client!rr", name = "z", descriptor = "I")
	private final int anInt8753;

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lclient!ac;)V")
	public Class297(@OriginalArg(0) Class5_Sub1 arg0) {
		if (!arg0.aBoolean40) {
			throw new IllegalStateException("");
		}
		this.aClass5_Sub1_35 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static359.anIntArray333, 0);
		this.anInt8753 = Static359.anIntArray333[0];
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!aaa;I)V")
	public void method7257(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		this.method7267(arg1, arg0);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IILclient!hw;II)V")
	private void method7258(@OriginalArg(2) Class2_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt8752 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8737 & 0xFFFFFFFE) == 0) {
			this.anInt8745 = arg0.anInt5072;
			this.anInt8740 = arg0.anInt5072;
		} else if (arg0.anInt5072 != this.anInt8740 || this.anInt8745 != arg0.anInt5072) {
			throw new RuntimeException();
		}
		arg0.method4155(Static610.anIntArray551[0], arg1, this.anInt8752);
		this.anInterface3Array1[0] = arg0;
		this.anInt8737 |= 0x1;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	@Override
	public void method7253() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8753);
		this.anInt8756 |= 0x1;
		this.anInt8752 = this.method7261();
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(B)V")
	@Override
	public void method7255() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8753);
		this.anInt8756 |= 0x4;
		this.anInt8752 = this.method7261();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)V")
	public void method7260() {
		if (this.anInt8752 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static610.anIntArray551[0]);
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
	private int method7261() {
		if ((this.anInt8756 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8756 & 0x2) == 0) {
			return (this.anInt8756 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(B)V")
	@Override
	public void method7252() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8753);
		this.anInt8756 |= 0x2;
		this.anInt8752 = this.method7261();
	}

	@OriginalMember(owner = "client!rr", name = "e", descriptor = "(B)V")
	@Override
	public void method7256() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8756 &= 0xFFFFFFFD;
		this.anInt8752 = this.method7261();
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	public void method7263(@OriginalArg(0) int arg0) {
		if (this.anInterface3Array1[arg0] != null) {
			this.anInterface3Array1[arg0].method6971();
		}
		this.anInt8737 &= ~(0x1 << arg0);
		this.anInterface3Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIILclient!hw;)V")
	public void method7264(@OriginalArg(0) int arg0, @OriginalArg(3) Class2_Sub2 arg1) {
		this.method7258(arg1, arg0);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)V")
	@Override
	public void method7254() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8756 &= 0xFFFFFFFE;
		this.anInt8752 = this.method7261();
	}

	@OriginalMember(owner = "client!rr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_35.method326(this.anInt8753);
		super.finalize();
	}

	@OriginalMember(owner = "client!rr", name = "f", descriptor = "(B)Z")
	public boolean method7265() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8752);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)V")
	public void method7266(@OriginalArg(1) int arg0) {
		if (this.anInt8752 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static610.anIntArray551[arg0]);
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(ILclient!aaa;II)V")
	private void method7267(@OriginalArg(1) Class2_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt8752 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt8737 & ~local15) == 0) {
			this.anInt8740 = arg0.anInt5125;
			this.anInt8745 = arg0.anInt5120;
		} else if (this.anInt8740 != arg0.anInt5125 || this.anInt8745 != arg0.anInt5120) {
			throw new RuntimeException();
		}
		arg0.method4204(this.anInt8752, Static610.anIntArray551[arg1]);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt8737 |= local15;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BILclient!is;)V")
	public void method7268(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub5_Sub16 arg1) {
		if (this.anInt8752 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg0;
		if ((~local21 & this.anInt8737) == 0) {
			this.anInt8745 = arg1.anInt5465;
			this.anInt8740 = arg1.anInt5464;
		} else if (arg1.anInt5464 != this.anInt8740 || this.anInt8745 != arg1.anInt5465) {
			throw new RuntimeException();
		}
		arg1.method4481(this.anInt8752, Static610.anIntArray551[arg0]);
		this.anInterface3Array1[arg0] = arg1;
		this.anInt8737 |= local21;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)V")
	@Override
	public void method7251() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8756 &= 0xFFFFFFFB;
		this.anInt8752 = this.method7261();
	}
}
