import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public final class Class6_Sub7 extends Class6 {

	@OriginalMember(owner = "client!bv", name = "m", descriptor = "I")
	public int anInt1361;

	@OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
	public int anInt1363;

	@OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
	public int anInt1364;

	@OriginalMember(owner = "client!bv", name = "r", descriptor = "I")
	public int anInt1366;

	@OriginalMember(owner = "client!bv", name = "s", descriptor = "I")
	public int anInt1367;

	@OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
	public int anInt1365 = -1;

	@OriginalMember(owner = "client!bv", name = "t", descriptor = "Z")
	public boolean aBoolean146 = false;

	@OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(I)V")
	public Class6_Sub7(@OriginalArg(0) int arg0) {
		this.anInt1365 = arg0;
	}
}
