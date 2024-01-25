import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public final class Class1_Sub8_Sub1 extends Class1_Sub8 {

	@OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
	public int anInt552;

	@OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
	public int anInt554;

	@OriginalMember(owner = "client!bg", name = "B", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "J")
	public long aLong23;

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)J")
	@Override
	public long method595() {
		return this.aLong23;
	}

	@OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)I")
	@Override
	public int method593() {
		return this.anInt556;
	}

	@OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)I")
	@Override
	public int method596() {
		return this.anInt552;
	}

	@OriginalMember(owner = "client!bg", name = "e", descriptor = "(I)I")
	@Override
	public int method598() {
		return this.anInt554;
	}
}
