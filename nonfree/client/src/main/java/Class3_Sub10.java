import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!bca", name = "j", descriptor = "I")
	public final int anInt723;

	@OriginalMember(owner = "client!bca", name = "q", descriptor = "I")
	public final int anInt730;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(II)V")
	public Class3_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt723 = arg1;
		this.anInt730 = arg0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)Z")
	public boolean method570(@OriginalArg(0) int arg0) {
		return (this.anInt730 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)I")
	public int method571() {
		return Static489.method6652(this.anInt730);
	}

	@OriginalMember(owner = "client!bca", name = "b", descriptor = "(B)Z")
	public boolean method572() {
		return (this.anInt730 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)I")
	public int method573() {
		return this.anInt730 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bca", name = "c", descriptor = "(B)Z")
	public boolean method574() {
		return (this.anInt730 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Z")
	public boolean method575() {
		return (this.anInt730 >> 21 & 0x1) != 0;
	}
}
