import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class166 implements Interface7 {

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
	private int anInt4110;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	private int anInt4111;

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
	private int anInt4118;

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "[Lclient!bv;")
	private final Interface3[] anInterface3Array1 = new Interface3[9];

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
	private int anInt4117 = 0;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	private int anInt4109 = -1;

	@OriginalMember(owner = "client!mg", name = "w", descriptor = "Lclient!bl;")
	private final Class28_Sub1 aClass28_Sub1_26;

	@OriginalMember(owner = "client!mg", name = "y", descriptor = "I")
	private final int anInt4128;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!bl;)V")
	public Class166(@OriginalArg(0) Class28_Sub1 arg0) {
		if (!arg0.aBoolean60) {
			throw new IllegalStateException("");
		}
		this.aClass28_Sub1_26 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static114.anIntArray215, 0);
		this.anInt4128 = Static114.anIntArray215[0];
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(II)V")
	public void method3754(@OriginalArg(0) int arg0) {
		if (this.anInt4109 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static228.anIntArray332[arg0]);
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V")
	public void method3756() {
		if (this.anInt4109 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static228.anIntArray332[0]);
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(I)I")
	public int method3757() {
		return this.anInt4118;
	}

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)Z")
	public boolean method3758() {
		@Pc(18) int local18 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4109);
		return local18 == 36053;
	}

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(I)V")
	@Override
	public void method3752() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4128);
		this.anInt4117 |= 0x2;
		this.anInt4109 = this.method3767();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!sg;I)V")
	private void method3760(@OriginalArg(2) Class40_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt4109 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((this.anInt4111 & ~local15) == 0) {
			this.anInt4110 = arg0.anInt3372;
			this.anInt4118 = arg0.anInt3370;
		} else if (this.anInt4110 != arg0.anInt3372 || arg0.anInt3370 != this.anInt4118) {
			throw new RuntimeException();
		}
		arg0.method3020(Static228.anIntArray332[arg1], this.anInt4109);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt4111 |= local15;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
	@Override
	public void method3747() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4117 &= 0xFFFFFFFE;
		this.anInt4109 = this.method3767();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IILclient!sg;)V")
	public void method3761(@OriginalArg(1) int arg0, @OriginalArg(2) Class40_Sub3 arg1) {
		this.method3760(arg1, arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	@Override
	public void method3748() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4117 &= 0xFFFFFFFD;
		this.anInt4109 = this.method3767();
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "(I)V")
	@Override
	public void method3751() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4128);
		this.anInt4117 |= 0x1;
		this.anInt4109 = this.method3767();
	}

	@OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass28_Sub1_26.method709(this.anInt4128);
		super.finalize();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(Lclient!kd;IZ)V")
	public void method3762(@OriginalArg(0) Class6_Sub1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4109 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt4111) == 0) {
			this.anInt4118 = arg0.anInt3531;
			this.anInt4110 = arg0.anInt3530;
		} else if (this.anInt4110 != arg0.anInt3530 || this.anInt4118 != arg0.anInt3531) {
			throw new RuntimeException();
		}
		arg0.method3166(this.anInt4109, Static228.anIntArray332[arg1]);
		this.anInterface3Array1[arg1] = arg0;
		this.anInt4111 |= local15;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZI)V")
	public void method3763(@OriginalArg(1) int arg0) {
		if (this.anInterface3Array1[arg0] != null) {
			this.anInterface3Array1[arg0].method5143();
		}
		this.anInt4111 &= ~(0x1 << arg0);
		this.anInterface3Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIBLclient!sl;I)V")
	private void method3766(@OriginalArg(3) Class40_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt4109 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4111 & 0xFFFFFFFE) == 0) {
			this.anInt4110 = arg0.anInt6165;
			this.anInt4118 = arg0.anInt6165;
		} else if (this.anInt4110 != arg0.anInt6165 || arg0.anInt6165 != this.anInt4118) {
			throw new RuntimeException();
		}
		arg0.method5156(this.anInt4109, Static228.anIntArray332[0], arg1);
		this.anInterface3Array1[0] = arg0;
		this.anInt4111 |= 0x1;
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(B)I")
	private int method3767() {
		if ((this.anInt4117 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4117 & 0x2) == 0) {
			return (this.anInt4117 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIILclient!sl;)V")
	public void method3769(@OriginalArg(0) int arg0, @OriginalArg(3) Class40_Sub4 arg1) {
		this.method3766(arg1, arg0);
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	@Override
	public void method3749() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4117 &= 0xFFFFFFFB;
		this.anInt4109 = this.method3767();
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "(I)V")
	@Override
	public void method3750() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4128);
		this.anInt4117 |= 0x4;
		this.anInt4109 = this.method3767();
	}
}
