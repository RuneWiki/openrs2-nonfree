import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aja")
public final class Class15_Sub1 extends Class15 {

	@OriginalMember(owner = "client!aja", name = "j", descriptor = "I")
	private final int anInt264;

	@OriginalMember(owner = "client!aja", name = "h", descriptor = "I")
	private final int anInt260;

	@OriginalMember(owner = "client!aja", name = "i", descriptor = "I")
	private final int anInt263;

	@OriginalMember(owner = "client!aja", name = "k", descriptor = "I")
	private final int anInt265;

	@OriginalMember(owner = "client!aja", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub1(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt264 = arg0.method8575();
		this.anInt260 = arg0.method8581(-17416);
		this.anInt263 = arg0.method8581(-17416);
		this.anInt265 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static485.method6932(this.anInt263, this.anInt265, this.anInt260, 0, this.anInt264);
	}
}
