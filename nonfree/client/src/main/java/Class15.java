import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class Class15 {

	@OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
	public final int anInt10723;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class15(@OriginalArg(0) Class2_Sub20 arg0) {
		this.anInt10723 = arg0.method8575();
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)Z")
	public boolean method9377() {
		return true;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
	public abstract void method9378();
}
