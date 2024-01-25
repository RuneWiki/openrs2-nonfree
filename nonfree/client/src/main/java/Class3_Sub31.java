import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public final int anInt4892;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public final int anInt4894;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(II)V")
	public Class3_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4892 = arg0;
		this.anInt4894 = arg1;
	}
}
