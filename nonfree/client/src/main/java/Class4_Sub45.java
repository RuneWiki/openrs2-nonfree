import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public final class Class4_Sub45 extends Class4 implements Interface24 {

	@OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
	public int anInt8152;

	@OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
	public int anInt8153;

	@OriginalMember(owner = "client!sl", name = "l", descriptor = "J")
	public long aLong255;

	@OriginalMember(owner = "client!sl", name = "m", descriptor = "I")
	public int anInt8154;

	@OriginalMember(owner = "client!sl", name = "p", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)C")
	@Override
	public char method6735() {
		return this.aChar4;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)J")
	@Override
	public long method6738() {
		return this.aLong255;
	}

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(B)I")
	@Override
	public int method6736() {
		return this.anInt8152;
	}

	@OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)I")
	@Override
	public int method6737() {
		return this.anInt8153;
	}

	@OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)I")
	@Override
	public int method6739() {
		return this.anInt8154;
	}
}
