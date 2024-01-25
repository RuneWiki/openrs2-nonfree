import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public final class Class2_Sub15 extends Class2 {

	@OriginalMember(owner = "client!ek", name = "p", descriptor = "I")
	public final int anInt2146;

	@OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
	public final int anInt2149;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(II)V")
	public Class2_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2146 = arg0;
		this.anInt2149 = arg1;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)Z")
	public boolean method1587() {
		return (this.anInt2146 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)Z")
	public boolean method1588(@OriginalArg(0) int arg0) {
		return (this.anInt2146 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(B)I")
	public int method1590() {
		return Static165.method4927(this.anInt2146);
	}

	@OriginalMember(owner = "client!ek", name = "e", descriptor = "(I)Z")
	public boolean method1591() {
		return (this.anInt2146 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)I")
	public int method1592() {
		return this.anInt2146 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)Z")
	public boolean method1593() {
		return (this.anInt2146 >> 22 & 0x1) != 0;
	}
}
