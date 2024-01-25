import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public final int anInt27;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
	public final int anInt31;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(II)V")
	public Class3_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt27 = arg1;
		this.anInt31 = arg0;
	}
}
