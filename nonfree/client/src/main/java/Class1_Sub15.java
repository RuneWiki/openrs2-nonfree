import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class1_Sub15 extends Class1 {

	@OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
	public final int anInt2172;

	@OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
	public final int anInt2174;

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(II)V")
	public Class1_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2172 = arg0;
		this.anInt2174 = arg1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Z")
	public boolean method1721(@OriginalArg(0) int arg0) {
		return (this.anInt2172 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I")
	public int method1723() {
		return Static430.method5416(this.anInt2172);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z")
	public boolean method1724() {
		return (this.anInt2172 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Z")
	public boolean method1726() {
		return (this.anInt2172 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)Z")
	public boolean method1727() {
		return (this.anInt2172 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)I")
	public int method1729() {
		return this.anInt2172 >> 18 & 0x7;
	}
}
