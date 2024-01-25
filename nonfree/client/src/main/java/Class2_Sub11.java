import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public final class Class2_Sub11 extends Class2 {

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "I")
	public final int anInt1160;

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "I")
	public final int anInt1168;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(II)V")
	public Class2_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1160 = arg1;
		this.anInt1168 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZ)Z")
	public boolean method1135(@OriginalArg(0) int arg0) {
		return (this.anInt1168 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)I")
	public int method1136() {
		return this.anInt1168 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(I)Z")
	public boolean method1138() {
		return (this.anInt1168 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "(I)Z")
	public boolean method1139() {
		return (this.anInt1168 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(Z)Z")
	public boolean method1141() {
		return (this.anInt1168 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)I")
	public int method1142() {
		return Static355.method6356(this.anInt1168);
	}
}
