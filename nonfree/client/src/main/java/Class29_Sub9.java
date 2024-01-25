import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class29_Sub9 extends Class29 {

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	private final int anInt3890;

	@OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
	private final int anInt3892;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub9(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt3890 = arg0.method2028(-14795);
		this.anInt3892 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static470.aClass7Array1[this.anInt3890].method249().method7495(this.anInt3892, true);
	}
}
