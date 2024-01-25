import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public final class Class6_Sub8_Sub1 extends Class6_Sub8 {

	@OriginalMember(owner = "client!cw", name = "r", descriptor = "I")
	public int anInt1213;

	@OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
	public int anInt1222;

	@OriginalMember(owner = "client!cw", name = "C", descriptor = "I")
	public int anInt1224;

	@OriginalMember(owner = "client!cw", name = "E", descriptor = "J")
	public long aLong45;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)J")
	@Override
	public long method7644() {
		return this.aLong45;
	}

	@OriginalMember(owner = "client!cw", name = "d", descriptor = "(B)I")
	@Override
	public int method7649() {
		return 0;
	}

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "(B)I")
	@Override
	public int method7651() {
		return this.anInt1222;
	}

	@OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)I")
	@Override
	public int method7645() {
		return this.anInt1213;
	}

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)I")
	@Override
	public int method7643() {
		return this.anInt1224;
	}
}
