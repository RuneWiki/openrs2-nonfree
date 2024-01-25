import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public final class Class6_Sub47 extends Class6 implements Interface5 {

	@OriginalMember(owner = "client!th", name = "r", descriptor = "J")
	public long aLong218;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	public int anInt8669;

	@OriginalMember(owner = "client!th", name = "u", descriptor = "I")
	public int anInt8671;

	@OriginalMember(owner = "client!th", name = "A", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!th", name = "B", descriptor = "I")
	public int anInt8675;

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(B)C")
	@Override
	public char method6890() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(I)I")
	@Override
	public int method6893() {
		return this.anInt8671;
	}

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(B)I")
	@Override
	public int method6891() {
		return this.anInt8669;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(I)I")
	@Override
	public int method6889() {
		return this.anInt8675;
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(B)J")
	@Override
	public long method6892() {
		return this.aLong218;
	}
}
