import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public final class Class2_Sub1_Sub4_Sub4 extends Class2_Sub1_Sub4 {

	@OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
	public int anInt1149;

	@OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
	public int anInt1154;

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(Z)Lclient!hb;")
	@Override
	protected Class2_Sub1_Sub4_Sub5 method1264() {
		return Static7.method178(this.anInt1149).method1546(this.anInt1154, true);
	}
}
