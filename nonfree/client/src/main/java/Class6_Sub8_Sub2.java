import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class6_Sub8_Sub2 extends Class6_Sub8 {

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "I")
	public int anInt9345;

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public int anInt9346;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public int anInt9347;

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
	public int anInt9348;

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "J")
	public long aLong240;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	@Override
	public int method7645() {
		return this.anInt9345;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)J")
	@Override
	public long method7644() {
		return this.aLong240;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(B)I")
	@Override
	public int method7649() {
		return this.anInt9348;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)I")
	@Override
	public int method7643() {
		return this.anInt9347;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)I")
	@Override
	public int method7651() {
		return this.anInt9346;
	}
}
