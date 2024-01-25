import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public final class Class5_Sub26_Sub1 extends Class5_Sub26 {

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "J")
	public long aLong171;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	public int anInt5019;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public int anInt5023;

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "I")
	public int anInt5024;

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)I")
	@Override
	public int method4481() {
		return this.anInt5024;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)I")
	@Override
	public int method4483() {
		return this.anInt5023;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)J")
	@Override
	public long method4482() {
		return this.aLong171;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)I")
	@Override
	public int method4478() {
		return this.anInt5019;
	}
}
