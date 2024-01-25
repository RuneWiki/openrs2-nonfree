import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wt")
public final class Class364 implements Interface8 {

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "I")
	private int anInt9694;

	@OriginalMember(owner = "client!wt", name = "j", descriptor = "I")
	private int anInt9701;

	@OriginalMember(owner = "client!wt", name = "A", descriptor = "I")
	private int anInt9715;

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "I")
	private int anInt9697 = 0;

	@OriginalMember(owner = "client!wt", name = "q", descriptor = "[Lclient!bga;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!wt", name = "t", descriptor = "I")
	private int anInt9708 = -1;

	@OriginalMember(owner = "client!wt", name = "r", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_44;

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "I")
	private final int anInt9695;

	@OriginalMember(owner = "client!wt", name = "<init>", descriptor = "(Lclient!vj;)V")
	public Class364(@OriginalArg(0) Class45_Sub3 arg0) {
		if (!arg0.aBoolean704) {
			throw new IllegalStateException("");
		}
		this.aClass45_Sub3_44 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static359.anIntArray400, 0);
		this.anInt9695 = Static359.anIntArray400[0];
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ZI)V")
	public void method7925(@OriginalArg(1) int arg0) {
		if (this.anInt9708 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static414.anIntArray441[arg0]);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IBLclient!g;I)V")
	private void method7926(@OriginalArg(2) Class24_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt9708 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt9715 & ~local23) == 0) {
			this.anInt9701 = arg0.anInt983;
			this.anInt9694 = arg0.anInt986;
		} else if (arg0.anInt986 != this.anInt9694 || arg0.anInt983 != this.anInt9701) {
			throw new RuntimeException();
		}
		arg0.method821(Static414.anIntArray441[arg1], this.anInt9708);
		this.anInterface1Array1[arg1] = arg0;
		this.anInt9715 |= local23;
	}

	@OriginalMember(owner = "client!wt", name = "c", descriptor = "(I)V")
	@Override
	public void method7922() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9697 &= 0xFFFFFFFE;
		this.anInt9708 = this.method7928();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!bi;IB)V")
	public void method7927(@OriginalArg(0) Class3_Sub7_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt9708 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((~local23 & this.anInt9715) == 0) {
			this.anInt9701 = arg0.anInt820;
			this.anInt9694 = arg0.anInt819;
		} else if (arg0.anInt819 != this.anInt9694 || this.anInt9701 != arg0.anInt820) {
			throw new RuntimeException();
		}
		arg0.method702(this.anInt9708, Static414.anIntArray441[arg1]);
		this.anInterface1Array1[arg1] = arg0;
		this.anInt9715 |= local23;
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(I)I")
	private int method7928() {
		if ((this.anInt9697 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9697 & 0x2) == 0) {
			return (this.anInt9697 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(I)V")
	@Override
	public void method7919() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9697 &= 0xFFFFFFFD;
		this.anInt9708 = this.method7928();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IILclient!fca;II)V")
	private void method7929(@OriginalArg(2) Class24_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt9708 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9715 & 0xFFFFFFFE) == 0) {
			this.anInt9701 = arg0.anInt3022;
			this.anInt9694 = arg0.anInt3022;
		} else if (arg0.anInt3022 != this.anInt9694 || this.anInt9701 != arg0.anInt3022) {
			throw new RuntimeException();
		}
		arg0.method2715(this.anInt9708, arg1, Static414.anIntArray441[0]);
		this.anInterface1Array1[0] = arg0;
		this.anInt9715 |= 0x1;
	}

	@OriginalMember(owner = "client!wt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub3_44.method7438(this.anInt9695);
		super.finalize();
	}

	@OriginalMember(owner = "client!wt", name = "d", descriptor = "(I)V")
	@Override
	public void method7923() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9695);
		this.anInt9697 |= 0x1;
		this.anInt9708 = this.method7928();
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(B)V")
	@Override
	public void method7924() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9695);
		this.anInt9697 |= 0x2;
		this.anInt9708 = this.method7928();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(B)V")
	@Override
	public void method7921() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9695);
		this.anInt9697 |= 0x4;
		this.anInt9708 = this.method7928();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IIILclient!fca;)V")
	public void method7932(@OriginalArg(1) int arg0, @OriginalArg(3) Class24_Sub3 arg1) {
		this.method7929(arg1, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "e", descriptor = "(B)Z")
	public boolean method7934() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9708);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(II)V")
	public void method7935(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method2792();
		}
		this.anInt9715 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(I)V")
	@Override
	public void method7920() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9697 &= 0xFFFFFFFB;
		this.anInt9708 = this.method7928();
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!g;I)V")
	public void method7936(@OriginalArg(0) int arg0, @OriginalArg(1) Class24_Sub1 arg1) {
		this.method7926(arg1, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "b", descriptor = "(II)V")
	public void method7937() {
		if (this.anInt9708 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static414.anIntArray441[0]);
	}
}
