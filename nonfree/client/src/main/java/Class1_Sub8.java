import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public final class Class1_Sub8 extends Class1 {

	@OriginalMember(owner = "client!e", name = "H", descriptor = "I")
	public int anInt1450;

	@OriginalMember(owner = "client!e", name = "t", descriptor = "I")
	public int anInt1440;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(II)V")
	public Class1_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1450 = arg0;
		this.anInt1440 = arg1;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)Z")
	public boolean method1094() {
		return (this.anInt1450 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(B)Z")
	public boolean method1096() {
		return (this.anInt1450 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)Z")
	public boolean method1097() {
		return (this.anInt1450 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)Z")
	public boolean method1098() {
		return (this.anInt1450 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(B)I")
	public int method1099() {
		return this.anInt1450 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)Z")
	public boolean method1100() {
		return (this.anInt1450 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(I)Z")
	public boolean method1102() {
		return (this.anInt1450 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(B)Z")
	public boolean method1103() {
		return (this.anInt1450 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)Z")
	public boolean method1105(@OriginalArg(1) int arg0) {
		return (this.anInt1450 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!e", name = "g", descriptor = "(B)I")
	public int method1106() {
		return Static275.method4588(this.anInt1450);
	}
}
