import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public final class Class3_Sub47 extends Class3 {

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
	public final int anInt8392;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
	public final int anInt8393;

	@OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(II)V")
	public Class3_Sub47(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8392 = arg0;
		this.anInt8393 = arg1;
	}
}
