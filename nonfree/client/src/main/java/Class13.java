import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public final class Class13 {

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
	public int anInt700;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
	public int anInt702;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
	public int anInt703;

	@OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "()V")
	public Class13() {
	}

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lclient!cf;)V")
	public Class13(@OriginalArg(0) Class13 arg0) {
		this.anInt703 = arg0.anInt703;
		this.anInt702 = arg0.anInt702;
		this.anInt700 = arg0.anInt700;
		this.anInt705 = arg0.anInt705;
	}
}
