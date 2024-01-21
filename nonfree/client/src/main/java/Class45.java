import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class45 {

	@OriginalMember(owner = "client!ie", name = "u", descriptor = "Z")
	public boolean aBoolean95 = true;

	@OriginalMember(owner = "client!ie", name = "n", descriptor = "I")
	public final int anInt1709;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
	public final int anInt1706;

	@OriginalMember(owner = "client!ie", name = "p", descriptor = "I")
	public final int anInt1711;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
	public final int anInt1713;

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
	public final int anInt1707;

	@OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
	public final int anInt1708;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(IIIIIIZ)V")
	public Class45(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		this.anInt1709 = arg4;
		this.anInt1706 = arg0;
		this.anInt1711 = arg2;
		this.anInt1713 = arg3;
		this.aBoolean95 = arg6;
		this.anInt1707 = arg5;
		this.anInt1708 = arg1;
	}
}
