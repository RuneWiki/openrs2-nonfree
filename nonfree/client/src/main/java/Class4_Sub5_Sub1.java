import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public final class Class4_Sub5_Sub1 extends Class4_Sub5 {

	@OriginalMember(owner = "client!be", name = "q", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!be", name = "t", descriptor = "I")
	public int anInt449;

	@OriginalMember(owner = "client!be", name = "v", descriptor = "I")
	public int anInt451;

	@OriginalMember(owner = "client!be", name = "D", descriptor = "I")
	public int anInt455;

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(B)I")
	@Override
	public int method515() {
		return this.anInt451;
	}

	@OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I")
	@Override
	public int method518() {
		return this.anInt449;
	}

	@OriginalMember(owner = "client!be", name = "d", descriptor = "(B)J")
	@Override
	public long method516() {
		return this.aLong23;
	}

	@OriginalMember(owner = "client!be", name = "e", descriptor = "(B)I")
	@Override
	public int method519() {
		return this.anInt455;
	}
}
