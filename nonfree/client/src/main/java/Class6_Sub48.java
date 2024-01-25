import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Class6_Sub48 extends Class6 {

	@OriginalMember(owner = "client!tv", name = "t", descriptor = "I")
	public final int anInt8787;

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
	public final int anInt8782;

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(II)V")
	public Class6_Sub48(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8787 = arg1;
		this.anInt8782 = arg0;
	}
}
