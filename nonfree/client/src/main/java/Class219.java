import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public final class Class219 implements Interface20 {

	@OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
	private int anInt6249;

	@OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
	private int anInt6251;

	@OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
	private int anInt6263;

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "I")
	private int anInt6246 = -1;

	@OriginalMember(owner = "client!nb", name = "f", descriptor = "[Lclient!gfa;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
	private int anInt6262 = 0;

	@OriginalMember(owner = "client!nb", name = "g", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_30;

	@OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
	private final int anInt6253;

	@OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lclient!er;)V")
	public Class219(@OriginalArg(0) Class31_Sub2 arg0) {
		if (!arg0.aBoolean229) {
			throw new IllegalStateException("");
		}
		this.aClass31_Sub2_30 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static509.anIntArray372, 0);
		this.anInt6253 = Static509.anIntArray372[0];
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	@Override
	public void method5037() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6253);
		this.anInt6262 |= 0x2;
		this.anInt6246 = this.method5051();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!laa;)V")
	public void method5041(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub7_Sub14 arg1) {
		if (this.anInt6246 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt6249) == 0) {
			this.anInt6251 = arg1.anInt5554;
			this.anInt6263 = arg1.anInt5557;
		} else if (this.anInt6263 != arg1.anInt5557 || arg1.anInt5554 != this.anInt6251) {
			throw new RuntimeException();
		}
		arg1.method4530(this.anInt6246, Static183.anIntArray169[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt6249 |= local16;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	public void method5042(@OriginalArg(1) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method6150();
		}
		this.anInt6249 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!nb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub2_30.method2552(this.anInt6253);
		super.finalize();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	@Override
	public void method5034() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6262 &= 0xFFFFFFFB;
		this.anInt6246 = this.method5051();
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)V")
	public void method5043(@OriginalArg(0) int arg0) {
		if (this.anInt6246 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static183.anIntArray169[arg0]);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!wh;B)V")
	public void method5044(@OriginalArg(0) int arg0, @OriginalArg(1) Class50_Sub1 arg1) {
		this.method5048(arg0, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILclient!qn;II)V")
	private void method5045(@OriginalArg(2) Class50_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt6246 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6249 & 0xFFFFFFFE) == 0) {
			this.anInt6251 = arg0.anInt7847;
			this.anInt6263 = arg0.anInt7847;
		} else if (arg0.anInt7847 != this.anInt6263 || this.anInt6251 != arg0.anInt7847) {
			throw new RuntimeException();
		}
		arg0.method6163(this.anInt6246, Static183.anIntArray169[0], arg1);
		this.anInterface5Array1[0] = arg0;
		this.anInt6249 |= 0x1;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)Z")
	public boolean method5046() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6246);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	@Override
	public void method5039() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6262 &= 0xFFFFFFFD;
		this.anInt6246 = this.method5051();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V")
	public void method5047() {
		if (this.anInt6246 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static183.anIntArray169[0]);
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	@Override
	public void method5036() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6262 &= 0xFFFFFFFE;
		this.anInt6246 = this.method5051();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZIILclient!wh;)V")
	private void method5048(@OriginalArg(2) int arg0, @OriginalArg(3) Class50_Sub1 arg1) {
		if (this.anInt6246 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt6249 & ~local15) == 0) {
			this.anInt6251 = arg1.anInt1665;
			this.anInt6263 = arg1.anInt1664;
		} else if (this.anInt6263 != arg1.anInt1664 || arg1.anInt1665 != this.anInt6251) {
			throw new RuntimeException();
		}
		arg1.method1506(this.anInt6246, Static183.anIntArray169[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt6249 |= local15;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	@Override
	public void method5035() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6253);
		this.anInt6262 |= 0x1;
		this.anInt6246 = this.method5051();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	@Override
	public void method5038() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6253);
		this.anInt6262 |= 0x4;
		this.anInt6246 = this.method5051();
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!qn;IIB)V")
	public void method5050(@OriginalArg(0) Class50_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method5045(arg0, arg1);
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I")
	private int method5051() {
		if ((this.anInt6262 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6262 & 0x2) == 0) {
			return (this.anInt6262 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}
}
