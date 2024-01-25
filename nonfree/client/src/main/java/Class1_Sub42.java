import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public final class Class1_Sub42 extends Class1 {

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
	public final int anInt6537;

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "I")
	public final int anInt6536;

	@OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(II)V")
	public Class1_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6537 = arg1;
		this.anInt6536 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "(I)I")
	public int method5744() {
		return this.anInt6536 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!vm", name = "e", descriptor = "(I)I")
	public int method5745() {
		return Static297.method5184(this.anInt6536);
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)Z")
	public boolean method5748(@OriginalArg(0) int arg0) {
		return (this.anInt6536 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)Z")
	public boolean method5751() {
		return (this.anInt6536 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)Z")
	public boolean method5753() {
		return (this.anInt6536 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vm", name = "i", descriptor = "(I)Z")
	public boolean method5757() {
		return (this.anInt6536 & 0x1) != 0;
	}
}
