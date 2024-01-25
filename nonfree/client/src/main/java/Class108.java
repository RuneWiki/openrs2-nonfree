import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fja")
public class Class108 implements Interface13 {

	@OriginalMember(owner = "client!fja", name = "e", descriptor = "Lclient!tf;")
	protected Class17 aClass17_20;

	@OriginalMember(owner = "client!fja", name = "f", descriptor = "Lclient!vn;")
	protected final Class256 aClass256_2;

	@OriginalMember(owner = "client!fja", name = "i", descriptor = "Lclient!bt;")
	private final Class34 aClass34_37;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!bt;Lclient!vn;)V")
	public Class108(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class256 arg1) {
		this.aClass256_2 = arg1;
		this.aClass34_37 = arg0;
	}

	@OriginalMember(owner = "client!fja", name = "b", descriptor = "(I)V")
	@Override
	public final void method8638() {
		this.aClass17_20 = Static203.method3069(this.aClass256_2.anInt5984, this.aClass34_37);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8637() {
		@Pc(28) int local28 = this.aClass256_2.aClass291_8.method6524(Static606.anInt9314, this.aClass17_20.method5256()) + this.aClass256_2.anInt5986;
		@Pc(42) int local42 = this.aClass256_2.aClass125_12.method2842(this.aClass17_20.method5251(), Static353.anInt5368) + this.aClass256_2.anInt5985;
		this.aClass17_20.method5246(local28, local42);
	}

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "(I)Z")
	@Override
	public final boolean method8636() {
		return this.aClass34_37.method1235(this.aClass256_2.anInt5984);
	}
}
