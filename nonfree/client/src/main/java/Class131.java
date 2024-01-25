import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jk")
public final class Class131 implements Interface2 {

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	private int anInt4051;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "I")
	private int anInt4054;

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "I")
	private int anInt4057;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "[Lclient!jv;")
	private final Interface6[] anInterface6Array1 = new Interface6[9];

	@OriginalMember(owner = "client!jk", name = "u", descriptor = "I")
	private int anInt4055 = -1;

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
	private int anInt4038 = 0;

	@OriginalMember(owner = "client!jk", name = "B", descriptor = "Lclient!ih;")
	private final Class106_Sub2 aClass106_Sub2_26;

	@OriginalMember(owner = "client!jk", name = "F", descriptor = "I")
	private final int anInt4065;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!ih;)V")
	public Class131(@OriginalArg(0) Class106_Sub2 arg0) {
		if (!arg0.aBoolean233) {
			throw new IllegalStateException("");
		}
		this.aClass106_Sub2_26 = arg0;
		OpenGL.glGenFramebuffersEXT(1, Static338.anIntArray635, 0);
		this.anInt4065 = Static338.anIntArray635[0];
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)V")
	public void method3139(@OriginalArg(1) int arg0) {
		if (this.anInt4055 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glDrawBuffer(Static140.anIntArray316[arg0]);
	}

	@OriginalMember(owner = "client!jk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass106_Sub2_26.method2919(this.anInt4065);
		super.finalize();
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)I")
	private int method3140() {
		if ((this.anInt4038 & 0x4) != 0) {
			return 36160;
		} else if ((this.anInt4038 & 0x2) == 0) {
			return (this.anInt4038 & 0x1) == 0 ? -1 : 36008;
		} else {
			return 36009;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BILclient!ah;I)V")
	private void method3141(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1 arg1) {
		if (this.anInt4055 == -1) {
			throw new RuntimeException();
		}
		@Pc(21) int local21 = 0x1 << arg0;
		if ((~local21 & this.anInt4051) == 0) {
			this.anInt4054 = arg1.anInt3063;
			this.anInt4057 = arg1.anInt3069;
		} else if (this.anInt4057 != arg1.anInt3069 || arg1.anInt3063 != this.anInt4054) {
			throw new RuntimeException();
		}
		arg1.method2253(this.anInt4055, Static140.anIntArray316[arg0]);
		this.anInterface6Array1[arg0] = arg1;
		this.anInt4051 |= local21;
	}

	@OriginalMember(owner = "client!jk", name = "d", descriptor = "(I)V")
	@Override
	public void method3137() {
		OpenGL.glBindFramebufferEXT(36160, 0);
		this.anInt4038 &= 0xFFFFFFFB;
		this.anInt4055 = this.method3140();
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)V")
	@Override
	public void method3136() {
		OpenGL.glBindFramebufferEXT(36009, this.anInt4065);
		this.anInt4038 |= 0x2;
		this.anInt4055 = this.method3140();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIZLclient!hg;)V")
	private void method3142(@OriginalArg(1) int arg0, @OriginalArg(4) Class8_Sub3 arg1) {
		if (this.anInt4055 == -1) {
			throw new RuntimeException();
		}
		if ((this.anInt4051 & 0xFFFFFFFE) == 0) {
			this.anInt4054 = arg1.anInt3226;
			this.anInt4057 = arg1.anInt3226;
		} else if (arg1.anInt3226 != this.anInt4057 || this.anInt4054 != arg1.anInt3226) {
			throw new RuntimeException();
		}
		arg1.method2397(Static140.anIntArray316[0], arg0, this.anInt4055);
		this.anInterface6Array1[0] = arg1;
		this.anInt4051 |= 0x1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lclient!cj;BI)V")
	public void method3143(@OriginalArg(0) Class1_Sub1_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt4055 == -1) {
			throw new RuntimeException();
		}
		@Pc(15) int local15 = 0x1 << arg1;
		if ((~local15 & this.anInt4051) == 0) {
			this.anInt4054 = arg0.anInt1390;
			this.anInt4057 = arg0.anInt1395;
		} else if (this.anInt4057 != arg0.anInt1395 || this.anInt4054 != arg0.anInt1390) {
			throw new RuntimeException();
		}
		arg0.method994(this.anInt4055, Static140.anIntArray316[arg1]);
		this.anInterface6Array1[arg1] = arg0;
		this.anInt4051 |= local15;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBLclient!ah;)V")
	public void method3145(@OriginalArg(0) int arg0, @OriginalArg(2) Class8_Sub1 arg1) {
		this.method3141(arg0, arg1);
	}

	@OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
	@Override
	public void method3138() {
		OpenGL.glBindFramebufferEXT(36160, this.anInt4065);
		this.anInt4038 |= 0x4;
		this.anInt4055 = this.method3140();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(II)V")
	public void method3146(@OriginalArg(1) int arg0) {
		if (this.anInterface6Array1[arg0] != null) {
			this.anInterface6Array1[arg0].method3067();
		}
		this.anInt4051 &= ~(0x1 << arg0);
		this.anInterface6Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!jk", name = "h", descriptor = "(I)I")
	public int method3148() {
		return this.anInt4054;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V")
	@Override
	public void method3133() {
		OpenGL.glBindFramebufferEXT(36008, this.anInt4065);
		this.anInt4038 |= 0x1;
		this.anInt4055 = this.method3140();
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
	@Override
	public void method3134() {
		OpenGL.glBindFramebufferEXT(36008, 0);
		this.anInt4038 &= 0xFFFFFFFE;
		this.anInt4055 = this.method3140();
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(II)V")
	public void method3150() {
		if (this.anInt4055 == -1) {
			throw new RuntimeException();
		}
		OpenGL.glReadBuffer(Static140.anIntArray316[0]);
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
	@Override
	public void method3135() {
		OpenGL.glBindFramebufferEXT(36009, 0);
		this.anInt4038 &= 0xFFFFFFFD;
		this.anInt4055 = this.method3140();
	}

	@OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)Z")
	public boolean method3154() {
		@Pc(7) int local7 = OpenGL.glCheckFramebufferStatusEXT(this.anInt4055);
		return local7 == 36053;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIILclient!hg;)V")
	public void method3155(@OriginalArg(2) int arg0, @OriginalArg(3) Class8_Sub3 arg1) {
		this.method3142(arg0, arg1);
	}
}
