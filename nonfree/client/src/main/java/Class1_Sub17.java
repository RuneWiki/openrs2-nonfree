import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public final class Class1_Sub17 extends Class1 {

	@OriginalMember(owner = "client!el", name = "m", descriptor = "I")
	public final int anInt2009;

	@OriginalMember(owner = "client!el", name = "p", descriptor = "I")
	public final int anInt2012;

	@OriginalMember(owner = "client!el", name = "<init>", descriptor = "(II)V")
	public Class1_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2009 = arg1;
		this.anInt2012 = arg0;
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I")
	public int method1731() {
		return Static452.method5932(this.anInt2012);
	}

	@OriginalMember(owner = "client!el", name = "a", descriptor = "(BI)Z")
	public boolean method1734(@OriginalArg(1) int arg0) {
		return (this.anInt2012 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!el", name = "h", descriptor = "(I)Z")
	public boolean method1736() {
		return (this.anInt2012 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Z")
	public boolean method1737() {
		return (this.anInt2012 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!el", name = "i", descriptor = "(I)I")
	public int method1738() {
		return this.anInt2012 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!el", name = "c", descriptor = "(B)Z")
	public boolean method1739() {
		return (this.anInt2012 & 0x1) != 0;
	}
}
