import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public final class Class4_Sub15 extends Class4 {

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
	public final int anInt1750;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	public final int anInt1749;

	@OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(II)V")
	public Class4_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1750 = arg0;
		this.anInt1749 = arg1;
	}
}
