import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public final class Class11_Sub39_Sub1 extends Class11_Sub39 {

	@OriginalMember(owner = "client!wc", name = "m", descriptor = "I")
	public int anInt6583;

	@OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
	public int anInt6588;

	@OriginalMember(owner = "client!wc", name = "v", descriptor = "J")
	public long aLong211;

	@OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
	public int anInt6593;

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)I")
	@Override
	public int method5598() {
		return this.anInt6593;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)I")
	@Override
	public int method5601() {
		return this.anInt6583;
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(B)J")
	@Override
	public long method5602() {
		return this.aLong211;
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)I")
	@Override
	public int method5600() {
		return this.anInt6588;
	}
}
