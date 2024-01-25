import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public final class Class1_Sub39 extends Class1 {

	@OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
	public final int anInt5803;

	@OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
	public int anInt5805;

	@OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5803 = arg0;
		this.anInt5805 = arg1;
	}
}
