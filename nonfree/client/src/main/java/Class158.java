import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mq")
public final class Class158 implements Interface5 {

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "I")
	private int anInt4644;

	@OriginalMember(owner = "client!mq", name = "u", descriptor = "I")
	private int anInt4657;

	@OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
	private int anInt4663;

	@OriginalMember(owner = "client!mq", name = "i", descriptor = "I")
	private int anInt4647 = 0;

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "I")
	private int anInt4640 = -1;

	@OriginalMember(owner = "client!mq", name = "s", descriptor = "[Lclient!md;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Lclient!ur;")
	private final Class34_Sub2 aClass34_Sub2_23;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "I")
	private final int anInt4650;

	@OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Lclient!ur;)V")
	public Class158(@OriginalArg(0) Class34_Sub2 arg0) {
		if (!arg0.aBoolean774) {
			throw new IllegalStateException("");
		}
		this.aClass34_Sub2_23 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static221.anIntArray239, 0);
		this.anInt4650 = Static221.anIntArray239[0];
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	@Override
	public void method3654() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4650);
		this.anInt4647 |= 0x4;
		this.anInt4640 = this.method3668();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILclient!km;I)V")
	private void method3658(@OriginalArg(0) int arg0, @OriginalArg(2) Class10_Sub1 arg1) {
		if (this.anInt4640 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt4657 & ~local15) == 0) {
			this.anInt4644 = arg1.anInt252;
			this.anInt4663 = arg1.anInt257;
		} else if (arg1.anInt257 != this.anInt4663 || this.anInt4644 != arg1.anInt252) {
			throw new RuntimeException();
		}
		arg1.method200(Static238.anIntArray285[arg0], this.anInt4640);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt4657 |= local15;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(II)V")
	public void method3659(@OriginalArg(1) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method5925();
		}
		this.anInt4657 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)V")
	@Override
	public void method3656() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4647 &= 0xFFFFFFFD;
		this.anInt4640 = this.method3668();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!sa;III)V")
	private void method3660(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub3 arg1) {
		if (this.anInt4640 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4657 & 0xFFFFFFFE) == 0) {
			this.anInt4663 = arg1.anInt6143;
			this.anInt4644 = arg1.anInt6143;
		} else if (arg1.anInt6143 != this.anInt4663 || arg1.anInt6143 != this.anInt4644) {
			throw new RuntimeException();
		}
		arg1.method4833(arg0, Static238.anIntArray285[0], this.anInt4640);
		this.anInterface7Array1[0] = arg1;
		this.anInt4657 |= 0x1;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!km;Z)V")
	public void method3663(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub1 arg1) {
		this.method3658(arg0, arg1);
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
	public void method3664() {
		if (this.anInt4640 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static238.anIntArray285[0]);
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(II)V")
	public void method3666(@OriginalArg(1) int arg0) {
		if (this.anInt4640 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static238.anIntArray285[arg0]);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
	@Override
	public void method3653() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4647 &= 0xFFFFFFFE;
		this.anInt4640 = this.method3668();
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(B)Z")
	public boolean method3667() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4640);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!mq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass34_Sub2_23.method5514(this.anInt4650);
		super.finalize();
	}

	@OriginalMember(owner = "client!mq", name = "e", descriptor = "(I)V")
	@Override
	public void method3657() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4647 &= 0xFFFFFFFB;
		this.anInt4640 = this.method3668();
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
	@Override
	public void method3652() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4650);
		this.anInt4647 |= 0x2;
		this.anInt4640 = this.method3668();
	}

	@OriginalMember(owner = "client!mq", name = "f", descriptor = "(I)I")
	private int method3668() {
		if ((this.anInt4647 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4647 & 0x2) == 0) {
			return (this.anInt4647 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILclient!tq;I)V")
	public void method3669(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub5_Sub17 arg1) {
		if (this.anInt4640 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((~local20 & this.anInt4657) == 0) {
			this.anInt4644 = arg1.anInt6598;
			this.anInt4663 = arg1.anInt6593;
		} else if (this.anInt4663 != arg1.anInt6593 || arg1.anInt6598 != this.anInt4644) {
			throw new RuntimeException();
		}
		arg1.method5161(this.anInt4640, Static238.anIntArray285[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt4657 |= local20;
	}

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)V")
	@Override
	public void method3655() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4650);
		this.anInt4647 |= 0x1;
		this.anInt4640 = this.method3668();
	}

	@OriginalMember(owner = "client!mq", name = "g", descriptor = "(I)I")
	public int method3671() {
		return this.anInt4644;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!sa;IIB)V")
	public void method3672(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method3660(arg1, arg0);
	}
}
