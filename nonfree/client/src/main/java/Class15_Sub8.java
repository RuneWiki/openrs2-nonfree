import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public final class Class15_Sub8 extends Class15 {

	@OriginalMember(owner = "client!gea", name = "m", descriptor = "Ljava/lang/String;")
	private final String aString38;

	@OriginalMember(owner = "client!gea", name = "l", descriptor = "I")
	private final int anInt3260;

	@OriginalMember(owner = "client!gea", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15_Sub8(@OriginalArg(0) Class2_Sub20 arg0) {
		super(arg0);
		this.aString38 = arg0.method8553();
		this.anInt3260 = arg0.method8575();
	}

	@OriginalMember(owner = "client!gea", name = "a", descriptor = "(B)V")
	@Override
	public void method9378() {
		if (Static640.anInt9835 != -1) {
			Static484.method6911(Static640.anInt9835, this.aString38, this.anInt3260);
		}
	}
}
