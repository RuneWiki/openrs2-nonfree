import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class4_Sub34 extends Class4 {

	@OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
	public final int anInt5771;

	@OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
	public final int anInt5773;

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II)V")
	public Class4_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5771 = arg0;
		this.anInt5773 = arg1;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)Z")
	public boolean method4444() {
		return (this.anInt5771 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)I")
	public int method4446() {
		return this.anInt5771 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
	public int method4447() {
		return Static116.method1838(this.anInt5771);
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(I)Z")
	public boolean method4449() {
		return (this.anInt5771 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)Z")
	public boolean method4450() {
		return (this.anInt5771 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
	public boolean method4451(@OriginalArg(0) int arg0) {
		return (this.anInt5771 >> arg0 + 1 & 0x1) != 0;
	}
}
