import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lea")
public final class Class219 implements Interface10 {

	@OriginalMember(owner = "client!lea", name = "r", descriptor = "I")
	private int anInt5538;

	@OriginalMember(owner = "client!lea", name = "l", descriptor = "I")
	private int anInt5549;

	@OriginalMember(owner = "client!lea", name = "p", descriptor = "I")
	private int anInt5558;

	@OriginalMember(owner = "client!lea", name = "o", descriptor = "I")
	private int anInt5543 = -1;

	@OriginalMember(owner = "client!lea", name = "n", descriptor = "I")
	private int anInt5551 = 0;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "[Lclient!ed;")
	private final Interface12[] anInterface12Array1 = new Interface12[9];

	@OriginalMember(owner = "client!lea", name = "h", descriptor = "Lclient!vf;")
	private final Class100_Sub3 aClass100_Sub3_25;

	@OriginalMember(owner = "client!lea", name = "m", descriptor = "I")
	private final int anInt5546;

	@OriginalMember(owner = "client!lea", name = "<init>", descriptor = "(Lclient!vf;)V")
	public Class219(@OriginalArg(0) Class100_Sub3 arg0) {
		if (!arg0.aBoolean741) {
			throw new IllegalStateException("");
		}
		this.aClass100_Sub3_25 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static533.anIntArray508, 0);
		this.anInt5546 = Static533.anIntArray508[0];
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(II)V")
	public void method4967(@OriginalArg(1) int arg0) {
		if (this.anInt5543 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static334.anIntArray552[arg0]);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!kia;II)V")
	public void method4969(@OriginalArg(0) Class29_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.method4971(arg1, arg0);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!dka;II)V")
	public void method4970(@OriginalArg(1) Class29_Sub2 arg0, @OriginalArg(3) int arg1) {
		this.method4978(arg0, arg1);
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(I)V")
	@Override
	public void method4964() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt5546);
		this.anInt5551 |= 0x2;
		this.anInt5543 = this.method4977();
	}

	@OriginalMember(owner = "client!lea", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_25.method8697(this.anInt5546);
		super.finalize();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(IIILclient!kia;)V")
	private void method4971(@OriginalArg(1) int arg0, @OriginalArg(3) Class29_Sub3 arg1) {
		if (this.anInt5543 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg0;
		if ((this.anInt5558 & ~local17) == 0) {
			this.anInt5538 = arg1.anInt9586;
			this.anInt5549 = arg1.anInt9587;
		} else if (this.anInt5538 != arg1.anInt9586 || this.anInt5549 != arg1.anInt9587) {
			throw new RuntimeException();
		}
		arg1.method8176(this.anInt5543, Static334.anIntArray552[arg0]);
		this.anInterface12Array1[arg0] = arg1;
		this.anInt5558 |= local17;
	}

	@OriginalMember(owner = "client!lea", name = "e", descriptor = "(I)Z")
	public boolean method4974() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt5543);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(B)V")
	@Override
	public void method4961() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt5546);
		this.anInt5551 |= 0x1;
		this.anInt5543 = this.method4977();
	}

	@OriginalMember(owner = "client!lea", name = "c", descriptor = "(II)V")
	public void method4975() {
		if (this.anInt5543 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static334.anIntArray552[0]);
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(II)V")
	public void method4976(@OriginalArg(0) int arg0) {
		if (this.anInterface12Array1[arg0] != null) {
			this.anInterface12Array1[arg0].method8162();
		}
		this.anInt5558 &= ~(0x1 << arg0);
		this.anInterface12Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!lea", name = "d", descriptor = "(B)I")
	private int method4977() {
		if ((this.anInt5551 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt5551 & 0x2) == 0) {
			return (this.anInt5551 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(I)V")
	@Override
	public void method4966() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt5551 &= 0xFFFFFFFE;
		this.anInt5543 = this.method4977();
	}

	@OriginalMember(owner = "client!lea", name = "b", descriptor = "(B)V")
	@Override
	public void method4963() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt5551 &= 0xFFFFFFFD;
		this.anInt5543 = this.method4977();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!dka;IIBI)V")
	private void method4978(@OriginalArg(0) Class29_Sub2 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt5543 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt5558 & 0xFFFFFFFE) == 0) {
			this.anInt5549 = arg0.anInt1663;
			this.anInt5538 = arg0.anInt1663;
		} else if (this.anInt5538 != arg0.anInt1663 || this.anInt5549 != arg0.anInt1663) {
			throw new RuntimeException();
		}
		arg0.method1549(Static334.anIntArray552[0], this.anInt5543, arg1);
		this.anInterface12Array1[0] = arg0;
		this.anInt5558 |= 0x1;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(I)V")
	@Override
	public void method4962() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt5546);
		this.anInt5551 |= 0x4;
		this.anInt5543 = this.method4977();
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(ILclient!ad;I)V")
	public void method4979(@OriginalArg(1) Class5_Sub1_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt5543 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt5558) == 0) {
			this.anInt5549 = arg0.anInt94;
			this.anInt5538 = arg0.anInt105;
		} else if (arg0.anInt105 != this.anInt5538 || arg0.anInt94 != this.anInt5549) {
			throw new RuntimeException();
		}
		arg0.method124(Static334.anIntArray552[arg1], this.anInt5543);
		this.anInterface12Array1[arg1] = arg0;
		this.anInt5558 |= local16;
	}

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(B)V")
	@Override
	public void method4965() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt5551 &= 0xFFFFFFFB;
		this.anInt5543 = this.method4977();
	}
}
