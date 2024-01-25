import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kea")
public final class Class2_Sub35_Sub1 extends Class2_Sub35 {

	@OriginalMember(owner = "client!kea", name = "r", descriptor = "I")
	public int anInt5577;

	@OriginalMember(owner = "client!kea", name = "s", descriptor = "I")
	public int anInt5578;

	@OriginalMember(owner = "client!kea", name = "t", descriptor = "I")
	public int anInt5579;

	@OriginalMember(owner = "client!kea", name = "u", descriptor = "I")
	public int anInt5580;

	@OriginalMember(owner = "client!kea", name = "v", descriptor = "J")
	public long aLong154;

	@OriginalMember(owner = "client!kea", name = "f", descriptor = "(B)I")
	@Override
	public int method9191() {
		return this.anInt5579;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(I)I")
	@Override
	public int method9186() {
		return this.anInt5580;
	}

	@OriginalMember(owner = "client!kea", name = "a", descriptor = "(B)I")
	@Override
	public int method9185() {
		return this.anInt5577;
	}

	@OriginalMember(owner = "client!kea", name = "b", descriptor = "(B)J")
	@Override
	public long method9188() {
		return this.aLong154;
	}

	@OriginalMember(owner = "client!kea", name = "c", descriptor = "(B)I")
	@Override
	public int method9190() {
		return this.anInt5578;
	}
}
