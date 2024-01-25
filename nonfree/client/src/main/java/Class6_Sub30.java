import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public final class Class6_Sub30 extends Class6 {

	@OriginalMember(owner = "client!rf", name = "o", descriptor = "I")
	public final int anInt5763;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "I")
	public final int anInt5768;

	@OriginalMember(owner = "client!rf", name = "<init>", descriptor = "(II)V")
	public Class6_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5763 = arg1;
		this.anInt5768 = arg0;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Z")
	public boolean method4840(@OriginalArg(1) int arg0) {
		return (this.anInt5768 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rf", name = "d", descriptor = "(I)Z")
	public boolean method4841() {
		return (this.anInt5768 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)I")
	public int method4842() {
		return Static26.method2138(this.anInt5768);
	}

	@OriginalMember(owner = "client!rf", name = "f", descriptor = "(I)I")
	public int method4843() {
		return this.anInt5768 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)Z")
	public boolean method4846() {
		return (this.anInt5768 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rf", name = "g", descriptor = "(I)Z")
	public boolean method4847() {
		return (this.anInt5768 >> 22 & 0x1) != 0;
	}
}
