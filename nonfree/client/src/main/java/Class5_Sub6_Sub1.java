import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public final class Class5_Sub6_Sub1 extends Class5_Sub6 {

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
	public int anInt2099;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
	public int anInt2100;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
	public int anInt2101;

	@OriginalMember(owner = "client!eca", name = "r", descriptor = "J")
	public long aLong54;

	@OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
	public int anInt2102;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(B)I")
	@Override
	public int method5804() {
		return this.anInt2101;
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(B)I")
	@Override
	public int method5806() {
		return this.anInt2100;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)J")
	@Override
	public long method5802() {
		return this.aLong54;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)I")
	@Override
	public int method5808() {
		return this.anInt2102;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)I")
	@Override
	public int method5803() {
		return this.anInt2099;
	}
}
