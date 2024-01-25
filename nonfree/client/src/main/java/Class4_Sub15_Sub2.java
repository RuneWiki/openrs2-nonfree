import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public final class Class4_Sub15_Sub2 extends Class4_Sub15 {

	@OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
	public int anInt3900;

	@OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
	public int anInt3903;

	@OriginalMember(owner = "client!ica", name = "s", descriptor = "I")
	public int anInt3905;

	@OriginalMember(owner = "client!ica", name = "v", descriptor = "I")
	public int anInt3908;

	@OriginalMember(owner = "client!ica", name = "y", descriptor = "J")
	public long aLong116;

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(Z)J")
	@Override
	public long method3493() {
		return this.aLong116;
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(Z)I")
	@Override
	public int method3496() {
		return this.anInt3900;
	}

	@OriginalMember(owner = "client!ica", name = "b", descriptor = "(Z)I")
	@Override
	public int method3495() {
		return this.anInt3908;
	}

	@OriginalMember(owner = "client!ica", name = "d", descriptor = "(B)I")
	@Override
	public int method3498() {
		return this.anInt3903;
	}

	@OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)I")
	@Override
	public int method3492() {
		return this.anInt3905;
	}
}
