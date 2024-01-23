import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class3_Sub18 extends Class3 {

	@OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
	public int anInt2766;

	@OriginalMember(owner = "client!kh", name = "t", descriptor = "I")
	public int anInt2769;

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(II)V")
	public Class3_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2766 = arg0;
		this.anInt2769 = arg1;
	}
}
