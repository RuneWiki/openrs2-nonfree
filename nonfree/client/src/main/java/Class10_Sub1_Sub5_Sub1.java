import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class10_Sub1_Sub5_Sub1 extends Class10_Sub1_Sub5 {

	@OriginalMember(owner = "client!dd", name = "db", descriptor = "I")
	public int anInt686;

	@OriginalMember(owner = "client!dd", name = "ib", descriptor = "I")
	public int anInt689;

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Lclient!rb;")
	@Override
	protected Class10_Sub1_Sub5_Sub4 method1663() {
		return Static94.method1491(this.anInt689).method1578(this.anInt686, true);
	}
}
