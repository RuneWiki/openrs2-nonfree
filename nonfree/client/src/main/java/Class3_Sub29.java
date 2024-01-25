import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
	public final int anInt5346;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "I")
	public final int anInt5345;

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "(II)V")
	public Class3_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5346 = arg1;
		this.anInt5345 = arg0;
	}
}
