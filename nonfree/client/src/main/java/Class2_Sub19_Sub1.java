import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public final class Class2_Sub19_Sub1 extends Class2_Sub19 {

	@OriginalMember(owner = "client!gp", name = "w", descriptor = "I")
	public int anInt2454;

	@OriginalMember(owner = "client!gp", name = "y", descriptor = "I")
	public int anInt2456;

	@OriginalMember(owner = "client!gp", name = "B", descriptor = "J")
	public long aLong85;

	@OriginalMember(owner = "client!gp", name = "F", descriptor = "I")
	public int anInt2461;

	@OriginalMember(owner = "client!gp", name = "d", descriptor = "(I)I")
	@Override
	public int method2378() {
		return this.anInt2461;
	}

	@OriginalMember(owner = "client!gp", name = "e", descriptor = "(I)I")
	@Override
	public int method2379() {
		return this.anInt2456;
	}

	@OriginalMember(owner = "client!gp", name = "f", descriptor = "(I)I")
	@Override
	public int method2380() {
		return this.anInt2454;
	}

	@OriginalMember(owner = "client!gp", name = "c", descriptor = "(B)J")
	@Override
	public long method2377() {
		return this.aLong85;
	}
}
