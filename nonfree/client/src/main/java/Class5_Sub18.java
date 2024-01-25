import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public final class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
	public final int anInt1942;

	@OriginalMember(owner = "client!dk", name = "p", descriptor = "I")
	public final int anInt1944;

	@OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(II)V")
	public Class5_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1942 = arg0;
		this.anInt1944 = arg1;
	}
}
