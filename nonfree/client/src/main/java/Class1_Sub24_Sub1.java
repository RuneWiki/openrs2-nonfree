import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public final class Class1_Sub24_Sub1 extends Class1_Sub24 {

	@OriginalMember(owner = "client!ij", name = "y", descriptor = "J")
	public long aLong103;

	@OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
	public int anInt2810;

	@OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
	public int anInt2812;

	@OriginalMember(owner = "client!ij", name = "e", descriptor = "(I)I")
	@Override
	public int method2421() {
		return this.anInt2811;
	}

	@OriginalMember(owner = "client!ij", name = "d", descriptor = "(I)J")
	@Override
	public long method2420() {
		return this.aLong103;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)I")
	@Override
	public int method2417() {
		return this.anInt2810;
	}

	@OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)I")
	@Override
	public int method2418() {
		return this.anInt2812;
	}
}
