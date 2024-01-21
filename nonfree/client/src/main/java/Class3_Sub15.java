import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
	public final int anInt2090;

	@OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
	public final int anInt2084;

	@OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(II)V")
	public Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2090 = arg1;
		this.anInt2084 = arg0;
	}
}
