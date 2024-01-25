import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public final class Class2_Sub12_Sub2 extends Class2_Sub12 {

	@OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
	public int anInt8591;

	@OriginalMember(owner = "client!sh", name = "r", descriptor = "J")
	public long aLong233;

	@OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
	public int anInt8597;

	@OriginalMember(owner = "client!sh", name = "w", descriptor = "I")
	public int anInt8598;

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
	public int anInt8603;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)I")
	@Override
	public int method7237() {
		return this.anInt8597;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
	@Override
	public int method7236() {
		return this.anInt8598;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)I")
	@Override
	public int method7241() {
		return this.anInt8591;
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(B)J")
	@Override
	public long method7242() {
		return this.aLong233;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)I")
	@Override
	public int method7238() {
		return this.anInt8603;
	}
}
