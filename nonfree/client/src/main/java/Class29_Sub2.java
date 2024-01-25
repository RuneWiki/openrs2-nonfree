import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class29_Sub2 extends Class29 {

	@OriginalMember(owner = "client!be", name = "l", descriptor = "I")
	private final int anInt1216;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub2(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt1216 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static470.aClass7Array1[this.anInt1216].method244();
	}
}
