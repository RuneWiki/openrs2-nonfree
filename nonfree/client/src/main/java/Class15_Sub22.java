import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rca")
public final class Class15_Sub22 extends Class15 {

	@OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
	private final int anInt8553;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "I")
	private final int anInt8549;

	@OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
	private final int anInt8551;

	@OriginalMember(owner = "client!rca", name = "k", descriptor = "I")
	private final int anInt8548;

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
	private final int anInt8550;

	@OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub22(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt8553 = arg0.method8575();
		@Pc(11) int local11 = arg0.method8555(-9372);
		this.anInt8549 = local11 & 0xFFFF;
		this.anInt8551 = local11 >>> 16;
		this.anInt8548 = arg0.method8581(-17416);
		this.anInt8550 = arg0.method8560();
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static199.aClass61Array1[this.anInt8553].method1241(this.anInt8548, this.anInt8549, this.anInt8551, this.anInt8550);
	}
}
