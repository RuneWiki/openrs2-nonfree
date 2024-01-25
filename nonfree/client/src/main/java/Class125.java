import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gja")
public final class Class125 implements Interface11 {

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "I")
	private int anInt3551;

	@OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
	private int anInt3565;

	@OriginalMember(owner = "client!gja", name = "z", descriptor = "I")
	private int anInt3573;

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "[Lclient!rb;")
	private final Interface24[] anInterface24Array1 = new Interface24[9];

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "I")
	private int anInt3550 = 0;

	@OriginalMember(owner = "client!gja", name = "o", descriptor = "I")
	private int anInt3563 = -1;

	@OriginalMember(owner = "client!gja", name = "t", descriptor = "Lclient!qfa;")
	private final Class137_Sub3 aClass137_Sub3_12;

	@OriginalMember(owner = "client!gja", name = "y", descriptor = "I")
	private final int anInt3572;

	@OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lclient!qfa;)V")
	public Class125(@OriginalArg(0) Class137_Sub3 arg0) {
		if (!arg0.aBoolean608) {
			throw new IllegalStateException("");
		}
		this.aClass137_Sub3_12 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static276.anIntArray389, 0);
		this.anInt3572 = Static276.anIntArray389[0];
	}

	@OriginalMember(owner = "client!gja", name = "f", descriptor = "(I)I")
	private int method2964() {
		if ((this.anInt3550 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3550 & 0x2) == 0) {
			return (this.anInt3550 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(II)V")
	public void method2965(@OriginalArg(0) int arg0) {
		if (this.anInterface24Array1[arg0] != null) {
			this.anInterface24Array1[arg0].method6844();
		}
		this.anInt3551 &= ~(0x1 << arg0);
		this.anInterface24Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(ILclient!km;BI)V")
	private void method2966(@OriginalArg(1) Class66_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt3563 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt3551) == 0) {
			this.anInt3565 = arg0.anInt1947;
			this.anInt3573 = arg0.anInt1939;
		} else if (arg0.anInt1939 != this.anInt3573 || arg0.anInt1947 != this.anInt3565) {
			throw new RuntimeException();
		}
		arg0.method1667(Static213.anIntArray325[arg1], this.anInt3563);
		this.anInterface24Array1[arg1] = arg0;
		this.anInt3551 |= local15;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!qba;III)V")
	public void method2967(@OriginalArg(0) Class66_Sub4 arg0, @OriginalArg(3) int arg1) {
		this.method2972(arg0, arg1);
	}

	@OriginalMember(owner = "client!gja", name = "e", descriptor = "(I)V")
	@Override
	public void method2963() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3572);
		this.anInt3550 |= 0x1;
		this.anInt3563 = this.method2964();
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(B)V")
	@Override
	public void method2960() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3550 &= 0xFFFFFFFE;
		this.anInt3563 = this.method2964();
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(B)Z")
	public boolean method2968() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3563);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)V")
	@Override
	public void method2958() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3572);
		this.anInt3550 |= 0x4;
		this.anInt3563 = this.method2964();
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(II)V")
	public void method2969(@OriginalArg(1) int arg0) {
		if (this.anInt3563 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static213.anIntArray325[arg0]);
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)V")
	@Override
	public void method2959() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3550 &= 0xFFFFFFFB;
		this.anInt3563 = this.method2964();
	}

	@OriginalMember(owner = "client!gja", name = "d", descriptor = "(I)V")
	@Override
	public void method2962() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3550 &= 0xFFFFFFFD;
		this.anInt3563 = this.method2964();
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!qba;BIII)V")
	private void method2972(@OriginalArg(0) Class66_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt3563 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3551 & 0xFFFFFFFE) == 0) {
			this.anInt3573 = arg0.anInt8233;
			this.anInt3565 = arg0.anInt8233;
		} else if (arg0.anInt8233 != this.anInt3573 || arg0.anInt8233 != this.anInt3565) {
			throw new RuntimeException();
		}
		arg0.method6856(Static213.anIntArray325[0], arg1, this.anInt3563);
		this.anInterface24Array1[0] = arg0;
		this.anInt3551 |= 0x1;
	}

	@OriginalMember(owner = "client!gja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass137_Sub3_12.method7031(this.anInt3572);
		super.finalize();
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(Lclient!km;II)V")
	public void method2973(@OriginalArg(0) Class66_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.method2966(arg0, arg1);
	}

	@OriginalMember(owner = "client!gja", name = "a", descriptor = "(BILclient!mw;)V")
	public void method2974(@OriginalArg(1) int arg0, @OriginalArg(2) Class14_Sub3_Sub12 arg1) {
		if (this.anInt3563 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt3551 & ~local15) == 0) {
			this.anInt3573 = arg1.anInt6968;
			this.anInt3565 = arg1.anInt6966;
		} else if (arg1.anInt6968 != this.anInt3573 || this.anInt3565 != arg1.anInt6966) {
			throw new RuntimeException();
		}
		arg1.method5642(this.anInt3563, Static213.anIntArray325[arg0]);
		this.anInterface24Array1[arg0] = arg1;
		this.anInt3551 |= local15;
	}

	@OriginalMember(owner = "client!gja", name = "c", descriptor = "(I)V")
	@Override
	public void method2961() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3572);
		this.anInt3550 |= 0x2;
		this.anInt3563 = this.method2964();
	}

	@OriginalMember(owner = "client!gja", name = "b", descriptor = "(IB)V")
	public void method2977() {
		if (this.anInt3563 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static213.anIntArray325[0]);
	}
}
