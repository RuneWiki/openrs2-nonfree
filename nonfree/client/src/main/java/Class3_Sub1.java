import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
	public final int anInt14;

	@OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
	public final int anInt13;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt14 = arg1;
		this.anInt13 = arg0;
	}
}
