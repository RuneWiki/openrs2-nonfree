import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class10 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public int anInt445;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public int anInt446;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "I")
	public int anInt447;

	@OriginalMember(owner = "client!be", name = "m", descriptor = "I")
	public int anInt448;

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
	public Class10() {
	}

	@OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lclient!be;)V")
	public Class10(@OriginalArg(0) Class10 arg0) {
		this.anInt447 = arg0.anInt447;
		this.anInt445 = arg0.anInt445;
		this.anInt446 = arg0.anInt446;
		this.anInt448 = arg0.anInt448;
	}
}
