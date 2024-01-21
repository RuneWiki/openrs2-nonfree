import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public final class Class8_Sub1_Sub1_Sub2 extends Class8_Sub1_Sub1 {

	@OriginalMember(owner = "client!c", name = "pb", descriptor = "I")
	public int anInt348;

	@OriginalMember(owner = "client!c", name = "rb", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Lclient!nb;")
	@Override
	public Class8_Sub1_Sub1_Sub6 method1955() {
		return Static7.method49(this.anInt349).method1072(this.anInt348);
	}
}
