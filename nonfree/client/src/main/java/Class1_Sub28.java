import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mca")
public final class Class1_Sub28 extends Class1 {

	@OriginalMember(owner = "client!mca", name = "n", descriptor = "I")
	public final int anInt5698;

	@OriginalMember(owner = "client!mca", name = "r", descriptor = "I")
	public final int anInt5702;

	@OriginalMember(owner = "client!mca", name = "<init>", descriptor = "(II)V")
	public Class1_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5698 = arg0;
		this.anInt5702 = arg1;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(II)Z")
	public boolean method4810(@OriginalArg(0) int arg0) {
		return (this.anInt5698 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(I)Z")
	public boolean method4811() {
		return (this.anInt5698 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "a", descriptor = "(B)I")
	public int method4813() {
		return this.anInt5698 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(B)Z")
	public boolean method4815() {
		return (this.anInt5698 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "b", descriptor = "(I)Z")
	public boolean method4816() {
		return (this.anInt5698 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!mca", name = "d", descriptor = "(B)I")
	public int method4818() {
		return Static568.method7662(this.anInt5698);
	}
}
