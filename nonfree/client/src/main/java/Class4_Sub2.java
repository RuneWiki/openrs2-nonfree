import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!aba", name = "u", descriptor = "I")
	public final int anInt156;

	@OriginalMember(owner = "client!aba", name = "o", descriptor = "I")
	public final int anInt151;

	@OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(II)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt156 = arg0;
		this.anInt151 = arg1;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Z")
	public boolean method124() {
		return (this.anInt156 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aba", name = "b", descriptor = "(I)Z")
	public boolean method125() {
		return (this.anInt156 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(B)I")
	public int method126() {
		return this.anInt156 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!aba", name = "a", descriptor = "(ZI)Z")
	public boolean method128(@OriginalArg(1) int arg0) {
		return (this.anInt156 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)Z")
	public boolean method129() {
		return (this.anInt156 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)I")
	public int method131() {
		return Static18.method217(this.anInt156);
	}
}
