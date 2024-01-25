import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
	public final int anInt4716;

	@OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
	public final int anInt4712;

	@OriginalMember(owner = "client!kca", name = "<init>", descriptor = "(II)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4716 = arg1;
		this.anInt4712 = arg0;
	}
}
