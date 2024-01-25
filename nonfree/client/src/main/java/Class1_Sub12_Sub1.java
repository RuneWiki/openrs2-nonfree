import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public final class Class1_Sub12_Sub1 extends Class1_Sub12 {

	@OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
	public int anInt4521;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
	public int anInt4522;

	@OriginalMember(owner = "client!jh", name = "o", descriptor = "J")
	public long aLong114;

	@OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
	public int anInt4523;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
	public int anInt4524;

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)I")
	@Override
	public int method6689() {
		return this.anInt4524;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(Z)I")
	@Override
	public int method6687() {
		return this.anInt4523;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)J")
	@Override
	public long method6684() {
		return this.aLong114;
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)I")
	@Override
	public int method6688() {
		return this.anInt4522;
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(Z)I")
	@Override
	public int method6682() {
		return this.anInt4521;
	}
}
