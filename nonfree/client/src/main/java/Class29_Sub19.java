import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class29_Sub19 extends Class29 {

	@OriginalMember(owner = "client!ub", name = "o", descriptor = "I")
	private final int anInt9926;

	@OriginalMember(owner = "client!ub", name = "n", descriptor = "I")
	private final int anInt9922;

	@OriginalMember(owner = "client!ub", name = "w", descriptor = "I")
	private final int anInt9930;

	@OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
	private final int anInt9928;

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	private final int anInt9927;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub19(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt9926 = arg0.method2028(-14795);
		this.anInt9922 = arg0.method2028(-14795);
		this.anInt9930 = arg0.method2028(-14795);
		this.anInt9928 = arg0.method2028(-14795);
		this.anInt9927 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static727.method9602(100, this.anInt9930, this.anInt9922, this.anInt9926, false, 100);
		Static143.method2427(this.anInt9927, this.anInt9928);
		Static521.aBoolean549 = true;
	}
}
