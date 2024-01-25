import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public final class Class29_Sub18 extends Class29 {

	@OriginalMember(owner = "client!sp", name = "t", descriptor = "I")
	private final int anInt9099;

	@OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
	private final int anInt9103;

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
	private final int anInt9106;

	@OriginalMember(owner = "client!sp", name = "j", descriptor = "I")
	private final int anInt9104;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "I")
	private final int anInt9098;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
	private final int anInt9100;

	@OriginalMember(owner = "client!sp", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class29_Sub18(@OriginalArg(0) Class3_Sub2 arg0) {
		super(arg0);
		this.anInt9099 = arg0.method2028(-14795);
		this.anInt9103 = arg0.method2028(-14795);
		this.anInt9106 = arg0.method2028(-14795);
		this.anInt9104 = arg0.method2028(-14795);
		this.anInt9098 = arg0.method2028(-14795);
		this.anInt9100 = arg0.method2028(-14795);
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	@Override
	public void method9495() {
		Static585.aClass11Array1[this.anInt9099].method501(0);
		Static585.aClass11Array1[this.anInt9103].method501(1);
		Static686.anInt10661 = this.anInt9104;
		Static93.anInt2108 = 0;
		Static67.anInt1614 = 0;
		Static212.anInt3494 = this.anInt9100;
		Static675.anInt10593 = this.anInt9098;
		Static430.anInt6558 = this.anInt9106;
		Static565.anInt8603 = 1;
		Static262.anInt4081 = 3;
		Static26.method929();
		Static521.aBoolean549 = true;
	}
}
