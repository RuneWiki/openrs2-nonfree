import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!faa")
public final class Class98 implements Interface6 {

	@OriginalMember(owner = "client!faa", name = "t", descriptor = "I")
	private int anInt2490;

	@OriginalMember(owner = "client!faa", name = "v", descriptor = "I")
	private int anInt2492;

	@OriginalMember(owner = "client!faa", name = "D", descriptor = "I")
	private int anInt2497;

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "I")
	private int anInt2474 = -1;

	@OriginalMember(owner = "client!faa", name = "w", descriptor = "I")
	private int anInt2493 = 0;

	@OriginalMember(owner = "client!faa", name = "s", descriptor = "[Lclient!ak;")
	private final Interface2[] anInterface2Array1 = new Interface2[9];

	@OriginalMember(owner = "client!faa", name = "B", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_9;

	@OriginalMember(owner = "client!faa", name = "o", descriptor = "I")
	private final int anInt2487;

	@OriginalMember(owner = "client!faa", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class98(@OriginalArg(0) Class134_Sub2 arg0) {
		if (!arg0.aBoolean518) {
			throw new IllegalStateException("");
		}
		this.aClass134_Sub2_9 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static95.anIntArray178, 0);
		this.anInt2487 = Static95.anIntArray178[0];
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(II)V")
	public void method1973(@OriginalArg(0) int arg0) {
		if (this.anInterface2Array1[arg0] != null) {
			this.anInterface2Array1[arg0].method5870();
		}
		this.anInt2490 &= ~(0x1 << arg0);
		this.anInterface2Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!faa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub2_9.method5251(this.anInt2487);
		super.finalize();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILclient!qe;B)V")
	public void method1974(@OriginalArg(1) int arg0, @OriginalArg(2) Class40_Sub4 arg1) {
		this.method1983(arg0, arg1);
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(I)Z")
	public boolean method1975() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt2474);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!faa", name = "c", descriptor = "(B)V")
	@Override
	public void method1972() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt2493 &= 0xFFFFFFFE;
		this.anInt2474 = this.method1978();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILclient!wn;I)V")
	private void method1977(@OriginalArg(0) int arg0, @OriginalArg(2) Class40_Sub3 arg1) {
		if (this.anInt2474 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((this.anInt2490 & ~local20) == 0) {
			this.anInt2492 = arg1.anInt6741;
			this.anInt2497 = arg1.anInt6745;
		} else if (this.anInt2492 != arg1.anInt6741 || this.anInt2497 != arg1.anInt6745) {
			throw new RuntimeException();
		}
		arg1.method5390(Static340.anIntArray464[arg0], this.anInt2474);
		this.anInterface2Array1[arg0] = arg1;
		this.anInt2490 |= local20;
	}

	@OriginalMember(owner = "client!faa", name = "d", descriptor = "(B)I")
	private int method1978() {
		if ((this.anInt2493 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt2493 & 0x2) == 0) {
			return (this.anInt2493 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(II)V")
	public void method1979(@OriginalArg(0) int arg0) {
		if (this.anInt2474 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static340.anIntArray464[arg0]);
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(B)V")
	@Override
	public void method1969() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt2493 &= 0xFFFFFFFD;
		this.anInt2474 = this.method1978();
	}

	@OriginalMember(owner = "client!faa", name = "b", descriptor = "(I)V")
	@Override
	public void method1970() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt2487);
		this.anInt2493 |= 0x4;
		this.anInt2474 = this.method1978();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(B)V")
	@Override
	public void method1967() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt2487);
		this.anInt2493 |= 0x1;
		this.anInt2474 = this.method1978();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(I)V")
	@Override
	public void method1968() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt2493 &= 0xFFFFFFFB;
		this.anInt2474 = this.method1978();
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Lclient!wn;IB)V")
	public void method1981(@OriginalArg(0) Class40_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.method1977(arg1, arg0);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IB)V")
	public void method1982() {
		if (this.anInt2474 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static340.anIntArray464[0]);
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IIBILclient!qe;)V")
	private void method1983(@OriginalArg(0) int arg0, @OriginalArg(4) Class40_Sub4 arg1) {
		if (this.anInt2474 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt2490 & 0xFFFFFFFE) == 0) {
			this.anInt2492 = arg1.anInt7369;
			this.anInt2497 = arg1.anInt7369;
		} else if (arg1.anInt7369 != this.anInt2492 || arg1.anInt7369 != this.anInt2497) {
			throw new RuntimeException();
		}
		arg1.method5880(arg0, this.anInt2474, Static340.anIntArray464[0]);
		this.anInterface2Array1[0] = arg1;
		this.anInt2490 |= 0x1;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(IILclient!eaa;)V")
	public void method1984(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub6_Sub3 arg1) {
		if (this.anInt2474 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg0;
		if ((this.anInt2490 & ~local21) == 0) {
			this.anInt2492 = arg1.anInt2054;
			this.anInt2497 = arg1.anInt2049;
		} else if (arg1.anInt2054 != this.anInt2492 || arg1.anInt2049 != this.anInt2497) {
			throw new RuntimeException();
		}
		arg1.method1683(Static340.anIntArray464[arg0], this.anInt2474);
		this.anInterface2Array1[arg0] = arg1;
		this.anInt2490 |= local21;
	}

	@OriginalMember(owner = "client!faa", name = "a", descriptor = "(Z)V")
	@Override
	public void method1971() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt2487);
		this.anInt2493 |= 0x2;
		this.anInt2474 = this.method1978();
	}
}
