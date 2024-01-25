import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mj")
public final class Class221 implements Interface12 {

	@OriginalMember(owner = "client!mj", name = "q", descriptor = "I")
	private int anInt6007;

	@OriginalMember(owner = "client!mj", name = "x", descriptor = "I")
	private int anInt6014;

	@OriginalMember(owner = "client!mj", name = "D", descriptor = "I")
	private int anInt6019;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "I")
	private int anInt6004 = 0;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "[Lclient!sga;")
	private final Interface24[] anInterface24Array1 = new Interface24[9];

	@OriginalMember(owner = "client!mj", name = "w", descriptor = "I")
	private int anInt6013 = -1;

	@OriginalMember(owner = "client!mj", name = "A", descriptor = "Lclient!dia;")
	private final Class13_Sub2 aClass13_Sub2_26;

	@OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
	private final int anInt6021;

	@OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(Lclient!dia;)V")
	public Class221(@OriginalArg(0) Class13_Sub2 arg0) {
		if (!arg0.aBoolean172) {
			throw new IllegalStateException("");
		}
		this.aClass13_Sub2_26 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static596.anIntArray824, 0);
		this.anInt6021 = Static596.anIntArray824[0];
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(BI)V")
	public void method5427() {
		if (this.anInt6013 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static285.anIntArray845[0]);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(B)Z")
	public boolean method5428() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt6013);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIILclient!efa;)V")
	private void method5429(@OriginalArg(2) int arg0, @OriginalArg(4) Class85_Sub1 arg1) {
		if (this.anInt6013 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt6014 & 0xFFFFFFFE) == 0) {
			this.anInt6019 = arg1.anInt2641;
			this.anInt6007 = arg1.anInt2641;
		} else if (this.anInt6007 != arg1.anInt2641 || this.anInt6019 != arg1.anInt2641) {
			throw new RuntimeException();
		}
		arg1.method2421(Static285.anIntArray845[0], this.anInt6013, arg0);
		this.anInterface24Array1[0] = arg1;
		this.anInt6014 |= 0x1;
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBLclient!tca;)V")
	public void method5430(@OriginalArg(0) int arg0, @OriginalArg(2) Class85_Sub3 arg1) {
		this.method5432(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lclient!efa;III)V")
	public void method5431(@OriginalArg(0) Class85_Sub1 arg0, @OriginalArg(3) int arg1) {
		this.method5429(arg1, arg0);
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!tca;ZI)V")
	private void method5432(@OriginalArg(1) Class85_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.anInt6013 == -1) {
			throw new RuntimeException();
		}
		@Pc(23) int local23 = 0x1 << arg1;
		if ((this.anInt6014 & ~local23) == 0) {
			this.anInt6019 = arg0.anInt5915;
			this.anInt6007 = arg0.anInt5926;
		} else if (this.anInt6007 != arg0.anInt5926 || arg0.anInt5915 != this.anInt6019) {
			throw new RuntimeException();
		}
		arg0.method5370(this.anInt6013, Static285.anIntArray845[arg1]);
		this.anInterface24Array1[arg1] = arg0;
		this.anInt6014 |= local23;
	}

	@OriginalMember(owner = "client!mj", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass13_Sub2_26.method1981(this.anInt6021);
		super.finalize();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	@Override
	public void method5420() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt6004 &= 0xFFFFFFFE;
		this.anInt6013 = this.method5438();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
	public void method5433(@OriginalArg(0) int arg0) {
		if (this.anInterface24Array1[arg0] != null) {
			this.anInterface24Array1[arg0].method7868();
		}
		this.anInt6014 &= ~(0x1 << arg0);
		this.anInterface24Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(B)V")
	@Override
	public void method5424() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt6021);
		this.anInt6004 |= 0x4;
		this.anInt6013 = this.method5438();
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	@Override
	public void method5425() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt6021);
		this.anInt6004 |= 0x2;
		this.anInt6013 = this.method5438();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!kq;I)V")
	public void method5435(@OriginalArg(1) Class3_Sub11_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6013 == -1) {
			throw new RuntimeException();
		}
		@Pc(19) int local19 = 0x1 << arg1;
		if ((this.anInt6014 & ~local19) == 0) {
			this.anInt6007 = arg0.anInt5371;
			this.anInt6019 = arg0.anInt5368;
		} else if (this.anInt6007 != arg0.anInt5371 || this.anInt6019 != arg0.anInt5368) {
			throw new RuntimeException();
		}
		arg0.method4916(this.anInt6013, Static285.anIntArray845[arg1]);
		this.anInterface24Array1[arg1] = arg0;
		this.anInt6014 |= local19;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)V")
	public void method5436(@OriginalArg(1) int arg0) {
		if (this.anInt6013 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static285.anIntArray845[arg0]);
	}

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	@Override
	public void method5423() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt6004 &= 0xFFFFFFFD;
		this.anInt6013 = this.method5438();
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)I")
	private int method5438() {
		if ((this.anInt6004 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt6004 & 0x2) == 0) {
			return (this.anInt6004 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	@Override
	public void method5421() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt6004 &= 0xFFFFFFFB;
		this.anInt6013 = this.method5438();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(B)V")
	@Override
	public void method5422() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt6021);
		this.anInt6004 |= 0x1;
		this.anInt6013 = this.method5438();
	}
}
