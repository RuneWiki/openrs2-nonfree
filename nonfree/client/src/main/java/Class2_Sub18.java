import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class2_Sub18 extends Class2 {

	@OriginalMember(owner = "client!oc", name = "D", descriptor = "I")
	public int anInt3236;

	@OriginalMember(owner = "client!oc", name = "u", descriptor = "I")
	public int anInt3232;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(II)V")
	public Class2_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3236 = arg1;
		this.anInt3232 = arg0;
	}
}
