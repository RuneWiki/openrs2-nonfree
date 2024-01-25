import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public final class Class3_Sub21_Sub2 extends Class3_Sub21 {

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "I")
	public int anInt4653;

	@OriginalMember(owner = "client!ir", name = "t", descriptor = "I")
	public int anInt4656;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "I")
	public int anInt4658;

	@OriginalMember(owner = "client!ir", name = "A", descriptor = "J")
	public long aLong136;

	@OriginalMember(owner = "client!ir", name = "i", descriptor = "(I)I")
	@Override
	public int method3916() {
		return this.anInt4658;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)I")
	@Override
	public int method3912() {
		return 0;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
	@Override
	public int method3914() {
		return this.anInt4653;
	}

	@OriginalMember(owner = "client!ir", name = "h", descriptor = "(I)J")
	@Override
	public long method3915() {
		return this.aLong136;
	}

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "(I)I")
	@Override
	public int method3917() {
		return this.anInt4656;
	}
}
