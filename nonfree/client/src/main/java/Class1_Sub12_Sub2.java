import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class1_Sub12_Sub2 extends Class1_Sub12 {

	@OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
	public int anInt8273;

	@OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
	public int anInt8274;

	@OriginalMember(owner = "client!sn", name = "t", descriptor = "J")
	public long aLong224;

	@OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
	public int anInt8276;

	@OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
	public int anInt8278;

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)I")
	@Override
	public int method6689() {
		return this.anInt8278;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(Z)I")
	@Override
	public int method6687() {
		return this.anInt8274;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(Z)I")
	@Override
	public int method6682() {
		return this.anInt8273;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
	@Override
	public int method6688() {
		return this.anInt8276;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)J")
	@Override
	public long method6684() {
		return this.aLong224;
	}
}
