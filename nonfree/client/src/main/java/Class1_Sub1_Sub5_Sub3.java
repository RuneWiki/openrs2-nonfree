import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public final class Class1_Sub1_Sub5_Sub3 extends Class1_Sub1_Sub5 {

	@OriginalMember(owner = "client!f", name = "bb", descriptor = "I")
	public int anInt1370;

	@OriginalMember(owner = "client!f", name = "qb", descriptor = "I")
	public int anInt1374;

	@OriginalMember(owner = "client!f", name = "d", descriptor = "(Z)Lclient!rg;")
	@Override
	public Class1_Sub1_Sub5_Sub4 method2896() {
		return Static101.method2134(this.anInt1374).method49(this.anInt1370);
	}
}
