import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public final class Class5_Sub4_Sub1 extends Class5_Sub4 {

	@OriginalMember(owner = "client!gi", name = "o", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!gi", name = "p", descriptor = "I")
	public int anInt2401;

	@OriginalMember(owner = "client!gi", name = "q", descriptor = "I")
	public int anInt2402;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int anInt2403;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "J")
	public long aLong72;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)I")
	@Override
	public int method3833() {
		return this.anInt2403;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)I")
	@Override
	public int method3837() {
		return this.anInt2402;
	}

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
	@Override
	public int method3834() {
		return this.anInt2401;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
	@Override
	public int method3832() {
		return this.anInt2400;
	}

	@OriginalMember(owner = "client!gi", name = "f", descriptor = "(I)J")
	@Override
	public long method3835() {
		return this.aLong72;
	}
}
