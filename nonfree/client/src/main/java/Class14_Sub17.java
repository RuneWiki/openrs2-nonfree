import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public final class Class14_Sub17 extends Class14 {

	@OriginalMember(owner = "client!hk", name = "B", descriptor = "I")
	public final int anInt2702;

	@OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
	public final int anInt2691;

	@OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V")
	public Class14_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2702 = arg0;
		this.anInt2691 = arg1;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)I")
	public int method2574() {
		return this.anInt2702 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)Z")
	public boolean method2575() {
		return (this.anInt2702 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)Z")
	public boolean method2576() {
		return (this.anInt2702 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)Z")
	public boolean method2577() {
		return (this.anInt2702 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)Z")
	public boolean method2578() {
		return (this.anInt2702 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)Z")
	public boolean method2579() {
		return (this.anInt2702 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)Z")
	public boolean method2582() {
		return (this.anInt2702 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)Z")
	public boolean method2583(@OriginalArg(1) int arg0) {
		return (this.anInt2702 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!hk", name = "g", descriptor = "(I)I")
	public int method2584() {
		return Static251.method2949(this.anInt2702);
	}
}
