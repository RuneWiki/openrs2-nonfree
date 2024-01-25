import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public final class Class3_Sub30_Sub2 extends Class3_Sub30 {

	@OriginalMember(owner = "client!oea", name = "B", descriptor = "I")
	public int anInt7612;

	@OriginalMember(owner = "client!oea", name = "E", descriptor = "J")
	public long aLong179;

	@OriginalMember(owner = "client!oea", name = "F", descriptor = "I")
	public int anInt7615;

	@OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
	public int anInt7617;

	@OriginalMember(owner = "client!oea", name = "P", descriptor = "I")
	public int anInt7624;

	@OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)I")
	@Override
	public int method6362() {
		return this.anInt7624;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)I")
	@Override
	public int method6363() {
		return this.anInt7612;
	}

	@OriginalMember(owner = "client!oea", name = "f", descriptor = "(I)I")
	@Override
	public int method6366() {
		return this.anInt7615;
	}

	@OriginalMember(owner = "client!oea", name = "e", descriptor = "(I)J")
	@Override
	public long method6365() {
		return this.aLong179;
	}

	@OriginalMember(owner = "client!oea", name = "a", descriptor = "(Z)I")
	@Override
	public int method6367() {
		return this.anInt7617;
	}
}
