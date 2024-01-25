import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class6_Sub7_Sub1 extends Class6_Sub7 {

	@OriginalMember(owner = "client!db", name = "o", descriptor = "J")
	public long aLong46;

	@OriginalMember(owner = "client!db", name = "p", descriptor = "I")
	public int anInt1396;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public int anInt1398;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "I")
	public int anInt1400;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)J")
	@Override
	public long method1259() {
		return this.aLong46;
	}

	@OriginalMember(owner = "client!db", name = "g", descriptor = "(I)I")
	@Override
	public int method1261() {
		return this.anInt1398;
	}

	@OriginalMember(owner = "client!db", name = "e", descriptor = "(I)I")
	@Override
	public int method1258() {
		return this.anInt1396;
	}

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)I")
	@Override
	public int method1257() {
		return this.anInt1400;
	}
}
