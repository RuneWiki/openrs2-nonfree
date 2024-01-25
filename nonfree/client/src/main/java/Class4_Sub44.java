import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class4_Sub44 extends Class4 implements Interface26 {

	@OriginalMember(owner = "client!rt", name = "h", descriptor = "J")
	public long aLong246;

	@OriginalMember(owner = "client!rt", name = "j", descriptor = "I")
	public int anInt8217;

	@OriginalMember(owner = "client!rt", name = "w", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!rt", name = "x", descriptor = "I")
	public int anInt8229;

	@OriginalMember(owner = "client!rt", name = "y", descriptor = "I")
	public int anInt8230;

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(I)I")
	@Override
	public int method7132() {
		return this.anInt8230;
	}

	@OriginalMember(owner = "client!rt", name = "d", descriptor = "(I)I")
	@Override
	public int method7136() {
		return this.anInt8217;
	}

	@OriginalMember(owner = "client!rt", name = "c", descriptor = "(I)C")
	@Override
	public char method7134() {
		return this.aChar3;
	}

	@OriginalMember(owner = "client!rt", name = "b", descriptor = "(I)J")
	@Override
	public long method7133() {
		return this.aLong246;
	}

	@OriginalMember(owner = "client!rt", name = "a", descriptor = "(B)I")
	@Override
	public int method7135() {
		return this.anInt8229;
	}
}
