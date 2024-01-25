import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class2_Sub42 extends Class2 {

	@OriginalMember(owner = "client!uu", name = "q", descriptor = "I")
	public final int anInt6838;

	@OriginalMember(owner = "client!uu", name = "p", descriptor = "I")
	public final int anInt6837;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(II)V")
	public Class2_Sub42(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6838 = arg1;
		this.anInt6837 = arg0;
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)Z")
	public boolean method5397() {
		return (this.anInt6837 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)I")
	public int method5398() {
		return this.anInt6837 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(II)Z")
	public boolean method5399(@OriginalArg(1) int arg0) {
		return (this.anInt6837 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "(B)I")
	public int method5400() {
		return Static172.method2801(this.anInt6837);
	}

	@OriginalMember(owner = "client!uu", name = "d", descriptor = "(B)Z")
	public boolean method5401() {
		return (this.anInt6837 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!uu", name = "e", descriptor = "(I)Z")
	public boolean method5402() {
		return (this.anInt6837 & 0x1) != 0;
	}
}
