import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public final class Class298 {

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "I")
	public int anInt8436;

	@OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
	public int anInt8437;

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
	public int anInt8438;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "()V")
	public Class298() {
	}

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class298(@OriginalArg(0) Class298 arg0) {
		this.anInt8437 = arg0.anInt8437;
		this.anInt8438 = arg0.anInt8438;
		this.anInt8436 = arg0.anInt8436;
	}
}
