import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mg")
public final class Class128 implements Interface6 {

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
	private int anInt3880;

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
	private int anInt3882;

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "[Lclient!rq;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "Lclient!ao;")
	private final Class4_Sub1 aClass4_Sub1_21;

	@OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
	private final int anInt3883;

	@OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lclient!ao;)V")
	public Class128(@OriginalArg(0) Class4_Sub1 arg0) {
		if (!arg0.aBoolean45) {
			throw new IllegalStateException("");
		}
		this.aClass4_Sub1_21 = arg0;
		this.aClass4_Sub1_21.anOpengl1.glGenFramebuffersEXT(1, Static199.anIntArray305, 0);
		this.anInt3883 = Static199.anIntArray305[0];
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "()V")
	@Override
	public void method3558() {
		this.aClass4_Sub1_21.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!rj;)V")
	public void method3561(@OriginalArg(0) int arg0, @OriginalArg(1) Class124_Sub2 arg1) {
		this.method3562(arg0, arg1);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!rj;I)V")
	private void method3562(@OriginalArg(0) int arg0, @OriginalArg(1) Class124_Sub2 arg1) {
		if (this.aClass4_Sub1_21.method569() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt3881 & ~local12) == 0) {
			this.anInt3880 = arg1.anInt5593;
			this.anInt3882 = arg1.anInt5592;
		} else if (arg1.anInt5593 != this.anInt3880 || arg1.anInt5592 != this.anInt3882) {
			throw new RuntimeException();
		}
		arg1.method4991(Static199.anIntArray306[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt3881 |= local12;
	}

	@OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass4_Sub1_21.method544(this.anInt3883);
		super.finalize();
	}

	@OriginalMember(owner = "client!mg", name = "d", descriptor = "()Z")
	public boolean method3563() {
		@Pc(5) int local5 = this.aClass4_Sub1_21.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!vk;II)V")
	private void method3564(@OriginalArg(1) Class124_Sub3 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass4_Sub1_21.method569() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3881 & 0xFFFFFFFE) == 0) {
			this.anInt3880 = arg0.anInt6710;
			this.anInt3882 = arg0.anInt6710;
		} else if (arg0.anInt6710 != this.anInt3880 || arg0.anInt6710 != this.anInt3882) {
			throw new RuntimeException();
		}
		arg0.method5823(Static199.anIntArray306[0], arg1);
		this.anInterface5Array1[0] = arg0;
		this.anInt3881 |= 0x1;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
	public void method3565(@OriginalArg(0) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method5891();
		}
		this.anInt3881 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "()V")
	@Override
	public void method3559() {
		this.aClass4_Sub1_21.anOpengl1.glBindFramebufferEXT(36160, this.anInt3883);
	}

	@OriginalMember(owner = "client!mg", name = "c", descriptor = "()I")
	@Override
	public int method3560() {
		return this.anInt3882;
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!vk;I)V")
	public void method3566(@OriginalArg(1) Class124_Sub3 arg0, @OriginalArg(2) int arg1) {
		this.method3564(arg0, arg1);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!to;)V")
	public void method3567(@OriginalArg(1) Class190 arg0) {
		if (this.aClass4_Sub1_21.method569() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt3881 & 0xFFFFFEFF) == 0) {
			this.anInt3880 = arg0.anInt6231;
			this.anInt3882 = arg0.anInt6230;
		} else if (arg0.anInt6231 != this.anInt3880 || arg0.anInt6230 != this.anInt3882) {
			throw new RuntimeException();
		}
		arg0.method5422(Static199.anIntArray306[8]);
		this.anInterface5Array1[8] = arg0;
		this.anInt3881 |= 0x100;
	}

	@OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
	public void method3568(@OriginalArg(0) int arg0) {
		if (this.aClass4_Sub1_21.method569() != this) {
			throw new RuntimeException();
		}
		this.aClass4_Sub1_21.anOpengl1.glDrawBuffer(Static199.anIntArray306[arg0]);
	}
}
