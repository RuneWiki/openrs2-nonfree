import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public final class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!df", name = "t", descriptor = "I")
	public final int anInt2112;

	@OriginalMember(owner = "client!df", name = "l", descriptor = "I")
	public final int anInt2105;

	@OriginalMember(owner = "client!df", name = "<init>", descriptor = "(II)V")
	public Class5_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2112 = arg0;
		this.anInt2105 = arg1;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(B)I")
	public int method1953() {
		return Static510.method6989(this.anInt2112);
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(I)I")
	public int method1954() {
		return this.anInt2112 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(B)Z")
	public boolean method1955() {
		return (this.anInt2112 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!df", name = "b", descriptor = "(I)Z")
	public boolean method1956() {
		return (this.anInt2112 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(II)Z")
	public boolean method1958(@OriginalArg(0) int arg0) {
		return (this.anInt2112 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!df", name = "f", descriptor = "(I)Z")
	public boolean method1959() {
		return (this.anInt2112 & 0x1) != 0;
	}
}
