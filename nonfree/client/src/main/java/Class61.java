import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class61 implements Interface10 {

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
	private int anInt1725;

	@OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
	private int anInt1731;

	@OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
	private int anInt1743;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "[Lclient!am;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
	private int anInt1737 = -1;

	@OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
	private int anInt1739 = 0;

	@OriginalMember(owner = "client!eb", name = "t", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_11;

	@OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
	private final int anInt1741;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!pg;)V")
	public Class61(@OriginalArg(0) Class163_Sub2 arg0) {
		if (!arg0.aBoolean368) {
			throw new IllegalStateException("");
		}
		this.aClass163_Sub2_11 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static183.anIntArray247, 0);
		this.anInt1741 = Static183.anIntArray247[0];
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)V")
	public void method1400() {
		if (this.anInt1737 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static319.anIntArray479[0]);
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!rc;BI)V")
	public void method1401(@OriginalArg(0) Class2_Sub5_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1737 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg1;
		if ((~local22 & this.anInt1725) == 0) {
			this.anInt1731 = arg0.anInt5769;
			this.anInt1743 = arg0.anInt5762;
		} else if (arg0.anInt5762 != this.anInt1743 || arg0.anInt5769 != this.anInt1731) {
			throw new RuntimeException();
		}
		arg0.method4533(this.anInt1737, Static319.anIntArray479[arg1]);
		this.anInterface1Array1[arg1] = arg0;
		this.anInt1725 |= local22;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(II)V")
	public void method1402(@OriginalArg(1) int arg0) {
		if (this.anInt1737 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static319.anIntArray479[arg0]);
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
	@Override
	public void method1399() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1741);
		this.anInt1739 |= 0x4;
		this.anInt1737 = this.method1404();
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)I")
	private int method1404() {
		if ((this.anInt1739 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1739 & 0x2) == 0) {
			return (this.anInt1739 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)I")
	public int method1405() {
		return this.anInt1731;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(B)V")
	@Override
	public void method1396() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1739 &= 0xFFFFFFFB;
		this.anInt1737 = this.method1404();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!gi;II)V")
	private void method1406(@OriginalArg(2) Class20_Sub3 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt1737 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1725 & -2) == 0) {
			this.anInt1731 = arg0.anInt2389;
			this.anInt1743 = arg0.anInt2389;
		} else if (arg0.anInt2389 != this.anInt1743 || this.anInt1731 != arg0.anInt2389) {
			throw new RuntimeException();
		}
		arg0.method1982(arg1, this.anInt1737, Static319.anIntArray479[0]);
		this.anInterface1Array1[0] = arg0;
		this.anInt1725 |= 0x1;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V")
	@Override
	public void method1395() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1741);
		this.anInt1739 |= 0x1;
		this.anInt1737 = this.method1404();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
	@Override
	public void method1394() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1741);
		this.anInt1739 |= 0x2;
		this.anInt1737 = this.method1404();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)V")
	public void method1407(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method4531();
		}
		this.anInt1725 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIILclient!gi;)V")
	public void method1408(@OriginalArg(1) int arg0, @OriginalArg(3) Class20_Sub3 arg1) {
		this.method1406(arg1, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
	@Override
	public void method1398() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1739 &= 0xFFFFFFFD;
		this.anInt1737 = this.method1404();
	}

	@OriginalMember(owner = "client!eb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass163_Sub2_11.method4120(this.anInt1741);
		super.finalize();
	}

	@OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)Z")
	public boolean method1410() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1737);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V")
	@Override
	public void method1397() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1739 &= 0xFFFFFFFE;
		this.anInt1737 = this.method1404();
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZLclient!bd;II)V")
	private void method1412(@OriginalArg(1) Class20_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1737 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt1725) == 0) {
			this.anInt1743 = arg0.anInt2466;
			this.anInt1731 = arg0.anInt2464;
		} else if (this.anInt1743 != arg0.anInt2466 || arg0.anInt2464 != this.anInt1731) {
			throw new RuntimeException();
		}
		arg0.method2045(Static319.anIntArray479[arg1], this.anInt1737);
		this.anInterface1Array1[arg1] = arg0;
		this.anInt1725 |= local15;
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILclient!bd;)V")
	public void method1413(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub1 arg1) {
		this.method1412(arg1, arg0);
	}
}
