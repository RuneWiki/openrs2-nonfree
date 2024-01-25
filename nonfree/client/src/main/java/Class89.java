import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class89 implements Interface7 {

	@OriginalMember(owner = "client!er", name = "c", descriptor = "I")
	private int anInt3524;

	@OriginalMember(owner = "client!er", name = "g", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!er", name = "u", descriptor = "I")
	private int anInt3541;

	@OriginalMember(owner = "client!er", name = "i", descriptor = "I")
	private int anInt3530 = -1;

	@OriginalMember(owner = "client!er", name = "r", descriptor = "[Lclient!mba;")
	private final Interface15[] anInterface15Array1 = new Interface15[9];

	@OriginalMember(owner = "client!er", name = "n", descriptor = "I")
	private int anInt3535 = 0;

	@OriginalMember(owner = "client!er", name = "z", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_16;

	@OriginalMember(owner = "client!er", name = "b", descriptor = "I")
	private final int anInt3523;

	@OriginalMember(owner = "client!er", name = "<init>", descriptor = "(Lclient!nv;)V")
	public Class89(@OriginalArg(0) Class16_Sub3 arg0) {
		if (!arg0.aBoolean524) {
			throw new IllegalStateException("");
		}
		this.aClass16_Sub3_16 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static441.anIntArray442, 0);
		this.anInt3523 = Static441.anIntArray442[0];
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
	@Override
	public void method2918() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt3523);
		this.anInt3535 |= 0x4;
		this.anInt3530 = this.method2929();
	}

	@OriginalMember(owner = "client!er", name = "d", descriptor = "(I)V")
	@Override
	public void method2922() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt3523);
		this.anInt3535 |= 0x2;
		this.anInt3530 = this.method2929();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ds;II)V")
	public void method2924(@OriginalArg(0) Class8_Sub5_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt3530 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((this.anInt3524 & ~local16) == 0) {
			this.anInt3541 = arg0.anInt2810;
			this.anInt3528 = arg0.anInt2815;
		} else if (this.anInt3528 != arg0.anInt2815 || arg0.anInt2810 != this.anInt3541) {
			throw new RuntimeException();
		}
		arg0.method2412(Static546.anIntArray514[arg1], this.anInt3530);
		this.anInterface15Array1[arg1] = arg0;
		this.anInt3524 |= local16;
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(I)V")
	@Override
	public void method2919() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt3535 &= 0xFFFFFFFB;
		this.anInt3530 = this.method2929();
	}

	@OriginalMember(owner = "client!er", name = "f", descriptor = "(I)Z")
	public boolean method2925() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt3530);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(BI)V")
	public void method2926(@OriginalArg(1) int arg0) {
		if (this.anInt3530 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static546.anIntArray514[arg0]);
	}

	@OriginalMember(owner = "client!er", name = "c", descriptor = "(I)V")
	@Override
	public void method2921() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt3523);
		this.anInt3535 |= 0x1;
		this.anInt3530 = this.method2929();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILclient!wn;)V")
	private void method2927(@OriginalArg(2) int arg0, @OriginalArg(3) Class20_Sub4 arg1) {
		if (this.anInt3530 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg0;
		if ((~local23 & this.anInt3524) == 0) {
			this.anInt3528 = arg1.anInt9354;
			this.anInt3541 = arg1.anInt9355;
		} else if (arg1.anInt9354 != this.anInt3528 || this.anInt3541 != arg1.anInt9355) {
			throw new RuntimeException();
		}
		arg1.method7627(this.anInt3530, Static546.anIntArray514[arg0]);
		this.anInterface15Array1[arg0] = arg1;
		this.anInt3524 |= local23;
	}

	@OriginalMember(owner = "client!er", name = "e", descriptor = "(I)V")
	@Override
	public void method2923() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt3535 &= 0xFFFFFFFE;
		this.anInt3530 = this.method2929();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!tc;III)V")
	public void method2928(@OriginalArg(0) Class20_Sub3 arg0, @OriginalArg(3) int arg1) {
		this.method2931(arg1, arg0);
	}

	@OriginalMember(owner = "client!er", name = "b", descriptor = "(B)I")
	private int method2929() {
		if ((this.anInt3535 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt3535 & 0x2) == 0) {
			return (this.anInt3535 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IZLclient!wn;)V")
	public void method2930(@OriginalArg(0) int arg0, @OriginalArg(2) Class20_Sub4 arg1) {
		this.method2927(arg0, arg1);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIILclient!tc;I)V")
	private void method2931(@OriginalArg(1) int arg0, @OriginalArg(3) Class20_Sub3 arg1) {
		if (this.anInt3530 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt3524 & 0xFFFFFFFE) == 0) {
			this.anInt3541 = arg1.anInt9208;
			this.anInt3528 = arg1.anInt9208;
		} else if (arg1.anInt9208 != this.anInt3528 || arg1.anInt9208 != this.anInt3541) {
			throw new RuntimeException();
		}
		arg1.method7530(this.anInt3530, Static546.anIntArray514[0], arg0);
		this.anInterface15Array1[0] = arg1;
		this.anInt3524 |= 0x1;
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
	@Override
	public void method2920() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt3535 &= 0xFFFFFFFD;
		this.anInt3530 = this.method2929();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IB)V")
	public void method2932(@OriginalArg(0) int arg0) {
		if (this.anInterface15Array1[arg0] != null) {
			this.anInterface15Array1[arg0].method7611();
		}
		this.anInt3524 &= ~(0x1 << arg0);
		this.anInterface15Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!er", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub3_16.method5968(this.anInt3523);
		super.finalize();
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
	public void method2934() {
		if (this.anInt3530 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static546.anIntArray514[0]);
	}
}
