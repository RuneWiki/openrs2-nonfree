import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public final class Class64 {

	@OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
	public int anInt1690;

	@OriginalMember(owner = "client!dba", name = "d", descriptor = "I")
	public int anInt1691;

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
	public int anInt1693;

	@OriginalMember(owner = "client!dba", name = "h", descriptor = "I")
	public int anInt1695;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
	public int anInt1696;

	@OriginalMember(owner = "client!dba", name = "l", descriptor = "I")
	public int anInt1699;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
	public int anInt1700;

	@OriginalMember(owner = "client!dba", name = "n", descriptor = "I")
	public int anInt1701;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
	public int anInt1702;

	@OriginalMember(owner = "client!dba", name = "q", descriptor = "I")
	public int anInt1704;

	@OriginalMember(owner = "client!dba", name = "s", descriptor = "I")
	public int anInt1705;

	@OriginalMember(owner = "client!dba", name = "t", descriptor = "I")
	public int anInt1706;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLclient!dba;)Z")
	public boolean method1632(@OriginalArg(1) Class64 arg0) {
		return arg0.anInt1706 == this.anInt1706 && arg0.anInt1700 == this.anInt1700 && this.anInt1696 == arg0.anInt1696;
	}
}
