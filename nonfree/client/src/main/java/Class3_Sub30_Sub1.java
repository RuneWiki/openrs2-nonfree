import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public final class Class3_Sub30_Sub1 extends Class3_Sub30 {

	@OriginalMember(owner = "client!oaa", name = "B", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!oaa", name = "D", descriptor = "I")
	public int anInt7438;

	@OriginalMember(owner = "client!oaa", name = "E", descriptor = "I")
	public int anInt7439;

	@OriginalMember(owner = "client!oaa", name = "F", descriptor = "I")
	public int anInt7440;

	@OriginalMember(owner = "client!oaa", name = "G", descriptor = "I")
	public int anInt7441;

	@OriginalMember(owner = "client!oaa", name = "e", descriptor = "(I)J")
	@Override
	public long method6365() {
		return this.aLong175;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(B)I")
	@Override
	public int method6363() {
		return this.anInt7439;
	}

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(Z)I")
	@Override
	public int method6367() {
		return this.anInt7441;
	}

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "(I)I")
	@Override
	public int method6366() {
		return this.anInt7438;
	}

	@OriginalMember(owner = "client!oaa", name = "b", descriptor = "(I)I")
	@Override
	public int method6362() {
		return this.anInt7440;
	}
}
