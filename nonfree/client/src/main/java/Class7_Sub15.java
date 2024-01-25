import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public final class Class7_Sub15 extends Class7 {

	@OriginalMember(owner = "client!em", name = "k", descriptor = "I")
	public final int anInt1922;

	@OriginalMember(owner = "client!em", name = "m", descriptor = "I")
	public final int anInt1924;

	@OriginalMember(owner = "client!em", name = "<init>", descriptor = "(II)V")
	public Class7_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1922 = arg1;
		this.anInt1924 = arg0;
	}
}
