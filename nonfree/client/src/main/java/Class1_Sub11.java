import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class1_Sub11 extends Class1 {

	@OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
	public int anInt1322;

	@OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
	public int anInt1324;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(II)V")
	public Class1_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt1322 = arg0;
		this.anInt1324 = arg1;
	}

	@OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)Z")
	public boolean method1118() {
		return (this.anInt1322 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)Z")
	public boolean method1120() {
		return (this.anInt1322 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)Z")
	public boolean method1121() {
		return (this.anInt1322 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Z")
	public boolean method1122() {
		return (this.anInt1322 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)Z")
	public boolean method1123() {
		return (this.anInt1322 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)Z")
	public boolean method1124() {
		return (this.anInt1322 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "(I)I")
	public int method1126() {
		return Static28.method515(this.anInt1322);
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZ)Z")
	public boolean method1127(@OriginalArg(0) int arg0) {
		return (this.anInt1322 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "(I)I")
	public int method1130() {
		return this.anInt1322 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ei", name = "j", descriptor = "(I)Z")
	public boolean method1131() {
		return (this.anInt1322 & 0x1) != 0;
	}
}
