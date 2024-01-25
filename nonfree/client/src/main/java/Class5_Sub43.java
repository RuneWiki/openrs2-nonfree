import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public final class Class5_Sub43 extends Class5 {

	@OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
	public final int anInt8109;

	@OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
	public final int anInt8108;

	@OriginalMember(owner = "client!rda", name = "<init>", descriptor = "(II)V")
	public Class5_Sub43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt8109 = arg0;
		this.anInt8108 = arg1;
	}
}
