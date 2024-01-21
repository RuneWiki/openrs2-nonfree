import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public final class Class9 {

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	public int anInt618;

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "B")
	private byte aByte2;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "I")
	public int anInt626;

	@OriginalMember(owner = "client!bi", name = "o", descriptor = "I")
	public int anInt629;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
	public Class9() {
	}

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!wa;)V")
	public Class9(@OriginalArg(0) Class1_Sub14 arg0) {
		this.aByte2 = arg0.method1720();
		this.anInt626 = arg0.method1753();
		this.anInt620 = arg0.method1700();
		this.anInt629 = arg0.method1700();
		this.anInt625 = arg0.method1700();
		this.anInt618 = arg0.method1700();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)I")
	public int method384() {
		return (this.aByte2 & 0x8) == 8 ? 1 : 0;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)I")
	public int method389() {
		return this.aByte2 & 0x7;
	}
}
