import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public final class Class1_Sub3_Sub4_Sub3 extends Class1_Sub3_Sub4 {

	@OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
	public int anInt641;

	@OriginalMember(owner = "client!ce", name = "qb", descriptor = "I")
	public int anInt643;

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)Lclient!eb;")
	@Override
	public Class1_Sub3_Sub4_Sub4 method2148() {
		return Static56.method1022(this.anInt643).method2021(this.anInt641);
	}
}
