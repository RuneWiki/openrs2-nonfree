import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tea")
public final class Class333 implements Interface3 {

	@OriginalMember(owner = "client!tea", name = "r", descriptor = "I")
	private int anInt8896;

	@OriginalMember(owner = "client!tea", name = "x", descriptor = "I")
	private int anInt8902;

	@OriginalMember(owner = "client!tea", name = "z", descriptor = "I")
	private int anInt8904;

	@OriginalMember(owner = "client!tea", name = "s", descriptor = "I")
	private int anInt8897 = 0;

	@OriginalMember(owner = "client!tea", name = "q", descriptor = "I")
	private int anInt8895 = -1;

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "[Lclient!ifa;")
	private final Interface13[] anInterface13Array1 = new Interface13[9];

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "Lclient!ep;")
	private final Class95_Sub1 aClass95_Sub1_38;

	@OriginalMember(owner = "client!tea", name = "w", descriptor = "I")
	private final int anInt8901;

	@OriginalMember(owner = "client!tea", name = "<init>", descriptor = "(Lclient!ep;)V")
	public Class333(@OriginalArg(0) Class95_Sub1 arg0) {
		if (!arg0.aBoolean184) {
			throw new IllegalStateException("");
		}
		this.aClass95_Sub1_38 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static42.anIntArray425, 0);
		this.anInt8901 = Static42.anIntArray425[0];
	}

	@OriginalMember(owner = "client!tea", name = "e", descriptor = "(I)V")
	@Override
	public void method7478() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8897 &= 0xFFFFFFFD;
		this.anInt8895 = this.method7489();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IILclient!rh;I)V")
	public void method7482(@OriginalArg(0) int arg0, @OriginalArg(2) Class65_Sub4 arg1) {
		this.method7487(arg0, arg1);
	}

	@OriginalMember(owner = "client!tea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub1_38.method2085(this.anInt8901);
		super.finalize();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(I)V")
	@Override
	public void method7473() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8897 &= 0xFFFFFFFB;
		this.anInt8895 = this.method7489();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ILclient!fq;I)V")
	public void method7483(@OriginalArg(1) Class65_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7484(arg1, arg0);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(IIILclient!fq;)V")
	private void method7484(@OriginalArg(0) int arg0, @OriginalArg(3) Class65_Sub1 arg1) {
		if (this.anInt8895 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt8902) == 0) {
			this.anInt8896 = arg1.anInt1686;
			this.anInt8904 = arg1.anInt1694;
		} else if (arg1.anInt1694 != this.anInt8904 || arg1.anInt1686 != this.anInt8896) {
			throw new RuntimeException();
		}
		arg1.method1429(this.anInt8895, Static221.anIntArray248[arg0]);
		this.anInterface13Array1[arg0] = arg1;
		this.anInt8902 |= local16;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(II)V")
	public void method7485(@OriginalArg(0) int arg0) {
		if (this.anInterface13Array1[arg0] != null) {
			this.anInterface13Array1[arg0].method6824();
		}
		this.anInt8902 &= ~(0x1 << arg0);
		this.anInterface13Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(BI)V")
	public void method7486() {
		if (this.anInt8895 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static221.anIntArray248[0]);
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(I)V")
	@Override
	public void method7475() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8901);
		this.anInt8897 |= 0x2;
		this.anInt8895 = this.method7489();
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(ZIILclient!rh;I)V")
	private void method7487(@OriginalArg(2) int arg0, @OriginalArg(3) Class65_Sub4 arg1) {
		if (this.anInt8895 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8902 & 0xFFFFFFFE) == 0) {
			this.anInt8896 = arg1.anInt8066;
			this.anInt8904 = arg1.anInt8066;
		} else if (this.anInt8904 != arg1.anInt8066 || arg1.anInt8066 != this.anInt8896) {
			throw new RuntimeException();
		}
		arg1.method6837(arg0, Static221.anIntArray248[0], this.anInt8895);
		this.anInterface13Array1[0] = arg1;
		this.anInt8902 |= 0x1;
	}

	@OriginalMember(owner = "client!tea", name = "b", descriptor = "(II)V")
	public void method7488(@OriginalArg(1) int arg0) {
		if (this.anInt8895 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static221.anIntArray248[arg0]);
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(B)V")
	@Override
	public void method7474() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8901);
		this.anInt8897 |= 0x4;
		this.anInt8895 = this.method7489();
	}

	@OriginalMember(owner = "client!tea", name = "f", descriptor = "(I)I")
	private int method7489() {
		if ((this.anInt8897 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8897 & 0x2) == 0) {
			return (this.anInt8897 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!tea", name = "d", descriptor = "(I)V")
	@Override
	public void method7477() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8897 &= 0xFFFFFFFE;
		this.anInt8895 = this.method7489();
	}

	@OriginalMember(owner = "client!tea", name = "c", descriptor = "(I)V")
	@Override
	public void method7476() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8901);
		this.anInt8897 |= 0x1;
		this.anInt8895 = this.method7489();
	}

	@OriginalMember(owner = "client!tea", name = "g", descriptor = "(I)Z")
	public boolean method7490() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8895);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!tea", name = "a", descriptor = "(Lclient!lf;IZ)V")
	public void method7491(@OriginalArg(0) Class2_Sub2_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8895 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg1;
		if ((~local22 & this.anInt8902) == 0) {
			this.anInt8904 = arg0.anInt5079;
			this.anInt8896 = arg0.anInt5076;
		} else if (this.anInt8904 != arg0.anInt5079 || this.anInt8896 != arg0.anInt5076) {
			throw new RuntimeException();
		}
		arg0.method4277(Static221.anIntArray248[arg1], this.anInt8895);
		this.anInterface13Array1[arg1] = arg0;
		this.anInt8902 |= local22;
	}
}
