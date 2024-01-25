import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class4_Sub15_Sub2 extends Class4_Sub15 {

	@OriginalMember(owner = "client!lv", name = "p", descriptor = "I")
	public int anInt5443;

	@OriginalMember(owner = "client!lv", name = "q", descriptor = "I")
	public int anInt5444;

	@OriginalMember(owner = "client!lv", name = "r", descriptor = "I")
	public int anInt5445;

	@OriginalMember(owner = "client!lv", name = "s", descriptor = "J")
	public long aLong168;

	@OriginalMember(owner = "client!lv", name = "t", descriptor = "I")
	public int anInt5446;

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(I)J")
	@Override
	public long method4785() {
		return this.aLong168;
	}

	@OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)I")
	@Override
	public int method4787() {
		return this.anInt5445;
	}

	@OriginalMember(owner = "client!lv", name = "b", descriptor = "(B)I")
	@Override
	public int method4793() {
		return this.anInt5444;
	}

	@OriginalMember(owner = "client!lv", name = "d", descriptor = "(I)I")
	@Override
	public int method4789() {
		return this.anInt5443;
	}

	@OriginalMember(owner = "client!lv", name = "g", descriptor = "(I)I")
	@Override
	public int method4791() {
		return this.anInt5446;
	}
}
