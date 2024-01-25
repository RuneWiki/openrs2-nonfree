import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pr")
public final class Class200 implements Interface2 {

	@OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
	private int anInt5446;

	@OriginalMember(owner = "client!pr", name = "u", descriptor = "I")
	private int anInt5447;

	@OriginalMember(owner = "client!pr", name = "D", descriptor = "I")
	private int anInt5454;

	@OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
	private int anInt5441 = 0;

	@OriginalMember(owner = "client!pr", name = "y", descriptor = "[Lclient!pm;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!pr", name = "z", descriptor = "I")
	private int anInt5451 = -1;

	@OriginalMember(owner = "client!pr", name = "s", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_30;

	@OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
	private final int anInt5435;

	@OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lclient!rl;)V")
	public Class200(@OriginalArg(0) Class66_Sub2 arg0) {
		if (!arg0.aBoolean372) {
			throw new IllegalStateException("");
		}
		this.aClass66_Sub2_30 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static248.anIntArray515, 0);
		this.anInt5435 = Static248.anIntArray515[0];
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IILclient!ip;)V")
	public void method4540(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub2_Sub5 arg1) {
		if (this.anInt5451 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt5446) == 0) {
			this.anInt5447 = arg1.anInt3496;
			this.anInt5454 = arg1.anInt3502;
		} else if (this.anInt5454 != arg1.anInt3502 || arg1.anInt3496 != this.anInt5447) {
			throw new RuntimeException();
		}
		arg1.method2899(Static78.anIntArray113[arg0], this.anInt5451);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt5446 |= local16;
	}

	@OriginalMember(owner = "client!pr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass66_Sub2_30.method5128(this.anInt5435);
		super.finalize();
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)V")
	@Override
	public void method4537() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt5435);
		this.anInt5441 |= 0x1;
		this.anInt5451 = this.method4551();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(II)V")
	public void method4541(@OriginalArg(1) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method4235();
		}
		this.anInt5446 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLclient!ud;I)V")
	public void method4542(@OriginalArg(1) Class19_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method4552(arg1, arg0);
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(II)V")
	public void method4543() {
		if (this.anInt5451 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static78.anIntArray113[0]);
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lclient!gh;III)V")
	public void method4544(@OriginalArg(0) Class19_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.method4545(arg0, arg1);
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(B)V")
	@Override
	public void method4539() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt5441 &= 0xFFFFFFFD;
		this.anInt5451 = this.method4551();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BIILclient!gh;I)V")
	private void method4545(@OriginalArg(3) Class19_Sub3 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt5451 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt5446 & 0xFFFFFFFE) == 0) {
			this.anInt5447 = arg0.anInt2768;
			this.anInt5454 = arg0.anInt2768;
		} else if (arg0.anInt2768 != this.anInt5454 || arg0.anInt2768 != this.anInt5447) {
			throw new RuntimeException();
		}
		arg0.method2311(Static78.anIntArray113[0], arg1, this.anInt5451);
		this.anInterface7Array1[0] = arg0;
		this.anInt5446 |= 0x1;
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V")
	@Override
	public void method4534() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt5435);
		this.anInt5441 |= 0x2;
		this.anInt5451 = this.method4551();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(Z)Z")
	public boolean method4546() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt5451);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!pr", name = "b", descriptor = "(B)V")
	@Override
	public void method4535() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt5435);
		this.anInt5441 |= 0x4;
		this.anInt5451 = this.method4551();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
	@Override
	public void method4536() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt5441 &= 0xFFFFFFFE;
		this.anInt5451 = this.method4551();
	}

	@OriginalMember(owner = "client!pr", name = "e", descriptor = "(B)I")
	public int method4548() {
		return this.anInt5447;
	}

	@OriginalMember(owner = "client!pr", name = "c", descriptor = "(I)V")
	@Override
	public void method4538() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt5441 &= 0xFFFFFFFB;
		this.anInt5451 = this.method4551();
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(IB)V")
	public void method4549(@OriginalArg(0) int arg0) {
		if (this.anInt5451 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static78.anIntArray113[arg0]);
	}

	@OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)I")
	private int method4551() {
		if ((this.anInt5441 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt5441 & 0x2) == 0) {
			return (this.anInt5441 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!pr", name = "a", descriptor = "(BILclient!ud;I)V")
	private void method4552(@OriginalArg(1) int arg0, @OriginalArg(2) Class19_Sub4 arg1) {
		if (this.anInt5451 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt5446 & ~local15) == 0) {
			this.anInt5454 = arg1.anInt5083;
			this.anInt5447 = arg1.anInt5081;
		} else if (this.anInt5454 != arg1.anInt5083 || arg1.anInt5081 != this.anInt5447) {
			throw new RuntimeException();
		}
		arg1.method4255(this.anInt5451, Static78.anIntArray113[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt5446 |= local15;
	}
}
