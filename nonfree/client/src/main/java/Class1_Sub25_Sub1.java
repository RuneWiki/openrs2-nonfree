import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public final class Class1_Sub25_Sub1 extends Class1_Sub25 {

	@OriginalMember(owner = "client!kj", name = "y", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!kj", name = "B", descriptor = "I")
	public int anInt4331;

	@OriginalMember(owner = "client!kj", name = "F", descriptor = "J")
	public long aLong119;

	@OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
	public int anInt4334;

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(B)I")
	@Override
	public int method3349() {
		return this.anInt4331;
	}

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(B)I")
	@Override
	public int method3350() {
		return this.anInt4334;
	}

	@OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)I")
	@Override
	public int method3347() {
		return this.anInt4328;
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)J")
	@Override
	public long method3352() {
		return this.aLong119;
	}
}
