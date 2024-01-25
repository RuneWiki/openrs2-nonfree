import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
	public final int anInt3178;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public final int anInt3177;

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3178 = arg0;
		this.anInt3177 = arg1;
	}
}
