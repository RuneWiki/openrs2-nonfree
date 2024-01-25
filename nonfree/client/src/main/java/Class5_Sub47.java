import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class5_Sub47 extends Class5 implements Interface1 {

	@OriginalMember(owner = "client!sj", name = "n", descriptor = "I")
	public int anInt8874;

	@OriginalMember(owner = "client!sj", name = "p", descriptor = "I")
	public int anInt8876;

	@OriginalMember(owner = "client!sj", name = "r", descriptor = "J")
	public long aLong220;

	@OriginalMember(owner = "client!sj", name = "s", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!sj", name = "u", descriptor = "I")
	public int anInt8879;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(B)I")
	@Override
	public int method7651() {
		return this.anInt8879;
	}

	@OriginalMember(owner = "client!sj", name = "b", descriptor = "(I)I")
	@Override
	public int method7649() {
		return this.anInt8874;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)C")
	@Override
	public char method7648() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I")
	@Override
	public int method7650() {
		return this.anInt8876;
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)J")
	@Override
	public long method7647() {
		return this.aLong220;
	}
}
