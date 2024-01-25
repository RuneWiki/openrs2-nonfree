import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public final class Class2_Sub16_Sub2 extends Class2_Sub16 {

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public int anInt7163;

	@OriginalMember(owner = "client!pq", name = "q", descriptor = "J")
	public long aLong199;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public int anInt7164;

	@OriginalMember(owner = "client!pq", name = "s", descriptor = "I")
	public int anInt7165;

	@OriginalMember(owner = "client!pq", name = "t", descriptor = "I")
	public int anInt7166;

	@OriginalMember(owner = "client!pq", name = "c", descriptor = "(I)I")
	@Override
	public int method6010() {
		return this.anInt7163;
	}

	@OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)J")
	@Override
	public long method6011() {
		return this.aLong199;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)I")
	@Override
	public int method6004() {
		return this.anInt7166;
	}

	@OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)I")
	@Override
	public int method6008() {
		return this.anInt7165;
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I")
	@Override
	public int method6005() {
		return this.anInt7164;
	}
}
