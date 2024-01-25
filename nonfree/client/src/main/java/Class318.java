import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class318 implements Interface26 {

	@OriginalMember(owner = "client!sca", name = "j", descriptor = "I")
	private int anInt8752;

	@OriginalMember(owner = "client!sca", name = "n", descriptor = "I")
	private int anInt8755;

	@OriginalMember(owner = "client!sca", name = "y", descriptor = "I")
	private int anInt8765;

	@OriginalMember(owner = "client!sca", name = "g", descriptor = "[Lclient!nia;")
	private final Interface19[] anInterface19Array1 = new Interface19[9];

	@OriginalMember(owner = "client!sca", name = "s", descriptor = "I")
	private int anInt8760 = -1;

	@OriginalMember(owner = "client!sca", name = "B", descriptor = "I")
	private int anInt8768 = 0;

	@OriginalMember(owner = "client!sca", name = "v", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_35;

	@OriginalMember(owner = "client!sca", name = "p", descriptor = "I")
	private final int anInt8757;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(Lclient!kv;)V")
	public Class318(@OriginalArg(0) Class143_Sub2 arg0) {
		if (!arg0.aBoolean420) {
			throw new IllegalStateException("");
		}
		this.aClass143_Sub2_35 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static589.anIntArray533, 0);
		this.anInt8757 = Static589.anIntArray533[0];
	}

	@OriginalMember(owner = "client!sca", name = "d", descriptor = "(I)V")
	@Override
	public void method7385() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8768 &= 0xFFFFFFFD;
		this.anInt8760 = this.method7390();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IB)V")
	public void method7388(@OriginalArg(0) int arg0) {
		if (this.anInterface19Array1[arg0] != null) {
			this.anInterface19Array1[arg0].method6695();
		}
		this.anInt8765 &= ~(0x1 << arg0);
		this.anInterface19Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(II)V")
	public void method7389(@OriginalArg(0) int arg0) {
		if (this.anInt8760 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static86.anIntArray77[arg0]);
	}

	@OriginalMember(owner = "client!sca", name = "e", descriptor = "(I)I")
	private int method7390() {
		if ((this.anInt8768 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8768 & 0x2) == 0) {
			return (this.anInt8768 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(Z)V")
	@Override
	public void method7384() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8768 &= 0xFFFFFFFB;
		this.anInt8760 = this.method7390();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!mu;IZII)V")
	private void method7391(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt8760 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8765 & 0xFFFFFFFE) == 0) {
			this.anInt8752 = arg0.anInt6605;
			this.anInt8755 = arg0.anInt6605;
		} else if (arg0.anInt6605 != this.anInt8752 || this.anInt8755 != arg0.anInt6605) {
			throw new RuntimeException();
		}
		arg0.method5571(this.anInt8760, Static86.anIntArray77[0], arg1);
		this.anInterface19Array1[0] = arg0;
		this.anInt8765 |= 0x1;
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(I)V")
	@Override
	public void method7382() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8768 &= 0xFFFFFFFE;
		this.anInt8760 = this.method7390();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7381() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8757);
		this.anInt8768 |= 0x1;
		this.anInt8760 = this.method7390();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I)V")
	@Override
	public void method7380() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8757);
		this.anInt8768 |= 0x4;
		this.anInt8760 = this.method7390();
	}

	@OriginalMember(owner = "client!sca", name = "b", descriptor = "(B)Z")
	public boolean method7392() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8760);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!ho;II)V")
	public void method7393(@OriginalArg(0) Class44_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7399(arg1, arg0);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ZI)V")
	public void method7394() {
		if (this.anInt8760 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static86.anIntArray77[0]);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(ILclient!gba;Z)V")
	public void method7395(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub6 arg1) {
		if (this.anInt8760 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((this.anInt8765 & ~local20) == 0) {
			this.anInt8752 = arg1.anInt2935;
			this.anInt8755 = arg1.anInt2928;
		} else if (this.anInt8752 != arg1.anInt2935 || arg1.anInt2928 != this.anInt8755) {
			throw new RuntimeException();
		}
		arg1.method2618(this.anInt8760, Static86.anIntArray77[arg0]);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt8765 |= local20;
	}

	@OriginalMember(owner = "client!sca", name = "c", descriptor = "(I)V")
	@Override
	public void method7383() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8757);
		this.anInt8768 |= 0x2;
		this.anInt8760 = this.method7390();
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!mu;III)V")
	public void method7398(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(3) int arg1) {
		this.method7391(arg0, arg1);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IILclient!ho;I)V")
	private void method7399(@OriginalArg(0) int arg0, @OriginalArg(2) Class44_Sub1 arg1) {
		if (this.anInt8760 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg0;
		if ((this.anInt8765 & ~local17) == 0) {
			this.anInt8752 = arg1.anInt847;
			this.anInt8755 = arg1.anInt838;
		} else if (this.anInt8752 != arg1.anInt847 || arg1.anInt838 != this.anInt8755) {
			throw new RuntimeException();
		}
		arg1.method797(this.anInt8760, Static86.anIntArray77[arg0]);
		this.anInterface19Array1[arg0] = arg1;
		this.anInt8765 |= local17;
	}

	@OriginalMember(owner = "client!sca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub2_35.method4951(this.anInt8757);
		super.finalize();
	}
}
