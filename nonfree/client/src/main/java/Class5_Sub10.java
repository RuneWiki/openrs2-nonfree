import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public final class Class5_Sub10 extends Class5 {

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public final int anInt1278;

	@OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
	public final int anInt1281;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(II)V")
	public Class5_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1278 = arg1;
		this.anInt1281 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)I")
	public int method1133() {
		return this.anInt1281 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "(B)Z")
	public boolean method1135() {
		return (this.anInt1281 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)Z")
	public boolean method1137() {
		return (this.anInt1281 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)Z")
	public boolean method1138() {
		return (this.anInt1281 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)I")
	public int method1140() {
		return Static195.method3506(this.anInt1281);
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)Z")
	public boolean method1142() {
		return (this.anInt1281 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(Z)Z")
	public boolean method1143() {
		return (this.anInt1281 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Z")
	public boolean method1144(@OriginalArg(1) int arg0) {
		return (this.anInt1281 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!dc", name = "f", descriptor = "(B)Z")
	public boolean method1146() {
		return (this.anInt1281 >> 21 & 0x1) != 0;
	}
}
