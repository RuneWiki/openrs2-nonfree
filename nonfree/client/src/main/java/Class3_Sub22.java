import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public final class Class3_Sub22 extends Class3 {

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
	public final int anInt3545;

	@OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
	public int anInt3542;

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(II)V")
	public Class3_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3545 = arg0;
		this.anInt3542 = arg1;
	}
}
