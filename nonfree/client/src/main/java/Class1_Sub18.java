import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public final class Class1_Sub18 extends Class1 {

	@OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
	public final int anInt4009;

	@OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
	public final int anInt4011;

	@OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(II)V")
	public Class1_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4009 = arg0;
		this.anInt4011 = arg1;
	}
}
