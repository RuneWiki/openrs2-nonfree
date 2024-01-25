import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class4_Sub12 extends Class4 {

	@OriginalMember(owner = "client!d", name = "s", descriptor = "I")
	public final int anInt1386;

	@OriginalMember(owner = "client!d", name = "q", descriptor = "I")
	public final int anInt1384;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
	public Class4_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1386 = arg0;
		this.anInt1384 = arg1;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(I)Z")
	public boolean method1025() {
		return (this.anInt1386 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)Z")
	public boolean method1026() {
		return (this.anInt1386 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "e", descriptor = "(B)Z")
	public boolean method1027() {
		return (this.anInt1386 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public boolean method1028(@OriginalArg(1) int arg0) {
		return (this.anInt1386 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(B)I")
	public int method1030() {
		return this.anInt1386 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)I")
	public int method1031() {
		return Static157.method3059(this.anInt1386);
	}
}
