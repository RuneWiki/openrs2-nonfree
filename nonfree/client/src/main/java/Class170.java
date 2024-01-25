import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public final class Class170 {

	@OriginalMember(owner = "client!k", name = "a", descriptor = "I")
	public int anInt4646;

	@OriginalMember(owner = "client!k", name = "c", descriptor = "I")
	public int anInt4647;

	@OriginalMember(owner = "client!k", name = "d", descriptor = "I")
	public int anInt4648;

	@OriginalMember(owner = "client!k", name = "e", descriptor = "I")
	public int anInt4649;

	@OriginalMember(owner = "client!k", name = "f", descriptor = "I")
	public int anInt4650;

	@OriginalMember(owner = "client!k", name = "g", descriptor = "I")
	public int anInt4651;

	@OriginalMember(owner = "client!k", name = "h", descriptor = "I")
	public int anInt4652;

	@OriginalMember(owner = "client!k", name = "k", descriptor = "I")
	public int anInt4655;

	@OriginalMember(owner = "client!k", name = "n", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!k", name = "p", descriptor = "I")
	public int anInt4660;

	@OriginalMember(owner = "client!k", name = "q", descriptor = "I")
	public int anInt4661;

	@OriginalMember(owner = "client!k", name = "s", descriptor = "I")
	public int anInt4663;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!k;I)Z")
	public boolean method4042(@OriginalArg(0) Class170 arg0) {
		return arg0.anInt4650 == this.anInt4650 && this.anInt4658 == arg0.anInt4658 && arg0.anInt4660 == this.anInt4660;
	}
}
