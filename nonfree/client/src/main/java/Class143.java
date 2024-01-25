import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hha")
public final class Class143 implements Interface22 {

	@OriginalMember(owner = "client!hha", name = "h", descriptor = "I")
	private int anInt3649;

	@OriginalMember(owner = "client!hha", name = "r", descriptor = "I")
	private int anInt3659;

	@OriginalMember(owner = "client!hha", name = "z", descriptor = "I")
	private int anInt3665;

	@OriginalMember(owner = "client!hha", name = "j", descriptor = "I")
	private int anInt3651 = -1;

	@OriginalMember(owner = "client!hha", name = "o", descriptor = "I")
	private int anInt3656 = 0;

	@OriginalMember(owner = "client!hha", name = "v", descriptor = "[Lclient!ci;")
	private final Interface3[] anInterface3Array1 = new Interface3[9];

	@OriginalMember(owner = "client!hha", name = "B", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_17;

	@OriginalMember(owner = "client!hha", name = "u", descriptor = "I")
	private final int anInt3662;

	@OriginalMember(owner = "client!hha", name = "<init>", descriptor = "(Lclient!pq;)V")
	public Class143(@OriginalArg(0) Class132_Sub3 arg0) {
		if (!arg0.aBoolean529) {
			throw new IllegalStateException("");
		}
		this.aClass132_Sub3_17 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static636.anIntArray691, 0);
		this.anInt3662 = Static636.anIntArray691[0];
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
	@Override
	public void method3123() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3656 &= 0xFFFFFFFD;
		this.anInt3651 = this.method3134();
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(II)V")
	public void method3127() {
		if (this.anInt3651 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static366.anIntArray371[0]);
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(Z)V")
	@Override
	public void method3124() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3662);
		this.anInt3656 |= 0x4;
		this.anInt3651 = this.method3134();
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V")
	@Override
	public void method3122() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3656 &= 0xFFFFFFFE;
		this.anInt3651 = this.method3134();
	}

	@OriginalMember(owner = "client!hha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub3_17.method6762(this.anInt3662);
		super.finalize();
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(BI)V")
	public void method3129(@OriginalArg(1) int arg0) {
		if (this.anInt3651 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static366.anIntArray371[arg0]);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!rq;I)V")
	public void method3130(@OriginalArg(1) Class53_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method3131(arg1, arg0);
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!rq;IB)V")
	private void method3131(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub2 arg1) {
		if (this.anInt3651 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt3665) == 0) {
			this.anInt3649 = arg1.anInt4459;
			this.anInt3659 = arg1.anInt4460;
		} else if (arg1.anInt4460 != this.anInt3659 || this.anInt3649 != arg1.anInt4459) {
			throw new RuntimeException();
		}
		arg1.method3729(Static366.anIntArray371[arg0], this.anInt3651);
		this.anInterface3Array1[arg0] = arg1;
		this.anInt3665 |= local16;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILclient!kk;)V")
	public void method3132(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub4_Sub9 arg1) {
		if (this.anInt3651 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((~local16 & this.anInt3665) == 0) {
			this.anInt3649 = arg1.anInt5261;
			this.anInt3659 = arg1.anInt5259;
		} else if (arg1.anInt5259 != this.anInt3659 || arg1.anInt5261 != this.anInt3649) {
			throw new RuntimeException();
		}
		arg1.method4442(this.anInt3651, Static366.anIntArray371[arg0]);
		this.anInterface3Array1[arg0] = arg1;
		this.anInt3665 |= local16;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(IILclient!jka;II)V")
	private void method3133(@OriginalArg(2) Class53_Sub3 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt3651 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3665 & 0xFFFFFFFE) == 0) {
			this.anInt3659 = arg0.anInt4822;
			this.anInt3649 = arg0.anInt4822;
		} else if (arg0.anInt4822 != this.anInt3659 || arg0.anInt4822 != this.anInt3649) {
			throw new RuntimeException();
		}
		arg0.method4107(arg1, this.anInt3651, Static366.anIntArray371[0]);
		this.anInterface3Array1[0] = arg0;
		this.anInt3665 |= 0x1;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
	@Override
	public void method3121() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3656 &= 0xFFFFFFFB;
		this.anInt3651 = this.method3134();
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(I)I")
	private int method3134() {
		if ((this.anInt3656 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3656 & 0x2) == 0) {
			return (this.anInt3656 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(B)V")
	@Override
	public void method3125() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3662);
		this.anInt3656 |= 0x1;
		this.anInt3651 = this.method3134();
	}

	@OriginalMember(owner = "client!hha", name = "c", descriptor = "(B)Z")
	public boolean method3136() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3651);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!hha", name = "a", descriptor = "(ILclient!jka;IB)V")
	public void method3137(@OriginalArg(0) int arg0, @OriginalArg(1) Class53_Sub3 arg1) {
		this.method3133(arg1, arg0);
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(BI)V")
	public void method3138(@OriginalArg(1) int arg0) {
		if (this.anInterface3Array1[arg0] != null) {
			this.anInterface3Array1[arg0].method8284();
		}
		this.anInt3665 &= ~(0x1 << arg0);
		this.anInterface3Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!hha", name = "b", descriptor = "(B)V")
	@Override
	public void method3126() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3662);
		this.anInt3656 |= 0x2;
		this.anInt3651 = this.method3134();
	}
}
