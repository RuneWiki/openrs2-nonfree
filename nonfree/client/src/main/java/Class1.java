import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public int anInt1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public int anInt3;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "I")
	public int anInt4;

	@OriginalMember(owner = "client!a", name = "h", descriptor = "I")
	public int anInt6;

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!jd;")
	public Class2_Sub2_Sub12 aClass2_Sub2_Sub12_1;

	@OriginalMember(owner = "client!a", name = "m", descriptor = "I")
	public int anInt9;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "I")
	public int anInt2 = 0;

	@OriginalMember(owner = "client!a", name = "y", descriptor = "I")
	public int anInt17 = 0;
}
