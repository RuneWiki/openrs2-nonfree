import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class2_Sub1_Sub3_Sub4 extends Class2_Sub1_Sub3 {

	@OriginalMember(owner = "client!ff", name = "O", descriptor = "I")
	public int anInt1183;

	@OriginalMember(owner = "client!ff", name = "W", descriptor = "I")
	public int anInt1187;

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Lclient!bh;")
	@Override
	public Class2_Sub1_Sub3_Sub3 method2544() {
		return Static78.method577(this.anInt1187).method1090(this.anInt1183);
	}
}
