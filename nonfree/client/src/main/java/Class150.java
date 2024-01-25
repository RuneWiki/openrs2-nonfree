import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ml")
public final class Class150 implements Interface3 {

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
	private int anInt4591;

	@OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
	private int anInt4610;

	@OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
	private int anInt4612;

	@OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
	private int anInt4598 = 0;

	@OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
	private int anInt4609 = -1;

	@OriginalMember(owner = "client!ml", name = "H", descriptor = "[Lclient!pa;")
	private final Interface9[] anInterface9Array1 = new Interface9[9];

	@OriginalMember(owner = "client!ml", name = "B", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_25;

	@OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
	private final int anInt4603;

	@OriginalMember(owner = "client!ml", name = "<init>", descriptor = "(Lclient!fd;)V")
	public Class150(@OriginalArg(0) Class19_Sub2 arg0) {
		if (!arg0.aBoolean191) {
			throw new IllegalStateException("");
		}
		this.aClass19_Sub2_25 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static26.anIntArray29, 0);
		this.anInt4603 = Static26.anIntArray29[0];
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)V")
	public void method3610(@OriginalArg(1) int arg0) {
		if (this.anInt4609 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static383.anIntArray496[arg0]);
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V")
	public void method3611(@OriginalArg(0) int arg0) {
		if (this.anInterface9Array1[arg0] != null) {
			this.anInterface9Array1[arg0].method4178();
		}
		this.anInt4612 &= ~(0x1 << arg0);
		this.anInterface9Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!af;I)V")
	private void method3612(@OriginalArg(0) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (this.anInt4609 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg0;
		if ((this.anInt4612 & ~local15) == 0) {
			this.anInt4610 = arg1.anInt5458;
			this.anInt4591 = arg1.anInt5466;
		} else if (this.anInt4591 != arg1.anInt5466 || this.anInt4610 != arg1.anInt5458) {
			throw new RuntimeException();
		}
		arg1.method4195(Static383.anIntArray496[arg0], this.anInt4609);
		this.anInterface9Array1[arg0] = arg1;
		this.anInt4612 |= local15;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIILclient!im;I)V")
	private void method3613(@OriginalArg(3) Class6_Sub4 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt4609 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4612 & 0xFFFFFFFE) == 0) {
			this.anInt4591 = arg0.anInt3257;
			this.anInt4610 = arg0.anInt3257;
		} else if (this.anInt4591 != arg0.anInt3257 || this.anInt4610 != arg0.anInt3257) {
			throw new RuntimeException();
		}
		arg0.method2754(this.anInt4609, arg1, Static383.anIntArray496[0]);
		this.anInterface9Array1[0] = arg0;
		this.anInt4612 |= 0x1;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
	@Override
	public void method3603() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4598 &= 0xFFFFFFFB;
		this.anInt4609 = this.method3620();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!io;IB)V")
	public void method3614(@OriginalArg(0) Class4_Sub1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (this.anInt4609 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt4612 & ~local23) == 0) {
			this.anInt4591 = arg0.anInt3281;
			this.anInt4610 = arg0.anInt3280;
		} else if (this.anInt4591 != arg0.anInt3281 || this.anInt4610 != arg0.anInt3280) {
			throw new RuntimeException();
		}
		arg0.method2770(Static383.anIntArray496[arg1], this.anInt4609);
		this.anInterface9Array1[arg1] = arg0;
		this.anInt4612 |= local23;
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(B)I")
	public int method3615() {
		return this.anInt4610;
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(B)V")
	@Override
	public void method3602() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4603);
		this.anInt4598 |= 0x4;
		this.anInt4609 = this.method3620();
	}

	@OriginalMember(owner = "client!ml", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass19_Sub2_25.method1941(this.anInt4603);
		super.finalize();
	}

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Z")
	public boolean method3616() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4609);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
	@Override
	public void method3607() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4603);
		this.anInt4598 |= 0x1;
		this.anInt4609 = this.method3620();
	}

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "(I)V")
	@Override
	public void method3606() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4598 &= 0xFFFFFFFE;
		this.anInt4609 = this.method3620();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
	public void method3618() {
		if (this.anInt4609 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static383.anIntArray496[0]);
	}

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "(I)V")
	@Override
	public void method3605() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4603);
		this.anInt4598 |= 0x2;
		this.anInt4609 = this.method3620();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILclient!im;I)V")
	public void method3619(@OriginalArg(2) Class6_Sub4 arg0, @OriginalArg(3) int arg1) {
		this.method3613(arg0, arg1);
	}

	@OriginalMember(owner = "client!ml", name = "g", descriptor = "(I)I")
	private int method3620() {
		if ((this.anInt4598 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4598 & 0x2) == 0) {
			return (this.anInt4598 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V")
	@Override
	public void method3604() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4598 &= 0xFFFFFFFD;
		this.anInt4609 = this.method3620();
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLclient!af;I)V")
	public void method3621(@OriginalArg(1) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method3612(arg1, arg0);
	}
}
