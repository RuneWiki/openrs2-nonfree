import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class6_Sub34 extends Class6 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public final int anInt5011;

	@OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
	public final int anInt5016;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(II)V")
	public Class6_Sub34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5011 = arg0;
		this.anInt5016 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)I")
	public int method4568() {
		return this.anInt5011 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(B)Z")
	public boolean method4569() {
		return (this.anInt5011 >> 31 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)Z")
	public boolean method4570() {
		return (this.anInt5011 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)Z")
	public boolean method4571() {
		return (this.anInt5011 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)I")
	public int method4572() {
		return Static47.method785(this.anInt5011);
	}

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)Z")
	public boolean method4576() {
		return (this.anInt5011 >> 30 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)Z")
	public boolean method4578() {
		return (this.anInt5011 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Z")
	public boolean method4580(@OriginalArg(0) int arg0) {
		return (this.anInt5011 >> arg0 + 1 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!rd", name = "g", descriptor = "(B)Z")
	public boolean method4582() {
		return (this.anInt5011 & 0x1) != 0;
	}
}
