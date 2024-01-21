import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public final class Class3_Sub1_Sub5_Sub4 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!gf", name = "Kb", descriptor = "I")
	public int anInt1243;

	@OriginalMember(owner = "client!gf", name = "Lb", descriptor = "I")
	public int anInt1244;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(Z)Lclient!oa;")
	@Override
	public Class3_Sub1_Sub5_Sub7 method1874() {
		return Static117.method2099(this.anInt1244).method1125(this.anInt1243);
	}
}
