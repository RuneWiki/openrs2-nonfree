import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public final class Class6_Sub42 extends Class6 {

	@OriginalMember(owner = "client!np", name = "s", descriptor = "I")
	public final int anInt6749;

	@OriginalMember(owner = "client!np", name = "q", descriptor = "I")
	public final int anInt6747;

	@OriginalMember(owner = "client!np", name = "<init>", descriptor = "(II)V")
	public Class6_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6749 = arg1;
		this.anInt6747 = arg0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(I)Z")
	public boolean method5784() {
		return (this.anInt6747 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
	public boolean method5786(@OriginalArg(1) int arg0) {
		return (this.anInt6747 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(B)I")
	public int method5790() {
		return Static486.method7065(this.anInt6747);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(Z)Z")
	public boolean method5792() {
		return (this.anInt6747 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!np", name = "b", descriptor = "(I)I")
	public int method5793() {
		return this.anInt6747 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!np", name = "c", descriptor = "(I)Z")
	public boolean method5794() {
		return (this.anInt6747 & 0x1) != 0;
	}
}
