import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public final class Class5_Sub27 extends Class5 {

	@OriginalMember(owner = "client!mn", name = "l", descriptor = "I")
	public int anInt4204;

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "I")
	public final int anInt4203;

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "(II)V")
	public Class5_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4204 = arg1;
		this.anInt4203 = arg0;
	}
}
