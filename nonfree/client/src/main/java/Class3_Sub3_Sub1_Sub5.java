import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public final class Class3_Sub3_Sub1_Sub5 extends Class3_Sub3_Sub1 {

	@OriginalMember(owner = "client!la", name = "sb", descriptor = "I")
	public int anInt1496;

	@OriginalMember(owner = "client!la", name = "Db", descriptor = "I")
	public int anInt1505;

	@OriginalMember(owner = "client!la", name = "c", descriptor = "(B)Lclient!de;")
	@Override
	protected Class3_Sub3_Sub1_Sub1 method1667() {
		return Static37.method696(this.anInt1496).method1264(true, this.anInt1505);
	}
}
