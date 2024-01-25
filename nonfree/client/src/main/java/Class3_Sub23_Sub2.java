import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gka")
public final class Class3_Sub23_Sub2 extends Class3_Sub23 {

	@OriginalMember(owner = "client!gka", name = "q", descriptor = "I")
	public int anInt3520;

	@OriginalMember(owner = "client!gka", name = "y", descriptor = "I")
	public int anInt3523;

	@OriginalMember(owner = "client!gka", name = "w", descriptor = "I")
	public int anInt3526;

	@OriginalMember(owner = "client!gka", name = "v", descriptor = "J")
	public long aLong135;

	@OriginalMember(owner = "client!gka", name = "r", descriptor = "I")
	public int anInt3528;

	@OriginalMember(owner = "client!gka", name = "b", descriptor = "(I)J")
	@Override
	public long method3199() {
		return this.aLong135;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(I)I")
	@Override
	public int method3194() {
		return this.anInt3528;
	}

	@OriginalMember(owner = "client!gka", name = "c", descriptor = "(I)I")
	@Override
	public int method3198() {
		return this.anInt3526;
	}

	@OriginalMember(owner = "client!gka", name = "a", descriptor = "(B)I")
	@Override
	public int method3197() {
		return this.anInt3523;
	}

	@OriginalMember(owner = "client!gka", name = "h", descriptor = "(I)I")
	@Override
	public int method3196() {
		return this.anInt3520;
	}
}
