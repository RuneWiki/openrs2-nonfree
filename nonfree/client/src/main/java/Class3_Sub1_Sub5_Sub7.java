import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public final class Class3_Sub1_Sub5_Sub7 extends Class3_Sub1_Sub5 {

	@OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
	public int anInt4093;

	@OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
	public int anInt4095;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)Lclient!vf;")
	@Override
	protected Class3_Sub1_Sub5_Sub3 method3056() {
		return Static173.method2793(this.anInt4093).method262(null, this.anInt4095, 0);
	}
}
