import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public final class Class12_Sub15 extends Class12 {

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
	public final int anInt2882;

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "I")
	public final int anInt2887;

	@OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(II)V")
	public Class12_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2882 = arg0;
		this.anInt2887 = arg1;
	}
}
