import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class324 implements Interface21 {

	@OriginalMember(owner = "client!tt", name = "i", descriptor = "I")
	private int anInt9486;

	@OriginalMember(owner = "client!tt", name = "x", descriptor = "I")
	private int anInt9498;

	@OriginalMember(owner = "client!tt", name = "y", descriptor = "I")
	private int anInt9499;

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "I")
	private int anInt9482 = -1;

	@OriginalMember(owner = "client!tt", name = "l", descriptor = "[Lclient!hda;")
	private final Interface10[] anInterface10Array1 = new Interface10[9];

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "I")
	private int anInt9496 = 0;

	@OriginalMember(owner = "client!tt", name = "q", descriptor = "Lclient!eq;")
	private final Class33_Sub3 aClass33_Sub3_38;

	@OriginalMember(owner = "client!tt", name = "g", descriptor = "I")
	private final int anInt9485;

	@OriginalMember(owner = "client!tt", name = "<init>", descriptor = "(Lclient!eq;)V")
	public Class324(@OriginalArg(0) Class33_Sub3 arg0) {
		if (!arg0.aBoolean273) {
			throw new IllegalStateException("");
		}
		this.aClass33_Sub3_38 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static145.anIntArray620, 0);
		this.anInt9485 = Static145.anIntArray620[0];
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IB)V")
	public void method7842(@OriginalArg(0) int arg0) {
		if (this.anInt9482 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static285.anIntArray344[arg0]);
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)I")
	private int method7843() {
		if ((this.anInt9496 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt9496 & 0x2) == 0) {
			return (this.anInt9496 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(IB)V")
	public void method7845(@OriginalArg(0) int arg0) {
		if (this.anInterface10Array1[arg0] != null) {
			this.anInterface10Array1[arg0].method7320();
		}
		this.anInt9486 &= ~(0x1 << arg0);
		this.anInterface10Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(B)V")
	@Override
	public void method7838() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt9496 &= 0xFFFFFFFB;
		this.anInt9482 = this.method7843();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(ZILclient!gk;)V")
	public void method7846(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub5 arg1) {
		if (this.anInt9482 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt9486 & ~local16) == 0) {
			this.anInt9499 = arg1.anInt4363;
			this.anInt9498 = arg1.anInt4370;
		} else if (this.anInt9499 != arg1.anInt4363 || this.anInt9498 != arg1.anInt4370) {
			throw new RuntimeException();
		}
		arg1.method3728(Static285.anIntArray344[arg0], this.anInt9482);
		this.anInterface10Array1[arg0] = arg1;
		this.anInt9486 |= local16;
	}

	@OriginalMember(owner = "client!tt", name = "d", descriptor = "(I)Z")
	public boolean method7847() {
		@Pc(13) int local13 = OpenGL.glCheckFramebufferStatusEXT(this.anInt9482);
		return local13 == 36053;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!hga;I)V")
	private void method7849(@OriginalArg(0) int arg0, @OriginalArg(2) Class121_Sub2 arg1) {
		if (this.anInt9482 == -1) {
			throw new RuntimeException();
		}
		@Pc(20) int local20 = 0x1 << arg0;
		if ((this.anInt9486 & ~local20) == 0) {
			this.anInt9498 = arg1.anInt6656;
			this.anInt9499 = arg1.anInt6654;
		} else if (arg1.anInt6654 != this.anInt9499 || arg1.anInt6656 != this.anInt9498) {
			throw new RuntimeException();
		}
		arg1.method5558(Static285.anIntArray344[arg0], this.anInt9482);
		this.anInterface10Array1[arg0] = arg1;
		this.anInt9486 |= local20;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(BLclient!gv;III)V")
	private void method7850(@OriginalArg(1) Class121_Sub1 arg0, @OriginalArg(4) int arg1) {
		if (this.anInt9482 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt9486 & 0xFFFFFFFE) == 0) {
			this.anInt9499 = arg0.anInt4549;
			this.anInt9498 = arg0.anInt4549;
		} else if (this.anInt9499 != arg0.anInt4549 || this.anInt9498 != arg0.anInt4549) {
			throw new RuntimeException();
		}
		arg0.method3871(arg1, Static285.anIntArray344[0], this.anInt9482);
		this.anInterface10Array1[0] = arg0;
		this.anInt9486 |= 0x1;
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(I)V")
	@Override
	public void method7837() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt9496 &= 0xFFFFFFFE;
		this.anInt9482 = this.method7843();
	}

	@OriginalMember(owner = "client!tt", name = "c", descriptor = "(B)V")
	@Override
	public void method7840() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt9485);
		this.anInt9496 |= 0x1;
		this.anInt9482 = this.method7843();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(II)V")
	public void method7851() {
		if (this.anInt9482 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static285.anIntArray344[0]);
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IILclient!hga;)V")
	public void method7853(@OriginalArg(1) int arg0, @OriginalArg(2) Class121_Sub2 arg1) {
		this.method7849(arg0, arg1);
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(I)V")
	@Override
	public void method7841() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt9485);
		this.anInt9496 |= 0x4;
		this.anInt9482 = this.method7843();
	}

	@OriginalMember(owner = "client!tt", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub3_38.method3068(this.anInt9485);
		super.finalize();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Z)V")
	@Override
	public void method7836() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt9485);
		this.anInt9496 |= 0x2;
		this.anInt9482 = this.method7843();
	}

	@OriginalMember(owner = "client!tt", name = "b", descriptor = "(B)V")
	@Override
	public void method7839() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt9496 &= 0xFFFFFFFD;
		this.anInt9482 = this.method7843();
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IIILclient!gv;)V")
	public void method7855(@OriginalArg(0) int arg0, @OriginalArg(3) Class121_Sub1 arg1) {
		this.method7850(arg1, arg0);
	}
}
