import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public final class Class3_Sub13 extends Class3 {

	@OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
	public final int anInt1859;

	@OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
	public final int anInt1864;

	@OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(II)V")
	public Class3_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1859 = arg0;
		this.anInt1864 = arg1;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)I")
	public int method1751() {
		return Static211.method3880(this.anInt1859);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)Z")
	public boolean method1752() {
		return (this.anInt1859 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)I")
	public int method1753() {
		return this.anInt1859 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!dh", name = "g", descriptor = "(I)Z")
	public boolean method1756() {
		return (this.anInt1859 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dh", name = "h", descriptor = "(I)Z")
	public boolean method1758() {
		return (this.anInt1859 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IB)Z")
	public boolean method1759(@OriginalArg(0) int arg0) {
		return (this.anInt1859 >> arg0 + 1 & 0x1) != 0;
	}
}
