import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public final class Class15_Sub13 extends Class15 {

	@OriginalMember(owner = "client!oja", name = "l", descriptor = "I")
	private final int anInt7466;

	@OriginalMember(owner = "client!oja", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub13(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7466 = arg0.method8575();
	}

	@OriginalMember(owner = "client!oja", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static199.aClass61Array1[this.anInt7466].method1235();
	}
}
