import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
	public int anInt60;
}
