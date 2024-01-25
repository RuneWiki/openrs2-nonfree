import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tg")
public final class Class320 implements Interface27 {

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
	private int anInt9233;

	@OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
	private int anInt9235;

	@OriginalMember(owner = "client!tg", name = "y", descriptor = "I")
	private int anInt9252;

	@OriginalMember(owner = "client!tg", name = "k", descriptor = "[Lclient!tl;")
	private final Interface22[] anInterface22Array1 = new Interface22[9];

	@OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
	private int anInt9245 = 0;

	@OriginalMember(owner = "client!tg", name = "s", descriptor = "I")
	private int anInt9246 = -1;

	@OriginalMember(owner = "client!tg", name = "o", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_37;

	@OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
	private final int anInt9236;

	@OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Lclient!kw;)V")
	public Class320(@OriginalArg(0) Class5_Sub2 arg0) {
		if (!arg0.aBoolean374) {
			throw new IllegalStateException("");
		}
		this.aClass5_Sub2_37 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static526.anIntArray570, 0);
		this.anInt9236 = Static526.anIntArray570[0];
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)V")
	@Override
	public void method7955() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9245 &= 0xFFFFFFFD;
		this.anInt9246 = this.method7970();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILclient!so;B)V")
	public void method7959(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4_Sub21 arg1) {
		if (this.anInt9246 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((~local20 & this.anInt9233) == 0) {
			this.anInt9252 = arg1.anInt9026;
			this.anInt9235 = arg1.anInt9025;
		} else if (this.anInt9252 != arg1.anInt9026 || arg1.anInt9025 != this.anInt9235) {
			throw new RuntimeException();
		}
		arg1.method7755(this.anInt9246, Static639.anIntArray664[arg0]);
		this.anInterface22Array1[arg0] = arg1;
		this.anInt9233 |= local20;
	}

	@OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V")
	@Override
	public void method7957() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9236);
		this.anInt9245 |= 0x4;
		this.anInt9246 = this.method7970();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)V")
	public void method7961(@OriginalArg(0) int arg0) {
		if (this.anInterface22Array1[arg0] != null) {
			this.anInterface22Array1[arg0].method7922();
		}
		this.anInt9233 &= ~(0x1 << arg0);
		this.anInterface22Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public void method7963(@OriginalArg(0) int arg0) {
		if (this.anInt9246 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static639.anIntArray664[arg0]);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(B)Z")
	public boolean method7964() {
		@Pc(12) int local12 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9246);
		return local12 == 36053;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!dm;III)V")
	public void method7965(@OriginalArg(0) Class76_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method7968(arg0, arg1);
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)V")
	@Override
	public void method7956() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9245 &= 0xFFFFFFFE;
		this.anInt9246 = this.method7970();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)V")
	@Override
	public void method7952() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9245 &= 0xFFFFFFFB;
		this.anInt9246 = this.method7970();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)V")
	public void method7966() {
		if (this.anInt9246 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static639.anIntArray664[0]);
	}

	@OriginalMember(owner = "client!tg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub2_37.method5007(this.anInt9236);
		super.finalize();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIILclient!ol;)V")
	private void method7967(@OriginalArg(0) int arg0, @OriginalArg(3) Class76_Sub3 arg1) {
		if (this.anInt9246 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt9233 & ~local15) == 0) {
			this.anInt9252 = arg1.anInt7370;
			this.anInt9235 = arg1.anInt7369;
		} else if (this.anInt9252 != arg1.anInt7370 || arg1.anInt7369 != this.anInt9235) {
			throw new RuntimeException();
		}
		arg1.method6410(this.anInt9246, Static639.anIntArray664[arg0]);
		this.anInterface22Array1[arg0] = arg1;
		this.anInt9233 |= local15;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lclient!dm;IIIB)V")
	private void method7968(@OriginalArg(0) Class76_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9246 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9233 & 0xFFFFFFFE) == 0) {
			this.anInt9252 = arg0.anInt2308;
			this.anInt9235 = arg0.anInt2308;
		} else if (this.anInt9252 != arg0.anInt2308 || arg0.anInt2308 != this.anInt9235) {
			throw new RuntimeException();
		}
		arg0.method2165(Static639.anIntArray664[0], arg1, this.anInt9246);
		this.anInterface22Array1[0] = arg0;
		this.anInt9233 |= 0x1;
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IZLclient!ol;)V")
	public void method7969(@OriginalArg(0) int arg0, @OriginalArg(2) Class76_Sub3 arg1) {
		this.method7967(arg0, arg1);
	}

	@OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)V")
	@Override
	public void method7954() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9236);
		this.anInt9245 |= 0x2;
		this.anInt9246 = this.method7970();
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
	@Override
	public void method7953() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9236);
		this.anInt9245 |= 0x1;
		this.anInt9246 = this.method7970();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)I")
	private int method7970() {
		if ((this.anInt9245 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9245 & 0x2) == 0) {
			return (this.anInt9245 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}
}
