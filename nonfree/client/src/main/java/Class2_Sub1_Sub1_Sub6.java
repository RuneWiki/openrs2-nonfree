import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class2_Sub1_Sub1_Sub6 extends Class2_Sub1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!sf", name = "rb", descriptor = "I")
	public int anInt2468;

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lclient!wb;")
	@Override
	public Class2_Sub1_Sub1_Sub7 method1996() {
		return Static4.method872(this.anInt2468).method1537(this.anInt2464);
	}
}
