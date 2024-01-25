import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class217 implements Interface9 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	private int anInt6782;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	private int anInt6783;

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "I")
	private int anInt6784;

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "[Lclient!h;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_42;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "I")
	private final int anInt6781;

	@OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lclient!tb;)V")
	public Class217(@OriginalArg(0) Class129_Sub2 arg0) {
		if (!arg0.aBoolean396) {
			throw new IllegalStateException("");
		}
		this.aClass129_Sub2_42 = arg0;
		this.aClass129_Sub2_42.anOpengl2.glGenFramebuffersEXT(1, Static357.anIntArray550, 0);
		this.anInt6781 = Static357.anIntArray550[0];
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!ds;II)V")
	private void method5725(@OriginalArg(1) Class56_Sub1 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass129_Sub2_42.method5078() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6782 & 0xFFFFFFFE) == 0) {
			this.anInt6784 = arg0.anInt1226;
			this.anInt6783 = arg0.anInt1226;
		} else if (arg0.anInt1226 != this.anInt6784 || arg0.anInt1226 != this.anInt6783) {
			throw new RuntimeException();
		}
		arg0.method975(Static357.anIntArray549[0], arg1);
		this.anInterface1Array1[0] = arg0;
		this.anInt6782 |= 0x1;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!im;I)V")
	private void method5726(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub4 arg1) {
		if (this.aClass129_Sub2_42.method5078() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt6782 & ~local12) == 0) {
			this.anInt6784 = arg1.anInt3013;
			this.anInt6783 = arg1.anInt3012;
		} else if (arg1.anInt3013 != this.anInt6784 || arg1.anInt3012 != this.anInt6783) {
			throw new RuntimeException();
		}
		arg1.method2550(Static357.anIntArray549[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt6782 |= local12;
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)V")
	public void method5727(@OriginalArg(0) int arg0) {
		if (this.aClass129_Sub2_42.method5078() != this) {
			throw new RuntimeException();
		}
		this.aClass129_Sub2_42.anOpengl2.glDrawBuffer(Static357.anIntArray549[arg0]);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!wm;)V")
	public void method5728(@OriginalArg(1) Class215 arg0) {
		if (this.aClass129_Sub2_42.method5078() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6782 & 0xFFFFFEFF) == 0) {
			this.anInt6784 = arg0.anInt6710;
			this.anInt6783 = arg0.anInt6709;
		} else if (arg0.anInt6710 != this.anInt6784 || arg0.anInt6709 != this.anInt6783) {
			throw new RuntimeException();
		}
		arg0.method5674(Static357.anIntArray549[8]);
		this.anInterface1Array1[8] = arg0;
		this.anInt6782 |= 0x100;
	}

	@OriginalMember(owner = "client!wq", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass129_Sub2_42.method5032(this.anInt6781);
		super.finalize();
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "()I")
	@Override
	public int method5722() {
		return this.anInt6783;
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "()V")
	@Override
	public void method5723() {
		this.aClass129_Sub2_42.anOpengl2.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!wq", name = "c", descriptor = "()V")
	@Override
	public void method5724() {
		this.aClass129_Sub2_42.anOpengl2.glBindFramebufferEXT(36160, this.anInt6781);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!im;)V")
	public void method5729(@OriginalArg(0) int arg0, @OriginalArg(1) Class56_Sub4 arg1) {
		this.method5726(arg0, arg1);
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!ds;I)V")
	public void method5730(@OriginalArg(1) Class56_Sub1 arg0, @OriginalArg(2) int arg1) {
		this.method5725(arg0, arg1);
	}

	@OriginalMember(owner = "client!wq", name = "b", descriptor = "(I)V")
	public void method5731(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method5673();
		}
		this.anInt6782 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "()Z")
	public boolean method5732() {
		@Pc(5) int local5 = this.aClass129_Sub2_42.anOpengl2.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}
}
