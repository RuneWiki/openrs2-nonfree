import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public final class Class3_Sub1_Sub4_Sub4 extends Class3_Sub1_Sub4 {

	@OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
	public int anInt1295;

	@OriginalMember(owner = "client!id", name = "kb", descriptor = "I")
	public int anInt1298;

	@OriginalMember(owner = "client!id", name = "e", descriptor = "(I)Lclient!ua;")
	@Override
	public Class3_Sub1_Sub4_Sub7 method1750() {
		return Static2.method38(this.anInt1298).method1103(this.anInt1295);
	}
}
