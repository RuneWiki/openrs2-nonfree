import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
	public final int anInt481;

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "I")
	public final int anInt478;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(II)V")
	public Class4_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt481 = arg0;
		this.anInt478 = arg1;
	}
}
