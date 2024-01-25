import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public final class Class29_Sub23 extends Class29 {

	@OriginalMember(owner = "client!wl", name = "l", descriptor = "Ljava/lang/String;")
	private final String aString132;

	@OriginalMember(owner = "client!wl", name = "p", descriptor = "I")
	private final int anInt11154;

	@OriginalMember(owner = "client!wl", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub23(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.aString132 = arg0.method2014();
		this.anInt11154 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!wl", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		if (Static238.anInt3790 != -1) {
			Static540.method7163(Static238.anInt3790, this.aString132, this.anInt11154);
		}
	}
}
