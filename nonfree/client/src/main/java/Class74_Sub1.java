import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class74_Sub1 extends Class74 {

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "[I")
	public final int[] anIntArray205;

	@OriginalMember(owner = "client!fk", name = "f", descriptor = "[I")
	public final int[] anIntArray204;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(II[I[I)V")
	public Class74_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray205 = arg2;
		this.anIntArray204 = arg3;
	}
}
