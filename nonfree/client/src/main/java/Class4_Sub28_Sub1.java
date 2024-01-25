import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public final class Class4_Sub28_Sub1 extends Class4_Sub28 {

	@OriginalMember(owner = "client!wh", name = "A", descriptor = "I")
	public int anInt6639;

	@OriginalMember(owner = "client!wh", name = "E", descriptor = "J")
	public long aLong219;

	@OriginalMember(owner = "client!wh", name = "G", descriptor = "I")
	public int anInt6643;

	@OriginalMember(owner = "client!wh", name = "H", descriptor = "I")
	public int anInt6644;

	static {
		new Class159("Ok", "Okay", "OK", "Ok");
	}

	@OriginalMember(owner = "client!wh", name = "e", descriptor = "(B)I")
	@Override
	public int method5559() {
		return this.anInt6639;
	}

	@OriginalMember(owner = "client!wh", name = "f", descriptor = "(B)J")
	@Override
	public long method5560() {
		return this.aLong219;
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)I")
	@Override
	public int method5558() {
		return this.anInt6643;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)I")
	@Override
	public int method5555() {
		return this.anInt6644;
	}
}
