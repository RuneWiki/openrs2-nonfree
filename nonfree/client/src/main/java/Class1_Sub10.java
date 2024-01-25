import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class1_Sub10 extends Class1 {

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public final int anInt658;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
	public final int anInt649;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V")
	public Class1_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt658 = arg0;
		this.anInt649 = arg1;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)I")
	public int method567() {
		return this.anInt658 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)Z")
	public boolean method568() {
		return (this.anInt658 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "(I)Z")
	public boolean method570() {
		return (this.anInt658 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Z")
	public boolean method572(@OriginalArg(1) int arg0) {
		return (this.anInt658 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)I")
	public int method574() {
		return Static216.method3232(this.anInt658);
	}

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)Z")
	public boolean method575() {
		return (this.anInt658 >> 22 & 0x1) != 0;
	}
}
