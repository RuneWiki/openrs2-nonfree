import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public final class Class7_Sub16 extends Class7 {

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "I")
	public final int anInt2247;

	@OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
	public final int anInt2235;

	@OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(II)V")
	public Class7_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt2247 = arg1;
		this.anInt2235 = arg0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)I")
	public int method1900() {
		return this.anInt2235 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z")
	public boolean method1902() {
		return (this.anInt2235 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)I")
	public int method1903() {
		return Static446.method5664(this.anInt2235);
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z")
	public boolean method1904() {
		return (this.anInt2235 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BI)Z")
	public boolean method1908(@OriginalArg(1) int arg0) {
		return (this.anInt2235 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z)Z")
	public boolean method1909() {
		return (this.anInt2235 & 0x1) != 0;
	}
}
