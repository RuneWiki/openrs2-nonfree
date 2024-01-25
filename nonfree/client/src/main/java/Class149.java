import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class149 implements Interface22 {

	@OriginalMember(owner = "client!iha", name = "k", descriptor = "I")
	private int anInt4717;

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "I")
	private int anInt4725;

	@OriginalMember(owner = "client!iha", name = "v", descriptor = "I")
	private int anInt4726;

	@OriginalMember(owner = "client!iha", name = "j", descriptor = "I")
	private int anInt4716 = -1;

	@OriginalMember(owner = "client!iha", name = "m", descriptor = "[Lclient!l;")
	private final Interface16[] anInterface16Array1 = new Interface16[9];

	@OriginalMember(owner = "client!iha", name = "s", descriptor = "I")
	private int anInt4724 = 0;

	@OriginalMember(owner = "client!iha", name = "A", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_29;

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "I")
	private final int anInt4712;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(Lclient!wh;)V")
	public Class149(@OriginalArg(0) Class100_Sub3 arg0) {
		if (!arg0.aBoolean698) {
			throw new IllegalStateException("");
		}
		this.aClass100_Sub3_29 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static70.anIntArray102, 0);
		this.anInt4712 = Static70.anIntArray102[0];
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IB)V")
	public void method4091() {
		if (this.anInt4716 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static12.anIntArray6[0]);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!nc;IBII)V")
	private void method4092(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt4716 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4725 & 0xFFFFFFFE) == 0) {
			this.anInt4726 = arg0.anInt6748;
			this.anInt4717 = arg0.anInt6748;
		} else if (this.anInt4726 != arg0.anInt6748 || arg0.anInt6748 != this.anInt4717) {
			throw new RuntimeException();
		}
		arg0.method5784(arg1, Static12.anIntArray6[0], this.anInt4716);
		this.anInterface16Array1[0] = arg0;
		this.anInt4725 |= 0x1;
	}

	@OriginalMember(owner = "client!iha", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_29.method8910(this.anInt4712);
		super.finalize();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILclient!aw;I)V")
	private void method4093(@OriginalArg(2) Class3_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt4716 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg1;
		if ((~local16 & this.anInt4725) == 0) {
			this.anInt4717 = arg0.anInt4455;
			this.anInt4726 = arg0.anInt4460;
		} else if (this.anInt4726 != arg0.anInt4460 || this.anInt4717 != arg0.anInt4455) {
			throw new RuntimeException();
		}
		arg0.method3899(Static12.anIntArray6[arg1], this.anInt4716);
		this.anInterface16Array1[arg1] = arg0;
		this.anInt4725 |= local16;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(I)V")
	@Override
	public void method4088() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4724 &= 0xFFFFFFFE;
		this.anInt4716 = this.method4099();
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)V")
	@Override
	public void method4086() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4724 &= 0xFFFFFFFD;
		this.anInt4716 = this.method4099();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(BIILclient!nc;)V")
	public void method4094(@OriginalArg(1) int arg0, @OriginalArg(3) Class3_Sub4 arg1) {
		this.method4092(arg1, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(B)V")
	@Override
	public void method4089() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4712);
		this.anInt4724 |= 0x4;
		this.anInt4716 = this.method4099();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V")
	public void method4097(@OriginalArg(0) int arg0) {
		if (this.anInt4716 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static12.anIntArray6[arg0]);
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(ILclient!aw;I)V")
	public void method4098(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2 arg1) {
		this.method4093(arg1, arg0);
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)I")
	private int method4099() {
		if ((this.anInt4724 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4724 & 0x2) == 0) {
			return (this.anInt4724 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
	@Override
	public void method4087() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4712);
		this.anInt4724 |= 0x1;
		this.anInt4716 = this.method4099();
	}

	@OriginalMember(owner = "client!iha", name = "e", descriptor = "(I)Z")
	public boolean method4101() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4716);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	@Override
	public void method4085() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4724 &= 0xFFFFFFFB;
		this.anInt4716 = this.method4099();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!aea;II)V")
	public void method4102(@OriginalArg(0) Class6_Sub2_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4716 == -1) {
			throw new RuntimeException();
		}
		@Pc(17) int local17 = 0x1 << arg1;
		if ((this.anInt4725 & ~local17) == 0) {
			this.anInt4726 = arg0.anInt208;
			this.anInt4717 = arg0.anInt213;
		} else if (this.anInt4726 != arg0.anInt208 || arg0.anInt213 != this.anInt4717) {
			throw new RuntimeException();
		}
		arg0.method211(this.anInt4716, Static12.anIntArray6[arg1]);
		this.anInterface16Array1[arg1] = arg0;
		this.anInt4725 |= local17;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(B)V")
	@Override
	public void method4090() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4712);
		this.anInt4724 |= 0x2;
		this.anInt4716 = this.method4099();
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(II)V")
	public void method4104(@OriginalArg(0) int arg0) {
		if (this.anInterface16Array1[arg0] != null) {
			this.anInterface16Array1[arg0].method5769();
		}
		this.anInt4725 &= ~(0x1 << arg0);
		this.anInterface16Array1[arg0] = null;
	}
}
