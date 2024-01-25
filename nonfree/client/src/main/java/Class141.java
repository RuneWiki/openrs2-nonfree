import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!la")
public final class Class141 implements Interface2 {

	@OriginalMember(owner = "client!la", name = "c", descriptor = "I")
	private int anInt3528;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	private int anInt3529;

	@OriginalMember(owner = "client!la", name = "g", descriptor = "I")
	private int anInt3530;

	@OriginalMember(owner = "client!la", name = "f", descriptor = "[Lclient!aq;")
	private final Interface1[] anInterface1Array1 = new Interface1[9];

	@OriginalMember(owner = "client!la", name = "h", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_24;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "I")
	private final int anInt3527;

	@OriginalMember(owner = "client!la", name = "<init>", descriptor = "(Lclient!mi;)V")
	public Class141(@OriginalArg(0) Class155_Sub1 arg0) {
		if (!arg0.aBoolean314) {
			throw new IllegalStateException("");
		}
		this.aClass155_Sub1_24 = arg0;
		this.aClass155_Sub1_24.anOpengl1.glGenFramebuffersEXT(1, Static195.anIntArray383, 0);
		this.anInt3527 = Static195.anIntArray383[0];
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "()V")
	@Override
	public void method3561() {
		this.aClass155_Sub1_24.anOpengl1.glBindFramebufferEXT(36160, this.anInt3527);
	}

	@OriginalMember(owner = "client!la", name = "c", descriptor = "()V")
	@Override
	public void method3563() {
		this.aClass155_Sub1_24.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "()I")
	@Override
	public int method3562() {
		return this.anInt3530;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!kh;I)V")
	private void method3087(@OriginalArg(0) int arg0, @OriginalArg(1) Class30_Sub3 arg1) {
		if (this.aClass155_Sub1_24.method3629() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt3529 & ~local12) == 0) {
			this.anInt3528 = arg1.anInt5158;
			this.anInt3530 = arg1.anInt5157;
		} else if (arg1.anInt5158 != this.anInt3528 || arg1.anInt5157 != this.anInt3530) {
			throw new RuntimeException();
		}
		arg1.method4616(Static195.anIntArray384[arg0]);
		this.anInterface1Array1[arg0] = arg1;
		this.anInt3529 |= local12;
	}

	@OriginalMember(owner = "client!la", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass155_Sub1_24.method3599(this.anInt3527);
		super.finalize();
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!kh;)V")
	public void method3088(@OriginalArg(0) int arg0, @OriginalArg(1) Class30_Sub3 arg1) {
		this.method3087(arg0, arg1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
	public void method3089(@OriginalArg(0) int arg0) {
		if (this.aClass155_Sub1_24.method3629() != this) {
			throw new RuntimeException();
		}
		this.aClass155_Sub1_24.anOpengl1.glDrawBuffer(Static195.anIntArray384[arg0]);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!nq;II)V")
	private void method3090(@OriginalArg(1) Class30_Sub4 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass155_Sub1_24.method3629() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3529 & 0xFFFFFFFE) == 0) {
			this.anInt3528 = arg0.anInt4237;
			this.anInt3530 = arg0.anInt4237;
		} else if (arg0.anInt4237 != this.anInt3528 || arg0.anInt4237 != this.anInt3530) {
			throw new RuntimeException();
		}
		arg0.method3951(Static195.anIntArray384[0], arg1);
		this.anInterface1Array1[0] = arg0;
		this.anInt3529 |= 0x1;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!nq;I)V")
	public void method3091(@OriginalArg(1) Class30_Sub4 arg0, @OriginalArg(2) int arg1) {
		this.method3090(arg0, arg1);
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ILclient!hb;)V")
	public void method3092(@OriginalArg(1) Class99 arg0) {
		if (this.aClass155_Sub1_24.method3629() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3529 & 0xFFFFFEFF) == 0) {
			this.anInt3528 = arg0.anInt2421;
			this.anInt3530 = arg0.anInt2420;
		} else if (arg0.anInt2421 != this.anInt3528 || arg0.anInt2420 != this.anInt3530) {
			throw new RuntimeException();
		}
		arg0.method2047(Static195.anIntArray384[8]);
		this.anInterface1Array1[8] = arg0;
		this.anInt3529 |= 0x100;
	}

	@OriginalMember(owner = "client!la", name = "d", descriptor = "()Z")
	public boolean method3093() {
		@Pc(5) int local5 = this.aClass155_Sub1_24.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!la", name = "b", descriptor = "(I)V")
	public void method3094(@OriginalArg(0) int arg0) {
		if (this.anInterface1Array1[arg0] != null) {
			this.anInterface1Array1[arg0].method4599();
		}
		this.anInt3529 &= ~(0x1 << arg0);
		this.anInterface1Array1[arg0] = null;
	}
}
