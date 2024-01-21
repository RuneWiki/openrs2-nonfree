import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class1_Sub2_Sub3_Sub3 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!kf", name = "kb", descriptor = "I")
	public int anInt1443;

	@OriginalMember(owner = "client!kf", name = "rb", descriptor = "I")
	public int anInt1448;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "(I)Lclient!da;")
	@Override
	public Class1_Sub2_Sub3_Sub2 method1969() {
		return Static33.method736(this.anInt1448).method1594(this.anInt1443);
	}
}
