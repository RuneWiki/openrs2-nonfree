import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class3_Sub23 extends Class3 {

	@OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
	public final int anInt3619;

	@OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
	public final int anInt3621;

	@OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(II)V")
	public Class3_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3619 = arg0;
		this.anInt3621 = arg1;
	}
}
