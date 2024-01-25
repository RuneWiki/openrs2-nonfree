import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public final class Class2_Sub35_Sub2 extends Class2_Sub35 {

	@OriginalMember(owner = "client!un", name = "s", descriptor = "I")
	public int anInt10736;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public int anInt10737;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public int anInt10738;

	@OriginalMember(owner = "client!un", name = "y", descriptor = "J")
	public long aLong286;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "I")
	public int anInt10743;

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(B)I")
	@Override
	public int method9190() {
		return this.anInt10738;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(B)I")
	@Override
	public int method9185() {
		return this.anInt10736;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(B)J")
	@Override
	public long method9188() {
		return this.aLong286;
	}

	@OriginalMember(owner = "client!un", name = "f", descriptor = "(B)I")
	@Override
	public int method9191() {
		return this.anInt10737;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)I")
	@Override
	public int method9186() {
		return this.anInt10743;
	}
}
