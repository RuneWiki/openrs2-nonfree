import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public final class Class6_Sub32 extends Class6 {

	@OriginalMember(owner = "client!le", name = "k", descriptor = "I")
	public final int anInt5776;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	public final int anInt5779;

	@OriginalMember(owner = "client!le", name = "<init>", descriptor = "(II)V")
	public Class6_Sub32(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5776 = arg0;
		this.anInt5779 = arg1;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)Z")
	public boolean method5210(@OriginalArg(0) int arg0) {
		return (this.anInt5776 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)Z")
	public boolean method5211() {
		return (this.anInt5776 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Z")
	public boolean method5213() {
		return (this.anInt5776 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)I")
	public int method5214() {
		return this.anInt5776 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(B)Z")
	public boolean method5216() {
		return (this.anInt5776 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)I")
	public int method5217() {
		return Static424.method6488(this.anInt5776);
	}
}
