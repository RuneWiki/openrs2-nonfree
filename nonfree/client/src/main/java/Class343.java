import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vca")
public final class Class343 implements Interface3 {

	@OriginalMember(owner = "client!vca", name = "e", descriptor = "I")
	private int anInt9129;

	@OriginalMember(owner = "client!vca", name = "k", descriptor = "I")
	private int anInt9134;

	@OriginalMember(owner = "client!vca", name = "F", descriptor = "I")
	private int anInt9152;

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "I")
	private int anInt9130 = 0;

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "I")
	private int anInt9128 = -1;

	@OriginalMember(owner = "client!vca", name = "t", descriptor = "[Lclient!eda;")
	private final Interface7[] anInterface7Array1 = new Interface7[9];

	@OriginalMember(owner = "client!vca", name = "n", descriptor = "Lclient!lj;")
	private final Class78_Sub3 aClass78_Sub3_39;

	@OriginalMember(owner = "client!vca", name = "u", descriptor = "I")
	private final int anInt9142;

	@OriginalMember(owner = "client!vca", name = "<init>", descriptor = "(Lclient!lj;)V")
	public Class343(@OriginalArg(0) Class78_Sub3 arg0) {
		if (!arg0.aBoolean428) {
			throw new IllegalStateException("");
		}
		this.aClass78_Sub3_39 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static210.anIntArray192, 0);
		this.anInt9142 = Static210.anIntArray192[0];
	}

	@OriginalMember(owner = "client!vca", name = "c", descriptor = "(I)V")
	@Override
	public void method7459() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9130 &= 0xFFFFFFFB;
		this.anInt9128 = this.method7461();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IIILclient!cw;)V")
	private void method7460(@OriginalArg(0) int arg0, @OriginalArg(3) Class46_Sub2 arg1) {
		if (this.anInt9128 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt9134) == 0) {
			this.anInt9152 = arg1.anInt6360;
			this.anInt9129 = arg1.anInt6356;
		} else if (arg1.anInt6356 != this.anInt9129 || this.anInt9152 != arg1.anInt6360) {
			throw new RuntimeException();
		}
		arg1.method5148(this.anInt9128, Static582.anIntArray603[arg0]);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt9134 |= local16;
	}

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "(I)I")
	private int method7461() {
		if ((this.anInt9130 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9130 & 0x2) == 0) {
			return (this.anInt9130 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(I)V")
	@Override
	public void method7458() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9142);
		this.anInt9130 |= 0x1;
		this.anInt9128 = this.method7461();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z)V")
	@Override
	public void method7454() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9130 &= 0xFFFFFFFE;
		this.anInt9128 = this.method7461();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(B)V")
	@Override
	public void method7457() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9130 &= 0xFFFFFFFD;
		this.anInt9128 = this.method7461();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZI)V")
	public void method7464(@OriginalArg(1) int arg0) {
		if (this.anInt9128 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static582.anIntArray603[arg0]);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	@Override
	public void method7455() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9142);
		this.anInt9130 |= 0x4;
		this.anInt9128 = this.method7461();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(II)V")
	public void method7465() {
		if (this.anInt9128 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static582.anIntArray603[0]);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILclient!hda;I)V")
	public void method7467(@OriginalArg(0) int arg0, @OriginalArg(2) Class46_Sub4 arg1) {
		this.method7473(arg0, arg1);
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(ZILclient!vfa;)V")
	public void method7468(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8_Sub19 arg1) {
		if (this.anInt9128 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt9134 & ~local15) == 0) {
			this.anInt9129 = arg1.anInt9220;
			this.anInt9152 = arg1.anInt9228;
		} else if (arg1.anInt9220 != this.anInt9129 || arg1.anInt9228 != this.anInt9152) {
			throw new RuntimeException();
		}
		arg1.method7514(Static582.anIntArray603[arg0], this.anInt9128);
		this.anInterface7Array1[arg0] = arg1;
		this.anInt9134 |= local15;
	}

	@OriginalMember(owner = "client!vca", name = "f", descriptor = "(I)Z")
	public boolean method7469() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9128);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(Z)V")
	@Override
	public void method7456() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9142);
		this.anInt9130 |= 0x2;
		this.anInt9128 = this.method7461();
	}

	@OriginalMember(owner = "client!vca", name = "b", descriptor = "(II)V")
	public void method7470(@OriginalArg(1) int arg0) {
		if (this.anInterface7Array1[arg0] != null) {
			this.anInterface7Array1[arg0].method7511();
		}
		this.anInt9134 &= ~(0x1 << arg0);
		this.anInterface7Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Lclient!cw;BI)V")
	public void method7472(@OriginalArg(0) Class46_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method7460(arg1, arg0);
	}

	@OriginalMember(owner = "client!vca", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass78_Sub3_39.method4555(this.anInt9142);
		super.finalize();
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(BIILclient!hda;I)V")
	private void method7473(@OriginalArg(2) int arg0, @OriginalArg(3) Class46_Sub4 arg1) {
		if (this.anInt9128 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9134 & 0xFFFFFFFE) == 0) {
			this.anInt9152 = arg1.anInt3712;
			this.anInt9129 = arg1.anInt3712;
		} else if (this.anInt9129 != arg1.anInt3712 || arg1.anInt3712 != this.anInt9152) {
			throw new RuntimeException();
		}
		arg1.method3025(arg0, this.anInt9128, Static582.anIntArray603[0]);
		this.anInterface7Array1[0] = arg1;
		this.anInt9134 |= 0x1;
	}
}
