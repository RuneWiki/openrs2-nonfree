import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nh")
public final class Class243 implements Interface26 {

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
	private int anInt6569;

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "I")
	private int anInt6571;

	@OriginalMember(owner = "client!nh", name = "C", descriptor = "I")
	private int anInt6593;

	@OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
	private int anInt6582 = -1;

	@OriginalMember(owner = "client!nh", name = "f", descriptor = "[Lclient!cf;")
	private final Interface6[] anInterface6Array1 = new Interface6[9];

	@OriginalMember(owner = "client!nh", name = "z", descriptor = "I")
	private int anInt6591 = 0;

	@OriginalMember(owner = "client!nh", name = "x", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_24;

	@OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
	private final int anInt6572;

	@OriginalMember(owner = "client!nh", name = "<init>", descriptor = "(Lclient!rda;)V")
	public Class243(@OriginalArg(0) Class126_Sub3 arg0) {
		if (!arg0.aBoolean666) {
			throw new IllegalStateException("");
		}
		this.aClass126_Sub3_24 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static332.anIntArray426, 0);
		this.anInt6572 = Static332.anIntArray426[0];
	}

	@OriginalMember(owner = "client!nh", name = "d", descriptor = "(I)Z")
	public boolean method5826() {
		@Pc(15) int local15 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6582);
		return local15 == 36053;
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	@Override
	public void method5822() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6591 &= 0xFFFFFFFE;
		this.anInt6582 = this.method5836();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!sia;III)V")
	private void method5827(@OriginalArg(0) Class24_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6582 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt6593) == 0) {
			this.anInt6569 = arg0.anInt7727;
			this.anInt6571 = arg0.anInt7723;
		} else if (this.anInt6569 != arg0.anInt7727 || arg0.anInt7723 != this.anInt6571) {
			throw new RuntimeException();
		}
		arg0.method6789(this.anInt6582, Static58.anIntArray75[arg1]);
		this.anInterface6Array1[arg1] = arg0;
		this.anInt6593 |= local15;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(Z)V")
	@Override
	public void method5825() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6591 &= 0xFFFFFFFB;
		this.anInt6582 = this.method5836();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(II)V")
	public void method5831() {
		if (this.anInt6582 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static58.anIntArray75[0]);
	}

	@OriginalMember(owner = "client!nh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub3_24.method7098(this.anInt6572);
		super.finalize();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V")
	@Override
	public void method5820() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6572);
		this.anInt6591 |= 0x4;
		this.anInt6582 = this.method5836();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!dw;II)V")
	public void method5833(@OriginalArg(0) Class5_Sub4_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6582 == -1) {
			throw new RuntimeException();
		}
		@Pc(22) int local22 = 0x1 << arg1;
		if ((this.anInt6593 & ~local22) == 0) {
			this.anInt6571 = arg0.anInt1764;
			this.anInt6569 = arg0.anInt1763;
		} else if (arg0.anInt1763 != this.anInt6569 || arg0.anInt1764 != this.anInt6571) {
			throw new RuntimeException();
		}
		arg0.method1637(this.anInt6582, Static58.anIntArray75[arg1]);
		this.anInterface6Array1[arg1] = arg0;
		this.anInt6593 |= local22;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IILclient!sia;)V")
	public void method5834(@OriginalArg(1) int arg0, @OriginalArg(2) Class24_Sub4 arg1) {
		this.method5827(arg1, arg0);
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jc;III)V")
	public void method5835(@OriginalArg(0) Class24_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.method5837(arg0, arg1);
	}

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)I")
	private int method5836() {
		if ((this.anInt6591 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6591 & 0x2) == 0) {
			return (this.anInt6591 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lclient!jc;IIII)V")
	private void method5837(@OriginalArg(0) Class24_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt6582 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6593 & 0xFFFFFFFE) == 0) {
			this.anInt6569 = arg0.anInt4260;
			this.anInt6571 = arg0.anInt4260;
		} else if (arg0.anInt4260 != this.anInt6569 || arg0.anInt4260 != this.anInt6571) {
			throw new RuntimeException();
		}
		arg0.method3908(this.anInt6582, arg1, Static58.anIntArray75[0]);
		this.anInterface6Array1[0] = arg0;
		this.anInt6593 |= 0x1;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)V")
	@Override
	public void method5823() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6572);
		this.anInt6591 |= 0x2;
		this.anInt6582 = this.method5836();
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)V")
	@Override
	public void method5824() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6572);
		this.anInt6591 |= 0x1;
		this.anInt6582 = this.method5836();
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(II)V")
	public void method5839(@OriginalArg(1) int arg0) {
		if (this.anInterface6Array1[arg0] != null) {
			this.anInterface6Array1[arg0].method6776();
		}
		this.anInt6593 &= ~(0x1 << arg0);
		this.anInterface6Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IZ)V")
	public void method5840(@OriginalArg(0) int arg0) {
		if (this.anInt6582 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static58.anIntArray75[arg0]);
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V")
	@Override
	public void method5821() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6591 &= 0xFFFFFFFD;
		this.anInt6582 = this.method5836();
	}
}
