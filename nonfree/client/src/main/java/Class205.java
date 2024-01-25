import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class205 implements Interface12 {

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "I")
	private int anInt6061;

	@OriginalMember(owner = "client!ne", name = "w", descriptor = "I")
	private int anInt6065;

	@OriginalMember(owner = "client!ne", name = "F", descriptor = "I")
	private int anInt6073;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "[Lclient!waa;")
	private final Interface19[] anInterface19Array1 = new Interface19[9];

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
	private int anInt6048 = 0;

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
	private int anInt6050 = -1;

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_25;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "I")
	private final int anInt6057;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(Lclient!te;)V")
	public Class205(@OriginalArg(0) Class9_Sub3 arg0) {
		if (!arg0.aBoolean527) {
			throw new IllegalStateException("");
		}
		this.aClass9_Sub3_25 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static74.anIntArray170, 0);
		this.anInt6057 = Static74.anIntArray170[0];
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!ci;IIB)V")
	public void method5226(@OriginalArg(0) Class20_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method5230(arg0, arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public void method5227(@OriginalArg(1) int arg0) {
		if (this.anInt6050 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static320.anIntArray442[arg0]);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BILclient!hk;)V")
	public void method5228(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub1_Sub9 arg1) {
		if (this.anInt6050 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg0;
		if ((~local22 & this.anInt6061) == 0) {
			this.anInt6073 = arg1.anInt3908;
			this.anInt6065 = arg1.anInt3914;
		} else if (this.anInt6065 != arg1.anInt3914 || arg1.anInt3908 != this.anInt6073) {
			throw new RuntimeException();
		}
		arg1.method3493(this.anInt6050, Static320.anIntArray442[arg0]);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt6061 |= local22;
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	@Override
	public void method5225() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6057);
		this.anInt6048 |= 0x1;
		this.anInt6050 = this.method5241();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZLclient!ci;II)V")
	private void method5230(@OriginalArg(2) Class20_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt6050 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6061 & 0xFFFFFFFE) == 0) {
			this.anInt6073 = arg0.anInt1675;
			this.anInt6065 = arg0.anInt1675;
		} else if (this.anInt6065 != arg0.anInt1675 || arg0.anInt1675 != this.anInt6073) {
			throw new RuntimeException();
		}
		arg0.method1661(Static320.anIntArray442[0], arg1, this.anInt6050);
		this.anInterface19Array1[0] = arg0;
		this.anInt6061 |= 0x1;
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(B)Z")
	public boolean method5232() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6050);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ne", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub3_25.method6726(this.anInt6057);
		super.finalize();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V")
	public void method5233(@OriginalArg(0) int arg0) {
		if (this.anInterface19Array1[arg0] != null) {
			this.anInterface19Array1[arg0].method6233();
		}
		this.anInt6061 &= ~(0x1 << arg0);
		this.anInterface19Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
	public int method5234() {
		return this.anInt6073;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V")
	@Override
	public void method5222() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6057);
		this.anInt6048 |= 0x4;
		this.anInt6050 = this.method5241();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILclient!ea;I)V")
	private void method5235(@OriginalArg(2) Class20_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt6050 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt6061 & ~local16) == 0) {
			this.anInt6073 = arg0.anInt7340;
			this.anInt6065 = arg0.anInt7338;
		} else if (this.anInt6065 != arg0.anInt7338 || this.anInt6073 != arg0.anInt7340) {
			throw new RuntimeException();
		}
		arg0.method6249(Static320.anIntArray442[arg1], this.anInt6050);
		this.anInterface19Array1[arg1] = arg0;
		this.anInt6061 |= local16;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)V")
	public void method5236() {
		if (this.anInt6050 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static320.anIntArray442[0]);
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)V")
	@Override
	public void method5223() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6057);
		this.anInt6048 |= 0x2;
		this.anInt6050 = this.method5241();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	@Override
	public void method5221() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6048 &= 0xFFFFFFFD;
		this.anInt6050 = this.method5241();
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)V")
	@Override
	public void method5224() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6048 &= 0xFFFFFFFB;
		this.anInt6050 = this.method5241();
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZLclient!ea;I)V")
	public void method5240(@OriginalArg(1) Class20_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method5235(arg0, arg1);
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(B)I")
	private int method5241() {
		if ((this.anInt6048 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6048 & 0x2) == 0) {
			return (this.anInt6048 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
	@Override
	public void method5220() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6048 &= 0xFFFFFFFE;
		this.anInt6050 = this.method5241();
	}
}
