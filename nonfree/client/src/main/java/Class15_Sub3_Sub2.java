import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lr")
public final class Class15_Sub3_Sub2 extends Class15_Sub3 {

	@OriginalMember(owner = "client!lr", name = "u", descriptor = "I")
	private final int anInt6029;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "I")
	private final int anInt6027;

	@OriginalMember(owner = "client!lr", name = "s", descriptor = "I")
	private final int anInt6028;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub3_Sub2(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt6029 = arg0.method8575();
		this.anInt6027 = arg0.method8581(-17416);
		this.anInt6028 = arg0.method8575();
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static199.aClass61Array1[this.anInt6029].method1238().method2047(false, super.anInt6019 << 16, super.anInt6023, super.anInt6020, this.anInt6027, this.anInt6028);
	}
}
