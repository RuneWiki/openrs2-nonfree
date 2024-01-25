import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public final class Class7_Sub12_Sub1 extends Class7_Sub12 {

	@OriginalMember(owner = "client!dd", name = "q", descriptor = "I")
	public int anInt1228;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "J")
	public long aLong43;

	@OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
	public int anInt1232;

	@OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
	public int anInt1235;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)J")
	@Override
	public long method939() {
		return this.aLong43;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)I")
	@Override
	public int method942() {
		return this.anInt1228;
	}

	@OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)I")
	@Override
	public int method943() {
		return this.anInt1235;
	}

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)I")
	@Override
	public int method940() {
		return this.anInt1232;
	}
}
