import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!t", name = "A", descriptor = "I")
	public int anInt4834;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "I")
	public int anInt4836;

	@OriginalMember(owner = "client!t", name = "<init>", descriptor = "(II)V")
	public Class1_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4834 = arg1;
		this.anInt4836 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(B)Z")
	public boolean method3650() {
		return (this.anInt4836 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)I")
	public int method3651() {
		return this.anInt4836 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(B)Z")
	public boolean method3652() {
		return (this.anInt4836 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "g", descriptor = "(I)Z")
	public boolean method3654() {
		return (this.anInt4836 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)Z")
	public boolean method3655(@OriginalArg(0) int arg0) {
		return (this.anInt4836 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(B)Z")
	public boolean method3656() {
		return (this.anInt4836 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(B)I")
	public int method3657() {
		return Static264.method4211(this.anInt4836);
	}

	@OriginalMember(owner = "client!t", name = "h", descriptor = "(I)Z")
	public boolean method3659() {
		return (this.anInt4836 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "i", descriptor = "(I)Z")
	public boolean method3660() {
		return (this.anInt4836 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!t", name = "j", descriptor = "(I)Z")
	public boolean method3661() {
		return (this.anInt4836 >> 21 & 0x1) != 0;
	}
}
