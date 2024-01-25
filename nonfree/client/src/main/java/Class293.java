import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class293 implements Interface18 {

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
	private int anInt8770;

	@OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
	private int anInt8772;

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	private int anInt8773;

	@OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
	private int anInt8778 = -1;

	@OriginalMember(owner = "client!vb", name = "B", descriptor = "[Lclient!hj;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
	private int anInt8786 = 0;

	@OriginalMember(owner = "client!vb", name = "E", descriptor = "Lclient!os;")
	private final Class39_Sub3 aClass39_Sub3_39;

	@OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
	private final int anInt8776;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!os;)V")
	public Class293(@OriginalArg(0) Class39_Sub3 arg0) {
		if (!arg0.aBoolean484) {
			throw new IllegalStateException("");
		}
		this.aClass39_Sub3_39 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static141.anIntArray683, 0);
		this.anInt8776 = Static141.anIntArray683[0];
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!bo;B)V")
	public void method7359(@OriginalArg(1) int arg0, @OriginalArg(2) Class19_Sub1 arg1) {
		this.method7363(arg0, arg1);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
	@Override
	public void method7357() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8786 &= 0xFFFFFFFE;
		this.anInt8778 = this.method7362();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI)V")
	public void method7361(@OriginalArg(1) int arg0) {
		if (this.anInt8778 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static160.anIntArray344[arg0]);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)I")
	private int method7362() {
		if ((this.anInt8786 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8786 & 0x2) == 0) {
			return (this.anInt8786 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIILclient!bo;)V")
	private void method7363(@OriginalArg(0) int arg0, @OriginalArg(4) Class19_Sub1 arg1) {
		if (this.anInt8778 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8773 & 0xFFFFFFFE) == 0) {
			this.anInt8772 = arg1.anInt815;
			this.anInt8770 = arg1.anInt815;
		} else if (this.anInt8770 != arg1.anInt815 || this.anInt8772 != arg1.anInt815) {
			throw new RuntimeException();
		}
		arg1.method831(arg0, Static160.anIntArray344[0], this.anInt8778);
		this.anInterface9Array1[0] = arg1;
		this.anInt8773 |= 0x1;
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(B)V")
	@Override
	public void method7358() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8776);
		this.anInt8786 |= 0x1;
		this.anInt8778 = this.method7362();
	}

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)I")
	public int method7365() {
		return this.anInt8772;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILclient!ot;I)V")
	private void method7366(@OriginalArg(1) int arg0, @OriginalArg(2) Class19_Sub2 arg1) {
		if (this.anInt8778 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt8773) == 0) {
			this.anInt8770 = arg1.anInt2873;
			this.anInt8772 = arg1.anInt2872;
		} else if (this.anInt8770 != arg1.anInt2873 || this.anInt8772 != arg1.anInt2872) {
			throw new RuntimeException();
		}
		arg1.method2693(this.anInt8778, Static160.anIntArray344[arg0]);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt8773 |= local15;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
	public void method7367(@OriginalArg(1) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4798();
		}
		this.anInt8773 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	@Override
	public void method7354() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8776);
		this.anInt8786 |= 0x2;
		this.anInt8778 = this.method7362();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
	@Override
	public void method7355() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8786 &= 0xFFFFFFFB;
		this.anInt8778 = this.method7362();
	}

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)Z")
	public boolean method7368() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8778);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(II)V")
	public void method7370() {
		if (this.anInt8778 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static160.anIntArray344[0]);
	}

	@OriginalMember(owner = "client!vb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass39_Sub3_39.method5743(this.anInt8776);
		super.finalize();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!kh;II)V")
	public void method7371(@OriginalArg(0) Class2_Sub13_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt8778 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt8773 & ~local23) == 0) {
			this.anInt8772 = arg0.anInt4557;
			this.anInt8770 = arg0.anInt4554;
		} else if (this.anInt8770 != arg0.anInt4554 || this.anInt8772 != arg0.anInt4557) {
			throw new RuntimeException();
		}
		arg0.method3959(this.anInt8778, Static160.anIntArray344[arg1]);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt8773 |= local23;
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lclient!ot;IB)V")
	public void method7372(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.method7366(arg1, arg0);
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
	@Override
	public void method7356() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8776);
		this.anInt8786 |= 0x4;
		this.anInt8778 = this.method7362();
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	@Override
	public void method7353() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8786 &= 0xFFFFFFFD;
		this.anInt8778 = this.method7362();
	}
}
