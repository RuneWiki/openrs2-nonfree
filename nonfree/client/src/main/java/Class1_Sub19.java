import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!l", name = "t", descriptor = "I")
	public int anInt3175;

	@OriginalMember(owner = "client!l", name = "p", descriptor = "I")
	public int anInt3172;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(II)V")
	public Class1_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3175 = arg1;
		this.anInt3172 = arg0;
	}
}
