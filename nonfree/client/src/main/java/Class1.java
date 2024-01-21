import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!a", name = "e", descriptor = "I")
	public int anInt2;

	@OriginalMember(owner = "client!a", name = "g", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!h;")
	public Class4_Sub3_Sub1 aClass4_Sub3_Sub1_1;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	public int anInt8;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "Lclient!h;")
	public Class4_Sub3_Sub1 aClass4_Sub3_Sub1_2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public int anInt3 = 0;

	@OriginalMember(owner = "client!a", name = "r", descriptor = "I")
	public int anInt12 = 0;
}
