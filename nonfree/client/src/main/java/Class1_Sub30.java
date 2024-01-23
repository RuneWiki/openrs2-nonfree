import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public final class Class1_Sub30 extends Class1 {

	@OriginalMember(owner = "client!vj", name = "x", descriptor = "I")
	public int anInt5933;

	@OriginalMember(owner = "client!vj", name = "s", descriptor = "I")
	public int anInt5928;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5933 = arg0;
		this.anInt5928 = arg1;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)Z")
	public boolean method4551() {
		return (this.anInt5933 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z")
	public boolean method4553() {
		return (this.anInt5933 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(BI)Z")
	public boolean method4554(@OriginalArg(1) int arg0) {
		return (this.anInt5933 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "(B)Z")
	public boolean method4555() {
		return (this.anInt5933 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Z)I")
	public int method4556() {
		return Static204.method3255(this.anInt5933);
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(B)Z")
	public boolean method4557() {
		return (this.anInt5933 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(Z)Z")
	public boolean method4559() {
		return (this.anInt5933 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "e", descriptor = "(I)Z")
	public boolean method4560() {
		return (this.anInt5933 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "(I)I")
	public int method4561() {
		return this.anInt5933 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "(I)Z")
	public boolean method4562() {
		return (this.anInt5933 >> 28 & 0x1) != 0;
	}
}
