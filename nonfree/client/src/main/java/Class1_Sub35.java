import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public final class Class1_Sub35 extends Class1 {

	@OriginalMember(owner = "client!sj", name = "q", descriptor = "I")
	public final int anInt5507;

	@OriginalMember(owner = "client!sj", name = "t", descriptor = "I")
	public final int anInt5510;

	@OriginalMember(owner = "client!sj", name = "<init>", descriptor = "(II)V")
	public Class1_Sub35(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5507 = arg0;
		this.anInt5510 = arg1;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(I)I")
	public int method4891() {
		return this.anInt5507 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!sj", name = "c", descriptor = "(B)Z")
	public boolean method4892() {
		return (this.anInt5507 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(B)Z")
	public boolean method4893() {
		return (this.anInt5507 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(B)Z")
	public boolean method4894() {
		return (this.anInt5507 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "d", descriptor = "(I)Z")
	public boolean method4895() {
		return (this.anInt5507 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)Z")
	public boolean method4897() {
		return (this.anInt5507 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(B)I")
	public int method4898() {
		return Static298.method5221(this.anInt5507);
	}

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)Z")
	public boolean method4899(@OriginalArg(0) int arg0) {
		return (this.anInt5507 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)Z")
	public boolean method4900() {
		return (this.anInt5507 & 0x1) != 0;
	}
}
