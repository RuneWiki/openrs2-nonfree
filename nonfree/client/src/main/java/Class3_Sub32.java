import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public final class Class3_Sub32 extends Class3 {

	@OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
	public final int anInt7689;

	@OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
	public int anInt7685;

	@OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(II)V")
	public Class3_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt7689 = arg0;
		this.anInt7685 = arg1;
	}
}
