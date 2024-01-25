import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public final class Class5_Sub18 extends Class5 {

	@OriginalMember(owner = "client!ep", name = "v", descriptor = "I")
	public final int anInt2210;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	public final int anInt2204;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(II)V")
	public Class5_Sub18(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2210 = arg0;
		this.anInt2204 = arg1;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)Z")
	public boolean method1970(@OriginalArg(1) int arg0) {
		return (this.anInt2210 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)I")
	public int method1972() {
		return Static584.method8032(this.anInt2210);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)Z")
	public boolean method1973() {
		return (this.anInt2210 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(B)Z")
	public boolean method1974() {
		return (this.anInt2210 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)Z")
	public boolean method1975() {
		return (this.anInt2210 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)I")
	public int method1976() {
		return this.anInt2210 >> 18 & 0x7;
	}
}
