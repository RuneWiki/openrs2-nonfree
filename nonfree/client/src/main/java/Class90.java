import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class90 implements Interface11 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	private int anInt2020;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	private int anInt2025;

	@OriginalMember(owner = "client!gb", name = "p", descriptor = "I")
	private int anInt2033;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	private int anInt2039 = 0;

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "[Lclient!tk;")
	private final Interface10[] anInterface10Array1 = new Interface10[9];

	@OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
	private int anInt2031 = -1;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!ih;")
	private final Class117_Sub1 aClass117_Sub1_14;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	private final int anInt2021;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class90(@OriginalArg(0) Class117_Sub1 arg0) {
		if (!arg0.aBoolean310) {
			throw new IllegalStateException("");
		}
		this.aClass117_Sub1_14 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static237.anIntArray312, 0);
		this.anInt2021 = Static237.anIntArray312[0];
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	@Override
	public void method1643() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2021);
		this.anInt2039 |= 0x2;
		this.anInt2031 = this.method1655();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!aw;III)V")
	public void method1644(@OriginalArg(0) Class23_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method1651(arg1, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(B)V")
	@Override
	public void method1640() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2039 &= 0xFFFFFFFB;
		this.anInt2031 = this.method1655();
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(BI)V")
	public void method1649(@OriginalArg(1) int arg0) {
		if (this.anInterface10Array1[arg0] != null) {
			this.anInterface10Array1[arg0].method5797();
		}
		this.anInt2033 &= ~(0x1 << arg0);
		this.anInterface10Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	@Override
	public void method1638() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2039 &= 0xFFFFFFFE;
		this.anInt2031 = this.method1655();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!gu;IB)V")
	public void method1650(@OriginalArg(0) Class23_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.method1653(arg1, arg0);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILclient!aw;I)V")
	private void method1651(@OriginalArg(2) int arg0, @OriginalArg(3) Class23_Sub1 arg1) {
		if (this.anInt2031 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2033 & 0xFFFFFFFE) == 0) {
			this.anInt2025 = arg1.anInt333;
			this.anInt2020 = arg1.anInt333;
		} else if (this.anInt2020 != arg1.anInt333 || this.anInt2025 != arg1.anInt333) {
			throw new RuntimeException();
		}
		arg1.method336(this.anInt2031, arg0, Static175.anIntArray229[0]);
		this.anInterface10Array1[0] = arg1;
		this.anInt2033 |= 0x1;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	public void method1652() {
		if (this.anInt2031 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static175.anIntArray229[0]);
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!gu;I)V")
	private void method1653(@OriginalArg(0) int arg0, @OriginalArg(2) Class23_Sub3 arg1) {
		if (this.anInt2031 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((this.anInt2033 & ~local20) == 0) {
			this.anInt2020 = arg1.anInt7172;
			this.anInt2025 = arg1.anInt7176;
		} else if (arg1.anInt7172 != this.anInt2020 || this.anInt2025 != arg1.anInt7176) {
			throw new RuntimeException();
		}
		arg1.method5810(this.anInt2031, Static175.anIntArray229[arg0]);
		this.anInterface10Array1[arg0] = arg1;
		this.anInt2033 |= local20;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	@Override
	public void method1641() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2021);
		this.anInt2039 |= 0x4;
		this.anInt2031 = this.method1655();
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(B)V")
	@Override
	public void method1642() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2021);
		this.anInt2039 |= 0x1;
		this.anInt2031 = this.method1655();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	@Override
	public void method1639() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2039 &= 0xFFFFFFFD;
		this.anInt2031 = this.method1655();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)I")
	public int method1654() {
		return this.anInt2025;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "(B)I")
	private int method1655() {
		if ((this.anInt2039 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2039 & 0x2) == 0) {
			return (this.anInt2039 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IILclient!lc;)V")
	public void method1656(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3_Sub12 arg1) {
		if (this.anInt2031 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt2033 & ~local16) == 0) {
			this.anInt2020 = arg1.anInt4169;
			this.anInt2025 = arg1.anInt4167;
		} else if (arg1.anInt4169 != this.anInt2020 || this.anInt2025 != arg1.anInt4167) {
			throw new RuntimeException();
		}
		arg1.method3295(this.anInt2031, Static175.anIntArray229[arg0]);
		this.anInterface10Array1[arg0] = arg1;
		this.anInt2033 |= local16;
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)V")
	public void method1658(@OriginalArg(0) int arg0) {
		if (this.anInt2031 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static175.anIntArray229[arg0]);
	}

	@OriginalMember(owner = "client!gb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass117_Sub1_14.method2453(this.anInt2021);
		super.finalize();
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)Z")
	public boolean method1659() {
		@Pc(14) int local14 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2031);
		return local14 == 36053;
	}
}
