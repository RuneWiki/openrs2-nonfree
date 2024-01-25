import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!baa")
public final class Class14_Sub6 extends Class14 {

	@OriginalMember(owner = "client!baa", name = "o", descriptor = "I")
	public final int anInt453;

	@OriginalMember(owner = "client!baa", name = "t", descriptor = "I")
	public final int anInt455;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(II)V")
	public Class14_Sub6(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt453 = arg0;
		this.anInt455 = arg1;
	}

	@OriginalMember(owner = "client!baa", name = "d", descriptor = "(I)Z")
	public boolean method474() {
		return (this.anInt453 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)I")
	public int method475() {
		return this.anInt453 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(B)Z")
	public boolean method476() {
		return (this.anInt453 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(IB)Z")
	public boolean method479(@OriginalArg(0) int arg0) {
		return (this.anInt453 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!baa", name = "c", descriptor = "(B)Z")
	public boolean method481() {
		return (this.anInt453 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "(B)I")
	public int method482() {
		return Static615.method8661(this.anInt453);
	}
}
