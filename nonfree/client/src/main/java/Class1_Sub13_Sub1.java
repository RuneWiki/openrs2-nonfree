import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dw")
public final class Class1_Sub13_Sub1 extends Class1_Sub13 {

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
	public int anInt2016;

	@OriginalMember(owner = "client!dw", name = "n", descriptor = "I")
	public int anInt2017;

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "J")
	public long aLong88;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public int anInt2018;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	public int anInt2019;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(I)J")
	@Override
	public long method5741() {
		return this.aLong88;
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(B)I")
	@Override
	public int method5740() {
		return this.anInt2016;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(I)I")
	@Override
	public int method5737() {
		return this.anInt2017;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(B)I")
	@Override
	public int method5739() {
		return this.anInt2019;
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(I)I")
	@Override
	public int method5742() {
		return this.anInt2018;
	}
}
