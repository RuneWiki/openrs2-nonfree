import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public final class Class8_Sub15 extends Class8 {

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "I")
	public int anInt2596;

	@OriginalMember(owner = "client!jn", name = "n", descriptor = "I")
	public int anInt2595;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(II)V")
	public Class8_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2596 = arg0;
		this.anInt2595 = arg1;
	}
}
