import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public final class Class35 {

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "Z")
	public boolean aBoolean54 = true;

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public final int anInt1741;

	@OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
	public final int anInt1738;

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "I")
	public final int anInt1731;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "I")
	public final int anInt1732;

	@OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
	public final int anInt1733;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
	public final int anInt1736;

	@OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1741 = arg5;
		this.anInt1738 = arg2;
		this.aBoolean54 = arg6;
		this.anInt1731 = arg0;
		this.anInt1732 = arg3;
		this.anInt1733 = arg4;
		this.anInt1736 = arg1;
	}
}
