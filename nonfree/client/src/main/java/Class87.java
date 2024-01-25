import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fv")
public final class Class87 implements Interface7 {

	@OriginalMember(owner = "client!fv", name = "l", descriptor = "I")
	private int anInt2228;

	@OriginalMember(owner = "client!fv", name = "u", descriptor = "I")
	private int anInt2235;

	@OriginalMember(owner = "client!fv", name = "z", descriptor = "I")
	private int anInt2239;

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "I")
	private int anInt2222 = 0;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "[Lclient!ck;")
	private final Interface3[] anInterface3Array1 = new Interface3[9];

	@OriginalMember(owner = "client!fv", name = "y", descriptor = "I")
	private int anInt2238 = -1;

	@OriginalMember(owner = "client!fv", name = "o", descriptor = "Lclient!od;")
	private final Class128_Sub2 aClass128_Sub2_12;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
	private final int anInt2224;

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(Lclient!od;)V")
	public Class87(@OriginalArg(0) Class128_Sub2 arg0) {
		if (!arg0.aBoolean363) {
			throw new IllegalStateException("");
		}
		this.aClass128_Sub2_12 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static411.anIntArray445, 0);
		this.anInt2224 = Static411.anIntArray445[0];
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!rc;IZI)V")
	private void method1765(@OriginalArg(1) Class5_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt2238 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2239 & 0xFFFFFFFE) == 0) {
			this.anInt2235 = arg0.anInt5595;
			this.anInt2228 = arg0.anInt5595;
		} else if (arg0.anInt5595 != this.anInt2235 || this.anInt2228 != arg0.anInt5595) {
			throw new RuntimeException();
		}
		arg0.method4360(arg1, Static313.anIntArray311[0], this.anInt2238);
		this.anInterface3Array1[0] = arg0;
		this.anInt2239 |= 0x1;
	}

	@OriginalMember(owner = "client!fv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass128_Sub2_12.method3683(this.anInt2224);
		super.finalize();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(IZ)V")
	public void method1767(@OriginalArg(0) int arg0) {
		if (this.anInt2238 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static313.anIntArray311[arg0]);
	}

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "(I)V")
	@Override
	public void method1762() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2222 &= 0xFFFFFFFB;
		this.anInt2238 = this.method1770();
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)V")
	@Override
	public void method1761() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2224);
		this.anInt2222 |= 0x4;
		this.anInt2238 = this.method1770();
	}

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "(I)I")
	public int method1768() {
		return this.anInt2228;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)V")
	@Override
	public void method1759() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2222 &= 0xFFFFFFFE;
		this.anInt2238 = this.method1770();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!rc;II)V")
	public void method1769(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub4 arg1) {
		this.method1765(arg1, arg0);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Z)I")
	private int method1770() {
		if ((this.anInt2222 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2222 & 0x2) == 0) {
			return (this.anInt2222 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(ILclient!ve;I)V")
	public void method1771(@OriginalArg(1) Class1_Sub3_Sub18 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2238 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg1;
		if ((~local20 & this.anInt2239) == 0) {
			this.anInt2235 = arg0.anInt6945;
			this.anInt2228 = arg0.anInt6947;
		} else if (arg0.anInt6945 != this.anInt2235 || arg0.anInt6947 != this.anInt2228) {
			throw new RuntimeException();
		}
		arg0.method5316(this.anInt2238, Static313.anIntArray311[arg1]);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt2239 |= local20;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(II)V")
	public void method1772() {
		if (this.anInt2238 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static313.anIntArray311[0]);
	}

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "(I)Z")
	public boolean method1773() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2238);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)V")
	@Override
	public void method1764() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2224);
		this.anInt2222 |= 0x1;
		this.anInt2238 = this.method1770();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ah;IB)V")
	public void method1774(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.method1775(arg0, arg1);
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lclient!ah;IIB)V")
	private void method1775(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2238 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt2239) == 0) {
			this.anInt2235 = arg0.anInt7338;
			this.anInt2228 = arg0.anInt7341;
		} else if (this.anInt2235 != arg0.anInt7338 || arg0.anInt7341 != this.anInt2228) {
			throw new RuntimeException();
		}
		arg0.method5542(Static313.anIntArray311[arg1], this.anInt2238);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt2239 |= local16;
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V")
	@Override
	public void method1763() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2224);
		this.anInt2222 |= 0x2;
		this.anInt2238 = this.method1770();
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(II)V")
	public void method1776(@OriginalArg(1) int arg0) {
		if (this.anInterface3Array1[arg0] != null) {
			this.anInterface3Array1[arg0].method5532();
		}
		this.anInt2239 &= ~(0x1 << arg0);
		this.anInterface3Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)V")
	@Override
	public void method1760() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2222 &= 0xFFFFFFFD;
		this.anInt2238 = this.method1770();
	}
}
