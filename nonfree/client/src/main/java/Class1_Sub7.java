import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public final class Class1_Sub7 extends Class1 {

	@OriginalMember(owner = "client!d", name = "n", descriptor = "I")
	public final int anInt1143;

	@OriginalMember(owner = "client!d", name = "v", descriptor = "I")
	public final int anInt1150;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II)V")
	public Class1_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1143 = arg0;
		this.anInt1150 = arg1;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(B)I")
	public int method958() {
		return Static229.method3300(this.anInt1143);
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)Z")
	public boolean method959() {
		return (this.anInt1143 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(B)Z")
	public boolean method960() {
		return (this.anInt1143 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Z")
	public boolean method961(@OriginalArg(0) int arg0) {
		return (this.anInt1143 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "d", descriptor = "(B)Z")
	public boolean method963() {
		return (this.anInt1143 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!d", name = "f", descriptor = "(B)I")
	public int method965() {
		return this.anInt1143 >> 18 & 0x7;
	}
}
