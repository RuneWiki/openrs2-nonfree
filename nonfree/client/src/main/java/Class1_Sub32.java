import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public final class Class1_Sub32 extends Class1 {

	@OriginalMember(owner = "client!pk", name = "o", descriptor = "I")
	public final int anInt5166;

	@OriginalMember(owner = "client!pk", name = "q", descriptor = "I")
	public final int anInt5167;

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(II)V")
	public Class1_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5166 = arg1;
		this.anInt5167 = arg0;
	}
}
