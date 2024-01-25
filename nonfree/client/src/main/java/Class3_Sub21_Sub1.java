import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public final class Class3_Sub21_Sub1 extends Class3_Sub21 {

	@OriginalMember(owner = "client!ic", name = "q", descriptor = "J")
	public long aLong124;

	@OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
	public int anInt4374;

	@OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
	public int anInt4375;

	@OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
	public int anInt4376;

	@OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
	public int anInt4377;

	@OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)I")
	@Override
	public int method3916() {
		return this.anInt4376;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)I")
	@Override
	public int method3912() {
		return this.anInt4377;
	}

	@OriginalMember(owner = "client!ic", name = "h", descriptor = "(I)J")
	@Override
	public long method3915() {
		return this.aLong124;
	}

	@OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)I")
	@Override
	public int method3917() {
		return this.anInt4375;
	}

	@OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)I")
	@Override
	public int method3914() {
		return this.anInt4374;
	}
}
