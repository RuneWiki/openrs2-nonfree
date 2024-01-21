import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public final class Class1_Sub16 extends Class1 {

	@OriginalMember(owner = "client!oc", name = "v", descriptor = "I")
	public final int anInt3237;

	@OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
	public final int anInt3232;

	@OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(II)V")
	public Class1_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3237 = arg1;
		this.anInt3232 = arg0;
	}
}
