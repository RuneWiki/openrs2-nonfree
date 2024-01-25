import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public final class Class1_Sub51 extends Class1 {

	@OriginalMember(owner = "client!ww", name = "n", descriptor = "I")
	public final int anInt9474;

	@OriginalMember(owner = "client!ww", name = "l", descriptor = "I")
	public final int anInt9473;

	@OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(II)V")
	public Class1_Sub51(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt9474 = arg0;
		this.anInt9473 = arg1;
	}

	@OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)Z")
	public boolean method7985() {
		return (this.anInt9474 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(IZ)Z")
	public boolean method7986(@OriginalArg(0) int arg0) {
		return (this.anInt9474 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ww", name = "c", descriptor = "(I)I")
	public int method7987() {
		return this.anInt9474 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)Z")
	public boolean method7988() {
		return (this.anInt9474 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ww", name = "g", descriptor = "(I)Z")
	public boolean method7989() {
		return (this.anInt9474 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ww", name = "h", descriptor = "(I)I")
	public int method7990() {
		return Static521.method7431(this.anInt9474);
	}
}
