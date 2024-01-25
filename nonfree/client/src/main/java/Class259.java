import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vh")
public final class Class259 implements Interface12 {

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
	private int anInt6918;

	@OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
	private int anInt6928;

	@OriginalMember(owner = "client!vh", name = "w", descriptor = "I")
	private int anInt6933;

	@OriginalMember(owner = "client!vh", name = "m", descriptor = "[Lclient!jf;")
	private final Interface4[] anInterface4Array1 = new Interface4[9];

	@OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
	private int anInt6927 = 0;

	@OriginalMember(owner = "client!vh", name = "x", descriptor = "I")
	private int anInt6934 = -1;

	@OriginalMember(owner = "client!vh", name = "D", descriptor = "Lclient!vj;")
	private final Class172_Sub2 aClass172_Sub2_38;

	@OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
	private final int anInt6926;

	@OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class259(@OriginalArg(0) Class172_Sub2 arg0) {
		if (!arg0.aBoolean605) {
			throw new IllegalStateException("");
		}
		this.aClass172_Sub2_38 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static245.anIntArray304, 0);
		this.anInt6926 = Static245.anIntArray304[0];
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!mf;I)V")
	private void method5436(@OriginalArg(0) int arg0, @OriginalArg(2) Class112_Sub2 arg1) {
		if (this.anInt6934 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt6928) == 0) {
			this.anInt6918 = arg1.anInt4728;
			this.anInt6933 = arg1.anInt4726;
		} else if (arg1.anInt4728 != this.anInt6918 || this.anInt6933 != arg1.anInt4726) {
			throw new RuntimeException();
		}
		arg1.method3733(this.anInt6934, Static407.anIntArray454[arg0]);
		this.anInterface4Array1[arg0] = arg1;
		this.anInt6928 |= local15;
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(B)I")
	public int method5438() {
		return this.anInt6933;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)V")
	@Override
	public void method5430() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6926);
		this.anInt6927 |= 0x2;
		this.anInt6934 = this.method5449();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
	@Override
	public void method5435() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6926);
		this.anInt6927 |= 0x4;
		this.anInt6934 = this.method5449();
	}

	@OriginalMember(owner = "client!vh", name = "c", descriptor = "(I)V")
	@Override
	public void method5432() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6926);
		this.anInt6927 |= 0x1;
		this.anInt6934 = this.method5449();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IILclient!rd;I)V")
	public void method5440(@OriginalArg(1) int arg0, @OriginalArg(2) Class112_Sub4 arg1) {
		this.method5448(arg1, arg0);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(II)V")
	public void method5441(@OriginalArg(0) int arg0) {
		if (this.anInterface4Array1[arg0] != null) {
			this.anInterface4Array1[arg0].method4544();
		}
		this.anInt6928 &= ~(0x1 << arg0);
		this.anInterface4Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vh", name = "e", descriptor = "(I)V")
	@Override
	public void method5434() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6927 &= 0xFFFFFFFE;
		this.anInt6934 = this.method5449();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!ip;I)V")
	public void method5442(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub10 arg1) {
		if (this.anInt6934 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg0;
		if ((this.anInt6928 & ~local17) == 0) {
			this.anInt6933 = arg1.anInt3523;
			this.anInt6918 = arg1.anInt3516;
		} else if (this.anInt6918 != arg1.anInt3516 || arg1.anInt3523 != this.anInt6933) {
			throw new RuntimeException();
		}
		arg1.method2816(Static407.anIntArray454[arg0], this.anInt6934);
		this.anInterface4Array1[arg0] = arg1;
		this.anInt6928 |= local17;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)V")
	public void method5443() {
		if (this.anInt6934 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static407.anIntArray454[0]);
	}

	@OriginalMember(owner = "client!vh", name = "g", descriptor = "(I)Z")
	public boolean method5444() {
		@Pc(15) int local15 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6934);
		return local15 == 36053;
	}

	@OriginalMember(owner = "client!vh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass172_Sub2_38.method5568(this.anInt6926);
		super.finalize();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!rd;IBI)V")
	private void method5448(@OriginalArg(1) Class112_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt6934 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6928 & 0xFFFFFFFE) == 0) {
			this.anInt6918 = arg0.anInt5833;
			this.anInt6933 = arg0.anInt5833;
		} else if (arg0.anInt5833 != this.anInt6918 || arg0.anInt5833 != this.anInt6933) {
			throw new RuntimeException();
		}
		arg0.method4558(arg1, Static407.anIntArray454[0], this.anInt6934);
		this.anInterface4Array1[0] = arg0;
		this.anInt6928 |= 0x1;
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)I")
	private int method5449() {
		if ((this.anInt6927 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6927 & 0x2) == 0) {
			return (this.anInt6927 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vh", name = "d", descriptor = "(I)V")
	@Override
	public void method5433() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6927 &= 0xFFFFFFFB;
		this.anInt6934 = this.method5449();
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBLclient!mf;)V")
	public void method5451(@OriginalArg(0) int arg0, @OriginalArg(2) Class112_Sub2 arg1) {
		this.method5436(arg0, arg1);
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(I)V")
	@Override
	public void method5431() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6927 &= 0xFFFFFFFD;
		this.anInt6934 = this.method5449();
	}

	@OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)V")
	public void method5452(@OriginalArg(0) int arg0) {
		if (this.anInt6934 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static407.anIntArray454[arg0]);
	}
}
