import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class186 implements Interface19 {

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "I")
	private int anInt4846;

	@OriginalMember(owner = "client!ju", name = "w", descriptor = "I")
	private int anInt4861;

	@OriginalMember(owner = "client!ju", name = "A", descriptor = "I")
	private int anInt4864;

	@OriginalMember(owner = "client!ju", name = "x", descriptor = "I")
	private int anInt4862 = -1;

	@OriginalMember(owner = "client!ju", name = "z", descriptor = "[Lclient!jv;")
	private final Interface11[] anInterface11Array1 = new Interface11[9];

	@OriginalMember(owner = "client!ju", name = "v", descriptor = "I")
	private int anInt4860 = 0;

	@OriginalMember(owner = "client!ju", name = "s", descriptor = "Lclient!rs;")
	private final Class133_Sub3 aClass133_Sub3_15;

	@OriginalMember(owner = "client!ju", name = "u", descriptor = "I")
	private final int anInt4859;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!rs;)V")
	public Class186(@OriginalArg(0) Class133_Sub3 arg0) {
		if (!arg0.aBoolean615) {
			throw new IllegalStateException("");
		}
		this.aClass133_Sub3_15 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static588.anIntArray560, 0);
		this.anInt4859 = Static588.anIntArray560[0];
	}

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "(I)V")
	@Override
	public void method4333() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4860 &= 0xFFFFFFFE;
		this.anInt4862 = this.method4338();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIILclient!io;)V")
	public void method4335(@OriginalArg(1) int arg0, @OriginalArg(3) Class167_Sub1 arg1) {
		this.method4343(arg0, arg1);
	}

	@OriginalMember(owner = "client!ju", name = "d", descriptor = "(I)V")
	@Override
	public void method4334() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4860 &= 0xFFFFFFFB;
		this.anInt4862 = this.method4338();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B)V")
	@Override
	public void method4332() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4859);
		this.anInt4860 |= 0x4;
		this.anInt4862 = this.method4338();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
	@Override
	public void method4329() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4859);
		this.anInt4860 |= 0x2;
		this.anInt4862 = this.method4338();
	}

	@OriginalMember(owner = "client!ju", name = "f", descriptor = "(I)I")
	private int method4338() {
		if ((this.anInt4860 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4860 & 0x2) == 0) {
			return (this.anInt4860 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(ILclient!qca;I)V")
	public void method4339(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5_Sub17 arg1) {
		if (this.anInt4862 == -1) {
			throw new RuntimeException();
		}
		@Pc(16) int local16 = 0x1 << arg0;
		if ((this.anInt4861 & ~local16) == 0) {
			this.anInt4846 = arg1.anInt7646;
			this.anInt4864 = arg1.anInt7635;
		} else if (this.anInt4846 != arg1.anInt7646 || arg1.anInt7635 != this.anInt4864) {
			throw new RuntimeException();
		}
		arg1.method6755(this.anInt4862, Static585.anIntArray558[arg0]);
		this.anInterface11Array1[arg0] = arg1;
		this.anInt4861 |= local16;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)V")
	public void method4340() {
		if (this.anInt4862 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static585.anIntArray558[0]);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IILclient!wo;I)V")
	private void method4341(@OriginalArg(1) int arg0, @OriginalArg(2) Class167_Sub3 arg1) {
		if (this.anInt4862 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg0;
		if ((~local21 & this.anInt4861) == 0) {
			this.anInt4864 = arg1.anInt8729;
			this.anInt4846 = arg1.anInt8740;
		} else if (arg1.anInt8740 != this.anInt4846 || this.anInt4864 != arg1.anInt8729) {
			throw new RuntimeException();
		}
		arg1.method7523(this.anInt4862, Static585.anIntArray558[arg0]);
		this.anInterface11Array1[arg0] = arg1;
		this.anInt4861 |= local21;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Z)V")
	@Override
	public void method4330() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4860 &= 0xFFFFFFFD;
		this.anInt4862 = this.method4338();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(II)V")
	public void method4342(@OriginalArg(0) int arg0) {
		if (this.anInt4862 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static585.anIntArray558[arg0]);
	}

	@OriginalMember(owner = "client!ju", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass133_Sub3_15.method7408(this.anInt4859);
		super.finalize();
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIILclient!io;B)V")
	private void method4343(@OriginalArg(2) int arg0, @OriginalArg(3) Class167_Sub1 arg1) {
		if (this.anInt4862 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4861 & 0xFFFFFFFE) == 0) {
			this.anInt4864 = arg1.anInt4402;
			this.anInt4846 = arg1.anInt4402;
		} else if (arg1.anInt4402 != this.anInt4846 || this.anInt4864 != arg1.anInt4402) {
			throw new RuntimeException();
		}
		arg1.method3973(this.anInt4862, arg0, Static585.anIntArray558[0]);
		this.anInterface11Array1[0] = arg1;
		this.anInt4861 |= 0x1;
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(I)V")
	@Override
	public void method4331() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4859);
		this.anInt4860 |= 0x1;
		this.anInt4862 = this.method4338();
	}

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "(B)Z")
	public boolean method4344() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4862);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(BI)V")
	public void method4345(@OriginalArg(1) int arg0) {
		if (this.anInterface11Array1[arg0] != null) {
			this.anInterface11Array1[arg0].method8000();
		}
		this.anInt4861 &= ~(0x1 << arg0);
		this.anInterface11Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(Lclient!wo;ZI)V")
	public void method4346(@OriginalArg(0) Class167_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method4341(arg1, arg0);
	}
}
