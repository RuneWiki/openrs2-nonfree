import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public final class Class29_Sub8 extends Class29 {

	@OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
	private final int anInt3613;

	@OriginalMember(owner = "client!gq", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub8(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt3613 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static134.aClass401Array1[this.anInt3613].method9461();
	}
}
