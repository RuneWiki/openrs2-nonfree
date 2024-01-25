import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public final class Class3_Sub24_Sub1 extends Class3_Sub24 {

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "J")
	public long aLong108;

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
	public int anInt3674;

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
	public int anInt3675;

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "I")
	public int anInt3676;

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "I")
	public int anInt3677;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)I")
	@Override
	public int method7746() {
		return this.anInt3674;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)J")
	@Override
	public long method7752() {
		return this.aLong108;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)I")
	@Override
	public int method7748() {
		return this.anInt3677;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)I")
	@Override
	public int method7750() {
		return this.anInt3676;
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)I")
	@Override
	public int method7751() {
		return this.anInt3675;
	}
}
