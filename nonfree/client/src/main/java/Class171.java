import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ql")
public final class Class171 implements Interface4 {

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
	private int anInt5040;

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
	private int anInt5042;

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	private int anInt5043;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "[Lclient!qg;")
	private final Interface6[] anInterface6Array1 = new Interface6[9];

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "Lclient!sq;")
	private final Class46_Sub2 aClass46_Sub2_31;

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
	private final int anInt5041;

	@OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lclient!sq;)V")
	public Class171(@OriginalArg(0) Class46_Sub2 arg0) {
		if (!arg0.lb) {
			throw new IllegalStateException("");
		}
		this.aClass46_Sub2_31 = arg0;
		this.aClass46_Sub2_31.anOpengl1.glGenFramebuffersEXT(1, Static264.anIntArray460, 0);
		this.anInt5041 = Static264.anIntArray460[0];
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!rj;I)V")
	public void method4521(@OriginalArg(1) Class8_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method4528(arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
	public void method4522(@OriginalArg(0) int arg0) {
		if (this.anInterface6Array1[arg0] != null) {
			this.anInterface6Array1[arg0].method4731();
		}
		this.anInt5042 &= ~(0x1 << arg0);
		this.anInterface6Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!ql", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass46_Sub2_31.method5210(this.anInt5041);
		super.finalize();
	}

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "()V")
	@Override
	public void method5193() {
		this.aClass46_Sub2_31.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "()V")
	@Override
	public void method5192() {
		this.aClass46_Sub2_31.anOpengl1.glBindFramebufferEXT(36160, this.anInt5041);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!jn;)V")
	public void method4523(@OriginalArg(1) Class108 arg0) {
		if (this.aClass46_Sub2_31.method5220() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt5042 & 0xFFFFFEFF) == 0) {
			this.anInt5040 = arg0.anInt3253;
			this.anInt5043 = arg0.anInt3250;
		} else if (arg0.anInt3253 != this.anInt5040 || arg0.anInt3250 != this.anInt5043) {
			throw new RuntimeException();
		}
		arg0.method3013(Static264.anIntArray461[8]);
		this.anInterface6Array1[8] = arg0;
		this.anInt5042 |= 0x100;
	}

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "(I)V")
	public void method4524(@OriginalArg(0) int arg0) {
		if (this.aClass46_Sub2_31.method5220() != this) {
			throw new RuntimeException();
		}
		this.aClass46_Sub2_31.anOpengl1.glDrawBuffer(Static264.anIntArray461[arg0]);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!ai;I)V")
	private void method4525(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		if (this.aClass46_Sub2_31.method5220() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt5042 & ~local12) == 0) {
			this.anInt5040 = arg1.anInt3574;
			this.anInt5043 = arg1.anInt3575;
		} else if (arg1.anInt3574 != this.anInt5040 || arg1.anInt3575 != this.anInt5043) {
			throw new RuntimeException();
		}
		arg1.method3372(Static264.anIntArray461[arg0]);
		this.anInterface6Array1[arg0] = arg1;
		this.anInt5042 |= local12;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "()I")
	@Override
	public int method5191() {
		return this.anInt5043;
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "()Z")
	public boolean method4526() {
		@Pc(5) int local5 = this.aClass46_Sub2_31.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!ai;)V")
	public void method4527(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub1 arg1) {
		this.method4525(arg0, arg1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILclient!rj;II)V")
	private void method4528(@OriginalArg(1) Class8_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass46_Sub2_31.method5220() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt5042 & 0xFFFFFFFE) == 0) {
			this.anInt5040 = arg0.anInt5321;
			this.anInt5043 = arg0.anInt5321;
		} else if (arg0.anInt5321 != this.anInt5040 || arg0.anInt5321 != this.anInt5043) {
			throw new RuntimeException();
		}
		arg0.method4745(Static264.anIntArray461[0], arg1);
		this.anInterface6Array1[0] = arg0;
		this.anInt5042 |= 0x1;
	}
}
