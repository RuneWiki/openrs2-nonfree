import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public final class Class6_Sub2_Sub16 extends Class6_Sub2 {

	@OriginalMember(owner = "client!re", name = "s", descriptor = "I")
	public int anInt5030;

	@OriginalMember(owner = "client!re", name = "v", descriptor = "I")
	public int anInt5033;

	@OriginalMember(owner = "client!re", name = "w", descriptor = "I")
	public int anInt5034;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "I")
	public int anInt5035;

	@OriginalMember(owner = "client!re", name = "z", descriptor = "I")
	public int anInt5037;

	@OriginalMember(owner = "client!re", name = "I", descriptor = "Lclient!bo;")
	public final Class22 aClass22_2;

	@OriginalMember(owner = "client!re", name = "C", descriptor = "Lclient!rs;")
	public final Class179 aClass179_1;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!bo;Lclient!bl;)V")
	public Class6_Sub2_Sub16(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class20_Sub2 arg1) {
		this.aClass22_2 = arg0;
		this.aClass179_1 = Static152.method3080(arg0.anInt560);
		this.method4599();
	}

	@OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
	public void method4599() {
		this.anInt5030 = this.aClass22_2.anInt563;
		this.anInt5037 = this.aClass22_2.anInt556;
		this.anInt5033 = this.aClass22_2.anInt566;
		if (this.aClass22_2.aClass72_1 != null) {
			this.aClass22_2.aClass72_1.method4075(this.aClass179_1.anInt5342, this.aClass179_1.anInt5335, this.aClass179_1.anInt5336, Static206.anIntArray446);
		}
		this.anInt5035 = Static206.anIntArray446[2];
		this.anInt5034 = Static206.anIntArray446[0];
	}
}
