import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public final class Class211 implements Interface2 {

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
	private int anInt6323;

	@OriginalMember(owner = "client!vi", name = "g", descriptor = "I")
	private int anInt6325;

	@OriginalMember(owner = "client!vi", name = "h", descriptor = "I")
	private int anInt6326;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "[Lclient!qg;")
	private final Interface5[] anInterface5Array1 = new Interface5[9];

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "Lclient!hj;")
	private final Class2_Sub1 aClass2_Sub1_38;

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
	private final int anInt6324;

	@OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lclient!hj;)V")
	public Class211(@OriginalArg(0) Class2_Sub1 arg0) {
		if (!arg0.aBoolean217) {
			throw new IllegalStateException("");
		}
		this.aClass2_Sub1_38 = arg0;
		this.aClass2_Sub1_38.anOpengl1.glGenFramebuffersEXT(1, Static330.anIntArray787, 0);
		this.anInt6324 = Static330.anIntArray787[0];
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "()Z")
	public boolean method5530() {
		@Pc(5) int local5 = this.aClass2_Sub1_38.anOpengl1.glCheckFramebufferStatusEXT(36160);
		return local5 == 36053;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()I")
	@Override
	public int method5528() {
		return this.anInt6323;
	}

	@OriginalMember(owner = "client!vi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass2_Sub1_38.method2348(this.anInt6324);
		super.finalize();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!rq;)V")
	public void method5531(@OriginalArg(0) int arg0, @OriginalArg(1) Class18_Sub1 arg1) {
		this.method5535(arg0, arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method5532(@OriginalArg(0) int arg0) {
		if (this.anInterface5Array1[arg0] != null) {
			this.anInterface5Array1[arg0].method5354();
		}
		this.anInt6326 &= ~(0x1 << arg0);
		this.anInterface5Array1[arg0] = null;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!ih;I)V")
	public void method5533(@OriginalArg(1) Class18_Sub2 arg0, @OriginalArg(2) int arg1) {
		this.method5534(arg0, arg1);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!ih;II)V")
	private void method5534(@OriginalArg(1) Class18_Sub2 arg0, @OriginalArg(3) int arg1) {
		if (this.aClass2_Sub1_38.method2382() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6326 & 0xFFFFFFFE) == 0) {
			this.anInt6325 = arg0.anInt2706;
			this.anInt6323 = arg0.anInt2706;
		} else if (arg0.anInt2706 != this.anInt6325 || arg0.anInt2706 != this.anInt6323) {
			throw new RuntimeException();
		}
		arg0.method2629(Static330.anIntArray786[0], arg1);
		this.anInterface5Array1[0] = arg0;
		this.anInt6326 |= 0x1;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!rq;I)V")
	private void method5535(@OriginalArg(0) int arg0, @OriginalArg(1) Class18_Sub1 arg1) {
		if (this.aClass2_Sub1_38.method2382() != this) {
			throw new RuntimeException();
		}
		@Pc(12) int local12 = 0x1 << arg0;
		if ((this.anInt6326 & ~local12) == 0) {
			this.anInt6325 = arg1.anInt439;
			this.anInt6323 = arg1.anInt437;
		} else if (arg1.anInt439 != this.anInt6325 || arg1.anInt437 != this.anInt6323) {
			throw new RuntimeException();
		}
		arg1.method503(Static330.anIntArray786[arg0]);
		this.anInterface5Array1[arg0] = arg1;
		this.anInt6326 |= local12;
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "()V")
	@Override
	public void method5529() {
		this.aClass2_Sub1_38.anOpengl1.glBindFramebufferEXT(36160, 0);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()V")
	@Override
	public void method5527() {
		this.aClass2_Sub1_38.anOpengl1.glBindFramebufferEXT(36160, this.anInt6324);
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public void method5536(@OriginalArg(0) int arg0) {
		if (this.aClass2_Sub1_38.method2382() != this) {
			throw new RuntimeException();
		}
		this.aClass2_Sub1_38.anOpengl1.glDrawBuffer(Static330.anIntArray786[arg0]);
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILclient!um;)V")
	public void method5537(@OriginalArg(1) Class206 arg0) {
		if (this.aClass2_Sub1_38.method2382() != this) {
			throw new RuntimeException();
		}
		if ((this.anInt6326 & 0xFFFFFEFF) == 0) {
			this.anInt6325 = arg0.anInt6117;
			this.anInt6323 = arg0.anInt6115;
		} else if (arg0.anInt6117 != this.anInt6325 || arg0.anInt6115 != this.anInt6323) {
			throw new RuntimeException();
		}
		arg0.method5355(Static330.anIntArray786[8]);
		this.anInterface5Array1[8] = arg0;
		this.anInt6326 |= 0x100;
	}
}
