import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public final class Class6_Sub50 extends Class6 {

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
	public final int anInt10442;

	@OriginalMember(owner = "client!waa", name = "o", descriptor = "I")
	public final int anInt10438;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(II)V")
	public Class6_Sub50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt10442 = arg1;
		this.anInt10438 = arg0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)I")
	public int method8487() {
		return this.anInt10438 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!waa", name = "b", descriptor = "(I)Z")
	public boolean method8488() {
		return (this.anInt10438 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BI)Z")
	public boolean method8490(@OriginalArg(1) int arg0) {
		return (this.anInt10438 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(B)Z")
	public boolean method8491() {
		return (this.anInt10438 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!waa", name = "c", descriptor = "(I)I")
	public int method8492() {
		return Static366.method5884(this.anInt10438);
	}

	@OriginalMember(owner = "client!waa", name = "e", descriptor = "(I)Z")
	public boolean method8493() {
		return (this.anInt10438 & 0x1) != 0;
	}
}
