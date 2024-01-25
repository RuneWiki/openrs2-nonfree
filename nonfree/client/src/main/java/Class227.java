import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class227 implements Interface13 {

	@OriginalMember(owner = "client!mj", name = "f", descriptor = "I")
	private int anInt6194;

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
	private int anInt6198;

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "I")
	private int anInt6213;

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "[Lclient!pk;")
	private final Interface24[] anInterface24Array1 = new Interface24[9];

	@OriginalMember(owner = "client!mj", name = "g", descriptor = "I")
	private int anInt6195 = 0;

	@OriginalMember(owner = "client!mj", name = "C", descriptor = "I")
	private int anInt6215 = -1;

	@OriginalMember(owner = "client!mj", name = "i", descriptor = "Lclient!bi;")
	private final Class13_Sub2 aClass13_Sub2_29;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "I")
	private final int anInt6201;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!bi;)V")
	public Class227(@OriginalArg(0) Class13_Sub2 arg0) {
		if (!arg0.aBoolean91) {
			throw new IllegalStateException("");
		}
		this.aClass13_Sub2_29 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static126.anIntArray180, 0);
		this.anInt6201 = Static126.anIntArray180[0];
	}

	@OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_29.method1038(this.anInt6201);
		super.finalize();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)V")
	public void method5340() {
		if (this.anInt6215 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static498.anIntArray573[0]);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
	@Override
	public void method5335() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6201);
		this.anInt6195 |= 0x4;
		this.anInt6215 = this.method5346();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public void method5342(@OriginalArg(1) int arg0) {
		if (this.anInterface24Array1[arg0] != null) {
			this.anInterface24Array1[arg0].method7251();
		}
		this.anInt6198 &= ~(0x1 << arg0);
		this.anInterface24Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	@Override
	public void method5337() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6195 &= 0xFFFFFFFD;
		this.anInt6215 = this.method5346();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	@Override
	public void method5334() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6195 &= 0xFFFFFFFB;
		this.anInt6215 = this.method5346();
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	@Override
	public void method5339() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6195 &= 0xFFFFFFFE;
		this.anInt6215 = this.method5346();
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	@Override
	public void method5336() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6201);
		this.anInt6195 |= 0x1;
		this.anInt6215 = this.method5346();
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V")
	public void method5343(@OriginalArg(1) int arg0) {
		if (this.anInt6215 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static498.anIntArray573[arg0]);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!kk;III)V")
	public void method5344(@OriginalArg(0) Class10_Sub3 arg0, @OriginalArg(3) int arg1) {
		this.method5350(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!mt;)V")
	public void method5345(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7_Sub10 arg1) {
		if (this.anInt6215 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((~local15 & this.anInt6198) == 0) {
			this.anInt6194 = arg1.anInt6337;
			this.anInt6213 = arg1.anInt6346;
		} else if (arg1.anInt6337 != this.anInt6194 || arg1.anInt6346 != this.anInt6213) {
			throw new RuntimeException();
		}
		arg1.method5465(Static498.anIntArray573[arg0], this.anInt6215);
		this.anInterface24Array1[arg0] = arg1;
		this.anInt6198 |= local15;
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I")
	private int method5346() {
		if ((this.anInt6195 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6195 & 0x2) == 0) {
			return (this.anInt6195 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	@Override
	public void method5338() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6201);
		this.anInt6195 |= 0x2;
		this.anInt6215 = this.method5346();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!bq;III)V")
	private void method5347(@OriginalArg(0) Class10_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6215 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt6198) == 0) {
			this.anInt6194 = arg0.anInt634;
			this.anInt6213 = arg0.anInt639;
		} else if (arg0.anInt634 != this.anInt6194 || this.anInt6213 != arg0.anInt639) {
			throw new RuntimeException();
		}
		arg0.method724(Static498.anIntArray573[arg1], this.anInt6215);
		this.anInterface24Array1[arg1] = arg0;
		this.anInt6198 |= local15;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IILclient!bq;)V")
	public void method5349(@OriginalArg(1) int arg0, @OriginalArg(2) Class10_Sub2 arg1) {
		this.method5347(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!kk;IIB)V")
	private void method5350(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub3 arg1) {
		if (this.anInt6215 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6198 & 0xFFFFFFFE) == 0) {
			this.anInt6213 = arg1.anInt5379;
			this.anInt6194 = arg1.anInt5379;
		} else if (arg1.anInt5379 != this.anInt6194 || arg1.anInt5379 != this.anInt6213) {
			throw new RuntimeException();
		}
		arg1.method4714(this.anInt6215, Static498.anIntArray573[0], arg0);
		this.anInterface24Array1[0] = arg1;
		this.anInt6198 |= 0x1;
	}

	@OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)Z")
	public boolean method5351() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6215);
		return local13 == 36053;
	}
}
