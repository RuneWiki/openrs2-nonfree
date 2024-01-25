import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "I")
	public final int anInt3167;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "I")
	public int anInt3163;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(II)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3167 = arg0;
		this.anInt3163 = arg1;
	}
}
