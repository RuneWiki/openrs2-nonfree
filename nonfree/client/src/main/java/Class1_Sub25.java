import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "I")
	public int anInt3995;

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public int anInt3993;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3995 = arg1;
		this.anInt3993 = arg0;
	}
}
