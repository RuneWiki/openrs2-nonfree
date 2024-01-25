import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nn")
public final class Class172 implements Interface13 {

	@OriginalMember(owner = "client!nn", name = "q", descriptor = "I")
	private int anInt5121;

	@OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
	private int anInt5122;

	@OriginalMember(owner = "client!nn", name = "y", descriptor = "I")
	private int anInt5128;

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "I")
	private int anInt5113 = 0;

	@OriginalMember(owner = "client!nn", name = "i", descriptor = "[Lclient!bv;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!nn", name = "p", descriptor = "I")
	private int anInt5120 = -1;

	@OriginalMember(owner = "client!nn", name = "h", descriptor = "Lclient!bt;")
	private final Class30_Sub1 aClass30_Sub1_31;

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "I")
	private final int anInt5109;

	@OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(Lclient!bt;)V")
	public Class172(@OriginalArg(0) Class30_Sub1 arg0) {
		if (!arg0.aBoolean60) {
			throw new IllegalStateException("");
		}
		this.aClass30_Sub1_31 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static7.anIntArray8, 0);
		this.anInt5109 = Static7.anIntArray8[0];
	}

	@OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V")
	@Override
	public void method4323() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt5109);
		this.anInt5113 |= 0x2;
		this.anInt5120 = this.method4327();
	}

	@OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)Z")
	public boolean method4326() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt5120);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!nn", name = "f", descriptor = "(I)I")
	private int method4327() {
		if ((this.anInt5113 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt5113 & 0x2) == 0) {
			return (this.anInt5113 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZ)V")
	public void method4328(@OriginalArg(0) int arg0) {
		if (this.anInt5120 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static352.anIntArray501[arg0]);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IZILclient!hp;)V")
	public void method4329(@OriginalArg(0) int arg0, @OriginalArg(3) Class62_Sub3 arg1) {
		this.method4336(arg1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V")
	@Override
	public void method4324() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt5113 &= 0xFFFFFFFB;
		this.anInt5120 = this.method4327();
	}

	@OriginalMember(owner = "client!nn", name = "d", descriptor = "(I)V")
	@Override
	public void method4325() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt5109);
		this.anInt5113 |= 0x4;
		this.anInt5120 = this.method4327();
	}

	@OriginalMember(owner = "client!nn", name = "g", descriptor = "(I)I")
	public int method4331() {
		return this.anInt5128;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IILclient!uk;)V")
	public void method4332(@OriginalArg(0) int arg0, @OriginalArg(2) Class62_Sub2 arg1) {
		this.method4333(arg1, arg0);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lclient!uk;III)V")
	private void method4333(@OriginalArg(0) Class62_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5120 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt5122 & ~local15) == 0) {
			this.anInt5121 = arg0.anInt3019;
			this.anInt5128 = arg0.anInt3021;
		} else if (arg0.anInt3019 != this.anInt5121 || this.anInt5128 != arg0.anInt3021) {
			throw new RuntimeException();
		}
		arg0.method2689(Static352.anIntArray501[arg1], this.anInt5120);
		this.anInterface1Array1[arg1] = arg0;
		this.anInt5122 |= local15;
	}

	@OriginalMember(owner = "client!nn", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_31.method696(this.anInt5109);
		super.finalize();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
	@Override
	public void method4320() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt5109);
		this.anInt5113 |= 0x1;
		this.anInt5120 = this.method4327();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(B)V")
	@Override
	public void method4322() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt5113 &= 0xFFFFFFFD;
		this.anInt5120 = this.method4327();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BI)V")
	public void method4334(@OriginalArg(1) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method5348();
		}
		this.anInt5122 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!nn", name = "b", descriptor = "(I)V")
	@Override
	public void method4321() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt5113 &= 0xFFFFFFFE;
		this.anInt5120 = this.method4327();
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIILclient!hp;I)V")
	private void method4336(@OriginalArg(3) Class62_Sub3 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt5120 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt5122 & 0xFFFFFFFE) == 0) {
			this.anInt5121 = arg0.anInt3200;
			this.anInt5128 = arg0.anInt3200;
		} else if (arg0.anInt3200 != this.anInt5121 || arg0.anInt3200 != this.anInt5128) {
			throw new RuntimeException();
		}
		arg0.method2865(this.anInt5120, arg1, Static352.anIntArray501[0]);
		this.anInterface1Array1[0] = arg0;
		this.anInt5122 |= 0x1;
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)V")
	public void method4337() {
		if (this.anInt5120 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static352.anIntArray501[0]);
	}

	@OriginalMember(owner = "client!nn", name = "a", descriptor = "(BILclient!at;)V")
	public void method4338(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub3 arg1) {
		if (this.anInt5120 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt5122) == 0) {
			this.anInt5121 = arg1.anInt338;
			this.anInt5128 = arg1.anInt344;
		} else if (this.anInt5121 != arg1.anInt338 || this.anInt5128 != arg1.anInt344) {
			throw new RuntimeException();
		}
		arg1.method290(this.anInt5120, Static352.anIntArray501[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt5122 |= local15;
	}
}
