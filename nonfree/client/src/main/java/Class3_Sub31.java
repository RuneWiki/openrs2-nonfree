import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public final class Class3_Sub31 extends Class3 {

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
	public int anInt5833;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
	public int anInt5831;

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(II)V")
	public Class3_Sub31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5833 = arg1;
		this.anInt5831 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)Z")
	public boolean method4785() {
		return (this.anInt5831 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)Z")
	public boolean method4786() {
		return (this.anInt5831 >> 29 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)Z")
	public boolean method4787() {
		return (this.anInt5831 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "(I)I")
	public int method4788() {
		return Static44.method662(this.anInt5831);
	}

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "(I)I")
	public int method4789() {
		return this.anInt5831 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
	public boolean method4790() {
		return (this.anInt5831 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Z")
	public boolean method4793() {
		return (this.anInt5831 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZI)Z")
	public boolean method4794(@OriginalArg(1) int arg0) {
		return (this.anInt5831 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)Z")
	public boolean method4795() {
		return (this.anInt5831 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Z")
	public boolean method4796() {
		return (this.anInt5831 >> 30 & 0x1) != 0;
	}
}
