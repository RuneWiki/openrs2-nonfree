import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class161 implements Interface19 {

	@OriginalMember(owner = "client!ij", name = "f", descriptor = "I")
	private int anInt4751;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	private int anInt4762;

	@OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
	private int anInt4770;

	@OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
	private int anInt4757 = 0;

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
	private int anInt4767 = -1;

	@OriginalMember(owner = "client!ij", name = "v", descriptor = "[Lclient!bga;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "Lclient!oea;")
	private final Class87_Sub2 aClass87_Sub2_12;

	@OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
	private final int anInt4774;

	@OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(Lclient!oea;)V")
	public Class161(@OriginalArg(0) Class87_Sub2 arg0) {
		if (!arg0.aBoolean546) {
			throw new IllegalStateException("");
		}
		this.aClass87_Sub2_12 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static257.anIntArray348, 0);
		this.anInt4774 = Static257.anIntArray348[0];
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	@Override
	public void method3950() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4774);
		this.anInt4757 |= 0x4;
		this.anInt4767 = this.method3955();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIILclient!ni;)V")
	public void method3954(@OriginalArg(2) int arg0, @OriginalArg(3) Class88_Sub3 arg1) {
		this.method3966(arg0, arg1);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z)I")
	private int method3955() {
		if ((this.anInt4757 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4757 & 0x2) == 0) {
			return (this.anInt4757 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZIILclient!me;)V")
	private void method3956(@OriginalArg(2) int arg0, @OriginalArg(3) Class88_Sub2 arg1) {
		if (this.anInt4767 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt4770 & ~local15) == 0) {
			this.anInt4751 = arg1.anInt6216;
			this.anInt4762 = arg1.anInt6213;
		} else if (arg1.anInt6216 != this.anInt4751 || this.anInt4762 != arg1.anInt6213) {
			throw new RuntimeException();
		}
		arg1.method5200(Static374.anIntArray446[arg0], this.anInt4767);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt4770 |= local15;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(BI)V")
	public void method3957() {
		if (this.anInt4767 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static374.anIntArray446[0]);
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)V")
	public void method3958(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method6980();
		}
		this.anInt4770 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!me;ZI)V")
	public void method3959(@OriginalArg(0) Class88_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method3956(arg1, arg0);
	}

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)Z")
	public boolean method3960() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4767);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	@Override
	public void method3948() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4774);
		this.anInt4757 |= 0x2;
		this.anInt4767 = this.method3955();
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)V")
	@Override
	public void method3953() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4757 &= 0xFFFFFFFB;
		this.anInt4767 = this.method3955();
	}

	@OriginalMember(owner = "client!ij", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass87_Sub2_12.method6152(this.anInt4774);
		super.finalize();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIILclient!ni;)V")
	private void method3966(@OriginalArg(1) int arg0, @OriginalArg(4) Class88_Sub3 arg1) {
		if (this.anInt4767 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4770 & 0xFFFFFFFE) == 0) {
			this.anInt4762 = arg1.anInt6803;
			this.anInt4751 = arg1.anInt6803;
		} else if (this.anInt4751 != arg1.anInt6803 || this.anInt4762 != arg1.anInt6803) {
			throw new RuntimeException();
		}
		arg1.method5718(this.anInt4767, arg0, Static374.anIntArray446[0]);
		this.anInterface1Array1[0] = arg1;
		this.anInt4770 |= 0x1;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V")
	@Override
	public void method3949() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4757 &= 0xFFFFFFFD;
		this.anInt4767 = this.method3955();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!nh;)V")
	public void method3967(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5_Sub15 arg1) {
		if (this.anInt4767 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt4770) == 0) {
			this.anInt4751 = arg1.anInt6746;
			this.anInt4762 = arg1.anInt6744;
		} else if (arg1.anInt6746 != this.anInt4751 || arg1.anInt6744 != this.anInt4762) {
			throw new RuntimeException();
		}
		arg1.method5681(this.anInt4767, Static374.anIntArray446[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt4770 |= local15;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)V")
	@Override
	public void method3952() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4757 &= 0xFFFFFFFE;
		this.anInt4767 = this.method3955();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IB)V")
	public void method3968(@OriginalArg(0) int arg0) {
		if (this.anInt4767 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static374.anIntArray446[arg0]);
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V")
	@Override
	public void method3951() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4774);
		this.anInt4757 |= 0x1;
		this.anInt4767 = this.method3955();
	}
}
