import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class6_Sub3 extends Class6 {

	@OriginalMember(owner = "client!ai", name = "l", descriptor = "I")
	public final int anInt439;

	@OriginalMember(owner = "client!ai", name = "n", descriptor = "I")
	public int anInt441;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
	public Class6_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt439 = arg0;
		this.anInt441 = arg1;
	}
}
