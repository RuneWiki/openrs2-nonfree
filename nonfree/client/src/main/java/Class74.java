import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ds")
public final class Class74 implements Interface20 {

	@OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
	private int anInt1874;

	@OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
	private int anInt1876;

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
	private int anInt1884;

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
	private int anInt1870 = -1;

	@OriginalMember(owner = "client!ds", name = "A", descriptor = "I")
	private int anInt1890 = 0;

	@OriginalMember(owner = "client!ds", name = "C", descriptor = "[Lclient!jca;")
	private final Interface14[] anInterface14Array1 = new Interface14[9];

	@OriginalMember(owner = "client!ds", name = "f", descriptor = "Lclient!jaa;")
	private final Class14_Sub3 aClass14_Sub3_10;

	@OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
	private final int anInt1882;

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Lclient!jaa;)V")
	public Class74(@OriginalArg(0) Class14_Sub3 arg0) {
		if (!arg0.aBoolean302) {
			throw new IllegalStateException("");
		}
		this.aClass14_Sub3_10 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static527.anIntArray648, 0);
		this.anInt1882 = Static527.anIntArray648[0];
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(I)V")
	@Override
	public void method1760() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1890 &= 0xFFFFFFFE;
		this.anInt1870 = this.method1775();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!hc;)V")
	public void method1764(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub8 arg1) {
		if (this.anInt1870 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt1884) == 0) {
			this.anInt1876 = arg1.anInt3726;
			this.anInt1874 = arg1.anInt3732;
		} else if (arg1.anInt3726 != this.anInt1876 || arg1.anInt3732 != this.anInt1874) {
			throw new RuntimeException();
		}
		arg1.method3254(Static300.anIntArray411[arg0], this.anInt1870);
		this.anInterface14Array1[arg0] = arg1;
		this.anInt1884 |= local16;
	}

	@OriginalMember(owner = "client!ds", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass14_Sub3_10.method3940(this.anInt1882);
		super.finalize();
	}

	@OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
	@Override
	public void method1762() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1890 &= 0xFFFFFFFD;
		this.anInt1870 = this.method1775();
	}

	@OriginalMember(owner = "client!ds", name = "e", descriptor = "(I)Z")
	public boolean method1766() {
		@Pc(15) int local15 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1870);
		return local15 == 36053;
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
	@Override
	public void method1761() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1882);
		this.anInt1890 |= 0x1;
		this.anInt1870 = this.method1775();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(II)V")
	public void method1767(@OriginalArg(1) int arg0) {
		if (this.anInt1870 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static300.anIntArray411[arg0]);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
	@Override
	public void method1759() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1890 &= 0xFFFFFFFB;
		this.anInt1870 = this.method1775();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IILclient!co;)V")
	public void method1769(@OriginalArg(1) int arg0, @OriginalArg(2) Class51_Sub1 arg1) {
		this.method1774(arg1, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIZLclient!gda;)V")
	public void method1770(@OriginalArg(0) int arg0, @OriginalArg(3) Class51_Sub3 arg1) {
		this.method1778(arg1, arg0);
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(II)V")
	public void method1771() {
		if (this.anInt1870 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static300.anIntArray411[0]);
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!co;II)V")
	private void method1774(@OriginalArg(1) Class51_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1870 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg1;
		if ((this.anInt1884 & ~local17) == 0) {
			this.anInt1874 = arg0.anInt4043;
			this.anInt1876 = arg0.anInt4042;
		} else if (arg0.anInt4042 != this.anInt1876 || arg0.anInt4043 != this.anInt1874) {
			throw new RuntimeException();
		}
		arg0.method3538(Static300.anIntArray411[arg1], this.anInt1870);
		this.anInterface14Array1[arg1] = arg0;
		this.anInt1884 |= local17;
	}

	@OriginalMember(owner = "client!ds", name = "c", descriptor = "(B)I")
	private int method1775() {
		if ((this.anInt1890 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1890 & 0x2) == 0) {
			return (this.anInt1890 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
	@Override
	public void method1758() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1882);
		this.anInt1890 |= 0x2;
		this.anInt1870 = this.method1775();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(IB)V")
	public void method1777(@OriginalArg(0) int arg0) {
		if (this.anInterface14Array1[arg0] != null) {
			this.anInterface14Array1[arg0].method7726();
		}
		this.anInt1884 &= ~(0x1 << arg0);
		this.anInterface14Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "(B)V")
	@Override
	public void method1763() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1882);
		this.anInt1890 |= 0x4;
		this.anInt1870 = this.method1775();
	}

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(ILclient!gda;III)V")
	private void method1778(@OriginalArg(1) Class51_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt1870 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1884 & 0xFFFFFFFE) == 0) {
			this.anInt1876 = arg0.anInt3337;
			this.anInt1874 = arg0.anInt3337;
		} else if (arg0.anInt3337 != this.anInt1876 || arg0.anInt3337 != this.anInt1874) {
			throw new RuntimeException();
		}
		arg0.method2930(this.anInt1870, Static300.anIntArray411[0], arg1);
		this.anInterface14Array1[0] = arg0;
		this.anInt1884 |= 0x1;
	}
}
