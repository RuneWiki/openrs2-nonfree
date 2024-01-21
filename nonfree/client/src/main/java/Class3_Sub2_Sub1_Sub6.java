import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public final class Class3_Sub2_Sub1_Sub6 extends Class3_Sub2_Sub1 {

	@OriginalMember(owner = "client!rc", name = "X", descriptor = "I")
	public int anInt3478;

	@OriginalMember(owner = "client!rc", name = "db", descriptor = "I")
	public int anInt3483;

	@OriginalMember(owner = "client!rc", name = "e", descriptor = "(I)Lclient!d;")
	@Override
	protected Class3_Sub2_Sub1_Sub1 method2761() {
		return Static76.method1736(this.anInt3483).method1453(null, 0, this.anInt3478);
	}
}
