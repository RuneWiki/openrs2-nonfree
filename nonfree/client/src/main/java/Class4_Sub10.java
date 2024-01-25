import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public final class Class4_Sub10 extends Class4 {

	@OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
	public final int anInt890;

	@OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
	public final int anInt889;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(II)V")
	public Class4_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt890 = arg0;
		this.anInt889 = arg1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)Z")
	public boolean method814(@OriginalArg(0) int arg0) {
		return (this.anInt890 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)I")
	public int method815() {
		return Static212.method3141(this.anInt890);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I")
	public int method817() {
		return this.anInt890 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)Z")
	public boolean method818() {
		return (this.anInt890 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)Z")
	public boolean method819() {
		return (this.anInt890 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)Z")
	public boolean method821() {
		return (this.anInt890 >> 21 & 0x1) != 0;
	}
}
