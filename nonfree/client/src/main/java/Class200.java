import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qh")
public final class Class200 implements Interface2 {

	@OriginalMember(owner = "client!qh", name = "k", descriptor = "I")
	private int anInt5592;

	@OriginalMember(owner = "client!qh", name = "p", descriptor = "I")
	private int anInt5597;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "I")
	private int anInt5600;

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "[Lclient!hg;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!qh", name = "j", descriptor = "I")
	private int anInt5591 = 0;

	@OriginalMember(owner = "client!qh", name = "v", descriptor = "I")
	private int anInt5602 = -1;

	@OriginalMember(owner = "client!qh", name = "t", descriptor = "Lclient!bo;")
	private final Class26_Sub1 aClass26_Sub1_28;

	@OriginalMember(owner = "client!qh", name = "z", descriptor = "I")
	private final int anInt5606;

	@OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lclient!bo;)V")
	public Class200(@OriginalArg(0) Class26_Sub1 arg0) {
		if (!arg0.aBoolean80) {
			throw new IllegalStateException("");
		}
		this.aClass26_Sub1_28 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static439.anIntArray505, 0);
		this.anInt5606 = Static439.anIntArray505[0];
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IB)V")
	public void method4537() {
		if (this.anInt5602 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static339.anIntArray386[0]);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
	public void method4538(@OriginalArg(0) int arg0) {
		if (this.anInt5602 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static339.anIntArray386[arg0]);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BLclient!cj;I)V")
	public void method4539(@OriginalArg(1) Class2_Sub2_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5602 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt5592 & ~local16) == 0) {
			this.anInt5597 = arg0.anInt1421;
			this.anInt5600 = arg0.anInt1414;
		} else if (arg0.anInt1414 != this.anInt5600 || this.anInt5597 != arg0.anInt1421) {
			throw new RuntimeException();
		}
		arg0.method1031(this.anInt5602, Static339.anIntArray386[arg1]);
		this.anInterface5Array1[arg1] = arg0;
		this.anInt5592 |= local16;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(Z)V")
	@Override
	public void method4534() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt5606);
		this.anInt5591 |= 0x2;
		this.anInt5602 = this.method4546();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIILclient!ef;I)V")
	private void method4540(@OriginalArg(3) Class65_Sub1 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt5602 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt5592 & 0xFFFFFFFE) == 0) {
			this.anInt5597 = arg0.anInt2060;
			this.anInt5600 = arg0.anInt2060;
		} else if (arg0.anInt2060 != this.anInt5600 || this.anInt5597 != arg0.anInt2060) {
			throw new RuntimeException();
		}
		arg0.method1521(this.anInt5602, arg1, Static339.anIntArray386[0]);
		this.anInterface5Array1[0] = arg0;
		this.anInt5592 |= 0x1;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILclient!wr;IB)V")
	private void method4541(@OriginalArg(1) Class65_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5602 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt5592 & ~local23) == 0) {
			this.anInt5597 = arg0.anInt2641;
			this.anInt5600 = arg0.anInt2642;
		} else if (arg0.anInt2642 != this.anInt5600 || arg0.anInt2641 != this.anInt5597) {
			throw new RuntimeException();
		}
		arg0.method1964(this.anInt5602, Static339.anIntArray386[arg1]);
		this.anInterface5Array1[arg1] = arg0;
		this.anInt5592 |= local23;
	}

	@OriginalMember(owner = "client!qh", name = "d", descriptor = "(I)V")
	@Override
	public void method4536() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt5606);
		this.anInt5591 |= 0x1;
		this.anInt5602 = this.method4546();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IBILclient!ef;)V")
	public void method4545(@OriginalArg(2) int arg0, @OriginalArg(3) Class65_Sub1 arg1) {
		this.method4540(arg1, arg0);
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
	@Override
	public void method4531() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt5591 &= 0xFFFFFFFB;
		this.anInt5602 = this.method4546();
	}

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "(I)I")
	private int method4546() {
		if ((this.anInt5591 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt5591 & 0x2) == 0) {
			return (this.anInt5591 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(B)I")
	public int method4547() {
		return this.anInt5597;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(II)V")
	public void method4548(@OriginalArg(1) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method4255();
		}
		this.anInt5592 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!qh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass26_Sub1_28.method627(this.anInt5606);
		super.finalize();
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(ZILclient!wr;)V")
	public void method4549(@OriginalArg(1) int arg0, @OriginalArg(2) Class65_Sub3 arg1) {
		this.method4541(arg1, arg0);
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(B)Z")
	public boolean method4552() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt5602);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)V")
	@Override
	public void method4533() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt5591 &= 0xFFFFFFFD;
		this.anInt5602 = this.method4546();
	}

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "(I)V")
	@Override
	public void method4535() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt5591 &= 0xFFFFFFFE;
		this.anInt5602 = this.method4546();
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	@Override
	public void method4532() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt5606);
		this.anInt5591 |= 0x4;
		this.anInt5602 = this.method4546();
	}
}
