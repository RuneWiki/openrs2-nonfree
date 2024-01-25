import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public final class Class1_Sub42 extends Class1 implements Interface14 {

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "I")
	public int anInt8017;

	@OriginalMember(owner = "client!rr", name = "m", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!rr", name = "p", descriptor = "I")
	public int anInt8022;

	@OriginalMember(owner = "client!rr", name = "q", descriptor = "I")
	public int anInt8023;

	@OriginalMember(owner = "client!rr", name = "r", descriptor = "J")
	public long aLong208;

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)I")
	@Override
	public int method6440() {
		return this.anInt8023;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)J")
	@Override
	public long method6439() {
		return this.aLong208;
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)I")
	@Override
	public int method6442() {
		return this.anInt8017;
	}

	@OriginalMember(owner = "client!rr", name = "d", descriptor = "(I)I")
	@Override
	public int method6443() {
		return this.anInt8022;
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(I)C")
	@Override
	public char method6441() {
		return this.aChar5;
	}
}
