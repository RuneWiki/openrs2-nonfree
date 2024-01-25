import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class315 implements Interface17 {

	@OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
	private int anInt8663;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
	private int anInt8670;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "I")
	private int anInt8675;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
	private int anInt8658 = -1;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "[Lclient!bq;")
	private final Interface4[] anInterface4Array1 = new Interface4[9];

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
	private int anInt8671 = 0;

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_40;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	private final int anInt8655;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(Lclient!pea;)V")
	public Class315(@OriginalArg(0) Class121_Sub3 arg0) {
		if (!arg0.aBoolean468) {
			throw new IllegalStateException("");
		}
		this.aClass121_Sub3_40 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static275.anIntArray448, 0);
		this.anInt8655 = Static275.anIntArray448[0];
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(B)V")
	@Override
	public void method7046() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt8671 &= 0xFFFFFFFB;
		this.anInt8658 = this.method7055();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lclient!qw;BI)V")
	public void method7050(@OriginalArg(0) Class35_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method7054(arg0, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass121_Sub3_40.method5670(this.anInt8655);
		super.finalize();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!cn;II)V")
	public void method7051(@OriginalArg(0) int arg0, @OriginalArg(1) Class35_Sub2 arg1) {
		this.method7052(arg0, arg1);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!cn;II)V")
	private void method7052(@OriginalArg(0) int arg0, @OriginalArg(2) Class35_Sub2 arg1) {
		if (this.anInt8658 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt8670 & 0xFFFFFFFE) == 0) {
			this.anInt8675 = arg1.anInt1135;
			this.anInt8663 = arg1.anInt1135;
		} else if (arg1.anInt1135 != this.anInt8663 || this.anInt8675 != arg1.anInt1135) {
			throw new RuntimeException();
		}
		arg1.method883(arg0, this.anInt8658, Static386.anIntArray562[0]);
		this.anInterface4Array1[0] = arg1;
		this.anInt8670 |= 0x1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!ga;I)V")
	public void method7053(@OriginalArg(1) Class6_Sub1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt8658 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt8670) == 0) {
			this.anInt8675 = arg0.anInt2725;
			this.anInt8663 = arg0.anInt2737;
		} else if (arg0.anInt2737 != this.anInt8663 || arg0.anInt2725 != this.anInt8675) {
			throw new RuntimeException();
		}
		arg0.method2270(this.anInt8658, Static386.anIntArray562[arg1]);
		this.anInterface4Array1[arg1] = arg0;
		this.anInt8670 |= local16;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	@Override
	public void method7047() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt8655);
		this.anInt8671 |= 0x1;
		this.anInt8658 = this.method7055();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILclient!qw;II)V")
	private void method7054(@OriginalArg(1) Class35_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt8658 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((~local23 & this.anInt8670) == 0) {
			this.anInt8675 = arg0.anInt5638;
			this.anInt8663 = arg0.anInt5645;
		} else if (this.anInt8663 != arg0.anInt5645 || this.anInt8675 != arg0.anInt5638) {
			throw new RuntimeException();
		}
		arg0.method4855(Static386.anIntArray562[arg1], this.anInt8658);
		this.anInterface4Array1[arg1] = arg0;
		this.anInt8670 |= local23;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)I")
	private int method7055() {
		if ((this.anInt8671 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt8671 & 0x2) == 0) {
			return (this.anInt8671 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IB)V")
	public void method7056(@OriginalArg(0) int arg0) {
		if (this.anInt8658 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static386.anIntArray562[arg0]);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(II)V")
	public void method7057() {
		if (this.anInt8658 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static386.anIntArray562[0]);
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
	@Override
	public void method7044() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt8671 &= 0xFFFFFFFE;
		this.anInt8658 = this.method7055();
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(I)V")
	@Override
	public void method7049() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt8671 &= 0xFFFFFFFD;
		this.anInt8658 = this.method7055();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V")
	@Override
	public void method7045() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt8655);
		this.anInt8671 |= 0x4;
		this.anInt8658 = this.method7055();
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)V")
	@Override
	public void method7048() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt8655);
		this.anInt8671 |= 0x2;
		this.anInt8658 = this.method7055();
	}

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "(I)Z")
	public boolean method7059() {
		@Pc(14) int local14 = OpenGL.glCheckFramebufferStatusEXT(this.anInt8658);
		return local14 == 36053;
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(II)V")
	public void method7060(@OriginalArg(1) int arg0) {
		if (this.anInterface4Array1[arg0] != null) {
			this.anInterface4Array1[arg0].method5323();
		}
		this.anInt8670 &= ~(0x1 << arg0);
		this.anInterface4Array1[arg0] = null;
	}
}
