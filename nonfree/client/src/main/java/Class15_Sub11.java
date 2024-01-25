import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class15_Sub11 extends Class15 {

	@OriginalMember(owner = "client!oi", name = "j", descriptor = "I")
	private final int anInt7439;

	@OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
	private final int anInt7441;

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub11(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7439 = arg0.method8575();
		this.anInt7441 = arg0.method8575();
	}

	@OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static199.aClass61Array1[this.anInt7439].method1238().method2054(true, this.anInt7441);
	}
}
