import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public final class Class15_Sub15 extends Class15 {

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	private final int anInt7707;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	private final int anInt7701;

	@OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub15(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.anInt7707 = arg0.method8575();
		this.anInt7701 = arg0.method8581(-17416);
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		Static91.method1408(0, this.anInt7707, this.anInt7701);
	}
}
