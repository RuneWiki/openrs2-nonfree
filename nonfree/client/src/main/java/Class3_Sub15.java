import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public final class Class3_Sub15 extends Class3 {

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public final int anInt1455;

	@OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
	public final int anInt1465;

	@OriginalMember(owner = "client!ee", name = "<init>", descriptor = "(II)V")
	public Class3_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1455 = arg0;
		this.anInt1465 = arg1;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(I)Z")
	public boolean method1139() {
		return (this.anInt1455 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z")
	public boolean method1140() {
		return (this.anInt1455 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(B)I")
	public int method1141() {
		return this.anInt1455 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)Z")
	public boolean method1143() {
		return (this.anInt1455 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)I")
	public int method1144() {
		return Static87.method1387(this.anInt1455);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BI)Z")
	public boolean method1145(@OriginalArg(1) int arg0) {
		return (this.anInt1455 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "(I)Z")
	public boolean method1148() {
		return (this.anInt1455 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "(I)Z")
	public boolean method1149() {
		return (this.anInt1455 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "(I)Z")
	public boolean method1150() {
		return (this.anInt1455 >> 22 & 0x1) != 0;
	}
}
