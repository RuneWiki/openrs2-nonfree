import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class146 implements Interface3 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	private int anInt4223;

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "I")
	private int anInt4233;

	@OriginalMember(owner = "client!hb", name = "t", descriptor = "I")
	private int anInt4235;

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	private int anInt4231 = -1;

	@OriginalMember(owner = "client!hb", name = "v", descriptor = "[Lclient!pt;")
	private final Interface21[] anInterface21Array1 = new Interface21[9];

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	private int anInt4242 = 0;

	@OriginalMember(owner = "client!hb", name = "n", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_19;

	@OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
	private final int anInt4234;

	@OriginalMember(owner = "client!hb", name = "<init>", descriptor = "(Lclient!ml;)V")
	public Class146(@OriginalArg(0) Class75_Sub3 arg0) {
		if (!arg0.aBoolean473) {
			throw new IllegalStateException("");
		}
		this.aClass75_Sub3_19 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static268.anIntArray274, 0);
		this.anInt4234 = Static268.anIntArray274[0];
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(ZLclient!bp;II)V")
	private void method3876(@OriginalArg(1) Class44_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4231 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg1;
		if ((this.anInt4223 & ~local21) == 0) {
			this.anInt4235 = arg0.anInt3719;
			this.anInt4233 = arg0.anInt3716;
		} else if (this.anInt4235 != arg0.anInt3719 || this.anInt4233 != arg0.anInt3716) {
			throw new RuntimeException();
		}
		arg0.method3477(Static296.anIntArray294[arg1], this.anInt4231);
		this.anInterface21Array1[arg1] = arg0;
		this.anInt4223 |= local21;
	}

	@OriginalMember(owner = "client!hb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass75_Sub3_19.method5801(this.anInt4234);
		super.finalize();
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(I)V")
	@Override
	public void method3871() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4242 &= 0xFFFFFFFB;
		this.anInt4231 = this.method3886();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!gfa;III)V")
	public void method3879(@OriginalArg(0) Class44_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.method3880(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!gfa;BI)V")
	private void method3880(@OriginalArg(2) Class44_Sub2 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt4231 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4223 & 0xFFFFFFFE) == 0) {
			this.anInt4233 = arg0.anInt3805;
			this.anInt4235 = arg0.anInt3805;
		} else if (this.anInt4235 != arg0.anInt3805 || this.anInt4233 != arg0.anInt3805) {
			throw new RuntimeException();
		}
		arg0.method3539(this.anInt4231, Static296.anIntArray294[0], arg1);
		this.anInterface21Array1[0] = arg0;
		this.anInt4223 |= 0x1;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)V")
	@Override
	public void method3874() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4242 &= 0xFFFFFFFD;
		this.anInt4231 = this.method3886();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(I)V")
	@Override
	public void method3870() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4234);
		this.anInt4242 |= 0x1;
		this.anInt4231 = this.method3886();
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!jt;II)V")
	public void method3883(@OriginalArg(0) Class6_Sub2_Sub12 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4231 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg1;
		if ((~local17 & this.anInt4223) == 0) {
			this.anInt4235 = arg0.anInt5251;
			this.anInt4233 = arg0.anInt5247;
		} else if (this.anInt4235 != arg0.anInt5251 || arg0.anInt5247 != this.anInt4233) {
			throw new RuntimeException();
		}
		arg0.method4799(this.anInt4231, Static296.anIntArray294[arg1]);
		this.anInterface21Array1[arg1] = arg0;
		this.anInt4223 |= local17;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)Z")
	public boolean method3884() {
		@Pc(17) int local17 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4231);
		return local17 == 36053;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(B)V")
	@Override
	public void method3873() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4234);
		this.anInt4242 |= 0x2;
		this.anInt4231 = this.method3886();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(B)V")
	@Override
	public void method3872() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4242 &= 0xFFFFFFFE;
		this.anInt4231 = this.method3886();
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(II)V")
	public void method3885(@OriginalArg(1) int arg0) {
		if (this.anInt4231 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static296.anIntArray294[arg0]);
	}

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "(Z)I")
	private int method3886() {
		if ((this.anInt4242 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4242 & 0x2) == 0) {
			return (this.anInt4242 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IB)V")
	public void method3887(@OriginalArg(0) int arg0) {
		if (this.anInterface21Array1[arg0] != null) {
			this.anInterface21Array1[arg0].method9004();
		}
		this.anInt4223 &= ~(0x1 << arg0);
		this.anInterface21Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(II)V")
	public void method3888() {
		if (this.anInt4231 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static296.anIntArray294[0]);
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!bp;II)V")
	public void method3889(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method3876(arg0, arg1);
	}

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "(B)V")
	@Override
	public void method3875() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4234);
		this.anInt4242 |= 0x4;
		this.anInt4231 = this.method3886();
	}
}
