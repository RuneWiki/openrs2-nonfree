import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class10_Sub27 extends Class10 {

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "I")
	public final int anInt4313;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public final int anInt4310;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(II)V")
	public Class10_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4313 = arg1;
		this.anInt4310 = arg0;
	}
}
