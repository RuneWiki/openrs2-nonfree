import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class2_Sub10_Sub1 extends Class2_Sub10 {

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "J")
	public long aLong41;

	@OriginalMember(owner = "client!dj", name = "A", descriptor = "I")
	public int anInt1200;

	@OriginalMember(owner = "client!dj", name = "F", descriptor = "I")
	public int anInt1205;

	@OriginalMember(owner = "client!dj", name = "J", descriptor = "I")
	public int anInt1207;

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(Z)I")
	@Override
	public int method1116() {
		return this.anInt1200;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(Z)J")
	@Override
	public long method1122() {
		return this.aLong41;
	}

	@OriginalMember(owner = "client!dj", name = "d", descriptor = "(I)I")
	@Override
	public int method1120() {
		return this.anInt1205;
	}

	@OriginalMember(owner = "client!dj", name = "e", descriptor = "(I)I")
	@Override
	public int method1124() {
		return this.anInt1207;
	}
}
