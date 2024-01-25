import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public final class Class3_Sub29 extends Class3 {

	@OriginalMember(owner = "client!jga", name = "r", descriptor = "I")
	public final int anInt5441;

	@OriginalMember(owner = "client!jga", name = "t", descriptor = "I")
	public final int anInt5450;

	@OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(II)V")
	public Class3_Sub29(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt5441 = arg1;
		this.anInt5450 = arg0;
	}

	@OriginalMember(owner = "client!jga", name = "b", descriptor = "(I)Z")
	public boolean method4613() {
		return (this.anInt5450 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(B)Z")
	public boolean method4614() {
		return (this.anInt5450 >> 22 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)I")
	public int method4616() {
		return this.anInt5450 >> 18 & 0x7;
	}

	@OriginalMember(owner = "client!jga", name = "e", descriptor = "(I)I")
	public int method4617() {
		return Static209.method3110(this.anInt5450);
	}

	@OriginalMember(owner = "client!jga", name = "h", descriptor = "(I)Z")
	public boolean method4619() {
		return (this.anInt5450 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!jga", name = "a", descriptor = "(IB)Z")
	public boolean method4620(@OriginalArg(0) int arg0) {
		return (this.anInt5450 >> arg0 + 1 & 0x1) != 0;
	}
}
