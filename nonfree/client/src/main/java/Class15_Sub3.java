import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public abstract class Class15_Sub3 extends Class15 {

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "I")
	protected final int anInt6023;

	@OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
	protected final int anInt6020;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
	protected final int anInt6019;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub3(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt6023 = arg0.method8575();
		this.anInt6020 = arg0.method8575();
		this.anInt6019 = arg0.method8581(-17416);
	}
}
