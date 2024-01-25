import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rg")
public final class Class295 implements Interface23 {

	@OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
	private int anInt9014;

	@OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
	private int anInt9015;

	@OriginalMember(owner = "client!rg", name = "w", descriptor = "I")
	private int anInt9017;

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "[Lclient!pca;")
	private final Interface20[] anInterface20Array1 = new Interface20[9];

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
	private int anInt9006 = 0;

	@OriginalMember(owner = "client!rg", name = "j", descriptor = "I")
	private int anInt9007 = -1;

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "Lclient!qo;")
	private final Class20_Sub3 aClass20_Sub3_34;

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
	private final int anInt9021;

	@OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lclient!qo;)V")
	public Class295(@OriginalArg(0) Class20_Sub3 arg0) {
		if (!arg0.aBoolean626) {
			throw new IllegalStateException("");
		}
		this.aClass20_Sub3_34 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static349.anIntArray436, 0);
		this.anInt9021 = Static349.anIntArray436[0];
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)V")
	@Override
	public void method7554() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9006 &= 0xFFFFFFFE;
		this.anInt9007 = this.method7566();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIILclient!q;)V")
	public void method7560(@OriginalArg(2) int arg0, @OriginalArg(3) Class85_Sub3 arg1) {
		this.method7564(arg1, arg0);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
	@Override
	public void method7555() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9021);
		this.anInt9006 |= 0x4;
		this.anInt9007 = this.method7566();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
	public void method7562(@OriginalArg(1) int arg0) {
		if (this.anInterface20Array1[arg0] != null) {
			this.anInterface20Array1[arg0].method9094();
		}
		this.anInt9015 &= ~(0x1 << arg0);
		this.anInterface20Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IBLclient!q;II)V")
	private void method7564(@OriginalArg(2) Class85_Sub3 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt9007 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9015 & 0xFFFFFFFE) == 0) {
			this.anInt9014 = arg0.anInt8238;
			this.anInt9017 = arg0.anInt8238;
		} else if (arg0.anInt8238 != this.anInt9014 || this.anInt9017 != arg0.anInt8238) {
			throw new RuntimeException();
		}
		arg0.method7021(this.anInt9007, arg1, Static540.anIntArray703[0]);
		this.anInterface20Array1[0] = arg0;
		this.anInt9015 |= 0x1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IB)V")
	public void method7565(@OriginalArg(0) int arg0) {
		if (this.anInt9007 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static540.anIntArray703[arg0]);
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(I)V")
	@Override
	public void method7557() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9006 &= 0xFFFFFFFB;
		this.anInt9007 = this.method7566();
	}

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "(I)I")
	private int method7566() {
		if ((this.anInt9006 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9006 & 0x2) == 0) {
			return (this.anInt9006 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!rg", name = "e", descriptor = "(I)V")
	@Override
	public void method7559() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9006 &= 0xFFFFFFFD;
		this.anInt9007 = this.method7566();
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(II)V")
	public void method7567() {
		if (this.anInt9007 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static540.anIntArray703[0]);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!tp;II)V")
	private void method7568(@OriginalArg(1) Class85_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt9007 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt9015) == 0) {
			this.anInt9014 = arg0.anInt3117;
			this.anInt9017 = arg0.anInt3121;
		} else if (arg0.anInt3117 != this.anInt9014 || arg0.anInt3121 != this.anInt9017) {
			throw new RuntimeException();
		}
		arg0.method2891(this.anInt9007, Static540.anIntArray703[arg1]);
		this.anInterface20Array1[arg1] = arg0;
		this.anInt9015 |= local16;
	}

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
	@Override
	public void method7556() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9021);
		this.anInt9006 |= 0x2;
		this.anInt9007 = this.method7566();
	}

	@OriginalMember(owner = "client!rg", name = "i", descriptor = "(I)Z")
	public boolean method7569() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9007);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILclient!kw;I)V")
	public void method7570(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub6_Sub13 arg1) {
		if (this.anInt9007 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt9015 & ~local15) == 0) {
			this.anInt9017 = arg1.anInt6401;
			this.anInt9014 = arg1.anInt6408;
		} else if (this.anInt9014 != arg1.anInt6408 || this.anInt9017 != arg1.anInt6401) {
			throw new RuntimeException();
		}
		arg1.method5453(Static540.anIntArray703[arg0], this.anInt9007);
		this.anInterface20Array1[arg0] = arg1;
		this.anInt9015 |= local15;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!tp;II)V")
	public void method7571(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7568(arg0, arg1);
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(I)V")
	@Override
	public void method7558() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9021);
		this.anInt9006 |= 0x1;
		this.anInt9007 = this.method7566();
	}

	@OriginalMember(owner = "client!rg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass20_Sub3_34.method7387(this.anInt9021);
		super.finalize();
	}
}
