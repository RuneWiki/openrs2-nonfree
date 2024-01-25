import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qf")
public final class Class269 implements Interface9 {

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
	private int anInt8227;

	@OriginalMember(owner = "client!qf", name = "o", descriptor = "I")
	private int anInt8238;

	@OriginalMember(owner = "client!qf", name = "z", descriptor = "I")
	private int anInt8247;

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "[Lclient!nga;")
	private final Interface12[] anInterface12Array1 = new Interface12[9];

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	private int anInt8240 = -1;

	@OriginalMember(owner = "client!qf", name = "y", descriptor = "I")
	private int anInt8246 = 0;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "Lclient!ji;")
	private final Class15_Sub3 aClass15_Sub3_27;

	@OriginalMember(owner = "client!qf", name = "p", descriptor = "I")
	private final int anInt8239;

	@OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lclient!ji;)V")
	public Class269(@OriginalArg(0) Class15_Sub3 arg0) {
		if (!arg0.aBoolean444) {
			throw new IllegalStateException("");
		}
		this.aClass15_Sub3_27 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static63.anIntArray79, 0);
		this.anInt8239 = Static63.anIntArray79[0];
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	@Override
	public void method6771() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8239);
		this.anInt8246 |= 0x4;
		this.anInt8240 = this.method6784();
	}

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "(I)Z")
	public boolean method6773() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8240);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!qf", name = "e", descriptor = "(I)V")
	@Override
	public void method6772() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8246 &= 0xFFFFFFFD;
		this.anInt8240 = this.method6784();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(II)V")
	public void method6775() {
		if (this.anInt8240 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static489.anIntArray586[0]);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILclient!gfa;I)V")
	private void method6776(@OriginalArg(0) int arg0, @OriginalArg(3) Class11_Sub3 arg1) {
		if (this.anInt8240 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8227 & 0xFFFFFFFE) == 0) {
			this.anInt8238 = arg1.anInt3455;
			this.anInt8247 = arg1.anInt3455;
		} else if (arg1.anInt3455 != this.anInt8247 || arg1.anInt3455 != this.anInt8238) {
			throw new RuntimeException();
		}
		arg1.method3044(this.anInt8240, arg0, Static489.anIntArray586[0]);
		this.anInterface12Array1[0] = arg1;
		this.anInt8227 |= 0x1;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ILclient!gfa;IZ)V")
	public void method6777(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub3 arg1) {
		this.method6776(arg0, arg1);
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIILclient!vga;)V")
	private void method6778(@OriginalArg(0) int arg0, @OriginalArg(3) Class11_Sub2 arg1) {
		if (this.anInt8240 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt8227 & ~local16) == 0) {
			this.anInt8247 = arg1.anInt1686;
			this.anInt8238 = arg1.anInt1687;
		} else if (this.anInt8247 != arg1.anInt1686 || this.anInt8238 != arg1.anInt1687) {
			throw new RuntimeException();
		}
		arg1.method1634(Static489.anIntArray586[arg0], this.anInt8240);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt8227 |= local16;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(IILclient!wj;)V")
	public void method6779(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4_Sub19 arg1) {
		if (this.anInt8240 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt8227) == 0) {
			this.anInt8247 = arg1.anInt10260;
			this.anInt8238 = arg1.anInt10266;
		} else if (arg1.anInt10260 != this.anInt8247 || this.anInt8238 != arg1.anInt10266) {
			throw new RuntimeException();
		}
		arg1.method8314(Static489.anIntArray586[arg0], this.anInt8240);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt8227 |= local16;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BI)V")
	public void method6780(@OriginalArg(1) int arg0) {
		if (this.anInt8240 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static489.anIntArray586[arg0]);
	}

	@OriginalMember(owner = "client!qf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass15_Sub3_27.method4406(this.anInt8239);
		super.finalize();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!vga;IB)V")
	public void method6781(@OriginalArg(0) Class11_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.method6778(arg1, arg0);
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(II)V")
	public void method6783(@OriginalArg(1) int arg0) {
		if (this.anInterface12Array1[arg0] != null) {
			this.anInterface12Array1[arg0].method8310();
		}
		this.anInt8227 &= ~(0x1 << arg0);
		this.anInterface12Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(I)V")
	@Override
	public void method6769() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8246 &= 0xFFFFFFFB;
		this.anInt8240 = this.method6784();
	}

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "(B)I")
	private int method6784() {
		if ((this.anInt8246 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8246 & 0x2) == 0) {
			return (this.anInt8246 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "(I)V")
	@Override
	public void method6770() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8246 &= 0xFFFFFFFE;
		this.anInt8240 = this.method6784();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	@Override
	public void method6767() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8239);
		this.anInt8246 |= 0x1;
		this.anInt8240 = this.method6784();
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)V")
	@Override
	public void method6768() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8239);
		this.anInt8246 |= 0x2;
		this.anInt8240 = this.method6784();
	}
}
