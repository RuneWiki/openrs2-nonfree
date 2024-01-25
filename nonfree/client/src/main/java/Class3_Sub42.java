import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public final class Class3_Sub42 extends Class3 {

	@OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
	public final int anInt6590;

	@OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
	public final int anInt6593;

	@OriginalMember(owner = "client!tl", name = "<init>", descriptor = "(II)V")
	public Class3_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6590 = arg1;
		this.anInt6593 = arg0;
	}

	@OriginalMember(owner = "client!tl", name = "f", descriptor = "(I)Z")
	public boolean method5451() {
		return (this.anInt6593 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "g", descriptor = "(I)Z")
	public boolean method5453() {
		return (this.anInt6593 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "h", descriptor = "(I)I")
	public int method5454() {
		return Static140.method2138(this.anInt6593);
	}

	@OriginalMember(owner = "client!tl", name = "i", descriptor = "(I)I")
	public int method5455() {
		return this.anInt6593 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!tl", name = "j", descriptor = "(I)Z")
	public boolean method5456() {
		return (this.anInt6593 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!tl", name = "a", descriptor = "(II)Z")
	public boolean method5457(@OriginalArg(0) int arg0) {
		return (this.anInt6593 >> arg0 + 1 & 0x1) != 0;
	}
}
