import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class52 implements Interface20 {

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	private int anInt1589;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	private int anInt1596;

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	private int anInt1599;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	private int anInt1597 = 0;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "I")
	private int anInt1604 = -1;

	@OriginalMember(owner = "client!cb", name = "D", descriptor = "[Lclient!ke;")
	private final Interface10[] anInterface10Array1 = new Interface10[9];

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!aq;")
	private final Class22_Sub1 aClass22_Sub1_3;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "I")
	private final int anInt1603;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!aq;)V")
	public Class52(@OriginalArg(0) Class22_Sub1 arg0) {
		if (!arg0.aBoolean66) {
			throw new IllegalStateException("");
		}
		this.aClass22_Sub1_3 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static67.anIntArray86, 0);
		this.anInt1603 = Static67.anIntArray86[0];
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!fu;IBI)V")
	private void method1507(@OriginalArg(0) Class125_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt1604 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt1599 & ~local16) == 0) {
			this.anInt1589 = arg0.anInt10858;
			this.anInt1596 = arg0.anInt10867;
		} else if (arg0.anInt10867 != this.anInt1596 || this.anInt1589 != arg0.anInt10858) {
			throw new RuntimeException();
		}
		arg0.method9219(this.anInt1604, Static109.anIntArray132[arg1]);
		this.anInterface10Array1[arg1] = arg0;
		this.anInt1599 |= local16;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)V")
	public void method1508() {
		if (this.anInt1604 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static109.anIntArray132[0]);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IILclient!fu;)V")
	public void method1509(@OriginalArg(1) int arg0, @OriginalArg(2) Class125_Sub1 arg1) {
		this.method1507(arg1, arg0);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public boolean method1510() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt1604);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)V")
	public void method1512(@OriginalArg(1) int arg0) {
		if (this.anInterface10Array1[arg0] != null) {
			this.anInterface10Array1[arg0].method9208();
		}
		this.anInt1599 &= ~(0x1 << arg0);
		this.anInterface10Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	@Override
	public void method1501() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt1603);
		this.anInt1597 |= 0x4;
		this.anInt1604 = this.method1516();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	@Override
	public void method1503() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt1603);
		this.anInt1597 |= 0x2;
		this.anInt1604 = this.method1516();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!df;II)V")
	public void method1515(@OriginalArg(0) Class3_Sub7_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt1604 == -1) {
			throw new RuntimeException();
		}
		@Pc(18) int local18 = 0x1 << arg1;
		if ((~local18 & this.anInt1599) == 0) {
			this.anInt1589 = arg0.anInt2278;
			this.anInt1596 = arg0.anInt2291;
		} else if (arg0.anInt2291 != this.anInt1596 || this.anInt1589 != arg0.anInt2278) {
			throw new RuntimeException();
		}
		arg0.method2113(Static109.anIntArray132[arg1], this.anInt1604);
		this.anInterface10Array1[arg1] = arg0;
		this.anInt1599 |= local18;
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
	private int method1516() {
		if ((this.anInt1597 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt1597 & 0x2) == 0) {
			return (this.anInt1597 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	@Override
	public void method1502() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt1597 &= 0xFFFFFFFE;
		this.anInt1604 = this.method1516();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ia;IIIB)V")
	private void method1517(@OriginalArg(0) Class125_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt1604 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt1599 & 0xFFFFFFFE) == 0) {
			this.anInt1589 = arg0.anInt4082;
			this.anInt1596 = arg0.anInt4082;
		} else if (arg0.anInt4082 != this.anInt1596 || this.anInt1589 != arg0.anInt4082) {
			throw new RuntimeException();
		}
		arg0.method3721(arg1, Static109.anIntArray132[0], this.anInt1604);
		this.anInterface10Array1[0] = arg0;
		this.anInt1599 |= 0x1;
	}

	@OriginalMember(owner = "client!cb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass22_Sub1_3.method922(this.anInt1603);
		super.finalize();
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
	@Override
	public void method1504() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt1597 &= 0xFFFFFFFD;
		this.anInt1604 = this.method1516();
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)V")
	public void method1518(@OriginalArg(1) int arg0) {
		if (this.anInt1604 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static109.anIntArray132[arg0]);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!ia;II)V")
	public void method1519(@OriginalArg(1) Class125_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method1517(arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	@Override
	public void method1505() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt1603);
		this.anInt1597 |= 0x1;
		this.anInt1604 = this.method1516();
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	@Override
	public void method1506() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt1597 &= 0xFFFFFFFB;
		this.anInt1604 = this.method1516();
	}
}
