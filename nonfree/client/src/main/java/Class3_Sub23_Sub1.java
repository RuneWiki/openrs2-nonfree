import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public final class Class3_Sub23_Sub1 extends Class3_Sub23 {

	@OriginalMember(owner = "client!lm", name = "x", descriptor = "I")
	public int anInt4303;

	@OriginalMember(owner = "client!lm", name = "y", descriptor = "I")
	public int anInt4304;

	@OriginalMember(owner = "client!lm", name = "C", descriptor = "I")
	public int anInt4306;

	@OriginalMember(owner = "client!lm", name = "J", descriptor = "J")
	public long aLong139;

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(I)I")
	@Override
	public int method3475() {
		return this.anInt4306;
	}

	@OriginalMember(owner = "client!lm", name = "c", descriptor = "(I)J")
	@Override
	public long method3473() {
		return this.aLong139;
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)I")
	@Override
	public int method3474() {
		return this.anInt4303;
	}

	@OriginalMember(owner = "client!lm", name = "d", descriptor = "(B)I")
	@Override
	public int method3478() {
		return this.anInt4304;
	}
}
